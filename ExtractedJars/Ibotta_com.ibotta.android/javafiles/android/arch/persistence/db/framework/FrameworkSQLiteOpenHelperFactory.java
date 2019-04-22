// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db.framework;

import android.arch.persistence.db.SupportSQLiteOpenHelper;

// Referenced classes of package android.arch.persistence.db.framework:
//			FrameworkSQLiteOpenHelper

public final class FrameworkSQLiteOpenHelperFactory
	implements android.arch.persistence.db.SupportSQLiteOpenHelper.Factory
{

	public FrameworkSQLiteOpenHelperFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public SupportSQLiteOpenHelper create(android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration configuration)
	{
		return ((SupportSQLiteOpenHelper) (new FrameworkSQLiteOpenHelper(configuration.context, configuration.name, configuration.callback)));
	//    0    0:new             #15  <Class FrameworkSQLiteOpenHelper>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #21  <Field android.content.Context android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration.context>
	//    4    8:aload_1         
	//    5    9:getfield        #25  <Field String android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration.name>
	//    6   12:aload_1         
	//    7   13:getfield        #29  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration.callback>
	//    8   16:invokespecial   #32  <Method void FrameworkSQLiteOpenHelper(android.content.Context, String, android.arch.persistence.db.SupportSQLiteOpenHelper$Callback)>
	//    9   19:areturn         
	}
}
