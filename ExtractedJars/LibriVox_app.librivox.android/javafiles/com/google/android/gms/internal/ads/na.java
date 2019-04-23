// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, xo, afn

public final class na
{

	public na(afn afn1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = afn1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field afn a>
		c = (String)map.get("forceOrientation");
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:ldc1            #20  <String "forceOrientation">
	//    8   13:invokeinterface #26  <Method Object Map.get(Object)>
	//    9   18:checkcast       #28  <Class String>
	//   10   21:putfield        #30  <Field String c>
		if(map.containsKey("allowOrientationChange"))
	//*  11   24:aload_2         
	//*  12   25:ldc1            #32  <String "allowOrientationChange">
	//*  13   27:invokeinterface #36  <Method boolean Map.containsKey(Object)>
	//*  14   32:ifeq            54
		{
			b = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
	//   15   35:aload_0         
	//   16   36:aload_2         
	//   17   37:ldc1            #32  <String "allowOrientationChange">
	//   18   39:invokeinterface #26  <Method Object Map.get(Object)>
	//   19   44:checkcast       #28  <Class String>
	//   20   47:invokestatic    #42  <Method boolean Boolean.parseBoolean(String)>
	//   21   50:putfield        #44  <Field boolean b>
			return;
	//   22   53:return          
		} else
		{
			b = true;
	//   23   54:aload_0         
	//   24   55:iconst_1        
	//   25   56:putfield        #44  <Field boolean b>
			return;
	//   26   59:return          
		}
	}

	public final void a()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field afn a>
	//*   2    4:ifnonnull       13
		{
			wx.e("AdWebView is null");
	//    3    7:ldc1            #47  <String "AdWebView is null">
	//    4    9:invokestatic    #53  <Method void wx.e(String)>
			return;
	//    5   12:return          
		}
		int i;
		if("portrait".equalsIgnoreCase(c))
	//*   6   13:ldc1            #55  <String "portrait">
	//*   7   15:aload_0         
	//*   8   16:getfield        #30  <Field String c>
	//*   9   19:invokevirtual   #58  <Method boolean String.equalsIgnoreCase(String)>
	//*  10   22:ifeq            35
			i = aw.g().b();
	//   11   25:invokestatic    #64  <Method xo aw.g()>
	//   12   28:invokevirtual   #69  <Method int xo.b()>
	//   13   31:istore_1        
		else
	//*  14   32:goto            76
		if("landscape".equalsIgnoreCase(c))
	//*  15   35:ldc1            #71  <String "landscape">
	//*  16   37:aload_0         
	//*  17   38:getfield        #30  <Field String c>
	//*  18   41:invokevirtual   #58  <Method boolean String.equalsIgnoreCase(String)>
	//*  19   44:ifeq            57
			i = aw.g().a();
	//   20   47:invokestatic    #64  <Method xo aw.g()>
	//   21   50:invokevirtual   #73  <Method int xo.a()>
	//   22   53:istore_1        
		else
	//*  23   54:goto            76
		if(b)
	//*  24   57:aload_0         
	//*  25   58:getfield        #44  <Field boolean b>
	//*  26   61:ifeq            69
			i = -1;
	//   27   64:iconst_m1       
	//   28   65:istore_1        
		else
	//*  29   66:goto            76
			i = aw.g().c();
	//   30   69:invokestatic    #64  <Method xo aw.g()>
	//   31   72:invokevirtual   #75  <Method int xo.c()>
	//   32   75:istore_1        
		a.setRequestedOrientation(i);
	//   33   76:aload_0         
	//   34   77:getfield        #18  <Field afn a>
	//   35   80:iload_1         
	//   36   81:invokeinterface #81  <Method void afn.setRequestedOrientation(int)>
	//   37   86:return          
	}

	private final afn a;
	private final boolean b;
	private final String c;
}
