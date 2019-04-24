// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityInfo;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzn

static class zzn$zzb
	implements com.google.android.gms.wearable.tyApi.CapabilityListener
{

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #29  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #29  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((zzn$zzb)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzn$zzb>
	//   16   28:astore_1        
		if(!((Object) (zzbTL)).equals(((Object) (((zzn$zzb) (obj)).zzbTL))))
	//*  17   29:aload_0         
	//*  18   30:getfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
	//*  19   33:aload_1         
	//*  20   34:getfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
	//*  21   37:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//*  22   40:ifne            45
			return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
		else
			return zzbTM.equals(((Object) (((zzn$zzb) (obj)).zzbTM)));
	//   25   45:aload_0         
	//   26   46:getfield        #22  <Field String zzbTM>
	//   27   49:aload_1         
	//   28   50:getfield        #22  <Field String zzbTM>
	//   29   53:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   30   56:ireturn         
	}

	public int hashCode()
	{
		return ((Object) (zzbTL)).hashCode() * 31 + zzbTM.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
	//    2    4:invokevirtual   #38  <Method int Object.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #22  <Field String zzbTM>
	//    7   14:invokevirtual   #39  <Method int String.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public void onCapabilityChanged(CapabilityInfo capabilityinfo)
	{
		zzbTL.onCapabilityChanged(capabilityinfo);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
	//    2    4:aload_1         
	//    3    5:invokeinterface #43  <Method void com.google.android.gms.wearable.CapabilityApi$CapabilityListener.onCapabilityChanged(CapabilityInfo)>
	//    4   10:return          
	}

	final com.google.android.gms.wearable.tyApi.CapabilityListener zzbTL;
	final String zzbTM;

	zzn$zzb(com.google.android.gms.wearable.tyApi.CapabilityListener capabilitylistener, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzbTL = capabilitylistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
		zzbTM = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String zzbTM>
	//    8   14:return          
	}
}
