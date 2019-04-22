// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.support.v4.util.Preconditions;
import android.util.Base64;
import java.util.List;

public final class FontRequest
{

	public FontRequest(String s, String s1, String s2, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mProviderAuthority = (String)Preconditions.checkNotNull(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #28  <Class String>
	//    6   12:putfield        #30  <Field String mProviderAuthority>
		mProviderPackage = (String)Preconditions.checkNotNull(((Object) (s1)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #28  <Class String>
	//   11   23:putfield        #32  <Field String mProviderPackage>
		mQuery = (String)Preconditions.checkNotNull(((Object) (s2)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object)>
	//   15   31:checkcast       #28  <Class String>
	//   16   34:putfield        #34  <Field String mQuery>
		mCertificates = (List)Preconditions.checkNotNull(((Object) (list)));
	//   17   37:aload_0         
	//   18   38:aload           4
	//   19   40:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object)>
	//   20   43:checkcast       #36  <Class List>
	//   21   46:putfield        #38  <Field List mCertificates>
	//   22   49:aload_0         
	//   23   50:iconst_0        
	//   24   51:putfield        #40  <Field int mCertificatesArray>
		s = ((String) (new StringBuilder(mProviderAuthority)));
	//   25   54:new             #42  <Class StringBuilder>
	//   26   57:dup             
	//   27   58:aload_0         
	//   28   59:getfield        #30  <Field String mProviderAuthority>
	//   29   62:invokespecial   #45  <Method void StringBuilder(String)>
	//   30   65:astore_1        
		((StringBuilder) (s)).append("-");
	//   31   66:aload_1         
	//   32   67:ldc1            #47  <String "-">
	//   33   69:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		((StringBuilder) (s)).append(mProviderPackage);
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:getfield        #32  <Field String mProviderPackage>
	//   38   78:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
		((StringBuilder) (s)).append("-");
	//   40   82:aload_1         
	//   41   83:ldc1            #47  <String "-">
	//   42   85:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   43   88:pop             
		((StringBuilder) (s)).append(mQuery);
	//   44   89:aload_1         
	//   45   90:aload_0         
	//   46   91:getfield        #34  <Field String mQuery>
	//   47   94:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   48   97:pop             
		mIdentifier = ((StringBuilder) (s)).toString();
	//   49   98:aload_0         
	//   50   99:aload_1         
	//   51  100:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   52  103:putfield        #57  <Field String mIdentifier>
	//   53  106:return          
	}

	public List getCertificates()
	{
		return mCertificates;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List mCertificates>
	//    2    4:areturn         
	}

	public int getCertificatesArrayResId()
	{
		return mCertificatesArray;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int mCertificatesArray>
	//    2    4:ireturn         
	}

	public String getIdentifier()
	{
		return mIdentifier;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String mIdentifier>
	//    2    4:areturn         
	}

	public String getProviderAuthority()
	{
		return mProviderAuthority;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String mProviderAuthority>
	//    2    4:areturn         
	}

	public String getProviderPackage()
	{
		return mProviderPackage;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String mProviderPackage>
	//    2    4:areturn         
	}

	public String getQuery()
	{
		return mQuery;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String mQuery>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void StringBuilder()>
	//    3    7:astore_3        
		Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #42  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #78  <Method void StringBuilder()>
	//    7   15:astore          4
		((StringBuilder) (obj)).append("FontRequest {mProviderAuthority: ");
	//    8   17:aload           4
	//    9   19:ldc1            #80  <String "FontRequest {mProviderAuthority: ">
	//   10   21:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		((StringBuilder) (obj)).append(mProviderAuthority);
	//   12   25:aload           4
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field String mProviderAuthority>
	//   15   31:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		((StringBuilder) (obj)).append(", mProviderPackage: ");
	//   17   35:aload           4
	//   18   37:ldc1            #82  <String ", mProviderPackage: ">
	//   19   39:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
		((StringBuilder) (obj)).append(mProviderPackage);
	//   21   43:aload           4
	//   22   45:aload_0         
	//   23   46:getfield        #32  <Field String mProviderPackage>
	//   24   49:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(", mQuery: ");
	//   26   53:aload           4
	//   27   55:ldc1            #84  <String ", mQuery: ">
	//   28   57:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		((StringBuilder) (obj)).append(mQuery);
	//   30   61:aload           4
	//   31   63:aload_0         
	//   32   64:getfield        #34  <Field String mQuery>
	//   33   67:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
		((StringBuilder) (obj)).append(", mCertificates:");
	//   35   71:aload           4
	//   36   73:ldc1            #86  <String ", mCertificates:">
	//   37   75:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
		stringbuilder.append(((StringBuilder) (obj)).toString());
	//   39   79:aload_3         
	//   40   80:aload           4
	//   41   82:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   42   85:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   43   88:pop             
		for(int i = 0; i < mCertificates.size(); i++)
	//*  44   89:iconst_0        
	//*  45   90:istore_1        
	//*  46   91:iload_1         
	//*  47   92:aload_0         
	//*  48   93:getfield        #38  <Field List mCertificates>
	//*  49   96:invokeinterface #89  <Method int List.size()>
	//*  50  101:icmpge          194
		{
			stringbuilder.append(" [");
	//   51  104:aload_3         
	//   52  105:ldc1            #91  <String " [">
	//   53  107:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   54  110:pop             
			obj = ((Object) ((List)mCertificates.get(i)));
	//   55  111:aload_0         
	//   56  112:getfield        #38  <Field List mCertificates>
	//   57  115:iload_1         
	//   58  116:invokeinterface #95  <Method Object List.get(int)>
	//   59  121:checkcast       #36  <Class List>
	//   60  124:astore          4
			for(int j = 0; j < ((List) (obj)).size(); j++)
	//*  61  126:iconst_0        
	//*  62  127:istore_2        
	//*  63  128:iload_2         
	//*  64  129:aload           4
	//*  65  131:invokeinterface #89  <Method int List.size()>
	//*  66  136:icmpge          180
			{
				stringbuilder.append(" \"");
	//   67  139:aload_3         
	//   68  140:ldc1            #97  <String " \"">
	//   69  142:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   70  145:pop             
				stringbuilder.append(Base64.encodeToString((byte[])((List) (obj)).get(j), 0));
	//   71  146:aload_3         
	//   72  147:aload           4
	//   73  149:iload_2         
	//   74  150:invokeinterface #95  <Method Object List.get(int)>
	//   75  155:checkcast       #99  <Class byte[]>
	//   76  158:iconst_0        
	//   77  159:invokestatic    #105 <Method String Base64.encodeToString(byte[], int)>
	//   78  162:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   79  165:pop             
				stringbuilder.append("\"");
	//   80  166:aload_3         
	//   81  167:ldc1            #107 <String "\"">
	//   82  169:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   83  172:pop             
			}

	//   84  173:iload_2         
	//   85  174:iconst_1        
	//   86  175:iadd            
	//   87  176:istore_2        
	//*  88  177:goto            128
			stringbuilder.append(" ]");
	//   89  180:aload_3         
	//   90  181:ldc1            #109 <String " ]">
	//   91  183:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   92  186:pop             
		}

	//   93  187:iload_1         
	//   94  188:iconst_1        
	//   95  189:iadd            
	//   96  190:istore_1        
	//*  97  191:goto            91
		stringbuilder.append("}");
	//   98  194:aload_3         
	//   99  195:ldc1            #111 <String "}">
	//  100  197:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  101  200:pop             
		obj = ((Object) (new StringBuilder()));
	//  102  201:new             #42  <Class StringBuilder>
	//  103  204:dup             
	//  104  205:invokespecial   #78  <Method void StringBuilder()>
	//  105  208:astore          4
		((StringBuilder) (obj)).append("mCertificatesArray: ");
	//  106  210:aload           4
	//  107  212:ldc1            #113 <String "mCertificatesArray: ">
	//  108  214:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  109  217:pop             
		((StringBuilder) (obj)).append(mCertificatesArray);
	//  110  218:aload           4
	//  111  220:aload_0         
	//  112  221:getfield        #40  <Field int mCertificatesArray>
	//  113  224:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//  114  227:pop             
		stringbuilder.append(((StringBuilder) (obj)).toString());
	//  115  228:aload_3         
	//  116  229:aload           4
	//  117  231:invokevirtual   #55  <Method String StringBuilder.toString()>
	//  118  234:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  119  237:pop             
		return stringbuilder.toString();
	//  120  238:aload_3         
	//  121  239:invokevirtual   #55  <Method String StringBuilder.toString()>
	//  122  242:areturn         
	}

	private final List mCertificates;
	private final int mCertificatesArray = 0;
	private final String mIdentifier;
	private final String mProviderAuthority;
	private final String mProviderPackage;
	private final String mQuery;
}
