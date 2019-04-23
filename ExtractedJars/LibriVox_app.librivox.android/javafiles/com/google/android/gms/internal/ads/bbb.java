// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, bav, 
//			avl, aje, ajw, aiu, 
//			ajz, aiy

final class bbb
{

	static boolean a(bav bav1)
	{
		Object obj;
label0:
		{
			if(a != null)
	//*   0    0:getstatic       #13  <Field aiy a>
	//*   1    3:ifnull          8
				return true;
	//    2    6:iconst_1        
	//    3    7:ireturn         
			obj = ((Object) (p.bm));
	//    4    8:getstatic       #19  <Field e p.bm>
	//    5   11:astore_1        
			String s = (String)bwk.e().a(((e) (obj)));
	//    6   12:invokestatic    #25  <Method m bwk.e()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #30  <Method Object m.a(e)>
	//    9   19:checkcast       #32  <Class String>
	//   10   22:astore_2        
			if(s != null)
	//*  11   23:aload_2         
	//*  12   24:ifnull          36
			{
				obj = ((Object) (s));
	//   13   27:aload_2         
	//   14   28:astore_1        
				if(s.length() != 0)
					break label0;
	//   15   29:aload_2         
	//   16   30:invokevirtual   #36  <Method int String.length()>
	//   17   33:ifne            86
			}
			obj = null;
	//   18   36:aconst_null     
	//   19   37:astore_1        
			if(bav1 == null)
	//*  20   38:aload_0         
	//*  21   39:ifnonnull       47
			{
				bav1 = ((bav) (obj));
	//   22   42:aload_1         
	//   23   43:astore_0        
			} else
	//*  24   44:goto            78
			{
				bav1 = ((bav) (bav1.a("phpjyfBMe8u7C5auGMsy22WXoT6iMDb5qqttOP4sXOBlc73QdE1wdYLJ++PsHndY", "86B2wkBiSbEIJu45HO/BQ/RpWXZRq9YpFeIER87ao7I=")));
	//   25   47:aload_0         
	//   26   48:ldc1            #38  <String "phpjyfBMe8u7C5auGMsy22WXoT6iMDb5qqttOP4sXOBlc73QdE1wdYLJ++PsHndY">
	//   27   50:ldc1            #40  <String "86B2wkBiSbEIJu45HO/BQ/RpWXZRq9YpFeIER87ao7I=">
	//   28   52:invokevirtual   #45  <Method Method bav.a(String, String)>
	//   29   55:astore_0        
				if(bav1 == null)
	//*  30   56:aload_0         
	//*  31   57:ifnonnull       65
					bav1 = ((bav) (obj));
	//   32   60:aload_1         
	//   33   61:astore_0        
				else
	//*  34   62:goto            78
					bav1 = ((bav) ((String)((Method) (bav1)).invoke(((Object) (null)), new Object[0])));
	//   35   65:aload_0         
	//   36   66:aconst_null     
	//   37   67:iconst_0        
	//   38   68:anewarray       Object[]
	//   39   71:invokevirtual   #51  <Method Object Method.invoke(Object, Object[])>
	//   40   74:checkcast       #32  <Class String>
	//   41   77:astore_0        
			}
			obj = ((Object) (bav1));
	//   42   78:aload_0         
	//   43   79:astore_1        
			if(bav1 == null)
	//*  44   80:aload_0         
	//*  45   81:ifnonnull       86
				return false;
	//   46   84:iconst_0        
	//   47   85:ireturn         
		}
		try
		{
			bav1 = ((bav) (avl.a(((String) (obj)), true)));
	//   48   86:aload_1         
	//   49   87:iconst_1        
	//   50   88:invokestatic    #56  <Method byte[] avl.a(String, boolean)>
	//   51   91:astore_0        
		}
	//*  52   92:aload_0         
	//*  53   93:invokestatic    #61  <Method aja aje.a(byte[])>
	//*  54   96:astore_0        
	//*  55   97:getstatic       #66  <Field aok ajw.a>
	//*  56  100:invokestatic    #71  <Method void aiu.a(aok)>
	//*  57  103:aload_0         
	//*  58  104:invokestatic    #76  <Method aiy ajz.a(aja)>
	//*  59  107:putstatic       #13  <Field aiy a>
	//*  60  110:getstatic       #13  <Field aiy a>
	//*  61  113:ifnull          118
	//*  62  116:iconst_1        
	//*  63  117:ireturn         
	//*  64  118:iconst_0        
	//*  65  119:ireturn         
		// Misplaced declaration of an exception variable
		catch(bav bav1)
	//*  66  120:astore_0        
		{
			return false;
	//   67  121:iconst_0        
	//   68  122:ireturn         
		}
		try
		{
			bav1 = ((bav) (aje.a(((byte []) (bav1)))));
			aiu.a(ajw.a);
			a = ajz.a(((aja) (bav1)));
		}
		// Misplaced declaration of an exception variable
		catch(bav bav1)
	//*  69  123:astore_0        
		{
			return false;
	//   70  124:iconst_0        
	//   71  125:ireturn         
		}
		return a != null;
	}

	static aiy a;
}
