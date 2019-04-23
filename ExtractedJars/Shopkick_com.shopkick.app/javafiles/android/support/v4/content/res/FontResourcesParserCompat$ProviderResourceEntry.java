// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import android.support.v4.provider.FontRequest;

// Referenced classes of package android.support.v4.content.res:
//			FontResourcesParserCompat

public static final class FontResourcesParserCompat$ProviderResourceEntry
	implements FontResourcesParserCompat.FamilyResourceEntry
{

	public int getFetchStrategy()
	{
		return mStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int mStrategy>
	//    2    4:ireturn         
	}

	public FontRequest getRequest()
	{
		return mRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field FontRequest mRequest>
	//    2    4:areturn         
	}

	public int getTimeout()
	{
		return mTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int mTimeoutMs>
	//    2    4:ireturn         
	}

	private final FontRequest mRequest;
	private final int mStrategy;
	private final int mTimeoutMs;

	public FontResourcesParserCompat$ProviderResourceEntry(FontRequest fontrequest, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mRequest = fontrequest;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field FontRequest mRequest>
		mStrategy = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int mStrategy>
		mTimeoutMs = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int mTimeoutMs>
	//   11   19:return          
	}
}
