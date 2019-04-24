// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker;

import android.os.Build;

// Referenced classes of package com.getkeepsafe.relinker:
//			TextUtils

final class SystemLibraryLoader
	implements ReLinker.LibraryLoader
{

	SystemLibraryLoader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void loadLibrary(String s)
	{
		System.loadLibrary(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #17  <Method void System.loadLibrary(String)>
	//    2    4:return          
	}

	public void loadPath(String s)
	{
		System.load(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method void System.load(String)>
	//    2    4:return          
	}

	public String mapLibraryName(String s)
	{
		if(s.startsWith("lib") && s.endsWith(".so"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #25  <String "lib">
	//*   2    3:invokevirtual   #31  <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            20
	//*   4    9:aload_1         
	//*   5   10:ldc1            #33  <String ".so">
	//*   6   12:invokevirtual   #36  <Method boolean String.endsWith(String)>
	//*   7   15:ifeq            20
			return s;
	//    8   18:aload_1         
	//    9   19:areturn         
		else
			return System.mapLibraryName(s);
	//   10   20:aload_1         
	//   11   21:invokestatic    #38  <Method String System.mapLibraryName(String)>
	//   12   24:areturn         
	}

	public String[] supportedAbis()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && Build.SUPPORTED_ABIS.length > 0)
	//*   0    0:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
	//*   3    8:getstatic       #52  <Field String[] Build.SUPPORTED_ABIS>
	//*   4   11:arraylength     
	//*   5   12:ifle            19
			return Build.SUPPORTED_ABIS;
	//    6   15:getstatic       #52  <Field String[] Build.SUPPORTED_ABIS>
	//    7   18:areturn         
		if(!TextUtils.isEmpty(((CharSequence) (Build.CPU_ABI2))))
	//*   8   19:getstatic       #56  <Field String Build.CPU_ABI2>
	//*   9   22:invokestatic    #62  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   25:ifne            45
			return (new String[] {
				Build.CPU_ABI, Build.CPU_ABI2
			});
	//   11   28:iconst_2        
	//   12   29:anewarray       String[]
	//   13   32:dup             
	//   14   33:iconst_0        
	//   15   34:getstatic       #65  <Field String Build.CPU_ABI>
	//   16   37:aastore         
	//   17   38:dup             
	//   18   39:iconst_1        
	//   19   40:getstatic       #56  <Field String Build.CPU_ABI2>
	//   20   43:aastore         
	//   21   44:areturn         
		else
			return (new String[] {
				Build.CPU_ABI
			});
	//   22   45:iconst_1        
	//   23   46:anewarray       String[]
	//   24   49:dup             
	//   25   50:iconst_0        
	//   26   51:getstatic       #65  <Field String Build.CPU_ABI>
	//   27   54:aastore         
	//   28   55:areturn         
	}

	public String unmapLibraryName(String s)
	{
		return s.substring(3, s.length() - 3);
	//    0    0:aload_1         
	//    1    1:iconst_3        
	//    2    2:aload_1         
	//    3    3:invokevirtual   #70  <Method int String.length()>
	//    4    6:iconst_3        
	//    5    7:isub            
	//    6    8:invokevirtual   #74  <Method String String.substring(int, int)>
	//    7   11:areturn         
	}
}
