// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzble
{

	public zzble()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
	//    2    4:return          
	}

	public static long getLong(ContentResolver contentresolver, String s, long l)
	{
		contentresolver = ((ContentResolver) (getString(contentresolver, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #74  <Method String getString(ContentResolver, String)>
	//    3    5:astore_0        
		if(contentresolver != null)
	//*   4    6:aload_0         
	//*   5    7:ifnull          22
		{
			long l1;
			try
			{
				l1 = Long.parseLong(((String) (contentresolver)));
	//    6   10:aload_0         
	//    7   11:invokestatic    #80  <Method long Long.parseLong(String)>
	//    8   14:lstore          4
			}
	//*   9   16:lload           4
	//*  10   18:lstore_2        
	//*  11   19:goto            22
	//*  12   22:lload_2         
	//*  13   23:lreturn         
	//*  14   24:lload_2         
	//*  15   25:lreturn         
			// Misplaced declaration of an exception variable
			catch(ContentResolver contentresolver)
			{
				return l;
			}
			l = l1;
		}
		return l;
	//*  16   26:astore_0        
	//*  17   27:goto            24
	}

	public static String getString(ContentResolver contentresolver, String s)
	{
		return zza(contentresolver, s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #85  <Method String zza(ContentResolver, String, String)>
	//    4    6:areturn         
	}

	static AtomicBoolean zzUH()
	{
		return zzbVQ;
	//    0    0:getstatic       #60  <Field AtomicBoolean zzbVQ>
	//    1    3:areturn         
	}

	public static String zza(ContentResolver contentresolver, String s, String s1)
	{
		com/google/android/gms/internal/zzble;
	//    0    0:ldc1            #2   <Class zzble>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		zza(contentresolver);
	//    2    3:aload_0         
	//    3    4:invokestatic    #91  <Method void zza(ContentResolver)>
		obj = zzbVS;
	//    4    7:getstatic       #93  <Field Object zzbVS>
	//    5   10:astore          7
		if(!zzbVR.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_47;
	//    6   12:getstatic       #95  <Field HashMap zzbVR>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #101 <Method boolean HashMap.containsKey(Object)>
	//    9   19:ifeq            47
		contentresolver = ((ContentResolver) ((String)zzbVR.get(((Object) (s)))));
	//   10   22:getstatic       #95  <Field HashMap zzbVR>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #105 <Method Object HashMap.get(Object)>
	//   13   29:checkcast       #62  <Class String>
	//   14   32:astore_0        
		if(contentresolver == null)
	//*  15   33:aload_0         
	//*  16   34:ifnull          40
	//*  17   37:goto            42
			contentresolver = ((ContentResolver) (s1));
	//   18   40:aload_2         
	//   19   41:astore_0        
		com/google/android/gms/internal/zzble;
	//   20   42:ldc1            #2   <Class zzble>
		JVM INSTR monitorexit ;
	//   21   44:monitorexit     
		return ((String) (contentresolver));
	//   22   45:aload_0         
	//   23   46:areturn         
		int j;
		String as[];
		as = zzbVU;
	//   24   47:getstatic       #64  <Field String[] zzbVU>
	//   25   50:astore          5
		j = as.length;
	//   26   52:aload           5
	//   27   54:arraylength     
	//   28   55:istore          4
		int i = 0;
	//   29   57:iconst_0        
	//   30   58:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   31   59:iload_3         
	//   32   60:iload           4
	//   33   62:icmpge          145
		if(!s.startsWith(as[i]))
			break MISSING_BLOCK_LABEL_138;
	//   34   65:aload_1         
	//   35   66:aload           5
	//   36   68:iload_3         
	//   37   69:aaload          
	//   38   70:invokevirtual   #109 <Method boolean String.startsWith(String)>
	//   39   73:ifeq            138
		if(zzbVT && !zzbVR.isEmpty())
			break MISSING_BLOCK_LABEL_133;
	//   40   76:getstatic       #111 <Field boolean zzbVT>
	//   41   79:ifeq            91
	//   42   82:getstatic       #95  <Field HashMap zzbVR>
	//   43   85:invokevirtual   #115 <Method boolean HashMap.isEmpty()>
	//   44   88:ifeq            133
		zzc(contentresolver, zzbVU);
	//   45   91:aload_0         
	//   46   92:getstatic       #64  <Field String[] zzbVU>
	//   47   95:invokestatic    #119 <Method void zzc(ContentResolver, String[])>
		if(!zzbVR.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_133;
	//   48   98:getstatic       #95  <Field HashMap zzbVR>
	//   49  101:aload_1         
	//   50  102:invokevirtual   #101 <Method boolean HashMap.containsKey(Object)>
	//   51  105:ifeq            133
		contentresolver = ((ContentResolver) ((String)zzbVR.get(((Object) (s)))));
	//   52  108:getstatic       #95  <Field HashMap zzbVR>
	//   53  111:aload_1         
	//   54  112:invokevirtual   #105 <Method Object HashMap.get(Object)>
	//   55  115:checkcast       #62  <Class String>
	//   56  118:astore_0        
		if(contentresolver == null)
	//*  57  119:aload_0         
	//*  58  120:ifnull          126
	//*  59  123:goto            128
			contentresolver = ((ContentResolver) (s1));
	//   60  126:aload_2         
	//   61  127:astore_0        
		com/google/android/gms/internal/zzble;
	//   62  128:ldc1            #2   <Class zzble>
		JVM INSTR monitorexit ;
	//   63  130:monitorexit     
		return ((String) (contentresolver));
	//   64  131:aload_0         
	//   65  132:areturn         
		com/google/android/gms/internal/zzble;
	//   66  133:ldc1            #2   <Class zzble>
		JVM INSTR monitorexit ;
	//   67  135:monitorexit     
		return s1;
	//   68  136:aload_2         
	//   69  137:areturn         
		i++;
	//   70  138:iload_3         
	//   71  139:iconst_1        
	//   72  140:iadd            
	//   73  141:istore_3        
		if(true) goto _L2; else goto _L1
	//   74  142:goto            59
_L1:
		break MISSING_BLOCK_LABEL_157;
	//*  75  145:ldc1            #2   <Class zzble>
	//*  76  147:monitorexit     
	//*  77  148:goto            157
		contentresolver;
	//   78  151:astore_0        
	//*  79  152:ldc1            #2   <Class zzble>
		throw contentresolver;
	//   80  154:monitorexit     
	//   81  155:aload_0         
	//   82  156:athrow          
		Cursor cursor;
		cursor = contentresolver.query(CONTENT_URI, ((String []) (null)), ((String) (null)), new String[] {
			s
		}, ((String) (null)));
	//   83  157:aload_0         
	//   84  158:getstatic       #35  <Field Uri CONTENT_URI>
	//   85  161:aconst_null     
	//   86  162:aconst_null     
	//   87  163:iconst_1        
	//   88  164:anewarray       String[]
	//   89  167:dup             
	//   90  168:iconst_0        
	//   91  169:aload_1         
	//   92  170:aastore         
	//   93  171:aconst_null     
	//   94  172:invokevirtual   #125 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   95  175:astore          6
		if(cursor == null)
			break MISSING_BLOCK_LABEL_192;
	//   96  177:aload           6
	//   97  179:ifnull          192
		if(cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_213;
	//   98  182:aload           6
	//   99  184:invokeinterface #130 <Method boolean Cursor.moveToFirst()>
	//  100  189:ifne            213
		zza(obj, s, ((String) (null)));
	//  101  192:aload           7
	//  102  194:aload_1         
	//  103  195:aconst_null     
	//  104  196:invokestatic    #133 <Method void zza(Object, String, String)>
		if(cursor != null)
	//* 105  199:aload           6
	//* 106  201:ifnull          211
			cursor.close();
	//  107  204:aload           6
	//  108  206:invokeinterface #136 <Method void Cursor.close()>
		return s1;
	//  109  211:aload_2         
	//  110  212:areturn         
		String s2 = cursor.getString(1);
	//  111  213:aload           6
	//  112  215:iconst_1        
	//  113  216:invokeinterface #139 <Method String Cursor.getString(int)>
	//  114  221:astore          5
		contentresolver = ((ContentResolver) (s2));
	//  115  223:aload           5
	//  116  225:astore_0        
		if(s2 == null)
			break MISSING_BLOCK_LABEL_245;
	//  117  226:aload           5
	//  118  228:ifnull          245
		contentresolver = ((ContentResolver) (s2));
	//  119  231:aload           5
	//  120  233:astore_0        
		if(s2.equals(((Object) (s1))))
	//* 121  234:aload           5
	//* 122  236:aload_2         
	//* 123  237:invokevirtual   #142 <Method boolean String.equals(Object)>
	//* 124  240:ifeq            245
			contentresolver = ((ContentResolver) (s1));
	//  125  243:aload_2         
	//  126  244:astore_0        
		zza(obj, s, ((String) (contentresolver)));
	//  127  245:aload           7
	//  128  247:aload_1         
	//  129  248:aload_0         
	//  130  249:invokestatic    #133 <Method void zza(Object, String, String)>
		if(contentresolver == null)
	//* 131  252:aload_0         
	//* 132  253:ifnull          259
	//* 133  256:goto            261
			contentresolver = ((ContentResolver) (s1));
	//  134  259:aload_2         
	//  135  260:astore_0        
		if(cursor != null)
	//* 136  261:aload           6
	//* 137  263:ifnull          273
			cursor.close();
	//  138  266:aload           6
	//  139  268:invokeinterface #136 <Method void Cursor.close()>
		return ((String) (contentresolver));
	//  140  273:aload_0         
	//  141  274:areturn         
		contentresolver;
	//  142  275:astore_0        
		if(cursor != null)
	//* 143  276:aload           6
	//* 144  278:ifnull          288
			cursor.close();
	//  145  281:aload           6
	//  146  283:invokeinterface #136 <Method void Cursor.close()>
		throw contentresolver;
	//  147  288:aload_0         
	//  148  289:athrow          
	}

	public static transient Map zza(ContentResolver contentresolver, String as[])
	{
		contentresolver = ((ContentResolver) (contentresolver.query(zzbVN, ((String []) (null)), ((String) (null)), as, ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:getstatic       #39  <Field Uri zzbVN>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #125 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//    7   11:astore_0        
		as = ((String []) (new TreeMap()));
	//    8   12:new             #145 <Class TreeMap>
	//    9   15:dup             
	//   10   16:invokespecial   #146 <Method void TreeMap()>
	//   11   19:astore_1        
		if(contentresolver == null)
	//*  12   20:aload_0         
	//*  13   21:ifnonnull       26
			return ((Map) (as));
	//   14   24:aload_1         
	//   15   25:areturn         
		for(; ((Cursor) (contentresolver)).moveToNext(); ((TreeMap) (as)).put(((Object) (((Cursor) (contentresolver)).getString(0))), ((Object) (((Cursor) (contentresolver)).getString(1)))));
	//   16   26:aload_0         
	//   17   27:invokeinterface #149 <Method boolean Cursor.moveToNext()>
	//   18   32:ifeq            57
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:invokeinterface #139 <Method String Cursor.getString(int)>
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:invokeinterface #139 <Method String Cursor.getString(int)>
	//   26   50:invokevirtual   #153 <Method Object TreeMap.put(Object, Object)>
	//   27   53:pop             
	//*  28   54:goto            26
		((Cursor) (contentresolver)).close();
	//   29   57:aload_0         
	//   30   58:invokeinterface #136 <Method void Cursor.close()>
		return ((Map) (as));
	//   31   63:aload_1         
	//   32   64:areturn         
		as;
	//   33   65:astore_1        
		((Cursor) (contentresolver)).close();
	//   34   66:aload_0         
	//   35   67:invokeinterface #136 <Method void Cursor.close()>
		throw as;
	//   36   72:aload_1         
	//   37   73:athrow          
	}

	private static void zza(ContentResolver contentresolver)
	{
		if(zzbVR == null)
	//*   0    0:getstatic       #95  <Field HashMap zzbVR>
	//*   1    3:ifnonnull       54
		{
			zzbVQ.set(false);
	//    2    6:getstatic       #60  <Field AtomicBoolean zzbVQ>
	//    3    9:iconst_0        
	//    4   10:invokevirtual   #159 <Method void AtomicBoolean.set(boolean)>
			zzbVR = new HashMap();
	//    5   13:new             #97  <Class HashMap>
	//    6   16:dup             
	//    7   17:invokespecial   #160 <Method void HashMap()>
	//    8   20:putstatic       #95  <Field HashMap zzbVR>
			zzbVS = new Object();
	//    9   23:new             #4   <Class Object>
	//   10   26:dup             
	//   11   27:invokespecial   #66  <Method void Object()>
	//   12   30:putstatic       #93  <Field Object zzbVS>
			zzbVT = false;
	//   13   33:iconst_0        
	//   14   34:putstatic       #111 <Field boolean zzbVT>
			contentresolver.registerContentObserver(CONTENT_URI, true, ((ContentObserver) (new ContentObserver(((Handler) (null))) {

				public void onChange(boolean flag)
				{
					zzble.zzUH().set(true);
				//    0    0:invokestatic    #20  <Method AtomicBoolean zzble.zzUH()>
				//    1    3:iconst_1        
				//    2    4:invokevirtual   #25  <Method void AtomicBoolean.set(boolean)>
				//    3    7:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #13  <Method void ContentObserver(Handler)>
			//    3    5:return          
			}
			}
)));
	//   15   37:aload_0         
	//   16   38:getstatic       #35  <Field Uri CONTENT_URI>
	//   17   41:iconst_1        
	//   18   42:new             #6   <Class zzble$1>
	//   19   45:dup             
	//   20   46:aconst_null     
	//   21   47:invokespecial   #163 <Method void zzble$1(Handler)>
	//   22   50:invokevirtual   #167 <Method void ContentResolver.registerContentObserver(Uri, boolean, ContentObserver)>
			return;
	//   23   53:return          
		}
		if(zzbVQ.getAndSet(false))
	//*  24   54:getstatic       #60  <Field AtomicBoolean zzbVQ>
	//*  25   57:iconst_0        
	//*  26   58:invokevirtual   #171 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*  27   61:ifeq            84
		{
			zzbVR.clear();
	//   28   64:getstatic       #95  <Field HashMap zzbVR>
	//   29   67:invokevirtual   #174 <Method void HashMap.clear()>
			zzbVS = new Object();
	//   30   70:new             #4   <Class Object>
	//   31   73:dup             
	//   32   74:invokespecial   #66  <Method void Object()>
	//   33   77:putstatic       #93  <Field Object zzbVS>
			zzbVT = false;
	//   34   80:iconst_0        
	//   35   81:putstatic       #111 <Field boolean zzbVT>
		}
	//   36   84:return          
	}

	private static void zza(Object obj, String s, String s1)
	{
		com/google/android/gms/internal/zzble;
	//    0    0:ldc1            #2   <Class zzble>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(obj == zzbVS)
	//*   2    3:aload_0         
	//*   3    4:getstatic       #93  <Field Object zzbVS>
	//*   4    7:if_acmpne       19
			zzbVR.put(((Object) (s)), ((Object) (s1)));
	//    5   10:getstatic       #95  <Field HashMap zzbVR>
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokevirtual   #175 <Method Object HashMap.put(Object, Object)>
	//    9   18:pop             
		com/google/android/gms/internal/zzble;
	//   10   19:ldc1            #2   <Class zzble>
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		obj;
	//   13   23:astore_0        
	//*  14   24:ldc1            #2   <Class zzble>
		throw obj;
	//   15   26:monitorexit     
	//   16   27:aload_0         
	//   17   28:athrow          
	}

	public static transient void zzb(ContentResolver contentresolver, String as[])
	{
		if(as.length == 0)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ifne            6
			return;
	//    3    5:return          
		com/google/android/gms/internal/zzble;
	//    4    6:ldc1            #2   <Class zzble>
		JVM INSTR monitorenter ;
	//    5    8:monitorenter    
		zza(contentresolver);
	//    6    9:aload_0         
	//    7   10:invokestatic    #91  <Method void zza(ContentResolver)>
		as = zzk(as);
	//    8   13:aload_1         
	//    9   14:invokestatic    #180 <Method String[] zzk(String[])>
	//   10   17:astore_1        
		if(!zzbVT || zzbVR.isEmpty())
	//*  11   18:getstatic       #111 <Field boolean zzbVT>
	//*  12   21:ifeq            33
	//*  13   24:getstatic       #95  <Field HashMap zzbVR>
	//*  14   27:invokevirtual   #115 <Method boolean HashMap.isEmpty()>
	//*  15   30:ifeq            43
		{
			zzc(contentresolver, zzbVU);
	//   16   33:aload_0         
	//   17   34:getstatic       #64  <Field String[] zzbVU>
	//   18   37:invokestatic    #119 <Method void zzc(ContentResolver, String[])>
			break MISSING_BLOCK_LABEL_53;
	//   19   40:goto            53
		}
		if(as.length != 0)
	//*  20   43:aload_1         
	//*  21   44:arraylength     
	//*  22   45:ifeq            53
			zzc(contentresolver, as);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:invokestatic    #119 <Method void zzc(ContentResolver, String[])>
		com/google/android/gms/internal/zzble;
	//   26   53:ldc1            #2   <Class zzble>
		JVM INSTR monitorexit ;
	//   27   55:monitorexit     
		return;
	//   28   56:return          
		contentresolver;
	//   29   57:astore_0        
	//*  30   58:ldc1            #2   <Class zzble>
		throw contentresolver;
	//   31   60:monitorexit     
	//   32   61:aload_0         
	//   33   62:athrow          
	}

	private static void zzc(ContentResolver contentresolver, String as[])
	{
		zzbVR.putAll(zza(contentresolver, as));
	//    0    0:getstatic       #95  <Field HashMap zzbVR>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #182 <Method Map zza(ContentResolver, String[])>
	//    4    8:invokevirtual   #186 <Method void HashMap.putAll(Map)>
		zzbVT = true;
	//    5   11:iconst_1        
	//    6   12:putstatic       #111 <Field boolean zzbVT>
	//    7   15:return          
	}

	private static String[] zzk(String as[])
	{
		HashSet hashset = new HashSet(((zzbVU.length + as.length) * 4) / 3 + 1);
	//    0    0:new             #188 <Class HashSet>
	//    1    3:dup             
	//    2    4:getstatic       #64  <Field String[] zzbVU>
	//    3    7:arraylength     
	//    4    8:aload_0         
	//    5    9:arraylength     
	//    6   10:iadd            
	//    7   11:iconst_4        
	//    8   12:imul            
	//    9   13:iconst_3        
	//   10   14:idiv            
	//   11   15:iconst_1        
	//   12   16:iadd            
	//   13   17:invokespecial   #191 <Method void HashSet(int)>
	//   14   20:astore_3        
		hashset.addAll(((java.util.Collection) (Arrays.asList(((Object []) (zzbVU))))));
	//   15   21:aload_3         
	//   16   22:getstatic       #64  <Field String[] zzbVU>
	//   17   25:invokestatic    #197 <Method java.util.List Arrays.asList(Object[])>
	//   18   28:invokevirtual   #201 <Method boolean HashSet.addAll(java.util.Collection)>
	//   19   31:pop             
		ArrayList arraylist = new ArrayList();
	//   20   32:new             #203 <Class ArrayList>
	//   21   35:dup             
	//   22   36:invokespecial   #204 <Method void ArrayList()>
	//   23   39:astore          4
		int j = as.length;
	//   24   41:aload_0         
	//   25   42:arraylength     
	//   26   43:istore_2        
		for(int i = 0; i < j; i++)
	//*  27   44:iconst_0        
	//*  28   45:istore_1        
	//*  29   46:iload_1         
	//*  30   47:iload_2         
	//*  31   48:icmpge          80
		{
			String s = as[i];
	//   32   51:aload_0         
	//   33   52:iload_1         
	//   34   53:aaload          
	//   35   54:astore          5
			if(hashset.add(((Object) (s))))
	//*  36   56:aload_3         
	//*  37   57:aload           5
	//*  38   59:invokevirtual   #207 <Method boolean HashSet.add(Object)>
	//*  39   62:ifeq            73
				arraylist.add(((Object) (s)));
	//   40   65:aload           4
	//   41   67:aload           5
	//   42   69:invokevirtual   #208 <Method boolean ArrayList.add(Object)>
	//   43   72:pop             
		}

	//   44   73:iload_1         
	//   45   74:iconst_1        
	//   46   75:iadd            
	//   47   76:istore_1        
	//*  48   77:goto            46
		if(arraylist.isEmpty())
	//*  49   80:aload           4
	//*  50   82:invokevirtual   #209 <Method boolean ArrayList.isEmpty()>
	//*  51   85:ifeq            93
		{
			return new String[0];
	//   52   88:iconst_0        
	//   53   89:anewarray       String[]
	//   54   92:areturn         
		} else
		{
			zzbVU = (String[])hashset.toArray(((Object []) (new String[hashset.size()])));
	//   55   93:aload_3         
	//   56   94:aload_3         
	//   57   95:invokevirtual   #213 <Method int HashSet.size()>
	//   58   98:anewarray       String[]
	//   59  101:invokevirtual   #217 <Method Object[] HashSet.toArray(Object[])>
	//   60  104:checkcast       #218 <Class String[]>
	//   61  107:putstatic       #64  <Field String[] zzbVU>
			return (String[])arraylist.toArray(((Object []) (new String[arraylist.size()])));
	//   62  110:aload           4
	//   63  112:aload           4
	//   64  114:invokevirtual   #219 <Method int ArrayList.size()>
	//   65  117:anewarray       String[]
	//   66  120:invokevirtual   #220 <Method Object[] ArrayList.toArray(Object[])>
	//   67  123:checkcast       #218 <Class String[]>
	//   68  126:areturn         
		}
	}

	public static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
	public static final Uri zzbVN = Uri.parse("content://com.google.android.gsf.gservices/prefix");
	public static final Pattern zzbVO = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
	public static final Pattern zzbVP = Pattern.compile("^(0|false|f|off|no|n)$", 2);
	private static final AtomicBoolean zzbVQ = new AtomicBoolean();
	static HashMap zzbVR;
	private static Object zzbVS;
	private static boolean zzbVT;
	static String zzbVU[] = new String[0];

	static 
	{
	//    0    0:ldc1            #27  <String "content://com.google.android.gsf.gservices">
	//    1    2:invokestatic    #33  <Method Uri Uri.parse(String)>
	//    2    5:putstatic       #35  <Field Uri CONTENT_URI>
	//    3    8:ldc1            #37  <String "content://com.google.android.gsf.gservices/prefix">
	//    4   10:invokestatic    #33  <Method Uri Uri.parse(String)>
	//    5   13:putstatic       #39  <Field Uri zzbVN>
	//    6   16:ldc1            #41  <String "^(1|true|t|on|yes|y)$">
	//    7   18:iconst_2        
	//    8   19:invokestatic    #47  <Method Pattern Pattern.compile(String, int)>
	//    9   22:putstatic       #49  <Field Pattern zzbVO>
	//   10   25:ldc1            #51  <String "^(0|false|f|off|no|n)$">
	//   11   27:iconst_2        
	//   12   28:invokestatic    #47  <Method Pattern Pattern.compile(String, int)>
	//   13   31:putstatic       #53  <Field Pattern zzbVP>
	//   14   34:new             #55  <Class AtomicBoolean>
	//   15   37:dup             
	//   16   38:invokespecial   #58  <Method void AtomicBoolean()>
	//   17   41:putstatic       #60  <Field AtomicBoolean zzbVQ>
	//   18   44:iconst_0        
	//   19   45:anewarray       String[]
	//   20   48:putstatic       #64  <Field String[] zzbVU>
	//*  21   51:return          
	}
}
