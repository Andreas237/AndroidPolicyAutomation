// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabn, zzaqw, zzakb, zzaji, 
//			zzabm

public final class zzabq extends zzabn
{

	zzabq(Context context, zzaji zzaji, zzaqw zzaqw1, zzabm zzabm)
	{
		super(context, zzaji, zzaqw1, zzabm);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #20  <Method void zzabn(Context, zzaji, zzaqw, zzabm)>
		zzbzn = new Object();
	//    6    9:aload_0         
	//    7   10:new             #22  <Class Object>
	//    8   13:dup             
	//    9   14:invokespecial   #25  <Method void Object()>
	//   10   17:putfield        #27  <Field Object zzbzn>
		zzbzp = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #29  <Field boolean zzbzp>
	//   14   25:return          
	}

	private final void zznv()
	{
		synchronized(zzbzn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object zzbzn>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzbzp = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #29  <Field boolean zzbzp>
			if((mContext instanceof Activity) && ((Activity)mContext).isDestroyed())
	//*   8   12:aload_0         
	//*   9   13:getfield        #35  <Field Context mContext>
	//*  10   16:instanceof      #37  <Class Activity>
	//*  11   19:ifeq            40
	//*  12   22:aload_0         
	//*  13   23:getfield        #35  <Field Context mContext>
	//*  14   26:checkcast       #37  <Class Activity>
	//*  15   29:invokevirtual   #41  <Method boolean Activity.isDestroyed()>
	//*  16   32:ifeq            40
				zzbzo = null;
	//   17   35:aload_0         
	//   18   36:aconst_null     
	//   19   37:putfield        #43  <Field PopupWindow zzbzo>
			if(zzbzo != null)
	//*  20   40:aload_0         
	//*  21   41:getfield        #43  <Field PopupWindow zzbzo>
	//*  22   44:ifnull          69
			{
				if(zzbzo.isShowing())
	//*  23   47:aload_0         
	//*  24   48:getfield        #43  <Field PopupWindow zzbzo>
	//*  25   51:invokevirtual   #48  <Method boolean PopupWindow.isShowing()>
	//*  26   54:ifeq            64
					zzbzo.dismiss();
	//   27   57:aload_0         
	//   28   58:getfield        #43  <Field PopupWindow zzbzo>
	//   29   61:invokevirtual   #51  <Method void PopupWindow.dismiss()>
				zzbzo = null;
	//   30   64:aload_0         
	//   31   65:aconst_null     
	//   32   66:putfield        #43  <Field PopupWindow zzbzo>
			}
		}
	//   33   69:aload_1         
	//   34   70:monitorexit     
		return;
	//   35   71:return          
		exception;
	//   36   72:astore_2        
		obj;
	//   37   73:aload_1         
		JVM INSTR monitorexit ;
	//   38   74:monitorexit     
		throw exception;
	//   39   75:aload_2         
	//   40   76:athrow          
	}

	public final void cancel()
	{
		zznv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void zznv()>
		super.cancel();
	//    2    4:aload_0         
	//    3    5:invokespecial   #56  <Method void zzabn.cancel()>
	//    4    8:return          
	}

