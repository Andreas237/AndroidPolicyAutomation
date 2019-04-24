// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.net;

import com.itextpdf.text.Image;
import com.itextpdf.tool.xml.net.exc.NoImageException;
import com.itextpdf.tool.xml.pipeline.html.ImageProvider;
import com.itextpdf.tool.xml.pipeline.html.UrlLinkResolver;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageRetrieve
{

	public ImageRetrieve()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		imageProvider = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field ImageProvider imageProvider>
		resourcesRootPath = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field String resourcesRootPath>
	//    8   14:return          
	}

	public ImageRetrieve(ImageProvider imageprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		imageProvider = imageprovider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field ImageProvider imageProvider>
		resourcesRootPath = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field String resourcesRootPath>
	//    8   14:return          
	}

	public ImageRetrieve(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		resourcesRootPath = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String resourcesRootPath>
		imageProvider = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #14  <Field ImageProvider imageProvider>
	//    8   14:return          
	}

	public ImageRetrieve(String s, ImageProvider imageprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		imageProvider = imageprovider;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #14  <Field ImageProvider imageProvider>
		resourcesRootPath = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #16  <Field String resourcesRootPath>
	//    8   14:return          
	}

	private URL getImageUrl(String s)
		throws MalformedURLException
	{
		UrlLinkResolver urllinkresolver = new UrlLinkResolver();
	//    0    0:new             #26  <Class UrlLinkResolver>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void UrlLinkResolver()>
	//    3    7:astore          4
		URL url = null;
	//    4    9:aconst_null     
	//    5   10:astore_2        
		if(imageProvider != null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #14  <Field ImageProvider imageProvider>
	//*   8   15:ifnull          39
		{
			urllinkresolver.setLocalRootPath(imageProvider.getImageRootPath());
	//    9   18:aload           4
	//   10   20:aload_0         
	//   11   21:getfield        #14  <Field ImageProvider imageProvider>
	//   12   24:invokeinterface #33  <Method String ImageProvider.getImageRootPath()>
	//   13   29:invokevirtual   #36  <Method void UrlLinkResolver.setLocalRootPath(String)>
			url = urllinkresolver.resolveUrl(s);
	//   14   32:aload           4
	//   15   34:aload_1         
	//   16   35:invokevirtual   #39  <Method URL UrlLinkResolver.resolveUrl(String)>
	//   17   38:astore_2        
		}
		URL url1 = url;
	//   18   39:aload_2         
	//   19   40:astore_3        
		if(url == null)
	//*  20   41:aload_2         
	//*  21   42:ifnonnull       61
		{
			urllinkresolver.setLocalRootPath(resourcesRootPath);
	//   22   45:aload           4
	//   23   47:aload_0         
	//   24   48:getfield        #16  <Field String resourcesRootPath>
	//   25   51:invokevirtual   #36  <Method void UrlLinkResolver.setLocalRootPath(String)>
			url1 = urllinkresolver.resolveUrl(s);
	//   26   54:aload           4
	//   27   56:aload_1         
	//   28   57:invokevirtual   #39  <Method URL UrlLinkResolver.resolveUrl(String)>
	//   29   60:astore_3        
		}
		return url1;
	//   30   61:aload_3         
	//   31   62:areturn         
	}

	private Image tryRetrieveImageWithImageProvider(String s)
	{
		if(imageProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ImageProvider imageProvider>
	//*   2    4:ifnull          18
			return imageProvider.retrieve(s);
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field ImageProvider imageProvider>
	//    5   11:aload_1         
	//    6   12:invokeinterface #45  <Method Image ImageProvider.retrieve(String)>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public Image retrieveImage(String s)
		throws NoImageException
	{
		Image image1 = tryRetrieveImageWithImageProvider(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method Image tryRetrieveImageWithImageProvider(String)>
	//    3    5:astore_3        
		Image image = image1;
	//    4    6:aload_3         
	//    5    7:astore_2        
		if(image1 == null)
	//*   6    8:aload_3         
	//*   7    9:ifnonnull       21
			try
			{
				image = Image.getInstance(getImageUrl(s));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokespecial   #54  <Method URL getImageUrl(String)>
	//   11   17:invokestatic    #60  <Method Image Image.getInstance(URL)>
	//   12   20:astore_2        
			}
	//*  13   21:aload_0         
	//*  14   22:getfield        #14  <Field ImageProvider imageProvider>
	//*  15   25:ifnull          43
	//*  16   28:aload_2         
	//*  17   29:ifnull          43
	//*  18   32:aload_0         
	//*  19   33:getfield        #14  <Field ImageProvider imageProvider>
	//*  20   36:aload_1         
	//*  21   37:aload_2         
	//*  22   38:invokeinterface #64  <Method void ImageProvider.store(String, Image)>
	//*  23   43:aload_2         
	//*  24   44:areturn         
			catch(Exception exception)
	//*  25   45:astore_2        
			{
				throw new NoImageException(s, exception);
	//   26   46:new             #48  <Class NoImageException>
	//   27   49:dup             
	//   28   50:aload_1         
	//   29   51:aload_2         
	//   30   52:invokespecial   #67  <Method void NoImageException(String, Exception)>
	//   31   55:athrow          
			}
		if(imageProvider != null && image != null)
			imageProvider.store(s, image);
		return image;
	}

	private final ImageProvider imageProvider;
	private String resourcesRootPath;
}
