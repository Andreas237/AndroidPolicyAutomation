// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import java.util.HashSet;

public final class ExoPlayerLibraryInfo
{

	private ExoPlayerLibraryInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	public static void registerModule(String s)
	{
		com/google/android/exoplayer2/ExoPlayerLibraryInfo;
	//    0    0:ldc1            #2   <Class ExoPlayerLibraryInfo>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(registeredModules.add(((Object) (s))))
	//*   2    3:getstatic       #36  <Field HashSet registeredModules>
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #44  <Method boolean HashSet.add(Object)>
	//*   5   10:ifeq            49
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   13:new             #46  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #47  <Method void StringBuilder()>
	//    9   20:astore_1        
			stringbuilder.append(registeredModulesString);
	//   10   21:aload_1         
	//   11   22:getstatic       #49  <Field String registeredModulesString>
	//   12   25:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
			stringbuilder.append(", ");
	//   14   29:aload_1         
	//   15   30:ldc1            #55  <String ", ">
	//   16   32:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append(s);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			registeredModulesString = stringbuilder.toString();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   24   46:putstatic       #49  <Field String registeredModulesString>
		}
		com/google/android/exoplayer2/ExoPlayerLibraryInfo;
	//   25   49:ldc1            #2   <Class ExoPlayerLibraryInfo>
		JVM INSTR monitorexit ;
	//   26   51:monitorexit     
		return;
	//   27   52:return          
		s;
	//   28   53:astore_0        
	//*  29   54:ldc1            #2   <Class ExoPlayerLibraryInfo>
		throw s;
	//   30   56:monitorexit     
	//   31   57:aload_0         
	//   32   58:athrow          
	}

	public static String registeredModules()
	{
		com/google/android/exoplayer2/ExoPlayerLibraryInfo;
	//    0    0:ldc1            #2   <Class ExoPlayerLibraryInfo>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = registeredModulesString;
	//    2    3:getstatic       #49  <Field String registeredModulesString>
	//    3    6:astore_0        
		com/google/android/exoplayer2/ExoPlayerLibraryInfo;
	//    4    7:ldc1            #2   <Class ExoPlayerLibraryInfo>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return s;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class ExoPlayerLibraryInfo>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static final boolean ASSERTIONS_ENABLED = true;
	public static final String TAG = "ExoPlayer";
	public static final boolean TRACE_ENABLED = true;
	public static final String VERSION = "2.8.3";
	public static final int VERSION_INT = 0x1ea3c3;
	public static final String VERSION_SLASHY = "ExoPlayerLib/2.8.3";
	private static final HashSet registeredModules = new HashSet();
	private static String registeredModulesString = "goog.exo.core";

	static 
	{
	//    0    0:new             #31  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void HashSet()>
	//    3    7:putstatic       #36  <Field HashSet registeredModules>
	//*   4   10:return          
	}
}
