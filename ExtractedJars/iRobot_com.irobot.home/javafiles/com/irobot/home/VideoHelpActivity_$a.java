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
//			VideoHelpActivity_

public static class VideoHelpActivity_$a extends a
{

	public VideoHelpActivity_$a a(ArrayList arraylist)
	{
		return (VideoHelpActivity_$a)super.a("infoText", ((java.io.Serializable) (arraylist)));
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "infoText">
	//    2    3:aload_1         
	//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d a.a(String, java.io.Serializable)>
	//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
	//    5   10:areturn         
	}

	public VideoHelpActivity_$a a(boolean flag)
	{
		return (VideoHelpActivity_$a)super.a("isImageRes", flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "isImageRes">
	//    2    3:iload_1         
	//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d a.a(String, boolean)>
	//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
	//    5   10:areturn         
	}

	public e a(int i)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Fragment e>
	//*   2    4:ifnull          22
			e.startActivityForResult(c, i);
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field Fragment e>
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field android.content.Intent c>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #45  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
		else
	//*   9   19:goto            95
		if(d != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #47  <Field android.app.Fragment d>
	//*  12   26:ifnull          48
			d.startActivityForResult(c, i, a);
	//   13   29:aload_0         
	//   14   30:getfield        #47  <Field android.app.Fragment d>
	//   15   33:aload_0         
	//   16   34:getfield        #39  <Field android.content.Intent c>
	//   17   37:iload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #50  <Field android.os.Bundle a>
	//   20   42:invokevirtual   #55  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, android.os.Bundle)>
		else
	//*  21   45:goto            95
		if(b instanceof Activity)
	//*  22   48:aload_0         
	//*  23   49:getfield        #59  <Field Context b>
	//*  24   52:instanceof      #61  <Class Activity>
	//*  25   55:ifeq            80
			ActivityCompat.startActivityForResult((Activity)b, c, i, a);
	//   26   58:aload_0         
	//   27   59:getfield        #59  <Field Context b>
	//   28   62:checkcast       #61  <Class Activity>
	//   29   65:aload_0         
	//   30   66:getfield        #39  <Field android.content.Intent c>
	//   31   69:iload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #50  <Field android.os.Bundle a>
	//   34   74:invokestatic    #66  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, android.os.Bundle)>
		else
	//*  35   77:goto            95
			b.startActivity(c, a);
	//   36   80:aload_0         
	//   37   81:getfield        #59  <Field Context b>
	//   38   84:aload_0         
	//   39   85:getfield        #39  <Field android.content.Intent c>
	//   40   88:aload_0         
	//   41   89:getfield        #50  <Field android.os.Bundle a>
	//   42   92:invokevirtual   #72  <Method void Context.startActivity(android.content.Intent, android.os.Bundle)>
		return new e(b);
	//   43   95:new             #74  <Class e>
	//   44   98:dup             
	//   45   99:aload_0         
	//   46  100:getfield        #59  <Field Context b>
	//   47  103:invokespecial   #76  <Method void e(Context)>
	//   48  106:areturn         
	}

	public VideoHelpActivity_$a b(int i)
	{
		return (VideoHelpActivity_$a)super.a("titleId", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #79  <String "titleId">
	//    2    3:iload_1         
	//    3    4:invokespecial   #82  <Method org.androidannotations.api.a.d a.a(String, int)>
	//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
	//    5   10:areturn         
	}

	public VideoHelpActivity_$a b(boolean flag)
	{
		return (VideoHelpActivity_$a)super.a("proceedToCleanScreen", flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <String "proceedToCleanScreen">
	//    2    3:iload_1         
	//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d a.a(String, boolean)>
	//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
	//    5   10:areturn         
	}

	public VideoHelpActivity_$a c(int i)
	{
		return (VideoHelpActivity_$a)super.a("resId", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #86  <String "resId">
	//    2    3:iload_1         
	//    3    4:invokespecial   #82  <Method org.androidannotations.api.a.d a.a(String, int)>
	//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
	//    5   10:areturn         
	}

	public VideoHelpActivity_$a c(boolean flag)
	{
		return (VideoHelpActivity_$a)super.a("showActionButton", flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #88  <String "showActionButton">
	//    2    3:iload_1         
	//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d a.a(String, boolean)>
	//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
	//    5   10:areturn         
	}

	public VideoHelpActivity_$a d(boolean flag)
	{
		return (VideoHelpActivity_$a)super.a("shouldBackActAsActionButton", flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #90  <String "shouldBackActAsActionButton">
	//    2    3:iload_1         
	//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d a.a(String, boolean)>
	//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
	//    5   10:areturn         
	}

	private android.app.Fragment d;
	private Fragment e;

	public VideoHelpActivity_$a(Context context)
	{
		super(context, com/irobot/home/VideoHelpActivity_);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Class VideoHelpActivity_>
	//    3    4:invokespecial   #17  <Method void a(Context, Class)>
	//    4    7:return          
	}
}
