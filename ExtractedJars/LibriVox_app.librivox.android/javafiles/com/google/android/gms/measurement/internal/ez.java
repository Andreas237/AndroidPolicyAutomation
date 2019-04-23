// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.g.a;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.*;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.*;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			ed, dz, bt, fc, 
//			s, u, h, ew, 
//			ae, ah, i, ec, 
//			eo, d, q, fa, 
//			en, el, zzag, zzo, 
//			zzfu, er, ee, c

final class ez extends ed
{

	ez(ee ee1)
	{
		super(ee1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #168 <Method void ed(ee)>
	//    3    5:aload_0         
	//    4    6:new             #170 <Class dz>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #176 <Method e bt.m()>
	//    8   14:invokespecial   #179 <Method void dz(e)>
	//    9   17:putfield        #181 <Field dz i>
	//   10   20:aload_0         
	//   11   21:new             #183 <Class fc>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #187 <Method Context bt.n()>
	//   16   30:ldc1            #189 <String "google_app_measurement.db">
	//   17   32:invokespecial   #192 <Method void fc(ez, Context, String)>
	//   18   35:putfield        #194 <Field fc h>
	//   19   38:return          
	}

	static String[] H()
	{
		return b;
	//    0    0:getstatic       #41  <Field String[] b>
	//    1    3:areturn         
	}

	static String[] I()
	{
		return c;
	//    0    0:getstatic       #47  <Field String[] c>
	//    1    3:areturn         
	}

	static String[] J()
	{
		return d;
	//    0    0:getstatic       #141 <Field String[] d>
	//    1    3:areturn         
	}

	static String[] K()
	{
		return f;
	//    0    0:getstatic       #157 <Field String[] f>
	//    1    3:areturn         
	}

	static String[] L()
	{
		return e;
	//    0    0:getstatic       #147 <Field String[] e>
	//    1    3:areturn         
	}

	static String[] M()
	{
		return g;
	//    0    0:getstatic       #163 <Field String[] g>
	//    1    3:areturn         
	}

	private final boolean N()
	{
		return ((bt)this).n().getDatabasePath("google_app_measurement.db").exists();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #187 <Method Context bt.n()>
	//    2    4:ldc1            #189 <String "google_app_measurement.db">
	//    3    6:invokevirtual   #209 <Method File Context.getDatabasePath(String)>
	//    4    9:invokevirtual   #214 <Method boolean File.exists()>
	//    5   12:ireturn         
	}

	private final long a(String s1, String as[], long l)
	{
		String as1[];
		String as2[];
		SQLiteDatabase sqlitedatabase;
		sqlitedatabase = y();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    2    4:astore          7
		as2 = null;
	//    3    6:aconst_null     
	//    4    7:astore          6
		as1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          5
		as = ((String []) (sqlitedatabase.rawQuery(s1, as)));
	//    7   12:aload           7
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #228 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   11   19:astore_2        
		as1 = as;
	//   12   20:aload_2         
	//   13   21:astore          5
		as2 = as;
	//   14   23:aload_2         
	//   15   24:astore          6
		if(!((Cursor) (as)).moveToFirst())
			break MISSING_BLOCK_LABEL_61;
	//   16   26:aload_2         
	//   17   27:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   18   32:ifeq            61
		as1 = as;
	//   19   35:aload_2         
	//   20   36:astore          5
		as2 = as;
	//   21   38:aload_2         
	//   22   39:astore          6
		l = ((Cursor) (as)).getLong(0);
	//   23   41:aload_2         
	//   24   42:iconst_0        
	//   25   43:invokeinterface #237 <Method long Cursor.getLong(int)>
	//   26   48:lstore_3        
		if(as != null)
	//*  27   49:aload_2         
	//*  28   50:ifnull          59
			((Cursor) (as)).close();
	//   29   53:aload_2         
	//   30   54:invokeinterface #240 <Method void Cursor.close()>
		return l;
	//   31   59:lload_3         
	//   32   60:lreturn         
		if(as != null)
	//*  33   61:aload_2         
	//*  34   62:ifnull          71
			((Cursor) (as)).close();
	//   35   65:aload_2         
	//   36   66:invokeinterface #240 <Method void Cursor.close()>
		return l;
	//   37   71:lload_3         
	//   38   72:lreturn         
		s1;
	//   39   73:astore_1        
		break MISSING_BLOCK_LABEL_102;
	//   40   74:goto            102
		as;
	//   41   77:astore_2        
		as1 = as2;
	//   42   78:aload           6
	//   43   80:astore          5
		((bt)this).r().u_().a("Database error", ((Object) (s1)), ((Object) (as)));
	//   44   82:aload_0         
	//   45   83:invokevirtual   #244 <Method s bt.r()>
	//   46   86:invokevirtual   #250 <Method u s.u_()>
	//   47   89:ldc1            #252 <String "Database error">
	//   48   91:aload_1         
	//   49   92:aload_2         
	//   50   93:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		as1 = as2;
	//   51   96:aload           6
	//   52   98:astore          5
		throw as;
	//   53  100:aload_2         
	//   54  101:athrow          
		if(as1 != null)
	//*  55  102:aload           5
	//*  56  104:ifnull          114
			((Cursor) (as1)).close();
	//   57  107:aload           5
	//   58  109:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//   59  114:aload_1         
	//   60  115:athrow          
	}

	static dz a(ez ez1)
	{
		return ez1.i;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field dz i>
	//    2    4:areturn         
	}

	private final Object a(Cursor cursor, int j)
	{
		int k = cursor.getType(j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #263 <Method int Cursor.getType(int)>
	//    3    7:istore_3        
		switch(k)
	//*   4    8:iload_3         
		{
	//*   5    9:tableswitch     0 4: default 44
	//	               0 108
	//	               1 97
	//	               2 86
	//	               3 78
	//	               4 63
		default:
			((bt)this).r().u_().a("Loaded invalid unknown value type, ignoring it", ((Object) (Integer.valueOf(k))));
	//    6   44:aload_0         
	//    7   45:invokevirtual   #244 <Method s bt.r()>
	//    8   48:invokevirtual   #250 <Method u s.u_()>
	//    9   51:ldc2            #265 <String "Loaded invalid unknown value type, ignoring it">
	//   10   54:iload_3         
	//   11   55:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   12   58:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			return ((Object) (null));
	//   13   61:aconst_null     
	//   14   62:areturn         

		case 4: // '\004'
			((bt)this).r().u_().a("Loaded invalid blob type value, ignoring it");
	//   15   63:aload_0         
	//   16   64:invokevirtual   #244 <Method s bt.r()>
	//   17   67:invokevirtual   #250 <Method u s.u_()>
	//   18   70:ldc2            #276 <String "Loaded invalid blob type value, ignoring it">
	//   19   73:invokevirtual   #279 <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return ((Object) (null));
	//   20   76:aconst_null     
	//   21   77:areturn         

		case 3: // '\003'
			return ((Object) (cursor.getString(j)));
	//   22   78:aload_1         
	//   23   79:iload_2         
	//   24   80:invokeinterface #283 <Method String Cursor.getString(int)>
	//   25   85:areturn         

		case 2: // '\002'
			return ((Object) (Double.valueOf(cursor.getDouble(j))));
	//   26   86:aload_1         
	//   27   87:iload_2         
	//   28   88:invokeinterface #287 <Method double Cursor.getDouble(int)>
	//   29   93:invokestatic    #292 <Method Double Double.valueOf(double)>
	//   30   96:areturn         

		case 1: // '\001'
			return ((Object) (Long.valueOf(cursor.getLong(j))));
	//   31   97:aload_1         
	//   32   98:iload_2         
	//   33   99:invokeinterface #237 <Method long Cursor.getLong(int)>
	//   34  104:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   35  107:areturn         

		case 0: // '\0'
			((bt)this).r().u_().a("Loaded invalid null value from database");
	//   36  108:aload_0         
	//   37  109:invokevirtual   #244 <Method s bt.r()>
	//   38  112:invokevirtual   #250 <Method u s.u_()>
	//   39  115:ldc2            #299 <String "Loaded invalid null value from database">
	//   40  118:invokevirtual   #279 <Method void com.google.android.gms.measurement.internal.u.a(String)>
			return ((Object) (null));
	//   41  121:aconst_null     
	//   42  122:areturn         
		}
	}

	private static void a(ContentValues contentvalues, String s1, Object obj)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		am.a(obj);
	//    3    5:aload_2         
	//    4    6:invokestatic    #308 <Method Object am.a(Object)>
	//    5    9:pop             
		if(obj instanceof String)
	//*   6   10:aload_2         
	//*   7   11:instanceof      #19  <Class String>
	//*   8   14:ifeq            27
		{
			contentvalues.put(s1, (String)obj);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:checkcast       #19  <Class String>
	//   13   23:invokevirtual   #314 <Method void ContentValues.put(String, String)>
			return;
	//   14   26:return          
		}
		if(obj instanceof Long)
	//*  15   27:aload_2         
	//*  16   28:instanceof      #294 <Class Long>
	//*  17   31:ifeq            44
		{
			contentvalues.put(s1, (Long)obj);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:checkcast       #294 <Class Long>
	//   22   40:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
			return;
	//   23   43:return          
		}
		if(obj instanceof Double)
	//*  24   44:aload_2         
	//*  25   45:instanceof      #289 <Class Double>
	//*  26   48:ifeq            61
		{
			contentvalues.put(s1, (Double)obj);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:aload_2         
	//   30   54:checkcast       #289 <Class Double>
	//   31   57:invokevirtual   #320 <Method void ContentValues.put(String, Double)>
			return;
	//   32   60:return          
		} else
		{
			throw new IllegalArgumentException("Invalid value type");
	//   33   61:new             #322 <Class IllegalArgumentException>
	//   34   64:dup             
	//   35   65:ldc2            #324 <String "Invalid value type">
	//   36   68:invokespecial   #326 <Method void IllegalArgumentException(String)>
	//   37   71:athrow          
		}
	}

	private final boolean a(String s1, int j, bd bd1)
	{
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method void ed.k()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #334 <Method void bt.d()>
		am.a(s1);
	//    4    8:aload_1         
	//    5    9:invokestatic    #305 <Method String am.a(String)>
	//    6   12:pop             
		am.a(((Object) (bd1)));
	//    7   13:aload_3         
	//    8   14:invokestatic    #308 <Method Object am.a(Object)>
	//    9   17:pop             
		if(TextUtils.isEmpty(((CharSequence) (bd1.b))))
	//*  10   18:aload_3         
	//*  11   19:getfield        #339 <Field String bd.b>
	//*  12   22:invokestatic    #345 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   25:ifeq            58
		{
			((bt)this).r().i().a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (Integer.valueOf(j))), ((Object) (String.valueOf(((Object) (bd1.a))))));
	//   14   28:aload_0         
	//   15   29:invokevirtual   #244 <Method s bt.r()>
	//   16   32:invokevirtual   #347 <Method u s.i()>
	//   17   35:ldc2            #349 <String "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId">
	//   18   38:aload_1         
	//   19   39:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   20   42:iload_2         
	//   21   43:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   22   46:aload_3         
	//   23   47:getfield        #355 <Field Integer bd.a>
	//   24   50:invokestatic    #358 <Method String String.valueOf(Object)>
	//   25   53:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
			return false;
	//   26   56:iconst_0        
	//   27   57:ireturn         
		}
		byte abyte0[];
		ContentValues contentvalues;
		try
		{
			abyte0 = new byte[((iy) (bd1)).e()];
	//   28   58:aload_3         
	//   29   59:invokevirtual   #366 <Method int iy.e()>
	//   30   62:newarray        byte[]
	//   31   64:astore          4
			iq iq1 = iq.a(abyte0, 0, abyte0.length);
	//   32   66:aload           4
	//   33   68:iconst_0        
	//   34   69:aload           4
	//   35   71:arraylength     
	//   36   72:invokestatic    #371 <Method iq iq.a(byte[], int, int)>
	//   37   75:astore          5
			((iy) (bd1)).a(iq1);
	//   38   77:aload_3         
	//   39   78:aload           5
	//   40   80:invokevirtual   #374 <Method void iy.a(iq)>
			iq1.a();
	//   41   83:aload           5
	//   42   85:invokevirtual   #376 <Method void iq.a()>
		}
	//*  43   88:new             #310 <Class ContentValues>
	//*  44   91:dup             
	//*  45   92:invokespecial   #378 <Method void ContentValues()>
	//*  46   95:astore          5
	//*  47   97:aload           5
	//*  48   99:ldc2            #380 <String "app_id">
	//*  49  102:aload_1         
	//*  50  103:invokevirtual   #314 <Method void ContentValues.put(String, String)>
	//*  51  106:aload           5
	//*  52  108:ldc2            #382 <String "audience_id">
	//*  53  111:iload_2         
	//*  54  112:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//*  55  115:invokevirtual   #385 <Method void ContentValues.put(String, Integer)>
	//*  56  118:aload           5
	//*  57  120:ldc2            #387 <String "filter_id">
	//*  58  123:aload_3         
	//*  59  124:getfield        #355 <Field Integer bd.a>
	//*  60  127:invokevirtual   #385 <Method void ContentValues.put(String, Integer)>
	//*  61  130:aload           5
	//*  62  132:ldc2            #389 <String "event_name">
	//*  63  135:aload_3         
	//*  64  136:getfield        #339 <Field String bd.b>
	//*  65  139:invokevirtual   #314 <Method void ContentValues.put(String, String)>
	//*  66  142:aload           5
	//*  67  144:ldc2            #391 <String "data">
	//*  68  147:aload           4
	//*  69  149:invokevirtual   #394 <Method void ContentValues.put(String, byte[])>
	//*  70  152:aload_0         
	//*  71  153:invokevirtual   #222 <Method SQLiteDatabase y()>
	//*  72  156:ldc2            #396 <String "event_filters">
	//*  73  159:aconst_null     
	//*  74  160:aload           5
	//*  75  162:iconst_5        
	//*  76  163:invokevirtual   #400 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//*  77  166:ldc2w           #401 <Long -1L>
	//*  78  169:lcmp            
	//*  79  170:ifne            190
	//*  80  173:aload_0         
	//*  81  174:invokevirtual   #244 <Method s bt.r()>
	//*  82  177:invokevirtual   #250 <Method u s.u_()>
	//*  83  180:ldc2            #404 <String "Failed to insert event filter (got -1). appId">
	//*  84  183:aload_1         
	//*  85  184:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  86  187:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//*  87  190:iconst_1        
	//*  88  191:ireturn         
	//*  89  192:astore_3        
	//*  90  193:aload_0         
	//*  91  194:invokevirtual   #244 <Method s bt.r()>
	//*  92  197:invokevirtual   #250 <Method u s.u_()>
	//*  93  200:ldc2            #406 <String "Error storing event filter. appId">
	//*  94  203:aload_1         
	//*  95  204:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  96  207:aload_3         
	//*  97  208:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//*  98  211:iconst_0        
	//*  99  212:ireturn         
		// Misplaced declaration of an exception variable
		catch(bd bd1)
	//* 100  213:astore_3        
		{
			((bt)this).r().u_().a("Configuration loss. Failed to serialize event filter. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (bd1)));
	//  101  214:aload_0         
	//  102  215:invokevirtual   #244 <Method s bt.r()>
	//  103  218:invokevirtual   #250 <Method u s.u_()>
	//  104  221:ldc2            #408 <String "Configuration loss. Failed to serialize event filter. appId">
	//  105  224:aload_1         
	//  106  225:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  107  228:aload_3         
	//  108  229:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
			return false;
	//  109  232:iconst_0        
	//  110  233:ireturn         
		}
		contentvalues = new ContentValues();
		contentvalues.put("app_id", s1);
		contentvalues.put("audience_id", Integer.valueOf(j));
		contentvalues.put("filter_id", bd1.a);
		contentvalues.put("event_name", bd1.b);
		contentvalues.put("data", abyte0);
		try
		{
			if(y().insertWithOnConflict("event_filters", ((String) (null)), contentvalues, 5) == -1L)
				((bt)this).r().u_().a("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.s.a(s1));
		}
		// Misplaced declaration of an exception variable
		catch(bd bd1)
		{
			((bt)this).r().u_().a("Error storing event filter. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (bd1)));
			return false;
		}
		return true;
	}

	private final boolean a(String s1, int j, bg bg1)
	{
label0:
		{
			((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method void ed.k()>
			((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #334 <Method void bt.d()>
			am.a(s1);
	//    4    8:aload_1         
	//    5    9:invokestatic    #305 <Method String am.a(String)>
	//    6   12:pop             
			am.a(((Object) (bg1)));
	//    7   13:aload_3         
	//    8   14:invokestatic    #308 <Method Object am.a(Object)>
	//    9   17:pop             
			if(TextUtils.isEmpty(((CharSequence) (bg1.b))))
	//*  10   18:aload_3         
	//*  11   19:getfield        #412 <Field String bg.b>
	//*  12   22:invokestatic    #345 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   25:ifeq            58
			{
				((bt)this).r().i().a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (Integer.valueOf(j))), ((Object) (String.valueOf(((Object) (bg1.a))))));
	//   14   28:aload_0         
	//   15   29:invokevirtual   #244 <Method s bt.r()>
	//   16   32:invokevirtual   #347 <Method u s.i()>
	//   17   35:ldc2            #414 <String "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId">
	//   18   38:aload_1         
	//   19   39:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   20   42:iload_2         
	//   21   43:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   22   46:aload_3         
	//   23   47:getfield        #415 <Field Integer bg.a>
	//   24   50:invokestatic    #358 <Method String String.valueOf(Object)>
	//   25   53:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
				return false;
	//   26   56:iconst_0        
	//   27   57:ireturn         
			}
			byte abyte0[];
			ContentValues contentvalues;
			try
			{
				abyte0 = new byte[((iy) (bg1)).e()];
	//   28   58:aload_3         
	//   29   59:invokevirtual   #366 <Method int iy.e()>
	//   30   62:newarray        byte[]
	//   31   64:astore          4
				iq iq1 = iq.a(abyte0, 0, abyte0.length);
	//   32   66:aload           4
	//   33   68:iconst_0        
	//   34   69:aload           4
	//   35   71:arraylength     
	//   36   72:invokestatic    #371 <Method iq iq.a(byte[], int, int)>
	//   37   75:astore          5
				((iy) (bg1)).a(iq1);
	//   38   77:aload_3         
	//   39   78:aload           5
	//   40   80:invokevirtual   #374 <Method void iy.a(iq)>
				iq1.a();
	//   41   83:aload           5
	//   42   85:invokevirtual   #376 <Method void iq.a()>
			}
	//*  43   88:new             #310 <Class ContentValues>
	//*  44   91:dup             
	//*  45   92:invokespecial   #378 <Method void ContentValues()>
	//*  46   95:astore          5
	//*  47   97:aload           5
	//*  48   99:ldc2            #380 <String "app_id">
	//*  49  102:aload_1         
	//*  50  103:invokevirtual   #314 <Method void ContentValues.put(String, String)>
	//*  51  106:aload           5
	//*  52  108:ldc2            #382 <String "audience_id">
	//*  53  111:iload_2         
	//*  54  112:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//*  55  115:invokevirtual   #385 <Method void ContentValues.put(String, Integer)>
	//*  56  118:aload           5
	//*  57  120:ldc2            #387 <String "filter_id">
	//*  58  123:aload_3         
	//*  59  124:getfield        #415 <Field Integer bg.a>
	//*  60  127:invokevirtual   #385 <Method void ContentValues.put(String, Integer)>
	//*  61  130:aload           5
	//*  62  132:ldc2            #417 <String "property_name">
	//*  63  135:aload_3         
	//*  64  136:getfield        #412 <Field String bg.b>
	//*  65  139:invokevirtual   #314 <Method void ContentValues.put(String, String)>
	//*  66  142:aload           5
	//*  67  144:ldc2            #391 <String "data">
	//*  68  147:aload           4
	//*  69  149:invokevirtual   #394 <Method void ContentValues.put(String, byte[])>
	//*  70  152:aload_0         
	//*  71  153:invokevirtual   #222 <Method SQLiteDatabase y()>
	//*  72  156:ldc2            #419 <String "property_filters">
	//*  73  159:aconst_null     
	//*  74  160:aload           5
	//*  75  162:iconst_5        
	//*  76  163:invokevirtual   #400 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//*  77  166:ldc2w           #401 <Long -1L>
	//*  78  169:lcmp            
	//*  79  170:ifne            192
	//*  80  173:aload_0         
	//*  81  174:invokevirtual   #244 <Method s bt.r()>
	//*  82  177:invokevirtual   #250 <Method u s.u_()>
	//*  83  180:ldc2            #421 <String "Failed to insert property filter (got -1). appId">
	//*  84  183:aload_1         
	//*  85  184:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  86  187:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//*  87  190:iconst_0        
	//*  88  191:ireturn         
	//*  89  192:iconst_1        
	//*  90  193:ireturn         
	//*  91  194:astore_3        
	//*  92  195:aload_0         
	//*  93  196:invokevirtual   #244 <Method s bt.r()>
	//*  94  199:invokevirtual   #250 <Method u s.u_()>
	//*  95  202:ldc2            #423 <String "Error storing property filter. appId">
	//*  96  205:aload_1         
	//*  97  206:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  98  209:aload_3         
	//*  99  210:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//* 100  213:iconst_0        
	//* 101  214:ireturn         
			// Misplaced declaration of an exception variable
			catch(bg bg1)
	//* 102  215:astore_3        
			{
				((bt)this).r().u_().a("Configuration loss. Failed to serialize property filter. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (bg1)));
	//  103  216:aload_0         
	//  104  217:invokevirtual   #244 <Method s bt.r()>
	//  105  220:invokevirtual   #250 <Method u s.u_()>
	//  106  223:ldc2            #425 <String "Configuration loss. Failed to serialize property filter. appId">
	//  107  226:aload_1         
	//  108  227:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  109  230:aload_3         
	//  110  231:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
				return false;
	//  111  234:iconst_0        
	//  112  235:ireturn         
			}
			contentvalues = new ContentValues();
			contentvalues.put("app_id", s1);
			contentvalues.put("audience_id", Integer.valueOf(j));
			contentvalues.put("filter_id", bg1.a);
			contentvalues.put("property_name", bg1.b);
			contentvalues.put("data", abyte0);
			try
			{
				if(y().insertWithOnConflict("property_filters", ((String) (null)), contentvalues, 5) != -1L)
					break label0;
				((bt)this).r().u_().a("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.s.a(s1));
			}
			// Misplaced declaration of an exception variable
			catch(bg bg1)
			{
				((bt)this).r().u_().a("Error storing property filter. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (bg1)));
				return false;
			}
			return false;
		}
		return true;
	}

	private final boolean a(String s1, List list)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		((ed)this).k();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #332 <Method void ed.k()>
		((bt)this).d();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #334 <Method void bt.d()>
		SQLiteDatabase sqlitedatabase = y();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    9   17:astore          7
		int k;
		long l;
		Object obj;
		try
		{
			l = b("select count(1) from audience_filter_values where app_id=?", new String[] {
				s1
			});
	//   10   19:aload_0         
	//   11   20:ldc2            #428 <String "select count(1) from audience_filter_values where app_id=?">
	//   12   23:iconst_1        
	//   13   24:anewarray       String[]
	//   14   27:dup             
	//   15   28:iconst_0        
	//   16   29:aload_1         
	//   17   30:aastore         
	//   18   31:invokespecial   #431 <Method long b(String, String[])>
	//   19   34:lstore          5
		}
	//*  20   36:iconst_0        
	//*  21   37:sipush          2000
	//*  22   40:aload_0         
	//*  23   41:invokevirtual   #435 <Method ew bt.t()>
	//*  24   44:aload_1         
	//*  25   45:getstatic       #440 <Field i h.N>
	//*  26   48:invokevirtual   #445 <Method int ew.b(String, i)>
	//*  27   51:invokestatic    #451 <Method int Math.min(int, int)>
	//*  28   54:invokestatic    #454 <Method int Math.max(int, int)>
	//*  29   57:istore          4
	//*  30   59:lload           5
	//*  31   61:iload           4
	//*  32   63:i2l             
	//*  33   64:lcmp            
	//*  34   65:ifgt            70
	//*  35   68:iconst_0        
	//*  36   69:ireturn         
	//*  37   70:new             #456 <Class ArrayList>
	//*  38   73:dup             
	//*  39   74:invokespecial   #457 <Method void ArrayList()>
	//*  40   77:astore          8
	//*  41   79:iconst_0        
	//*  42   80:istore_3        
	//*  43   81:iload_3         
	//*  44   82:aload_2         
	//*  45   83:invokeinterface #462 <Method int List.size()>
	//*  46   88:icmpge          143
	//*  47   91:aload_2         
	//*  48   92:iload_3         
	//*  49   93:invokeinterface #466 <Method Object List.get(int)>
	//*  50   98:checkcast       #267 <Class Integer>
	//*  51  101:astore          9
	//*  52  103:aload           9
	//*  53  105:ifnull          141
	//*  54  108:aload           9
	//*  55  110:instanceof      #267 <Class Integer>
	//*  56  113:ifne            118
	//*  57  116:iconst_0        
	//*  58  117:ireturn         
	//*  59  118:aload           8
	//*  60  120:aload           9
	//*  61  122:invokevirtual   #469 <Method int Integer.intValue()>
	//*  62  125:invokestatic    #472 <Method String Integer.toString(int)>
	//*  63  128:invokeinterface #476 <Method boolean List.add(Object)>
	//*  64  133:pop             
	//*  65  134:iload_3         
	//*  66  135:iconst_1        
	//*  67  136:iadd            
	//*  68  137:istore_3        
	//*  69  138:goto            81
	//*  70  141:iconst_0        
	//*  71  142:ireturn         
	//*  72  143:ldc2            #478 <String ",">
	//*  73  146:aload           8
	//*  74  148:invokestatic    #482 <Method String TextUtils.join(CharSequence, Iterable)>
	//*  75  151:astore_2        
	//*  76  152:new             #484 <Class StringBuilder>
	//*  77  155:dup             
	//*  78  156:aload_2         
	//*  79  157:invokestatic    #358 <Method String String.valueOf(Object)>
	//*  80  160:invokevirtual   #487 <Method int String.length()>
	//*  81  163:iconst_2        
	//*  82  164:iadd            
	//*  83  165:invokespecial   #490 <Method void StringBuilder(int)>
	//*  84  168:astore          8
	//*  85  170:aload           8
	//*  86  172:ldc2            #492 <String "(">
	//*  87  175:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//*  88  178:pop             
	//*  89  179:aload           8
	//*  90  181:aload_2         
	//*  91  182:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//*  92  185:pop             
	//*  93  186:aload           8
	//*  94  188:ldc2            #498 <String ")">
	//*  95  191:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//*  96  194:pop             
	//*  97  195:aload           8
	//*  98  197:invokevirtual   #501 <Method String StringBuilder.toString()>
	//*  99  200:astore_2        
	//* 100  201:new             #484 <Class StringBuilder>
	//* 101  204:dup             
	//* 102  205:aload_2         
	//* 103  206:invokestatic    #358 <Method String String.valueOf(Object)>
	//* 104  209:invokevirtual   #487 <Method int String.length()>
	//* 105  212:sipush          140
	//* 106  215:iadd            
	//* 107  216:invokespecial   #490 <Method void StringBuilder(int)>
	//* 108  219:astore          8
	//* 109  221:aload           8
	//* 110  223:ldc2            #503 <String "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ">
	//* 111  226:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//* 112  229:pop             
	//* 113  230:aload           8
	//* 114  232:aload_2         
	//* 115  233:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//* 116  236:pop             
	//* 117  237:aload           8
	//* 118  239:ldc2            #505 <String " order by rowid desc limit -1 offset ?)">
	//* 119  242:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//* 120  245:pop             
	//* 121  246:aload           7
	//* 122  248:ldc2            #507 <String "audience_filter_values">
	//* 123  251:aload           8
	//* 124  253:invokevirtual   #501 <Method String StringBuilder.toString()>
	//* 125  256:iconst_2        
	//* 126  257:anewarray       String[]
	//* 127  260:dup             
	//* 128  261:iconst_0        
	//* 129  262:aload_1         
	//* 130  263:aastore         
	//* 131  264:dup             
	//* 132  265:iconst_1        
	//* 133  266:iload           4
	//* 134  268:invokestatic    #472 <Method String Integer.toString(int)>
	//* 135  271:aastore         
	//* 136  272:invokevirtual   #511 <Method int SQLiteDatabase.delete(String, String, String[])>
	//* 137  275:ifle            280
	//* 138  278:iconst_1        
	//* 139  279:ireturn         
	//* 140  280:iconst_0        
	//* 141  281:ireturn         
		// Misplaced declaration of an exception variable
		catch(List list)
	//* 142  282:astore_2        
		{
			((bt)this).r().u_().a("Database error querying filters. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (list)));
	//  143  283:aload_0         
	//  144  284:invokevirtual   #244 <Method s bt.r()>
	//  145  287:invokevirtual   #250 <Method u s.u_()>
	//  146  290:ldc2            #513 <String "Database error querying filters. appId">
	//  147  293:aload_1         
	//  148  294:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  149  297:aload_2         
	//  150  298:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
			return false;
	//  151  301:iconst_0        
	//  152  302:ireturn         
		}
		k = Math.max(0, Math.min(2000, ((bt)this).t().b(s1, h.N)));
		if(l <= (long)k)
			return false;
		obj = ((Object) (new ArrayList()));
		for(int j = 0; j < list.size();)
		{
			Integer integer = (Integer)list.get(j);
			if(integer != null)
			{
				if(!(integer instanceof Integer))
					return false;
				((List) (obj)).add(((Object) (Integer.toString(integer.intValue()))));
				j++;
			} else
			{
				return false;
			}
		}

		list = ((List) (TextUtils.join(",", ((Iterable) (obj)))));
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (list))).length() + 2)));
		((StringBuilder) (obj)).append("(");
		((StringBuilder) (obj)).append(((String) (list)));
		((StringBuilder) (obj)).append(")");
		list = ((List) (((StringBuilder) (obj)).toString()));
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (list))).length() + 140)));
		((StringBuilder) (obj)).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
		((StringBuilder) (obj)).append(((String) (list)));
		((StringBuilder) (obj)).append(" order by rowid desc limit -1 offset ?)");
		return sqlitedatabase.delete("audience_filter_values", ((StringBuilder) (obj)).toString(), new String[] {
			s1, Integer.toString(k)
		}) > 0;
	}

	private final long b(String s1, String as[])
	{
		String as1[];
		String as2[];
		SQLiteDatabase sqlitedatabase;
		sqlitedatabase = y();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    2    4:astore          7
		as2 = null;
	//    3    6:aconst_null     
	//    4    7:astore          6
		as1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          5
		as = ((String []) (sqlitedatabase.rawQuery(s1, as)));
	//    7   12:aload           7
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #228 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   11   19:astore_2        
		as1 = as;
	//   12   20:aload_2         
	//   13   21:astore          5
		as2 = as;
	//   14   23:aload_2         
	//   15   24:astore          6
		if(!((Cursor) (as)).moveToFirst())
			break MISSING_BLOCK_LABEL_61;
	//   16   26:aload_2         
	//   17   27:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   18   32:ifeq            61
		as1 = as;
	//   19   35:aload_2         
	//   20   36:astore          5
		as2 = as;
	//   21   38:aload_2         
	//   22   39:astore          6
		long l = ((Cursor) (as)).getLong(0);
	//   23   41:aload_2         
	//   24   42:iconst_0        
	//   25   43:invokeinterface #237 <Method long Cursor.getLong(int)>
	//   26   48:lstore_3        
		if(as != null)
	//*  27   49:aload_2         
	//*  28   50:ifnull          59
			((Cursor) (as)).close();
	//   29   53:aload_2         
	//   30   54:invokeinterface #240 <Method void Cursor.close()>
		return l;
	//   31   59:lload_3         
	//   32   60:lreturn         
		as1 = as;
	//   33   61:aload_2         
	//   34   62:astore          5
		as2 = as;
	//   35   64:aload_2         
	//   36   65:astore          6
		try
		{
			throw new SQLiteException("Database returned empty set");
	//   37   67:new             #218 <Class SQLiteException>
	//   38   70:dup             
	//   39   71:ldc2            #515 <String "Database returned empty set">
	//   40   74:invokespecial   #516 <Method void SQLiteException(String)>
	//   41   77:athrow          
		}
	//*  42   78:astore_1        
	//*  43   79:goto            107
		// Misplaced declaration of an exception variable
		catch(String as[])
	//*  44   82:astore_2        
		{
			as1 = as2;
	//   45   83:aload           6
	//   46   85:astore          5
		}
		break MISSING_BLOCK_LABEL_87;
		s1;
		break MISSING_BLOCK_LABEL_107;
		((bt)this).r().u_().a("Database error", ((Object) (s1)), ((Object) (as)));
	//   47   87:aload_0         
	//   48   88:invokevirtual   #244 <Method s bt.r()>
	//   49   91:invokevirtual   #250 <Method u s.u_()>
	//   50   94:ldc1            #252 <String "Database error">
	//   51   96:aload_1         
	//   52   97:aload_2         
	//   53   98:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		as1 = as2;
	//   54  101:aload           6
	//   55  103:astore          5
		throw as;
	//   56  105:aload_2         
	//   57  106:athrow          
		if(as1 != null)
	//*  58  107:aload           5
	//*  59  109:ifnull          119
			((Cursor) (as1)).close();
	//   60  112:aload           5
	//   61  114:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//   62  119:aload_1         
	//   63  120:athrow          
	}

	public final boolean A()
	{
		return b("select count(1) > 0 from queue where has_realtime = 1", ((String []) (null))) != 0L;
	//    0    0:aload_0         
	//    1    1:ldc2            #519 <String "select count(1) > 0 from queue where has_realtime = 1">
	//    2    4:aconst_null     
	//    3    5:invokespecial   #431 <Method long b(String, String[])>
	//    4    8:lconst_0        
	//    5    9:lcmp            
	//    6   10:ifeq            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	final void B()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #332 <Method void ed.k()>
		if(!N())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #522 <Method boolean N()>
	//*   6   12:ifne            16
			return;
	//    7   15:return          
		long l = ((bt)this).s().f.a();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #526 <Method ae bt.s()>
	//   10   20:getfield        #531 <Field ah ae.f>
	//   11   23:invokevirtual   #536 <Method long com.google.android.gms.measurement.internal.ah.a()>
	//   12   26:lstore_2        
		long l1 = ((bt)this).m().b();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #176 <Method e bt.m()>
	//   15   31:invokeinterface #540 <Method long e.b()>
	//   16   36:lstore          4
		if(Math.abs(l1 - l) > ((Long)h.G.b()).longValue())
	//*  17   38:lload           4
	//*  18   40:lload_2         
	//*  19   41:lsub            
	//*  20   42:invokestatic    #544 <Method long Math.abs(long)>
	//*  21   45:getstatic       #547 <Field i h.G>
	//*  22   48:invokevirtual   #552 <Method Object i.b()>
	//*  23   51:checkcast       #294 <Class Long>
	//*  24   54:invokevirtual   #555 <Method long Long.longValue()>
	//*  25   57:lcmp            
	//*  26   58:ifle            151
		{
			((bt)this).s().f.a(l1);
	//   27   61:aload_0         
	//   28   62:invokevirtual   #526 <Method ae bt.s()>
	//   29   65:getfield        #531 <Field ah ae.f>
	//   30   68:lload           4
	//   31   70:invokevirtual   #558 <Method void com.google.android.gms.measurement.internal.ah.a(long)>
			((bt)this).d();
	//   32   73:aload_0         
	//   33   74:invokevirtual   #334 <Method void bt.d()>
			((ed)this).k();
	//   34   77:aload_0         
	//   35   78:invokevirtual   #332 <Method void ed.k()>
			if(N())
	//*  36   81:aload_0         
	//*  37   82:invokespecial   #522 <Method boolean N()>
	//*  38   85:ifeq            151
			{
				int j = y().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] {
					String.valueOf(((bt)this).m().a()), String.valueOf(ew.j())
				});
	//   39   88:aload_0         
	//   40   89:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   41   92:ldc2            #560 <String "queue">
	//   42   95:ldc2            #562 <String "abs(bundle_end_timestamp - ?) > cast(? as integer)">
	//   43   98:iconst_2        
	//   44   99:anewarray       String[]
	//   45  102:dup             
	//   46  103:iconst_0        
	//   47  104:aload_0         
	//   48  105:invokevirtual   #176 <Method e bt.m()>
	//   49  108:invokeinterface #563 <Method long e.a()>
	//   50  113:invokestatic    #566 <Method String String.valueOf(long)>
	//   51  116:aastore         
	//   52  117:dup             
	//   53  118:iconst_1        
	//   54  119:invokestatic    #569 <Method long ew.j()>
	//   55  122:invokestatic    #566 <Method String String.valueOf(long)>
	//   56  125:aastore         
	//   57  126:invokevirtual   #511 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   58  129:istore_1        
				if(j > 0)
	//*  59  130:iload_1         
	//*  60  131:ifle            151
					((bt)this).r().x().a("Deleted stale rows. rowsDeleted", ((Object) (Integer.valueOf(j))));
	//   61  134:aload_0         
	//   62  135:invokevirtual   #244 <Method s bt.r()>
	//   63  138:invokevirtual   #572 <Method u s.x()>
	//   64  141:ldc2            #574 <String "Deleted stale rows. rowsDeleted">
	//   65  144:iload_1         
	//   66  145:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   67  148:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			}
		}
	//   68  151:return          
	}

	public final long C()
	{
		return a("select max(bundle_end_timestamp) from queue", ((String []) (null)), 0L);
	//    0    0:aload_0         
	//    1    1:ldc2            #577 <String "select max(bundle_end_timestamp) from queue">
	//    2    4:aconst_null     
	//    3    5:lconst_0        
	//    4    6:invokespecial   #579 <Method long a(String, String[], long)>
	//    5    9:lreturn         
	}

	public final long D()
	{
		return a("select max(timestamp) from raw_events", ((String []) (null)), 0L);
	//    0    0:aload_0         
	//    1    1:ldc2            #582 <String "select max(timestamp) from raw_events">
	//    2    4:aconst_null     
	//    3    5:lconst_0        
	//    4    6:invokespecial   #579 <Method long a(String, String[], long)>
	//    5    9:lreturn         
	}

	public final boolean E()
	{
		return b("select count(1) > 0 from raw_events", ((String []) (null))) != 0L;
	//    0    0:aload_0         
	//    1    1:ldc2            #585 <String "select count(1) > 0 from raw_events">
	//    2    4:aconst_null     
	//    3    5:invokespecial   #431 <Method long b(String, String[])>
	//    4    8:lconst_0        
	//    5    9:lcmp            
	//    6   10:ifeq            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	public final boolean F()
	{
		return b("select count(1) > 0 from raw_events where realtime = 1", ((String []) (null))) != 0L;
	//    0    0:aload_0         
	//    1    1:ldc2            #588 <String "select count(1) > 0 from raw_events where realtime = 1">
	//    2    4:aconst_null     
	//    3    5:invokespecial   #431 <Method long b(String, String[])>
	//    4    8:lconst_0        
	//    5    9:lcmp            
	//    6   10:ifeq            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	public final long G()
	{
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		Cursor cursor = y().rawQuery("select rowid from raw_events order by rowid desc limit 1;", ((String []) (null)));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    6   10:ldc2            #590 <String "select rowid from raw_events order by rowid desc limit 1;">
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #228 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//    9   17:astore          6
		obj = ((Object) (cursor));
	//   10   19:aload           6
	//   11   21:astore          4
		obj1 = ((Object) (cursor));
	//   12   23:aload           6
	//   13   25:astore          5
		boolean flag = cursor.moveToFirst();
	//   14   27:aload           6
	//   15   29:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   16   34:istore_1        
		if(!flag)
	//*  17   35:iload_1         
	//*  18   36:ifne            55
		{
			if(cursor != null)
	//*  19   39:aload           6
	//*  20   41:ifnull          51
				cursor.close();
	//   21   44:aload           6
	//   22   46:invokeinterface #240 <Method void Cursor.close()>
			return -1L;
	//   23   51:ldc2w           #401 <Long -1L>
	//   24   54:lreturn         
		}
		obj = ((Object) (cursor));
	//   25   55:aload           6
	//   26   57:astore          4
		obj1 = ((Object) (cursor));
	//   27   59:aload           6
	//   28   61:astore          5
		long l = cursor.getLong(0);
	//   29   63:aload           6
	//   30   65:iconst_0        
	//   31   66:invokeinterface #237 <Method long Cursor.getLong(int)>
	//   32   71:lstore_2        
		if(cursor != null)
	//*  33   72:aload           6
	//*  34   74:ifnull          84
			cursor.close();
	//   35   77:aload           6
	//   36   79:invokeinterface #240 <Method void Cursor.close()>
		return l;
	//   37   84:lload_2         
	//   38   85:lreturn         
		obj1;
	//   39   86:astore          5
		break MISSING_BLOCK_LABEL_128;
	//   40   88:goto            128
		SQLiteException sqliteexception;
		sqliteexception;
	//   41   91:astore          6
		obj = obj1;
	//   42   93:aload           5
	//   43   95:astore          4
		((bt)this).r().u_().a("Error querying raw events", ((Object) (sqliteexception)));
	//   44   97:aload_0         
	//   45   98:invokevirtual   #244 <Method s bt.r()>
	//   46  101:invokevirtual   #250 <Method u s.u_()>
	//   47  104:ldc2            #592 <String "Error querying raw events">
	//   48  107:aload           6
	//   49  109:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		if(obj1 != null)
	//*  50  112:aload           5
	//*  51  114:ifnull          124
			((Cursor) (obj1)).close();
	//   52  117:aload           5
	//   53  119:invokeinterface #240 <Method void Cursor.close()>
		return -1L;
	//   54  124:ldc2w           #401 <Long -1L>
	//   55  127:lreturn         
		if(obj != null)
	//*  56  128:aload           4
	//*  57  130:ifnull          140
			((Cursor) (obj)).close();
	//   58  133:aload           4
	//   59  135:invokeinterface #240 <Method void Cursor.close()>
		throw obj1;
	//   60  140:aload           5
	//   61  142:athrow          
	}

	public final long a(bq bq1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #332 <Method void ed.k()>
		am.a(((Object) (bq1)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #308 <Method Object am.a(Object)>
	//    6   12:pop             
		am.a(bq1.o);
	//    7   13:aload_1         
	//    8   14:getfield        #598 <Field String bq.o>
	//    9   17:invokestatic    #305 <Method String am.a(String)>
	//   10   20:pop             
		long l;
		byte abyte0[];
		Object obj;
		MessageDigest messagedigest;
		try
		{
			abyte0 = new byte[((iy) (bq1)).e()];
	//   11   21:aload_1         
	//   12   22:invokevirtual   #366 <Method int iy.e()>
	//   13   25:newarray        byte[]
	//   14   27:astore          4
			iq iq1 = iq.a(abyte0, 0, abyte0.length);
	//   15   29:aload           4
	//   16   31:iconst_0        
	//   17   32:aload           4
	//   18   34:arraylength     
	//   19   35:invokestatic    #371 <Method iq iq.a(byte[], int, int)>
	//   20   38:astore          5
			((iy) (bq1)).a(iq1);
	//   21   40:aload_1         
	//   22   41:aload           5
	//   23   43:invokevirtual   #374 <Method void iy.a(iq)>
			iq1.a();
	//   24   46:aload           5
	//   25   48:invokevirtual   #376 <Method void iq.a()>
		}
	//*  26   51:aload_0         
	//*  27   52:invokevirtual   #603 <Method el ec.g()>
	//*  28   55:astore          5
	//*  29   57:aload           4
	//*  30   59:invokestatic    #308 <Method Object am.a(Object)>
	//*  31   62:pop             
	//*  32   63:aload           5
	//*  33   65:invokevirtual   #607 <Method eo bt.p()>
	//*  34   68:invokevirtual   #334 <Method void bt.d()>
	//*  35   71:invokestatic    #612 <Method MessageDigest eo.i()>
	//*  36   74:astore          6
	//*  37   76:aload           6
	//*  38   78:ifnonnull       100
	//*  39   81:aload           5
	//*  40   83:invokevirtual   #244 <Method s bt.r()>
	//*  41   86:invokevirtual   #250 <Method u s.u_()>
	//*  42   89:ldc2            #614 <String "Failed to get MD5">
	//*  43   92:invokevirtual   #279 <Method void com.google.android.gms.measurement.internal.u.a(String)>
	//*  44   95:lconst_0        
	//*  45   96:lstore_2        
	//*  46   97:goto            111
	//*  47  100:aload           6
	//*  48  102:aload           4
	//*  49  104:invokevirtual   #620 <Method byte[] MessageDigest.digest(byte[])>
	//*  50  107:invokestatic    #623 <Method long com.google.android.gms.measurement.internal.eo.a(byte[])>
	//*  51  110:lstore_2        
	//*  52  111:new             #310 <Class ContentValues>
	//*  53  114:dup             
	//*  54  115:invokespecial   #378 <Method void ContentValues()>
	//*  55  118:astore          5
	//*  56  120:aload           5
	//*  57  122:ldc2            #380 <String "app_id">
	//*  58  125:aload_1         
	//*  59  126:getfield        #598 <Field String bq.o>
	//*  60  129:invokevirtual   #314 <Method void ContentValues.put(String, String)>
	//*  61  132:aload           5
	//*  62  134:ldc2            #625 <String "metadata_fingerprint">
	//*  63  137:lload_2         
	//*  64  138:invokestatic    #297 <Method Long Long.valueOf(long)>
	//*  65  141:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
	//*  66  144:aload           5
	//*  67  146:ldc2            #627 <String "metadata">
	//*  68  149:aload           4
	//*  69  151:invokevirtual   #394 <Method void ContentValues.put(String, byte[])>
	//*  70  154:aload_0         
	//*  71  155:invokevirtual   #222 <Method SQLiteDatabase y()>
	//*  72  158:ldc2            #629 <String "raw_events_metadata">
	//*  73  161:aconst_null     
	//*  74  162:aload           5
	//*  75  164:iconst_4        
	//*  76  165:invokevirtual   #400 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//*  77  168:pop2            
	//*  78  169:lload_2         
	//*  79  170:lreturn         
	//*  80  171:astore          4
	//*  81  173:aload_0         
	//*  82  174:invokevirtual   #244 <Method s bt.r()>
	//*  83  177:invokevirtual   #250 <Method u s.u_()>
	//*  84  180:ldc2            #631 <String "Error storing raw event metadata. appId">
	//*  85  183:aload_1         
	//*  86  184:getfield        #598 <Field String bq.o>
	//*  87  187:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  88  190:aload           4
	//*  89  192:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//*  90  195:aload           4
	//*  91  197:athrow          
		catch(IOException ioexception)
	//*  92  198:astore          4
		{
			((bt)this).r().u_().a("Data loss. Failed to serialize event metadata. appId", com.google.android.gms.measurement.internal.s.a(bq1.o), ((Object) (ioexception)));
	//   93  200:aload_0         
	//   94  201:invokevirtual   #244 <Method s bt.r()>
	//   95  204:invokevirtual   #250 <Method u s.u_()>
	//   96  207:ldc2            #633 <String "Data loss. Failed to serialize event metadata. appId">
	//   97  210:aload_1         
	//   98  211:getfield        #598 <Field String bq.o>
	//   99  214:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  100  217:aload           4
	//  101  219:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
			throw ioexception;
	//  102  222:aload           4
	//  103  224:athrow          
		}
		obj = ((Object) (((ec)this).g()));
		am.a(((Object) (abyte0)));
		((bt) (((bt) (obj)).p())).d();
		messagedigest = eo.i();
		if(messagedigest == null)
		{
			((bt) (obj)).r().u_().a("Failed to get MD5");
			l = 0L;
		} else
		{
			l = com.google.android.gms.measurement.internal.eo.a(messagedigest.digest(abyte0));
		}
		obj = ((Object) (new ContentValues()));
		((ContentValues) (obj)).put("app_id", bq1.o);
		((ContentValues) (obj)).put("metadata_fingerprint", Long.valueOf(l));
		((ContentValues) (obj)).put("metadata", abyte0);
		try
		{
			y().insertWithOnConflict("raw_events_metadata", ((String) (null)), ((ContentValues) (obj)), 4);
		}
		catch(SQLiteException sqliteexception)
		{
			((bt)this).r().u_().a("Error storing raw event metadata. appId", com.google.android.gms.measurement.internal.s.a(bq1.o), ((Object) (sqliteexception)));
			throw sqliteexception;
		}
		return l;
	}

	public final Pair a(String s1, Long long1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #332 <Method void ed.k()>
		Cursor cursor = y().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[] {
			s1, String.valueOf(((Object) (long1)))
		});
	//    4    8:aload_0         
	//    5    9:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    6   12:ldc2            #636 <String "select main_event, children_to_process from main_event_params where app_id=? and event_id=?">
	//    7   15:iconst_2        
	//    8   16:anewarray       String[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload_1         
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_1        
	//   15   25:aload_2         
	//   16   26:invokestatic    #358 <Method String String.valueOf(Object)>
	//   17   29:aastore         
	//   18   30:invokevirtual   #228 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   19   33:astore          6
		Object obj = ((Object) (cursor));
	//   20   35:aload           6
	//   21   37:astore          5
		if(cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_80;
	//   22   39:aload           6
	//   23   41:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   24   46:ifne            80
		obj = ((Object) (cursor));
	//   25   49:aload           6
	//   26   51:astore          5
		long l;
		byte abyte0[];
		ip ip1;
		IOException ioexception;
		bn bn1;
		try
		{
			((bt)this).r().x().a("Main event not found");
	//   27   53:aload_0         
	//   28   54:invokevirtual   #244 <Method s bt.r()>
	//   29   57:invokevirtual   #572 <Method u s.x()>
	//   30   60:ldc2            #638 <String "Main event not found">
	//   31   63:invokevirtual   #279 <Method void com.google.android.gms.measurement.internal.u.a(String)>
		}
	//*  32   66:aload           6
	//*  33   68:ifnull          78
	//*  34   71:aload           6
	//*  35   73:invokeinterface #240 <Method void Cursor.close()>
	//*  36   78:aconst_null     
	//*  37   79:areturn         
	//*  38   80:aload           6
	//*  39   82:astore          5
	//*  40   84:aload           6
	//*  41   86:iconst_0        
	//*  42   87:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//*  43   92:astore          7
	//*  44   94:aload           6
	//*  45   96:astore          5
	//*  46   98:aload           6
	//*  47  100:iconst_1        
	//*  48  101:invokeinterface #237 <Method long Cursor.getLong(int)>
	//*  49  106:lstore_3        
	//*  50  107:aload           6
	//*  51  109:astore          5
	//*  52  111:aload           7
	//*  53  113:iconst_0        
	//*  54  114:aload           7
	//*  55  116:arraylength     
	//*  56  117:invokestatic    #647 <Method ip ip.a(byte[], int, int)>
	//*  57  120:astore          7
	//*  58  122:aload           6
	//*  59  124:astore          5
	//*  60  126:new             #649 <Class bn>
	//*  61  129:dup             
	//*  62  130:invokespecial   #650 <Method void bn()>
	//*  63  133:astore          8
	//*  64  135:aload           6
	//*  65  137:astore          5
	//*  66  139:aload           8
	//*  67  141:aload           7
	//*  68  143:invokevirtual   #653 <Method iy iy.a(ip)>
	//*  69  146:pop             
	//*  70  147:aload           6
	//*  71  149:astore          5
	//*  72  151:aload           8
	//*  73  153:lload_3         
	//*  74  154:invokestatic    #297 <Method Long Long.valueOf(long)>
	//*  75  157:invokestatic    #659 <Method Pair Pair.create(Object, Object)>
	//*  76  160:astore_1        
	//*  77  161:aload           6
	//*  78  163:ifnull          173
	//*  79  166:aload           6
	//*  80  168:invokeinterface #240 <Method void Cursor.close()>
	//*  81  173:aload_1         
	//*  82  174:areturn         
	//*  83  175:astore          7
	//*  84  177:aload           6
	//*  85  179:astore          5
	//*  86  181:aload_0         
	//*  87  182:invokevirtual   #244 <Method s bt.r()>
	//*  88  185:invokevirtual   #250 <Method u s.u_()>
	//*  89  188:ldc2            #661 <String "Failed to merge main event. appId, eventId">
	//*  90  191:aload_1         
	//*  91  192:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  92  195:aload_2         
	//*  93  196:aload           7
	//*  94  198:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
	//*  95  201:aload           6
	//*  96  203:ifnull          213
	//*  97  206:aload           6
	//*  98  208:invokeinterface #240 <Method void Cursor.close()>
	//*  99  213:aconst_null     
	//* 100  214:areturn         
		// Misplaced declaration of an exception variable
		catch(Long long1)
	//* 101  215:astore_2        
		{
			s1 = ((String) (cursor));
	//  102  216:aload           6
	//  103  218:astore_1        
			break MISSING_BLOCK_LABEL_232;
	//  104  219:goto            232
		}
		if(cursor != null)
			cursor.close();
		return null;
		obj = ((Object) (cursor));
		abyte0 = cursor.getBlob(0);
		obj = ((Object) (cursor));
		l = cursor.getLong(1);
		obj = ((Object) (cursor));
		ip1 = ip.a(abyte0, 0, abyte0.length);
		obj = ((Object) (cursor));
		bn1 = new bn();
		obj = ((Object) (cursor));
		((iy) (bn1)).a(ip1);
		obj = ((Object) (cursor));
		s1 = ((String) (Pair.create(((Object) (bn1)), ((Object) (Long.valueOf(l))))));
		if(cursor != null)
			cursor.close();
		return ((Pair) (s1));
		ioexception;
		obj = ((Object) (cursor));
		((bt)this).r().u_().a("Failed to merge main event. appId, eventId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (long1)), ((Object) (ioexception)));
		if(cursor != null)
			cursor.close();
		return null;
		s1;
	//  105  222:astore_1        
		obj = null;
	//  106  223:aconst_null     
	//  107  224:astore          5
		break MISSING_BLOCK_LABEL_262;
	//  108  226:goto            262
		long1;
	//  109  229:astore_2        
		s1 = null;
	//  110  230:aconst_null     
	//  111  231:astore_1        
		obj = ((Object) (s1));
	//  112  232:aload_1         
	//  113  233:astore          5
		((bt)this).r().u_().a("Error selecting main event", ((Object) (long1)));
	//  114  235:aload_0         
	//  115  236:invokevirtual   #244 <Method s bt.r()>
	//  116  239:invokevirtual   #250 <Method u s.u_()>
	//  117  242:ldc2            #663 <String "Error selecting main event">
	//  118  245:aload_2         
	//  119  246:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		if(s1 != null)
	//* 120  249:aload_1         
	//* 121  250:ifnull          259
			((Cursor) (s1)).close();
	//  122  253:aload_1         
	//  123  254:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//  124  259:aconst_null     
	//  125  260:areturn         
		s1;
	//  126  261:astore_1        
		if(obj != null)
	//* 127  262:aload           5
	//* 128  264:ifnull          274
			((Cursor) (obj)).close();
	//  129  267:aload           5
	//  130  269:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  131  274:aload_1         
	//  132  275:athrow          
	}

	public final d a(String s1, String s2)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		am.a(s2);
	//    3    5:aload_2         
	//    4    6:invokestatic    #305 <Method String am.a(String)>
	//    5    9:pop             
		((bt)this).d();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #332 <Method void ed.k()>
		Object obj = ((Object) (y()));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   12   22:astore          13
		boolean flag = false;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		obj = ((Object) (((SQLiteDatabase) (obj)).query("events", new String[] {
			"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling"
		}, "app_id=? and name=?", new String[] {
			s1, s2
		}, ((String) (null)), ((String) (null)), ((String) (null)))));
	//   15   26:aload           13
	//   16   28:ldc2            #666 <String "events">
	//   17   31:bipush          8
	//   18   33:anewarray       String[]
	//   19   36:dup             
	//   20   37:iconst_0        
	//   21   38:ldc2            #668 <String "lifetime_count">
	//   22   41:aastore         
	//   23   42:dup             
	//   24   43:iconst_1        
	//   25   44:ldc2            #670 <String "current_bundle_count">
	//   26   47:aastore         
	//   27   48:dup             
	//   28   49:iconst_2        
	//   29   50:ldc2            #672 <String "last_fire_timestamp">
	//   30   53:aastore         
	//   31   54:dup             
	//   32   55:iconst_3        
	//   33   56:ldc1            #21  <String "last_bundled_timestamp">
	//   34   58:aastore         
	//   35   59:dup             
	//   36   60:iconst_4        
	//   37   61:ldc1            #25  <String "last_bundled_day">
	//   38   63:aastore         
	//   39   64:dup             
	//   40   65:iconst_5        
	//   41   66:ldc1            #29  <String "last_sampled_complex_event_id">
	//   42   68:aastore         
	//   43   69:dup             
	//   44   70:bipush          6
	//   45   72:ldc1            #33  <String "last_sampling_rate">
	//   46   74:aastore         
	//   47   75:dup             
	//   48   76:bipush          7
	//   49   78:ldc1            #37  <String "last_exempt_from_sampling">
	//   50   80:aastore         
	//   51   81:ldc2            #674 <String "app_id=? and name=?">
	//   52   84:iconst_2        
	//   53   85:anewarray       String[]
	//   54   88:dup             
	//   55   89:iconst_0        
	//   56   90:aload_1         
	//   57   91:aastore         
	//   58   92:dup             
	//   59   93:iconst_1        
	//   60   94:aload_2         
	//   61   95:aastore         
	//   62   96:aconst_null     
	//   63   97:aconst_null     
	//   64   98:aconst_null     
	//   65   99:invokevirtual   #678 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   66  102:astore          13
		Cursor cursor;
		SQLiteException sqliteexception;
		Boolean boolean1;
		boolean flag1;
		long l;
		long l1;
		long l2;
		long l3;
		Object obj1;
		Long long1;
		Long long2;
		try
		{
			flag1 = ((Cursor) (obj)).moveToFirst();
	//   67  104:aload           13
	//   68  106:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   69  111:istore          4
		}
	//*  70  113:iload           4
	//*  71  115:ifne            132
	//*  72  118:aload           13
	//*  73  120:ifnull          130
	//*  74  123:aload           13
	//*  75  125:invokeinterface #240 <Method void Cursor.close()>
	//*  76  130:aconst_null     
	//*  77  131:areturn         
	//*  78  132:aload           13
	//*  79  134:iconst_0        
	//*  80  135:invokeinterface #237 <Method long Cursor.getLong(int)>
	//*  81  140:lstore          7
	//*  82  142:aload           13
	//*  83  144:iconst_1        
	//*  84  145:invokeinterface #237 <Method long Cursor.getLong(int)>
	//*  85  150:lstore          9
	//*  86  152:aload           13
	//*  87  154:iconst_2        
	//*  88  155:invokeinterface #237 <Method long Cursor.getLong(int)>
	//*  89  160:lstore          11
	//*  90  162:aload           13
	//*  91  164:iconst_3        
	//*  92  165:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//*  93  170:ifeq            179
	//*  94  173:lconst_0        
	//*  95  174:lstore          5
	//*  96  176:goto            189
	//*  97  179:aload           13
	//*  98  181:iconst_3        
	//*  99  182:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 100  187:lstore          5
	//* 101  189:aload           13
	//* 102  191:iconst_4        
	//* 103  192:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//* 104  197:ifeq            206
	//* 105  200:aconst_null     
	//* 106  201:astore          15
	//* 107  203:goto            219
	//* 108  206:aload           13
	//* 109  208:iconst_4        
	//* 110  209:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 111  214:invokestatic    #297 <Method Long Long.valueOf(long)>
	//* 112  217:astore          15
	//* 113  219:aload           13
	//* 114  221:iconst_5        
	//* 115  222:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//* 116  227:ifeq            236
	//* 117  230:aconst_null     
	//* 118  231:astore          16
	//* 119  233:goto            249
	//* 120  236:aload           13
	//* 121  238:iconst_5        
	//* 122  239:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 123  244:invokestatic    #297 <Method Long Long.valueOf(long)>
	//* 124  247:astore          16
	//* 125  249:aload           13
	//* 126  251:bipush          6
	//* 127  253:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//* 128  258:ifeq            267
	//* 129  261:aconst_null     
	//* 130  262:astore          17
	//* 131  264:goto            492
	//* 132  267:aload           13
	//* 133  269:bipush          6
	//* 134  271:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 135  276:invokestatic    #297 <Method Long Long.valueOf(long)>
	//* 136  279:astore          17
	//* 137  281:goto            492
	//* 138  284:aload           13
	//* 139  286:bipush          7
	//* 140  288:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//* 141  293:ifne            495
	//* 142  296:aload           13
	//* 143  298:bipush          7
	//* 144  300:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 145  305:lconst_1        
	//* 146  306:lcmp            
	//* 147  307:ifne            312
	//* 148  310:iconst_1        
	//* 149  311:istore_3        
	//* 150  312:iload_3         
	//* 151  313:invokestatic    #687 <Method Boolean Boolean.valueOf(boolean)>
	//* 152  316:astore          18
	//* 153  318:goto            321
	//* 154  321:aload           13
	//* 155  323:astore          14
	//* 156  325:new             #689 <Class d>
	//* 157  328:dup             
	//* 158  329:aload_1         
	//* 159  330:aload_2         
	//* 160  331:lload           7
	//* 161  333:lload           9
	//* 162  335:lload           11
	//* 163  337:lload           5
	//* 164  339:aload           15
	//* 165  341:aload           16
	//* 166  343:aload           17
	//* 167  345:aload           18
	//* 168  347:invokespecial   #692 <Method void d(String, String, long, long, long, long, Long, Long, Long, Boolean)>
	//* 169  350:astore          15
	//* 170  352:aload           13
	//* 171  354:astore          14
	//* 172  356:aload           13
	//* 173  358:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//* 174  363:ifeq            387
	//* 175  366:aload           13
	//* 176  368:astore          14
	//* 177  370:aload_0         
	//* 178  371:invokevirtual   #244 <Method s bt.r()>
	//* 179  374:invokevirtual   #250 <Method u s.u_()>
	//* 180  377:ldc2            #697 <String "Got multiple records for event aggregates, expected one. appId">
	//* 181  380:aload_1         
	//* 182  381:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//* 183  384:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//* 184  387:aload           13
	//* 185  389:ifnull          399
	//* 186  392:aload           13
	//* 187  394:invokeinterface #240 <Method void Cursor.close()>
	//* 188  399:aload           15
	//* 189  401:areturn         
	//* 190  402:astore          15
	//* 191  404:goto            432
	//* 192  407:astore_1        
	//* 193  408:aload           13
	//* 194  410:astore          14
	//* 195  412:goto            478
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
	//* 196  415:astore          15
		{
			break MISSING_BLOCK_LABEL_432;
	//  197  417:goto            432
		}
		if(!flag1)
		{
			if(obj != null)
				((Cursor) (obj)).close();
			return null;
		}
		l1 = ((Cursor) (obj)).getLong(0);
		l2 = ((Cursor) (obj)).getLong(1);
		l3 = ((Cursor) (obj)).getLong(2);
		if(((Cursor) (obj)).isNull(3))
		{
			l = 0L;
			break MISSING_BLOCK_LABEL_189;
		}
		l = ((Cursor) (obj)).getLong(3);
		if(((Cursor) (obj)).isNull(4))
		{
			obj1 = null;
			break MISSING_BLOCK_LABEL_219;
		}
		obj1 = ((Object) (Long.valueOf(((Cursor) (obj)).getLong(4))));
		if(((Cursor) (obj)).isNull(5))
		{
			long1 = null;
			break MISSING_BLOCK_LABEL_249;
		}
		long1 = Long.valueOf(((Cursor) (obj)).getLong(5));
		if(((Cursor) (obj)).isNull(6))
		{
			long2 = null;
			break MISSING_BLOCK_LABEL_284;
		}
		long2 = Long.valueOf(((Cursor) (obj)).getLong(6));
		if(((Cursor) (obj)).isNull(7)) goto _L2; else goto _L1
_L1:
		if(((Cursor) (obj)).getLong(7) == 1L)
			flag = true;
		boolean1 = Boolean.valueOf(flag);
_L4:
		cursor = ((Cursor) (obj));
		obj1 = ((Object) (new d(s1, s2, l1, l2, l3, l, ((Long) (obj1)), long1, long2, boolean1)));
		cursor = ((Cursor) (obj));
		if(!((Cursor) (obj)).moveToNext())
			break MISSING_BLOCK_LABEL_387;
		cursor = ((Cursor) (obj));
		((bt)this).r().u_().a("Got multiple records for event aggregates, expected one. appId", com.google.android.gms.measurement.internal.s.a(s1));
		if(obj != null)
			((Cursor) (obj)).close();
		return ((d) (obj1));
		sqliteexception;
		break MISSING_BLOCK_LABEL_432;
		s1;
		cursor = ((Cursor) (obj));
		break MISSING_BLOCK_LABEL_478;
		s1;
	//  198  420:astore_1        
		cursor = null;
	//  199  421:aconst_null     
	//  200  422:astore          14
		break MISSING_BLOCK_LABEL_478;
	//  201  424:goto            478
		sqliteexception;
	//  202  427:astore          15
		obj = null;
	//  203  429:aconst_null     
	//  204  430:astore          13
		cursor = ((Cursor) (obj));
	//  205  432:aload           13
	//  206  434:astore          14
		((bt)this).r().u_().a("Error querying events. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (((bt)this).o().a(s2))), ((Object) (sqliteexception)));
	//  207  436:aload_0         
	//  208  437:invokevirtual   #244 <Method s bt.r()>
	//  209  440:invokevirtual   #250 <Method u s.u_()>
	//  210  443:ldc2            #699 <String "Error querying events. appId">
	//  211  446:aload_1         
	//  212  447:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  213  450:aload_0         
	//  214  451:invokevirtual   #702 <Method q bt.o()>
	//  215  454:aload_2         
	//  216  455:invokevirtual   #705 <Method String com.google.android.gms.measurement.internal.q.a(String)>
	//  217  458:aload           15
	//  218  460:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
		if(obj != null)
	//* 219  463:aload           13
	//* 220  465:ifnull          475
			((Cursor) (obj)).close();
	//  221  468:aload           13
	//  222  470:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//  223  475:aconst_null     
	//  224  476:areturn         
		s1;
	//  225  477:astore_1        
		if(cursor != null)
	//* 226  478:aload           14
	//* 227  480:ifnull          490
			cursor.close();
	//  228  483:aload           14
	//  229  485:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  230  490:aload_1         
	//  231  491:athrow          
	//* 232  492:goto            284
_L2:
		boolean1 = null;
	//  233  495:aconst_null     
	//  234  496:astore          18
		if(true) goto _L4; else goto _L3
	//  235  498:goto            321
_L3:
	}

	public final fa a(long l, String s1, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
			boolean flag4)
	{
		fa fa1;
		am.a(s1);
	//    0    0:aload_3         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		fa1 = new fa();
	//    7   13:new             #708 <Class fa>
	//    8   16:dup             
	//    9   17:invokespecial   #709 <Method void fa()>
	//   10   20:astore          11
		Cursor cursor;
		SQLiteDatabase sqlitedatabase;
		sqlitedatabase = y();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   13   26:astore          10
		cursor = sqlitedatabase.query("apps", new String[] {
			"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"
		}, "app_id=?", new String[] {
			s1
		}, ((String) (null)), ((String) (null)), ((String) (null)));
	//   14   28:aload           10
	//   15   30:ldc2            #711 <String "apps">
	//   16   33:bipush          6
	//   17   35:anewarray       String[]
	//   18   38:dup             
	//   19   39:iconst_0        
	//   20   40:ldc1            #73  <String "day">
	//   21   42:aastore         
	//   22   43:dup             
	//   23   44:iconst_1        
	//   24   45:ldc1            #81  <String "daily_events_count">
	//   25   47:aastore         
	//   26   48:dup             
	//   27   49:iconst_2        
	//   28   50:ldc1            #77  <String "daily_public_events_count">
	//   29   52:aastore         
	//   30   53:dup             
	//   31   54:iconst_3        
	//   32   55:ldc1            #85  <String "daily_conversions_count">
	//   33   57:aastore         
	//   34   58:dup             
	//   35   59:iconst_4        
	//   36   60:ldc1            #109 <String "daily_error_events_count">
	//   37   62:aastore         
	//   38   63:dup             
	//   39   64:iconst_5        
	//   40   65:ldc1            #113 <String "daily_realtime_events_count">
	//   41   67:aastore         
	//   42   68:ldc2            #713 <String "app_id=?">
	//   43   71:iconst_1        
	//   44   72:anewarray       String[]
	//   45   75:dup             
	//   46   76:iconst_0        
	//   47   77:aload_3         
	//   48   78:aastore         
	//   49   79:aconst_null     
	//   50   80:aconst_null     
	//   51   81:aconst_null     
	//   52   82:invokevirtual   #678 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   53   85:astore          9
		if(cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_129;
	//   54   87:aload           9
	//   55   89:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   56   94:ifne            129
		((bt)this).r().i().a("Not updating daily counts, app is not known. appId", com.google.android.gms.measurement.internal.s.a(s1));
	//   57   97:aload_0         
	//   58   98:invokevirtual   #244 <Method s bt.r()>
	//   59  101:invokevirtual   #347 <Method u s.i()>
	//   60  104:ldc2            #715 <String "Not updating daily counts, app is not known. appId">
	//   61  107:aload_3         
	//   62  108:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   63  111:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		if(cursor != null)
	//*  64  114:aload           9
	//*  65  116:ifnull          126
			cursor.close();
	//   66  119:aload           9
	//   67  121:invokeinterface #240 <Method void Cursor.close()>
		return fa1;
	//   68  126:aload           11
	//   69  128:areturn         
		if(cursor.getLong(0) == l)
	//*  70  129:aload           9
	//*  71  131:iconst_0        
	//*  72  132:invokeinterface #237 <Method long Cursor.getLong(int)>
	//*  73  137:lload_1         
	//*  74  138:lcmp            
	//*  75  139:ifne            207
		{
			fa1.b = cursor.getLong(1);
	//   76  142:aload           11
	//   77  144:aload           9
	//   78  146:iconst_1        
	//   79  147:invokeinterface #237 <Method long Cursor.getLong(int)>
	//   80  152:putfield        #717 <Field long fa.b>
			fa1.a = cursor.getLong(2);
	//   81  155:aload           11
	//   82  157:aload           9
	//   83  159:iconst_2        
	//   84  160:invokeinterface #237 <Method long Cursor.getLong(int)>
	//   85  165:putfield        #719 <Field long com.google.android.gms.measurement.internal.fa.a>
			fa1.c = cursor.getLong(3);
	//   86  168:aload           11
	//   87  170:aload           9
	//   88  172:iconst_3        
	//   89  173:invokeinterface #237 <Method long Cursor.getLong(int)>
	//   90  178:putfield        #721 <Field long fa.c>
			fa1.d = cursor.getLong(4);
	//   91  181:aload           11
	//   92  183:aload           9
	//   93  185:iconst_4        
	//   94  186:invokeinterface #237 <Method long Cursor.getLong(int)>
	//   95  191:putfield        #723 <Field long fa.d>
			fa1.e = cursor.getLong(5);
	//   96  194:aload           11
	//   97  196:aload           9
	//   98  198:iconst_5        
	//   99  199:invokeinterface #237 <Method long Cursor.getLong(int)>
	//  100  204:putfield        #725 <Field long com.google.android.gms.measurement.internal.fa.e>
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_224;
	//  101  207:iload           4
	//  102  209:ifeq            224
		fa1.b = fa1.b + 1L;
	//  103  212:aload           11
	//  104  214:aload           11
	//  105  216:getfield        #717 <Field long fa.b>
	//  106  219:lconst_1        
	//  107  220:ladd            
	//  108  221:putfield        #717 <Field long fa.b>
		if(!flag1)
			break MISSING_BLOCK_LABEL_241;
	//  109  224:iload           5
	//  110  226:ifeq            241
		fa1.a = fa1.a + 1L;
	//  111  229:aload           11
	//  112  231:aload           11
	//  113  233:getfield        #719 <Field long com.google.android.gms.measurement.internal.fa.a>
	//  114  236:lconst_1        
	//  115  237:ladd            
	//  116  238:putfield        #719 <Field long com.google.android.gms.measurement.internal.fa.a>
		if(!flag2)
			break MISSING_BLOCK_LABEL_258;
	//  117  241:iload           6
	//  118  243:ifeq            258
		fa1.c = fa1.c + 1L;
	//  119  246:aload           11
	//  120  248:aload           11
	//  121  250:getfield        #721 <Field long fa.c>
	//  122  253:lconst_1        
	//  123  254:ladd            
	//  124  255:putfield        #721 <Field long fa.c>
		if(!flag3)
			break MISSING_BLOCK_LABEL_275;
	//  125  258:iload           7
	//  126  260:ifeq            275
		fa1.d = fa1.d + 1L;
	//  127  263:aload           11
	//  128  265:aload           11
	//  129  267:getfield        #723 <Field long fa.d>
	//  130  270:lconst_1        
	//  131  271:ladd            
	//  132  272:putfield        #723 <Field long fa.d>
		if(!flag4)
			break MISSING_BLOCK_LABEL_292;
	//  133  275:iload           8
	//  134  277:ifeq            292
		fa1.e = fa1.e + 1L;
	//  135  280:aload           11
	//  136  282:aload           11
	//  137  284:getfield        #725 <Field long com.google.android.gms.measurement.internal.fa.e>
	//  138  287:lconst_1        
	//  139  288:ladd            
	//  140  289:putfield        #725 <Field long com.google.android.gms.measurement.internal.fa.e>
		ContentValues contentvalues = new ContentValues();
	//  141  292:new             #310 <Class ContentValues>
	//  142  295:dup             
	//  143  296:invokespecial   #378 <Method void ContentValues()>
	//  144  299:astore          12
		contentvalues.put("day", Long.valueOf(l));
	//  145  301:aload           12
	//  146  303:ldc1            #73  <String "day">
	//  147  305:lload_1         
	//  148  306:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  149  309:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("daily_public_events_count", Long.valueOf(fa1.a));
	//  150  312:aload           12
	//  151  314:ldc1            #77  <String "daily_public_events_count">
	//  152  316:aload           11
	//  153  318:getfield        #719 <Field long com.google.android.gms.measurement.internal.fa.a>
	//  154  321:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  155  324:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("daily_events_count", Long.valueOf(fa1.b));
	//  156  327:aload           12
	//  157  329:ldc1            #81  <String "daily_events_count">
	//  158  331:aload           11
	//  159  333:getfield        #717 <Field long fa.b>
	//  160  336:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  161  339:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("daily_conversions_count", Long.valueOf(fa1.c));
	//  162  342:aload           12
	//  163  344:ldc1            #85  <String "daily_conversions_count">
	//  164  346:aload           11
	//  165  348:getfield        #721 <Field long fa.c>
	//  166  351:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  167  354:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("daily_error_events_count", Long.valueOf(fa1.d));
	//  168  357:aload           12
	//  169  359:ldc1            #109 <String "daily_error_events_count">
	//  170  361:aload           11
	//  171  363:getfield        #723 <Field long fa.d>
	//  172  366:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  173  369:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("daily_realtime_events_count", Long.valueOf(fa1.e));
	//  174  372:aload           12
	//  175  374:ldc1            #113 <String "daily_realtime_events_count">
	//  176  376:aload           11
	//  177  378:getfield        #725 <Field long com.google.android.gms.measurement.internal.fa.e>
	//  178  381:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  179  384:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		sqlitedatabase.update("apps", contentvalues, "app_id=?", new String[] {
			s1
		});
	//  180  387:aload           10
	//  181  389:ldc2            #711 <String "apps">
	//  182  392:aload           12
	//  183  394:ldc2            #713 <String "app_id=?">
	//  184  397:iconst_1        
	//  185  398:anewarray       String[]
	//  186  401:dup             
	//  187  402:iconst_0        
	//  188  403:aload_3         
	//  189  404:aastore         
	//  190  405:invokevirtual   #729 <Method int SQLiteDatabase.update(String, ContentValues, String, String[])>
	//  191  408:pop             
		if(cursor != null)
	//* 192  409:aload           9
	//* 193  411:ifnull          421
			cursor.close();
	//  194  414:aload           9
	//  195  416:invokeinterface #240 <Method void Cursor.close()>
		return fa1;
	//  196  421:aload           11
	//  197  423:areturn         
		s1;
	//  198  424:astore_3        
		break MISSING_BLOCK_LABEL_480;
	//  199  425:goto            480
		SQLiteException sqliteexception;
		sqliteexception;
	//  200  428:astore          10
		break MISSING_BLOCK_LABEL_445;
	//  201  430:goto            445
		s1;
	//  202  433:astore_3        
		cursor = null;
	//  203  434:aconst_null     
	//  204  435:astore          9
		break MISSING_BLOCK_LABEL_480;
	//  205  437:goto            480
		sqliteexception;
	//  206  440:astore          10
		cursor = null;
	//  207  442:aconst_null     
	//  208  443:astore          9
		((bt)this).r().u_().a("Error updating daily counts. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (sqliteexception)));
	//  209  445:aload_0         
	//  210  446:invokevirtual   #244 <Method s bt.r()>
	//  211  449:invokevirtual   #250 <Method u s.u_()>
	//  212  452:ldc2            #731 <String "Error updating daily counts. appId">
	//  213  455:aload_3         
	//  214  456:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  215  459:aload           10
	//  216  461:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		if(cursor != null)
	//* 217  464:aload           9
	//* 218  466:ifnull          476
			cursor.close();
	//  219  469:aload           9
	//  220  471:invokeinterface #240 <Method void Cursor.close()>
		return fa1;
	//  221  476:aload           11
	//  222  478:areturn         
		s1;
	//  223  479:astore_3        
		if(cursor != null)
	//* 224  480:aload           9
	//* 225  482:ifnull          492
			cursor.close();
	//  226  485:aload           9
	//  227  487:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  228  492:aload_3         
	//  229  493:athrow          
	}

	public final String a(long l)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #332 <Method void ed.k()>
		Object obj1 = ((Object) (y().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[] {
			String.valueOf(l)
		})));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    6   12:ldc2            #733 <String "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;">
	//    7   15:iconst_1        
	//    8   16:anewarray       String[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:lload_1         
	//   12   22:invokestatic    #566 <Method String String.valueOf(long)>
	//   13   25:aastore         
	//   14   26:invokevirtual   #228 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   15   29:astore          4
		Object obj = obj1;
	//   16   31:aload           4
	//   17   33:astore_3        
		if(((Cursor) (obj1)).moveToFirst())
			break MISSING_BLOCK_LABEL_74;
	//   18   34:aload           4
	//   19   36:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   20   41:ifne            74
		obj = obj1;
	//   21   44:aload           4
	//   22   46:astore_3        
		((bt)this).r().x().a("No expired configs for apps with pending events");
	//   23   47:aload_0         
	//   24   48:invokevirtual   #244 <Method s bt.r()>
	//   25   51:invokevirtual   #572 <Method u s.x()>
	//   26   54:ldc2            #735 <String "No expired configs for apps with pending events">
	//   27   57:invokevirtual   #279 <Method void com.google.android.gms.measurement.internal.u.a(String)>
		if(obj1 != null)
	//*  28   60:aload           4
	//*  29   62:ifnull          72
			((Cursor) (obj1)).close();
	//   30   65:aload           4
	//   31   67:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//   32   72:aconst_null     
	//   33   73:areturn         
		obj = obj1;
	//   34   74:aload           4
	//   35   76:astore_3        
		String s1 = ((Cursor) (obj1)).getString(0);
	//   36   77:aload           4
	//   37   79:iconst_0        
	//   38   80:invokeinterface #283 <Method String Cursor.getString(int)>
	//   39   85:astore          5
		if(obj1 != null)
	//*  40   87:aload           4
	//*  41   89:ifnull          99
			((Cursor) (obj1)).close();
	//   42   92:aload           4
	//   43   94:invokeinterface #240 <Method void Cursor.close()>
		return s1;
	//   44   99:aload           5
	//   45  101:areturn         
		SQLiteException sqliteexception;
		sqliteexception;
	//   46  102:astore          5
		break MISSING_BLOCK_LABEL_119;
	//   47  104:goto            119
		obj1;
	//   48  107:astore          4
		obj = null;
	//   49  109:aconst_null     
	//   50  110:astore_3        
		break MISSING_BLOCK_LABEL_153;
	//   51  111:goto            153
		sqliteexception;
	//   52  114:astore          5
		obj1 = null;
	//   53  116:aconst_null     
	//   54  117:astore          4
		obj = obj1;
	//   55  119:aload           4
	//   56  121:astore_3        
		((bt)this).r().u_().a("Error selecting expired configs", ((Object) (sqliteexception)));
	//   57  122:aload_0         
	//   58  123:invokevirtual   #244 <Method s bt.r()>
	//   59  126:invokevirtual   #250 <Method u s.u_()>
	//   60  129:ldc2            #737 <String "Error selecting expired configs">
	//   61  132:aload           5
	//   62  134:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		if(obj1 != null)
	//*  63  137:aload           4
	//*  64  139:ifnull          149
			((Cursor) (obj1)).close();
	//   65  142:aload           4
	//   66  144:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//   67  149:aconst_null     
	//   68  150:areturn         
		obj1;
	//   69  151:astore          4
		if(obj != null)
	//*  70  153:aload_3         
	//*  71  154:ifnull          163
			((Cursor) (obj)).close();
	//   72  157:aload_3         
	//   73  158:invokeinterface #240 <Method void Cursor.close()>
		throw obj1;
	//   74  163:aload           4
	//   75  165:athrow          
	}

	public final List a(String s1)
	{
		ArrayList arraylist;
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		arraylist = new ArrayList();
	//    7   13:new             #456 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #457 <Method void ArrayList()>
	//   10   20:astore          8
		Cursor cursor = y().query("user_attributes", new String[] {
			"name", "origin", "set_timestamp", "value"
		}, "app_id=?", new String[] {
			s1
		}, ((String) (null)), ((String) (null)), "rowid", "1000");
	//   11   22:aload_0         
	//   12   23:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   13   26:ldc2            #740 <String "user_attributes">
	//   14   29:iconst_4        
	//   15   30:anewarray       String[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:ldc2            #742 <String "name">
	//   19   38:aastore         
	//   20   39:dup             
	//   21   40:iconst_1        
	//   22   41:ldc1            #43  <String "origin">
	//   23   43:aastore         
	//   24   44:dup             
	//   25   45:iconst_2        
	//   26   46:ldc2            #744 <String "set_timestamp">
	//   27   49:aastore         
	//   28   50:dup             
	//   29   51:iconst_3        
	//   30   52:ldc2            #746 <String "value">
	//   31   55:aastore         
	//   32   56:ldc2            #713 <String "app_id=?">
	//   33   59:iconst_1        
	//   34   60:anewarray       String[]
	//   35   63:dup             
	//   36   64:iconst_0        
	//   37   65:aload_1         
	//   38   66:aastore         
	//   39   67:aconst_null     
	//   40   68:aconst_null     
	//   41   69:ldc2            #748 <String "rowid">
	//   42   72:ldc2            #750 <String "1000">
	//   43   75:invokevirtual   #753 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   44   78:astore          5
		Cursor cursor1;
		SQLiteException sqliteexception;
		boolean flag;
		long l;
		String s2;
		String s3;
		Object obj;
		try
		{
			flag = cursor.moveToFirst();
	//   45   80:aload           5
	//   46   82:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   47   87:istore_2        
		}
	//*  48   88:iload_2         
	//*  49   89:ifne            107
	//*  50   92:aload           5
	//*  51   94:ifnull          104
	//*  52   97:aload           5
	//*  53   99:invokeinterface #240 <Method void Cursor.close()>
	//*  54  104:aload           8
	//*  55  106:areturn         
	//*  56  107:aload           5
	//*  57  109:iconst_0        
	//*  58  110:invokeinterface #283 <Method String Cursor.getString(int)>
	//*  59  115:astore          9
	//*  60  117:aload           5
	//*  61  119:iconst_1        
	//*  62  120:invokeinterface #283 <Method String Cursor.getString(int)>
	//*  63  125:astore          7
	//*  64  127:aload           7
	//*  65  129:ifnonnull       331
	//*  66  132:ldc2            #755 <String "">
	//*  67  135:astore          7
	//*  68  137:goto            140
	//*  69  140:aload           5
	//*  70  142:iconst_2        
	//*  71  143:invokeinterface #237 <Method long Cursor.getLong(int)>
	//*  72  148:lstore_3        
	//*  73  149:aload           5
	//*  74  151:astore          6
	//*  75  153:aload_0         
	//*  76  154:aload           5
	//*  77  156:iconst_3        
	//*  78  157:invokespecial   #757 <Method Object a(Cursor, int)>
	//*  79  160:astore          10
	//*  80  162:aload           10
	//*  81  164:ifnonnull       191
	//*  82  167:aload           5
	//*  83  169:astore          6
	//*  84  171:aload_0         
	//*  85  172:invokevirtual   #244 <Method s bt.r()>
	//*  86  175:invokevirtual   #250 <Method u s.u_()>
	//*  87  178:ldc2            #759 <String "Read invalid user property value, ignoring it. appId">
	//*  88  181:aload_1         
	//*  89  182:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  90  185:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//*  91  188:goto            218
	//*  92  191:aload           5
	//*  93  193:astore          6
	//*  94  195:aload           8
	//*  95  197:new             #761 <Class en>
	//*  96  200:dup             
	//*  97  201:aload_1         
	//*  98  202:aload           7
	//*  99  204:aload           9
	//* 100  206:lload_3         
	//* 101  207:aload           10
	//* 102  209:invokespecial   #764 <Method void en(String, String, String, long, Object)>
	//* 103  212:invokeinterface #476 <Method boolean List.add(Object)>
	//* 104  217:pop             
	//* 105  218:aload           5
	//* 106  220:astore          6
	//* 107  222:aload           5
	//* 108  224:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//* 109  229:istore_2        
	//* 110  230:iload_2         
	//* 111  231:ifne            107
	//* 112  234:aload           5
	//* 113  236:ifnull          246
	//* 114  239:aload           5
	//* 115  241:invokeinterface #240 <Method void Cursor.close()>
	//* 116  246:aload           8
	//* 117  248:areturn         
	//* 118  249:astore          7
	//* 119  251:goto            275
	//* 120  254:astore_1        
	//* 121  255:goto            317
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
	//* 122  258:astore          7
		{
			break MISSING_BLOCK_LABEL_275;
	//  123  260:goto            275
		}
		if(!flag)
		{
			if(cursor != null)
				cursor.close();
			return ((List) (arraylist));
		}
		s3 = cursor.getString(0);
		s2 = cursor.getString(1);
		if(s2 == null)
			s2 = "";
		l = cursor.getLong(2);
		cursor1 = cursor;
		obj = a(cursor, 3);
		if(obj != null)
			break MISSING_BLOCK_LABEL_191;
		cursor1 = cursor;
		((bt)this).r().u_().a("Read invalid user property value, ignoring it. appId", com.google.android.gms.measurement.internal.s.a(s1));
		break MISSING_BLOCK_LABEL_218;
		cursor1 = cursor;
		((List) (arraylist)).add(((Object) (new en(s1, s2, s3, l, obj))));
		cursor1 = cursor;
		flag = cursor.moveToNext();
		if(!flag)
		{
			if(cursor != null)
				cursor.close();
			return ((List) (arraylist));
		}
		break MISSING_BLOCK_LABEL_107;
		sqliteexception;
		break MISSING_BLOCK_LABEL_275;
		s1;
		break MISSING_BLOCK_LABEL_317;
		s1;
	//  124  263:astore_1        
		cursor = null;
	//  125  264:aconst_null     
	//  126  265:astore          5
		break MISSING_BLOCK_LABEL_317;
	//  127  267:goto            317
		sqliteexception;
	//  128  270:astore          7
		cursor = null;
	//  129  272:aconst_null     
	//  130  273:astore          5
		cursor1 = cursor;
	//  131  275:aload           5
	//  132  277:astore          6
		((bt)this).r().u_().a("Error querying user properties. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (sqliteexception)));
	//  133  279:aload_0         
	//  134  280:invokevirtual   #244 <Method s bt.r()>
	//  135  283:invokevirtual   #250 <Method u s.u_()>
	//  136  286:ldc2            #766 <String "Error querying user properties. appId">
	//  137  289:aload_1         
	//  138  290:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  139  293:aload           7
	//  140  295:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		if(cursor != null)
	//* 141  298:aload           5
	//* 142  300:ifnull          310
			cursor.close();
	//  143  303:aload           5
	//  144  305:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//  145  310:aconst_null     
	//  146  311:areturn         
		s1;
	//  147  312:astore_1        
		cursor = cursor1;
	//  148  313:aload           6
	//  149  315:astore          5
		if(cursor != null)
	//* 150  317:aload           5
	//* 151  319:ifnull          329
			cursor.close();
	//  152  322:aload           5
	//  153  324:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  154  329:aload_1         
	//  155  330:athrow          
	//* 156  331:goto            140
	}

	public final List a(String s1, int j, int k)
	{
		Cursor cursor;
		Cursor cursor1;
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #332 <Method void ed.k()>
		boolean flag;
		if(j > 0)
	//*   4    8:iload_2         
	//*   5    9:ifle            18
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore          5
		else
	//*   8   15:goto            21
			flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          5
		am.b(flag);
	//   11   21:iload           5
	//   12   23:invokestatic    #770 <Method void am.b(boolean)>
		if(k > 0)
	//*  13   26:iload_3         
	//*  14   27:ifle            36
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore          5
		else
	//*  17   33:goto            39
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore          5
		am.b(flag);
	//   20   39:iload           5
	//   21   41:invokestatic    #770 <Method void am.b(boolean)>
		am.a(s1);
	//   22   44:aload_1         
	//   23   45:invokestatic    #305 <Method String am.a(String)>
	//   24   48:pop             
		cursor1 = null;
	//   25   49:aconst_null     
	//   26   50:astore          9
		cursor = null;
	//   27   52:aconst_null     
	//   28   53:astore          8
		Cursor cursor2 = y().query("queue", new String[] {
			"rowid", "data", "retry_count"
		}, "app_id=?", new String[] {
			s1
		}, ((String) (null)), ((String) (null)), "rowid", String.valueOf(j));
	//   29   55:aload_0         
	//   30   56:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   31   59:ldc2            #560 <String "queue">
	//   32   62:iconst_3        
	//   33   63:anewarray       String[]
	//   34   66:dup             
	//   35   67:iconst_0        
	//   36   68:ldc2            #748 <String "rowid">
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_1        
	//   40   74:ldc2            #391 <String "data">
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_2        
	//   44   80:ldc1            #153 <String "retry_count">
	//   45   82:aastore         
	//   46   83:ldc2            #713 <String "app_id=?">
	//   47   86:iconst_1        
	//   48   87:anewarray       String[]
	//   49   90:dup             
	//   50   91:iconst_0        
	//   51   92:aload_1         
	//   52   93:aastore         
	//   53   94:aconst_null     
	//   54   95:aconst_null     
	//   55   96:ldc2            #748 <String "rowid">
	//   56   99:iload_2         
	//   57  100:invokestatic    #772 <Method String String.valueOf(int)>
	//   58  103:invokevirtual   #753 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   59  106:astore          10
		cursor = cursor2;
	//   60  108:aload           10
	//   61  110:astore          8
		cursor1 = cursor2;
	//   62  112:aload           10
	//   63  114:astore          9
		if(cursor2.moveToFirst())
			break MISSING_BLOCK_LABEL_154;
	//   64  116:aload           10
	//   65  118:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   66  123:ifne            154
		cursor = cursor2;
	//   67  126:aload           10
	//   68  128:astore          8
		cursor1 = cursor2;
	//   69  130:aload           10
	//   70  132:astore          9
		Object obj = ((Object) (Collections.emptyList()));
	//   71  134:invokestatic    #778 <Method List Collections.emptyList()>
	//   72  137:astore          11
		if(cursor2 != null)
	//*  73  139:aload           10
	//*  74  141:ifnull          151
			cursor2.close();
	//   75  144:aload           10
	//   76  146:invokeinterface #240 <Method void Cursor.close()>
		return ((List) (obj));
	//   77  151:aload           11
	//   78  153:areturn         
		cursor = cursor2;
	//   79  154:aload           10
	//   80  156:astore          8
		cursor1 = cursor2;
	//   81  158:aload           10
	//   82  160:astore          9
		obj = ((Object) (new ArrayList()));
	//   83  162:new             #456 <Class ArrayList>
	//   84  165:dup             
	//   85  166:invokespecial   #457 <Method void ArrayList()>
	//   86  169:astore          11
		j = 0;
	//   87  171:iconst_0        
	//   88  172:istore_2        
_L2:
		cursor = cursor2;
	//   89  173:aload           10
	//   90  175:astore          8
		cursor1 = cursor2;
	//   91  177:aload           10
	//   92  179:astore          9
		long l1 = cursor2.getLong(0);
	//   93  181:aload           10
	//   94  183:iconst_0        
	//   95  184:invokeinterface #237 <Method long Cursor.getLong(int)>
	//   96  189:lstore          6
		cursor = cursor2;
	//   97  191:aload           10
	//   98  193:astore          8
		cursor1 = cursor2;
	//   99  195:aload           10
	//  100  197:astore          9
		byte abyte0[] = cursor2.getBlob(1);
	//  101  199:aload           10
	//  102  201:iconst_1        
	//  103  202:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//  104  207:astore          12
		cursor = cursor2;
	//  105  209:aload           10
	//  106  211:astore          8
		cursor1 = cursor2;
	//  107  213:aload           10
	//  108  215:astore          9
		abyte0 = ((ec)this).g().a(abyte0);
	//  109  217:aload_0         
	//  110  218:invokevirtual   #603 <Method el ec.g()>
	//  111  221:aload           12
	//  112  223:invokevirtual   #782 <Method byte[] com.google.android.gms.measurement.internal.el.a(byte[])>
	//  113  226:astore          12
		cursor = cursor2;
	//  114  228:aload           10
	//  115  230:astore          8
		cursor1 = cursor2;
	//  116  232:aload           10
	//  117  234:astore          9
		if(((List) (obj)).isEmpty())
			break MISSING_BLOCK_LABEL_263;
	//  118  236:aload           11
	//  119  238:invokeinterface #784 <Method boolean List.isEmpty()>
	//  120  243:ifne            263
		cursor = cursor2;
	//  121  246:aload           10
	//  122  248:astore          8
		cursor1 = cursor2;
	//  123  250:aload           10
	//  124  252:astore          9
		if(abyte0.length + j > k)
			break; /* Loop/switch isn't completed */
	//  125  254:aload           12
	//  126  256:arraylength     
	//  127  257:iload_2         
	//  128  258:iadd            
	//  129  259:iload_3         
	//  130  260:icmpgt          500
		cursor = cursor2;
	//  131  263:aload           10
	//  132  265:astore          8
		cursor1 = cursor2;
	//  133  267:aload           10
	//  134  269:astore          9
		ip ip1 = ip.a(abyte0, 0, abyte0.length);
	//  135  271:aload           12
	//  136  273:iconst_0        
	//  137  274:aload           12
	//  138  276:arraylength     
	//  139  277:invokestatic    #647 <Method ip ip.a(byte[], int, int)>
	//  140  280:astore          13
		cursor = cursor2;
	//  141  282:aload           10
	//  142  284:astore          8
		cursor1 = cursor2;
	//  143  286:aload           10
	//  144  288:astore          9
		bq bq1 = new bq();
	//  145  290:new             #595 <Class bq>
	//  146  293:dup             
	//  147  294:invokespecial   #785 <Method void bq()>
	//  148  297:astore          14
		cursor = cursor2;
	//  149  299:aload           10
	//  150  301:astore          8
		cursor1 = cursor2;
	//  151  303:aload           10
	//  152  305:astore          9
		((iy) (bq1)).a(ip1);
	//  153  307:aload           14
	//  154  309:aload           13
	//  155  311:invokevirtual   #653 <Method iy iy.a(ip)>
	//  156  314:pop             
		cursor = cursor2;
	//  157  315:aload           10
	//  158  317:astore          8
		cursor1 = cursor2;
	//  159  319:aload           10
	//  160  321:astore          9
		if(cursor2.isNull(2))
			break MISSING_BLOCK_LABEL_358;
	//  161  323:aload           10
	//  162  325:iconst_2        
	//  163  326:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//  164  331:ifne            358
		cursor = cursor2;
	//  165  334:aload           10
	//  166  336:astore          8
		cursor1 = cursor2;
	//  167  338:aload           10
	//  168  340:astore          9
		bq1.H = Integer.valueOf(cursor2.getInt(2));
	//  169  342:aload           14
	//  170  344:aload           10
	//  171  346:iconst_2        
	//  172  347:invokeinterface #788 <Method int Cursor.getInt(int)>
	//  173  352:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//  174  355:putfield        #790 <Field Integer bq.H>
		cursor = cursor2;
	//  175  358:aload           10
	//  176  360:astore          8
		cursor1 = cursor2;
	//  177  362:aload           10
	//  178  364:astore          9
		int l = j + abyte0.length;
	//  179  366:iload_2         
	//  180  367:aload           12
	//  181  369:arraylength     
	//  182  370:iadd            
	//  183  371:istore          4
		cursor = cursor2;
	//  184  373:aload           10
	//  185  375:astore          8
		cursor1 = cursor2;
	//  186  377:aload           10
	//  187  379:astore          9
		((List) (obj)).add(((Object) (Pair.create(((Object) (bq1)), ((Object) (Long.valueOf(l1)))))));
	//  188  381:aload           11
	//  189  383:aload           14
	//  190  385:lload           6
	//  191  387:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  192  390:invokestatic    #659 <Method Pair Pair.create(Object, Object)>
	//  193  393:invokeinterface #476 <Method boolean List.add(Object)>
	//  194  398:pop             
		break MISSING_BLOCK_LABEL_469;
	//  195  399:goto            469
		IOException ioexception;
		ioexception;
	//  196  402:astore          12
		cursor = cursor2;
	//  197  404:aload           10
	//  198  406:astore          8
		cursor1 = cursor2;
	//  199  408:aload           10
	//  200  410:astore          9
		((bt)this).r().u_().a("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (ioexception)));
	//  201  412:aload_0         
	//  202  413:invokevirtual   #244 <Method s bt.r()>
	//  203  416:invokevirtual   #250 <Method u s.u_()>
	//  204  419:ldc2            #792 <String "Failed to merge queued bundle. appId">
	//  205  422:aload_1         
	//  206  423:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  207  426:aload           12
	//  208  428:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		l = j;
	//  209  431:iload_2         
	//  210  432:istore          4
		break MISSING_BLOCK_LABEL_469;
	//  211  434:goto            469
		ioexception;
	//  212  437:astore          12
		cursor = cursor2;
	//  213  439:aload           10
	//  214  441:astore          8
		cursor1 = cursor2;
	//  215  443:aload           10
	//  216  445:astore          9
		((bt)this).r().u_().a("Failed to unzip queued bundle. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (ioexception)));
	//  217  447:aload_0         
	//  218  448:invokevirtual   #244 <Method s bt.r()>
	//  219  451:invokevirtual   #250 <Method u s.u_()>
	//  220  454:ldc2            #794 <String "Failed to unzip queued bundle. appId">
	//  221  457:aload_1         
	//  222  458:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  223  461:aload           12
	//  224  463:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		l = j;
	//  225  466:iload_2         
	//  226  467:istore          4
		cursor = cursor2;
	//  227  469:aload           10
	//  228  471:astore          8
		cursor1 = cursor2;
	//  229  473:aload           10
	//  230  475:astore          9
		boolean flag1 = cursor2.moveToNext();
	//  231  477:aload           10
	//  232  479:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//  233  484:istore          5
		if(!flag1)
			break; /* Loop/switch isn't completed */
	//  234  486:iload           5
	//  235  488:ifeq            500
		j = l;
	//  236  491:iload           4
	//  237  493:istore_2        
		if(l <= k) goto _L2; else goto _L1
	//  238  494:iload           4
	//  239  496:iload_3         
	//  240  497:icmple          173
_L1:
		if(cursor2 != null)
	//* 241  500:aload           10
	//* 242  502:ifnull          512
			cursor2.close();
	//  243  505:aload           10
	//  244  507:invokeinterface #240 <Method void Cursor.close()>
		return ((List) (obj));
	//  245  512:aload           11
	//  246  514:areturn         
		s1;
	//  247  515:astore_1        
		break MISSING_BLOCK_LABEL_566;
	//  248  516:goto            566
		SQLiteException sqliteexception;
		sqliteexception;
	//  249  519:astore          10
		cursor = cursor1;
	//  250  521:aload           9
	//  251  523:astore          8
		((bt)this).r().u_().a("Error querying bundles. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (sqliteexception)));
	//  252  525:aload_0         
	//  253  526:invokevirtual   #244 <Method s bt.r()>
	//  254  529:invokevirtual   #250 <Method u s.u_()>
	//  255  532:ldc2            #796 <String "Error querying bundles. appId">
	//  256  535:aload_1         
	//  257  536:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  258  539:aload           10
	//  259  541:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		cursor = cursor1;
	//  260  544:aload           9
	//  261  546:astore          8
		s1 = ((String) (Collections.emptyList()));
	//  262  548:invokestatic    #778 <Method List Collections.emptyList()>
	//  263  551:astore_1        
		if(cursor1 != null)
	//* 264  552:aload           9
	//* 265  554:ifnull          564
			cursor1.close();
	//  266  557:aload           9
	//  267  559:invokeinterface #240 <Method void Cursor.close()>
		return ((List) (s1));
	//  268  564:aload_1         
	//  269  565:areturn         
		if(cursor != null)
	//* 270  566:aload           8
	//* 271  568:ifnull          578
			cursor.close();
	//  272  571:aload           8
	//  273  573:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  274  578:aload_1         
	//  275  579:athrow          
	}

	public final List a(String s1, String s2, String s3)
	{
		Object obj2;
		ArrayList arraylist;
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		arraylist = new ArrayList();
	//    7   13:new             #456 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #457 <Method void ArrayList()>
	//   10   20:astore          10
		obj2 = null;
	//   11   22:aconst_null     
	//   12   23:astore          9
		Object obj3 = ((Object) (new ArrayList(3)));
	//   13   25:new             #456 <Class ArrayList>
	//   14   28:dup             
	//   15   29:iconst_3        
	//   16   30:invokespecial   #798 <Method void ArrayList(int)>
	//   17   33:astore          11
		SQLiteException sqliteexception;
		Object obj1;
		boolean flag;
		long l;
		Object obj;
		String as[];
		Object obj4;
		try
		{
			((List) (obj3)).add(((Object) (s1)));
	//   18   35:aload           11
	//   19   37:aload_1         
	//   20   38:invokeinterface #476 <Method boolean List.add(Object)>
	//   21   43:pop             
			obj1 = ((Object) (new StringBuilder("app_id=?")));
	//   22   44:new             #484 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:ldc2            #713 <String "app_id=?">
	//   25   51:invokespecial   #799 <Method void StringBuilder(String)>
	//   26   54:astore          8
			flag = TextUtils.isEmpty(((CharSequence) (s2)));
	//   27   56:aload_2         
	//   28   57:invokestatic    #345 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   29   60:istore          4
		}
	//*  30   62:iload           4
	//*  31   64:ifne            565
	//*  32   67:aload           11
	//*  33   69:aload_2         
	//*  34   70:invokeinterface #476 <Method boolean List.add(Object)>
	//*  35   75:pop             
	//*  36   76:aload           8
	//*  37   78:ldc2            #801 <String " and origin=?">
	//*  38   81:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//*  39   84:pop             
	//*  40   85:goto            88
	//*  41   88:aload_2         
	//*  42   89:astore          7
	//*  43   91:aload_3         
	//*  44   92:invokestatic    #345 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  45   95:ifne            125
	//*  46   98:aload           11
	//*  47  100:aload_3         
	//*  48  101:invokestatic    #358 <Method String String.valueOf(Object)>
	//*  49  104:ldc2            #803 <String "*">
	//*  50  107:invokevirtual   #806 <Method String String.concat(String)>
	//*  51  110:invokeinterface #476 <Method boolean List.add(Object)>
	//*  52  115:pop             
	//*  53  116:aload           8
	//*  54  118:ldc2            #808 <String " and name glob ?">
	//*  55  121:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//*  56  124:pop             
	//*  57  125:aload           11
	//*  58  127:aload           11
	//*  59  129:invokeinterface #462 <Method int List.size()>
	//*  60  134:anewarray       String[]
	//*  61  137:invokeinterface #812 <Method Object[] List.toArray(Object[])>
	//*  62  142:checkcast       #813 <Class String[]>
	//*  63  145:astore          11
	//*  64  147:aload_0         
	//*  65  148:invokevirtual   #222 <Method SQLiteDatabase y()>
	//*  66  151:astore          12
	//*  67  153:aload           8
	//*  68  155:invokevirtual   #501 <Method String StringBuilder.toString()>
	//*  69  158:astore          8
	//*  70  160:aload           12
	//*  71  162:ldc2            #740 <String "user_attributes">
	//*  72  165:iconst_4        
	//*  73  166:anewarray       String[]
	//*  74  169:dup             
	//*  75  170:iconst_0        
	//*  76  171:ldc2            #742 <String "name">
	//*  77  174:aastore         
	//*  78  175:dup             
	//*  79  176:iconst_1        
	//*  80  177:ldc2            #744 <String "set_timestamp">
	//*  81  180:aastore         
	//*  82  181:dup             
	//*  83  182:iconst_2        
	//*  84  183:ldc2            #746 <String "value">
	//*  85  186:aastore         
	//*  86  187:dup             
	//*  87  188:iconst_3        
	//*  88  189:ldc1            #43  <String "origin">
	//*  89  191:aastore         
	//*  90  192:aload           8
	//*  91  194:aload           11
	//*  92  196:aconst_null     
	//*  93  197:aconst_null     
	//*  94  198:ldc2            #748 <String "rowid">
	//*  95  201:ldc2            #815 <String "1001">
	//*  96  204:invokevirtual   #753 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//*  97  207:astore          8
	//*  98  209:aload           7
	//*  99  211:astore          9
	//* 100  213:aload           8
	//* 101  215:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//* 102  220:istore          4
	//* 103  222:iload           4
	//* 104  224:ifne            242
	//* 105  227:aload           8
	//* 106  229:ifnull          239
	//* 107  232:aload           8
	//* 108  234:invokeinterface #240 <Method void Cursor.close()>
	//* 109  239:aload           10
	//* 110  241:areturn         
	//* 111  242:aload           7
	//* 112  244:astore          9
	//* 113  246:aload           10
	//* 114  248:invokeinterface #462 <Method int List.size()>
	//* 115  253:sipush          1000
	//* 116  256:icmplt          285
	//* 117  259:aload           7
	//* 118  261:astore          9
	//* 119  263:aload_0         
	//* 120  264:invokevirtual   #244 <Method s bt.r()>
	//* 121  267:invokevirtual   #250 <Method u s.u_()>
	//* 122  270:ldc2            #817 <String "Read more than the max allowed user properties, ignoring excess">
	//* 123  273:sipush          1000
	//* 124  276:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//* 125  279:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//* 126  282:goto            425
	//* 127  285:aload           7
	//* 128  287:astore          9
	//* 129  289:aload           8
	//* 130  291:iconst_0        
	//* 131  292:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 132  297:astore          11
	//* 133  299:aload           7
	//* 134  301:astore          9
	//* 135  303:aload           8
	//* 136  305:iconst_1        
	//* 137  306:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 138  311:lstore          5
	//* 139  313:aload           8
	//* 140  315:astore          9
	//* 141  317:aload_0         
	//* 142  318:aload           8
	//* 143  320:iconst_2        
	//* 144  321:invokespecial   #757 <Method Object a(Cursor, int)>
	//* 145  324:astore          12
	//* 146  326:aload           8
	//* 147  328:astore          9
	//* 148  330:aload           8
	//* 149  332:iconst_3        
	//* 150  333:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 151  338:astore_2        
	//* 152  339:aload           12
	//* 153  341:ifnonnull       380
	//* 154  344:aload           8
	//* 155  346:astore          9
	//* 156  348:aload_0         
	//* 157  349:invokevirtual   #244 <Method s bt.r()>
	//* 158  352:invokevirtual   #250 <Method u s.u_()>
	//* 159  355:ldc2            #819 <String "(2)Read invalid user property value, ignoring it">
	//* 160  358:aload_1         
	//* 161  359:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//* 162  362:aload_2         
	//* 163  363:aload_3         
	//* 164  364:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
	//* 165  367:goto            407
	//* 166  370:astore          7
	//* 167  372:aload_2         
	//* 168  373:astore_3        
	//* 169  374:aload           7
	//* 170  376:astore_2        
	//* 171  377:goto            508
	//* 172  380:aload           8
	//* 173  382:astore          9
	//* 174  384:aload           10
	//* 175  386:new             #761 <Class en>
	//* 176  389:dup             
	//* 177  390:aload_1         
	//* 178  391:aload_2         
	//* 179  392:aload           11
	//* 180  394:lload           5
	//* 181  396:aload           12
	//* 182  398:invokespecial   #764 <Method void en(String, String, String, long, Object)>
	//* 183  401:invokeinterface #476 <Method boolean List.add(Object)>
	//* 184  406:pop             
	//* 185  407:aload           8
	//* 186  409:astore          9
	//* 187  411:aload           8
	//* 188  413:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//* 189  418:istore          4
	//* 190  420:iload           4
	//* 191  422:ifne            440
	//* 192  425:aload           8
	//* 193  427:ifnull          437
	//* 194  430:aload           8
	//* 195  432:invokeinterface #240 <Method void Cursor.close()>
	//* 196  437:aload           10
	//* 197  439:areturn         
	//* 198  440:aload_2         
	//* 199  441:astore          7
	//* 200  443:goto            242
	//* 201  446:astore_3        
	//* 202  447:goto            452
	//* 203  450:astore          7
	//* 204  452:aload_2         
	//* 205  453:astore          7
	//* 206  455:aload_3         
	//* 207  456:astore_2        
	//* 208  457:aload           7
	//* 209  459:astore_3        
	//* 210  460:goto            508
	//* 211  463:astore_2        
	//* 212  464:aload           7
	//* 213  466:astore_3        
	//* 214  467:goto            508
	//* 215  470:astore_1        
	//* 216  471:goto            550
	//* 217  474:astore_2        
	//* 218  475:aload           9
	//* 219  477:astore_3        
	//* 220  478:goto            508
	//* 221  481:astore          7
	//* 222  483:goto            500
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
	//* 223  486:astore          7
		{
			break MISSING_BLOCK_LABEL_500;
	//  224  488:goto            500
		}
		if(flag)
			break MISSING_BLOCK_LABEL_88;
		((List) (obj3)).add(((Object) (s2)));
		((StringBuilder) (obj1)).append(" and origin=?");
		obj = ((Object) (s2));
		if(!TextUtils.isEmpty(((CharSequence) (s3))))
		{
			((List) (obj3)).add(((Object) (String.valueOf(((Object) (s3))).concat("*"))));
			((StringBuilder) (obj1)).append(" and name glob ?");
		}
		as = (String[])((List) (obj3)).toArray(((Object []) (new String[((List) (obj3)).size()])));
		obj4 = ((Object) (y()));
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
		obj1 = ((Object) (((SQLiteDatabase) (obj4)).query("user_attributes", new String[] {
			"name", "set_timestamp", "value", "origin"
		}, ((String) (obj1)), as, ((String) (null)), ((String) (null)), "rowid", "1001")));
		obj2 = obj;
		flag = ((Cursor) (obj1)).moveToFirst();
		if(!flag)
		{
			if(obj1 != null)
				((Cursor) (obj1)).close();
			return ((List) (arraylist));
		}
_L2:
		obj2 = obj;
		if(((List) (arraylist)).size() < 1000)
			break MISSING_BLOCK_LABEL_285;
		obj2 = obj;
		try
		{
			((bt)this).r().u_().a("Read more than the max allowed user properties, ignoring excess", ((Object) (Integer.valueOf(1000))));
			break MISSING_BLOCK_LABEL_425;
		}
		// Misplaced declaration of an exception variable
		catch(String s2)
		{
			s3 = ((String) (obj2));
		}
		break; /* Loop/switch isn't completed */
		obj2 = obj;
		as = ((String []) (((Cursor) (obj1)).getString(0)));
		obj2 = obj;
		l = ((Cursor) (obj1)).getLong(1);
		obj2 = obj1;
		obj4 = a(((Cursor) (obj1)), 2);
		obj2 = obj1;
		s2 = ((Cursor) (obj1)).getString(3);
		if(obj4 != null)
			break MISSING_BLOCK_LABEL_380;
		obj2 = obj1;
		try
		{
			((bt)this).r().u_().a("(2)Read invalid user property value, ignoring it", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (s2)), ((Object) (s3)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			s3 = s2;
			s2 = ((String) (obj));
			break; /* Loop/switch isn't completed */
		}
		break MISSING_BLOCK_LABEL_407;
		obj2 = obj1;
		((List) (arraylist)).add(((Object) (new en(s1, s2, ((String) (as)), l, obj4))));
		obj2 = obj1;
		flag = ((Cursor) (obj1)).moveToNext();
		if(flag)
			break MISSING_BLOCK_LABEL_440;
		if(obj1 != null)
			((Cursor) (obj1)).close();
		return ((List) (arraylist));
		obj = ((Object) (s2));
		if(true) goto _L2; else goto _L1
		s3;
		obj = ((Object) (s2));
		s2 = s3;
		s3 = ((String) (obj));
		  goto _L1
		s2;
		s3 = ((String) (obj));
		  goto _L1
		s1;
		break MISSING_BLOCK_LABEL_550;
		sqliteexception;
		break MISSING_BLOCK_LABEL_500;
		s1;
	//  225  491:astore_1        
		s2 = ((String) (obj2));
	//  226  492:aload           9
	//  227  494:astore_2        
		break MISSING_BLOCK_LABEL_553;
	//  228  495:goto            553
		sqliteexception;
	//  229  498:astore          7
		obj1 = null;
	//  230  500:aconst_null     
	//  231  501:astore          8
		s3 = s2;
	//  232  503:aload_2         
	//  233  504:astore_3        
		s2 = ((String) (sqliteexception));
	//  234  505:aload           7
	//  235  507:astore_2        
_L1:
		obj2 = obj1;
	//  236  508:aload           8
	//  237  510:astore          9
		((bt)this).r().u_().a("(2)Error querying user properties", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (s3)), ((Object) (s2)));
	//  238  512:aload_0         
	//  239  513:invokevirtual   #244 <Method s bt.r()>
	//  240  516:invokevirtual   #250 <Method u s.u_()>
	//  241  519:ldc2            #821 <String "(2)Error querying user properties">
	//  242  522:aload_1         
	//  243  523:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  244  526:aload_3         
	//  245  527:aload_2         
	//  246  528:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
		if(obj1 != null)
	//* 247  531:aload           8
	//* 248  533:ifnull          543
			((Cursor) (obj1)).close();
	//  249  536:aload           8
	//  250  538:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//  251  543:aconst_null     
	//  252  544:areturn         
		s1;
	//  253  545:astore_1        
		obj1 = obj2;
	//  254  546:aload           9
	//  255  548:astore          8
		s2 = ((String) (obj1));
	//  256  550:aload           8
	//  257  552:astore_2        
		if(s2 != null)
	//* 258  553:aload_2         
	//* 259  554:ifnull          563
			((Cursor) (s2)).close();
	//  260  557:aload_2         
	//  261  558:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  262  563:aload_1         
	//  263  564:athrow          
	//* 264  565:goto            88
	}

	public final List a(String s1, String as[])
	{
		ArrayList arraylist;
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #332 <Method void ed.k()>
		arraylist = new ArrayList();
	//    4    8:new             #456 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #457 <Method void ArrayList()>
	//    7   15:astore          12
		as = ((String []) (y().query("conditional_properties", new String[] {
			"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", 
			"triggered_timestamp", "time_to_live", "expired_event"
		}, s1, as, ((String) (null)), ((String) (null)), "rowid", "1001")));
	//    8   17:aload_0         
	//    9   18:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   10   21:ldc2            #824 <String "conditional_properties">
	//   11   24:bipush          13
	//   12   26:anewarray       String[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:ldc2            #380 <String "app_id">
	//   16   34:aastore         
	//   17   35:dup             
	//   18   36:iconst_1        
	//   19   37:ldc1            #43  <String "origin">
	//   20   39:aastore         
	//   21   40:dup             
	//   22   41:iconst_2        
	//   23   42:ldc2            #742 <String "name">
	//   24   45:aastore         
	//   25   46:dup             
	//   26   47:iconst_3        
	//   27   48:ldc2            #746 <String "value">
	//   28   51:aastore         
	//   29   52:dup             
	//   30   53:iconst_4        
	//   31   54:ldc2            #826 <String "active">
	//   32   57:aastore         
	//   33   58:dup             
	//   34   59:iconst_5        
	//   35   60:ldc2            #828 <String "trigger_event_name">
	//   36   63:aastore         
	//   37   64:dup             
	//   38   65:bipush          6
	//   39   67:ldc2            #830 <String "trigger_timeout">
	//   40   70:aastore         
	//   41   71:dup             
	//   42   72:bipush          7
	//   43   74:ldc2            #832 <String "timed_out_event">
	//   44   77:aastore         
	//   45   78:dup             
	//   46   79:bipush          8
	//   47   81:ldc2            #834 <String "creation_timestamp">
	//   48   84:aastore         
	//   49   85:dup             
	//   50   86:bipush          9
	//   51   88:ldc2            #836 <String "triggered_event">
	//   52   91:aastore         
	//   53   92:dup             
	//   54   93:bipush          10
	//   55   95:ldc2            #838 <String "triggered_timestamp">
	//   56   98:aastore         
	//   57   99:dup             
	//   58  100:bipush          11
	//   59  102:ldc2            #840 <String "time_to_live">
	//   60  105:aastore         
	//   61  106:dup             
	//   62  107:bipush          12
	//   63  109:ldc2            #842 <String "expired_event">
	//   64  112:aastore         
	//   65  113:aload_1         
	//   66  114:aload_2         
	//   67  115:aconst_null     
	//   68  116:aconst_null     
	//   69  117:ldc2            #748 <String "rowid">
	//   70  120:ldc2            #815 <String "1001">
	//   71  123:invokevirtual   #753 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   72  126:astore_2        
		boolean flag;
		long l;
		long l1;
		long l2;
		long l3;
		String s2;
		String s3;
		Object obj;
		String s4;
		zzag zzag1;
		zzag zzag2;
		zzag zzag3;
		try
		{
			flag = ((Cursor) (as)).moveToFirst();
	//   73  127:aload_2         
	//   74  128:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   75  133:istore_3        
		}
	//*  76  134:iload_3         
	//*  77  135:ifne            151
	//*  78  138:aload_2         
	//*  79  139:ifnull          148
	//*  80  142:aload_2         
	//*  81  143:invokeinterface #240 <Method void Cursor.close()>
	//*  82  148:aload           12
	//*  83  150:areturn         
	//*  84  151:aload           12
	//*  85  153:invokeinterface #462 <Method int List.size()>
	//*  86  158:sipush          1000
	//*  87  161:icmplt          186
	//*  88  164:aload_0         
	//*  89  165:invokevirtual   #244 <Method s bt.r()>
	//*  90  168:invokevirtual   #250 <Method u s.u_()>
	//*  91  171:ldc2            #844 <String "Read more than the max allowed conditional properties, ignoring extra">
	//*  92  174:sipush          1000
	//*  93  177:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//*  94  180:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//*  95  183:goto            412
	//*  96  186:aload_2         
	//*  97  187:iconst_0        
	//*  98  188:invokeinterface #283 <Method String Cursor.getString(int)>
	//*  99  193:astore_1        
	//* 100  194:aload_2         
	//* 101  195:iconst_1        
	//* 102  196:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 103  201:astore          13
	//* 104  203:aload_2         
	//* 105  204:iconst_2        
	//* 106  205:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 107  210:astore          14
	//* 108  212:aload_0         
	//* 109  213:aload_2         
	//* 110  214:iconst_3        
	//* 111  215:invokespecial   #757 <Method Object a(Cursor, int)>
	//* 112  218:astore          15
	//* 113  220:aload_2         
	//* 114  221:iconst_4        
	//* 115  222:invokeinterface #788 <Method int Cursor.getInt(int)>
	//* 116  227:ifeq            500
	//* 117  230:iconst_1        
	//* 118  231:istore_3        
	//* 119  232:goto            235
	//* 120  235:aload_2         
	//* 121  236:iconst_5        
	//* 122  237:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 123  242:astore          16
	//* 124  244:aload_2         
	//* 125  245:bipush          6
	//* 126  247:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 127  252:lstore          4
	//* 128  254:aload_0         
	//* 129  255:invokevirtual   #603 <Method el ec.g()>
	//* 130  258:aload_2         
	//* 131  259:bipush          7
	//* 132  261:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//* 133  266:getstatic       #850 <Field android.os.Parcelable$Creator zzag.CREATOR>
	//* 134  269:invokevirtual   #853 <Method android.os.Parcelable com.google.android.gms.measurement.internal.el.a(byte[], android.os.Parcelable$Creator)>
	//* 135  272:checkcast       #846 <Class zzag>
	//* 136  275:astore          17
	//* 137  277:aload_2         
	//* 138  278:bipush          8
	//* 139  280:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 140  285:lstore          6
	//* 141  287:aload_0         
	//* 142  288:invokevirtual   #603 <Method el ec.g()>
	//* 143  291:aload_2         
	//* 144  292:bipush          9
	//* 145  294:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//* 146  299:getstatic       #850 <Field android.os.Parcelable$Creator zzag.CREATOR>
	//* 147  302:invokevirtual   #853 <Method android.os.Parcelable com.google.android.gms.measurement.internal.el.a(byte[], android.os.Parcelable$Creator)>
	//* 148  305:checkcast       #846 <Class zzag>
	//* 149  308:astore          18
	//* 150  310:aload_2         
	//* 151  311:bipush          10
	//* 152  313:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 153  318:lstore          8
	//* 154  320:aload_2         
	//* 155  321:bipush          11
	//* 156  323:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 157  328:lstore          10
	//* 158  330:aload_0         
	//* 159  331:invokevirtual   #603 <Method el ec.g()>
	//* 160  334:aload_2         
	//* 161  335:bipush          12
	//* 162  337:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//* 163  342:getstatic       #850 <Field android.os.Parcelable$Creator zzag.CREATOR>
	//* 164  345:invokevirtual   #853 <Method android.os.Parcelable com.google.android.gms.measurement.internal.el.a(byte[], android.os.Parcelable$Creator)>
	//* 165  348:checkcast       #846 <Class zzag>
	//* 166  351:astore          19
	//* 167  353:aload           12
	//* 168  355:new             #855 <Class zzo>
	//* 169  358:dup             
	//* 170  359:aload_1         
	//* 171  360:aload           13
	//* 172  362:new             #857 <Class zzfu>
	//* 173  365:dup             
	//* 174  366:aload           14
	//* 175  368:lload           8
	//* 176  370:aload           15
	//* 177  372:aload           13
	//* 178  374:invokespecial   #860 <Method void zzfu(String, long, Object, String)>
	//* 179  377:lload           6
	//* 180  379:iload_3         
	//* 181  380:aload           16
	//* 182  382:aload           17
	//* 183  384:lload           4
	//* 184  386:aload           18
	//* 185  388:lload           10
	//* 186  390:aload           19
	//* 187  392:invokespecial   #863 <Method void zzo(String, String, zzfu, long, boolean, String, zzag, long, zzag, long, zzag)>
	//* 188  395:invokeinterface #476 <Method boolean List.add(Object)>
	//* 189  400:pop             
	//* 190  401:aload_2         
	//* 191  402:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//* 192  407:istore_3        
	//* 193  408:iload_3         
	//* 194  409:ifne            425
	//* 195  412:aload_2         
	//* 196  413:ifnull          422
	//* 197  416:aload_2         
	//* 198  417:invokeinterface #240 <Method void Cursor.close()>
	//* 199  422:aload           12
	//* 200  424:areturn         
	//* 201  425:goto            151
	//* 202  428:astore_1        
	//* 203  429:goto            488
		catch(SQLiteException sqliteexception)
	//* 204  432:astore          12
		{
			s1 = ((String) (as));
	//  205  434:aload_2         
	//  206  435:astore_1        
			as = ((String []) (sqliteexception));
	//  207  436:aload           12
	//  208  438:astore_2        
			break MISSING_BLOCK_LABEL_451;
	//  209  439:goto            451
		}
		if(!flag)
		{
			if(as != null)
				((Cursor) (as)).close();
			return ((List) (arraylist));
		}
		if(((List) (arraylist)).size() >= 1000)
		{
			((bt)this).r().u_().a("Read more than the max allowed conditional properties, ignoring extra", ((Object) (Integer.valueOf(1000))));
			break; /* Loop/switch isn't completed */
		}
		s1 = ((Cursor) (as)).getString(0);
		s2 = ((Cursor) (as)).getString(1);
		s3 = ((Cursor) (as)).getString(2);
		obj = a(((Cursor) (as)), 3);
		Exception exception;
		if(((Cursor) (as)).getInt(4) != 0)
			flag = true;
		else
	//* 210  442:astore_1        
	//* 211  443:aconst_null     
	//* 212  444:astore_2        
	//* 213  445:goto            488
	//* 214  448:astore_2        
	//* 215  449:aconst_null     
	//* 216  450:astore_1        
	//* 217  451:aload_0         
	//* 218  452:invokevirtual   #244 <Method s bt.r()>
	//* 219  455:invokevirtual   #250 <Method u s.u_()>
	//* 220  458:ldc2            #865 <String "Error querying conditional user property value">
	//* 221  461:aload_2         
	//* 222  462:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//* 223  465:invokestatic    #778 <Method List Collections.emptyList()>
	//* 224  468:astore_2        
	//* 225  469:aload_1         
	//* 226  470:ifnull          479
	//* 227  473:aload_1         
	//* 228  474:invokeinterface #240 <Method void Cursor.close()>
	//* 229  479:aload_2         
	//* 230  480:areturn         
	//* 231  481:astore          12
	//* 232  483:aload_1         
	//* 233  484:astore_2        
	//* 234  485:aload           12
	//* 235  487:astore_1        
	//* 236  488:aload_2         
	//* 237  489:ifnull          498
	//* 238  492:aload_2         
	//* 239  493:invokeinterface #240 <Method void Cursor.close()>
	//* 240  498:aload_1         
	//* 241  499:athrow          
			flag = false;
	//  242  500:iconst_0        
	//  243  501:istore_3        
		s4 = ((Cursor) (as)).getString(5);
		l = ((Cursor) (as)).getLong(6);
		zzag1 = (zzag)((ec)this).g().a(((Cursor) (as)).getBlob(7), zzag.CREATOR);
		l1 = ((Cursor) (as)).getLong(8);
		zzag2 = (zzag)((ec)this).g().a(((Cursor) (as)).getBlob(9), zzag.CREATOR);
		l2 = ((Cursor) (as)).getLong(10);
		l3 = ((Cursor) (as)).getLong(11);
		zzag3 = (zzag)((ec)this).g().a(((Cursor) (as)).getBlob(12), zzag.CREATOR);
		((List) (arraylist)).add(((Object) (new zzo(s1, s2, new zzfu(s3, l2, obj, s2), l1, flag, s4, zzag1, l, zzag2, l3, zzag3))));
		flag = ((Cursor) (as)).moveToNext();
		if(flag) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_151;
_L1:
		if(as != null)
			((Cursor) (as)).close();
		return ((List) (arraylist));
		s1;
		break MISSING_BLOCK_LABEL_488;
		s1;
		as = null;
		break MISSING_BLOCK_LABEL_488;
		as;
		s1 = null;
		((bt)this).r().u_().a("Error querying conditional user property value", ((Object) (as)));
		as = ((String []) (Collections.emptyList()));
		if(s1 != null)
			((Cursor) (s1)).close();
		return ((List) (as));
		exception;
		as = ((String []) (s1));
		s1 = ((String) (exception));
		if(as != null)
			((Cursor) (as)).close();
		throw s1;
	//* 244  502:goto            235
	}

	public final void a(d d1)
	{
		am.a(((Object) (d1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #308 <Method Object am.a(Object)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		ContentValues contentvalues = new ContentValues();
	//    7   13:new             #310 <Class ContentValues>
	//    8   16:dup             
	//    9   17:invokespecial   #378 <Method void ContentValues()>
	//   10   20:astore_3        
		contentvalues.put("app_id", d1.a);
	//   11   21:aload_3         
	//   12   22:ldc2            #380 <String "app_id">
	//   13   25:aload_1         
	//   14   26:getfield        #868 <Field String com.google.android.gms.measurement.internal.d.a>
	//   15   29:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("name", d1.b);
	//   16   32:aload_3         
	//   17   33:ldc2            #742 <String "name">
	//   18   36:aload_1         
	//   19   37:getfield        #869 <Field String d.b>
	//   20   40:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("lifetime_count", Long.valueOf(d1.c));
	//   21   43:aload_3         
	//   22   44:ldc2            #668 <String "lifetime_count">
	//   23   47:aload_1         
	//   24   48:getfield        #870 <Field long d.c>
	//   25   51:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   26   54:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("current_bundle_count", Long.valueOf(d1.d));
	//   27   57:aload_3         
	//   28   58:ldc2            #670 <String "current_bundle_count">
	//   29   61:aload_1         
	//   30   62:getfield        #871 <Field long d.d>
	//   31   65:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   32   68:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("last_fire_timestamp", Long.valueOf(d1.e));
	//   33   71:aload_3         
	//   34   72:ldc2            #672 <String "last_fire_timestamp">
	//   35   75:aload_1         
	//   36   76:getfield        #872 <Field long com.google.android.gms.measurement.internal.d.e>
	//   37   79:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   38   82:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("last_bundled_timestamp", Long.valueOf(d1.f));
	//   39   85:aload_3         
	//   40   86:ldc1            #21  <String "last_bundled_timestamp">
	//   41   88:aload_1         
	//   42   89:getfield        #874 <Field long d.f>
	//   43   92:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   44   95:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("last_bundled_day", d1.g);
	//   45   98:aload_3         
	//   46   99:ldc1            #25  <String "last_bundled_day">
	//   47  101:aload_1         
	//   48  102:getfield        #877 <Field Long d.g>
	//   49  105:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("last_sampled_complex_event_id", d1.h);
	//   50  108:aload_3         
	//   51  109:ldc1            #29  <String "last_sampled_complex_event_id">
	//   52  111:aload_1         
	//   53  112:getfield        #879 <Field Long d.h>
	//   54  115:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("last_sampling_rate", d1.i);
	//   55  118:aload_3         
	//   56  119:ldc1            #33  <String "last_sampling_rate">
	//   57  121:aload_1         
	//   58  122:getfield        #881 <Field Long d.i>
	//   59  125:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		Long long1;
		if(d1.j != null && d1.j.booleanValue())
	//*  60  128:aload_1         
	//*  61  129:getfield        #884 <Field Boolean d.j>
	//*  62  132:ifnull          153
	//*  63  135:aload_1         
	//*  64  136:getfield        #884 <Field Boolean d.j>
	//*  65  139:invokevirtual   #887 <Method boolean Boolean.booleanValue()>
	//*  66  142:ifeq            153
			long1 = Long.valueOf(1L);
	//   67  145:lconst_1        
	//   68  146:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   69  149:astore_2        
		else
	//*  70  150:goto            155
			long1 = null;
	//   71  153:aconst_null     
	//   72  154:astore_2        
		contentvalues.put("last_exempt_from_sampling", long1);
	//   73  155:aload_3         
	//   74  156:ldc1            #37  <String "last_exempt_from_sampling">
	//   75  158:aload_2         
	//   76  159:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		try
		{
			if(y().insertWithOnConflict("events", ((String) (null)), contentvalues, 5) == -1L)
	//*  77  162:aload_0         
	//*  78  163:invokevirtual   #222 <Method SQLiteDatabase y()>
	//*  79  166:ldc2            #666 <String "events">
	//*  80  169:aconst_null     
	//*  81  170:aload_3         
	//*  82  171:iconst_5        
	//*  83  172:invokevirtual   #400 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//*  84  175:ldc2w           #401 <Long -1L>
	//*  85  178:lcmp            
	//*  86  179:ifne            202
				((bt)this).r().u_().a("Failed to insert/update event aggregates (got -1). appId", com.google.android.gms.measurement.internal.s.a(d1.a));
	//   87  182:aload_0         
	//   88  183:invokevirtual   #244 <Method s bt.r()>
	//   89  186:invokevirtual   #250 <Method u s.u_()>
	//   90  189:ldc2            #889 <String "Failed to insert/update event aggregates (got -1). appId">
	//   91  192:aload_1         
	//   92  193:getfield        #868 <Field String com.google.android.gms.measurement.internal.d.a>
	//   93  196:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   94  199:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			return;
	//   95  202:return          
		}
		catch(SQLiteException sqliteexception)
	//*  96  203:astore_2        
		{
			((bt)this).r().u_().a("Error storing event aggregates. appId", com.google.android.gms.measurement.internal.s.a(d1.a), ((Object) (sqliteexception)));
	//   97  204:aload_0         
	//   98  205:invokevirtual   #244 <Method s bt.r()>
	//   99  208:invokevirtual   #250 <Method u s.u_()>
	//  100  211:ldc2            #891 <String "Error storing event aggregates. appId">
	//  101  214:aload_1         
	//  102  215:getfield        #868 <Field String com.google.android.gms.measurement.internal.d.a>
	//  103  218:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  104  221:aload_2         
	//  105  222:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		}
	//  106  225:return          
	}

	public final void a(er er1)
	{
		am.a(((Object) (er1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #308 <Method Object am.a(Object)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		ContentValues contentvalues = new ContentValues();
	//    7   13:new             #310 <Class ContentValues>
	//    8   16:dup             
	//    9   17:invokespecial   #378 <Method void ContentValues()>
	//   10   20:astore_2        
		contentvalues.put("app_id", er1.b());
	//   11   21:aload_2         
	//   12   22:ldc2            #380 <String "app_id">
	//   13   25:aload_1         
	//   14   26:invokevirtual   #896 <Method String er.b()>
	//   15   29:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("app_instance_id", er1.c());
	//   16   32:aload_2         
	//   17   33:ldc2            #898 <String "app_instance_id">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #900 <Method String er.c()>
	//   20   40:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("gmp_app_id", er1.d());
	//   21   43:aload_2         
	//   22   44:ldc2            #902 <String "gmp_app_id">
	//   23   47:aload_1         
	//   24   48:invokevirtual   #904 <Method String er.d()>
	//   25   51:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("resettable_device_id_hash", er1.f());
	//   26   54:aload_2         
	//   27   55:ldc2            #906 <String "resettable_device_id_hash">
	//   28   58:aload_1         
	//   29   59:invokevirtual   #908 <Method String er.f()>
	//   30   62:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("last_bundle_index", Long.valueOf(er1.p()));
	//   31   65:aload_2         
	//   32   66:ldc2            #910 <String "last_bundle_index">
	//   33   69:aload_1         
	//   34   70:invokevirtual   #912 <Method long er.p()>
	//   35   73:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   36   76:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("last_bundle_start_timestamp", Long.valueOf(er1.h()));
	//   37   79:aload_2         
	//   38   80:ldc1            #69  <String "last_bundle_start_timestamp">
	//   39   82:aload_1         
	//   40   83:invokevirtual   #914 <Method long er.h()>
	//   41   86:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   42   89:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("last_bundle_end_timestamp", Long.valueOf(er1.i()));
	//   43   92:aload_2         
	//   44   93:ldc2            #916 <String "last_bundle_end_timestamp">
	//   45   96:aload_1         
	//   46   97:invokevirtual   #918 <Method long er.i()>
	//   47  100:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   48  103:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("app_version", er1.j());
	//   49  106:aload_2         
	//   50  107:ldc1            #49  <String "app_version">
	//   51  109:aload_1         
	//   52  110:invokevirtual   #920 <Method String er.j()>
	//   53  113:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("app_store", er1.l());
	//   54  116:aload_2         
	//   55  117:ldc1            #53  <String "app_store">
	//   56  119:aload_1         
	//   57  120:invokevirtual   #923 <Method String er.l()>
	//   58  123:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("gmp_version", Long.valueOf(er1.m()));
	//   59  126:aload_2         
	//   60  127:ldc1            #57  <String "gmp_version">
	//   61  129:aload_1         
	//   62  130:invokevirtual   #925 <Method long er.m()>
	//   63  133:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   64  136:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("dev_cert_hash", Long.valueOf(er1.n()));
	//   65  139:aload_2         
	//   66  140:ldc1            #61  <String "dev_cert_hash">
	//   67  142:aload_1         
	//   68  143:invokevirtual   #927 <Method long er.n()>
	//   69  146:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   70  149:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("measurement_enabled", Boolean.valueOf(er1.o()));
	//   71  152:aload_2         
	//   72  153:ldc1            #65  <String "measurement_enabled">
	//   73  155:aload_1         
	//   74  156:invokevirtual   #929 <Method boolean er.o()>
	//   75  159:invokestatic    #687 <Method Boolean Boolean.valueOf(boolean)>
	//   76  162:invokevirtual   #932 <Method void ContentValues.put(String, Boolean)>
		contentvalues.put("day", Long.valueOf(er1.t()));
	//   77  165:aload_2         
	//   78  166:ldc1            #73  <String "day">
	//   79  168:aload_1         
	//   80  169:invokevirtual   #934 <Method long er.t()>
	//   81  172:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   82  175:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("daily_public_events_count", Long.valueOf(er1.u()));
	//   83  178:aload_2         
	//   84  179:ldc1            #77  <String "daily_public_events_count">
	//   85  181:aload_1         
	//   86  182:invokevirtual   #937 <Method long er.u()>
	//   87  185:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   88  188:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("daily_events_count", Long.valueOf(er1.v()));
	//   89  191:aload_2         
	//   90  192:ldc1            #81  <String "daily_events_count">
	//   91  194:aload_1         
	//   92  195:invokevirtual   #940 <Method long er.v()>
	//   93  198:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   94  201:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("daily_conversions_count", Long.valueOf(er1.w()));
	//   95  204:aload_2         
	//   96  205:ldc1            #85  <String "daily_conversions_count">
	//   97  207:aload_1         
	//   98  208:invokevirtual   #943 <Method long er.w()>
	//   99  211:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  100  214:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("config_fetched_time", Long.valueOf(er1.q()));
	//  101  217:aload_2         
	//  102  218:ldc1            #93  <String "config_fetched_time">
	//  103  220:aload_1         
	//  104  221:invokevirtual   #946 <Method long er.q()>
	//  105  224:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  106  227:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("failed_config_fetch_time", Long.valueOf(er1.r()));
	//  107  230:aload_2         
	//  108  231:ldc1            #97  <String "failed_config_fetch_time">
	//  109  233:aload_1         
	//  110  234:invokevirtual   #948 <Method long er.r()>
	//  111  237:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  112  240:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("app_version_int", Long.valueOf(er1.k()));
	//  113  243:aload_2         
	//  114  244:ldc1            #101 <String "app_version_int">
	//  115  246:aload_1         
	//  116  247:invokevirtual   #950 <Method long er.k()>
	//  117  250:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  118  253:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("firebase_instance_id", er1.g());
	//  119  256:aload_2         
	//  120  257:ldc1            #105 <String "firebase_instance_id">
	//  121  259:aload_1         
	//  122  260:invokevirtual   #952 <Method String er.g()>
	//  123  263:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("daily_error_events_count", Long.valueOf(er1.y()));
	//  124  266:aload_2         
	//  125  267:ldc1            #109 <String "daily_error_events_count">
	//  126  269:aload_1         
	//  127  270:invokevirtual   #954 <Method long er.y()>
	//  128  273:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  129  276:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("daily_realtime_events_count", Long.valueOf(er1.x()));
	//  130  279:aload_2         
	//  131  280:ldc1            #113 <String "daily_realtime_events_count">
	//  132  282:aload_1         
	//  133  283:invokevirtual   #956 <Method long er.x()>
	//  134  286:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  135  289:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("health_monitor_sample", er1.z());
	//  136  292:aload_2         
	//  137  293:ldc1            #117 <String "health_monitor_sample">
	//  138  295:aload_1         
	//  139  296:invokevirtual   #959 <Method String er.z()>
	//  140  299:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("android_id", Long.valueOf(er1.B()));
	//  141  302:aload_2         
	//  142  303:ldc1            #121 <String "android_id">
	//  143  305:aload_1         
	//  144  306:invokevirtual   #961 <Method long er.B()>
	//  145  309:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  146  312:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("adid_reporting_enabled", Boolean.valueOf(er1.C()));
	//  147  315:aload_2         
	//  148  316:ldc1            #125 <String "adid_reporting_enabled">
	//  149  318:aload_1         
	//  150  319:invokevirtual   #963 <Method boolean er.C()>
	//  151  322:invokestatic    #687 <Method Boolean Boolean.valueOf(boolean)>
	//  152  325:invokevirtual   #932 <Method void ContentValues.put(String, Boolean)>
		contentvalues.put("ssaid_reporting_enabled", Boolean.valueOf(er1.D()));
	//  153  328:aload_2         
	//  154  329:ldc1            #129 <String "ssaid_reporting_enabled">
	//  155  331:aload_1         
	//  156  332:invokevirtual   #965 <Method boolean er.D()>
	//  157  335:invokestatic    #687 <Method Boolean Boolean.valueOf(boolean)>
	//  158  338:invokevirtual   #932 <Method void ContentValues.put(String, Boolean)>
		contentvalues.put("admob_app_id", er1.e());
	//  159  341:aload_2         
	//  160  342:ldc1            #133 <String "admob_app_id">
	//  161  344:aload_1         
	//  162  345:invokevirtual   #967 <Method String com.google.android.gms.measurement.internal.er.e()>
	//  163  348:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		try
		{
			SQLiteDatabase sqlitedatabase = y();
	//  164  351:aload_0         
	//  165  352:invokevirtual   #222 <Method SQLiteDatabase y()>
	//  166  355:astore_3        
			if((long)sqlitedatabase.update("apps", contentvalues, "app_id = ?", new String[] {
	er1.b()
}) == 0L && sqlitedatabase.insertWithOnConflict("apps", ((String) (null)), contentvalues, 5) == -1L)
	//* 167  356:aload_3         
	//* 168  357:ldc2            #711 <String "apps">
	//* 169  360:aload_2         
	//* 170  361:ldc2            #969 <String "app_id = ?">
	//* 171  364:iconst_1        
	//* 172  365:anewarray       String[]
	//* 173  368:dup             
	//* 174  369:iconst_0        
	//* 175  370:aload_1         
	//* 176  371:invokevirtual   #896 <Method String er.b()>
	//* 177  374:aastore         
	//* 178  375:invokevirtual   #729 <Method int SQLiteDatabase.update(String, ContentValues, String, String[])>
	//* 179  378:i2l             
	//* 180  379:lconst_0        
	//* 181  380:lcmp            
	//* 182  381:ifne            421
	//* 183  384:aload_3         
	//* 184  385:ldc2            #711 <String "apps">
	//* 185  388:aconst_null     
	//* 186  389:aload_2         
	//* 187  390:iconst_5        
	//* 188  391:invokevirtual   #400 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//* 189  394:ldc2w           #401 <Long -1L>
	//* 190  397:lcmp            
	//* 191  398:ifne            421
				((bt)this).r().u_().a("Failed to insert/update app (got -1). appId", com.google.android.gms.measurement.internal.s.a(er1.b()));
	//  192  401:aload_0         
	//  193  402:invokevirtual   #244 <Method s bt.r()>
	//  194  405:invokevirtual   #250 <Method u s.u_()>
	//  195  408:ldc2            #971 <String "Failed to insert/update app (got -1). appId">
	//  196  411:aload_1         
	//  197  412:invokevirtual   #896 <Method String er.b()>
	//  198  415:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  199  418:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			return;
	//  200  421:return          
		}
		catch(SQLiteException sqliteexception)
	//* 201  422:astore_2        
		{
			((bt)this).r().u_().a("Error storing app. appId", com.google.android.gms.measurement.internal.s.a(er1.b()), ((Object) (sqliteexception)));
	//  202  423:aload_0         
	//  203  424:invokevirtual   #244 <Method s bt.r()>
	//  204  427:invokevirtual   #250 <Method u s.u_()>
	//  205  430:ldc2            #973 <String "Error storing app. appId">
	//  206  433:aload_1         
	//  207  434:invokevirtual   #896 <Method String er.b()>
	//  208  437:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  209  440:aload_2         
	//  210  441:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		}
	//  211  444:return          
	}

	final void a(String s1, bc abc[])
	{
		SQLiteDatabase sqlitedatabase;
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method void ed.k()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #334 <Method void bt.d()>
		am.a(s1);
	//    4    8:aload_1         
	//    5    9:invokestatic    #305 <Method String am.a(String)>
	//    6   12:pop             
		am.a(((Object) (abc)));
	//    7   13:aload_2         
	//    8   14:invokestatic    #308 <Method Object am.a(Object)>
	//    9   17:pop             
		sqlitedatabase = y();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   12   22:astore          11
		sqlitedatabase.beginTransaction();
	//   13   24:aload           11
	//   14   26:invokevirtual   #977 <Method void SQLiteDatabase.beginTransaction()>
		Object obj;
		((ed)this).k();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #332 <Method void ed.k()>
		((bt)this).d();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #334 <Method void bt.d()>
		am.a(s1);
	//   19   37:aload_1         
	//   20   38:invokestatic    #305 <Method String am.a(String)>
	//   21   41:pop             
		obj = ((Object) (y()));
	//   22   42:aload_0         
	//   23   43:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   24   46:astore          12
		boolean flag = false;
	//   25   48:iconst_0        
	//   26   49:istore          7
		int j1;
		((SQLiteDatabase) (obj)).delete("property_filters", "app_id=?", new String[] {
			s1
		});
	//   27   51:aload           12
	//   28   53:ldc2            #419 <String "property_filters">
	//   29   56:ldc2            #713 <String "app_id=?">
	//   30   59:iconst_1        
	//   31   60:anewarray       String[]
	//   32   63:dup             
	//   33   64:iconst_0        
	//   34   65:aload_1         
	//   35   66:aastore         
	//   36   67:invokevirtual   #511 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   37   70:pop             
		((SQLiteDatabase) (obj)).delete("event_filters", "app_id=?", new String[] {
			s1
		});
	//   38   71:aload           12
	//   39   73:ldc2            #396 <String "event_filters">
	//   40   76:ldc2            #713 <String "app_id=?">
	//   41   79:iconst_1        
	//   42   80:anewarray       String[]
	//   43   83:dup             
	//   44   84:iconst_0        
	//   45   85:aload_1         
	//   46   86:aastore         
	//   47   87:invokevirtual   #511 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   48   90:pop             
		j1 = abc.length;
	//   49   91:aload_2         
	//   50   92:arraylength     
	//   51   93:istore          8
		int k = 0;
	//   52   95:iconst_0        
	//   53   96:istore          4
_L22:
		if(k >= j1) goto _L2; else goto _L1
	//   54   98:iload           4
	//   55  100:iload           8
	//   56  102:icmpge          471
_L1:
		obj = ((Object) (abc[k]));
	//   57  105:aload_2         
	//   58  106:iload           4
	//   59  108:aaload          
	//   60  109:astore          12
		((ed)this).k();
	//   61  111:aload_0         
	//   62  112:invokevirtual   #332 <Method void ed.k()>
		((bt)this).d();
	//   63  115:aload_0         
	//   64  116:invokevirtual   #334 <Method void bt.d()>
		am.a(s1);
	//   65  119:aload_1         
	//   66  120:invokestatic    #305 <Method String am.a(String)>
	//   67  123:pop             
		am.a(obj);
	//   68  124:aload           12
	//   69  126:invokestatic    #308 <Method Object am.a(Object)>
	//   70  129:pop             
		am.a(((Object) (((bc) (obj)).c)));
	//   71  130:aload           12
	//   72  132:getfield        #982 <Field bd[] bc.c>
	//   73  135:invokestatic    #308 <Method Object am.a(Object)>
	//   74  138:pop             
		am.a(((Object) (((bc) (obj)).b)));
	//   75  139:aload           12
	//   76  141:getfield        #985 <Field bg[] bc.b>
	//   77  144:invokestatic    #308 <Method Object am.a(Object)>
	//   78  147:pop             
		if(((bc) (obj)).a == null)
	//*  79  148:aload           12
	//*  80  150:getfield        #986 <Field Integer bc.a>
	//*  81  153:ifnonnull       176
		{
			((bt)this).r().i().a("Audience with no ID. appId", com.google.android.gms.measurement.internal.s.a(s1));
	//   82  156:aload_0         
	//   83  157:invokevirtual   #244 <Method s bt.r()>
	//   84  160:invokevirtual   #347 <Method u s.i()>
	//   85  163:ldc2            #988 <String "Audience with no ID. appId">
	//   86  166:aload_1         
	//   87  167:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   88  170:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			break MISSING_BLOCK_LABEL_576;
	//   89  173:goto            576
		}
		int l;
		int k1;
		Object aobj[];
		k1 = ((bc) (obj)).a.intValue();
	//   90  176:aload           12
	//   91  178:getfield        #986 <Field Integer bc.a>
	//   92  181:invokevirtual   #469 <Method int Integer.intValue()>
	//   93  184:istore          9
		aobj = ((Object []) (((bc) (obj)).c));
	//   94  186:aload           12
	//   95  188:getfield        #982 <Field bd[] bc.c>
	//   96  191:astore          13
		l = aobj.length;
	//   97  193:aload           13
	//   98  195:arraylength     
	//   99  196:istore          5
		int j = 0;
	//  100  198:iconst_0        
	//  101  199:istore_3        
_L16:
		if(j >= l) goto _L4; else goto _L3
	//  102  200:iload_3         
	//  103  201:iload           5
	//  104  203:icmpge          241
	//* 105  206:aload           13
	//* 106  208:iload_3         
	//* 107  209:aaload          
	//* 108  210:getfield        #355 <Field Integer bd.a>
	//* 109  213:ifnonnull       541
	//* 110  216:aload_0         
	//* 111  217:invokevirtual   #244 <Method s bt.r()>
	//* 112  220:invokevirtual   #347 <Method u s.i()>
	//* 113  223:ldc2            #990 <String "Event filter with no ID. Audience definition ignored. appId, audienceId">
	//* 114  226:aload_1         
	//* 115  227:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//* 116  230:aload           12
	//* 117  232:getfield        #986 <Field Integer bc.a>
	//* 118  235:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//* 119  238:goto            576
_L4:
		aobj = ((Object []) (((bc) (obj)).b));
	//  120  241:aload           12
	//  121  243:getfield        #985 <Field bg[] bc.b>
	//  122  246:astore          13
		l = aobj.length;
	//  123  248:aload           13
	//  124  250:arraylength     
	//  125  251:istore          5
		j = 0;
	//  126  253:iconst_0        
	//  127  254:istore_3        
_L17:
		if(j >= l) goto _L6; else goto _L5
	//  128  255:iload_3         
	//  129  256:iload           5
	//  130  258:icmpge          296
	//* 131  261:aload           13
	//* 132  263:iload_3         
	//* 133  264:aaload          
	//* 134  265:getfield        #415 <Field Integer bg.a>
	//* 135  268:ifnonnull       548
	//* 136  271:aload_0         
	//* 137  272:invokevirtual   #244 <Method s bt.r()>
	//* 138  275:invokevirtual   #347 <Method u s.i()>
	//* 139  278:ldc2            #992 <String "Property filter with no ID. Audience definition ignored. appId, audienceId">
	//* 140  281:aload_1         
	//* 141  282:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//* 142  285:aload           12
	//* 143  287:getfield        #986 <Field Integer bc.a>
	//* 144  290:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//* 145  293:goto            576
_L6:
		aobj = ((Object []) (((bc) (obj)).c));
	//  146  296:aload           12
	//  147  298:getfield        #982 <Field bd[] bc.c>
	//  148  301:astore          13
		l = aobj.length;
	//  149  303:aload           13
	//  150  305:arraylength     
	//  151  306:istore          5
		j = 0;
	//  152  308:iconst_0        
	//  153  309:istore_3        
_L18:
		if(j >= l) goto _L8; else goto _L7
	//  154  310:iload_3         
	//  155  311:iload           5
	//  156  313:icmpge          562
_L7:
		if(a(s1, k1, aobj[j])) goto _L10; else goto _L9
	//  157  316:aload_0         
	//  158  317:aload_1         
	//  159  318:iload           9
	//  160  320:aload           13
	//  161  322:iload_3         
	//  162  323:aaload          
	//  163  324:invokespecial   #994 <Method boolean a(String, int, bd)>
	//  164  327:ifne            555
_L9:
		j = 0;
	//  165  330:iconst_0        
	//  166  331:istore_3        
	//* 167  332:goto            335
_L19:
		i1 = j;
	//  168  335:iload_3         
	//  169  336:istore          6
		if(j == 0) goto _L12; else goto _L11
	//  170  338:iload_3         
	//  171  339:ifeq            388
_L11:
		abg = ((bc) (obj)).b;
	//  172  342:aload           12
	//  173  344:getfield        #985 <Field bg[] bc.b>
	//  174  347:astore          12
		l1 = abg.length;
	//  175  349:aload           12
	//  176  351:arraylength     
	//  177  352:istore          10
		l = 0;
	//  178  354:iconst_0        
	//  179  355:istore          5
_L20:
		i1 = j;
	//  180  357:iload_3         
	//  181  358:istore          6
		if(l >= l1) goto _L12; else goto _L13
	//  182  360:iload           5
	//  183  362:iload           10
	//  184  364:icmpge          388
_L13:
		if(a(s1, k1, abg[l]))
			break MISSING_BLOCK_LABEL_567;
	//  185  367:aload_0         
	//  186  368:aload_1         
	//  187  369:iload           9
	//  188  371:aload           12
	//  189  373:iload           5
	//  190  375:aaload          
	//  191  376:invokespecial   #996 <Method boolean a(String, int, bg)>
	//  192  379:ifne            567
		i1 = 0;
	//  193  382:iconst_0        
	//  194  383:istore          6
	//* 195  385:goto            388
_L12:
		if(i1 != 0)
			break MISSING_BLOCK_LABEL_576;
	//  196  388:iload           6
	//  197  390:ifne            576
		((ed)this).k();
	//  198  393:aload_0         
	//  199  394:invokevirtual   #332 <Method void ed.k()>
		((bt)this).d();
	//  200  397:aload_0         
	//  201  398:invokevirtual   #334 <Method void bt.d()>
		am.a(s1);
	//  202  401:aload_1         
	//  203  402:invokestatic    #305 <Method String am.a(String)>
	//  204  405:pop             
		abg = ((bg []) (y()));
	//  205  406:aload_0         
	//  206  407:invokevirtual   #222 <Method SQLiteDatabase y()>
	//  207  410:astore          12
		((SQLiteDatabase) (abg)).delete("property_filters", "app_id=? and audience_id=?", new String[] {
			s1, String.valueOf(k1)
		});
	//  208  412:aload           12
	//  209  414:ldc2            #419 <String "property_filters">
	//  210  417:ldc2            #998 <String "app_id=? and audience_id=?">
	//  211  420:iconst_2        
	//  212  421:anewarray       String[]
	//  213  424:dup             
	//  214  425:iconst_0        
	//  215  426:aload_1         
	//  216  427:aastore         
	//  217  428:dup             
	//  218  429:iconst_1        
	//  219  430:iload           9
	//  220  432:invokestatic    #772 <Method String String.valueOf(int)>
	//  221  435:aastore         
	//  222  436:invokevirtual   #511 <Method int SQLiteDatabase.delete(String, String, String[])>
	//  223  439:pop             
		((SQLiteDatabase) (abg)).delete("event_filters", "app_id=? and audience_id=?", new String[] {
			s1, String.valueOf(k1)
		});
	//  224  440:aload           12
	//  225  442:ldc2            #396 <String "event_filters">
	//  226  445:ldc2            #998 <String "app_id=? and audience_id=?">
	//  227  448:iconst_2        
	//  228  449:anewarray       String[]
	//  229  452:dup             
	//  230  453:iconst_0        
	//  231  454:aload_1         
	//  232  455:aastore         
	//  233  456:dup             
	//  234  457:iconst_1        
	//  235  458:iload           9
	//  236  460:invokestatic    #772 <Method String String.valueOf(int)>
	//  237  463:aastore         
	//  238  464:invokevirtual   #511 <Method int SQLiteDatabase.delete(String, String, String[])>
	//  239  467:pop             
		break MISSING_BLOCK_LABEL_576;
	//  240  468:goto            576
_L2:
		abg = ((bg []) (new ArrayList()));
	//  241  471:new             #456 <Class ArrayList>
	//  242  474:dup             
	//  243  475:invokespecial   #457 <Method void ArrayList()>
	//  244  478:astore          12
		k = abc.length;
	//  245  480:aload_2         
	//  246  481:arraylength     
	//  247  482:istore          4
		j = ((int) (flag));
	//  248  484:iload           7
	//  249  486:istore_3        
_L15:
		if(j >= k)
			break; /* Loop/switch isn't completed */
	//  250  487:iload_3         
	//  251  488:iload           4
	//  252  490:icmpge          514
		((List) (abg)).add(((Object) (abc[j].a)));
	//  253  493:aload           12
	//  254  495:aload_2         
	//  255  496:iload_3         
	//  256  497:aaload          
	//  257  498:getfield        #986 <Field Integer bc.a>
	//  258  501:invokeinterface #476 <Method boolean List.add(Object)>
	//  259  506:pop             
		j++;
	//  260  507:iload_3         
	//  261  508:iconst_1        
	//  262  509:iadd            
	//  263  510:istore_3        
		if(true) goto _L15; else goto _L14
	//  264  511:goto            487
_L14:
		a(s1, ((List) (abg)));
	//  265  514:aload_0         
	//  266  515:aload_1         
	//  267  516:aload           12
	//  268  518:invokespecial   #1000 <Method boolean a(String, List)>
	//  269  521:pop             
		sqlitedatabase.setTransactionSuccessful();
	//  270  522:aload           11
	//  271  524:invokevirtual   #1003 <Method void SQLiteDatabase.setTransactionSuccessful()>
		sqlitedatabase.endTransaction();
	//  272  527:aload           11
	//  273  529:invokevirtual   #1006 <Method void SQLiteDatabase.endTransaction()>
		return;
	//  274  532:return          
		s1;
	//  275  533:astore_1        
		sqlitedatabase.endTransaction();
	//  276  534:aload           11
	//  277  536:invokevirtual   #1006 <Method void SQLiteDatabase.endTransaction()>
		throw s1;
	//  278  539:aload_1         
	//  279  540:athrow          
_L3:
		int i1;
		int l1;
		bg abg[];
		if(aobj[j].a == null)
		{
			((bt)this).r().i().a("Event filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (((bc) (obj)).a)));
			break MISSING_BLOCK_LABEL_576;
		}
		j++;
	//  280  541:iload_3         
	//  281  542:iconst_1        
	//  282  543:iadd            
	//  283  544:istore_3        
		  goto _L16
_L5:
		if(aobj[j].a == null)
		{
			((bt)this).r().i().a("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (((bc) (obj)).a)));
			break MISSING_BLOCK_LABEL_576;
		}
	//* 284  545:goto            200
		j++;
	//  285  548:iload_3         
	//  286  549:iconst_1        
	//  287  550:iadd            
	//  288  551:istore_3        
		  goto _L17
	//* 289  552:goto            255
_L10:
		j++;
	//  290  555:iload_3         
	//  291  556:iconst_1        
	//  292  557:iadd            
	//  293  558:istore_3        
		  goto _L18
	//* 294  559:goto            310
_L8:
		j = 1;
	//  295  562:iconst_1        
	//  296  563:istore_3        
		  goto _L19
	//* 297  564:goto            335
		l++;
	//  298  567:iload           5
	//  299  569:iconst_1        
	//  300  570:iadd            
	//  301  571:istore          5
		  goto _L20
	//* 302  573:goto            357
		k++;
	//  303  576:iload           4
	//  304  578:iconst_1        
	//  305  579:iadd            
	//  306  580:istore          4
		if(true) goto _L22; else goto _L21
	//  307  582:goto            98
_L21:
	}

	final void a(List list)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #332 <Method void ed.k()>
		am.a(((Object) (list)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #308 <Method Object am.a(Object)>
	//    6   12:pop             
		am.a(list.size());
	//    7   13:aload_1         
	//    8   14:invokeinterface #462 <Method int List.size()>
	//    9   19:invokestatic    #1009 <Method int am.a(int)>
	//   10   22:pop             
		if(!N())
	//*  11   23:aload_0         
	//*  12   24:invokespecial   #522 <Method boolean N()>
	//*  13   27:ifne            31
			return;
	//   14   30:return          
		list = ((List) (TextUtils.join(",", ((Iterable) (list)))));
	//   15   31:ldc2            #478 <String ",">
	//   16   34:aload_1         
	//   17   35:invokestatic    #482 <Method String TextUtils.join(CharSequence, Iterable)>
	//   18   38:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (list))).length() + 2);
	//   19   39:new             #484 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:aload_1         
	//   22   44:invokestatic    #358 <Method String String.valueOf(Object)>
	//   23   47:invokevirtual   #487 <Method int String.length()>
	//   24   50:iconst_2        
	//   25   51:iadd            
	//   26   52:invokespecial   #490 <Method void StringBuilder(int)>
	//   27   55:astore_2        
		stringbuilder.append("(");
	//   28   56:aload_2         
	//   29   57:ldc2            #492 <String "(">
	//   30   60:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
		stringbuilder.append(((String) (list)));
	//   32   64:aload_2         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		stringbuilder.append(")");
	//   36   70:aload_2         
	//   37   71:ldc2            #498 <String ")">
	//   38   74:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
		list = ((List) (stringbuilder.toString()));
	//   40   78:aload_2         
	//   41   79:invokevirtual   #501 <Method String StringBuilder.toString()>
	//   42   82:astore_1        
		stringbuilder = new StringBuilder(String.valueOf(((Object) (list))).length() + 80);
	//   43   83:new             #484 <Class StringBuilder>
	//   44   86:dup             
	//   45   87:aload_1         
	//   46   88:invokestatic    #358 <Method String String.valueOf(Object)>
	//   47   91:invokevirtual   #487 <Method int String.length()>
	//   48   94:bipush          80
	//   49   96:iadd            
	//   50   97:invokespecial   #490 <Method void StringBuilder(int)>
	//   51  100:astore_2        
		stringbuilder.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
	//   52  101:aload_2         
	//   53  102:ldc2            #1011 <String "SELECT COUNT(1) FROM queue WHERE rowid IN ">
	//   54  105:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   55  108:pop             
		stringbuilder.append(((String) (list)));
	//   56  109:aload_2         
	//   57  110:aload_1         
	//   58  111:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   59  114:pop             
		stringbuilder.append(" AND retry_count =  2147483647 LIMIT 1");
	//   60  115:aload_2         
	//   61  116:ldc2            #1013 <String " AND retry_count =  2147483647 LIMIT 1">
	//   62  119:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   63  122:pop             
		if(b(stringbuilder.toString(), ((String []) (null))) > 0L)
	//*  64  123:aload_0         
	//*  65  124:aload_2         
	//*  66  125:invokevirtual   #501 <Method String StringBuilder.toString()>
	//*  67  128:aconst_null     
	//*  68  129:invokespecial   #431 <Method long b(String, String[])>
	//*  69  132:lconst_0        
	//*  70  133:lcmp            
	//*  71  134:ifle            150
			((bt)this).r().i().a("The number of upload retries exceeds the limit. Will remain unchanged.");
	//   72  137:aload_0         
	//   73  138:invokevirtual   #244 <Method s bt.r()>
	//   74  141:invokevirtual   #347 <Method u s.i()>
	//   75  144:ldc2            #1015 <String "The number of upload retries exceeds the limit. Will remain unchanged.">
	//   76  147:invokevirtual   #279 <Method void com.google.android.gms.measurement.internal.u.a(String)>
		try
		{
			SQLiteDatabase sqlitedatabase = y();
	//   77  150:aload_0         
	//   78  151:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   79  154:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (list))).length() + 127);
	//   80  155:new             #484 <Class StringBuilder>
	//   81  158:dup             
	//   82  159:aload_1         
	//   83  160:invokestatic    #358 <Method String String.valueOf(Object)>
	//   84  163:invokevirtual   #487 <Method int String.length()>
	//   85  166:bipush          127
	//   86  168:iadd            
	//   87  169:invokespecial   #490 <Method void StringBuilder(int)>
	//   88  172:astore_3        
			stringbuilder1.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
	//   89  173:aload_3         
	//   90  174:ldc2            #1017 <String "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ">
	//   91  177:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   92  180:pop             
			stringbuilder1.append(((String) (list)));
	//   93  181:aload_3         
	//   94  182:aload_1         
	//   95  183:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   96  186:pop             
			stringbuilder1.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
	//   97  187:aload_3         
	//   98  188:ldc2            #1019 <String " AND (retry_count IS NULL OR retry_count < 2147483647)">
	//   99  191:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  100  194:pop             
			sqlitedatabase.execSQL(stringbuilder1.toString());
	//  101  195:aload_2         
	//  102  196:aload_3         
	//  103  197:invokevirtual   #501 <Method String StringBuilder.toString()>
	//  104  200:invokevirtual   #1022 <Method void SQLiteDatabase.execSQL(String)>
			return;
	//  105  203:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//* 106  204:astore_1        
		{
			((bt)this).r().u_().a("Error incrementing retry count. error", ((Object) (list)));
	//  107  205:aload_0         
	//  108  206:invokevirtual   #244 <Method s bt.r()>
	//  109  209:invokevirtual   #250 <Method u s.u_()>
	//  110  212:ldc2            #1024 <String "Error incrementing retry count. error">
	//  111  215:aload_1         
	//  112  216:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		}
	//  113  219:return          
	}

	public final boolean a(bq bq1, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #1027 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1029 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1032 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public final boolean a(c c1, long l, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #1027 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1029 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1032 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public final boolean a(en en1)
	{
		ContentValues contentvalues;
		am.a(((Object) (en1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #308 <Method Object am.a(Object)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		if(c(en1.a, en1.c) == null)
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:getfield        #1035 <Field String com.google.android.gms.measurement.internal.en.a>
	//*  10   18:aload_1         
	//*  11   19:getfield        #1037 <Field String en.c>
	//*  12   22:invokevirtual   #1040 <Method en c(String, String)>
	//*  13   25:ifnonnull       99
			if(com.google.android.gms.measurement.internal.eo.a(en1.c))
	//*  14   28:aload_1         
	//*  15   29:getfield        #1037 <Field String en.c>
	//*  16   32:invokestatic    #1043 <Method boolean com.google.android.gms.measurement.internal.eo.a(String)>
	//*  17   35:ifeq            65
			{
				if(b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] {
	en1.a
}) >= 25L)
	//*  18   38:aload_0         
	//*  19   39:ldc2            #1045 <String "select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'">
	//*  20   42:iconst_1        
	//*  21   43:anewarray       String[]
	//*  22   46:dup             
	//*  23   47:iconst_0        
	//*  24   48:aload_1         
	//*  25   49:getfield        #1035 <Field String com.google.android.gms.measurement.internal.en.a>
	//*  26   52:aastore         
	//*  27   53:invokespecial   #431 <Method long b(String, String[])>
	//*  28   56:ldc2w           #1046 <Long 25L>
	//*  29   59:lcmp            
	//*  30   60:iflt            99
					return false;
	//   31   63:iconst_0        
	//   32   64:ireturn         
			} else
			if(b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] {
	en1.a, en1.b
}) >= 25L)
	//*  33   65:aload_0         
	//*  34   66:ldc2            #1049 <String "select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'">
	//*  35   69:iconst_2        
	//*  36   70:anewarray       String[]
	//*  37   73:dup             
	//*  38   74:iconst_0        
	//*  39   75:aload_1         
	//*  40   76:getfield        #1035 <Field String com.google.android.gms.measurement.internal.en.a>
	//*  41   79:aastore         
	//*  42   80:dup             
	//*  43   81:iconst_1        
	//*  44   82:aload_1         
	//*  45   83:getfield        #1050 <Field String en.b>
	//*  46   86:aastore         
	//*  47   87:invokespecial   #431 <Method long b(String, String[])>
	//*  48   90:ldc2w           #1046 <Long 25L>
	//*  49   93:lcmp            
	//*  50   94:iflt            99
				return false;
	//   51   97:iconst_0        
	//   52   98:ireturn         
		contentvalues = new ContentValues();
	//   53   99:new             #310 <Class ContentValues>
	//   54  102:dup             
	//   55  103:invokespecial   #378 <Method void ContentValues()>
	//   56  106:astore_2        
		contentvalues.put("app_id", en1.a);
	//   57  107:aload_2         
	//   58  108:ldc2            #380 <String "app_id">
	//   59  111:aload_1         
	//   60  112:getfield        #1035 <Field String com.google.android.gms.measurement.internal.en.a>
	//   61  115:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("origin", en1.b);
	//   62  118:aload_2         
	//   63  119:ldc1            #43  <String "origin">
	//   64  121:aload_1         
	//   65  122:getfield        #1050 <Field String en.b>
	//   66  125:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("name", en1.c);
	//   67  128:aload_2         
	//   68  129:ldc2            #742 <String "name">
	//   69  132:aload_1         
	//   70  133:getfield        #1037 <Field String en.c>
	//   71  136:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("set_timestamp", Long.valueOf(en1.d));
	//   72  139:aload_2         
	//   73  140:ldc2            #744 <String "set_timestamp">
	//   74  143:aload_1         
	//   75  144:getfield        #1051 <Field long en.d>
	//   76  147:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   77  150:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		a(contentvalues, "value", en1.e);
	//   78  153:aload_2         
	//   79  154:ldc2            #746 <String "value">
	//   80  157:aload_1         
	//   81  158:getfield        #1054 <Field Object com.google.android.gms.measurement.internal.en.e>
	//   82  161:invokestatic    #1056 <Method void a(ContentValues, String, Object)>
		if(y().insertWithOnConflict("user_attributes", ((String) (null)), contentvalues, 5) != -1L)
			break MISSING_BLOCK_LABEL_228;
	//   83  164:aload_0         
	//   84  165:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   85  168:ldc2            #740 <String "user_attributes">
	//   86  171:aconst_null     
	//   87  172:aload_2         
	//   88  173:iconst_5        
	//   89  174:invokevirtual   #400 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//   90  177:ldc2w           #401 <Long -1L>
	//   91  180:lcmp            
	//   92  181:ifne            228
		((bt)this).r().u_().a("Failed to insert/update user property (got -1). appId", com.google.android.gms.measurement.internal.s.a(en1.a));
	//   93  184:aload_0         
	//   94  185:invokevirtual   #244 <Method s bt.r()>
	//   95  188:invokevirtual   #250 <Method u s.u_()>
	//   96  191:ldc2            #1058 <String "Failed to insert/update user property (got -1). appId">
	//   97  194:aload_1         
	//   98  195:getfield        #1035 <Field String com.google.android.gms.measurement.internal.en.a>
	//   99  198:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  100  201:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		return true;
	//  101  204:iconst_1        
	//  102  205:ireturn         
		SQLiteException sqliteexception;
		sqliteexception;
	//  103  206:astore_2        
		((bt)this).r().u_().a("Error storing user property. appId", com.google.android.gms.measurement.internal.s.a(en1.a), ((Object) (sqliteexception)));
	//  104  207:aload_0         
	//  105  208:invokevirtual   #244 <Method s bt.r()>
	//  106  211:invokevirtual   #250 <Method u s.u_()>
	//  107  214:ldc2            #1060 <String "Error storing user property. appId">
	//  108  217:aload_1         
	//  109  218:getfield        #1035 <Field String com.google.android.gms.measurement.internal.en.a>
	//  110  221:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  111  224:aload_2         
	//  112  225:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		return true;
	//  113  228:iconst_1        
	//  114  229:ireturn         
	}

	public final boolean a(zzo zzo1)
	{
		ContentValues contentvalues;
		am.a(((Object) (zzo1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #308 <Method Object am.a(Object)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		if(c(zzo1.a, zzo1.c.a) == null && b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] {
	zzo1.a
}) >= 1000L)
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:getfield        #1062 <Field String com.google.android.gms.measurement.internal.zzo.a>
	//*  10   18:aload_1         
	//*  11   19:getfield        #1065 <Field zzfu zzo.c>
	//*  12   22:getfield        #1066 <Field String com.google.android.gms.measurement.internal.zzfu.a>
	//*  13   25:invokevirtual   #1040 <Method en c(String, String)>
	//*  14   28:ifnonnull       58
	//*  15   31:aload_0         
	//*  16   32:ldc2            #1068 <String "SELECT COUNT(1) FROM conditional_properties WHERE app_id=?">
	//*  17   35:iconst_1        
	//*  18   36:anewarray       String[]
	//*  19   39:dup             
	//*  20   40:iconst_0        
	//*  21   41:aload_1         
	//*  22   42:getfield        #1062 <Field String com.google.android.gms.measurement.internal.zzo.a>
	//*  23   45:aastore         
	//*  24   46:invokespecial   #431 <Method long b(String, String[])>
	//*  25   49:ldc2w           #1069 <Long 1000L>
	//*  26   52:lcmp            
	//*  27   53:iflt            58
			return false;
	//   28   56:iconst_0        
	//   29   57:ireturn         
		contentvalues = new ContentValues();
	//   30   58:new             #310 <Class ContentValues>
	//   31   61:dup             
	//   32   62:invokespecial   #378 <Method void ContentValues()>
	//   33   65:astore_2        
		contentvalues.put("app_id", zzo1.a);
	//   34   66:aload_2         
	//   35   67:ldc2            #380 <String "app_id">
	//   36   70:aload_1         
	//   37   71:getfield        #1062 <Field String com.google.android.gms.measurement.internal.zzo.a>
	//   38   74:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("origin", zzo1.b);
	//   39   77:aload_2         
	//   40   78:ldc1            #43  <String "origin">
	//   41   80:aload_1         
	//   42   81:getfield        #1071 <Field String zzo.b>
	//   43   84:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("name", zzo1.c.a);
	//   44   87:aload_2         
	//   45   88:ldc2            #742 <String "name">
	//   46   91:aload_1         
	//   47   92:getfield        #1065 <Field zzfu zzo.c>
	//   48   95:getfield        #1066 <Field String com.google.android.gms.measurement.internal.zzfu.a>
	//   49   98:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		a(contentvalues, "value", zzo1.c.a());
	//   50  101:aload_2         
	//   51  102:ldc2            #746 <String "value">
	//   52  105:aload_1         
	//   53  106:getfield        #1065 <Field zzfu zzo.c>
	//   54  109:invokevirtual   #1073 <Method Object com.google.android.gms.measurement.internal.zzfu.a()>
	//   55  112:invokestatic    #1056 <Method void a(ContentValues, String, Object)>
		contentvalues.put("active", Boolean.valueOf(zzo1.e));
	//   56  115:aload_2         
	//   57  116:ldc2            #826 <String "active">
	//   58  119:aload_1         
	//   59  120:getfield        #1076 <Field boolean com.google.android.gms.measurement.internal.zzo.e>
	//   60  123:invokestatic    #687 <Method Boolean Boolean.valueOf(boolean)>
	//   61  126:invokevirtual   #932 <Method void ContentValues.put(String, Boolean)>
		contentvalues.put("trigger_event_name", zzo1.f);
	//   62  129:aload_2         
	//   63  130:ldc2            #828 <String "trigger_event_name">
	//   64  133:aload_1         
	//   65  134:getfield        #1078 <Field String zzo.f>
	//   66  137:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("trigger_timeout", Long.valueOf(zzo1.h));
	//   67  140:aload_2         
	//   68  141:ldc2            #830 <String "trigger_timeout">
	//   69  144:aload_1         
	//   70  145:getfield        #1080 <Field long zzo.h>
	//   71  148:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   72  151:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		((bt)this).p();
	//   73  154:aload_0         
	//   74  155:invokevirtual   #607 <Method eo bt.p()>
	//   75  158:pop             
		contentvalues.put("timed_out_event", com.google.android.gms.measurement.internal.eo.a(((android.os.Parcelable) (zzo1.g))));
	//   76  159:aload_2         
	//   77  160:ldc2            #832 <String "timed_out_event">
	//   78  163:aload_1         
	//   79  164:getfield        #1083 <Field zzag zzo.g>
	//   80  167:invokestatic    #1086 <Method byte[] com.google.android.gms.measurement.internal.eo.a(android.os.Parcelable)>
	//   81  170:invokevirtual   #394 <Method void ContentValues.put(String, byte[])>
		contentvalues.put("creation_timestamp", Long.valueOf(zzo1.d));
	//   82  173:aload_2         
	//   83  174:ldc2            #834 <String "creation_timestamp">
	//   84  177:aload_1         
	//   85  178:getfield        #1087 <Field long zzo.d>
	//   86  181:invokestatic    #297 <Method Long Long.valueOf(long)>
	//   87  184:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		((bt)this).p();
	//   88  187:aload_0         
	//   89  188:invokevirtual   #607 <Method eo bt.p()>
	//   90  191:pop             
		contentvalues.put("triggered_event", com.google.android.gms.measurement.internal.eo.a(((android.os.Parcelable) (zzo1.i))));
	//   91  192:aload_2         
	//   92  193:ldc2            #836 <String "triggered_event">
	//   93  196:aload_1         
	//   94  197:getfield        #1089 <Field zzag zzo.i>
	//   95  200:invokestatic    #1086 <Method byte[] com.google.android.gms.measurement.internal.eo.a(android.os.Parcelable)>
	//   96  203:invokevirtual   #394 <Method void ContentValues.put(String, byte[])>
		contentvalues.put("triggered_timestamp", Long.valueOf(zzo1.c.b));
	//   97  206:aload_2         
	//   98  207:ldc2            #838 <String "triggered_timestamp">
	//   99  210:aload_1         
	//  100  211:getfield        #1065 <Field zzfu zzo.c>
	//  101  214:getfield        #1090 <Field long zzfu.b>
	//  102  217:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  103  220:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		contentvalues.put("time_to_live", Long.valueOf(zzo1.j));
	//  104  223:aload_2         
	//  105  224:ldc2            #840 <String "time_to_live">
	//  106  227:aload_1         
	//  107  228:getfield        #1092 <Field long zzo.j>
	//  108  231:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  109  234:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		((bt)this).p();
	//  110  237:aload_0         
	//  111  238:invokevirtual   #607 <Method eo bt.p()>
	//  112  241:pop             
		contentvalues.put("expired_event", com.google.android.gms.measurement.internal.eo.a(((android.os.Parcelable) (zzo1.k))));
	//  113  242:aload_2         
	//  114  243:ldc2            #842 <String "expired_event">
	//  115  246:aload_1         
	//  116  247:getfield        #1094 <Field zzag zzo.k>
	//  117  250:invokestatic    #1086 <Method byte[] com.google.android.gms.measurement.internal.eo.a(android.os.Parcelable)>
	//  118  253:invokevirtual   #394 <Method void ContentValues.put(String, byte[])>
		if(y().insertWithOnConflict("conditional_properties", ((String) (null)), contentvalues, 5) != -1L)
			break MISSING_BLOCK_LABEL_320;
	//  119  256:aload_0         
	//  120  257:invokevirtual   #222 <Method SQLiteDatabase y()>
	//  121  260:ldc2            #824 <String "conditional_properties">
	//  122  263:aconst_null     
	//  123  264:aload_2         
	//  124  265:iconst_5        
	//  125  266:invokevirtual   #400 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//  126  269:ldc2w           #401 <Long -1L>
	//  127  272:lcmp            
	//  128  273:ifne            320
		((bt)this).r().u_().a("Failed to insert/update conditional user property (got -1)", com.google.android.gms.measurement.internal.s.a(zzo1.a));
	//  129  276:aload_0         
	//  130  277:invokevirtual   #244 <Method s bt.r()>
	//  131  280:invokevirtual   #250 <Method u s.u_()>
	//  132  283:ldc2            #1096 <String "Failed to insert/update conditional user property (got -1)">
	//  133  286:aload_1         
	//  134  287:getfield        #1062 <Field String com.google.android.gms.measurement.internal.zzo.a>
	//  135  290:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  136  293:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		return true;
	//  137  296:iconst_1        
	//  138  297:ireturn         
		SQLiteException sqliteexception;
		sqliteexception;
	//  139  298:astore_2        
		((bt)this).r().u_().a("Error storing conditional user property", com.google.android.gms.measurement.internal.s.a(zzo1.a), ((Object) (sqliteexception)));
	//  140  299:aload_0         
	//  141  300:invokevirtual   #244 <Method s bt.r()>
	//  142  303:invokevirtual   #250 <Method u s.u_()>
	//  143  306:ldc2            #1098 <String "Error storing conditional user property">
	//  144  309:aload_1         
	//  145  310:getfield        #1062 <Field String com.google.android.gms.measurement.internal.zzo.a>
	//  146  313:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  147  316:aload_2         
	//  148  317:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		return true;
	//  149  320:iconst_1        
	//  150  321:ireturn         
	}

	public final boolean a(String s1, Long long1, long l, bn bn1)
	{
label0:
		{
			((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method void bt.d()>
			((ed)this).k();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #332 <Method void ed.k()>
			am.a(((Object) (bn1)));
	//    4    8:aload           5
	//    5   10:invokestatic    #308 <Method Object am.a(Object)>
	//    6   13:pop             
			am.a(s1);
	//    7   14:aload_1         
	//    8   15:invokestatic    #305 <Method String am.a(String)>
	//    9   18:pop             
			am.a(((Object) (long1)));
	//   10   19:aload_2         
	//   11   20:invokestatic    #308 <Method Object am.a(Object)>
	//   12   23:pop             
			byte abyte0[];
			try
			{
				abyte0 = new byte[((iy) (bn1)).e()];
	//   13   24:aload           5
	//   14   26:invokevirtual   #366 <Method int iy.e()>
	//   15   29:newarray        byte[]
	//   16   31:astore          6
				iq iq1 = iq.a(abyte0, 0, abyte0.length);
	//   17   33:aload           6
	//   18   35:iconst_0        
	//   19   36:aload           6
	//   20   38:arraylength     
	//   21   39:invokestatic    #371 <Method iq iq.a(byte[], int, int)>
	//   22   42:astore          7
				((iy) (bn1)).a(iq1);
	//   23   44:aload           5
	//   24   46:aload           7
	//   25   48:invokevirtual   #374 <Method void iy.a(iq)>
				iq1.a();
	//   26   51:aload           7
	//   27   53:invokevirtual   #376 <Method void iq.a()>
			}
	//*  28   56:aload_0         
	//*  29   57:invokevirtual   #244 <Method s bt.r()>
	//*  30   60:invokevirtual   #572 <Method u s.x()>
	//*  31   63:ldc2            #1101 <String "Saving complex main event, appId, data size">
	//*  32   66:aload_0         
	//*  33   67:invokevirtual   #702 <Method q bt.o()>
	//*  34   70:aload_1         
	//*  35   71:invokevirtual   #705 <Method String com.google.android.gms.measurement.internal.q.a(String)>
	//*  36   74:aload           6
	//*  37   76:arraylength     
	//*  38   77:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//*  39   80:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//*  40   83:new             #310 <Class ContentValues>
	//*  41   86:dup             
	//*  42   87:invokespecial   #378 <Method void ContentValues()>
	//*  43   90:astore          5
	//*  44   92:aload           5
	//*  45   94:ldc2            #380 <String "app_id">
	//*  46   97:aload_1         
	//*  47   98:invokevirtual   #314 <Method void ContentValues.put(String, String)>
	//*  48  101:aload           5
	//*  49  103:ldc2            #1103 <String "event_id">
	//*  50  106:aload_2         
	//*  51  107:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
	//*  52  110:aload           5
	//*  53  112:ldc2            #1105 <String "children_to_process">
	//*  54  115:lload_3         
	//*  55  116:invokestatic    #297 <Method Long Long.valueOf(long)>
	//*  56  119:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
	//*  57  122:aload           5
	//*  58  124:ldc2            #1107 <String "main_event">
	//*  59  127:aload           6
	//*  60  129:invokevirtual   #394 <Method void ContentValues.put(String, byte[])>
	//*  61  132:aload_0         
	//*  62  133:invokevirtual   #222 <Method SQLiteDatabase y()>
	//*  63  136:ldc2            #1109 <String "main_event_params">
	//*  64  139:aconst_null     
	//*  65  140:aload           5
	//*  66  142:iconst_5        
	//*  67  143:invokevirtual   #400 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//*  68  146:ldc2w           #401 <Long -1L>
	//*  69  149:lcmp            
	//*  70  150:ifne            172
	//*  71  153:aload_0         
	//*  72  154:invokevirtual   #244 <Method s bt.r()>
	//*  73  157:invokevirtual   #250 <Method u s.u_()>
	//*  74  160:ldc2            #1111 <String "Failed to insert complex main event (got -1). appId">
	//*  75  163:aload_1         
	//*  76  164:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  77  167:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//*  78  170:iconst_0        
	//*  79  171:ireturn         
	//*  80  172:iconst_1        
	//*  81  173:ireturn         
	//*  82  174:astore_2        
	//*  83  175:aload_0         
	//*  84  176:invokevirtual   #244 <Method s bt.r()>
	//*  85  179:invokevirtual   #250 <Method u s.u_()>
	//*  86  182:ldc2            #1113 <String "Error storing complex main event. appId">
	//*  87  185:aload_1         
	//*  88  186:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  89  189:aload_2         
	//*  90  190:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//*  91  193:iconst_0        
	//*  92  194:ireturn         
			// Misplaced declaration of an exception variable
			catch(bn bn1)
	//*  93  195:astore          5
			{
				((bt)this).r().u_().a("Data loss. Failed to serialize event params/data. appId, eventId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (long1)), ((Object) (bn1)));
	//   94  197:aload_0         
	//   95  198:invokevirtual   #244 <Method s bt.r()>
	//   96  201:invokevirtual   #250 <Method u s.u_()>
	//   97  204:ldc2            #1115 <String "Data loss. Failed to serialize event params/data. appId, eventId">
	//   98  207:aload_1         
	//   99  208:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  100  211:aload_2         
	//  101  212:aload           5
	//  102  214:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
				return false;
	//  103  217:iconst_0        
	//  104  218:ireturn         
			}
			((bt)this).r().x().a("Saving complex main event, appId, data size", ((Object) (((bt)this).o().a(s1))), ((Object) (Integer.valueOf(abyte0.length))));
			bn1 = ((bn) (new ContentValues()));
			((ContentValues) (bn1)).put("app_id", s1);
			((ContentValues) (bn1)).put("event_id", long1);
			((ContentValues) (bn1)).put("children_to_process", Long.valueOf(l));
			((ContentValues) (bn1)).put("main_event", abyte0);
			try
			{
				if(y().insertWithOnConflict("main_event_params", ((String) (null)), ((ContentValues) (bn1)), 5) != -1L)
					break label0;
				((bt)this).r().u_().a("Failed to insert complex main event (got -1). appId", com.google.android.gms.measurement.internal.s.a(s1));
			}
			// Misplaced declaration of an exception variable
			catch(Long long1)
			{
				((bt)this).r().u_().a("Error storing complex main event. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (long1)));
				return false;
			}
			return false;
		}
		return true;
	}

	public final er b(String s1)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		Object obj = ((Object) (y()));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    9   17:astore          6
		boolean flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore_3        
		obj = ((Object) (((SQLiteDatabase) (obj)).query("apps", new String[] {
			"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", 
			"measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", 
			"daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "ssaid_reporting_enabled", "admob_app_id"
		}, "app_id=?", new String[] {
			s1
		}, ((String) (null)), ((String) (null)), ((String) (null)))));
	//   12   21:aload           6
	//   13   23:ldc2            #711 <String "apps">
	//   14   26:bipush          26
	//   15   28:anewarray       String[]
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:ldc2            #898 <String "app_instance_id">
	//   19   36:aastore         
	//   20   37:dup             
	//   21   38:iconst_1        
	//   22   39:ldc2            #902 <String "gmp_app_id">
	//   23   42:aastore         
	//   24   43:dup             
	//   25   44:iconst_2        
	//   26   45:ldc2            #906 <String "resettable_device_id_hash">
	//   27   48:aastore         
	//   28   49:dup             
	//   29   50:iconst_3        
	//   30   51:ldc2            #910 <String "last_bundle_index">
	//   31   54:aastore         
	//   32   55:dup             
	//   33   56:iconst_4        
	//   34   57:ldc1            #69  <String "last_bundle_start_timestamp">
	//   35   59:aastore         
	//   36   60:dup             
	//   37   61:iconst_5        
	//   38   62:ldc2            #916 <String "last_bundle_end_timestamp">
	//   39   65:aastore         
	//   40   66:dup             
	//   41   67:bipush          6
	//   42   69:ldc1            #49  <String "app_version">
	//   43   71:aastore         
	//   44   72:dup             
	//   45   73:bipush          7
	//   46   75:ldc1            #53  <String "app_store">
	//   47   77:aastore         
	//   48   78:dup             
	//   49   79:bipush          8
	//   50   81:ldc1            #57  <String "gmp_version">
	//   51   83:aastore         
	//   52   84:dup             
	//   53   85:bipush          9
	//   54   87:ldc1            #61  <String "dev_cert_hash">
	//   55   89:aastore         
	//   56   90:dup             
	//   57   91:bipush          10
	//   58   93:ldc1            #65  <String "measurement_enabled">
	//   59   95:aastore         
	//   60   96:dup             
	//   61   97:bipush          11
	//   62   99:ldc1            #73  <String "day">
	//   63  101:aastore         
	//   64  102:dup             
	//   65  103:bipush          12
	//   66  105:ldc1            #77  <String "daily_public_events_count">
	//   67  107:aastore         
	//   68  108:dup             
	//   69  109:bipush          13
	//   70  111:ldc1            #81  <String "daily_events_count">
	//   71  113:aastore         
	//   72  114:dup             
	//   73  115:bipush          14
	//   74  117:ldc1            #85  <String "daily_conversions_count">
	//   75  119:aastore         
	//   76  120:dup             
	//   77  121:bipush          15
	//   78  123:ldc1            #93  <String "config_fetched_time">
	//   79  125:aastore         
	//   80  126:dup             
	//   81  127:bipush          16
	//   82  129:ldc1            #97  <String "failed_config_fetch_time">
	//   83  131:aastore         
	//   84  132:dup             
	//   85  133:bipush          17
	//   86  135:ldc1            #101 <String "app_version_int">
	//   87  137:aastore         
	//   88  138:dup             
	//   89  139:bipush          18
	//   90  141:ldc1            #105 <String "firebase_instance_id">
	//   91  143:aastore         
	//   92  144:dup             
	//   93  145:bipush          19
	//   94  147:ldc1            #109 <String "daily_error_events_count">
	//   95  149:aastore         
	//   96  150:dup             
	//   97  151:bipush          20
	//   98  153:ldc1            #113 <String "daily_realtime_events_count">
	//   99  155:aastore         
	//  100  156:dup             
	//  101  157:bipush          21
	//  102  159:ldc1            #117 <String "health_monitor_sample">
	//  103  161:aastore         
	//  104  162:dup             
	//  105  163:bipush          22
	//  106  165:ldc1            #121 <String "android_id">
	//  107  167:aastore         
	//  108  168:dup             
	//  109  169:bipush          23
	//  110  171:ldc1            #125 <String "adid_reporting_enabled">
	//  111  173:aastore         
	//  112  174:dup             
	//  113  175:bipush          24
	//  114  177:ldc1            #129 <String "ssaid_reporting_enabled">
	//  115  179:aastore         
	//  116  180:dup             
	//  117  181:bipush          25
	//  118  183:ldc1            #133 <String "admob_app_id">
	//  119  185:aastore         
	//  120  186:ldc2            #713 <String "app_id=?">
	//  121  189:iconst_1        
	//  122  190:anewarray       String[]
	//  123  193:dup             
	//  124  194:iconst_0        
	//  125  195:aload_1         
	//  126  196:aastore         
	//  127  197:aconst_null     
	//  128  198:aconst_null     
	//  129  199:aconst_null     
	//  130  200:invokevirtual   #678 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//  131  203:astore          6
		boolean flag;
		Cursor cursor;
		SQLiteException sqliteexception;
		long l;
		er er1;
		try
		{
			flag = ((Cursor) (obj)).moveToFirst();
	//  132  205:aload           6
	//  133  207:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//  134  212:istore_2        
		}
	//* 135  213:iload_2         
	//* 136  214:ifne            231
	//* 137  217:aload           6
	//* 138  219:ifnull          229
	//* 139  222:aload           6
	//* 140  224:invokeinterface #240 <Method void Cursor.close()>
	//* 141  229:aconst_null     
	//* 142  230:areturn         
	//* 143  231:aload           6
	//* 144  233:astore          7
	//* 145  235:new             #894 <Class er>
	//* 146  238:dup             
	//* 147  239:aload_0         
	//* 148  240:getfield        #1119 <Field ee a>
	//* 149  243:invokevirtual   #1124 <Method ax ee.p()>
	//* 150  246:aload_1         
	//* 151  247:invokespecial   #1127 <Method void er(ax, String)>
	//* 152  250:astore          8
	//* 153  252:aload           6
	//* 154  254:astore          7
	//* 155  256:aload           8
	//* 156  258:aload           6
	//* 157  260:iconst_0        
	//* 158  261:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 159  266:invokevirtual   #1128 <Method void com.google.android.gms.measurement.internal.er.a(String)>
	//* 160  269:aload           6
	//* 161  271:astore          7
	//* 162  273:aload           8
	//* 163  275:aload           6
	//* 164  277:iconst_1        
	//* 165  278:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 166  283:invokevirtual   #1130 <Method void er.b(String)>
	//* 167  286:aload           6
	//* 168  288:astore          7
	//* 169  290:aload           8
	//* 170  292:aload           6
	//* 171  294:iconst_2        
	//* 172  295:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 173  300:invokevirtual   #1132 <Method void er.d(String)>
	//* 174  303:aload           6
	//* 175  305:astore          7
	//* 176  307:aload           8
	//* 177  309:aload           6
	//* 178  311:iconst_3        
	//* 179  312:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 180  317:invokevirtual   #1134 <Method void er.f(long)>
	//* 181  320:aload           6
	//* 182  322:astore          7
	//* 183  324:aload           8
	//* 184  326:aload           6
	//* 185  328:iconst_4        
	//* 186  329:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 187  334:invokevirtual   #1135 <Method void com.google.android.gms.measurement.internal.er.a(long)>
	//* 188  337:aload           6
	//* 189  339:astore          7
	//* 190  341:aload           8
	//* 191  343:aload           6
	//* 192  345:iconst_5        
	//* 193  346:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 194  351:invokevirtual   #1137 <Method void er.b(long)>
	//* 195  354:aload           6
	//* 196  356:astore          7
	//* 197  358:aload           8
	//* 198  360:aload           6
	//* 199  362:bipush          6
	//* 200  364:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 201  369:invokevirtual   #1139 <Method void er.f(String)>
	//* 202  372:aload           6
	//* 203  374:astore          7
	//* 204  376:aload           8
	//* 205  378:aload           6
	//* 206  380:bipush          7
	//* 207  382:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 208  387:invokevirtual   #1141 <Method void er.g(String)>
	//* 209  390:aload           6
	//* 210  392:astore          7
	//* 211  394:aload           8
	//* 212  396:aload           6
	//* 213  398:bipush          8
	//* 214  400:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 215  405:invokevirtual   #1143 <Method void er.d(long)>
	//* 216  408:aload           6
	//* 217  410:astore          7
	//* 218  412:aload           8
	//* 219  414:aload           6
	//* 220  416:bipush          9
	//* 221  418:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 222  423:invokevirtual   #1145 <Method void com.google.android.gms.measurement.internal.er.e(long)>
	//* 223  426:aload           6
	//* 224  428:astore          7
	//* 225  430:aload           6
	//* 226  432:bipush          10
	//* 227  434:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//* 228  439:ifne            1006
	//* 229  442:aload           6
	//* 230  444:astore          7
	//* 231  446:aload           6
	//* 232  448:bipush          10
	//* 233  450:invokeinterface #788 <Method int Cursor.getInt(int)>
	//* 234  455:ifeq            1001
	//* 235  458:goto            1006
	//* 236  461:aload           6
	//* 237  463:astore          7
	//* 238  465:aload           8
	//* 239  467:iload_2         
	//* 240  468:invokevirtual   #1147 <Method void com.google.android.gms.measurement.internal.er.a(boolean)>
	//* 241  471:aload           6
	//* 242  473:astore          7
	//* 243  475:aload           8
	//* 244  477:aload           6
	//* 245  479:bipush          11
	//* 246  481:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 247  486:invokevirtual   #1149 <Method void er.i(long)>
	//* 248  489:aload           6
	//* 249  491:astore          7
	//* 250  493:aload           8
	//* 251  495:aload           6
	//* 252  497:bipush          12
	//* 253  499:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 254  504:invokevirtual   #1151 <Method void er.j(long)>
	//* 255  507:aload           6
	//* 256  509:astore          7
	//* 257  511:aload           8
	//* 258  513:aload           6
	//* 259  515:bipush          13
	//* 260  517:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 261  522:invokevirtual   #1153 <Method void er.k(long)>
	//* 262  525:aload           6
	//* 263  527:astore          7
	//* 264  529:aload           8
	//* 265  531:aload           6
	//* 266  533:bipush          14
	//* 267  535:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 268  540:invokevirtual   #1155 <Method void er.l(long)>
	//* 269  543:aload           6
	//* 270  545:astore          7
	//* 271  547:aload           8
	//* 272  549:aload           6
	//* 273  551:bipush          15
	//* 274  553:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 275  558:invokevirtual   #1157 <Method void er.g(long)>
	//* 276  561:aload           6
	//* 277  563:astore          7
	//* 278  565:aload           8
	//* 279  567:aload           6
	//* 280  569:bipush          16
	//* 281  571:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 282  576:invokevirtual   #1159 <Method void er.h(long)>
	//* 283  579:aload           6
	//* 284  581:astore          7
	//* 285  583:aload           6
	//* 286  585:bipush          17
	//* 287  587:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//* 288  592:ifeq            603
	//* 289  595:ldc2w           #1160 <Long 0x80000000L>
	//* 290  598:lstore          4
	//* 291  600:goto            619
	//* 292  603:aload           6
	//* 293  605:astore          7
	//* 294  607:aload           6
	//* 295  609:bipush          17
	//* 296  611:invokeinterface #788 <Method int Cursor.getInt(int)>
	//* 297  616:i2l             
	//* 298  617:lstore          4
	//* 299  619:aload           6
	//* 300  621:astore          7
	//* 301  623:aload           8
	//* 302  625:lload           4
	//* 303  627:invokevirtual   #1163 <Method void er.c(long)>
	//* 304  630:aload           6
	//* 305  632:astore          7
	//* 306  634:aload           8
	//* 307  636:aload           6
	//* 308  638:bipush          18
	//* 309  640:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 310  645:invokevirtual   #1165 <Method void com.google.android.gms.measurement.internal.er.e(String)>
	//* 311  648:aload           6
	//* 312  650:astore          7
	//* 313  652:aload           8
	//* 314  654:aload           6
	//* 315  656:bipush          19
	//* 316  658:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 317  663:invokevirtual   #1167 <Method void er.n(long)>
	//* 318  666:aload           6
	//* 319  668:astore          7
	//* 320  670:aload           8
	//* 321  672:aload           6
	//* 322  674:bipush          20
	//* 323  676:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 324  681:invokevirtual   #1169 <Method void er.m(long)>
	//* 325  684:aload           6
	//* 326  686:astore          7
	//* 327  688:aload           8
	//* 328  690:aload           6
	//* 329  692:bipush          21
	//* 330  694:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 331  699:invokevirtual   #1171 <Method void er.h(String)>
	//* 332  702:aload           6
	//* 333  704:astore          7
	//* 334  706:aload           6
	//* 335  708:bipush          22
	//* 336  710:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//* 337  715:ifeq            724
	//* 338  718:lconst_0        
	//* 339  719:lstore          4
	//* 340  721:goto            739
	//* 341  724:aload           6
	//* 342  726:astore          7
	//* 343  728:aload           6
	//* 344  730:bipush          22
	//* 345  732:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 346  737:lstore          4
	//* 347  739:aload           6
	//* 348  741:astore          7
	//* 349  743:aload           8
	//* 350  745:lload           4
	//* 351  747:invokevirtual   #1173 <Method void er.o(long)>
	//* 352  750:aload           6
	//* 353  752:astore          7
	//* 354  754:aload           6
	//* 355  756:bipush          23
	//* 356  758:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//* 357  763:ifne            1016
	//* 358  766:aload           6
	//* 359  768:astore          7
	//* 360  770:aload           6
	//* 361  772:bipush          23
	//* 362  774:invokeinterface #788 <Method int Cursor.getInt(int)>
	//* 363  779:ifeq            1011
	//* 364  782:goto            1016
	//* 365  785:aload           6
	//* 366  787:astore          7
	//* 367  789:aload           8
	//* 368  791:iload_2         
	//* 369  792:invokevirtual   #1174 <Method void er.b(boolean)>
	//* 370  795:aload           6
	//* 371  797:astore          7
	//* 372  799:aload           6
	//* 373  801:bipush          24
	//* 374  803:invokeinterface #682 <Method boolean Cursor.isNull(int)>
	//* 375  808:ifne            1021
	//* 376  811:iload_3         
	//* 377  812:istore_2        
	//* 378  813:aload           6
	//* 379  815:astore          7
	//* 380  817:aload           6
	//* 381  819:bipush          24
	//* 382  821:invokeinterface #788 <Method int Cursor.getInt(int)>
	//* 383  826:ifeq            832
	//* 384  829:goto            1021
	//* 385  832:aload           6
	//* 386  834:astore          7
	//* 387  836:aload           8
	//* 388  838:iload_2         
	//* 389  839:invokevirtual   #1176 <Method void er.c(boolean)>
	//* 390  842:aload           6
	//* 391  844:astore          7
	//* 392  846:aload           8
	//* 393  848:aload           6
	//* 394  850:bipush          25
	//* 395  852:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 396  857:invokevirtual   #1178 <Method void er.c(String)>
	//* 397  860:aload           6
	//* 398  862:astore          7
	//* 399  864:aload           8
	//* 400  866:invokevirtual   #1179 <Method void com.google.android.gms.measurement.internal.er.a()>
	//* 401  869:aload           6
	//* 402  871:astore          7
	//* 403  873:aload           6
	//* 404  875:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//* 405  880:ifeq            904
	//* 406  883:aload           6
	//* 407  885:astore          7
	//* 408  887:aload_0         
	//* 409  888:invokevirtual   #244 <Method s bt.r()>
	//* 410  891:invokevirtual   #250 <Method u s.u_()>
	//* 411  894:ldc2            #1181 <String "Got multiple records for app, expected one. appId">
	//* 412  897:aload_1         
	//* 413  898:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//* 414  901:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//* 415  904:aload           6
	//* 416  906:ifnull          916
	//* 417  909:aload           6
	//* 418  911:invokeinterface #240 <Method void Cursor.close()>
	//* 419  916:aload           8
	//* 420  918:areturn         
	//* 421  919:astore          8
	//* 422  921:goto            945
	//* 423  924:astore_1        
	//* 424  925:goto            987
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
	//* 425  928:astore          8
		{
			break MISSING_BLOCK_LABEL_945;
	//  426  930:goto            945
		}
		if(!flag)
		{
			if(obj != null)
				((Cursor) (obj)).close();
			return null;
		}
		cursor = ((Cursor) (obj));
		er1 = new er(a.p(), s1);
		cursor = ((Cursor) (obj));
		er1.a(((Cursor) (obj)).getString(0));
		cursor = ((Cursor) (obj));
		er1.b(((Cursor) (obj)).getString(1));
		cursor = ((Cursor) (obj));
		er1.d(((Cursor) (obj)).getString(2));
		cursor = ((Cursor) (obj));
		er1.f(((Cursor) (obj)).getLong(3));
		cursor = ((Cursor) (obj));
		er1.a(((Cursor) (obj)).getLong(4));
		cursor = ((Cursor) (obj));
		er1.b(((Cursor) (obj)).getLong(5));
		cursor = ((Cursor) (obj));
		er1.f(((Cursor) (obj)).getString(6));
		cursor = ((Cursor) (obj));
		er1.g(((Cursor) (obj)).getString(7));
		cursor = ((Cursor) (obj));
		er1.d(((Cursor) (obj)).getLong(8));
		cursor = ((Cursor) (obj));
		er1.e(((Cursor) (obj)).getLong(9));
		cursor = ((Cursor) (obj));
		if(((Cursor) (obj)).isNull(10)) goto _L2; else goto _L1
_L1:
		cursor = ((Cursor) (obj));
		if(((Cursor) (obj)).getInt(10) == 0) goto _L3; else goto _L2
_L7:
		cursor = ((Cursor) (obj));
		er1.a(flag);
		cursor = ((Cursor) (obj));
		er1.i(((Cursor) (obj)).getLong(11));
		cursor = ((Cursor) (obj));
		er1.j(((Cursor) (obj)).getLong(12));
		cursor = ((Cursor) (obj));
		er1.k(((Cursor) (obj)).getLong(13));
		cursor = ((Cursor) (obj));
		er1.l(((Cursor) (obj)).getLong(14));
		cursor = ((Cursor) (obj));
		er1.g(((Cursor) (obj)).getLong(15));
		cursor = ((Cursor) (obj));
		er1.h(((Cursor) (obj)).getLong(16));
		cursor = ((Cursor) (obj));
		if(((Cursor) (obj)).isNull(17))
		{
			l = 0x80000000L;
			break MISSING_BLOCK_LABEL_619;
		}
		cursor = ((Cursor) (obj));
		l = ((Cursor) (obj)).getInt(17);
		cursor = ((Cursor) (obj));
		er1.c(l);
		cursor = ((Cursor) (obj));
		er1.e(((Cursor) (obj)).getString(18));
		cursor = ((Cursor) (obj));
		er1.n(((Cursor) (obj)).getLong(19));
		cursor = ((Cursor) (obj));
		er1.m(((Cursor) (obj)).getLong(20));
		cursor = ((Cursor) (obj));
		er1.h(((Cursor) (obj)).getString(21));
		cursor = ((Cursor) (obj));
		if(((Cursor) (obj)).isNull(22))
		{
			l = 0L;
			break MISSING_BLOCK_LABEL_739;
		}
		cursor = ((Cursor) (obj));
		l = ((Cursor) (obj)).getLong(22);
		cursor = ((Cursor) (obj));
		er1.o(l);
		cursor = ((Cursor) (obj));
		if(((Cursor) (obj)).isNull(23)) goto _L5; else goto _L4
_L4:
		cursor = ((Cursor) (obj));
		if(((Cursor) (obj)).getInt(23) == 0) goto _L6; else goto _L5
_L8:
		cursor = ((Cursor) (obj));
		er1.b(flag);
		cursor = ((Cursor) (obj));
		if(((Cursor) (obj)).isNull(24))
			break MISSING_BLOCK_LABEL_1021;
		flag = flag1;
		cursor = ((Cursor) (obj));
		if(((Cursor) (obj)).getInt(24) != 0)
			break MISSING_BLOCK_LABEL_1021;
_L9:
		cursor = ((Cursor) (obj));
		er1.c(flag);
		cursor = ((Cursor) (obj));
		er1.c(((Cursor) (obj)).getString(25));
		cursor = ((Cursor) (obj));
		er1.a();
		cursor = ((Cursor) (obj));
		if(!((Cursor) (obj)).moveToNext())
			break MISSING_BLOCK_LABEL_904;
		cursor = ((Cursor) (obj));
		((bt)this).r().u_().a("Got multiple records for app, expected one. appId", com.google.android.gms.measurement.internal.s.a(s1));
		if(obj != null)
			((Cursor) (obj)).close();
		return er1;
		sqliteexception;
		break MISSING_BLOCK_LABEL_945;
		s1;
		break MISSING_BLOCK_LABEL_987;
		s1;
	//  427  933:astore_1        
		obj = null;
	//  428  934:aconst_null     
	//  429  935:astore          6
		break MISSING_BLOCK_LABEL_987;
	//  430  937:goto            987
		sqliteexception;
	//  431  940:astore          8
		obj = null;
	//  432  942:aconst_null     
	//  433  943:astore          6
		cursor = ((Cursor) (obj));
	//  434  945:aload           6
	//  435  947:astore          7
		((bt)this).r().u_().a("Error querying app. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (sqliteexception)));
	//  436  949:aload_0         
	//  437  950:invokevirtual   #244 <Method s bt.r()>
	//  438  953:invokevirtual   #250 <Method u s.u_()>
	//  439  956:ldc2            #1183 <String "Error querying app. appId">
	//  440  959:aload_1         
	//  441  960:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  442  963:aload           8
	//  443  965:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		if(obj != null)
	//* 444  968:aload           6
	//* 445  970:ifnull          980
			((Cursor) (obj)).close();
	//  446  973:aload           6
	//  447  975:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//  448  980:aconst_null     
	//  449  981:areturn         
		s1;
	//  450  982:astore_1        
		obj = ((Object) (cursor));
	//  451  983:aload           7
	//  452  985:astore          6
		if(obj != null)
	//* 453  987:aload           6
	//* 454  989:ifnull          999
			((Cursor) (obj)).close();
	//  455  992:aload           6
	//  456  994:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  457  999:aload_1         
	//  458 1000:athrow          
_L3:
		flag = false;
	//  459 1001:iconst_0        
	//  460 1002:istore_2        
		  goto _L7
	//* 461 1003:goto            461
_L2:
		flag = true;
	//  462 1006:iconst_1        
	//  463 1007:istore_2        
		  goto _L7
	//* 464 1008:goto            461
_L6:
		flag = false;
	//  465 1011:iconst_0        
	//  466 1012:istore_2        
		  goto _L8
	//* 467 1013:goto            785
_L5:
		flag = true;
	//  468 1016:iconst_1        
	//  469 1017:istore_2        
		  goto _L8
	//* 470 1018:goto            785
		flag = true;
	//  471 1021:iconst_1        
	//  472 1022:istore_2        
		  goto _L9
	//* 473 1023:goto            832
	}

	public final List b(String s1, String s2, String s3)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		ArrayList arraylist = new ArrayList(3);
	//    7   13:new             #456 <Class ArrayList>
	//    8   16:dup             
	//    9   17:iconst_3        
	//   10   18:invokespecial   #798 <Method void ArrayList(int)>
	//   11   21:astore          4
		((List) (arraylist)).add(((Object) (s1)));
	//   12   23:aload           4
	//   13   25:aload_1         
	//   14   26:invokeinterface #476 <Method boolean List.add(Object)>
	//   15   31:pop             
		s1 = ((String) (new StringBuilder("app_id=?")));
	//   16   32:new             #484 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:ldc2            #713 <String "app_id=?">
	//   19   39:invokespecial   #799 <Method void StringBuilder(String)>
	//   20   42:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s2))))
	//*  21   43:aload_2         
	//*  22   44:invokestatic    #345 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   47:ifne            67
		{
			((List) (arraylist)).add(((Object) (s2)));
	//   24   50:aload           4
	//   25   52:aload_2         
	//   26   53:invokeinterface #476 <Method boolean List.add(Object)>
	//   27   58:pop             
			((StringBuilder) (s1)).append(" and origin=?");
	//   28   59:aload_1         
	//   29   60:ldc2            #801 <String " and origin=?">
	//   30   63:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   31   66:pop             
		}
		if(!TextUtils.isEmpty(((CharSequence) (s3))))
	//*  32   67:aload_3         
	//*  33   68:invokestatic    #345 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  34   71:ifne            100
		{
			((List) (arraylist)).add(((Object) (String.valueOf(((Object) (s3))).concat("*"))));
	//   35   74:aload           4
	//   36   76:aload_3         
	//   37   77:invokestatic    #358 <Method String String.valueOf(Object)>
	//   38   80:ldc2            #803 <String "*">
	//   39   83:invokevirtual   #806 <Method String String.concat(String)>
	//   40   86:invokeinterface #476 <Method boolean List.add(Object)>
	//   41   91:pop             
			((StringBuilder) (s1)).append(" and name glob ?");
	//   42   92:aload_1         
	//   43   93:ldc2            #808 <String " and name glob ?">
	//   44   96:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   45   99:pop             
		}
		s2 = ((String) ((String[])((List) (arraylist)).toArray(((Object []) (new String[((List) (arraylist)).size()])))));
	//   46  100:aload           4
	//   47  102:aload           4
	//   48  104:invokeinterface #462 <Method int List.size()>
	//   49  109:anewarray       String[]
	//   50  112:invokeinterface #812 <Method Object[] List.toArray(Object[])>
	//   51  117:checkcast       #813 <Class String[]>
	//   52  120:astore_2        
		return a(((StringBuilder) (s1)).toString(), ((String []) (s2)));
	//   53  121:aload_0         
	//   54  122:aload_1         
	//   55  123:invokevirtual   #501 <Method String StringBuilder.toString()>
	//   56  126:aload_2         
	//   57  127:invokevirtual   #1185 <Method List a(String, String[])>
	//   58  130:areturn         
	}

	public final void b(String s1, String s2)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		am.a(s2);
	//    3    5:aload_2         
	//    4    6:invokestatic    #305 <Method String am.a(String)>
	//    5    9:pop             
		((bt)this).d();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #332 <Method void ed.k()>
		try
		{
			int j = y().delete("user_attributes", "app_id=? and name=?", new String[] {
				s1, s2
			});
	//   10   18:aload_0         
	//   11   19:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   12   22:ldc2            #740 <String "user_attributes">
	//   13   25:ldc2            #674 <String "app_id=? and name=?">
	//   14   28:iconst_2        
	//   15   29:anewarray       String[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:aload_1         
	//   19   35:aastore         
	//   20   36:dup             
	//   21   37:iconst_1        
	//   22   38:aload_2         
	//   23   39:aastore         
	//   24   40:invokevirtual   #511 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   25   43:istore_3        
			((bt)this).r().x().a("Deleted user attribute rows", ((Object) (Integer.valueOf(j))));
	//   26   44:aload_0         
	//   27   45:invokevirtual   #244 <Method s bt.r()>
	//   28   48:invokevirtual   #572 <Method u s.x()>
	//   29   51:ldc2            #1187 <String "Deleted user attribute rows">
	//   30   54:iload_3         
	//   31   55:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   32   58:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			return;
	//   33   61:return          
		}
		catch(SQLiteException sqliteexception)
	//*  34   62:astore          4
		{
			((bt)this).r().u_().a("Error deleting user attribute. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (((bt)this).o().c(s2))), ((Object) (sqliteexception)));
	//   35   64:aload_0         
	//   36   65:invokevirtual   #244 <Method s bt.r()>
	//   37   68:invokevirtual   #250 <Method u s.u_()>
	//   38   71:ldc2            #1189 <String "Error deleting user attribute. appId">
	//   39   74:aload_1         
	//   40   75:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   41   78:aload_0         
	//   42   79:invokevirtual   #702 <Method q bt.o()>
	//   43   82:aload_2         
	//   44   83:invokevirtual   #1191 <Method String q.c(String)>
	//   45   86:aload           4
	//   46   88:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
		}
	//   47   91:return          
	}

	public final long c(String s1)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		int j;
		try
		{
			j = y().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] {
				s1, String.valueOf(Math.max(0, Math.min(0xf4240, ((bt)this).t().b(s1, h.x))))
			});
	//    7   13:aload_0         
	//    8   14:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    9   17:ldc2            #1194 <String "raw_events">
	//   10   20:ldc2            #1196 <String "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)">
	//   11   23:iconst_2        
	//   12   24:anewarray       String[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:aload_1         
	//   16   30:aastore         
	//   17   31:dup             
	//   18   32:iconst_1        
	//   19   33:iconst_0        
	//   20   34:ldc2            #1197 <Int 0xf4240>
	//   21   37:aload_0         
	//   22   38:invokevirtual   #435 <Method ew bt.t()>
	//   23   41:aload_1         
	//   24   42:getstatic       #1199 <Field i h.x>
	//   25   45:invokevirtual   #445 <Method int ew.b(String, i)>
	//   26   48:invokestatic    #451 <Method int Math.min(int, int)>
	//   27   51:invokestatic    #454 <Method int Math.max(int, int)>
	//   28   54:invokestatic    #772 <Method String String.valueOf(int)>
	//   29   57:aastore         
	//   30   58:invokevirtual   #511 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   31   61:istore_2        
		}
	//*  32   62:iload_2         
	//*  33   63:i2l             
	//*  34   64:lreturn         
		catch(SQLiteException sqliteexception)
	//*  35   65:astore_3        
		{
			((bt)this).r().u_().a("Error deleting over the limit events. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (sqliteexception)));
	//   36   66:aload_0         
	//   37   67:invokevirtual   #244 <Method s bt.r()>
	//   38   70:invokevirtual   #250 <Method u s.u_()>
	//   39   73:ldc2            #1201 <String "Error deleting over the limit events. appId">
	//   40   76:aload_1         
	//   41   77:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   42   80:aload_3         
	//   43   81:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
			return 0L;
	//   44   84:lconst_0        
	//   45   85:lreturn         
		}
		return (long)j;
	}

	public final en c(String s1, String s2)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		am.a(s2);
	//    3    5:aload_2         
	//    4    6:invokestatic    #305 <Method String am.a(String)>
	//    5    9:pop             
		((bt)this).d();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #332 <Method void ed.k()>
		Cursor cursor = y().query("user_attributes", new String[] {
			"set_timestamp", "value", "origin"
		}, "app_id=? and name=?", new String[] {
			s1, s2
		}, ((String) (null)), ((String) (null)), ((String) (null)));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   12   22:ldc2            #740 <String "user_attributes">
	//   13   25:iconst_3        
	//   14   26:anewarray       String[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:ldc2            #744 <String "set_timestamp">
	//   18   34:aastore         
	//   19   35:dup             
	//   20   36:iconst_1        
	//   21   37:ldc2            #746 <String "value">
	//   22   40:aastore         
	//   23   41:dup             
	//   24   42:iconst_2        
	//   25   43:ldc1            #43  <String "origin">
	//   26   45:aastore         
	//   27   46:ldc2            #674 <String "app_id=? and name=?">
	//   28   49:iconst_2        
	//   29   50:anewarray       String[]
	//   30   53:dup             
	//   31   54:iconst_0        
	//   32   55:aload_1         
	//   33   56:aastore         
	//   34   57:dup             
	//   35   58:iconst_1        
	//   36   59:aload_2         
	//   37   60:aastore         
	//   38   61:aconst_null     
	//   39   62:aconst_null     
	//   40   63:aconst_null     
	//   41   64:invokevirtual   #678 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   42   67:astore          6
		Cursor cursor1;
		SQLiteException sqliteexception;
		boolean flag;
		long l;
		Object obj;
		try
		{
			flag = cursor.moveToFirst();
	//   43   69:aload           6
	//   44   71:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   45   76:istore_3        
		}
	//*  46   77:iload_3         
	//*  47   78:ifne            95
	//*  48   81:aload           6
	//*  49   83:ifnull          93
	//*  50   86:aload           6
	//*  51   88:invokeinterface #240 <Method void Cursor.close()>
	//*  52   93:aconst_null     
	//*  53   94:areturn         
	//*  54   95:aload           6
	//*  55   97:iconst_0        
	//*  56   98:invokeinterface #237 <Method long Cursor.getLong(int)>
	//*  57  103:lstore          4
	//*  58  105:aload           6
	//*  59  107:astore          7
	//*  60  109:aload_0         
	//*  61  110:aload           6
	//*  62  112:iconst_1        
	//*  63  113:invokespecial   #757 <Method Object a(Cursor, int)>
	//*  64  116:astore          8
	//*  65  118:aload           6
	//*  66  120:astore          7
	//*  67  122:new             #761 <Class en>
	//*  68  125:dup             
	//*  69  126:aload_1         
	//*  70  127:aload           6
	//*  71  129:iconst_2        
	//*  72  130:invokeinterface #283 <Method String Cursor.getString(int)>
	//*  73  135:aload_2         
	//*  74  136:lload           4
	//*  75  138:aload           8
	//*  76  140:invokespecial   #764 <Method void en(String, String, String, long, Object)>
	//*  77  143:astore          8
	//*  78  145:aload           6
	//*  79  147:astore          7
	//*  80  149:aload           6
	//*  81  151:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//*  82  156:ifeq            180
	//*  83  159:aload           6
	//*  84  161:astore          7
	//*  85  163:aload_0         
	//*  86  164:invokevirtual   #244 <Method s bt.r()>
	//*  87  167:invokevirtual   #250 <Method u s.u_()>
	//*  88  170:ldc2            #1203 <String "Got multiple records for user property, expected one. appId">
	//*  89  173:aload_1         
	//*  90  174:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//*  91  177:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
	//*  92  180:aload           6
	//*  93  182:ifnull          192
	//*  94  185:aload           6
	//*  95  187:invokeinterface #240 <Method void Cursor.close()>
	//*  96  192:aload           8
	//*  97  194:areturn         
	//*  98  195:astore          8
	//*  99  197:goto            221
	//* 100  200:astore_1        
	//* 101  201:goto            271
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
	//* 102  204:astore          8
		{
			break MISSING_BLOCK_LABEL_221;
	//  103  206:goto            221
		}
		if(!flag)
		{
			if(cursor != null)
				cursor.close();
			return null;
		}
		l = cursor.getLong(0);
		cursor1 = cursor;
		obj = a(cursor, 1);
		cursor1 = cursor;
		obj = ((Object) (new en(s1, cursor.getString(2), s2, l, obj)));
		cursor1 = cursor;
		if(!cursor.moveToNext())
			break MISSING_BLOCK_LABEL_180;
		cursor1 = cursor;
		((bt)this).r().u_().a("Got multiple records for user property, expected one. appId", com.google.android.gms.measurement.internal.s.a(s1));
		if(cursor != null)
			cursor.close();
		return ((en) (obj));
		sqliteexception;
		break MISSING_BLOCK_LABEL_221;
		s1;
		break MISSING_BLOCK_LABEL_271;
		s1;
	//  104  209:astore_1        
		cursor = null;
	//  105  210:aconst_null     
	//  106  211:astore          6
		break MISSING_BLOCK_LABEL_271;
	//  107  213:goto            271
		sqliteexception;
	//  108  216:astore          8
		cursor = null;
	//  109  218:aconst_null     
	//  110  219:astore          6
		cursor1 = cursor;
	//  111  221:aload           6
	//  112  223:astore          7
		((bt)this).r().u_().a("Error querying user property. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (((bt)this).o().c(s2))), ((Object) (sqliteexception)));
	//  113  225:aload_0         
	//  114  226:invokevirtual   #244 <Method s bt.r()>
	//  115  229:invokevirtual   #250 <Method u s.u_()>
	//  116  232:ldc2            #1205 <String "Error querying user property. appId">
	//  117  235:aload_1         
	//  118  236:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  119  239:aload_0         
	//  120  240:invokevirtual   #702 <Method q bt.o()>
	//  121  243:aload_2         
	//  122  244:invokevirtual   #1191 <Method String q.c(String)>
	//  123  247:aload           8
	//  124  249:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
		if(cursor != null)
	//* 125  252:aload           6
	//* 126  254:ifnull          264
			cursor.close();
	//  127  257:aload           6
	//  128  259:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//  129  264:aconst_null     
	//  130  265:areturn         
		s1;
	//  131  266:astore_1        
		cursor = cursor1;
	//  132  267:aload           7
	//  133  269:astore          6
		if(cursor != null)
	//* 134  271:aload           6
	//* 135  273:ifnull          283
			cursor.close();
	//  136  276:aload           6
	//  137  278:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  138  283:aload_1         
	//  139  284:athrow          
	}

	public final zzo d(String s1, String s2)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		am.a(s2);
	//    3    5:aload_2         
	//    4    6:invokestatic    #305 <Method String am.a(String)>
	//    5    9:pop             
		((bt)this).d();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #332 <Method void ed.k()>
		Cursor cursor = y().query("conditional_properties", new String[] {
			"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", 
			"expired_event"
		}, "app_id=? and name=?", new String[] {
			s1, s2
		}, ((String) (null)), ((String) (null)), ((String) (null)));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   12   22:ldc2            #824 <String "conditional_properties">
	//   13   25:bipush          11
	//   14   27:anewarray       String[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:ldc1            #43  <String "origin">
	//   18   34:aastore         
	//   19   35:dup             
	//   20   36:iconst_1        
	//   21   37:ldc2            #746 <String "value">
	//   22   40:aastore         
	//   23   41:dup             
	//   24   42:iconst_2        
	//   25   43:ldc2            #826 <String "active">
	//   26   46:aastore         
	//   27   47:dup             
	//   28   48:iconst_3        
	//   29   49:ldc2            #828 <String "trigger_event_name">
	//   30   52:aastore         
	//   31   53:dup             
	//   32   54:iconst_4        
	//   33   55:ldc2            #830 <String "trigger_timeout">
	//   34   58:aastore         
	//   35   59:dup             
	//   36   60:iconst_5        
	//   37   61:ldc2            #832 <String "timed_out_event">
	//   38   64:aastore         
	//   39   65:dup             
	//   40   66:bipush          6
	//   41   68:ldc2            #834 <String "creation_timestamp">
	//   42   71:aastore         
	//   43   72:dup             
	//   44   73:bipush          7
	//   45   75:ldc2            #836 <String "triggered_event">
	//   46   78:aastore         
	//   47   79:dup             
	//   48   80:bipush          8
	//   49   82:ldc2            #838 <String "triggered_timestamp">
	//   50   85:aastore         
	//   51   86:dup             
	//   52   87:bipush          9
	//   53   89:ldc2            #840 <String "time_to_live">
	//   54   92:aastore         
	//   55   93:dup             
	//   56   94:bipush          10
	//   57   96:ldc2            #842 <String "expired_event">
	//   58   99:aastore         
	//   59  100:ldc2            #674 <String "app_id=? and name=?">
	//   60  103:iconst_2        
	//   61  104:anewarray       String[]
	//   62  107:dup             
	//   63  108:iconst_0        
	//   64  109:aload_1         
	//   65  110:aastore         
	//   66  111:dup             
	//   67  112:iconst_1        
	//   68  113:aload_2         
	//   69  114:aastore         
	//   70  115:aconst_null     
	//   71  116:aconst_null     
	//   72  117:aconst_null     
	//   73  118:invokevirtual   #678 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   74  121:astore          12
		Cursor cursor1;
		boolean flag;
		long l;
		long l1;
		long l2;
		long l3;
		Object obj;
		Object obj1;
		String s3;
		zzag zzag1;
		zzag zzag2;
		zzag zzag3;
		try
		{
			flag = cursor.moveToFirst();
	//   75  123:aload           12
	//   76  125:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   77  130:istore_3        
		}
	//*  78  131:iload_3         
	//*  79  132:ifne            149
	//*  80  135:aload           12
	//*  81  137:ifnull          147
	//*  82  140:aload           12
	//*  83  142:invokeinterface #240 <Method void Cursor.close()>
	//*  84  147:aconst_null     
	//*  85  148:areturn         
	//*  86  149:aload           12
	//*  87  151:iconst_0        
	//*  88  152:invokeinterface #283 <Method String Cursor.getString(int)>
	//*  89  157:astore          14
	//*  90  159:aload           12
	//*  91  161:astore          13
	//*  92  163:aload_0         
	//*  93  164:aload           12
	//*  94  166:iconst_1        
	//*  95  167:invokespecial   #757 <Method Object a(Cursor, int)>
	//*  96  170:astore          15
	//*  97  172:aload           12
	//*  98  174:astore          13
	//*  99  176:aload           12
	//* 100  178:iconst_2        
	//* 101  179:invokeinterface #788 <Method int Cursor.getInt(int)>
	//* 102  184:ifeq            541
	//* 103  187:iconst_1        
	//* 104  188:istore_3        
	//* 105  189:goto            192
	//* 106  192:aload           12
	//* 107  194:astore          13
	//* 108  196:aload           12
	//* 109  198:iconst_3        
	//* 110  199:invokeinterface #283 <Method String Cursor.getString(int)>
	//* 111  204:astore          16
	//* 112  206:aload           12
	//* 113  208:astore          13
	//* 114  210:aload           12
	//* 115  212:iconst_4        
	//* 116  213:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 117  218:lstore          4
	//* 118  220:aload           12
	//* 119  222:astore          13
	//* 120  224:aload_0         
	//* 121  225:invokevirtual   #603 <Method el ec.g()>
	//* 122  228:aload           12
	//* 123  230:iconst_5        
	//* 124  231:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//* 125  236:getstatic       #850 <Field android.os.Parcelable$Creator zzag.CREATOR>
	//* 126  239:invokevirtual   #853 <Method android.os.Parcelable com.google.android.gms.measurement.internal.el.a(byte[], android.os.Parcelable$Creator)>
	//* 127  242:checkcast       #846 <Class zzag>
	//* 128  245:astore          17
	//* 129  247:aload           12
	//* 130  249:astore          13
	//* 131  251:aload           12
	//* 132  253:bipush          6
	//* 133  255:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 134  260:lstore          6
	//* 135  262:aload           12
	//* 136  264:astore          13
	//* 137  266:aload_0         
	//* 138  267:invokevirtual   #603 <Method el ec.g()>
	//* 139  270:aload           12
	//* 140  272:bipush          7
	//* 141  274:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//* 142  279:getstatic       #850 <Field android.os.Parcelable$Creator zzag.CREATOR>
	//* 143  282:invokevirtual   #853 <Method android.os.Parcelable com.google.android.gms.measurement.internal.el.a(byte[], android.os.Parcelable$Creator)>
	//* 144  285:checkcast       #846 <Class zzag>
	//* 145  288:astore          18
	//* 146  290:aload           12
	//* 147  292:astore          13
	//* 148  294:aload           12
	//* 149  296:bipush          8
	//* 150  298:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 151  303:lstore          8
	//* 152  305:aload           12
	//* 153  307:astore          13
	//* 154  309:aload           12
	//* 155  311:bipush          9
	//* 156  313:invokeinterface #237 <Method long Cursor.getLong(int)>
	//* 157  318:lstore          10
	//* 158  320:aload           12
	//* 159  322:astore          13
	//* 160  324:aload_0         
	//* 161  325:invokevirtual   #603 <Method el ec.g()>
	//* 162  328:aload           12
	//* 163  330:bipush          10
	//* 164  332:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//* 165  337:getstatic       #850 <Field android.os.Parcelable$Creator zzag.CREATOR>
	//* 166  340:invokevirtual   #853 <Method android.os.Parcelable com.google.android.gms.measurement.internal.el.a(byte[], android.os.Parcelable$Creator)>
	//* 167  343:checkcast       #846 <Class zzag>
	//* 168  346:astore          19
	//* 169  348:aload           12
	//* 170  350:astore          13
	//* 171  352:new             #855 <Class zzo>
	//* 172  355:dup             
	//* 173  356:aload_1         
	//* 174  357:aload           14
	//* 175  359:new             #857 <Class zzfu>
	//* 176  362:dup             
	//* 177  363:aload_2         
	//* 178  364:lload           8
	//* 179  366:aload           15
	//* 180  368:aload           14
	//* 181  370:invokespecial   #860 <Method void zzfu(String, long, Object, String)>
	//* 182  373:lload           6
	//* 183  375:iload_3         
	//* 184  376:aload           16
	//* 185  378:aload           17
	//* 186  380:lload           4
	//* 187  382:aload           18
	//* 188  384:lload           10
	//* 189  386:aload           19
	//* 190  388:invokespecial   #863 <Method void zzo(String, String, zzfu, long, boolean, String, zzag, long, zzag, long, zzag)>
	//* 191  391:astore          14
	//* 192  393:aload           12
	//* 193  395:astore          13
	//* 194  397:aload           12
	//* 195  399:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//* 196  404:ifeq            436
	//* 197  407:aload           12
	//* 198  409:astore          13
	//* 199  411:aload_0         
	//* 200  412:invokevirtual   #244 <Method s bt.r()>
	//* 201  415:invokevirtual   #250 <Method u s.u_()>
	//* 202  418:ldc2            #1208 <String "Got multiple records for conditional property, expected one">
	//* 203  421:aload_1         
	//* 204  422:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//* 205  425:aload_0         
	//* 206  426:invokevirtual   #702 <Method q bt.o()>
	//* 207  429:aload_2         
	//* 208  430:invokevirtual   #1191 <Method String q.c(String)>
	//* 209  433:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
	//* 210  436:aload           12
	//* 211  438:ifnull          448
	//* 212  441:aload           12
	//* 213  443:invokeinterface #240 <Method void Cursor.close()>
	//* 214  448:aload           14
	//* 215  450:areturn         
	//* 216  451:astore          14
	//* 217  453:goto            477
	//* 218  456:astore_1        
	//* 219  457:goto            527
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
	//* 220  460:astore          14
		{
			break MISSING_BLOCK_LABEL_477;
	//  221  462:goto            477
		}
		if(!flag)
		{
			if(cursor != null)
				cursor.close();
			return null;
		}
		obj = ((Object) (cursor.getString(0)));
		cursor1 = cursor;
		obj1 = a(cursor, 1);
		cursor1 = cursor;
		boolean flag1;
		SQLiteException sqliteexception;
		if(cursor.getInt(2) != 0)
			flag1 = true;
		else
	//* 222  465:astore_1        
	//* 223  466:aconst_null     
	//* 224  467:astore          12
	//* 225  469:goto            527
	//* 226  472:astore          14
	//* 227  474:aconst_null     
	//* 228  475:astore          12
	//* 229  477:aload           12
	//* 230  479:astore          13
	//* 231  481:aload_0         
	//* 232  482:invokevirtual   #244 <Method s bt.r()>
	//* 233  485:invokevirtual   #250 <Method u s.u_()>
	//* 234  488:ldc2            #1210 <String "Error querying conditional property">
	//* 235  491:aload_1         
	//* 236  492:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//* 237  495:aload_0         
	//* 238  496:invokevirtual   #702 <Method q bt.o()>
	//* 239  499:aload_2         
	//* 240  500:invokevirtual   #1191 <Method String q.c(String)>
	//* 241  503:aload           14
	//* 242  505:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
	//* 243  508:aload           12
	//* 244  510:ifnull          520
	//* 245  513:aload           12
	//* 246  515:invokeinterface #240 <Method void Cursor.close()>
	//* 247  520:aconst_null     
	//* 248  521:areturn         
	//* 249  522:astore_1        
	//* 250  523:aload           13
	//* 251  525:astore          12
	//* 252  527:aload           12
	//* 253  529:ifnull          539
	//* 254  532:aload           12
	//* 255  534:invokeinterface #240 <Method void Cursor.close()>
	//* 256  539:aload_1         
	//* 257  540:athrow          
			flag1 = false;
	//  258  541:iconst_0        
	//  259  542:istore_3        
		cursor1 = cursor;
		s3 = cursor.getString(3);
		cursor1 = cursor;
		l = cursor.getLong(4);
		cursor1 = cursor;
		zzag1 = (zzag)((ec)this).g().a(cursor.getBlob(5), zzag.CREATOR);
		cursor1 = cursor;
		l1 = cursor.getLong(6);
		cursor1 = cursor;
		zzag2 = (zzag)((ec)this).g().a(cursor.getBlob(7), zzag.CREATOR);
		cursor1 = cursor;
		l2 = cursor.getLong(8);
		cursor1 = cursor;
		l3 = cursor.getLong(9);
		cursor1 = cursor;
		zzag3 = (zzag)((ec)this).g().a(cursor.getBlob(10), zzag.CREATOR);
		cursor1 = cursor;
		obj = ((Object) (new zzo(s1, ((String) (obj)), new zzfu(s2, l2, obj1, ((String) (obj))), l1, flag1, s3, zzag1, l, zzag2, l3, zzag3)));
		cursor1 = cursor;
		if(!cursor.moveToNext())
			break MISSING_BLOCK_LABEL_436;
		cursor1 = cursor;
		((bt)this).r().u_().a("Got multiple records for conditional property, expected one", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (((bt)this).o().c(s2))));
		if(cursor != null)
			cursor.close();
		return ((zzo) (obj));
		sqliteexception;
		break MISSING_BLOCK_LABEL_477;
		s1;
		break MISSING_BLOCK_LABEL_527;
		s1;
		cursor = null;
		break MISSING_BLOCK_LABEL_527;
		sqliteexception;
		cursor = null;
		cursor1 = cursor;
		((bt)this).r().u_().a("Error querying conditional property", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (((bt)this).o().c(s2))), ((Object) (sqliteexception)));
		if(cursor != null)
			cursor.close();
		return null;
		s1;
		cursor = cursor1;
		if(cursor != null)
			cursor.close();
		throw s1;
	//* 260  543:goto            192
	}

	public final byte[] d(String s1)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		((bt)this).d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method void ed.k()>
		Cursor cursor1 = y().query("apps", new String[] {
			"remote_config"
		}, "app_id=?", new String[] {
			s1
		}, ((String) (null)), ((String) (null)), ((String) (null)));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    9   17:ldc2            #711 <String "apps">
	//   10   20:iconst_1        
	//   11   21:anewarray       String[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:ldc1            #89  <String "remote_config">
	//   15   28:aastore         
	//   16   29:ldc2            #713 <String "app_id=?">
	//   17   32:iconst_1        
	//   18   33:anewarray       String[]
	//   19   36:dup             
	//   20   37:iconst_0        
	//   21   38:aload_1         
	//   22   39:aastore         
	//   23   40:aconst_null     
	//   24   41:aconst_null     
	//   25   42:aconst_null     
	//   26   43:invokevirtual   #678 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   27   46:astore          4
		Cursor cursor = cursor1;
	//   28   48:aload           4
	//   29   50:astore_3        
		boolean flag = cursor1.moveToFirst();
	//   30   51:aload           4
	//   31   53:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   32   58:istore_2        
		if(!flag)
	//*  33   59:iload_2         
	//*  34   60:ifne            77
		{
			if(cursor1 != null)
	//*  35   63:aload           4
	//*  36   65:ifnull          75
				cursor1.close();
	//   37   68:aload           4
	//   38   70:invokeinterface #240 <Method void Cursor.close()>
			return null;
	//   39   75:aconst_null     
	//   40   76:areturn         
		}
		cursor = cursor1;
	//   41   77:aload           4
	//   42   79:astore_3        
		byte abyte0[] = cursor1.getBlob(0);
	//   43   80:aload           4
	//   44   82:iconst_0        
	//   45   83:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//   46   88:astore          5
		cursor = cursor1;
	//   47   90:aload           4
	//   48   92:astore_3        
		if(!cursor1.moveToNext())
			break MISSING_BLOCK_LABEL_123;
	//   49   93:aload           4
	//   50   95:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//   51  100:ifeq            123
		cursor = cursor1;
	//   52  103:aload           4
	//   53  105:astore_3        
		((bt)this).r().u_().a("Got multiple records for app config, expected one. appId", com.google.android.gms.measurement.internal.s.a(s1));
	//   54  106:aload_0         
	//   55  107:invokevirtual   #244 <Method s bt.r()>
	//   56  110:invokevirtual   #250 <Method u s.u_()>
	//   57  113:ldc2            #1213 <String "Got multiple records for app config, expected one. appId">
	//   58  116:aload_1         
	//   59  117:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   60  120:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		if(cursor1 != null)
	//*  61  123:aload           4
	//*  62  125:ifnull          135
			cursor1.close();
	//   63  128:aload           4
	//   64  130:invokeinterface #240 <Method void Cursor.close()>
		return abyte0;
	//   65  135:aload           5
	//   66  137:areturn         
		SQLiteException sqliteexception;
		sqliteexception;
	//   67  138:astore          5
		break MISSING_BLOCK_LABEL_154;
	//   68  140:goto            154
		s1;
	//   69  143:astore_1        
		cursor = null;
	//   70  144:aconst_null     
	//   71  145:astore_3        
		break MISSING_BLOCK_LABEL_191;
	//   72  146:goto            191
		sqliteexception;
	//   73  149:astore          5
		cursor1 = null;
	//   74  151:aconst_null     
	//   75  152:astore          4
		cursor = cursor1;
	//   76  154:aload           4
	//   77  156:astore_3        
		((bt)this).r().u_().a("Error querying remote config. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (sqliteexception)));
	//   78  157:aload_0         
	//   79  158:invokevirtual   #244 <Method s bt.r()>
	//   80  161:invokevirtual   #250 <Method u s.u_()>
	//   81  164:ldc2            #1215 <String "Error querying remote config. appId">
	//   82  167:aload_1         
	//   83  168:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   84  171:aload           5
	//   85  173:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		if(cursor1 != null)
	//*  86  176:aload           4
	//*  87  178:ifnull          188
			cursor1.close();
	//   88  181:aload           4
	//   89  183:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//   90  188:aconst_null     
	//   91  189:areturn         
		s1;
	//   92  190:astore_1        
		if(cursor != null)
	//*  93  191:aload_3         
	//*  94  192:ifnull          201
			cursor.close();
	//   95  195:aload_3         
	//   96  196:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//   97  201:aload_1         
	//   98  202:athrow          
	}

	public final int e(String s1, String s2)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		am.a(s2);
	//    3    5:aload_2         
	//    4    6:invokestatic    #305 <Method String am.a(String)>
	//    5    9:pop             
		((bt)this).d();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #332 <Method void ed.k()>
		int j;
		try
		{
			j = y().delete("conditional_properties", "app_id=? and name=?", new String[] {
				s1, s2
			});
	//   10   18:aload_0         
	//   11   19:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   12   22:ldc2            #824 <String "conditional_properties">
	//   13   25:ldc2            #674 <String "app_id=? and name=?">
	//   14   28:iconst_2        
	//   15   29:anewarray       String[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:aload_1         
	//   19   35:aastore         
	//   20   36:dup             
	//   21   37:iconst_1        
	//   22   38:aload_2         
	//   23   39:aastore         
	//   24   40:invokevirtual   #511 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   25   43:istore_3        
		}
	//*  26   44:iload_3         
	//*  27   45:ireturn         
		catch(SQLiteException sqliteexception)
	//*  28   46:astore          4
		{
			((bt)this).r().u_().a("Error deleting conditional property", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (((bt)this).o().c(s2))), ((Object) (sqliteexception)));
	//   29   48:aload_0         
	//   30   49:invokevirtual   #244 <Method s bt.r()>
	//   31   52:invokevirtual   #250 <Method u s.u_()>
	//   32   55:ldc2            #1218 <String "Error deleting conditional property">
	//   33   58:aload_1         
	//   34   59:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   35   62:aload_0         
	//   36   63:invokevirtual   #702 <Method q bt.o()>
	//   37   66:aload_2         
	//   38   67:invokevirtual   #1191 <Method String q.c(String)>
	//   39   70:aload           4
	//   40   72:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
			return 0;
	//   41   75:iconst_0        
	//   42   76:ireturn         
		}
		return j;
	}

	final Map e(String s1)
	{
		Object obj;
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method void ed.k()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #334 <Method void bt.d()>
		am.a(s1);
	//    4    8:aload_1         
	//    5    9:invokestatic    #305 <Method String am.a(String)>
	//    6   12:pop             
		obj = ((Object) (y()));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    9   17:astore          4
		Cursor cursor = ((SQLiteDatabase) (obj)).query("audience_filter_values", new String[] {
			"audience_id", "current_results"
		}, "app_id=?", new String[] {
			s1
		}, ((String) (null)), ((String) (null)), ((String) (null)));
	//   10   19:aload           4
	//   11   21:ldc2            #507 <String "audience_filter_values">
	//   12   24:iconst_2        
	//   13   25:anewarray       String[]
	//   14   28:dup             
	//   15   29:iconst_0        
	//   16   30:ldc2            #382 <String "audience_id">
	//   17   33:aastore         
	//   18   34:dup             
	//   19   35:iconst_1        
	//   20   36:ldc2            #1221 <String "current_results">
	//   21   39:aastore         
	//   22   40:ldc2            #713 <String "app_id=?">
	//   23   43:iconst_1        
	//   24   44:anewarray       String[]
	//   25   47:dup             
	//   26   48:iconst_0        
	//   27   49:aload_1         
	//   28   50:aastore         
	//   29   51:aconst_null     
	//   30   52:aconst_null     
	//   31   53:aconst_null     
	//   32   54:invokevirtual   #678 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   33   57:astore          5
		obj = ((Object) (cursor));
	//   34   59:aload           5
	//   35   61:astore          4
		boolean flag = cursor.moveToFirst();
	//   36   63:aload           5
	//   37   65:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   38   70:istore_3        
		if(!flag)
	//*  39   71:iload_3         
	//*  40   72:ifne            89
		{
			if(cursor != null)
	//*  41   75:aload           5
	//*  42   77:ifnull          87
				cursor.close();
	//   43   80:aload           5
	//   44   82:invokeinterface #240 <Method void Cursor.close()>
			return null;
	//   45   87:aconst_null     
	//   46   88:areturn         
		}
		obj = ((Object) (cursor));
	//   47   89:aload           5
	//   48   91:astore          4
		a a1 = new a();
	//   49   93:new             #1223 <Class a>
	//   50   96:dup             
	//   51   97:invokespecial   #1224 <Method void a()>
	//   52  100:astore          6
_L2:
		obj = ((Object) (cursor));
	//   53  102:aload           5
	//   54  104:astore          4
		int j = cursor.getInt(0);
	//   55  106:aload           5
	//   56  108:iconst_0        
	//   57  109:invokeinterface #788 <Method int Cursor.getInt(int)>
	//   58  114:istore_2        
		obj = ((Object) (cursor));
	//   59  115:aload           5
	//   60  117:astore          4
		byte abyte0[] = cursor.getBlob(1);
	//   61  119:aload           5
	//   62  121:iconst_1        
	//   63  122:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//   64  127:astore          7
		obj = ((Object) (cursor));
	//   65  129:aload           5
	//   66  131:astore          4
		ip ip1 = ip.a(abyte0, 0, abyte0.length);
	//   67  133:aload           7
	//   68  135:iconst_0        
	//   69  136:aload           7
	//   70  138:arraylength     
	//   71  139:invokestatic    #647 <Method ip ip.a(byte[], int, int)>
	//   72  142:astore          7
		obj = ((Object) (cursor));
	//   73  144:aload           5
	//   74  146:astore          4
		br br1 = new br();
	//   75  148:new             #1226 <Class br>
	//   76  151:dup             
	//   77  152:invokespecial   #1227 <Method void br()>
	//   78  155:astore          8
		obj = ((Object) (cursor));
	//   79  157:aload           5
	//   80  159:astore          4
		((iy) (br1)).a(ip1);
	//   81  161:aload           8
	//   82  163:aload           7
	//   83  165:invokevirtual   #653 <Method iy iy.a(ip)>
	//   84  168:pop             
		obj = ((Object) (cursor));
	//   85  169:aload           5
	//   86  171:astore          4
		((Map) (a1)).put(((Object) (Integer.valueOf(j))), ((Object) (br1)));
	//   87  173:aload           6
	//   88  175:iload_2         
	//   89  176:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   90  179:aload           8
	//   91  181:invokeinterface #1232 <Method Object Map.put(Object, Object)>
	//   92  186:pop             
		break MISSING_BLOCK_LABEL_219;
	//   93  187:goto            219
		IOException ioexception;
		ioexception;
	//   94  190:astore          7
		obj = ((Object) (cursor));
	//   95  192:aload           5
	//   96  194:astore          4
		((bt)this).r().u_().a("Failed to merge filter results. appId, audienceId, error", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (Integer.valueOf(j))), ((Object) (ioexception)));
	//   97  196:aload_0         
	//   98  197:invokevirtual   #244 <Method s bt.r()>
	//   99  200:invokevirtual   #250 <Method u s.u_()>
	//  100  203:ldc2            #1234 <String "Failed to merge filter results. appId, audienceId, error">
	//  101  206:aload_1         
	//  102  207:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  103  210:iload_2         
	//  104  211:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//  105  214:aload           7
	//  106  216:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
		obj = ((Object) (cursor));
	//  107  219:aload           5
	//  108  221:astore          4
		flag = cursor.moveToNext();
	//  109  223:aload           5
	//  110  225:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//  111  230:istore_3        
		if(!flag)
	//* 112  231:iload_3         
	//* 113  232:ifne            102
		{
			if(cursor != null)
	//* 114  235:aload           5
	//* 115  237:ifnull          247
				cursor.close();
	//  116  240:aload           5
	//  117  242:invokeinterface #240 <Method void Cursor.close()>
			return ((Map) (a1));
	//  118  247:aload           6
	//  119  249:areturn         
		}
		if(true) goto _L2; else goto _L1
_L1:
		SQLiteException sqliteexception;
		sqliteexception;
	//  120  250:astore          6
		break MISSING_BLOCK_LABEL_267;
	//  121  252:goto            267
		s1;
	//  122  255:astore_1        
		obj = null;
	//  123  256:aconst_null     
	//  124  257:astore          4
		break MISSING_BLOCK_LABEL_305;
	//  125  259:goto            305
		sqliteexception;
	//  126  262:astore          6
		cursor = null;
	//  127  264:aconst_null     
	//  128  265:astore          5
		obj = ((Object) (cursor));
	//  129  267:aload           5
	//  130  269:astore          4
		((bt)this).r().u_().a("Database error querying filter results. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (sqliteexception)));
	//  131  271:aload_0         
	//  132  272:invokevirtual   #244 <Method s bt.r()>
	//  133  275:invokevirtual   #250 <Method u s.u_()>
	//  134  278:ldc2            #1236 <String "Database error querying filter results. appId">
	//  135  281:aload_1         
	//  136  282:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  137  285:aload           6
	//  138  287:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		if(cursor != null)
	//* 139  290:aload           5
	//* 140  292:ifnull          302
			cursor.close();
	//  141  295:aload           5
	//  142  297:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//  143  302:aconst_null     
	//  144  303:areturn         
		s1;
	//  145  304:astore_1        
		if(obj != null)
	//* 146  305:aload           4
	//* 147  307:ifnull          317
			((Cursor) (obj)).close();
	//  148  310:aload           4
	//  149  312:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  150  317:aload_1         
	//  151  318:athrow          
	}

	protected final boolean e()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final long f(String s1)
	{
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] {
			s1
		}, 0L);
	//    3    5:aload_0         
	//    4    6:ldc2            #1238 <String "select count(1) from events where app_id=? and name not like '!_%' escape '!'">
	//    5    9:iconst_1        
	//    6   10:anewarray       String[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_1         
	//   10   16:aastore         
	//   11   17:lconst_0        
	//   12   18:invokespecial   #579 <Method long a(String, String[], long)>
	//   13   21:lreturn         
	}

	final Map f(String s1, String s2)
	{
		Object obj;
		a a1;
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method void ed.k()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #334 <Method void bt.d()>
		am.a(s1);
	//    4    8:aload_1         
	//    5    9:invokestatic    #305 <Method String am.a(String)>
	//    6   12:pop             
		am.a(s2);
	//    7   13:aload_2         
	//    8   14:invokestatic    #305 <Method String am.a(String)>
	//    9   17:pop             
		a1 = new a();
	//   10   18:new             #1223 <Class a>
	//   11   21:dup             
	//   12   22:invokespecial   #1224 <Method void a()>
	//   13   25:astore          8
		obj = ((Object) (y()));
	//   14   27:aload_0         
	//   15   28:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   16   31:astore          5
		obj = ((Object) (((SQLiteDatabase) (obj)).query("event_filters", new String[] {
			"audience_id", "data"
		}, "app_id=? AND event_name=?", new String[] {
			s1, s2
		}, ((String) (null)), ((String) (null)), ((String) (null)))));
	//   17   33:aload           5
	//   18   35:ldc2            #396 <String "event_filters">
	//   19   38:iconst_2        
	//   20   39:anewarray       String[]
	//   21   42:dup             
	//   22   43:iconst_0        
	//   23   44:ldc2            #382 <String "audience_id">
	//   24   47:aastore         
	//   25   48:dup             
	//   26   49:iconst_1        
	//   27   50:ldc2            #391 <String "data">
	//   28   53:aastore         
	//   29   54:ldc2            #1241 <String "app_id=? AND event_name=?">
	//   30   57:iconst_2        
	//   31   58:anewarray       String[]
	//   32   61:dup             
	//   33   62:iconst_0        
	//   34   63:aload_1         
	//   35   64:aastore         
	//   36   65:dup             
	//   37   66:iconst_1        
	//   38   67:aload_2         
	//   39   68:aastore         
	//   40   69:aconst_null     
	//   41   70:aconst_null     
	//   42   71:aconst_null     
	//   43   72:invokevirtual   #678 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   44   75:astore          5
		s2 = ((String) (obj));
	//   45   77:aload           5
	//   46   79:astore_2        
		if(((Cursor) (obj)).moveToFirst())
			break MISSING_BLOCK_LABEL_113;
	//   47   80:aload           5
	//   48   82:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   49   87:ifne            113
		s2 = ((String) (obj));
	//   50   90:aload           5
	//   51   92:astore_2        
		Object obj1 = ((Object) (Collections.emptyMap()));
	//   52   93:invokestatic    #1245 <Method Map Collections.emptyMap()>
	//   53   96:astore          6
		if(obj != null)
	//*  54   98:aload           5
	//*  55  100:ifnull          110
			((Cursor) (obj)).close();
	//   56  103:aload           5
	//   57  105:invokeinterface #240 <Method void Cursor.close()>
		return ((Map) (obj1));
	//   58  110:aload           6
	//   59  112:areturn         
_L2:
		s2 = ((String) (obj));
	//   60  113:aload           5
	//   61  115:astore_2        
		byte abyte0[] = ((Cursor) (obj)).getBlob(1);
	//   62  116:aload           5
	//   63  118:iconst_1        
	//   64  119:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//   65  124:astore          6
		s2 = ((String) (obj));
	//   66  126:aload           5
	//   67  128:astore_2        
		abyte0 = ((byte []) (ip.a(abyte0, 0, abyte0.length)));
	//   68  129:aload           6
	//   69  131:iconst_0        
	//   70  132:aload           6
	//   71  134:arraylength     
	//   72  135:invokestatic    #647 <Method ip ip.a(byte[], int, int)>
	//   73  138:astore          6
		s2 = ((String) (obj));
	//   74  140:aload           5
	//   75  142:astore_2        
		bd bd1 = new bd();
	//   76  143:new             #336 <Class bd>
	//   77  146:dup             
	//   78  147:invokespecial   #1246 <Method void bd()>
	//   79  150:astore          9
		s2 = ((String) (obj));
	//   80  152:aload           5
	//   81  154:astore_2        
		((iy) (bd1)).a(((ip) (abyte0)));
	//   82  155:aload           9
	//   83  157:aload           6
	//   84  159:invokevirtual   #653 <Method iy iy.a(ip)>
	//   85  162:pop             
		s2 = ((String) (obj));
	//   86  163:aload           5
	//   87  165:astore_2        
		int j = ((Cursor) (obj)).getInt(0);
	//   88  166:aload           5
	//   89  168:iconst_0        
	//   90  169:invokeinterface #788 <Method int Cursor.getInt(int)>
	//   91  174:istore_3        
		s2 = ((String) (obj));
	//   92  175:aload           5
	//   93  177:astore_2        
		List list = (List)((Map) (a1)).get(((Object) (Integer.valueOf(j))));
	//   94  178:aload           8
	//   95  180:iload_3         
	//   96  181:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   97  184:invokeinterface #1248 <Method Object Map.get(Object)>
	//   98  189:checkcast       #459 <Class List>
	//   99  192:astore          7
		abyte0 = ((byte []) (list));
	//  100  194:aload           7
	//  101  196:astore          6
		if(list != null)
			break MISSING_BLOCK_LABEL_232;
	//  102  198:aload           7
	//  103  200:ifnonnull       232
		s2 = ((String) (obj));
	//  104  203:aload           5
	//  105  205:astore_2        
		abyte0 = ((byte []) (new ArrayList()));
	//  106  206:new             #456 <Class ArrayList>
	//  107  209:dup             
	//  108  210:invokespecial   #457 <Method void ArrayList()>
	//  109  213:astore          6
		s2 = ((String) (obj));
	//  110  215:aload           5
	//  111  217:astore_2        
		((Map) (a1)).put(((Object) (Integer.valueOf(j))), ((Object) (abyte0)));
	//  112  218:aload           8
	//  113  220:iload_3         
	//  114  221:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//  115  224:aload           6
	//  116  226:invokeinterface #1232 <Method Object Map.put(Object, Object)>
	//  117  231:pop             
		s2 = ((String) (obj));
	//  118  232:aload           5
	//  119  234:astore_2        
		((List) (abyte0)).add(((Object) (bd1)));
	//  120  235:aload           6
	//  121  237:aload           9
	//  122  239:invokeinterface #476 <Method boolean List.add(Object)>
	//  123  244:pop             
		break MISSING_BLOCK_LABEL_272;
	//  124  245:goto            272
		Object obj2;
		obj2;
	//  125  248:astore          6
		s2 = ((String) (obj));
	//  126  250:aload           5
	//  127  252:astore_2        
		((bt)this).r().u_().a("Failed to merge filter. appId", com.google.android.gms.measurement.internal.s.a(s1), obj2);
	//  128  253:aload_0         
	//  129  254:invokevirtual   #244 <Method s bt.r()>
	//  130  257:invokevirtual   #250 <Method u s.u_()>
	//  131  260:ldc2            #1250 <String "Failed to merge filter. appId">
	//  132  263:aload_1         
	//  133  264:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  134  267:aload           6
	//  135  269:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		s2 = ((String) (obj));
	//  136  272:aload           5
	//  137  274:astore_2        
		boolean flag = ((Cursor) (obj)).moveToNext();
	//  138  275:aload           5
	//  139  277:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//  140  282:istore          4
		if(!flag)
	//* 141  284:iload           4
	//* 142  286:ifne            113
		{
			if(obj != null)
	//* 143  289:aload           5
	//* 144  291:ifnull          301
				((Cursor) (obj)).close();
	//  145  294:aload           5
	//  146  296:invokeinterface #240 <Method void Cursor.close()>
			return ((Map) (a1));
	//  147  301:aload           8
	//  148  303:areturn         
		}
		if(true) goto _L2; else goto _L1
_L1:
		obj2;
	//  149  304:astore          6
		break MISSING_BLOCK_LABEL_320;
	//  150  306:goto            320
		s1;
	//  151  309:astore_1        
		s2 = null;
	//  152  310:aconst_null     
	//  153  311:astore_2        
		break MISSING_BLOCK_LABEL_357;
	//  154  312:goto            357
		obj2;
	//  155  315:astore          6
		obj = null;
	//  156  317:aconst_null     
	//  157  318:astore          5
		s2 = ((String) (obj));
	//  158  320:aload           5
	//  159  322:astore_2        
		((bt)this).r().u_().a("Database error querying filters. appId", com.google.android.gms.measurement.internal.s.a(s1), obj2);
	//  160  323:aload_0         
	//  161  324:invokevirtual   #244 <Method s bt.r()>
	//  162  327:invokevirtual   #250 <Method u s.u_()>
	//  163  330:ldc2            #513 <String "Database error querying filters. appId">
	//  164  333:aload_1         
	//  165  334:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  166  337:aload           6
	//  167  339:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		if(obj != null)
	//* 168  342:aload           5
	//* 169  344:ifnull          354
			((Cursor) (obj)).close();
	//  170  347:aload           5
	//  171  349:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//  172  354:aconst_null     
	//  173  355:areturn         
		s1;
	//  174  356:astore_1        
		if(s2 != null)
	//* 175  357:aload_2         
	//* 176  358:ifnull          367
			((Cursor) (s2)).close();
	//  177  361:aload_2         
	//  178  362:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  179  367:aload_1         
	//  180  368:athrow          
	}

	public final void f()
	{
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method void ed.k()>
		y().beginTransaction();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    4    8:invokevirtual   #977 <Method void SQLiteDatabase.beginTransaction()>
	//    5   11:return          
	}

	final Map g(String s1, String s2)
	{
		Object obj;
		a a1;
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method void ed.k()>
		((bt)this).d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #334 <Method void bt.d()>
		am.a(s1);
	//    4    8:aload_1         
	//    5    9:invokestatic    #305 <Method String am.a(String)>
	//    6   12:pop             
		am.a(s2);
	//    7   13:aload_2         
	//    8   14:invokestatic    #305 <Method String am.a(String)>
	//    9   17:pop             
		a1 = new a();
	//   10   18:new             #1223 <Class a>
	//   11   21:dup             
	//   12   22:invokespecial   #1224 <Method void a()>
	//   13   25:astore          8
		obj = ((Object) (y()));
	//   14   27:aload_0         
	//   15   28:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   16   31:astore          5
		obj = ((Object) (((SQLiteDatabase) (obj)).query("property_filters", new String[] {
			"audience_id", "data"
		}, "app_id=? AND property_name=?", new String[] {
			s1, s2
		}, ((String) (null)), ((String) (null)), ((String) (null)))));
	//   17   33:aload           5
	//   18   35:ldc2            #419 <String "property_filters">
	//   19   38:iconst_2        
	//   20   39:anewarray       String[]
	//   21   42:dup             
	//   22   43:iconst_0        
	//   23   44:ldc2            #382 <String "audience_id">
	//   24   47:aastore         
	//   25   48:dup             
	//   26   49:iconst_1        
	//   27   50:ldc2            #391 <String "data">
	//   28   53:aastore         
	//   29   54:ldc2            #1252 <String "app_id=? AND property_name=?">
	//   30   57:iconst_2        
	//   31   58:anewarray       String[]
	//   32   61:dup             
	//   33   62:iconst_0        
	//   34   63:aload_1         
	//   35   64:aastore         
	//   36   65:dup             
	//   37   66:iconst_1        
	//   38   67:aload_2         
	//   39   68:aastore         
	//   40   69:aconst_null     
	//   41   70:aconst_null     
	//   42   71:aconst_null     
	//   43   72:invokevirtual   #678 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   44   75:astore          5
		s2 = ((String) (obj));
	//   45   77:aload           5
	//   46   79:astore_2        
		if(((Cursor) (obj)).moveToFirst())
			break MISSING_BLOCK_LABEL_113;
	//   47   80:aload           5
	//   48   82:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   49   87:ifne            113
		s2 = ((String) (obj));
	//   50   90:aload           5
	//   51   92:astore_2        
		Object obj1 = ((Object) (Collections.emptyMap()));
	//   52   93:invokestatic    #1245 <Method Map Collections.emptyMap()>
	//   53   96:astore          6
		if(obj != null)
	//*  54   98:aload           5
	//*  55  100:ifnull          110
			((Cursor) (obj)).close();
	//   56  103:aload           5
	//   57  105:invokeinterface #240 <Method void Cursor.close()>
		return ((Map) (obj1));
	//   58  110:aload           6
	//   59  112:areturn         
_L2:
		s2 = ((String) (obj));
	//   60  113:aload           5
	//   61  115:astore_2        
		byte abyte0[] = ((Cursor) (obj)).getBlob(1);
	//   62  116:aload           5
	//   63  118:iconst_1        
	//   64  119:invokeinterface #642 <Method byte[] Cursor.getBlob(int)>
	//   65  124:astore          6
		s2 = ((String) (obj));
	//   66  126:aload           5
	//   67  128:astore_2        
		abyte0 = ((byte []) (ip.a(abyte0, 0, abyte0.length)));
	//   68  129:aload           6
	//   69  131:iconst_0        
	//   70  132:aload           6
	//   71  134:arraylength     
	//   72  135:invokestatic    #647 <Method ip ip.a(byte[], int, int)>
	//   73  138:astore          6
		s2 = ((String) (obj));
	//   74  140:aload           5
	//   75  142:astore_2        
		bg bg1 = new bg();
	//   76  143:new             #411 <Class bg>
	//   77  146:dup             
	//   78  147:invokespecial   #1253 <Method void bg()>
	//   79  150:astore          9
		s2 = ((String) (obj));
	//   80  152:aload           5
	//   81  154:astore_2        
		((iy) (bg1)).a(((ip) (abyte0)));
	//   82  155:aload           9
	//   83  157:aload           6
	//   84  159:invokevirtual   #653 <Method iy iy.a(ip)>
	//   85  162:pop             
		s2 = ((String) (obj));
	//   86  163:aload           5
	//   87  165:astore_2        
		int j = ((Cursor) (obj)).getInt(0);
	//   88  166:aload           5
	//   89  168:iconst_0        
	//   90  169:invokeinterface #788 <Method int Cursor.getInt(int)>
	//   91  174:istore_3        
		s2 = ((String) (obj));
	//   92  175:aload           5
	//   93  177:astore_2        
		List list = (List)((Map) (a1)).get(((Object) (Integer.valueOf(j))));
	//   94  178:aload           8
	//   95  180:iload_3         
	//   96  181:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   97  184:invokeinterface #1248 <Method Object Map.get(Object)>
	//   98  189:checkcast       #459 <Class List>
	//   99  192:astore          7
		abyte0 = ((byte []) (list));
	//  100  194:aload           7
	//  101  196:astore          6
		if(list != null)
			break MISSING_BLOCK_LABEL_232;
	//  102  198:aload           7
	//  103  200:ifnonnull       232
		s2 = ((String) (obj));
	//  104  203:aload           5
	//  105  205:astore_2        
		abyte0 = ((byte []) (new ArrayList()));
	//  106  206:new             #456 <Class ArrayList>
	//  107  209:dup             
	//  108  210:invokespecial   #457 <Method void ArrayList()>
	//  109  213:astore          6
		s2 = ((String) (obj));
	//  110  215:aload           5
	//  111  217:astore_2        
		((Map) (a1)).put(((Object) (Integer.valueOf(j))), ((Object) (abyte0)));
	//  112  218:aload           8
	//  113  220:iload_3         
	//  114  221:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//  115  224:aload           6
	//  116  226:invokeinterface #1232 <Method Object Map.put(Object, Object)>
	//  117  231:pop             
		s2 = ((String) (obj));
	//  118  232:aload           5
	//  119  234:astore_2        
		((List) (abyte0)).add(((Object) (bg1)));
	//  120  235:aload           6
	//  121  237:aload           9
	//  122  239:invokeinterface #476 <Method boolean List.add(Object)>
	//  123  244:pop             
		break MISSING_BLOCK_LABEL_272;
	//  124  245:goto            272
		Object obj2;
		obj2;
	//  125  248:astore          6
		s2 = ((String) (obj));
	//  126  250:aload           5
	//  127  252:astore_2        
		((bt)this).r().u_().a("Failed to merge filter", com.google.android.gms.measurement.internal.s.a(s1), obj2);
	//  128  253:aload_0         
	//  129  254:invokevirtual   #244 <Method s bt.r()>
	//  130  257:invokevirtual   #250 <Method u s.u_()>
	//  131  260:ldc2            #1255 <String "Failed to merge filter">
	//  132  263:aload_1         
	//  133  264:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  134  267:aload           6
	//  135  269:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		s2 = ((String) (obj));
	//  136  272:aload           5
	//  137  274:astore_2        
		boolean flag = ((Cursor) (obj)).moveToNext();
	//  138  275:aload           5
	//  139  277:invokeinterface #695 <Method boolean Cursor.moveToNext()>
	//  140  282:istore          4
		if(!flag)
	//* 141  284:iload           4
	//* 142  286:ifne            113
		{
			if(obj != null)
	//* 143  289:aload           5
	//* 144  291:ifnull          301
				((Cursor) (obj)).close();
	//  145  294:aload           5
	//  146  296:invokeinterface #240 <Method void Cursor.close()>
			return ((Map) (a1));
	//  147  301:aload           8
	//  148  303:areturn         
		}
		if(true) goto _L2; else goto _L1
_L1:
		obj2;
	//  149  304:astore          6
		break MISSING_BLOCK_LABEL_320;
	//  150  306:goto            320
		s1;
	//  151  309:astore_1        
		s2 = null;
	//  152  310:aconst_null     
	//  153  311:astore_2        
		break MISSING_BLOCK_LABEL_357;
	//  154  312:goto            357
		obj2;
	//  155  315:astore          6
		obj = null;
	//  156  317:aconst_null     
	//  157  318:astore          5
		s2 = ((String) (obj));
	//  158  320:aload           5
	//  159  322:astore_2        
		((bt)this).r().u_().a("Database error querying filters. appId", com.google.android.gms.measurement.internal.s.a(s1), obj2);
	//  160  323:aload_0         
	//  161  324:invokevirtual   #244 <Method s bt.r()>
	//  162  327:invokevirtual   #250 <Method u s.u_()>
	//  163  330:ldc2            #513 <String "Database error querying filters. appId">
	//  164  333:aload_1         
	//  165  334:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  166  337:aload           6
	//  167  339:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		if(obj != null)
	//* 168  342:aload           5
	//* 169  344:ifnull          354
			((Cursor) (obj)).close();
	//  170  347:aload           5
	//  171  349:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//  172  354:aconst_null     
	//  173  355:areturn         
		s1;
	//  174  356:astore_1        
		if(s2 != null)
	//* 175  357:aload_2         
	//* 176  358:ifnull          367
			((Cursor) (s2)).close();
	//  177  361:aload_2         
	//  178  362:invokeinterface #240 <Method void Cursor.close()>
		throw s1;
	//  179  367:aload_1         
	//  180  368:athrow          
	}

	protected final long h(String s1, String s2)
	{
		SQLiteDatabase sqlitedatabase;
		am.a(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #305 <Method String am.a(String)>
	//    2    4:pop             
		am.a(s2);
	//    3    5:aload_2         
	//    4    6:invokestatic    #305 <Method String am.a(String)>
	//    5    9:pop             
		((bt)this).d();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #334 <Method void bt.d()>
		((ed)this).k();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #332 <Method void ed.k()>
		sqlitedatabase = y();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #222 <Method SQLiteDatabase y()>
	//   12   22:astore          8
		sqlitedatabase.beginTransaction();
	//   13   24:aload           8
	//   14   26:invokevirtual   #977 <Method void SQLiteDatabase.beginTransaction()>
		long l1;
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s2))).length() + 32);
	//   15   29:new             #484 <Class StringBuilder>
	//   16   32:dup             
	//   17   33:aload_2         
	//   18   34:invokestatic    #358 <Method String String.valueOf(Object)>
	//   19   37:invokevirtual   #487 <Method int String.length()>
	//   20   40:bipush          32
	//   21   42:iadd            
	//   22   43:invokespecial   #490 <Method void StringBuilder(int)>
	//   23   46:astore          7
		stringbuilder.append("select ");
	//   24   48:aload           7
	//   25   50:ldc2            #1258 <String "select ">
	//   26   53:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
		stringbuilder.append(s2);
	//   28   57:aload           7
	//   29   59:aload_2         
	//   30   60:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
		stringbuilder.append(" from app2 where app_id=?");
	//   32   64:aload           7
	//   33   66:ldc2            #1260 <String " from app2 where app_id=?">
	//   34   69:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
		l1 = a(stringbuilder.toString(), new String[] {
			s1
		}, -1L);
	//   36   73:aload_0         
	//   37   74:aload           7
	//   38   76:invokevirtual   #501 <Method String StringBuilder.toString()>
	//   39   79:iconst_1        
	//   40   80:anewarray       String[]
	//   41   83:dup             
	//   42   84:iconst_0        
	//   43   85:aload_1         
	//   44   86:aastore         
	//   45   87:ldc2w           #401 <Long -1L>
	//   46   90:invokespecial   #579 <Method long a(String, String[], long)>
	//   47   93:lstore          5
		long l;
		l = l1;
	//   48   95:lload           5
	//   49   97:lstore_3        
		if(l1 != -1L)
			break MISSING_BLOCK_LABEL_196;
	//   50   98:lload           5
	//   51  100:ldc2w           #401 <Long -1L>
	//   52  103:lcmp            
	//   53  104:ifne            196
		ContentValues contentvalues = new ContentValues();
	//   54  107:new             #310 <Class ContentValues>
	//   55  110:dup             
	//   56  111:invokespecial   #378 <Method void ContentValues()>
	//   57  114:astore          7
		contentvalues.put("app_id", s1);
	//   58  116:aload           7
	//   59  118:ldc2            #380 <String "app_id">
	//   60  121:aload_1         
	//   61  122:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues.put("first_open_count", Integer.valueOf(0));
	//   62  125:aload           7
	//   63  127:ldc2            #1262 <String "first_open_count">
	//   64  130:iconst_0        
	//   65  131:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   66  134:invokevirtual   #385 <Method void ContentValues.put(String, Integer)>
		contentvalues.put("previous_install_count", Integer.valueOf(0));
	//   67  137:aload           7
	//   68  139:ldc1            #159 <String "previous_install_count">
	//   69  141:iconst_0        
	//   70  142:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//   71  145:invokevirtual   #385 <Method void ContentValues.put(String, Integer)>
		if(sqlitedatabase.insertWithOnConflict("app2", ((String) (null)), contentvalues, 5) != -1L)
			break MISSING_BLOCK_LABEL_194;
	//   72  148:aload           8
	//   73  150:ldc2            #1264 <String "app2">
	//   74  153:aconst_null     
	//   75  154:aload           7
	//   76  156:iconst_5        
	//   77  157:invokevirtual   #400 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//   78  160:ldc2w           #401 <Long -1L>
	//   79  163:lcmp            
	//   80  164:ifne            194
		((bt)this).r().u_().a("Failed to insert column (got -1). appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (s2)));
	//   81  167:aload_0         
	//   82  168:invokevirtual   #244 <Method s bt.r()>
	//   83  171:invokevirtual   #250 <Method u s.u_()>
	//   84  174:ldc2            #1266 <String "Failed to insert column (got -1). appId">
	//   85  177:aload_1         
	//   86  178:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//   87  181:aload_2         
	//   88  182:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		sqlitedatabase.endTransaction();
	//   89  185:aload           8
	//   90  187:invokevirtual   #1006 <Method void SQLiteDatabase.endTransaction()>
		return -1L;
	//   91  190:ldc2w           #401 <Long -1L>
	//   92  193:lreturn         
		l = 0L;
	//   93  194:lconst_0        
	//   94  195:lstore_3        
		ContentValues contentvalues1 = new ContentValues();
	//   95  196:new             #310 <Class ContentValues>
	//   96  199:dup             
	//   97  200:invokespecial   #378 <Method void ContentValues()>
	//   98  203:astore          7
		contentvalues1.put("app_id", s1);
	//   99  205:aload           7
	//  100  207:ldc2            #380 <String "app_id">
	//  101  210:aload_1         
	//  102  211:invokevirtual   #314 <Method void ContentValues.put(String, String)>
		contentvalues1.put(s2, Long.valueOf(1L + l));
	//  103  214:aload           7
	//  104  216:aload_2         
	//  105  217:lconst_1        
	//  106  218:lload_3         
	//  107  219:ladd            
	//  108  220:invokestatic    #297 <Method Long Long.valueOf(long)>
	//  109  223:invokevirtual   #317 <Method void ContentValues.put(String, Long)>
		if((long)sqlitedatabase.update("app2", contentvalues1, "app_id = ?", new String[] {
	s1
}) != 0L)
			break MISSING_BLOCK_LABEL_280;
	//  110  226:aload           8
	//  111  228:ldc2            #1264 <String "app2">
	//  112  231:aload           7
	//  113  233:ldc2            #969 <String "app_id = ?">
	//  114  236:iconst_1        
	//  115  237:anewarray       String[]
	//  116  240:dup             
	//  117  241:iconst_0        
	//  118  242:aload_1         
	//  119  243:aastore         
	//  120  244:invokevirtual   #729 <Method int SQLiteDatabase.update(String, ContentValues, String, String[])>
	//  121  247:i2l             
	//  122  248:lconst_0        
	//  123  249:lcmp            
	//  124  250:ifne            280
		((bt)this).r().u_().a("Failed to update column (got 0). appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (s2)));
	//  125  253:aload_0         
	//  126  254:invokevirtual   #244 <Method s bt.r()>
	//  127  257:invokevirtual   #250 <Method u s.u_()>
	//  128  260:ldc2            #1268 <String "Failed to update column (got 0). appId">
	//  129  263:aload_1         
	//  130  264:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  131  267:aload_2         
	//  132  268:invokevirtual   #257 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object)>
		sqlitedatabase.endTransaction();
	//  133  271:aload           8
	//  134  273:invokevirtual   #1006 <Method void SQLiteDatabase.endTransaction()>
		return -1L;
	//  135  276:ldc2w           #401 <Long -1L>
	//  136  279:lreturn         
		sqlitedatabase.setTransactionSuccessful();
	//  137  280:aload           8
	//  138  282:invokevirtual   #1003 <Method void SQLiteDatabase.setTransactionSuccessful()>
		sqlitedatabase.endTransaction();
	//  139  285:aload           8
	//  140  287:invokevirtual   #1006 <Method void SQLiteDatabase.endTransaction()>
		return l;
	//  141  290:lload_3         
	//  142  291:lreturn         
		SQLiteException sqliteexception;
		sqliteexception;
	//  143  292:astore          7
		break MISSING_BLOCK_LABEL_305;
	//  144  294:goto            305
		s1;
	//  145  297:astore_1        
		break MISSING_BLOCK_LABEL_332;
	//  146  298:goto            332
		sqliteexception;
	//  147  301:astore          7
		l = 0L;
	//  148  303:lconst_0        
	//  149  304:lstore_3        
		((bt)this).r().u_().a("Error inserting column. appId", com.google.android.gms.measurement.internal.s.a(s1), ((Object) (s2)), ((Object) (sqliteexception)));
	//  150  305:aload_0         
	//  151  306:invokevirtual   #244 <Method s bt.r()>
	//  152  309:invokevirtual   #250 <Method u s.u_()>
	//  153  312:ldc2            #1270 <String "Error inserting column. appId">
	//  154  315:aload_1         
	//  155  316:invokestatic    #352 <Method Object com.google.android.gms.measurement.internal.s.a(String)>
	//  156  319:aload_2         
	//  157  320:aload           7
	//  158  322:invokevirtual   #361 <Method void com.google.android.gms.measurement.internal.u.a(String, Object, Object, Object)>
		sqlitedatabase.endTransaction();
	//  159  325:aload           8
	//  160  327:invokevirtual   #1006 <Method void SQLiteDatabase.endTransaction()>
		return l;
	//  161  330:lload_3         
	//  162  331:lreturn         
		sqlitedatabase.endTransaction();
	//  163  332:aload           8
	//  164  334:invokevirtual   #1006 <Method void SQLiteDatabase.endTransaction()>
		throw s1;
	//  165  337:aload_1         
	//  166  338:athrow          
	}

	public final void w()
	{
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method void ed.k()>
		y().setTransactionSuccessful();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    4    8:invokevirtual   #1003 <Method void SQLiteDatabase.setTransactionSuccessful()>
	//    5   11:return          
	}

	public final void x()
	{
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method void ed.k()>
		y().endTransaction();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    4    8:invokevirtual   #1006 <Method void SQLiteDatabase.endTransaction()>
	//    5   11:return          
	}

	final SQLiteDatabase y()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method void bt.d()>
		SQLiteDatabase sqlitedatabase;
		try
		{
			sqlitedatabase = h.getWritableDatabase();
	//    2    4:aload_0         
	//    3    5:getfield        #194 <Field fc h>
	//    4    8:invokevirtual   #1273 <Method SQLiteDatabase fc.getWritableDatabase()>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		catch(SQLiteException sqliteexception)
	//*   8   14:astore_1        
		{
			((bt)this).r().i().a("Error opening database", ((Object) (sqliteexception)));
	//    9   15:aload_0         
	//   10   16:invokevirtual   #244 <Method s bt.r()>
	//   11   19:invokevirtual   #347 <Method u s.i()>
	//   12   22:ldc2            #1275 <String "Error opening database">
	//   13   25:aload_1         
	//   14   26:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			throw sqliteexception;
	//   15   29:aload_1         
	//   16   30:athrow          
		}
		return sqlitedatabase;
	}

	public final String z()
	{
		Object obj = ((Object) (y()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method SQLiteDatabase y()>
	//    2    4:astore_1        
		Object obj1 = ((Object) (((SQLiteDatabase) (obj)).rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", ((String []) (null)))));
	//    3    5:aload_1         
	//    4    6:ldc2            #1277 <String "select app_id from queue order by has_realtime desc, rowid asc limit 1;">
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #228 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//    7   13:astore_2        
		obj = obj1;
	//    8   14:aload_2         
	//    9   15:astore_1        
		if(!((Cursor) (obj1)).moveToFirst())
			break MISSING_BLOCK_LABEL_47;
	//   10   16:aload_2         
	//   11   17:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//   12   22:ifeq            47
		obj = obj1;
	//   13   25:aload_2         
	//   14   26:astore_1        
		String s1 = ((Cursor) (obj1)).getString(0);
	//   15   27:aload_2         
	//   16   28:iconst_0        
	//   17   29:invokeinterface #283 <Method String Cursor.getString(int)>
	//   18   34:astore_3        
		if(obj1 != null)
	//*  19   35:aload_2         
	//*  20   36:ifnull          45
			((Cursor) (obj1)).close();
	//   21   39:aload_2         
	//   22   40:invokeinterface #240 <Method void Cursor.close()>
		return s1;
	//   23   45:aload_3         
	//   24   46:areturn         
		if(obj1 != null)
	//*  25   47:aload_2         
	//*  26   48:ifnull          57
			((Cursor) (obj1)).close();
	//   27   51:aload_2         
	//   28   52:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//   29   57:aconst_null     
	//   30   58:areturn         
		Object obj2;
		obj2;
	//   31   59:astore_3        
		break MISSING_BLOCK_LABEL_74;
	//   32   60:goto            74
		obj;
	//   33   63:astore_1        
		obj1 = null;
	//   34   64:aconst_null     
	//   35   65:astore_2        
		obj2 = obj;
	//   36   66:aload_1         
	//   37   67:astore_3        
		break MISSING_BLOCK_LABEL_105;
	//   38   68:goto            105
		obj2;
	//   39   71:astore_3        
		obj1 = null;
	//   40   72:aconst_null     
	//   41   73:astore_2        
		obj = obj1;
	//   42   74:aload_2         
	//   43   75:astore_1        
		((bt)this).r().u_().a("Database error getting next bundle app id", obj2);
	//   44   76:aload_0         
	//   45   77:invokevirtual   #244 <Method s bt.r()>
	//   46   80:invokevirtual   #250 <Method u s.u_()>
	//   47   83:ldc2            #1279 <String "Database error getting next bundle app id">
	//   48   86:aload_3         
	//   49   87:invokevirtual   #274 <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		if(obj1 != null)
	//*  50   90:aload_2         
	//*  51   91:ifnull          100
			((Cursor) (obj1)).close();
	//   52   94:aload_2         
	//   53   95:invokeinterface #240 <Method void Cursor.close()>
		return null;
	//   54  100:aconst_null     
	//   55  101:areturn         
		obj2;
	//   56  102:astore_3        
		obj1 = obj;
	//   57  103:aload_1         
	//   58  104:astore_2        
		if(obj1 != null)
	//*  59  105:aload_2         
	//*  60  106:ifnull          115
			((Cursor) (obj1)).close();
	//   61  109:aload_2         
	//   62  110:invokeinterface #240 <Method void Cursor.close()>
		throw obj2;
	//   63  115:aload_3         
	//   64  116:athrow          
	}

	private static final String b[] = {
		"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"
	};
	private static final String c[] = {
		"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"
	};
	private static final String d[] = {
		"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", 
		"last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", 
		"remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", 
		"daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", 
		"ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"
	};
	private static final String e[] = {
		"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"
	};
	private static final String f[] = {
		"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"
	};
	private static final String g[] = {
		"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"
	};
	private final fc h = new fc(this, ((bt)this).n(), "google_app_measurement.db");
	private final dz i = new dz(((bt)this).m());

	static 
	{
	//    0    0:bipush          10
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #21  <String "last_bundled_timestamp">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #23  <String "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #25  <String "last_bundled_day">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #27  <String "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #29  <String "last_sampled_complex_event_id">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #31  <String "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #33  <String "last_sampling_rate">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #35  <String "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #37  <String "last_exempt_from_sampling">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #39  <String "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;">
	//   41   58:aastore         
	//   42   59:putstatic       #41  <Field String[] b>
	//   43   62:iconst_2        
	//   44   63:anewarray       String[]
	//   45   66:dup             
	//   46   67:iconst_0        
	//   47   68:ldc1            #43  <String "origin">
	//   48   70:aastore         
	//   49   71:dup             
	//   50   72:iconst_1        
	//   51   73:ldc1            #45  <String "ALTER TABLE user_attributes ADD COLUMN origin TEXT;">
	//   52   75:aastore         
	//   53   76:putstatic       #47  <Field String[] c>
	//   54   79:bipush          46
	//   55   81:anewarray       String[]
	//   56   84:dup             
	//   57   85:iconst_0        
	//   58   86:ldc1            #49  <String "app_version">
	//   59   88:aastore         
	//   60   89:dup             
	//   61   90:iconst_1        
	//   62   91:ldc1            #51  <String "ALTER TABLE apps ADD COLUMN app_version TEXT;">
	//   63   93:aastore         
	//   64   94:dup             
	//   65   95:iconst_2        
	//   66   96:ldc1            #53  <String "app_store">
	//   67   98:aastore         
	//   68   99:dup             
	//   69  100:iconst_3        
	//   70  101:ldc1            #55  <String "ALTER TABLE apps ADD COLUMN app_store TEXT;">
	//   71  103:aastore         
	//   72  104:dup             
	//   73  105:iconst_4        
	//   74  106:ldc1            #57  <String "gmp_version">
	//   75  108:aastore         
	//   76  109:dup             
	//   77  110:iconst_5        
	//   78  111:ldc1            #59  <String "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;">
	//   79  113:aastore         
	//   80  114:dup             
	//   81  115:bipush          6
	//   82  117:ldc1            #61  <String "dev_cert_hash">
	//   83  119:aastore         
	//   84  120:dup             
	//   85  121:bipush          7
	//   86  123:ldc1            #63  <String "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;">
	//   87  125:aastore         
	//   88  126:dup             
	//   89  127:bipush          8
	//   90  129:ldc1            #65  <String "measurement_enabled">
	//   91  131:aastore         
	//   92  132:dup             
	//   93  133:bipush          9
	//   94  135:ldc1            #67  <String "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;">
	//   95  137:aastore         
	//   96  138:dup             
	//   97  139:bipush          10
	//   98  141:ldc1            #69  <String "last_bundle_start_timestamp">
	//   99  143:aastore         
	//  100  144:dup             
	//  101  145:bipush          11
	//  102  147:ldc1            #71  <String "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;">
	//  103  149:aastore         
	//  104  150:dup             
	//  105  151:bipush          12
	//  106  153:ldc1            #73  <String "day">
	//  107  155:aastore         
	//  108  156:dup             
	//  109  157:bipush          13
	//  110  159:ldc1            #75  <String "ALTER TABLE apps ADD COLUMN day INTEGER;">
	//  111  161:aastore         
	//  112  162:dup             
	//  113  163:bipush          14
	//  114  165:ldc1            #77  <String "daily_public_events_count">
	//  115  167:aastore         
	//  116  168:dup             
	//  117  169:bipush          15
	//  118  171:ldc1            #79  <String "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;">
	//  119  173:aastore         
	//  120  174:dup             
	//  121  175:bipush          16
	//  122  177:ldc1            #81  <String "daily_events_count">
	//  123  179:aastore         
	//  124  180:dup             
	//  125  181:bipush          17
	//  126  183:ldc1            #83  <String "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;">
	//  127  185:aastore         
	//  128  186:dup             
	//  129  187:bipush          18
	//  130  189:ldc1            #85  <String "daily_conversions_count">
	//  131  191:aastore         
	//  132  192:dup             
	//  133  193:bipush          19
	//  134  195:ldc1            #87  <String "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;">
	//  135  197:aastore         
	//  136  198:dup             
	//  137  199:bipush          20
	//  138  201:ldc1            #89  <String "remote_config">
	//  139  203:aastore         
	//  140  204:dup             
	//  141  205:bipush          21
	//  142  207:ldc1            #91  <String "ALTER TABLE apps ADD COLUMN remote_config BLOB;">
	//  143  209:aastore         
	//  144  210:dup             
	//  145  211:bipush          22
	//  146  213:ldc1            #93  <String "config_fetched_time">
	//  147  215:aastore         
	//  148  216:dup             
	//  149  217:bipush          23
	//  150  219:ldc1            #95  <String "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;">
	//  151  221:aastore         
	//  152  222:dup             
	//  153  223:bipush          24
	//  154  225:ldc1            #97  <String "failed_config_fetch_time">
	//  155  227:aastore         
	//  156  228:dup             
	//  157  229:bipush          25
	//  158  231:ldc1            #99  <String "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;">
	//  159  233:aastore         
	//  160  234:dup             
	//  161  235:bipush          26
	//  162  237:ldc1            #101 <String "app_version_int">
	//  163  239:aastore         
	//  164  240:dup             
	//  165  241:bipush          27
	//  166  243:ldc1            #103 <String "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;">
	//  167  245:aastore         
	//  168  246:dup             
	//  169  247:bipush          28
	//  170  249:ldc1            #105 <String "firebase_instance_id">
	//  171  251:aastore         
	//  172  252:dup             
	//  173  253:bipush          29
	//  174  255:ldc1            #107 <String "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;">
	//  175  257:aastore         
	//  176  258:dup             
	//  177  259:bipush          30
	//  178  261:ldc1            #109 <String "daily_error_events_count">
	//  179  263:aastore         
	//  180  264:dup             
	//  181  265:bipush          31
	//  182  267:ldc1            #111 <String "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;">
	//  183  269:aastore         
	//  184  270:dup             
	//  185  271:bipush          32
	//  186  273:ldc1            #113 <String "daily_realtime_events_count">
	//  187  275:aastore         
	//  188  276:dup             
	//  189  277:bipush          33
	//  190  279:ldc1            #115 <String "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;">
	//  191  281:aastore         
	//  192  282:dup             
	//  193  283:bipush          34
	//  194  285:ldc1            #117 <String "health_monitor_sample">
	//  195  287:aastore         
	//  196  288:dup             
	//  197  289:bipush          35
	//  198  291:ldc1            #119 <String "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;">
	//  199  293:aastore         
	//  200  294:dup             
	//  201  295:bipush          36
	//  202  297:ldc1            #121 <String "android_id">
	//  203  299:aastore         
	//  204  300:dup             
	//  205  301:bipush          37
	//  206  303:ldc1            #123 <String "ALTER TABLE apps ADD COLUMN android_id INTEGER;">
	//  207  305:aastore         
	//  208  306:dup             
	//  209  307:bipush          38
	//  210  309:ldc1            #125 <String "adid_reporting_enabled">
	//  211  311:aastore         
	//  212  312:dup             
	//  213  313:bipush          39
	//  214  315:ldc1            #127 <String "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;">
	//  215  317:aastore         
	//  216  318:dup             
	//  217  319:bipush          40
	//  218  321:ldc1            #129 <String "ssaid_reporting_enabled">
	//  219  323:aastore         
	//  220  324:dup             
	//  221  325:bipush          41
	//  222  327:ldc1            #131 <String "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;">
	//  223  329:aastore         
	//  224  330:dup             
	//  225  331:bipush          42
	//  226  333:ldc1            #133 <String "admob_app_id">
	//  227  335:aastore         
	//  228  336:dup             
	//  229  337:bipush          43
	//  230  339:ldc1            #135 <String "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;">
	//  231  341:aastore         
	//  232  342:dup             
	//  233  343:bipush          44
	//  234  345:ldc1            #137 <String "linked_admob_app_id">
	//  235  347:aastore         
	//  236  348:dup             
	//  237  349:bipush          45
	//  238  351:ldc1            #139 <String "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;">
	//  239  353:aastore         
	//  240  354:putstatic       #141 <Field String[] d>
	//  241  357:iconst_2        
	//  242  358:anewarray       String[]
	//  243  361:dup             
	//  244  362:iconst_0        
	//  245  363:ldc1            #143 <String "realtime">
	//  246  365:aastore         
	//  247  366:dup             
	//  248  367:iconst_1        
	//  249  368:ldc1            #145 <String "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;">
	//  250  370:aastore         
	//  251  371:putstatic       #147 <Field String[] e>
	//  252  374:iconst_4        
	//  253  375:anewarray       String[]
	//  254  378:dup             
	//  255  379:iconst_0        
	//  256  380:ldc1            #149 <String "has_realtime">
	//  257  382:aastore         
	//  258  383:dup             
	//  259  384:iconst_1        
	//  260  385:ldc1            #151 <String "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;">
	//  261  387:aastore         
	//  262  388:dup             
	//  263  389:iconst_2        
	//  264  390:ldc1            #153 <String "retry_count">
	//  265  392:aastore         
	//  266  393:dup             
	//  267  394:iconst_3        
	//  268  395:ldc1            #155 <String "ALTER TABLE queue ADD COLUMN retry_count INTEGER;">
	//  269  397:aastore         
	//  270  398:putstatic       #157 <Field String[] f>
	//  271  401:iconst_2        
	//  272  402:anewarray       String[]
	//  273  405:dup             
	//  274  406:iconst_0        
	//  275  407:ldc1            #159 <String "previous_install_count">
	//  276  409:aastore         
	//  277  410:dup             
	//  278  411:iconst_1        
	//  279  412:ldc1            #161 <String "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;">
	//  280  414:aastore         
	//  281  415:putstatic       #163 <Field String[] g>
	//* 282  418:return          
	}
}
