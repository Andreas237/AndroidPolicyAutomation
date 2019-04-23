// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import android.content.Context;
import android.graphics.Point;
import com.google.android.exoplayer.MediaCodecUtil;
import com.google.android.exoplayer.util.MimeTypes;
import com.google.android.exoplayer.util.Util;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			Format, FormatWrapper

public final class VideoFormatSelectorUtil
{

	private VideoFormatSelectorUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static Point getMaxVideoSizeInViewport(boolean flag, int i, int j, int k, int l)
	{
label0:
		{
			if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            43
			{
				boolean flag2 = true;
	//    2    4:iconst_1        
	//    3    5:istore          6
				boolean flag1;
				if(k > l)
	//*   4    7:iload_3         
	//*   5    8:iload           4
	//*   6   10:icmple          19
					flag1 = true;
	//    7   13:iconst_1        
	//    8   14:istore          5
				else
	//*   9   16:goto            22
					flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore          5
				if(i <= j)
	//*  12   22:iload_1         
	//*  13   23:iload_2         
	//*  14   24:icmple          30
	//*  15   27:goto            33
					flag2 = false;
	//   16   30:iconst_0        
	//   17   31:istore          6
				if(flag1 != flag2)
	//*  18   33:iload           5
	//*  19   35:iload           6
	//*  20   37:icmpeq          43
					break label0;
	//   21   40:goto            51
			}
			int i1 = j;
	//   22   43:iload_2         
	//   23   44:istore          5
			j = i;
	//   24   46:iload_1         
	//   25   47:istore_2        
			i = i1;
	//   26   48:iload           5
	//   27   50:istore_1        
		}
		int j1 = k * i;
	//   28   51:iload_3         
	//   29   52:iload_1         
	//   30   53:imul            
	//   31   54:istore          5
		int k1 = l * j;
	//   32   56:iload           4
	//   33   58:iload_2         
	//   34   59:imul            
	//   35   60:istore          6
		if(j1 >= k1)
	//*  36   62:iload           5
	//*  37   64:iload           6
	//*  38   66:icmplt          84
			return new Point(j, Util.ceilDivide(k1, k));
	//   39   69:new             #16  <Class Point>
	//   40   72:dup             
	//   41   73:iload_2         
	//   42   74:iload           6
	//   43   76:iload_3         
	//   44   77:invokestatic    #22  <Method int Util.ceilDivide(int, int)>
	//   45   80:invokespecial   #25  <Method void Point(int, int)>
	//   46   83:areturn         
		else
			return new Point(Util.ceilDivide(j1, l), i);
	//   47   84:new             #16  <Class Point>
	//   48   87:dup             
	//   49   88:iload           5
	//   50   90:iload           4
	//   51   92:invokestatic    #22  <Method int Util.ceilDivide(int, int)>
	//   52   95:iload_1         
	//   53   96:invokespecial   #25  <Method void Point(int, int)>
	//   54   99:areturn         
	}

