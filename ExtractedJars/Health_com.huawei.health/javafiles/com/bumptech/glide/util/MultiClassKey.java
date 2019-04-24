// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;


// Referenced classes of package com.bumptech.glide.util:
//			Util

public class MultiClassKey
{

	public MultiClassKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public MultiClassKey(Class class1, Class class2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		set(class1, class2);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #18  <Method void set(Class, Class)>
	//    6   10:return          
	}

	public MultiClassKey(Class class1, Class class2, Class class3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		set(class1, class2, class3);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #23  <Method void set(Class, Class, Class)>
	//    7   11:return          
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
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #30  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #30  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((MultiClassKey)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class MultiClassKey>
	//   16   28:astore_1        
		if(!((Object) (first)).equals(((Object) (((MultiClassKey) (obj)).first))))
	//*  17   29:aload_0         
	//*  18   30:getfield        #32  <Field Class first>
	//*  19   33:aload_1         
	//*  20   34:getfield        #32  <Field Class first>
	//*  21   37:invokevirtual   #34  <Method boolean Object.equals(Object)>
	//*  22   40:ifne            45
			return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
		if(!((Object) (second)).equals(((Object) (((MultiClassKey) (obj)).second))))
	//*  25   45:aload_0         
	//*  26   46:getfield        #36  <Field Class second>
	//*  27   49:aload_1         
	//*  28   50:getfield        #36  <Field Class second>
	//*  29   53:invokevirtual   #34  <Method boolean Object.equals(Object)>
	//*  30   56:ifne            61
			return false;
	//   31   59:iconst_0        
	//   32   60:ireturn         
		return Util.bothNullOrEqual(((Object) (third)), ((Object) (((MultiClassKey) (obj)).third)));
	//   33   61:aload_0         
	//   34   62:getfield        #38  <Field Class third>
	//   35   65:aload_1         
	//   36   66:getfield        #38  <Field Class third>
	//   37   69:invokestatic    #44  <Method boolean Util.bothNullOrEqual(Object, Object)>
	//   38   72:ifne            77
	//   39   75:iconst_0        
	//   40   76:ireturn         
	//   41   77:iconst_1        
	//   42   78:ireturn         
	}

	public int hashCode()
	{
		int j = ((Object) (first)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Class first>
	//    2    4:invokevirtual   #48  <Method int Object.hashCode()>
	//    3    7:istore_2        
		int k = ((Object) (second)).hashCode();
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field Class second>
	//    6   12:invokevirtual   #48  <Method int Object.hashCode()>
	//    7   15:istore_3        
		int i;
		if(third != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #38  <Field Class third>
	//*  10   20:ifnull          34
			i = ((Object) (third)).hashCode();
	//   11   23:aload_0         
	//   12   24:getfield        #38  <Field Class third>
	//   13   27:invokevirtual   #48  <Method int Object.hashCode()>
	//   14   30:istore_1        
		else
	//*  15   31:goto            36
			i = 0;
	//   16   34:iconst_0        
	//   17   35:istore_1        
		return (j * 31 + k) * 31 + i;
	//   18   36:iload_2         
	//   19   37:bipush          31
	//   20   39:imul            
	//   21   40:iload_3         
	//   22   41:iadd            
	//   23   42:bipush          31
	//   24   44:imul            
	//   25   45:iload_1         
	//   26   46:iadd            
	//   27   47:ireturn         
	}

	public void set(Class class1, Class class2)
	{
		set(class1, class2, ((Class) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #23  <Method void set(Class, Class, Class)>
	//    5    7:return          
	}

	public void set(Class class1, Class class2, Class class3)
	{
		first = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field Class first>
		second = class2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #36  <Field Class second>
		third = class3;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #38  <Field Class third>
	//    9   15:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("MultiClassKey{first=").append(((Object) (first))).append(", second=").append(((Object) (second))).append('}').toString();
	//    0    0:new             #52  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:ldc1            #55  <String "MultiClassKey{first=">
	//    4    9:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #32  <Field Class first>
	//    7   16:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #64  <String ", second=">
	//    9   21:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #36  <Field Class second>
	//   12   28:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:bipush          125
	//   14   33:invokevirtual   #67  <Method StringBuilder StringBuilder.append(char)>
	//   15   36:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	private Class first;
	private Class second;
	private Class third;
}
