// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

// Referenced classes of package o:
//			eo

final class em
	implements FileFilter
{

	em(eo eo)
	{
		d = eo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field eo d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final boolean accept(File file)
	{
		return Pattern.matches("cpu[0-9]+", ((CharSequence) (file.getName())));
	//    0    0:ldc1            #20  <String "cpu[0-9]+">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #26  <Method String File.getName()>
	//    3    6:invokestatic    #32  <Method boolean Pattern.matches(String, CharSequence)>
	//    4    9:ifeq            14
	//    5   12:iconst_1        
	//    6   13:ireturn         
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	final eo d;
}
