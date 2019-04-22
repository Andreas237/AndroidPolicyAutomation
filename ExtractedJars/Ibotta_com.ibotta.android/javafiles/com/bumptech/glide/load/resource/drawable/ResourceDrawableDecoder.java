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
	//    1    1:invokespecial   #14  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #20  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #22  <Field Context context>
	//    6   12:return          
	}

	private Context findContextForPackage(Uri uri, String s)
	{
		if(s.equals(((Object) (context.getPackageName()))))
	//*   0    0:aload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #22  <Field Context context>
	//*   3    5:invokevirtual   #32  <Method String Context.getPackageName()>
	//*   4    8:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*   5   11:ifeq            19
			return context;
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field Context context>
	//    8   18:areturn         
		Context context1;
		try
		{
			context1 = context.createPackageContext(s, 0);
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field Context context>
	//   11   23:aload_2         
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #42  <Method Context Context.createPackageContext(String, int)>
	//   14   28:astore_3        
		}
	//*  15   29:aload_3         
	//*  16   30:areturn         
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  17   31:astore_3        
		{
			if(s.contains(((CharSequence) (context.getPackageName()))))
	//*  18   32:aload_2         
	//*  19   33:aload_0         
	//*  20   34:getfield        #22  <Field Context context>
	//*  21   37:invokevirtual   #32  <Method String Context.getPackageName()>
	//*  22   40:invokevirtual   #46  <Method boolean String.contains(CharSequence)>
	//*  23   43:ifeq            51
			{
				return context;
	//   24   46:aload_0         
	//   25   47:getfield        #22  <Field Context context>
	//   26   50:areturn         
			} else
			{
				s = ((String) (new StringBuilder()));
	//   27   51:new             #48  <Class StringBuilder>
	//   28   54:dup             
	//   29   55:invokespecial   #49  <Method void StringBuilder()>
	//   30   58:astore_2        
				((StringBuilder) (s)).append("Failed to obtain context or unrecognized Uri format for: ");
	//   31   59:aload_2         
	//   32   60:ldc1            #51  <String "Failed to obtain context or unrecognized Uri format for: ">
	//   33   62:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
				((StringBuilder) (s)).append(((Object) (uri)));
	//   35   66:aload_2         
	//   36   67:aload_1         
	//   37   68:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   38   71:pop             
				throw new IllegalArgumentException(((StringBuilder) (s)).toString(), ((Throwable) (namenotfoundexception)));
	//   39   72:new             #60  <Class IllegalArgumentException>
	//   40   75:dup             
	//   41   76:aload_2         
	//   42   77:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   43   80:aload_3         
	//   44   81:invokespecial   #66  <Method void IllegalArgumentException(String, Throwable)>
	//   45   84:athrow          
			}
		}
		return context1;
	}

	private int findResourceIdFromResourceIdUri(Uri uri)
	{
		List list = uri.getPathSegments();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #78  <Method List Uri.getPathSegments()>
	//    2    4:astore_3        
		int i;
		try
		{
			i = Integer.parseInt((String)list.get(0));
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:invokeinterface #84  <Method Object List.get(int)>
	//    6   12:checkcast       #34  <Class String>
	//    7   15:invokestatic    #90  <Method int Integer.parseInt(String)>
	//    8   18:istore_2        
		}
	//*   9   19:iload_2         
	//*  10   20:ireturn         
		catch(NumberFormatException numberformatexception)
	//*  11   21:astore_3        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #48  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #49  <Method void StringBuilder()>
	//   15   29:astore          4
			stringbuilder.append("Unrecognized Uri format: ");
	//   16   31:aload           4
	//   17   33:ldc1            #92  <String "Unrecognized Uri format: ">
	//   18   35:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(((Object) (uri)));
	//   20   39:aload           4
	//   21   41:aload_1         
	//   22   42:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   23   45:pop             
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (numberformatexception)));
	//   24   46:new             #60  <Class IllegalArgumentException>
	//   25   49:dup             
	//   26   50:aload           4
	//   27   52:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   28   55:aload_3         
	//   29   56:invokespecial   #66  <Method void IllegalArgumentException(String, Throwable)>
	//   30   59:athrow          
		}
		return i;
	}

	private int findResourceIdFromTypeAndNameResourceUri(Context context1, Uri uri)
	{
		Object obj = ((Object) (uri.getPathSegments()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #78  <Method List Uri.getPathSegments()>
	//    2    4:astore          7
		String s = uri.getAuthority();
	//    3    6:aload_2         
	//    4    7:invokevirtual   #97  <Method String Uri.getAuthority()>
	//    5   10:astore          5
		String s1 = (String)((List) (obj)).get(0);
	//    6   12:aload           7
	//    7   14:iconst_0        
	//    8   15:invokeinterface #84  <Method Object List.get(int)>
	//    9   20:checkcast       #34  <Class String>
	//   10   23:astore          6
		obj = ((Object) ((String)((List) (obj)).get(1)));
	//   11   25:aload           7
	//   12   27:iconst_1        
	//   13   28:invokeinterface #84  <Method Object List.get(int)>
	//   14   33:checkcast       #34  <Class String>
	//   15   36:astore          7
		int j = context1.getResources().getIdentifier(((String) (obj)), s1, s);
	//   16   38:aload_1         
	//   17   39:invokevirtual   #101 <Method Resources Context.getResources()>
	//   18   42:aload           7
	//   19   44:aload           6
	//   20   46:aload           5
	//   21   48:invokevirtual   #107 <Method int Resources.getIdentifier(String, String, String)>
	//   22   51:istore          4
		int i = j;
	//   23   53:iload           4
	//   24   55:istore_3        
		if(j == 0)
	//*  25   56:iload           4
	//*  26   58:ifne            74
			i = Resources.getSystem().getIdentifier(((String) (obj)), s1, "android");
	//   27   61:invokestatic    #110 <Method Resources Resources.getSystem()>
	//   28   64:aload           7
	//   29   66:aload           6
	//   30   68:ldc1            #112 <String "android">
	//   31   70:invokevirtual   #107 <Method int Resources.getIdentifier(String, String, String)>
	//   32   73:istore_3        
		if(i != 0)
	//*  33   74:iload_3         
	//*  34   75:ifeq            80
		{
			return i;
	//   35   78:iload_3         
	//   36   79:ireturn         
		} else
		{
			context1 = ((Context) (new StringBuilder()));
	//   37   80:new             #48  <Class StringBuilder>
	//   38   83:dup             
	//   39   84:invokespecial   #49  <Method void StringBuilder()>
	//   40   87:astore_1        
			((StringBuilder) (context1)).append("Failed to find resource id for: ");
	//   41   88:aload_1         
	//   42   89:ldc1            #114 <String "Failed to find resource id for: ">
	//   43   91:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   44   94:pop             
			((StringBuilder) (context1)).append(((Object) (uri)));
	//   45   95:aload_1         
	//   46   96:aload_2         
	//   47   97:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   48  100:pop             
			throw new IllegalArgumentException(((StringBuilder) (context1)).toString());
	//   49  101:new             #60  <Class IllegalArgumentException>
	//   50  104:dup             
	//   51  105:aload_1         
	//   52  106:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   53  109:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//   54  112:athrow          
		}
	}

	private int findResourceIdFromUri(Context context1, Uri uri)
	{
		List list = uri.getPathSegments();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #78  <Method List Uri.getPathSegments()>
	//    2    4:astore_3        
		if(list.size() == 2)
	//*   3    5:aload_3         
	//*   4    6:invokeinterface #122 <Method int List.size()>
	//*   5   11:iconst_2        
	//*   6   12:icmpne          22
			return findResourceIdFromTypeAndNameResourceUri(context1, uri);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #124 <Method int findResourceIdFromTypeAndNameResourceUri(Context, Uri)>
	//   11   21:ireturn         
		if(list.size() == 1)
	//*  12   22:aload_3         
	//*  13   23:invokeinterface #122 <Method int List.size()>
	//*  14   28:iconst_1        
	//*  15   29:icmpne          38
		{
			return findResourceIdFromResourceIdUri(uri);
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokespecial   #126 <Method int findResourceIdFromResourceIdUri(Uri)>
	//   19   37:ireturn         
		} else
		{
			context1 = ((Context) (new StringBuilder()));
	//   20   38:new             #48  <Class StringBuilder>
	//   21   41:dup             
	//   22   42:invokespecial   #49  <Method void StringBuilder()>
	//   23   45:astore_1        
			((StringBuilder) (context1)).append("Unrecognized Uri format: ");
	//   24   46:aload_1         
	//   25   47:ldc1            #92  <String "Unrecognized Uri format: ">
	//   26   49:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			((StringBuilder) (context1)).append(((Object) (uri)));
	//   28   53:aload_1         
	//   29   54:aload_2         
	//   30   55:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   31   58:pop             
			throw new IllegalArgumentException(((StringBuilder) (context1)).toString());
	//   32   59:new             #60  <Class IllegalArgumentException>
	//   33   62:dup             
	//   34   63:aload_1         
	//   35   64:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   36   67:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//   37   70:athrow          
		}
	}

	public Resource decode(Uri uri, int i, int j, Options options)
	{
		options = ((Options) (findContextForPackage(uri, uri.getAuthority())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #97  <Method String Uri.getAuthority()>
	//    4    6:invokespecial   #131 <Method Context findContextForPackage(Uri, String)>
	//    5    9:astore          4
		i = findResourceIdFromUri(((Context) (options)), uri);
	//    6   11:aload_0         
	//    7   12:aload           4
	//    8   14:aload_1         
	//    9   15:invokespecial   #133 <Method int findResourceIdFromUri(Context, Uri)>
	//   10   18:istore_2        
		return NonOwnedDrawableResource.newInstance(DrawableDecoderCompat.getDrawable(context, ((Context) (options)), i));
	//   11   19:aload_0         
	//   12   20:getfield        #22  <Field Context context>
	//   13   23:aload           4
	//   14   25:iload_2         
	//   15   26:invokestatic    #139 <Method android.graphics.drawable.Drawable DrawableDecoderCompat.getDrawable(Context, Context, int)>
	//   16   29:invokestatic    #145 <Method Resource NonOwnedDrawableResource.newInstance(android.graphics.drawable.Drawable)>
	//   17   32:areturn         
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((Uri)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #74  <Class Uri>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #153 <Method Resource decode(Uri, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Uri uri, Options options)
	{
		return uri.getScheme().equals("android.resource");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #159 <Method String Uri.getScheme()>
	//    2    4:ldc1            #161 <String "android.resource">
	//    3    6:invokevirtual   #38  <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((Uri)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #74  <Class Uri>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #164 <Method boolean handles(Uri, Options)>
	//    5    9:ireturn         
	}

	private final Context context;
}
