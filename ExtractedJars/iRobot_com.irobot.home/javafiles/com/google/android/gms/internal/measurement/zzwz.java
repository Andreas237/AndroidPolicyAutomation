// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxa, zzxb, zzte

final class zzwz
{

	static String zzd(zzte zzte)
	{
		zzxa zzxa1 = new zzxa(zzte);
	//    0    0:new             #8   <Class zzxa>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #12  <Method void zzxa(zzte)>
	//    4    8:astore_3        
		StringBuilder stringbuilder = new StringBuilder(((zzxb) (zzxa1)).size());
	//    5    9:new             #14  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:invokeinterface #20  <Method int zzxb.size()>
	//    9   19:invokespecial   #23  <Method void StringBuilder(int)>
	//   10   22:astore          4
		for(int i = 0; i < ((zzxb) (zzxa1)).size(); i++)
	//*  11   24:iconst_0        
	//*  12   25:istore_1        
	//*  13   26:iload_1         
	//*  14   27:aload_3         
	//*  15   28:invokeinterface #20  <Method int zzxb.size()>
	//*  16   33:icmpge          252
		{
			int j = ((int) (((zzxb) (zzxa1)).zzam(i)));
	//   17   36:aload_3         
	//   18   37:iload_1         
	//   19   38:invokeinterface #27  <Method byte zzxb.zzam(int)>
	//   20   43:istore_2        
			if(j != 34)
	//*  21   44:iload_2         
	//*  22   45:bipush          34
	//*  23   47:icmpeq          239
			{
				if(j != 39)
	//*  24   50:iload_2         
	//*  25   51:bipush          39
	//*  26   53:icmpeq          233
				{
					if(j != 92)
	//*  27   56:iload_2         
	//*  28   57:bipush          92
	//*  29   59:icmpeq          227
						switch(j)
	//*  30   62:iload_2         
						{
	//*  31   63:tableswitch     7 13: default 104
	//	               7 214
	//	               8 208
	//	               9 202
	//	               10 196
	//	               11 190
	//	               12 184
	//	               13 178
						default:
							if(j < 32 || j > 126)
	//*  32  104:iload_2         
	//*  33  105:bipush          32
	//*  34  107:icmplt          119
	//*  35  110:iload_2         
	//*  36  111:bipush          126
	//*  37  113:icmpgt          119
	//*  38  116:goto            167
							{
								stringbuilder.append('\\');
	//   39  119:aload           4
	//   40  121:bipush          92
	//   41  123:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   42  126:pop             
								stringbuilder.append((char)((j >>> 6 & 3) + 48));
	//   43  127:aload           4
	//   44  129:iload_2         
	//   45  130:bipush          6
	//   46  132:iushr           
	//   47  133:iconst_3        
	//   48  134:iand            
	//   49  135:bipush          48
	//   50  137:iadd            
	//   51  138:int2char        
	//   52  139:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   53  142:pop             
								stringbuilder.append((char)((j >>> 3 & 7) + 48));
	//   54  143:aload           4
	//   55  145:iload_2         
	//   56  146:iconst_3        
	//   57  147:iushr           
	//   58  148:bipush          7
	//   59  150:iand            
	//   60  151:bipush          48
	//   61  153:iadd            
	//   62  154:int2char        
	//   63  155:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   64  158:pop             
								j = (j & 7) + 48;
	//   65  159:iload_2         
	//   66  160:bipush          7
	//   67  162:iand            
	//   68  163:bipush          48
	//   69  165:iadd            
	//   70  166:istore_2        
							}
							stringbuilder.append((char)j);
	//   71  167:aload           4
	//   72  169:iload_2         
	//   73  170:int2char        
	//   74  171:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   75  174:pop             
							continue;
	//   76  175:goto            245

						case 13: // '\r'
							zzte = "\\r";
	//   77  178:ldc1            #33  <String "\\r">
	//   78  180:astore_0        
							break;

	//*  79  181:goto            217
						case 12: // '\f'
							zzte = "\\f";
	//   80  184:ldc1            #35  <String "\\f">
	//   81  186:astore_0        
							break;

	//*  82  187:goto            217
						case 11: // '\013'
							zzte = "\\v";
	//   83  190:ldc1            #37  <String "\\v">
	//   84  192:astore_0        
							break;

	//*  85  193:goto            217
						case 10: // '\n'
							zzte = "\\n";
	//   86  196:ldc1            #39  <String "\\n">
	//   87  198:astore_0        
							break;

	//*  88  199:goto            217
						case 9: // '\t'
							zzte = "\\t";
	//   89  202:ldc1            #41  <String "\\t">
	//   90  204:astore_0        
							break;

	//*  91  205:goto            217
						case 8: // '\b'
							zzte = "\\b";
	//   92  208:ldc1            #43  <String "\\b">
	//   93  210:astore_0        
							break;

	//*  94  211:goto            217
						case 7: // '\007'
							zzte = "\\a";
	//   95  214:ldc1            #45  <String "\\a">
	//   96  216:astore_0        
							break;
						}
					else
	//*  97  217:aload           4
	//*  98  219:aload_0         
	//*  99  220:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//* 100  223:pop             
	//* 101  224:goto            245
						zzte = "\\\\";
	//  102  227:ldc1            #50  <String "\\\\">
	//  103  229:astore_0        
				} else
	//* 104  230:goto            217
				{
					zzte = "\\'";
	//  105  233:ldc1            #52  <String "\\'">
	//  106  235:astore_0        
				}
			} else
	//* 107  236:goto            217
			{
				zzte = "\\\"";
	//  108  239:ldc1            #54  <String "\\\"">
	//  109  241:astore_0        
			}
			stringbuilder.append(((String) (zzte)));
		}

	//  110  242:goto            217
	//  111  245:iload_1         
	//  112  246:iconst_1        
	//  113  247:iadd            
	//  114  248:istore_1        
	//* 115  249:goto            26
		return stringbuilder.toString();
	//  116  252:aload           4
	//  117  254:invokevirtual   #58  <Method String StringBuilder.toString()>
	//  118  257:areturn         
	}
}
