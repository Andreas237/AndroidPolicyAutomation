// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.util.ObjectsCompat;
import android.support.v7.graphics.Palette;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.util.Log;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.*;
import android.widget.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package android.support.v7.app:
//			AlertDialog, MediaRouterThemeHelper, OverlayListView, MediaRouteDialogHelper, 
//			MediaRouteExpandCollapseButton, MediaRouteVolumeSlider

public class MediaRouteControllerDialog extends AlertDialog
{
	private final class ClickListener
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			int j = view.getId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method int View.getId()>
		//    2    4:istore          4
			int i = 1;
		//    3    6:iconst_1        
		//    4    7:istore_2        
			boolean flag = true;
		//    5    8:iconst_1        
		//    6    9:istore_3        
			if(j != 0x1020019 && j != 0x102001a)
		//*   7   10:iload           4
		//*   8   12:ldc1            #28  <Int 0x1020019>
		//*   9   14:icmpeq          292
		//*  10   17:iload           4
		//*  11   19:ldc1            #29  <Int 0x102001a>
		//*  12   21:icmpne          27
		//*  13   24:goto            292
			{
				if(j == android.support.v7.mediarouter.R.id.mr_control_playback_ctrl)
		//*  14   27:iload           4
		//*  15   29:getstatic       #35  <Field int android.support.v7.mediarouter.R$id.mr_control_playback_ctrl>
		//*  16   32:icmpne          276
				{
					if(mMediaController != null && mState != null)
		//*  17   35:aload_0         
		//*  18   36:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//*  19   39:getfield        #39  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//*  20   42:ifnull          334
		//*  21   45:aload_0         
		//*  22   46:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//*  23   49:getfield        #43  <Field PlaybackStateCompat MediaRouteControllerDialog.mState>
		//*  24   52:ifnull          334
					{
						i = mState.getState();
		//   25   55:aload_0         
		//   26   56:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//   27   59:getfield        #43  <Field PlaybackStateCompat MediaRouteControllerDialog.mState>
		//   28   62:invokevirtual   #48  <Method int PlaybackStateCompat.getState()>
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
		//*  41   84:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//*  42   87:invokestatic    #52  <Method boolean MediaRouteControllerDialog.access$000(MediaRouteControllerDialog)>
		//*  43   90:ifeq            113
						{
							mMediaController.getTransportControls().pause();
		//   44   93:aload_0         
		//   45   94:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//   46   97:getfield        #39  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//   47  100:invokevirtual   #58  <Method android.support.v4.media.session.MediaControllerCompat$TransportControls MediaControllerCompat.getTransportControls()>
		//   48  103:invokevirtual   #63  <Method void android.support.v4.media.session.MediaControllerCompat$TransportControls.pause()>
							i = android.support.v7.mediarouter.R.string.mr_controller_pause;
		//   49  106:getstatic       #68  <Field int android.support.v7.mediarouter.R$string.mr_controller_pause>
		//   50  109:istore_2        
						} else
		//*  51  110:goto            184
						if(flag && isStopActionSupported())
		//*  52  113:iload_3         
		//*  53  114:ifeq            147
		//*  54  117:aload_0         
		//*  55  118:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//*  56  121:invokestatic    #71  <Method boolean MediaRouteControllerDialog.access$100(MediaRouteControllerDialog)>
		//*  57  124:ifeq            147
						{
							mMediaController.getTransportControls().stop();
		//   58  127:aload_0         
		//   59  128:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//   60  131:getfield        #39  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//   61  134:invokevirtual   #58  <Method android.support.v4.media.session.MediaControllerCompat$TransportControls MediaControllerCompat.getTransportControls()>
		//   62  137:invokevirtual   #74  <Method void android.support.v4.media.session.MediaControllerCompat$TransportControls.stop()>
							i = android.support.v7.mediarouter.R.string.mr_controller_stop;
		//   63  140:getstatic       #77  <Field int android.support.v7.mediarouter.R$string.mr_controller_stop>
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
		//*  73  158:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//*  74  161:invokestatic    #80  <Method boolean MediaRouteControllerDialog.access$200(MediaRouteControllerDialog)>
		//*  75  164:ifeq            184
								{
									mMediaController.getTransportControls().play();
		//   76  167:aload_0         
		//   77  168:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//   78  171:getfield        #39  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//   79  174:invokevirtual   #58  <Method android.support.v4.media.session.MediaControllerCompat$TransportControls MediaControllerCompat.getTransportControls()>
		//   80  177:invokevirtual   #83  <Method void android.support.v4.media.session.MediaControllerCompat$TransportControls.play()>
									i = android.support.v7.mediarouter.R.string.mr_controller_play;
		//   81  180:getstatic       #86  <Field int android.support.v7.mediarouter.R$string.mr_controller_play>
		//   82  183:istore_2        
								}
							}
						}
						if(mAccessibilityManager != null && mAccessibilityManager.isEnabled() && i != 0)
		//*  83  184:aload_0         
		//*  84  185:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//*  85  188:getfield        #90  <Field AccessibilityManager MediaRouteControllerDialog.mAccessibilityManager>
		//*  86  191:ifnull          334
		//*  87  194:aload_0         
		//*  88  195:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//*  89  198:getfield        #90  <Field AccessibilityManager MediaRouteControllerDialog.mAccessibilityManager>
		//*  90  201:invokevirtual   #96  <Method boolean AccessibilityManager.isEnabled()>
		//*  91  204:ifeq            334
		//*  92  207:iload_2         
		//*  93  208:ifeq            334
						{
							view = ((View) (AccessibilityEvent.obtain(16384)));
		//   94  211:sipush          16384
		//   95  214:invokestatic    #102 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
		//   96  217:astore_1        
							((AccessibilityEvent) (view)).setPackageName(((CharSequence) (mContext.getPackageName())));
		//   97  218:aload_1         
		//   98  219:aload_0         
		//   99  220:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//  100  223:getfield        #106 <Field Context MediaRouteControllerDialog.mContext>
		//  101  226:invokevirtual   #112 <Method String Context.getPackageName()>
		//  102  229:invokevirtual   #116 <Method void AccessibilityEvent.setPackageName(CharSequence)>
							((AccessibilityEvent) (view)).setClassName(((CharSequence) (((Object)this).getClass().getName())));
		//  103  232:aload_1         
		//  104  233:aload_0         
		//  105  234:invokevirtual   #120 <Method Class Object.getClass()>
		//  106  237:invokevirtual   #125 <Method String Class.getName()>
		//  107  240:invokevirtual   #128 <Method void AccessibilityEvent.setClassName(CharSequence)>
							((AccessibilityEvent) (view)).getText().add(((Object) (mContext.getString(i))));
		//  108  243:aload_1         
		//  109  244:invokevirtual   #132 <Method List AccessibilityEvent.getText()>
		//  110  247:aload_0         
		//  111  248:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//  112  251:getfield        #106 <Field Context MediaRouteControllerDialog.mContext>
		//  113  254:iload_2         
		//  114  255:invokevirtual   #136 <Method String Context.getString(int)>
		//  115  258:invokeinterface #142 <Method boolean List.add(Object)>
		//  116  263:pop             
							mAccessibilityManager.sendAccessibilityEvent(((AccessibilityEvent) (view)));
		//  117  264:aload_0         
		//  118  265:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//  119  268:getfield        #90  <Field AccessibilityManager MediaRouteControllerDialog.mAccessibilityManager>
		//  120  271:aload_1         
		//  121  272:invokevirtual   #146 <Method void AccessibilityManager.sendAccessibilityEvent(AccessibilityEvent)>
							return;
		//  122  275:return          
						}
					}
				} else
				if(j == android.support.v7.mediarouter.R.id.mr_close)
		//* 123  276:iload           4
		//* 124  278:getstatic       #149 <Field int android.support.v7.mediarouter.R$id.mr_close>
		//* 125  281:icmpne          334
				{
					dismiss();
		//  126  284:aload_0         
		//  127  285:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//  128  288:invokevirtual   #152 <Method void MediaRouteControllerDialog.dismiss()>
					return;
		//  129  291:return          
				}
			} else
			{
				if(mRoute.isSelected())
		//* 130  292:aload_0         
		//* 131  293:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//* 132  296:getfield        #156 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRoute>
		//* 133  299:invokevirtual   #161 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
		//* 134  302:ifeq            327
				{
					view = ((View) (mRouter));
		//  135  305:aload_0         
		//  136  306:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//  137  309:getfield        #165 <Field MediaRouter MediaRouteControllerDialog.mRouter>
		//  138  312:astore_1        
					if(j == 0x1020019)
		//* 139  313:iload           4
		//* 140  315:ldc1            #28  <Int 0x1020019>
		//* 141  317:icmpne          322
						i = 2;
		//  142  320:iconst_2        
		//  143  321:istore_2        
					((MediaRouter) (view)).unselect(i);
		//  144  322:aload_1         
		//  145  323:iload_2         
		//  146  324:invokevirtual   #171 <Method void MediaRouter.unselect(int)>
				}
				dismiss();
		//  147  327:aload_0         
		//  148  328:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//  149  331:invokevirtual   #152 <Method void MediaRouteControllerDialog.dismiss()>
			}
		//  150  334:return          
		}

		final MediaRouteControllerDialog this$0;

		ClickListener()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private class FetchArtTask extends AsyncTask
	{

		private InputStream openInputStreamByScheme(Uri uri)
			throws IOException
		{
			String s = uri.getScheme().toLowerCase();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #71  <Method String Uri.getScheme()>
		//    2    4:invokevirtual   #76  <Method String String.toLowerCase()>
		//    3    7:astore_2        
			if(!"android.resource".equals(((Object) (s))) && !"content".equals(((Object) (s))) && !"file".equals(((Object) (s))))
		//*   4    8:ldc1            #78  <String "android.resource">
		//*   5   10:aload_2         
		//*   6   11:invokevirtual   #82  <Method boolean String.equals(Object)>
		//*   7   14:ifne            75
		//*   8   17:ldc1            #84  <String "content">
		//*   9   19:aload_2         
		//*  10   20:invokevirtual   #82  <Method boolean String.equals(Object)>
		//*  11   23:ifne            75
		//*  12   26:ldc1            #86  <String "file">
		//*  13   28:aload_2         
		//*  14   29:invokevirtual   #82  <Method boolean String.equals(Object)>
		//*  15   32:ifeq            38
		//*  16   35:goto            75
			{
				uri = ((Uri) ((new URL(uri.toString())).openConnection()));
		//   17   38:new             #88  <Class URL>
		//   18   41:dup             
		//   19   42:aload_1         
		//   20   43:invokevirtual   #91  <Method String Uri.toString()>
		//   21   46:invokespecial   #94  <Method void URL(String)>
		//   22   49:invokevirtual   #98  <Method URLConnection URL.openConnection()>
		//   23   52:astore_1        
				((URLConnection) (uri)).setConnectTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
		//   24   53:aload_1         
		//   25   54:getstatic       #101 <Field int MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS>
		//   26   57:invokevirtual   #107 <Method void URLConnection.setConnectTimeout(int)>
				((URLConnection) (uri)).setReadTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
		//   27   60:aload_1         
		//   28   61:getstatic       #101 <Field int MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS>
		//   29   64:invokevirtual   #110 <Method void URLConnection.setReadTimeout(int)>
				uri = ((Uri) (((URLConnection) (uri)).getInputStream()));
		//   30   67:aload_1         
		//   31   68:invokevirtual   #114 <Method InputStream URLConnection.getInputStream()>
		//   32   71:astore_1        
			} else
		//*  33   72:goto            90
			{
				uri = ((Uri) (mContext.getContentResolver().openInputStream(uri)));
		//   34   75:aload_0         
		//   35   76:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//   36   79:getfield        #118 <Field Context MediaRouteControllerDialog.mContext>
		//   37   82:invokevirtual   #124 <Method ContentResolver Context.getContentResolver()>
		//   38   85:aload_1         
		//   39   86:invokevirtual   #129 <Method InputStream ContentResolver.openInputStream(Uri)>
		//   40   89:astore_1        
			}
			if(uri == null)
		//*  41   90:aload_1         
		//*  42   91:ifnonnull       96
				return null;
		//   43   94:aconst_null     
		//   44   95:areturn         
			else
				return ((InputStream) (new BufferedInputStream(((InputStream) (uri)))));
		//   45   96:new             #131 <Class BufferedInputStream>
		//   46   99:dup             
		//   47  100:aload_1         
		//   48  101:invokespecial   #134 <Method void BufferedInputStream(InputStream)>
		//   49  104:areturn         
		}

		protected transient Bitmap doInBackground(Void avoid[])
		{
			int i;
			avoid = ((Void []) (mIconBitmap));
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field Bitmap mIconBitmap>
		//    2    4:astore_1        
			i = 0;
		//    3    5:iconst_0        
		//    4    6:istore_2        
			if(avoid == null) goto _L2; else goto _L1
		//    5    7:aload_1         
		//    6    8:ifnull          19
_L1:
			avoid = ((Void []) (mIconBitmap));
		//    7   11:aload_0         
		//    8   12:getfield        #54  <Field Bitmap mIconBitmap>
		//    9   15:astore_1        
			  goto _L3
		//*  10   16:goto            546
_L2:
			if(mIconUri == null) goto _L5; else goto _L4
		//   11   19:aload_0         
		//   12   20:getfield        #60  <Field Uri mIconUri>
		//   13   23:ifnull          544
_L4:
			Object obj = ((Object) (openInputStreamByScheme(mIconUri)));
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #60  <Field Uri mIconUri>
		//   17   31:invokespecial   #139 <Method InputStream openInputStreamByScheme(Uri)>
		//   18   34:astore          5
			if(obj != null) goto _L7; else goto _L6
		//   19   36:aload           5
		//   20   38:ifnonnull       128
_L6:
			Object obj1;
			obj1 = obj;
		//   21   41:aload           5
		//   22   43:astore          6
			avoid = ((Void []) (obj));
		//   23   45:aload           5
		//   24   47:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
		//   25   48:new             #141 <Class StringBuilder>
		//   26   51:dup             
		//   27   52:invokespecial   #142 <Method void StringBuilder()>
		//   28   55:astore          7
			obj1 = obj;
		//   29   57:aload           5
		//   30   59:astore          6
			avoid = ((Void []) (obj));
		//   31   61:aload           5
		//   32   63:astore_1        
			stringbuilder.append("Unable to open: ");
		//   33   64:aload           7
		//   34   66:ldc1            #144 <String "Unable to open: ">
		//   35   68:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
		//   36   71:pop             
			obj1 = obj;
		//   37   72:aload           5
		//   38   74:astore          6
			avoid = ((Void []) (obj));
		//   39   76:aload           5
		//   40   78:astore_1        
			stringbuilder.append(((Object) (mIconUri)));
		//   41   79:aload           7
		//   42   81:aload_0         
		//   43   82:getfield        #60  <Field Uri mIconUri>
		//   44   85:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
		//   45   88:pop             
			obj1 = obj;
		//   46   89:aload           5
		//   47   91:astore          6
			avoid = ((Void []) (obj));
		//   48   93:aload           5
		//   49   95:astore_1        
			Log.w("MediaRouteCtrlDialog", stringbuilder.toString());
		//   50   96:ldc1            #44  <String "MediaRouteCtrlDialog">
		//   51   98:aload           7
		//   52  100:invokevirtual   #152 <Method String StringBuilder.toString()>
		//   53  103:invokestatic    #52  <Method int Log.w(String, String)>
		//   54  106:pop             
			int j;
			boolean flag;
			Exception exception;
			Object obj2;
			IOException ioexception1;
			if(obj != null)
		//*  55  107:aload           5
		//*  56  109:ifnull          117
				try
				{
					((InputStream) (obj)).close();
		//   57  112:aload           5
		//   58  114:invokevirtual   #157 <Method void InputStream.close()>
				}
		//*  59  117:aconst_null     
		//*  60  118:areturn         
		//*  61  119:astore          7
		//*  62  121:aload           6
		//*  63  123:astore          5
		//*  64  125:goto            459
		//*  65  128:aload           5
		//*  66  130:astore          6
		//*  67  132:aload           5
		//*  68  134:astore_1        
		//*  69  135:new             #159 <Class android.graphics.BitmapFactory$Options>
		//*  70  138:dup             
		//*  71  139:invokespecial   #160 <Method void android.graphics.BitmapFactory$Options()>
		//*  72  142:astore          7
		//*  73  144:aload           5
		//*  74  146:astore          6
		//*  75  148:aload           5
		//*  76  150:astore_1        
		//*  77  151:aload           7
		//*  78  153:iconst_1        
		//*  79  154:putfield        #164 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		//*  80  157:aload           5
		//*  81  159:astore          6
		//*  82  161:aload           5
		//*  83  163:astore_1        
		//*  84  164:aload           5
		//*  85  166:aconst_null     
		//*  86  167:aload           7
		//*  87  169:invokestatic    #170 <Method Bitmap BitmapFactory.decodeStream(InputStream, Rect, android.graphics.BitmapFactory$Options)>
		//*  88  172:pop             
		//*  89  173:aload           5
		//*  90  175:astore          6
		//*  91  177:aload           5
		//*  92  179:astore_1        
		//*  93  180:aload           7
		//*  94  182:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outWidth>
		//*  95  185:ifeq            435
		//*  96  188:aload           5
		//*  97  190:astore          6
		//*  98  192:aload           5
		//*  99  194:astore_1        
		//* 100  195:aload           7
		//* 101  197:getfield        #176 <Field int android.graphics.BitmapFactory$Options.outHeight>
		//* 102  200:istore_3        
		//* 103  201:iload_3         
		//* 104  202:ifne            208
		//* 105  205:goto            435
		//* 106  208:aload           5
		//* 107  210:astore_1        
		//* 108  211:aload           5
		//* 109  213:invokevirtual   #179 <Method void InputStream.reset()>
		//* 110  216:goto            308
		//* 111  219:aload           5
		//* 112  221:astore          6
		//* 113  223:aload           5
		//* 114  225:astore_1        
		//* 115  226:aload           5
		//* 116  228:invokevirtual   #157 <Method void InputStream.close()>
		//* 117  231:aload           5
		//* 118  233:astore          6
		//* 119  235:aload           5
		//* 120  237:astore_1        
		//* 121  238:aload_0         
		//* 122  239:aload_0         
		//* 123  240:getfield        #60  <Field Uri mIconUri>
		//* 124  243:invokespecial   #139 <Method InputStream openInputStreamByScheme(Uri)>
		//* 125  246:astore          5
		//* 126  248:aload           5
		//* 127  250:ifnonnull       308
		//* 128  253:new             #141 <Class StringBuilder>
		//* 129  256:dup             
		//* 130  257:invokespecial   #142 <Method void StringBuilder()>
		//* 131  260:astore_1        
		//* 132  261:aload_1         
		//* 133  262:ldc1            #144 <String "Unable to open: ">
		//* 134  264:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
		//* 135  267:pop             
		//* 136  268:aload_1         
		//* 137  269:aload_0         
		//* 138  270:getfield        #60  <Field Uri mIconUri>
		//* 139  273:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
		//* 140  276:pop             
		//* 141  277:ldc1            #44  <String "MediaRouteCtrlDialog">
		//* 142  279:aload_1         
		//* 143  280:invokevirtual   #152 <Method String StringBuilder.toString()>
		//* 144  283:invokestatic    #52  <Method int Log.w(String, String)>
		//* 145  286:pop             
		//* 146  287:aload           5
		//* 147  289:ifnull          297
		//* 148  292:aload           5
		//* 149  294:invokevirtual   #157 <Method void InputStream.close()>
		//* 150  297:aconst_null     
		//* 151  298:areturn         
		//* 152  299:astore_1        
		//* 153  300:goto            532
		//* 154  303:astore          7
		//* 155  305:goto            459
		//* 156  308:aload           5
		//* 157  310:astore          6
		//* 158  312:aload           5
		//* 159  314:astore_1        
		//* 160  315:aload           7
		//* 161  317:iconst_0        
		//* 162  318:putfield        #164 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		//* 163  321:aload           5
		//* 164  323:astore          6
		//* 165  325:aload           5
		//* 166  327:astore_1        
		//* 167  328:aload_0         
		//* 168  329:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//* 169  332:aload           7
		//* 170  334:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outWidth>
		//* 171  337:aload           7
		//* 172  339:getfield        #176 <Field int android.graphics.BitmapFactory$Options.outHeight>
		//* 173  342:invokevirtual   #183 <Method int MediaRouteControllerDialog.getDesiredArtHeight(int, int)>
		//* 174  345:istore_3        
		//* 175  346:aload           5
		//* 176  348:astore          6
		//* 177  350:aload           5
		//* 178  352:astore_1        
		//* 179  353:aload           7
		//* 180  355:iconst_1        
		//* 181  356:aload           7
		//* 182  358:getfield        #176 <Field int android.graphics.BitmapFactory$Options.outHeight>
		//* 183  361:iload_3         
		//* 184  362:idiv            
		//* 185  363:invokestatic    #189 <Method int Integer.highestOneBit(int)>
		//* 186  366:invokestatic    #194 <Method int Math.max(int, int)>
		//* 187  369:putfield        #197 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		//* 188  372:aload           5
		//* 189  374:astore          6
		//* 190  376:aload           5
		//* 191  378:astore_1        
		//* 192  379:aload_0         
		//* 193  380:invokevirtual   #201 <Method boolean isCancelled()>
		//* 194  383:istore          4
		//* 195  385:iload           4
		//* 196  387:ifeq            402
		//* 197  390:aload           5
		//* 198  392:ifnull          400
		//* 199  395:aload           5
		//* 200  397:invokevirtual   #157 <Method void InputStream.close()>
		//* 201  400:aconst_null     
		//* 202  401:areturn         
		//* 203  402:aload           5
		//* 204  404:astore          6
		//* 205  406:aload           5
		//* 206  408:astore_1        
		//* 207  409:aload           5
		//* 208  411:aconst_null     
		//* 209  412:aload           7
		//* 210  414:invokestatic    #170 <Method Bitmap BitmapFactory.decodeStream(InputStream, Rect, android.graphics.BitmapFactory$Options)>
		//* 211  417:astore          7
		//* 212  419:aload           5
		//* 213  421:ifnull          429
		//* 214  424:aload           5
		//* 215  426:invokevirtual   #157 <Method void InputStream.close()>
		//* 216  429:aload           7
		//* 217  431:astore_1        
		//* 218  432:goto            546
		//* 219  435:aload           5
		//* 220  437:ifnull          445
		//* 221  440:aload           5
		//* 222  442:invokevirtual   #157 <Method void InputStream.close()>
		//* 223  445:aconst_null     
		//* 224  446:areturn         
		//* 225  447:astore_1        
		//* 226  448:aconst_null     
		//* 227  449:astore          5
		//* 228  451:goto            532
		//* 229  454:astore          7
		//* 230  456:aconst_null     
		//* 231  457:astore          5
		//* 232  459:aload           5
		//* 233  461:astore_1        
		//* 234  462:new             #141 <Class StringBuilder>
		//* 235  465:dup             
		//* 236  466:invokespecial   #142 <Method void StringBuilder()>
		//* 237  469:astore          6
		//* 238  471:aload           5
		//* 239  473:astore_1        
		//* 240  474:aload           6
		//* 241  476:ldc1            #144 <String "Unable to open: ">
		//* 242  478:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
		//* 243  481:pop             
		//* 244  482:aload           5
		//* 245  484:astore_1        
		//* 246  485:aload           6
		//* 247  487:aload_0         
		//* 248  488:getfield        #60  <Field Uri mIconUri>
		//* 249  491:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
		//* 250  494:pop             
		//* 251  495:aload           5
		//* 252  497:astore_1        
		//* 253  498:ldc1            #44  <String "MediaRouteCtrlDialog">
		//* 254  500:aload           6
		//* 255  502:invokevirtual   #152 <Method String StringBuilder.toString()>
		//* 256  505:aload           7
		//* 257  507:invokestatic    #204 <Method int Log.w(String, String, Throwable)>
		//* 258  510:pop             
		//* 259  511:aload           5
		//* 260  513:ifnull          544
		//* 261  516:aload           5
		//* 262  518:invokevirtual   #157 <Method void InputStream.close()>
		//* 263  521:goto            544
		//* 264  524:astore          6
		//* 265  526:aload_1         
		//* 266  527:astore          5
		//* 267  529:aload           6
		//* 268  531:astore_1        
		//* 269  532:aload           5
		//* 270  534:ifnull          542
		//* 271  537:aload           5
		//* 272  539:invokevirtual   #157 <Method void InputStream.close()>
		//* 273  542:aload_1         
		//* 274  543:athrow          
		//* 275  544:aconst_null     
		//* 276  545:astore_1        
		//* 277  546:aload_0         
		//* 278  547:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//* 279  550:aload_1         
		//* 280  551:invokestatic    #42  <Method boolean MediaRouteControllerDialog.access$300(MediaRouteControllerDialog, Bitmap)>
		//* 281  554:ifeq            594
		//* 282  557:new             #141 <Class StringBuilder>
		//* 283  560:dup             
		//* 284  561:invokespecial   #142 <Method void StringBuilder()>
		//* 285  564:astore          5
		//* 286  566:aload           5
		//* 287  568:ldc1            #206 <String "Can't use recycled bitmap: ">
		//* 288  570:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
		//* 289  573:pop             
		//* 290  574:aload           5
		//* 291  576:aload_1         
		//* 292  577:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
		//* 293  580:pop             
		//* 294  581:ldc1            #44  <String "MediaRouteCtrlDialog">
		//* 295  583:aload           5
		//* 296  585:invokevirtual   #152 <Method String StringBuilder.toString()>
		//* 297  588:invokestatic    #52  <Method int Log.w(String, String)>
		//* 298  591:pop             
		//* 299  592:aconst_null     
		//* 300  593:areturn         
		//* 301  594:aload_1         
		//* 302  595:ifnull          665
		//* 303  598:aload_1         
		//* 304  599:invokevirtual   #212 <Method int Bitmap.getWidth()>
		//* 305  602:aload_1         
		//* 306  603:invokevirtual   #215 <Method int Bitmap.getHeight()>
		//* 307  606:icmpge          665
		//* 308  609:new             #217 <Class android.support.v7.graphics.Palette$Builder>
		//* 309  612:dup             
		//* 310  613:aload_1         
		//* 311  614:invokespecial   #220 <Method void android.support.v7.graphics.Palette$Builder(Bitmap)>
		//* 312  617:iconst_1        
		//* 313  618:invokevirtual   #224 <Method android.support.v7.graphics.Palette$Builder android.support.v7.graphics.Palette$Builder.maximumColorCount(int)>
		//* 314  621:invokevirtual   #228 <Method Palette android.support.v7.graphics.Palette$Builder.generate()>
		//* 315  624:astore          5
		//* 316  626:aload           5
		//* 317  628:invokevirtual   #234 <Method List Palette.getSwatches()>
		//* 318  631:invokeinterface #239 <Method boolean List.isEmpty()>
		//* 319  636:ifeq            642
		//* 320  639:goto            660
		//* 321  642:aload           5
		//* 322  644:invokevirtual   #234 <Method List Palette.getSwatches()>
		//* 323  647:iconst_0        
		//* 324  648:invokeinterface #243 <Method Object List.get(int)>
		//* 325  653:checkcast       #245 <Class android.support.v7.graphics.Palette$Swatch>
		//* 326  656:invokevirtual   #248 <Method int android.support.v7.graphics.Palette$Swatch.getRgb()>
		//* 327  659:istore_2        
		//* 328  660:aload_0         
		//* 329  661:iload_2         
		//* 330  662:putfield        #250 <Field int mBackgroundColor>
		//* 331  665:aload_1         
		//* 332  666:areturn         
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
		//* 333  667:astore_1        
				{
					return null;
		//  334  668:aconst_null     
		//  335  669:areturn         
				}
			return null;
			obj2;
			obj = obj1;
			  goto _L8
_L7:
			obj1 = obj;
			avoid = ((Void []) (obj));
			obj2 = ((Object) (new android.graphics.BitmapFactory.Options()));
			obj1 = obj;
			avoid = ((Void []) (obj));
			obj2.inJustDecodeBounds = true;
			obj1 = obj;
			avoid = ((Void []) (obj));
			BitmapFactory.decodeStream(((InputStream) (obj)), ((Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj2)));
			obj1 = obj;
			avoid = ((Void []) (obj));
			if(((android.graphics.BitmapFactory.Options) (obj2)).outWidth == 0) goto _L10; else goto _L9
_L9:
			obj1 = obj;
			avoid = ((Void []) (obj));
			j = ((android.graphics.BitmapFactory.Options) (obj2)).outHeight;
			if(j != 0) goto _L11; else goto _L10
_L11:
			avoid = ((Void []) (obj));
			((InputStream) (obj)).reset();
			  goto _L12
_L16:
			obj1 = obj;
			avoid = ((Void []) (obj));
			((InputStream) (obj)).close();
			obj1 = obj;
			avoid = ((Void []) (obj));
			obj = ((Object) (openInputStreamByScheme(mIconUri)));
			if(obj != null) goto _L12; else goto _L13
_L13:
			avoid = ((Void []) (new StringBuilder()));
			((StringBuilder) (avoid)).append("Unable to open: ");
			((StringBuilder) (avoid)).append(((Object) (mIconUri)));
			Log.w("MediaRouteCtrlDialog", ((StringBuilder) (avoid)).toString());
			if(obj != null)
				try
				{
					((InputStream) (obj)).close();
				}
		//* 336  670:astore_1        
		//* 337  671:goto            219
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
		//* 338  674:astore_1        
				{
					return null;
		//  339  675:aconst_null     
		//  340  676:areturn         
				}
			return null;
			avoid;
			  goto _L14
			obj2;
			  goto _L8
_L12:
			obj1 = obj;
			avoid = ((Void []) (obj));
			obj2.inJustDecodeBounds = false;
			obj1 = obj;
			avoid = ((Void []) (obj));
			j = getDesiredArtHeight(((android.graphics.BitmapFactory.Options) (obj2)).outWidth, ((android.graphics.BitmapFactory.Options) (obj2)).outHeight);
			obj1 = obj;
			avoid = ((Void []) (obj));
			obj2.inSampleSize = Math.max(1, Integer.highestOneBit(((android.graphics.BitmapFactory.Options) (obj2)).outHeight / j));
			obj1 = obj;
			avoid = ((Void []) (obj));
			flag = isCancelled();
			if(flag)
			{
				if(obj != null)
					try
					{
						((InputStream) (obj)).close();
					}
					// Misplaced declaration of an exception variable
					catch(Void avoid[])
		//* 341  677:astore_1        
					{
						return null;
		//  342  678:aconst_null     
		//  343  679:areturn         
					}
				return null;
			}
			obj1 = obj;
			avoid = ((Void []) (obj));
			obj2 = ((Object) (BitmapFactory.decodeStream(((InputStream) (obj)), ((Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj2)))));
			if(obj != null)
				try
				{
					((InputStream) (obj)).close();
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
		//  344  680:astore_1        
			avoid = ((Void []) (obj2));
			  goto _L3
_L10:
			if(obj != null)
				try
				{
					((InputStream) (obj)).close();
				}
		//* 345  681:goto            429
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
		//* 346  684:astore_1        
				{
					return null;
		//  347  685:aconst_null     
		//  348  686:areturn         
				}
			return null;
			avoid;
			obj = null;
			  goto _L14
			ioexception1;
			obj = null;
_L8:
			avoid = ((Void []) (obj));
			obj1 = ((Object) (new StringBuilder()));
			avoid = ((Void []) (obj));
			((StringBuilder) (obj1)).append("Unable to open: ");
			avoid = ((Void []) (obj));
			((StringBuilder) (obj1)).append(((Object) (mIconUri)));
			avoid = ((Void []) (obj));
			Log.w("MediaRouteCtrlDialog", ((StringBuilder) (obj1)).toString(), ((Throwable) (ioexception1)));
			if(obj != null)
				try
				{
					((InputStream) (obj)).close();
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
		//  349  687:astore_1        
			  goto _L5
			exception;
			obj = ((Object) (avoid));
			avoid = ((Void []) (exception));
_L14:
			if(obj != null)
				try
				{
					((InputStream) (obj)).close();
				}
		//* 350  688:goto            544
				catch(IOException ioexception) { }
		//  351  691:astore          5
			throw avoid;
_L5:
			avoid = null;
_L3:
			if(isBitmapRecycled(((Bitmap) (avoid))))
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Can't use recycled bitmap: ");
				((StringBuilder) (obj)).append(((Object) (avoid)));
				Log.w("MediaRouteCtrlDialog", ((StringBuilder) (obj)).toString());
				return null;
			}
			if(avoid != null && ((Bitmap) (avoid)).getWidth() < ((Bitmap) (avoid)).getHeight())
			{
				obj = ((Object) ((new android.support.v7.graphics.Palette.Builder(((Bitmap) (avoid)))).maximumColorCount(1).generate()));
				if(!((Palette) (obj)).getSwatches().isEmpty())
					i = ((android.support.v7.graphics.Palette.Swatch)((Palette) (obj)).getSwatches().get(0)).getRgb();
				mBackgroundColor = i;
			}
			return ((Bitmap) (avoid));
			avoid;
			if(true) goto _L16; else goto _L15
_L15:
		//* 352  693:goto            542
		}

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #253 <Class Void[]>
		//    3    5:invokevirtual   #255 <Method Bitmap doInBackground(Void[])>
		//    4    8:areturn         
		}

		public Bitmap getIconBitmap()
		{
			return mIconBitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field Bitmap mIconBitmap>
		//    2    4:areturn         
		}

		public Uri getIconUri()
		{
			return mIconUri;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field Uri mIconUri>
		//    2    4:areturn         
		}

		protected void onPostExecute(Bitmap bitmap)
		{
			mFetchArtTask = null;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//    2    4:aconst_null     
		//    3    5:putfield        #260 <Field MediaRouteControllerDialog$FetchArtTask MediaRouteControllerDialog.mFetchArtTask>
			if(!ObjectsCompat.equals(((Object) (mArtIconBitmap)), ((Object) (mIconBitmap))) || !ObjectsCompat.equals(((Object) (mArtIconUri)), ((Object) (mIconUri))))
		//*   4    8:aload_0         
		//*   5    9:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//*   6   12:getfield        #263 <Field Bitmap MediaRouteControllerDialog.mArtIconBitmap>
		//*   7   15:aload_0         
		//*   8   16:getfield        #54  <Field Bitmap mIconBitmap>
		//*   9   19:invokestatic    #268 <Method boolean ObjectsCompat.equals(Object, Object)>
		//*  10   22:ifeq            42
		//*  11   25:aload_0         
		//*  12   26:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//*  13   29:getfield        #271 <Field Uri MediaRouteControllerDialog.mArtIconUri>
		//*  14   32:aload_0         
		//*  15   33:getfield        #60  <Field Uri mIconUri>
		//*  16   36:invokestatic    #268 <Method boolean ObjectsCompat.equals(Object, Object)>
		//*  17   39:ifne            131
			{
				mArtIconBitmap = mIconBitmap;
		//   18   42:aload_0         
		//   19   43:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//   20   46:aload_0         
		//   21   47:getfield        #54  <Field Bitmap mIconBitmap>
		//   22   50:putfield        #263 <Field Bitmap MediaRouteControllerDialog.mArtIconBitmap>
				mArtIconLoadedBitmap = bitmap;
		//   23   53:aload_0         
		//   24   54:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//   25   57:aload_1         
		//   26   58:putfield        #274 <Field Bitmap MediaRouteControllerDialog.mArtIconLoadedBitmap>
				mArtIconUri = mIconUri;
		//   27   61:aload_0         
		//   28   62:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//   29   65:aload_0         
		//   30   66:getfield        #60  <Field Uri mIconUri>
		//   31   69:putfield        #271 <Field Uri MediaRouteControllerDialog.mArtIconUri>
				mArtIconBackgroundColor = mBackgroundColor;
		//   32   72:aload_0         
		//   33   73:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//   34   76:aload_0         
		//   35   77:getfield        #250 <Field int mBackgroundColor>
		//   36   80:putfield        #277 <Field int MediaRouteControllerDialog.mArtIconBackgroundColor>
				bitmap = ((Bitmap) (MediaRouteControllerDialog.this));
		//   37   83:aload_0         
		//   38   84:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//   39   87:astore_1        
				boolean flag = true;
		//   40   88:iconst_1        
		//   41   89:istore_2        
				bitmap.mArtIconIsLoaded = true;
		//   42   90:aload_1         
		//   43   91:iconst_1        
		//   44   92:putfield        #280 <Field boolean MediaRouteControllerDialog.mArtIconIsLoaded>
				long l = SystemClock.uptimeMillis();
		//   45   95:invokestatic    #286 <Method long SystemClock.uptimeMillis()>
		//   46   98:lstore_3        
				long l1 = mStartTimeMillis;
		//   47   99:aload_0         
		//   48  100:getfield        #288 <Field long mStartTimeMillis>
		//   49  103:lstore          5
				bitmap = ((Bitmap) (MediaRouteControllerDialog.this));
		//   50  105:aload_0         
		//   51  106:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//   52  109:astore_1        
				if(l - l1 <= 120L)
		//*  53  110:lload_3         
		//*  54  111:lload           5
		//*  55  113:lsub            
		//*  56  114:ldc2w           #11  <Long 120L>
		//*  57  117:lcmp            
		//*  58  118:ifle            124
		//*  59  121:goto            126
					flag = false;
		//   60  124:iconst_0        
		//   61  125:istore_2        
				((MediaRouteControllerDialog) (bitmap)).update(flag);
		//   62  126:aload_1         
		//   63  127:iload_2         
		//   64  128:invokevirtual   #292 <Method void MediaRouteControllerDialog.update(boolean)>
			}
		//   65  131:return          
		}

		protected volatile void onPostExecute(Object obj)
		{
			onPostExecute((Bitmap)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #208 <Class Bitmap>
		//    3    5:invokevirtual   #295 <Method void onPostExecute(Bitmap)>
		//    4    8:return          
		}

		protected void onPreExecute()
		{
			mStartTimeMillis = SystemClock.uptimeMillis();
		//    0    0:aload_0         
		//    1    1:invokestatic    #286 <Method long SystemClock.uptimeMillis()>
		//    2    4:putfield        #288 <Field long mStartTimeMillis>
			clearLoadedBitmap();
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field MediaRouteControllerDialog this$0>
		//    5   11:invokevirtual   #299 <Method void MediaRouteControllerDialog.clearLoadedBitmap()>
		//    6   14:return          
		}

		private static final long SHOW_ANIM_TIME_THRESHOLD_MILLIS = 120L;
		private int mBackgroundColor;
		private final Bitmap mIconBitmap;
		private final Uri mIconUri;
		private long mStartTimeMillis;
		final MediaRouteControllerDialog this$0;

		FetchArtTask()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #28  <Method void AsyncTask()>
			Object obj = ((Object) (mDescription));
		//    5    9:aload_1         
		//    6   10:getfield        #32  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
		//    7   13:astore_2        
			Object obj1 = null;
		//    8   14:aconst_null     
		//    9   15:astore          4
			if(obj == null)
		//*  10   17:aload_2         
		//*  11   18:ifnonnull       26
				obj = null;
		//   12   21:aconst_null     
		//   13   22:astore_2        
			else
		//*  14   23:goto            34
				obj = ((Object) (mDescription.getIconBitmap()));
		//   15   26:aload_1         
		//   16   27:getfield        #32  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
		//   17   30:invokevirtual   #38  <Method Bitmap MediaDescriptionCompat.getIconBitmap()>
		//   18   33:astore_2        
			Bitmap bitmap = ((Bitmap) (obj));
		//   19   34:aload_2         
		//   20   35:astore_3        
			if(isBitmapRecycled(((Bitmap) (obj))))
		//*  21   36:aload_1         
		//*  22   37:aload_2         
		//*  23   38:invokestatic    #42  <Method boolean MediaRouteControllerDialog.access$300(MediaRouteControllerDialog, Bitmap)>
		//*  24   41:ifeq            54
			{
				Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
		//   25   44:ldc1            #44  <String "MediaRouteCtrlDialog">
		//   26   46:ldc1            #46  <String "Can't fetch the given art bitmap because it's already recycled.">
		//   27   48:invokestatic    #52  <Method int Log.w(String, String)>
		//   28   51:pop             
				bitmap = null;
		//   29   52:aconst_null     
		//   30   53:astore_3        
			}
			mIconBitmap = bitmap;
		//   31   54:aload_0         
		//   32   55:aload_3         
		//   33   56:putfield        #54  <Field Bitmap mIconBitmap>
			if(mDescription == null)
		//*  34   59:aload_1         
		//*  35   60:getfield        #32  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
		//*  36   63:ifnonnull       72
				mediaroutecontrollerdialog = ((MediaRouteControllerDialog) (obj1));
		//   37   66:aload           4
		//   38   68:astore_1        
			else
		//*  39   69:goto            80
				mediaroutecontrollerdialog = ((MediaRouteControllerDialog) (mDescription.getIconUri()));
		//   40   72:aload_1         
		//   41   73:getfield        #32  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
		//   42   76:invokevirtual   #58  <Method Uri MediaDescriptionCompat.getIconUri()>
		//   43   79:astore_1        
			mIconUri = ((Uri) (MediaRouteControllerDialog.this));
		//   44   80:aload_0         
		//   45   81:aload_1         
		//   46   82:putfield        #60  <Field Uri mIconUri>
		//   47   85:return          
		}
	}

	private final class MediaControllerCallback extends android.support.v4.media.session.MediaControllerCompat.Callback
	{

		public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
		{
			MediaRouteControllerDialog mediaroutecontrollerdialog = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//    2    4:astore_2        
			if(mediametadatacompat == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       14
				mediametadatacompat = null;
		//    5    9:aconst_null     
		//    6   10:astore_1        
			else
		//*   7   11:goto            19
				mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.getDescription()));
		//    8   14:aload_1         
		//    9   15:invokevirtual   #25  <Method MediaDescriptionCompat MediaMetadataCompat.getDescription()>
		//   10   18:astore_1        
			mediaroutecontrollerdialog.mDescription = ((MediaDescriptionCompat) (mediametadatacompat));
		//   11   19:aload_2         
		//   12   20:aload_1         
		//   13   21:putfield        #29  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
			updateArtIconIfNeeded();
		//   14   24:aload_0         
		//   15   25:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//   16   28:invokevirtual   #32  <Method void MediaRouteControllerDialog.updateArtIconIfNeeded()>
			update(false);
		//   17   31:aload_0         
		//   18   32:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//   19   35:iconst_0        
		//   20   36:invokevirtual   #36  <Method void MediaRouteControllerDialog.update(boolean)>
		//   21   39:return          
		}

		public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
		{
			mState = playbackstatecompat;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//    2    4:aload_1         
		//    3    5:putfield        #42  <Field PlaybackStateCompat MediaRouteControllerDialog.mState>
			update(false);
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//    6   12:iconst_0        
		//    7   13:invokevirtual   #36  <Method void MediaRouteControllerDialog.update(boolean)>
		//    8   16:return          
		}

		public void onSessionDestroyed()
		{
			if(mMediaController != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//*   2    4:getfield        #47  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//*   3    7:ifnull          35
			{
				mMediaController.unregisterCallback(((android.support.v4.media.session.MediaControllerCompat.Callback) (mControllerCallback)));
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//    6   14:getfield        #47  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//    7   17:aload_0         
		//    8   18:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//    9   21:getfield        #51  <Field MediaRouteControllerDialog$MediaControllerCallback MediaRouteControllerDialog.mControllerCallback>
		//   10   24:invokevirtual   #57  <Method void MediaControllerCompat.unregisterCallback(android.support.v4.media.session.MediaControllerCompat$Callback)>
				mMediaController = null;
		//   11   27:aload_0         
		//   12   28:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//   13   31:aconst_null     
		//   14   32:putfield        #47  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
			}
		//   15   35:return          
		}

		final MediaRouteControllerDialog this$0;

		MediaControllerCallback()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.support.v4.media.session.MediaControllerCompat$Callback()>
		//    5    9:return          
		}
	}

	private final class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
	{

		public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			update(true);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #23  <Method void MediaRouteControllerDialog.update(boolean)>
		//    4    8:return          
		}

		public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			update(false);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #23  <Method void MediaRouteControllerDialog.update(boolean)>
		//    4    8:return          
		}

		public void onRouteVolumeChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			mediarouter = ((MediaRouter) ((SeekBar)mVolumeSliderMap.get(((Object) (routeinfo)))));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//    2    4:getfield        #29  <Field Map MediaRouteControllerDialog.mVolumeSliderMap>
		//    3    7:aload_2         
		//    4    8:invokeinterface #35  <Method Object Map.get(Object)>
		//    5   13:checkcast       #37  <Class SeekBar>
		//    6   16:astore_1        
			int i = routeinfo.getVolume();
		//    7   17:aload_2         
		//    8   18:invokevirtual   #43  <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
		//    9   21:istore_3        
			if(MediaRouteControllerDialog.DEBUG)
		//*  10   22:getstatic       #47  <Field boolean MediaRouteControllerDialog.DEBUG>
		//*  11   25:ifeq            63
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   12   28:new             #49  <Class StringBuilder>
		//   13   31:dup             
		//   14   32:invokespecial   #50  <Method void StringBuilder()>
		//   15   35:astore          4
				stringbuilder.append("onRouteVolumeChanged(), route.getVolume:");
		//   16   37:aload           4
		//   17   39:ldc1            #52  <String "onRouteVolumeChanged(), route.getVolume:">
		//   18   41:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   19   44:pop             
				stringbuilder.append(i);
		//   20   45:aload           4
		//   21   47:iload_3         
		//   22   48:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
		//   23   51:pop             
				Log.d("MediaRouteCtrlDialog", stringbuilder.toString());
		//   24   52:ldc1            #61  <String "MediaRouteCtrlDialog">
		//   25   54:aload           4
		//   26   56:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   27   59:invokestatic    #71  <Method int Log.d(String, String)>
		//   28   62:pop             
			}
			if(mediarouter != null && mRouteInVolumeSliderTouched != routeinfo)
		//*  29   63:aload_1         
		//*  30   64:ifnull          83
		//*  31   67:aload_0         
		//*  32   68:getfield        #13  <Field MediaRouteControllerDialog this$0>
		//*  33   71:getfield        #75  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
		//*  34   74:aload_2         
		//*  35   75:if_acmpeq       83
				((SeekBar) (mediarouter)).setProgress(i);
		//   36   78:aload_1         
		//   37   79:iload_3         
		//   38   80:invokevirtual   #79  <Method void SeekBar.setProgress(int)>
		//   39   83:return          
		}

		final MediaRouteControllerDialog this$0;

		MediaRouterCallback()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.support.v7.media.MediaRouter$Callback()>
		//    5    9:return          
		}
	}

	private class VolumeChangeListener
		implements android.widget.SeekBar.OnSeekBarChangeListener
	{

		public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
		{
			if(flag)
		//*   0    0:iload_3         
		//*   1    1:ifeq            66
			{
				seekbar = ((SeekBar) ((android.support.v7.media.MediaRouter.RouteInfo)seekbar.getTag()));
		//    2    4:aload_1         
		//    3    5:invokevirtual   #36  <Method Object SeekBar.getTag()>
		//    4    8:checkcast       #38  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//    5   11:astore_1        
				if(MediaRouteControllerDialog.DEBUG)
		//*   6   12:getstatic       #42  <Field boolean MediaRouteControllerDialog.DEBUG>
		//*   7   15:ifeq            61
				{
					StringBuilder stringbuilder = new StringBuilder();
		//    8   18:new             #44  <Class StringBuilder>
		//    9   21:dup             
		//   10   22:invokespecial   #45  <Method void StringBuilder()>
		//   11   25:astore          4
					stringbuilder.append("onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(");
		//   12   27:aload           4
		//   13   29:ldc1            #47  <String "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(">
		//   14   31:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   15   34:pop             
					stringbuilder.append(i);
		//   16   35:aload           4
		//   17   37:iload_2         
		//   18   38:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
		//   19   41:pop             
					stringbuilder.append(")");
		//   20   42:aload           4
		//   21   44:ldc1            #56  <String ")">
		//   22   46:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   23   49:pop             
					Log.d("MediaRouteCtrlDialog", stringbuilder.toString());
		//   24   50:ldc1            #58  <String "MediaRouteCtrlDialog">
		//   25   52:aload           4
		//   26   54:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   27   57:invokestatic    #68  <Method int Log.d(String, String)>
		//   28   60:pop             
				}
				((android.support.v7.media.MediaRouter.RouteInfo) (seekbar)).requestSetVolume(i);
		//   29   61:aload_1         
		//   30   62:iload_2         
		//   31   63:invokevirtual   #72  <Method void android.support.v7.media.MediaRouter$RouteInfo.requestSetVolume(int)>
			}
		//   32   66:return          
		}

		public void onStartTrackingTouch(SeekBar seekbar)
		{
			if(mRouteInVolumeSliderTouched != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field MediaRouteControllerDialog this$0>
		//*   2    4:getfield        #78  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
		//*   3    7:ifnull          25
				mVolumeSlider.removeCallbacks(mStopTrackingTouch);
		//    4   10:aload_0         
		//    5   11:getfield        #19  <Field MediaRouteControllerDialog this$0>
		//    6   14:getfield        #82  <Field SeekBar MediaRouteControllerDialog.mVolumeSlider>
		//    7   17:aload_0         
		//    8   18:getfield        #27  <Field Runnable mStopTrackingTouch>
		//    9   21:invokevirtual   #86  <Method boolean SeekBar.removeCallbacks(Runnable)>
		//   10   24:pop             
			mRouteInVolumeSliderTouched = (android.support.v7.media.MediaRouter.RouteInfo)seekbar.getTag();
		//   11   25:aload_0         
		//   12   26:getfield        #19  <Field MediaRouteControllerDialog this$0>
		//   13   29:aload_1         
		//   14   30:invokevirtual   #36  <Method Object SeekBar.getTag()>
		//   15   33:checkcast       #38  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   16   36:putfield        #78  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
		//   17   39:return          
		}

		public void onStopTrackingTouch(SeekBar seekbar)
		{
			mVolumeSlider.postDelayed(mStopTrackingTouch, 500L);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field MediaRouteControllerDialog this$0>
		//    2    4:getfield        #82  <Field SeekBar MediaRouteControllerDialog.mVolumeSlider>
		//    3    7:aload_0         
		//    4    8:getfield        #27  <Field Runnable mStopTrackingTouch>
		//    5   11:ldc2w           #88  <Long 500L>
		//    6   14:invokevirtual   #93  <Method boolean SeekBar.postDelayed(Runnable, long)>
		//    7   17:pop             
		//    8   18:return          
		}

		private final Runnable mStopTrackingTouch = new _cls1();
		final MediaRouteControllerDialog this$0;

		VolumeChangeListener()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #11  <Class MediaRouteControllerDialog$VolumeChangeListener$1>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:invokespecial   #25  <Method void MediaRouteControllerDialog$VolumeChangeListener$1(MediaRouteControllerDialog$VolumeChangeListener)>
		//   10   18:putfield        #27  <Field Runnable mStopTrackingTouch>
		//   11   21:return          
		}
	}

	private class VolumeGroupAdapter extends ArrayAdapter
	{

		public View getView(int i, View view, ViewGroup viewgroup)
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore          4
			if(view == null)
		//*   2    3:aload_2         
		//*   3    4:ifnonnull       26
				view = LayoutInflater.from(viewgroup.getContext()).inflate(android.support.v7.mediarouter.R.layout.mr_controller_volume_item, viewgroup, false);
		//    4    7:aload_3         
		//    5    8:invokevirtual   #38  <Method Context ViewGroup.getContext()>
		//    6   11:invokestatic    #44  <Method LayoutInflater LayoutInflater.from(Context)>
		//    7   14:getstatic       #50  <Field int android.support.v7.mediarouter.R$layout.mr_controller_volume_item>
		//    8   17:aload_3         
		//    9   18:iconst_0        
		//   10   19:invokevirtual   #54  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   11   22:astore_2        
			else
		//*  12   23:goto            34
				updateVolumeGroupItemHeight(view);
		//   13   26:aload_0         
		//   14   27:getfield        #16  <Field MediaRouteControllerDialog this$0>
		//   15   30:aload_2         
		//   16   31:invokevirtual   #58  <Method void MediaRouteControllerDialog.updateVolumeGroupItemHeight(View)>
			android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)getItem(i);
		//   17   34:aload_0         
		//   18   35:iload_1         
		//   19   36:invokevirtual   #62  <Method Object getItem(int)>
		//   20   39:checkcast       #64  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   21   42:astore          6
			if(routeinfo != null)
		//*  22   44:aload           6
		//*  23   46:ifnull          361
			{
				boolean flag1 = routeinfo.isEnabled();
		//   24   49:aload           6
		//   25   51:invokevirtual   #68  <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isEnabled()>
		//   26   54:istore          5
				Object obj = ((Object) ((TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_name)));
		//   27   56:aload_2         
		//   28   57:getstatic       #73  <Field int android.support.v7.mediarouter.R$id.mr_name>
		//   29   60:invokevirtual   #79  <Method View View.findViewById(int)>
		//   30   63:checkcast       #81  <Class TextView>
		//   31   66:astore          7
				((TextView) (obj)).setEnabled(flag1);
		//   32   68:aload           7
		//   33   70:iload           5
		//   34   72:invokevirtual   #85  <Method void TextView.setEnabled(boolean)>
				((TextView) (obj)).setText(((CharSequence) (routeinfo.getName())));
		//   35   75:aload           7
		//   36   77:aload           6
		//   37   79:invokevirtual   #89  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
		//   38   82:invokevirtual   #93  <Method void TextView.setText(CharSequence)>
				obj = ((Object) ((MediaRouteVolumeSlider)view.findViewById(android.support.v7.mediarouter.R.id.mr_volume_slider)));
		//   39   85:aload_2         
		//   40   86:getstatic       #96  <Field int android.support.v7.mediarouter.R$id.mr_volume_slider>
		//   41   89:invokevirtual   #79  <Method View View.findViewById(int)>
		//   42   92:checkcast       #98  <Class MediaRouteVolumeSlider>
		//   43   95:astore          7
				MediaRouterThemeHelper.setVolumeSliderColor(viewgroup.getContext(), ((MediaRouteVolumeSlider) (obj)), ((View) (mVolumeGroupList)));
		//   44   97:aload_3         
		//   45   98:invokevirtual   #38  <Method Context ViewGroup.getContext()>
		//   46  101:aload           7
		//   47  103:aload_0         
		//   48  104:getfield        #16  <Field MediaRouteControllerDialog this$0>
		//   49  107:getfield        #102 <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
		//   50  110:invokestatic    #106 <Method void MediaRouterThemeHelper.setVolumeSliderColor(Context, MediaRouteVolumeSlider, View)>
				((MediaRouteVolumeSlider) (obj)).setTag(((Object) (routeinfo)));
		//   51  113:aload           7
		//   52  115:aload           6
		//   53  117:invokevirtual   #110 <Method void MediaRouteVolumeSlider.setTag(Object)>
				mVolumeSliderMap.put(((Object) (routeinfo)), obj);
		//   54  120:aload_0         
		//   55  121:getfield        #16  <Field MediaRouteControllerDialog this$0>
		//   56  124:getfield        #114 <Field Map MediaRouteControllerDialog.mVolumeSliderMap>
		//   57  127:aload           6
		//   58  129:aload           7
		//   59  131:invokeinterface #120 <Method Object Map.put(Object, Object)>
		//   60  136:pop             
				((MediaRouteVolumeSlider) (obj)).setHideThumb(flag1 ^ true);
		//   61  137:aload           7
		//   62  139:iload           5
		//   63  141:iconst_1        
		//   64  142:ixor            
		//   65  143:invokevirtual   #123 <Method void MediaRouteVolumeSlider.setHideThumb(boolean)>
				((MediaRouteVolumeSlider) (obj)).setEnabled(flag1);
		//   66  146:aload           7
		//   67  148:iload           5
		//   68  150:invokevirtual   #124 <Method void MediaRouteVolumeSlider.setEnabled(boolean)>
				if(flag1)
		//*  69  153:iload           5
		//*  70  155:ifeq            225
					if(isVolumeControlAvailable(routeinfo))
		//*  71  158:aload_0         
		//*  72  159:getfield        #16  <Field MediaRouteControllerDialog this$0>
		//*  73  162:aload           6
		//*  74  164:invokevirtual   #128 <Method boolean MediaRouteControllerDialog.isVolumeControlAvailable(android.support.v7.media.MediaRouter$RouteInfo)>
		//*  75  167:ifeq            205
					{
						((MediaRouteVolumeSlider) (obj)).setMax(routeinfo.getVolumeMax());
		//   76  170:aload           7
		//   77  172:aload           6
		//   78  174:invokevirtual   #132 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolumeMax()>
		//   79  177:invokevirtual   #136 <Method void MediaRouteVolumeSlider.setMax(int)>
						((MediaRouteVolumeSlider) (obj)).setProgress(routeinfo.getVolume());
		//   80  180:aload           7
		//   81  182:aload           6
		//   82  184:invokevirtual   #139 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
		//   83  187:invokevirtual   #142 <Method void MediaRouteVolumeSlider.setProgress(int)>
						((MediaRouteVolumeSlider) (obj)).setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
		//   84  190:aload           7
		//   85  192:aload_0         
		//   86  193:getfield        #16  <Field MediaRouteControllerDialog this$0>
		//   87  196:getfield        #146 <Field MediaRouteControllerDialog$VolumeChangeListener MediaRouteControllerDialog.mVolumeChangeListener>
		//   88  199:invokevirtual   #150 <Method void MediaRouteVolumeSlider.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
					} else
		//*  89  202:goto            225
					{
						((MediaRouteVolumeSlider) (obj)).setMax(100);
		//   90  205:aload           7
		//   91  207:bipush          100
		//   92  209:invokevirtual   #136 <Method void MediaRouteVolumeSlider.setMax(int)>
						((MediaRouteVolumeSlider) (obj)).setProgress(100);
		//   93  212:aload           7
		//   94  214:bipush          100
		//   95  216:invokevirtual   #142 <Method void MediaRouteVolumeSlider.setProgress(int)>
						((MediaRouteVolumeSlider) (obj)).setEnabled(false);
		//   96  219:aload           7
		//   97  221:iconst_0        
		//   98  222:invokevirtual   #124 <Method void MediaRouteVolumeSlider.setEnabled(boolean)>
					}
				viewgroup = ((ViewGroup) ((ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_volume_item_icon)));
		//   99  225:aload_2         
		//  100  226:getstatic       #153 <Field int android.support.v7.mediarouter.R$id.mr_volume_item_icon>
		//  101  229:invokevirtual   #79  <Method View View.findViewById(int)>
		//  102  232:checkcast       #155 <Class ImageView>
		//  103  235:astore_3        
				if(flag1)
		//* 104  236:iload           5
		//* 105  238:ifeq            248
					i = 255;
		//  106  241:sipush          255
		//  107  244:istore_1        
				else
		//* 108  245:goto            257
					i = (int)(255F * mDisabledAlpha);
		//  109  248:ldc1            #156 <Float 255F>
		//  110  250:aload_0         
		//  111  251:getfield        #27  <Field float mDisabledAlpha>
		//  112  254:fmul            
		//  113  255:f2i             
		//  114  256:istore_1        
				((ImageView) (viewgroup)).setAlpha(i);
		//  115  257:aload_3         
		//  116  258:iload_1         
		//  117  259:invokevirtual   #159 <Method void ImageView.setAlpha(int)>
				viewgroup = ((ViewGroup) ((LinearLayout)view.findViewById(android.support.v7.mediarouter.R.id.volume_item_container)));
		//  118  262:aload_2         
		//  119  263:getstatic       #162 <Field int android.support.v7.mediarouter.R$id.volume_item_container>
		//  120  266:invokevirtual   #79  <Method View View.findViewById(int)>
		//  121  269:checkcast       #164 <Class LinearLayout>
		//  122  272:astore_3        
				i = ((int) (flag));
		//  123  273:iload           4
		//  124  275:istore_1        
				if(mGroupMemberRoutesAnimatingWithBitmap.contains(((Object) (routeinfo))))
		//* 125  276:aload_0         
		//* 126  277:getfield        #16  <Field MediaRouteControllerDialog this$0>
		//* 127  280:getfield        #168 <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAnimatingWithBitmap>
		//* 128  283:aload           6
		//* 129  285:invokeinterface #174 <Method boolean Set.contains(Object)>
		//* 130  290:ifeq            295
					i = 4;
		//  131  293:iconst_4        
		//  132  294:istore_1        
				((LinearLayout) (viewgroup)).setVisibility(i);
		//  133  295:aload_3         
		//  134  296:iload_1         
		//  135  297:invokevirtual   #177 <Method void LinearLayout.setVisibility(int)>
				if(mGroupMemberRoutesAdded != null && mGroupMemberRoutesAdded.contains(((Object) (routeinfo))))
		//* 136  300:aload_0         
		//* 137  301:getfield        #16  <Field MediaRouteControllerDialog this$0>
		//* 138  304:getfield        #180 <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAdded>
		//* 139  307:ifnull          361
		//* 140  310:aload_0         
		//* 141  311:getfield        #16  <Field MediaRouteControllerDialog this$0>
		//* 142  314:getfield        #180 <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAdded>
		//* 143  317:aload           6
		//* 144  319:invokeinterface #174 <Method boolean Set.contains(Object)>
		//* 145  324:ifeq            361
				{
					viewgroup = ((ViewGroup) (new AlphaAnimation(0.0F, 0.0F)));
		//  146  327:new             #182 <Class AlphaAnimation>
		//  147  330:dup             
		//  148  331:fconst_0        
		//  149  332:fconst_0        
		//  150  333:invokespecial   #185 <Method void AlphaAnimation(float, float)>
		//  151  336:astore_3        
					((Animation) (viewgroup)).setDuration(0L);
		//  152  337:aload_3         
		//  153  338:lconst_0        
		//  154  339:invokevirtual   #191 <Method void Animation.setDuration(long)>
					((Animation) (viewgroup)).setFillEnabled(true);
		//  155  342:aload_3         
		//  156  343:iconst_1        
		//  157  344:invokevirtual   #194 <Method void Animation.setFillEnabled(boolean)>
					((Animation) (viewgroup)).setFillAfter(true);
		//  158  347:aload_3         
		//  159  348:iconst_1        
		//  160  349:invokevirtual   #197 <Method void Animation.setFillAfter(boolean)>
					view.clearAnimation();
		//  161  352:aload_2         
		//  162  353:invokevirtual   #201 <Method void View.clearAnimation()>
					view.startAnimation(((Animation) (viewgroup)));
		//  163  356:aload_2         
		//  164  357:aload_3         
		//  165  358:invokevirtual   #205 <Method void View.startAnimation(Animation)>
				}
			}
			return view;
		//  166  361:aload_2         
		//  167  362:areturn         
		}

		public boolean isEnabled(int i)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		final float mDisabledAlpha;
		final MediaRouteControllerDialog this$0;

		public VolumeGroupAdapter(Context context, List list)
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaRouteControllerDialog this$0>
			super(context, 0, list);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:iconst_0        
		//    6    8:aload_3         
		//    7    9:invokespecial   #19  <Method void ArrayAdapter(Context, int, List)>
			mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
		//    8   12:aload_0         
		//    9   13:aload_2         
		//   10   14:invokestatic    #25  <Method float MediaRouterThemeHelper.getDisabledAlpha(Context)>
		//   11   17:putfield        #27  <Field float mDisabledAlpha>
		//   12   20:return          
		}
	}


	public MediaRouteControllerDialog(Context context)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #191 <Method void MediaRouteControllerDialog(Context, int)>
	//    4    6:return          
	}

	public MediaRouteControllerDialog(Context context, int i)
	{
		context = MediaRouterThemeHelper.createThemedDialogContext(context, i, true);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #197 <Method Context MediaRouterThemeHelper.createThemedDialogContext(Context, int, boolean)>
	//    4    6:astore_1        
		super(context, MediaRouterThemeHelper.createThemedDialogStyle(context));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_1         
	//    8   10:invokestatic    #201 <Method int MediaRouterThemeHelper.createThemedDialogStyle(Context)>
	//    9   13:invokespecial   #202 <Method void AlertDialog(Context, int)>
		mVolumeControlEnabled = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #204 <Field boolean mVolumeControlEnabled>
	//   13   21:aload_0         
	//   14   22:new             #6   <Class MediaRouteControllerDialog$1>
	//   15   25:dup             
	//   16   26:aload_0         
	//   17   27:invokespecial   #207 <Method void MediaRouteControllerDialog$1(MediaRouteControllerDialog)>
	//   18   30:putfield        #209 <Field Runnable mGroupListFadeInAnimation>
		mContext = getContext();
	//   19   33:aload_0         
	//   20   34:aload_0         
	//   21   35:invokevirtual   #213 <Method Context getContext()>
	//   22   38:putfield        #215 <Field Context mContext>
		mControllerCallback = new MediaControllerCallback();
	//   23   41:aload_0         
	//   24   42:new             #36  <Class MediaRouteControllerDialog$MediaControllerCallback>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:invokespecial   #216 <Method void MediaRouteControllerDialog$MediaControllerCallback(MediaRouteControllerDialog)>
	//   28   50:putfield        #218 <Field MediaRouteControllerDialog$MediaControllerCallback mControllerCallback>
		mRouter = MediaRouter.getInstance(mContext);
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #215 <Field Context mContext>
	//   32   58:invokestatic    #224 <Method MediaRouter MediaRouter.getInstance(Context)>
	//   33   61:putfield        #226 <Field MediaRouter mRouter>
		mCallback = new MediaRouterCallback();
	//   34   64:aload_0         
	//   35   65:new             #39  <Class MediaRouteControllerDialog$MediaRouterCallback>
	//   36   68:dup             
	//   37   69:aload_0         
	//   38   70:invokespecial   #227 <Method void MediaRouteControllerDialog$MediaRouterCallback(MediaRouteControllerDialog)>
	//   39   73:putfield        #229 <Field MediaRouteControllerDialog$MediaRouterCallback mCallback>
		mRoute = mRouter.getSelectedRoute();
	//   40   76:aload_0         
	//   41   77:aload_0         
	//   42   78:getfield        #226 <Field MediaRouter mRouter>
	//   43   81:invokevirtual   #233 <Method android.support.v7.media.MediaRouter$RouteInfo MediaRouter.getSelectedRoute()>
	//   44   84:putfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
		setMediaSession(mRouter.getMediaSessionToken());
	//   45   87:aload_0         
	//   46   88:aload_0         
	//   47   89:getfield        #226 <Field MediaRouter mRouter>
	//   48   92:invokevirtual   #239 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaRouter.getMediaSessionToken()>
	//   49   95:invokespecial   #243 <Method void setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
		mVolumeGroupListPaddingTop = mContext.getResources().getDimensionPixelSize(android.support.v7.mediarouter.R.dimen.mr_controller_volume_group_list_padding_top);
	//   50   98:aload_0         
	//   51   99:aload_0         
	//   52  100:getfield        #215 <Field Context mContext>
	//   53  103:invokevirtual   #249 <Method Resources Context.getResources()>
	//   54  106:getstatic       #254 <Field int android.support.v7.mediarouter.R$dimen.mr_controller_volume_group_list_padding_top>
	//   55  109:invokevirtual   #260 <Method int Resources.getDimensionPixelSize(int)>
	//   56  112:putfield        #262 <Field int mVolumeGroupListPaddingTop>
		mAccessibilityManager = (AccessibilityManager)mContext.getSystemService("accessibility");
	//   57  115:aload_0         
	//   58  116:aload_0         
	//   59  117:getfield        #215 <Field Context mContext>
	//   60  120:ldc2            #264 <String "accessibility">
	//   61  123:invokevirtual   #268 <Method Object Context.getSystemService(String)>
	//   62  126:checkcast       #270 <Class AccessibilityManager>
	//   63  129:putfield        #272 <Field AccessibilityManager mAccessibilityManager>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  64  132:getstatic       #277 <Field int android.os.Build$VERSION.SDK_INT>
	//*  65  135:bipush          21
	//*  66  137:icmplt          162
		{
			mLinearOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, android.support.v7.mediarouter.R.interpolator.mr_linear_out_slow_in);
	//   67  140:aload_0         
	//   68  141:aload_1         
	//   69  142:getstatic       #282 <Field int android.support.v7.mediarouter.R$interpolator.mr_linear_out_slow_in>
	//   70  145:invokestatic    #288 <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//   71  148:putfield        #290 <Field Interpolator mLinearOutSlowInInterpolator>
			mFastOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, android.support.v7.mediarouter.R.interpolator.mr_fast_out_slow_in);
	//   72  151:aload_0         
	//   73  152:aload_1         
	//   74  153:getstatic       #293 <Field int android.support.v7.mediarouter.R$interpolator.mr_fast_out_slow_in>
	//   75  156:invokestatic    #288 <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//   76  159:putfield        #295 <Field Interpolator mFastOutSlowInInterpolator>
		}
		mAccelerateDecelerateInterpolator = ((Interpolator) (new AccelerateDecelerateInterpolator()));
	//   77  162:aload_0         
	//   78  163:new             #297 <Class AccelerateDecelerateInterpolator>
	//   79  166:dup             
	//   80  167:invokespecial   #299 <Method void AccelerateDecelerateInterpolator()>
	//   81  170:putfield        #301 <Field Interpolator mAccelerateDecelerateInterpolator>
	//   82  173:return          
	}

	private void animateGroupListItems(final Map previousRouteBoundMap, final Map previousRouteBitmapMap)
	{
		mVolumeGroupList.setEnabled(false);
	//    0    0:aload_0         
	//    1    1:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #331 <Method void OverlayListView.setEnabled(boolean)>
		mVolumeGroupList.requestLayout();
	//    4    8:aload_0         
	//    5    9:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//    6   12:invokevirtual   #334 <Method void OverlayListView.requestLayout()>
		mIsGroupListAnimating = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #336 <Field boolean mIsGroupListAnimating>
		mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field MediaRouteControllerDialog this$0>
			//    2    4:getfield        #33  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
			//    3    7:invokevirtual   #39  <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
			//    4   10:aload_0         
			//    5   11:invokevirtual   #45  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				animateGroupListItemsInternal(previousRouteBoundMap, previousRouteBitmapMap);
			//    6   14:aload_0         
			//    7   15:getfield        #20  <Field MediaRouteControllerDialog this$0>
			//    8   18:aload_0         
			//    9   19:getfield        #22  <Field Map val$previousRouteBoundMap>
			//   10   22:aload_0         
			//   11   23:getfield        #24  <Field Map val$previousRouteBitmapMap>
			//   12   26:invokevirtual   #48  <Method void MediaRouteControllerDialog.animateGroupListItemsInternal(Map, Map)>
			//   13   29:return          
			}

			final MediaRouteControllerDialog this$0;
			final Map val$previousRouteBitmapMap;
			final Map val$previousRouteBoundMap;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaRouteControllerDialog this$0>
				previousRouteBoundMap = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Map val$previousRouteBoundMap>
				previousRouteBitmapMap = map1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field Map val$previousRouteBitmapMap>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   10   20:aload_0         
	//   11   21:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//   12   24:invokevirtual   #340 <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
	//   13   27:new             #26  <Class MediaRouteControllerDialog$8>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #343 <Method void MediaRouteControllerDialog$8(MediaRouteControllerDialog, Map, Map)>
	//   19   37:invokevirtual   #349 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   20   40:return          
	}

	private void animateLayoutHeight(View view, int i)
	{
		Animation animation = new Animation() {

			protected void applyTransformation(float f, Transformation transformation)
			{
				int j = startValue;
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field int val$startValue>
			//    2    4:istore_3        
				int k = (int)((float)(startValue - endValue) * f);
			//    3    5:aload_0         
			//    4    6:getfield        #22  <Field int val$startValue>
			//    5    9:aload_0         
			//    6   10:getfield        #24  <Field int val$endValue>
			//    7   13:isub            
			//    8   14:i2f             
			//    9   15:fload_1         
			//   10   16:fmul            
			//   11   17:f2i             
			//   12   18:istore          4
				MediaRouteControllerDialog.setLayoutHeight(view, j - k);
			//   13   20:aload_0         
			//   14   21:getfield        #26  <Field View val$view>
			//   15   24:iload_3         
			//   16   25:iload           4
			//   17   27:isub            
			//   18   28:invokestatic    #35  <Method void MediaRouteControllerDialog.setLayoutHeight(View, int)>
			//   19   31:return          
			}

			final MediaRouteControllerDialog this$0;
			final int val$endValue;
			final int val$startValue;
			final View val$view;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaRouteControllerDialog this$0>
				startValue = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$startValue>
				endValue = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int val$endValue>
				view = view1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #26  <Field View val$view>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #29  <Method void Animation()>
			//   14   25:return          
			}
		}
