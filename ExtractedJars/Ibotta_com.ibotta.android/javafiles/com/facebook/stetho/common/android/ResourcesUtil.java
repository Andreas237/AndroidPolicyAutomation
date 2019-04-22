// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.content.res.Resources;
import com.facebook.stetho.common.LogUtil;

public class ResourcesUtil
{

	private ResourcesUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static String getFallbackIdString(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("#");
	//    4    8:aload_1         
	//    5    9:ldc1            #16  <String "#">
	//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toHexString(i));
	//    8   15:aload_1         
	//    9   16:iload_0         
	//   10   17:invokestatic    #25  <Method String Integer.toHexString(int)>
	//   11   20:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	public static String getIdString(Resources resources, int i)
		throws android.content.res.Resources.NotFoundException
	{
		if(resources == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
			return getFallbackIdString(i);
	//    2    4:iload_1         
	//    3    5:invokestatic    #36  <Method String getFallbackIdString(int)>
	//    4    8:areturn         
		String s;
		String s1;
		if(getResourcePackageId(i) != 127)
	//*   5    9:iload_1         
	//*   6   10:invokestatic    #40  <Method int getResourcePackageId(int)>
	//*   7   13:bipush          127
	//*   8   15:icmpeq          30
		{
			s = resources.getResourcePackageName(i);
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:invokevirtual   #45  <Method String Resources.getResourcePackageName(int)>
	//   12   23:astore_2        
			s1 = ":";
	//   13   24:ldc1            #47  <String ":">
	//   14   26:astore_3        
		} else
	//*  15   27:goto            36
		{
			s = "";
	//   16   30:ldc1            #49  <String "">
	//   17   32:astore_2        
			s1 = "";
	//   18   33:ldc1            #49  <String "">
	//   19   35:astore_3        
		}
		String s2 = resources.getResourceTypeName(i);
	//   20   36:aload_0         
	//   21   37:iload_1         
	//   22   38:invokevirtual   #52  <Method String Resources.getResourceTypeName(int)>
	//   23   41:astore          4
		resources = ((Resources) (resources.getResourceEntryName(i)));
	//   24   43:aload_0         
	//   25   44:iload_1         
	//   26   45:invokevirtual   #55  <Method String Resources.getResourceEntryName(int)>
	//   27   48:astore_0        
		StringBuilder stringbuilder = new StringBuilder(s.length() + 1 + s1.length() + s2.length() + 1 + ((String) (resources)).length());
	//   28   49:new             #13  <Class StringBuilder>
	//   29   52:dup             
	//   30   53:aload_2         
	//   31   54:invokevirtual   #61  <Method int String.length()>
	//   32   57:iconst_1        
	//   33   58:iadd            
	//   34   59:aload_3         
	//   35   60:invokevirtual   #61  <Method int String.length()>
	//   36   63:iadd            
	//   37   64:aload           4
	//   38   66:invokevirtual   #61  <Method int String.length()>
	//   39   69:iadd            
	//   40   70:iconst_1        
	//   41   71:iadd            
	//   42   72:aload_0         
	//   43   73:invokevirtual   #61  <Method int String.length()>
	//   44   76:iadd            
	//   45   77:invokespecial   #64  <Method void StringBuilder(int)>
	//   46   80:astore          5
		stringbuilder.append("@");
	//   47   82:aload           5
	//   48   84:ldc1            #66  <String "@">
	//   49   86:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   50   89:pop             
		stringbuilder.append(s);
	//   51   90:aload           5
	//   52   92:aload_2         
	//   53   93:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   54   96:pop             
		stringbuilder.append(s1);
	//   55   97:aload           5
	//   56   99:aload_3         
	//   57  100:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   58  103:pop             
		stringbuilder.append(s2);
	//   59  104:aload           5
	//   60  106:aload           4
	//   61  108:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   62  111:pop             
		stringbuilder.append("/");
	//   63  112:aload           5
	//   64  114:ldc1            #68  <String "/">
	//   65  116:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   66  119:pop             
		stringbuilder.append(((String) (resources)));
	//   67  120:aload           5
	//   68  122:aload_0         
	//   69  123:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		return stringbuilder.toString();
	//   71  127:aload           5
	//   72  129:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   73  132:areturn         
	}

	public static String getIdStringQuietly(Object obj, Resources resources, int i)
	{
		StringBuilder stringbuilder;
		try
		{
			resources = ((Resources) (getIdString(resources, i)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #75  <Method String getIdString(Resources, int)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:areturn         
	//*   6    8:iload_2         
	//*   7    9:invokestatic    #36  <Method String getFallbackIdString(int)>
	//*   8   12:astore_1        
	//*   9   13:new             #13  <Class StringBuilder>
	//*  10   16:dup             
	//*  11   17:invokespecial   #14  <Method void StringBuilder()>
	//*  12   20:astore_3        
	//*  13   21:aload_3         
	//*  14   22:ldc1            #77  <String "Unknown identifier encountered on ">
	//*  15   24:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//*  16   27:pop             
	//*  17   28:aload_3         
	//*  18   29:aload_0         
	//*  19   30:invokevirtual   #80  <Method StringBuilder StringBuilder.append(Object)>
	//*  20   33:pop             
	//*  21   34:aload_3         
	//*  22   35:ldc1            #82  <String ": ">
	//*  23   37:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//*  24   40:pop             
	//*  25   41:aload_3         
	//*  26   42:aload_1         
	//*  27   43:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//*  28   46:pop             
	//*  29   47:aload_3         
	//*  30   48:invokevirtual   #29  <Method String StringBuilder.toString()>
	//*  31   51:invokestatic    #88  <Method void LogUtil.w(String)>
	//*  32   54:aload_1         
	//*  33   55:areturn         
		// Misplaced declaration of an exception variable
		catch(Resources resources)
		{
			resources = ((Resources) (getFallbackIdString(i)));
			stringbuilder = new StringBuilder();
			stringbuilder.append("Unknown identifier encountered on ");
			stringbuilder.append(obj);
			stringbuilder.append(": ");
			stringbuilder.append(((String) (resources)));
			LogUtil.w(stringbuilder.toString());
			return ((String) (resources));
		}
		return ((String) (resources));
	//*  34   56:astore_1        
	//*  35   57:goto            8
	}

	private static int getResourcePackageId(int i)
	{
		return i >>> 24 & 0xff;
	//    0    0:iload_0         
	//    1    1:bipush          24
	//    2    3:iushr           
	//    3    4:sipush          255
	//    4    7:iand            
	//    5    8:ireturn         
	}
}
