// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.converter.TypeConverter;

// Referenced classes of package com.pactforcure.app.survey:
//			Answer_Table

static final class Answer_Table$1
	implements com.raizlabs.android.dbflow.sql.language.property.operty.TypeConverterGetter
{

	public TypeConverter getTypeConverter(Class class1)
	{
		return ((TypeConverter) (Answer_Table.access$000((Answer_Table)FlowManager.getInstanceAdapter(class1))));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method com.raizlabs.android.dbflow.structure.InstanceAdapter FlowManager.getInstanceAdapter(Class)>
	//    2    4:checkcast       #8   <Class Answer_Table>
	//    3    7:invokestatic    #25  <Method com.raizlabs.android.dbflow.converter.DateConverter Answer_Table.access$000(Answer_Table)>
	//    4   10:areturn         
	}

	Answer_Table$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
