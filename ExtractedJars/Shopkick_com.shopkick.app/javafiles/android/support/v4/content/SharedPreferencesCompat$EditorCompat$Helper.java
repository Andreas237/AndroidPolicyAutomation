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

	SharedPreferencesCompat$EditorCompat$Helper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
