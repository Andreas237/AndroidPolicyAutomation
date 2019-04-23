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
//			om, afn, wx, we, 
//			ol

public final class op extends om
{

	op(Context context, we we, afn afn1, ol ol)
	{
		super(context, we, afn1, ol);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #20  <Method void om(Context, we, afn, ol)>
		d = new Object();
	//    6    9:aload_0         
	//    7   10:new             #22  <Class Object>
	//    8   13:dup             
	//    9   14:invokespecial   #25  <Method void Object()>
	//   10   17:putfield        #27  <Field Object d>
		f = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #29  <Field boolean f>
	//   14   25:return          
	}

	private final void e()
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			f = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #29  <Field boolean f>
			if((a instanceof Activity) && ((Activity)a).isDestroyed())
	//*   8   12:aload_0         
	//*   9   13:getfield        #34  <Field Context a>
	//*  10   16:instanceof      #36  <Class Activity>
	//*  11   19:ifeq            40
	//*  12   22:aload_0         
	//*  13   23:getfield        #34  <Field Context a>
	//*  14   26:checkcast       #36  <Class Activity>
	//*  15   29:invokevirtual   #40  <Method boolean Activity.isDestroyed()>
	//*  16   32:ifeq            40
				e = null;
	//   17   35:aload_0         
	//   18   36:aconst_null     
	//   19   37:putfield        #42  <Field PopupWindow e>
			if(e != null)
	//*  20   40:aload_0         
	//*  21   41:getfield        #42  <Field PopupWindow e>
	//*  22   44:ifnull          69
			{
				if(e.isShowing())
	//*  23   47:aload_0         
	//*  24   48:getfield        #42  <Field PopupWindow e>
	//*  25   51:invokevirtual   #47  <Method boolean PopupWindow.isShowing()>
	//*  26   54:ifeq            64
					e.dismiss();
	//   27   57:aload_0         
	//   28   58:getfield        #42  <Field PopupWindow e>
	//   29   61:invokevirtual   #50  <Method void PopupWindow.dismiss()>
				e = null;
	//   30   64:aload_0         
	//   31   65:aconst_null     
	//   32   66:putfield        #42  <Field PopupWindow e>
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

	protected final void a(int i)
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void e()>
		super.a(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #55  <Method void om.a(int)>
	//    5    9:return          
	}

	public final void b()
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void e()>
		super.b();
	//    2    4:aload_0         
	//    3    5:invokespecial   #58  <Method void om.b()>
	//    4    8:return          
	}

	protected final void d()
	{
		Window window;
		if(a instanceof Activity)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Context a>
	//*   2    4:instanceof      #36  <Class Activity>
	//*   3    7:ifeq            24
			window = ((Activity)a).getWindow();
	//    4   10:aload_0         
	//    5   11:getfield        #34  <Field Context a>
	//    6   14:checkcast       #36  <Class Activity>
	//    7   17:invokevirtual   #64  <Method Window Activity.getWindow()>
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
	//*  15   31:invokevirtual   #70  <Method android.view.View Window.getDecorView()>
	//*  16   34:ifnonnull       38
					return;
	//   17   37:return          
				if(((Activity)a).isDestroyed())
	//*  18   38:aload_0         
	//*  19   39:getfield        #34  <Field Context a>
	//*  20   42:checkcast       #36  <Class Activity>
	//*  21   45:invokevirtual   #40  <Method boolean Activity.isDestroyed()>
	//*  22   48:ifeq            52
					return;
	//   23   51:return          
				framelayout = new FrameLayout(a);
	//   24   52:new             #72  <Class FrameLayout>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:getfield        #34  <Field Context a>
	//   28   60:invokespecial   #75  <Method void FrameLayout(Context)>
	//   29   63:astore_3        
				framelayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
	//   30   64:aload_3         
	//   31   65:new             #77  <Class android.view.ViewGroup$LayoutParams>
	//   32   68:dup             
	//   33   69:iconst_m1       
	//   34   70:iconst_m1       
	//   35   71:invokespecial   #80  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   36   74:invokevirtual   #84  <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				framelayout.addView(b.getView(), -1, -1);
	//   37   77:aload_3         
	//   38   78:aload_0         
	//   39   79:getfield        #87  <Field afn b>
	//   40   82:invokeinterface #92  <Method android.view.View afn.getView()>
	//   41   87:iconst_m1       
	//   42   88:iconst_m1       
	//   43   89:invokevirtual   #96  <Method void FrameLayout.addView(android.view.View, int, int)>
				synchronized(d)
	//*  44   92:aload_0         
	//*  45   93:getfield        #27  <Field Object d>
	//*  46   96:astore_2        
	//*  47   97:aload_2         
	//*  48   98:monitorenter    
				{
					if(!f)
						break label0;
	//   49   99:aload_0         
	//   50  100:getfield        #29  <Field boolean f>
	//   51  103:ifeq            109
				}
	//   52  106:aload_2         
	//   53  107:monitorexit     
				return;
	//   54  108:return          
			}
		} else
	//*  55  109:aload_0         
	//*  56  110:new             #44  <Class PopupWindow>
	//*  57  113:dup             
	//*  58  114:aload_3         
	//*  59  115:iconst_1        
	//*  60  116:iconst_1        
	//*  61  117:iconst_0        
	//*  62  118:invokespecial   #99  <Method void PopupWindow(android.view.View, int, int, boolean)>
	//*  63  121:putfield        #42  <Field PopupWindow e>
	//*  64  124:aload_0         
	//*  65  125:getfield        #42  <Field PopupWindow e>
	//*  66  128:iconst_1        
	//*  67  129:invokevirtual   #103 <Method void PopupWindow.setOutsideTouchable(boolean)>
	//*  68  132:aload_0         
	//*  69  133:getfield        #42  <Field PopupWindow e>
	//*  70  136:iconst_0        
	//*  71  137:invokevirtual   #106 <Method void PopupWindow.setClippingEnabled(boolean)>
	//*  72  140:ldc1            #108 <String "Displaying the 1x1 popup off the screen.">
	//*  73  142:invokestatic    #113 <Method void wx.b(String)>
	//*  74  145:aload_0         
	//*  75  146:getfield        #42  <Field PopupWindow e>
	//*  76  149:aload_1         
	//*  77  150:invokevirtual   #70  <Method android.view.View Window.getDecorView()>
	//*  78  153:iconst_0        
	//*  79  154:iconst_m1       
	//*  80  155:iconst_m1       
	//*  81  156:invokevirtual   #117 <Method void PopupWindow.showAtLocation(android.view.View, int, int, int)>
	//*  82  159:goto            167
	//*  83  162:aload_0         
	//*  84  163:aconst_null     
	//*  85  164:putfield        #42  <Field PopupWindow e>
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
		e = new PopupWindow(((android.view.View) (framelayout)), 1, 1, false);
		e.setOutsideTouchable(true);
		e.setClippingEnabled(false);
		wx.b("Displaying the 1x1 popup off the screen.");
		e.showAtLocation(window.getDecorView(), 0, -1, -1);
		  goto _L1
_L3:
		e = null;
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

	private Object d;
	private PopupWindow e;
	private boolean f;
}
