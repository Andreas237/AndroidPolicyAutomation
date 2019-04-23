// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal.ads:
//			avl, apz

public final class bbd
{

	public static long a(double d, DisplayMetrics displaymetrics)
	{
		double d1 = displaymetrics.density;
	//    0    0:aload_2         
	//    1    1:getfield        #26  <Field float DisplayMetrics.density>
	//    2    4:f2d             
	//    3    5:dstore_3        
		Double.isNaN(d1);
	//    4    6:dload_3         
	//    5    7:invokestatic    #32  <Method boolean Double.isNaN(double)>
	//    6   10:pop             
		return Math.round(d / d1);
	//    7   11:dload_0         
	//    8   12:dload_3         
	//    9   13:ddiv            
	//   10   14:invokestatic    #38  <Method long Math.round(double)>
	//   11   17:lreturn         
	}

	public static Activity a(View view)
	{
		View view1 = view.getRootView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method View View.getRootView()>
	//    2    4:astore_2        
		if(view1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          11
			view = view1;
	//    5    9:aload_2         
	//    6   10:astore_0        
		view = ((View) (view.getContext()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #49  <Method android.content.Context View.getContext()>
	//    9   15:astore_0        
		for(int i = 0; (view instanceof ContextWrapper) && i < 10; i++)
	//*  10   16:iconst_0        
	//*  11   17:istore_1        
	//*  12   18:aload_0         
	//*  13   19:instanceof      #51  <Class ContextWrapper>
	//*  14   22:ifeq            58
	//*  15   25:iload_1         
	//*  16   26:bipush          10
	//*  17   28:icmpge          58
		{
			if(view instanceof Activity)
	//*  18   31:aload_0         
	//*  19   32:instanceof      #53  <Class Activity>
	//*  20   35:ifeq            43
				return (Activity)view;
	//   21   38:aload_0         
	//   22   39:checkcast       #53  <Class Activity>
	//   23   42:areturn         
			view = ((View) (((ContextWrapper)view).getBaseContext()));
	//   24   43:aload_0         
	//   25   44:checkcast       #51  <Class ContextWrapper>
	//   26   47:invokevirtual   #56  <Method android.content.Context ContextWrapper.getBaseContext()>
	//   27   50:astore_0        
		}

	//   28   51:iload_1         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_1        
	//*  32   55:goto            18
		return null;
	//   33   58:aconst_null     
	//   34   59:areturn         
	}

	public static String a(String s)
	{
		Object obj = ((Object) (s));
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          56
		{
			obj = ((Object) (s));
	//    4    6:aload_0         
	//    5    7:astore_1        
			if(s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"))
	//*   6    8:aload_0         
	//*   7    9:ldc1            #59  <String "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$">
	//*   8   11:invokevirtual   #63  <Method boolean String.matches(String)>
	//*   9   14:ifeq            56
			{
				s = ((String) (UUID.fromString(s)));
	//   10   17:aload_0         
	//   11   18:invokestatic    #69  <Method UUID UUID.fromString(String)>
	//   12   21:astore_0        
				obj = ((Object) (new byte[16]));
	//   13   22:bipush          16
	//   14   24:newarray        byte[]
	//   15   26:astore_1        
				ByteBuffer bytebuffer = ByteBuffer.wrap(((byte []) (obj)));
	//   16   27:aload_1         
	//   17   28:invokestatic    #75  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   18   31:astore_2        
				bytebuffer.putLong(((UUID) (s)).getMostSignificantBits());
	//   19   32:aload_2         
	//   20   33:aload_0         
	//   21   34:invokevirtual   #79  <Method long UUID.getMostSignificantBits()>
	//   22   37:invokevirtual   #83  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   23   40:pop             
				bytebuffer.putLong(((UUID) (s)).getLeastSignificantBits());
	//   24   41:aload_2         
	//   25   42:aload_0         
	//   26   43:invokevirtual   #86  <Method long UUID.getLeastSignificantBits()>
	//   27   46:invokevirtual   #83  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   28   49:pop             
				obj = ((Object) (avl.a(((byte []) (obj)), true)));
	//   29   50:aload_1         
	//   30   51:iconst_1        
	//   31   52:invokestatic    #91  <Method String avl.a(byte[], boolean)>
	//   32   55:astore_1        
			}
		}
		return ((String) (obj));
	//   33   56:aload_1         
	//   34   57:areturn         
	}

	public static String a(Throwable throwable)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #94  <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void StringWriter()>
	//    3    7:astore_1        
		apz.a(throwable, new PrintWriter(((java.io.Writer) (stringwriter))));
	//    4    8:aload_0         
	//    5    9:new             #99  <Class PrintWriter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #102 <Method void PrintWriter(java.io.Writer)>
	//    9   17:invokestatic    #107 <Method void apz.a(Throwable, PrintWriter)>
		return stringwriter.toString();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #111 <Method String StringWriter.toString()>
	//   12   24:areturn         
	}

	public static boolean a()
	{
		return Looper.myLooper() == Looper.getMainLooper();
	//    0    0:invokestatic    #118 <Method Looper Looper.myLooper()>
	//    1    3:invokestatic    #121 <Method Looper Looper.getMainLooper()>
	//    2    6:if_acmpne       11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	public static boolean a(DisplayMetrics displaymetrics)
	{
		return displaymetrics != null && displaymetrics.density != 0.0F;
	//    0    0:aload_0         
	//    1    1:ifnull          15
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field float DisplayMetrics.density>
	//    4    8:fconst_0        
	//    5    9:fcmpl           
	//    6   10:ifeq            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	public static boolean b(String s)
	{
		return s == null || s.isEmpty();
	//    0    0:aload_0         
	//    1    1:ifnull          16
	//    2    4:aload_0         
	//    3    5:invokevirtual   #126 <Method boolean String.isEmpty()>
	//    4    8:ifeq            14
	//    5   11:goto            16
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	private static final char a[] = "0123456789abcdef".toCharArray();

	static 
	{
	//    0    0:ldc1            #10  <String "0123456789abcdef">
	//    1    2:invokevirtual   #16  <Method char[] String.toCharArray()>
	//    2    5:putstatic       #18  <Field char[] a>
	//*   3    8:return          
	}
}
