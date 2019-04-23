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
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static String[] appendSelectionArgs(String as[], String as1[])
	{
		if(as != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          41
		{
			if(as.length == 0)
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
	//   20   26:invokestatic    #20  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (as1)), 0, ((Object) (as2)), as.length, as1.length);
	//   21   29:aload_1         
	//   22   30:iconst_0        
	//   23   31:aload_2         
	//   24   32:aload_0         
	//   25   33:arraylength     
	//   26   34:aload_1         
	//   27   35:arraylength     
	//   28   36:invokestatic    #20  <Method void System.arraycopy(Object, int, Object, int, int)>
				return as2;
	//   29   39:aload_2         
	//   30   40:areturn         
			}
		} else
		{
			return as1;
	//   31   41:aload_1         
	//   32   42:areturn         
		}
	}

	public static String concatenateWhere(String s, String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return s1;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifeq            18
		{
			return s;
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   18:new             #31  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #32  <Method void StringBuilder()>
	//   13   25:astore_2        
			stringbuilder.append("(");
	//   14   26:aload_2         
	//   15   27:ldc1            #34  <String "(">
	//   16   29:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
			stringbuilder.append(s);
	//   18   33:aload_2         
	//   19   34:aload_0         
	//   20   35:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			stringbuilder.append(") AND (");
	//   22   39:aload_2         
	//   23   40:ldc1            #40  <String ") AND (">
	//   24   42:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   25   45:pop             
			stringbuilder.append(s1);
	//   26   46:aload_2         
	//   27   47:aload_1         
	//   28   48:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   29   51:pop             
			stringbuilder.append(")");
	//   30   52:aload_2         
	//   31   53:ldc1            #42  <String ")">
	//   32   55:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   33   58:pop             
			return stringbuilder.toString();
	//   34   59:aload_2         
	//   35   60:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   36   63:areturn         
		}
	}
}
