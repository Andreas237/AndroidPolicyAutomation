// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer:
//			DecoderInfo

public final class MediaCodecUtil
{
	private static final class CodecKey
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          56
			{
				if(obj.getClass() != com/google/android/exoplayer/MediaCodecUtil$CodecKey)
		//*   7   11:aload_1         
		//*   8   12:invokevirtual   #27  <Method Class Object.getClass()>
		//*   9   15:ldc1            #2   <Class MediaCodecUtil$CodecKey>
		//*  10   17:if_acmpeq       22
					return false;
		//   11   20:iconst_0        
		//   12   21:ireturn         
				obj = ((Object) ((CodecKey)obj));
		//   13   22:aload_1         
		//   14   23:checkcast       #2   <Class MediaCodecUtil$CodecKey>
		//   15   26:astore_1        
				return TextUtils.equals(((CharSequence) (mimeType)), ((CharSequence) (((CodecKey) (obj)).mimeType))) && secure == ((CodecKey) (obj)).secure;
		//   16   27:aload_0         
		//   17   28:getfield        #18  <Field String mimeType>
		//   18   31:aload_1         
		//   19   32:getfield        #18  <Field String mimeType>
		//   20   35:invokestatic    #32  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
		//   21   38:ifeq            54
		//   22   41:aload_0         
		//   23   42:getfield        #20  <Field boolean secure>
		//   24   45:aload_1         
		//   25   46:getfield        #20  <Field boolean secure>
		//   26   49:icmpne          54
		//   27   52:iconst_1        
		//   28   53:ireturn         
		//   29   54:iconst_0        
		//   30   55:ireturn         
			} else
			{
				return false;
		//   31   56:iconst_0        
		//   32   57:ireturn         
			}
		}

		public int hashCode()
		{
			String s = mimeType;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field String mimeType>
		//    2    4:astore_3        
			int i;
			if(s == null)
		//*   3    5:aload_3         
		//*   4    6:ifnonnull       14
				i = 0;
		//    5    9:iconst_0        
		//    6   10:istore_1        
			else
		//*   7   11:goto            19
				i = s.hashCode();
		//    8   14:aload_3         
		//    9   15:invokevirtual   #38  <Method int String.hashCode()>
		//   10   18:istore_1        
			char c;
			if(secure)
		//*  11   19:aload_0         
		//*  12   20:getfield        #20  <Field boolean secure>
		//*  13   23:ifeq            33
				c = '\u04CF';
		//   14   26:sipush          1231
		//   15   29:istore_2        
			else
		//*  16   30:goto            37
				c = '\u04D5';
		//   17   33:sipush          1237
		//   18   36:istore_2        
			return (i + 31) * 31 + c;
		//   19   37:iload_1         
		//   20   38:bipush          31
		//   21   40:iadd            
		//   22   41:bipush          31
		//   23   43:imul            
		//   24   44:iload_2         
		//   25   45:iadd            
		//   26   46:ireturn         
		}

		public final String mimeType;
		public final boolean secure;

		public CodecKey(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mimeType = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String mimeType>
			secure = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field boolean secure>
		//    8   14:return          
		}
	}

	public static class DecoderQueryException extends IOException
	{

		private DecoderQueryException(Throwable throwable)
		{
			super("Failed to query underlying media codecs", throwable);
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "Failed to query underlying media codecs">
		//    2    3:aload_1         
		//    3    4:invokespecial   #14  <Method void IOException(String, Throwable)>
		//    4    7:return          
		}

	}

	private static interface MediaCodecListCompat
	{

		public abstract int getCodecCount();

		public abstract MediaCodecInfo getCodecInfoAt(int i);

		public abstract boolean isSecurePlaybackSupported(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities);

		public abstract boolean secureDecodersExplicit();
	}

	private static final class MediaCodecListCompatV16
		implements MediaCodecListCompat
	{

		public int getCodecCount()
		{
			return MediaCodecList.getCodecCount();
		//    0    0:invokestatic    #22  <Method int MediaCodecList.getCodecCount()>
		//    1    3:ireturn         
		}

		public MediaCodecInfo getCodecInfoAt(int i)
		{
			return MediaCodecList.getCodecInfoAt(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #26  <Method MediaCodecInfo MediaCodecList.getCodecInfoAt(int)>
		//    2    4:areturn         
		}

		public boolean isSecurePlaybackSupported(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
		{
			return "video/avc".equals(((Object) (s)));
		//    0    0:ldc1            #30  <String "video/avc">
		//    1    2:aload_1         
		//    2    3:invokevirtual   #36  <Method boolean String.equals(Object)>
		//    3    6:ireturn         
		}

		public boolean secureDecodersExplicit()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		private MediaCodecListCompatV16()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static final class MediaCodecListCompatV21
		implements MediaCodecListCompat
	{

		private void ensureMediaCodecInfosInitialized()
		{
			if(mediaCodecInfos == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
		//*   2    4:ifnonnull       25
				mediaCodecInfos = (new MediaCodecList(codecKind)).getCodecInfos();
		//    3    7:aload_0         
		//    4    8:new             #34  <Class MediaCodecList>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #36  <Field int codecKind>
		//    8   16:invokespecial   #39  <Method void MediaCodecList(int)>
		//    9   19:invokevirtual   #43  <Method MediaCodecInfo[] MediaCodecList.getCodecInfos()>
		//   10   22:putfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
		//   11   25:return          
		}

		public int getCodecCount()
		{
			ensureMediaCodecInfosInitialized();
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method void ensureMediaCodecInfosInitialized()>
			return mediaCodecInfos.length;
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
		//    4    8:arraylength     
		//    5    9:ireturn         
		}

		public MediaCodecInfo getCodecInfoAt(int i)
		{
			ensureMediaCodecInfosInitialized();
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method void ensureMediaCodecInfosInitialized()>
			return mediaCodecInfos[i];
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
		//    4    8:iload_1         
		//    5    9:aaload          
		//    6   10:areturn         
		}

		public boolean isSecurePlaybackSupported(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
		{
			return codeccapabilities.isFeatureSupported("secure-playback");
		//    0    0:aload_2         
		//    1    1:ldc1            #53  <String "secure-playback">
		//    2    3:invokevirtual   #59  <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
		//    3    6:ireturn         
		}

		public boolean secureDecodersExplicit()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		private final int codecKind;
		private MediaCodecInfo mediaCodecInfos[];

		public MediaCodecListCompatV21(boolean flag)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #20  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #27  <Method void Runtime(String)>
		//    4    9:athrow          
		}
	}


	private MediaCodecUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:return          
	}

	private static int avcLevelToMaxFrameSize(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    15: default 132
	//	               1: 177
	//	               2: 173
	//	               8: 170
	//	               16: 167
	//	               32: 164
	//	               64: 161
	//	               128: 158
	//	               256: 155
	//	               512: 152
	//	               1024: 149
	//	               2048: 146
	//	               4096: 143
	//	               8192: 140
	//	               16384: 137
	//	               32768: 134
		default:
			return -1;
	//    2  132:iconst_m1       
	//    3  133:ireturn         

		case 32768: 
			return 0x900000;
	//    4  134:ldc1            #60  <Int 0x900000>
	//    5  136:ireturn         

		case 16384: 
			return 0x564000;
	//    6  137:ldc1            #61  <Int 0x564000>
	//    7  139:ireturn         

		case 8192: 
			return 0x220000;
	//    8  140:ldc1            #62  <Int 0x220000>
	//    9  142:ireturn         

		case 4096: 
			return 0x200000;
	//   10  143:ldc1            #63  <Int 0x200000>
	//   11  145:ireturn         

		case 2048: 
			return 0x200000;
	//   12  146:ldc1            #63  <Int 0x200000>
	//   13  148:ireturn         

		case 1024: 
			return 0x140000;
	//   14  149:ldc1            #64  <Int 0x140000>
	//   15  151:ireturn         

		case 512: 
			return 0xe1000;
	//   16  152:ldc1            #65  <Int 0xe1000>
	//   17  154:ireturn         

		case 256: 
			return 0x65400;
	//   18  155:ldc1            #66  <Int 0x65400>
	//   19  157:ireturn         

		case 128: 
			return 0x65400;
	//   20  158:ldc1            #66  <Int 0x65400>
	//   21  160:ireturn         

		case 64: // '@'
			return 0x31800;
	//   22  161:ldc1            #67  <Int 0x31800>
	//   23  163:ireturn         

		case 32: // ' '
			return 0x18c00;
	//   24  164:ldc1            #68  <Int 0x18c00>
	//   25  166:ireturn         

		case 16: // '\020'
			return 0x18c00;
	//   26  167:ldc1            #68  <Int 0x18c00>
	//   27  169:ireturn         

		case 8: // '\b'
			return 0x18c00;
	//   28  170:ldc1            #68  <Int 0x18c00>
	//   29  172:ireturn         

		case 2: // '\002'
			return 25344;
	//   30  173:sipush          25344
	//   31  176:ireturn         

		case 1: // '\001'
			return 25344;
	//   32  177:sipush          25344
	//   33  180:ireturn         
		}
	}

	public static DecoderInfo getDecoderInfo(String s, boolean flag)
		throws DecoderQueryException
	{
		s = ((String) (getDecoderInfos(s, flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #74  <Method List getDecoderInfos(String, boolean)>
	//    3    5:astore_0        
		if(((List) (s)).isEmpty())
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #80  <Method boolean List.isEmpty()>
	//*   6   12:ifeq            17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		else
			return (DecoderInfo)((List) (s)).get(0);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokeinterface #84  <Method Object List.get(int)>
	//   12   24:checkcast       #39  <Class DecoderInfo>
	//   13   27:areturn         
	}

	public static List getDecoderInfos(String s, boolean flag)
		throws DecoderQueryException
	{
		com/google/android/exoplayer/MediaCodecUtil;
	//    0    0:ldc1            #2   <Class MediaCodecUtil>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		CodecKey codeckey;
		codeckey = new CodecKey(s, flag);
	//    2    3:new             #8   <Class MediaCodecUtil$CodecKey>
	//    3    6:dup             
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:invokespecial   #88  <Method void MediaCodecUtil$CodecKey(String, boolean)>
	//    7   12:astore          4
		obj = ((Object) ((List)decoderInfosCache.get(((Object) (codeckey)))));
	//    8   14:getstatic       #53  <Field Map decoderInfosCache>
	//    9   17:aload           4
	//   10   19:invokeinterface #93  <Method Object Map.get(Object)>
	//   11   24:checkcast       #76  <Class List>
	//   12   27:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_37;
	//   13   28:aload_2         
	//   14   29:ifnull          37
		com/google/android/exoplayer/MediaCodecUtil;
	//   15   32:ldc1            #2   <Class MediaCodecUtil>
		JVM INSTR monitorexit ;
	//   16   34:monitorexit     
		return ((List) (obj));
	//   17   35:aload_2         
	//   18   36:areturn         
		if(Util.SDK_INT >= 21)
	//*  19   37:getstatic       #98  <Field int Util.SDK_INT>
	//*  20   40:bipush          21
	//*  21   42:icmplt          57
		{
			obj = ((Object) (new MediaCodecListCompatV21(flag)));
	//   22   45:new             #20  <Class MediaCodecUtil$MediaCodecListCompatV21>
	//   23   48:dup             
	//   24   49:iload_1         
	//   25   50:invokespecial   #101 <Method void MediaCodecUtil$MediaCodecListCompatV21(boolean)>
	//   26   53:astore_2        
			break MISSING_BLOCK_LABEL_66;
	//   27   54:goto            66
		}
		obj = ((Object) (new MediaCodecListCompatV16()));
	//   28   57:new             #17  <Class MediaCodecUtil$MediaCodecListCompatV16>
	//   29   60:dup             
	//   30   61:aconst_null     
	//   31   62:invokespecial   #104 <Method void MediaCodecUtil$MediaCodecListCompatV16(MediaCodecUtil$1)>
	//   32   65:astore_2        
		List list = getDecoderInfosInternal(codeckey, ((MediaCodecListCompat) (obj)));
	//   33   66:aload           4
	//   34   68:aload_2         
	//   35   69:invokestatic    #108 <Method List getDecoderInfosInternal(MediaCodecUtil$CodecKey, MediaCodecUtil$MediaCodecListCompat)>
	//   36   72:astore_3        
		obj = ((Object) (list));
	//   37   73:aload_3         
	//   38   74:astore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_193;
	//   39   75:iload_1         
	//   40   76:ifeq            193
		obj = ((Object) (list));
	//   41   79:aload_3         
	//   42   80:astore_2        
		if(!list.isEmpty())
			break MISSING_BLOCK_LABEL_193;
	//   43   81:aload_3         
	//   44   82:invokeinterface #80  <Method boolean List.isEmpty()>
	//   45   87:ifeq            193
		obj = ((Object) (list));
	//   46   90:aload_3         
	//   47   91:astore_2        
		if(21 > Util.SDK_INT)
			break MISSING_BLOCK_LABEL_193;
	//   48   92:bipush          21
	//   49   94:getstatic       #98  <Field int Util.SDK_INT>
	//   50   97:icmpgt          193
		obj = ((Object) (list));
	//   51  100:aload_3         
	//   52  101:astore_2        
		if(Util.SDK_INT > 23)
			break MISSING_BLOCK_LABEL_193;
	//   53  102:getstatic       #98  <Field int Util.SDK_INT>
	//   54  105:bipush          23
	//   55  107:icmpgt          193
		list = getDecoderInfosInternal(codeckey, ((MediaCodecListCompat) (new MediaCodecListCompatV16())));
	//   56  110:aload           4
	//   57  112:new             #17  <Class MediaCodecUtil$MediaCodecListCompatV16>
	//   58  115:dup             
	//   59  116:aconst_null     
	//   60  117:invokespecial   #104 <Method void MediaCodecUtil$MediaCodecListCompatV16(MediaCodecUtil$1)>
	//   61  120:invokestatic    #108 <Method List getDecoderInfosInternal(MediaCodecUtil$CodecKey, MediaCodecUtil$MediaCodecListCompat)>
	//   62  123:astore_3        
		obj = ((Object) (list));
	//   63  124:aload_3         
	//   64  125:astore_2        
		if(list.isEmpty())
			break MISSING_BLOCK_LABEL_193;
	//   65  126:aload_3         
	//   66  127:invokeinterface #80  <Method boolean List.isEmpty()>
	//   67  132:ifne            193
		obj = ((Object) (new StringBuilder()));
	//   68  135:new             #110 <Class StringBuilder>
	//   69  138:dup             
	//   70  139:invokespecial   #111 <Method void StringBuilder()>
	//   71  142:astore_2        
		((StringBuilder) (obj)).append("MediaCodecList API didn't list secure decoder for: ");
	//   72  143:aload_2         
	//   73  144:ldc1            #113 <String "MediaCodecList API didn't list secure decoder for: ">
	//   74  146:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   75  149:pop             
		((StringBuilder) (obj)).append(s);
	//   76  150:aload_2         
	//   77  151:aload_0         
	//   78  152:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   79  155:pop             
		((StringBuilder) (obj)).append(". Assuming: ");
	//   80  156:aload_2         
	//   81  157:ldc1            #119 <String ". Assuming: ">
	//   82  159:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   83  162:pop             
		((StringBuilder) (obj)).append(((DecoderInfo)list.get(0)).name);
	//   84  163:aload_2         
	//   85  164:aload_3         
	//   86  165:iconst_0        
	//   87  166:invokeinterface #84  <Method Object List.get(int)>
	//   88  171:checkcast       #39  <Class DecoderInfo>
	//   89  174:getfield        #122 <Field String DecoderInfo.name>
	//   90  177:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   91  180:pop             
		Log.w("MediaCodecUtil", ((StringBuilder) (obj)).toString());
	//   92  181:ldc1            #30  <String "MediaCodecUtil">
	//   93  183:aload_2         
	//   94  184:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   95  187:invokestatic    #132 <Method int Log.w(String, String)>
	//   96  190:pop             
		obj = ((Object) (list));
	//   97  191:aload_3         
	//   98  192:astore_2        
		s = ((String) (Collections.unmodifiableList(((List) (obj)))));
	//   99  193:aload_2         
	//  100  194:invokestatic    #138 <Method List Collections.unmodifiableList(List)>
	//  101  197:astore_0        
		decoderInfosCache.put(((Object) (codeckey)), ((Object) (s)));
	//  102  198:getstatic       #53  <Field Map decoderInfosCache>
	//  103  201:aload           4
	//  104  203:aload_0         
	//  105  204:invokeinterface #142 <Method Object Map.put(Object, Object)>
	//  106  209:pop             
		com/google/android/exoplayer/MediaCodecUtil;
	//  107  210:ldc1            #2   <Class MediaCodecUtil>
		JVM INSTR monitorexit ;
	//  108  212:monitorexit     
		return ((List) (s));
	//  109  213:aload_0         
	//  110  214:areturn         
		s;
	//  111  215:astore_0        
	//* 112  216:ldc1            #2   <Class MediaCodecUtil>
		throw s;
	//  113  218:monitorexit     
	//  114  219:aload_0         
	//  115  220:athrow          
	}

	private static List getDecoderInfosInternal(CodecKey codeckey, MediaCodecListCompat mediacodeclistcompat)
		throws DecoderQueryException
	{
		int i;
		int j;
		int k;
		int l;
		boolean flag;
		boolean flag1;
		Object obj;
		Object obj1;
		String s;
		ArrayList arraylist;
		String s1;
		MediaCodecInfo mediacodecinfo;
		String as[];
		String s2;
		android.media.MediaCodecInfo.CodecCapabilities codeccapabilities;
		try
		{
			arraylist = new ArrayList();
	//    0    0:new             #148 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void ArrayList()>
	//    3    7:astore          10
			s1 = codeckey.mimeType;
	//    4    9:aload_0         
	//    5   10:getfield        #152 <Field String MediaCodecUtil$CodecKey.mimeType>
	//    6   13:astore          11
			k = mediacodeclistcompat.getCodecCount();
	//    7   15:aload_1         
	//    8   16:invokeinterface #156 <Method int MediaCodecUtil$MediaCodecListCompat.getCodecCount()>
	//    9   21:istore          4
			flag = mediacodeclistcompat.secureDecodersExplicit();
	//   10   23:aload_1         
	//   11   24:invokeinterface #159 <Method boolean MediaCodecUtil$MediaCodecListCompat.secureDecodersExplicit()>
	//   12   29:istore          6
		}
	//*  13   31:iconst_0        
	//*  14   32:istore_2        
	//*  15   33:iload_2         
	//*  16   34:iload           4
	//*  17   36:icmpge          378
	//*  18   39:aload_1         
	//*  19   40:iload_2         
	//*  20   41:invokeinterface #163 <Method MediaCodecInfo MediaCodecUtil$MediaCodecListCompat.getCodecInfoAt(int)>
	//*  21   46:astore          12
	//*  22   48:aload           12
	//*  23   50:invokevirtual   #168 <Method String MediaCodecInfo.getName()>
	//*  24   53:astore          9
	//*  25   55:aload           12
	//*  26   57:aload           9
	//*  27   59:iload           6
	//*  28   61:invokestatic    #172 <Method boolean isCodecUsableDecoder(MediaCodecInfo, String, boolean)>
	//*  29   64:ifeq            371
	//*  30   67:aload           12
	//*  31   69:invokevirtual   #176 <Method String[] MediaCodecInfo.getSupportedTypes()>
	//*  32   72:astore          13
	//*  33   74:aload           13
	//*  34   76:arraylength     
	//*  35   77:istore          5
	//*  36   79:iconst_0        
	//*  37   80:istore_3        
	//*  38   81:aload_0         
	//*  39   82:astore          8
	//*  40   84:iload_3         
	//*  41   85:iload           5
	//*  42   87:icmpge          371
	//*  43   90:aload           13
	//*  44   92:iload_3         
	//*  45   93:aaload          
	//*  46   94:astore          14
	//*  47   96:aload           14
	//*  48   98:aload           11
	//*  49  100:invokevirtual   #182 <Method boolean String.equalsIgnoreCase(String)>
	//*  50  103:istore          7
	//*  51  105:iload           7
	//*  52  107:ifeq            364
	//*  53  110:aload           12
	//*  54  112:aload           14
	//*  55  114:invokevirtual   #186 <Method android.media.MediaCodecInfo$CodecCapabilities MediaCodecInfo.getCapabilitiesForType(String)>
	//*  56  117:astore          15
	//*  57  119:aload_1         
	//*  58  120:aload           11
	//*  59  122:aload           15
	//*  60  124:invokeinterface #190 <Method boolean MediaCodecUtil$MediaCodecListCompat.isSecurePlaybackSupported(String, android.media.MediaCodecInfo$CodecCapabilities)>
	//*  61  129:istore          7
	//*  62  131:iload           6
	//*  63  133:ifeq            146
	//*  64  136:aload           8
	//*  65  138:getfield        #194 <Field boolean MediaCodecUtil$CodecKey.secure>
	//*  66  141:iload           7
	//*  67  143:icmpeq          159
	//*  68  146:iload           6
	//*  69  148:ifne            181
	//*  70  151:aload           8
	//*  71  153:getfield        #194 <Field boolean MediaCodecUtil$CodecKey.secure>
	//*  72  156:ifne            181
	//*  73  159:aload           10
	//*  74  161:new             #39  <Class DecoderInfo>
	//*  75  164:dup             
	//*  76  165:aload           9
	//*  77  167:aload           15
	//*  78  169:invokespecial   #45  <Method void DecoderInfo(String, android.media.MediaCodecInfo$CodecCapabilities)>
	//*  79  172:invokeinterface #198 <Method boolean List.add(Object)>
	//*  80  177:pop             
	//*  81  178:goto            364
	//*  82  181:iload           6
	//*  83  183:ifne            364
	//*  84  186:iload           7
	//*  85  188:ifeq            364
	//*  86  191:new             #110 <Class StringBuilder>
	//*  87  194:dup             
	//*  88  195:invokespecial   #111 <Method void StringBuilder()>
	//*  89  198:astore          8
	//*  90  200:aload           8
	//*  91  202:aload           9
	//*  92  204:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  93  207:pop             
	//*  94  208:aload           8
	//*  95  210:ldc1            #200 <String ".secure">
	//*  96  212:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  97  215:pop             
	//*  98  216:aload           10
	//*  99  218:new             #39  <Class DecoderInfo>
	//* 100  221:dup             
	//* 101  222:aload           8
	//* 102  224:invokevirtual   #126 <Method String StringBuilder.toString()>
	//* 103  227:aload           15
	//* 104  229:invokespecial   #45  <Method void DecoderInfo(String, android.media.MediaCodecInfo$CodecCapabilities)>
	//* 105  232:invokeinterface #198 <Method boolean List.add(Object)>
	//* 106  237:pop             
	//* 107  238:aload           10
	//* 108  240:areturn         
	//* 109  241:astore          8
	//* 110  243:getstatic       #98  <Field int Util.SDK_INT>
	//* 111  246:bipush          23
	//* 112  248:icmpgt          308
	//* 113  251:aload           10
	//* 114  253:invokeinterface #80  <Method boolean List.isEmpty()>
	//* 115  258:ifne            308
	//* 116  261:new             #110 <Class StringBuilder>
	//* 117  264:dup             
	//* 118  265:invokespecial   #111 <Method void StringBuilder()>
	//* 119  268:astore          8
	//* 120  270:aload           8
	//* 121  272:ldc1            #202 <String "Skipping codec ">
	//* 122  274:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 123  277:pop             
	//* 124  278:aload           8
	//* 125  280:aload           9
	//* 126  282:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 127  285:pop             
	//* 128  286:aload           8
	//* 129  288:ldc1            #204 <String " (failed to query capabilities)">
	//* 130  290:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 131  293:pop             
	//* 132  294:ldc1            #30  <String "MediaCodecUtil">
	//* 133  296:aload           8
	//* 134  298:invokevirtual   #126 <Method String StringBuilder.toString()>
	//* 135  301:invokestatic    #207 <Method int Log.e(String, String)>
	//* 136  304:pop             
	//* 137  305:goto            364
	//* 138  308:new             #110 <Class StringBuilder>
	//* 139  311:dup             
	//* 140  312:invokespecial   #111 <Method void StringBuilder()>
	//* 141  315:astore_0        
	//* 142  316:aload_0         
	//* 143  317:ldc1            #209 <String "Failed to query codec ">
	//* 144  319:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 145  322:pop             
	//* 146  323:aload_0         
	//* 147  324:aload           9
	//* 148  326:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 149  329:pop             
	//* 150  330:aload_0         
	//* 151  331:ldc1            #211 <String " (">
	//* 152  333:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 153  336:pop             
	//* 154  337:aload_0         
	//* 155  338:aload           14
	//* 156  340:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 157  343:pop             
	//* 158  344:aload_0         
	//* 159  345:ldc1            #213 <String ")">
	//* 160  347:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 161  350:pop             
	//* 162  351:ldc1            #30  <String "MediaCodecUtil">
	//* 163  353:aload_0         
	//* 164  354:invokevirtual   #126 <Method String StringBuilder.toString()>
	//* 165  357:invokestatic    #207 <Method int Log.e(String, String)>
	//* 166  360:pop             
	//* 167  361:aload           8
	//* 168  363:athrow          
	//* 169  364:iload_3         
	//* 170  365:iconst_1        
	//* 171  366:iadd            
	//* 172  367:istore_3        
	//* 173  368:goto            81
	//* 174  371:iload_2         
	//* 175  372:iconst_1        
	//* 176  373:iadd            
	//* 177  374:istore_2        
	//* 178  375:goto            33
	//* 179  378:aload           10
	//* 180  380:areturn         
		// Misplaced declaration of an exception variable
		catch(CodecKey codeckey)
	//* 181  381:astore_0        
		{
			throw new DecoderQueryException(((Throwable) (codeckey)));
	//  182  382:new             #11  <Class MediaCodecUtil$DecoderQueryException>
	//  183  385:dup             
	//  184  386:aload_0         
	//  185  387:aconst_null     
	//  186  388:invokespecial   #216 <Method void MediaCodecUtil$DecoderQueryException(Throwable, MediaCodecUtil$1)>
	//  187  391:athrow          
		}
		i = 0;
		if(i >= k) goto _L2; else goto _L1
_L1:
		mediacodecinfo = mediacodeclistcompat.getCodecInfoAt(i);
		s = mediacodecinfo.getName();
		if(!isCodecUsableDecoder(mediacodecinfo, s, flag))
			continue; /* Loop/switch isn't completed */
		as = mediacodecinfo.getSupportedTypes();
		l = as.length;
		j = 0;
_L4:
		obj = ((Object) (codeckey));
		if(j >= l)
			continue; /* Loop/switch isn't completed */
		s2 = as[j];
		flag1 = s2.equalsIgnoreCase(s1);
		if(!flag1)
			break MISSING_BLOCK_LABEL_364;
		codeccapabilities = mediacodecinfo.getCapabilitiesForType(s2);
		flag1 = mediacodeclistcompat.isSecurePlaybackSupported(s1, codeccapabilities);
		if(!flag)
			break MISSING_BLOCK_LABEL_146;
		if(((CodecKey) (obj)).secure == flag1)
			break MISSING_BLOCK_LABEL_159;
		if(flag)
			break MISSING_BLOCK_LABEL_181;
		if(((CodecKey) (obj)).secure)
			break MISSING_BLOCK_LABEL_181;
		((List) (arraylist)).add(((Object) (new DecoderInfo(s, codeccapabilities))));
		break MISSING_BLOCK_LABEL_364;
		if(flag || !flag1)
			break MISSING_BLOCK_LABEL_364;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append(".secure");
		((List) (arraylist)).add(((Object) (new DecoderInfo(((StringBuilder) (obj)).toString(), codeccapabilities))));
		return ((List) (arraylist));
		obj1;
		if(Util.SDK_INT <= 23 && !((List) (arraylist)).isEmpty())
		{
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("Skipping codec ");
			((StringBuilder) (obj1)).append(s);
			((StringBuilder) (obj1)).append(" (failed to query capabilities)");
			Log.e("MediaCodecUtil", ((StringBuilder) (obj1)).toString());
			break MISSING_BLOCK_LABEL_364;
		}
		codeckey = ((CodecKey) (new StringBuilder()));
		((StringBuilder) (codeckey)).append("Failed to query codec ");
		((StringBuilder) (codeckey)).append(s);
		((StringBuilder) (codeckey)).append(" (");
		((StringBuilder) (codeckey)).append(s2);
		((StringBuilder) (codeckey)).append(")");
		Log.e("MediaCodecUtil", ((StringBuilder) (codeckey)).toString());
		throw obj1;
		j++;
		if(true) goto _L4; else goto _L3
_L3:
		i++;
		break MISSING_BLOCK_LABEL_33;
_L2:
		return ((List) (arraylist));
	}

	public static DecoderInfo getPassthroughDecoderInfo()
	{
		return PASSTHROUGH_DECODER_INFO;
	//    0    0:getstatic       #47  <Field DecoderInfo PASSTHROUGH_DECODER_INFO>
	//    1    3:areturn         
	}

	private static android.media.MediaCodecInfo.VideoCapabilities getVideoCapabilitiesV21(String s, boolean flag)
		throws DecoderQueryException
	{
		s = ((String) (getDecoderInfo(s, flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #224 <Method DecoderInfo getDecoderInfo(String, boolean)>
	//    3    5:astore_0        
		if(s == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return ((DecoderInfo) (s)).capabilities.getVideoCapabilities();
	//    8   12:aload_0         
	//    9   13:getfield        #228 <Field android.media.MediaCodecInfo$CodecCapabilities DecoderInfo.capabilities>
	//   10   16:invokevirtual   #234 <Method android.media.MediaCodecInfo$VideoCapabilities android.media.MediaCodecInfo$CodecCapabilities.getVideoCapabilities()>
	//   11   19:areturn         
	}

	private static boolean isCodecUsableDecoder(MediaCodecInfo mediacodecinfo, String s, boolean flag)
	{
		if(!mediacodecinfo.isEncoder())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #238 <Method boolean MediaCodecInfo.isEncoder()>
	//*   2    4:ifne            503
		{
			if(!flag && s.endsWith(".secure"))
	//*   3    7:iload_2         
	//*   4    8:ifne            22
	//*   5   11:aload_1         
	//*   6   12:ldc1            #200 <String ".secure">
	//*   7   14:invokevirtual   #241 <Method boolean String.endsWith(String)>
	//*   8   17:ifeq            22
				return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
			if(Util.SDK_INT < 21 && ("CIPAACDecoder".equals(((Object) (s))) || "CIPMP3Decoder".equals(((Object) (s))) || "CIPVorbisDecoder".equals(((Object) (s))) || "CIPAMRNBDecoder".equals(((Object) (s))) || "AACDecoder".equals(((Object) (s))) || "MP3Decoder".equals(((Object) (s)))))
	//*  11   22:getstatic       #98  <Field int Util.SDK_INT>
	//*  12   25:bipush          21
	//*  13   27:icmpge          87
	//*  14   30:ldc1            #243 <String "CIPAACDecoder">
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  17   36:ifne            85
	//*  18   39:ldc1            #248 <String "CIPMP3Decoder">
	//*  19   41:aload_1         
	//*  20   42:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  21   45:ifne            85
	//*  22   48:ldc1            #250 <String "CIPVorbisDecoder">
	//*  23   50:aload_1         
	//*  24   51:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  25   54:ifne            85
	//*  26   57:ldc1            #252 <String "CIPAMRNBDecoder">
	//*  27   59:aload_1         
	//*  28   60:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  29   63:ifne            85
	//*  30   66:ldc1            #254 <String "AACDecoder">
	//*  31   68:aload_1         
	//*  32   69:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  33   72:ifne            85
	//*  34   75:ldc2            #256 <String "MP3Decoder">
	//*  35   78:aload_1         
	//*  36   79:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  37   82:ifeq            87
				return false;
	//   38   85:iconst_0        
	//   39   86:ireturn         
			if(Util.SDK_INT < 18 && "OMX.SEC.MP3.Decoder".equals(((Object) (s))))
	//*  40   87:getstatic       #98  <Field int Util.SDK_INT>
	//*  41   90:bipush          18
	//*  42   92:icmpge          107
	//*  43   95:ldc2            #258 <String "OMX.SEC.MP3.Decoder">
	//*  44   98:aload_1         
	//*  45   99:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  46  102:ifeq            107
				return false;
	//   47  105:iconst_0        
	//   48  106:ireturn         
			if(Util.SDK_INT < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(((Object) (s))) && "a70".equals(((Object) (Util.DEVICE))))
	//*  49  107:getstatic       #98  <Field int Util.SDK_INT>
	//*  50  110:bipush          18
	//*  51  112:icmpge          139
	//*  52  115:ldc2            #260 <String "OMX.MTK.AUDIO.DECODER.AAC">
	//*  53  118:aload_1         
	//*  54  119:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  55  122:ifeq            139
	//*  56  125:ldc2            #262 <String "a70">
	//*  57  128:getstatic       #265 <Field String Util.DEVICE>
	//*  58  131:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  59  134:ifeq            139
				return false;
	//   60  137:iconst_0        
	//   61  138:ireturn         
			if(Util.SDK_INT == 16 && Util.DEVICE != null && "OMX.qcom.audio.decoder.mp3".equals(((Object) (s))) && ("dlxu".equals(((Object) (Util.DEVICE))) || "protou".equals(((Object) (Util.DEVICE))) || "ville".equals(((Object) (Util.DEVICE))) || "villeplus".equals(((Object) (Util.DEVICE))) || "villec2".equals(((Object) (Util.DEVICE))) || Util.DEVICE.startsWith("gee") || "C6602".equals(((Object) (Util.DEVICE))) || "C6603".equals(((Object) (Util.DEVICE))) || "C6606".equals(((Object) (Util.DEVICE))) || "C6616".equals(((Object) (Util.DEVICE))) || "L36h".equals(((Object) (Util.DEVICE))) || "SO-02E".equals(((Object) (Util.DEVICE)))))
	//*  62  139:getstatic       #98  <Field int Util.SDK_INT>
	//*  63  142:bipush          16
	//*  64  144:icmpne          309
	//*  65  147:getstatic       #265 <Field String Util.DEVICE>
	//*  66  150:ifnull          309
	//*  67  153:ldc2            #267 <String "OMX.qcom.audio.decoder.mp3">
	//*  68  156:aload_1         
	//*  69  157:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  70  160:ifeq            309
	//*  71  163:ldc2            #269 <String "dlxu">
	//*  72  166:getstatic       #265 <Field String Util.DEVICE>
	//*  73  169:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  74  172:ifne            307
	//*  75  175:ldc2            #271 <String "protou">
	//*  76  178:getstatic       #265 <Field String Util.DEVICE>
	//*  77  181:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  78  184:ifne            307
	//*  79  187:ldc2            #273 <String "ville">
	//*  80  190:getstatic       #265 <Field String Util.DEVICE>
	//*  81  193:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  82  196:ifne            307
	//*  83  199:ldc2            #275 <String "villeplus">
	//*  84  202:getstatic       #265 <Field String Util.DEVICE>
	//*  85  205:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  86  208:ifne            307
	//*  87  211:ldc2            #277 <String "villec2">
	//*  88  214:getstatic       #265 <Field String Util.DEVICE>
	//*  89  217:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  90  220:ifne            307
	//*  91  223:getstatic       #265 <Field String Util.DEVICE>
	//*  92  226:ldc2            #279 <String "gee">
	//*  93  229:invokevirtual   #282 <Method boolean String.startsWith(String)>
	//*  94  232:ifne            307
	//*  95  235:ldc2            #284 <String "C6602">
	//*  96  238:getstatic       #265 <Field String Util.DEVICE>
	//*  97  241:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  98  244:ifne            307
	//*  99  247:ldc2            #286 <String "C6603">
	//* 100  250:getstatic       #265 <Field String Util.DEVICE>
	//* 101  253:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 102  256:ifne            307
	//* 103  259:ldc2            #288 <String "C6606">
	//* 104  262:getstatic       #265 <Field String Util.DEVICE>
	//* 105  265:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 106  268:ifne            307
	//* 107  271:ldc2            #290 <String "C6616">
	//* 108  274:getstatic       #265 <Field String Util.DEVICE>
	//* 109  277:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 110  280:ifne            307
	//* 111  283:ldc2            #292 <String "L36h">
	//* 112  286:getstatic       #265 <Field String Util.DEVICE>
	//* 113  289:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 114  292:ifne            307
	//* 115  295:ldc2            #294 <String "SO-02E">
	//* 116  298:getstatic       #265 <Field String Util.DEVICE>
	//* 117  301:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 118  304:ifeq            309
				return false;
	//  119  307:iconst_0        
	//  120  308:ireturn         
			if(Util.SDK_INT == 16 && "OMX.qcom.audio.decoder.aac".equals(((Object) (s))) && ("C1504".equals(((Object) (Util.DEVICE))) || "C1505".equals(((Object) (Util.DEVICE))) || "C1604".equals(((Object) (Util.DEVICE))) || "C1605".equals(((Object) (Util.DEVICE)))))
	//* 121  309:getstatic       #98  <Field int Util.SDK_INT>
	//* 122  312:bipush          16
	//* 123  314:icmpne          377
	//* 124  317:ldc2            #296 <String "OMX.qcom.audio.decoder.aac">
	//* 125  320:aload_1         
	//* 126  321:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 127  324:ifeq            377
	//* 128  327:ldc2            #298 <String "C1504">
	//* 129  330:getstatic       #265 <Field String Util.DEVICE>
	//* 130  333:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 131  336:ifne            375
	//* 132  339:ldc2            #300 <String "C1505">
	//* 133  342:getstatic       #265 <Field String Util.DEVICE>
	//* 134  345:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 135  348:ifne            375
	//* 136  351:ldc2            #302 <String "C1604">
	//* 137  354:getstatic       #265 <Field String Util.DEVICE>
	//* 138  357:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 139  360:ifne            375
	//* 140  363:ldc2            #304 <String "C1605">
	//* 141  366:getstatic       #265 <Field String Util.DEVICE>
	//* 142  369:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 143  372:ifeq            377
				return false;
	//  144  375:iconst_0        
	//  145  376:ireturn         
			if(Util.SDK_INT <= 19 && Util.DEVICE != null && (Util.DEVICE.startsWith("d2") || Util.DEVICE.startsWith("serrano") || Util.DEVICE.startsWith("jflte") || Util.DEVICE.startsWith("santos")) && "samsung".equals(((Object) (Util.MANUFACTURER))) && s.equals("OMX.SEC.vp8.dec"))
	//* 146  377:getstatic       #98  <Field int Util.SDK_INT>
	//* 147  380:bipush          19
	//* 148  382:icmpgt          463
	//* 149  385:getstatic       #265 <Field String Util.DEVICE>
	//* 150  388:ifnull          463
	//* 151  391:getstatic       #265 <Field String Util.DEVICE>
	//* 152  394:ldc2            #306 <String "d2">
	//* 153  397:invokevirtual   #282 <Method boolean String.startsWith(String)>
	//* 154  400:ifne            439
	//* 155  403:getstatic       #265 <Field String Util.DEVICE>
	//* 156  406:ldc2            #308 <String "serrano">
	//* 157  409:invokevirtual   #282 <Method boolean String.startsWith(String)>
	//* 158  412:ifne            439
	//* 159  415:getstatic       #265 <Field String Util.DEVICE>
	//* 160  418:ldc2            #310 <String "jflte">
	//* 161  421:invokevirtual   #282 <Method boolean String.startsWith(String)>
	//* 162  424:ifne            439
	//* 163  427:getstatic       #265 <Field String Util.DEVICE>
	//* 164  430:ldc2            #312 <String "santos">
	//* 165  433:invokevirtual   #282 <Method boolean String.startsWith(String)>
	//* 166  436:ifeq            463
	//* 167  439:ldc2            #314 <String "samsung">
	//* 168  442:getstatic       #317 <Field String Util.MANUFACTURER>
	//* 169  445:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 170  448:ifeq            463
	//* 171  451:aload_1         
	//* 172  452:ldc2            #319 <String "OMX.SEC.vp8.dec">
	//* 173  455:invokevirtual   #246 <Method boolean String.equals(Object)>
	//* 174  458:ifeq            463
				return false;
	//  175  461:iconst_0        
	//  176  462:ireturn         
			return Util.SDK_INT > 19 || Util.DEVICE == null || !Util.DEVICE.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(((Object) (s)));
	//  177  463:getstatic       #98  <Field int Util.SDK_INT>
	//  178  466:bipush          19
	//  179  468:icmpgt          501
	//  180  471:getstatic       #265 <Field String Util.DEVICE>
	//  181  474:ifnull          501
	//  182  477:getstatic       #265 <Field String Util.DEVICE>
	//  183  480:ldc2            #310 <String "jflte">
	//  184  483:invokevirtual   #282 <Method boolean String.startsWith(String)>
	//  185  486:ifeq            501
	//  186  489:ldc2            #321 <String "OMX.qcom.video.decoder.vp8">
	//  187  492:aload_1         
	//  188  493:invokevirtual   #246 <Method boolean String.equals(Object)>
	//  189  496:ifeq            501
	//  190  499:iconst_0        
	//  191  500:ireturn         
	//  192  501:iconst_1        
	//  193  502:ireturn         
		} else
		{
			return false;
	//  194  503:iconst_0        
	//  195  504:ireturn         
		}
	}

	public static boolean isH264ProfileSupported(int i, int j)
		throws DecoderQueryException
	{
		DecoderInfo decoderinfo = getDecoderInfo("video/avc", false);
	//    0    0:ldc2            #326 <String "video/avc">
	//    1    3:iconst_0        
	//    2    4:invokestatic    #224 <Method DecoderInfo getDecoderInfo(String, boolean)>
	//    3    7:astore          4
		if(decoderinfo == null)
	//*   4    9:aload           4
	//*   5   11:ifnonnull       16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		android.media.MediaCodecInfo.CodecProfileLevel acodecprofilelevel[] = decoderinfo.capabilities.profileLevels;
	//    8   16:aload           4
	//    9   18:getfield        #228 <Field android.media.MediaCodecInfo$CodecCapabilities DecoderInfo.capabilities>
	//   10   21:getfield        #330 <Field android.media.MediaCodecInfo$CodecProfileLevel[] android.media.MediaCodecInfo$CodecCapabilities.profileLevels>
	//   11   24:astore          4
		int l = acodecprofilelevel.length;
	//   12   26:aload           4
	//   13   28:arraylength     
	//   14   29:istore_3        
		for(int k = 0; k < l; k++)
	//*  15   30:iconst_0        
	//*  16   31:istore_2        
	//*  17   32:iload_2         
	//*  18   33:iload_3         
	//*  19   34:icmpge          70
		{
			android.media.MediaCodecInfo.CodecProfileLevel codecprofilelevel = acodecprofilelevel[k];
	//   20   37:aload           4
	//   21   39:iload_2         
	//   22   40:aaload          
	//   23   41:astore          5
			if(codecprofilelevel.profile == i && codecprofilelevel.level >= j)
	//*  24   43:aload           5
	//*  25   45:getfield        #335 <Field int android.media.MediaCodecInfo$CodecProfileLevel.profile>
	//*  26   48:iload_0         
	//*  27   49:icmpne          63
	//*  28   52:aload           5
	//*  29   54:getfield        #338 <Field int android.media.MediaCodecInfo$CodecProfileLevel.level>
	//*  30   57:iload_1         
	//*  31   58:icmplt          63
				return true;
	//   32   61:iconst_1        
	//   33   62:ireturn         
		}

	//   34   63:iload_2         
	//   35   64:iconst_1        
	//   36   65:iadd            
	//   37   66:istore_2        
	//*  38   67:goto            32
		return false;
	//   39   70:iconst_0        
	//   40   71:ireturn         
	}

	public static boolean isSizeAndRateSupportedV21(String s, boolean flag, int i, int j, double d)
		throws DecoderQueryException
	{
		boolean flag1;
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #98  <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			flag1 = true;
	//    3    8:iconst_1        
	//    4    9:istore          6
		else
	//*   5   11:goto            17
			flag1 = false;
	//    6   14:iconst_0        
	//    7   15:istore          6
		Assertions.checkState(flag1);
	//    8   17:iload           6
	//    9   19:invokestatic    #346 <Method void Assertions.checkState(boolean)>
		s = ((String) (getVideoCapabilitiesV21(s, flag)));
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:invokestatic    #348 <Method android.media.MediaCodecInfo$VideoCapabilities getVideoCapabilitiesV21(String, boolean)>
	//   13   27:astore_0        
		return s != null && ((android.media.MediaCodecInfo.VideoCapabilities) (s)).areSizeAndRateSupported(i, j, d);
	//   14   28:aload_0         
	//   15   29:ifnull          45
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iload_3         
	//   19   35:dload           4
	//   20   37:invokevirtual   #354 <Method boolean android.media.MediaCodecInfo$VideoCapabilities.areSizeAndRateSupported(int, int, double)>
	//   21   40:ifeq            45
	//   22   43:iconst_1        
	//   23   44:ireturn         
	//   24   45:iconst_0        
	//   25   46:ireturn         
	}

	public static boolean isSizeSupportedV21(String s, boolean flag, int i, int j)
		throws DecoderQueryException
	{
		boolean flag1;
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #98  <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			flag1 = true;
	//    3    8:iconst_1        
	//    4    9:istore          4
		else
	//*   5   11:goto            17
			flag1 = false;
	//    6   14:iconst_0        
	//    7   15:istore          4
		Assertions.checkState(flag1);
	//    8   17:iload           4
	//    9   19:invokestatic    #346 <Method void Assertions.checkState(boolean)>
		s = ((String) (getVideoCapabilitiesV21(s, flag)));
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:invokestatic    #348 <Method android.media.MediaCodecInfo$VideoCapabilities getVideoCapabilitiesV21(String, boolean)>
	//   13   27:astore_0        
		return s != null && ((android.media.MediaCodecInfo.VideoCapabilities) (s)).isSizeSupported(i, j);
	//   14   28:aload_0         
	//   15   29:ifnull          43
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:iload_3         
	//   19   35:invokevirtual   #359 <Method boolean android.media.MediaCodecInfo$VideoCapabilities.isSizeSupported(int, int)>
	//   20   38:ifeq            43
	//   21   41:iconst_1        
	//   22   42:ireturn         
	//   23   43:iconst_0        
	//   24   44:ireturn         
	}

	public static int maxH264DecodableFrameSize()
		throws DecoderQueryException
	{
		if(maxH264DecodableFrameSize == -1)
	//*   0    0:getstatic       #55  <Field int maxH264DecodableFrameSize>
	//*   1    3:iconst_m1       
	//*   2    4:icmpne          82
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_0        
			boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
			DecoderInfo decoderinfo = getDecoderInfo("video/avc", false);
	//    7   11:ldc2            #326 <String "video/avc">
	//    8   14:iconst_0        
	//    9   15:invokestatic    #224 <Method DecoderInfo getDecoderInfo(String, boolean)>
	//   10   18:astore          4
			if(decoderinfo != null)
	//*  11   20:aload           4
	//*  12   22:ifnull          78
			{
				android.media.MediaCodecInfo.CodecProfileLevel acodecprofilelevel[] = decoderinfo.capabilities.profileLevels;
	//   13   25:aload           4
	//   14   27:getfield        #228 <Field android.media.MediaCodecInfo$CodecCapabilities DecoderInfo.capabilities>
	//   15   30:getfield        #330 <Field android.media.MediaCodecInfo$CodecProfileLevel[] android.media.MediaCodecInfo$CodecCapabilities.profileLevels>
	//   16   33:astore          4
				int k = acodecprofilelevel.length;
	//   17   35:aload           4
	//   18   37:arraylength     
	//   19   38:istore_3        
				int j = 0;
	//   20   39:iconst_0        
	//   21   40:istore_1        
				for(i = ((int) (flag)); i < k; i++)
	//*  22   41:iload_2         
	//*  23   42:istore_0        
	//*  24   43:iload_0         
	//*  25   44:iload_3         
	//*  26   45:icmpge          70
					j = Math.max(avcLevelToMaxFrameSize(acodecprofilelevel[i].level), j);
	//   27   48:aload           4
	//   28   50:iload_0         
	//   29   51:aaload          
	//   30   52:getfield        #338 <Field int android.media.MediaCodecInfo$CodecProfileLevel.level>
	//   31   55:invokestatic    #361 <Method int avcLevelToMaxFrameSize(int)>
	//   32   58:iload_1         
	//   33   59:invokestatic    #367 <Method int Math.max(int, int)>
	//   34   62:istore_1        

	//   35   63:iload_0         
	//   36   64:iconst_1        
	//   37   65:iadd            
	//   38   66:istore_0        
	//*  39   67:goto            43
				i = Math.max(j, 0x2a300);
	//   40   70:iload_1         
	//   41   71:ldc2            #368 <Int 0x2a300>
	//   42   74:invokestatic    #367 <Method int Math.max(int, int)>
	//   43   77:istore_0        
			}
			maxH264DecodableFrameSize = i;
	//   44   78:iload_0         
	//   45   79:putstatic       #55  <Field int maxH264DecodableFrameSize>
		}
		return maxH264DecodableFrameSize;
	//   46   82:getstatic       #55  <Field int maxH264DecodableFrameSize>
	//   47   85:ireturn         
	}

	public static void warmCodec(String s, boolean flag)
	{
		try
		{
			getDecoderInfos(s, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #74  <Method List getDecoderInfos(String, boolean)>
	//    3    5:pop             
			return;
	//    4    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			Log.e("MediaCodecUtil", "Codec warming failed", ((Throwable) (s)));
	//    6    8:ldc1            #30  <String "MediaCodecUtil">
	//    7   10:ldc2            #371 <String "Codec warming failed">
	//    8   13:aload_0         
	//    9   14:invokestatic    #374 <Method int Log.e(String, String, Throwable)>
	//   10   17:pop             
		}
	//   11   18:return          
	}

	private static final DecoderInfo PASSTHROUGH_DECODER_INFO = new DecoderInfo("OMX.google.raw.decoder", ((android.media.MediaCodecInfo.CodecCapabilities) (null)));
	private static final String TAG = "MediaCodecUtil";
	private static final Map decoderInfosCache = new HashMap();
	private static int maxH264DecodableFrameSize = -1;

	static 
	{
	//    0    0:new             #39  <Class DecoderInfo>
	//    1    3:dup             
	//    2    4:ldc1            #41  <String "OMX.google.raw.decoder">
	//    3    6:aconst_null     
	//    4    7:invokespecial   #45  <Method void DecoderInfo(String, android.media.MediaCodecInfo$CodecCapabilities)>
	//    5   10:putstatic       #47  <Field DecoderInfo PASSTHROUGH_DECODER_INFO>
	//    6   13:new             #49  <Class HashMap>
	//    7   16:dup             
	//    8   17:invokespecial   #51  <Method void HashMap()>
	//    9   20:putstatic       #53  <Field Map decoderInfosCache>
	//   10   23:iconst_m1       
	//   11   24:putstatic       #55  <Field int maxH264DecodableFrameSize>
	//*  12   27:return          
	}
}
