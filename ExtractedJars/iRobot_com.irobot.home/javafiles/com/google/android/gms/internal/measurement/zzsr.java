// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.PrintStream;
import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsw, zzsv, zzss

public final class zzsr
{
	static final class zza extends zzss
	{

		public final void zza(Throwable throwable, PrintStream printstream)
		{
			throwable.printStackTrace(printstream);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #19  <Method void Throwable.printStackTrace(PrintStream)>
		//    3    5:return          
		}

		zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void zzss()>
		//    2    4:return          
		}
	}


	public static void zza(Throwable throwable, PrintStream printstream)
	{
		zzbsf.zza(throwable, printstream);
	//    0    0:getstatic       #91  <Field zzss zzbsf>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #99  <Method void zzss.zza(Throwable, PrintStream)>
	//    4    8:return          
	}

	private static Integer zztu()
	{
		Integer integer;
		try
		{
			integer = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(((Object) (null)));
	//    0    0:ldc1            #103 <String "android.os.Build$VERSION">
	//    1    2:invokestatic    #107 <Method Class Class.forName(String)>
	//    2    5:ldc1            #109 <String "SDK_INT">
	//    3    7:invokevirtual   #113 <Method Field Class.getField(String)>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #119 <Method Object Field.get(Object)>
	//    6   14:checkcast       #21  <Class Integer>
	//    7   17:astore_0        
		}
	//*   8   18:aload_0         
	//*   9   19:areturn         
		catch(Exception exception)
	//*  10   20:astore_0        
		{
			System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
	//   11   21:getstatic       #48  <Field PrintStream System.err>
	//   12   24:ldc1            #121 <String "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.">
	//   13   26:invokevirtual   #85  <Method void PrintStream.println(String)>
			exception.printStackTrace(System.err);
	//   14   29:aload_0         
	//   15   30:getstatic       #48  <Field PrintStream System.err>
	//   16   33:invokevirtual   #122 <Method void Exception.printStackTrace(PrintStream)>
			return null;
	//   17   36:aconst_null     
	//   18   37:areturn         
		}
		return integer;
	}

	private static final zzss zzbsf;
	private static final int zzbsg;

	static 
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_0        
		Integer integer = zztu();
	//    2    2:invokestatic    #19  <Method Integer zztu()>
	//    3    5:astore_2        
		if(integer == null) goto _L2; else goto _L1
	//    4    6:aload_2         
	//    5    7:ifnull          30
_L1:
		if(integer.intValue() < 19) goto _L2; else goto _L3
	//    6   10:aload_2         
	//    7   11:invokevirtual   #25  <Method int Integer.intValue()>
	//    8   14:bipush          19
	//    9   16:icmplt          30
_L3:
		Object obj = ((Object) (new zzsw()));
	//   10   19:new             #27  <Class zzsw>
	//   11   22:dup             
	//   12   23:invokespecial   #30  <Method void zzsw()>
	//   13   26:astore_1        
		  goto _L4
	//*  14   27:goto            145
_L2:
		if(!(Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true)) goto _L6; else goto _L5
	//   15   30:ldc1            #32  <String "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic">
	//   16   32:invokestatic    #38  <Method boolean Boolean.getBoolean(String)>
	//   17   35:iconst_1        
	//   18   36:ixor            
	//   19   37:ifeq            51
_L5:
		obj = ((Object) (new zzsv()));
	//   20   40:new             #40  <Class zzsv>
	//   21   43:dup             
	//   22   44:invokespecial   #41  <Method void zzsv()>
	//   23   47:astore_1        
		  goto _L4
	//*  24   48:goto            145
_L6:
		obj = ((Object) (new zza()));
	//   25   51:new             #6   <Class zzsr$zza>
	//   26   54:dup             
	//   27   55:invokespecial   #42  <Method void zzsr$zza()>
	//   28   58:astore_1        
		  goto _L4
	//*  29   59:goto            145
		obj;
	//   30   62:astore_1        
		integer = null;
	//   31   63:aconst_null     
	//   32   64:astore_2        
_L8:
		PrintStream printstream = System.err;
	//   33   65:getstatic       #48  <Field PrintStream System.err>
	//   34   68:astore_3        
		String s = ((Class) (com/google/android/gms/internal/measurement/zzsr$zza)).getName();
	//   35   69:ldc1            #6   <Class zzsr$zza>
	//   36   71:invokevirtual   #54  <Method String Class.getName()>
	//   37   74:astore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 132);
	//   38   76:new             #56  <Class StringBuilder>
	//   39   79:dup             
	//   40   80:aload           4
	//   41   82:invokestatic    #62  <Method String String.valueOf(Object)>
	//   42   85:invokevirtual   #65  <Method int String.length()>
	//   43   88:sipush          132
	//   44   91:iadd            
	//   45   92:invokespecial   #68  <Method void StringBuilder(int)>
	//   46   95:astore          5
		stringbuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
	//   47   97:aload           5
	//   48   99:ldc1            #70  <String "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ">
	//   49  101:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   50  104:pop             
		stringbuilder.append(s);
	//   51  105:aload           5
	//   52  107:aload           4
	//   53  109:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   54  112:pop             
		stringbuilder.append("will be used. The error is: ");
	//   55  113:aload           5
	//   56  115:ldc1            #76  <String "will be used. The error is: ">
	//   57  117:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
		printstream.println(stringbuilder.toString());
	//   59  121:aload_3         
	//   60  122:aload           5
	//   61  124:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   62  127:invokevirtual   #85  <Method void PrintStream.println(String)>
		((Throwable) (obj)).printStackTrace(System.err);
	//   63  130:aload_1         
	//   64  131:getstatic       #48  <Field PrintStream System.err>
	//   65  134:invokevirtual   #89  <Method void Throwable.printStackTrace(PrintStream)>
		obj = ((Object) (new zza()));
	//   66  137:new             #6   <Class zzsr$zza>
	//   67  140:dup             
	//   68  141:invokespecial   #42  <Method void zzsr$zza()>
	//   69  144:astore_1        
_L4:
		zzbsf = ((zzss) (obj));
	//   70  145:aload_1         
	//   71  146:putstatic       #91  <Field zzss zzbsf>
		if(integer != null)
	//*  72  149:aload_2         
	//*  73  150:ifnonnull       156
	//*  74  153:goto            161
			i = integer.intValue();
	//   75  156:aload_2         
	//   76  157:invokevirtual   #25  <Method int Integer.intValue()>
	//   77  160:istore_0        
		zzbsg = i;
	//   78  161:iload_0         
	//   79  162:putstatic       #93  <Field int zzbsg>
		return;
	//   80  165:return          
		obj;
	//   81  166:astore_1        
		if(true) goto _L8; else goto _L7
_L7:
	//*  82  167:goto            65
	}
}