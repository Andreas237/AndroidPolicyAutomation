// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package android.support.v7:
//			cn

class cn$6
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		view = ((View) (new Intent("android.intent.action.SENDTO")));
	//    0    0:new             #28  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "android.intent.action.SENDTO">
	//    3    6:invokespecial   #33  <Method void Intent(String)>
	//    4    9:astore_1        
		((Intent) (view)).setType("message/rfc822");
	//    5   10:aload_1         
	//    6   11:ldc1            #35  <String "message/rfc822">
	//    7   13:invokevirtual   #39  <Method Intent Intent.setType(String)>
	//    8   16:pop             
		((Intent) (view)).setData(Uri.parse((new StringBuilder()).append("mailto:").append("cholkerprasad@gmail.com").toString()));
	//    9   17:aload_1         
	//   10   18:new             #41  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #42  <Method void StringBuilder()>
	//   13   25:ldc1            #44  <String "mailto:">
	//   14   27:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:ldc1            #50  <String "cholkerprasad@gmail.com">
	//   16   32:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   18   38:invokestatic    #60  <Method Uri Uri.parse(String)>
	//   19   41:invokevirtual   #64  <Method Intent Intent.setData(Uri)>
	//   20   44:pop             
		a.startActivity(Intent.createChooser(((Intent) (view)), "Send mail..."));
	//   21   45:aload_0         
	//   22   46:getfield        #20  <Field Context a>
	//   23   49:aload_1         
	//   24   50:ldc1            #66  <String "Send mail...">
	//   25   52:invokestatic    #70  <Method Intent Intent.createChooser(Intent, CharSequence)>
	//   26   55:invokevirtual   #76  <Method void Context.startActivity(Intent)>
	//   27   58:return          
	}

	final Context a;
	final cn b;

	cn$6(cn cn1, Context context)
	{
		b = cn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field cn b>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Context a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
