// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.ae;
import java.util.List;

public final class ValidationResult
{

	public ValidationResult(String s, int i, long l, List list, String s1, String s2, 
			String s3, String s4, String s5)
	{
		ae.b(((Object) (s)), "instanceId");
	//    0    0:aload_1         
	//    1    1:ldc1            #27  <String "instanceId">
	//    2    3:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (list)), "redirectUrls");
	//    3    6:aload           5
	//    4    8:ldc1            #33  <String "redirectUrls">
	//    5   10:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s1)), "lastUrl");
	//    6   13:aload           6
	//    7   15:ldc1            #34  <String "lastUrl">
	//    8   17:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s2)), "lastHtml");
	//    9   20:aload           7
	//   10   22:ldc1            #35  <String "lastHtml">
	//   11   24:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s3)), "lastImage");
	//   12   27:aload           8
	//   13   29:ldc1            #36  <String "lastImage">
	//   14   31:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s4)), "publisherId");
	//   15   34:aload           9
	//   16   36:ldc1            #37  <String "publisherId">
	//   17   38:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s5)), "metaData");
	//   18   41:aload           10
	//   19   43:ldc1            #38  <String "metaData">
	//   20   45:invokestatic    #32  <Method void ae.b(Object, String)>
		super();
	//   21   48:aload_0         
	//   22   49:invokespecial   #41  <Method void Object()>
		instanceId = s;
	//   23   52:aload_0         
	//   24   53:aload_1         
	//   25   54:putfield        #43  <Field String instanceId>
		numOfRedirect = i;
	//   26   57:aload_0         
	//   27   58:iload_2         
	//   28   59:putfield        #45  <Field int numOfRedirect>
		sessionTime = l;
	//   29   62:aload_0         
	//   30   63:lload_3         
	//   31   64:putfield        #47  <Field long sessionTime>
		redirectUrls = list;
	//   32   67:aload_0         
	//   33   68:aload           5
	//   34   70:putfield        #49  <Field List redirectUrls>
		lastUrl = s1;
	//   35   73:aload_0         
	//   36   74:aload           6
	//   37   76:putfield        #51  <Field String lastUrl>
		lastHtml = s2;
	//   38   79:aload_0         
	//   39   80:aload           7
	//   40   82:putfield        #53  <Field String lastHtml>
		lastImage = s3;
	//   41   85:aload_0         
	//   42   86:aload           8
	//   43   88:putfield        #55  <Field String lastImage>
		publisherId = s4;
	//   44   91:aload_0         
	//   45   92:aload           9
	//   46   94:putfield        #57  <Field String publisherId>
		metaData = s5;
	//   47   97:aload_0         
	//   48   98:aload           10
	//   49  100:putfield        #59  <Field String metaData>
	//   50  103:return          
	}

