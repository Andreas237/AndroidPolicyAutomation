// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;


// Referenced classes of package android.support.v4.content:
//			SharedPreferencesCompat

public static final class SharedPreferencesCompat$EditorCompat
{
	static class Helper
	{

		public void apply(android.content.SharedPreferences.Editor editor)
		{
			try
			{
				editor.apply();
		//    0    0:aload_1         
		//    1    1:invokeinterface #24  <Method void android.content.SharedPreferences$Editor.apply()>
				return;
		//    2    6:return          
			}
			catch(AbstractMethodError abstractmethoderror)
		//*   3    7:astore_2        
			{
				editor.commit();
		//    4    8:aload_1         
		//    5    9:invokeinterface #28  <Method boolean android.content.SharedPreferences$Editor.commit()>
		//    6   14:pop             
			}
		//    7   15:return          
		}

		Helper()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public static SharedPreferencesCompat$EditorCompat getInstance()
	{
		if(sInstance == null)
	//*   0    0:getstatic       #26  <Field SharedPreferencesCompat$EditorCompat sInstance>
	//*   1    3:ifnonnull       16
			sInstance = new SharedPreferencesCompat$EditorCompat();
	//    2    6:new             #2   <Class SharedPreferencesCompat$EditorCompat>
	//    3    9:dup             
	//    4   10:invokespecial   #27  <Method void SharedPreferencesCompat$EditorCompat()>
	//    5   13:putstatic       #26  <Field SharedPreferencesCompat$EditorCompat sInstance>
		return sInstance;
	//    6   16:getstatic       #26  <Field SharedPreferencesCompat$EditorCompat sInstance>
	//    7   19:areturn         
	}

	public void apply(android.content.SharedPreferences.Editor editor)
	{
		mHelper.apply(editor);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SharedPreferencesCompat$EditorCompat$Helper mHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method void SharedPreferencesCompat$EditorCompat$Helper.apply(android.content.SharedPreferences$Editor)>
	//    4    8:return          
	}

	private static SharedPreferencesCompat$EditorCompat sInstance;
	private final Helper mHelper = new Helper();

	private SharedPreferencesCompat$EditorCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class SharedPreferencesCompat$EditorCompat$Helper>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void SharedPreferencesCompat$EditorCompat$Helper()>
	//    6   12:putfield        #21  <Field SharedPreferencesCompat$EditorCompat$Helper mHelper>
	//    7   15:return          
	}
}
