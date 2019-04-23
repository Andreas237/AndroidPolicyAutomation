// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.text.DecimalFormat;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aeq, wx, add

public final class aey extends aeq
{

	public aey(add add)
	{
		super(add);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void aeq(add)>
		add = ((add) (a.getCacheDir()));
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field Context a>
	//    5    9:invokevirtual   #51  <Method File Context.getCacheDir()>
	//    6   12:astore_1        
		if(add == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       23
		{
			wx.e("Context.getCacheDir() returned null");
	//    9   17:ldc1            #53  <String "Context.getCacheDir() returned null">
	//   10   19:invokestatic    #57  <Method void wx.e(String)>
			return;
	//   11   22:return          
		}
		f = new File(((File) (add)), "admobVideoStreams");
	//   12   23:aload_0         
	//   13   24:new             #59  <Class File>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:ldc1            #61  <String "admobVideoStreams">
	//   17   31:invokespecial   #64  <Method void File(File, String)>
	//   18   34:putfield        #66  <Field File f>
		if(!f.isDirectory() && !f.mkdirs())
	//*  19   37:aload_0         
	//*  20   38:getfield        #66  <Field File f>
	//*  21   41:invokevirtual   #70  <Method boolean File.isDirectory()>
	//*  22   44:ifne            105
	//*  23   47:aload_0         
	//*  24   48:getfield        #66  <Field File f>
	//*  25   51:invokevirtual   #73  <Method boolean File.mkdirs()>
	//*  26   54:ifne            105
		{
			add = ((add) (String.valueOf(((Object) (f.getAbsolutePath())))));
	//   27   57:aload_0         
	//   28   58:getfield        #66  <Field File f>
	//   29   61:invokevirtual   #77  <Method String File.getAbsolutePath()>
	//   30   64:invokestatic    #83  <Method String String.valueOf(Object)>
	//   31   67:astore_1        
			if(((String) (add)).length() != 0)
	//*  32   68:aload_1         
	//*  33   69:invokevirtual   #87  <Method int String.length()>
	//*  34   72:ifeq            85
				add = ((add) ("Could not create preload cache directory at ".concat(((String) (add)))));
	//   35   75:ldc1            #89  <String "Could not create preload cache directory at ">
	//   36   77:aload_1         
	//   37   78:invokevirtual   #93  <Method String String.concat(String)>
	//   38   81:astore_1        
			else
	//*  39   82:goto            95
				add = ((add) (new String("Could not create preload cache directory at ")));
	//   40   85:new             #79  <Class String>
	//   41   88:dup             
	//   42   89:ldc1            #89  <String "Could not create preload cache directory at ">
	//   43   91:invokespecial   #94  <Method void String(String)>
	//   44   94:astore_1        
			wx.e(((String) (add)));
	//   45   95:aload_1         
	//   46   96:invokestatic    #57  <Method void wx.e(String)>
			f = null;
	//   47   99:aload_0         
	//   48  100:aconst_null     
	//   49  101:putfield        #66  <Field File f>
			return;
	//   50  104:return          
		}
		if(f.setReadable(true, false) && f.setExecutable(true, false))
	//*  51  105:aload_0         
	//*  52  106:getfield        #66  <Field File f>
	//*  53  109:iconst_1        
	//*  54  110:iconst_0        
	//*  55  111:invokevirtual   #98  <Method boolean File.setReadable(boolean, boolean)>
	//*  56  114:ifeq            133
	//*  57  117:aload_0         
	//*  58  118:getfield        #66  <Field File f>
	//*  59  121:iconst_1        
	//*  60  122:iconst_0        
	//*  61  123:invokevirtual   #101 <Method boolean File.setExecutable(boolean, boolean)>
	//*  62  126:ifne            132
	//*  63  129:goto            133
			return;
	//   64  132:return          
		add = ((add) (String.valueOf(((Object) (f.getAbsolutePath())))));
	//   65  133:aload_0         
	//   66  134:getfield        #66  <Field File f>
	//   67  137:invokevirtual   #77  <Method String File.getAbsolutePath()>
	//   68  140:invokestatic    #83  <Method String String.valueOf(Object)>
	//   69  143:astore_1        
		if(((String) (add)).length() != 0)
	//*  70  144:aload_1         
	//*  71  145:invokevirtual   #87  <Method int String.length()>
	//*  72  148:ifeq            161
			add = ((add) ("Could not set cache file permissions at ".concat(((String) (add)))));
	//   73  151:ldc1            #103 <String "Could not set cache file permissions at ">
	//   74  153:aload_1         
	//   75  154:invokevirtual   #93  <Method String String.concat(String)>
	//   76  157:astore_1        
		else
	//*  77  158:goto            171
			add = ((add) (new String("Could not set cache file permissions at ")));
	//   78  161:new             #79  <Class String>
	//   79  164:dup             
	//   80  165:ldc1            #103 <String "Could not set cache file permissions at ">
	//   81  167:invokespecial   #94  <Method void String(String)>
	//   82  170:astore_1        
		wx.e(((String) (add)));
	//   83  171:aload_1         
	//   84  172:invokestatic    #57  <Method void wx.e(String)>
		f = null;
	//   85  175:aload_0         
	//   86  176:aconst_null     
	//   87  177:putfield        #66  <Field File f>
	//   88  180:return          
	}

	private final File a(File file)
	{
		return new File(f, String.valueOf(((Object) (file.getName()))).concat(".done"));
	//    0    0:new             #59  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field File f>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #107 <Method String File.getName()>
	//    6   12:invokestatic    #83  <Method String String.valueOf(Object)>
	//    7   15:ldc1            #109 <String ".done">
	//    8   17:invokevirtual   #93  <Method String String.concat(String)>
	//    9   20:invokespecial   #64  <Method void File(File, String)>
	//   10   23:areturn         
	}

	public final boolean a(String s)
	{
		throw new Runtime("d2j fail translate: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.genRegGraph(UnSSATransformer.java:344)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:276)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #112 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #114 <String "d2j fail translate: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.genRegGraph(UnSSATransformer.java:344)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:276)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #117 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public final void b()
	{
		g = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #120 <Field boolean g>
	//    3    5:return          
	}

	private static final Set d = Collections.synchronizedSet(((Set) (new HashSet())));
	private static final DecimalFormat e = new DecimalFormat("#,###");
	private File f;
	private boolean g;

	static 
	{
	//    0    0:new             #17  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void HashSet()>
	//    3    7:invokestatic    #26  <Method Set Collections.synchronizedSet(Set)>
	//    4   10:putstatic       #28  <Field Set d>
	//    5   13:new             #30  <Class DecimalFormat>
	//    6   16:dup             
	//    7   17:ldc1            #32  <String "#,###">
	//    8   19:invokespecial   #35  <Method void DecimalFormat(String)>
	//    9   22:putstatic       #37  <Field DecimalFormat e>
	//*  10   25:return          
	}
}
