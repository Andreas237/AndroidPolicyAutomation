// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.ae;

public final class Link
{

	public Link()
	{
		this("", "", "", "", "");
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "">
	//    2    3:ldc1            #15  <String "">
	//    3    5:ldc1            #15  <String "">
	//    4    7:ldc1            #15  <String "">
	//    5    9:ldc1            #15  <String "">
	//    6   11:invokespecial   #18  <Method void Link(String, String, String, String, String)>
	//    7   14:return          
	}

	public Link(String s, String s1, String s2, String s3, String s4)
	{
		ae.b(((Object) (s)), "instanceId");
	//    0    0:aload_1         
	//    1    1:ldc1            #20  <String "instanceId">
	//    2    3:invokestatic    #26  <Method void ae.b(Object, String)>
		ae.b(((Object) (s1)), "validationUrl");
	//    3    6:aload_2         
	//    4    7:ldc1            #27  <String "validationUrl">
	//    5    9:invokestatic    #26  <Method void ae.b(Object, String)>
		ae.b(((Object) (s2)), "imageStorage");
	//    6   12:aload_3         
	//    7   13:ldc1            #28  <String "imageStorage">
	//    8   15:invokestatic    #26  <Method void ae.b(Object, String)>
		ae.b(((Object) (s3)), "htmlStorage");
	//    9   18:aload           4
	//   10   20:ldc1            #29  <String "htmlStorage">
	//   11   22:invokestatic    #26  <Method void ae.b(Object, String)>
		ae.b(((Object) (s4)), "metaData");
	//   12   25:aload           5
	//   13   27:ldc1            #30  <String "metaData">
	//   14   29:invokestatic    #26  <Method void ae.b(Object, String)>
		super();
	//   15   32:aload_0         
	//   16   33:invokespecial   #32  <Method void Object()>
		instanceId = s;
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:putfield        #34  <Field String instanceId>
		validationUrl = s1;
	//   20   41:aload_0         
	//   21   42:aload_2         
	//   22   43:putfield        #36  <Field String validationUrl>
		imageStorage = s2;
	//   23   46:aload_0         
	//   24   47:aload_3         
	//   25   48:putfield        #38  <Field String imageStorage>
		htmlStorage = s3;
	//   26   51:aload_0         
	//   27   52:aload           4
	//   28   54:putfield        #40  <Field String htmlStorage>
		metaData = s4;
	//   29   57:aload_0         
	//   30   58:aload           5
	//   31   60:putfield        #42  <Field String metaData>
	//   32   63:return          
	}

	public static Link copy$default(Link link, String s, String s1, String s2, String s3, String s4, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload           6
	//*   1    2:iconst_1        
	//*   2    3:iand            
	//*   3    4:ifeq            88
			s = link.instanceId;
	//    4    7:aload_0         
	//    5    8:getfield        #34  <Field String instanceId>
	//    6   11:astore_1        
		if((i & 2) != 0)
	//*   7   12:iload           6
	//*   8   14:iconst_2        
	//*   9   15:iand            
	//*  10   16:ifeq            85
			s1 = link.validationUrl;
	//   11   19:aload_0         
	//   12   20:getfield        #36  <Field String validationUrl>
	//   13   23:astore_2        
		if((i & 4) != 0)
	//*  14   24:iload           6
	//*  15   26:iconst_4        
	//*  16   27:iand            
	//*  17   28:ifeq            82
			s2 = link.imageStorage;
	//   18   31:aload_0         
	//   19   32:getfield        #38  <Field String imageStorage>
	//   20   35:astore_3        
		if((i & 8) != 0)
	//*  21   36:iload           6
	//*  22   38:bipush          8
	//*  23   40:iand            
	//*  24   41:ifeq            79
			s3 = link.htmlStorage;
	//   25   44:aload_0         
	//   26   45:getfield        #40  <Field String htmlStorage>
	//   27   48:astore          4
		if((i & 0x10) != 0)
	//*  28   50:iload           6
	//*  29   52:bipush          16
	//*  30   54:iand            
	//*  31   55:ifeq            76
			s4 = link.metaData;
	//   32   58:aload_0         
	//   33   59:getfield        #42  <Field String metaData>
	//   34   62:astore          5
		return link.copy(s, s1, s2, s3, s4);
	//   35   64:aload_0         
	//   36   65:aload_1         
	//   37   66:aload_2         
	//   38   67:aload_3         
	//   39   68:aload           4
	//   40   70:aload           5
	//   41   72:invokevirtual   #49  <Method Link copy(String, String, String, String, String)>
	//   42   75:areturn         
	//*  43   76:goto            64
	//*  44   79:goto            50
	//*  45   82:goto            36
	//*  46   85:goto            24
	//*  47   88:goto            12
	}

