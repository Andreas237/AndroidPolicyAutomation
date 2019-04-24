// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.SslErrorHandler;

// Referenced classes of package o:
//			fp, fs, fx

final class fo
	implements android.content.DialogInterface.OnClickListener
{

	fo(fp fp1)
	{
		c = fp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field fp c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		c.d.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field fp c>
	//    2    4:getfield        #24  <Field SslErrorHandler fp.d>
	//    3    7:invokevirtual   #29  <Method void SslErrorHandler.cancel()>
		fs.a(c.b, false);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field fp c>
	//    6   14:getfield        #33  <Field fs fp.b>
	//    7   17:iconst_0        
	//    8   18:invokestatic    #39  <Method boolean fs.a(fs, boolean)>
	//    9   21:pop             
		fx.d = fx.e();
	//   10   22:invokestatic    #45  <Method String fx.e()>
	//   11   25:putstatic       #48  <Field String fx.d>
		fs.a(c.b).finish();
	//   12   28:aload_0         
	//   13   29:getfield        #12  <Field fp c>
	//   14   32:getfield        #33  <Field fs fp.b>
	//   15   35:invokestatic    #51  <Method Activity fs.a(fs)>
	//   16   38:invokevirtual   #56  <Method void Activity.finish()>
	//   17   41:return          
	}

	final fp c;
}
