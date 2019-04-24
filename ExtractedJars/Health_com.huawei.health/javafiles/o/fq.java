// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;

// Referenced classes of package o:
//			fp, fs

final class fq
	implements android.content.DialogInterface.OnClickListener
{

	fq(fp fp1)
	{
		d = fp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field fp d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		fs.a(d.b, true);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field fp d>
	//    2    4:getfield        #24  <Field fs fp.b>
	//    3    7:iconst_1        
	//    4    8:invokestatic    #30  <Method boolean fs.a(fs, boolean)>
	//    5   11:pop             
		d.d.proceed();
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field fp d>
	//    8   16:getfield        #33  <Field SslErrorHandler fp.d>
	//    9   19:invokevirtual   #38  <Method void SslErrorHandler.proceed()>
		dialoginterface.dismiss();
	//   10   22:aload_1         
	//   11   23:invokeinterface #43  <Method void DialogInterface.dismiss()>
	//   12   28:return          
	}

	final fp d;
}
