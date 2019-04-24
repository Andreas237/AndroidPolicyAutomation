// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;


class AdvertisingInfo
{

	AdvertisingInfo(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		advertisingId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String advertisingId>
		limitAdTrackingEnabled = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field boolean limitAdTrackingEnabled>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #24  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #24  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((AdvertisingInfo)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AdvertisingInfo>
	//   16   28:astore_1        
			if(limitAdTrackingEnabled != ((AdvertisingInfo) (obj)).limitAdTrackingEnabled)
	//*  17   29:aload_0         
	//*  18   30:getfield        #17  <Field boolean limitAdTrackingEnabled>
	//*  19   33:aload_1         
	//*  20   34:getfield        #17  <Field boolean limitAdTrackingEnabled>
	//*  21   37:icmpeq          42
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
			if(advertisingId == null ? ((AdvertisingInfo) (obj)).advertisingId != null : !advertisingId.equals(((Object) (((AdvertisingInfo) (obj)).advertisingId))))
	//*  24   42:aload_0         
	//*  25   43:getfield        #15  <Field String advertisingId>
	//*  26   46:ifnull          65
	//*  27   49:aload_0         
	//*  28   50:getfield        #15  <Field String advertisingId>
	//*  29   53:aload_1         
	//*  30   54:getfield        #15  <Field String advertisingId>
	//*  31   57:invokevirtual   #28  <Method boolean String.equals(Object)>
	//*  32   60:ifne            5
				return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
	//   35   65:aload_1         
	//   36   66:getfield        #15  <Field String advertisingId>
	//   37   69:ifnull          5
		}
		return true;
	//*  38   72:goto            63
	}

	public int hashCode()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		if(advertisingId != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #15  <Field String advertisingId>
	//*   4    6:ifnull          33
			i = advertisingId.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field String advertisingId>
	//    7   13:invokevirtual   #32  <Method int String.hashCode()>
	//    8   16:istore_1        
		else
	//*   9   17:aload_0         
	//*  10   18:getfield        #17  <Field boolean limitAdTrackingEnabled>
	//*  11   21:ifeq            26
	//*  12   24:iconst_1        
	//*  13   25:istore_2        
	//*  14   26:iload_1         
	//*  15   27:bipush          31
	//*  16   29:imul            
	//*  17   30:iload_2         
	//*  18   31:iadd            
	//*  19   32:ireturn         
			i = 0;
	//   20   33:iconst_0        
	//   21   34:istore_1        
		if(limitAdTrackingEnabled)
			j = 1;
		return i * 31 + j;
	//*  22   35:goto            17
	}

	public final String advertisingId;
	public final boolean limitAdTrackingEnabled;
}
