// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

// Referenced classes of package com.google.android.gms.internal.ads:
//			adi, acw, adh, acl

public abstract class acm extends TextureView
	implements adi
{

	public acm(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void TextureView(Context)>
	//    3    5:aload_0         
	//    4    6:new             #20  <Class acw>
	//    5    9:dup             
	//    6   10:invokespecial   #23  <Method void acw()>
	//    7   13:putfield        #25  <Field acw a>
		b = new adh(context, ((adi) (this)));
	//    8   16:aload_0         
	//    9   17:new             #27  <Class adh>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokespecial   #30  <Method void adh(Context, adi)>
	//   14   26:putfield        #32  <Field adh b>
	//   15   29:return          
	}

	public abstract String a();

	public abstract void a(float f1, float f2);

	public abstract void a(int i);

	public abstract void a(acl acl);

	public abstract void b();

	public abstract void c();

	public void c(int i)
	{
	//    0    0:return          
	}

	public abstract void d();

	public void d(int i)
	{
	//    0    0:return          
	}

	public abstract void e();

	public void e(int i)
	{
	//    0    0:return          
	}

	public void f(int i)
	{
	//    0    0:return          
	}

	public abstract int getCurrentPosition();

	public abstract int getDuration();

	public abstract int getVideoHeight();

	public abstract int getVideoWidth();

	public abstract void setVideoPath(String s);

	protected final acw a = new acw();
	protected final adh b;
}
