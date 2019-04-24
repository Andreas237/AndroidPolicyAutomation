// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images.internal;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.common.images.internal:
//			zzb

public final class CrossFadingDrawable extends Drawable
	implements android.graphics.drawable.Drawable.Callback
{
	private static final class zza extends Drawable
	{

		static zza zzcp()
		{
			return zzqj;
		//    0    0:getstatic       #18  <Field CrossFadingDrawable$zza zzqj>
		//    1    3:areturn         
		}

		public final void draw(Canvas canvas)
		{
		//    0    0:return          
		}

		public final android.graphics.drawable.Drawable.ConstantState getConstantState()
		{
			return ((android.graphics.drawable.Drawable.ConstantState) (zzqk));
		//    0    0:getstatic       #25  <Field zzb zzqk>
		//    1    3:areturn         
		}

		public final int getOpacity()
		{
			return -2;
		//    0    0:bipush          -2
		//    1    2:ireturn         
		}

		public final void setAlpha(int i)
		{
		//    0    0:return          
		}

		public final void setColorFilter(ColorFilter colorfilter)
		{
		//    0    0:return          
		}

		private static final zza zzqj = new zza();
		private static final com.google.android.gms.common.images.internal.zzb zzqk = new com.google.android.gms.common.images.internal.zzb(((com.google.android.gms.common.images.internal.zza) (null)));

		static 
		{
		//    0    0:new             #2   <Class CrossFadingDrawable$zza>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void CrossFadingDrawable$zza()>
		//    3    7:putstatic       #18  <Field CrossFadingDrawable$zza zzqj>
		//    4   10:new             #20  <Class zzb>
		//    5   13:dup             
		//    6   14:aconst_null     
		//    7   15:invokespecial   #23  <Method void zzb(zza)>
		//    8   18:putstatic       #25  <Field zzb zzqk>
		//*   9   21:return          
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Drawable()>
		//    2    4:return          
		}
	}

	static final class zzb extends android.graphics.drawable.Drawable.ConstantState
	{

		public final int getChangingConfigurations()
		{
			return mChangingConfigurations;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int mChangingConfigurations>
		//    2    4:ireturn         
		}

		public final Drawable newDrawable()
		{
			return ((Drawable) (new CrossFadingDrawable(this)));
		//    0    0:new             #6   <Class CrossFadingDrawable>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #26  <Method void CrossFadingDrawable(CrossFadingDrawable$zzb)>
		//    4    8:areturn         
		}

		int mChangingConfigurations;
		int zzql;

		zzb(zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void android.graphics.drawable.Drawable$ConstantState()>
			if(zzb1 != null)
		//*   2    4:aload_1         
		//*   3    5:ifnull          24
			{
				mChangingConfigurations = zzb1.mChangingConfigurations;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #17  <Field int mChangingConfigurations>
		//    7   13:putfield        #17  <Field int mChangingConfigurations>
				zzql = zzb1.zzql;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #19  <Field int zzql>
		//   11   21:putfield        #19  <Field int zzql>
			}
		//   12   24:return          
		}
	}


	public CrossFadingDrawable(Drawable drawable, Drawable drawable1)
	{
		this(((zzb) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #38  <Method void CrossFadingDrawable(CrossFadingDrawable$zzb)>
		Object obj = ((Object) (drawable));
	//    3    5:aload_1         
	//    4    6:astore          4
		if(drawable == null)
	//*   5    8:aload_1         
	//*   6    9:ifnonnull       17
			obj = ((Object) (zza.zzcp()));
	//    7   12:invokestatic    #42  <Method CrossFadingDrawable$zza CrossFadingDrawable$zza.zzcp()>
	//    8   15:astore          4
		zzqd = ((Drawable) (obj));
	//    9   17:aload_0         
	//   10   18:aload           4
	//   11   20:putfield        #44  <Field Drawable zzqd>
		((Drawable) (obj)).setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   23:aload           4
	//   13   25:aload_0         
	//   14   26:invokevirtual   #48  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		drawable = ((Drawable) (zzqc));
	//   15   29:aload_0         
	//   16   30:getfield        #50  <Field CrossFadingDrawable$zzb zzqc>
	//   17   33:astore_1        
		int i = ((zzb) (drawable)).zzql;
	//   18   34:aload_1         
	//   19   35:getfield        #53  <Field int CrossFadingDrawable$zzb.zzql>
	//   20   38:istore_3        
		drawable.zzql = ((Drawable) (obj)).getChangingConfigurations() | i;
	//   21   39:aload_1         
	//   22   40:aload           4
	//   23   42:invokevirtual   #57  <Method int Drawable.getChangingConfigurations()>
	//   24   45:iload_3         
	//   25   46:ior             
	//   26   47:putfield        #53  <Field int CrossFadingDrawable$zzb.zzql>
		drawable = drawable1;
	//   27   50:aload_2         
	//   28   51:astore_1        
		if(drawable1 == null)
	//*  29   52:aload_2         
	//*  30   53:ifnonnull       60
			drawable = ((Drawable) (zza.zzcp()));
	//   31   56:invokestatic    #42  <Method CrossFadingDrawable$zza CrossFadingDrawable$zza.zzcp()>
	//   32   59:astore_1        
		zzqe = drawable;
	//   33   60:aload_0         
	//   34   61:aload_1         
	//   35   62:putfield        #59  <Field Drawable zzqe>
		drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   36   65:aload_1         
	//   37   66:aload_0         
	//   38   67:invokevirtual   #48  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		drawable1 = ((Drawable) (zzqc));
	//   39   70:aload_0         
	//   40   71:getfield        #50  <Field CrossFadingDrawable$zzb zzqc>
	//   41   74:astore_2        
		i = ((zzb) (drawable1)).zzql;
	//   42   75:aload_2         
	//   43   76:getfield        #53  <Field int CrossFadingDrawable$zzb.zzql>
	//   44   79:istore_3        
		drawable1.zzql = drawable.getChangingConfigurations() | i;
	//   45   80:aload_2         
	//   46   81:aload_1         
	//   47   82:invokevirtual   #57  <Method int Drawable.getChangingConfigurations()>
	//   48   85:iload_3         
	//   49   86:ior             
	//   50   87:putfield        #53  <Field int CrossFadingDrawable$zzb.zzql>
	//   51   90:return          
	}

	CrossFadingDrawable(zzb zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Drawable()>
		zzpw = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #65  <Field int zzpw>
		zzpz = 255;
	//    5    9:aload_0         
	//    6   10:sipush          255
	//    7   13:putfield        #67  <Field int zzpz>
		mAlpha = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #69  <Field int mAlpha>
		zzpl = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #71  <Field boolean zzpl>
		zzqc = new zzb(zzb1);
	//   14   26:aload_0         
	//   15   27:new             #11  <Class CrossFadingDrawable$zzb>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokespecial   #72  <Method void CrossFadingDrawable$zzb(CrossFadingDrawable$zzb)>
	//   19   35:putfield        #50  <Field CrossFadingDrawable$zzb zzqc>
	//   20   38:return          
	}

	public final boolean canConstantState()
	{
		if(!zzqf)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field boolean zzqf>
	//*   2    4:ifne            44
		{
			boolean flag;
			if(zzqd.getConstantState() != null && zzqe.getConstantState() != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #44  <Field Drawable zzqd>
	//*   5   11:invokevirtual   #80  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//*   6   14:ifnull          32
	//*   7   17:aload_0         
	//*   8   18:getfield        #59  <Field Drawable zzqe>
	//*   9   21:invokevirtual   #80  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//*  10   24:ifnull          32
				flag = true;
	//   11   27:iconst_1        
	//   12   28:istore_1        
			else
	//*  13   29:goto            34
				flag = false;
	//   14   32:iconst_0        
	//   15   33:istore_1        
			zzqg = flag;
	//   16   34:aload_0         
	//   17   35:iload_1         
	//   18   36:putfield        #82  <Field boolean zzqg>
			zzqf = true;
	//   19   39:aload_0         
	//   20   40:iconst_1        
	//   21   41:putfield        #76  <Field boolean zzqf>
		}
		return zzqg;
	//   22   44:aload_0         
	//   23   45:getfield        #82  <Field boolean zzqg>
	//   24   48:ireturn         
	}

	public final void draw(Canvas canvas)
	{
		int j = zzpw;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int zzpw>
	//    2    4:istore          5
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore_3        
		int i = 1;
	//    5    8:iconst_1        
	//    6    9:istore          4
		switch(j)
	//*   7   11:iload           5
		{
		default:
			break;

	//*   8   13:tableswitch     1 2: default 36
	//	               1 110
	//	               2 39
	//*   9   36:goto            124
		case 2: // '\002'
			if(zzpx >= 0L)
	//*  10   39:aload_0         
	//*  11   40:getfield        #86  <Field long zzpx>
	//*  12   43:lconst_0        
	//*  13   44:lcmp            
	//*  14   45:iflt            124
			{
				float f = (float)(SystemClock.uptimeMillis() - zzpx) / (float)zzqa;
	//   15   48:invokestatic    #92  <Method long SystemClock.uptimeMillis()>
	//   16   51:aload_0         
	//   17   52:getfield        #86  <Field long zzpx>
	//   18   55:lsub            
	//   19   56:l2f             
	//   20   57:aload_0         
	//   21   58:getfield        #94  <Field int zzqa>
	//   22   61:i2f             
	//   23   62:fdiv            
	//   24   63:fstore_2        
				if(f >= 1.0F)
	//*  25   64:fload_2         
	//*  26   65:fconst_1        
	//*  27   66:fcmpl           
	//*  28   67:iflt            76
					flag = ((boolean) (i));
	//   29   70:iload           4
	//   30   72:istore_3        
				else
	//*  31   73:goto            78
					flag = false;
	//   32   76:iconst_0        
	//   33   77:istore_3        
				if(flag)
	//*  34   78:iload_3         
	//*  35   79:ifeq            87
					zzpw = 0;
	//   36   82:aload_0         
	//   37   83:iconst_0        
	//   38   84:putfield        #65  <Field int zzpw>
				f = Math.min(f, 1.0F);
	//   39   87:fload_2         
	//   40   88:fconst_1        
	//   41   89:invokestatic    #100 <Method float Math.min(float, float)>
	//   42   92:fstore_2        
				mAlpha = (int)(0.0F + (float)zzpy * f);
	//   43   93:aload_0         
	//   44   94:fconst_0        
	//   45   95:aload_0         
	//   46   96:getfield        #102 <Field int zzpy>
	//   47   99:i2f             
	//   48  100:fload_2         
	//   49  101:fmul            
	//   50  102:fadd            
	//   51  103:f2i             
	//   52  104:putfield        #69  <Field int mAlpha>
			}
			break;

	//*  53  107:goto            124
		case 1: // '\001'
			zzpx = SystemClock.uptimeMillis();
	//   54  110:aload_0         
	//   55  111:invokestatic    #92  <Method long SystemClock.uptimeMillis()>
	//   56  114:putfield        #86  <Field long zzpx>
			zzpw = 2;
	//   57  117:aload_0         
	//   58  118:iconst_2        
	//   59  119:putfield        #65  <Field int zzpw>
			flag = false;
	//   60  122:iconst_0        
	//   61  123:istore_3        
			break;
		}
		i = mAlpha;
	//   62  124:aload_0         
	//   63  125:getfield        #69  <Field int mAlpha>
	//   64  128:istore          4
		boolean flag1 = zzpl;
	//   65  130:aload_0         
	//   66  131:getfield        #71  <Field boolean zzpl>
	//   67  134:istore          6
		Drawable drawable = zzqd;
	//   68  136:aload_0         
	//   69  137:getfield        #44  <Field Drawable zzqd>
	//   70  140:astore          7
		Drawable drawable1 = zzqe;
	//   71  142:aload_0         
	//   72  143:getfield        #59  <Field Drawable zzqe>
	//   73  146:astore          8
		if(flag)
	//*  74  148:iload_3         
	//*  75  149:ifeq            193
		{
			if(!flag1 || i == 0)
	//*  76  152:iload           6
	//*  77  154:ifeq            162
	//*  78  157:iload           4
	//*  79  159:ifne            168
				drawable.draw(canvas);
	//   80  162:aload           7
	//   81  164:aload_1         
	//   82  165:invokevirtual   #104 <Method void Drawable.draw(Canvas)>
			if(i == zzpz)
	//*  83  168:iload           4
	//*  84  170:aload_0         
	//*  85  171:getfield        #67  <Field int zzpz>
	//*  86  174:icmpne          192
			{
				drawable1.setAlpha(zzpz);
	//   87  177:aload           8
	//   88  179:aload_0         
	//   89  180:getfield        #67  <Field int zzpz>
	//   90  183:invokevirtual   #108 <Method void Drawable.setAlpha(int)>
				drawable1.draw(canvas);
	//   91  186:aload           8
	//   92  188:aload_1         
	//   93  189:invokevirtual   #104 <Method void Drawable.draw(Canvas)>
			}
			return;
	//   94  192:return          
		}
		if(flag1)
	//*  95  193:iload           6
	//*  96  195:ifeq            210
			drawable.setAlpha(zzpz - i);
	//   97  198:aload           7
	//   98  200:aload_0         
	//   99  201:getfield        #67  <Field int zzpz>
	//  100  204:iload           4
	//  101  206:isub            
	//  102  207:invokevirtual   #108 <Method void Drawable.setAlpha(int)>
		drawable.draw(canvas);
	//  103  210:aload           7
	//  104  212:aload_1         
	//  105  213:invokevirtual   #104 <Method void Drawable.draw(Canvas)>
		if(flag1)
	//* 106  216:iload           6
	//* 107  218:ifeq            230
			drawable.setAlpha(zzpz);
	//  108  221:aload           7
	//  109  223:aload_0         
	//  110  224:getfield        #67  <Field int zzpz>
	//  111  227:invokevirtual   #108 <Method void Drawable.setAlpha(int)>
		if(i > 0)
	//* 112  230:iload           4
	//* 113  232:ifle            257
		{
			drawable1.setAlpha(i);
	//  114  235:aload           8
	//  115  237:iload           4
	//  116  239:invokevirtual   #108 <Method void Drawable.setAlpha(int)>
			drawable1.draw(canvas);
	//  117  242:aload           8
	//  118  244:aload_1         
	//  119  245:invokevirtual   #104 <Method void Drawable.draw(Canvas)>
			drawable1.setAlpha(zzpz);
	//  120  248:aload           8
	//  121  250:aload_0         
	//  122  251:getfield        #67  <Field int zzpz>
	//  123  254:invokevirtual   #108 <Method void Drawable.setAlpha(int)>
		}
		invalidateSelf();
	//  124  257:aload_0         
	//  125  258:invokevirtual   #111 <Method void invalidateSelf()>
	//  126  261:return          
	}

	public final int getChangingConfigurations()
	{
		return super.getChangingConfigurations() | zzqc.mChangingConfigurations | zzqc.zzql;
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method int Drawable.getChangingConfigurations()>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field CrossFadingDrawable$zzb zzqc>
	//    4    8:getfield        #114 <Field int CrossFadingDrawable$zzb.mChangingConfigurations>
	//    5   11:ior             
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field CrossFadingDrawable$zzb zzqc>
	//    8   16:getfield        #53  <Field int CrossFadingDrawable$zzb.zzql>
	//    9   19:ior             
	//   10   20:ireturn         
	}

	public final android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(canConstantState())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #116 <Method boolean canConstantState()>
	//*   2    4:ifeq            23
		{
			zzqc.mChangingConfigurations = getChangingConfigurations();
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field CrossFadingDrawable$zzb zzqc>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #117 <Method int getChangingConfigurations()>
	//    7   15:putfield        #114 <Field int CrossFadingDrawable$zzb.mChangingConfigurations>
			return ((android.graphics.drawable.Drawable.ConstantState) (zzqc));
	//    8   18:aload_0         
	//    9   19:getfield        #50  <Field CrossFadingDrawable$zzb zzqc>
	//   10   22:areturn         
		} else
		{
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
		}
	}

	public final Drawable getEndDrawable()
	{
		return zzqe;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Drawable zzqe>
	//    2    4:areturn         
	}

	public final int getIntrinsicHeight()
	{
		return Math.max(zzqd.getIntrinsicHeight(), zzqe.getIntrinsicHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable zzqd>
	//    2    4:invokevirtual   #122 <Method int Drawable.getIntrinsicHeight()>
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field Drawable zzqe>
	//    5   11:invokevirtual   #122 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:invokestatic    #126 <Method int Math.max(int, int)>
	//    7   17:ireturn         
	}

	public final int getIntrinsicWidth()
	{
		return Math.max(zzqd.getIntrinsicWidth(), zzqe.getIntrinsicWidth());
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable zzqd>
	//    2    4:invokevirtual   #129 <Method int Drawable.getIntrinsicWidth()>
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field Drawable zzqe>
	//    5   11:invokevirtual   #129 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:invokestatic    #126 <Method int Math.max(int, int)>
	//    7   17:ireturn         
	}

	public final int getOpacity()
	{
		if(!zzqh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field boolean zzqh>
	//*   2    4:ifne            33
		{
			zzqi = Drawable.resolveOpacity(zzqd.getOpacity(), zzqe.getOpacity());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field Drawable zzqd>
	//    6   12:invokevirtual   #134 <Method int Drawable.getOpacity()>
	//    7   15:aload_0         
	//    8   16:getfield        #59  <Field Drawable zzqe>
	//    9   19:invokevirtual   #134 <Method int Drawable.getOpacity()>
	//   10   22:invokestatic    #137 <Method int Drawable.resolveOpacity(int, int)>
	//   11   25:putfield        #139 <Field int zzqi>
			zzqh = true;
	//   12   28:aload_0         
	//   13   29:iconst_1        
	//   14   30:putfield        #132 <Field boolean zzqh>
		}
		return zzqi;
	//   15   33:aload_0         
	//   16   34:getfield        #139 <Field int zzqi>
	//   17   37:ireturn         
	}

	public final Drawable getStartDrawable()
	{
		return zzqd;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable zzqd>
	//    2    4:areturn         
	}

	public final void invalidateDrawable(Drawable drawable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			((android.graphics.drawable.Drawable.Callback) (drawable)).invalidateDrawable(((Drawable) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #148 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(Drawable)>
	//    8   16:return          
	}

	public final Drawable mutate()
	{
		if(!zzqb && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field boolean zzqb>
	//*   2    4:ifne            53
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #153 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       53
		{
			if(!canConstantState())
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #116 <Method boolean canConstantState()>
	//*   9   19:ifne            32
				throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
	//   10   22:new             #155 <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc1            #157 <String "One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.">
	//   13   28:invokespecial   #160 <Method void IllegalStateException(String)>
	//   14   31:athrow          
			zzqd.mutate();
	//   15   32:aload_0         
	//   16   33:getfield        #44  <Field Drawable zzqd>
	//   17   36:invokevirtual   #153 <Method Drawable Drawable.mutate()>
	//   18   39:pop             
			zzqe.mutate();
	//   19   40:aload_0         
	//   20   41:getfield        #59  <Field Drawable zzqe>
	//   21   44:invokevirtual   #153 <Method Drawable Drawable.mutate()>
	//   22   47:pop             
			zzqb = true;
	//   23   48:aload_0         
	//   24   49:iconst_1        
	//   25   50:putfield        #151 <Field boolean zzqb>
		}
		return ((Drawable) (this));
	//   26   53:aload_0         
	//   27   54:areturn         
	}

	protected final void onBoundsChange(Rect rect)
	{
		zzqd.setBounds(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable zzqd>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #165 <Method void Drawable.setBounds(Rect)>
		zzqe.setBounds(rect);
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field Drawable zzqe>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #165 <Method void Drawable.setBounds(Rect)>
	//    8   16:return          
	}

	public final void resetTransition()
	{
		mAlpha = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #69  <Field int mAlpha>
		zzpw = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #65  <Field int zzpw>
		invalidateSelf();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #111 <Method void invalidateSelf()>
	//    8   14:return          
	}

	public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			((android.graphics.drawable.Drawable.Callback) (drawable)).scheduleDrawable(((Drawable) (this)), runnable, l);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:lload_3         
	//    9   13:invokeinterface #170 <Method void android.graphics.drawable.Drawable$Callback.scheduleDrawable(Drawable, Runnable, long)>
	//   10   18:return          
	}

	public final void setAlpha(int i)
	{
		if(mAlpha == zzpz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int mAlpha>
	//*   2    4:aload_0         
	//*   3    5:getfield        #67  <Field int zzpz>
	//*   4    8:icmpne          16
			mAlpha = i;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #69  <Field int mAlpha>
		zzpz = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #67  <Field int zzpz>
		invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #111 <Method void invalidateSelf()>
	//   13   25:return          
	}

	public final void setColorFilter(ColorFilter colorfilter)
	{
		zzqd.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable zzqd>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #174 <Method void Drawable.setColorFilter(ColorFilter)>
		zzqe.setColorFilter(colorfilter);
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field Drawable zzqe>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #174 <Method void Drawable.setColorFilter(ColorFilter)>
	//    8   16:return          
	}

	public final void setCrossFadeEnabled(boolean flag)
	{
		zzpl = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field boolean zzpl>
	//    3    5:return          
	}

	public final void startTransition(int i)
	{
		mFrom = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #179 <Field int mFrom>
		zzpy = zzpz;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #67  <Field int zzpz>
	//    6   10:putfield        #102 <Field int zzpy>
		mAlpha = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #69  <Field int mAlpha>
		zzqa = i;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #94  <Field int zzqa>
		zzpw = 1;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #65  <Field int zzpw>
		invalidateSelf();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #111 <Method void invalidateSelf()>
	//   18   32:return          
	}

	public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			((android.graphics.drawable.Drawable.Callback) (drawable)).unscheduleDrawable(((Drawable) (this)), runnable);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokeinterface #183 <Method void android.graphics.drawable.Drawable$Callback.unscheduleDrawable(Drawable, Runnable)>
	//    9   17:return          
	}

	private int mAlpha;
	private int mFrom;
	private boolean zzpl;
	private int zzpw;
	private long zzpx;
	private int zzpy;
	private int zzpz;
	private int zzqa;
	private boolean zzqb;
	private zzb zzqc;
	private Drawable zzqd;
	private Drawable zzqe;
	private boolean zzqf;
	private boolean zzqg;
	private boolean zzqh;
	private int zzqi;
}
