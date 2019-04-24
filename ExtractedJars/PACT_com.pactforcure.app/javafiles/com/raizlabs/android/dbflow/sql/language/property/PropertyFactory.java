// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.sql.language.Condition;
import com.raizlabs.android.dbflow.sql.language.NameAlias;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			ByteProperty, CharProperty, DoubleProperty, FloatProperty, 
//			IntProperty, LongProperty, Property, ShortProperty

public class PropertyFactory
{

	public PropertyFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ByteProperty from(byte byte0)
	{
		return new ByteProperty(((Class) (null)), NameAlias.rawBuilder((new StringBuilder()).append(((int) (byte0))).append("").toString()).build());
	//    0    0:new             #13  <Class ByteProperty>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #15  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void StringBuilder()>
	//    6   12:iload_0         
	//    7   13:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//    8   16:ldc1            #22  <String "">
	//    9   18:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   11   24:invokestatic    #35  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.rawBuilder(String)>
	//   12   27:invokevirtual   #41  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   13   30:invokespecial   #44  <Method void ByteProperty(Class, NameAlias)>
	//   14   33:areturn         
	}

	public static CharProperty from(char c)
	{
		return new CharProperty(((Class) (null)), NameAlias.rawBuilder((new StringBuilder()).append("'").append(c).append("'").toString()).build());
	//    0    0:new             #47  <Class CharProperty>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #15  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void StringBuilder()>
	//    6   12:ldc1            #49  <String "'">
	//    7   14:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:iload_0         
	//    9   18:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   10   21:ldc1            #49  <String "'">
	//   11   23:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   13   29:invokestatic    #35  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.rawBuilder(String)>
	//   14   32:invokevirtual   #41  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   15   35:invokespecial   #53  <Method void CharProperty(Class, NameAlias)>
	//   16   38:areturn         
	}

	public static DoubleProperty from(double d)
	{
		return new DoubleProperty(((Class) (null)), NameAlias.rawBuilder((new StringBuilder()).append(d).append("").toString()).build());
	//    0    0:new             #56  <Class DoubleProperty>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #15  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void StringBuilder()>
	//    6   12:dload_0         
	//    7   13:invokevirtual   #59  <Method StringBuilder StringBuilder.append(double)>
	//    8   16:ldc1            #22  <String "">
	//    9   18:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   11   24:invokestatic    #35  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.rawBuilder(String)>
	//   12   27:invokevirtual   #41  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   13   30:invokespecial   #60  <Method void DoubleProperty(Class, NameAlias)>
	//   14   33:areturn         
	}

	public static FloatProperty from(float f)
	{
		return new FloatProperty(((Class) (null)), NameAlias.rawBuilder((new StringBuilder()).append(f).append("").toString()).build());
	//    0    0:new             #63  <Class FloatProperty>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #15  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void StringBuilder()>
	//    6   12:fload_0         
	//    7   13:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//    8   16:ldc1            #22  <String "">
	//    9   18:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   11   24:invokestatic    #35  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.rawBuilder(String)>
	//   12   27:invokevirtual   #41  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   13   30:invokespecial   #67  <Method void FloatProperty(Class, NameAlias)>
	//   14   33:areturn         
	}

	public static IntProperty from(int i)
	{
		return new IntProperty(((Class) (null)), NameAlias.rawBuilder((new StringBuilder()).append(i).append("").toString()).build());
	//    0    0:new             #70  <Class IntProperty>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #15  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void StringBuilder()>
	//    6   12:iload_0         
	//    7   13:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//    8   16:ldc1            #22  <String "">
	//    9   18:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   11   24:invokestatic    #35  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.rawBuilder(String)>
	//   12   27:invokevirtual   #41  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   13   30:invokespecial   #71  <Method void IntProperty(Class, NameAlias)>
	//   14   33:areturn         
	}

	public static LongProperty from(long l)
	{
		return new LongProperty(((Class) (null)), NameAlias.rawBuilder((new StringBuilder()).append(l).append("").toString()).build());
	//    0    0:new             #74  <Class LongProperty>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #15  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void StringBuilder()>
	//    6   12:lload_0         
	//    7   13:invokevirtual   #77  <Method StringBuilder StringBuilder.append(long)>
	//    8   16:ldc1            #22  <String "">
	//    9   18:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   11   24:invokestatic    #35  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.rawBuilder(String)>
	//   12   27:invokevirtual   #41  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   13   30:invokespecial   #78  <Method void LongProperty(Class, NameAlias)>
	//   14   33:areturn         
	}

	public static Property from(ModelQueriable modelqueriable)
	{
		return from(modelqueriable.getTable(), (new StringBuilder()).append("(").append(String.valueOf(((Object) (modelqueriable.getQuery()))).trim()).append(")").toString());
	//    0    0:aload_0         
	//    1    1:invokeinterface #86  <Method Class ModelQueriable.getTable()>
	//    2    6:new             #15  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #16  <Method void StringBuilder()>
	//    5   13:ldc1            #88  <String "(">
	//    6   15:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//    7   18:aload_0         
	//    8   19:invokeinterface #91  <Method String ModelQueriable.getQuery()>
	//    9   24:invokestatic    #97  <Method String String.valueOf(Object)>
	//   10   27:invokevirtual   #100 <Method String String.trim()>
	//   11   30:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   12   33:ldc1            #102 <String ")">
	//   13   35:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   14   38:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   15   41:invokestatic    #105 <Method Property from(Class, String)>
	//   16   44:areturn         
	}

	public static Property from(Class class1, String s)
	{
		return new Property(((Class) (null)), NameAlias.rawBuilder(s).build());
	//    0    0:new             #111 <Class Property>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokestatic    #35  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.rawBuilder(String)>
	//    5    9:invokevirtual   #41  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//    6   12:invokespecial   #112 <Method void Property(Class, NameAlias)>
	//    7   15:areturn         
	}

	public static Property from(Object obj)
	{
		return new Property(((Class) (null)), NameAlias.rawBuilder(Condition.convertValueToString(obj)).build());
	//    0    0:new             #111 <Class Property>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:invokestatic    #119 <Method String Condition.convertValueToString(Object)>
	//    5    9:invokestatic    #35  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.rawBuilder(String)>
	//    6   12:invokevirtual   #41  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//    7   15:invokespecial   #112 <Method void Property(Class, NameAlias)>
	//    8   18:areturn         
	}

	public static ShortProperty from(short word0)
	{
		return new ShortProperty(((Class) (null)), NameAlias.rawBuilder((new StringBuilder()).append(((int) (word0))).append("").toString()).build());
	//    0    0:new             #123 <Class ShortProperty>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #15  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void StringBuilder()>
	//    6   12:iload_0         
	//    7   13:invokevirtual   #20  <Method StringBuilder StringBuilder.append(int)>
	//    8   16:ldc1            #22  <String "">
	//    9   18:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   11   24:invokestatic    #35  <Method com.raizlabs.android.dbflow.sql.language.NameAlias$Builder NameAlias.rawBuilder(String)>
	//   12   27:invokevirtual   #41  <Method NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   13   30:invokespecial   #124 <Method void ShortProperty(Class, NameAlias)>
	//   14   33:areturn         
	}
}
