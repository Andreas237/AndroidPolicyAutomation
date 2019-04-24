// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.database;

import android.text.TextUtils;

public final class DatabaseUtilsCompat
{

	private DatabaseUtilsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String[] appendSelectionArgs(String as[], String as1[])
	{
		if(as == null || as.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
		{
			return as1;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			String as2[] = new String[as.length + as1.length];
	//    7   11:aload_0         
	//    8   12:arraylength     
	//    9   13:aload_1         
	//   10   14:arraylength     
	//   11   15:iadd            
	//   12   16:anewarray       String[]
	//   13   19:astore_2        
			System.arraycopy(((Object) (as)), 0, ((Object) (as2)), 0, as.length);
	//   14   20:aload_0         
	//   15   21:iconst_0        
	//   16   22:aload_2         
	//   17   23:iconst_0        
	//   18   24:aload_0         
	//   19   25:arraylength     
	//   20   26:invokestatic    #19  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (as1)), 0, ((Object) (as2)), as.length, as1.length);
	//   21   29:aload_1         
	//   22   30:iconst_0        
	//   23   31:aload_2         
	//   24   32:aload_0         
	//   25   33:arraylength     
	//   26   34:aload_1         
	//   27   35:arraylength     
	//   28   36:invokestatic    #19  <Method void System.arraycopy(Object, int, Object, int, int)>
			return as2;
	//   29   39:aload_2         
	//   30   40:areturn         
		}
	}

	public static String concatenateWhere(String s, String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #27  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return s1;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #27  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifeq            18
			return s;
	//    8   16:aload_0         
	//    9   17:areturn         
		else
			return (new StringBuilder()).append("(").append(s).append(") AND (").append(s1).append(")").toString();
	//   10   18:new             #29  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #30  <Method void StringBuilder()>
	//   13   25:ldc1            #32  <String "(">
	//   14   27:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:aload_0         
	//   16   31:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:ldc1            #38  <String ") AND (">
	//   18   36:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:ldc1            #40  <String ")">
	//   22   45:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   24   51:areturn         
	}
}