	public static ValidationResult copy$default(ValidationResult validationresult, String s, int i, long l, List list, String s1, String s2, 
			String s3, String s4, String s5, int j, Object obj)
	{
		if((j & 1) != 0)
	//*   0    0:iload           11
	//*   1    2:iconst_1        
	//*   2    3:iand            
	//*   3    4:ifeq            166
			s = validationresult.instanceId;
	//    4    7:aload_0         
	//    5    8:getfield        #43  <Field String instanceId>
	//    6   11:astore_1        
		if((j & 2) != 0)
	//*   7   12:iload           11
	//*   8   14:iconst_2        
	//*   9   15:iand            
	//*  10   16:ifeq            163
			i = validationresult.numOfRedirect;
	//   11   19:aload_0         
	//   12   20:getfield        #45  <Field int numOfRedirect>
	//   13   23:istore_2        
		if((j & 4) != 0)
	//*  14   24:iload           11
	//*  15   26:iconst_4        
	//*  16   27:iand            
	//*  17   28:ifeq            160
			l = validationresult.sessionTime;
	//   18   31:aload_0         
	//   19   32:getfield        #47  <Field long sessionTime>
	//   20   35:lstore_3        
		if((j & 8) != 0)
	//*  21   36:iload           11
	//*  22   38:bipush          8
	//*  23   40:iand            
	//*  24   41:ifeq            157
			list = validationresult.redirectUrls;
	//   25   44:aload_0         
	//   26   45:getfield        #49  <Field List redirectUrls>
	//   27   48:astore          5
		if((j & 0x10) != 0)
	//*  28   50:iload           11
	//*  29   52:bipush          16
	//*  30   54:iand            
	//*  31   55:ifeq            154
			s1 = validationresult.lastUrl;
	//   32   58:aload_0         
	//   33   59:getfield        #51  <Field String lastUrl>
	//   34   62:astore          6
		if((j & 0x20) != 0)
	//*  35   64:iload           11
	//*  36   66:bipush          32
	//*  37   68:iand            
	//*  38   69:ifeq            151
			s2 = validationresult.lastHtml;
	//   39   72:aload_0         
	//   40   73:getfield        #53  <Field String lastHtml>
	//   41   76:astore          7
		if((j & 0x40) != 0)
	//*  42   78:iload           11
	//*  43   80:bipush          64
	//*  44   82:iand            
	//*  45   83:ifeq            148
			s3 = validationresult.lastImage;
	//   46   86:aload_0         
	//   47   87:getfield        #55  <Field String lastImage>
	//   48   90:astore          8
		if((j & 0x80) != 0)
	//*  49   92:iload           11
	//*  50   94:sipush          128
	//*  51   97:iand            
	//*  52   98:ifeq            145
			s4 = validationresult.publisherId;
	//   53  101:aload_0         
	//   54  102:getfield        #57  <Field String publisherId>
	//   55  105:astore          9
		if((j & 0x100) != 0)
	//*  56  107:iload           11
	//*  57  109:sipush          256
	//*  58  112:iand            
	//*  59  113:ifeq            142
			s5 = validationresult.metaData;
	//   60  116:aload_0         
	//   61  117:getfield        #59  <Field String metaData>
	//   62  120:astore          10
		return validationresult.copy(s, i, l, list, s1, s2, s3, s4, s5);
	//   63  122:aload_0         
	//   64  123:aload_1         
	//   65  124:iload_2         
	//   66  125:lload_3         
	//   67  126:aload           5
	//   68  128:aload           6
	//   69  130:aload           7
	//   70  132:aload           8
	//   71  134:aload           9
	//   72  136:aload           10
	//   73  138:invokevirtual   #69  <Method ValidationResult copy(String, int, long, List, String, String, String, String, String)>
	//   74  141:areturn         
	//*  75  142:goto            122
	//*  76  145:goto            107
	//*  77  148:goto            92
	//*  78  151:goto            78
	//*  79  154:goto            64
	//*  80  157:goto            50
	//*  81  160:goto            36
	//*  82  163:goto            24
	//*  83  166:goto            12
	}

	public final String component1()
	{
		return instanceId;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String instanceId>
	//    2    4:areturn         
	}

	public final int component2()
	{
		return numOfRedirect;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int numOfRedirect>
	//    2    4:ireturn         
	}

	public final long component3()
	{
		return sessionTime;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field long sessionTime>
	//    2    4:lreturn         
	}

	public final List component4()
	{
		return redirectUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field List redirectUrls>
	//    2    4:areturn         
	}

	public final String component5()
	{
		return lastUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String lastUrl>
	//    2    4:areturn         
	}

	public final String component6()
	{
		return lastHtml;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String lastHtml>
	//    2    4:areturn         
	}

	public final String component7()
	{
		return lastImage;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String lastImage>
	//    2    4:areturn         
	}

	public final String component8()
	{
		return publisherId;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String publisherId>
	//    2    4:areturn         
	}

	public final String component9()
	{
		return metaData;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String metaData>
	//    2    4:areturn         
	}

