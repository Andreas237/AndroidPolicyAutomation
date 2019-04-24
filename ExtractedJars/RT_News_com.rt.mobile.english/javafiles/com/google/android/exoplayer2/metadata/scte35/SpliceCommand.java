// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;


public abstract class SpliceCommand
	implements com.google.android.exoplayer2.metadata.Metadata.Entry
{

	public SpliceCommand()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #17  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("SCTE-35 splice command: type=");
	//    4    8:aload_1         
	//    5    9:ldc1            #20  <String "SCTE-35 splice command: type=">
	//    6   11:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getSimpleName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #28  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #33  <Method String Class.getSimpleName()>
	//   12   23:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		return stringbuilder.toString();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   16   31:areturn         
	}
}