	private static boolean isFormatPlayable(Format format, String as[], boolean flag, boolean flag1)
		throws com.google.android.exoplayer.MediaCodecUtil.DecoderQueryException
	{
		if(as != null && !Util.contains(((Object []) (as)), ((Object) (format.mimeType))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field String Format.mimeType>
	//*   5    9:invokestatic    #39  <Method boolean Util.contains(Object[], Object)>
	//*   6   12:ifne            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(flag && (format.width >= 1280 || format.height >= 720))
	//*   9   17:iload_2         
	//*  10   18:ifeq            43
	//*  11   21:aload_0         
	//*  12   22:getfield        #43  <Field int Format.width>
	//*  13   25:sipush          1280
	//*  14   28:icmpge          41
	//*  15   31:aload_0         
	//*  16   32:getfield        #46  <Field int Format.height>
	//*  17   35:sipush          720
	//*  18   38:icmplt          43
			return false;
	//   19   41:iconst_0        
	//   20   42:ireturn         
		if(format.width > 0 && format.height > 0)
	//*  21   43:aload_0         
	//*  22   44:getfield        #43  <Field int Format.width>
	//*  23   47:ifle            147
	//*  24   50:aload_0         
	//*  25   51:getfield        #46  <Field int Format.height>
	//*  26   54:ifle            147
		{
			if(Util.SDK_INT >= 21)
	//*  27   57:getstatic       #49  <Field int Util.SDK_INT>
	//*  28   60:bipush          21
	//*  29   62:icmplt          130
			{
				as = ((String []) (MimeTypes.getVideoMediaMimeType(format.codecs)));
	//   30   65:aload_0         
	//   31   66:getfield        #52  <Field String Format.codecs>
	//   32   69:invokestatic    #58  <Method String MimeTypes.getVideoMediaMimeType(String)>
	//   33   72:astore_1        
				if("video/x-unknown".equals(((Object) (as))))
	//*  34   73:ldc1            #60  <String "video/x-unknown">
	//*  35   75:aload_1         
	//*  36   76:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  37   79:ifeq            88
					as = "video/avc";
	//   38   82:ldc1            #68  <String "video/avc">
	//   39   84:astore_1        
	//*  40   85:goto            88
				if(format.frameRate > 0.0F)
	//*  41   88:aload_0         
	//*  42   89:getfield        #71  <Field float Format.frameRate>
	//*  43   92:fconst_0        
	//*  44   93:fcmpl           
	//*  45   94:ifle            116
					return MediaCodecUtil.isSizeAndRateSupportedV21(((String) (as)), flag1, format.width, format.height, format.frameRate);
	//   46   97:aload_1         
	//   47   98:iload_3         
	//   48   99:aload_0         
	//   49  100:getfield        #43  <Field int Format.width>
	//   50  103:aload_0         
	//   51  104:getfield        #46  <Field int Format.height>
	//   52  107:aload_0         
	//   53  108:getfield        #71  <Field float Format.frameRate>
	//   54  111:f2d             
	//   55  112:invokestatic    #77  <Method boolean MediaCodecUtil.isSizeAndRateSupportedV21(String, boolean, int, int, double)>
	//   56  115:ireturn         
				else
					return MediaCodecUtil.isSizeSupportedV21(((String) (as)), flag1, format.width, format.height);
	//   57  116:aload_1         
	//   58  117:iload_3         
	//   59  118:aload_0         
	//   60  119:getfield        #43  <Field int Format.width>
	//   61  122:aload_0         
	//   62  123:getfield        #46  <Field int Format.height>
	//   63  126:invokestatic    #81  <Method boolean MediaCodecUtil.isSizeSupportedV21(String, boolean, int, int)>
	//   64  129:ireturn         
			}
			if(format.width * format.height > MediaCodecUtil.maxH264DecodableFrameSize())
	//*  65  130:aload_0         
	//*  66  131:getfield        #43  <Field int Format.width>
	//*  67  134:aload_0         
	//*  68  135:getfield        #46  <Field int Format.height>
	//*  69  138:imul            
	//*  70  139:invokestatic    #85  <Method int MediaCodecUtil.maxH264DecodableFrameSize()>
	//*  71  142:icmple          147
				return false;
	//   72  145:iconst_0        
	//   73  146:ireturn         
		}
		return true;
	//   74  147:iconst_1        
	//   75  148:ireturn         
	}

	public static int[] selectVideoFormats(List list, String as[], boolean flag, boolean flag1, boolean flag2, int i, int j)
		throws com.google.android.exoplayer.MediaCodecUtil.DecoderQueryException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #90  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void ArrayList()>
	//    3    7:astore          12
		int k1 = list.size();
	//    4    9:aload_0         
	//    5   10:invokeinterface #96  <Method int List.size()>
	//    6   15:istore          11
		int l = 0;
	//    7   17:iconst_0        
	//    8   18:istore          8
		int k;
		int i1;
		for(k = 0x7fffffff; l < k1; k = i1)
	//*   9   20:ldc1            #97  <Int 0x7fffffff>
	//*  10   22:istore          7
	//*  11   24:iload           8
	//*  12   26:iload           11
	//*  13   28:icmpge          217
		{
			Format format = ((FormatWrapper)list.get(l)).getFormat();
	//   14   31:aload_0         
	//   15   32:iload           8
	//   16   34:invokeinterface #101 <Method Object List.get(int)>
	//   17   39:checkcast       #103 <Class FormatWrapper>
	//   18   42:invokeinterface #107 <Method Format FormatWrapper.getFormat()>
	//   19   47:astore          13
			if(isFormatPlayable(format, as, flag, flag2))
	//*  20   49:aload           13
	//*  21   51:aload_1         
	//*  22   52:iload_2         
	//*  23   53:iload           4
	//*  24   55:invokestatic    #109 <Method boolean isFormatPlayable(Format, String[], boolean, boolean)>
	//*  25   58:ifeq            200
			{
				arraylist.add(((Object) (Integer.valueOf(l))));
	//   26   61:aload           12
	//   27   63:iload           8
	//   28   65:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//   29   68:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   30   71:pop             
				if(format.width > 0 && format.height > 0 && i > 0 && j > 0)
	//*  31   72:aload           13
	//*  32   74:getfield        #43  <Field int Format.width>
	//*  33   77:ifle            193
	//*  34   80:aload           13
	//*  35   82:getfield        #46  <Field int Format.height>
	//*  36   85:ifle            193
	//*  37   88:iload           5
	//*  38   90:ifle            193
	//*  39   93:iload           6
	//*  40   95:ifle            193
				{
					Point point = getMaxVideoSizeInViewport(flag1, i, j, format.width, format.height);
	//   41   98:iload_3         
	//   42   99:iload           5
	//   43  101:iload           6
	//   44  103:aload           13
	//   45  105:getfield        #43  <Field int Format.width>
	//   46  108:aload           13
	//   47  110:getfield        #46  <Field int Format.height>
	//   48  113:invokestatic    #120 <Method Point getMaxVideoSizeInViewport(boolean, int, int, int, int)>
	//   49  116:astore          14
					int j1 = format.width * format.height;
	//   50  118:aload           13
	//   51  120:getfield        #43  <Field int Format.width>
	//   52  123:aload           13
	//   53  125:getfield        #46  <Field int Format.height>
	//   54  128:imul            
	//   55  129:istore          10
					i1 = k;
	//   56  131:iload           7
	//   57  133:istore          9
					if(format.width >= (int)((float)point.x * 0.98F))
	//*  58  135:aload           13
	//*  59  137:getfield        #43  <Field int Format.width>
	//*  60  140:aload           14
	//*  61  142:getfield        #123 <Field int Point.x>
	//*  62  145:i2f             
	//*  63  146:ldc1            #7   <Float 0.98F>
	//*  64  148:fmul            
	//*  65  149:f2i             
	//*  66  150:icmplt          204
					{
						i1 = k;
	//   67  153:iload           7
	//   68  155:istore          9
						if(format.height >= (int)((float)point.y * 0.98F))
	//*  69  157:aload           13
	//*  70  159:getfield        #46  <Field int Format.height>
	//*  71  162:aload           14
	//*  72  164:getfield        #126 <Field int Point.y>
	//*  73  167:i2f             
	//*  74  168:ldc1            #7   <Float 0.98F>
	//*  75  170:fmul            
	//*  76  171:f2i             
	//*  77  172:icmplt          204
						{
							i1 = k;
	//   78  175:iload           7
	//   79  177:istore          9
							if(j1 < k)
	//*  80  179:iload           10
	//*  81  181:iload           7
	//*  82  183:icmpge          204
								i1 = j1;
	//   83  186:iload           10
	//   84  188:istore          9
						}
					}
				} else
	//*  85  190:goto            204
				{
					i1 = k;
	//   86  193:iload           7
	//   87  195:istore          9
				}
			} else
	//*  88  197:goto            204
			{
				i1 = k;
	//   89  200:iload           7
	//   90  202:istore          9
			}
			l++;
	//   91  204:iload           8
	//   92  206:iconst_1        
	//   93  207:iadd            
	//   94  208:istore          8
		}

	//   95  210:iload           9
	//   96  212:istore          7
	//*  97  214:goto            24
		if(k != 0x7fffffff)
	//*  98  217:iload           7
	//*  99  219:ldc1            #97  <Int 0x7fffffff>
	//* 100  221:icmpeq          311
			for(i = arraylist.size() - 1; i >= 0; i--)
	//* 101  224:aload           12
	//* 102  226:invokevirtual   #127 <Method int ArrayList.size()>
	//* 103  229:iconst_1        
	//* 104  230:isub            
	//* 105  231:istore          5
	//* 106  233:iload           5
	//* 107  235:iflt            311
			{
				as = ((String []) (((FormatWrapper)list.get(((Integer)arraylist.get(i)).intValue())).getFormat()));
	//  108  238:aload_0         
	//  109  239:aload           12
	//  110  241:iload           5
	//  111  243:invokevirtual   #128 <Method Object ArrayList.get(int)>
	//  112  246:checkcast       #111 <Class Integer>
	//  113  249:invokevirtual   #131 <Method int Integer.intValue()>
	//  114  252:invokeinterface #101 <Method Object List.get(int)>
	//  115  257:checkcast       #103 <Class FormatWrapper>
	//  116  260:invokeinterface #107 <Method Format FormatWrapper.getFormat()>
	//  117  265:astore_1        
				if(((Format) (as)).width > 0 && ((Format) (as)).height > 0 && ((Format) (as)).width * ((Format) (as)).height > k)
	//* 118  266:aload_1         
	//* 119  267:getfield        #43  <Field int Format.width>
	//* 120  270:ifle            302
	//* 121  273:aload_1         
	//* 122  274:getfield        #46  <Field int Format.height>
	//* 123  277:ifle            302
	//* 124  280:aload_1         
	//* 125  281:getfield        #43  <Field int Format.width>
	//* 126  284:aload_1         
	//* 127  285:getfield        #46  <Field int Format.height>
	//* 128  288:imul            
	//* 129  289:iload           7
	//* 130  291:icmple          302
					arraylist.remove(i);
	//  131  294:aload           12
	//  132  296:iload           5
	//  133  298:invokevirtual   #134 <Method Object ArrayList.remove(int)>
	//  134  301:pop             
			}

	//  135  302:iload           5
	//  136  304:iconst_1        
	//  137  305:isub            
	//  138  306:istore          5
	//* 139  308:goto            233
		return Util.toArray(((List) (arraylist)));
	//  140  311:aload           12
	//  141  313:invokestatic    #138 <Method int[] Util.toArray(List)>
	//  142  316:areturn         
	}

	public static int[] selectVideoFormatsForDefaultDisplay(Context context, List list, String as[], boolean flag)
		throws com.google.android.exoplayer.MediaCodecUtil.DecoderQueryException
	{
		context = ((Context) (Util.getPhysicalDisplaySize(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #146 <Method Point Util.getPhysicalDisplaySize(Context)>
	//    2    4:astore_0        
		return selectVideoFormats(list, as, flag, true, false, ((Point) (context)).x, ((Point) (context)).y);
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iconst_1        
	//    7    9:iconst_0        
	//    8   10:aload_0         
	//    9   11:getfield        #123 <Field int Point.x>
	//   10   14:aload_0         
	//   11   15:getfield        #126 <Field int Point.y>
	//   12   18:invokestatic    #148 <Method int[] selectVideoFormats(List, String[], boolean, boolean, boolean, int, int)>
	//   13   21:areturn         
	}

	private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98F;
}
