// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzps, zzane, zzpw, zzpy, 
//			zzpz

public final class zzpv extends com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
{

	public zzpv(zzps zzps1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo()>
		zzbhf = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field List zzbhf>
		zzbkk = zzps1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field zzps zzbkk>
		try
		{
			zzbkl = zzbkk.getText();
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #26  <Field zzps zzbkk>
	//   13   25:invokeinterface #32  <Method String zzps.getText()>
	//   14   30:putfield        #34  <Field String zzbkl>
		}
	//*  15   33:goto            49
		catch(RemoteException remoteexception)
	//*  16   36:astore_2        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//   17   37:ldc1            #36  <String "">
	//   18   39:aload_2         
	//   19   40:invokestatic    #42  <Method void zzane.zzb(String, Throwable)>
			zzbkl = "";
	//   20   43:aload_0         
	//   21   44:ldc1            #36  <String "">
	//   22   46:putfield        #34  <Field String zzbkl>
		}
		Iterator iterator = zzps1.zzjr().iterator();
	//   23   49:aload_1         
	//   24   50:invokeinterface #46  <Method List zzps.zzjr()>
	//   25   55:invokeinterface #52  <Method Iterator List.iterator()>
	//   26   60:astore_2        
_L7:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   27   61:aload_2         
	//   28   62:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   29   67:ifeq            154
_L1:
		zzps1 = ((zzps) (iterator.next()));
	//   30   70:aload_2         
	//   31   71:invokeinterface #62  <Method Object Iterator.next()>
	//   32   76:astore_1        
		if(!(zzps1 instanceof IBinder))
			break MISSING_BLOCK_LABEL_163;
	//   33   77:aload_1         
	//   34   78:instanceof      #64  <Class IBinder>
	//   35   81:ifeq            163
		zzps1 = ((zzps) ((IBinder)zzps1));
	//   36   84:aload_1         
	//   37   85:checkcast       #64  <Class IBinder>
	//   38   88:astore_1        
		if(zzps1 == null)
			break MISSING_BLOCK_LABEL_163;
	//   39   89:aload_1         
	//   40   90:ifnull          163
		android.os.IInterface iinterface = ((IBinder) (zzps1)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//   41   93:aload_1         
	//   42   94:ldc1            #66  <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//   43   96:invokeinterface #70  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   44  101:astore_3        
		if(!(iinterface instanceof zzpw)) goto _L4; else goto _L3
	//   45  102:aload_3         
	//   46  103:instanceof      #72  <Class zzpw>
	//   47  106:ifeq            117
_L3:
		zzps1 = ((zzps) ((zzpw)iinterface));
	//   48  109:aload_3         
	//   49  110:checkcast       #72  <Class zzpw>
	//   50  113:astore_1        
		  goto _L5
	//*  51  114:goto            129
_L4:
		try
		{
			zzps1 = ((zzps) (new zzpy(((IBinder) (zzps1)))));
	//   52  117:new             #74  <Class zzpy>
	//   53  120:dup             
	//   54  121:aload_1         
	//   55  122:invokespecial   #77  <Method void zzpy(IBinder)>
	//   56  125:astore_1        
		}
	//*  57  126:goto            129
	//*  58  129:aload_1         
	//*  59  130:ifnull          61
	//*  60  133:aload_0         
	//*  61  134:getfield        #24  <Field List zzbhf>
	//*  62  137:new             #79  <Class zzpz>
	//*  63  140:dup             
	//*  64  141:aload_1         
	//*  65  142:invokespecial   #82  <Method void zzpz(zzpw)>
	//*  66  145:invokeinterface #86  <Method boolean List.add(Object)>
	//*  67  150:pop             
	//*  68  151:goto            61
	//*  69  154:return          
		// Misplaced declaration of an exception variable
		catch(zzps zzps1)
	//*  70  155:astore_1        
		{
			zzane.zzb("", ((Throwable) (zzps1)));
	//   71  156:ldc1            #36  <String "">
	//   72  158:aload_1         
	//   73  159:invokestatic    #42  <Method void zzane.zzb(String, Throwable)>
			return;
	//   74  162:return          
		}
_L5:
		if(zzps1 == null) goto _L7; else goto _L6
_L6:
		zzbhf.add(((Object) (new zzpz(((zzpw) (zzps1))))));
		  goto _L7
_L2:
		return;
		zzps1 = null;
	//   75  163:aconst_null     
	//   76  164:astore_1        
		  goto _L5
	//*  77  165:goto            129
	}

	public final List getImages()
	{
		return zzbhf;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List zzbhf>
	//    2    4:areturn         
	}

	public final CharSequence getText()
	{
		return ((CharSequence) (zzbkl));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String zzbkl>
	//    2    4:areturn         
	}

	private final List zzbhf;
	private final zzps zzbkk;
	private String zzbkl;
}
