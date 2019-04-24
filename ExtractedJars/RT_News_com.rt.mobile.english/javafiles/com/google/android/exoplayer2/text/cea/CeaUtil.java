// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import android.util.Log;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

public final class CeaUtil
{

	private CeaUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}

	public static void consume(long l, ParsableByteArray parsablebytearray, TrackOutput atrackoutput[])
	{
		int i;
label0:
		for(; parsablebytearray.bytesLeft() > 1; parsablebytearray.setPosition(i))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #49  <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:iconst_1        
	//*   3    5:icmple          324
		{
			int j = readNon255TerminatedValue(parsablebytearray);
	//    4    8:aload_2         
	//    5    9:invokestatic    #53  <Method int readNon255TerminatedValue(ParsableByteArray)>
	//    6   12:istore          5
			int k = readNon255TerminatedValue(parsablebytearray);
	//    7   14:aload_2         
	//    8   15:invokestatic    #53  <Method int readNon255TerminatedValue(ParsableByteArray)>
	//    9   18:istore          6
			int i1 = parsablebytearray.getPosition() + k;
	//   10   20:aload_2         
	//   11   21:invokevirtual   #56  <Method int ParsableByteArray.getPosition()>
	//   12   24:iload           6
	//   13   26:iadd            
	//   14   27:istore          7
			if(k != -1 && k <= parsablebytearray.bytesLeft())
	//*  15   29:iload           6
	//*  16   31:iconst_m1       
	//*  17   32:icmpeq          301
	//*  18   35:iload           6
	//*  19   37:aload_2         
	//*  20   38:invokevirtual   #49  <Method int ParsableByteArray.bytesLeft()>
	//*  21   41:icmple          47
	//*  22   44:goto            301
			{
				i = i1;
	//   23   47:iload           7
	//   24   49:istore          4
				if(j != 4)
					continue;
	//   25   51:iload           5
	//   26   53:iconst_4        
	//   27   54:icmpne          315
				i = i1;
	//   28   57:iload           7
	//   29   59:istore          4
				if(k < 8)
					continue;
	//   30   61:iload           6
	//   31   63:bipush          8
	//   32   65:icmplt          315
				i = parsablebytearray.readUnsignedByte();
	//   33   68:aload_2         
	//   34   69:invokevirtual   #59  <Method int ParsableByteArray.readUnsignedByte()>
	//   35   72:istore          4
				int j1 = parsablebytearray.readUnsignedShort();
	//   36   74:aload_2         
	//   37   75:invokevirtual   #62  <Method int ParsableByteArray.readUnsignedShort()>
	//   38   78:istore          9
				boolean flag = false;
	//   39   80:iconst_0        
	//   40   81:istore          8
				if(j1 == 49)
	//*  41   83:iload           9
	//*  42   85:bipush          49
	//*  43   87:icmpne          99
					j = parsablebytearray.readInt();
	//   44   90:aload_2         
	//   45   91:invokevirtual   #65  <Method int ParsableByteArray.readInt()>
	//   46   94:istore          5
				else
	//*  47   96:goto            102
					j = 0;
	//   48   99:iconst_0        
	//   49  100:istore          5
				k = parsablebytearray.readUnsignedByte();
	//   50  102:aload_2         
	//   51  103:invokevirtual   #59  <Method int ParsableByteArray.readUnsignedByte()>
	//   52  106:istore          6
				if(j1 == 47)
	//*  53  108:iload           9
	//*  54  110:bipush          47
	//*  55  112:icmpne          120
					parsablebytearray.skipBytes(1);
	//   56  115:aload_2         
	//   57  116:iconst_1        
	//   58  117:invokevirtual   #69  <Method void ParsableByteArray.skipBytes(int)>
				if(i == 181 && (j1 == 49 || j1 == 47) && k == 3)
	//*  59  120:iload           4
	//*  60  122:sipush          181
	//*  61  125:icmpne          154
	//*  62  128:iload           9
	//*  63  130:bipush          49
	//*  64  132:icmpeq          142
	//*  65  135:iload           9
	//*  66  137:bipush          47
	//*  67  139:icmpne          154
	//*  68  142:iload           6
	//*  69  144:iconst_3        
	//*  70  145:icmpne          154
					i = 1;
	//   71  148:iconst_1        
	//   72  149:istore          4
				else
	//*  73  151:goto            157
					i = 0;
	//   74  154:iconst_0        
	//   75  155:istore          4
				k = i;
	//   76  157:iload           4
	//   77  159:istore          6
				if(j1 == 49)
	//*  78  161:iload           9
	//*  79  163:bipush          49
	//*  80  165:icmpne          203
				{
					if(j != USER_ID_GA94 && j != USER_ID_DTG1)
	//*  81  168:iload           5
	//*  82  170:getstatic       #33  <Field int USER_ID_GA94>
	//*  83  173:icmpeq          193
	//*  84  176:iload           5
	//*  85  178:getstatic       #37  <Field int USER_ID_DTG1>
	//*  86  181:icmpne          187
	//*  87  184:goto            193
						j = 0;
	//   88  187:iconst_0        
	//   89  188:istore          5
					else
	//*  90  190:goto            196
						j = 1;
	//   91  193:iconst_1        
	//   92  194:istore          5
					k = i & j;
	//   93  196:iload           4
	//   94  198:iload           5
	//   95  200:iand            
	//   96  201:istore          6
				}
				i = i1;
	//   97  203:iload           7
	//   98  205:istore          4
				if(k == 0)
					continue;
	//   99  207:iload           6
	//  100  209:ifeq            315
				i = parsablebytearray.readUnsignedByte();
	//  101  212:aload_2         
	//  102  213:invokevirtual   #59  <Method int ParsableByteArray.readUnsignedByte()>
	//  103  216:istore          4
				parsablebytearray.skipBytes(1);
	//  104  218:aload_2         
	//  105  219:iconst_1        
	//  106  220:invokevirtual   #69  <Method void ParsableByteArray.skipBytes(int)>
				k = (i & 0x1f) * 3;
	//  107  223:iload           4
	//  108  225:bipush          31
	//  109  227:iand            
	//  110  228:iconst_3        
	//  111  229:imul            
	//  112  230:istore          6
				j1 = parsablebytearray.getPosition();
	//  113  232:aload_2         
	//  114  233:invokevirtual   #56  <Method int ParsableByteArray.getPosition()>
	//  115  236:istore          9
				int k1 = atrackoutput.length;
	//  116  238:aload_3         
	//  117  239:arraylength     
	//  118  240:istore          10
				j = ((int) (flag));
	//  119  242:iload           8
	//  120  244:istore          5
				do
				{
					i = i1;
	//  121  246:iload           7
	//  122  248:istore          4
					if(j >= k1)
						continue label0;
	//  123  250:iload           5
	//  124  252:iload           10
	//  125  254:icmpge          315
					TrackOutput trackoutput = atrackoutput[j];
	//  126  257:aload_3         
	//  127  258:iload           5
	//  128  260:aaload          
	//  129  261:astore          11
					parsablebytearray.setPosition(j1);
	//  130  263:aload_2         
	//  131  264:iload           9
	//  132  266:invokevirtual   #72  <Method void ParsableByteArray.setPosition(int)>
					trackoutput.sampleData(parsablebytearray, k);
	//  133  269:aload           11
	//  134  271:aload_2         
	//  135  272:iload           6
	//  136  274:invokeinterface #78  <Method void TrackOutput.sampleData(ParsableByteArray, int)>
					trackoutput.sampleMetadata(l, 1, k, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//  137  279:aload           11
	//  138  281:lload_0         
	//  139  282:iconst_1        
	//  140  283:iload           6
	//  141  285:iconst_0        
	//  142  286:aconst_null     
	//  143  287:invokeinterface #82  <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
					j++;
	//  144  292:iload           5
	//  145  294:iconst_1        
	//  146  295:iadd            
	//  147  296:istore          5
				} while(true);
	//  148  298:goto            246
			}
			Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
	//  149  301:ldc1            #17  <String "CeaUtil">
	//  150  303:ldc1            #84  <String "Skipping remainder of malformed SEI NAL unit.">
	//  151  305:invokestatic    #90  <Method int Log.w(String, String)>
	//  152  308:pop             
			i = parsablebytearray.limit();
	//  153  309:aload_2         
	//  154  310:invokevirtual   #93  <Method int ParsableByteArray.limit()>
	//  155  313:istore          4
		}

	//  156  315:aload_2         
	//  157  316:iload           4
	//  158  318:invokevirtual   #72  <Method void ParsableByteArray.setPosition(int)>
	//* 159  321:goto            0
	//  160  324:return          
	}

	private static int readNon255TerminatedValue(ParsableByteArray parsablebytearray)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j;
		int k;
		do
		{
			if(parsablebytearray.bytesLeft() == 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #49  <Method int ParsableByteArray.bytesLeft()>
	//*   4    6:ifne            11
				return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
			k = parsablebytearray.readUnsignedByte();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #59  <Method int ParsableByteArray.readUnsignedByte()>
	//    9   15:istore_3        
			j = i + k;
	//   10   16:iload_1         
	//   11   17:iload_3         
	//   12   18:iadd            
	//   13   19:istore_2        
			i = j;
	//   14   20:iload_2         
	//   15   21:istore_1        
		} while(k == 255);
	//   16   22:iload_3         
	//   17   23:sipush          255
	//   18   26:icmpeq          2
		return j;
	//   19   29:iload_2         
	//   20   30:ireturn         
	}

	private static final int COUNTRY_CODE = 181;
	private static final int PAYLOAD_TYPE_CC = 4;
	private static final int PROVIDER_CODE_ATSC = 49;
	private static final int PROVIDER_CODE_DIRECTV = 47;
	private static final String TAG = "CeaUtil";
	private static final int USER_DATA_TYPE_CODE = 3;
	private static final int USER_ID_DTG1 = Util.getIntegerCodeForString("DTG1");
	private static final int USER_ID_GA94 = Util.getIntegerCodeForString("GA94");

	static 
	{
	//    0    0:ldc1            #25  <String "GA94">
	//    1    2:invokestatic    #31  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #33  <Field int USER_ID_GA94>
	//    3    8:ldc1            #35  <String "DTG1">
	//    4   10:invokestatic    #31  <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #37  <Field int USER_ID_DTG1>
	//*   6   16:return          
	}
}