;
	//    0    0:new             #24  <Class MediaRouteControllerDialog$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #357 <Method int getLayoutHeight(View)>
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokespecial   #360 <Method void MediaRouteControllerDialog$7(MediaRouteControllerDialog, int, int, View)>
	//    8   14:astore_3        
		((Animation) (animation)).setDuration(mGroupListAnimationDurationMs);
	//    9   15:aload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #362 <Field int mGroupListAnimationDurationMs>
	//   12   20:i2l             
	//   13   21:invokevirtual   #368 <Method void Animation.setDuration(long)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  14   24:getstatic       #277 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   27:bipush          21
	//*  16   29:icmplt          40
			((Animation) (animation)).setInterpolator(mInterpolator);
	//   17   32:aload_3         
	//   18   33:aload_0         
	//   19   34:getfield        #370 <Field Interpolator mInterpolator>
	//   20   37:invokevirtual   #374 <Method void Animation.setInterpolator(Interpolator)>
		view.startAnimation(((Animation) (animation)));
	//   21   40:aload_1         
	//   22   41:aload_3         
	//   23   42:invokevirtual   #380 <Method void View.startAnimation(Animation)>
	//   24   45:return          
	}

	private boolean canShowPlaybackControlLayout()
	{
		return mCustomControlView == null && (mDescription != null || mState != null);
	//    0    0:aload_0         
	//    1    1:getfield        #383 <Field View mCustomControlView>
	//    2    4:ifnonnull       23
	//    3    7:aload_0         
	//    4    8:getfield        #385 <Field MediaDescriptionCompat mDescription>
	//    5   11:ifnonnull       21
	//    6   14:aload_0         
	//    7   15:getfield        #387 <Field PlaybackStateCompat mState>
	//    8   18:ifnull          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void fadeInAddedRoutes()
	{
		android.view.animation.Animation.AnimationListener animationlistener = new android.view.animation.Animation.AnimationListener() {

			public void onAnimationEnd(Animation animation)
			{
				finishAnimation(true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//    2    4:iconst_1        
			//    3    5:invokevirtual   #26  <Method void MediaRouteControllerDialog.finishAnimation(boolean)>
			//    4    8:return          
			}

			public void onAnimationRepeat(Animation animation)
			{
			//    0    0:return          
			}

			public void onAnimationStart(Animation animation)
			{
			//    0    0:return          
			}

			final MediaRouteControllerDialog this$0;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #12  <Class MediaRouteControllerDialog$12>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #389 <Method void MediaRouteControllerDialog$12(MediaRouteControllerDialog)>
	//    4    8:astore          5
		int j = mVolumeGroupList.getFirstVisiblePosition();
	//    5   10:aload_0         
	//    6   11:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//    7   14:invokevirtual   #393 <Method int OverlayListView.getFirstVisiblePosition()>
	//    8   17:istore          4
		int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_3        
		boolean flag1;
		for(boolean flag = false; i < mVolumeGroupList.getChildCount(); flag = flag1)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_3         
	//*  14   24:aload_0         
	//*  15   25:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//*  16   28:invokevirtual   #396 <Method int OverlayListView.getChildCount()>
	//*  17   31:icmpge          145
		{
			View view = mVolumeGroupList.getChildAt(i);
	//   18   34:aload_0         
	//   19   35:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//   20   38:iload_3         
	//   21   39:invokevirtual   #400 <Method View OverlayListView.getChildAt(int)>
	//   22   42:astore          6
			android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)mVolumeGroupAdapter.getItem(j + i);
	//   23   44:aload_0         
	//   24   45:getfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   25   48:iload           4
	//   26   50:iload_3         
	//   27   51:iadd            
	//   28   52:invokevirtual   #406 <Method Object MediaRouteControllerDialog$VolumeGroupAdapter.getItem(int)>
	//   29   55:checkcast       #408 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   30   58:astore          7
			flag1 = flag;
	//   31   60:iload_1         
	//   32   61:istore_2        
			if(mGroupMemberRoutesAdded.contains(((Object) (routeinfo))))
	//*  33   62:aload_0         
	//*  34   63:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//*  35   66:aload           7
	//*  36   68:invokeinterface #416 <Method boolean Set.contains(Object)>
	//*  37   73:ifeq            136
			{
				AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
	//   38   76:new             #418 <Class AlphaAnimation>
	//   39   79:dup             
	//   40   80:fconst_0        
	//   41   81:fconst_1        
	//   42   82:invokespecial   #421 <Method void AlphaAnimation(float, float)>
	//   43   85:astore          7
				((Animation) (alphaanimation)).setDuration(mGroupListFadeInDurationMs);
	//   44   87:aload           7
	//   45   89:aload_0         
	//   46   90:getfield        #423 <Field int mGroupListFadeInDurationMs>
	//   47   93:i2l             
	//   48   94:invokevirtual   #368 <Method void Animation.setDuration(long)>
				((Animation) (alphaanimation)).setFillEnabled(true);
	//   49   97:aload           7
	//   50   99:iconst_1        
	//   51  100:invokevirtual   #426 <Method void Animation.setFillEnabled(boolean)>
				((Animation) (alphaanimation)).setFillAfter(true);
	//   52  103:aload           7
	//   53  105:iconst_1        
	//   54  106:invokevirtual   #429 <Method void Animation.setFillAfter(boolean)>
				flag1 = flag;
	//   55  109:iload_1         
	//   56  110:istore_2        
				if(!flag)
	//*  57  111:iload_1         
	//*  58  112:ifne            124
				{
					((Animation) (alphaanimation)).setAnimationListener(animationlistener);
	//   59  115:aload           7
	//   60  117:aload           5
	//   61  119:invokevirtual   #433 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
					flag1 = true;
	//   62  122:iconst_1        
	//   63  123:istore_2        
				}
				view.clearAnimation();
	//   64  124:aload           6
	//   65  126:invokevirtual   #436 <Method void View.clearAnimation()>
				view.startAnimation(((Animation) (alphaanimation)));
	//   66  129:aload           6
	//   67  131:aload           7
	//   68  133:invokevirtual   #380 <Method void View.startAnimation(Animation)>
			}
			i++;
	//   69  136:iload_3         
	//   70  137:iconst_1        
	//   71  138:iadd            
	//   72  139:istore_3        
		}

	//   73  140:iload_2         
	//   74  141:istore_1        
	//*  75  142:goto            23
	//   76  145:return          
	}

	private android.support.v7.media.MediaRouter.RouteGroup getGroup()
	{
		if(mRoute instanceof android.support.v7.media.MediaRouter.RouteGroup)
	//*   0    0:aload_0         
	//*   1    1:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*   2    4:instanceof      #440 <Class android.support.v7.media.MediaRouter$RouteGroup>
	//*   3    7:ifeq            18
			return (android.support.v7.media.MediaRouter.RouteGroup)mRoute;
	//    4   10:aload_0         
	//    5   11:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//    6   14:checkcast       #440 <Class android.support.v7.media.MediaRouter$RouteGroup>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	private static int getLayoutHeight(View view)
	{
		return view.getLayoutParams().height;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #444 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.height>
	//    3    7:ireturn         
	}

	private int getMainControllerHeight(boolean flag)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(flag || mVolumeControlLayout.getVisibility() == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            16
	//*   4    6:aload_0         
	//*   5    7:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//*   6   10:invokevirtual   #458 <Method int LinearLayout.getVisibility()>
	//*   7   13:ifne            100
		{
			int j = 0 + (mMediaMainControlLayout.getPaddingTop() + mMediaMainControlLayout.getPaddingBottom());
	//    8   16:iconst_0        
	//    9   17:aload_0         
	//   10   18:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//   11   21:invokevirtual   #463 <Method int LinearLayout.getPaddingTop()>
	//   12   24:aload_0         
	//   13   25:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//   14   28:invokevirtual   #466 <Method int LinearLayout.getPaddingBottom()>
	//   15   31:iadd            
	//   16   32:iadd            
	//   17   33:istore_3        
			i = j;
	//   18   34:iload_3         
	//   19   35:istore_2        
			if(flag)
	//*  20   36:iload_1         
	//*  21   37:ifeq            50
				i = j + mPlaybackControlLayout.getMeasuredHeight();
	//   22   40:iload_3         
	//   23   41:aload_0         
	//   24   42:getfield        #468 <Field RelativeLayout mPlaybackControlLayout>
	//   25   45:invokevirtual   #473 <Method int RelativeLayout.getMeasuredHeight()>
	//   26   48:iadd            
	//   27   49:istore_2        
			j = i;
	//   28   50:iload_2         
	//   29   51:istore_3        
			if(mVolumeControlLayout.getVisibility() == 0)
	//*  30   52:aload_0         
	//*  31   53:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//*  32   56:invokevirtual   #458 <Method int LinearLayout.getVisibility()>
	//*  33   59:ifne            72
				j = i + mVolumeControlLayout.getMeasuredHeight();
	//   34   62:iload_2         
	//   35   63:aload_0         
	//   36   64:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//   37   67:invokevirtual   #474 <Method int LinearLayout.getMeasuredHeight()>
	//   38   70:iadd            
	//   39   71:istore_3        
			i = j;
	//   40   72:iload_3         
	//   41   73:istore_2        
			if(flag)
	//*  42   74:iload_1         
	//*  43   75:ifeq            100
			{
				i = j;
	//   44   78:iload_3         
	//   45   79:istore_2        
				if(mVolumeControlLayout.getVisibility() == 0)
	//*  46   80:aload_0         
	//*  47   81:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//*  48   84:invokevirtual   #458 <Method int LinearLayout.getVisibility()>
	//*  49   87:ifne            100
					i = j + mDividerView.getMeasuredHeight();
	//   50   90:iload_3         
	//   51   91:aload_0         
	//   52   92:getfield        #476 <Field View mDividerView>
	//   53   95:invokevirtual   #477 <Method int View.getMeasuredHeight()>
	//   54   98:iadd            
	//   55   99:istore_2        
			}
		}
		return i;
	//   56  100:iload_2         
	//   57  101:ireturn         
	}

	private boolean isBitmapRecycled(Bitmap bitmap)
	{
		return bitmap != null && bitmap.isRecycled();
	//    0    0:aload_1         
	//    1    1:ifnull          13
	//    2    4:aload_1         
	//    3    5:invokevirtual   #482 <Method boolean Bitmap.isRecycled()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private boolean isIconChanged()
	{
		Object obj = ((Object) (mDescription));
	//    0    0:aload_0         
	//    1    1:getfield        #385 <Field MediaDescriptionCompat mDescription>
	//    2    4:astore_1        
		Uri uri = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       16
			obj = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
		else
	//*   9   13:goto            24
			obj = ((Object) (mDescription.getIconBitmap()));
	//   10   16:aload_0         
	//   11   17:getfield        #385 <Field MediaDescriptionCompat mDescription>
	//   12   20:invokevirtual   #489 <Method Bitmap MediaDescriptionCompat.getIconBitmap()>
	//   13   23:astore_1        
		if(mDescription != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #385 <Field MediaDescriptionCompat mDescription>
	//*  16   28:ifnonnull       34
	//*  17   31:goto            42
			uri = mDescription.getIconUri();
	//   18   34:aload_0         
	//   19   35:getfield        #385 <Field MediaDescriptionCompat mDescription>
	//   20   38:invokevirtual   #493 <Method Uri MediaDescriptionCompat.getIconUri()>
	//   21   41:astore_2        
		Bitmap bitmap;
		if(mFetchArtTask == null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #495 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//*  24   46:ifnonnull       57
			bitmap = mArtIconBitmap;
	//   25   49:aload_0         
	//   26   50:getfield        #497 <Field Bitmap mArtIconBitmap>
	//   27   53:astore_3        
		else
	//*  28   54:goto            65
			bitmap = mFetchArtTask.getIconBitmap();
	//   29   57:aload_0         
	//   30   58:getfield        #495 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//   31   61:invokevirtual   #498 <Method Bitmap MediaRouteControllerDialog$FetchArtTask.getIconBitmap()>
	//   32   64:astore_3        
		Uri uri1;
		if(mFetchArtTask == null)
	//*  33   65:aload_0         
	//*  34   66:getfield        #495 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//*  35   69:ifnonnull       81
			uri1 = mArtIconUri;
	//   36   72:aload_0         
	//   37   73:getfield        #500 <Field Uri mArtIconUri>
	//   38   76:astore          4
		else
	//*  39   78:goto            90
			uri1 = mFetchArtTask.getIconUri();
	//   40   81:aload_0         
	//   41   82:getfield        #495 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//   42   85:invokevirtual   #501 <Method Uri MediaRouteControllerDialog$FetchArtTask.getIconUri()>
	//   43   88:astore          4
		if(bitmap != obj)
	//*  44   90:aload_3         
	//*  45   91:aload_1         
	//*  46   92:if_acmpeq       97
			return true;
	//   47   95:iconst_1        
	//   48   96:ireturn         
		return bitmap == null && !uriEquals(uri1, uri);
	//   49   97:aload_3         
	//   50   98:ifnonnull       112
	//   51  101:aload           4
	//   52  103:aload_2         
	//   53  104:invokestatic    #505 <Method boolean uriEquals(Uri, Uri)>
	//   54  107:ifne            112
	//   55  110:iconst_1        
	//   56  111:ireturn         
	//   57  112:iconst_0        
	//   58  113:ireturn         
	}

	private boolean isPauseActionSupported()
	{
		return (mState.getActions() & 514L) != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #387 <Field PlaybackStateCompat mState>
	//    2    4:invokevirtual   #511 <Method long PlaybackStateCompat.getActions()>
	//    3    7:ldc2w           #512 <Long 514L>
	//    4   10:land            
	//    5   11:lconst_0        
	//    6   12:lcmp            
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private boolean isPlayActionSupported()
	{
		return (mState.getActions() & 516L) != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #387 <Field PlaybackStateCompat mState>
	//    2    4:invokevirtual   #511 <Method long PlaybackStateCompat.getActions()>
	//    3    7:ldc2w           #514 <Long 516L>
	//    4   10:land            
	//    5   11:lconst_0        
	//    6   12:lcmp            
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private boolean isStopActionSupported()
	{
		return (mState.getActions() & 1L) != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #387 <Field PlaybackStateCompat mState>
	//    2    4:invokevirtual   #511 <Method long PlaybackStateCompat.getActions()>
	//    3    7:lconst_1        
	//    4    8:land            
	//    5    9:lconst_0        
	//    6   10:lcmp            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	private void rebuildVolumeGroupList(boolean flag)
	{
		List list;
		if(getGroup() == null)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #518 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//*   2    4:ifnonnull       12
			list = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
		else
	//*   5    9:goto            20
			list = getGroup().getRoutes();
	//    6   12:aload_0         
	//    7   13:invokespecial   #518 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//    8   16:invokevirtual   #522 <Method List android.support.v7.media.MediaRouter$RouteGroup.getRoutes()>
	//    9   19:astore_2        
		if(list == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       41
		{
			mGroupMemberRoutes.clear();
	//   12   24:aload_0         
	//   13   25:getfield        #524 <Field List mGroupMemberRoutes>
	//   14   28:invokeinterface #529 <Method void List.clear()>
			mVolumeGroupAdapter.notifyDataSetChanged();
	//   15   33:aload_0         
	//   16   34:getfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   17   37:invokevirtual   #532 <Method void MediaRouteControllerDialog$VolumeGroupAdapter.notifyDataSetChanged()>
			return;
	//   18   40:return          
		}
		if(MediaRouteDialogHelper.listUnorderedEquals(mGroupMemberRoutes, list))
	//*  19   41:aload_0         
	//*  20   42:getfield        #524 <Field List mGroupMemberRoutes>
	//*  21   45:aload_2         
	//*  22   46:invokestatic    #538 <Method boolean MediaRouteDialogHelper.listUnorderedEquals(List, List)>
	//*  23   49:ifeq            60
		{
			mVolumeGroupAdapter.notifyDataSetChanged();
	//   24   52:aload_0         
	//   25   53:getfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   26   56:invokevirtual   #532 <Method void MediaRouteControllerDialog$VolumeGroupAdapter.notifyDataSetChanged()>
			return;
	//   27   59:return          
		}
		HashMap hashmap;
		if(flag)
	//*  28   60:iload_1         
	//*  29   61:ifeq            79
			hashmap = MediaRouteDialogHelper.getItemBoundMap(((android.widget.ListView) (mVolumeGroupList)), ((ArrayAdapter) (mVolumeGroupAdapter)));
	//   30   64:aload_0         
	//   31   65:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//   32   68:aload_0         
	//   33   69:getfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   34   72:invokestatic    #542 <Method HashMap MediaRouteDialogHelper.getItemBoundMap(android.widget.ListView, ArrayAdapter)>
	//   35   75:astore_3        
		else
	//*  36   76:goto            81
			hashmap = null;
	//   37   79:aconst_null     
	//   38   80:astore_3        
		HashMap hashmap1;
		if(flag)
	//*  39   81:iload_1         
	//*  40   82:ifeq            105
			hashmap1 = MediaRouteDialogHelper.getItemBitmapMap(mContext, ((android.widget.ListView) (mVolumeGroupList)), ((ArrayAdapter) (mVolumeGroupAdapter)));
	//   41   85:aload_0         
	//   42   86:getfield        #215 <Field Context mContext>
	//   43   89:aload_0         
	//   44   90:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//   45   93:aload_0         
	//   46   94:getfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   47   97:invokestatic    #546 <Method HashMap MediaRouteDialogHelper.getItemBitmapMap(Context, android.widget.ListView, ArrayAdapter)>
	//   48  100:astore          4
		else
	//*  49  102:goto            108
			hashmap1 = null;
	//   50  105:aconst_null     
	//   51  106:astore          4
		mGroupMemberRoutesAdded = MediaRouteDialogHelper.getItemsAdded(mGroupMemberRoutes, list);
	//   52  108:aload_0         
	//   53  109:aload_0         
	//   54  110:getfield        #524 <Field List mGroupMemberRoutes>
	//   55  113:aload_2         
	//   56  114:invokestatic    #550 <Method Set MediaRouteDialogHelper.getItemsAdded(List, List)>
	//   57  117:putfield        #410 <Field Set mGroupMemberRoutesAdded>
		mGroupMemberRoutesRemoved = MediaRouteDialogHelper.getItemsRemoved(mGroupMemberRoutes, list);
	//   58  120:aload_0         
	//   59  121:aload_0         
	//   60  122:getfield        #524 <Field List mGroupMemberRoutes>
	//   61  125:aload_2         
	//   62  126:invokestatic    #553 <Method Set MediaRouteDialogHelper.getItemsRemoved(List, List)>
	//   63  129:putfield        #555 <Field Set mGroupMemberRoutesRemoved>
		mGroupMemberRoutes.addAll(0, ((java.util.Collection) (mGroupMemberRoutesAdded)));
	//   64  132:aload_0         
	//   65  133:getfield        #524 <Field List mGroupMemberRoutes>
	//   66  136:iconst_0        
	//   67  137:aload_0         
	//   68  138:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//   69  141:invokeinterface #559 <Method boolean List.addAll(int, java.util.Collection)>
	//   70  146:pop             
		mGroupMemberRoutes.removeAll(((java.util.Collection) (mGroupMemberRoutesRemoved)));
	//   71  147:aload_0         
	//   72  148:getfield        #524 <Field List mGroupMemberRoutes>
	//   73  151:aload_0         
	//   74  152:getfield        #555 <Field Set mGroupMemberRoutesRemoved>
	//   75  155:invokeinterface #563 <Method boolean List.removeAll(java.util.Collection)>
	//   76  160:pop             
		mVolumeGroupAdapter.notifyDataSetChanged();
	//   77  161:aload_0         
	//   78  162:getfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   79  165:invokevirtual   #532 <Method void MediaRouteControllerDialog$VolumeGroupAdapter.notifyDataSetChanged()>
		if(flag && mIsGroupExpanded && mGroupMemberRoutesAdded.size() + mGroupMemberRoutesRemoved.size() > 0)
	//*  80  168:iload_1         
	//*  81  169:ifeq            209
	//*  82  172:aload_0         
	//*  83  173:getfield        #565 <Field boolean mIsGroupExpanded>
	//*  84  176:ifeq            209
	//*  85  179:aload_0         
	//*  86  180:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//*  87  183:invokeinterface #568 <Method int Set.size()>
	//*  88  188:aload_0         
	//*  89  189:getfield        #555 <Field Set mGroupMemberRoutesRemoved>
	//*  90  192:invokeinterface #568 <Method int Set.size()>
	//*  91  197:iadd            
	//*  92  198:ifle            209
		{
			animateGroupListItems(((Map) (hashmap)), ((Map) (hashmap1)));
	//   93  201:aload_0         
	//   94  202:aload_3         
	//   95  203:aload           4
	//   96  205:invokespecial   #570 <Method void animateGroupListItems(Map, Map)>
			return;
	//   97  208:return          
		} else
		{
			mGroupMemberRoutesAdded = null;
	//   98  209:aload_0         
	//   99  210:aconst_null     
	//  100  211:putfield        #410 <Field Set mGroupMemberRoutesAdded>
			mGroupMemberRoutesRemoved = null;
	//  101  214:aload_0         
	//  102  215:aconst_null     
	//  103  216:putfield        #555 <Field Set mGroupMemberRoutesRemoved>
			return;
	//  104  219:return          
		}
	}

	static void setLayoutHeight(View view, int i)
	{
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #444 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_2        
		layoutparams.height = i;
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:putfield        #449 <Field int android.view.ViewGroup$LayoutParams.height>
		view.setLayoutParams(layoutparams);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #575 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    9   15:return          
	}

	private void setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		MediaControllerCompat mediacontrollercompat = mMediaController;
	//    0    0:aload_0         
	//    1    1:getfield        #579 <Field MediaControllerCompat mMediaController>
	//    2    4:astore_3        
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(mediacontrollercompat != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          27
		{
			mMediaController.unregisterCallback(((android.support.v4.media.session.MediaControllerCompat.Callback) (mControllerCallback)));
	//    7   11:aload_0         
	//    8   12:getfield        #579 <Field MediaControllerCompat mMediaController>
	//    9   15:aload_0         
	//   10   16:getfield        #218 <Field MediaRouteControllerDialog$MediaControllerCallback mControllerCallback>
	//   11   19:invokevirtual   #585 <Method void MediaControllerCompat.unregisterCallback(android.support.v4.media.session.MediaControllerCompat$Callback)>
			mMediaController = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #579 <Field MediaControllerCompat mMediaController>
		}
		if(token == null)
	//*  15   27:aload_1         
	//*  16   28:ifnonnull       32
			return;
	//   17   31:return          
		if(!mAttachedToWindow)
	//*  18   32:aload_0         
	//*  19   33:getfield        #587 <Field boolean mAttachedToWindow>
	//*  20   36:ifne            40
			return;
	//   21   39:return          
		try
		{
			mMediaController = new MediaControllerCompat(mContext, token);
	//   22   40:aload_0         
	//   23   41:new             #581 <Class MediaControllerCompat>
	//   24   44:dup             
	//   25   45:aload_0         
	//   26   46:getfield        #215 <Field Context mContext>
	//   27   49:aload_1         
	//   28   50:invokespecial   #590 <Method void MediaControllerCompat(Context, android.support.v4.media.session.MediaSessionCompat$Token)>
	//   29   53:putfield        #579 <Field MediaControllerCompat mMediaController>
		}
	//*  30   56:goto            70
		// Misplaced declaration of an exception variable
		catch(android.support.v4.media.session.MediaSessionCompat.Token token)
	//*  31   59:astore_1        
		{
			Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", ((Throwable) (token)));
	//   32   60:ldc1            #62  <String "MediaRouteCtrlDialog">
	//   33   62:ldc2            #592 <String "Error creating media controller in setMediaSession.">
	//   34   65:aload_1         
	//   35   66:invokestatic    #596 <Method int Log.e(String, String, Throwable)>
	//   36   69:pop             
		}
		if(mMediaController != null)
	//*  37   70:aload_0         
	//*  38   71:getfield        #579 <Field MediaControllerCompat mMediaController>
	//*  39   74:ifnull          88
			mMediaController.registerCallback(((android.support.v4.media.session.MediaControllerCompat.Callback) (mControllerCallback)));
	//   40   77:aload_0         
	//   41   78:getfield        #579 <Field MediaControllerCompat mMediaController>
	//   42   81:aload_0         
	//   43   82:getfield        #218 <Field MediaRouteControllerDialog$MediaControllerCallback mControllerCallback>
	//   44   85:invokevirtual   #599 <Method void MediaControllerCompat.registerCallback(android.support.v4.media.session.MediaControllerCompat$Callback)>
		if(mMediaController == null)
	//*  45   88:aload_0         
	//*  46   89:getfield        #579 <Field MediaControllerCompat mMediaController>
	//*  47   92:ifnonnull       100
			token = null;
	//   48   95:aconst_null     
	//   49   96:astore_1        
		else
	//*  50   97:goto            108
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (mMediaController.getMetadata()));
	//   51  100:aload_0         
	//   52  101:getfield        #579 <Field MediaControllerCompat mMediaController>
	//   53  104:invokevirtual   #603 <Method MediaMetadataCompat MediaControllerCompat.getMetadata()>
	//   54  107:astore_1        
		if(token == null)
	//*  55  108:aload_1         
	//*  56  109:ifnonnull       117
			token = null;
	//   57  112:aconst_null     
	//   58  113:astore_1        
		else
	//*  59  114:goto            122
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaMetadataCompat) (token)).getDescription()));
	//   60  117:aload_1         
	//   61  118:invokevirtual   #609 <Method MediaDescriptionCompat MediaMetadataCompat.getDescription()>
	//   62  121:astore_1        
		mDescription = ((MediaDescriptionCompat) (token));
	//   63  122:aload_0         
	//   64  123:aload_1         
	//   65  124:putfield        #385 <Field MediaDescriptionCompat mDescription>
		if(mMediaController == null)
	//*  66  127:aload_0         
	//*  67  128:getfield        #579 <Field MediaControllerCompat mMediaController>
	//*  68  131:ifnonnull       139
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (obj));
	//   69  134:aload_2         
	//   70  135:astore_1        
		else
	//*  71  136:goto            147
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (mMediaController.getPlaybackState()));
	//   72  139:aload_0         
	//   73  140:getfield        #579 <Field MediaControllerCompat mMediaController>
	//   74  143:invokevirtual   #613 <Method PlaybackStateCompat MediaControllerCompat.getPlaybackState()>
	//   75  146:astore_1        
		mState = ((PlaybackStateCompat) (token));
	//   76  147:aload_0         
	//   77  148:aload_1         
	//   78  149:putfield        #387 <Field PlaybackStateCompat mState>
		updateArtIconIfNeeded();
	//   79  152:aload_0         
	//   80  153:invokevirtual   #616 <Method void updateArtIconIfNeeded()>
		update(false);
	//   81  156:aload_0         
	//   82  157:iconst_0        
	//   83  158:invokevirtual   #619 <Method void update(boolean)>
	//   84  161:return          
	}

	private void updateMediaControlVisibility(boolean flag)
	{
		Object obj = ((Object) (mDividerView));
	//    0    0:aload_0         
	//    1    1:getfield        #476 <Field View mDividerView>
	//    2    4:astore          4
		int i = mVolumeControlLayout.getVisibility();
	//    3    6:aload_0         
	//    4    7:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//    5   10:invokevirtual   #458 <Method int LinearLayout.getVisibility()>
	//    6   13:istore_2        
		boolean flag1 = false;
	//    7   14:iconst_0        
	//    8   15:istore_3        
		if(i == 0 && flag)
	//*   9   16:iload_2         
	//*  10   17:ifne            29
	//*  11   20:iload_1         
	//*  12   21:ifeq            29
			i = 0;
	//   13   24:iconst_0        
	//   14   25:istore_2        
		else
	//*  15   26:goto            32
			i = 8;
	//   16   29:bipush          8
	//   17   31:istore_2        
		((View) (obj)).setVisibility(i);
	//   18   32:aload           4
	//   19   34:iload_2         
	//   20   35:invokevirtual   #624 <Method void View.setVisibility(int)>
		obj = ((Object) (mMediaMainControlLayout));
	//   21   38:aload_0         
	//   22   39:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//   23   42:astore          4
		i = ((int) (flag1));
	//   24   44:iload_3         
	//   25   45:istore_2        
		if(mVolumeControlLayout.getVisibility() == 8)
	//*  26   46:aload_0         
	//*  27   47:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//*  28   50:invokevirtual   #458 <Method int LinearLayout.getVisibility()>
	//*  29   53:bipush          8
	//*  30   55:icmpne          67
		{
			i = ((int) (flag1));
	//   31   58:iload_3         
	//   32   59:istore_2        
			if(!flag)
	//*  33   60:iload_1         
	//*  34   61:ifne            67
				i = 8;
	//   35   64:bipush          8
	//   36   66:istore_2        
		}
		((LinearLayout) (obj)).setVisibility(i);
	//   37   67:aload           4
	//   38   69:iload_2         
	//   39   70:invokevirtual   #625 <Method void LinearLayout.setVisibility(int)>
	//   40   73:return          
	}

	private void updatePlaybackControlLayout()
	{
		boolean flag;
		int k;
		boolean flag2;
		Object obj;
		CharSequence charsequence;
		if(!canShowPlaybackControlLayout())
			break MISSING_BLOCK_LABEL_434;
	//    0    0:aload_0         
	//    1    1:invokespecial   #628 <Method boolean canShowPlaybackControlLayout()>
	//    2    4:ifeq            434
		obj = ((Object) (mDescription));
	//    3    7:aload_0         
	//    4    8:getfield        #385 <Field MediaDescriptionCompat mDescription>
	//    5   11:astore          6
		charsequence = null;
	//    6   13:aconst_null     
	//    7   14:astore          7
		if(obj == null)
	//*   8   16:aload           6
	//*   9   18:ifnonnull       27
			obj = null;
	//   10   21:aconst_null     
	//   11   22:astore          6
		else
	//*  12   24:goto            36
			obj = ((Object) (mDescription.getTitle()));
	//   13   27:aload_0         
	//   14   28:getfield        #385 <Field MediaDescriptionCompat mDescription>
	//   15   31:invokevirtual   #632 <Method CharSequence MediaDescriptionCompat.getTitle()>
	//   16   34:astore          6
		boolean flag4 = TextUtils.isEmpty(((CharSequence) (obj)));
	//   17   36:aload           6
	//   18   38:invokestatic    #638 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   19   41:istore          5
		k = 1;
	//   20   43:iconst_1        
	//   21   44:istore_3        
		flag = flag4 ^ true;
	//   22   45:iload           5
	//   23   47:iconst_1        
	//   24   48:ixor            
	//   25   49:istore_1        
		if(mDescription != null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #385 <Field MediaDescriptionCompat mDescription>
	//*  28   54:ifnonnull       60
	//*  29   57:goto            69
			charsequence = mDescription.getSubtitle();
	//   30   60:aload_0         
	//   31   61:getfield        #385 <Field MediaDescriptionCompat mDescription>
	//   32   64:invokevirtual   #641 <Method CharSequence MediaDescriptionCompat.getSubtitle()>
	//   33   67:astore          7
		flag2 = TextUtils.isEmpty(charsequence) ^ true;
	//   34   69:aload           7
	//   35   71:invokestatic    #638 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   36   74:iconst_1        
	//   37   75:ixor            
	//   38   76:istore          4
		if(mRoute.getPresentationDisplayId() == -1) goto _L2; else goto _L1
	//   39   78:aload_0         
	//   40   79:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//   41   82:invokevirtual   #644 <Method int android.support.v7.media.MediaRouter$RouteInfo.getPresentationDisplayId()>
	//   42   85:iconst_m1       
	//   43   86:icmpeq          106
_L1:
		mTitleView.setText(android.support.v7.mediarouter.R.string.mr_controller_casting_screen);
	//   44   89:aload_0         
	//   45   90:getfield        #646 <Field TextView mTitleView>
	//   46   93:getstatic       #651 <Field int android.support.v7.mediarouter.R$string.mr_controller_casting_screen>
	//   47   96:invokevirtual   #656 <Method void TextView.setText(int)>
_L6:
		boolean flag1 = true;
	//   48   99:iconst_1        
	//   49  100:istore_2        
_L4:
		flag = false;
	//   50  101:iconst_0        
	//   51  102:istore_1        
		break; /* Loop/switch isn't completed */
	//   52  103:goto            208
_L2:
		if(mState == null || mState.getState() == 0)
	//*  53  106:aload_0         
	//*  54  107:getfield        #387 <Field PlaybackStateCompat mState>
	//*  55  110:ifnull          195
	//*  56  113:aload_0         
	//*  57  114:getfield        #387 <Field PlaybackStateCompat mState>
	//*  58  117:invokevirtual   #659 <Method int PlaybackStateCompat.getState()>
	//*  59  120:ifne            126
			break; /* Loop/switch isn't completed */
	//   60  123:goto            195
		if(!flag && !flag2)
	//*  61  126:iload_1         
	//*  62  127:ifne            148
	//*  63  130:iload           4
	//*  64  132:ifne            148
		{
			mTitleView.setText(android.support.v7.mediarouter.R.string.mr_controller_no_info_available);
	//   65  135:aload_0         
	//   66  136:getfield        #646 <Field TextView mTitleView>
	//   67  139:getstatic       #662 <Field int android.support.v7.mediarouter.R$string.mr_controller_no_info_available>
	//   68  142:invokevirtual   #656 <Method void TextView.setText(int)>
			continue; /* Loop/switch isn't completed */
	//   69  145:goto            99
		}
		if(flag)
	//*  70  148:iload_1         
	//*  71  149:ifeq            166
		{
			mTitleView.setText(((CharSequence) (obj)));
	//   72  152:aload_0         
	//   73  153:getfield        #646 <Field TextView mTitleView>
	//   74  156:aload           6
	//   75  158:invokevirtual   #665 <Method void TextView.setText(CharSequence)>
			flag = true;
	//   76  161:iconst_1        
	//   77  162:istore_1        
		} else
	//*  78  163:goto            168
		{
			flag = false;
	//   79  166:iconst_0        
	//   80  167:istore_1        
		}
		flag1 = flag;
	//   81  168:iload_1         
	//   82  169:istore_2        
		if(flag2)
	//*  83  170:iload           4
	//*  84  172:ifeq            101
		{
			mSubtitleView.setText(charsequence);
	//   85  175:aload_0         
	//   86  176:getfield        #667 <Field TextView mSubtitleView>
	//   87  179:aload           7
	//   88  181:invokevirtual   #665 <Method void TextView.setText(CharSequence)>
			boolean flag3 = true;
	//   89  184:iconst_1        
	//   90  185:istore          4
			flag1 = flag;
	//   91  187:iload_1         
	//   92  188:istore_2        
			flag = flag3;
	//   93  189:iload           4
	//   94  191:istore_1        
			break; /* Loop/switch isn't completed */
	//   95  192:goto            208
		}
		if(true) goto _L4; else goto _L3
_L3:
		mTitleView.setText(android.support.v7.mediarouter.R.string.mr_controller_no_media_selected);
	//   96  195:aload_0         
	//   97  196:getfield        #646 <Field TextView mTitleView>
	//   98  199:getstatic       #670 <Field int android.support.v7.mediarouter.R$string.mr_controller_no_media_selected>
	//   99  202:invokevirtual   #656 <Method void TextView.setText(int)>
		if(true) goto _L6; else goto _L5
	//  100  205:goto            99
_L5:
		TextView textview = mTitleView;
	//  101  208:aload_0         
	//  102  209:getfield        #646 <Field TextView mTitleView>
	//  103  212:astore          6
		byte byte2 = 8;
	//  104  214:bipush          8
	//  105  216:istore          4
		byte byte1;
		if(flag1)
	//* 106  218:iload_2         
	//* 107  219:ifeq            227
			byte1 = 0;
	//  108  222:iconst_0        
	//  109  223:istore_2        
		else
	//* 110  224:goto            230
			byte1 = 8;
	//  111  227:bipush          8
	//  112  229:istore_2        
		textview.setVisibility(((int) (byte1)));
	//  113  230:aload           6
	//  114  232:iload_2         
	//  115  233:invokevirtual   #671 <Method void TextView.setVisibility(int)>
		textview = mSubtitleView;
	//  116  236:aload_0         
	//  117  237:getfield        #667 <Field TextView mSubtitleView>
	//  118  240:astore          6
		byte byte0;
		if(flag)
	//* 119  242:iload_1         
	//* 120  243:ifeq            251
			byte0 = 0;
	//  121  246:iconst_0        
	//  122  247:istore_1        
		else
	//* 123  248:goto            254
			byte0 = 8;
	//  124  251:bipush          8
	//  125  253:istore_1        
		textview.setVisibility(((int) (byte0)));
	//  126  254:aload           6
	//  127  256:iload_1         
	//  128  257:invokevirtual   #671 <Method void TextView.setVisibility(int)>
		if(mState != null)
	//* 129  260:aload_0         
	//* 130  261:getfield        #387 <Field PlaybackStateCompat mState>
	//* 131  264:ifnull          434
		{
			int i;
			if(mState.getState() != 6 && mState.getState() != 3)
	//* 132  267:aload_0         
	//* 133  268:getfield        #387 <Field PlaybackStateCompat mState>
	//* 134  271:invokevirtual   #659 <Method int PlaybackStateCompat.getState()>
	//* 135  274:bipush          6
	//* 136  276:icmpeq          298
	//* 137  279:aload_0         
	//* 138  280:getfield        #387 <Field PlaybackStateCompat mState>
	//* 139  283:invokevirtual   #659 <Method int PlaybackStateCompat.getState()>
	//* 140  286:iconst_3        
	//* 141  287:icmpne          293
	//* 142  290:goto            298
				i = 0;
	//  143  293:iconst_0        
	//  144  294:istore_1        
			else
	//* 145  295:goto            300
				i = 1;
	//  146  298:iconst_1        
	//  147  299:istore_1        
			Context context = mPlaybackControlButton.getContext();
	//  148  300:aload_0         
	//  149  301:getfield        #673 <Field ImageButton mPlaybackControlButton>
	//  150  304:invokevirtual   #676 <Method Context ImageButton.getContext()>
	//  151  307:astore          6
			int j;
			if(i != 0 && isPauseActionSupported())
	//* 152  309:iload_1         
	//* 153  310:ifeq            331
	//* 154  313:aload_0         
	//* 155  314:invokespecial   #307 <Method boolean isPauseActionSupported()>
	//* 156  317:ifeq            331
			{
				i = android.support.v7.mediarouter.R.attr.mediaRoutePauseDrawable;
	//  157  320:getstatic       #681 <Field int android.support.v7.mediarouter.R$attr.mediaRoutePauseDrawable>
	//  158  323:istore_1        
				j = android.support.v7.mediarouter.R.string.mr_controller_pause;
	//  159  324:getstatic       #684 <Field int android.support.v7.mediarouter.R$string.mr_controller_pause>
	//  160  327:istore_2        
			} else
	//* 161  328:goto            381
			if(i != 0 && isStopActionSupported())
	//* 162  331:iload_1         
	//* 163  332:ifeq            353
	//* 164  335:aload_0         
	//* 165  336:invokespecial   #311 <Method boolean isStopActionSupported()>
	//* 166  339:ifeq            353
			{
				i = android.support.v7.mediarouter.R.attr.mediaRouteStopDrawable;
	//  167  342:getstatic       #687 <Field int android.support.v7.mediarouter.R$attr.mediaRouteStopDrawable>
	//  168  345:istore_1        
				j = android.support.v7.mediarouter.R.string.mr_controller_stop;
	//  169  346:getstatic       #690 <Field int android.support.v7.mediarouter.R$string.mr_controller_stop>
	//  170  349:istore_2        
			} else
	//* 171  350:goto            381
			if(i == 0 && isPlayActionSupported())
	//* 172  353:iload_1         
	//* 173  354:ifne            375
	//* 174  357:aload_0         
	//* 175  358:invokespecial   #315 <Method boolean isPlayActionSupported()>
	//* 176  361:ifeq            375
			{
				i = android.support.v7.mediarouter.R.attr.mediaRoutePlayDrawable;
	//  177  364:getstatic       #693 <Field int android.support.v7.mediarouter.R$attr.mediaRoutePlayDrawable>
	//  178  367:istore_1        
				j = android.support.v7.mediarouter.R.string.mr_controller_play;
	//  179  368:getstatic       #696 <Field int android.support.v7.mediarouter.R$string.mr_controller_play>
	//  180  371:istore_2        
			} else
	//* 181  372:goto            381
			{
				i = 0;
	//  182  375:iconst_0        
	//  183  376:istore_1        
				j = i;
	//  184  377:iload_1         
	//  185  378:istore_2        
				k = j;
	//  186  379:iload_2         
	//  187  380:istore_3        
			}
			ImageButton imagebutton = mPlaybackControlButton;
	//  188  381:aload_0         
	//  189  382:getfield        #673 <Field ImageButton mPlaybackControlButton>
	//  190  385:astore          7
			if(k != 0)
	//* 191  387:iload_3         
	//* 192  388:ifeq            394
				byte2 = 0;
	//  193  391:iconst_0        
	//  194  392:istore          4
			imagebutton.setVisibility(((int) (byte2)));
	//  195  394:aload           7
	//  196  396:iload           4
	//  197  398:invokevirtual   #697 <Method void ImageButton.setVisibility(int)>
			if(k != 0)
	//* 198  401:iload_3         
	//* 199  402:ifeq            434
			{
				mPlaybackControlButton.setImageResource(MediaRouterThemeHelper.getThemeResource(context, i));
	//  200  405:aload_0         
	//  201  406:getfield        #673 <Field ImageButton mPlaybackControlButton>
	//  202  409:aload           6
	//  203  411:iload_1         
	//  204  412:invokestatic    #701 <Method int MediaRouterThemeHelper.getThemeResource(Context, int)>
	//  205  415:invokevirtual   #704 <Method void ImageButton.setImageResource(int)>
				mPlaybackControlButton.setContentDescription(context.getResources().getText(j));
	//  206  418:aload_0         
	//  207  419:getfield        #673 <Field ImageButton mPlaybackControlButton>
	//  208  422:aload           6
	//  209  424:invokevirtual   #249 <Method Resources Context.getResources()>
	//  210  427:iload_2         
	//  211  428:invokevirtual   #708 <Method CharSequence Resources.getText(int)>
	//  212  431:invokevirtual   #711 <Method void ImageButton.setContentDescription(CharSequence)>
			}
		}
	//  213  434:return          
	}

	private void updateVolumeControlLayout()
	{
		boolean flag = isVolumeControlAvailable(mRoute);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//    3    5:invokevirtual   #716 <Method boolean isVolumeControlAvailable(android.support.v7.media.MediaRouter$RouteInfo)>
	//    4    8:istore_2        
		byte byte0 = 8;
	//    5    9:bipush          8
	//    6   11:istore_1        
		if(flag)
	//*   7   12:iload_2         
	//*   8   13:ifeq            87
		{
			if(mVolumeControlLayout.getVisibility() == 8)
	//*   9   16:aload_0         
	//*  10   17:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//*  11   20:invokevirtual   #458 <Method int LinearLayout.getVisibility()>
	//*  12   23:bipush          8
	//*  13   25:icmpne          96
			{
				mVolumeControlLayout.setVisibility(0);
	//   14   28:aload_0         
	//   15   29:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #625 <Method void LinearLayout.setVisibility(int)>
				mVolumeSlider.setMax(mRoute.getVolumeMax());
	//   18   36:aload_0         
	//   19   37:getfield        #718 <Field SeekBar mVolumeSlider>
	//   20   40:aload_0         
	//   21   41:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//   22   44:invokevirtual   #721 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolumeMax()>
	//   23   47:invokevirtual   #726 <Method void SeekBar.setMax(int)>
				mVolumeSlider.setProgress(mRoute.getVolume());
	//   24   50:aload_0         
	//   25   51:getfield        #718 <Field SeekBar mVolumeSlider>
	//   26   54:aload_0         
	//   27   55:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//   28   58:invokevirtual   #729 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
	//   29   61:invokevirtual   #732 <Method void SeekBar.setProgress(int)>
				MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton = mGroupExpandCollapseButton;
	//   30   64:aload_0         
	//   31   65:getfield        #734 <Field MediaRouteExpandCollapseButton mGroupExpandCollapseButton>
	//   32   68:astore_3        
				if(getGroup() != null)
	//*  33   69:aload_0         
	//*  34   70:invokespecial   #518 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//*  35   73:ifnonnull       79
	//*  36   76:goto            81
					byte0 = 0;
	//   37   79:iconst_0        
	//   38   80:istore_1        
				mediarouteexpandcollapsebutton.setVisibility(((int) (byte0)));
	//   39   81:aload_3         
	//   40   82:iload_1         
	//   41   83:invokevirtual   #737 <Method void MediaRouteExpandCollapseButton.setVisibility(int)>
				return;
	//   42   86:return          
			}
		} else
		{
			mVolumeControlLayout.setVisibility(8);
	//   43   87:aload_0         
	//   44   88:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//   45   91:bipush          8
	//   46   93:invokevirtual   #625 <Method void LinearLayout.setVisibility(int)>
		}
	//   47   96:return          
	}

	private static boolean uriEquals(Uri uri, Uri uri1)
	{
		if(uri != null && uri.equals(((Object) (uri1))))
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #742 <Method boolean Uri.equals(Object)>
	//*   5    9:ifeq            14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		return uri == null && uri1 == null;
	//    8   14:aload_0         
	//    9   15:ifnonnull       24
	//   10   18:aload_1         
	//   11   19:ifnonnull       24
	//   12   22:iconst_1        
	//   13   23:ireturn         
	//   14   24:iconst_0        
	//   15   25:ireturn         
	}

	void animateGroupListItemsInternal(Map map, Map map1)
	{
		if(mGroupMemberRoutesAdded != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//*   2    4:ifnull          521
		{
			if(mGroupMemberRoutesRemoved == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #555 <Field Set mGroupMemberRoutesRemoved>
	//*   5   11:ifnonnull       15
				return;
	//    6   14:return          
			int j1 = mGroupMemberRoutesAdded.size() - mGroupMemberRoutesRemoved.size();
	//    7   15:aload_0         
	//    8   16:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//    9   19:invokeinterface #568 <Method int Set.size()>
	//   10   24:aload_0         
	//   11   25:getfield        #555 <Field Set mGroupMemberRoutesRemoved>
	//   12   28:invokeinterface #568 <Method int Set.size()>
	//   13   33:isub            
	//   14   34:istore          8
			android.view.animation.Animation.AnimationListener animationlistener = new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
					mVolumeGroupList.startAnimationAll();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
				//    2    4:getfield        #29  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
				//    3    7:invokevirtual   #34  <Method void OverlayListView.startAnimationAll()>
					mVolumeGroupList.postDelayed(mGroupListFadeInAnimation, mGroupListAnimationDurationMs);
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field MediaRouteControllerDialog this$0>
				//    6   14:getfield        #29  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
				//    7   17:aload_0         
				//    8   18:getfield        #17  <Field MediaRouteControllerDialog this$0>
				//    9   21:getfield        #38  <Field Runnable MediaRouteControllerDialog.mGroupListFadeInAnimation>
				//   10   24:aload_0         
				//   11   25:getfield        #17  <Field MediaRouteControllerDialog this$0>
				//   12   28:getfield        #42  <Field int MediaRouteControllerDialog.mGroupListAnimationDurationMs>
				//   13   31:i2l             
				//   14   32:invokevirtual   #46  <Method boolean OverlayListView.postDelayed(Runnable, long)>
				//   15   35:pop             
				//   16   36:return          
				}

				final MediaRouteControllerDialog this$0;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   15   36:new             #28  <Class MediaRouteControllerDialog$9>
	//   16   39:dup             
	//   17   40:aload_0         
	//   18   41:invokespecial   #744 <Method void MediaRouteControllerDialog$9(MediaRouteControllerDialog)>
	//   19   44:astore          10
			int k1 = mVolumeGroupList.getFirstVisiblePosition();
	//   20   46:aload_0         
	//   21   47:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//   22   50:invokevirtual   #393 <Method int OverlayListView.getFirstVisiblePosition()>
	//   23   53:istore          9
			int k = 0;
	//   24   55:iconst_0        
	//   25   56:istore          4
			int i;
			for(boolean flag = false; k < mVolumeGroupList.getChildCount(); flag = ((boolean) (i)))
	//*  26   58:iconst_0        
	//*  27   59:istore          5
	//*  28   61:iload           4
	//*  29   63:aload_0         
	//*  30   64:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//*  31   67:invokevirtual   #396 <Method int OverlayListView.getChildCount()>
	//*  32   70:icmpge          330
			{
				View view = mVolumeGroupList.getChildAt(k);
	//   33   73:aload_0         
	//   34   74:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//   35   77:iload           4
	//   36   79:invokevirtual   #400 <Method View OverlayListView.getChildAt(int)>
	//   37   82:astore          11
				android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)mVolumeGroupAdapter.getItem(k1 + k);
	//   38   84:aload_0         
	//   39   85:getfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   40   88:iload           9
	//   41   90:iload           4
	//   42   92:iadd            
	//   43   93:invokevirtual   #406 <Method Object MediaRouteControllerDialog$VolumeGroupAdapter.getItem(int)>
	//   44   96:checkcast       #408 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   45   99:astore          12
				Object obj = ((Object) ((Rect)map.get(((Object) (routeinfo)))));
	//   46  101:aload_1         
	//   47  102:aload           12
	//   48  104:invokeinterface #750 <Method Object Map.get(Object)>
	//   49  109:checkcast       #752 <Class Rect>
	//   50  112:astore          13
				int i1 = view.getTop();
	//   51  114:aload           11
	//   52  116:invokevirtual   #755 <Method int View.getTop()>
	//   53  119:istore          7
				if(obj != null)
	//*  54  121:aload           13
	//*  55  123:ifnull          135
					i = ((Rect) (obj)).top;
	//   56  126:aload           13
	//   57  128:getfield        #758 <Field int Rect.top>
	//   58  131:istore_3        
				else
	//*  59  132:goto            146
					i = mVolumeGroupListItemHeight * j1 + i1;
	//   60  135:aload_0         
	//   61  136:getfield        #760 <Field int mVolumeGroupListItemHeight>
	//   62  139:iload           8
	//   63  141:imul            
	//   64  142:iload           7
	//   65  144:iadd            
	//   66  145:istore_3        
				obj = ((Object) (new AnimationSet(true)));
	//   67  146:new             #762 <Class AnimationSet>
	//   68  149:dup             
	//   69  150:iconst_1        
	//   70  151:invokespecial   #764 <Method void AnimationSet(boolean)>
	//   71  154:astore          13
				int l = i;
	//   72  156:iload_3         
	//   73  157:istore          6
				if(mGroupMemberRoutesAdded != null)
	//*  74  159:aload_0         
	//*  75  160:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//*  76  163:ifnull          215
				{
					l = i;
	//   77  166:iload_3         
	//   78  167:istore          6
					if(mGroupMemberRoutesAdded.contains(((Object) (routeinfo))))
	//*  79  169:aload_0         
	//*  80  170:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//*  81  173:aload           12
	//*  82  175:invokeinterface #416 <Method boolean Set.contains(Object)>
	//*  83  180:ifeq            215
					{
						AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 0.0F);
	//   84  183:new             #418 <Class AlphaAnimation>
	//   85  186:dup             
	//   86  187:fconst_0        
	//   87  188:fconst_0        
	//   88  189:invokespecial   #421 <Method void AlphaAnimation(float, float)>
	//   89  192:astore          14
						((Animation) (alphaanimation)).setDuration(mGroupListFadeInDurationMs);
	//   90  194:aload           14
	//   91  196:aload_0         
	//   92  197:getfield        #423 <Field int mGroupListFadeInDurationMs>
	//   93  200:i2l             
	//   94  201:invokevirtual   #368 <Method void Animation.setDuration(long)>
						((AnimationSet) (obj)).addAnimation(((Animation) (alphaanimation)));
	//   95  204:aload           13
	//   96  206:aload           14
	//   97  208:invokevirtual   #767 <Method void AnimationSet.addAnimation(Animation)>
						l = i1;
	//   98  211:iload           7
	//   99  213:istore          6
					}
				}
				TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, l - i1, 0.0F);
	//  100  215:new             #769 <Class TranslateAnimation>
	//  101  218:dup             
	//  102  219:fconst_0        
	//  103  220:fconst_0        
	//  104  221:iload           6
	//  105  223:iload           7
	//  106  225:isub            
	//  107  226:i2f             
	//  108  227:fconst_0        
	//  109  228:invokespecial   #772 <Method void TranslateAnimation(float, float, float, float)>
	//  110  231:astore          14
				((Animation) (translateanimation)).setDuration(mGroupListAnimationDurationMs);
	//  111  233:aload           14
	//  112  235:aload_0         
	//  113  236:getfield        #362 <Field int mGroupListAnimationDurationMs>
	//  114  239:i2l             
	//  115  240:invokevirtual   #368 <Method void Animation.setDuration(long)>
				((AnimationSet) (obj)).addAnimation(((Animation) (translateanimation)));
	//  116  243:aload           13
	//  117  245:aload           14
	//  118  247:invokevirtual   #767 <Method void AnimationSet.addAnimation(Animation)>
				((AnimationSet) (obj)).setFillAfter(true);
	//  119  250:aload           13
	//  120  252:iconst_1        
	//  121  253:invokevirtual   #773 <Method void AnimationSet.setFillAfter(boolean)>
				((AnimationSet) (obj)).setFillEnabled(true);
	//  122  256:aload           13
	//  123  258:iconst_1        
	//  124  259:invokevirtual   #774 <Method void AnimationSet.setFillEnabled(boolean)>
				((AnimationSet) (obj)).setInterpolator(mInterpolator);
	//  125  262:aload           13
	//  126  264:aload_0         
	//  127  265:getfield        #370 <Field Interpolator mInterpolator>
	//  128  268:invokevirtual   #775 <Method void AnimationSet.setInterpolator(Interpolator)>
				i = ((int) (flag));
	//  129  271:iload           5
	//  130  273:istore_3        
				if(!flag)
	//* 131  274:iload           5
	//* 132  276:ifne            288
				{
					((AnimationSet) (obj)).setAnimationListener(animationlistener);
	//  133  279:aload           13
	//  134  281:aload           10
	//  135  283:invokevirtual   #776 <Method void AnimationSet.setAnimationListener(android.view.animation.Animation$AnimationListener)>
					i = 1;
	//  136  286:iconst_1        
	//  137  287:istore_3        
				}
				view.clearAnimation();
	//  138  288:aload           11
	//  139  290:invokevirtual   #436 <Method void View.clearAnimation()>
				view.startAnimation(((Animation) (obj)));
	//  140  293:aload           11
	//  141  295:aload           13
	//  142  297:invokevirtual   #380 <Method void View.startAnimation(Animation)>
				map.remove(((Object) (routeinfo)));
	//  143  300:aload_1         
	//  144  301:aload           12
	//  145  303:invokeinterface #779 <Method Object Map.remove(Object)>
	//  146  308:pop             
				map1.remove(((Object) (routeinfo)));
	//  147  309:aload_2         
	//  148  310:aload           12
	//  149  312:invokeinterface #779 <Method Object Map.remove(Object)>
	//  150  317:pop             
				k++;
	//  151  318:iload           4
	//  152  320:iconst_1        
	//  153  321:iadd            
	//  154  322:istore          4
			}

	//  155  324:iload_3         
	//  156  325:istore          5
	//* 157  327:goto            61
			for(Iterator iterator = map1.entrySet().iterator(); iterator.hasNext(); mVolumeGroupList.addOverlayObject(((OverlayListView.OverlayObject) (map1))))
	//* 158  330:aload_2         
	//* 159  331:invokeinterface #783 <Method Set Map.entrySet()>
	//* 160  336:invokeinterface #787 <Method Iterator Set.iterator()>
	//* 161  341:astore          10
	//* 162  343:aload           10
	//* 163  345:invokeinterface #792 <Method boolean Iterator.hasNext()>
	//* 164  350:ifeq            520
			{
				map1 = ((Map) ((java.util.Map.Entry)iterator.next()));
	//  165  353:aload           10
	//  166  355:invokeinterface #796 <Method Object Iterator.next()>
	//  167  360:checkcast       #798 <Class java.util.Map$Entry>
	//  168  363:astore_2        
				final android.support.v7.media.MediaRouter.RouteInfo route = (android.support.v7.media.MediaRouter.RouteInfo)((java.util.Map.Entry) (map1)).getKey();
	//  169  364:aload_2         
	//  170  365:invokeinterface #801 <Method Object java.util.Map$Entry.getKey()>
	//  171  370:checkcast       #408 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//  172  373:astore          11
				map1 = ((Map) ((BitmapDrawable)((java.util.Map.Entry) (map1)).getValue()));
	//  173  375:aload_2         
	//  174  376:invokeinterface #804 <Method Object java.util.Map$Entry.getValue()>
	//  175  381:checkcast       #806 <Class BitmapDrawable>
	//  176  384:astore_2        
				Rect rect = (Rect)map.get(((Object) (route)));
	//  177  385:aload_1         
	//  178  386:aload           11
	//  179  388:invokeinterface #750 <Method Object Map.get(Object)>
	//  180  393:checkcast       #752 <Class Rect>
	//  181  396:astore          12
				if(mGroupMemberRoutesRemoved.contains(((Object) (route))))
	//* 182  398:aload_0         
	//* 183  399:getfield        #555 <Field Set mGroupMemberRoutesRemoved>
	//* 184  402:aload           11
	//* 185  404:invokeinterface #416 <Method boolean Set.contains(Object)>
	//* 186  409:ifeq            446
				{
					map1 = ((Map) ((new OverlayListView.OverlayObject(((BitmapDrawable) (map1)), rect)).setAlphaAnimation(1.0F, 0.0F).setDuration(mGroupListFadeOutDurationMs).setInterpolator(mInterpolator)));
	//  187  412:new             #808 <Class OverlayListView$OverlayObject>
	//  188  415:dup             
	//  189  416:aload_2         
	//  190  417:aload           12
	//  191  419:invokespecial   #811 <Method void OverlayListView$OverlayObject(BitmapDrawable, Rect)>
	//  192  422:fconst_1        
	//  193  423:fconst_0        
	//  194  424:invokevirtual   #815 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setAlphaAnimation(float, float)>
	//  195  427:aload_0         
	//  196  428:getfield        #817 <Field int mGroupListFadeOutDurationMs>
	//  197  431:i2l             
	//  198  432:invokevirtual   #820 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setDuration(long)>
	//  199  435:aload_0         
	//  200  436:getfield        #370 <Field Interpolator mInterpolator>
	//  201  439:invokevirtual   #823 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setInterpolator(Interpolator)>
	//  202  442:astore_2        
				} else
	//* 203  443:goto            509
				{
					int j = mVolumeGroupListItemHeight;
	//  204  446:aload_0         
	//  205  447:getfield        #760 <Field int mVolumeGroupListItemHeight>
	//  206  450:istore_3        
					map1 = ((Map) ((new OverlayListView.OverlayObject(((BitmapDrawable) (map1)), rect)).setTranslateYAnimation(j * j1).setDuration(mGroupListAnimationDurationMs).setInterpolator(mInterpolator).setAnimationEndListener(new OverlayListView.OverlayObject.OnAnimationEndListener() {

						public void onAnimationEnd()
						{
							mGroupMemberRoutesAnimatingWithBitmap.remove(((Object) (route)));
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field MediaRouteControllerDialog this$0>
						//    2    4:getfield        #30  <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAnimatingWithBitmap>
						//    3    7:aload_0         
						//    4    8:getfield        #21  <Field android.support.v7.media.MediaRouter$RouteInfo val$route>
						//    5   11:invokeinterface #36  <Method boolean Set.remove(Object)>
						//    6   16:pop             
							mVolumeGroupAdapter.notifyDataSetChanged();
						//    7   17:aload_0         
						//    8   18:getfield        #19  <Field MediaRouteControllerDialog this$0>
						//    9   21:getfield        #40  <Field MediaRouteControllerDialog$VolumeGroupAdapter MediaRouteControllerDialog.mVolumeGroupAdapter>
						//   10   24:invokevirtual   #45  <Method void MediaRouteControllerDialog$VolumeGroupAdapter.notifyDataSetChanged()>
						//   11   27:return          
						}

						final MediaRouteControllerDialog this$0;
						final android.support.v7.media.MediaRouter.RouteInfo val$route;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MediaRouteControllerDialog this$0>
				route = routeinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.support.v7.media.MediaRouter$RouteInfo val$route>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
)));
	//  207  451:new             #808 <Class OverlayListView$OverlayObject>
	//  208  454:dup             
	//  209  455:aload_2         
	//  210  456:aload           12
	//  211  458:invokespecial   #811 <Method void OverlayListView$OverlayObject(BitmapDrawable, Rect)>
	//  212  461:iload_3         
	//  213  462:iload           8
	//  214  464:imul            
	//  215  465:invokevirtual   #827 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setTranslateYAnimation(int)>
	//  216  468:aload_0         
	//  217  469:getfield        #362 <Field int mGroupListAnimationDurationMs>
	//  218  472:i2l             
	//  219  473:invokevirtual   #820 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setDuration(long)>
	//  220  476:aload_0         
	//  221  477:getfield        #370 <Field Interpolator mInterpolator>
	//  222  480:invokevirtual   #823 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setInterpolator(Interpolator)>
	//  223  483:new             #8   <Class MediaRouteControllerDialog$10>
	//  224  486:dup             
	//  225  487:aload_0         
	//  226  488:aload           11
	//  227  490:invokespecial   #830 <Method void MediaRouteControllerDialog$10(MediaRouteControllerDialog, android.support.v7.media.MediaRouter$RouteInfo)>
	//  228  493:invokevirtual   #834 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setAnimationEndListener(OverlayListView$OverlayObject$OnAnimationEndListener)>
	//  229  496:astore_2        
					mGroupMemberRoutesAnimatingWithBitmap.add(((Object) (route)));
	//  230  497:aload_0         
	//  231  498:getfield        #836 <Field Set mGroupMemberRoutesAnimatingWithBitmap>
	//  232  501:aload           11
	//  233  503:invokeinterface #839 <Method boolean Set.add(Object)>
	//  234  508:pop             
				}
			}

	//  235  509:aload_0         
	//  236  510:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//  237  513:aload_2         
	//  238  514:invokevirtual   #843 <Method void OverlayListView.addOverlayObject(OverlayListView$OverlayObject)>
	//* 239  517:goto            343
			return;
	//  240  520:return          
		} else
		{
			return;
	//  241  521:return          
		}
	}

	void clearGroupListAnimation(boolean flag)
	{
		int j = mVolumeGroupList.getFirstVisiblePosition();
	//    0    0:aload_0         
	//    1    1:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//    2    4:invokevirtual   #393 <Method int OverlayListView.getFirstVisiblePosition()>
	//    3    7:istore_3        
		for(int i = 0; i < mVolumeGroupList.getChildCount(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//*   9   15:invokevirtual   #396 <Method int OverlayListView.getChildCount()>
	//*  10   18:icmpge          169
		{
			View view = mVolumeGroupList.getChildAt(i);
	//   11   21:aload_0         
	//   12   22:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #400 <Method View OverlayListView.getChildAt(int)>
	//   15   29:astore          4
			android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)mVolumeGroupAdapter.getItem(j + i);
	//   16   31:aload_0         
	//   17   32:getfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   18   35:iload_3         
	//   19   36:iload_2         
	//   20   37:iadd            
	//   21   38:invokevirtual   #406 <Method Object MediaRouteControllerDialog$VolumeGroupAdapter.getItem(int)>
	//   22   41:checkcast       #408 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   23   44:astore          5
			if(!flag || mGroupMemberRoutesAdded == null || !mGroupMemberRoutesAdded.contains(((Object) (routeinfo))))
	//*  24   46:iload_1         
	//*  25   47:ifeq            74
	//*  26   50:aload_0         
	//*  27   51:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//*  28   54:ifnull          74
	//*  29   57:aload_0         
	//*  30   58:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//*  31   61:aload           5
	//*  32   63:invokeinterface #416 <Method boolean Set.contains(Object)>
	//*  33   68:ifeq            74
	//*  34   71:goto            162
			{
				((LinearLayout)view.findViewById(android.support.v7.mediarouter.R.id.volume_item_container)).setVisibility(0);
	//   35   74:aload           4
	//   36   76:getstatic       #849 <Field int android.support.v7.mediarouter.R$id.volume_item_container>
	//   37   79:invokevirtual   #852 <Method View View.findViewById(int)>
	//   38   82:checkcast       #455 <Class LinearLayout>
	//   39   85:iconst_0        
	//   40   86:invokevirtual   #625 <Method void LinearLayout.setVisibility(int)>
				AnimationSet animationset = new AnimationSet(true);
	//   41   89:new             #762 <Class AnimationSet>
	//   42   92:dup             
	//   43   93:iconst_1        
	//   44   94:invokespecial   #764 <Method void AnimationSet(boolean)>
	//   45   97:astore          5
				AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 1.0F);
	//   46   99:new             #418 <Class AlphaAnimation>
	//   47  102:dup             
	//   48  103:fconst_1        
	//   49  104:fconst_1        
	//   50  105:invokespecial   #421 <Method void AlphaAnimation(float, float)>
	//   51  108:astore          6
				((Animation) (alphaanimation)).setDuration(0L);
	//   52  110:aload           6
	//   53  112:lconst_0        
	//   54  113:invokevirtual   #368 <Method void Animation.setDuration(long)>
				animationset.addAnimation(((Animation) (alphaanimation)));
	//   55  116:aload           5
	//   56  118:aload           6
	//   57  120:invokevirtual   #767 <Method void AnimationSet.addAnimation(Animation)>
				((Animation) (new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F))).setDuration(0L);
	//   58  123:new             #769 <Class TranslateAnimation>
	//   59  126:dup             
	//   60  127:fconst_0        
	//   61  128:fconst_0        
	//   62  129:fconst_0        
	//   63  130:fconst_0        
	//   64  131:invokespecial   #772 <Method void TranslateAnimation(float, float, float, float)>
	//   65  134:lconst_0        
	//   66  135:invokevirtual   #368 <Method void Animation.setDuration(long)>
				animationset.setFillAfter(true);
	//   67  138:aload           5
	//   68  140:iconst_1        
	//   69  141:invokevirtual   #773 <Method void AnimationSet.setFillAfter(boolean)>
				animationset.setFillEnabled(true);
	//   70  144:aload           5
	//   71  146:iconst_1        
	//   72  147:invokevirtual   #774 <Method void AnimationSet.setFillEnabled(boolean)>
				view.clearAnimation();
	//   73  150:aload           4
	//   74  152:invokevirtual   #436 <Method void View.clearAnimation()>
				view.startAnimation(((Animation) (animationset)));
	//   75  155:aload           4
	//   76  157:aload           5
	//   77  159:invokevirtual   #380 <Method void View.startAnimation(Animation)>
			}
		}

	//   78  162:iload_2         
	//   79  163:iconst_1        
	//   80  164:iadd            
	//   81  165:istore_2        
	//*  82  166:goto            10
		mVolumeGroupList.stopAnimationAll();
	//   83  169:aload_0         
	//   84  170:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//   85  173:invokevirtual   #855 <Method void OverlayListView.stopAnimationAll()>
		if(!flag)
	//*  86  176:iload_1         
	//*  87  177:ifne            185
			finishAnimation(false);
	//   88  180:aload_0         
	//   89  181:iconst_0        
	//   90  182:invokevirtual   #858 <Method void finishAnimation(boolean)>
	//   91  185:return          
	}

	void clearLoadedBitmap()
	{
		mArtIconIsLoaded = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #861 <Field boolean mArtIconIsLoaded>
		mArtIconLoadedBitmap = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #863 <Field Bitmap mArtIconLoadedBitmap>
		mArtIconBackgroundColor = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #865 <Field int mArtIconBackgroundColor>
	//    9   15:return          
	}

	void finishAnimation(boolean flag)
	{
		mGroupMemberRoutesAdded = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #410 <Field Set mGroupMemberRoutesAdded>
		mGroupMemberRoutesRemoved = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #555 <Field Set mGroupMemberRoutesRemoved>
		mIsGroupListAnimating = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #336 <Field boolean mIsGroupListAnimating>
		if(mIsGroupListAnimationPending)
	//*   9   15:aload_0         
	//*  10   16:getfield        #867 <Field boolean mIsGroupListAnimationPending>
	//*  11   19:ifeq            32
		{
			mIsGroupListAnimationPending = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #867 <Field boolean mIsGroupListAnimationPending>
			updateLayoutHeight(flag);
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:invokevirtual   #870 <Method void updateLayoutHeight(boolean)>
		}
		mVolumeGroupList.setEnabled(true);
	//   18   32:aload_0         
	//   19   33:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//   20   36:iconst_1        
	//   21   37:invokevirtual   #331 <Method void OverlayListView.setEnabled(boolean)>
	//   22   40:return          
	}

	int getDesiredArtHeight(int i, int j)
	{
		if(i >= j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmplt          22
			return (int)(((float)mDialogContentWidth * (float)j) / (float)i + 0.5F);
	//    3    5:aload_0         
	//    4    6:getfield        #874 <Field int mDialogContentWidth>
	//    5    9:i2f             
	//    6   10:iload_2         
	//    7   11:i2f             
	//    8   12:fmul            
	//    9   13:iload_1         
	//   10   14:i2f             
	//   11   15:fdiv            
	//   12   16:ldc2            #875 <Float 0.5F>
	//   13   19:fadd            
	//   14   20:f2i             
	//   15   21:ireturn         
		else
			return (int)(((float)mDialogContentWidth * 9F) / 16F + 0.5F);
	//   16   22:aload_0         
	//   17   23:getfield        #874 <Field int mDialogContentWidth>
	//   18   26:i2f             
	//   19   27:ldc2            #876 <Float 9F>
	//   20   30:fmul            
	//   21   31:ldc2            #877 <Float 16F>
	//   22   34:fdiv            
	//   23   35:ldc2            #875 <Float 0.5F>
	//   24   38:fadd            
	//   25   39:f2i             
	//   26   40:ireturn         
	}

	public View getMediaControlView()
	{
		return mCustomControlView;
	//    0    0:aload_0         
	//    1    1:getfield        #383 <Field View mCustomControlView>
	//    2    4:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getMediaSession()
	{
		if(mMediaController == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #579 <Field MediaControllerCompat mMediaController>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mMediaController.getSessionToken();
	//    5    9:aload_0         
	//    6   10:getfield        #579 <Field MediaControllerCompat mMediaController>
	//    7   13:invokevirtual   #883 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaControllerCompat.getSessionToken()>
	//    8   16:areturn         
	}

	public android.support.v7.media.MediaRouter.RouteInfo getRoute()
	{
		return mRoute;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//    2    4:areturn         
	}

	boolean isVolumeControlAvailable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		return mVolumeControlEnabled && routeinfo.getVolumeHandling() == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field boolean mVolumeControlEnabled>
	//    2    4:ifeq            17
	//    3    7:aload_1         
	//    4    8:invokevirtual   #887 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolumeHandling()>
	//    5   11:iconst_1        
	//    6   12:icmpne          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean isVolumeControlEnabled()
	{
		return mVolumeControlEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field boolean mVolumeControlEnabled>
	//    2    4:ireturn         
	}

	void loadInterpolator()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #277 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          34
		{
			Interpolator interpolator;
			if(mIsGroupExpanded)
	//*   3    8:aload_0         
	//*   4    9:getfield        #565 <Field boolean mIsGroupExpanded>
	//*   5   12:ifeq            23
				interpolator = mLinearOutSlowInInterpolator;
	//    6   15:aload_0         
	//    7   16:getfield        #290 <Field Interpolator mLinearOutSlowInInterpolator>
	//    8   19:astore_1        
			else
	//*   9   20:goto            28
				interpolator = mFastOutSlowInInterpolator;
	//   10   23:aload_0         
	//   11   24:getfield        #295 <Field Interpolator mFastOutSlowInInterpolator>
	//   12   27:astore_1        
			mInterpolator = interpolator;
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:putfield        #370 <Field Interpolator mInterpolator>
			return;
	//   16   33:return          
		} else
		{
			mInterpolator = mAccelerateDecelerateInterpolator;
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:getfield        #301 <Field Interpolator mAccelerateDecelerateInterpolator>
	//   20   39:putfield        #370 <Field Interpolator mInterpolator>
			return;
	//   21   42:return          
		}
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #891 <Method void AlertDialog.onAttachedToWindow()>
		mAttachedToWindow = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #587 <Field boolean mAttachedToWindow>
		mRouter.addCallback(MediaRouteSelector.EMPTY, ((android.support.v7.media.MediaRouter.Callback) (mCallback)), 2);
	//    5    9:aload_0         
	//    6   10:getfield        #226 <Field MediaRouter mRouter>
	//    7   13:getstatic       #897 <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//    8   16:aload_0         
	//    9   17:getfield        #229 <Field MediaRouteControllerDialog$MediaRouterCallback mCallback>
	//   10   20:iconst_2        
	//   11   21:invokevirtual   #901 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
		setMediaSession(mRouter.getMediaSessionToken());
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #226 <Field MediaRouter mRouter>
	//   15   29:invokevirtual   #239 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaRouter.getMediaSessionToken()>
	//   16   32:invokespecial   #243 <Method void setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
	//   17   35:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #905 <Method void AlertDialog.onCreate(Bundle)>
		getWindow().setBackgroundDrawableResource(0x106000d);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #909 <Method Window getWindow()>
	//    5    9:ldc2            #910 <Int 0x106000d>
	//    6   12:invokevirtual   #915 <Method void Window.setBackgroundDrawableResource(int)>
		setContentView(android.support.v7.mediarouter.R.layout.mr_controller_material_dialog_b);
	//    7   15:aload_0         
	//    8   16:getstatic       #920 <Field int android.support.v7.mediarouter.R$layout.mr_controller_material_dialog_b>
	//    9   19:invokevirtual   #923 <Method void setContentView(int)>
		findViewById(0x102001b).setVisibility(8);
	//   10   22:aload_0         
	//   11   23:ldc1            #53  <Int 0x102001b>
	//   12   25:invokevirtual   #924 <Method View findViewById(int)>
	//   13   28:bipush          8
	//   14   30:invokevirtual   #624 <Method void View.setVisibility(int)>
		Object obj = ((Object) (new ClickListener()));
	//   15   33:new             #30  <Class MediaRouteControllerDialog$ClickListener>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #925 <Method void MediaRouteControllerDialog$ClickListener(MediaRouteControllerDialog)>
	//   19   41:astore          4
		mExpandableAreaLayout = (FrameLayout)findViewById(android.support.v7.mediarouter.R.id.mr_expandable_area);
	//   20   43:aload_0         
	//   21   44:aload_0         
	//   22   45:getstatic       #928 <Field int android.support.v7.mediarouter.R$id.mr_expandable_area>
	//   23   48:invokevirtual   #924 <Method View findViewById(int)>
	//   24   51:checkcast       #930 <Class FrameLayout>
	//   25   54:putfield        #932 <Field FrameLayout mExpandableAreaLayout>
		mExpandableAreaLayout.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//    2    4:invokevirtual   #26  <Method void MediaRouteControllerDialog.dismiss()>
			//    3    7:return          
			}

			final MediaRouteControllerDialog this$0;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   26   57:aload_0         
	//   27   58:getfield        #932 <Field FrameLayout mExpandableAreaLayout>
	//   28   61:new             #14  <Class MediaRouteControllerDialog$2>
	//   29   64:dup             
	//   30   65:aload_0         
	//   31   66:invokespecial   #933 <Method void MediaRouteControllerDialog$2(MediaRouteControllerDialog)>
	//   32   69:invokevirtual   #937 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		mDialogAreaLayout = (LinearLayout)findViewById(android.support.v7.mediarouter.R.id.mr_dialog_area);
	//   33   72:aload_0         
	//   34   73:aload_0         
	//   35   74:getstatic       #940 <Field int android.support.v7.mediarouter.R$id.mr_dialog_area>
	//   36   77:invokevirtual   #924 <Method View findViewById(int)>
	//   37   80:checkcast       #455 <Class LinearLayout>
	//   38   83:putfield        #942 <Field LinearLayout mDialogAreaLayout>
		mDialogAreaLayout.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
			//    0    0:return          
			}

			final MediaRouteControllerDialog this$0;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   39   86:aload_0         
	//   40   87:getfield        #942 <Field LinearLayout mDialogAreaLayout>
	//   41   90:new             #16  <Class MediaRouteControllerDialog$3>
	//   42   93:dup             
	//   43   94:aload_0         
	//   44   95:invokespecial   #943 <Method void MediaRouteControllerDialog$3(MediaRouteControllerDialog)>
	//   45   98:invokevirtual   #944 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
		int i = MediaRouterThemeHelper.getButtonTextColor(mContext);
	//   46  101:aload_0         
	//   47  102:getfield        #215 <Field Context mContext>
	//   48  105:invokestatic    #947 <Method int MediaRouterThemeHelper.getButtonTextColor(Context)>
	//   49  108:istore_2        
		mDisconnectButton = (Button)findViewById(0x102001a);
	//   50  109:aload_0         
	//   51  110:aload_0         
	//   52  111:ldc1            #51  <Int 0x102001a>
	//   53  113:invokevirtual   #924 <Method View findViewById(int)>
	//   54  116:checkcast       #949 <Class Button>
	//   55  119:putfield        #951 <Field Button mDisconnectButton>
		mDisconnectButton.setText(android.support.v7.mediarouter.R.string.mr_controller_disconnect);
	//   56  122:aload_0         
	//   57  123:getfield        #951 <Field Button mDisconnectButton>
	//   58  126:getstatic       #954 <Field int android.support.v7.mediarouter.R$string.mr_controller_disconnect>
	//   59  129:invokevirtual   #955 <Method void Button.setText(int)>
		mDisconnectButton.setTextColor(i);
	//   60  132:aload_0         
	//   61  133:getfield        #951 <Field Button mDisconnectButton>
	//   62  136:iload_2         
	//   63  137:invokevirtual   #958 <Method void Button.setTextColor(int)>
		mDisconnectButton.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   64  140:aload_0         
	//   65  141:getfield        #951 <Field Button mDisconnectButton>
	//   66  144:aload           4
	//   67  146:invokevirtual   #959 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		mStopCastingButton = (Button)findViewById(0x1020019);
	//   68  149:aload_0         
	//   69  150:aload_0         
	//   70  151:ldc1            #55  <Int 0x1020019>
	//   71  153:invokevirtual   #924 <Method View findViewById(int)>
	//   72  156:checkcast       #949 <Class Button>
	//   73  159:putfield        #961 <Field Button mStopCastingButton>
		mStopCastingButton.setText(android.support.v7.mediarouter.R.string.mr_controller_stop_casting);
	//   74  162:aload_0         
	//   75  163:getfield        #961 <Field Button mStopCastingButton>
	//   76  166:getstatic       #964 <Field int android.support.v7.mediarouter.R$string.mr_controller_stop_casting>
	//   77  169:invokevirtual   #955 <Method void Button.setText(int)>
		mStopCastingButton.setTextColor(i);
	//   78  172:aload_0         
	//   79  173:getfield        #961 <Field Button mStopCastingButton>
	//   80  176:iload_2         
	//   81  177:invokevirtual   #958 <Method void Button.setTextColor(int)>
		mStopCastingButton.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   82  180:aload_0         
	//   83  181:getfield        #961 <Field Button mStopCastingButton>
	//   84  184:aload           4
	//   85  186:invokevirtual   #959 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		mRouteNameTextView = (TextView)findViewById(android.support.v7.mediarouter.R.id.mr_name);
	//   86  189:aload_0         
	//   87  190:aload_0         
	//   88  191:getstatic       #967 <Field int android.support.v7.mediarouter.R$id.mr_name>
	//   89  194:invokevirtual   #924 <Method View findViewById(int)>
	//   90  197:checkcast       #653 <Class TextView>
	//   91  200:putfield        #969 <Field TextView mRouteNameTextView>
		mCloseButton = (ImageButton)findViewById(android.support.v7.mediarouter.R.id.mr_close);
	//   92  203:aload_0         
	//   93  204:aload_0         
	//   94  205:getstatic       #972 <Field int android.support.v7.mediarouter.R$id.mr_close>
	//   95  208:invokevirtual   #924 <Method View findViewById(int)>
	//   96  211:checkcast       #675 <Class ImageButton>
	//   97  214:putfield        #974 <Field ImageButton mCloseButton>
		mCloseButton.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   98  217:aload_0         
	//   99  218:getfield        #974 <Field ImageButton mCloseButton>
	//  100  221:aload           4
	//  101  223:invokevirtual   #975 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		mCustomControlLayout = (FrameLayout)findViewById(android.support.v7.mediarouter.R.id.mr_custom_control);
	//  102  226:aload_0         
	//  103  227:aload_0         
	//  104  228:getstatic       #978 <Field int android.support.v7.mediarouter.R$id.mr_custom_control>
	//  105  231:invokevirtual   #924 <Method View findViewById(int)>
	//  106  234:checkcast       #930 <Class FrameLayout>
	//  107  237:putfield        #980 <Field FrameLayout mCustomControlLayout>
		mDefaultControlLayout = (FrameLayout)findViewById(android.support.v7.mediarouter.R.id.mr_default_control);
	//  108  240:aload_0         
	//  109  241:aload_0         
	//  110  242:getstatic       #983 <Field int android.support.v7.mediarouter.R$id.mr_default_control>
	//  111  245:invokevirtual   #924 <Method View findViewById(int)>
	//  112  248:checkcast       #930 <Class FrameLayout>
	//  113  251:putfield        #985 <Field FrameLayout mDefaultControlLayout>
		Object obj1 = ((Object) (new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				android.app.PendingIntent.CanceledException canceledexception;
				if(mMediaController != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//*   2    4:getfield        #29  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
			//*   3    7:ifnull          68
				{
					view = ((View) (mMediaController.getSessionActivity()));
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//    6   14:getfield        #29  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
			//    7   17:invokevirtual   #35  <Method PendingIntent MediaControllerCompat.getSessionActivity()>
			//    8   20:astore_1        
					if(view != null)
			//*   9   21:aload_1         
			//*  10   22:ifnull          68
					{
						StringBuilder stringbuilder;
						try
						{
							((PendingIntent) (view)).send();
			//   11   25:aload_1         
			//   12   26:invokevirtual   #40  <Method void PendingIntent.send()>
							dismiss();
			//   13   29:aload_0         
			//   14   30:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//   15   33:invokevirtual   #43  <Method void MediaRouteControllerDialog.dismiss()>
							return;
			//   16   36:return          
						}
			//*  17   37:new             #45  <Class StringBuilder>
			//*  18   40:dup             
			//*  19   41:invokespecial   #46  <Method void StringBuilder()>
			//*  20   44:astore_2        
			//*  21   45:aload_2         
			//*  22   46:aload_1         
			//*  23   47:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
			//*  24   50:pop             
			//*  25   51:aload_2         
			//*  26   52:ldc1            #52  <String " was not sent, it had been canceled.">
			//*  27   54:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//*  28   57:pop             
			//*  29   58:ldc1            #57  <String "MediaRouteCtrlDialog">
			//*  30   60:aload_2         
			//*  31   61:invokevirtual   #61  <Method String StringBuilder.toString()>
			//*  32   64:invokestatic    #67  <Method int Log.e(String, String)>
			//*  33   67:pop             
			//*  34   68:return          
						// Misplaced declaration of an exception variable
						catch(android.app.PendingIntent.CanceledException canceledexception)
						{
							stringbuilder = new StringBuilder();
						}
						stringbuilder.append(((Object) (view)));
						stringbuilder.append(" was not sent, it had been canceled.");
						Log.e("MediaRouteCtrlDialog", stringbuilder.toString());
					}
				}
			//*  35   69:astore_2        
			//*  36   70:goto            37
			}

			final MediaRouteControllerDialog this$0;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//  114  254:new             #18  <Class MediaRouteControllerDialog$4>
	//  115  257:dup             
	//  116  258:aload_0         
	//  117  259:invokespecial   #986 <Method void MediaRouteControllerDialog$4(MediaRouteControllerDialog)>
	//  118  262:astore          5
		mArtView = (ImageView)findViewById(android.support.v7.mediarouter.R.id.mr_art);
	//  119  264:aload_0         
	//  120  265:aload_0         
	//  121  266:getstatic       #989 <Field int android.support.v7.mediarouter.R$id.mr_art>
	//  122  269:invokevirtual   #924 <Method View findViewById(int)>
	//  123  272:checkcast       #991 <Class ImageView>
	//  124  275:putfield        #993 <Field ImageView mArtView>
		mArtView.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
	//  125  278:aload_0         
	//  126  279:getfield        #993 <Field ImageView mArtView>
	//  127  282:aload           5
	//  128  284:invokevirtual   #994 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		findViewById(android.support.v7.mediarouter.R.id.mr_control_title_container).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
	//  129  287:aload_0         
	//  130  288:getstatic       #997 <Field int android.support.v7.mediarouter.R$id.mr_control_title_container>
	//  131  291:invokevirtual   #924 <Method View findViewById(int)>
	//  132  294:aload           5
	//  133  296:invokevirtual   #998 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		mMediaMainControlLayout = (LinearLayout)findViewById(android.support.v7.mediarouter.R.id.mr_media_main_control);
	//  134  299:aload_0         
	//  135  300:aload_0         
	//  136  301:getstatic       #1001 <Field int android.support.v7.mediarouter.R$id.mr_media_main_control>
	//  137  304:invokevirtual   #924 <Method View findViewById(int)>
	//  138  307:checkcast       #455 <Class LinearLayout>
	//  139  310:putfield        #460 <Field LinearLayout mMediaMainControlLayout>
		mDividerView = findViewById(android.support.v7.mediarouter.R.id.mr_control_divider);
	//  140  313:aload_0         
	//  141  314:aload_0         
	//  142  315:getstatic       #1004 <Field int android.support.v7.mediarouter.R$id.mr_control_divider>
	//  143  318:invokevirtual   #924 <Method View findViewById(int)>
	//  144  321:putfield        #476 <Field View mDividerView>
		mPlaybackControlLayout = (RelativeLayout)findViewById(android.support.v7.mediarouter.R.id.mr_playback_control);
	//  145  324:aload_0         
	//  146  325:aload_0         
	//  147  326:getstatic       #1007 <Field int android.support.v7.mediarouter.R$id.mr_playback_control>
	//  148  329:invokevirtual   #924 <Method View findViewById(int)>
	//  149  332:checkcast       #470 <Class RelativeLayout>
	//  150  335:putfield        #468 <Field RelativeLayout mPlaybackControlLayout>
		mTitleView = (TextView)findViewById(android.support.v7.mediarouter.R.id.mr_control_title);
	//  151  338:aload_0         
	//  152  339:aload_0         
	//  153  340:getstatic       #1010 <Field int android.support.v7.mediarouter.R$id.mr_control_title>
	//  154  343:invokevirtual   #924 <Method View findViewById(int)>
	//  155  346:checkcast       #653 <Class TextView>
	//  156  349:putfield        #646 <Field TextView mTitleView>
		mSubtitleView = (TextView)findViewById(android.support.v7.mediarouter.R.id.mr_control_subtitle);
	//  157  352:aload_0         
	//  158  353:aload_0         
	//  159  354:getstatic       #1013 <Field int android.support.v7.mediarouter.R$id.mr_control_subtitle>
	//  160  357:invokevirtual   #924 <Method View findViewById(int)>
	//  161  360:checkcast       #653 <Class TextView>
	//  162  363:putfield        #667 <Field TextView mSubtitleView>
		mPlaybackControlButton = (ImageButton)findViewById(android.support.v7.mediarouter.R.id.mr_control_playback_ctrl);
	//  163  366:aload_0         
	//  164  367:aload_0         
	//  165  368:getstatic       #1016 <Field int android.support.v7.mediarouter.R$id.mr_control_playback_ctrl>
	//  166  371:invokevirtual   #924 <Method View findViewById(int)>
	//  167  374:checkcast       #675 <Class ImageButton>
	//  168  377:putfield        #673 <Field ImageButton mPlaybackControlButton>
		mPlaybackControlButton.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//  169  380:aload_0         
	//  170  381:getfield        #673 <Field ImageButton mPlaybackControlButton>
	//  171  384:aload           4
	//  172  386:invokevirtual   #975 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		mVolumeControlLayout = (LinearLayout)findViewById(android.support.v7.mediarouter.R.id.mr_volume_control);
	//  173  389:aload_0         
	//  174  390:aload_0         
	//  175  391:getstatic       #1019 <Field int android.support.v7.mediarouter.R$id.mr_volume_control>
	//  176  394:invokevirtual   #924 <Method View findViewById(int)>
	//  177  397:checkcast       #455 <Class LinearLayout>
	//  178  400:putfield        #453 <Field LinearLayout mVolumeControlLayout>
		mVolumeControlLayout.setVisibility(8);
	//  179  403:aload_0         
	//  180  404:getfield        #453 <Field LinearLayout mVolumeControlLayout>
	//  181  407:bipush          8
	//  182  409:invokevirtual   #625 <Method void LinearLayout.setVisibility(int)>
		mVolumeSlider = (SeekBar)findViewById(android.support.v7.mediarouter.R.id.mr_volume_slider);
	//  183  412:aload_0         
	//  184  413:aload_0         
	//  185  414:getstatic       #1022 <Field int android.support.v7.mediarouter.R$id.mr_volume_slider>
	//  186  417:invokevirtual   #924 <Method View findViewById(int)>
	//  187  420:checkcast       #723 <Class SeekBar>
	//  188  423:putfield        #718 <Field SeekBar mVolumeSlider>
		mVolumeSlider.setTag(((Object) (mRoute)));
	//  189  426:aload_0         
	//  190  427:getfield        #718 <Field SeekBar mVolumeSlider>
	//  191  430:aload_0         
	//  192  431:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//  193  434:invokevirtual   #1026 <Method void SeekBar.setTag(Object)>
		mVolumeChangeListener = new VolumeChangeListener();
	//  194  437:aload_0         
	//  195  438:new             #42  <Class MediaRouteControllerDialog$VolumeChangeListener>
	//  196  441:dup             
	//  197  442:aload_0         
	//  198  443:invokespecial   #1027 <Method void MediaRouteControllerDialog$VolumeChangeListener(MediaRouteControllerDialog)>
	//  199  446:putfield        #1029 <Field MediaRouteControllerDialog$VolumeChangeListener mVolumeChangeListener>
		mVolumeSlider.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
	//  200  449:aload_0         
	//  201  450:getfield        #718 <Field SeekBar mVolumeSlider>
	//  202  453:aload_0         
	//  203  454:getfield        #1029 <Field MediaRouteControllerDialog$VolumeChangeListener mVolumeChangeListener>
	//  204  457:invokevirtual   #1033 <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
		mVolumeGroupList = (OverlayListView)findViewById(android.support.v7.mediarouter.R.id.mr_volume_group_list);
	//  205  460:aload_0         
	//  206  461:aload_0         
	//  207  462:getstatic       #1036 <Field int android.support.v7.mediarouter.R$id.mr_volume_group_list>
	//  208  465:invokevirtual   #924 <Method View findViewById(int)>
	//  209  468:checkcast       #327 <Class OverlayListView>
	//  210  471:putfield        #325 <Field OverlayListView mVolumeGroupList>
		mGroupMemberRoutes = ((List) (new ArrayList()));
	//  211  474:aload_0         
	//  212  475:new             #1038 <Class ArrayList>
	//  213  478:dup             
	//  214  479:invokespecial   #1039 <Method void ArrayList()>
	//  215  482:putfield        #524 <Field List mGroupMemberRoutes>
		mVolumeGroupAdapter = new VolumeGroupAdapter(mVolumeGroupList.getContext(), mGroupMemberRoutes);
	//  216  485:aload_0         
	//  217  486:new             #47  <Class MediaRouteControllerDialog$VolumeGroupAdapter>
	//  218  489:dup             
	//  219  490:aload_0         
	//  220  491:aload_0         
	//  221  492:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//  222  495:invokevirtual   #1040 <Method Context OverlayListView.getContext()>
	//  223  498:aload_0         
	//  224  499:getfield        #524 <Field List mGroupMemberRoutes>
	//  225  502:invokespecial   #1043 <Method void MediaRouteControllerDialog$VolumeGroupAdapter(MediaRouteControllerDialog, Context, List)>
	//  226  505:putfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
		mVolumeGroupList.setAdapter(((android.widget.ListAdapter) (mVolumeGroupAdapter)));
	//  227  508:aload_0         
	//  228  509:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//  229  512:aload_0         
	//  230  513:getfield        #402 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//  231  516:invokevirtual   #1047 <Method void OverlayListView.setAdapter(android.widget.ListAdapter)>
		mGroupMemberRoutesAnimatingWithBitmap = ((Set) (new HashSet()));
	//  232  519:aload_0         
	//  233  520:new             #1049 <Class HashSet>
	//  234  523:dup             
	//  235  524:invokespecial   #1050 <Method void HashSet()>
	//  236  527:putfield        #836 <Field Set mGroupMemberRoutesAnimatingWithBitmap>
		obj = ((Object) (mContext));
	//  237  530:aload_0         
	//  238  531:getfield        #215 <Field Context mContext>
	//  239  534:astore          4
		obj1 = ((Object) (mMediaMainControlLayout));
	//  240  536:aload_0         
	//  241  537:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//  242  540:astore          5
		OverlayListView overlaylistview = mVolumeGroupList;
	//  243  542:aload_0         
	//  244  543:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//  245  546:astore          6
		boolean flag;
		if(getGroup() != null)
	//* 246  548:aload_0         
	//* 247  549:invokespecial   #518 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//* 248  552:ifnull          560
			flag = true;
	//  249  555:iconst_1        
	//  250  556:istore_3        
		else
	//* 251  557:goto            562
			flag = false;
	//  252  560:iconst_0        
	//  253  561:istore_3        
		MediaRouterThemeHelper.setMediaControlsBackgroundColor(((Context) (obj)), ((View) (obj1)), ((View) (overlaylistview)), flag);
	//  254  562:aload           4
	//  255  564:aload           5
	//  256  566:aload           6
	//  257  568:iload_3         
	//  258  569:invokestatic    #1054 <Method void MediaRouterThemeHelper.setMediaControlsBackgroundColor(Context, View, View, boolean)>
		MediaRouterThemeHelper.setVolumeSliderColor(mContext, (MediaRouteVolumeSlider)mVolumeSlider, ((View) (mMediaMainControlLayout)));
	//  259  572:aload_0         
	//  260  573:getfield        #215 <Field Context mContext>
	//  261  576:aload_0         
	//  262  577:getfield        #718 <Field SeekBar mVolumeSlider>
	//  263  580:checkcast       #1056 <Class MediaRouteVolumeSlider>
	//  264  583:aload_0         
	//  265  584:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//  266  587:invokestatic    #1060 <Method void MediaRouterThemeHelper.setVolumeSliderColor(Context, MediaRouteVolumeSlider, View)>
		mVolumeSliderMap = ((Map) (new HashMap()));
	//  267  590:aload_0         
	//  268  591:new             #1062 <Class HashMap>
	//  269  594:dup             
	//  270  595:invokespecial   #1063 <Method void HashMap()>
	//  271  598:putfield        #1065 <Field Map mVolumeSliderMap>
		mVolumeSliderMap.put(((Object) (mRoute)), ((Object) (mVolumeSlider)));
	//  272  601:aload_0         
	//  273  602:getfield        #1065 <Field Map mVolumeSliderMap>
	//  274  605:aload_0         
	//  275  606:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//  276  609:aload_0         
	//  277  610:getfield        #718 <Field SeekBar mVolumeSlider>
	//  278  613:invokeinterface #1069 <Method Object Map.put(Object, Object)>
	//  279  618:pop             
		mGroupExpandCollapseButton = (MediaRouteExpandCollapseButton)findViewById(android.support.v7.mediarouter.R.id.mr_group_expand_collapse);
	//  280  619:aload_0         
	//  281  620:aload_0         
	//  282  621:getstatic       #1072 <Field int android.support.v7.mediarouter.R$id.mr_group_expand_collapse>
	//  283  624:invokevirtual   #924 <Method View findViewById(int)>
	//  284  627:checkcast       #736 <Class MediaRouteExpandCollapseButton>
	//  285  630:putfield        #734 <Field MediaRouteExpandCollapseButton mGroupExpandCollapseButton>
		mGroupExpandCollapseButton.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				mIsGroupExpanded = mIsGroupExpanded ^ true;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//    4    8:getfield        #27  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
			//    5   11:iconst_1        
			//    6   12:ixor            
			//    7   13:putfield        #27  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
				if(mIsGroupExpanded)
			//*   8   16:aload_0         
			//*   9   17:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//*  10   20:getfield        #27  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
			//*  11   23:ifeq            37
					mVolumeGroupList.setVisibility(0);
			//   12   26:aload_0         
			//   13   27:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//   14   30:getfield        #31  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
			//   15   33:iconst_0        
			//   16   34:invokevirtual   #37  <Method void OverlayListView.setVisibility(int)>
				loadInterpolator();
			//   17   37:aload_0         
			//   18   38:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//   19   41:invokevirtual   #40  <Method void MediaRouteControllerDialog.loadInterpolator()>
				updateLayoutHeight(true);
			//   20   44:aload_0         
			//   21   45:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//   22   48:iconst_1        
			//   23   49:invokevirtual   #44  <Method void MediaRouteControllerDialog.updateLayoutHeight(boolean)>
			//   24   52:return          
			}

			final MediaRouteControllerDialog this$0;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  286  633:aload_0         
	//  287  634:getfield        #734 <Field MediaRouteExpandCollapseButton mGroupExpandCollapseButton>
	//  288  637:new             #20  <Class MediaRouteControllerDialog$5>
	//  289  640:dup             
	//  290  641:aload_0         
	//  291  642:invokespecial   #1073 <Method void MediaRouteControllerDialog$5(MediaRouteControllerDialog)>
	//  292  645:invokevirtual   #1074 <Method void MediaRouteExpandCollapseButton.setOnClickListener(android.view.View$OnClickListener)>
		loadInterpolator();
	//  293  648:aload_0         
	//  294  649:invokevirtual   #1076 <Method void loadInterpolator()>
		mGroupListAnimationDurationMs = mContext.getResources().getInteger(android.support.v7.mediarouter.R.integer.mr_controller_volume_group_list_animation_duration_ms);
	//  295  652:aload_0         
	//  296  653:aload_0         
	//  297  654:getfield        #215 <Field Context mContext>
	//  298  657:invokevirtual   #249 <Method Resources Context.getResources()>
	//  299  660:getstatic       #1081 <Field int android.support.v7.mediarouter.R$integer.mr_controller_volume_group_list_animation_duration_ms>
	//  300  663:invokevirtual   #1084 <Method int Resources.getInteger(int)>
	//  301  666:putfield        #362 <Field int mGroupListAnimationDurationMs>
		mGroupListFadeInDurationMs = mContext.getResources().getInteger(android.support.v7.mediarouter.R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
	//  302  669:aload_0         
	//  303  670:aload_0         
	//  304  671:getfield        #215 <Field Context mContext>
	//  305  674:invokevirtual   #249 <Method Resources Context.getResources()>
	//  306  677:getstatic       #1087 <Field int android.support.v7.mediarouter.R$integer.mr_controller_volume_group_list_fade_in_duration_ms>
	//  307  680:invokevirtual   #1084 <Method int Resources.getInteger(int)>
	//  308  683:putfield        #423 <Field int mGroupListFadeInDurationMs>
		mGroupListFadeOutDurationMs = mContext.getResources().getInteger(android.support.v7.mediarouter.R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
	//  309  686:aload_0         
	//  310  687:aload_0         
	//  311  688:getfield        #215 <Field Context mContext>
	//  312  691:invokevirtual   #249 <Method Resources Context.getResources()>
	//  313  694:getstatic       #1090 <Field int android.support.v7.mediarouter.R$integer.mr_controller_volume_group_list_fade_out_duration_ms>
	//  314  697:invokevirtual   #1084 <Method int Resources.getInteger(int)>
	//  315  700:putfield        #817 <Field int mGroupListFadeOutDurationMs>
		mCustomControlView = onCreateMediaControlView(bundle);
	//  316  703:aload_0         
	//  317  704:aload_0         
	//  318  705:aload_1         
	//  319  706:invokevirtual   #1094 <Method View onCreateMediaControlView(Bundle)>
	//  320  709:putfield        #383 <Field View mCustomControlView>
		if(mCustomControlView != null)
	//* 321  712:aload_0         
	//* 322  713:getfield        #383 <Field View mCustomControlView>
	//* 323  716:ifnull          738
		{
			mCustomControlLayout.addView(mCustomControlView);
	//  324  719:aload_0         
	//  325  720:getfield        #980 <Field FrameLayout mCustomControlLayout>
	//  326  723:aload_0         
	//  327  724:getfield        #383 <Field View mCustomControlView>
	//  328  727:invokevirtual   #1098 <Method void FrameLayout.addView(View)>
			mCustomControlLayout.setVisibility(0);
	//  329  730:aload_0         
	//  330  731:getfield        #980 <Field FrameLayout mCustomControlLayout>
	//  331  734:iconst_0        
	//  332  735:invokevirtual   #1099 <Method void FrameLayout.setVisibility(int)>
		}
		mCreated = true;
	//  333  738:aload_0         
	//  334  739:iconst_1        
	//  335  740:putfield        #1101 <Field boolean mCreated>
		updateLayout();
	//  336  743:aload_0         
	//  337  744:invokevirtual   #1104 <Method void updateLayout()>
	//  338  747:return          
	}

	public View onCreateMediaControlView(Bundle bundle)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onDetachedFromWindow()
	{
		mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field MediaRouter mRouter>
	//    2    4:aload_0         
	//    3    5:getfield        #229 <Field MediaRouteControllerDialog$MediaRouterCallback mCallback>
	//    4    8:invokevirtual   #1109 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
		setMediaSession(((android.support.v4.media.session.MediaSessionCompat.Token) (null)));
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:invokespecial   #243 <Method void setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
		mAttachedToWindow = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #587 <Field boolean mAttachedToWindow>
		super.onDetachedFromWindow();
	//   11   21:aload_0         
	//   12   22:invokespecial   #1111 <Method void AlertDialog.onDetachedFromWindow()>
	//   13   25:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i != 25 && i != 24)
	//*   0    0:iload_1         
	//*   1    1:bipush          25
	//*   2    3:icmpeq          22
	//*   3    6:iload_1         
	//*   4    7:bipush          24
	//*   5    9:icmpne          15
	//*   6   12:goto            22
			return super.onKeyDown(i, keyevent);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1115 <Method boolean AlertDialog.onKeyDown(int, KeyEvent)>
	//   11   21:ireturn         
		keyevent = ((KeyEvent) (mRoute));
	//   12   22:aload_0         
	//   13   23:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//   14   26:astore_2        
		if(i == 25)
	//*  15   27:iload_1         
	//*  16   28:bipush          25
	//*  17   30:icmpne          38
			i = -1;
	//   18   33:iconst_m1       
	//   19   34:istore_1        
		else
	//*  20   35:goto            40
			i = 1;
	//   21   38:iconst_1        
	//   22   39:istore_1        
		((android.support.v7.media.MediaRouter.RouteInfo) (keyevent)).requestUpdateVolume(i);
	//   23   40:aload_2         
	//   24   41:iload_1         
	//   25   42:invokevirtual   #1118 <Method void android.support.v7.media.MediaRouter$RouteInfo.requestUpdateVolume(int)>
		return true;
	//   26   45:iconst_1        
	//   27   46:ireturn         
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		if(i != 25 && i != 24)
	//*   0    0:iload_1         
	//*   1    1:bipush          25
	//*   2    3:icmpeq          22
	//*   3    6:iload_1         
	//*   4    7:bipush          24
	//*   5    9:icmpne          15
	//*   6   12:goto            22
			return super.onKeyUp(i, keyevent);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1121 <Method boolean AlertDialog.onKeyUp(int, KeyEvent)>
	//   11   21:ireturn         
		else
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public void setVolumeControlEnabled(boolean flag)
	{
		if(mVolumeControlEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field boolean mVolumeControlEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          25
		{
			mVolumeControlEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #204 <Field boolean mVolumeControlEnabled>
			if(mCreated)
	//*   7   13:aload_0         
	//*   8   14:getfield        #1101 <Field boolean mCreated>
	//*   9   17:ifeq            25
				update(false);
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #619 <Method void update(boolean)>
		}
	//   13   25:return          
	}

	void startGroupListFadeInAnimation()
	{
		clearGroupListAnimation(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1125 <Method void clearGroupListAnimation(boolean)>
		mVolumeGroupList.requestLayout();
	//    3    5:aload_0         
	//    4    6:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//    5    9:invokevirtual   #334 <Method void OverlayListView.requestLayout()>
		mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//    2    4:getfield        #25  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
			//    3    7:invokevirtual   #31  <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
			//    4   10:aload_0         
			//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				startGroupListFadeInAnimationInternal();
			//    6   14:aload_0         
			//    7   15:getfield        #17  <Field MediaRouteControllerDialog this$0>
			//    8   18:invokevirtual   #40  <Method void MediaRouteControllerDialog.startGroupListFadeInAnimationInternal()>
			//    9   21:return          
			}

			final MediaRouteControllerDialog this$0;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    6   12:aload_0         
	//    7   13:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//    8   16:invokevirtual   #340 <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
	//    9   19:new             #10  <Class MediaRouteControllerDialog$11>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #1126 <Method void MediaRouteControllerDialog$11(MediaRouteControllerDialog)>
	//   13   27:invokevirtual   #349 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   14   30:return          
	}

	void startGroupListFadeInAnimationInternal()
	{
		if(mGroupMemberRoutesAdded != null && mGroupMemberRoutesAdded.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #410 <Field Set mGroupMemberRoutesAdded>
	//*   5   11:invokeinterface #568 <Method int Set.size()>
	//*   6   16:ifeq            24
		{
			fadeInAddedRoutes();
	//    7   19:aload_0         
	//    8   20:invokespecial   #1129 <Method void fadeInAddedRoutes()>
			return;
	//    9   23:return          
		} else
		{
			finishAnimation(true);
	//   10   24:aload_0         
	//   11   25:iconst_1        
	//   12   26:invokevirtual   #858 <Method void finishAnimation(boolean)>
			return;
	//   13   29:return          
		}
	}

	void update(boolean flag)
	{
		if(mRouteInVolumeSliderTouched != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1131 <Field android.support.v7.media.MediaRouter$RouteInfo mRouteInVolumeSliderTouched>
	//*   2    4:ifnull          23
		{
			mHasPendingUpdate = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #1133 <Field boolean mHasPendingUpdate>
			mPendingUpdateAnimationNeeded = flag | mPendingUpdateAnimationNeeded;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #1135 <Field boolean mPendingUpdateAnimationNeeded>
	//   10   18:ior             
	//   11   19:putfield        #1135 <Field boolean mPendingUpdateAnimationNeeded>
			return;
	//   12   22:return          
		}
		byte byte0 = 0;
	//   13   23:iconst_0        
	//   14   24:istore_2        
		mHasPendingUpdate = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #1133 <Field boolean mHasPendingUpdate>
		mPendingUpdateAnimationNeeded = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #1135 <Field boolean mPendingUpdateAnimationNeeded>
		if(mRoute.isSelected() && !mRoute.isDefaultOrBluetooth())
	//*  21   35:aload_0         
	//*  22   36:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*  23   39:invokevirtual   #1138 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
	//*  24   42:ifeq            209
	//*  25   45:aload_0         
	//*  26   46:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*  27   49:invokevirtual   #1141 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//*  28   52:ifeq            58
	//*  29   55:goto            209
		{
			if(!mCreated)
	//*  30   58:aload_0         
	//*  31   59:getfield        #1101 <Field boolean mCreated>
	//*  32   62:ifne            66
				return;
	//   33   65:return          
			mRouteNameTextView.setText(((CharSequence) (mRoute.getName())));
	//   34   66:aload_0         
	//   35   67:getfield        #969 <Field TextView mRouteNameTextView>
	//   36   70:aload_0         
	//   37   71:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//   38   74:invokevirtual   #1145 <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
	//   39   77:invokevirtual   #665 <Method void TextView.setText(CharSequence)>
			Button button = mDisconnectButton;
	//   40   80:aload_0         
	//   41   81:getfield        #951 <Field Button mDisconnectButton>
	//   42   84:astore_3        
			if(!mRoute.canDisconnect())
	//*  43   85:aload_0         
	//*  44   86:getfield        #235 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*  45   89:invokevirtual   #1148 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.canDisconnect()>
	//*  46   92:ifeq            98
	//*  47   95:goto            101
				byte0 = 8;
	//   48   98:bipush          8
	//   49  100:istore_2        
			button.setVisibility(((int) (byte0)));
	//   50  101:aload_3         
	//   51  102:iload_2         
	//   52  103:invokevirtual   #1149 <Method void Button.setVisibility(int)>
			if(mCustomControlView == null && mArtIconIsLoaded)
	//*  53  106:aload_0         
	//*  54  107:getfield        #383 <Field View mCustomControlView>
	//*  55  110:ifnonnull       195
	//*  56  113:aload_0         
	//*  57  114:getfield        #861 <Field boolean mArtIconIsLoaded>
	//*  58  117:ifeq            195
			{
				if(isBitmapRecycled(mArtIconLoadedBitmap))
	//*  59  120:aload_0         
	//*  60  121:aload_0         
	//*  61  122:getfield        #863 <Field Bitmap mArtIconLoadedBitmap>
	//*  62  125:invokespecial   #321 <Method boolean isBitmapRecycled(Bitmap)>
	//*  63  128:ifeq            169
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   64  131:new             #1151 <Class StringBuilder>
	//   65  134:dup             
	//   66  135:invokespecial   #1152 <Method void StringBuilder()>
	//   67  138:astore_3        
					stringbuilder.append("Can't set artwork image with recycled bitmap: ");
	//   68  139:aload_3         
	//   69  140:ldc2            #1154 <String "Can't set artwork image with recycled bitmap: ">
	//   70  143:invokevirtual   #1158 <Method StringBuilder StringBuilder.append(String)>
	//   71  146:pop             
					stringbuilder.append(((Object) (mArtIconLoadedBitmap)));
	//   72  147:aload_3         
	//   73  148:aload_0         
	//   74  149:getfield        #863 <Field Bitmap mArtIconLoadedBitmap>
	//   75  152:invokevirtual   #1161 <Method StringBuilder StringBuilder.append(Object)>
	//   76  155:pop             
					Log.w("MediaRouteCtrlDialog", stringbuilder.toString());
	//   77  156:ldc1            #62  <String "MediaRouteCtrlDialog">
	//   78  158:aload_3         
	//   79  159:invokevirtual   #1164 <Method String StringBuilder.toString()>
	//   80  162:invokestatic    #1168 <Method int Log.w(String, String)>
	//   81  165:pop             
				} else
	//*  82  166:goto            191
				{
					mArtView.setImageBitmap(mArtIconLoadedBitmap);
	//   83  169:aload_0         
	//   84  170:getfield        #993 <Field ImageView mArtView>
	//   85  173:aload_0         
	//   86  174:getfield        #863 <Field Bitmap mArtIconLoadedBitmap>
	//   87  177:invokevirtual   #1172 <Method void ImageView.setImageBitmap(Bitmap)>
					mArtView.setBackgroundColor(mArtIconBackgroundColor);
	//   88  180:aload_0         
	//   89  181:getfield        #993 <Field ImageView mArtView>
	//   90  184:aload_0         
	//   91  185:getfield        #865 <Field int mArtIconBackgroundColor>
	//   92  188:invokevirtual   #1175 <Method void ImageView.setBackgroundColor(int)>
				}
				clearLoadedBitmap();
	//   93  191:aload_0         
	//   94  192:invokevirtual   #1177 <Method void clearLoadedBitmap()>
			}
			updateVolumeControlLayout();
	//   95  195:aload_0         
	//   96  196:invokespecial   #1179 <Method void updateVolumeControlLayout()>
			updatePlaybackControlLayout();
	//   97  199:aload_0         
	//   98  200:invokespecial   #1181 <Method void updatePlaybackControlLayout()>
			updateLayoutHeight(flag);
	//   99  203:aload_0         
	//  100  204:iload_1         
	//  101  205:invokevirtual   #870 <Method void updateLayoutHeight(boolean)>
			return;
	//  102  208:return          
		} else
		{
			dismiss();
	//  103  209:aload_0         
	//  104  210:invokevirtual   #1184 <Method void dismiss()>
			return;
	//  105  213:return          
		}
	}

	void updateArtIconIfNeeded()
	{
		if(mCustomControlView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #383 <Field View mCustomControlView>
	//*   2    4:ifnonnull       56
		{
			if(!isIconChanged())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #1186 <Method boolean isIconChanged()>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			if(mFetchArtTask != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #495 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//*   9   19:ifnull          31
				mFetchArtTask.cancel(true);
	//   10   22:aload_0         
	//   11   23:getfield        #495 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #1190 <Method boolean MediaRouteControllerDialog$FetchArtTask.cancel(boolean)>
	//   14   30:pop             
			mFetchArtTask = new FetchArtTask();
	//   15   31:aload_0         
	//   16   32:new             #33  <Class MediaRouteControllerDialog$FetchArtTask>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #1191 <Method void MediaRouteControllerDialog$FetchArtTask(MediaRouteControllerDialog)>
	//   20   40:putfield        #495 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
			mFetchArtTask.execute(((Object []) (new Void[0])));
	//   21   43:aload_0         
	//   22   44:getfield        #495 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//   23   47:iconst_0        
	//   24   48:anewarray       Void[]
	//   25   51:invokevirtual   #1197 <Method AsyncTask MediaRouteControllerDialog$FetchArtTask.execute(Object[])>
	//   26   54:pop             
			return;
	//   27   55:return          
		} else
		{
			return;
	//   28   56:return          
		}
	}

	void updateLayout()
	{
		int i = MediaRouteDialogHelper.getDialogWidth(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field Context mContext>
	//    2    4:invokestatic    #1200 <Method int MediaRouteDialogHelper.getDialogWidth(Context)>
	//    3    7:istore_1        
		getWindow().setLayout(i, -2);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #909 <Method Window getWindow()>
	//    6   12:iload_1         
	//    7   13:bipush          -2
	//    8   15:invokevirtual   #1204 <Method void Window.setLayout(int, int)>
		Object obj = ((Object) (getWindow().getDecorView()));
	//    9   18:aload_0         
	//   10   19:invokevirtual   #909 <Method Window getWindow()>
	//   11   22:invokevirtual   #1207 <Method View Window.getDecorView()>
	//   12   25:astore_2        
		mDialogContentWidth = i - ((View) (obj)).getPaddingLeft() - ((View) (obj)).getPaddingRight();
	//   13   26:aload_0         
	//   14   27:iload_1         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #1210 <Method int View.getPaddingLeft()>
	//   17   32:isub            
	//   18   33:aload_2         
	//   19   34:invokevirtual   #1213 <Method int View.getPaddingRight()>
	//   20   37:isub            
	//   21   38:putfield        #874 <Field int mDialogContentWidth>
		obj = ((Object) (mContext.getResources()));
	//   22   41:aload_0         
	//   23   42:getfield        #215 <Field Context mContext>
	//   24   45:invokevirtual   #249 <Method Resources Context.getResources()>
	//   25   48:astore_2        
		mVolumeGroupListItemIconSize = ((Resources) (obj)).getDimensionPixelSize(android.support.v7.mediarouter.R.dimen.mr_controller_volume_group_list_item_icon_size);
	//   26   49:aload_0         
	//   27   50:aload_2         
	//   28   51:getstatic       #1216 <Field int android.support.v7.mediarouter.R$dimen.mr_controller_volume_group_list_item_icon_size>
	//   29   54:invokevirtual   #260 <Method int Resources.getDimensionPixelSize(int)>
	//   30   57:putfield        #1218 <Field int mVolumeGroupListItemIconSize>
		mVolumeGroupListItemHeight = ((Resources) (obj)).getDimensionPixelSize(android.support.v7.mediarouter.R.dimen.mr_controller_volume_group_list_item_height);
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:getstatic       #1221 <Field int android.support.v7.mediarouter.R$dimen.mr_controller_volume_group_list_item_height>
	//   34   65:invokevirtual   #260 <Method int Resources.getDimensionPixelSize(int)>
	//   35   68:putfield        #760 <Field int mVolumeGroupListItemHeight>
		mVolumeGroupListMaxHeight = ((Resources) (obj)).getDimensionPixelSize(android.support.v7.mediarouter.R.dimen.mr_controller_volume_group_list_max_height);
	//   36   71:aload_0         
	//   37   72:aload_2         
	//   38   73:getstatic       #1224 <Field int android.support.v7.mediarouter.R$dimen.mr_controller_volume_group_list_max_height>
	//   39   76:invokevirtual   #260 <Method int Resources.getDimensionPixelSize(int)>
	//   40   79:putfield        #1226 <Field int mVolumeGroupListMaxHeight>
		mArtIconBitmap = null;
	//   41   82:aload_0         
	//   42   83:aconst_null     
	//   43   84:putfield        #497 <Field Bitmap mArtIconBitmap>
		mArtIconUri = null;
	//   44   87:aload_0         
	//   45   88:aconst_null     
	//   46   89:putfield        #500 <Field Uri mArtIconUri>
		updateArtIconIfNeeded();
	//   47   92:aload_0         
	//   48   93:invokevirtual   #616 <Method void updateArtIconIfNeeded()>
		update(false);
	//   49   96:aload_0         
	//   50   97:iconst_0        
	//   51   98:invokevirtual   #619 <Method void update(boolean)>
	//   52  101:return          
	}

	void updateLayoutHeight(final boolean animate)
	{
		mDefaultControlLayout.requestLayout();
	//    0    0:aload_0         
	//    1    1:getfield        #985 <Field FrameLayout mDefaultControlLayout>
	//    2    4:invokevirtual   #1227 <Method void FrameLayout.requestLayout()>
		mDefaultControlLayout.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field MediaRouteControllerDialog this$0>
			//    2    4:getfield        #30  <Field FrameLayout MediaRouteControllerDialog.mDefaultControlLayout>
			//    3    7:invokevirtual   #36  <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
			//    4   10:aload_0         
			//    5   11:invokevirtual   #42  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				if(mIsGroupListAnimating)
			//*   6   14:aload_0         
			//*   7   15:getfield        #19  <Field MediaRouteControllerDialog this$0>
			//*   8   18:getfield        #45  <Field boolean MediaRouteControllerDialog.mIsGroupListAnimating>
			//*   9   21:ifeq            33
				{
					mIsGroupListAnimationPending = true;
			//   10   24:aload_0         
			//   11   25:getfield        #19  <Field MediaRouteControllerDialog this$0>
			//   12   28:iconst_1        
			//   13   29:putfield        #48  <Field boolean MediaRouteControllerDialog.mIsGroupListAnimationPending>
					return;
			//   14   32:return          
				} else
				{
					updateLayoutHeightInternal(animate);
			//   15   33:aload_0         
			//   16   34:getfield        #19  <Field MediaRouteControllerDialog this$0>
			//   17   37:aload_0         
			//   18   38:getfield        #21  <Field boolean val$animate>
			//   19   41:invokevirtual   #51  <Method void MediaRouteControllerDialog.updateLayoutHeightInternal(boolean)>
					return;
			//   20   44:return          
				}
			}

			final MediaRouteControllerDialog this$0;
			final boolean val$animate;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MediaRouteControllerDialog this$0>
				animate = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean val$animate>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    3    7:aload_0         
	//    4    8:getfield        #985 <Field FrameLayout mDefaultControlLayout>
	//    5   11:invokevirtual   #1228 <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
	//    6   14:new             #22  <Class MediaRouteControllerDialog$6>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:invokespecial   #1231 <Method void MediaRouteControllerDialog$6(MediaRouteControllerDialog, boolean)>
	//   11   23:invokevirtual   #349 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   12   26:return          
	}

	void updateLayoutHeightInternal(boolean flag)
	{
		int k;
		View view;
label0:
		{
			int i = getLayoutHeight(((View) (mMediaMainControlLayout)));
	//    0    0:aload_0         
	//    1    1:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//    2    4:invokestatic    #357 <Method int getLayoutHeight(View)>
	//    3    7:istore_2        
			setLayoutHeight(((View) (mMediaMainControlLayout)), -1);
	//    4    8:aload_0         
	//    5    9:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//    6   12:iconst_m1       
	//    7   13:invokestatic    #1234 <Method void setLayoutHeight(View, int)>
			updateMediaControlVisibility(canShowPlaybackControlLayout());
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokespecial   #628 <Method boolean canShowPlaybackControlLayout()>
	//   11   21:invokespecial   #1236 <Method void updateMediaControlVisibility(boolean)>
			view = getWindow().getDecorView();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #909 <Method Window getWindow()>
	//   14   28:invokevirtual   #1207 <Method View Window.getDecorView()>
	//   15   31:astore          11
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 0x40000000), 0);
	//   16   33:aload           11
	//   17   35:aload_0         
	//   18   36:invokevirtual   #909 <Method Window getWindow()>
	//   19   39:invokevirtual   #1240 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   20   42:getfield        #1245 <Field int android.view.WindowManager$LayoutParams.width>
	//   21   45:ldc2            #1246 <Int 0x40000000>
	//   22   48:invokestatic    #1251 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   51:iconst_0        
	//   24   52:invokevirtual   #1254 <Method void View.measure(int, int)>
			setLayoutHeight(((View) (mMediaMainControlLayout)), i);
	//   25   55:aload_0         
	//   26   56:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//   27   59:iload_2         
	//   28   60:invokestatic    #1234 <Method void setLayoutHeight(View, int)>
			if(mCustomControlView == null && (mArtView.getDrawable() instanceof BitmapDrawable))
	//*  29   63:aload_0         
	//*  30   64:getfield        #383 <Field View mCustomControlView>
	//*  31   67:ifnonnull       160
	//*  32   70:aload_0         
	//*  33   71:getfield        #993 <Field ImageView mArtView>
	//*  34   74:invokevirtual   #1258 <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//*  35   77:instanceof      #806 <Class BitmapDrawable>
	//*  36   80:ifeq            160
			{
				Object obj = ((Object) (((BitmapDrawable)mArtView.getDrawable()).getBitmap()));
	//   37   83:aload_0         
	//   38   84:getfield        #993 <Field ImageView mArtView>
	//   39   87:invokevirtual   #1258 <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//   40   90:checkcast       #806 <Class BitmapDrawable>
	//   41   93:invokevirtual   #1261 <Method Bitmap BitmapDrawable.getBitmap()>
	//   42   96:astore          10
				if(obj != null)
	//*  43   98:aload           10
	//*  44  100:ifnull          160
				{
					k = getDesiredArtHeight(((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
	//   45  103:aload_0         
	//   46  104:aload           10
	//   47  106:invokevirtual   #1264 <Method int Bitmap.getWidth()>
	//   48  109:aload           10
	//   49  111:invokevirtual   #1267 <Method int Bitmap.getHeight()>
	//   50  114:invokevirtual   #1269 <Method int getDesiredArtHeight(int, int)>
	//   51  117:istore_3        
					ImageView imageview = mArtView;
	//   52  118:aload_0         
	//   53  119:getfield        #993 <Field ImageView mArtView>
	//   54  122:astore          12
					if(((Bitmap) (obj)).getWidth() >= ((Bitmap) (obj)).getHeight())
	//*  55  124:aload           10
	//*  56  126:invokevirtual   #1264 <Method int Bitmap.getWidth()>
	//*  57  129:aload           10
	//*  58  131:invokevirtual   #1267 <Method int Bitmap.getHeight()>
	//*  59  134:icmplt          145
						obj = ((Object) (android.widget.ImageView.ScaleType.FIT_XY));
	//   60  137:getstatic       #1275 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
	//   61  140:astore          10
					else
	//*  62  142:goto            150
						obj = ((Object) (android.widget.ImageView.ScaleType.FIT_CENTER));
	//   63  145:getstatic       #1278 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   64  148:astore          10
					imageview.setScaleType(((android.widget.ImageView.ScaleType) (obj)));
	//   65  150:aload           12
	//   66  152:aload           10
	//   67  154:invokevirtual   #1282 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
					break label0;
	//   68  157:goto            162
				}
			}
			k = 0;
	//   69  160:iconst_0        
	//   70  161:istore_3        
		}
		int j1 = getMainControllerHeight(canShowPlaybackControlLayout());
	//   71  162:aload_0         
	//   72  163:aload_0         
	//   73  164:invokespecial   #628 <Method boolean canShowPlaybackControlLayout()>
	//   74  167:invokespecial   #1284 <Method int getMainControllerHeight(boolean)>
	//   75  170:istore          6
		int i1 = mGroupMemberRoutes.size();
	//   76  172:aload_0         
	//   77  173:getfield        #524 <Field List mGroupMemberRoutes>
	//   78  176:invokeinterface #1285 <Method int List.size()>
	//   79  181:istore          5
		int j;
		if(getGroup() == null)
	//*  80  183:aload_0         
	//*  81  184:invokespecial   #518 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//*  82  187:ifnonnull       195
			j = 0;
	//   83  190:iconst_0        
	//   84  191:istore_2        
		else
	//*  85  192:goto            213
			j = mVolumeGroupListItemHeight * getGroup().getRoutes().size();
	//   86  195:aload_0         
	//   87  196:getfield        #760 <Field int mVolumeGroupListItemHeight>
	//   88  199:aload_0         
	//   89  200:invokespecial   #518 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//   90  203:invokevirtual   #522 <Method List android.support.v7.media.MediaRouter$RouteGroup.getRoutes()>
	//   91  206:invokeinterface #1285 <Method int List.size()>
	//   92  211:imul            
	//   93  212:istore_2        
		int l = j;
	//   94  213:iload_2         
	//   95  214:istore          4
		if(i1 > 0)
	//*  96  216:iload           5
	//*  97  218:ifle            229
			l = j + mVolumeGroupListPaddingTop;
	//   98  221:iload_2         
	//   99  222:aload_0         
	//  100  223:getfield        #262 <Field int mVolumeGroupListPaddingTop>
	//  101  226:iadd            
	//  102  227:istore          4
		j = Math.min(l, mVolumeGroupListMaxHeight);
	//  103  229:iload           4
	//  104  231:aload_0         
	//  105  232:getfield        #1226 <Field int mVolumeGroupListMaxHeight>
	//  106  235:invokestatic    #1290 <Method int Math.min(int, int)>
	//  107  238:istore_2        
		if(!mIsGroupExpanded)
	//* 108  239:aload_0         
	//* 109  240:getfield        #565 <Field boolean mIsGroupExpanded>
	//* 110  243:ifeq            249
	//* 111  246:goto            251
			j = 0;
	//  112  249:iconst_0        
	//  113  250:istore_2        
		l = Math.max(k, j) + j1;
	//  114  251:iload_3         
	//  115  252:iload_2         
	//  116  253:invokestatic    #1293 <Method int Math.max(int, int)>
	//  117  256:iload           6
	//  118  258:iadd            
	//  119  259:istore          4
		Rect rect = new Rect();
	//  120  261:new             #752 <Class Rect>
	//  121  264:dup             
	//  122  265:invokespecial   #1294 <Method void Rect()>
	//  123  268:astore          10
		view.getWindowVisibleDisplayFrame(rect);
	//  124  270:aload           11
	//  125  272:aload           10
	//  126  274:invokevirtual   #1298 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		i1 = mDialogAreaLayout.getMeasuredHeight();
	//  127  277:aload_0         
	//  128  278:getfield        #942 <Field LinearLayout mDialogAreaLayout>
	//  129  281:invokevirtual   #474 <Method int LinearLayout.getMeasuredHeight()>
	//  130  284:istore          5
		int k1 = mDefaultControlLayout.getMeasuredHeight();
	//  131  286:aload_0         
	//  132  287:getfield        #985 <Field FrameLayout mDefaultControlLayout>
	//  133  290:invokevirtual   #1299 <Method int FrameLayout.getMeasuredHeight()>
	//  134  293:istore          7
		i1 = rect.height() - (i1 - k1);
	//  135  295:aload           10
	//  136  297:invokevirtual   #1301 <Method int Rect.height()>
	//  137  300:iload           5
	//  138  302:iload           7
	//  139  304:isub            
	//  140  305:isub            
	//  141  306:istore          5
		if(mCustomControlView == null && k > 0 && l <= i1)
	//* 142  308:aload_0         
	//* 143  309:getfield        #383 <Field View mCustomControlView>
	//* 144  312:ifnonnull       345
	//* 145  315:iload_3         
	//* 146  316:ifle            345
	//* 147  319:iload           4
	//* 148  321:iload           5
	//* 149  323:icmpgt          345
		{
			mArtView.setVisibility(0);
	//  150  326:aload_0         
	//  151  327:getfield        #993 <Field ImageView mArtView>
	//  152  330:iconst_0        
	//  153  331:invokevirtual   #1302 <Method void ImageView.setVisibility(int)>
			setLayoutHeight(((View) (mArtView)), k);
	//  154  334:aload_0         
	//  155  335:getfield        #993 <Field ImageView mArtView>
	//  156  338:iload_3         
	//  157  339:invokestatic    #1234 <Method void setLayoutHeight(View, int)>
		} else
	//* 158  342:goto            387
		{
			if(getLayoutHeight(((View) (mVolumeGroupList))) + mMediaMainControlLayout.getMeasuredHeight() >= mDefaultControlLayout.getMeasuredHeight())
	//* 159  345:aload_0         
	//* 160  346:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//* 161  349:invokestatic    #357 <Method int getLayoutHeight(View)>
	//* 162  352:aload_0         
	//* 163  353:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//* 164  356:invokevirtual   #474 <Method int LinearLayout.getMeasuredHeight()>
	//* 165  359:iadd            
	//* 166  360:aload_0         
	//* 167  361:getfield        #985 <Field FrameLayout mDefaultControlLayout>
	//* 168  364:invokevirtual   #1299 <Method int FrameLayout.getMeasuredHeight()>
	//* 169  367:icmplt          379
				mArtView.setVisibility(8);
	//  170  370:aload_0         
	//  171  371:getfield        #993 <Field ImageView mArtView>
	//  172  374:bipush          8
	//  173  376:invokevirtual   #1302 <Method void ImageView.setVisibility(int)>
			l = j + j1;
	//  174  379:iload_2         
	//  175  380:iload           6
	//  176  382:iadd            
	//  177  383:istore          4
			k = 0;
	//  178  385:iconst_0        
	//  179  386:istore_3        
		}
		if(canShowPlaybackControlLayout() && l <= i1)
	//* 180  387:aload_0         
	//* 181  388:invokespecial   #628 <Method boolean canShowPlaybackControlLayout()>
	//* 182  391:ifeq            412
	//* 183  394:iload           4
	//* 184  396:iload           5
	//* 185  398:icmpgt          412
			mPlaybackControlLayout.setVisibility(0);
	//  186  401:aload_0         
	//  187  402:getfield        #468 <Field RelativeLayout mPlaybackControlLayout>
	//  188  405:iconst_0        
	//  189  406:invokevirtual   #1303 <Method void RelativeLayout.setVisibility(int)>
		else
	//* 190  409:goto            421
			mPlaybackControlLayout.setVisibility(8);
	//  191  412:aload_0         
	//  192  413:getfield        #468 <Field RelativeLayout mPlaybackControlLayout>
	//  193  416:bipush          8
	//  194  418:invokevirtual   #1303 <Method void RelativeLayout.setVisibility(int)>
		l = mPlaybackControlLayout.getVisibility();
	//  195  421:aload_0         
	//  196  422:getfield        #468 <Field RelativeLayout mPlaybackControlLayout>
	//  197  425:invokevirtual   #1304 <Method int RelativeLayout.getVisibility()>
	//  198  428:istore          4
		boolean flag2 = true;
	//  199  430:iconst_1        
	//  200  431:istore          9
		boolean flag1;
		if(l == 0)
	//* 201  433:iload           4
	//* 202  435:ifne            444
			flag1 = true;
	//  203  438:iconst_1        
	//  204  439:istore          8
		else
	//* 205  441:goto            447
			flag1 = false;
	//  206  444:iconst_0        
	//  207  445:istore          8
		updateMediaControlVisibility(flag1);
	//  208  447:aload_0         
	//  209  448:iload           8
	//  210  450:invokespecial   #1236 <Method void updateMediaControlVisibility(boolean)>
		if(mPlaybackControlLayout.getVisibility() == 0)
	//* 211  453:aload_0         
	//* 212  454:getfield        #468 <Field RelativeLayout mPlaybackControlLayout>
	//* 213  457:invokevirtual   #1304 <Method int RelativeLayout.getVisibility()>
	//* 214  460:ifne            470
			flag1 = flag2;
	//  215  463:iload           9
	//  216  465:istore          8
		else
	//* 217  467:goto            473
			flag1 = false;
	//  218  470:iconst_0        
	//  219  471:istore          8
		k1 = getMainControllerHeight(flag1);
	//  220  473:aload_0         
	//  221  474:iload           8
	//  222  476:invokespecial   #1284 <Method int getMainControllerHeight(boolean)>
	//  223  479:istore          7
		j1 = Math.max(k, j) + k1;
	//  224  481:iload_3         
	//  225  482:iload_2         
	//  226  483:invokestatic    #1293 <Method int Math.max(int, int)>
	//  227  486:iload           7
	//  228  488:iadd            
	//  229  489:istore          6
		l = j1;
	//  230  491:iload           6
	//  231  493:istore          4
		k = j;
	//  232  495:iload_2         
	//  233  496:istore_3        
		if(j1 > i1)
	//* 234  497:iload           6
	//* 235  499:iload           5
	//* 236  501:icmple          516
		{
			k = j - (j1 - i1);
	//  237  504:iload_2         
	//  238  505:iload           6
	//  239  507:iload           5
	//  240  509:isub            
	//  241  510:isub            
	//  242  511:istore_3        
			l = i1;
	//  243  512:iload           5
	//  244  514:istore          4
		}
		mMediaMainControlLayout.clearAnimation();
	//  245  516:aload_0         
	//  246  517:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//  247  520:invokevirtual   #1305 <Method void LinearLayout.clearAnimation()>
		mVolumeGroupList.clearAnimation();
	//  248  523:aload_0         
	//  249  524:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//  250  527:invokevirtual   #1306 <Method void OverlayListView.clearAnimation()>
		mDefaultControlLayout.clearAnimation();
	//  251  530:aload_0         
	//  252  531:getfield        #985 <Field FrameLayout mDefaultControlLayout>
	//  253  534:invokevirtual   #1307 <Method void FrameLayout.clearAnimation()>
		if(flag)
	//* 254  537:iload_1         
	//* 255  538:ifeq            573
		{
			animateLayoutHeight(((View) (mMediaMainControlLayout)), k1);
	//  256  541:aload_0         
	//  257  542:aload_0         
	//  258  543:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//  259  546:iload           7
	//  260  548:invokespecial   #1309 <Method void animateLayoutHeight(View, int)>
			animateLayoutHeight(((View) (mVolumeGroupList)), k);
	//  261  551:aload_0         
	//  262  552:aload_0         
	//  263  553:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//  264  556:iload_3         
	//  265  557:invokespecial   #1309 <Method void animateLayoutHeight(View, int)>
			animateLayoutHeight(((View) (mDefaultControlLayout)), l);
	//  266  560:aload_0         
	//  267  561:aload_0         
	//  268  562:getfield        #985 <Field FrameLayout mDefaultControlLayout>
	//  269  565:iload           4
	//  270  567:invokespecial   #1309 <Method void animateLayoutHeight(View, int)>
		} else
	//* 271  570:goto            599
		{
			setLayoutHeight(((View) (mMediaMainControlLayout)), k1);
	//  272  573:aload_0         
	//  273  574:getfield        #460 <Field LinearLayout mMediaMainControlLayout>
	//  274  577:iload           7
	//  275  579:invokestatic    #1234 <Method void setLayoutHeight(View, int)>
			setLayoutHeight(((View) (mVolumeGroupList)), k);
	//  276  582:aload_0         
	//  277  583:getfield        #325 <Field OverlayListView mVolumeGroupList>
	//  278  586:iload_3         
	//  279  587:invokestatic    #1234 <Method void setLayoutHeight(View, int)>
			setLayoutHeight(((View) (mDefaultControlLayout)), l);
	//  280  590:aload_0         
	//  281  591:getfield        #985 <Field FrameLayout mDefaultControlLayout>
	//  282  594:iload           4
	//  283  596:invokestatic    #1234 <Method void setLayoutHeight(View, int)>
		}
		setLayoutHeight(((View) (mExpandableAreaLayout)), rect.height());
	//  284  599:aload_0         
	//  285  600:getfield        #932 <Field FrameLayout mExpandableAreaLayout>
	//  286  603:aload           10
	//  287  605:invokevirtual   #1301 <Method int Rect.height()>
	//  288  608:invokestatic    #1234 <Method void setLayoutHeight(View, int)>
		rebuildVolumeGroupList(flag);
	//  289  611:aload_0         
	//  290  612:iload_1         
	//  291  613:invokespecial   #1311 <Method void rebuildVolumeGroupList(boolean)>
	//  292  616:return          
	}

	void updateVolumeGroupItemHeight(View view)
	{
		setLayoutHeight(((View) ((LinearLayout)view.findViewById(android.support.v7.mediarouter.R.id.volume_item_container))), mVolumeGroupListItemHeight);
	//    0    0:aload_1         
	//    1    1:getstatic       #849 <Field int android.support.v7.mediarouter.R$id.volume_item_container>
	//    2    4:invokevirtual   #852 <Method View View.findViewById(int)>
	//    3    7:checkcast       #455 <Class LinearLayout>
	//    4   10:aload_0         
	//    5   11:getfield        #760 <Field int mVolumeGroupListItemHeight>
	//    6   14:invokestatic    #1234 <Method void setLayoutHeight(View, int)>
		view = view.findViewById(android.support.v7.mediarouter.R.id.mr_volume_item_icon);
	//    7   17:aload_1         
	//    8   18:getstatic       #1315 <Field int android.support.v7.mediarouter.R$id.mr_volume_item_icon>
	//    9   21:invokevirtual   #852 <Method View View.findViewById(int)>
	//   10   24:astore_1        
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #444 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   29:astore_2        
		layoutparams.width = mVolumeGroupListItemIconSize;
	//   14   30:aload_2         
	//   15   31:aload_0         
	//   16   32:getfield        #1218 <Field int mVolumeGroupListItemIconSize>
	//   17   35:putfield        #1316 <Field int android.view.ViewGroup$LayoutParams.width>
		layoutparams.height = mVolumeGroupListItemIconSize;
	//   18   38:aload_2         
	//   19   39:aload_0         
	//   20   40:getfield        #1218 <Field int mVolumeGroupListItemIconSize>
	//   21   43:putfield        #449 <Field int android.view.ViewGroup$LayoutParams.height>
		view.setLayoutParams(layoutparams);
	//   22   46:aload_1         
	//   23   47:aload_2         
	//   24   48:invokevirtual   #575 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   25   51:return          
	}

	static final int BUTTON_DISCONNECT_RES_ID = 0x102001a;
	private static final int BUTTON_NEUTRAL_RES_ID = 0x102001b;
	static final int BUTTON_STOP_RES_ID = 0x1020019;
	static final int CONNECTION_TIMEOUT_MILLIS;
	static final boolean DEBUG = Log.isLoggable("MediaRouteCtrlDialog", 3);
	static final String TAG = "MediaRouteCtrlDialog";
	static final int VOLUME_UPDATE_DELAY_MILLIS = 500;
	private Interpolator mAccelerateDecelerateInterpolator;
	final AccessibilityManager mAccessibilityManager;
	int mArtIconBackgroundColor;
	Bitmap mArtIconBitmap;
	boolean mArtIconIsLoaded;
	Bitmap mArtIconLoadedBitmap;
	Uri mArtIconUri;
	private ImageView mArtView;
	private boolean mAttachedToWindow;
	private final MediaRouterCallback mCallback;
	private ImageButton mCloseButton;
	Context mContext;
	MediaControllerCallback mControllerCallback;
	private boolean mCreated;
	private FrameLayout mCustomControlLayout;
	private View mCustomControlView;
	FrameLayout mDefaultControlLayout;
	MediaDescriptionCompat mDescription;
	private LinearLayout mDialogAreaLayout;
	private int mDialogContentWidth;
	private Button mDisconnectButton;
	private View mDividerView;
	private FrameLayout mExpandableAreaLayout;
	private Interpolator mFastOutSlowInInterpolator;
	FetchArtTask mFetchArtTask;
	private MediaRouteExpandCollapseButton mGroupExpandCollapseButton;
	int mGroupListAnimationDurationMs;
	Runnable mGroupListFadeInAnimation = new Runnable() {

		public void run()
		{
			startGroupListFadeInAnimation();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteControllerDialog.startGroupListFadeInAnimation()>
		//    3    7:return          
		}

		final MediaRouteControllerDialog this$0;

			
			{
				this$0 = MediaRouteControllerDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaRouteControllerDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private int mGroupListFadeInDurationMs;
	private int mGroupListFadeOutDurationMs;
	private List mGroupMemberRoutes;
	Set mGroupMemberRoutesAdded;
	Set mGroupMemberRoutesAnimatingWithBitmap;
	private Set mGroupMemberRoutesRemoved;
	boolean mHasPendingUpdate;
	private Interpolator mInterpolator;
	boolean mIsGroupExpanded;
	boolean mIsGroupListAnimating;
	boolean mIsGroupListAnimationPending;
	private Interpolator mLinearOutSlowInInterpolator;
	MediaControllerCompat mMediaController;
	private LinearLayout mMediaMainControlLayout;
	boolean mPendingUpdateAnimationNeeded;
	private ImageButton mPlaybackControlButton;
	private RelativeLayout mPlaybackControlLayout;
	final android.support.v7.media.MediaRouter.RouteInfo mRoute;
	android.support.v7.media.MediaRouter.RouteInfo mRouteInVolumeSliderTouched;
	private TextView mRouteNameTextView;
	final MediaRouter mRouter;
	PlaybackStateCompat mState;
	private Button mStopCastingButton;
	private TextView mSubtitleView;
	private TextView mTitleView;
	VolumeChangeListener mVolumeChangeListener;
	private boolean mVolumeControlEnabled;
	private LinearLayout mVolumeControlLayout;
	VolumeGroupAdapter mVolumeGroupAdapter;
	OverlayListView mVolumeGroupList;
	private int mVolumeGroupListItemHeight;
	private int mVolumeGroupListItemIconSize;
	private int mVolumeGroupListMaxHeight;
	private final int mVolumeGroupListPaddingTop;
	SeekBar mVolumeSlider;
	Map mVolumeSliderMap;

	static 
	{
	//    0    0:ldc1            #62  <String "MediaRouteCtrlDialog">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #169 <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #171 <Field boolean DEBUG>
		CONNECTION_TIMEOUT_MILLIS = (int)TimeUnit.SECONDS.toMillis(30L);
	//    4    9:getstatic       #177 <Field TimeUnit TimeUnit.SECONDS>
	//    5   12:ldc2w           #178 <Long 30L>
	//    6   15:invokevirtual   #183 <Method long TimeUnit.toMillis(long)>
	//    7   18:l2i             
	//    8   19:putstatic       #185 <Field int CONNECTION_TIMEOUT_MILLIS>
	//*   9   22:return          
	}


/*
	static boolean access$000(MediaRouteControllerDialog mediaroutecontrollerdialog)
	{
		return mediaroutecontrollerdialog.isPauseActionSupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #307 <Method boolean isPauseActionSupported()>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$100(MediaRouteControllerDialog mediaroutecontrollerdialog)
	{
		return mediaroutecontrollerdialog.isStopActionSupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #311 <Method boolean isStopActionSupported()>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$200(MediaRouteControllerDialog mediaroutecontrollerdialog)
	{
		return mediaroutecontrollerdialog.isPlayActionSupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #315 <Method boolean isPlayActionSupported()>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$300(MediaRouteControllerDialog mediaroutecontrollerdialog, Bitmap bitmap)
	{
		return mediaroutecontrollerdialog.isBitmapRecycled(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #321 <Method boolean isBitmapRecycled(Bitmap)>
	//    3    5:ireturn         
	}

*/

	// Unreferenced inner class android/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener$1

/* anonymous class */
	class VolumeChangeListener._cls1
		implements Runnable
	{

		public void run()
		{
			if(mRouteInVolumeSliderTouched != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
		//*   2    4:getfield        #26  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
		//*   3    7:getfield        #30  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
		//*   4   10:ifnull          57
			{
				mRouteInVolumeSliderTouched = null;
		//    5   13:aload_0         
		//    6   14:getfield        #17  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
		//    7   17:getfield        #26  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
		//    8   20:aconst_null     
		//    9   21:putfield        #30  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
				if(mHasPendingUpdate)
		//*  10   24:aload_0         
		//*  11   25:getfield        #17  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
		//*  12   28:getfield        #26  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
		//*  13   31:getfield        #34  <Field boolean MediaRouteControllerDialog.mHasPendingUpdate>
		//*  14   34:ifeq            57
					update(mPendingUpdateAnimationNeeded);
		//   15   37:aload_0         
		//   16   38:getfield        #17  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
		//   17   41:getfield        #26  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
		//   18   44:aload_0         
		//   19   45:getfield        #17  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
		//   20   48:getfield        #26  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
		//   21   51:getfield        #37  <Field boolean MediaRouteControllerDialog.mPendingUpdateAnimationNeeded>
		//   22   54:invokevirtual   #41  <Method void MediaRouteControllerDialog.update(boolean)>
			}
		//   23   57:return          
		}

		final VolumeChangeListener this$1;

			
			{
				this$1 = VolumeChangeListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}

}
