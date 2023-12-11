import pandas as pd
import sqlite3

conn = sqlite3.connect("db.sqlite3")

xls = pd.ExcelFile("nordwind.xlsx")

for sheet_name in xls.sheet_names:
    df = xls.parse(sheet_name)
    df.columns = [col.replace("_", "") for col in df.columns]
    df.to_sql(sheet_name.lower(), conn, if_exists="append", index=False)

conn.close()