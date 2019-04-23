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
	//    5    7:invokevirtual   #19  <Method void set(Class, Class)>
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
	//    6    8:invokevirtual   #26  <Method void set(Class, Class, Class)>
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          79
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #33  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #33  <Method Class Object.getClass()>
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
	//*  18   30:getfield        #35  <Field Class first>
	//*  19   33:aload_1         
	//*  20   34:getfield        #35  <Field Class first>
	//*  21   37:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  22   40:ifne            45
				return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
			if(!((Object) (second)).equals(((Object) (((MultiClassKey) (obj)).second))))
	//*  25   45:aload_0         
	//*  26   46:getfield        #39  <Field Class second>
	//*  27   49:aload_1         
	//*  28   50:getfield        #39  <Field Class second>
	//*  29   53:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  30   56:ifne            61
				return false;
	//   31   59:iconst_0        
	//   32   60:ireturn         
			return Util.bothNullOrEqual(((Object) (third)), ((Object) (((MultiClassKey) (obj)).third)));
	//   33   61:aload_0         
	//   34   62:getfield        #41  <Field Class third>
	//   35   65:aload_1         
	//   36   66:getfield        #41  <Field Class third>
	//   37   69:invokestatic    #47  <Method boolean Util.bothNullOrEqual(Object, Object)>
	//   38   72:ifne            77
	//   39   75:iconst_0        
	//   40   76:ireturn         
	//   41   77:iconst_1        
	//   42   78:ireturn         
		} else
		{
			return false;
	//   43   79:iconst_0        
	//   44   80:ireturn         
		}
	}

	public int hashCode()
	{
		int j = ((Object) (first)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Class first>
	//    2    4:invokevirtual   #51  <Method int Object.hashCode()>
	//    3    7:istore_2        
		int k = ((Object) (second)).hashCode();
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field Class second>
	//    6   12:invokevirtual   #51  <Method int Object.hashCode()>
	//    7   15:istore_3        
		Class class1 = third;
	//    8   16:aload_0         
	//    9   17:getfield        #41  <Field Class third>
	//   10   20:astore          4
		int i;
		if(class1 != null)
	//*  11   22:aload           4
	//*  12   24:ifnull          36
			i = ((Object) (class1)).hashCode();
	//   13   27:aload           4
	//   14   29:invokevirtual   #51  <Method int Object.hashCode()>
	//   15   32:istore_1        
		else
	//*  16   33:goto            38
			i = 0;
	//   17   36:iconst_0        
	//   18   37:istore_1        
		return (j * 31 + k) * 31 + i;
	//   19   38:iload_2         
	//   20   39:bipush          31
	//   21   41:imul            
	//   22   42:iload_3         
	//   23   43:iadd            
	//   24   44:bipush          31
	//   25   46:imul            
	//   26   47:iload_1         
	//   27   48:iadd            
	//   28   49:ireturn         
	}

	public void set(Class class1, Class class2)
	{
		set(class1, class2, ((Class) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #26  <Method void set(Class, Class, Class)>
	//    5    7:return          
	}

	public void set(Class class1, Class class2, Class class3)
	{
		first = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Class first>
		second = class2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #39  <Field Class second>
		third = class3;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #41  <Field Class third>
	//    9   15:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #55  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MultiClassKey{first=");
	//    4    8:aload_1         
	//    5    9:ldc1            #58  <String "MultiClassKey{first=">
	//    6   11:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (first)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #35  <Field Class first>
	//   11   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", second=");
	//   13   24:aload_1         
	//   14   25:ldc1            #67  <String ", second=">
	//   15   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (second)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #39  <Field Class second>
	//   20   36:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append('}');
	//   22   40:aload_1         
	//   23   41:bipush          125
	//   24   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(char)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	private Class first;
	private Class second;
	private Class third;
}
