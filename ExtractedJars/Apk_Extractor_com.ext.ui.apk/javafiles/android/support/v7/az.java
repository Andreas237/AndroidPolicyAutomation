// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.nio.charset.Charset;

// Referenced classes of package android.support.v7:
//			ae

public final class az
{

	private az()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
	//    2    4:return          
	}

	public static final Charset a;
	public static final Charset b;
	public static final Charset c;
	public static final Charset d;
	public static final Charset e;
	public static final Charset f;
	public static final az g = new az();

	static 
	{
	//    0    0:new             #2   <Class az>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void az()>
	//    3    7:putstatic       #21  <Field az g>
		Charset charset = Charset.forName("UTF-8");
	//    4   10:ldc1            #23  <String "UTF-8">
	//    5   12:invokestatic    #29  <Method Charset Charset.forName(String)>
	//    6   15:astore_0        
		ae.a(((Object) (charset)), "Charset.forName(\"UTF-8\")");
	//    7   16:aload_0         
	//    8   17:ldc1            #31  <String "Charset.forName(\"UTF-8\")">
	//    9   19:invokestatic    #36  <Method void ae.a(Object, String)>
		a = charset;
	//   10   22:aload_0         
	//   11   23:putstatic       #38  <Field Charset a>
		charset = Charset.forName("UTF-16");
	//   12   26:ldc1            #40  <String "UTF-16">
	//   13   28:invokestatic    #29  <Method Charset Charset.forName(String)>
	//   14   31:astore_0        
		ae.a(((Object) (charset)), "Charset.forName(\"UTF-16\")");
	//   15   32:aload_0         
	//   16   33:ldc1            #42  <String "Charset.forName(\"UTF-16\")">
	//   17   35:invokestatic    #36  <Method void ae.a(Object, String)>
		b = charset;
	//   18   38:aload_0         
	//   19   39:putstatic       #44  <Field Charset b>
		charset = Charset.forName("UTF-16BE");
	//   20   42:ldc1            #46  <String "UTF-16BE">
	//   21   44:invokestatic    #29  <Method Charset Charset.forName(String)>
	//   22   47:astore_0        
		ae.a(((Object) (charset)), "Charset.forName(\"UTF-16BE\")");
	//   23   48:aload_0         
	//   24   49:ldc1            #48  <String "Charset.forName(\"UTF-16BE\")">
	//   25   51:invokestatic    #36  <Method void ae.a(Object, String)>
		c = charset;
	//   26   54:aload_0         
	//   27   55:putstatic       #50  <Field Charset c>
		charset = Charset.forName("UTF-16LE");
	//   28   58:ldc1            #52  <String "UTF-16LE">
	//   29   60:invokestatic    #29  <Method Charset Charset.forName(String)>
	//   30   63:astore_0        
		ae.a(((Object) (charset)), "Charset.forName(\"UTF-16LE\")");
	//   31   64:aload_0         
	//   32   65:ldc1            #54  <String "Charset.forName(\"UTF-16LE\")">
	//   33   67:invokestatic    #36  <Method void ae.a(Object, String)>
		d = charset;
	//   34   70:aload_0         
	//   35   71:putstatic       #56  <Field Charset d>
		charset = Charset.forName("US-ASCII");
	//   36   74:ldc1            #58  <String "US-ASCII">
	//   37   76:invokestatic    #29  <Method Charset Charset.forName(String)>
	//   38   79:astore_0        
		ae.a(((Object) (charset)), "Charset.forName(\"US-ASCII\")");
	//   39   80:aload_0         
	//   40   81:ldc1            #60  <String "Charset.forName(\"US-ASCII\")">
	//   41   83:invokestatic    #36  <Method void ae.a(Object, String)>
		e = charset;
	//   42   86:aload_0         
	//   43   87:putstatic       #62  <Field Charset e>
		charset = Charset.forName("ISO-8859-1");
	//   44   90:ldc1            #64  <String "ISO-8859-1">
	//   45   92:invokestatic    #29  <Method Charset Charset.forName(String)>
	//   46   95:astore_0        
		ae.a(((Object) (charset)), "Charset.forName(\"ISO-8859-1\")");
	//   47   96:aload_0         
	//   48   97:ldc1            #66  <String "Charset.forName(\"ISO-8859-1\")">
	//   49   99:invokestatic    #36  <Method void ae.a(Object, String)>
		f = charset;
	//   50  102:aload_0         
	//   51  103:putstatic       #68  <Field Charset f>
	//*  52  106:return          
	}
}
