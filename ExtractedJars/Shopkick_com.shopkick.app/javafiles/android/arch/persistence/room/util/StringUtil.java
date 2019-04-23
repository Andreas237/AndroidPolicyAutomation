// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room.util;

import android.util.Log;
import java.util.*;

public class StringUtil
{

	public StringUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static void appendPlaceholders(StringBuilder stringbuilder, int i)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:iload_1         
	//*   4    4:icmpge          35
		{
			stringbuilder.append("?");
	//    5    7:aload_0         
	//    6    8:ldc1            #24  <String "?">
	//    7   10:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//    8   13:pop             
			if(j < i - 1)
	//*   9   14:iload_2         
	//*  10   15:iload_1         
	//*  11   16:iconst_1        
	//*  12   17:isub            
	//*  13   18:icmpge          28
				stringbuilder.append(",");
	//   14   21:aload_0         
	//   15   22:ldc1            #32  <String ",">
	//   16   24:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   17   27:pop             
		}

	//   18   28:iload_2         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_2        
	//*  22   32:goto            2
	//   23   35:return          
	}

	public static String joinIntoString(List list)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = list.size();
	//    4    6:aload_0         
	//    5    7:invokeinterface #41  <Method int List.size()>
	//    6   12:istore_2        
		if(j == 0)
	//*   7   13:iload_2         
	//*   8   14:ifne            20
			return "";
	//    9   17:ldc1            #43  <String "">
	//   10   19:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   11   20:new             #26  <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #44  <Method void StringBuilder()>
	//   14   27:astore_3        
		for(int i = 0; i < j; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_1        
	//*  17   30:iload_1         
	//*  18   31:iload_2         
	//*  19   32:icmpge          77
		{
			stringbuilder.append(Integer.toString(((Integer)list.get(i)).intValue()));
	//   20   35:aload_3         
	//   21   36:aload_0         
	//   22   37:iload_1         
	//   23   38:invokeinterface #48  <Method Object List.get(int)>
	//   24   43:checkcast       #50  <Class Integer>
	//   25   46:invokevirtual   #53  <Method int Integer.intValue()>
	//   26   49:invokestatic    #57  <Method String Integer.toString(int)>
	//   27   52:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
			if(i < j - 1)
	//*  29   56:iload_1         
	//*  30   57:iload_2         
	//*  31   58:iconst_1        
	//*  32   59:isub            
	//*  33   60:icmpge          70
				stringbuilder.append(",");
	//   34   63:aload_3         
	//   35   64:ldc1            #32  <String ",">
	//   36   66:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
		}

	//   38   70:iload_1         
	//   39   71:iconst_1        
	//   40   72:iadd            
	//   41   73:istore_1        
	//*  42   74:goto            30
		return stringbuilder.toString();
	//   43   77:aload_3         
	//   44   78:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   45   81:areturn         
	}

	public static StringBuilder newStringBuilder()
	{
		return new StringBuilder();
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:areturn         
	}

	public static List splitToIntList(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList();
	//    4    6:new             #72  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #73  <Method void ArrayList()>
	//    7   13:astore_1        
		for(s = ((String) (new StringTokenizer(s, ","))); ((StringTokenizer) (s)).hasMoreElements();)
	//*   8   14:new             #75  <Class StringTokenizer>
	//*   9   17:dup             
	//*  10   18:aload_0         
	//*  11   19:ldc1            #32  <String ",">
	//*  12   21:invokespecial   #78  <Method void StringTokenizer(String, String)>
	//*  13   24:astore_0        
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #82  <Method boolean StringTokenizer.hasMoreElements()>
	//*  16   29:ifeq            67
		{
			String s1 = ((StringTokenizer) (s)).nextToken();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #85  <Method String StringTokenizer.nextToken()>
	//   19   36:astore_2        
			try
			{
				((List) (arraylist)).add(((Object) (Integer.valueOf(Integer.parseInt(s1)))));
	//   20   37:aload_1         
	//   21   38:aload_2         
	//   22   39:invokestatic    #89  <Method int Integer.parseInt(String)>
	//   23   42:invokestatic    #93  <Method Integer Integer.valueOf(int)>
	//   24   45:invokeinterface #97  <Method boolean List.add(Object)>
	//   25   50:pop             
			}
	//*  26   51:goto            25
			catch(NumberFormatException numberformatexception)
	//*  27   54:astore_2        
			{
				Log.e("ROOM", "Malformed integer list", ((Throwable) (numberformatexception)));
	//   28   55:ldc1            #99  <String "ROOM">
	//   29   57:ldc1            #101 <String "Malformed integer list">
	//   30   59:aload_2         
	//   31   60:invokestatic    #107 <Method int Log.e(String, String, Throwable)>
	//   32   63:pop             
			}
		}

	//*  33   64:goto            25
		return ((List) (arraylist));
	//   34   67:aload_1         
	//   35   68:areturn         
	}

	public static final String EMPTY_STRING_ARRAY[] = new String[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       String[]
	//    2    4:putstatic       #16  <Field String[] EMPTY_STRING_ARRAY>
	//*   3    7:return          
	}
}
