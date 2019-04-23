// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

// Referenced classes of package com.google.android.gms.internal.ads:
//			adi

public final class adh
	implements android.media.AudioManager.OnAudioFocusChangeListener
{

	public adh(Context context, adi adi1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		f = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #27  <Field float f>
		a = (AudioManager)context.getSystemService("audio");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #29  <String "audio">
	//    8   13:invokevirtual   #35  <Method Object Context.getSystemService(String)>
	//    9   16:checkcast       #37  <Class AudioManager>
	//   10   19:putfield        #39  <Field AudioManager a>
		b = adi1;
	//   11   22:aload_0         
	//   12   23:aload_2         
	//   13   24:putfield        #41  <Field adi b>
	//   14   27:return          
	}

	private final void d()
	{
		boolean flag4 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean d>
	//    2    4:istore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		boolean flag2 = false;
	//    5    8:iconst_0        
	//    6    9:istore_3        
		boolean flag;
		if(flag4 && !e && f > 0.0F)
	//*   7   10:iload           4
	//*   8   12:ifeq            36
	//*   9   15:aload_0         
	//*  10   16:getfield        #46  <Field boolean e>
	//*  11   19:ifne            36
	//*  12   22:aload_0         
	//*  13   23:getfield        #27  <Field float f>
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
		if(flag)
	//*  22   38:iload_1         
	//*  23   39:ifeq            103
		{
			boolean flag5 = c;
	//   24   42:aload_0         
	//   25   43:getfield        #48  <Field boolean c>
	//   26   46:istore          4
			if(!flag5)
	//*  27   48:iload           4
	//*  28   50:ifne            103
			{
				AudioManager audiomanager = a;
	//   29   53:aload_0         
	//   30   54:getfield        #39  <Field AudioManager a>
	//   31   57:astore          5
				if(audiomanager != null && !flag5)
	//*  32   59:aload           5
	//*  33   61:ifnull          93
	//*  34   64:iload           4
	//*  35   66:ifeq            72
	//*  36   69:goto            93
				{
					flag1 = flag2;
	//   37   72:iload_3         
	//   38   73:istore_2        
					if(audiomanager.requestAudioFocus(((android.media.AudioManager.OnAudioFocusChangeListener) (this)), 3, 2) == 1)
	//*  39   74:aload           5
	//*  40   76:aload_0         
	//*  41   77:iconst_3        
	//*  42   78:iconst_2        
	//*  43   79:invokevirtual   #52  <Method int AudioManager.requestAudioFocus(android.media.AudioManager$OnAudioFocusChangeListener, int, int)>
	//*  44   82:iconst_1        
	//*  45   83:icmpne          88
						flag1 = true;
	//   46   86:iconst_1        
	//   47   87:istore_2        
					c = flag1;
	//   48   88:aload_0         
	//   49   89:iload_2         
	//   50   90:putfield        #48  <Field boolean c>
				}
				b.e();
	//   51   93:aload_0         
	//   52   94:getfield        #41  <Field adi b>
	//   53   97:invokeinterface #56  <Method void adi.e()>
				return;
	//   54  102:return          
			}
		}
		if(!flag)
	//*  55  103:iload_1         
	//*  56  104:ifne            159
		{
			boolean flag3 = c;
	//   57  107:aload_0         
	//   58  108:getfield        #48  <Field boolean c>
	//   59  111:istore_3        
			if(flag3)
	//*  60  112:iload_3         
	//*  61  113:ifeq            159
			{
				AudioManager audiomanager1 = a;
	//   62  116:aload_0         
	//   63  117:getfield        #39  <Field AudioManager a>
	//   64  120:astore          5
				if(audiomanager1 != null && flag3)
	//*  65  122:aload           5
	//*  66  124:ifnull          150
	//*  67  127:iload_3         
	//*  68  128:ifne            134
	//*  69  131:goto            150
				{
					if(audiomanager1.abandonAudioFocus(((android.media.AudioManager.OnAudioFocusChangeListener) (this))) == 0)
	//*  70  134:aload           5
	//*  71  136:aload_0         
	//*  72  137:invokevirtual   #60  <Method int AudioManager.abandonAudioFocus(android.media.AudioManager$OnAudioFocusChangeListener)>
	//*  73  140:ifne            145
						flag1 = true;
	//   74  143:iconst_1        
	//   75  144:istore_2        
					c = flag1;
	//   76  145:aload_0         
	//   77  146:iload_2         
	//   78  147:putfield        #48  <Field boolean c>
				}
				b.e();
	//   79  150:aload_0         
	//   80  151:getfield        #41  <Field adi b>
	//   81  154:invokeinterface #56  <Method void adi.e()>
			}
		}
	//   82  159:return          
	}

	public final float a()
	{
		float f1;
		if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean e>
	//*   2    4:ifeq            12
			f1 = 0.0F;
	//    3    7:fconst_0        
	//    4    8:fstore_1        
		else
	//*   5    9:goto            17
			f1 = f;
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field float f>
	//    8   16:fstore_1        
		if(c)
	//*   9   17:aload_0         
	//*  10   18:getfield        #48  <Field boolean c>
	//*  11   21:ifeq            26
			return f1;
	//   12   24:fload_1         
	//   13   25:freturn         
		else
			return 0.0F;
	//   14   26:fconst_0        
	//   15   27:freturn         
	}

	public final void a(float f1)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #27  <Field float f>
		d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #64  <Method void d()>
	//    5    9:return          
	}

	public final void a(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field boolean e>
		d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #64  <Method void d()>
	//    5    9:return          
	}

	public final void b()
	{
		d = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #44  <Field boolean d>
		d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #64  <Method void d()>
	//    5    9:return          
	}

	public final void c()
	{
		d = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #44  <Field boolean d>
		d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #64  <Method void d()>
	//    5    9:return          
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
		c = flag;
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:putfield        #48  <Field boolean c>
		b.e();
	//   10   16:aload_0         
	//   11   17:getfield        #41  <Field adi b>
	//   12   20:invokeinterface #56  <Method void adi.e()>
	//   13   25:return          
	}

	private final AudioManager a;
	private final adi b;
	private boolean c;
	private boolean d;
	private boolean e;
	private float f;
}
