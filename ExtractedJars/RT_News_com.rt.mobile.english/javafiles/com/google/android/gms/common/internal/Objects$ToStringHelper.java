// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//			Objects, Preconditions, zzj

public static final class Objects$ToStringHelper
{

	public final Objects$ToStringHelper add(String s, Object obj)
	{
		List list = zzul;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List zzul>
	//    2    4:astore_3        
		s = (String)Preconditions.checkNotNull(((Object) (s)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #39  <Class String>
	//    6   12:astore_1        
		obj = ((Object) (String.valueOf(obj)));
	//    7   13:aload_2         
	//    8   14:invokestatic    #43  <Method String String.valueOf(Object)>
	//    9   17:astore_2        
		StringBuilder stringbuilder = new StringBuilder(1 + String.valueOf(((Object) (s))).length() + String.valueOf(obj).length());
	//   10   18:new             #45  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:aload_1         
	//   14   24:invokestatic    #43  <Method String String.valueOf(Object)>
	//   15   27:invokevirtual   #49  <Method int String.length()>
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

	public final Objects$ToStringHelper addValue(Object obj)
	{
		zzul.add(((Object) (String.valueOf(obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List zzul>
	//    2    4:aload_1         
	//    3    5:invokestatic    #43  <Method String String.valueOf(Object)>
	//    4    8:invokeinterface #67  <Method boolean List.add(Object)>
	//    5   13:pop             
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(100);
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          100
	//    3    6:invokespecial   #52  <Method void StringBuilder(int)>
	//    4    9:astore_3        
		stringbuilder.append(zzum.getClass().getSimpleName());
	//    5   10:aload_3         
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field Object zzum>
	//    8   15:invokevirtual   #74  <Method Class Object.getClass()>
	//    9   18:invokevirtual   #79  <Method String Class.getSimpleName()>
	//   10   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append('{');
	//   12   25:aload_3         
	//   13   26:bipush          123
	//   14   28:invokevirtual   #82  <Method StringBuilder StringBuilder.append(char)>
	//   15   31:pop             
		int j = zzul.size();
	//   16   32:aload_0         
	//   17   33:getfield        #30  <Field List zzul>
	//   18   36:invokeinterface #85  <Method int List.size()>
	//   19   41:istore_2        
		for(int i = 0; i < j; i++)
	//*  20   42:iconst_0        
	//*  21   43:istore_1        
	//*  22   44:iload_1         
	//*  23   45:iload_2         
	//*  24   46:icmpge          88
		{
			stringbuilder.append((String)zzul.get(i));
	//   25   49:aload_3         
	//   26   50:aload_0         
	//   27   51:getfield        #30  <Field List zzul>
	//   28   54:iload_1         
	//   29   55:invokeinterface #89  <Method Object List.get(int)>
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
	//   39   75:ldc1            #91  <String ", ">
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
	//   49   91:invokevirtual   #82  <Method StringBuilder StringBuilder.append(char)>
	//   50   94:pop             
		return stringbuilder.toString();
	//   51   95:aload_3         
	//   52   96:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   53   99:areturn         
	}

	private final List zzul;
	private final Object zzum;

	private Objects$ToStringHelper(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzum = Preconditions.checkNotNull(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:putfield        #25  <Field Object zzum>
		zzul = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #27  <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #28  <Method void ArrayList()>
	//   10   20:putfield        #30  <Field List zzul>
	//   11   23:return          
	}

	Objects$ToStringHelper(Object obj, zzj zzj)
	{
		this(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void Objects$ToStringHelper(Object)>
	//    3    5:return          
	}
}
