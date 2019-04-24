// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package io.michaelrocks.libphonenumber.android:
//			MetadataLoader

public class AssetsMetadataLoader
	implements MetadataLoader
{

	public AssetsMetadataLoader(AssetManager assetmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		assetManager = assetmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field AssetManager assetManager>
	//    5    9:return          
	}

	public InputStream loadMetadata(String s)
	{
		s = s.substring(1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #26  <Method String String.substring(int)>
	//    3    5:astore_1        
		try
		{
			s = ((String) (assetManager.open(s)));
	//    4    6:aload_0         
	//    5    7:getfield        #15  <Field AssetManager assetManager>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method InputStream AssetManager.open(String)>
	//    8   14:astore_1        
		}
	//*   9   15:aload_1         
	//*  10   16:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  11   17:astore_1        
		{
			return null;
	//   12   18:aconst_null     
	//   13   19:areturn         
		}
		return ((InputStream) (s));
	}

	private final AssetManager assetManager;
}
