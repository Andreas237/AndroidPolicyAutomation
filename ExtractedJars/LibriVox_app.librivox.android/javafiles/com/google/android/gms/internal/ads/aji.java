// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ait, aja, ajj, ajf, 
//			anm, ano, and, amy, 
//			ang, aiz, aqq, atv

public final class aji
{

	public aji()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	public static ait a(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          246
		{
			Object obj = ((Object) ((ait)d.get(((Object) (s.toLowerCase())))));
	//    2    4:getstatic       #37  <Field ConcurrentMap d>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #45  <Method String String.toLowerCase()>
	//    5   11:invokeinterface #51  <Method Object ConcurrentMap.get(Object)>
	//    6   16:checkcast       #53  <Class ait>
	//    7   19:astore_1        
			if(obj == null)
	//*   8   20:aload_1         
	//*   9   21:ifnonnull       244
			{
				obj = ((Object) (String.format("no catalogue found for %s. ", new Object[] {
					s
				})));
	//   10   24:ldc1            #55  <String "no catalogue found for %s. ">
	//   11   26:iconst_1        
	//   12   27:anewarray       Object[]
	//   13   30:dup             
	//   14   31:iconst_0        
	//   15   32:aload_0         
	//   16   33:aastore         
	//   17   34:invokestatic    #59  <Method String String.format(String, Object[])>
	//   18   37:astore_1        
				Object obj1 = obj;
	//   19   38:aload_1         
	//   20   39:astore_2        
				if(s.toLowerCase().startsWith("tinkaead"))
	//*  21   40:aload_0         
	//*  22   41:invokevirtual   #45  <Method String String.toLowerCase()>
	//*  23   44:ldc1            #61  <String "tinkaead">
	//*  24   46:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  25   49:ifeq            62
					obj1 = ((Object) (String.valueOf(obj).concat("Maybe call AeadConfig.register().")));
	//   26   52:aload_1         
	//   27   53:invokestatic    #69  <Method String String.valueOf(Object)>
	//   28   56:ldc1            #71  <String "Maybe call AeadConfig.register().">
	//   29   58:invokevirtual   #75  <Method String String.concat(String)>
	//   30   61:astore_2        
				if(!s.toLowerCase().startsWith("tinkdeterministicaead"))
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #45  <Method String String.toLowerCase()>
	//*  33   66:ldc1            #77  <String "tinkdeterministicaead">
	//*  34   68:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  35   71:ifne            225
				{
					if(!s.toLowerCase().startsWith("tinkstreamingaead"))
	//*  36   74:aload_0         
	//*  37   75:invokevirtual   #45  <Method String String.toLowerCase()>
	//*  38   78:ldc1            #79  <String "tinkstreamingaead">
	//*  39   80:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  40   83:ifne            212
					{
						if(!s.toLowerCase().startsWith("tinkhybriddecrypt") && !s.toLowerCase().startsWith("tinkhybridencrypt"))
	//*  41   86:aload_0         
	//*  42   87:invokevirtual   #45  <Method String String.toLowerCase()>
	//*  43   90:ldc1            #81  <String "tinkhybriddecrypt">
	//*  44   92:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  45   95:ifne            199
	//*  46   98:aload_0         
	//*  47   99:invokevirtual   #45  <Method String String.toLowerCase()>
	//*  48  102:ldc1            #83  <String "tinkhybridencrypt">
	//*  49  104:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  50  107:ifne            199
						{
							if(!s.toLowerCase().startsWith("tinkmac"))
	//*  51  110:aload_0         
	//*  52  111:invokevirtual   #45  <Method String String.toLowerCase()>
	//*  53  114:ldc1            #85  <String "tinkmac">
	//*  54  116:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  55  119:ifne            186
							{
								if(!s.toLowerCase().startsWith("tinkpublickeysign") && !s.toLowerCase().startsWith("tinkpublickeyverify"))
	//*  56  122:aload_0         
	//*  57  123:invokevirtual   #45  <Method String String.toLowerCase()>
	//*  58  126:ldc1            #87  <String "tinkpublickeysign">
	//*  59  128:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  60  131:ifne            173
	//*  61  134:aload_0         
	//*  62  135:invokevirtual   #45  <Method String String.toLowerCase()>
	//*  63  138:ldc1            #89  <String "tinkpublickeyverify">
	//*  64  140:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  65  143:ifne            173
								{
									obj = obj1;
	//   66  146:aload_2         
	//   67  147:astore_1        
									if(s.toLowerCase().startsWith("tink"))
	//*  68  148:aload_0         
	//*  69  149:invokevirtual   #45  <Method String String.toLowerCase()>
	//*  70  152:ldc1            #91  <String "tink">
	//*  71  154:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  72  157:ifeq            235
										obj = ((Object) (String.valueOf(obj1).concat("Maybe call TinkConfig.register().")));
	//   73  160:aload_2         
	//   74  161:invokestatic    #69  <Method String String.valueOf(Object)>
	//   75  164:ldc1            #93  <String "Maybe call TinkConfig.register().">
	//   76  166:invokevirtual   #75  <Method String String.concat(String)>
	//   77  169:astore_1        
								} else
	//*  78  170:goto            235
								{
									obj = ((Object) (String.valueOf(obj1).concat("Maybe call SignatureConfig.register().")));
	//   79  173:aload_2         
	//   80  174:invokestatic    #69  <Method String String.valueOf(Object)>
	//   81  177:ldc1            #95  <String "Maybe call SignatureConfig.register().">
	//   82  179:invokevirtual   #75  <Method String String.concat(String)>
	//   83  182:astore_1        
								}
							} else
	//*  84  183:goto            235
							{
								obj = ((Object) (String.valueOf(obj1).concat("Maybe call MacConfig.register().")));
	//   85  186:aload_2         
	//   86  187:invokestatic    #69  <Method String String.valueOf(Object)>
	//   87  190:ldc1            #97  <String "Maybe call MacConfig.register().">
	//   88  192:invokevirtual   #75  <Method String String.concat(String)>
	//   89  195:astore_1        
							}
						} else
	//*  90  196:goto            235
						{
							obj = ((Object) (String.valueOf(obj1).concat("Maybe call HybridConfig.register().")));
	//   91  199:aload_2         
	//   92  200:invokestatic    #69  <Method String String.valueOf(Object)>
	//   93  203:ldc1            #99  <String "Maybe call HybridConfig.register().">
	//   94  205:invokevirtual   #75  <Method String String.concat(String)>
	//   95  208:astore_1        
						}
					} else
	//*  96  209:goto            235
					{
						obj = ((Object) (String.valueOf(obj1).concat("Maybe call StreamingAeadConfig.register().")));
	//   97  212:aload_2         
	//   98  213:invokestatic    #69  <Method String String.valueOf(Object)>
	//   99  216:ldc1            #101 <String "Maybe call StreamingAeadConfig.register().">
	//  100  218:invokevirtual   #75  <Method String String.concat(String)>
	//  101  221:astore_1        
					}
				} else
	//* 102  222:goto            235
				{
					obj = ((Object) (String.valueOf(obj1).concat("Maybe call DeterministicAeadConfig.register().")));
	//  103  225:aload_2         
	//  104  226:invokestatic    #69  <Method String String.valueOf(Object)>
	//  105  229:ldc1            #103 <String "Maybe call DeterministicAeadConfig.register().">
	//  106  231:invokevirtual   #75  <Method String String.concat(String)>
	//  107  234:astore_1        
				}
				throw new GeneralSecurityException(((String) (obj)));
	//  108  235:new             #105 <Class GeneralSecurityException>
	//  109  238:dup             
	//  110  239:aload_1         
	//  111  240:invokespecial   #108 <Method void GeneralSecurityException(String)>
	//  112  243:athrow          
			} else
			{
				return ((ait) (obj));
	//  113  244:aload_1         
	//  114  245:areturn         
			}
		} else
		{
			throw new IllegalArgumentException("catalogueName must be non-null.");
	//  115  246:new             #110 <Class IllegalArgumentException>
	//  116  249:dup             
	//  117  250:ldc1            #112 <String "catalogueName must be non-null.">
	//  118  252:invokespecial   #113 <Method void IllegalArgumentException(String)>
	//  119  255:athrow          
		}
	}

