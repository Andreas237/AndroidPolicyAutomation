// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.cards;

import bo.app.*;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models.cards:
//			Card

public final class BannerImageCard extends Card
{

	public BannerImageCard(JSONObject jsonobject)
	{
		this(jsonobject, ((bf) (null)), ((dc) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #15  <Method void BannerImageCard(JSONObject, bf, dc)>
	//    5    7:return          
	}

	public BannerImageCard(JSONObject jsonobject, bf bf, dc dc)
	{
		super(jsonobject, ((bo.app.bl) (bf)), dc);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #19  <Method void Card(JSONObject, bo.app.bl, dc)>
		k = jsonobject.getString("image");
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:ldc1            #21  <String "image">
	//    8   11:invokevirtual   #27  <Method String JSONObject.getString(String)>
	//    9   14:putfield        #29  <Field String k>
		l = dt.a(jsonobject, "url");
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:ldc1            #31  <String "url">
	//   13   21:invokestatic    #37  <Method String dt.a(JSONObject, String)>
	//   14   24:putfield        #39  <Field String l>
		m = dt.a(jsonobject, "domain");
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:ldc1            #41  <String "domain">
	//   18   31:invokestatic    #37  <Method String dt.a(JSONObject, String)>
	//   19   34:putfield        #43  <Field String m>
		n = (float)jsonobject.optDouble("aspect_ratio", 0.0D);
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:ldc1            #45  <String "aspect_ratio">
	//   23   41:dconst_0        
	//   24   42:invokevirtual   #49  <Method double JSONObject.optDouble(String, double)>
	//   25   45:d2f             
	//   26   46:putfield        #51  <Field float n>
	//   27   49:return          
	}

	public float getAspectRatio()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field float n>
	//    2    4:freturn         
	}

	public String getDomain()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String m>
	//    2    4:areturn         
	}

	public String getImageUrl()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String k>
	//    2    4:areturn         
	}

	public String getUrl()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String l>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("BannerImageCard{mId='");
	//    4    8:aload_1         
	//    5    9:ldc1            #65  <String "BannerImageCard{mId='">
	//    6   11:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(c);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #72  <Field String c>
	//   11   20:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", mViewed='");
	//   17   31:aload_1         
	//   18   32:ldc1            #77  <String ", mViewed='">
	//   19   34:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(d);
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #81  <Field boolean d>
	//   24   43:invokevirtual   #84  <Method StringBuilder StringBuilder.append(boolean)>
	//   25   46:pop             
		stringbuilder.append('\'');
	//   26   47:aload_1         
	//   27   48:bipush          39
	//   28   50:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   29   53:pop             
		stringbuilder.append(", mCreated='");
	//   30   54:aload_1         
	//   31   55:ldc1            #86  <String ", mCreated='">
	//   32   57:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
		stringbuilder.append(f);
	//   34   61:aload_1         
	//   35   62:aload_0         
	//   36   63:getfield        #90  <Field long f>
	//   37   66:invokevirtual   #93  <Method StringBuilder StringBuilder.append(long)>
	//   38   69:pop             
		stringbuilder.append('\'');
	//   39   70:aload_1         
	//   40   71:bipush          39
	//   41   73:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   42   76:pop             
		stringbuilder.append(", mUpdated='");
	//   43   77:aload_1         
	//   44   78:ldc1            #95  <String ", mUpdated='">
	//   45   80:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   46   83:pop             
		stringbuilder.append(g);
	//   47   84:aload_1         
	//   48   85:aload_0         
	//   49   86:getfield        #98  <Field long g>
	//   50   89:invokevirtual   #93  <Method StringBuilder StringBuilder.append(long)>
	//   51   92:pop             
		stringbuilder.append('\'');
	//   52   93:aload_1         
	//   53   94:bipush          39
	//   54   96:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   55   99:pop             
		stringbuilder.append(", mImageUrl='");
	//   56  100:aload_1         
	//   57  101:ldc1            #100 <String ", mImageUrl='">
	//   58  103:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   59  106:pop             
		stringbuilder.append(k);
	//   60  107:aload_1         
	//   61  108:aload_0         
	//   62  109:getfield        #29  <Field String k>
	//   63  112:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   64  115:pop             
		stringbuilder.append('\'');
	//   65  116:aload_1         
	//   66  117:bipush          39
	//   67  119:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   68  122:pop             
		stringbuilder.append(", mUrl='");
	//   69  123:aload_1         
	//   70  124:ldc1            #102 <String ", mUrl='">
	//   71  126:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   72  129:pop             
		stringbuilder.append(l);
	//   73  130:aload_1         
	//   74  131:aload_0         
	//   75  132:getfield        #39  <Field String l>
	//   76  135:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   77  138:pop             
		stringbuilder.append('\'');
	//   78  139:aload_1         
	//   79  140:bipush          39
	//   80  142:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   81  145:pop             
		stringbuilder.append(", mDomain='");
	//   82  146:aload_1         
	//   83  147:ldc1            #104 <String ", mDomain='">
	//   84  149:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   85  152:pop             
		stringbuilder.append(m);
	//   86  153:aload_1         
	//   87  154:aload_0         
	//   88  155:getfield        #43  <Field String m>
	//   89  158:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   90  161:pop             
		stringbuilder.append('\'');
	//   91  162:aload_1         
	//   92  163:bipush          39
	//   93  165:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   94  168:pop             
		stringbuilder.append(", mAspectRatio='");
	//   95  169:aload_1         
	//   96  170:ldc1            #106 <String ", mAspectRatio='">
	//   97  172:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   98  175:pop             
		stringbuilder.append(n);
	//   99  176:aload_1         
	//  100  177:aload_0         
	//  101  178:getfield        #51  <Field float n>
	//  102  181:invokevirtual   #109 <Method StringBuilder StringBuilder.append(float)>
	//  103  184:pop             
		stringbuilder.append('\'');
	//  104  185:aload_1         
	//  105  186:bipush          39
	//  106  188:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//  107  191:pop             
		stringbuilder.append("}");
	//  108  192:aload_1         
	//  109  193:ldc1            #111 <String "}">
	//  110  195:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//  111  198:pop             
		return stringbuilder.toString();
	//  112  199:aload_1         
	//  113  200:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  114  203:areturn         
	}

	private final String k;
	private final String l;
	private final String m;
	private final float n;
}
