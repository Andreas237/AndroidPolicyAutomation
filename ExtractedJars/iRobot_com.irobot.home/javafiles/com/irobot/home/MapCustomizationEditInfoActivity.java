// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.Assembler;
import com.irobot.core.PersistenceHandler;

// Referenced classes of package com.irobot.home:
//			VideoHelpActivity

public class MapCustomizationEditInfoActivity extends VideoHelpActivity
{

	public MapCustomizationEditInfoActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void VideoHelpActivity()>
	//    2    4:return          
	}

	protected void e()
	{
		Assembler.getInstance().getPersistenceHandler().writeBool("mapCustomizationEditHintsSeen", true);
	//    0    0:invokestatic    #18  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #22  <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//    2    6:ldc1            #24  <String "mapCustomizationEditHintsSeen">
	//    3    8:iconst_1        
	//    4    9:invokevirtual   #30  <Method void PersistenceHandler.writeBool(String, boolean)>
		setResult(-1);
	//    5   12:aload_0         
	//    6   13:iconst_m1       
	//    7   14:invokevirtual   #34  <Method void setResult(int)>
		finish();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #37  <Method void finish()>
	//   10   21:return          
	}

	String a;
}
