// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.picasso;

import a.p;
import android.content.*;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package com.squareup.picasso:
//			o, ae, ay, bd, 
//			ar

class ad extends o
{

	ad(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void o(Context)>
	//    3    5:return          
	}

	static int a(ContentResolver contentresolver, Uri uri)
	{
		ContentResolver contentresolver1;
		ContentResolver contentresolver2;
		contentresolver2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		contentresolver1 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		int i;
		try
		{
			contentresolver = ((ContentResolver) (contentresolver.query(uri, b, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    4    5:aload_0         
	//    5    6:aload_1         
	//    6    7:getstatic       #14  <Field String[] b>
	//    7   10:aconst_null     
	//    8   11:aconst_null     
	//    9   12:aconst_null     
	//   10   13:invokevirtual   #29  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   11   16:astore_0        
		}
	//*  12   17:aload_0         
	//*  13   18:ifnull          63
	//*  14   21:aload_0         
	//*  15   22:astore_3        
	//*  16   23:aload_0         
	//*  17   24:astore          4
	//*  18   26:aload_0         
	//*  19   27:invokeinterface #35  <Method boolean Cursor.moveToFirst()>
	//*  20   32:ifne            38
	//*  21   35:goto            63
	//*  22   38:aload_0         
	//*  23   39:astore_3        
	//*  24   40:aload_0         
	//*  25   41:astore          4
	//*  26   43:aload_0         
	//*  27   44:iconst_0        
	//*  28   45:invokeinterface #39  <Method int Cursor.getInt(int)>
	//*  29   50:istore_2        
	//*  30   51:aload_0         
	//*  31   52:ifnull          61
	//*  32   55:aload_0         
	//*  33   56:invokeinterface #42  <Method void Cursor.close()>
	//*  34   61:iload_2         
	//*  35   62:ireturn         
	//*  36   63:aload_0         
	//*  37   64:ifnull          73
	//*  38   67:aload_0         
	//*  39   68:invokeinterface #42  <Method void Cursor.close()>
	//*  40   73:iconst_0        
	//*  41   74:ireturn         
	//*  42   75:astore_0        
	//*  43   76:aload_3         
	//*  44   77:ifnull          86
	//*  45   80:aload_3         
	//*  46   81:invokeinterface #42  <Method void Cursor.close()>
	//*  47   86:aload_0         
	//*  48   87:athrow          
	//*  49   88:aload           4
	//*  50   90:ifnull          100
	//*  51   93:aload           4
	//*  52   95:invokeinterface #42  <Method void Cursor.close()>
	//*  53  100:iconst_0        
	//*  54  101:ireturn         
		// Misplaced declaration of an exception variable
		catch(ContentResolver contentresolver)
		{
			if(contentresolver2 != null)
				((Cursor) (contentresolver2)).close();
			return 0;
		}
		if(contentresolver == null)
			break MISSING_BLOCK_LABEL_63;
		contentresolver1 = contentresolver;
		contentresolver2 = contentresolver;
		if(!((Cursor) (contentresolver)).moveToFirst())
			break MISSING_BLOCK_LABEL_63;
		contentresolver1 = contentresolver;
		contentresolver2 = contentresolver;
		i = ((Cursor) (contentresolver)).getInt(0);
		if(contentresolver != null)
			((Cursor) (contentresolver)).close();
		return i;
		if(contentresolver != null)
			((Cursor) (contentresolver)).close();
		return 0;
		contentresolver;
		if(contentresolver1 != null)
			((Cursor) (contentresolver1)).close();
		throw contentresolver;
	//*  55  102:astore_0        
	//*  56  103:goto            88
	}

	static ae a(int i, int j)
	{
		if(i <= ae.a.e && j <= ae.a.f)
	//*   0    0:iload_0         
	//*   1    1:getstatic       #48  <Field ae ae.a>
	//*   2    4:getfield        #52  <Field int ae.e>
	//*   3    7:icmpgt          24
	//*   4   10:iload_1         
	//*   5   11:getstatic       #48  <Field ae ae.a>
	//*   6   14:getfield        #55  <Field int ae.f>
	//*   7   17:icmpgt          24
			return ae.a;
	//    8   20:getstatic       #48  <Field ae ae.a>
	//    9   23:areturn         
		if(i <= ae.b.e && j <= ae.b.f)
	//*  10   24:iload_0         
	//*  11   25:getstatic       #57  <Field ae ae.b>
	//*  12   28:getfield        #52  <Field int ae.e>
	//*  13   31:icmpgt          48
	//*  14   34:iload_1         
	//*  15   35:getstatic       #57  <Field ae ae.b>
	//*  16   38:getfield        #55  <Field int ae.f>
	//*  17   41:icmpgt          48
			return ae.b;
	//   18   44:getstatic       #57  <Field ae ae.b>
	//   19   47:areturn         
		else
			return ae.c;
	//   20   48:getstatic       #60  <Field ae ae.c>
	//   21   51:areturn         
	}

	public bd a(ay ay1, int i)
	{
		Object obj = ((Object) (a.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Context a>
	//    2    4:invokevirtual   #70  <Method ContentResolver Context.getContentResolver()>
	//    3    7:astore          6
		int j = a(((ContentResolver) (obj)), ay1.d);
	//    4    9:aload           6
	//    5   11:aload_1         
	//    6   12:getfield        #76  <Field Uri ay.d>
	//    7   15:invokestatic    #78  <Method int a(ContentResolver, Uri)>
	//    8   18:istore_3        
		String s = ((ContentResolver) (obj)).getType(ay1.d);
	//    9   19:aload           6
	//   10   21:aload_1         
	//   11   22:getfield        #76  <Field Uri ay.d>
	//   12   25:invokevirtual   #82  <Method String ContentResolver.getType(Uri)>
	//   13   28:astore          7
		if(s != null && s.startsWith("video/"))
	//*  14   30:aload           7
	//*  15   32:ifnull          50
	//*  16   35:aload           7
	//*  17   37:ldc1            #84  <String "video/">
	//*  18   39:invokevirtual   #88  <Method boolean String.startsWith(String)>
	//*  19   42:ifeq            50
			i = 1;
	//   20   45:iconst_1        
	//   21   46:istore_2        
		else
	//*  22   47:goto            52
			i = 0;
	//   23   50:iconst_0        
	//   24   51:istore_2        
		if(ay1.d())
	//*  25   52:aload_1         
	//*  26   53:invokevirtual   #90  <Method boolean ay.d()>
	//*  27   56:ifeq            224
		{
			ae ae1 = a(ay1.h, ay1.i);
	//   28   59:aload_1         
	//   29   60:getfield        #93  <Field int ay.h>
	//   30   63:aload_1         
	//   31   64:getfield        #96  <Field int ay.i>
	//   32   67:invokestatic    #98  <Method ae a(int, int)>
	//   33   70:astore          7
			if(i == 0 && ae1 == ae.c)
	//*  34   72:iload_2         
	//*  35   73:ifne            105
	//*  36   76:aload           7
	//*  37   78:getstatic       #60  <Field ae ae.c>
	//*  38   81:if_acmpne       105
				return new bd(((android.graphics.Bitmap) (null)), p.a(b(ay1)), ar.b, j);
	//   39   84:new             #100 <Class bd>
	//   40   87:dup             
	//   41   88:aconst_null     
	//   42   89:aload_0         
	//   43   90:aload_1         
	//   44   91:invokevirtual   #103 <Method java.io.InputStream b(ay)>
	//   45   94:invokestatic    #108 <Method a.ab p.a(java.io.InputStream)>
	//   46   97:getstatic       #113 <Field ar ar.b>
	//   47  100:iload_3         
	//   48  101:invokespecial   #116 <Method void bd(android.graphics.Bitmap, a.ab, ar, int)>
	//   49  104:areturn         
			long l = ContentUris.parseId(ay1.d);
	//   50  105:aload_1         
	//   51  106:getfield        #76  <Field Uri ay.d>
	//   52  109:invokestatic    #122 <Method long ContentUris.parseId(Uri)>
	//   53  112:lstore          4
			android.graphics.BitmapFactory.Options options = c(ay1);
	//   54  114:aload_1         
	//   55  115:invokestatic    #125 <Method android.graphics.BitmapFactory$Options c(ay)>
	//   56  118:astore          8
			options.inJustDecodeBounds = true;
	//   57  120:aload           8
	//   58  122:iconst_1        
	//   59  123:putfield        #131 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
			a(ay1.h, ay1.i, ae1.e, ae1.f, options, ay1);
	//   60  126:aload_1         
	//   61  127:getfield        #93  <Field int ay.h>
	//   62  130:aload_1         
	//   63  131:getfield        #96  <Field int ay.i>
	//   64  134:aload           7
	//   65  136:getfield        #52  <Field int ae.e>
	//   66  139:aload           7
	//   67  141:getfield        #55  <Field int ae.f>
	//   68  144:aload           8
	//   69  146:aload_1         
	//   70  147:invokestatic    #134 <Method void a(int, int, int, int, android.graphics.BitmapFactory$Options, ay)>
			if(i != 0)
	//*  71  150:iload_2         
	//*  72  151:ifeq            188
			{
				if(ae1 == ae.c)
	//*  73  154:aload           7
	//*  74  156:getstatic       #60  <Field ae ae.c>
	//*  75  159:if_acmpne       167
					i = 1;
	//   76  162:iconst_1        
	//   77  163:istore_2        
				else
	//*  78  164:goto            173
					i = ae1.d;
	//   79  167:aload           7
	//   80  169:getfield        #136 <Field int ae.d>
	//   81  172:istore_2        
				obj = ((Object) (android.provider.MediaStore.Video.Thumbnails.getThumbnail(((ContentResolver) (obj)), l, i, options)));
	//   82  173:aload           6
	//   83  175:lload           4
	//   84  177:iload_2         
	//   85  178:aload           8
	//   86  180:invokestatic    #142 <Method android.graphics.Bitmap android.provider.MediaStore$Video$Thumbnails.getThumbnail(ContentResolver, long, int, android.graphics.BitmapFactory$Options)>
	//   87  183:astore          6
			} else
	//*  88  185:goto            204
			{
				obj = ((Object) (android.provider.MediaStore.Images.Thumbnails.getThumbnail(((ContentResolver) (obj)), l, ae1.d, options)));
	//   89  188:aload           6
	//   90  190:lload           4
	//   91  192:aload           7
	//   92  194:getfield        #136 <Field int ae.d>
	//   93  197:aload           8
	//   94  199:invokestatic    #145 <Method android.graphics.Bitmap android.provider.MediaStore$Images$Thumbnails.getThumbnail(ContentResolver, long, int, android.graphics.BitmapFactory$Options)>
	//   95  202:astore          6
			}
			if(obj != null)
	//*  96  204:aload           6
	//*  97  206:ifnull          224
				return new bd(((android.graphics.Bitmap) (obj)), ((a.ab) (null)), ar.b, j);
	//   98  209:new             #100 <Class bd>
	//   99  212:dup             
	//  100  213:aload           6
	//  101  215:aconst_null     
	//  102  216:getstatic       #113 <Field ar ar.b>
	//  103  219:iload_3         
	//  104  220:invokespecial   #116 <Method void bd(android.graphics.Bitmap, a.ab, ar, int)>
	//  105  223:areturn         
		}
		return new bd(((android.graphics.Bitmap) (null)), p.a(b(ay1)), ar.b, j);
	//  106  224:new             #100 <Class bd>
	//  107  227:dup             
	//  108  228:aconst_null     
	//  109  229:aload_0         
	//  110  230:aload_1         
	//  111  231:invokevirtual   #103 <Method java.io.InputStream b(ay)>
	//  112  234:invokestatic    #108 <Method a.ab p.a(java.io.InputStream)>
	//  113  237:getstatic       #113 <Field ar ar.b>
	//  114  240:iload_3         
	//  115  241:invokespecial   #116 <Method void bd(android.graphics.Bitmap, a.ab, ar, int)>
	//  116  244:areturn         
	}

	public boolean a(ay ay1)
	{
		ay1 = ((ay) (ay1.d));
	//    0    0:aload_1         
	//    1    1:getfield        #76  <Field Uri ay.d>
	//    2    4:astore_1        
		return "content".equals(((Object) (((Uri) (ay1)).getScheme()))) && "media".equals(((Object) (((Uri) (ay1)).getAuthority())));
	//    3    5:ldc1            #148 <String "content">
	//    4    7:aload_1         
	//    5    8:invokevirtual   #154 <Method String Uri.getScheme()>
	//    6   11:invokevirtual   #158 <Method boolean String.equals(Object)>
	//    7   14:ifeq            31
	//    8   17:ldc1            #160 <String "media">
	//    9   19:aload_1         
	//   10   20:invokevirtual   #163 <Method String Uri.getAuthority()>
	//   11   23:invokevirtual   #158 <Method boolean String.equals(Object)>
	//   12   26:ifeq            31
	//   13   29:iconst_1        
	//   14   30:ireturn         
	//   15   31:iconst_0        
	//   16   32:ireturn         
	}

	private static final String b[] = {
		"orientation"
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #12  <String "orientation">
	//    5    8:aastore         
	//    6    9:putstatic       #14  <Field String[] b>
	//*   7   12:return          
	}
}
