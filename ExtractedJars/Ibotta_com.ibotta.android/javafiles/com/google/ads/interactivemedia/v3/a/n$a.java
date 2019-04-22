// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;

import android.text.TextUtils;

// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			n

private static final class n$a
{

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          56
		{
			if(obj.getClass() != com/google/ads/interactivemedia/v3/a/n$a)
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #26  <Method Class Object.getClass()>
	//*   9   15:ldc1            #2   <Class n$a>
	//*  10   17:if_acmpeq       22
				return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
			obj = ((Object) ((n$a)obj));
	//   13   22:aload_1         
	//   14   23:checkcast       #2   <Class n$a>
	//   15   26:astore_1        
			return TextUtils.equals(((CharSequence) (a)), ((CharSequence) (((n$a) (obj)).a))) && b == ((n$a) (obj)).b;
	//   16   27:aload_0         
	//   17   28:getfield        #17  <Field String a>
	//   18   31:aload_1         
	//   19   32:getfield        #17  <Field String a>
	//   20   35:invokestatic    #31  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   21   38:ifeq            54
	//   22   41:aload_0         
	//   23   42:getfield        #19  <Field boolean b>
	//   24   45:aload_1         
	//   25   46:getfield        #19  <Field boolean b>
	//   26   49:icmpne          54
	//   27   52:iconst_1        
	//   28   53:ireturn         
	//   29   54:iconst_0        
	//   30   55:ireturn         
		} else
		{
			return false;
	//   31   56:iconst_0        
	//   32   57:ireturn         
		}
	}

	public int hashCode()
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String a>
	//    2    4:astore_3        
		int i;
		if(s == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		else
	//*   7   11:goto            19
			i = s.hashCode();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #37  <Method int String.hashCode()>
	//   10   18:istore_1        
		char c;
		if(b)
	//*  11   19:aload_0         
	//*  12   20:getfield        #19  <Field boolean b>
	//*  13   23:ifeq            33
			c = '\u04CF';
	//   14   26:sipush          1231
	//   15   29:istore_2        
		else
	//*  16   30:goto            37
			c = '\u04D5';
	//   17   33:sipush          1237
	//   18   36:istore_2        
		return (i + 31) * 31 + c;
	//   19   37:iload_1         
	//   20   38:bipush          31
	//   21   40:iadd            
	//   22   41:bipush          31
	//   23   43:imul            
	//   24   44:iload_2         
	//   25   45:iadd            
	//   26   46:ireturn         
	}

	public final String a;
	public final boolean b;

	public n$a(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String a>
		b = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field boolean b>
	//    8   14:return          
	}
}
