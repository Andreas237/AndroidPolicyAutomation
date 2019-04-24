// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import java.io.File;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdi

final class zzbr
{

	private static int version()
	{
		NumberFormatException numberformatexception;
		int i;
		String s;
		try
		{
			i = Integer.parseInt(android.os.Build.VERSION.SDK);
	//    0    0:getstatic       #14  <Field String android.os.Build$VERSION.SDK>
	//    1    3:invokestatic    #20  <Method int Integer.parseInt(String)>
	//    2    6:istore_0        
		}
	//*   3    7:iload_0         
	//*   4    8:ireturn         
	//*   5    9:getstatic       #14  <Field String android.os.Build$VERSION.SDK>
	//*   6   12:invokestatic    #26  <Method String String.valueOf(Object)>
	//*   7   15:astore_1        
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #29  <Method int String.length()>
	//*  10   20:ifeq            33
	//*  11   23:ldc1            #31  <String "Invalid version number: ">
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #35  <Method String String.concat(String)>
	//*  14   29:astore_1        
	//*  15   30:goto            43
	//*  16   33:new             #22  <Class String>
	//*  17   36:dup             
	//*  18   37:ldc1            #31  <String "Invalid version number: ">
	//*  19   39:invokespecial   #39  <Method void String(String)>
	//*  20   42:astore_1        
	//*  21   43:aload_1         
	//*  22   44:invokestatic    #44  <Method void zzdi.e(String)>
	//*  23   47:iconst_0        
	//*  24   48:ireturn         
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			s = String.valueOf(((Object) (android.os.Build.VERSION.SDK)));
			if(s.length() != 0)
				s = "Invalid version number: ".concat(s);
			else
				s = new String("Invalid version number: ");
			zzdi.e(s);
			return 0;
		}
		return i;
	//*  25   49:astore_1        
	//*  26   50:goto            9
	}

	static boolean zzdr(String s)
	{
		if(version() < 9)
	//*   0    0:invokestatic    #52  <Method int version()>
	//*   1    3:bipush          9
	//*   2    5:icmpge          10
		{
			return false;
	//    3    8:iconst_0        
	//    4    9:ireturn         
		} else
		{
			s = ((String) (new File(s)));
	//    5   10:new             #54  <Class File>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:invokespecial   #55  <Method void File(String)>
	//    9   18:astore_0        
			((File) (s)).setReadable(false, false);
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #59  <Method boolean File.setReadable(boolean, boolean)>
	//   14   25:pop             
			((File) (s)).setWritable(false, false);
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:iconst_0        
	//   18   29:invokevirtual   #62  <Method boolean File.setWritable(boolean, boolean)>
	//   19   32:pop             
			((File) (s)).setReadable(true, true);
	//   20   33:aload_0         
	//   21   34:iconst_1        
	//   22   35:iconst_1        
	//   23   36:invokevirtual   #59  <Method boolean File.setReadable(boolean, boolean)>
	//   24   39:pop             
			((File) (s)).setWritable(true, true);
	//   25   40:aload_0         
	//   26   41:iconst_1        
	//   27   42:iconst_1        
	//   28   43:invokevirtual   #62  <Method boolean File.setWritable(boolean, boolean)>
	//   29   46:pop             
			return true;
	//   30   47:iconst_1        
	//   31   48:ireturn         
		}
	}
}
