// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.util:
//			ParsableBitArray, Assertions

public final class CodecSpecificDataUtil
{

	private CodecSpecificDataUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] buildAacAudioSpecificConfig(int i, int j)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          4
		int l = -1;
	//    2    3:iconst_m1       
	//    3    4:istore_3        
		int k = 0;
	//    4    5:iconst_0        
	//    5    6:istore_2        
		do
		{
			int ai[] = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
	//    6    7:getstatic       #35  <Field int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE>
	//    7   10:astore          5
			if(k >= ai.length)
				break;
	//    8   12:iload_2         
	//    9   13:aload           5
	//   10   15:arraylength     
	//   11   16:icmpge          36
			if(i == ai[k])
	//*  12   19:iload_0         
	//*  13   20:aload           5
	//*  14   22:iload_2         
	//*  15   23:iaload          
	//*  16   24:icmpne          29
				l = k;
	//   17   27:iload_2         
	//   18   28:istore_3        
			k++;
	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_2        
		} while(true);
	//   23   33:goto            7
		i = 0;
	//   24   36:iconst_0        
	//   25   37:istore_0        
		k = ((int) (byte0));
	//   26   38:iload           4
	//   27   40:istore_2        
		do
		{
			int ai1[] = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE;
	//   28   41:getstatic       #37  <Field int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE>
	//   29   44:astore          5
			if(i < ai1.length)
	//*  30   46:iload_0         
	//*  31   47:aload           5
	//*  32   49:arraylength     
	//*  33   50:icmpge          70
			{
				if(j == ai1[i])
	//*  34   53:iload_1         
	//*  35   54:aload           5
	//*  36   56:iload_0         
	//*  37   57:iaload          
	//*  38   58:icmpne          63
					k = i;
	//   39   61:iload_0         
	//   40   62:istore_2        
				i++;
	//   41   63:iload_0         
	//   42   64:iconst_1        
	//   43   65:iadd            
	//   44   66:istore_0        
			} else
	//*  45   67:goto            41
			{
				return (new byte[] {
					(byte)(l >> 1 | 0x10), (byte)(k << 3 | (l & 1) << 7)
				});
	//   46   70:iconst_2        
	//   47   71:newarray        byte[]
	//   48   73:dup             
	//   49   74:iconst_0        
	//   50   75:iload_3         
	//   51   76:iconst_1        
	//   52   77:ishr            
	//   53   78:bipush          16
	//   54   80:ior             
	//   55   81:int2byte        
	//   56   82:bastore         
	//   57   83:dup             
	//   58   84:iconst_1        
	//   59   85:iload_2         
	//   60   86:iconst_3        
	//   61   87:ishl            
	//   62   88:iload_3         
	//   63   89:iconst_1        
	//   64   90:iand            
	//   65   91:bipush          7
	//   66   93:ishl            
	//   67   94:ior             
	//   68   95:int2byte        
	//   69   96:bastore         
	//   70   97:areturn         
			}
		} while(true);
	}

	public static byte[] buildAacAudioSpecificConfig(int i, int j, int k)
	{
		return (new byte[] {
			(byte)(i << 3 & 0xf8 | j >> 1 & 7), (byte)(j << 7 & 0x80 | k << 3 & 0x78)
		});
	//    0    0:iconst_2        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iload_0         
	//    5    6:iconst_3        
	//    6    7:ishl            
	//    7    8:sipush          248
	//    8   11:iand            
	//    9   12:iload_1         
	//   10   13:iconst_1        
	//   11   14:ishr            
	//   12   15:bipush          7
	//   13   17:iand            
	//   14   18:ior             
	//   15   19:int2byte        
	//   16   20:bastore         
	//   17   21:dup             
	//   18   22:iconst_1        
	//   19   23:iload_1         
	//   20   24:bipush          7
	//   21   26:ishl            
	//   22   27:sipush          128
	//   23   30:iand            
	//   24   31:iload_2         
	//   25   32:iconst_3        
	//   26   33:ishl            
	//   27   34:bipush          120
	//   28   36:iand            
	//   29   37:ior             
	//   30   38:int2byte        
	//   31   39:bastore         
	//   32   40:areturn         
	}

	public static byte[] buildNalUnit(byte abyte0[], int i, int j)
	{
		byte abyte1[] = NAL_START_CODE;
	//    0    0:getstatic       #28  <Field byte[] NAL_START_CODE>
	//    1    3:astore_3        
		byte abyte2[] = new byte[abyte1.length + j];
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:iload_2         
	//    5    7:iadd            
	//    6    8:newarray        byte[]
	//    7   10:astore          4
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte2)), 0, abyte1.length);
	//    8   12:aload_3         
	//    9   13:iconst_0        
	//   10   14:aload           4
	//   11   16:iconst_0        
	//   12   17:aload_3         
	//   13   18:arraylength     
	//   14   19:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte2)), NAL_START_CODE.length, j);
	//   15   22:aload_0         
	//   16   23:iload_1         
	//   17   24:aload           4
	//   18   26:getstatic       #28  <Field byte[] NAL_START_CODE>
	//   19   29:arraylength     
	//   20   30:iload_2         
	//   21   31:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte2;
	//   22   34:aload           4
	//   23   36:areturn         
	}

	private static int findNalStartCode(byte abyte0[], int i)
	{
		int j = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		for(int k = NAL_START_CODE.length; i <= j - k; i++)
	//*   3    3:getstatic       #28  <Field byte[] NAL_START_CODE>
	//*   4    6:arraylength     
	//*   5    7:istore_3        
	//*   6    8:iload_1         
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:isub            
	//*  10   12:icmpgt          32
			if(isNalStartCode(abyte0, i))
	//*  11   15:aload_0         
	//*  12   16:iload_1         
	//*  13   17:invokestatic    #58  <Method boolean isNalStartCode(byte[], int)>
	//*  14   20:ifeq            25
				return i;
	//   15   23:iload_1         
	//   16   24:ireturn         

	//   17   25:iload_1         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_1        
	//*  21   29:goto            8
		return -1;
	//   22   32:iconst_m1       
	//   23   33:ireturn         
	}

	private static boolean isNalStartCode(byte abyte0[], int i)
	{
		if(abyte0.length - i <= NAL_START_CODE.length)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:iload_1         
	//*   3    3:isub            
	//*   4    4:getstatic       #28  <Field byte[] NAL_START_CODE>
	//*   5    7:arraylength     
	//*   6    8:icmpgt          13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		int j = 0;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		do
		{
			byte abyte1[] = NAL_START_CODE;
	//   11   15:getstatic       #28  <Field byte[] NAL_START_CODE>
	//   12   18:astore_3        
			if(j < abyte1.length)
	//*  13   19:iload_2         
	//*  14   20:aload_3         
	//*  15   21:arraylength     
	//*  16   22:icmpge          45
			{
				if(abyte0[i + j] != abyte1[j])
	//*  17   25:aload_0         
	//*  18   26:iload_1         
	//*  19   27:iload_2         
	//*  20   28:iadd            
	//*  21   29:baload          
	//*  22   30:aload_3         
	//*  23   31:iload_2         
	//*  24   32:baload          
	//*  25   33:icmpeq          38
					return false;
	//   26   36:iconst_0        
	//   27   37:ireturn         
				j++;
	//   28   38:iload_2         
	//   29   39:iconst_1        
	//   30   40:iadd            
	//   31   41:istore_2        
			} else
	//*  32   42:goto            15
			{
				return true;
	//   33   45:iconst_1        
	//   34   46:ireturn         
			}
		} while(true);
	}

	public static Pair parseAacAudioSpecificConfig(byte abyte0[])
	{
		int k;
		int l;
		boolean flag3;
label0:
		{
			abyte0 = ((byte []) (new ParsableBitArray(abyte0)));
	//    0    0:new             #62  <Class ParsableBitArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #65  <Method void ParsableBitArray(byte[])>
	//    4    8:astore_0        
			int j1 = ((ParsableBitArray) (abyte0)).readBits(5);
	//    5    9:aload_0         
	//    6   10:iconst_5        
	//    7   11:invokevirtual   #69  <Method int ParsableBitArray.readBits(int)>
	//    8   14:istore          5
			int i = ((ParsableBitArray) (abyte0)).readBits(4);
	//    9   16:aload_0         
	//   10   17:iconst_4        
	//   11   18:invokevirtual   #69  <Method int ParsableBitArray.readBits(int)>
	//   12   21:istore_1        
			flag3 = true;
	//   13   22:iconst_1        
	//   14   23:istore          7
			if(i == 15)
	//*  15   25:iload_1         
	//*  16   26:bipush          15
	//*  17   28:icmpne          41
			{
				i = ((ParsableBitArray) (abyte0)).readBits(24);
	//   18   31:aload_0         
	//   19   32:bipush          24
	//   20   34:invokevirtual   #69  <Method int ParsableBitArray.readBits(int)>
	//   21   37:istore_1        
			} else
	//*  22   38:goto            67
			{
				boolean flag;
				if(i < 13)
	//*  23   41:iload_1         
	//*  24   42:bipush          13
	//*  25   44:icmpge          53
					flag = true;
	//   26   47:iconst_1        
	//   27   48:istore          6
				else
	//*  28   50:goto            56
					flag = false;
	//   29   53:iconst_0        
	//   30   54:istore          6
				Assertions.checkArgument(flag);
	//   31   56:iload           6
	//   32   58:invokestatic    #75  <Method void Assertions.checkArgument(boolean)>
				i = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[i];
	//   33   61:getstatic       #35  <Field int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE>
	//   34   64:iload_1         
	//   35   65:iaload          
	//   36   66:istore_1        
			}
			int i1 = ((ParsableBitArray) (abyte0)).readBits(4);
	//   37   67:aload_0         
	//   38   68:iconst_4        
	//   39   69:invokevirtual   #69  <Method int ParsableBitArray.readBits(int)>
	//   40   72:istore          4
			if(j1 != 5)
	//*  41   74:iload           5
	//*  42   76:iconst_5        
	//*  43   77:icmpeq          92
			{
				k = i;
	//   44   80:iload_1         
	//   45   81:istore_2        
				l = i1;
	//   46   82:iload           4
	//   47   84:istore_3        
				if(j1 != 29)
					break label0;
	//   48   85:iload           5
	//   49   87:bipush          29
	//   50   89:icmpne          163
			}
			i = ((ParsableBitArray) (abyte0)).readBits(4);
	//   51   92:aload_0         
	//   52   93:iconst_4        
	//   53   94:invokevirtual   #69  <Method int ParsableBitArray.readBits(int)>
	//   54   97:istore_1        
			if(i == 15)
	//*  55   98:iload_1         
	//*  56   99:bipush          15
	//*  57  101:icmpne          114
			{
				i = ((ParsableBitArray) (abyte0)).readBits(24);
	//   58  104:aload_0         
	//   59  105:bipush          24
	//   60  107:invokevirtual   #69  <Method int ParsableBitArray.readBits(int)>
	//   61  110:istore_1        
			} else
	//*  62  111:goto            140
			{
				boolean flag1;
				if(i < 13)
	//*  63  114:iload_1         
	//*  64  115:bipush          13
	//*  65  117:icmpge          126
					flag1 = true;
	//   66  120:iconst_1        
	//   67  121:istore          6
				else
	//*  68  123:goto            129
					flag1 = false;
	//   69  126:iconst_0        
	//   70  127:istore          6
				Assertions.checkArgument(flag1);
	//   71  129:iload           6
	//   72  131:invokestatic    #75  <Method void Assertions.checkArgument(boolean)>
				i = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[i];
	//   73  134:getstatic       #35  <Field int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE>
	//   74  137:iload_1         
	//   75  138:iaload          
	//   76  139:istore_1        
			}
			k = i;
	//   77  140:iload_1         
	//   78  141:istore_2        
			l = i1;
	//   79  142:iload           4
	//   80  144:istore_3        
			if(((ParsableBitArray) (abyte0)).readBits(5) == 22)
	//*  81  145:aload_0         
	//*  82  146:iconst_5        
	//*  83  147:invokevirtual   #69  <Method int ParsableBitArray.readBits(int)>
	//*  84  150:bipush          22
	//*  85  152:icmpne          163
			{
				l = ((ParsableBitArray) (abyte0)).readBits(4);
	//   86  155:aload_0         
	//   87  156:iconst_4        
	//   88  157:invokevirtual   #69  <Method int ParsableBitArray.readBits(int)>
	//   89  160:istore_3        
				k = i;
	//   90  161:iload_1         
	//   91  162:istore_2        
			}
		}
		int j = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[l];
	//   92  163:getstatic       #37  <Field int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE>
	//   93  166:iload_3         
	//   94  167:iaload          
	//   95  168:istore_1        
		boolean flag2;
		if(j != -1)
	//*  96  169:iload_1         
	//*  97  170:iconst_m1       
	//*  98  171:icmpeq          181
			flag2 = flag3;
	//   99  174:iload           7
	//  100  176:istore          6
		else
	//* 101  178:goto            184
			flag2 = false;
	//  102  181:iconst_0        
	//  103  182:istore          6
		Assertions.checkArgument(flag2);
	//  104  184:iload           6
	//  105  186:invokestatic    #75  <Method void Assertions.checkArgument(boolean)>
		return Pair.create(((Object) (Integer.valueOf(k))), ((Object) (Integer.valueOf(j))));
	//  106  189:iload_2         
	//  107  190:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  108  193:iload_1         
	//  109  194:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  110  197:invokestatic    #87  <Method Pair Pair.create(Object, Object)>
	//  111  200:areturn         
	}

	public static byte[][] splitNalUnits(byte abyte0[])
	{
		if(!isNalStartCode(abyte0, 0))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokestatic    #58  <Method boolean isNalStartCode(byte[], int)>
	//*   3    5:ifne            13
			return (byte[][])null;
	//    4    8:aconst_null     
	//    5    9:checkcast       #93  <Class byte[][]>
	//    6   12:areturn         
		ArrayList arraylist = new ArrayList();
	//    7   13:new             #95  <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #96  <Method void ArrayList()>
	//   10   20:astore          4
		int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		int k;
		do
		{
			((List) (arraylist)).add(((Object) (Integer.valueOf(i))));
	//   13   24:aload           4
	//   14   26:iload_1         
	//   15   27:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   16   30:invokeinterface #102 <Method boolean List.add(Object)>
	//   17   35:pop             
			k = findNalStartCode(abyte0, i + NAL_START_CODE.length);
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:getstatic       #28  <Field byte[] NAL_START_CODE>
	//   21   41:arraylength     
	//   22   42:iadd            
	//   23   43:invokestatic    #104 <Method int findNalStartCode(byte[], int)>
	//   24   46:istore_2        
			i = k;
	//   25   47:iload_2         
	//   26   48:istore_1        
		} while(k != -1);
	//   27   49:iload_2         
	//   28   50:iconst_m1       
	//   29   51:icmpne          24
		byte abyte1[][] = new byte[((List) (arraylist)).size()][];
	//   30   54:aload           4
	//   31   56:invokeinterface #108 <Method int List.size()>
	//   32   61:anewarray       byte[][]
	//   33   64:astore          5
		for(int j = 0; j < ((List) (arraylist)).size(); j++)
	//*  34   66:iconst_0        
	//*  35   67:istore_1        
	//*  36   68:iload_1         
	//*  37   69:aload           4
	//*  38   71:invokeinterface #108 <Method int List.size()>
	//*  39   76:icmpge          161
		{
			int i1 = ((Integer)((List) (arraylist)).get(j)).intValue();
	//   40   79:aload           4
	//   41   81:iload_1         
	//   42   82:invokeinterface #113 <Method Object List.get(int)>
	//   43   87:checkcast       #77  <Class Integer>
	//   44   90:invokevirtual   #116 <Method int Integer.intValue()>
	//   45   93:istore_3        
			int l;
			if(j < ((List) (arraylist)).size() - 1)
	//*  46   94:iload_1         
	//*  47   95:aload           4
	//*  48   97:invokeinterface #108 <Method int List.size()>
	//*  49  102:iconst_1        
	//*  50  103:isub            
	//*  51  104:icmpge          127
				l = ((Integer)((List) (arraylist)).get(j + 1)).intValue();
	//   52  107:aload           4
	//   53  109:iload_1         
	//   54  110:iconst_1        
	//   55  111:iadd            
	//   56  112:invokeinterface #113 <Method Object List.get(int)>
	//   57  117:checkcast       #77  <Class Integer>
	//   58  120:invokevirtual   #116 <Method int Integer.intValue()>
	//   59  123:istore_2        
			else
	//*  60  124:goto            130
				l = abyte0.length;
	//   61  127:aload_0         
	//   62  128:arraylength     
	//   63  129:istore_2        
			byte abyte2[] = new byte[l - i1];
	//   64  130:iload_2         
	//   65  131:iload_3         
	//   66  132:isub            
	//   67  133:newarray        byte[]
	//   68  135:astore          6
			System.arraycopy(((Object) (abyte0)), i1, ((Object) (abyte2)), 0, abyte2.length);
	//   69  137:aload_0         
	//   70  138:iload_3         
	//   71  139:aload           6
	//   72  141:iconst_0        
	//   73  142:aload           6
	//   74  144:arraylength     
	//   75  145:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
			abyte1[j] = abyte2;
	//   76  148:aload           5
	//   77  150:iload_1         
	//   78  151:aload           6
	//   79  153:aastore         
		}

	//   80  154:iload_1         
	//   81  155:iconst_1        
	//   82  156:iadd            
	//   83  157:istore_1        
	//*  84  158:goto            68
		return abyte1;
	//   85  161:aload           5
	//   86  163:areturn         
	}

	private static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
	private static final int AUDIO_OBJECT_TYPE_ER_BSAC = 22;
	private static final int AUDIO_OBJECT_TYPE_PS = 29;
	private static final int AUDIO_OBJECT_TYPE_SBR = 5;
	private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
	private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[] = {
		0, 1, 2, 3, 4, 5, 6, 8, -1, -1, 
		-1, 7, 8, -1, 8, -1
	};
	private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
	private static final int AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[] = {
		0x17700, 0x15888, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 
		11025, 8000, 7350
	};
	private static final byte NAL_START_CODE[] = {
		0, 0, 0, 1
	};

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #25  <Int 0>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #25  <Int 0>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #25  <Int 0>
	//   13   17:bastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #26  <Int 1>
	//   17   22:bastore         
	//   18   23:putstatic       #28  <Field byte[] NAL_START_CODE>
	//   19   26:bipush          13
	//   20   28:newarray        int[]
	//   21   30:dup             
	//   22   31:iconst_0        
	//   23   32:ldc1            #29  <Int 0x17700>
	//   24   34:iastore         
	//   25   35:dup             
	//   26   36:iconst_1        
	//   27   37:ldc1            #30  <Int 0x15888>
	//   28   39:iastore         
	//   29   40:dup             
	//   30   41:iconst_2        
	//   31   42:ldc1            #31  <Int 64000>
	//   32   44:iastore         
	//   33   45:dup             
	//   34   46:iconst_3        
	//   35   47:ldc1            #32  <Int 48000>
	//   36   49:iastore         
	//   37   50:dup             
	//   38   51:iconst_4        
	//   39   52:ldc1            #33  <Int 44100>
	//   40   54:iastore         
	//   41   55:dup             
	//   42   56:iconst_5        
	//   43   57:sipush          32000
	//   44   60:iastore         
	//   45   61:dup             
	//   46   62:bipush          6
	//   47   64:sipush          24000
	//   48   67:iastore         
	//   49   68:dup             
	//   50   69:bipush          7
	//   51   71:sipush          22050
	//   52   74:iastore         
	//   53   75:dup             
	//   54   76:bipush          8
	//   55   78:sipush          16000
	//   56   81:iastore         
	//   57   82:dup             
	//   58   83:bipush          9
	//   59   85:sipush          12000
	//   60   88:iastore         
	//   61   89:dup             
	//   62   90:bipush          10
	//   63   92:sipush          11025
	//   64   95:iastore         
	//   65   96:dup             
	//   66   97:bipush          11
	//   67   99:sipush          8000
	//   68  102:iastore         
	//   69  103:dup             
	//   70  104:bipush          12
	//   71  106:sipush          7350
	//   72  109:iastore         
	//   73  110:putstatic       #35  <Field int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE>
	//   74  113:bipush          16
	//   75  115:newarray        int[]
	//   76  117:dup             
	//   77  118:iconst_0        
	//   78  119:iconst_0        
	//   79  120:iastore         
	//   80  121:dup             
	//   81  122:iconst_1        
	//   82  123:iconst_1        
	//   83  124:iastore         
	//   84  125:dup             
	//   85  126:iconst_2        
	//   86  127:iconst_2        
	//   87  128:iastore         
	//   88  129:dup             
	//   89  130:iconst_3        
	//   90  131:iconst_3        
	//   91  132:iastore         
	//   92  133:dup             
	//   93  134:iconst_4        
	//   94  135:iconst_4        
	//   95  136:iastore         
	//   96  137:dup             
	//   97  138:iconst_5        
	//   98  139:iconst_5        
	//   99  140:iastore         
	//  100  141:dup             
	//  101  142:bipush          6
	//  102  144:bipush          6
	//  103  146:iastore         
	//  104  147:dup             
	//  105  148:bipush          7
	//  106  150:bipush          8
	//  107  152:iastore         
	//  108  153:dup             
	//  109  154:bipush          8
	//  110  156:iconst_m1       
	//  111  157:iastore         
	//  112  158:dup             
	//  113  159:bipush          9
	//  114  161:iconst_m1       
	//  115  162:iastore         
	//  116  163:dup             
	//  117  164:bipush          10
	//  118  166:iconst_m1       
	//  119  167:iastore         
	//  120  168:dup             
	//  121  169:bipush          11
	//  122  171:bipush          7
	//  123  173:iastore         
	//  124  174:dup             
	//  125  175:bipush          12
	//  126  177:bipush          8
	//  127  179:iastore         
	//  128  180:dup             
	//  129  181:bipush          13
	//  130  183:iconst_m1       
	//  131  184:iastore         
	//  132  185:dup             
	//  133  186:bipush          14
	//  134  188:bipush          8
	//  135  190:iastore         
	//  136  191:dup             
	//  137  192:bipush          15
	//  138  194:iconst_m1       
	//  139  195:iastore         
	//  140  196:putstatic       #37  <Field int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE>
	//* 141  199:return          
	}
}
