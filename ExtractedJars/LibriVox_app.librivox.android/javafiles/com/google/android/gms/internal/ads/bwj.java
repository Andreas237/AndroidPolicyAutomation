// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Random;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwa, aag, bxo, bwk, 
//			zv, p, m, zzbbi, 
//			bxn

abstract class bwj
{

	bwj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	private static bxn c()
	{
		Object obj;
		obj = ((Class) (com/google/android/gms/internal/ads/bwa)).getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
	//    0    0:ldc1            #22  <Class bwa>
	//    1    2:invokevirtual   #28  <Method ClassLoader Class.getClassLoader()>
	//    2    5:ldc1            #30  <String "com.google.android.gms.ads.internal.ClientApi">
	//    3    7:invokevirtual   #36  <Method Class ClassLoader.loadClass(String)>
	//    4   10:invokevirtual   #40  <Method Object Class.newInstance()>
	//    5   13:astore_0        
		if(obj instanceof IBinder)
			break MISSING_BLOCK_LABEL_28;
	//    6   14:aload_0         
	//    7   15:instanceof      #42  <Class IBinder>
	//    8   18:ifne            28
		aag.e("ClientApi class is not an instance of IBinder.");
	//    9   21:ldc1            #44  <String "ClientApi class is not an instance of IBinder.">
	//   10   23:invokestatic    #50  <Method void aag.e(String)>
		return null;
	//   11   26:aconst_null     
	//   12   27:areturn         
		Exception exception;
		try
		{
			obj = ((Object) (bxo.asInterface((IBinder)obj)));
	//   13   28:aload_0         
	//   14   29:checkcast       #42  <Class IBinder>
	//   15   32:invokestatic    #56  <Method bxn bxo.asInterface(IBinder)>
	//   16   35:astore_0        
		}
	//*  17   36:aload_0         
	//*  18   37:areturn         
	//*  19   38:ldc1            #58  <String "Failed to instantiate ClientApi class.">
	//*  20   40:invokestatic    #50  <Method void aag.e(String)>
	//*  21   43:aconst_null     
	//*  22   44:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			aag.e("Failed to instantiate ClientApi class.");
			return null;
		}
		return ((bxn) (obj));
	//*  23   45:astore_0        
	//*  24   46:goto            38
	}

	private final Object d()
	{
		Object obj = ((Object) (a));
	//    0    0:getstatic       #14  <Field bxn a>
	//    1    3:astore_1        
		if(obj == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       15
		{
			aag.e("ClientApi class cannot be loaded.");
	//    4    8:ldc1            #63  <String "ClientApi class cannot be loaded.">
	//    5   10:invokestatic    #50  <Method void aag.e(String)>
			return ((Object) (null));
	//    6   13:aconst_null     
	//    7   14:areturn         
		}
		try
		{
			obj = a(((bxn) (obj)));
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #66  <Method Object a(bxn)>
	//   11   20:astore_1        
		}
	//*  12   21:aload_1         
	//*  13   22:areturn         
		catch(RemoteException remoteexception)
	//*  14   23:astore_1        
		{
			aag.c("Cannot invoke local loader using ClientApi class.", ((Throwable) (remoteexception)));
	//   15   24:ldc1            #68  <String "Cannot invoke local loader using ClientApi class.">
	//   16   26:aload_1         
	//   17   27:invokestatic    #71  <Method void aag.c(String, Throwable)>
			return ((Object) (null));
	//   18   30:aconst_null     
	//   19   31:areturn         
		}
		return obj;
	}

	private final Object e()
	{
		Object obj;
		try
		{
			obj = b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method Object b()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(RemoteException remoteexception)
	//*   5    7:astore_1        
		{
			aag.c("Cannot invoke remote loader.", ((Throwable) (remoteexception)));
	//    6    8:ldc1            #76  <String "Cannot invoke remote loader.">
	//    7   10:aload_1         
	//    8   11:invokestatic    #71  <Method void aag.c(String, Throwable)>
			return ((Object) (null));
	//    9   14:aconst_null     
	//   10   15:areturn         
		}
		return obj;
	}

	protected abstract Object a();

	public final Object a(Context context, boolean flag)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		boolean flag2 = flag;
	//    2    3:iload_2         
	//    3    4:istore          6
		if(!flag)
	//*   4    6:iload_2         
	//*   5    7:ifne            34
		{
			bwk.a();
	//    6   10:invokestatic    #83  <Method zv bwk.a()>
	//    7   13:pop             
			flag2 = flag;
	//    8   14:iload_2         
	//    9   15:istore          6
			if(!zv.c(context, 0xbdfcb8))
	//*  10   17:aload_1         
	//*  11   18:ldc1            #84  <Int 0xbdfcb8>
	//*  12   20:invokestatic    #89  <Method boolean zv.c(Context, int)>
	//*  13   23:ifne            34
			{
				aag.b("Google Play Services is not available.");
	//   14   26:ldc1            #91  <String "Google Play Services is not available.">
	//   15   28:invokestatic    #93  <Method void aag.b(String)>
				flag2 = true;
	//   16   31:iconst_1        
	//   17   32:istore          6
			}
		}
		if(DynamiteModule.a(context, "com.google.android.gms.ads.dynamite") > DynamiteModule.b(context, "com.google.android.gms.ads.dynamite"))
	//*  18   34:aload_1         
	//*  19   35:ldc1            #95  <String "com.google.android.gms.ads.dynamite">
	//*  20   37:invokestatic    #100 <Method int DynamiteModule.a(Context, String)>
	//*  21   40:aload_1         
	//*  22   41:ldc1            #95  <String "com.google.android.gms.ads.dynamite">
	//*  23   43:invokestatic    #102 <Method int DynamiteModule.b(Context, String)>
	//*  24   46:icmple          52
			flag2 = true;
	//   25   49:iconst_1        
	//   26   50:istore          6
		p.a(context);
	//   27   52:aload_1         
	//   28   53:invokestatic    #107 <Method void p.a(Context)>
		e e1 = p.cA;
	//   29   56:getstatic       #111 <Field e p.cA>
	//   30   59:astore          7
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*  31   61:invokestatic    #114 <Method m bwk.e()>
	//*  32   64:aload           7
	//*  33   66:invokevirtual   #119 <Method Object m.a(e)>
	//*  34   69:checkcast       #121 <Class Boolean>
	//*  35   72:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
	//*  36   75:ifeq            81
			flag2 = false;
	//   37   78:iconst_0        
	//   38   79:istore          6
		if(flag2)
	//*  39   81:iload           6
	//*  40   83:ifeq            108
		{
			Object obj = d();
	//   41   86:aload_0         
	//   42   87:invokespecial   #127 <Method Object d()>
	//   43   90:astore          7
			context = ((Context) (obj));
	//   44   92:aload           7
	//   45   94:astore_1        
			if(obj == null)
	//*  46   95:aload           7
	//*  47   97:ifnonnull       233
				context = ((Context) (e()));
	//   48  100:aload_0         
	//   49  101:invokespecial   #129 <Method Object e()>
	//   50  104:astore_1        
		} else
	//*  51  105:goto            233
		{
			Object obj1 = e();
	//   52  108:aload_0         
	//   53  109:invokespecial   #129 <Method Object e()>
	//   54  112:astore          7
			int i;
			if(obj1 == null)
	//*  55  114:aload           7
	//*  56  116:ifnonnull       124
				i = 1;
	//   57  119:iconst_1        
	//   58  120:istore_3        
			else
	//*  59  121:goto            126
				i = 0;
	//   60  124:iconst_0        
	//   61  125:istore_3        
			if(i != 0)
	//*  62  126:iload_3         
	//*  63  127:ifeq            217
			{
				e e2 = p.cQ;
	//   64  130:getstatic       #132 <Field e p.cQ>
	//   65  133:astore          8
				int j = ((Integer)bwk.e().a(e2)).intValue();
	//   66  135:invokestatic    #114 <Method m bwk.e()>
	//   67  138:aload           8
	//   68  140:invokevirtual   #119 <Method Object m.a(e)>
	//   69  143:checkcast       #134 <Class Integer>
	//   70  146:invokevirtual   #138 <Method int Integer.intValue()>
	//   71  149:istore          5
				if(bwk.h().nextInt(j) != 0)
	//*  72  151:invokestatic    #142 <Method Random bwk.h()>
	//*  73  154:iload           5
	//*  74  156:invokevirtual   #148 <Method int Random.nextInt(int)>
	//*  75  159:ifne            165
	//*  76  162:goto            168
					flag1 = false;
	//   77  165:iconst_0        
	//   78  166:istore          4
				if(flag1)
	//*  79  168:iload           4
	//*  80  170:ifeq            217
				{
					Bundle bundle = new Bundle();
	//   81  173:new             #150 <Class Bundle>
	//   82  176:dup             
	//   83  177:invokespecial   #151 <Method void Bundle()>
	//   84  180:astore          8
					bundle.putString("action", "dynamite_load");
	//   85  182:aload           8
	//   86  184:ldc1            #153 <String "action">
	//   87  186:ldc1            #155 <String "dynamite_load">
	//   88  188:invokevirtual   #159 <Method void Bundle.putString(String, String)>
					bundle.putInt("is_missing", i);
	//   89  191:aload           8
	//   90  193:ldc1            #161 <String "is_missing">
	//   91  195:iload_3         
	//   92  196:invokevirtual   #165 <Method void Bundle.putInt(String, int)>
					bwk.a().a(context, bwk.g().a, "gmob-apps", bundle, true);
	//   93  199:invokestatic    #83  <Method zv bwk.a()>
	//   94  202:aload_1         
	//   95  203:invokestatic    #169 <Method zzbbi bwk.g()>
	//   96  206:getfield        #174 <Field String zzbbi.a>
	//   97  209:ldc1            #176 <String "gmob-apps">
	//   98  211:aload           8
	//   99  213:iconst_1        
	//  100  214:invokevirtual   #179 <Method void zv.a(Context, String, String, Bundle, boolean)>
				}
			}
			if(obj1 == null)
	//* 101  217:aload           7
	//* 102  219:ifnonnull       230
				context = ((Context) (d()));
	//  103  222:aload_0         
	//  104  223:invokespecial   #127 <Method Object d()>
	//  105  226:astore_1        
			else
	//* 106  227:goto            233
				context = ((Context) (obj1));
	//  107  230:aload           7
	//  108  232:astore_1        
		}
		if(context == null)
	//* 109  233:aload_1         
	//* 110  234:ifnonnull       242
			return a();
	//  111  237:aload_0         
	//  112  238:invokevirtual   #181 <Method Object a()>
	//  113  241:areturn         
		else
			return ((Object) (context));
	//  114  242:aload_1         
	//  115  243:areturn         
	}

	protected abstract Object a(bxn bxn);

	protected abstract Object b();

	private static final bxn a = c();

	static 
	{
	//    0    0:invokestatic    #12  <Method bxn c()>
	//    1    3:putstatic       #14  <Field bxn a>
	//*   2    6:return          
	}
}
