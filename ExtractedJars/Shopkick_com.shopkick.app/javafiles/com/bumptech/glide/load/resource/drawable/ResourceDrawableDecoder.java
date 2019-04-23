// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.resource.drawable:
//			DrawableDecoderCompat, NonOwnedDrawableResource

public class ResourceDrawableDecoder
	implements ResourceDecoder
{

	public ResourceDrawableDecoder(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #29  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #31  <Field Context context>
	//    6   12:return          
	}

	private Context getContextForPackage(Uri uri, String s)
	{
		try
		{
			s = ((String) (context.createPackageContext(s, 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Context context>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #41  <Method Context Context.createPackageContext(String, int)>
	//    5    9:astore_2        
		}
	//*   6   10:aload_2         
	//*   7   11:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   12:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   13:new             #43  <Class StringBuilder>
	//   10   16:dup             
	//   11   17:invokespecial   #44  <Method void StringBuilder()>
	//   12   20:astore_3        
			stringbuilder.append("Failed to obtain context or unrecognized Uri format for: ");
	//   13   21:aload_3         
	//   14   22:ldc1            #46  <String "Failed to obtain context or unrecognized Uri format for: ">
	//   15   24:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   16   27:pop             
			stringbuilder.append(((Object) (uri)));
	//   17   28:aload_3         
	//   18   29:aload_1         
	//   19   30:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   20   33:pop             
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (s)));
	//   21   34:new             #55  <Class IllegalArgumentException>
	//   22   37:dup             
	//   23   38:aload_3         
	//   24   39:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   25   42:aload_2         
	//   26   43:invokespecial   #62  <Method void IllegalArgumentException(String, Throwable)>
	//   27   46:athrow          
		}
		return ((Context) (s));
	}

	private int loadResourceIdFromUri(Uri uri)
	{
		Object obj1 = ((Object) (uri.getPathSegments()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #74  <Method List Uri.getPathSegments()>
	//    2    4:astore          4
		if(((List) (obj1)).size() != 2) goto _L2; else goto _L1
	//    3    6:aload           4
	//    4    8:invokeinterface #80  <Method int List.size()>
	//    5   13:iconst_2        
	//    6   14:icmpne          68
_L1:
		Object obj;
		obj = ((Object) (uri.getAuthority()));
	//    7   17:aload_1         
	//    8   18:invokevirtual   #83  <Method String Uri.getAuthority()>
	//    9   21:astore_2        
		String s = (String)((List) (obj1)).get(0);
	//   10   22:aload           4
	//   11   24:iconst_0        
	//   12   25:invokeinterface #87  <Method Object List.get(int)>
	//   13   30:checkcast       #89  <Class String>
	//   14   33:astore_3        
		obj1 = ((Object) ((String)((List) (obj1)).get(1)));
	//   15   34:aload           4
	//   16   36:iconst_1        
	//   17   37:invokeinterface #87  <Method Object List.get(int)>
	//   18   42:checkcast       #89  <Class String>
	//   19   45:astore          4
		obj = ((Object) (Integer.valueOf(context.getResources().getIdentifier(((String) (obj1)), s, ((String) (obj))))));
	//   20   47:aload_0         
	//   21   48:getfield        #31  <Field Context context>
	//   22   51:invokevirtual   #93  <Method Resources Context.getResources()>
	//   23   54:aload           4
	//   24   56:aload_3         
	//   25   57:aload_2         
	//   26   58:invokevirtual   #99  <Method int Resources.getIdentifier(String, String, String)>
	//   27   61:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   28   64:astore_2        
		  goto _L3
	//*  29   65:goto            99
_L2:
		if(((List) (obj1)).size() != 1) goto _L5; else goto _L4
	//   30   68:aload           4
	//   31   70:invokeinterface #80  <Method int List.size()>
	//   32   75:iconst_1        
	//   33   76:icmpne          97
_L4:
		obj = ((Object) (Integer.valueOf((String)((List) (obj1)).get(0))));
	//   34   79:aload           4
	//   35   81:iconst_0        
	//   36   82:invokeinterface #87  <Method Object List.get(int)>
	//   37   87:checkcast       #89  <Class String>
	//   38   90:invokestatic    #108 <Method Integer Integer.valueOf(String)>
	//   39   93:astore_2        
		  goto _L3
	//*  40   94:goto            99
_L5:
		obj = null;
	//   41   97:aconst_null     
	//   42   98:astore_2        
_L3:
		if(obj != null)
	//*  43   99:aload_2         
	//*  44  100:ifnull          148
		{
			if(((Integer) (obj)).intValue() != 0)
	//*  45  103:aload_2         
	//*  46  104:invokevirtual   #111 <Method int Integer.intValue()>
	//*  47  107:ifeq            115
			{
				return ((Integer) (obj)).intValue();
	//   48  110:aload_2         
	//   49  111:invokevirtual   #111 <Method int Integer.intValue()>
	//   50  114:ireturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   51  115:new             #43  <Class StringBuilder>
	//   52  118:dup             
	//   53  119:invokespecial   #44  <Method void StringBuilder()>
	//   54  122:astore_2        
				stringbuilder.append("Failed to obtain resource id for: ");
	//   55  123:aload_2         
	//   56  124:ldc1            #113 <String "Failed to obtain resource id for: ">
	//   57  126:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   58  129:pop             
				stringbuilder.append(((Object) (uri)));
	//   59  130:aload_2         
	//   60  131:aload_1         
	//   61  132:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   62  135:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   63  136:new             #55  <Class IllegalArgumentException>
	//   64  139:dup             
	//   65  140:aload_2         
	//   66  141:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   67  144:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   68  147:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   69  148:new             #43  <Class StringBuilder>
	//   70  151:dup             
	//   71  152:invokespecial   #44  <Method void StringBuilder()>
	//   72  155:astore_2        
			stringbuilder1.append("Unrecognized Uri format: ");
	//   73  156:aload_2         
	//   74  157:ldc1            #118 <String "Unrecognized Uri format: ">
	//   75  159:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   76  162:pop             
			stringbuilder1.append(((Object) (uri)));
	//   77  163:aload_2         
	//   78  164:aload_1         
	//   79  165:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   80  168:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   81  169:new             #55  <Class IllegalArgumentException>
	//   82  172:dup             
	//   83  173:aload_2         
	//   84  174:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   85  177:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   86  180:athrow          
		}
		NumberFormatException numberformatexception;
		numberformatexception;
	//   87  181:astore_2        
		if(true) goto _L5; else goto _L6
_L6:
	//*  88  182:goto            97
	}

	public Resource decode(Uri uri, int i, int j, Options options)
	{
		i = loadResourceIdFromUri(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method int loadResourceIdFromUri(Uri)>
	//    3    5:istore_2        
		options = ((Options) (uri.getAuthority()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #83  <Method String Uri.getAuthority()>
	//    6   10:astore          4
		if(((String) (options)).equals(((Object) (context.getPackageName()))))
	//*   7   12:aload           4
	//*   8   14:aload_0         
	//*   9   15:getfield        #31  <Field Context context>
	//*  10   18:invokevirtual   #126 <Method String Context.getPackageName()>
	//*  11   21:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  12   24:ifeq            35
			uri = ((Uri) (context));
	//   13   27:aload_0         
	//   14   28:getfield        #31  <Field Context context>
	//   15   31:astore_1        
		else
	//*  16   32:goto            43
			uri = ((Uri) (getContextForPackage(uri, ((String) (options)))));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:aload           4
	//   20   39:invokespecial   #132 <Method Context getContextForPackage(Uri, String)>
	//   21   42:astore_1        
		return NonOwnedDrawableResource.newInstance(DrawableDecoderCompat.getDrawable(context, ((Context) (uri)), i));
	//   22   43:aload_0         
	//   23   44:getfield        #31  <Field Context context>
	//   24   47:aload_1         
	//   25   48:iload_2         
	//   26   49:invokestatic    #138 <Method android.graphics.drawable.Drawable DrawableDecoderCompat.getDrawable(Context, Context, int)>
	//   27   52:invokestatic    #144 <Method Resource NonOwnedDrawableResource.newInstance(android.graphics.drawable.Drawable)>
	//   28   55:areturn         
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((Uri)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #70  <Class Uri>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #152 <Method Resource decode(Uri, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Uri uri, Options options)
	{
		return uri.getScheme().equals("android.resource");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #158 <Method String Uri.getScheme()>
	//    2    4:ldc1            #160 <String "android.resource">
	//    3    6:invokevirtual   #130 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((Uri)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #70  <Class Uri>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #163 <Method boolean handles(Uri, Options)>
	//    5    9:ireturn         
	}

	private static final int ID_PATH_SEGMENTS = 1;
	private static final int NAME_PATH_SEGMENT_INDEX = 1;
	private static final int NAME_URI_PATH_SEGMENTS = 2;
	private static final int RESOURCE_ID_SEGMENT_INDEX = 0;
	private static final int TYPE_PATH_SEGMENT_INDEX = 0;
	private final Context context;
}