	public static ajf a(aja aja1, aiz aiz1)
	{
		ajj.b(aja1.a());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method anm aja.a()>
	//    2    4:invokestatic    #124 <Method void ajj.b(anm)>
		aiz1 = ((aiz) (new ajf()));
	//    3    7:new             #126 <Class ajf>
	//    4   10:dup             
	//    5   11:invokespecial   #127 <Method void ajf()>
	//    6   14:astore_1        
		Iterator iterator = aja1.a().b().iterator();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #119 <Method anm aja.a()>
	//    9   19:invokevirtual   #132 <Method List anm.b()>
	//   10   22:invokeinterface #138 <Method Iterator List.iterator()>
	//   11   27:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   28:aload_2         
	//   13   29:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            104
			ano ano1 = (ano)iterator.next();
	//   15   37:aload_2         
	//   16   38:invokeinterface #148 <Method Object Iterator.next()>
	//   17   43:checkcast       #150 <Class ano>
	//   18   46:astore_3        
			if(ano1.c() == and.b)
	//*  19   47:aload_3         
	//*  20   48:invokevirtual   #153 <Method and ano.c()>
	//*  21   51:getstatic       #158 <Field and and.b>
	//*  22   54:if_acmpne       28
			{
				ajh ajh = ((ajf) (aiz1)).a(a(ano1.b().a(), ano1.b().b()), ano1);
	//   23   57:aload_1         
	//   24   58:aload_3         
	//   25   59:invokevirtual   #161 <Method amy ano.b()>
	//   26   62:invokevirtual   #165 <Method String amy.a()>
	//   27   65:aload_3         
	//   28   66:invokevirtual   #161 <Method amy ano.b()>
	//   29   69:invokevirtual   #168 <Method aqq amy.b()>
	//   30   72:invokestatic    #171 <Method Object a(String, aqq)>
	//   31   75:aload_3         
	//   32   76:invokevirtual   #174 <Method ajh ajf.a(Object, ano)>
	//   33   79:astore          4
				if(ano1.d() == aja1.a().a())
	//*  34   81:aload_3         
	//*  35   82:invokevirtual   #177 <Method int ano.d()>
	//*  36   85:aload_0         
	//*  37   86:invokevirtual   #119 <Method anm aja.a()>
	//*  38   89:invokevirtual   #179 <Method int anm.a()>
	//*  39   92:icmpne          28
					((ajf) (aiz1)).a(ajh);
	//   40   95:aload_1         
	//   41   96:aload           4
	//   42   98:invokevirtual   #182 <Method void ajf.a(ajh)>
			}
		} while(true);
	//   43  101:goto            28
		return ((ajf) (aiz1));
	//   44  104:aload_1         
	//   45  105:areturn         
	}

	public static amy a(ang ang1)
	{
		com/google/android/gms/internal/ads/aji;
	//    0    0:ldc1            #2   <Class aji>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		aiz aiz1 = b(ang1.a());
	//    2    3:aload_0         
	//    3    4:invokevirtual   #186 <Method String ang.a()>
	//    4    7:invokestatic    #189 <Method aiz b(String)>
	//    5   10:astore_1        
		if(!((Boolean)c.get(((Object) (ang1.a())))).booleanValue())
			break MISSING_BLOCK_LABEL_48;
	//    6   11:getstatic       #35  <Field ConcurrentMap c>
	//    7   14:aload_0         
	//    8   15:invokevirtual   #186 <Method String ang.a()>
	//    9   18:invokeinterface #51  <Method Object ConcurrentMap.get(Object)>
	//   10   23:checkcast       #191 <Class Boolean>
	//   11   26:invokevirtual   #194 <Method boolean Boolean.booleanValue()>
	//   12   29:ifeq            48
		ang1 = ((ang) (aiz1.c(ang1.b())));
	//   13   32:aload_1         
	//   14   33:aload_0         
	//   15   34:invokevirtual   #195 <Method aqq ang.b()>
	//   16   37:invokeinterface #200 <Method amy aiz.c(aqq)>
	//   17   42:astore_0        
		com/google/android/gms/internal/ads/aji;
	//   18   43:ldc1            #2   <Class aji>
		JVM INSTR monitorexit ;
	//   19   45:monitorexit     
		return ((amy) (ang1));
	//   20   46:aload_0         
	//   21   47:areturn         
		ang1 = ((ang) (String.valueOf(((Object) (ang1.a())))));
	//   22   48:aload_0         
	//   23   49:invokevirtual   #186 <Method String ang.a()>
	//   24   52:invokestatic    #69  <Method String String.valueOf(Object)>
	//   25   55:astore_0        
		if(((String) (ang1)).length() != 0)
	//*  26   56:aload_0         
	//*  27   57:invokevirtual   #203 <Method int String.length()>
	//*  28   60:ifeq            73
		{
			ang1 = ((ang) ("newKey-operation not permitted for key type ".concat(((String) (ang1)))));
	//   29   63:ldc1            #205 <String "newKey-operation not permitted for key type ">
	//   30   65:aload_0         
	//   31   66:invokevirtual   #75  <Method String String.concat(String)>
	//   32   69:astore_0        
			break MISSING_BLOCK_LABEL_83;
	//   33   70:goto            83
		}
		ang1 = ((ang) (new String("newKey-operation not permitted for key type ")));
	//   34   73:new             #42  <Class String>
	//   35   76:dup             
	//   36   77:ldc1            #205 <String "newKey-operation not permitted for key type ">
	//   37   79:invokespecial   #206 <Method void String(String)>
	//   38   82:astore_0        
		throw new GeneralSecurityException(((String) (ang1)));
	//   39   83:new             #105 <Class GeneralSecurityException>
	//   40   86:dup             
	//   41   87:aload_0         
	//   42   88:invokespecial   #108 <Method void GeneralSecurityException(String)>
	//   43   91:athrow          
		ang1;
	//   44   92:astore_0        
		com/google/android/gms/internal/ads/aji;
	//   45   93:ldc1            #2   <Class aji>
		JVM INSTR monitorexit ;
	//   46   95:monitorexit     
		throw ang1;
	//   47   96:aload_0         
	//   48   97:athrow          
	}

	public static atv a(String s, atv atv)
	{
		com/google/android/gms/internal/ads/aji;
	//    0    0:ldc1            #2   <Class aji>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		aiz aiz1 = b(s);
	//    2    3:aload_0         
	//    3    4:invokestatic    #189 <Method aiz b(String)>
	//    4    7:astore_2        
		if(!((Boolean)c.get(((Object) (s)))).booleanValue())
			break MISSING_BLOCK_LABEL_39;
	//    5    8:getstatic       #35  <Field ConcurrentMap c>
	//    6   11:aload_0         
	//    7   12:invokeinterface #51  <Method Object ConcurrentMap.get(Object)>
	//    8   17:checkcast       #191 <Class Boolean>
	//    9   20:invokevirtual   #194 <Method boolean Boolean.booleanValue()>
	//   10   23:ifeq            39
		s = ((String) (aiz1.b(atv)));
	//   11   26:aload_2         
	//   12   27:aload_1         
	//   13   28:invokeinterface #210 <Method atv aiz.b(atv)>
	//   14   33:astore_0        
		com/google/android/gms/internal/ads/aji;
	//   15   34:ldc1            #2   <Class aji>
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		return ((atv) (s));
	//   17   37:aload_0         
	//   18   38:areturn         
		s = String.valueOf(((Object) (s)));
	//   19   39:aload_0         
	//   20   40:invokestatic    #69  <Method String String.valueOf(Object)>
	//   21   43:astore_0        
		if(s.length() != 0)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #203 <Method int String.length()>
	//*  24   48:ifeq            61
		{
			s = "newKey-operation not permitted for key type ".concat(s);
	//   25   51:ldc1            #205 <String "newKey-operation not permitted for key type ">
	//   26   53:aload_0         
	//   27   54:invokevirtual   #75  <Method String String.concat(String)>
	//   28   57:astore_0        
			break MISSING_BLOCK_LABEL_71;
	//   29   58:goto            71
		}
		s = new String("newKey-operation not permitted for key type ");
	//   30   61:new             #42  <Class String>
	//   31   64:dup             
	//   32   65:ldc1            #205 <String "newKey-operation not permitted for key type ">
	//   33   67:invokespecial   #206 <Method void String(String)>
	//   34   70:astore_0        
		throw new GeneralSecurityException(s);
	//   35   71:new             #105 <Class GeneralSecurityException>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:invokespecial   #108 <Method void GeneralSecurityException(String)>
	//   39   79:athrow          
		s;
	//   40   80:astore_0        
		com/google/android/gms/internal/ads/aji;
	//   41   81:ldc1            #2   <Class aji>
		JVM INSTR monitorexit ;
	//   42   83:monitorexit     
		throw s;
	//   43   84:aload_0         
	//   44   85:athrow          
	}

	private static Object a(String s, aqq aqq1)
	{
		return b(s).a(aqq1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #189 <Method aiz b(String)>
	//    2    4:aload_1         
	//    3    5:invokeinterface #213 <Method Object aiz.a(aqq)>
	//    4   10:areturn         
	}

	public static Object a(String s, byte abyte0[])
	{
		return a(s, aqq.a(abyte0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #219 <Method aqq aqq.a(byte[])>
	//    3    5:invokestatic    #171 <Method Object a(String, aqq)>
	//    4    8:areturn         
	}

	public static void a(aiz aiz1)
	{
		com/google/android/gms/internal/ads/aji;
	//    0    0:ldc1            #2   <Class aji>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		a(aiz1, true);
	//    2    3:aload_0         
	//    3    4:iconst_1        
	//    4    5:invokestatic    #223 <Method void a(aiz, boolean)>
		com/google/android/gms/internal/ads/aji;
	//    5    8:ldc1            #2   <Class aji>
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		aiz1;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class aji>
		throw aiz1;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static void a(aiz aiz1, boolean flag)
	{
		com/google/android/gms/internal/ads/aji;
	//    0    0:ldc1            #2   <Class aji>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(aiz1 == null)
			break MISSING_BLOCK_LABEL_208;
	//    2    3:aload_0         
	//    3    4:ifnull          208
		boolean flag1;
		String s1;
		aiz aiz2;
		s1 = aiz1.a();
	//    4    7:aload_0         
	//    5    8:invokeinterface #224 <Method String aiz.a()>
	//    6   13:astore          4
		if(!b.containsKey(((Object) (s1))))
			break MISSING_BLOCK_LABEL_173;
	//    7   15:getstatic       #33  <Field ConcurrentMap b>
	//    8   18:aload           4
	//    9   20:invokeinterface #228 <Method boolean ConcurrentMap.containsKey(Object)>
	//   10   25:ifeq            173
		aiz2 = b(s1);
	//   11   28:aload           4
	//   12   30:invokestatic    #189 <Method aiz b(String)>
	//   13   33:astore          5
		flag1 = ((Boolean)c.get(((Object) (s1)))).booleanValue();
	//   14   35:getstatic       #35  <Field ConcurrentMap c>
	//   15   38:aload           4
	//   16   40:invokeinterface #51  <Method Object ConcurrentMap.get(Object)>
	//   17   45:checkcast       #191 <Class Boolean>
	//   18   48:invokevirtual   #194 <Method boolean Boolean.booleanValue()>
	//   19   51:istore_2        
		if(((Object) (((Object) (aiz1)).getClass())).equals(((Object) (((Object) (aiz2)).getClass()))) && (flag1 || !flag))
			break MISSING_BLOCK_LABEL_173;
	//   20   52:aload_0         
	//   21   53:invokevirtual   #232 <Method Class Object.getClass()>
	//   22   56:aload           5
	//   23   58:invokevirtual   #232 <Method Class Object.getClass()>
	//   24   61:invokevirtual   #235 <Method boolean Object.equals(Object)>
	//   25   64:ifeq            75
	//   26   67:iload_2         
	//   27   68:ifne            173
	//   28   71:iload_1         
	//   29   72:ifeq            173
		String s;
		Logger logger;
		Level level;
		logger = a;
	//   30   75:getstatic       #26  <Field Logger a>
	//   31   78:astore          6
		level = Level.WARNING;
	//   32   80:getstatic       #241 <Field Level Level.WARNING>
	//   33   83:astore          7
		s = String.valueOf(((Object) (s1)));
	//   34   85:aload           4
	//   35   87:invokestatic    #69  <Method String String.valueOf(Object)>
	//   36   90:astore_3        
		if(s.length() != 0)
	//*  37   91:aload_3         
	//*  38   92:invokevirtual   #203 <Method int String.length()>
	//*  39   95:ifeq            108
		{
			s = "Attempted overwrite of a registered key manager for key type ".concat(s);
	//   40   98:ldc1            #243 <String "Attempted overwrite of a registered key manager for key type ">
	//   41  100:aload_3         
	//   42  101:invokevirtual   #75  <Method String String.concat(String)>
	//   43  104:astore_3        
			break MISSING_BLOCK_LABEL_118;
	//   44  105:goto            118
		}
		s = new String("Attempted overwrite of a registered key manager for key type ");
	//   45  108:new             #42  <Class String>
	//   46  111:dup             
	//   47  112:ldc1            #243 <String "Attempted overwrite of a registered key manager for key type ">
	//   48  114:invokespecial   #206 <Method void String(String)>
	//   49  117:astore_3        
		logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", s);
	//   50  118:aload           6
	//   51  120:aload           7
	//   52  122:ldc1            #245 <String "com.google.crypto.tink.Registry">
	//   53  124:ldc1            #247 <String "registerKeyManager">
	//   54  126:aload_3         
	//   55  127:invokevirtual   #251 <Method void Logger.logp(Level, String, String, String)>
		throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[] {
			s1, ((Object) (aiz2)).getClass().getName(), ((Object) (aiz1)).getClass().getName()
		}));
	//   56  130:new             #105 <Class GeneralSecurityException>
	//   57  133:dup             
	//   58  134:ldc1            #253 <String "typeUrl (%s) is already registered with %s, cannot be re-registered with %s">
	//   59  136:iconst_3        
	//   60  137:anewarray       Object[]
	//   61  140:dup             
	//   62  141:iconst_0        
	//   63  142:aload           4
	//   64  144:aastore         
	//   65  145:dup             
	//   66  146:iconst_1        
	//   67  147:aload           5
	//   68  149:invokevirtual   #232 <Method Class Object.getClass()>
	//   69  152:invokevirtual   #18  <Method String Class.getName()>
	//   70  155:aastore         
	//   71  156:dup             
	//   72  157:iconst_2        
	//   73  158:aload_0         
	//   74  159:invokevirtual   #232 <Method Class Object.getClass()>
	//   75  162:invokevirtual   #18  <Method String Class.getName()>
	//   76  165:aastore         
	//   77  166:invokestatic    #59  <Method String String.format(String, Object[])>
	//   78  169:invokespecial   #108 <Method void GeneralSecurityException(String)>
	//   79  172:athrow          
		b.put(((Object) (s1)), ((Object) (aiz1)));
	//   80  173:getstatic       #33  <Field ConcurrentMap b>
	//   81  176:aload           4
	//   82  178:aload_0         
	//   83  179:invokeinterface #257 <Method Object ConcurrentMap.put(Object, Object)>
	//   84  184:pop             
		c.put(((Object) (s1)), ((Object) (Boolean.valueOf(flag))));
	//   85  185:getstatic       #35  <Field ConcurrentMap c>
	//   86  188:aload           4
	//   87  190:iload_1         
	//   88  191:invokestatic    #260 <Method Boolean Boolean.valueOf(boolean)>
	//   89  194:invokeinterface #257 <Method Object ConcurrentMap.put(Object, Object)>
	//   90  199:pop             
		com/google/android/gms/internal/ads/aji;
	//   91  200:ldc1            #2   <Class aji>
		JVM INSTR monitorexit ;
	//   92  202:monitorexit     
		return;
	//   93  203:return          
		aiz1;
	//   94  204:astore_0        
		break MISSING_BLOCK_LABEL_221;
	//   95  205:goto            219
		throw new IllegalArgumentException("key manager must be non-null.");
	//   96  208:new             #110 <Class IllegalArgumentException>
	//   97  211:dup             
	//   98  212:ldc2            #262 <String "key manager must be non-null.">
	//   99  215:invokespecial   #113 <Method void IllegalArgumentException(String)>
	//  100  218:athrow          
	//* 101  219:ldc1            #2   <Class aji>
		throw aiz1;
	//  102  221:monitorexit     
	//  103  222:aload_0         
	//  104  223:athrow          
	}

	public static void a(String s, ait ait1)
	{
		com/google/android/gms/internal/ads/aji;
	//    0    0:ldc1            #2   <Class aji>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		Level level;
		if(!d.containsKey(((Object) (s.toLowerCase()))))
			break MISSING_BLOCK_LABEL_153;
	//    2    3:getstatic       #37  <Field ConcurrentMap d>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #45  <Method String String.toLowerCase()>
	//    5   10:invokeinterface #228 <Method boolean ConcurrentMap.containsKey(Object)>
	//    6   15:ifeq            153
		obj = ((Object) ((ait)d.get(((Object) (s.toLowerCase())))));
	//    7   18:getstatic       #37  <Field ConcurrentMap d>
	//    8   21:aload_0         
	//    9   22:invokevirtual   #45  <Method String String.toLowerCase()>
	//   10   25:invokeinterface #51  <Method Object ConcurrentMap.get(Object)>
	//   11   30:checkcast       #53  <Class ait>
	//   12   33:astore_2        
		if(((Object) (((Object) (ait1)).getClass())).equals(((Object) (obj.getClass()))))
			break MISSING_BLOCK_LABEL_153;
	//   13   34:aload_1         
	//   14   35:invokevirtual   #232 <Method Class Object.getClass()>
	//   15   38:aload_2         
	//   16   39:invokevirtual   #232 <Method Class Object.getClass()>
	//   17   42:invokevirtual   #235 <Method boolean Object.equals(Object)>
	//   18   45:ifne            153
		obj = ((Object) (a));
	//   19   48:getstatic       #26  <Field Logger a>
	//   20   51:astore_2        
		level = Level.WARNING;
	//   21   52:getstatic       #241 <Field Level Level.WARNING>
	//   22   55:astore_3        
		ait1 = ((ait) (String.valueOf(((Object) (s)))));
	//   23   56:aload_0         
	//   24   57:invokestatic    #69  <Method String String.valueOf(Object)>
	//   25   60:astore_1        
		if(((String) (ait1)).length() != 0)
	//*  26   61:aload_1         
	//*  27   62:invokevirtual   #203 <Method int String.length()>
	//*  28   65:ifeq            79
		{
			ait1 = ((ait) ("Attempted overwrite of a catalogueName catalogue for name ".concat(((String) (ait1)))));
	//   29   68:ldc2            #265 <String "Attempted overwrite of a catalogueName catalogue for name ">
	//   30   71:aload_1         
	//   31   72:invokevirtual   #75  <Method String String.concat(String)>
	//   32   75:astore_1        
			break MISSING_BLOCK_LABEL_90;
	//   33   76:goto            90
		}
		ait1 = ((ait) (new String("Attempted overwrite of a catalogueName catalogue for name ")));
	//   34   79:new             #42  <Class String>
	//   35   82:dup             
	//   36   83:ldc2            #265 <String "Attempted overwrite of a catalogueName catalogue for name ">
	//   37   86:invokespecial   #206 <Method void String(String)>
	//   38   89:astore_1        
		((Logger) (obj)).logp(level, "com.google.crypto.tink.Registry", "addCatalogue", ((String) (ait1)));
	//   39   90:aload_2         
	//   40   91:aload_3         
	//   41   92:ldc1            #245 <String "com.google.crypto.tink.Registry">
	//   42   94:ldc2            #267 <String "addCatalogue">
	//   43   97:aload_1         
	//   44   98:invokevirtual   #251 <Method void Logger.logp(Level, String, String, String)>
		ait1 = ((ait) (new StringBuilder(String.valueOf(((Object) (s))).length() + 47)));
	//   45  101:new             #269 <Class StringBuilder>
	//   46  104:dup             
	//   47  105:aload_0         
	//   48  106:invokestatic    #69  <Method String String.valueOf(Object)>
	//   49  109:invokevirtual   #203 <Method int String.length()>
	//   50  112:bipush          47
	//   51  114:iadd            
	//   52  115:invokespecial   #272 <Method void StringBuilder(int)>
	//   53  118:astore_1        
		((StringBuilder) (ait1)).append("catalogue for name ");
	//   54  119:aload_1         
	//   55  120:ldc2            #274 <String "catalogue for name ">
	//   56  123:invokevirtual   #278 <Method StringBuilder StringBuilder.append(String)>
	//   57  126:pop             
		((StringBuilder) (ait1)).append(s);
	//   58  127:aload_1         
	//   59  128:aload_0         
	//   60  129:invokevirtual   #278 <Method StringBuilder StringBuilder.append(String)>
	//   61  132:pop             
		((StringBuilder) (ait1)).append(" has been already registered");
	//   62  133:aload_1         
	//   63  134:ldc2            #280 <String " has been already registered">
	//   64  137:invokevirtual   #278 <Method StringBuilder StringBuilder.append(String)>
	//   65  140:pop             
		throw new GeneralSecurityException(((StringBuilder) (ait1)).toString());
	//   66  141:new             #105 <Class GeneralSecurityException>
	//   67  144:dup             
	//   68  145:aload_1         
	//   69  146:invokevirtual   #283 <Method String StringBuilder.toString()>
	//   70  149:invokespecial   #108 <Method void GeneralSecurityException(String)>
	//   71  152:athrow          
		d.put(((Object) (s.toLowerCase())), ((Object) (ait1)));
	//   72  153:getstatic       #37  <Field ConcurrentMap d>
	//   73  156:aload_0         
	//   74  157:invokevirtual   #45  <Method String String.toLowerCase()>
	//   75  160:aload_1         
	//   76  161:invokeinterface #257 <Method Object ConcurrentMap.put(Object, Object)>
	//   77  166:pop             
		com/google/android/gms/internal/ads/aji;
	//   78  167:ldc1            #2   <Class aji>
		JVM INSTR monitorexit ;
	//   79  169:monitorexit     
		return;
	//   80  170:return          
		s;
	//   81  171:astore_0        
	//*  82  172:ldc1            #2   <Class aji>
		throw s;
	//   83  174:monitorexit     
	//   84  175:aload_0         
	//   85  176:athrow          
	}

	private static aiz b(String s)
	{
		aiz aiz1 = (aiz)b.get(((Object) (s)));
	//    0    0:getstatic       #33  <Field ConcurrentMap b>
	//    1    3:aload_0         
	//    2    4:invokeinterface #51  <Method Object ConcurrentMap.get(Object)>
	//    3    9:checkcast       #197 <Class aiz>
	//    4   12:astore_1        
		if(aiz1 != null)
	//*   5   13:aload_1         
	//*   6   14:ifnull          19
		{
			return aiz1;
	//    7   17:aload_1         
	//    8   18:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 78);
	//    9   19:new             #269 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokestatic    #69  <Method String String.valueOf(Object)>
	//   13   27:invokevirtual   #203 <Method int String.length()>
	//   14   30:bipush          78
	//   15   32:iadd            
	//   16   33:invokespecial   #272 <Method void StringBuilder(int)>
	//   17   36:astore_1        
			stringbuilder.append("No key manager found for key type: ");
	//   18   37:aload_1         
	//   19   38:ldc2            #285 <String "No key manager found for key type: ">
	//   20   41:invokevirtual   #278 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			stringbuilder.append(s);
	//   22   45:aload_1         
	//   23   46:aload_0         
	//   24   47:invokevirtual   #278 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			stringbuilder.append(".  Check the configuration of the registry.");
	//   26   51:aload_1         
	//   27   52:ldc2            #287 <String ".  Check the configuration of the registry.">
	//   28   55:invokevirtual   #278 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			throw new GeneralSecurityException(stringbuilder.toString());
	//   30   59:new             #105 <Class GeneralSecurityException>
	//   31   62:dup             
	//   32   63:aload_1         
	//   33   64:invokevirtual   #283 <Method String StringBuilder.toString()>
	//   34   67:invokespecial   #108 <Method void GeneralSecurityException(String)>
	//   35   70:athrow          
		}
	}

	public static atv b(ang ang1)
	{
		com/google/android/gms/internal/ads/aji;
	//    0    0:ldc1            #2   <Class aji>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		aiz aiz1 = b(ang1.a());
	//    2    3:aload_0         
	//    3    4:invokevirtual   #186 <Method String ang.a()>
	//    4    7:invokestatic    #189 <Method aiz b(String)>
	//    5   10:astore_1        
		if(!((Boolean)c.get(((Object) (ang1.a())))).booleanValue())
			break MISSING_BLOCK_LABEL_48;
	//    6   11:getstatic       #35  <Field ConcurrentMap c>
	//    7   14:aload_0         
	//    8   15:invokevirtual   #186 <Method String ang.a()>
	//    9   18:invokeinterface #51  <Method Object ConcurrentMap.get(Object)>
	//   10   23:checkcast       #191 <Class Boolean>
	//   11   26:invokevirtual   #194 <Method boolean Boolean.booleanValue()>
	//   12   29:ifeq            48
		ang1 = ((ang) (aiz1.b(ang1.b())));
	//   13   32:aload_1         
	//   14   33:aload_0         
	//   15   34:invokevirtual   #195 <Method aqq ang.b()>
	//   16   37:invokeinterface #291 <Method atv aiz.b(aqq)>
	//   17   42:astore_0        
		com/google/android/gms/internal/ads/aji;
	//   18   43:ldc1            #2   <Class aji>
		JVM INSTR monitorexit ;
	//   19   45:monitorexit     
		return ((atv) (ang1));
	//   20   46:aload_0         
	//   21   47:areturn         
		ang1 = ((ang) (String.valueOf(((Object) (ang1.a())))));
	//   22   48:aload_0         
	//   23   49:invokevirtual   #186 <Method String ang.a()>
	//   24   52:invokestatic    #69  <Method String String.valueOf(Object)>
	//   25   55:astore_0        
		if(((String) (ang1)).length() != 0)
	//*  26   56:aload_0         
	//*  27   57:invokevirtual   #203 <Method int String.length()>
	//*  28   60:ifeq            73
		{
			ang1 = ((ang) ("newKey-operation not permitted for key type ".concat(((String) (ang1)))));
	//   29   63:ldc1            #205 <String "newKey-operation not permitted for key type ">
	//   30   65:aload_0         
	//   31   66:invokevirtual   #75  <Method String String.concat(String)>
	//   32   69:astore_0        
			break MISSING_BLOCK_LABEL_83;
	//   33   70:goto            83
		}
		ang1 = ((ang) (new String("newKey-operation not permitted for key type ")));
	//   34   73:new             #42  <Class String>
	//   35   76:dup             
	//   36   77:ldc1            #205 <String "newKey-operation not permitted for key type ">
	//   37   79:invokespecial   #206 <Method void String(String)>
	//   38   82:astore_0        
		throw new GeneralSecurityException(((String) (ang1)));
	//   39   83:new             #105 <Class GeneralSecurityException>
	//   40   86:dup             
	//   41   87:aload_0         
	//   42   88:invokespecial   #108 <Method void GeneralSecurityException(String)>
	//   43   91:athrow          
		ang1;
	//   44   92:astore_0        
		com/google/android/gms/internal/ads/aji;
	//   45   93:ldc1            #2   <Class aji>
		JVM INSTR monitorexit ;
	//   46   95:monitorexit     
		throw ang1;
	//   47   96:aload_0         
	//   48   97:athrow          
	}

	public static Object b(String s, atv atv)
	{
		return b(s).a(atv);
	//    0    0:aload_0         
	//    1    1:invokestatic    #189 <Method aiz b(String)>
	//    2    4:aload_1         
	//    3    5:invokeinterface #295 <Method Object aiz.a(atv)>
	//    4   10:areturn         
	}

	private static final Logger a = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/aji)).getName());
	private static final ConcurrentMap b = new ConcurrentHashMap();
	private static final ConcurrentMap c = new ConcurrentHashMap();
	private static final ConcurrentMap d = new ConcurrentHashMap();

	static 
	{
	//    0    0:ldc1            #2   <Class aji>
	//    1    2:invokevirtual   #18  <Method String Class.getName()>
	//    2    5:invokestatic    #24  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #26  <Field Logger a>
	//    4   11:new             #28  <Class ConcurrentHashMap>
	//    5   14:dup             
	//    6   15:invokespecial   #31  <Method void ConcurrentHashMap()>
	//    7   18:putstatic       #33  <Field ConcurrentMap b>
	//    8   21:new             #28  <Class ConcurrentHashMap>
	//    9   24:dup             
	//   10   25:invokespecial   #31  <Method void ConcurrentHashMap()>
	//   11   28:putstatic       #35  <Field ConcurrentMap c>
	//   12   31:new             #28  <Class ConcurrentHashMap>
	//   13   34:dup             
	//   14   35:invokespecial   #31  <Method void ConcurrentHashMap()>
	//   15   38:putstatic       #37  <Field ConcurrentMap d>
	//*  16   41:return          
	}
}
