// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzro, zzane, zzacm, zzakb, 
//			zzol

public final class zzok
	implements android.view.View.OnClickListener
{

	public zzok(zzacm zzacm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		zzaad = zzacm1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field zzacm zzaad>
	//    5    9:return          
	}

	static zzro zza(zzok zzok1)
	{
		return zzok1.zzbhm;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzro zzbhm>
	//    2    4:areturn         
	}

	private final void zzjx()
	{
		zzbho = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #38  <Field String zzbho>
		zzbhp = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #40  <Field Long zzbhp>
		if(zzbhq == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #42  <Field WeakReference zzbhq>
	//*   8   14:ifnonnull       18
			return;
	//    9   17:return          
		View view = (View)zzbhq.get();
	//   10   18:aload_0         
	//   11   19:getfield        #42  <Field WeakReference zzbhq>
	//   12   22:invokevirtual   #48  <Method Object WeakReference.get()>
	//   13   25:checkcast       #50  <Class View>
	//   14   28:astore_1        
		zzbhq = null;
	//   15   29:aload_0         
	//   16   30:aconst_null     
	//   17   31:putfield        #42  <Field WeakReference zzbhq>
		if(view == null)
	//*  18   34:aload_1         
	//*  19   35:ifnonnull       39
		{
			return;
	//   20   38:return          
		} else
		{
			view.setClickable(false);
	//   21   39:aload_1         
	//   22   40:iconst_0        
	//   23   41:invokevirtual   #54  <Method void View.setClickable(boolean)>
			view.setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   24   44:aload_1         
	//   25   45:aconst_null     
	//   26   46:invokevirtual   #58  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   27   49:return          
		}
	}

	public final void cancelUnconfirmedClick()
	{
		if(zzbhm == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field zzro zzbhm>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(zzbhp == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #40  <Field Long zzbhp>
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		zzjx();
	//    8   16:aload_0         
	//    9   17:invokespecial   #63  <Method void zzjx()>
		try
		{
			zzbhm.onUnconfirmedClickCancelled();
	//   10   20:aload_0         
	//   11   21:getfield        #35  <Field zzro zzbhm>
	//   12   24:invokeinterface #68  <Method void zzro.onUnconfirmedClickCancelled()>
			return;
	//   13   29:return          
		}
		catch(RemoteException remoteexception)
	//*  14   30:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   15   31:ldc1            #70  <String "#007 Could not call remote method.">
	//   16   33:aload_1         
	//   17   34:invokestatic    #76  <Method void zzane.zzd(String, Throwable)>
		}
	//   18   37:return          
	}

	public final void onClick(View view)
	{
		if(zzbhq != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field WeakReference zzbhq>
	//*   2    4:ifnull          113
		{
			if(zzbhq.get() != view)
	//*   3    7:aload_0         
	//*   4    8:getfield        #42  <Field WeakReference zzbhq>
	//*   5   11:invokevirtual   #48  <Method Object WeakReference.get()>
	//*   6   14:aload_1         
	//*   7   15:if_acmpeq       19
				return;
	//    8   18:return          
			if(zzbho != null && zzbhp != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #38  <Field String zzbho>
	//*  11   23:ifnull          109
	//*  12   26:aload_0         
	//*  13   27:getfield        #40  <Field Long zzbhp>
	//*  14   30:ifnonnull       36
	//*  15   33:goto            109
			{
				view = ((View) (new JSONObject()));
	//   16   36:new             #82  <Class JSONObject>
	//   17   39:dup             
	//   18   40:invokespecial   #83  <Method void JSONObject()>
	//   19   43:astore_1        
				try
				{
					((JSONObject) (view)).put("id", ((Object) (zzbho)));
	//   20   44:aload_1         
	//   21   45:ldc1            #85  <String "id">
	//   22   47:aload_0         
	//   23   48:getfield        #38  <Field String zzbho>
	//   24   51:invokevirtual   #89  <Method JSONObject JSONObject.put(String, Object)>
	//   25   54:pop             
					((JSONObject) (view)).put("time_interval", zzbv.zzer().currentTimeMillis() - zzbhp.longValue());
	//   26   55:aload_1         
	//   27   56:ldc1            #91  <String "time_interval">
	//   28   58:invokestatic    #97  <Method Clock zzbv.zzer()>
	//   29   61:invokeinterface #103 <Method long Clock.currentTimeMillis()>
	//   30   66:aload_0         
	//   31   67:getfield        #40  <Field Long zzbhp>
	//   32   70:invokevirtual   #108 <Method long Long.longValue()>
	//   33   73:lsub            
	//   34   74:invokevirtual   #111 <Method JSONObject JSONObject.put(String, long)>
	//   35   77:pop             
					((JSONObject) (view)).put("messageType", "onePointFiveClick");
	//   36   78:aload_1         
	//   37   79:ldc1            #113 <String "messageType">
	//   38   81:ldc1            #115 <String "onePointFiveClick">
	//   39   83:invokevirtual   #89  <Method JSONObject JSONObject.put(String, Object)>
	//   40   86:pop             
					zzaad.zza("sendMessageToNativeJs", ((JSONObject) (view)));
	//   41   87:aload_0         
	//   42   88:getfield        #30  <Field zzacm zzaad>
	//   43   91:ldc1            #117 <String "sendMessageToNativeJs">
	//   44   93:aload_1         
	//   45   94:invokeinterface #122 <Method void zzacm.zza(String, JSONObject)>
				}
	//*  46   99:goto            109
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  47  102:astore_1        
				{
					zzakb.zzb("Unable to dispatch sendMessageToNativeJs event", ((Throwable) (view)));
	//   48  103:ldc1            #124 <String "Unable to dispatch sendMessageToNativeJs event">
	//   49  105:aload_1         
	//   50  106:invokestatic    #129 <Method void zzakb.zzb(String, Throwable)>
				}
			}
			zzjx();
	//   51  109:aload_0         
	//   52  110:invokespecial   #63  <Method void zzjx()>
		}
	//   53  113:return          
	}

	public final void zza(zzro zzro1)
	{
		zzbhm = zzro1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field zzro zzbhm>
		if(zzbhn != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #132 <Field zzv zzbhn>
	//*   5    9:ifnull          27
			zzaad.zzb("/unconfirmedClick", zzbhn);
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field zzacm zzaad>
	//    8   16:ldc1            #134 <String "/unconfirmedClick">
	//    9   18:aload_0         
	//   10   19:getfield        #132 <Field zzv zzbhn>
	//   11   22:invokeinterface #137 <Method void zzacm.zzb(String, zzv)>
		zzbhn = ((zzv) (new zzol(this)));
	//   12   27:aload_0         
	//   13   28:new             #139 <Class zzol>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:invokespecial   #142 <Method void zzol(zzok)>
	//   17   36:putfield        #132 <Field zzv zzbhn>
		zzaad.zza("/unconfirmedClick", zzbhn);
	//   18   39:aload_0         
	//   19   40:getfield        #30  <Field zzacm zzaad>
	//   20   43:ldc1            #134 <String "/unconfirmedClick">
	//   21   45:aload_0         
	//   22   46:getfield        #132 <Field zzv zzbhn>
	//   23   49:invokeinterface #144 <Method void zzacm.zza(String, zzv)>
	//   24   54:return          
	}

	public final zzro zzjw()
	{
		return zzbhm;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzro zzbhm>
	//    2    4:areturn         
	}

	private final zzacm zzaad;
	private zzro zzbhm;
	private zzv zzbhn;
	String zzbho;
	Long zzbhp;
	WeakReference zzbhq;
}
