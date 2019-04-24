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

public class zzbii
{

	public zzbii()
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
		long l1 = l;
	//    4    6:lload_2         
	//    5    7:lstore          4
		if(contentresolver != null)
	//*   6    9:aload_0         
	//*   7   10:ifnull          19
			try
			{
				l1 = Long.parseLong(((String) (contentresolver)));
	//    8   13:aload_0         
	//    9   14:invokestatic    #80  <Method long Long.parseLong(String)>
	//   10   17:lstore          4
			}
	//*  11   19:lload           4
	//*  12   21:lreturn         
			// Misplaced declaration of an exception variable
			catch(ContentResolver contentresolver)
	//*  13   22:astore_0        
			{
				return l;
	//   14   23:lload_2         
	//   15   24:lreturn         
			}
		return l1;
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

	static AtomicBoolean zzTf()
	{
		return zzbTO;
	//    0    0:getstatic       #60  <Field AtomicBoolean zzbTO>
	//    1    3:areturn         
	}

	public static String zza(ContentResolver contentresolver, String s, String s1)
	{
		com/google/android/gms/internal/zzbii;
	//    0    0:ldc1            #2   <Class zzbii>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		zza(contentresolver);
	//    2    3:aload_0         
	//    3    4:invokestatic    #91  <Method void zza(ContentResolver)>
		obj = zzbTQ;
	//    4    7:getstatic       #93  <Field Object zzbTQ>
	//    5   10:astore          7
		if(!zzbTP.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_44;
	//    6   12:getstatic       #95  <Field HashMap zzbTP>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #101 <Method boolean HashMap.containsKey(Object)>
	//    9   19:ifeq            44
		contentresolver = ((ContentResolver) ((String)zzbTP.get(((Object) (s)))));
	//   10   22:getstatic       #95  <Field HashMap zzbTP>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #105 <Method Object HashMap.get(Object)>
	//   13   29:checkcast       #62  <Class String>
	//   14   32:astore_0        
		if(contentresolver != null)
	//*  15   33:aload_0         
	//*  16   34:ifnull          39
			s1 = ((String) (contentresolver));
	//   17   37:aload_0         
	//   18   38:astore_2        
		com/google/android/gms/internal/zzbii;
	//   19   39:ldc1            #2   <Class zzbii>
		JVM INSTR monitorexit ;
	//   20   41:monitorexit     
		return s1;
	//   21   42:aload_2         
	//   22   43:areturn         
		int j;
		String as[];
		as = zzbTS;
	//   23   44:getstatic       #64  <Field String[] zzbTS>
	//   24   47:astore          5
		j = as.length;
	//   25   49:aload           5
	//   26   51:arraylength     
	//   27   52:istore          4
		int i = 0;
	//   28   54:iconst_0        
	//   29   55:istore_3        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_138;
	//   30   56:iload_3         
	//   31   57:iload           4
	//   32   59:icmpge          138
		if(!s.startsWith(as[i]))
			break MISSING_BLOCK_LABEL_277;
	//   33   62:aload_1         
	//   34   63:aload           5
	//   35   65:iload_3         
	//   36   66:aaload          
	//   37   67:invokevirtual   #109 <Method boolean String.startsWith(String)>
	//   38   70:ifeq            277
		if(zzbTR && !zzbTP.isEmpty())
			break MISSING_BLOCK_LABEL_133;
	//   39   73:getstatic       #111 <Field boolean zzbTR>
	//   40   76:ifeq            88
	//   41   79:getstatic       #95  <Field HashMap zzbTP>
	//   42   82:invokevirtual   #115 <Method boolean HashMap.isEmpty()>
	//   43   85:ifeq            133
		zzc(contentresolver, zzbTS);
	//   44   88:aload_0         
	//   45   89:getstatic       #64  <Field String[] zzbTS>
	//   46   92:invokestatic    #119 <Method void zzc(ContentResolver, String[])>
		if(!zzbTP.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_133;
	//   47   95:getstatic       #95  <Field HashMap zzbTP>
	//   48   98:aload_1         
	//   49   99:invokevirtual   #101 <Method boolean HashMap.containsKey(Object)>
	//   50  102:ifeq            133
		contentresolver = ((ContentResolver) ((String)zzbTP.get(((Object) (s)))));
	//   51  105:getstatic       #95  <Field HashMap zzbTP>
	//   52  108:aload_1         
	//   53  109:invokevirtual   #105 <Method Object HashMap.get(Object)>
	//   54  112:checkcast       #62  <Class String>
	//   55  115:astore_0        
		if(contentresolver != null)
	//*  56  116:aload_0         
	//*  57  117:ifnull          122
			s1 = ((String) (contentresolver));
	//   58  120:aload_0         
	//   59  121:astore_2        
		com/google/android/gms/internal/zzbii;
	//   60  122:ldc1            #2   <Class zzbii>
		JVM INSTR monitorexit ;
	//   61  124:monitorexit     
		return s1;
	//   62  125:aload_2         
	//   63  126:areturn         
		contentresolver;
	//   64  127:astore_0        
		com/google/android/gms/internal/zzbii;
	//   65  128:ldc1            #2   <Class zzbii>
		JVM INSTR monitorexit ;
	//   66  130:monitorexit     
		throw contentresolver;
	//   67  131:aload_0         
	//   68  132:athrow          
		com/google/android/gms/internal/zzbii;
	//   69  133:ldc1            #2   <Class zzbii>
		JVM INSTR monitorexit ;
	//   70  135:monitorexit     
		return s1;
	//   71  136:aload_2         
	//   72  137:areturn         
		com/google/android/gms/internal/zzbii;
	//   73  138:ldc1            #2   <Class zzbii>
		JVM INSTR monitorexit ;
	//   74  140:monitorexit     
		Cursor cursor;
		cursor = contentresolver.query(CONTENT_URI, ((String []) (null)), ((String) (null)), new String[] {
			s
		}, ((String) (null)));
	//   75  141:aload_0         
	//   76  142:getstatic       #35  <Field Uri CONTENT_URI>
	//   77  145:aconst_null     
	//   78  146:aconst_null     
	//   79  147:iconst_1        
	//   80  148:anewarray       String[]
	//   81  151:dup             
	//   82  152:iconst_0        
	//   83  153:aload_1         
	//   84  154:aastore         
	//   85  155:aconst_null     
	//   86  156:invokevirtual   #125 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   87  159:astore          6
		if(cursor == null)
			break MISSING_BLOCK_LABEL_176;
	//   88  161:aload           6
	//   89  163:ifnull          176
		if(cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_199;
	//   90  166:aload           6
	//   91  168:invokeinterface #130 <Method boolean Cursor.moveToFirst()>
	//   92  173:ifne            199
		zza(obj, s, ((String) (null)));
	//   93  176:aload           7
	//   94  178:aload_1         
	//   95  179:aconst_null     
	//   96  180:invokestatic    #133 <Method void zza(Object, String, String)>
		contentresolver = ((ContentResolver) (s1));
	//   97  183:aload_2         
	//   98  184:astore_0        
		if(cursor != null)
	//*  99  185:aload           6
	//* 100  187:ifnull          275
		{
			cursor.close();
	//  101  190:aload           6
	//  102  192:invokeinterface #136 <Method void Cursor.close()>
			return s1;
	//  103  197:aload_2         
	//  104  198:areturn         
		}
		break MISSING_BLOCK_LABEL_275;
		String s2 = cursor.getString(1);
	//  105  199:aload           6
	//  106  201:iconst_1        
	//  107  202:invokeinterface #139 <Method String Cursor.getString(int)>
	//  108  207:astore          5
		contentresolver = ((ContentResolver) (s2));
	//  109  209:aload           5
	//  110  211:astore_0        
		if(s2 == null)
			break MISSING_BLOCK_LABEL_231;
	//  111  212:aload           5
	//  112  214:ifnull          231
		contentresolver = ((ContentResolver) (s2));
	//  113  217:aload           5
	//  114  219:astore_0        
		if(s2.equals(((Object) (s1))))
	//* 115  220:aload           5
	//* 116  222:aload_2         
	//* 117  223:invokevirtual   #142 <Method boolean String.equals(Object)>
	//* 118  226:ifeq            231
			contentresolver = ((ContentResolver) (s1));
	//  119  229:aload_2         
	//  120  230:astore_0        
		zza(obj, s, ((String) (contentresolver)));
	//  121  231:aload           7
	//  122  233:aload_1         
	//  123  234:aload_0         
	//  124  235:invokestatic    #133 <Method void zza(Object, String, String)>
		if(contentresolver != null)
	//* 125  238:aload_0         
	//* 126  239:ifnull          244
			s1 = ((String) (contentresolver));
	//  127  242:aload_0         
	//  128  243:astore_2        
		contentresolver = ((ContentResolver) (s1));
	//  129  244:aload_2         
	//  130  245:astore_0        
		if(cursor != null)
	//* 131  246:aload           6
	//* 132  248:ifnull          275
		{
			cursor.close();
	//  133  251:aload           6
	//  134  253:invokeinterface #136 <Method void Cursor.close()>
			return s1;
	//  135  258:aload_2         
	//  136  259:areturn         
		}
		break MISSING_BLOCK_LABEL_275;
		contentresolver;
	//  137  260:astore_0        
		if(cursor != null)
	//* 138  261:aload           6
	//* 139  263:ifnull          273
			cursor.close();
	//  140  266:aload           6
	//  141  268:invokeinterface #136 <Method void Cursor.close()>
		throw contentresolver;
	//  142  273:aload_0         
	//  143  274:athrow          
		return ((String) (contentresolver));
	//  144  275:aload_0         
	//  145  276:areturn         
		i++;
	//  146  277:iload_3         
	//  147  278:iconst_1        
	//  148  279:iadd            
	//  149  280:istore_3        
		if(true) goto _L2; else goto _L1
	//  150  281:goto            56
_L1:
	}

	public static transient Map zza(ContentResolver contentresolver, String as[])
	{
		contentresolver = ((ContentResolver) (contentresolver.query(zzbTL, ((String []) (null)), ((String) (null)), as, ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:getstatic       #39  <Field Uri zzbTL>
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
	//   18   32:ifeq            66
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:invokeinterface #139 <Method String Cursor.getString(int)>
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:invokeinterface #139 <Method String Cursor.getString(int)>
	//   26   50:invokevirtual   #153 <Method Object TreeMap.put(Object, Object)>
	//   27   53:pop             
		break MISSING_BLOCK_LABEL_66;
	//   28   54:goto            26
		as;
	//   29   57:astore_1        
		((Cursor) (contentresolver)).close();
	//   30   58:aload_0         
	//   31   59:invokeinterface #136 <Method void Cursor.close()>
		throw as;
	//   32   64:aload_1         
	//   33   65:athrow          
		((Cursor) (contentresolver)).close();
	//   34   66:aload_0         
	//   35   67:invokeinterface #136 <Method void Cursor.close()>
		return ((Map) (as));
	//   36   72:aload_1         
	//   37   73:areturn         
	}

	private static void zza(ContentResolver contentresolver)
	{
		if(zzbTP == null)
	//*   0    0:getstatic       #95  <Field HashMap zzbTP>
	//*   1    3:ifnonnull       54
		{
			zzbTO.set(false);
	//    2    6:getstatic       #60  <Field AtomicBoolean zzbTO>
	//    3    9:iconst_0        
	//    4   10:invokevirtual   #159 <Method void AtomicBoolean.set(boolean)>
			zzbTP = new HashMap();
	//    5   13:new             #97  <Class HashMap>
	//    6   16:dup             
	//    7   17:invokespecial   #160 <Method void HashMap()>
	//    8   20:putstatic       #95  <Field HashMap zzbTP>
			zzbTQ = new Object();
	//    9   23:new             #4   <Class Object>
	//   10   26:dup             
	//   11   27:invokespecial   #66  <Method void Object()>
	//   12   30:putstatic       #93  <Field Object zzbTQ>
			zzbTR = false;
	//   13   33:iconst_0        
	//   14   34:putstatic       #111 <Field boolean zzbTR>
			contentresolver.registerContentObserver(CONTENT_URI, true, ((ContentObserver) (new ContentObserver(((Handler) (null))) {

				public void onChange(boolean flag)
				{
					zzbii.zzTf().set(true);
				//    0    0:invokestatic    #20  <Method AtomicBoolean zzbii.zzTf()>
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
	//   18   42:new             #6   <Class zzbii$1>
	//   19   45:dup             
	//   20   46:aconst_null     
	//   21   47:invokespecial   #163 <Method void zzbii$1(Handler)>
	//   22   50:invokevirtual   #167 <Method void ContentResolver.registerContentObserver(Uri, boolean, ContentObserver)>
		} else
	//*  23   53:return          
		if(zzbTO.getAndSet(false))
	//*  24   54:getstatic       #60  <Field AtomicBoolean zzbTO>
	//*  25   57:iconst_0        
	//*  26   58:invokevirtual   #171 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*  27   61:ifeq            53
		{
			zzbTP.clear();
	//   28   64:getstatic       #95  <Field HashMap zzbTP>
	//   29   67:invokevirtual   #174 <Method void HashMap.clear()>
			zzbTQ = new Object();
	//   30   70:new             #4   <Class Object>
	//   31   73:dup             
	//   32   74:invokespecial   #66  <Method void Object()>
	//   33   77:putstatic       #93  <Field Object zzbTQ>
			zzbTR = false;
	//   34   80:iconst_0        
	//   35   81:putstatic       #111 <Field boolean zzbTR>
			return;
	//   36   84:return          
		}
	}

	private static void zza(Object obj, String s, String s1)
	{
		com/google/android/gms/internal/zzbii;
	//    0    0:ldc1            #2   <Class zzbii>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(obj == zzbTQ)
	//*   2    3:aload_0         
	//*   3    4:getstatic       #93  <Field Object zzbTQ>
	//*   4    7:if_acmpne       19
			zzbTP.put(((Object) (s)), ((Object) (s1)));
	//    5   10:getstatic       #95  <Field HashMap zzbTP>
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokevirtual   #175 <Method Object HashMap.put(Object, Object)>
	//    9   18:pop             
		com/google/android/gms/internal/zzbii;
	//   10   19:ldc1            #2   <Class zzbii>
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		obj;
	//   13   23:astore_0        
		com/google/android/gms/internal/zzbii;
	//   14   24:ldc1            #2   <Class zzbii>
		JVM INSTR monitorexit ;
	//   15   26:monitorexit     
		throw obj;
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
		com/google/android/gms/internal/zzbii;
	//    4    6:ldc1            #2   <Class zzbii>
		JVM INSTR monitorenter ;
	//    5    8:monitorenter    
		zza(contentresolver);
	//    6    9:aload_0         
	//    7   10:invokestatic    #91  <Method void zza(ContentResolver)>
		as = zzk(as);
	//    8   13:aload_1         
	//    9   14:invokestatic    #180 <Method String[] zzk(String[])>
	//   10   17:astore_1        
		if(zzbTR && !zzbTP.isEmpty()) goto _L2; else goto _L1
	//   11   18:getstatic       #111 <Field boolean zzbTR>
	//   12   21:ifeq            33
	//   13   24:getstatic       #95  <Field HashMap zzbTP>
	//   14   27:invokevirtual   #115 <Method boolean HashMap.isEmpty()>
	//   15   30:ifeq            50
_L1:
		zzc(contentresolver, zzbTS);
	//   16   33:aload_0         
	//   17   34:getstatic       #64  <Field String[] zzbTS>
	//   18   37:invokestatic    #119 <Method void zzc(ContentResolver, String[])>
_L4:
		com/google/android/gms/internal/zzbii;
	//   19   40:ldc1            #2   <Class zzbii>
		JVM INSTR monitorexit ;
	//   20   42:monitorexit     
		return;
	//   21   43:return          
		contentresolver;
	//   22   44:astore_0        
		com/google/android/gms/internal/zzbii;
	//   23   45:ldc1            #2   <Class zzbii>
		JVM INSTR monitorexit ;
	//   24   47:monitorexit     
		throw contentresolver;
	//   25   48:aload_0         
	//   26   49:athrow          
_L2:
		if(as.length == 0) goto _L4; else goto _L3
	//   27   50:aload_1         
	//   28   51:arraylength     
	//   29   52:ifeq            40
_L3:
		zzc(contentresolver, as);
	//   30   55:aload_0         
	//   31   56:aload_1         
	//   32   57:invokestatic    #119 <Method void zzc(ContentResolver, String[])>
		  goto _L4
	//*  33   60:goto            40
	}

	private static void zzc(ContentResolver contentresolver, String as[])
	{
		zzbTP.putAll(zza(contentresolver, as));
	//    0    0:getstatic       #95  <Field HashMap zzbTP>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #182 <Method Map zza(ContentResolver, String[])>
	//    4    8:invokevirtual   #186 <Method void HashMap.putAll(Map)>
		zzbTR = true;
	//    5   11:iconst_1        
	//    6   12:putstatic       #111 <Field boolean zzbTR>
	//    7   15:return          
	}

	private static String[] zzk(String as[])
	{
		HashSet hashset = new HashSet(((zzbTS.length + as.length) * 4) / 3 + 1);
	//    0    0:new             #188 <Class HashSet>
	//    1    3:dup             
	//    2    4:getstatic       #64  <Field String[] zzbTS>
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
		hashset.addAll(((java.util.Collection) (Arrays.asList(((Object []) (zzbTS))))));
	//   15   21:aload_3         
	//   16   22:getstatic       #64  <Field String[] zzbTS>
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
			zzbTS = (String[])hashset.toArray(((Object []) (new String[hashset.size()])));
	//   55   93:aload_3         
	//   56   94:aload_3         
	//   57   95:invokevirtual   #213 <Method int HashSet.size()>
	//   58   98:anewarray       String[]
	//   59  101:invokevirtual   #217 <Method Object[] HashSet.toArray(Object[])>
	//   60  104:checkcast       #218 <Class String[]>
	//   61  107:putstatic       #64  <Field String[] zzbTS>
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
	public static final Uri zzbTL = Uri.parse("content://com.google.android.gsf.gservices/prefix");
	public static final Pattern zzbTM = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
	public static final Pattern zzbTN = Pattern.compile("^(0|false|f|off|no|n)$", 2);
	private static final AtomicBoolean zzbTO = new AtomicBoolean();
	static HashMap zzbTP;
	private static Object zzbTQ;
	private static boolean zzbTR;
	static String zzbTS[] = new String[0];

	static 
	{
	//    0    0:ldc1            #27  <String "content://com.google.android.gsf.gservices">
	//    1    2:invokestatic    #33  <Method Uri Uri.parse(String)>
	//    2    5:putstatic       #35  <Field Uri CONTENT_URI>
	//    3    8:ldc1            #37  <String "content://com.google.android.gsf.gservices/prefix">
	//    4   10:invokestatic    #33  <Method Uri Uri.parse(String)>
	//    5   13:putstatic       #39  <Field Uri zzbTL>
	//    6   16:ldc1            #41  <String "^(1|true|t|on|yes|y)$">
	//    7   18:iconst_2        
	//    8   19:invokestatic    #47  <Method Pattern Pattern.compile(String, int)>
	//    9   22:putstatic       #49  <Field Pattern zzbTM>
	//   10   25:ldc1            #51  <String "^(0|false|f|off|no|n)$">
	//   11   27:iconst_2        
	//   12   28:invokestatic    #47  <Method Pattern Pattern.compile(String, int)>
	//   13   31:putstatic       #53  <Field Pattern zzbTN>
	//   14   34:new             #55  <Class AtomicBoolean>
	//   15   37:dup             
	//   16   38:invokespecial   #58  <Method void AtomicBoolean()>
	//   17   41:putstatic       #60  <Field AtomicBoolean zzbTO>
	//   18   44:iconst_0        
	//   19   45:anewarray       String[]
	//   20   48:putstatic       #64  <Field String[] zzbTS>
	//*  21   51:return          
	}
}
