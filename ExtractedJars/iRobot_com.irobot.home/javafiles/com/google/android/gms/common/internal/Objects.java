// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import java.util.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions, zzq

public final class Objects
{
	public static final class ToStringHelper
	{

		public final ToStringHelper add(String s, Object obj)
		{
			List list = zzer;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List zzer>
		//    2    4:astore_3        
			s = (String)Preconditions.checkNotNull(((Object) (s)));
		//    3    5:aload_1         
		//    4    6:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #39  <Class String>
		//    6   12:astore_1        
			obj = ((Object) (String.valueOf(obj)));
		//    7   13:aload_2         
		//    8   14:invokestatic    #43  <Method String String.valueOf(Object)>
		//    9   17:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(obj).length());
		//   10   18:new             #45  <Class StringBuilder>
		//   11   21:dup             
		//   12   22:aload_1         
		//   13   23:invokestatic    #43  <Method String String.valueOf(Object)>
		//   14   26:invokevirtual   #49  <Method int String.length()>
		//   15   29:iconst_1        
		//   16   30:iadd            
		//   17   31:aload_2         
		//   18   32:invokestatic    #43  <Method String String.valueOf(Object)>
		//   19   35:invokevirtual   #49  <Method int String.length()>
		//   20   38:iadd            
		//   21   39:invokespecial   #52  <Method void StringBuilder(int)>
		//   22   42:astore          4
			stringbuilder.append(s);
		//   23   44:aload           4
		//   24   46:aload_1         
		//   25   47:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   26   50:pop             
			stringbuilder.append("=");
		//   27   51:aload           4
		//   28   53:ldc1            #58  <String "=">
		//   29   55:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   30   58:pop             
			stringbuilder.append(((String) (obj)));
		//   31   59:aload           4
		//   32   61:aload_2         
		//   33   62:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   34   65:pop             
			list.add(((Object) (stringbuilder.toString())));
		//   35   66:aload_3         
		//   36   67:aload           4
		//   37   69:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   38   72:invokeinterface #67  <Method boolean List.add(Object)>
		//   39   77:pop             
			return this;
		//   40   78:aload_0         
		//   41   79:areturn         
		}

		public final String toString()
		{
			StringBuilder stringbuilder = new StringBuilder(100);
		//    0    0:new             #45  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:bipush          100
		//    3    6:invokespecial   #52  <Method void StringBuilder(int)>
		//    4    9:astore_3        
			stringbuilder.append(zzes.getClass().getSimpleName());
		//    5   10:aload_3         
		//    6   11:aload_0         
		//    7   12:getfield        #26  <Field Object zzes>
		//    8   15:invokevirtual   #72  <Method Class Object.getClass()>
		//    9   18:invokevirtual   #77  <Method String Class.getSimpleName()>
		//   10   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
			stringbuilder.append('{');
		//   12   25:aload_3         
		//   13   26:bipush          123
		//   14   28:invokevirtual   #80  <Method StringBuilder StringBuilder.append(char)>
		//   15   31:pop             
			int j = zzer.size();
		//   16   32:aload_0         
		//   17   33:getfield        #31  <Field List zzer>
		//   18   36:invokeinterface #83  <Method int List.size()>
		//   19   41:istore_2        
			for(int i = 0; i < j; i++)
		//*  20   42:iconst_0        
		//*  21   43:istore_1        
		//*  22   44:iload_1         
		//*  23   45:iload_2         
		//*  24   46:icmpge          88
			{
				stringbuilder.append((String)zzer.get(i));
		//   25   49:aload_3         
		//   26   50:aload_0         
		//   27   51:getfield        #31  <Field List zzer>
		//   28   54:iload_1         
		//   29   55:invokeinterface #87  <Method Object List.get(int)>
		//   30   60:checkcast       #39  <Class String>
		//   31   63:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   32   66:pop             
				if(i < j - 1)
		//*  33   67:iload_1         
		//*  34   68:iload_2         
		//*  35   69:iconst_1        
		//*  36   70:isub            
		//*  37   71:icmpge          81
					stringbuilder.append(", ");
		//   38   74:aload_3         
		//   39   75:ldc1            #89  <String ", ">
		//   40   77:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   41   80:pop             
			}

		//   42   81:iload_1         
		//   43   82:iconst_1        
		//   44   83:iadd            
		//   45   84:istore_1        
		//*  46   85:goto            44
			stringbuilder.append('}');
		//   47   88:aload_3         
		//   48   89:bipush          125
		//   49   91:invokevirtual   #80  <Method StringBuilder StringBuilder.append(char)>
		//   50   94:pop             
			return stringbuilder.toString();
		//   51   95:aload_3         
		//   52   96:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   53   99:areturn         
		}

		private final List zzer;
		private final Object zzes;

		private ToStringHelper(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zzes = Preconditions.checkNotNull(obj);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:putfield        #26  <Field Object zzes>
			zzer = ((List) (new ArrayList()));
		//    6   12:aload_0         
		//    7   13:new             #28  <Class ArrayList>
		//    8   16:dup             
		//    9   17:invokespecial   #29  <Method void ArrayList()>
		//   10   20:putfield        #31  <Field List zzer>
		//   11   23:return          
		}

		ToStringHelper(Object obj, zzq zzq)
		{
			this(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #35  <Method void Objects$ToStringHelper(Object)>
		//    3    5:return          
		}
	}


	private Objects()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		throw new AssertionError("Uninstantiable");
	//    2    4:new             #14  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #16  <String "Uninstantiable">
	//    5   10:invokespecial   #19  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static boolean equal(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       22
	//    3    5:aload_0         
	//    4    6:ifnull          20
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #26  <Method boolean Object.equals(Object)>
	//    8   14:ifeq            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public static transient int hashCode(Object aobj[])
	{
		return Arrays.hashCode(aobj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method int Arrays.hashCode(Object[])>
	//    2    4:ireturn         
	}

	public static ToStringHelper toStringHelper(Object obj)
	{
		return new ToStringHelper(obj, ((zzq) (null)));
	//    0    0:new             #6   <Class Objects$ToStringHelper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #38  <Method void Objects$ToStringHelper(Object, zzq)>
	//    5    9:areturn         
	}
}
