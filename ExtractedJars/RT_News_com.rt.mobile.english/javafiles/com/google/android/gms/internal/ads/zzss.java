// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjn, zzxn, zzang

public final class zzss
{

	zzss(Context context, zzxn zzxn, zzang zzang, zzw zzw)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Context mContext>
		zzwh = zzxn;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field zzxn zzwh>
		zzyf = zzang;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field zzang zzyf>
		zzwc = zzw;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field zzw zzwc>
	//   14   25:return          
	}

	public final Context getApplicationContext()
	{
		return mContext.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context mContext>
	//    2    4:invokevirtual   #34  <Method Context Context.getApplicationContext()>
	//    3    7:areturn         
	}

	public final zzal zzav(String s)
	{
		return new zzal(mContext, new zzjn(), s, zzwh, zzyf, zzwc);
	//    0    0:new             #39  <Class zzal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Context mContext>
	//    4    8:new             #41  <Class zzjn>
	//    5   11:dup             
	//    6   12:invokespecial   #42  <Method void zzjn()>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field zzxn zzwh>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field zzang zzyf>
	//   12   24:aload_0         
	//   13   25:getfield        #27  <Field zzw zzwc>
	//   14   28:invokespecial   #45  <Method void zzal(Context, zzjn, String, zzxn, zzang, zzw)>
	//   15   31:areturn         
	}

	public final zzal zzaw(String s)
	{
		return new zzal(mContext.getApplicationContext(), new zzjn(), s, zzwh, zzyf, zzwc);
	//    0    0:new             #39  <Class zzal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Context mContext>
	//    4    8:invokevirtual   #34  <Method Context Context.getApplicationContext()>
	//    5   11:new             #41  <Class zzjn>
	//    6   14:dup             
	//    7   15:invokespecial   #42  <Method void zzjn()>
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #23  <Field zzxn zzwh>
	//   11   23:aload_0         
	//   12   24:getfield        #25  <Field zzang zzyf>
	//   13   27:aload_0         
	//   14   28:getfield        #27  <Field zzw zzwc>
	//   15   31:invokespecial   #45  <Method void zzal(Context, zzjn, String, zzxn, zzang, zzw)>
	//   16   34:areturn         
	}

	public final zzss zzlc()
	{
		return new zzss(mContext.getApplicationContext(), zzwh, zzyf, zzwc);
	//    0    0:new             #2   <Class zzss>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Context mContext>
	//    4    8:invokevirtual   #34  <Method Context Context.getApplicationContext()>
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field zzxn zzwh>
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field zzang zzyf>
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field zzw zzwc>
	//   11   23:invokespecial   #50  <Method void zzss(Context, zzxn, zzang, zzw)>
	//   12   26:areturn         
	}

	private final Context mContext;
	private final zzw zzwc;
	private final zzxn zzwh;
	private final zzang zzyf;
}
