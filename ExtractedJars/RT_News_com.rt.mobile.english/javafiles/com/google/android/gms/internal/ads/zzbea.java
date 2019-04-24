// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbeb, zzbec, zzbah

final class zzbea
{

	static String zzaq(zzbah zzbah)
	{
		zzbeb zzbeb1 = new zzbeb(zzbah);
	//    0    0:new             #8   <Class zzbeb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #12  <Method void zzbeb(zzbah)>
	//    4    8:astore          4
		StringBuilder stringbuilder = new StringBuilder(((zzbec) (zzbeb1)).size());
	//    5   10:new             #14  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload           4
	//    8   16:invokeinterface #20  <Method int zzbec.size()>
	//    9   21:invokespecial   #23  <Method void StringBuilder(int)>
	//   10   24:astore          5
		for(int i = 0; i < ((zzbec) (zzbeb1)).size(); i++)
	//*  11   26:iconst_0        
	//*  12   27:istore_2        
	//*  13   28:iload_2         
	//*  14   29:aload           4
	//*  15   31:invokeinterface #20  <Method int zzbec.size()>
	//*  16   36:icmpge          259
		{
			byte byte0 = ((zzbec) (zzbeb1)).zzbn(i);
	//   17   39:aload           4
	//   18   41:iload_2         
	//   19   42:invokeinterface #27  <Method byte zzbec.zzbn(int)>
	//   20   47:istore_3        
			if(byte0 != 34)
	//*  21   48:iload_3         
	//*  22   49:bipush          34
	//*  23   51:icmpeq          246
			{
				if(byte0 != 39)
	//*  24   54:iload_3         
	//*  25   55:bipush          39
	//*  26   57:icmpeq          240
				{
					if(byte0 != 92)
	//*  27   60:iload_3         
	//*  28   61:bipush          92
	//*  29   63:icmpeq          234
						switch(byte0)
	//*  30   66:iload_3         
						{
	//*  31   67:tableswitch     7 13: default 108
	//	               7 221
	//	               8 215
	//	               9 209
	//	               10 203
	//	               11 197
	//	               12 191
	//	               13 185
						default:
							char c;
							if(byte0 >= 32 && byte0 <= 126)
	//*  32  108:iload_3         
	//*  33  109:bipush          32
	//*  34  111:icmplt          126
	//*  35  114:iload_3         
	//*  36  115:bipush          126
	//*  37  117:icmpgt          126
							{
								c = (char)byte0;
	//   38  120:iload_3         
	//   39  121:int2char        
	//   40  122:istore_1        
							} else
	//*  41  123:goto            175
							{
								stringbuilder.append('\\');
	//   42  126:aload           5
	//   43  128:bipush          92
	//   44  130:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   45  133:pop             
								stringbuilder.append((char)((byte0 >>> 6 & 3) + 48));
	//   46  134:aload           5
	//   47  136:iload_3         
	//   48  137:bipush          6
	//   49  139:iushr           
	//   50  140:iconst_3        
	//   51  141:iand            
	//   52  142:bipush          48
	//   53  144:iadd            
	//   54  145:int2char        
	//   55  146:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   56  149:pop             
								stringbuilder.append((char)((byte0 >>> 3 & 7) + 48));
	//   57  150:aload           5
	//   58  152:iload_3         
	//   59  153:iconst_3        
	//   60  154:iushr           
	//   61  155:bipush          7
	//   62  157:iand            
	//   63  158:bipush          48
	//   64  160:iadd            
	//   65  161:int2char        
	//   66  162:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   67  165:pop             
								c = (char)(48 + (byte0 & 7));
	//   68  166:bipush          48
	//   69  168:iload_3         
	//   70  169:bipush          7
	//   71  171:iand            
	//   72  172:iadd            
	//   73  173:int2char        
	//   74  174:istore_1        
							}
							stringbuilder.append(c);
	//   75  175:aload           5
	//   76  177:iload_1         
	//   77  178:invokevirtual   #31  <Method StringBuilder StringBuilder.append(char)>
	//   78  181:pop             
							continue;
	//   79  182:goto            252

						case 13: // '\r'
							zzbah = "\\r";
	//   80  185:ldc1            #33  <String "\\r">
	//   81  187:astore_0        
							break;

	//*  82  188:goto            224
						case 12: // '\f'
							zzbah = "\\f";
	//   83  191:ldc1            #35  <String "\\f">
	//   84  193:astore_0        
							break;

	//*  85  194:goto            224
						case 11: // '\013'
							zzbah = "\\v";
	//   86  197:ldc1            #37  <String "\\v">
	//   87  199:astore_0        
							break;

	//*  88  200:goto            224
						case 10: // '\n'
							zzbah = "\\n";
	//   89  203:ldc1            #39  <String "\\n">
	//   90  205:astore_0        
							break;

	//*  91  206:goto            224
						case 9: // '\t'
							zzbah = "\\t";
	//   92  209:ldc1            #41  <String "\\t">
	//   93  211:astore_0        
							break;

	//*  94  212:goto            224
						case 8: // '\b'
							zzbah = "\\b";
	//   95  215:ldc1            #43  <String "\\b">
	//   96  217:astore_0        
							break;

	//*  97  218:goto            224
						case 7: // '\007'
							zzbah = "\\a";
	//   98  221:ldc1            #45  <String "\\a">
	//   99  223:astore_0        
							break;
						}
					else
	//* 100  224:aload           5
	//* 101  226:aload_0         
	//* 102  227:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//* 103  230:pop             
	//* 104  231:goto            252
						zzbah = "\\\\";
	//  105  234:ldc1            #50  <String "\\\\">
	//  106  236:astore_0        
				} else
	//* 107  237:goto            224
				{
					zzbah = "\\'";
	//  108  240:ldc1            #52  <String "\\'">
	//  109  242:astore_0        
				}
			} else
	//* 110  243:goto            224
			{
				zzbah = "\\\"";
	//  111  246:ldc1            #54  <String "\\\"">
	//  112  248:astore_0        
			}
			stringbuilder.append(((String) (zzbah)));
		}

	//  113  249:goto            224
	//  114  252:iload_2         
	//  115  253:iconst_1        
	//  116  254:iadd            
	//  117  255:istore_2        
	//* 118  256:goto            28
		return stringbuilder.toString();
	//  119  259:aload           5
	//  120  261:invokevirtual   #58  <Method String StringBuilder.toString()>
	//  121  264:areturn         
	}
}
