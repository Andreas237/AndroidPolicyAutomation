// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzox, zzro

public interface zzoz
{

	public abstract void cancelUnconfirmedClick();

	public abstract Context getContext();

	public abstract void performClick(Bundle bundle);

	public abstract boolean recordImpression(Bundle bundle);

	public abstract void reportTouchEvent(Bundle bundle);

	public abstract void setClickConfirmingView(View view);

	public abstract View zza(android.view.View.OnClickListener onclicklistener, boolean flag);

	public abstract void zza(View view, zzox zzox);

	public abstract void zza(View view, String s, Bundle bundle, Map map, View view1);

	public abstract void zza(View view, Map map);

	public abstract void zza(View view, Map map, Bundle bundle, View view1);

	public abstract void zza(zzro zzro);

	public abstract void zzb(View view, Map map);

	public abstract void zzc(View view, Map map);

	public abstract void zzcr();

	public abstract void zzcs();

	public abstract void zzd(MotionEvent motionevent);

	public abstract void zzj(View view);

	public abstract boolean zzkj();

	public abstract boolean zzkk();

	public abstract void zzkl();

	public abstract void zzkp();

	public abstract void zzkq();

	public abstract View zzkr();

	public abstract void zzl(View view);
}