	protected final void zznu()
	{
		Window window;
		if(mContext instanceof Activity)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Context mContext>
	//*   2    4:instanceof      #37  <Class Activity>
	//*   3    7:ifeq            24
			window = ((Activity)mContext).getWindow();
	//    4   10:aload_0         
	//    5   11:getfield        #35  <Field Context mContext>
	//    6   14:checkcast       #37  <Class Activity>
	//    7   17:invokevirtual   #63  <Method Window Activity.getWindow()>
	//    8   20:astore_1        
		else
	//*   9   21:goto            26
			window = null;
	//   10   24:aconst_null     
	//   11   25:astore_1        
		FrameLayout framelayout;
		if(window != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          175
		{
label0:
			{
				if(window.getDecorView() == null)
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #69  <Method android.view.View Window.getDecorView()>
	//*  16   34:ifnonnull       38
					return;
	//   17   37:return          
				if(((Activity)mContext).isDestroyed())
	//*  18   38:aload_0         
	//*  19   39:getfield        #35  <Field Context mContext>
	//*  20   42:checkcast       #37  <Class Activity>
	//*  21   45:invokevirtual   #41  <Method boolean Activity.isDestroyed()>
	//*  22   48:ifeq            52
					return;
	//   23   51:return          
				framelayout = new FrameLayout(mContext);
	//   24   52:new             #71  <Class FrameLayout>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:getfield        #35  <Field Context mContext>
	//   28   60:invokespecial   #74  <Method void FrameLayout(Context)>
	//   29   63:astore_3        
				framelayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
	//   30   64:aload_3         
	//   31   65:new             #76  <Class android.view.ViewGroup$LayoutParams>
	//   32   68:dup             
	//   33   69:iconst_m1       
	//   34   70:iconst_m1       
	//   35   71:invokespecial   #79  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   36   74:invokevirtual   #83  <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				framelayout.addView(zzbnd.getView(), -1, -1);
	//   37   77:aload_3         
	//   38   78:aload_0         
	//   39   79:getfield        #87  <Field zzaqw zzbnd>
	//   40   82:invokeinterface #92  <Method android.view.View zzaqw.getView()>
	//   41   87:iconst_m1       
	//   42   88:iconst_m1       
	//   43   89:invokevirtual   #96  <Method void FrameLayout.addView(android.view.View, int, int)>
				synchronized(zzbzn)
	//*  44   92:aload_0         
	//*  45   93:getfield        #27  <Field Object zzbzn>
	//*  46   96:astore_2        
	//*  47   97:aload_2         
	//*  48   98:monitorenter    
				{
					if(!zzbzp)
						break label0;
	//   49   99:aload_0         
	//   50  100:getfield        #29  <Field boolean zzbzp>
	//   51  103:ifeq            109
				}
	//   52  106:aload_2         
	//   53  107:monitorexit     
				return;
	//   54  108:return          
			}
		} else
	//*  55  109:aload_0         
	//*  56  110:new             #45  <Class PopupWindow>
	//*  57  113:dup             
	//*  58  114:aload_3         
	//*  59  115:iconst_1        
	//*  60  116:iconst_1        
	//*  61  117:iconst_0        
	//*  62  118:invokespecial   #99  <Method void PopupWindow(android.view.View, int, int, boolean)>
	//*  63  121:putfield        #43  <Field PopupWindow zzbzo>
	//*  64  124:aload_0         
	//*  65  125:getfield        #43  <Field PopupWindow zzbzo>
	//*  66  128:iconst_1        
	//*  67  129:invokevirtual   #103 <Method void PopupWindow.setOutsideTouchable(boolean)>
	//*  68  132:aload_0         
	//*  69  133:getfield        #43  <Field PopupWindow zzbzo>
	//*  70  136:iconst_0        
	//*  71  137:invokevirtual   #106 <Method void PopupWindow.setClippingEnabled(boolean)>
	//*  72  140:ldc1            #108 <String "Displaying the 1x1 popup off the screen.">
	//*  73  142:invokestatic    #114 <Method void zzakb.zzck(String)>
	//*  74  145:aload_0         
	//*  75  146:getfield        #43  <Field PopupWindow zzbzo>
	//*  76  149:aload_1         
	//*  77  150:invokevirtual   #69  <Method android.view.View Window.getDecorView()>
	//*  78  153:iconst_0        
	//*  79  154:iconst_m1       
	//*  80  155:iconst_m1       
	//*  81  156:invokevirtual   #118 <Method void PopupWindow.showAtLocation(android.view.View, int, int, int)>
	//*  82  159:goto            167
	//*  83  162:aload_0         
	//*  84  163:aconst_null     
	//*  85  164:putfield        #43  <Field PopupWindow zzbzo>
	//*  86  167:aload_2         
	//*  87  168:monitorexit     
	//*  88  169:return          
	//*  89  170:astore_1        
	//*  90  171:aload_2         
	//*  91  172:monitorexit     
	//*  92  173:aload_1         
	//*  93  174:athrow          
		{
			return;
	//   94  175:return          
		}
		zzbzo = new PopupWindow(((android.view.View) (framelayout)), 1, 1, false);
		zzbzo.setOutsideTouchable(true);
		zzbzo.setClippingEnabled(false);
		zzakb.zzck("Displaying the 1x1 popup off the screen.");
		zzbzo.showAtLocation(window.getDecorView(), 0, -1, -1);
		  goto _L1
_L3:
		zzbzo = null;
_L1:
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
		Exception exception1;
		exception1;
	//   95  176:astore_1        
		if(true) goto _L3; else goto _L2
_L2:
	//*  96  177:goto            162
	}

	protected final void zzz(int i)
	{
		zznv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void zznv()>
		super.zzz(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #122 <Method void zzabn.zzz(int)>
	//    5    9:return          
	}

	private Object zzbzn;
	private PopupWindow zzbzo;
	private boolean zzbzp;
}
