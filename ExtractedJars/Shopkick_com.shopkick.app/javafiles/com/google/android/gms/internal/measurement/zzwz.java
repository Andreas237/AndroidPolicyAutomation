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
		zzte = ((zzte) (new zzxa(zzte)));
	//    0    0:new             #8   <Class zzxa>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #12  <Method void zzxa(zzte)>
	//    4    8:astore_0        
		StringBuilder stringbuilder = new StringBuilder(((zzxb) (zzte)).size());
	//    5    9:new             #14  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokeinterface #20  <Method int zzxb.size()>
	//    9   19:invokespecial   #23  <Method void StringBuilder(int)>
	//   10   22:astore_3        
		for(int i = 0; i < ((zzxb) (zzte)).size(); i++)
	//*  11   23:iconst_0        
	//*  12   24:istore_1        
	//*  13   25:iload_1         
	//*  14   26:aload_0         
	//*  15   27:invokeinterface #20  <Method int zzxb.size()>
	//*  16   32:icmpge          283
		{
			byte byte0 = ((zzxb) (zzte)).zzam(i);
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:invokeinterface #27  <Method byte zzxb.zzam(int)>
	//   20   42:istore_2        
			if(byte0 != 34)
	//*  21   43:iload_2         
	//*  22   44:bipush          34
	//*  23   46:icmpeq          269
			{
				if(byte0 != 39)
	//*  24   49:iload_2         
	//*  25   50:bipush          39
	//*  26   52:icmpeq          259
				{
					if(byte0 != 92)
	//*  27   55:iload_2         
	//*  28   56:bipush          92
	//*  29   58:icmpeq          249
						switch(byte0)
	//*  30   61:iload_2         
						{
	//*  31   62:tableswitch     7 13: default 104
	//	               7 239
	//	               8 229
	//	               9 219
	//	               10 209
	//	               11 199
	//	               12 189
	//	               13 179
						default:
							if(byte0 >= 32 && byte0 <= 126)
	//*  32  104:iload_2         
	//*  33  105:bipush          32
	//*  34  107:icmplt          126
	//*  35  110:iload_2         
	//*  36  111:bipush          126
	//*  37  113:icmpgt          126
							{
								stringbuilder.append((char)byte0);
	//   38  116:aload_3         
	//   39  117:iload_2         
	//   40  118:int2char        
	//   41  119:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   42  122:pop             
							} else
	//*  43  123:goto            276
							{
								stringbuilder.append('\\');
	//   44  126:aload_3         
	//   45  127:bipush          92
	//   46  129:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   47  132:pop             
								stringbuilder.append((char)((byte0 >>> 6 & 3) + 48));
	//   48  133:aload_3         
	//   49  134:iload_2         
	//   50  135:bipush          6
	//   51  137:iushr           
	//   52  138:iconst_3        
	//   53  139:iand            
	//   54  140:bipush          48
	//   55  142:iadd            
	//   56  143:int2char        
	//   57  144:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   58  147:pop             
								stringbuilder.append((char)((byte0 >>> 3 & 7) + 48));
	//   59  148:aload_3         
	//   60  149:iload_2         
	//   61  150:iconst_3        
	//   62  151:iushr           
	//   63  152:bipush          7
	//   64  154:iand            
	//   65  155:bipush          48
	//   66  157:iadd            
	//   67  158:int2char        
	//   68  159:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   69  162:pop             
								stringbuilder.append((char)((byte0 & 7) + 48));
	//   70  163:aload_3         
	//   71  164:iload_2         
	//   72  165:bipush          7
	//   73  167:iand            
	//   74  168:bipush          48
	//   75  170:iadd            
	//   76  171:int2char        
	//   77  172:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   78  175:pop             
							}
							break;

	//*  79  176:goto            276
						case 13: // '\r'
							stringbuilder.append("\\r");
	//   80  179:aload_3         
	//   81  180:ldc1            #33  <String "\\r">
	//   82  182:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   83  185:pop             
							break;

	//*  84  186:goto            276
						case 12: // '\f'
							stringbuilder.append("\\f");
	//   85  189:aload_3         
	//   86  190:ldc1            #38  <String "\\f">
	//   87  192:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   88  195:pop             
							break;

	//*  89  196:goto            276
						case 11: // '\013'
							stringbuilder.append("\\v");
	//   90  199:aload_3         
	//   91  200:ldc1            #40  <String "\\v">
	//   92  202:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   93  205:pop             
							break;

	//*  94  206:goto            276
						case 10: // '\n'
							stringbuilder.append("\\n");
	//   95  209:aload_3         
	//   96  210:ldc1            #42  <String "\\n">
	//   97  212:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   98  215:pop             
							break;

	//*  99  216:goto            276
						case 9: // '\t'
							stringbuilder.append("\\t");
	//  100  219:aload_3         
	//  101  220:ldc1            #44  <String "\\t">
	//  102  222:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  103  225:pop             
							break;

	//* 104  226:goto            276
						case 8: // '\b'
							stringbuilder.append("\\b");
	//  105  229:aload_3         
	//  106  230:ldc1            #46  <String "\\b">
	//  107  232:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  108  235:pop             
							break;

	//* 109  236:goto            276
						case 7: // '\007'
							stringbuilder.append("\\a");
	//  110  239:aload_3         
	//  111  240:ldc1            #48  <String "\\a">
	//  112  242:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  113  245:pop             
							break;
						}
					else
	//* 114  246:goto            276
						stringbuilder.append("\\\\");
	//  115  249:aload_3         
	//  116  250:ldc1            #50  <String "\\\\">
	//  117  252:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  118  255:pop             
				} else
	//* 119  256:goto            276
				{
					stringbuilder.append("\\'");
	//  120  259:aload_3         
	//  121  260:ldc1            #52  <String "\\'">
	//  122  262:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  123  265:pop             
				}
			} else
	//* 124  266:goto            276
			{
				stringbuilder.append("\\\"");
	//  125  269:aload_3         
	//  126  270:ldc1            #54  <String "\\\"">
	//  127  272:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  128  275:pop             
			}
		}

	//  129  276:iload_1         
	//  130  277:iconst_1        
	//  131  278:iadd            
	//  132  279:istore_1        
	//* 133  280:goto            25
		return stringbuilder.toString();
	//  134  283:aload_3         
	//  135  284:invokevirtual   #58  <Method String StringBuilder.toString()>
	//  136  287:areturn         
	}
}
