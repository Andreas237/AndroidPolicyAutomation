// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db;

import android.content.Context;

// Referenced classes of package android.arch.persistence.db:
//			SupportSQLiteOpenHelper

public static class SupportSQLiteOpenHelper$Configuration$Builder
{

	public SupportSQLiteOpenHelper.Configuration build()
	{
		SupportSQLiteOpenHelper.Callback callback1 = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field SupportSQLiteOpenHelper$Callback mCallback>
	//    2    4:astore_1        
		if(callback1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          42
		{
			Context context = mContext;
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field Context mContext>
	//    7   13:astore_2        
			if(context != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          32
				return new SupportSQLiteOpenHelper.Configuration(context, mName, callback1);
	//   10   18:new             #6   <Class SupportSQLiteOpenHelper$Configuration>
	//   11   21:dup             
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:getfield        #32  <Field String mName>
	//   15   27:aload_1         
	//   16   28:invokespecial   #35  <Method void SupportSQLiteOpenHelper$Configuration(Context, String, SupportSQLiteOpenHelper$Callback)>
	//   17   31:areturn         
			else
				throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
	//   18   32:new             #37  <Class IllegalArgumentException>
	//   19   35:dup             
	//   20   36:ldc1            #39  <String "Must set a non-null context to create the configuration.">
	//   21   38:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//   22   41:athrow          
		} else
		{
			throw new IllegalArgumentException("Must set a callback to create the configuration.");
	//   23   42:new             #37  <Class IllegalArgumentException>
	//   24   45:dup             
	//   25   46:ldc1            #44  <String "Must set a callback to create the configuration.">
	//   26   48:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//   27   51:athrow          
		}
	}

	public SupportSQLiteOpenHelper$Configuration$Builder callback(SupportSQLiteOpenHelper.Callback callback1)
	{
		mCallback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field SupportSQLiteOpenHelper$Callback mCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SupportSQLiteOpenHelper$Configuration$Builder name(String s)
	{
		mName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String mName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	SupportSQLiteOpenHelper.Callback mCallback;
	Context mContext;
	String mName;

	SupportSQLiteOpenHelper$Configuration$Builder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Context mContext>
	//    5    9:return          
	}
}
