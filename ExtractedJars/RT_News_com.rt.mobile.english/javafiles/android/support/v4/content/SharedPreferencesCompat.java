// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;


public final class SharedPreferencesCompat
{
	public static final class EditorCompat
	{

		public static EditorCompat getInstance()
		{
			if(sInstance == null)
		//*   0    0:getstatic       #27  <Field SharedPreferencesCompat$EditorCompat sInstance>
		//*   1    3:ifnonnull       16
				sInstance = new EditorCompat();
		//    2    6:new             #2   <Class SharedPreferencesCompat$EditorCompat>
		//    3    9:dup             
		//    4   10:invokespecial   #28  <Method void SharedPreferencesCompat$EditorCompat()>
		//    5   13:putstatic       #27  <Field SharedPreferencesCompat$EditorCompat sInstance>
			return sInstance;
		//    6   16:getstatic       #27  <Field SharedPreferencesCompat$EditorCompat sInstance>
		//    7   19:areturn         
		}

		public void apply(android.content.SharedPreferences.Editor editor)
		{
			mHelper.apply(editor);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field SharedPreferencesCompat$EditorCompat$Helper mHelper>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #34  <Method void SharedPreferencesCompat$EditorCompat$Helper.apply(android.content.SharedPreferences$Editor)>
		//    4    8:return          
		}

		private static EditorCompat sInstance;
		private final Helper mHelper = new Helper();

		private EditorCompat()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #9   <Class SharedPreferencesCompat$EditorCompat$Helper>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void SharedPreferencesCompat$EditorCompat$Helper()>
		//    6   12:putfield        #22  <Field SharedPreferencesCompat$EditorCompat$Helper mHelper>
		//    7   15:return          
		}
	}

	private static class EditorCompat.Helper
	{

		public void apply(android.content.SharedPreferences.Editor editor)
		{
			AbstractMethodError abstractmethoderror;
			try
			{
				editor.apply();
		//    0    0:aload_1         
		//    1    1:invokeinterface #24  <Method void android.content.SharedPreferences$Editor.apply()>
				return;
		//    2    6:return          
			}
		//*   3    7:aload_1         
		//*   4    8:invokeinterface #28  <Method boolean android.content.SharedPreferences$Editor.commit()>
		//*   5   13:pop             
		//*   6   14:return          
			// Misplaced declaration of an exception variable
			catch(AbstractMethodError abstractmethoderror)
			{
				editor.commit();
			}
		//*   7   15:astore_2        
		//*   8   16:goto            7
		}

		EditorCompat.Helper()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	private SharedPreferencesCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
