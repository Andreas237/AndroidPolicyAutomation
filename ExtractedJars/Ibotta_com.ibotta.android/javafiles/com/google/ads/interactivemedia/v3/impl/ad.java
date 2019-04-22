// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;


public class ad
{

	ad(long l, aa.a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #15  <Field long a>
		b = a1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #17  <Field aa$a b>
	//    8   14:return          
	}

	public long a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field long a>
	//    2    4:lreturn         
	}

	public aa.a b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field aa$a b>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #26  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #26  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ad)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ad>
	//   18   30:astore_1        
		if(a != ((ad) (obj)).a)
	//*  19   31:aload_0         
	//*  20   32:getfield        #15  <Field long a>
	//*  21   35:aload_1         
	//*  22   36:getfield        #15  <Field long a>
	//*  23   39:lcmp            
	//*  24   40:ifeq            45
			return false;
	//   25   43:iconst_0        
	//   26   44:ireturn         
		return b == ((ad) (obj)).b;
	//   27   45:aload_0         
	//   28   46:getfield        #17  <Field aa$a b>
	//   29   49:aload_1         
	//   30   50:getfield        #17  <Field aa$a b>
	//   31   53:if_acmpeq       58
	//   32   56:iconst_0        
	//   33   57:ireturn         
	//   34   58:iconst_1        
	//   35   59:ireturn         
	}

	public int hashCode()
	{
		return (int)a * 31 + b.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field long a>
	//    2    4:l2i             
	//    3    5:bipush          31
	//    4    7:imul            
	//    5    8:aload_0         
	//    6    9:getfield        #17  <Field aa$a b>
	//    7   12:invokevirtual   #32  <Method int aa$a.hashCode()>
	//    8   15:iadd            
	//    9   16:ireturn         
	}

	public String toString()
	{
		long l = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field long a>
	//    2    4:lstore_1        
		String s = String.valueOf(((Object) (b)));
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field aa$a b>
	//    5    9:invokestatic    #40  <Method String String.valueOf(Object)>
	//    6   12:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 68);
	//    7   13:new             #42  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_3         
	//   10   18:invokestatic    #40  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #45  <Method int String.length()>
	//   12   24:bipush          68
	//   13   26:iadd            
	//   14   27:invokespecial   #48  <Method void StringBuilder(int)>
	//   15   30:astore          4
		stringbuilder.append("NativeBridgeConfig [adTimeUpdateMs=");
	//   16   32:aload           4
	//   17   34:ldc1            #50  <String "NativeBridgeConfig [adTimeUpdateMs=">
	//   18   36:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(l);
	//   20   40:aload           4
	//   21   42:lload_1         
	//   22   43:invokevirtual   #57  <Method StringBuilder StringBuilder.append(long)>
	//   23   46:pop             
		stringbuilder.append(", adUiStyle=");
	//   24   47:aload           4
	//   25   49:ldc1            #59  <String ", adUiStyle=">
	//   26   51:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		stringbuilder.append(s);
	//   28   55:aload           4
	//   29   57:aload_3         
	//   30   58:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
		stringbuilder.append("]");
	//   32   62:aload           4
	//   33   64:ldc1            #61  <String "]">
	//   34   66:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		return stringbuilder.toString();
	//   36   70:aload           4
	//   37   72:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   38   75:areturn         
	}

	private final long a;
	private final aa.a b;
}
