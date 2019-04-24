// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.sift;


// Referenced classes of package ch.qos.logback.core.sift:
//			AbstractDiscriminator

public class DefaultDiscriminator extends AbstractDiscriminator
{

	public DefaultDiscriminator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AbstractDiscriminator()>
	//    2    4:return          
	}

	public String getDiscriminatingValue(Object obj)
	{
		return "default";
	//    0    0:ldc1            #9   <String "default">
	//    1    2:areturn         
	}

	public String getKey()
	{
		return "default";
	//    0    0:ldc1            #9   <String "default">
	//    1    2:areturn         
	}

	public static final String DEFAULT = "default";
}
