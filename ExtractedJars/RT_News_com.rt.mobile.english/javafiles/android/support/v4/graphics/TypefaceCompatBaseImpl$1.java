// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;


// Referenced classes of package android.support.v4.graphics:
//			TypefaceCompatBaseImpl

class TypefaceCompatBaseImpl$1
	implements yleExtractor
{

	public int getWeight(android.support.v4.provider.nfo nfo)
	{
		return nfo.getWeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method int android.support.v4.provider.FontsContractCompat$FontInfo.getWeight()>
	//    2    4:ireturn         
	}

	public volatile int getWeight(Object obj)
	{
		return getWeight((android.support.v4.provider.nfo)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class android.support.v4.provider.FontsContractCompat$FontInfo>
	//    3    5:invokevirtual   #32  <Method int getWeight(android.support.v4.provider.FontsContractCompat$FontInfo)>
	//    4    8:ireturn         
	}

	public boolean isItalic(android.support.v4.provider.nfo nfo)
	{
		return nfo.isItalic();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method boolean android.support.v4.provider.FontsContractCompat$FontInfo.isItalic()>
	//    2    4:ireturn         
	}

	public volatile boolean isItalic(Object obj)
	{
		return isItalic((android.support.v4.provider.nfo)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class android.support.v4.provider.FontsContractCompat$FontInfo>
	//    3    5:invokevirtual   #40  <Method boolean isItalic(android.support.v4.provider.FontsContractCompat$FontInfo)>
	//    4    8:ireturn         
	}

	final TypefaceCompatBaseImpl this$0;

	TypefaceCompatBaseImpl$1()
	{
		this$0 = TypefaceCompatBaseImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field TypefaceCompatBaseImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
