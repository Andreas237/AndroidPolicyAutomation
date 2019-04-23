// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;


public class RoomMasterTable
{

	public RoomMasterTable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static String createInsertQuery(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"");
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"">
	//    6   11:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("\")");
	//   12   21:aload_1         
	//   13   22:ldc1            #46  <String "\")">
	//   14   24:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		return stringbuilder.toString();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   18   32:areturn         
	}

	private static final String COLUMN_ID = "id";
	private static final String COLUMN_IDENTITY_HASH = "identity_hash";
	public static final String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
	public static final String DEFAULT_ID = "42";
	public static final String NAME = "room_master_table";
	public static final String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";
	public static final String TABLE_NAME = "room_master_table";
}
