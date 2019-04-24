// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import org.androidannotations.api.a.a;
import org.androidannotations.api.a.e;

// Referenced classes of package com.irobot.home:
//			MapCustomizationIntroductionActivity_

public static class MapCustomizationIntroductionActivity_$a extends a
{

	public MapCustomizationIntroductionActivity_$a a(String s)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("assetId", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "assetId">
	//    2    3:aload_1         
	//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d a.a(String, String)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public MapCustomizationIntroductionActivity_$a a(ArrayList arraylist)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("infoText", ((java.io.Serializable) (arraylist)));
	//    0    0:aload_0         
	//    1    1:ldc1            #27  <String "infoText">
	//    2    3:aload_1         
	//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d a.a(String, java.io.Serializable)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public MapCustomizationIntroductionActivity_$a a(boolean flag)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("isImageRes", flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "isImageRes">
	//    2    3:iload_1         
	//    3    4:invokespecial   #38  <Method org.androidannotations.api.a.d a.a(String, boolean)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public e a(int i)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Fragment e>
	//*   2    4:ifnull          22
			e.startActivityForResult(c, i);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Fragment e>
	//    5   11:aload_0         
	//    6   12:getfield        #45  <Field android.content.Intent c>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #51  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
		else
	//*   9   19:goto            95
		if(d != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #53  <Field android.app.Fragment d>
	//*  12   26:ifnull          48
			d.startActivityForResult(c, i, a);
	//   13   29:aload_0         
	//   14   30:getfield        #53  <Field android.app.Fragment d>
	//   15   33:aload_0         
	//   16   34:getfield        #45  <Field android.content.Intent c>
	//   17   37:iload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #56  <Field android.os.Bundle a>
	//   20   42:invokevirtual   #61  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, android.os.Bundle)>
		else
	//*  21   45:goto            95
		if(b instanceof Activity)
	//*  22   48:aload_0         
	//*  23   49:getfield        #65  <Field Context b>
	//*  24   52:instanceof      #67  <Class Activity>
	//*  25   55:ifeq            80
			ActivityCompat.startActivityForResult((Activity)b, c, i, a);
	//   26   58:aload_0         
	//   27   59:getfield        #65  <Field Context b>
	//   28   62:checkcast       #67  <Class Activity>
	//   29   65:aload_0         
	//   30   66:getfield        #45  <Field android.content.Intent c>
	//   31   69:iload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #56  <Field android.os.Bundle a>
	//   34   74:invokestatic    #72  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, android.os.Bundle)>
		else
	//*  35   77:goto            95
			b.startActivity(c, a);
	//   36   80:aload_0         
	//   37   81:getfield        #65  <Field Context b>
	//   38   84:aload_0         
	//   39   85:getfield        #45  <Field android.content.Intent c>
	//   40   88:aload_0         
	//   41   89:getfield        #56  <Field android.os.Bundle a>
	//   42   92:invokevirtual   #78  <Method void Context.startActivity(android.content.Intent, android.os.Bundle)>
		return new e(b);
	//   43   95:new             #80  <Class e>
	//   44   98:dup             
	//   45   99:aload_0         
	//   46  100:getfield        #65  <Field Context b>
	//   47  103:invokespecial   #82  <Method void e(Context)>
	//   48  106:areturn         
	}

	public MapCustomizationIntroductionActivity_$a b(int i)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("titleId", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #85  <String "titleId">
	//    2    3:iload_1         
	//    3    4:invokespecial   #88  <Method org.androidannotations.api.a.d a.a(String, int)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public MapCustomizationIntroductionActivity_$a b(boolean flag)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("loopBack", flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #90  <String "loopBack">
	//    2    3:iload_1         
	//    3    4:invokespecial   #38  <Method org.androidannotations.api.a.d a.a(String, boolean)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public MapCustomizationIntroductionActivity_$a c(int i)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("resId", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #92  <String "resId">
	//    2    3:iload_1         
	//    3    4:invokespecial   #88  <Method org.androidannotations.api.a.d a.a(String, int)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public MapCustomizationIntroductionActivity_$a c(boolean flag)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("showActionButton", flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #94  <String "showActionButton">
	//    2    3:iload_1         
	//    3    4:invokespecial   #38  <Method org.androidannotations.api.a.d a.a(String, boolean)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public MapCustomizationIntroductionActivity_$a d(int i)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("buttonTextResource", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #96  <String "buttonTextResource">
	//    2    3:iload_1         
	//    3    4:invokespecial   #88  <Method org.androidannotations.api.a.d a.a(String, int)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public MapCustomizationIntroductionActivity_$a d(boolean flag)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("isLaunchedFromPush", flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "isLaunchedFromPush">
	//    2    3:iload_1         
	//    3    4:invokespecial   #38  <Method org.androidannotations.api.a.d a.a(String, boolean)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public MapCustomizationIntroductionActivity_$a e(int i)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("mapNumber", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #100 <String "mapNumber">
	//    2    3:iload_1         
	//    3    4:invokespecial   #88  <Method org.androidannotations.api.a.d a.a(String, int)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	public MapCustomizationIntroductionActivity_$a f(int i)
	{
		return (MapCustomizationIntroductionActivity_$a)super.a("learningPercent", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #103 <String "learningPercent">
	//    2    3:iload_1         
	//    3    4:invokespecial   #88  <Method org.androidannotations.api.a.d a.a(String, int)>
	//    4    7:checkcast       #2   <Class MapCustomizationIntroductionActivity_$a>
	//    5   10:areturn         
	}

	private android.app.Fragment d;
	private Fragment e;

	public MapCustomizationIntroductionActivity_$a(Context context)
	{
		super(context, com/irobot/home/MapCustomizationIntroductionActivity_);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Class MapCustomizationIntroductionActivity_>
	//    3    4:invokespecial   #17  <Method void a(Context, Class)>
	//    4    7:return          
	}
}
