// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;


// Referenced classes of package android.support.v4.content:
//			SharedPreferencesCompat

private static class SharedPreferencesCompat$EditorCompat$Helper
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

	SharedPreferencesCompat$EditorCompat$Helper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
