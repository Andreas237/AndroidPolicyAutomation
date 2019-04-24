// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package android.support.v7:
//			ae, ab

public final class ba
	implements Serializable
{
	public static final class a
	{

		private a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}

		public a(ab ab)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ba$a()>
		//    2    4:return          
		}
	}


	public ba(String s)
	{
		ae.b(((Object) (s)), "pattern");
	//    0    0:aload_1         
	//    1    1:ldc1            #25  <String "pattern">
	//    2    3:invokestatic    #30  <Method void ae.b(Object, String)>
		s = ((String) (Pattern.compile(s)));
	//    3    6:aload_1         
	//    4    7:invokestatic    #36  <Method Pattern Pattern.compile(String)>
	//    5   10:astore_1        
		ae.a(((Object) (s)), "Pattern.compile(pattern)");
	//    6   11:aload_1         
	//    7   12:ldc1            #38  <String "Pattern.compile(pattern)">
	//    8   14:invokestatic    #40  <Method void ae.a(Object, String)>
		this(((Pattern) (s)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #43  <Method void ba(Pattern)>
	//   12   22:return          
	}

	public ba(Pattern pattern)
	{
		ae.b(((Object) (pattern)), "nativePattern");
	//    0    0:aload_1         
	//    1    1:ldc1            #46  <String "nativePattern">
	//    2    3:invokestatic    #30  <Method void ae.b(Object, String)>
		super();
	//    3    6:aload_0         
	//    4    7:invokespecial   #48  <Method void Object()>
		b = pattern;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #50  <Field Pattern b>
	//    8   15:return          
	}

	public final boolean a(CharSequence charsequence)
	{
		ae.b(((Object) (charsequence)), "input");
	//    0    0:aload_1         
	//    1    1:ldc1            #53  <String "input">
	//    2    3:invokestatic    #30  <Method void ae.b(Object, String)>
		return b.matcher(charsequence).matches();
	//    3    6:aload_0         
	//    4    7:getfield        #50  <Field Pattern b>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #57  <Method Matcher Pattern.matcher(CharSequence)>
	//    7   14:invokevirtual   #63  <Method boolean Matcher.matches()>
	//    8   17:ireturn         
	}

	public String toString()
	{
		String s = b.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Pattern b>
	//    2    4:invokevirtual   #67  <Method String Pattern.toString()>
	//    3    7:astore_1        
		ae.a(((Object) (s)), "nativePattern.toString()");
	//    4    8:aload_1         
	//    5    9:ldc1            #69  <String "nativePattern.toString()">
	//    6   11:invokestatic    #40  <Method void ae.a(Object, String)>
		return s;
	//    7   14:aload_1         
	//    8   15:areturn         
	}

	public static final a a = new a(((ab) (null)));
	private final Pattern b;

	static 
	{
	//    0    0:new             #8   <Class ba$a>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #18  <Method void ba$a(ab)>
	//    4    8:putstatic       #20  <Field ba$a a>
	//*   5   11:return          
	}
}
