// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.mediacodec;

import android.media.MediaFormat;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

public final class MediaFormatUtil
{

	private MediaFormatUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void maybeSetByteBuffer(MediaFormat mediaformat, String s, byte abyte0[])
	{
		if(abyte0 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			mediaformat.setByteBuffer(s, ByteBuffer.wrap(abyte0));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokestatic    #21  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    6   10:invokevirtual   #27  <Method void MediaFormat.setByteBuffer(String, ByteBuffer)>
	//    7   13:return          
	}

	public static void maybeSetColorInfo(MediaFormat mediaformat, ColorInfo colorinfo)
	{
		if(colorinfo != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          44
		{
			maybeSetInteger(mediaformat, "color-transfer", colorinfo.colorTransfer);
	//    2    4:aload_0         
	//    3    5:ldc1            #32  <String "color-transfer">
	//    4    7:aload_1         
	//    5    8:getfield        #38  <Field int ColorInfo.colorTransfer>
	//    6   11:invokestatic    #42  <Method void maybeSetInteger(MediaFormat, String, int)>
			maybeSetInteger(mediaformat, "color-standard", colorinfo.colorSpace);
	//    7   14:aload_0         
	//    8   15:ldc1            #44  <String "color-standard">
	//    9   17:aload_1         
	//   10   18:getfield        #47  <Field int ColorInfo.colorSpace>
	//   11   21:invokestatic    #42  <Method void maybeSetInteger(MediaFormat, String, int)>
			maybeSetInteger(mediaformat, "color-range", colorinfo.colorRange);
	//   12   24:aload_0         
	//   13   25:ldc1            #49  <String "color-range">
	//   14   27:aload_1         
	//   15   28:getfield        #52  <Field int ColorInfo.colorRange>
	//   16   31:invokestatic    #42  <Method void maybeSetInteger(MediaFormat, String, int)>
			maybeSetByteBuffer(mediaformat, "hdr-static-info", colorinfo.hdrStaticInfo);
	//   17   34:aload_0         
	//   18   35:ldc1            #54  <String "hdr-static-info">
	//   19   37:aload_1         
	//   20   38:getfield        #58  <Field byte[] ColorInfo.hdrStaticInfo>
	//   21   41:invokestatic    #60  <Method void maybeSetByteBuffer(MediaFormat, String, byte[])>
		}
	//   22   44:return          
	}

	public static void maybeSetFloat(MediaFormat mediaformat, String s, float f)
	{
		if(f != -1F)
	//*   0    0:fload_2         
	//*   1    1:ldc1            #63  <Float -1F>
	//*   2    3:fcmpl           
	//*   3    4:ifeq            13
			mediaformat.setFloat(s, f);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:fload_2         
	//    7   10:invokevirtual   #67  <Method void MediaFormat.setFloat(String, float)>
	//    8   13:return          
	}

	public static void maybeSetInteger(MediaFormat mediaformat, String s, int i)
	{
		if(i != -1)
	//*   0    0:iload_2         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          11
			mediaformat.setInteger(s, i);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #71  <Method void MediaFormat.setInteger(String, int)>
	//    7   11:return          
	}

	public static void setCsdBuffers(MediaFormat mediaformat, List list)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #79  <Method int List.size()>
	//*   5    9:icmpge          61
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #81  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #82  <Method void StringBuilder()>
	//    9   19:astore_3        
			stringbuilder.append("csd-");
	//   10   20:aload_3         
	//   11   21:ldc1            #84  <String "csd-">
	//   12   23:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			stringbuilder.append(i);
	//   14   27:aload_3         
	//   15   28:iload_2         
	//   16   29:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
			mediaformat.setByteBuffer(stringbuilder.toString(), ByteBuffer.wrap((byte[])list.get(i)));
	//   18   33:aload_0         
	//   19   34:aload_3         
	//   20   35:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   21   38:aload_1         
	//   22   39:iload_2         
	//   23   40:invokeinterface #99  <Method Object List.get(int)>
	//   24   45:checkcast       #100 <Class byte[]>
	//   25   48:invokestatic    #21  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   26   51:invokevirtual   #27  <Method void MediaFormat.setByteBuffer(String, ByteBuffer)>
		}

	//   27   54:iload_2         
	//   28   55:iconst_1        
	//   29   56:iadd            
	//   30   57:istore_2        
	//*  31   58:goto            2
	//   32   61:return          
	}

	public static void setString(MediaFormat mediaformat, String s, String s1)
	{
		mediaformat.setString(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #107 <Method void MediaFormat.setString(String, String)>
	//    4    6:return          
	}
}
