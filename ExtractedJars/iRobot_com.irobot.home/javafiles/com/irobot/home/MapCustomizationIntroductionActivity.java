// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.Assembler;
import com.irobot.core.PersistenceHandler;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			VideoHelpActivity, MapCustomizationActivity_

public class MapCustomizationIntroductionActivity extends VideoHelpActivity
{

	public MapCustomizationIntroductionActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void VideoHelpActivity()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean d>
	//    5    9:return          
	}

	protected void e()
	{
		Assembler.getInstance().getPersistenceHandler().writeBool("mapCustomizationStartHintsSeen", true);
	//    0    0:invokestatic    #25  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #29  <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//    2    6:ldc1            #31  <String "mapCustomizationStartHintsSeen">
	//    3    8:iconst_1        
	//    4    9:invokevirtual   #37  <Method void PersistenceHandler.writeBool(String, boolean)>
		((MapCustomizationActivity_.a)MapCustomizationActivity_.a(((android.content.Context) (this))).a(a).b(b).c(c).a(d).g(0x10000)).a();
	//    5   12:aload_0         
	//    6   13:invokestatic    #42  <Method MapCustomizationActivity_$a MapCustomizationActivity_.a(android.content.Context)>
	//    7   16:aload_0         
	//    8   17:getfield        #44  <Field String a>
	//    9   20:invokevirtual   #49  <Method MapCustomizationActivity_$a MapCustomizationActivity_$a.a(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #51  <Field int b>
	//   12   27:invokevirtual   #54  <Method MapCustomizationActivity_$a MapCustomizationActivity_$a.b(int)>
	//   13   30:aload_0         
	//   14   31:getfield        #56  <Field int c>
	//   15   34:invokevirtual   #58  <Method MapCustomizationActivity_$a MapCustomizationActivity_$a.c(int)>
	//   16   37:aload_0         
	//   17   38:getfield        #17  <Field boolean d>
	//   18   41:invokevirtual   #61  <Method MapCustomizationActivity_$a MapCustomizationActivity_$a.a(boolean)>
	//   19   44:ldc1            #62  <Int 0x10000>
	//   20   46:invokevirtual   #66  <Method org.androidannotations.api.a.d MapCustomizationActivity_$a.g(int)>
	//   21   49:checkcast       #46  <Class MapCustomizationActivity_$a>
	//   22   52:invokevirtual   #69  <Method org.androidannotations.api.a.e MapCustomizationActivity_$a.a()>
	//   23   55:pop             
		finish();
	//   24   56:aload_0         
	//   25   57:invokevirtual   #72  <Method void finish()>
	//   26   60:return          
	}

	public void onBackPressed()
	{
		if(v() || d)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #77  <Method boolean v()>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field boolean d>
	//*   5   11:ifeq            18
			j.a(((android.app.Activity) (this)));
	//    6   14:aload_0         
	//    7   15:invokestatic    #82  <Method void j.a(android.app.Activity)>
	//    8   18:return          
	}

	String a;
	int b;
	int c;
	boolean d;
}
