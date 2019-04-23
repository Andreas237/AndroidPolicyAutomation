// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.PrintStream;
import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzcy, zzcx, zzcu

public final class zzct
{
	static final class zza extends zzcu
	{

		public final void zza(Throwable throwable)
		{
			throwable.printStackTrace();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #18  <Method void Throwable.printStackTrace()>
		//    2    4:return          
		}

		zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void zzcu()>
		//    2    4:return          
		}
	}


	public static void zza(Throwable throwable)
	{
		zzlq.zza(throwable);
	//    0    0:getstatic       #91  <Field zzcu zzlq>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #99  <Method void zzcu.zza(Throwable)>
	//    3    7:return          
	}

	private static Integer zzbq()
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

	private static final zzcu zzlq;
	private static final int zzlr;

	static 
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_0        
		Integer integer = zzbq();
	//    2    2:invokestatic    #19  <Method Integer zzbq()>
	//    3    5:astore_2        
		if(integer == null)
			break MISSING_BLOCK_LABEL_30;
	//    4    6:aload_2         
	//    5    7:ifnull          30
		Object obj;
		if(integer.intValue() >= 19)
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #25  <Method int Integer.intValue()>
	//*   8   14:bipush          19
	//*   9   16:icmplt          30
		{
			obj = ((Object) (new zzcy()));
	//   10   19:new             #27  <Class zzcy>
	//   11   22:dup             
	//   12   23:invokespecial   #30  <Method void zzcy()>
	//   13   26:astore_1        
			break MISSING_BLOCK_LABEL_149;
	//   14   27:goto            149
		}
		if(Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true)
	//*  15   30:ldc1            #32  <String "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic">
	//*  16   32:invokestatic    #38  <Method boolean Boolean.getBoolean(String)>
	//*  17   35:iconst_1        
	//*  18   36:ixor            
	//*  19   37:ifeq            51
		{
			obj = ((Object) (new zzcx()));
	//   20   40:new             #40  <Class zzcx>
	//   21   43:dup             
	//   22   44:invokespecial   #41  <Method void zzcx()>
	//   23   47:astore_1        
			break MISSING_BLOCK_LABEL_149;
	//   24   48:goto            149
		}
		try
		{
			obj = ((Object) (new zza()));
	//   25   51:new             #6   <Class zzct$zza>
	//   26   54:dup             
	//   27   55:invokespecial   #42  <Method void zzct$zza()>
	//   28   58:astore_1        
			break MISSING_BLOCK_LABEL_149;
	//   29   59:goto            149
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   30   62:astore_1        
		break MISSING_BLOCK_LABEL_69;
	//   31   63:goto            69
		obj;
	//   32   66:astore_1        
		integer = null;
	//   33   67:aconst_null     
	//   34   68:astore_2        
		PrintStream printstream = System.err;
	//   35   69:getstatic       #48  <Field PrintStream System.err>
	//   36   72:astore_3        
		String s = ((Class) (com/google/android/gms/internal/vision/zzct$zza)).getName();
	//   37   73:ldc1            #6   <Class zzct$zza>
	//   38   75:invokevirtual   #54  <Method String Class.getName()>
	//   39   78:astore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 132);
	//   40   80:new             #56  <Class StringBuilder>
	//   41   83:dup             
	//   42   84:aload           4
	//   43   86:invokestatic    #62  <Method String String.valueOf(Object)>
	//   44   89:invokevirtual   #65  <Method int String.length()>
	//   45   92:sipush          132
	//   46   95:iadd            
	//   47   96:invokespecial   #68  <Method void StringBuilder(int)>
	//   48   99:astore          5
		stringbuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
	//   49  101:aload           5
	//   50  103:ldc1            #70  <String "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ">
	//   51  105:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
		stringbuilder.append(s);
	//   53  109:aload           5
	//   54  111:aload           4
	//   55  113:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   56  116:pop             
		stringbuilder.append("will be used. The error is: ");
	//   57  117:aload           5
	//   58  119:ldc1            #76  <String "will be used. The error is: ">
	//   59  121:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   60  124:pop             
		printstream.println(stringbuilder.toString());
	//   61  125:aload_3         
	//   62  126:aload           5
	//   63  128:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   64  131:invokevirtual   #85  <Method void PrintStream.println(String)>
		((Throwable) (obj)).printStackTrace(System.err);
	//   65  134:aload_1         
	//   66  135:getstatic       #48  <Field PrintStream System.err>
	//   67  138:invokevirtual   #89  <Method void Throwable.printStackTrace(PrintStream)>
		obj = ((Object) (new zza()));
	//   68  141:new             #6   <Class zzct$zza>
	//   69  144:dup             
	//   70  145:invokespecial   #42  <Method void zzct$zza()>
	//   71  148:astore_1        
		zzlq = ((zzcu) (obj));
	//   72  149:aload_1         
	//   73  150:putstatic       #91  <Field zzcu zzlq>
		if(integer != null)
	//*  74  153:aload_2         
	//*  75  154:ifnonnull       160
	//*  76  157:goto            165
			i = integer.intValue();
	//   77  160:aload_2         
	//   78  161:invokevirtual   #25  <Method int Integer.intValue()>
	//   79  164:istore_0        
		zzlr = i;
	//   80  165:iload_0         
	//   81  166:putstatic       #93  <Field int zzlr>
	//   82  169:return          
	}
}