	public final String component1()
	{
		return instanceId;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String instanceId>
	//    2    4:areturn         
	}

	public final String component2()
	{
		return validationUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String validationUrl>
	//    2    4:areturn         
	}

	public final String component3()
	{
		return imageStorage;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String imageStorage>
	//    2    4:areturn         
	}

	public final String component4()
	{
		return htmlStorage;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String htmlStorage>
	//    2    4:areturn         
	}

	public final String component5()
	{
		return metaData;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String metaData>
	//    2    4:areturn         
	}

	public final Link copy(String s, String s1, String s2, String s3, String s4)
	{
		ae.b(((Object) (s)), "instanceId");
	//    0    0:aload_1         
	//    1    1:ldc1            #20  <String "instanceId">
	//    2    3:invokestatic    #26  <Method void ae.b(Object, String)>
		ae.b(((Object) (s1)), "validationUrl");
	//    3    6:aload_2         
	//    4    7:ldc1            #27  <String "validationUrl">
	//    5    9:invokestatic    #26  <Method void ae.b(Object, String)>
		ae.b(((Object) (s2)), "imageStorage");
	//    6   12:aload_3         
	//    7   13:ldc1            #28  <String "imageStorage">
	//    8   15:invokestatic    #26  <Method void ae.b(Object, String)>
		ae.b(((Object) (s3)), "htmlStorage");
	//    9   18:aload           4
	//   10   20:ldc1            #29  <String "htmlStorage">
	//   11   22:invokestatic    #26  <Method void ae.b(Object, String)>
		ae.b(((Object) (s4)), "metaData");
	//   12   25:aload           5
	//   13   27:ldc1            #30  <String "metaData">
	//   14   29:invokestatic    #26  <Method void ae.b(Object, String)>
		return new Link(s, s1, s2, s3, s4);
	//   15   32:new             #2   <Class Link>
	//   16   35:dup             
	//   17   36:aload_1         
	//   18   37:aload_2         
	//   19   38:aload_3         
	//   20   39:aload           4
	//   21   41:aload           5
	//   22   43:invokespecial   #18  <Method void Link(String, String, String, String, String)>
	//   23   46:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpeq       87
			{
				if(!(obj instanceof Link))
					break label0;
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class Link>
	//    5    9:ifeq            89
				obj = ((Object) ((Link)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class Link>
	//    8   16:astore_1        
				if(!ae.a(((Object) (instanceId)), ((Object) (((Link) (obj)).instanceId))) || !ae.a(((Object) (validationUrl)), ((Object) (((Link) (obj)).validationUrl))) || !ae.a(((Object) (imageStorage)), ((Object) (((Link) (obj)).imageStorage))) || !ae.a(((Object) (htmlStorage)), ((Object) (((Link) (obj)).htmlStorage))) || !ae.a(((Object) (metaData)), ((Object) (((Link) (obj)).metaData))))
					break label0;
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field String instanceId>
	//   11   21:aload_1         
	//   12   22:getfield        #34  <Field String instanceId>
	//   13   25:invokestatic    #62  <Method boolean ae.a(Object, Object)>
	//   14   28:ifeq            89
	//   15   31:aload_0         
	//   16   32:getfield        #36  <Field String validationUrl>
	//   17   35:aload_1         
	//   18   36:getfield        #36  <Field String validationUrl>
	//   19   39:invokestatic    #62  <Method boolean ae.a(Object, Object)>
	//   20   42:ifeq            89
	//   21   45:aload_0         
	//   22   46:getfield        #38  <Field String imageStorage>
	//   23   49:aload_1         
	//   24   50:getfield        #38  <Field String imageStorage>
	//   25   53:invokestatic    #62  <Method boolean ae.a(Object, Object)>
	//   26   56:ifeq            89
	//   27   59:aload_0         
	//   28   60:getfield        #40  <Field String htmlStorage>
	//   29   63:aload_1         
	//   30   64:getfield        #40  <Field String htmlStorage>
	//   31   67:invokestatic    #62  <Method boolean ae.a(Object, Object)>
	//   32   70:ifeq            89
	//   33   73:aload_0         
	//   34   74:getfield        #42  <Field String metaData>
	//   35   77:aload_1         
	//   36   78:getfield        #42  <Field String metaData>
	//   37   81:invokestatic    #62  <Method boolean ae.a(Object, Object)>
	//   38   84:ifeq            89
			}
			return true;
	//   39   87:iconst_1        
	//   40   88:ireturn         
		}
		return false;
	//   41   89:iconst_0        
	//   42   90:ireturn         
	}

	public final String getHtmlStorage()
	{
		return htmlStorage;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String htmlStorage>
	//    2    4:areturn         
	}

	public final String getImageStorage()
	{
		return imageStorage;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String imageStorage>
	//    2    4:areturn         
	}

	public final String getInstanceId()
	{
		return instanceId;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String instanceId>
	//    2    4:areturn         
	}

	public final String getMetaData()
	{
		return metaData;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String metaData>
	//    2    4:areturn         
	}

	public final String getValidationUrl()
	{
		return validationUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String validationUrl>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		String s = instanceId;
	//    2    3:aload_0         
	//    3    4:getfield        #34  <Field String instanceId>
	//    4    7:astore          6
		int i;
		int j;
		int k;
		int l;
		if(s != null)
	//*   5    9:aload           6
	//*   6   11:ifnull          114
			i = ((Object) (s)).hashCode();
	//    7   14:aload           6
	//    8   16:invokevirtual   #71  <Method int Object.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:aload_0         
	//*  11   21:getfield        #36  <Field String validationUrl>
	//*  12   24:astore          6
	//*  13   26:aload           6
	//*  14   28:ifnull          119
	//*  15   31:aload           6
	//*  16   33:invokevirtual   #71  <Method int Object.hashCode()>
	//*  17   36:istore_2        
	//*  18   37:aload_0         
	//*  19   38:getfield        #38  <Field String imageStorage>
	//*  20   41:astore          6
	//*  21   43:aload           6
	//*  22   45:ifnull          124
	//*  23   48:aload           6
	//*  24   50:invokevirtual   #71  <Method int Object.hashCode()>
	//*  25   53:istore_3        
	//*  26   54:aload_0         
	//*  27   55:getfield        #40  <Field String htmlStorage>
	//*  28   58:astore          6
	//*  29   60:aload           6
	//*  30   62:ifnull          129
	//*  31   65:aload           6
	//*  32   67:invokevirtual   #71  <Method int Object.hashCode()>
	//*  33   70:istore          4
	//*  34   72:aload_0         
	//*  35   73:getfield        #42  <Field String metaData>
	//*  36   76:astore          6
	//*  37   78:aload           6
	//*  38   80:ifnull          90
	//*  39   83:aload           6
	//*  40   85:invokevirtual   #71  <Method int Object.hashCode()>
	//*  41   88:istore          5
	//*  42   90:iload           4
	//*  43   92:iload_3         
	//*  44   93:iload_2         
	//*  45   94:iload_1         
	//*  46   95:bipush          31
	//*  47   97:imul            
	//*  48   98:iadd            
	//*  49   99:bipush          31
	//*  50  101:imul            
	//*  51  102:iadd            
	//*  52  103:bipush          31
	//*  53  105:imul            
	//*  54  106:iadd            
	//*  55  107:bipush          31
	//*  56  109:imul            
	//*  57  110:iload           5
	//*  58  112:iadd            
	//*  59  113:ireturn         
			i = 0;
	//   60  114:iconst_0        
	//   61  115:istore_1        
		s = validationUrl;
		if(s != null)
			j = ((Object) (s)).hashCode();
		else
	//*  62  116:goto            20
			j = 0;
	//   63  119:iconst_0        
	//   64  120:istore_2        
		s = imageStorage;
		if(s != null)
			k = ((Object) (s)).hashCode();
		else
	//*  65  121:goto            37
			k = 0;
	//   66  124:iconst_0        
	//   67  125:istore_3        
		s = htmlStorage;
		if(s != null)
			l = ((Object) (s)).hashCode();
		else
	//*  68  126:goto            54
			l = 0;
	//   69  129:iconst_0        
	//   70  130:istore          4
		s = metaData;
		if(s != null)
			i1 = ((Object) (s)).hashCode();
		return (l + (k + (j + i * 31) * 31) * 31) * 31 + i1;
	//*  71  132:goto            72
	}

	public String toString()
	{
		return (new StringBuilder()).append("Link(instanceId=").append(instanceId).append(", validationUrl=").append(validationUrl).append(", imageStorage=").append(imageStorage).append(", htmlStorage=").append(htmlStorage).append(", metaData=").append(metaData).append(")").toString();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:ldc1            #77  <String "Link(instanceId=">
	//    4    9:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #34  <Field String instanceId>
	//    7   16:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #83  <String ", validationUrl=">
	//    9   21:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #36  <Field String validationUrl>
	//   12   28:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #85  <String ", imageStorage=">
	//   14   33:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #38  <Field String imageStorage>
	//   17   40:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:ldc1            #87  <String ", htmlStorage=">
	//   19   45:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #40  <Field String htmlStorage>
	//   22   52:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   23   55:ldc1            #89  <String ", metaData=">
	//   24   57:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #42  <Field String metaData>
	//   27   64:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   28   67:ldc1            #91  <String ")">
	//   29   69:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   30   72:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   31   75:areturn         
	}

	private final String htmlStorage;
	private final String imageStorage;
	private final String instanceId;
	private final String metaData;
	private final String validationUrl;
}
