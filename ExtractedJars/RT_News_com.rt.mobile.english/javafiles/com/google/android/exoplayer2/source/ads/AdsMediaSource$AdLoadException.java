// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource

public static final class AdsMediaSource$AdLoadException extends IOException
{
	public static interface Type
		extends Annotation
	{
	}


	public static AdsMediaSource$AdLoadException createForAd(Exception exception)
	{
		return new AdsMediaSource$AdLoadException(0, exception);
	//    0    0:new             #2   <Class AdsMediaSource$AdLoadException>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:invokespecial   #32  <Method void AdsMediaSource$AdLoadException(int, Exception)>
	//    5    9:areturn         
	}

	public static AdsMediaSource$AdLoadException createForAdGroup(Exception exception, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Failed to load ad group ");
	//    4    8:aload_2         
	//    5    9:ldc1            #41  <String "Failed to load ad group ">
	//    6   11:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		return new AdsMediaSource$AdLoadException(1, ((Exception) (new IOException(stringbuilder.toString(), ((Throwable) (exception))))));
	//   12   21:new             #2   <Class AdsMediaSource$AdLoadException>
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:new             #4   <Class IOException>
	//   16   29:dup             
	//   17   30:aload_2         
	//   18   31:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   19   34:aload_0         
	//   20   35:invokespecial   #55  <Method void IOException(String, Throwable)>
	//   21   38:invokespecial   #32  <Method void AdsMediaSource$AdLoadException(int, Exception)>
	//   22   41:areturn         
	}

	public static AdsMediaSource$AdLoadException createForAllAds(Exception exception)
	{
		return new AdsMediaSource$AdLoadException(2, exception);
	//    0    0:new             #2   <Class AdsMediaSource$AdLoadException>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:aload_0         
	//    4    6:invokespecial   #32  <Method void AdsMediaSource$AdLoadException(int, Exception)>
	//    5    9:areturn         
	}

	public static AdsMediaSource$AdLoadException createForUnexpected(RuntimeException runtimeexception)
	{
		return new AdsMediaSource$AdLoadException(3, ((Exception) (runtimeexception)));
	//    0    0:new             #2   <Class AdsMediaSource$AdLoadException>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:aload_0         
	//    4    6:invokespecial   #32  <Method void AdsMediaSource$AdLoadException(int, Exception)>
	//    5    9:areturn         
	}

	public RuntimeException getRuntimeExceptionForUnexpected()
	{
		boolean flag;
		if(type == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int type>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Assertions.checkState(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #66  <Method void Assertions.checkState(boolean)>
		return (RuntimeException)getCause();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #70  <Method Throwable getCause()>
	//   13   23:checkcast       #72  <Class RuntimeException>
	//   14   26:areturn         
	}

	public static final int TYPE_AD = 0;
	public static final int TYPE_AD_GROUP = 1;
	public static final int TYPE_ALL_ADS = 2;
	public static final int TYPE_UNEXPECTED = 3;
	public final int type;

	private AdsMediaSource$AdLoadException(int i, Exception exception)
	{
		super(((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #25  <Method void IOException(Throwable)>
		type = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #27  <Field int type>
	//    6   10:return          
	}
}
