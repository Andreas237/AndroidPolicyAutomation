// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.media.*;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			ExoMediaDrm, UnsupportedDrmException, FrameworkMediaCrypto, ClearKeyUtil, 
//			ExoMediaCrypto

public final class FrameworkMediaDrm
	implements ExoMediaDrm
{

	private FrameworkMediaDrm(UUID uuid1)
		throws UnsupportedSchemeException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		Assertions.checkNotNull(((Object) (uuid1)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #37  <Method Object Assertions.checkNotNull(Object)>
	//    4    8:pop             
		Assertions.checkArgument(C.COMMON_PSSH_UUID.equals(((Object) (uuid1))) ^ true, "Use C.CLEARKEY_UUID instead");
	//    5    9:getstatic       #42  <Field UUID C.COMMON_PSSH_UUID>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #48  <Method boolean UUID.equals(Object)>
	//    8   16:iconst_1        
	//    9   17:ixor            
	//   10   18:ldc1            #50  <String "Use C.CLEARKEY_UUID instead">
	//   11   20:invokestatic    #54  <Method void Assertions.checkArgument(boolean, Object)>
		UUID uuid2 = uuid1;
	//   12   23:aload_1         
	//   13   24:astore_2        
		if(Util.SDK_INT < 27)
	//*  14   25:getstatic       #60  <Field int Util.SDK_INT>
	//*  15   28:bipush          27
	//*  16   30:icmpge          49
		{
			uuid2 = uuid1;
	//   17   33:aload_1         
	//   18   34:astore_2        
			if(C.CLEARKEY_UUID.equals(((Object) (uuid1))))
	//*  19   35:getstatic       #63  <Field UUID C.CLEARKEY_UUID>
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #48  <Method boolean UUID.equals(Object)>
	//*  22   42:ifeq            49
				uuid2 = C.COMMON_PSSH_UUID;
	//   23   45:getstatic       #42  <Field UUID C.COMMON_PSSH_UUID>
	//   24   48:astore_2        
		}
		uuid = uuid2;
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:putfield        #65  <Field UUID uuid>
		mediaDrm = new MediaDrm(uuid2);
	//   28   54:aload_0         
	//   29   55:new             #67  <Class MediaDrm>
	//   30   58:dup             
	//   31   59:aload_2         
	//   32   60:invokespecial   #69  <Method void MediaDrm(UUID)>
	//   33   63:putfield        #71  <Field MediaDrm mediaDrm>
		if(C.WIDEVINE_UUID.equals(((Object) (uuid2))) && needsForceL3Workaround())
	//*  34   66:getstatic       #74  <Field UUID C.WIDEVINE_UUID>
	//*  35   69:aload_2         
	//*  36   70:invokevirtual   #48  <Method boolean UUID.equals(Object)>
	//*  37   73:ifeq            93
	//*  38   76:invokestatic    #78  <Method boolean needsForceL3Workaround()>
	//*  39   79:ifeq            93
			mediaDrm.setPropertyString("securityLevel", "L3");
	//   40   82:aload_0         
	//   41   83:getfield        #71  <Field MediaDrm mediaDrm>
	//   42   86:ldc1            #80  <String "securityLevel">
	//   43   88:ldc1            #82  <String "L3">
	//   44   90:invokevirtual   #86  <Method void MediaDrm.setPropertyString(String, String)>
	//   45   93:return          
	}

	private static boolean needsForceL3Workaround()
	{
		return "ASUS_Z00AD".equals(((Object) (Util.MODEL)));
	//    0    0:ldc1            #91  <String "ASUS_Z00AD">
	//    1    2:getstatic       #94  <Field String Util.MODEL>
	//    2    5:invokevirtual   #97  <Method boolean String.equals(Object)>
	//    3    8:ireturn         
	}

	public static FrameworkMediaDrm newInstance(UUID uuid1)
		throws UnsupportedDrmException
	{
		try
		{
			uuid1 = ((UUID) (new FrameworkMediaDrm(uuid1)));
	//    0    0:new             #2   <Class FrameworkMediaDrm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #104 <Method void FrameworkMediaDrm(UUID)>
	//    4    8:astore_0        
		}
	//*   5    9:aload_0         
	//*   6   10:areturn         
	//*   7   11:astore_0        
	//*   8   12:new             #101 <Class UnsupportedDrmException>
	//*   9   15:dup             
	//*  10   16:iconst_2        
	//*  11   17:aload_0         
	//*  12   18:invokespecial   #107 <Method void UnsupportedDrmException(int, Exception)>
	//*  13   21:athrow          
		// Misplaced declaration of an exception variable
		catch(UUID uuid1)
	//*  14   22:astore_0        
		{
			throw new UnsupportedDrmException(1, ((Exception) (uuid1)));
	//   15   23:new             #101 <Class UnsupportedDrmException>
	//   16   26:dup             
	//   17   27:iconst_1        
	//   18   28:aload_0         
	//   19   29:invokespecial   #107 <Method void UnsupportedDrmException(int, Exception)>
	//   20   32:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(UUID uuid1)
		{
			throw new UnsupportedDrmException(2, ((Exception) (uuid1)));
		}
		return ((FrameworkMediaDrm) (uuid1));
	}

	public void closeSession(byte abyte0[])
	{
		mediaDrm.closeSession(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #111 <Method void MediaDrm.closeSession(byte[])>
	//    4    8:return          
	}

	public volatile ExoMediaCrypto createMediaCrypto(byte abyte0[])
		throws MediaCryptoException
	{
		return ((ExoMediaCrypto) (createMediaCrypto(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method FrameworkMediaCrypto createMediaCrypto(byte[])>
	//    3    5:areturn         
	}

	public FrameworkMediaCrypto createMediaCrypto(byte abyte0[])
		throws MediaCryptoException
	{
		boolean flag;
		if(Util.SDK_INT < 21 && C.WIDEVINE_UUID.equals(((Object) (uuid))) && "L3".equals(((Object) (getPropertyString("securityLevel")))))
	//*   0    0:getstatic       #60  <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          40
	//*   3    8:getstatic       #74  <Field UUID C.WIDEVINE_UUID>
	//*   4   11:aload_0         
	//*   5   12:getfield        #65  <Field UUID uuid>
	//*   6   15:invokevirtual   #48  <Method boolean UUID.equals(Object)>
	//*   7   18:ifeq            40
	//*   8   21:ldc1            #82  <String "L3">
	//*   9   23:aload_0         
	//*  10   24:ldc1            #80  <String "securityLevel">
	//*  11   26:invokevirtual   #122 <Method String getPropertyString(String)>
	//*  12   29:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*  13   32:ifeq            40
			flag = true;
	//   14   35:iconst_1        
	//   15   36:istore_2        
		else
	//*  16   37:goto            42
			flag = false;
	//   17   40:iconst_0        
	//   18   41:istore_2        
		return new FrameworkMediaCrypto(new MediaCrypto(uuid, abyte0), flag);
	//   19   42:new             #124 <Class FrameworkMediaCrypto>
	//   20   45:dup             
	//   21   46:new             #126 <Class MediaCrypto>
	//   22   49:dup             
	//   23   50:aload_0         
	//   24   51:getfield        #65  <Field UUID uuid>
	//   25   54:aload_1         
	//   26   55:invokespecial   #129 <Method void MediaCrypto(UUID, byte[])>
	//   27   58:iload_2         
	//   28   59:invokespecial   #132 <Method void FrameworkMediaCrypto(MediaCrypto, boolean)>
	//   29   62:areturn         
	}

	public ExoMediaDrm.KeyRequest getKeyRequest(byte abyte0[], byte abyte1[], String s, int i, HashMap hashmap)
		throws NotProvisionedException
	{
		String s1;
label0:
		{
			if(Util.SDK_INT < 21 && C.WIDEVINE_UUID.equals(((Object) (uuid))) || C.PLAYREADY_UUID.equals(((Object) (uuid))) && "Amazon".equals(((Object) (Util.MANUFACTURER))) && ("AFTB".equals(((Object) (Util.MODEL))) || "AFTS".equals(((Object) (Util.MODEL))) || "AFTM".equals(((Object) (Util.MODEL)))))
	//*   0    0:getstatic       #60  <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          21
	//*   3    8:getstatic       #74  <Field UUID C.WIDEVINE_UUID>
	//*   4   11:aload_0         
	//*   5   12:getfield        #65  <Field UUID uuid>
	//*   6   15:invokevirtual   #48  <Method boolean UUID.equals(Object)>
	//*   7   18:ifne            78
	//*   8   21:getstatic       #139 <Field UUID C.PLAYREADY_UUID>
	//*   9   24:aload_0         
	//*  10   25:getfield        #65  <Field UUID uuid>
	//*  11   28:invokevirtual   #48  <Method boolean UUID.equals(Object)>
	//*  12   31:ifeq            102
	//*  13   34:ldc1            #141 <String "Amazon">
	//*  14   36:getstatic       #144 <Field String Util.MANUFACTURER>
	//*  15   39:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*  16   42:ifeq            102
	//*  17   45:ldc1            #146 <String "AFTB">
	//*  18   47:getstatic       #94  <Field String Util.MODEL>
	//*  19   50:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*  20   53:ifne            78
	//*  21   56:ldc1            #148 <String "AFTS">
	//*  22   58:getstatic       #94  <Field String Util.MODEL>
	//*  23   61:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*  24   64:ifne            78
	//*  25   67:ldc1            #150 <String "AFTM">
	//*  26   69:getstatic       #94  <Field String Util.MODEL>
	//*  27   72:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*  28   75:ifeq            102
			{
				byte abyte2[] = PsshAtomUtil.parseSchemeSpecificData(abyte1, uuid);
	//   29   78:aload_2         
	//   30   79:aload_0         
	//   31   80:getfield        #65  <Field UUID uuid>
	//   32   83:invokestatic    #156 <Method byte[] PsshAtomUtil.parseSchemeSpecificData(byte[], UUID)>
	//   33   86:astore          6
				if(abyte2 != null)
	//*  34   88:aload           6
	//*  35   90:ifnonnull       96
	//*  36   93:goto            102
					abyte1 = abyte2;
	//   37   96:aload           6
	//   38   98:astore_2        
			}
	//*  39   99:goto            102
			s1 = s;
	//   40  102:aload_3         
	//   41  103:astore          6
			if(Util.SDK_INT >= 26)
				break label0;
	//   42  105:getstatic       #60  <Field int Util.SDK_INT>
	//   43  108:bipush          26
	//   44  110:icmpge          154
			s1 = s;
	//   45  113:aload_3         
	//   46  114:astore          6
			if(!C.CLEARKEY_UUID.equals(((Object) (uuid))))
				break label0;
	//   47  116:getstatic       #63  <Field UUID C.CLEARKEY_UUID>
	//   48  119:aload_0         
	//   49  120:getfield        #65  <Field UUID uuid>
	//   50  123:invokevirtual   #48  <Method boolean UUID.equals(Object)>
	//   51  126:ifeq            154
			if(!"video/mp4".equals(((Object) (s))))
	//*  52  129:ldc1            #158 <String "video/mp4">
	//*  53  131:aload_3         
	//*  54  132:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*  55  135:ifne            150
			{
				s1 = s;
	//   56  138:aload_3         
	//   57  139:astore          6
				if(!"audio/mp4".equals(((Object) (s))))
					break label0;
	//   58  141:ldc1            #160 <String "audio/mp4">
	//   59  143:aload_3         
	//   60  144:invokevirtual   #97  <Method boolean String.equals(Object)>
	//   61  147:ifeq            154
			}
			s1 = "cenc";
	//   62  150:ldc1            #18  <String "cenc">
	//   63  152:astore          6
		}
		s = ((String) (mediaDrm.getKeyRequest(abyte0, abyte1, s1, i, hashmap)));
	//   64  154:aload_0         
	//   65  155:getfield        #71  <Field MediaDrm mediaDrm>
	//   66  158:aload_1         
	//   67  159:aload_2         
	//   68  160:aload           6
	//   69  162:iload           4
	//   70  164:aload           5
	//   71  166:invokevirtual   #163 <Method android.media.MediaDrm$KeyRequest MediaDrm.getKeyRequest(byte[], byte[], String, int, HashMap)>
	//   72  169:astore_3        
		abyte1 = ((android.media.MediaDrm.KeyRequest) (s)).getData();
	//   73  170:aload_3         
	//   74  171:invokevirtual   #169 <Method byte[] android.media.MediaDrm$KeyRequest.getData()>
	//   75  174:astore_2        
		abyte0 = abyte1;
	//   76  175:aload_2         
	//   77  176:astore_1        
		if(C.CLEARKEY_UUID.equals(((Object) (uuid))))
	//*  78  177:getstatic       #63  <Field UUID C.CLEARKEY_UUID>
	//*  79  180:aload_0         
	//*  80  181:getfield        #65  <Field UUID uuid>
	//*  81  184:invokevirtual   #48  <Method boolean UUID.equals(Object)>
	//*  82  187:ifeq            195
			abyte0 = ClearKeyUtil.adjustRequestData(abyte1);
	//   83  190:aload_2         
	//   84  191:invokestatic    #175 <Method byte[] ClearKeyUtil.adjustRequestData(byte[])>
	//   85  194:astore_1        
		return ((ExoMediaDrm.KeyRequest) (new ExoMediaDrm.DefaultKeyRequest(abyte0, ((android.media.MediaDrm.KeyRequest) (s)).getDefaultUrl())));
	//   86  195:new             #177 <Class ExoMediaDrm$DefaultKeyRequest>
	//   87  198:dup             
	//   88  199:aload_1         
	//   89  200:aload_3         
	//   90  201:invokevirtual   #181 <Method String android.media.MediaDrm$KeyRequest.getDefaultUrl()>
	//   91  204:invokespecial   #184 <Method void ExoMediaDrm$DefaultKeyRequest(byte[], String)>
	//   92  207:areturn         
	}

	public byte[] getPropertyByteArray(String s)
	{
		return mediaDrm.getPropertyByteArray(s);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #190 <Method byte[] MediaDrm.getPropertyByteArray(String)>
	//    4    8:areturn         
	}

	public String getPropertyString(String s)
	{
		return mediaDrm.getPropertyString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method String MediaDrm.getPropertyString(String)>
	//    4    8:areturn         
	}

	public ExoMediaDrm.ProvisionRequest getProvisionRequest()
	{
		android.media.MediaDrm.ProvisionRequest provisionrequest = mediaDrm.getProvisionRequest();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:invokevirtual   #196 <Method android.media.MediaDrm$ProvisionRequest MediaDrm.getProvisionRequest()>
	//    3    7:astore_1        
		return ((ExoMediaDrm.ProvisionRequest) (new ExoMediaDrm.DefaultProvisionRequest(provisionrequest.getData(), provisionrequest.getDefaultUrl())));
	//    4    8:new             #198 <Class ExoMediaDrm$DefaultProvisionRequest>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokevirtual   #201 <Method byte[] android.media.MediaDrm$ProvisionRequest.getData()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #202 <Method String android.media.MediaDrm$ProvisionRequest.getDefaultUrl()>
	//   10   20:invokespecial   #203 <Method void ExoMediaDrm$DefaultProvisionRequest(byte[], String)>
	//   11   23:areturn         
	}

	public byte[] openSession()
		throws MediaDrmException
	{
		return mediaDrm.openSession();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:invokevirtual   #208 <Method byte[] MediaDrm.openSession()>
	//    3    7:areturn         
	}

	public byte[] provideKeyResponse(byte abyte0[], byte abyte1[])
		throws NotProvisionedException, DeniedByServerException
	{
		byte abyte2[] = abyte1;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(C.CLEARKEY_UUID.equals(((Object) (uuid))))
	//*   2    2:getstatic       #63  <Field UUID C.CLEARKEY_UUID>
	//*   3    5:aload_0         
	//*   4    6:getfield        #65  <Field UUID uuid>
	//*   5    9:invokevirtual   #48  <Method boolean UUID.equals(Object)>
	//*   6   12:ifeq            20
			abyte2 = ClearKeyUtil.adjustResponseData(abyte1);
	//    7   15:aload_2         
	//    8   16:invokestatic    #215 <Method byte[] ClearKeyUtil.adjustResponseData(byte[])>
	//    9   19:astore_3        
		return mediaDrm.provideKeyResponse(abyte0, abyte2);
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field MediaDrm mediaDrm>
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:invokevirtual   #217 <Method byte[] MediaDrm.provideKeyResponse(byte[], byte[])>
	//   15   29:areturn         
	}

	public void provideProvisionResponse(byte abyte0[])
		throws DeniedByServerException
	{
		mediaDrm.provideProvisionResponse(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #220 <Method void MediaDrm.provideProvisionResponse(byte[])>
	//    4    8:return          
	}

	public Map queryKeyStatus(byte abyte0[])
	{
		return ((Map) (mediaDrm.queryKeyStatus(abyte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #225 <Method HashMap MediaDrm.queryKeyStatus(byte[])>
	//    4    8:areturn         
	}

	public void release()
	{
		mediaDrm.release();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:invokevirtual   #229 <Method void MediaDrm.release()>
	//    3    7:return          
	}

	public void restoreKeys(byte abyte0[], byte abyte1[])
	{
		mediaDrm.restoreKeys(abyte0, abyte1);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #233 <Method void MediaDrm.restoreKeys(byte[], byte[])>
	//    5    9:return          
	}

	public void setOnEventListener(final ExoMediaDrm.OnEventListener listener)
	{
		MediaDrm mediadrm = mediaDrm;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:astore_2        
		if(listener == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			listener = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:goto            24
			listener = ((ExoMediaDrm.OnEventListener) (new android.media.MediaDrm.OnEventListener() {

				public void onEvent(MediaDrm mediadrm1, byte abyte0[], int i, int j, byte abyte1[])
				{
					listener.onEvent(((ExoMediaDrm) (FrameworkMediaDrm.this)), abyte0, i, j, abyte1);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field ExoMediaDrm$OnEventListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field FrameworkMediaDrm this$0>
				//    4    8:aload_2         
				//    5    9:iload_3         
				//    6   10:iload           4
				//    7   12:aload           5
				//    8   14:invokeinterface #34  <Method void ExoMediaDrm$OnEventListener.onEvent(ExoMediaDrm, byte[], int, int, byte[])>
				//    9   19:return          
				}

				final FrameworkMediaDrm this$0;
				final ExoMediaDrm.OnEventListener val$listener;

			
			{
				this$0 = FrameworkMediaDrm.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FrameworkMediaDrm this$0>
				listener = oneventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ExoMediaDrm$OnEventListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//    8   14:new             #9   <Class FrameworkMediaDrm$1>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #238 <Method void FrameworkMediaDrm$1(FrameworkMediaDrm, ExoMediaDrm$OnEventListener)>
	//   13   23:astore_1        
		mediadrm.setOnEventListener(((android.media.MediaDrm.OnEventListener) (listener)));
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #241 <Method void MediaDrm.setOnEventListener(android.media.MediaDrm$OnEventListener)>
	//   17   29:return          
	}

	public void setOnKeyStatusChangeListener(final ExoMediaDrm.OnKeyStatusChangeListener listener)
	{
		if(Util.SDK_INT < 23)
	//*   0    0:getstatic       #60  <Field int Util.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpge          16
			throw new UnsupportedOperationException();
	//    3    8:new             #246 <Class UnsupportedOperationException>
	//    4   11:dup             
	//    5   12:invokespecial   #247 <Method void UnsupportedOperationException()>
	//    6   15:athrow          
		MediaDrm mediadrm = mediaDrm;
	//    7   16:aload_0         
	//    8   17:getfield        #71  <Field MediaDrm mediaDrm>
	//    9   20:astore_2        
		if(listener == null)
	//*  10   21:aload_1         
	//*  11   22:ifnonnull       30
			listener = null;
	//   12   25:aconst_null     
	//   13   26:astore_1        
		else
	//*  14   27:goto            40
			listener = ((ExoMediaDrm.OnKeyStatusChangeListener) (new android.media.MediaDrm.OnKeyStatusChangeListener() {

				public void onKeyStatusChange(MediaDrm mediadrm1, byte abyte0[], List list, boolean flag)
				{
					mediadrm1 = ((MediaDrm) (new ArrayList()));
				//    0    0:new             #30  <Class ArrayList>
				//    1    3:dup             
				//    2    4:invokespecial   #31  <Method void ArrayList()>
				//    3    7:astore_1        
					android.media.MediaDrm.KeyStatus keystatus;
					for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (mediadrm1)).add(((Object) (new ExoMediaDrm.DefaultKeyStatus(keystatus.getStatusCode(), keystatus.getKeyId())))))
				//*   4    8:aload_3         
				//*   5    9:invokeinterface #37  <Method Iterator List.iterator()>
				//*   6   14:astore_3        
				//*   7   15:aload_3         
				//*   8   16:invokeinterface #43  <Method boolean Iterator.hasNext()>
				//*   9   21:ifeq            62
						keystatus = (android.media.MediaDrm.KeyStatus)((Iterator) (list)).next();
				//   10   24:aload_3         
				//   11   25:invokeinterface #47  <Method Object Iterator.next()>
				//   12   30:checkcast       #49  <Class android.media.MediaDrm$KeyStatus>
				//   13   33:astore          5

				//   14   35:aload_1         
				//   15   36:new             #51  <Class ExoMediaDrm$DefaultKeyStatus>
				//   16   39:dup             
				//   17   40:aload           5
				//   18   42:invokevirtual   #55  <Method int android.media.MediaDrm$KeyStatus.getStatusCode()>
				//   19   45:aload           5
				//   20   47:invokevirtual   #59  <Method byte[] android.media.MediaDrm$KeyStatus.getKeyId()>
				//   21   50:invokespecial   #62  <Method void ExoMediaDrm$DefaultKeyStatus(int, byte[])>
				//   22   53:invokeinterface #66  <Method boolean List.add(Object)>
				//   23   58:pop             
				//*  24   59:goto            15
					listener.onKeyStatusChange(((ExoMediaDrm) (FrameworkMediaDrm.this)), abyte0, ((List) (mediadrm1)), flag);
				//   25   62:aload_0         
				//   26   63:getfield        #21  <Field ExoMediaDrm$OnKeyStatusChangeListener val$listener>
				//   27   66:aload_0         
				//   28   67:getfield        #19  <Field FrameworkMediaDrm this$0>
				//   29   70:aload_2         
				//   30   71:aload_1         
				//   31   72:iload           4
				//   32   74:invokeinterface #71  <Method void ExoMediaDrm$OnKeyStatusChangeListener.onKeyStatusChange(ExoMediaDrm, byte[], List, boolean)>
				//   33   79:return          
				}

				final FrameworkMediaDrm this$0;
				final ExoMediaDrm.OnKeyStatusChangeListener val$listener;

			
			{
				this$0 = FrameworkMediaDrm.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FrameworkMediaDrm this$0>
				listener = onkeystatuschangelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ExoMediaDrm$OnKeyStatusChangeListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   15   30:new             #11  <Class FrameworkMediaDrm$2>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokespecial   #250 <Method void FrameworkMediaDrm$2(FrameworkMediaDrm, ExoMediaDrm$OnKeyStatusChangeListener)>
	//   20   39:astore_1        
		mediadrm.setOnKeyStatusChangeListener(((android.media.MediaDrm.OnKeyStatusChangeListener) (listener)), ((android.os.Handler) (null)));
	//   21   40:aload_2         
	//   22   41:aload_1         
	//   23   42:aconst_null     
	//   24   43:invokevirtual   #253 <Method void MediaDrm.setOnKeyStatusChangeListener(android.media.MediaDrm$OnKeyStatusChangeListener, android.os.Handler)>
	//   25   46:return          
	}

	public void setPropertyByteArray(String s, byte abyte0[])
	{
		mediaDrm.setPropertyByteArray(s, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #258 <Method void MediaDrm.setPropertyByteArray(String, byte[])>
	//    5    9:return          
	}

	public void setPropertyString(String s, String s1)
	{
		mediaDrm.setPropertyString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #86  <Method void MediaDrm.setPropertyString(String, String)>
	//    5    9:return          
	}

	private static final String CENC_SCHEME_MIME_TYPE = "cenc";
	private final MediaDrm mediaDrm;
	private final UUID uuid;
}
