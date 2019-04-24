// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.getkeepsafe.relinker:
//			ReLinkerInstance

public class ReLinker
{
	public static interface LibraryInstaller
	{

		public abstract void installLibrary(Context context, String as[], String s, File file, ReLinkerInstance relinkerinstance);
	}

	public static interface LibraryLoader
	{

		public abstract void loadLibrary(String s);

		public abstract void loadPath(String s);

		public abstract String mapLibraryName(String s);

		public abstract String[] supportedAbis();

		public abstract String unmapLibraryName(String s);
	}

	public static interface LoadListener
	{

		public abstract void failure(Throwable throwable);

		public abstract void success();
	}

	public static interface Logger
	{

		public abstract void log(String s);
	}


	private ReLinker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static ReLinkerInstance force()
	{
		return (new ReLinkerInstance()).force();
	//    0    0:new             #25  <Class ReLinkerInstance>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ReLinkerInstance()>
	//    3    7:invokevirtual   #28  <Method ReLinkerInstance ReLinkerInstance.force()>
	//    4   10:areturn         
	}

	public static void loadLibrary(Context context, String s)
	{
		loadLibrary(context, s, ((String) (null)), ((LoadListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokestatic    #33  <Method void loadLibrary(Context, String, String, ReLinker$LoadListener)>
	//    5    7:return          
	}

	public static void loadLibrary(Context context, String s, LoadListener loadlistener)
	{
		loadLibrary(context, s, ((String) (null)), loadlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokestatic    #33  <Method void loadLibrary(Context, String, String, ReLinker$LoadListener)>
	//    5    7:return          
	}

	public static void loadLibrary(Context context, String s, String s1)
	{
		loadLibrary(context, s, s1, ((LoadListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #33  <Method void loadLibrary(Context, String, String, ReLinker$LoadListener)>
	//    5    7:return          
	}

	public static void loadLibrary(Context context, String s, String s1, LoadListener loadlistener)
	{
		(new ReLinkerInstance()).loadLibrary(context, s, s1, loadlistener);
	//    0    0:new             #25  <Class ReLinkerInstance>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ReLinkerInstance()>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #36  <Method void ReLinkerInstance.loadLibrary(Context, String, String, ReLinker$LoadListener)>
	//    8   14:return          
	}

	public static ReLinkerInstance log(Logger logger)
	{
		return (new ReLinkerInstance()).log(logger);
	//    0    0:new             #25  <Class ReLinkerInstance>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ReLinkerInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #40  <Method ReLinkerInstance ReLinkerInstance.log(ReLinker$Logger)>
	//    5   11:areturn         
	}

	public static ReLinkerInstance recursively()
	{
		return (new ReLinkerInstance()).recursively();
	//    0    0:new             #25  <Class ReLinkerInstance>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ReLinkerInstance()>
	//    3    7:invokevirtual   #43  <Method ReLinkerInstance ReLinkerInstance.recursively()>
	//    4   10:areturn         
	}
}
