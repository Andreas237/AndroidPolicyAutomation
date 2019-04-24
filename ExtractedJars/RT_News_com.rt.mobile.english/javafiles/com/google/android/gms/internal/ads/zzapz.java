// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqa

public final class zzapz
	implements android.media.AudioManager.OnAudioFocusChangeListener
{

	public zzapz(Context context, zzaqa zzaqa1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzdat = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #27  <Field float zzdat>
		mAudioManager = (AudioManager)context.getSystemService("audio");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #29  <String "audio">
	//    8   13:invokevirtual   #35  <Method Object Context.getSystemService(String)>
	//    9   16:checkcast       #37  <Class AudioManager>
	//   10   19:putfield        #39  <Field AudioManager mAudioManager>
		zzdaq = zzaqa1;
	//   11   22:aload_0         
	//   12   23:aload_2         
	//   13   24:putfield        #41  <Field zzaqa zzdaq>
	//   14   27:return          
	}

	private final void zztw()
	{
		boolean flag4 = zzcxs;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean zzcxs>
	//    2    4:istore          4
		boolean flag3 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag1 = false;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		boolean flag;
		if(flag4 && !zzdas && zzdat > 0.0F)
	//*   7   10:iload           4
	//*   8   12:ifeq            36
	//*   9   15:aload_0         
	//*  10   16:getfield        #47  <Field boolean zzdas>
	//*  11   19:ifne            36
	//*  12   22:aload_0         
	//*  13   23:getfield        #27  <Field float zzdat>
	//*  14   26:fconst_0        
	//*  15   27:fcmpl           
	//*  16   28:ifle            36
			flag = true;
	//   17   31:iconst_1        
	//   18   32:istore_1        
		else
	//*  19   33:goto            38
			flag = false;
	//   20   36:iconst_0        
	//   21   37:istore_1        
		if(flag && !zzdar)
	//*  22   38:iload_1         
	//*  23   39:ifeq            97
	//*  24   42:aload_0         
	//*  25   43:getfield        #49  <Field boolean zzdar>
	//*  26   46:ifne            97
		{
			if(mAudioManager != null && !zzdar)
	//*  27   49:aload_0         
	//*  28   50:getfield        #39  <Field AudioManager mAudioManager>
	//*  29   53:ifnull          87
	//*  30   56:aload_0         
	//*  31   57:getfield        #49  <Field boolean zzdar>
	//*  32   60:ifeq            66
	//*  33   63:goto            87
			{
				if(mAudioManager.requestAudioFocus(((android.media.AudioManager.OnAudioFocusChangeListener) (this)), 3, 2) == 1)
	//*  34   66:aload_0         
	//*  35   67:getfield        #39  <Field AudioManager mAudioManager>
	//*  36   70:aload_0         
	//*  37   71:iconst_3        
	//*  38   72:iconst_2        
	//*  39   73:invokevirtual   #53  <Method int AudioManager.requestAudioFocus(android.media.AudioManager$OnAudioFocusChangeListener, int, int)>
	//*  40   76:iconst_1        
	//*  41   77:icmpne          82
					flag1 = true;
	//   42   80:iconst_1        
	//   43   81:istore_2        
				zzdar = flag1;
	//   44   82:aload_0         
	//   45   83:iload_2         
	//   46   84:putfield        #49  <Field boolean zzdar>
			}
			zzdaq.zzst();
	//   47   87:aload_0         
	//   48   88:getfield        #41  <Field zzaqa zzdaq>
	//   49   91:invokeinterface #58  <Method void zzaqa.zzst()>
			return;
	//   50   96:return          
		}
		if(!flag && zzdar)
	//*  51   97:iload_1         
	//*  52   98:ifne            154
	//*  53  101:aload_0         
	//*  54  102:getfield        #49  <Field boolean zzdar>
	//*  55  105:ifeq            154
		{
			if(mAudioManager != null && zzdar)
	//*  56  108:aload_0         
	//*  57  109:getfield        #39  <Field AudioManager mAudioManager>
	//*  58  112:ifnull          145
	//*  59  115:aload_0         
	//*  60  116:getfield        #49  <Field boolean zzdar>
	//*  61  119:ifne            125
	//*  62  122:goto            145
			{
				boolean flag2 = flag3;
	//   63  125:iload_3         
	//   64  126:istore_2        
				if(mAudioManager.abandonAudioFocus(((android.media.AudioManager.OnAudioFocusChangeListener) (this))) == 0)
	//*  65  127:aload_0         
	//*  66  128:getfield        #39  <Field AudioManager mAudioManager>
	//*  67  131:aload_0         
	//*  68  132:invokevirtual   #62  <Method int AudioManager.abandonAudioFocus(android.media.AudioManager$OnAudioFocusChangeListener)>
	//*  69  135:ifne            140
					flag2 = true;
	//   70  138:iconst_1        
	//   71  139:istore_2        
				zzdar = flag2;
	//   72  140:aload_0         
	//   73  141:iload_2         
	//   74  142:putfield        #49  <Field boolean zzdar>
			}
			zzdaq.zzst();
	//   75  145:aload_0         
	//   76  146:getfield        #41  <Field zzaqa zzdaq>
	//   77  149:invokeinterface #58  <Method void zzaqa.zzst()>
		}
	//   78  154:return          
	}

	public final float getVolume()
	{
		float f;
		if(zzdas)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean zzdas>
	//*   2    4:ifeq            12
			f = 0.0F;
	//    3    7:fconst_0        
	//    4    8:fstore_1        
		else
	//*   5    9:goto            17
			f = zzdat;
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field float zzdat>
	//    8   16:fstore_1        
		if(zzdar)
	//*   9   17:aload_0         
	//*  10   18:getfield        #49  <Field boolean zzdar>
	//*  11   21:ifeq            26
			return f;
	//   12   24:fload_1         
	//   13   25:freturn         
		else
			return 0.0F;
	//   14   26:fconst_0        
	//   15   27:freturn         
	}

	public final void onAudioFocusChange(int i)
	{
		boolean flag;
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		zzdar = flag;
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:putfield        #49  <Field boolean zzdar>
		zzdaq.zzst();
	//   10   16:aload_0         
	//   11   17:getfield        #41  <Field zzaqa zzdaq>
	//   12   20:invokeinterface #58  <Method void zzaqa.zzst()>
	//   13   25:return          
	}

	public final void setMuted(boolean flag)
	{
		zzdas = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field boolean zzdas>
		zztw();
	//    3    5:aload_0         
	//    4    6:invokespecial   #70  <Method void zztw()>
	//    5    9:return          
	}

	public final void setVolume(float f)
	{
		zzdat = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #27  <Field float zzdat>
		zztw();
	//    3    5:aload_0         
	//    4    6:invokespecial   #70  <Method void zztw()>
	//    5    9:return          
	}

	public final void zztt()
	{
		zzcxs = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #45  <Field boolean zzcxs>
		zztw();
	//    3    5:aload_0         
	//    4    6:invokespecial   #70  <Method void zztw()>
	//    5    9:return          
	}

	public final void zztu()
	{
		zzcxs = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #45  <Field boolean zzcxs>
		zztw();
	//    3    5:aload_0         
	//    4    6:invokespecial   #70  <Method void zztw()>
	//    5    9:return          
	}

	private final AudioManager mAudioManager;
	private boolean zzcxs;
	private final zzaqa zzdaq;
	private boolean zzdar;
	private boolean zzdas;
	private float zzdat;
}