	public final ValidationResult copy(String s, int i, long l, List list, String s1, String s2, 
			String s3, String s4, String s5)
	{
		ae.b(((Object) (s)), "instanceId");
	//    0    0:aload_1         
	//    1    1:ldc1            #27  <String "instanceId">
	//    2    3:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (list)), "redirectUrls");
	//    3    6:aload           5
	//    4    8:ldc1            #33  <String "redirectUrls">
	//    5   10:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s1)), "lastUrl");
	//    6   13:aload           6
	//    7   15:ldc1            #34  <String "lastUrl">
	//    8   17:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s2)), "lastHtml");
	//    9   20:aload           7
	//   10   22:ldc1            #35  <String "lastHtml">
	//   11   24:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s3)), "lastImage");
	//   12   27:aload           8
	//   13   29:ldc1            #36  <String "lastImage">
	//   14   31:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s4)), "publisherId");
	//   15   34:aload           9
	//   16   36:ldc1            #37  <String "publisherId">
	//   17   38:invokestatic    #32  <Method void ae.b(Object, String)>
		ae.b(((Object) (s5)), "metaData");
	//   18   41:aload           10
	//   19   43:ldc1            #38  <String "metaData">
	//   20   45:invokestatic    #32  <Method void ae.b(Object, String)>
		return new ValidationResult(s, i, l, list, s1, s2, s3, s4, s5);
	//   21   48:new             #2   <Class ValidationResult>
	//   22   51:dup             
	//   23   52:aload_1         
	//   24   53:iload_2         
	//   25   54:lload_3         
	//   26   55:aload           5
	//   27   57:aload           6
	//   28   59:aload           7
	//   29   61:aload           8
	//   30   63:aload           9
	//   31   65:aload           10
	//   32   67:invokespecial   #86  <Method void ValidationResult(String, int, long, List, String, String, String, String, String)>
	//   33   70:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
			if(this != obj)
	//*   2    3:aload_0         
	//*   3    4:aload_1         
	//*   4    5:if_acmpeq       183
			{
				boolean flag1 = flag2;
	//    5    8:iload           4
	//    6   10:istore_3        
				if(!(obj instanceof ValidationResult))
					break label0;
	//    7   11:aload_1         
	//    8   12:instanceof      #2   <Class ValidationResult>
	//    9   15:ifeq            185
				obj = ((Object) ((ValidationResult)obj));
	//   10   18:aload_1         
	//   11   19:checkcast       #2   <Class ValidationResult>
	//   12   22:astore_1        
				flag1 = flag2;
	//   13   23:iload           4
	//   14   25:istore_3        
				if(!ae.a(((Object) (instanceId)), ((Object) (((ValidationResult) (obj)).instanceId))))
					break label0;
	//   15   26:aload_0         
	//   16   27:getfield        #43  <Field String instanceId>
	//   17   30:aload_1         
	//   18   31:getfield        #43  <Field String instanceId>
	//   19   34:invokestatic    #93  <Method boolean ae.a(Object, Object)>
	//   20   37:ifeq            185
				boolean flag;
				if(numOfRedirect == ((ValidationResult) (obj)).numOfRedirect)
	//*  21   40:aload_0         
	//*  22   41:getfield        #45  <Field int numOfRedirect>
	//*  23   44:aload_1         
	//*  24   45:getfield        #45  <Field int numOfRedirect>
	//*  25   48:icmpne          187
					flag = true;
	//   26   51:iconst_1        
	//   27   52:istore_2        
				else
	//*  28   53:iload           4
	//*  29   55:istore_3        
	//*  30   56:iload_2         
	//*  31   57:ifeq            185
	//*  32   60:aload_0         
	//*  33   61:getfield        #47  <Field long sessionTime>
	//*  34   64:aload_1         
	//*  35   65:getfield        #47  <Field long sessionTime>
	//*  36   68:lcmp            
	//*  37   69:ifne            192
	//*  38   72:iconst_1        
	//*  39   73:istore_2        
	//*  40   74:iload           4
	//*  41   76:istore_3        
	//*  42   77:iload_2         
	//*  43   78:ifeq            185
	//*  44   81:iload           4
	//*  45   83:istore_3        
	//*  46   84:aload_0         
	//*  47   85:getfield        #49  <Field List redirectUrls>
	//*  48   88:aload_1         
	//*  49   89:getfield        #49  <Field List redirectUrls>
	//*  50   92:invokestatic    #93  <Method boolean ae.a(Object, Object)>
	//*  51   95:ifeq            185
	//*  52   98:iload           4
	//*  53  100:istore_3        
	//*  54  101:aload_0         
	//*  55  102:getfield        #51  <Field String lastUrl>
	//*  56  105:aload_1         
	//*  57  106:getfield        #51  <Field String lastUrl>
	//*  58  109:invokestatic    #93  <Method boolean ae.a(Object, Object)>
	//*  59  112:ifeq            185
	//*  60  115:iload           4
	//*  61  117:istore_3        
	//*  62  118:aload_0         
	//*  63  119:getfield        #53  <Field String lastHtml>
	//*  64  122:aload_1         
	//*  65  123:getfield        #53  <Field String lastHtml>
	//*  66  126:invokestatic    #93  <Method boolean ae.a(Object, Object)>
	//*  67  129:ifeq            185
	//*  68  132:iload           4
	//*  69  134:istore_3        
	//*  70  135:aload_0         
	//*  71  136:getfield        #55  <Field String lastImage>
	//*  72  139:aload_1         
	//*  73  140:getfield        #55  <Field String lastImage>
	//*  74  143:invokestatic    #93  <Method boolean ae.a(Object, Object)>
	//*  75  146:ifeq            185
	//*  76  149:iload           4
	//*  77  151:istore_3        
	//*  78  152:aload_0         
	//*  79  153:getfield        #57  <Field String publisherId>
	//*  80  156:aload_1         
	//*  81  157:getfield        #57  <Field String publisherId>
	//*  82  160:invokestatic    #93  <Method boolean ae.a(Object, Object)>
	//*  83  163:ifeq            185
	//*  84  166:iload           4
	//*  85  168:istore_3        
	//*  86  169:aload_0         
	//*  87  170:getfield        #59  <Field String metaData>
	//*  88  173:aload_1         
	//*  89  174:getfield        #59  <Field String metaData>
	//*  90  177:invokestatic    #93  <Method boolean ae.a(Object, Object)>
	//*  91  180:ifeq            185
	//*  92  183:iconst_1        
	//*  93  184:istore_3        
	//*  94  185:iload_3         
	//*  95  186:ireturn         
					flag = false;
	//   96  187:iconst_0        
	//   97  188:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				if(sessionTime == ((ValidationResult) (obj)).sessionTime)
					flag = true;
				else
	//*  98  189:goto            53
					flag = false;
	//   99  192:iconst_0        
	//  100  193:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (redirectUrls)), ((Object) (((ValidationResult) (obj)).redirectUrls))))
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (lastUrl)), ((Object) (((ValidationResult) (obj)).lastUrl))))
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (lastHtml)), ((Object) (((ValidationResult) (obj)).lastHtml))))
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (lastImage)), ((Object) (((ValidationResult) (obj)).lastImage))))
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (publisherId)), ((Object) (((ValidationResult) (obj)).publisherId))))
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (metaData)), ((Object) (((ValidationResult) (obj)).metaData))))
					break label0;
			}
			flag1 = true;
		}
		return flag1;
	//* 101  194:goto            74
	}

	public final String getInstanceId()
	{
		return instanceId;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String instanceId>
	//    2    4:areturn         
	}

	public final String getLastHtml()
	{
		return lastHtml;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String lastHtml>
	//    2    4:areturn         
	}

	public final String getLastImage()
	{
		return lastImage;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String lastImage>
	//    2    4:areturn         
	}

	public final String getLastUrl()
	{
		return lastUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String lastUrl>
	//    2    4:areturn         
	}

	public final String getMetaData()
	{
		return metaData;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String metaData>
	//    2    4:areturn         
	}

	public final int getNumOfRedirect()
	{
		return numOfRedirect;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int numOfRedirect>
	//    2    4:ireturn         
	}

	public final String getPublisherId()
	{
		return publisherId;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String publisherId>
	//    2    4:areturn         
	}

	public final List getRedirectUrls()
	{
		return redirectUrls;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field List redirectUrls>
	//    2    4:areturn         
	}

	public final long getSessionTime()
	{
		return sessionTime;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field long sessionTime>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		int k1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          7
		Object obj = ((Object) (instanceId));
	//    2    3:aload_0         
	//    3    4:getfield        #43  <Field String instanceId>
	//    4    7:astore          12
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int l1;
		int i2;
		long l2;
		if(obj != null)
	//*   5    9:aload           12
	//*   6   11:ifnull          197
			i = obj.hashCode();
	//    7   14:aload           12
	//    8   16:invokevirtual   #105 <Method int Object.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:aload_0         
	//*  11   21:getfield        #45  <Field int numOfRedirect>
	//*  12   24:istore          8
	//*  13   26:aload_0         
	//*  14   27:getfield        #47  <Field long sessionTime>
	//*  15   30:lstore          10
	//*  16   32:lload           10
	//*  17   34:lload           10
	//*  18   36:bipush          32
	//*  19   38:lushr           
	//*  20   39:lxor            
	//*  21   40:l2i             
	//*  22   41:istore          9
	//*  23   43:aload_0         
	//*  24   44:getfield        #49  <Field List redirectUrls>
	//*  25   47:astore          12
	//*  26   49:aload           12
	//*  27   51:ifnull          202
	//*  28   54:aload           12
	//*  29   56:invokevirtual   #105 <Method int Object.hashCode()>
	//*  30   59:istore_2        
	//*  31   60:aload_0         
	//*  32   61:getfield        #51  <Field String lastUrl>
	//*  33   64:astore          12
	//*  34   66:aload           12
	//*  35   68:ifnull          207
	//*  36   71:aload           12
	//*  37   73:invokevirtual   #105 <Method int Object.hashCode()>
	//*  38   76:istore_3        
	//*  39   77:aload_0         
	//*  40   78:getfield        #53  <Field String lastHtml>
	//*  41   81:astore          12
	//*  42   83:aload           12
	//*  43   85:ifnull          212
	//*  44   88:aload           12
	//*  45   90:invokevirtual   #105 <Method int Object.hashCode()>
	//*  46   93:istore          4
	//*  47   95:aload_0         
	//*  48   96:getfield        #55  <Field String lastImage>
	//*  49   99:astore          12
	//*  50  101:aload           12
	//*  51  103:ifnull          218
	//*  52  106:aload           12
	//*  53  108:invokevirtual   #105 <Method int Object.hashCode()>
	//*  54  111:istore          5
	//*  55  113:aload_0         
	//*  56  114:getfield        #57  <Field String publisherId>
	//*  57  117:astore          12
	//*  58  119:aload           12
	//*  59  121:ifnull          224
	//*  60  124:aload           12
	//*  61  126:invokevirtual   #105 <Method int Object.hashCode()>
	//*  62  129:istore          6
	//*  63  131:aload_0         
	//*  64  132:getfield        #59  <Field String metaData>
	//*  65  135:astore          12
	//*  66  137:aload           12
	//*  67  139:ifnull          149
	//*  68  142:aload           12
	//*  69  144:invokevirtual   #105 <Method int Object.hashCode()>
	//*  70  147:istore          7
	//*  71  149:iload           6
	//*  72  151:iload           5
	//*  73  153:iload           4
	//*  74  155:iload_3         
	//*  75  156:iload_2         
	//*  76  157:iload_1         
	//*  77  158:bipush          31
	//*  78  160:imul            
	//*  79  161:iload           8
	//*  80  163:iadd            
	//*  81  164:bipush          31
	//*  82  166:imul            
	//*  83  167:iload           9
	//*  84  169:iadd            
	//*  85  170:bipush          31
	//*  86  172:imul            
	//*  87  173:iadd            
	//*  88  174:bipush          31
	//*  89  176:imul            
	//*  90  177:iadd            
	//*  91  178:bipush          31
	//*  92  180:imul            
	//*  93  181:iadd            
	//*  94  182:bipush          31
	//*  95  184:imul            
	//*  96  185:iadd            
	//*  97  186:bipush          31
	//*  98  188:imul            
	//*  99  189:iadd            
	//* 100  190:bipush          31
	//* 101  192:imul            
	//* 102  193:iload           7
	//* 103  195:iadd            
	//* 104  196:ireturn         
			i = 0;
	//  105  197:iconst_0        
	//  106  198:istore_1        
		l1 = numOfRedirect;
		l2 = sessionTime;
		i2 = (int)(l2 ^ l2 >>> 32);
		obj = ((Object) (redirectUrls));
		if(obj != null)
			j = obj.hashCode();
		else
	//* 107  199:goto            20
			j = 0;
	//  108  202:iconst_0        
	//  109  203:istore_2        
		obj = ((Object) (lastUrl));
		if(obj != null)
			k = obj.hashCode();
		else
	//* 110  204:goto            60
			k = 0;
	//  111  207:iconst_0        
	//  112  208:istore_3        
		obj = ((Object) (lastHtml));
		if(obj != null)
			l = obj.hashCode();
		else
	//* 113  209:goto            77
			l = 0;
	//  114  212:iconst_0        
	//  115  213:istore          4
		obj = ((Object) (lastImage));
		if(obj != null)
			i1 = obj.hashCode();
		else
	//* 116  215:goto            95
			i1 = 0;
	//  117  218:iconst_0        
	//  118  219:istore          5
		obj = ((Object) (publisherId));
		if(obj != null)
			j1 = obj.hashCode();
		else
	//* 119  221:goto            113
			j1 = 0;
	//  120  224:iconst_0        
	//  121  225:istore          6
		obj = ((Object) (metaData));
		if(obj != null)
			k1 = obj.hashCode();
		return (j1 + (i1 + (l + (k + (j + ((i * 31 + l1) * 31 + i2) * 31) * 31) * 31) * 31) * 31) * 31 + k1;
	//* 122  227:goto            131
	}

	public String toString()
	{
		return (new StringBuilder()).append("ValidationResult(instanceId=").append(instanceId).append(", numOfRedirect=").append(numOfRedirect).append(", sessionTime=").append(sessionTime).append(", redirectUrls=").append(((Object) (redirectUrls))).append(", lastUrl=").append(lastUrl).append(", lastHtml=").append(lastHtml).append(", lastImage=").append(lastImage).append(", publisherId=").append(publisherId).append(", metaData=").append(metaData).append(")").toString();
	//    0    0:new             #108 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #109 <Method void StringBuilder()>
	//    3    7:ldc1            #111 <String "ValidationResult(instanceId=">
	//    4    9:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #43  <Field String instanceId>
	//    7   16:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #117 <String ", numOfRedirect=">
	//    9   21:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #45  <Field int numOfRedirect>
	//   12   28:invokevirtual   #120 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #122 <String ", sessionTime=">
	//   14   33:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #47  <Field long sessionTime>
	//   17   40:invokevirtual   #125 <Method StringBuilder StringBuilder.append(long)>
	//   18   43:ldc1            #127 <String ", redirectUrls=">
	//   19   45:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #49  <Field List redirectUrls>
	//   22   52:invokevirtual   #130 <Method StringBuilder StringBuilder.append(Object)>
	//   23   55:ldc1            #132 <String ", lastUrl=">
	//   24   57:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #51  <Field String lastUrl>
	//   27   64:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   28   67:ldc1            #134 <String ", lastHtml=">
	//   29   69:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #53  <Field String lastHtml>
	//   32   76:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   33   79:ldc1            #136 <String ", lastImage=">
	//   34   81:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   35   84:aload_0         
	//   36   85:getfield        #55  <Field String lastImage>
	//   37   88:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   38   91:ldc1            #138 <String ", publisherId=">
	//   39   93:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   40   96:aload_0         
	//   41   97:getfield        #57  <Field String publisherId>
	//   42  100:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   43  103:ldc1            #140 <String ", metaData=">
	//   44  105:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   45  108:aload_0         
	//   46  109:getfield        #59  <Field String metaData>
	//   47  112:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   48  115:ldc1            #142 <String ")">
	//   49  117:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   50  120:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   51  123:areturn         
	}

	private final String instanceId;
	private final String lastHtml;
	private final String lastImage;
	private final String lastUrl;
	private final String metaData;
	private final int numOfRedirect;
	private final String publisherId;
	private final List redirectUrls;
	private final long sessionTime;
}
