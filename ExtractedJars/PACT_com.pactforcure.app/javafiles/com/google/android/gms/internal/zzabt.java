// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.common.util.zzs;

public final class zzabt extends Drawable
	implements android.graphics.drawable.Drawable.Callback
{
	private static final class zza extends Drawable
	{

		static zza zzwN()
		{
			return zzaDr;
		//    0    0:getstatic       #20  <Field zzabt$zza zzaDr>
		//    1    3:areturn         
		}

		public void draw(Canvas canvas)
		{
		//    0    0:return          
		}

		public android.graphics.drawable.Drawable.ConstantState getConstantState()
		{
			return ((android.graphics.drawable.Drawable.ConstantState) (zzaDs));
		//    0    0:getstatic       #25  <Field zzabt$zza$zza zzaDs>
		//    1    3:areturn         
		}

		public int getOpacity()
		{
			return -2;
		//    0    0:bipush          -2
		//    1    2:ireturn         
		}

		public void setAlpha(int i)
		{
		//    0    0:return          
		}

		public void setColorFilter(ColorFilter colorfilter)
		{
		//    0    0:return          
		}

		private static final zza zzaDr = new zza();
		private static final zza zzaDs = new zza();

		static 
		{
		//    0    0:new             #2   <Class zzabt$zza>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void zzabt$zza()>
		//    3    7:putstatic       #20  <Field zzabt$zza zzaDr>
		//    4   10:new             #9   <Class zzabt$zza$zza>
		//    5   13:dup             
		//    6   14:aconst_null     
		//    7   15:invokespecial   #23  <Method void zzabt$zza$zza(zzabt$1)>
		//    8   18:putstatic       #25  <Field zzabt$zza$zza zzaDs>
		//*   9   21:return          
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Drawable()>
		//    2    4:return          
		}
	}

	private static final class zza.zza extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (zza.zzwN()));
		//    0    0:invokestatic    #24  <Method zzabt$zza zzabt$zza.zzwN()>
		//    1    3:areturn         
		}

		private zza.zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void android.graphics.drawable.Drawable$ConstantState()>
		//    2    4:return          
		}

	}

	static final class zzb extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return mChangingConfigurations;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int mChangingConfigurations>
		//    2    4:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (new zzabt(this)));
		//    0    0:new             #6   <Class zzabt>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #26  <Method void zzabt(zzabt$zzb)>
		//    4    8:areturn         
		}

		int mChangingConfigurations;
		int zzaDt;

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
				zzaDt = zzb1.zzaDt;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #19  <Field int zzaDt>
		//   11   21:putfield        #19  <Field int zzaDt>
			}
		//   12   24:return          
		}
	}


	public zzabt(Drawable drawable, Drawable drawable1)
	{
		this(((zzb) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #42  <Method void zzabt(zzabt$zzb)>
		Object obj = ((Object) (drawable));
	//    3    5:aload_1         
	//    4    6:astore_3        
		if(drawable == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       15
			obj = ((Object) (zza.zzwN()));
	//    7   11:invokestatic    #46  <Method zzabt$zza zzabt$zza.zzwN()>
	//    8   14:astore_3        
		zzaDl = ((Drawable) (obj));
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #48  <Field Drawable zzaDl>
		((Drawable) (obj)).setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #52  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		drawable = ((Drawable) (zzaDk));
	//   15   25:aload_0         
	//   16   26:getfield        #54  <Field zzabt$zzb zzaDk>
	//   17   29:astore_1        
		drawable.zzaDt = ((zzb) (drawable)).zzaDt | ((Drawable) (obj)).getChangingConfigurations();
	//   18   30:aload_1         
	//   19   31:aload_1         
	//   20   32:getfield        #57  <Field int zzabt$zzb.zzaDt>
	//   21   35:aload_3         
	//   22   36:invokevirtual   #61  <Method int Drawable.getChangingConfigurations()>
	//   23   39:ior             
	//   24   40:putfield        #57  <Field int zzabt$zzb.zzaDt>
		drawable = drawable1;
	//   25   43:aload_2         
	//   26   44:astore_1        
		if(drawable1 == null)
	//*  27   45:aload_2         
	//*  28   46:ifnonnull       53
			drawable = ((Drawable) (zza.zzwN()));
	//   29   49:invokestatic    #46  <Method zzabt$zza zzabt$zza.zzwN()>
	//   30   52:astore_1        
		zzaDm = drawable;
	//   31   53:aload_0         
	//   32   54:aload_1         
	//   33   55:putfield        #63  <Field Drawable zzaDm>
		drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   34   58:aload_1         
	//   35   59:aload_0         
	//   36   60:invokevirtual   #52  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		drawable1 = ((Drawable) (zzaDk));
	//   37   63:aload_0         
	//   38   64:getfield        #54  <Field zzabt$zzb zzaDk>
	//   39   67:astore_2        
		drawable1.zzaDt = ((zzb) (drawable1)).zzaDt | drawable.getChangingConfigurations();
	//   40   68:aload_2         
	//   41   69:aload_2         
	//   42   70:getfield        #57  <Field int zzabt$zzb.zzaDt>
	//   43   73:aload_1         
	//   44   74:invokevirtual   #61  <Method int Drawable.getChangingConfigurations()>
	//   45   77:ior             
	//   46   78:putfield        #57  <Field int zzabt$zzb.zzaDt>
	//   47   81:return          
	}

	zzabt(zzb zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Drawable()>
		zzaDe = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #69  <Field int zzaDe>
		zzaDg = 255;
	//    5    9:aload_0         
	//    6   10:sipush          255
	//    7   13:putfield        #71  <Field int zzaDg>
		zzaDi = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #73  <Field int zzaDi>
		zzaCZ = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #75  <Field boolean zzaCZ>
		zzaDk = new zzb(zzb1);
	//   14   26:aload_0         
	//   15   27:new             #15  <Class zzabt$zzb>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokespecial   #76  <Method void zzabt$zzb(zzabt$zzb)>
	//   19   35:putfield        #54  <Field zzabt$zzb zzaDk>
	//   20   38:return          
	}

	public boolean canConstantState()
	{
		if(!zzaDn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field boolean zzaDn>
	//*   2    4:ifne            39
		{
			boolean flag;
			if(zzaDl.getConstantState() != null && zzaDm.getConstantState() != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #48  <Field Drawable zzaDl>
	//*   5   11:invokevirtual   #84  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//*   6   14:ifnull          44
	//*   7   17:aload_0         
	//*   8   18:getfield        #63  <Field Drawable zzaDm>
	//*   9   21:invokevirtual   #84  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//*  10   24:ifnull          44
				flag = true;
	//   11   27:iconst_1        
	//   12   28:istore_1        
			else
	//*  13   29:aload_0         
	//*  14   30:iload_1         
	//*  15   31:putfield        #86  <Field boolean zzaDo>
	//*  16   34:aload_0         
	//*  17   35:iconst_1        
	//*  18   36:putfield        #80  <Field boolean zzaDn>
	//*  19   39:aload_0         
	//*  20   40:getfield        #86  <Field boolean zzaDo>
	//*  21   43:ireturn         
				flag = false;
	//   22   44:iconst_0        
	//   23   45:istore_1        
			zzaDo = flag;
			zzaDn = true;
		}
		return zzaDo;
	//*  24   46:goto            29
	}

	public void draw(Canvas canvas)
	{
		int i;
		int j;
		boolean flag;
		j = 1;
	//    0    0:iconst_1        
	//    1    1:istore          4
		i = 1;
	//    2    3:iconst_1        
	//    3    4:istore_3        
		flag = false;
	//    4    5:iconst_0        
	//    5    6:istore          5
		zzaDe;
	//    6    8:aload_0         
	//    7    9:getfield        #69  <Field int zzaDe>
		JVM INSTR tableswitch 1 2: default 36
	//	               1 105
	//	               2 123;
	//    8   12:tableswitch     1 2: default 36
	//	               1 105
	//	               2 123
		   goto _L1 _L2 _L3
_L1:
		boolean flag1;
		Drawable drawable;
		Drawable drawable1;
		j = zzaDi;
	//    9   36:aload_0         
	//   10   37:getfield        #73  <Field int zzaDi>
	//   11   40:istore          4
		flag1 = zzaCZ;
	//   12   42:aload_0         
	//   13   43:getfield        #75  <Field boolean zzaCZ>
	//   14   46:istore          6
		drawable = zzaDl;
	//   15   48:aload_0         
	//   16   49:getfield        #48  <Field Drawable zzaDl>
	//   17   52:astore          7
		drawable1 = zzaDm;
	//   18   54:aload_0         
	//   19   55:getfield        #63  <Field Drawable zzaDm>
	//   20   58:astore          8
		if(i != 0)
	//*  21   60:iload_3         
	//*  22   61:ifeq            194
		{
			if(!flag1 || j == 0)
	//*  23   64:iload           6
	//*  24   66:ifeq            74
	//*  25   69:iload           4
	//*  26   71:ifne            80
				drawable.draw(canvas);
	//   27   74:aload           7
	//   28   76:aload_1         
	//   29   77:invokevirtual   #90  <Method void Drawable.draw(Canvas)>
			if(j == zzaDg)
	//*  30   80:iload           4
	//*  31   82:aload_0         
	//*  32   83:getfield        #71  <Field int zzaDg>
	//*  33   86:icmpne          104
			{
				drawable1.setAlpha(zzaDg);
	//   34   89:aload           8
	//   35   91:aload_0         
	//   36   92:getfield        #71  <Field int zzaDg>
	//   37   95:invokevirtual   #94  <Method void Drawable.setAlpha(int)>
				drawable1.draw(canvas);
	//   38   98:aload           8
	//   39  100:aload_1         
	//   40  101:invokevirtual   #90  <Method void Drawable.draw(Canvas)>
			}
			return;
	//   41  104:return          
		}
		break; /* Loop/switch isn't completed */
_L2:
		zzaed = SystemClock.uptimeMillis();
	//   42  105:aload_0         
	//   43  106:invokestatic    #100 <Method long SystemClock.uptimeMillis()>
	//   44  109:putfield        #102 <Field long zzaed>
		zzaDe = 2;
	//   45  112:aload_0         
	//   46  113:iconst_2        
	//   47  114:putfield        #69  <Field int zzaDe>
		i = ((int) (flag));
	//   48  117:iload           5
	//   49  119:istore_3        
		continue; /* Loop/switch isn't completed */
	//   50  120:goto            36
_L3:
		if(zzaed >= 0L)
	//*  51  123:aload_0         
	//*  52  124:getfield        #102 <Field long zzaed>
	//*  53  127:lconst_0        
	//*  54  128:lcmp            
	//*  55  129:iflt            36
		{
			float f = (float)(SystemClock.uptimeMillis() - zzaed) / (float)zzaDh;
	//   56  132:invokestatic    #100 <Method long SystemClock.uptimeMillis()>
	//   57  135:aload_0         
	//   58  136:getfield        #102 <Field long zzaed>
	//   59  139:lsub            
	//   60  140:l2f             
	//   61  141:aload_0         
	//   62  142:getfield        #104 <Field int zzaDh>
	//   63  145:i2f             
	//   64  146:fdiv            
	//   65  147:fstore_2        
			if(f >= 1.0F)
	//*  66  148:fload_2         
	//*  67  149:fconst_1        
	//*  68  150:fcmpl           
	//*  69  151:iflt            189
				i = j;
	//   70  154:iload           4
	//   71  156:istore_3        
			else
	//*  72  157:iload_3         
	//*  73  158:ifeq            166
	//*  74  161:aload_0         
	//*  75  162:iconst_0        
	//*  76  163:putfield        #69  <Field int zzaDe>
	//*  77  166:aload_0         
	//*  78  167:fload_2         
	//*  79  168:fconst_1        
	//*  80  169:invokestatic    #110 <Method float Math.min(float, float)>
	//*  81  172:aload_0         
	//*  82  173:getfield        #112 <Field int zzaDf>
	//*  83  176:iconst_0        
	//*  84  177:iadd            
	//*  85  178:i2f             
	//*  86  179:fmul            
	//*  87  180:fconst_0        
	//*  88  181:fadd            
	//*  89  182:f2i             
	//*  90  183:putfield        #73  <Field int zzaDi>
	//*  91  186:goto            36
				i = 0;
	//   92  189:iconst_0        
	//   93  190:istore_3        
			if(i != 0)
				zzaDe = 0;
			zzaDi = (int)(Math.min(f, 1.0F) * (float)(zzaDf + 0) + 0.0F);
		}
		continue; /* Loop/switch isn't completed */
	//   94  191:goto            157
		if(flag1)
	//*  95  194:iload           6
	//*  96  196:ifeq            211
			drawable.setAlpha(zzaDg - j);
	//   97  199:aload           7
	//   98  201:aload_0         
	//   99  202:getfield        #71  <Field int zzaDg>
	//  100  205:iload           4
	//  101  207:isub            
	//  102  208:invokevirtual   #94  <Method void Drawable.setAlpha(int)>
		drawable.draw(canvas);
	//  103  211:aload           7
	//  104  213:aload_1         
	//  105  214:invokevirtual   #90  <Method void Drawable.draw(Canvas)>
		if(flag1)
	//* 106  217:iload           6
	//* 107  219:ifeq            231
			drawable.setAlpha(zzaDg);
	//  108  222:aload           7
	//  109  224:aload_0         
	//  110  225:getfield        #71  <Field int zzaDg>
	//  111  228:invokevirtual   #94  <Method void Drawable.setAlpha(int)>
		if(j > 0)
	//* 112  231:iload           4
	//* 113  233:ifle            258
		{
			drawable1.setAlpha(j);
	//  114  236:aload           8
	//  115  238:iload           4
	//  116  240:invokevirtual   #94  <Method void Drawable.setAlpha(int)>
			drawable1.draw(canvas);
	//  117  243:aload           8
	//  118  245:aload_1         
	//  119  246:invokevirtual   #90  <Method void Drawable.draw(Canvas)>
			drawable1.setAlpha(zzaDg);
	//  120  249:aload           8
	//  121  251:aload_0         
	//  122  252:getfield        #71  <Field int zzaDg>
	//  123  255:invokevirtual   #94  <Method void Drawable.setAlpha(int)>
		}
		invalidateSelf();
	//  124  258:aload_0         
	//  125  259:invokevirtual   #115 <Method void invalidateSelf()>
		return;
	//  126  262:return          
		if(true) goto _L1; else goto _L4
_L4:
	}

	public int getChangingConfigurations()
	{
		return super.getChangingConfigurations() | zzaDk.mChangingConfigurations | zzaDk.zzaDt;
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method int Drawable.getChangingConfigurations()>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field zzabt$zzb zzaDk>
	//    4    8:getfield        #118 <Field int zzabt$zzb.mChangingConfigurations>
	//    5   11:ior             
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field zzabt$zzb zzaDk>
	//    8   16:getfield        #57  <Field int zzabt$zzb.zzaDt>
	//    9   19:ior             
	//   10   20:ireturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(canConstantState())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #120 <Method boolean canConstantState()>
	//*   2    4:ifeq            23
		{
			zzaDk.mChangingConfigurations = getChangingConfigurations();
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field zzabt$zzb zzaDk>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #121 <Method int getChangingConfigurations()>
	//    7   15:putfield        #118 <Field int zzabt$zzb.mChangingConfigurations>
			return ((android.graphics.drawable.Drawable.ConstantState) (zzaDk));
	//    8   18:aload_0         
	//    9   19:getfield        #54  <Field zzabt$zzb zzaDk>
	//   10   22:areturn         
		} else
		{
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
		}
	}

	public int getIntrinsicHeight()
	{
		return Math.max(zzaDl.getIntrinsicHeight(), zzaDm.getIntrinsicHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Drawable zzaDl>
	//    2    4:invokevirtual   #124 <Method int Drawable.getIntrinsicHeight()>
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field Drawable zzaDm>
	//    5   11:invokevirtual   #124 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:invokestatic    #128 <Method int Math.max(int, int)>
	//    7   17:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return Math.max(zzaDl.getIntrinsicWidth(), zzaDm.getIntrinsicWidth());
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Drawable zzaDl>
	//    2    4:invokevirtual   #131 <Method int Drawable.getIntrinsicWidth()>
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field Drawable zzaDm>
	//    5   11:invokevirtual   #131 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:invokestatic    #128 <Method int Math.max(int, int)>
	//    7   17:ireturn         
	}

	public int getOpacity()
	{
		if(!zzaDp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field boolean zzaDp>
	//*   2    4:ifne            33
		{
			zzaDq = Drawable.resolveOpacity(zzaDl.getOpacity(), zzaDm.getOpacity());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field Drawable zzaDl>
	//    6   12:invokevirtual   #136 <Method int Drawable.getOpacity()>
	//    7   15:aload_0         
	//    8   16:getfield        #63  <Field Drawable zzaDm>
	//    9   19:invokevirtual   #136 <Method int Drawable.getOpacity()>
	//   10   22:invokestatic    #139 <Method int Drawable.resolveOpacity(int, int)>
	//   11   25:putfield        #141 <Field int zzaDq>
			zzaDp = true;
	//   12   28:aload_0         
	//   13   29:iconst_1        
	//   14   30:putfield        #134 <Field boolean zzaDp>
		}
		return zzaDq;
	//   15   33:aload_0         
	//   16   34:getfield        #141 <Field int zzaDq>
	//   17   37:ireturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		if(zzs.zzyx())
	//*   0    0:invokestatic    #151 <Method boolean zzs.zzyx()>
	//*   1    3:ifeq            22
		{
			drawable = ((Drawable) (getCallback()));
	//    2    6:aload_0         
	//    3    7:invokevirtual   #155 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    4   10:astore_1        
			if(drawable != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
				((android.graphics.drawable.Drawable.Callback) (drawable)).invalidateDrawable(((Drawable) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokeinterface #157 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(Drawable)>
		}
	//   10   22:return          
	}

	public Drawable mutate()
	{
		if(!zzaDj && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field boolean zzaDj>
	//*   2    4:ifne            53
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #164 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       53
		{
			if(!canConstantState())
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #120 <Method boolean canConstantState()>
	//*   9   19:ifne            32
				throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
	//   10   22:new             #166 <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc1            #168 <String "One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.">
	//   13   28:invokespecial   #171 <Method void IllegalStateException(String)>
	//   14   31:athrow          
			zzaDl.mutate();
	//   15   32:aload_0         
	//   16   33:getfield        #48  <Field Drawable zzaDl>
	//   17   36:invokevirtual   #164 <Method Drawable Drawable.mutate()>
	//   18   39:pop             
			zzaDm.mutate();
	//   19   40:aload_0         
	//   20   41:getfield        #63  <Field Drawable zzaDm>
	//   21   44:invokevirtual   #164 <Method Drawable Drawable.mutate()>
	//   22   47:pop             
			zzaDj = true;
	//   23   48:aload_0         
	//   24   49:iconst_1        
	//   25   50:putfield        #162 <Field boolean zzaDj>
		}
		return ((Drawable) (this));
	//   26   53:aload_0         
	//   27   54:areturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		zzaDl.setBounds(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Drawable zzaDl>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #176 <Method void Drawable.setBounds(Rect)>
		zzaDm.setBounds(rect);
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field Drawable zzaDm>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #176 <Method void Drawable.setBounds(Rect)>
	//    8   16:return          
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		if(zzs.zzyx())
	//*   0    0:invokestatic    #151 <Method boolean zzs.zzyx()>
	//*   1    3:ifeq            24
		{
			drawable = ((Drawable) (getCallback()));
	//    2    6:aload_0         
	//    3    7:invokevirtual   #155 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    4   10:astore_1        
			if(drawable != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          24
				((android.graphics.drawable.Drawable.Callback) (drawable)).scheduleDrawable(((Drawable) (this)), runnable, l);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:lload_3         
	//   11   19:invokeinterface #180 <Method void android.graphics.drawable.Drawable$Callback.scheduleDrawable(Drawable, Runnable, long)>
		}
	//   12   24:return          
	}

	public void setAlpha(int i)
	{
		if(zzaDi == zzaDg)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int zzaDi>
	//*   2    4:aload_0         
	//*   3    5:getfield        #71  <Field int zzaDg>
	//*   4    8:icmpne          16
			zzaDi = i;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #73  <Field int zzaDi>
		zzaDg = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #71  <Field int zzaDg>
		invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #115 <Method void invalidateSelf()>
	//   13   25:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		zzaDl.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Drawable zzaDl>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #184 <Method void Drawable.setColorFilter(ColorFilter)>
		zzaDm.setColorFilter(colorfilter);
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field Drawable zzaDm>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #184 <Method void Drawable.setColorFilter(ColorFilter)>
	//    8   16:return          
	}

	public void startTransition(int i)
	{
		mFrom = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #187 <Field int mFrom>
		zzaDf = zzaDg;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #71  <Field int zzaDg>
	//    6   10:putfield        #112 <Field int zzaDf>
		zzaDi = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #73  <Field int zzaDi>
		zzaDh = i;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #104 <Field int zzaDh>
		zzaDe = 1;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #69  <Field int zzaDe>
		invalidateSelf();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #115 <Method void invalidateSelf()>
	//   18   32:return          
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		if(zzs.zzyx())
	//*   0    0:invokestatic    #151 <Method boolean zzs.zzyx()>
	//*   1    3:ifeq            23
		{
			drawable = ((Drawable) (getCallback()));
	//    2    6:aload_0         
	//    3    7:invokevirtual   #155 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    4   10:astore_1        
			if(drawable != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
				((android.graphics.drawable.Drawable.Callback) (drawable)).unscheduleDrawable(((Drawable) (this)), runnable);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:invokeinterface #191 <Method void android.graphics.drawable.Drawable$Callback.unscheduleDrawable(Drawable, Runnable)>
		}
	//   11   23:return          
	}

	public Drawable zzwM()
	{
		return zzaDm;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Drawable zzaDm>
	//    2    4:areturn         
	}

	private int mFrom;
	private boolean zzaCZ;
	private int zzaDe;
	private int zzaDf;
	private int zzaDg;
	private int zzaDh;
	private int zzaDi;
	private boolean zzaDj;
	private zzb zzaDk;
	private Drawable zzaDl;
	private Drawable zzaDm;
	private boolean zzaDn;
	private boolean zzaDo;
	private boolean zzaDp;
	private int zzaDq;
	private long zzaed;
}
