// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.support.v4.media.session.*;
import android.support.v7.media.MediaRouter;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

final class MediaRouteControllerDialog$ClickListener
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		int j = view.getId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method int View.getId()>
	//    2    4:istore          4
		int i = 1;
	//    3    6:iconst_1        
	//    4    7:istore_2        
		boolean flag = true;
	//    5    8:iconst_1        
	//    6    9:istore_3        
		if(j != 0x1020019 && j != 0x102001a)
	//*   7   10:iload           4
	//*   8   12:ldc1            #25  <Int 0x1020019>
	//*   9   14:icmpeq          292
	//*  10   17:iload           4
	//*  11   19:ldc1            #26  <Int 0x102001a>
	//*  12   21:icmpne          27
	//*  13   24:goto            292
		{
			if(j == android.support.v7.mediarouter.R.id.mr_control_playback_ctrl)
	//*  14   27:iload           4
	//*  15   29:getstatic       #32  <Field int android.support.v7.mediarouter.R$id.mr_control_playback_ctrl>
	//*  16   32:icmpne          276
			{
				if(mMediaController != null && mState != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//*  19   39:getfield        #38  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
	//*  20   42:ifnull          334
	//*  21   45:aload_0         
	//*  22   46:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//*  23   49:getfield        #42  <Field PlaybackStateCompat MediaRouteControllerDialog.mState>
	//*  24   52:ifnull          334
				{
					i = mState.a();
	//   25   55:aload_0         
	//   26   56:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//   27   59:getfield        #42  <Field PlaybackStateCompat MediaRouteControllerDialog.mState>
	//   28   62:invokevirtual   #47  <Method int PlaybackStateCompat.a()>
	//   29   65:istore_2        
					j = 0;
	//   30   66:iconst_0        
	//   31   67:istore          4
					if(i != 3)
	//*  32   69:iload_2         
	//*  33   70:iconst_3        
	//*  34   71:icmpne          77
	//*  35   74:goto            79
						flag = false;
	//   36   77:iconst_0        
	//   37   78:istore_3        
					if(flag && isPauseActionSupported())
	//*  38   79:iload_3         
	//*  39   80:ifeq            113
	//*  40   83:aload_0         
	//*  41   84:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//*  42   87:invokevirtual   #51  <Method boolean MediaRouteControllerDialog.isPauseActionSupported()>
	//*  43   90:ifeq            113
					{
						mMediaController.a().b();
	//   44   93:aload_0         
	//   45   94:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//   46   97:getfield        #38  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
	//   47  100:invokevirtual   #56  <Method s MediaControllerCompat.a()>
	//   48  103:invokevirtual   #61  <Method void s.b()>
						i = android.support.v7.mediarouter.R.string.mr_controller_pause;
	//   49  106:getstatic       #66  <Field int android.support.v7.mediarouter.R$string.mr_controller_pause>
	//   50  109:istore_2        
					} else
	//*  51  110:goto            184
					if(flag && isStopActionSupported())
	//*  52  113:iload_3         
	//*  53  114:ifeq            147
	//*  54  117:aload_0         
	//*  55  118:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//*  56  121:invokevirtual   #69  <Method boolean MediaRouteControllerDialog.isStopActionSupported()>
	//*  57  124:ifeq            147
					{
						mMediaController.a().c();
	//   58  127:aload_0         
	//   59  128:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//   60  131:getfield        #38  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
	//   61  134:invokevirtual   #56  <Method s MediaControllerCompat.a()>
	//   62  137:invokevirtual   #72  <Method void s.c()>
						i = android.support.v7.mediarouter.R.string.mr_controller_stop;
	//   63  140:getstatic       #75  <Field int android.support.v7.mediarouter.R$string.mr_controller_stop>
	//   64  143:istore_2        
					} else
	//*  65  144:goto            184
					{
						i = j;
	//   66  147:iload           4
	//   67  149:istore_2        
						if(!flag)
	//*  68  150:iload_3         
	//*  69  151:ifne            184
						{
							i = j;
	//   70  154:iload           4
	//   71  156:istore_2        
							if(isPlayActionSupported())
	//*  72  157:aload_0         
	//*  73  158:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//*  74  161:invokevirtual   #78  <Method boolean MediaRouteControllerDialog.isPlayActionSupported()>
	//*  75  164:ifeq            184
							{
								mMediaController.a().a();
	//   76  167:aload_0         
	//   77  168:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//   78  171:getfield        #38  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
	//   79  174:invokevirtual   #56  <Method s MediaControllerCompat.a()>
	//   80  177:invokevirtual   #80  <Method void s.a()>
								i = android.support.v7.mediarouter.R.string.mr_controller_play;
	//   81  180:getstatic       #83  <Field int android.support.v7.mediarouter.R$string.mr_controller_play>
	//   82  183:istore_2        
							}
						}
					}
					if(mAccessibilityManager != null && mAccessibilityManager.isEnabled() && i != 0)
	//*  83  184:aload_0         
	//*  84  185:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//*  85  188:getfield        #87  <Field AccessibilityManager MediaRouteControllerDialog.mAccessibilityManager>
	//*  86  191:ifnull          334
	//*  87  194:aload_0         
	//*  88  195:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//*  89  198:getfield        #87  <Field AccessibilityManager MediaRouteControllerDialog.mAccessibilityManager>
	//*  90  201:invokevirtual   #92  <Method boolean AccessibilityManager.isEnabled()>
	//*  91  204:ifeq            334
	//*  92  207:iload_2         
	//*  93  208:ifeq            334
					{
						view = ((View) (AccessibilityEvent.obtain(16384)));
	//   94  211:sipush          16384
	//   95  214:invokestatic    #98  <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
	//   96  217:astore_1        
						((AccessibilityEvent) (view)).setPackageName(((CharSequence) (mContext.getPackageName())));
	//   97  218:aload_1         
	//   98  219:aload_0         
	//   99  220:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//  100  223:getfield        #102 <Field Context MediaRouteControllerDialog.mContext>
	//  101  226:invokevirtual   #108 <Method String Context.getPackageName()>
	//  102  229:invokevirtual   #112 <Method void AccessibilityEvent.setPackageName(CharSequence)>
						((AccessibilityEvent) (view)).setClassName(((CharSequence) (((Object)this).getClass().getName())));
	//  103  232:aload_1         
	//  104  233:aload_0         
	//  105  234:invokevirtual   #116 <Method Class Object.getClass()>
	//  106  237:invokevirtual   #121 <Method String Class.getName()>
	//  107  240:invokevirtual   #124 <Method void AccessibilityEvent.setClassName(CharSequence)>
						((AccessibilityEvent) (view)).getText().add(((Object) (mContext.getString(i))));
	//  108  243:aload_1         
	//  109  244:invokevirtual   #128 <Method List AccessibilityEvent.getText()>
	//  110  247:aload_0         
	//  111  248:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//  112  251:getfield        #102 <Field Context MediaRouteControllerDialog.mContext>
	//  113  254:iload_2         
	//  114  255:invokevirtual   #132 <Method String Context.getString(int)>
	//  115  258:invokeinterface #138 <Method boolean List.add(Object)>
	//  116  263:pop             
						mAccessibilityManager.sendAccessibilityEvent(((AccessibilityEvent) (view)));
	//  117  264:aload_0         
	//  118  265:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//  119  268:getfield        #87  <Field AccessibilityManager MediaRouteControllerDialog.mAccessibilityManager>
	//  120  271:aload_1         
	//  121  272:invokevirtual   #142 <Method void AccessibilityManager.sendAccessibilityEvent(AccessibilityEvent)>
						return;
	//  122  275:return          
					}
				}
			} else
			if(j == android.support.v7.mediarouter.R.id.mr_close)
	//* 123  276:iload           4
	//* 124  278:getstatic       #145 <Field int android.support.v7.mediarouter.R$id.mr_close>
	//* 125  281:icmpne          334
			{
				dismiss();
	//  126  284:aload_0         
	//  127  285:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//  128  288:invokevirtual   #148 <Method void MediaRouteControllerDialog.dismiss()>
				return;
	//  129  291:return          
			}
		} else
		{
			if(mRoute.isSelected())
	//* 130  292:aload_0         
	//* 131  293:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//* 132  296:getfield        #152 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRoute>
	//* 133  299:invokevirtual   #157 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
	//* 134  302:ifeq            327
			{
				view = ((View) (mRouter));
	//  135  305:aload_0         
	//  136  306:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//  137  309:getfield        #161 <Field MediaRouter MediaRouteControllerDialog.mRouter>
	//  138  312:astore_1        
				if(j == 0x1020019)
	//* 139  313:iload           4
	//* 140  315:ldc1            #25  <Int 0x1020019>
	//* 141  317:icmpne          322
					i = 2;
	//  142  320:iconst_2        
	//  143  321:istore_2        
				((MediaRouter) (view)).unselect(i);
	//  144  322:aload_1         
	//  145  323:iload_2         
	//  146  324:invokevirtual   #167 <Method void MediaRouter.unselect(int)>
			}
			dismiss();
	//  147  327:aload_0         
	//  148  328:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//  149  331:invokevirtual   #148 <Method void MediaRouteControllerDialog.dismiss()>
		}
	//  150  334:return          
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$ClickListener()
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
