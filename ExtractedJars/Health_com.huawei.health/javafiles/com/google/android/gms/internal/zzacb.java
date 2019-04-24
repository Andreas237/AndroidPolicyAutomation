// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class zzacb extends Drawable
	implements android.graphics.drawable.Drawable.Callback
{
	static final class zza extends Drawable
	{

		static zza zzxt()
		{
			return zzaEQ;
		//    0    0:getstatic       #20  <Field zzacb$zza zzaEQ>
		//    1    3:areturn         
		}

		public void draw(Canvas canvas)
		{
		//    0    0:return          
		}

		public android.graphics.drawable.Drawable.ConstantState getConstantState()
		{
			return ((android.graphics.drawable.Drawable.ConstantState) (zzaER));
		//    0    0:getstatic       #25  <Field zzacb$zza$zza zzaER>
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

		private static final zza zzaEQ = new zza();
		private static final zza zzaER = new zza();

		static 
		{
		//    0    0:new             #2   <Class zzacb$zza>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void zzacb$zza()>
		//    3    7:putstatic       #20  <Field zzacb$zza zzaEQ>
		//    4   10:new             #9   <Class zzacb$zza$zza>
		//    5   13:dup             
		//    6   14:aconst_null     
		//    7   15:invokespecial   #23  <Method void zzacb$zza$zza(zzacb$1)>
		//    8   18:putstatic       #25  <Field zzacb$zza$zza zzaER>
		//*   9   21:return          
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Drawable()>
		//    2    4:return          
		}
	}

	static final class zza.zza extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (zza.zzxt()));
		//    0    0:invokestatic    #24  <Method zzacb$zza zzacb$zza.zzxt()>
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
			return ((Drawable) (new zzacb(this)));
		//    0    0:new             #6   <Class zzacb>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #26  <Method void zzacb(zzacb$zzb)>
		//    4    8:areturn         
		}

		int mChangingConfigurations;
		int zzaES;

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
				zzaES = zzb1.zzaES;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #19  <Field int zzaES>
		//   11   21:putfield        #19  <Field int zzaES>
			}
		//   12   24:return          
		}
	}


	public zzacb(Drawable drawable, Drawable drawable1)
	{
		this(((zzb) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #42  <Method void zzacb(zzacb$zzb)>
		Object obj = ((Object) (drawable));
	//    3    5:aload_1         
	//    4    6:astore_3        
		if(drawable == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       15
			obj = ((Object) (zza.zzxt()));
	//    7   11:invokestatic    #46  <Method zzacb$zza zzacb$zza.zzxt()>
	//    8   14:astore_3        
		zzaEK = ((Drawable) (obj));
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #48  <Field Drawable zzaEK>
		((Drawable) (obj)).setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #52  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		drawable = ((Drawable) (zzaEJ));
	//   15   25:aload_0         
	//   16   26:getfield        #54  <Field zzacb$zzb zzaEJ>
	//   17   29:astore_1        
		drawable.zzaES = ((zzb) (drawable)).zzaES | ((Drawable) (obj)).getChangingConfigurations();
	//   18   30:aload_1         
	//   19   31:aload_1         
	//   20   32:getfield        #57  <Field int zzacb$zzb.zzaES>
	//   21   35:aload_3         
	//   22   36:invokevirtual   #61  <Method int Drawable.getChangingConfigurations()>
	//   23   39:ior             
	//   24   40:putfield        #57  <Field int zzacb$zzb.zzaES>
		drawable = drawable1;
	//   25   43:aload_2         
	//   26   44:astore_1        
		if(drawable1 == null)
	//*  27   45:aload_2         
	//*  28   46:ifnonnull       53
			drawable = ((Drawable) (zza.zzxt()));
	//   29   49:invokestatic    #46  <Method zzacb$zza zzacb$zza.zzxt()>
	//   30   52:astore_1        
		zzaEL = drawable;
	//   31   53:aload_0         
	//   32   54:aload_1         
	//   33   55:putfield        #63  <Field Drawable zzaEL>
		drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   34   58:aload_1         
	//   35   59:aload_0         
	//   36   60:invokevirtual   #52  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		drawable1 = ((Drawable) (zzaEJ));
	//   37   63:aload_0         
	//   38   64:getfield        #54  <Field zzacb$zzb zzaEJ>
	//   39   67:astore_2        
		drawable1.zzaES = ((zzb) (drawable1)).zzaES | drawable.getChangingConfigurations();
	//   40   68:aload_2         
	//   41   69:aload_2         
	//   42   70:getfield        #57  <Field int zzacb$zzb.zzaES>
	//   43   73:aload_1         
	//   44   74:invokevirtual   #61  <Method int Drawable.getChangingConfigurations()>
	//   45   77:ior             
	//   46   78:putfield        #57  <Field int zzacb$zzb.zzaES>
	//   47   81:return          
	}

	zzacb(zzb zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Drawable()>
		zzaED = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #69  <Field int zzaED>
		zzaEF = 255;
	//    5    9:aload_0         
	//    6   10:sipush          255
	//    7   13:putfield        #71  <Field int zzaEF>
		zzaEH = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #73  <Field int zzaEH>
		zzaEy = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #75  <Field boolean zzaEy>
		zzaEJ = new zzb(zzb1);
	//   14   26:aload_0         
	//   15   27:new             #15  <Class zzacb$zzb>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokespecial   #76  <Method void zzacb$zzb(zzacb$zzb)>
	//   19   35:putfield        #54  <Field zzacb$zzb zzaEJ>
	//   20   38:return          
	}

	public boolean canConstantState()
	{
		if(!zzaEM)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field boolean zzaEM>
	//*   2    4:ifne            44
		{
			boolean flag;
			if(zzaEK.getConstantState() != null && zzaEL.getConstantState() != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #48  <Field Drawable zzaEK>
	//*   5   11:invokevirtual   #84  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//*   6   14:ifnull          32
	//*   7   17:aload_0         
	//*   8   18:getfield        #63  <Field Drawable zzaEL>
	//*   9   21:invokevirtual   #84  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//*  10   24:ifnull          32
				flag = true;
	//   11   27:iconst_1        
	//   12   28:istore_1        
			else
	//*  13   29:goto            34
				flag = false;
	//   14   32:iconst_0        
	//   15   33:istore_1        
			zzaEN = flag;
	//   16   34:aload_0         
	//   17   35:iload_1         
	//   18   36:putfield        #86  <Field boolean zzaEN>
			zzaEM = true;
	//   19   39:aload_0         
	//   20   40:iconst_1        
	//   21   41:putfield        #80  <Field boolean zzaEM>
		}
		return zzaEN;
	//   22   44:aload_0         
	//   23   45:getfield        #86  <Field boolean zzaEN>
	//   24   48:ireturn         
	}

	public void draw(Canvas canvas)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		switch(zzaED)
	//*   2    2:aload_0         
	//*   3    3:getfield        #69  <Field int zzaED>
		{
		default:
			break;

	//*   4    6:lookupswitch    2: default 32
	//	               1: 35
	//	               2: 52
	//*   5   32:goto            121
		case 1: // '\001'
			zzafe = SystemClock.uptimeMillis();
	//    6   35:aload_0         
	//    7   36:invokestatic    #94  <Method long SystemClock.uptimeMillis()>
	//    8   39:putfield        #96  <Field long zzafe>
			flag = false;
	//    9   42:iconst_0        
	//   10   43:istore_3        
			zzaED = 2;
	//   11   44:aload_0         
	//   12   45:iconst_2        
	//   13   46:putfield        #69  <Field int zzaED>
			break;
	//   14   49:goto            121

		case 2: // '\002'
			if(zzafe < 0L)
				break;
	//   15   52:aload_0         
	//   16   53:getfield        #96  <Field long zzafe>
	//   17   56:lconst_0        
	//   18   57:lcmp            
	//   19   58:iflt            121
			float f = (float)(SystemClock.uptimeMillis() - zzafe) / (float)zzaEG;
	//   20   61:invokestatic    #94  <Method long SystemClock.uptimeMillis()>
	//   21   64:aload_0         
	//   22   65:getfield        #96  <Field long zzafe>
	//   23   68:lsub            
	//   24   69:l2f             
	//   25   70:aload_0         
	//   26   71:getfield        #98  <Field int zzaEG>
	//   27   74:i2f             
	//   28   75:fdiv            
	//   29   76:fstore_2        
			if(f >= 1.0F)
	//*  30   77:fload_2         
	//*  31   78:fconst_1        
	//*  32   79:fcmpl           
	//*  33   80:iflt            88
				flag = true;
	//   34   83:iconst_1        
	//   35   84:istore_3        
			else
	//*  36   85:goto            90
				flag = false;
	//   37   88:iconst_0        
	//   38   89:istore_3        
			if(flag)
	//*  39   90:iload_3         
	//*  40   91:ifeq            99
				zzaED = 0;
	//   41   94:aload_0         
	//   42   95:iconst_0        
	//   43   96:putfield        #69  <Field int zzaED>
			f = Math.min(f, 1.0F);
	//   44   99:fload_2         
	//   45  100:fconst_1        
	//   46  101:invokestatic    #104 <Method float Math.min(float, float)>
	//   47  104:fstore_2        
			zzaEH = (int)((float)(zzaEE + 0) * f + 0.0F);
	//   48  105:aload_0         
	//   49  106:aload_0         
	//   50  107:getfield        #106 <Field int zzaEE>
	//   51  110:iconst_0        
	//   52  111:iadd            
	//   53  112:i2f             
	//   54  113:fload_2         
	//   55  114:fmul            
	//   56  115:fconst_0        
	//   57  116:fadd            
	//   58  117:f2i             
	//   59  118:putfield        #73  <Field int zzaEH>
			break;
		}
		int i = zzaEH;
	//   60  121:aload_0         
	//   61  122:getfield        #73  <Field int zzaEH>
	//   62  125:istore          4
		boolean flag1 = zzaEy;
	//   63  127:aload_0         
	//   64  128:getfield        #75  <Field boolean zzaEy>
	//   65  131:istore          5
		Drawable drawable = zzaEK;
	//   66  133:aload_0         
	//   67  134:getfield        #48  <Field Drawable zzaEK>
	//   68  137:astore          6
		Drawable drawable1 = zzaEL;
	//   69  139:aload_0         
	//   70  140:getfield        #63  <Field Drawable zzaEL>
	//   71  143:astore          7
		if(flag)
	//*  72  145:iload_3         
	//*  73  146:ifeq            190
		{
			if(!flag1 || i == 0)
	//*  74  149:iload           5
	//*  75  151:ifeq            159
	//*  76  154:iload           4
	//*  77  156:ifne            165
				drawable.draw(canvas);
	//   78  159:aload           6
	//   79  161:aload_1         
	//   80  162:invokevirtual   #108 <Method void Drawable.draw(Canvas)>
			if(i == zzaEF)
	//*  81  165:iload           4
	//*  82  167:aload_0         
	//*  83  168:getfield        #71  <Field int zzaEF>
	//*  84  171:icmpne          189
			{
				drawable1.setAlpha(zzaEF);
	//   85  174:aload           7
	//   86  176:aload_0         
	//   87  177:getfield        #71  <Field int zzaEF>
	//   88  180:invokevirtual   #112 <Method void Drawable.setAlpha(int)>
				drawable1.draw(canvas);
	//   89  183:aload           7
	//   90  185:aload_1         
	//   91  186:invokevirtual   #108 <Method void Drawable.draw(Canvas)>
			}
			return;
	//   92  189:return          
		}
		if(flag1)
	//*  93  190:iload           5
	//*  94  192:ifeq            207
			drawable.setAlpha(zzaEF - i);
	//   95  195:aload           6
	//   96  197:aload_0         
	//   97  198:getfield        #71  <Field int zzaEF>
	//   98  201:iload           4
	//   99  203:isub            
	//  100  204:invokevirtual   #112 <Method void Drawable.setAlpha(int)>
		drawable.draw(canvas);
	//  101  207:aload           6
	//  102  209:aload_1         
	//  103  210:invokevirtual   #108 <Method void Drawable.draw(Canvas)>
		if(flag1)
	//* 104  213:iload           5
	//* 105  215:ifeq            227
			drawable.setAlpha(zzaEF);
	//  106  218:aload           6
	//  107  220:aload_0         
	//  108  221:getfield        #71  <Field int zzaEF>
	//  109  224:invokevirtual   #112 <Method void Drawable.setAlpha(int)>
		if(i > 0)
	//* 110  227:iload           4
	//* 111  229:ifle            254
		{
			drawable1.setAlpha(i);
	//  112  232:aload           7
	//  113  234:iload           4
	//  114  236:invokevirtual   #112 <Method void Drawable.setAlpha(int)>
			drawable1.draw(canvas);
	//  115  239:aload           7
	//  116  241:aload_1         
	//  117  242:invokevirtual   #108 <Method void Drawable.draw(Canvas)>
			drawable1.setAlpha(zzaEF);
	//  118  245:aload           7
	//  119  247:aload_0         
	//  120  248:getfield        #71  <Field int zzaEF>
	//  121  251:invokevirtual   #112 <Method void Drawable.setAlpha(int)>
		}
		invalidateSelf();
	//  122  254:aload_0         
	//  123  255:invokevirtual   #115 <Method void invalidateSelf()>
	//  124  258:return          
	}

	public int getChangingConfigurations()
	{
		return super.getChangingConfigurations() | zzaEJ.mChangingConfigurations | zzaEJ.zzaES;
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method int Drawable.getChangingConfigurations()>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field zzacb$zzb zzaEJ>
	//    4    8:getfield        #118 <Field int zzacb$zzb.mChangingConfigurations>
	//    5   11:ior             
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field zzacb$zzb zzaEJ>
	//    8   16:getfield        #57  <Field int zzacb$zzb.zzaES>
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
			zzaEJ.mChangingConfigurations = getChangingConfigurations();
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field zzacb$zzb zzaEJ>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #121 <Method int getChangingConfigurations()>
	//    7   15:putfield        #118 <Field int zzacb$zzb.mChangingConfigurations>
			return ((android.graphics.drawable.Drawable.ConstantState) (zzaEJ));
	//    8   18:aload_0         
	//    9   19:getfield        #54  <Field zzacb$zzb zzaEJ>
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
		return Math.max(zzaEK.getIntrinsicHeight(), zzaEL.getIntrinsicHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Drawable zzaEK>
	//    2    4:invokevirtual   #124 <Method int Drawable.getIntrinsicHeight()>
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field Drawable zzaEL>
	//    5   11:invokevirtual   #124 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:invokestatic    #128 <Method int Math.max(int, int)>
	//    7   17:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return Math.max(zzaEK.getIntrinsicWidth(), zzaEL.getIntrinsicWidth());
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Drawable zzaEK>
	//    2    4:invokevirtual   #131 <Method int Drawable.getIntrinsicWidth()>
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field Drawable zzaEL>
	//    5   11:invokevirtual   #131 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:invokestatic    #128 <Method int Math.max(int, int)>
	//    7   17:ireturn         
	}

	public int getOpacity()
	{
		if(!zzaEO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field boolean zzaEO>
	//*   2    4:ifne            33
		{
			zzaEP = Drawable.resolveOpacity(zzaEK.getOpacity(), zzaEL.getOpacity());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field Drawable zzaEK>
	//    6   12:invokevirtual   #136 <Method int Drawable.getOpacity()>
	//    7   15:aload_0         
	//    8   16:getfield        #63  <Field Drawable zzaEL>
	//    9   19:invokevirtual   #136 <Method int Drawable.getOpacity()>
	//   10   22:invokestatic    #139 <Method int Drawable.resolveOpacity(int, int)>
	//   11   25:putfield        #141 <Field int zzaEP>
			zzaEO = true;
	//   12   28:aload_0         
	//   13   29:iconst_1        
	//   14   30:putfield        #134 <Field boolean zzaEO>
		}
		return zzaEP;
	//   15   33:aload_0         
	//   16   34:getfield        #141 <Field int zzaEP>
	//   17   37:ireturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			((android.graphics.drawable.Drawable.Callback) (drawable)).invalidateDrawable(((Drawable) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #149 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(Drawable)>
	//    8   16:return          
	}

	public Drawable mutate()
	{
		if(!zzaEI && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field boolean zzaEI>
	//*   2    4:ifne            53
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #155 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       53
		{
			if(!canConstantState())
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #120 <Method boolean canConstantState()>
	//*   9   19:ifne            32
				throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
	//   10   22:new             #157 <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc1            #159 <String "One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.">
	//   13   28:invokespecial   #162 <Method void IllegalStateException(String)>
	//   14   31:athrow          
			zzaEK.mutate();
	//   15   32:aload_0         
	//   16   33:getfield        #48  <Field Drawable zzaEK>
	//   17   36:invokevirtual   #155 <Method Drawable Drawable.mutate()>
	//   18   39:pop             
			zzaEL.mutate();
	//   19   40:aload_0         
	//   20   41:getfield        #63  <Field Drawable zzaEL>
	//   21   44:invokevirtual   #155 <Method Drawable Drawable.mutate()>
	//   22   47:pop             
			zzaEI = true;
	//   23   48:aload_0         
	//   24   49:iconst_1        
	//   25   50:putfield        #153 <Field boolean zzaEI>
		}
		return ((Drawable) (this));
	//   26   53:aload_0         
	//   27   54:areturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		zzaEK.setBounds(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Drawable zzaEK>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #167 <Method void Drawable.setBounds(Rect)>
		zzaEL.setBounds(rect);
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field Drawable zzaEL>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #167 <Method void Drawable.setBounds(Rect)>
	//    8   16:return          
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			((android.graphics.drawable.Drawable.Callback) (drawable)).scheduleDrawable(((Drawable) (this)), runnable, l);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:lload_3         
	//    9   13:invokeinterface #171 <Method void android.graphics.drawable.Drawable$Callback.scheduleDrawable(Drawable, Runnable, long)>
	//   10   18:return          
	}

	public void setAlpha(int i)
	{
		if(zzaEH == zzaEF)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int zzaEH>
	//*   2    4:aload_0         
	//*   3    5:getfield        #71  <Field int zzaEF>
	//*   4    8:icmpne          16
			zzaEH = i;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #73  <Field int zzaEH>
		zzaEF = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #71  <Field int zzaEF>
		invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #115 <Method void invalidateSelf()>
	//   13   25:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		zzaEK.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Drawable zzaEK>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #175 <Method void Drawable.setColorFilter(ColorFilter)>
		zzaEL.setColorFilter(colorfilter);
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field Drawable zzaEL>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #175 <Method void Drawable.setColorFilter(ColorFilter)>
	//    8   16:return          
	}

	public void startTransition(int i)
	{
		mFrom = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #178 <Field int mFrom>
		zzaEE = zzaEF;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #71  <Field int zzaEF>
	//    6   10:putfield        #106 <Field int zzaEE>
		zzaEH = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #73  <Field int zzaEH>
		zzaEG = i;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #98  <Field int zzaEG>
		zzaED = 1;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #69  <Field int zzaED>
		invalidateSelf();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #115 <Method void invalidateSelf()>
	//   18   32:return          
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			((android.graphics.drawable.Drawable.Callback) (drawable)).unscheduleDrawable(((Drawable) (this)), runnable);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokeinterface #182 <Method void android.graphics.drawable.Drawable$Callback.unscheduleDrawable(Drawable, Runnable)>
	//    9   17:return          
	}

	public Drawable zzxs()
	{
		return zzaEL;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Drawable zzaEL>
	//    2    4:areturn         
	}

	private int mFrom;
	private int zzaED;
	private int zzaEE;
	private int zzaEF;
	private int zzaEG;
	private int zzaEH;
	private boolean zzaEI;
	private zzb zzaEJ;
	private Drawable zzaEK;
	private Drawable zzaEL;
	private boolean zzaEM;
	private boolean zzaEN;
	private boolean zzaEO;
	private int zzaEP;
	private boolean zzaEy;
	private long zzafe;
}
