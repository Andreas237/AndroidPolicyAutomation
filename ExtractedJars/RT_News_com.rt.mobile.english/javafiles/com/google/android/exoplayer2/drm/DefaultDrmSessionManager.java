// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DrmSessionManager, ExoMediaDrm, DrmInitData, UnsupportedDrmException, 
//			FrameworkMediaDrm, ErrorStateDrmSession, DefaultDrmSession, MediaDrmCallback, 
//			DefaultDrmSessionEventListener, DrmSession

public class DefaultDrmSessionManager
	implements DrmSessionManager, DefaultDrmSession.ProvisioningManager
{
	public static interface EventListener
		extends DefaultDrmSessionEventListener
	{
	}

	private class MediaDrmEventListener
		implements ExoMediaDrm.OnEventListener
	{

		public void onEvent(ExoMediaDrm exomediadrm, byte abyte0[], int i, int j, byte abyte1[])
		{
			if(mode == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field DefaultDrmSessionManager this$0>
		//*   2    4:invokestatic    #29  <Method int DefaultDrmSessionManager.access$300(DefaultDrmSessionManager)>
		//*   3    7:ifne            25
				mediaDrmHandler.obtainMessage(i, ((Object) (abyte0))).sendToTarget();
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field DefaultDrmSessionManager this$0>
		//    6   14:getfield        #33  <Field DefaultDrmSessionManager$MediaDrmHandler DefaultDrmSessionManager.mediaDrmHandler>
		//    7   17:iload_3         
		//    8   18:aload_2         
		//    9   19:invokevirtual   #39  <Method Message DefaultDrmSessionManager$MediaDrmHandler.obtainMessage(int, Object)>
		//   10   22:invokevirtual   #44  <Method void Message.sendToTarget()>
		//   11   25:return          
		}

		final DefaultDrmSessionManager this$0;

		private MediaDrmEventListener()
		{
			this$0 = DefaultDrmSessionManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field DefaultDrmSessionManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

	}

	private class MediaDrmHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			byte abyte0[] = (byte[])message.obj;
		//    0    0:aload_1         
		//    1    1:getfield        #28  <Field Object Message.obj>
		//    2    4:checkcast       #30  <Class byte[]>
		//    3    7:astore_2        
			for(Iterator iterator = sessions.iterator(); iterator.hasNext();)
		//*   4    8:aload_0         
		//*   5    9:getfield        #16  <Field DefaultDrmSessionManager this$0>
		//*   6   12:invokestatic    #34  <Method List DefaultDrmSessionManager.access$200(DefaultDrmSessionManager)>
		//*   7   15:invokeinterface #40  <Method Iterator List.iterator()>
		//*   8   20:astore_3        
		//*   9   21:aload_3         
		//*  10   22:invokeinterface #46  <Method boolean Iterator.hasNext()>
		//*  11   27:ifeq            60
			{
				DefaultDrmSession defaultdrmsession = (DefaultDrmSession)iterator.next();
		//   12   30:aload_3         
		//   13   31:invokeinterface #50  <Method Object Iterator.next()>
		//   14   36:checkcast       #52  <Class DefaultDrmSession>
		//   15   39:astore          4
				if(defaultdrmsession.hasSessionId(abyte0))
		//*  16   41:aload           4
		//*  17   43:aload_2         
		//*  18   44:invokevirtual   #56  <Method boolean DefaultDrmSession.hasSessionId(byte[])>
		//*  19   47:ifeq            21
				{
					defaultdrmsession.onMediaDrmEvent(message.what);
		//   20   50:aload           4
		//   21   52:aload_1         
		//   22   53:getfield        #60  <Field int Message.what>
		//   23   56:invokevirtual   #64  <Method void DefaultDrmSession.onMediaDrmEvent(int)>
					return;
		//   24   59:return          
				}
			}

		//   25   60:return          
		}

		final DefaultDrmSessionManager this$0;

		public MediaDrmHandler(Looper looper)
		{
			this$0 = DefaultDrmSessionManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field DefaultDrmSessionManager this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #19  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	public static final class MissingSchemeDataException extends Exception
	{

		private MissingSchemeDataException(UUID uuid1)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #11  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #14  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Media does not support uuid: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #16  <String "Media does not support uuid: ">
		//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (uuid1)));
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
		//   11   20:pop             
			super(stringbuilder.toString());
		//   12   21:aload_0         
		//   13   22:aload_2         
		//   14   23:invokevirtual   #27  <Method String StringBuilder.toString()>
		//   15   26:invokespecial   #30  <Method void Exception(String)>
		//   16   29:return          
		}

	}

	public static interface Mode
		extends Annotation
	{
	}


	public DefaultDrmSessionManager(UUID uuid1, ExoMediaDrm exomediadrm, MediaDrmCallback mediadrmcallback, HashMap hashmap)
	{
		this(uuid1, exomediadrm, mediadrmcallback, hashmap, false, 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:iconst_3        
	//    7    8:invokespecial   #78  <Method void DefaultDrmSessionManager(UUID, ExoMediaDrm, MediaDrmCallback, HashMap, boolean, int)>
	//    8   11:return          
	}

	public DefaultDrmSessionManager(UUID uuid1, ExoMediaDrm exomediadrm, MediaDrmCallback mediadrmcallback, HashMap hashmap, Handler handler, DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
	{
		this(uuid1, exomediadrm, mediadrmcallback, hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #85  <Method void DefaultDrmSessionManager(UUID, ExoMediaDrm, MediaDrmCallback, HashMap)>
		if(handler != null && defaultdrmsessioneventlistener != null)
	//*   6    9:aload           5
	//*   7   11:ifnull          27
	//*   8   14:aload           6
	//*   9   16:ifnull          27
			addListener(handler, defaultdrmsessioneventlistener);
	//   10   19:aload_0         
	//   11   20:aload           5
	//   12   22:aload           6
	//   13   24:invokevirtual   #89  <Method void addListener(Handler, DefaultDrmSessionEventListener)>
	//   14   27:return          
	}

	public DefaultDrmSessionManager(UUID uuid1, ExoMediaDrm exomediadrm, MediaDrmCallback mediadrmcallback, HashMap hashmap, Handler handler, DefaultDrmSessionEventListener defaultdrmsessioneventlistener, boolean flag)
	{
		this(uuid1, exomediadrm, mediadrmcallback, hashmap, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           7
	//    6    8:invokespecial   #95  <Method void DefaultDrmSessionManager(UUID, ExoMediaDrm, MediaDrmCallback, HashMap, boolean)>
		if(handler != null && defaultdrmsessioneventlistener != null)
	//*   7   11:aload           5
	//*   8   13:ifnull          29
	//*   9   16:aload           6
	//*  10   18:ifnull          29
			addListener(handler, defaultdrmsessioneventlistener);
	//   11   21:aload_0         
	//   12   22:aload           5
	//   13   24:aload           6
	//   14   26:invokevirtual   #89  <Method void addListener(Handler, DefaultDrmSessionEventListener)>
	//   15   29:return          
	}

	public DefaultDrmSessionManager(UUID uuid1, ExoMediaDrm exomediadrm, MediaDrmCallback mediadrmcallback, HashMap hashmap, Handler handler, DefaultDrmSessionEventListener defaultdrmsessioneventlistener, boolean flag, 
			int i)
	{
		this(uuid1, exomediadrm, mediadrmcallback, hashmap, flag, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           7
	//    6    8:iload           8
	//    7   10:invokespecial   #78  <Method void DefaultDrmSessionManager(UUID, ExoMediaDrm, MediaDrmCallback, HashMap, boolean, int)>
		if(handler != null && defaultdrmsessioneventlistener != null)
	//*   8   13:aload           5
	//*   9   15:ifnull          31
	//*  10   18:aload           6
	//*  11   20:ifnull          31
			addListener(handler, defaultdrmsessioneventlistener);
	//   12   23:aload_0         
	//   13   24:aload           5
	//   14   26:aload           6
	//   15   28:invokevirtual   #89  <Method void addListener(Handler, DefaultDrmSessionEventListener)>
	//   16   31:return          
	}

	public DefaultDrmSessionManager(UUID uuid1, ExoMediaDrm exomediadrm, MediaDrmCallback mediadrmcallback, HashMap hashmap, boolean flag)
	{
		this(uuid1, exomediadrm, mediadrmcallback, hashmap, flag, 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:iconst_3        
	//    7    9:invokespecial   #78  <Method void DefaultDrmSessionManager(UUID, ExoMediaDrm, MediaDrmCallback, HashMap, boolean, int)>
	//    8   12:return          
	}

	public DefaultDrmSessionManager(UUID uuid1, ExoMediaDrm exomediadrm, MediaDrmCallback mediadrmcallback, HashMap hashmap, boolean flag, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void Object()>
		Assertions.checkNotNull(((Object) (uuid1)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #108 <Method Object Assertions.checkNotNull(Object)>
	//    4    8:pop             
		Assertions.checkNotNull(((Object) (exomediadrm)));
	//    5    9:aload_2         
	//    6   10:invokestatic    #108 <Method Object Assertions.checkNotNull(Object)>
	//    7   13:pop             
		Assertions.checkArgument(C.COMMON_PSSH_UUID.equals(((Object) (uuid1))) ^ true, "Use C.CLEARKEY_UUID instead");
	//    8   14:getstatic       #113 <Field UUID C.COMMON_PSSH_UUID>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #119 <Method boolean UUID.equals(Object)>
	//   11   21:iconst_1        
	//   12   22:ixor            
	//   13   23:ldc1            #121 <String "Use C.CLEARKEY_UUID instead">
	//   14   25:invokestatic    #125 <Method void Assertions.checkArgument(boolean, Object)>
		uuid = uuid1;
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:putfield        #127 <Field UUID uuid>
		mediaDrm = exomediadrm;
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:putfield        #129 <Field ExoMediaDrm mediaDrm>
		callback = mediadrmcallback;
	//   21   38:aload_0         
	//   22   39:aload_3         
	//   23   40:putfield        #131 <Field MediaDrmCallback callback>
		optionalKeyRequestParameters = hashmap;
	//   24   43:aload_0         
	//   25   44:aload           4
	//   26   46:putfield        #133 <Field HashMap optionalKeyRequestParameters>
		eventDispatcher = new DefaultDrmSessionEventListener.EventDispatcher();
	//   27   49:aload_0         
	//   28   50:new             #135 <Class DefaultDrmSessionEventListener$EventDispatcher>
	//   29   53:dup             
	//   30   54:invokespecial   #136 <Method void DefaultDrmSessionEventListener$EventDispatcher()>
	//   31   57:putfield        #138 <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
		multiSession = flag;
	//   32   60:aload_0         
	//   33   61:iload           5
	//   34   63:putfield        #140 <Field boolean multiSession>
		initialDrmRequestRetryCount = i;
	//   35   66:aload_0         
	//   36   67:iload           6
	//   37   69:putfield        #142 <Field int initialDrmRequestRetryCount>
		mode = 0;
	//   38   72:aload_0         
	//   39   73:iconst_0        
	//   40   74:putfield        #144 <Field int mode>
		sessions = ((List) (new ArrayList()));
	//   41   77:aload_0         
	//   42   78:new             #146 <Class ArrayList>
	//   43   81:dup             
	//   44   82:invokespecial   #147 <Method void ArrayList()>
	//   45   85:putfield        #149 <Field List sessions>
		provisioningSessions = ((List) (new ArrayList()));
	//   46   88:aload_0         
	//   47   89:new             #146 <Class ArrayList>
	//   48   92:dup             
	//   49   93:invokespecial   #147 <Method void ArrayList()>
	//   50   96:putfield        #151 <Field List provisioningSessions>
		if(flag)
	//*  51   99:iload           5
	//*  52  101:ifeq            114
			exomediadrm.setPropertyString("sessionSharing", "enable");
	//   53  104:aload_2         
	//   54  105:ldc1            #153 <String "sessionSharing">
	//   55  107:ldc1            #155 <String "enable">
	//   56  109:invokeinterface #161 <Method void ExoMediaDrm.setPropertyString(String, String)>
		exomediadrm.setOnEventListener(((ExoMediaDrm.OnEventListener) (new MediaDrmEventListener())));
	//   57  114:aload_2         
	//   58  115:new             #16  <Class DefaultDrmSessionManager$MediaDrmEventListener>
	//   59  118:dup             
	//   60  119:aload_0         
	//   61  120:aconst_null     
	//   62  121:invokespecial   #164 <Method void DefaultDrmSessionManager$MediaDrmEventListener(DefaultDrmSessionManager, DefaultDrmSessionManager$1)>
	//   63  124:invokeinterface #168 <Method void ExoMediaDrm.setOnEventListener(ExoMediaDrm$OnEventListener)>
	//   64  129:return          
	}

	private static DrmInitData.SchemeData getSchemeData(DrmInitData drminitdata, UUID uuid1, boolean flag)
	{
		ArrayList arraylist = new ArrayList(drminitdata.schemeDataCount);
	//    0    0:new             #146 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #180 <Field int DrmInitData.schemeDataCount>
	//    4    8:invokespecial   #183 <Method void ArrayList(int)>
	//    5   11:astore          6
		int i = 0;
	//    6   13:iconst_0        
	//    7   14:istore_3        
		do
		{
			int k = drminitdata.schemeDataCount;
	//    8   15:aload_0         
	//    9   16:getfield        #180 <Field int DrmInitData.schemeDataCount>
	//   10   19:istore          4
			boolean flag1 = true;
	//   11   21:iconst_1        
	//   12   22:istore          5
			if(i >= k)
				break;
	//   13   24:iload_3         
	//   14   25:iload           4
	//   15   27:icmpge          115
			DrmInitData.SchemeData schemedata = drminitdata.get(i);
	//   16   30:aload_0         
	//   17   31:iload_3         
	//   18   32:invokevirtual   #187 <Method DrmInitData$SchemeData DrmInitData.get(int)>
	//   19   35:astore          7
			k = ((int) (flag1));
	//   20   37:iload           5
	//   21   39:istore          4
			if(!schemedata.matches(uuid1))
	//*  22   41:aload           7
	//*  23   43:aload_1         
	//*  24   44:invokevirtual   #193 <Method boolean DrmInitData$SchemeData.matches(UUID)>
	//*  25   47:ifne            81
				if(C.CLEARKEY_UUID.equals(((Object) (uuid1))) && schemedata.matches(C.COMMON_PSSH_UUID))
	//*  26   50:getstatic       #196 <Field UUID C.CLEARKEY_UUID>
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #119 <Method boolean UUID.equals(Object)>
	//*  29   57:ifeq            78
	//*  30   60:aload           7
	//*  31   62:getstatic       #113 <Field UUID C.COMMON_PSSH_UUID>
	//*  32   65:invokevirtual   #193 <Method boolean DrmInitData$SchemeData.matches(UUID)>
	//*  33   68:ifeq            78
					k = ((int) (flag1));
	//   34   71:iload           5
	//   35   73:istore          4
				else
	//*  36   75:goto            81
					k = 0;
	//   37   78:iconst_0        
	//   38   79:istore          4
			if(k && (schemedata.data != null || flag))
	//*  39   81:iload           4
	//*  40   83:ifeq            108
	//*  41   86:aload           7
	//*  42   88:getfield        #199 <Field byte[] DrmInitData$SchemeData.data>
	//*  43   91:ifnonnull       98
	//*  44   94:iload_2         
	//*  45   95:ifeq            108
				((List) (arraylist)).add(((Object) (schemedata)));
	//   46   98:aload           6
	//   47  100:aload           7
	//   48  102:invokeinterface #204 <Method boolean List.add(Object)>
	//   49  107:pop             
			i++;
	//   50  108:iload_3         
	//   51  109:iconst_1        
	//   52  110:iadd            
	//   53  111:istore_3        
		} while(true);
	//   54  112:goto            15
		if(((List) (arraylist)).isEmpty())
	//*  55  115:aload           6
	//*  56  117:invokeinterface #208 <Method boolean List.isEmpty()>
	//*  57  122:ifeq            127
			return null;
	//   58  125:aconst_null     
	//   59  126:areturn         
		if(C.WIDEVINE_UUID.equals(((Object) (uuid1))))
	//*  60  127:getstatic       #211 <Field UUID C.WIDEVINE_UUID>
	//*  61  130:aload_1         
	//*  62  131:invokevirtual   #119 <Method boolean UUID.equals(Object)>
	//*  63  134:ifeq            222
		{
			for(int j = 0; j < ((List) (arraylist)).size(); j++)
	//*  64  137:iconst_0        
	//*  65  138:istore_3        
	//*  66  139:iload_3         
	//*  67  140:aload           6
	//*  68  142:invokeinterface #215 <Method int List.size()>
	//*  69  147:icmpge          222
			{
				drminitdata = ((DrmInitData) ((DrmInitData.SchemeData)((List) (arraylist)).get(j)));
	//   70  150:aload           6
	//   71  152:iload_3         
	//   72  153:invokeinterface #218 <Method Object List.get(int)>
	//   73  158:checkcast       #189 <Class DrmInitData$SchemeData>
	//   74  161:astore_0        
				int l;
				if(((DrmInitData.SchemeData) (drminitdata)).hasData())
	//*  75  162:aload_0         
	//*  76  163:invokevirtual   #221 <Method boolean DrmInitData$SchemeData.hasData()>
	//*  77  166:ifeq            181
					l = PsshAtomUtil.parseVersion(((DrmInitData.SchemeData) (drminitdata)).data);
	//   78  169:aload_0         
	//   79  170:getfield        #199 <Field byte[] DrmInitData$SchemeData.data>
	//   80  173:invokestatic    #227 <Method int PsshAtomUtil.parseVersion(byte[])>
	//   81  176:istore          4
				else
	//*  82  178:goto            184
					l = -1;
	//   83  181:iconst_m1       
	//   84  182:istore          4
				if(Util.SDK_INT < 23 && l == 0)
	//*  85  184:getstatic       #232 <Field int Util.SDK_INT>
	//*  86  187:bipush          23
	//*  87  189:icmpge          199
	//*  88  192:iload           4
	//*  89  194:ifne            199
					return ((DrmInitData.SchemeData) (drminitdata));
	//   90  197:aload_0         
	//   91  198:areturn         
				if(Util.SDK_INT >= 23 && l == 1)
	//*  92  199:getstatic       #232 <Field int Util.SDK_INT>
	//*  93  202:bipush          23
	//*  94  204:icmplt          215
	//*  95  207:iload           4
	//*  96  209:iconst_1        
	//*  97  210:icmpne          215
					return ((DrmInitData.SchemeData) (drminitdata));
	//   98  213:aload_0         
	//   99  214:areturn         
			}

	//  100  215:iload_3         
	//  101  216:iconst_1        
	//  102  217:iadd            
	//  103  218:istore_3        
		}
	//* 104  219:goto            139
		return (DrmInitData.SchemeData)((List) (arraylist)).get(0);
	//  105  222:aload           6
	//  106  224:iconst_0        
	//  107  225:invokeinterface #218 <Method Object List.get(int)>
	//  108  230:checkcast       #189 <Class DrmInitData$SchemeData>
	//  109  233:areturn         
	}

	public static DefaultDrmSessionManager newFrameworkInstance(UUID uuid1, MediaDrmCallback mediadrmcallback, HashMap hashmap)
		throws UnsupportedDrmException
	{
		return new DefaultDrmSessionManager(uuid1, ((ExoMediaDrm) (FrameworkMediaDrm.newInstance(uuid1))), mediadrmcallback, hashmap, false, 3);
	//    0    0:new             #2   <Class DefaultDrmSessionManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #242 <Method FrameworkMediaDrm FrameworkMediaDrm.newInstance(UUID)>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:iconst_3        
	//    9   13:invokespecial   #78  <Method void DefaultDrmSessionManager(UUID, ExoMediaDrm, MediaDrmCallback, HashMap, boolean, int)>
	//   10   16:areturn         
	}

	public static DefaultDrmSessionManager newFrameworkInstance(UUID uuid1, MediaDrmCallback mediadrmcallback, HashMap hashmap, Handler handler, DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
		throws UnsupportedDrmException
	{
		uuid1 = ((UUID) (newFrameworkInstance(uuid1, mediadrmcallback, hashmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #247 <Method DefaultDrmSessionManager newFrameworkInstance(UUID, MediaDrmCallback, HashMap)>
	//    4    6:astore_0        
		if(handler != null && defaultdrmsessioneventlistener != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          23
	//*   7   11:aload           4
	//*   8   13:ifnull          23
			((DefaultDrmSessionManager) (uuid1)).addListener(handler, defaultdrmsessioneventlistener);
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:aload           4
	//   12   20:invokevirtual   #89  <Method void addListener(Handler, DefaultDrmSessionEventListener)>
		return ((DefaultDrmSessionManager) (uuid1));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public static DefaultDrmSessionManager newPlayReadyInstance(MediaDrmCallback mediadrmcallback, String s)
		throws UnsupportedDrmException
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            28
		{
			HashMap hashmap = new HashMap();
	//    3    7:new             #257 <Class HashMap>
	//    4   10:dup             
	//    5   11:invokespecial   #258 <Method void HashMap()>
	//    6   14:astore_2        
			hashmap.put("PRCustomData", ((Object) (s)));
	//    7   15:aload_2         
	//    8   16:ldc1            #43  <String "PRCustomData">
	//    9   18:aload_1         
	//   10   19:invokevirtual   #262 <Method Object HashMap.put(Object, Object)>
	//   11   22:pop             
			s = ((String) (hashmap));
	//   12   23:aload_2         
	//   13   24:astore_1        
		} else
	//*  14   25:goto            30
		{
			s = null;
	//   15   28:aconst_null     
	//   16   29:astore_1        
		}
		return newFrameworkInstance(C.PLAYREADY_UUID, mediadrmcallback, ((HashMap) (s)));
	//   17   30:getstatic       #265 <Field UUID C.PLAYREADY_UUID>
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:invokestatic    #247 <Method DefaultDrmSessionManager newFrameworkInstance(UUID, MediaDrmCallback, HashMap)>
	//   21   38:areturn         
	}

	public static DefaultDrmSessionManager newPlayReadyInstance(MediaDrmCallback mediadrmcallback, String s, Handler handler, DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
		throws UnsupportedDrmException
	{
		mediadrmcallback = ((MediaDrmCallback) (newPlayReadyInstance(mediadrmcallback, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #269 <Method DefaultDrmSessionManager newPlayReadyInstance(MediaDrmCallback, String)>
	//    3    5:astore_0        
		if(handler != null && defaultdrmsessioneventlistener != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
			((DefaultDrmSessionManager) (mediadrmcallback)).addListener(handler, defaultdrmsessioneventlistener);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #89  <Method void addListener(Handler, DefaultDrmSessionEventListener)>
		return ((DefaultDrmSessionManager) (mediadrmcallback));
	//   12   20:aload_0         
	//   13   21:areturn         
	}

	public static DefaultDrmSessionManager newWidevineInstance(MediaDrmCallback mediadrmcallback, HashMap hashmap)
		throws UnsupportedDrmException
	{
		return newFrameworkInstance(C.WIDEVINE_UUID, mediadrmcallback, hashmap);
	//    0    0:getstatic       #211 <Field UUID C.WIDEVINE_UUID>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #247 <Method DefaultDrmSessionManager newFrameworkInstance(UUID, MediaDrmCallback, HashMap)>
	//    4    8:areturn         
	}

	public static DefaultDrmSessionManager newWidevineInstance(MediaDrmCallback mediadrmcallback, HashMap hashmap, Handler handler, DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
		throws UnsupportedDrmException
	{
		mediadrmcallback = ((MediaDrmCallback) (newWidevineInstance(mediadrmcallback, hashmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #276 <Method DefaultDrmSessionManager newWidevineInstance(MediaDrmCallback, HashMap)>
	//    3    5:astore_0        
		if(handler != null && defaultdrmsessioneventlistener != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
			((DefaultDrmSessionManager) (mediadrmcallback)).addListener(handler, defaultdrmsessioneventlistener);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #89  <Method void addListener(Handler, DefaultDrmSessionEventListener)>
		return ((DefaultDrmSessionManager) (mediadrmcallback));
	//   12   20:aload_0         
	//   13   21:areturn         
	}

	public DrmSession acquireSession(Looper looper, DrmInitData drminitdata)
	{
		boolean flag;
		if(playbackLooper != null && playbackLooper != looper)
	//*   0    0:aload_0         
	//*   1    1:getfield        #281 <Field Looper playbackLooper>
	//*   2    4:ifnull          23
	//*   3    7:aload_0         
	//*   4    8:getfield        #281 <Field Looper playbackLooper>
	//*   5   11:aload_1         
	//*   6   12:if_acmpne       18
	//*   7   15:goto            23
			flag = false;
	//    8   18:iconst_0        
	//    9   19:istore_3        
		else
	//*  10   20:goto            25
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_3        
		Assertions.checkState(flag);
	//   13   25:iload_3         
	//   14   26:invokestatic    #285 <Method void Assertions.checkState(boolean)>
		if(sessions.isEmpty())
	//*  15   29:aload_0         
	//*  16   30:getfield        #149 <Field List sessions>
	//*  17   33:invokeinterface #208 <Method boolean List.isEmpty()>
	//*  18   38:ifeq            66
		{
			playbackLooper = looper;
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:putfield        #281 <Field Looper playbackLooper>
			if(mediaDrmHandler == null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #287 <Field DefaultDrmSessionManager$MediaDrmHandler mediaDrmHandler>
	//*  24   50:ifnonnull       66
				mediaDrmHandler = new MediaDrmHandler(looper);
	//   25   53:aload_0         
	//   26   54:new             #19  <Class DefaultDrmSessionManager$MediaDrmHandler>
	//   27   57:dup             
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:invokespecial   #290 <Method void DefaultDrmSessionManager$MediaDrmHandler(DefaultDrmSessionManager, Looper)>
	//   31   63:putfield        #287 <Field DefaultDrmSessionManager$MediaDrmHandler mediaDrmHandler>
		}
		byte abyte0[] = offlineLicenseKeySetId;
	//   32   66:aload_0         
	//   33   67:getfield        #292 <Field byte[] offlineLicenseKeySetId>
	//   34   70:astore          4
		Object obj = null;
	//   35   72:aconst_null     
	//   36   73:astore          6
		DrmInitData.SchemeData schemedata;
		if(abyte0 == null)
	//*  37   75:aload           4
	//*  38   77:ifnonnull       136
		{
			schemedata = getSchemeData(drminitdata, uuid, false);
	//   39   80:aload_2         
	//   40   81:aload_0         
	//   41   82:getfield        #127 <Field UUID uuid>
	//   42   85:iconst_0        
	//   43   86:invokestatic    #294 <Method DrmInitData$SchemeData getSchemeData(DrmInitData, UUID, boolean)>
	//   44   89:astore          4
			if(schemedata == null)
	//*  45   91:aload           4
	//*  46   93:ifnonnull       133
			{
				looper = ((Looper) (new MissingSchemeDataException(uuid)));
	//   47   96:new             #22  <Class DefaultDrmSessionManager$MissingSchemeDataException>
	//   48   99:dup             
	//   49  100:aload_0         
	//   50  101:getfield        #127 <Field UUID uuid>
	//   51  104:aconst_null     
	//   52  105:invokespecial   #297 <Method void DefaultDrmSessionManager$MissingSchemeDataException(UUID, DefaultDrmSessionManager$1)>
	//   53  108:astore_1        
				eventDispatcher.drmSessionManagerError(((Exception) (looper)));
	//   54  109:aload_0         
	//   55  110:getfield        #138 <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
	//   56  113:aload_1         
	//   57  114:invokevirtual   #301 <Method void DefaultDrmSessionEventListener$EventDispatcher.drmSessionManagerError(Exception)>
				return ((DrmSession) (new ErrorStateDrmSession(new DrmSession.DrmSessionException(((Throwable) (looper))))));
	//   58  117:new             #303 <Class ErrorStateDrmSession>
	//   59  120:dup             
	//   60  121:new             #305 <Class DrmSession$DrmSessionException>
	//   61  124:dup             
	//   62  125:aload_1         
	//   63  126:invokespecial   #308 <Method void DrmSession$DrmSessionException(Throwable)>
	//   64  129:invokespecial   #311 <Method void ErrorStateDrmSession(DrmSession$DrmSessionException)>
	//   65  132:areturn         
			}
		} else
	//*  66  133:goto            139
		{
			schemedata = null;
	//   67  136:aconst_null     
	//   68  137:astore          4
		}
		if(!multiSession)
	//*  69  139:aload_0         
	//*  70  140:getfield        #140 <Field boolean multiSession>
	//*  71  143:ifne            181
		{
			if(sessions.isEmpty())
	//*  72  146:aload_0         
	//*  73  147:getfield        #149 <Field List sessions>
	//*  74  150:invokeinterface #208 <Method boolean List.isEmpty()>
	//*  75  155:ifeq            164
				drminitdata = ((DrmInitData) (obj));
	//   76  158:aload           6
	//   77  160:astore_2        
			else
	//*  78  161:goto            243
				drminitdata = ((DrmInitData) ((DefaultDrmSession)sessions.get(0)));
	//   79  164:aload_0         
	//   80  165:getfield        #149 <Field List sessions>
	//   81  168:iconst_0        
	//   82  169:invokeinterface #218 <Method Object List.get(int)>
	//   83  174:checkcast       #313 <Class DefaultDrmSession>
	//   84  177:astore_2        
		} else
	//*  85  178:goto            243
		{
			byte abyte1[];
			if(schemedata != null)
	//*  86  181:aload           4
	//*  87  183:ifnull          196
				abyte1 = schemedata.data;
	//   88  186:aload           4
	//   89  188:getfield        #199 <Field byte[] DrmInitData$SchemeData.data>
	//   90  191:astore          5
			else
	//*  91  193:goto            199
				abyte1 = null;
	//   92  196:aconst_null     
	//   93  197:astore          5
			Iterator iterator = sessions.iterator();
	//   94  199:aload_0         
	//   95  200:getfield        #149 <Field List sessions>
	//   96  203:invokeinterface #317 <Method Iterator List.iterator()>
	//   97  208:astore          7
			do
			{
				drminitdata = ((DrmInitData) (obj));
	//   98  210:aload           6
	//   99  212:astore_2        
				if(!iterator.hasNext())
					break;
	//  100  213:aload           7
	//  101  215:invokeinterface #322 <Method boolean Iterator.hasNext()>
	//  102  220:ifeq            243
				drminitdata = ((DrmInitData) ((DefaultDrmSession)iterator.next()));
	//  103  223:aload           7
	//  104  225:invokeinterface #326 <Method Object Iterator.next()>
	//  105  230:checkcast       #313 <Class DefaultDrmSession>
	//  106  233:astore_2        
			} while(!((DefaultDrmSession) (drminitdata)).hasInitData(abyte1));
	//  107  234:aload_2         
	//  108  235:aload           5
	//  109  237:invokevirtual   #330 <Method boolean DefaultDrmSession.hasInitData(byte[])>
	//  110  240:ifeq            210
		}
		if(drminitdata == null)
	//* 111  243:aload_2         
	//* 112  244:ifnonnull       305
		{
			drminitdata = ((DrmInitData) (new DefaultDrmSession(uuid, mediaDrm, ((DefaultDrmSession.ProvisioningManager) (this)), schemedata, mode, offlineLicenseKeySetId, optionalKeyRequestParameters, callback, looper, eventDispatcher, initialDrmRequestRetryCount)));
	//  113  247:new             #313 <Class DefaultDrmSession>
	//  114  250:dup             
	//  115  251:aload_0         
	//  116  252:getfield        #127 <Field UUID uuid>
	//  117  255:aload_0         
	//  118  256:getfield        #129 <Field ExoMediaDrm mediaDrm>
	//  119  259:aload_0         
	//  120  260:aload           4
	//  121  262:aload_0         
	//  122  263:getfield        #144 <Field int mode>
	//  123  266:aload_0         
	//  124  267:getfield        #292 <Field byte[] offlineLicenseKeySetId>
	//  125  270:aload_0         
	//  126  271:getfield        #133 <Field HashMap optionalKeyRequestParameters>
	//  127  274:aload_0         
	//  128  275:getfield        #131 <Field MediaDrmCallback callback>
	//  129  278:aload_1         
	//  130  279:aload_0         
	//  131  280:getfield        #138 <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
	//  132  283:aload_0         
	//  133  284:getfield        #142 <Field int initialDrmRequestRetryCount>
	//  134  287:invokespecial   #333 <Method void DefaultDrmSession(UUID, ExoMediaDrm, DefaultDrmSession$ProvisioningManager, DrmInitData$SchemeData, int, byte[], HashMap, MediaDrmCallback, Looper, DefaultDrmSessionEventListener$EventDispatcher, int)>
	//  135  290:astore_2        
			sessions.add(((Object) (drminitdata)));
	//  136  291:aload_0         
	//  137  292:getfield        #149 <Field List sessions>
	//  138  295:aload_2         
	//  139  296:invokeinterface #204 <Method boolean List.add(Object)>
	//  140  301:pop             
		}
	//* 141  302:goto            305
		((DefaultDrmSession) (drminitdata)).acquire();
	//  142  305:aload_2         
	//  143  306:invokevirtual   #336 <Method void DefaultDrmSession.acquire()>
		return ((DrmSession) (drminitdata));
	//  144  309:aload_2         
	//  145  310:areturn         
	}

	public final void addListener(Handler handler, DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
	{
		eventDispatcher.addListener(handler, defaultdrmsessioneventlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #338 <Method void DefaultDrmSessionEventListener$EventDispatcher.addListener(Handler, DefaultDrmSessionEventListener)>
	//    5    9:return          
	}

	public boolean canAcquireSession(DrmInitData drminitdata)
	{
		if(offlineLicenseKeySetId != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #292 <Field byte[] offlineLicenseKeySetId>
	//*   2    4:ifnull          9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(getSchemeData(drminitdata, uuid, true) == null)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #127 <Field UUID uuid>
	//*   8   14:iconst_1        
	//*   9   15:invokestatic    #294 <Method DrmInitData$SchemeData getSchemeData(DrmInitData, UUID, boolean)>
	//*  10   18:ifnonnull       83
			if(drminitdata.schemeDataCount == 1 && drminitdata.get(0).matches(C.COMMON_PSSH_UUID))
	//*  11   21:aload_1         
	//*  12   22:getfield        #180 <Field int DrmInitData.schemeDataCount>
	//*  13   25:iconst_1        
	//*  14   26:icmpne          81
	//*  15   29:aload_1         
	//*  16   30:iconst_0        
	//*  17   31:invokevirtual   #187 <Method DrmInitData$SchemeData DrmInitData.get(int)>
	//*  18   34:getstatic       #113 <Field UUID C.COMMON_PSSH_UUID>
	//*  19   37:invokevirtual   #193 <Method boolean DrmInitData$SchemeData.matches(UUID)>
	//*  20   40:ifeq            81
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   21   43:new             #343 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #344 <Method void StringBuilder()>
	//   24   50:astore_2        
				stringbuilder.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
	//   25   51:aload_2         
	//   26   52:ldc2            #346 <String "DrmInitData only contains common PSSH SchemeData. Assuming support for: ">
	//   27   55:invokevirtual   #350 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
				stringbuilder.append(((Object) (uuid)));
	//   29   59:aload_2         
	//   30   60:aload_0         
	//   31   61:getfield        #127 <Field UUID uuid>
	//   32   64:invokevirtual   #353 <Method StringBuilder StringBuilder.append(Object)>
	//   33   67:pop             
				Log.w("DefaultDrmSessionMgr", stringbuilder.toString());
	//   34   68:ldc1            #46  <String "DefaultDrmSessionMgr">
	//   35   70:aload_2         
	//   36   71:invokevirtual   #357 <Method String StringBuilder.toString()>
	//   37   74:invokestatic    #363 <Method int Log.w(String, String)>
	//   38   77:pop             
			} else
	//*  39   78:goto            83
			{
				return false;
	//   40   81:iconst_0        
	//   41   82:ireturn         
			}
		drminitdata = ((DrmInitData) (drminitdata.schemeType));
	//   42   83:aload_1         
	//   43   84:getfield        #366 <Field String DrmInitData.schemeType>
	//   44   87:astore_1        
		if(drminitdata != null)
	//*  45   88:aload_1         
	//*  46   89:ifnull          151
		{
			if("cenc".equals(((Object) (drminitdata))))
	//*  47   92:ldc2            #368 <String "cenc">
	//*  48   95:aload_1         
	//*  49   96:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  50   99:ifeq            104
				return true;
	//   51  102:iconst_1        
	//   52  103:ireturn         
			if(!"cbc1".equals(((Object) (drminitdata))) && !"cbcs".equals(((Object) (drminitdata))) && !"cens".equals(((Object) (drminitdata))))
	//*  53  104:ldc2            #373 <String "cbc1">
	//*  54  107:aload_1         
	//*  55  108:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  56  111:ifne            139
	//*  57  114:ldc2            #375 <String "cbcs">
	//*  58  117:aload_1         
	//*  59  118:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  60  121:ifne            139
	//*  61  124:ldc2            #377 <String "cens">
	//*  62  127:aload_1         
	//*  63  128:invokevirtual   #371 <Method boolean String.equals(Object)>
	//*  64  131:ifeq            137
	//*  65  134:goto            139
				return true;
	//   66  137:iconst_1        
	//   67  138:ireturn         
			return Util.SDK_INT >= 25;
	//   68  139:getstatic       #232 <Field int Util.SDK_INT>
	//   69  142:bipush          25
	//   70  144:icmplt          149
	//   71  147:iconst_1        
	//   72  148:ireturn         
	//   73  149:iconst_0        
	//   74  150:ireturn         
		} else
		{
			return true;
	//   75  151:iconst_1        
	//   76  152:ireturn         
		}
	}

	public final byte[] getPropertyByteArray(String s)
	{
		return mediaDrm.getPropertyByteArray(s);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokeinterface #382 <Method byte[] ExoMediaDrm.getPropertyByteArray(String)>
	//    4   10:areturn         
	}

	public final String getPropertyString(String s)
	{
		return mediaDrm.getPropertyString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokeinterface #386 <Method String ExoMediaDrm.getPropertyString(String)>
	//    4   10:areturn         
	}

	public void onProvisionCompleted()
	{
		for(Iterator iterator = provisioningSessions.iterator(); iterator.hasNext(); ((DefaultDrmSession)iterator.next()).onProvisionCompleted());
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field List provisioningSessions>
	//    2    4:invokeinterface #317 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #322 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            34
	//    7   19:aload_1         
	//    8   20:invokeinterface #326 <Method Object Iterator.next()>
	//    9   25:checkcast       #313 <Class DefaultDrmSession>
	//   10   28:invokevirtual   #389 <Method void DefaultDrmSession.onProvisionCompleted()>
	//*  11   31:goto            10
		provisioningSessions.clear();
	//   12   34:aload_0         
	//   13   35:getfield        #151 <Field List provisioningSessions>
	//   14   38:invokeinterface #392 <Method void List.clear()>
	//   15   43:return          
	}

	public void onProvisionError(Exception exception)
	{
		for(Iterator iterator = provisioningSessions.iterator(); iterator.hasNext(); ((DefaultDrmSession)iterator.next()).onProvisionError(exception));
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field List provisioningSessions>
	//    2    4:invokeinterface #317 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #322 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            35
	//    7   19:aload_2         
	//    8   20:invokeinterface #326 <Method Object Iterator.next()>
	//    9   25:checkcast       #313 <Class DefaultDrmSession>
	//   10   28:aload_1         
	//   11   29:invokevirtual   #395 <Method void DefaultDrmSession.onProvisionError(Exception)>
	//*  12   32:goto            10
		provisioningSessions.clear();
	//   13   35:aload_0         
	//   14   36:getfield        #151 <Field List provisioningSessions>
	//   15   39:invokeinterface #392 <Method void List.clear()>
	//   16   44:return          
	}

	public void provisionRequired(DefaultDrmSession defaultdrmsession)
	{
		provisioningSessions.add(((Object) (defaultdrmsession)));
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field List provisioningSessions>
	//    2    4:aload_1         
	//    3    5:invokeinterface #204 <Method boolean List.add(Object)>
	//    4   10:pop             
		if(provisioningSessions.size() == 1)
	//*   5   11:aload_0         
	//*   6   12:getfield        #151 <Field List provisioningSessions>
	//*   7   15:invokeinterface #215 <Method int List.size()>
	//*   8   20:iconst_1        
	//*   9   21:icmpne          28
			defaultdrmsession.provision();
	//   10   24:aload_1         
	//   11   25:invokevirtual   #400 <Method void DefaultDrmSession.provision()>
	//   12   28:return          
	}

	public void releaseSession(DrmSession drmsession)
	{
		if(drmsession instanceof ErrorStateDrmSession)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #303 <Class ErrorStateDrmSession>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		drmsession = ((DrmSession) ((DefaultDrmSession)drmsession));
	//    4    8:aload_1         
	//    5    9:checkcast       #313 <Class DefaultDrmSession>
	//    6   12:astore_1        
		if(((DefaultDrmSession) (drmsession)).release())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #406 <Method boolean DefaultDrmSession.release()>
	//*   9   17:ifeq            85
		{
			sessions.remove(((Object) (drmsession)));
	//   10   20:aload_0         
	//   11   21:getfield        #149 <Field List sessions>
	//   12   24:aload_1         
	//   13   25:invokeinterface #409 <Method boolean List.remove(Object)>
	//   14   30:pop             
			if(provisioningSessions.size() > 1 && provisioningSessions.get(0) == drmsession)
	//*  15   31:aload_0         
	//*  16   32:getfield        #151 <Field List provisioningSessions>
	//*  17   35:invokeinterface #215 <Method int List.size()>
	//*  18   40:iconst_1        
	//*  19   41:icmple          74
	//*  20   44:aload_0         
	//*  21   45:getfield        #151 <Field List provisioningSessions>
	//*  22   48:iconst_0        
	//*  23   49:invokeinterface #218 <Method Object List.get(int)>
	//*  24   54:aload_1         
	//*  25   55:if_acmpne       74
				((DefaultDrmSession)provisioningSessions.get(1)).provision();
	//   26   58:aload_0         
	//   27   59:getfield        #151 <Field List provisioningSessions>
	//   28   62:iconst_1        
	//   29   63:invokeinterface #218 <Method Object List.get(int)>
	//   30   68:checkcast       #313 <Class DefaultDrmSession>
	//   31   71:invokevirtual   #400 <Method void DefaultDrmSession.provision()>
			provisioningSessions.remove(((Object) (drmsession)));
	//   32   74:aload_0         
	//   33   75:getfield        #151 <Field List provisioningSessions>
	//   34   78:aload_1         
	//   35   79:invokeinterface #409 <Method boolean List.remove(Object)>
	//   36   84:pop             
		}
	//   37   85:return          
	}

	public final void removeListener(DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
	{
		eventDispatcher.removeListener(defaultdrmsessioneventlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field DefaultDrmSessionEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #414 <Method void DefaultDrmSessionEventListener$EventDispatcher.removeListener(DefaultDrmSessionEventListener)>
	//    4    8:return          
	}

	public void setMode(int i, byte abyte0[])
	{
		Assertions.checkState(sessions.isEmpty());
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field List sessions>
	//    2    4:invokeinterface #208 <Method boolean List.isEmpty()>
	//    3    9:invokestatic    #285 <Method void Assertions.checkState(boolean)>
		if(i == 1 || i == 3)
	//*   4   12:iload_1         
	//*   5   13:iconst_1        
	//*   6   14:icmpeq          22
	//*   7   17:iload_1         
	//*   8   18:iconst_3        
	//*   9   19:icmpne          27
			Assertions.checkNotNull(((Object) (abyte0)));
	//   10   22:aload_2         
	//   11   23:invokestatic    #108 <Method Object Assertions.checkNotNull(Object)>
	//   12   26:pop             
		mode = i;
	//   13   27:aload_0         
	//   14   28:iload_1         
	//   15   29:putfield        #144 <Field int mode>
		offlineLicenseKeySetId = abyte0;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #292 <Field byte[] offlineLicenseKeySetId>
	//   19   37:return          
	}

	public final void setPropertyByteArray(String s, byte abyte0[])
	{
		mediaDrm.setPropertyByteArray(s, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #420 <Method void ExoMediaDrm.setPropertyByteArray(String, byte[])>
	//    5   11:return          
	}

	public final void setPropertyString(String s, String s1)
	{
		mediaDrm.setPropertyString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field ExoMediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #161 <Method void ExoMediaDrm.setPropertyString(String, String)>
	//    5   11:return          
	}

	public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
	public static final int MODE_DOWNLOAD = 2;
	public static final int MODE_PLAYBACK = 0;
	public static final int MODE_QUERY = 1;
	public static final int MODE_RELEASE = 3;
	public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
	private static final String TAG = "DefaultDrmSessionMgr";
	private final MediaDrmCallback callback;
	private final DefaultDrmSessionEventListener.EventDispatcher eventDispatcher;
	private final int initialDrmRequestRetryCount;
	private final ExoMediaDrm mediaDrm;
	volatile MediaDrmHandler mediaDrmHandler;
	private int mode;
	private final boolean multiSession;
	private byte offlineLicenseKeySetId[];
	private final HashMap optionalKeyRequestParameters;
	private Looper playbackLooper;
	private final List provisioningSessions;
	private final List sessions;
	private final UUID uuid;


/*
	static List access$200(DefaultDrmSessionManager defaultdrmsessionmanager)
	{
		return defaultdrmsessionmanager.sessions;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field List sessions>
	//    2    4:areturn         
	}

*/


/*
	static int access$300(DefaultDrmSessionManager defaultdrmsessionmanager)
	{
		return defaultdrmsessionmanager.mode;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field int mode>
	//    2    4:ireturn         
	}

*/
}
