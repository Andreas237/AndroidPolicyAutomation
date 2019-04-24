// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import java.lang.reflect.Field;

// Referenced classes of package com.google.gson:
//			FieldNamingPolicy

static final class FieldNamingPolicy$2 extends FieldNamingPolicy
{

	public String translateName(Field field)
	{
		return FieldNamingPolicy.access$100(field.getName());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #18  <Method String Field.getName()>
	//    2    4:invokestatic    #22  <Method String FieldNamingPolicy.access$100(String)>
	//    3    7:areturn         
	}

	FieldNamingPolicy$2(String s, int i)
	{
		super(s, i, ((FieldNamingPolicy$1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #9   <Method void FieldNamingPolicy(String, int, FieldNamingPolicy$1)>
	//    5    7:return          
	}
}
