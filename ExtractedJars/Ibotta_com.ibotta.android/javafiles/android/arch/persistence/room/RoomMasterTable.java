// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;


public class RoomMasterTable
{

	public static String createInsertQuery(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #12  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"");
	//    4    8:aload_1         
	//    5    9:ldc1            #18  <String "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"">
	//    6   11:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("\")");
	//   12   21:aload_1         
	//   13   22:ldc1            #24  <String "\")">
	//   14   24:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		return stringbuilder.toString();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   18   32:areturn         
	}
}
