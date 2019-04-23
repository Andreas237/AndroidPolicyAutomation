// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			oe, zzasm, afn, agv, 
//			wx, we, ol

public class om extends oe
{

	om(Context context, we we, afn afn1, ol ol)
	{
		super(context, we, afn1, ol);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #9   <Method void oe(Context, we, afn, ol)>
	//    6    9:return          
	}

	protected final void a()
	{
		if(c.d != -2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field zzasm c>
	//*   2    4:getfield        #22  <Field int zzasm.d>
	//*   3    7:bipush          -2
	//*   4    9:icmpeq          13
		{
			return;
	//    5   12:return          
		} else
		{
			b.w().a(((agw) (this)));
	//    6   13:aload_0         
	//    7   14:getfield        #26  <Field afn b>
	//    8   17:invokeinterface #32  <Method agv afn.w()>
	//    9   22:aload_0         
	//   10   23:invokeinterface #37  <Method void agv.a(agw)>
			d();
	//   11   28:aload_0         
	//   12   29:invokevirtual   #39  <Method void d()>
			wx.b("Loading HTML in WebView.");
	//   13   32:ldc1            #41  <String "Loading HTML in WebView.">
	//   14   34:invokestatic    #46  <Method void wx.b(String)>
			b.a(c.a, c.b, ((String) (null)));
	//   15   37:aload_0         
	//   16   38:getfield        #26  <Field afn b>
	//   17   41:aload_0         
	//   18   42:getfield        #16  <Field zzasm c>
	//   19   45:getfield        #49  <Field String zzasm.a>
	//   20   48:aload_0         
	//   21   49:getfield        #16  <Field zzasm c>
	//   22   52:getfield        #51  <Field String zzasm.b>
	//   23   55:aconst_null     
	//   24   56:invokeinterface #54  <Method void afn.a(String, String, String)>
			return;
	//   25   61:return          
		}
	}

	protected void d()
	{
	//    0    0:return          
	}
}
