// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class bim
{

	public bim(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field String b>
	//    8   14:return          
	}

	public final String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String a>
	//    2    4:areturn         
	}

	public final String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String b>
	//    2    4:areturn         
	}

	public final boolean equals(Object obj)
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
	//*   6    8:ifnull          61
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #24  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #24  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((bim)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class bim>
	//   16   28:astore_1        
			return TextUtils.equals(((CharSequence) (a)), ((CharSequence) (((bim) (obj)).a))) && TextUtils.equals(((CharSequence) (b)), ((CharSequence) (((bim) (obj)).b)));
	//   17   29:aload_0         
	//   18   30:getfield        #14  <Field String a>
	//   19   33:aload_1         
	//   20   34:getfield        #14  <Field String a>
	//   21   37:invokestatic    #29  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   22   40:ifeq            59
	//   23   43:aload_0         
	//   24   44:getfield        #16  <Field String b>
	//   25   47:aload_1         
	//   26   48:getfield        #16  <Field String b>
	//   27   51:invokestatic    #29  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   28   54:ifeq            59
	//   29   57:iconst_1        
	//   30   58:ireturn         
	//   31   59:iconst_0        
	//   32   60:ireturn         
		} else
		{
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		}
	}

	public final int hashCode()
	{
		return a.hashCode() * 31 + b.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String a>
	//    2    4:invokevirtual   #35  <Method int String.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #16  <Field String b>
	//    7   14:invokevirtual   #35  <Method int String.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public final String toString()
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String a>
	//    2    4:astore_1        
		String s1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field String b>
	//    5    9:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 20 + String.valueOf(((Object) (s1))).length());
	//    6   10:new             #38  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokestatic    #42  <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #45  <Method int String.length()>
	//   11   21:bipush          20
	//   12   23:iadd            
	//   13   24:aload_2         
	//   14   25:invokestatic    #42  <Method String String.valueOf(Object)>
	//   15   28:invokevirtual   #45  <Method int String.length()>
	//   16   31:iadd            
	//   17   32:invokespecial   #48  <Method void StringBuilder(int)>
	//   18   35:astore_3        
		stringbuilder.append("Header[name=");
	//   19   36:aload_3         
	//   20   37:ldc1            #50  <String "Header[name=">
	//   21   39:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(s);
	//   23   43:aload_3         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append(",value=");
	//   27   49:aload_3         
	//   28   50:ldc1            #56  <String ",value=">
	//   29   52:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(s1);
	//   31   56:aload_3         
	//   32   57:aload_2         
	//   33   58:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   34   61:pop             
		stringbuilder.append("]");
	//   35   62:aload_3         
	//   36   63:ldc1            #58  <String "]">
	//   37   65:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   38   68:pop             
		return stringbuilder.toString();
	//   39   69:aload_3         
	//   40   70:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   41   73:areturn         
	}

	private final String a;
	private final String b;
}
