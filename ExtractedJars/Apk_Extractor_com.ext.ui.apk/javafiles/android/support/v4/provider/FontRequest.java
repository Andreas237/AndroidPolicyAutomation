// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.support.v4.util.Preconditions;
import android.util.Base64;
import java.util.List;

public final class FontRequest
{

	public FontRequest(String s, String s1, String s2, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mProviderAuthority = (String)Preconditions.checkNotNull(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #29  <Class String>
	//    6   12:putfield        #31  <Field String mProviderAuthority>
		mProviderPackage = (String)Preconditions.checkNotNull(((Object) (s1)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #29  <Class String>
	//   11   23:putfield        #33  <Field String mProviderPackage>
		mQuery = (String)Preconditions.checkNotNull(((Object) (s2)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//   15   31:checkcast       #29  <Class String>
	//   16   34:putfield        #35  <Field String mQuery>
		mCertificates = null;
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:putfield        #37  <Field List mCertificates>
		boolean flag;
		if(i != 0)
	//*  20   42:iload           4
	//*  21   44:ifeq            104
			flag = true;
	//   22   47:iconst_1        
	//   23   48:istore          5
		else
	//*  24   50:iload           5
	//*  25   52:invokestatic    #41  <Method void Preconditions.checkArgument(boolean)>
	//*  26   55:aload_0         
	//*  27   56:iload           4
	//*  28   58:putfield        #43  <Field int mCertificatesArray>
	//*  29   61:aload_0         
	//*  30   62:new             #45  <Class StringBuilder>
	//*  31   65:dup             
	//*  32   66:aload_0         
	//*  33   67:getfield        #31  <Field String mProviderAuthority>
	//*  34   70:invokespecial   #48  <Method void StringBuilder(String)>
	//*  35   73:ldc1            #50  <String "-">
	//*  36   75:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  37   78:aload_0         
	//*  38   79:getfield        #33  <Field String mProviderPackage>
	//*  39   82:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  40   85:ldc1            #50  <String "-">
	//*  41   87:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  42   90:aload_0         
	//*  43   91:getfield        #35  <Field String mQuery>
	//*  44   94:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  45   97:invokevirtual   #58  <Method String StringBuilder.toString()>
	//*  46  100:putfield        #60  <Field String mIdentifier>
	//*  47  103:return          
			flag = false;
	//   48  104:iconst_0        
	//   49  105:istore          5
		Preconditions.checkArgument(flag);
		mCertificatesArray = i;
		mIdentifier = (new StringBuilder(mProviderAuthority)).append("-").append(mProviderPackage).append("-").append(mQuery).toString();
	//*  50  107:goto            50
	}

	public FontRequest(String s, String s1, String s2, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mProviderAuthority = (String)Preconditions.checkNotNull(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #29  <Class String>
	//    6   12:putfield        #31  <Field String mProviderAuthority>
		mProviderPackage = (String)Preconditions.checkNotNull(((Object) (s1)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #29  <Class String>
	//   11   23:putfield        #33  <Field String mProviderPackage>
		mQuery = (String)Preconditions.checkNotNull(((Object) (s2)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//   15   31:checkcast       #29  <Class String>
	//   16   34:putfield        #35  <Field String mQuery>
		mCertificates = (List)Preconditions.checkNotNull(((Object) (list)));
	//   17   37:aload_0         
	//   18   38:aload           4
	//   19   40:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//   20   43:checkcast       #65  <Class List>
	//   21   46:putfield        #37  <Field List mCertificates>
		mCertificatesArray = 0;
	//   22   49:aload_0         
	//   23   50:iconst_0        
	//   24   51:putfield        #43  <Field int mCertificatesArray>
		mIdentifier = (new StringBuilder(mProviderAuthority)).append("-").append(mProviderPackage).append("-").append(mQuery).toString();
	//   25   54:aload_0         
	//   26   55:new             #45  <Class StringBuilder>
	//   27   58:dup             
	//   28   59:aload_0         
	//   29   60:getfield        #31  <Field String mProviderAuthority>
	//   30   63:invokespecial   #48  <Method void StringBuilder(String)>
	//   31   66:ldc1            #50  <String "-">
	//   32   68:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   33   71:aload_0         
	//   34   72:getfield        #33  <Field String mProviderPackage>
	//   35   75:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   36   78:ldc1            #50  <String "-">
	//   37   80:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   38   83:aload_0         
	//   39   84:getfield        #35  <Field String mQuery>
	//   40   87:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   41   90:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   42   93:putfield        #60  <Field String mIdentifier>
	//   43   96:return          
	}

	public List getCertificates()
	{
		return mCertificates;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List mCertificates>
	//    2    4:areturn         
	}

	public int getCertificatesArrayResId()
	{
		return mCertificatesArray;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mCertificatesArray>
	//    2    4:ireturn         
	}

	public String getIdentifier()
	{
		return mIdentifier;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String mIdentifier>
	//    2    4:areturn         
	}

	public String getProviderAuthority()
	{
		return mProviderAuthority;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String mProviderAuthority>
	//    2    4:areturn         
	}

	public String getProviderPackage()
	{
		return mProviderPackage;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mProviderPackage>
	//    2    4:areturn         
	}

	public String getQuery()
	{
		return mQuery;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String mQuery>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append((new StringBuilder()).append("FontRequest {mProviderAuthority: ").append(mProviderAuthority).append(", mProviderPackage: ").append(mProviderPackage).append(", mQuery: ").append(mQuery).append(", mCertificates:").toString());
	//    4    8:aload_3         
	//    5    9:new             #45  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #83  <Method void StringBuilder()>
	//    8   16:ldc1            #85  <String "FontRequest {mProviderAuthority: ">
	//    9   18:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:aload_0         
	//   11   22:getfield        #31  <Field String mProviderAuthority>
	//   12   25:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:ldc1            #87  <String ", mProviderPackage: ">
	//   14   30:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_0         
	//   16   34:getfield        #33  <Field String mProviderPackage>
	//   17   37:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:ldc1            #89  <String ", mQuery: ">
	//   19   42:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   20   45:aload_0         
	//   21   46:getfield        #35  <Field String mQuery>
	//   22   49:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   23   52:ldc1            #91  <String ", mCertificates:">
	//   24   54:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   25   57:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   26   60:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   63:pop             
		for(int i = 0; i < mCertificates.size(); i++)
	//*  28   64:iconst_0        
	//*  29   65:istore_1        
	//*  30   66:iload_1         
	//*  31   67:aload_0         
	//*  32   68:getfield        #37  <Field List mCertificates>
	//*  33   71:invokeinterface #94  <Method int List.size()>
	//*  34   76:icmpge          169
		{
			stringbuilder.append(" [");
	//   35   79:aload_3         
	//   36   80:ldc1            #96  <String " [">
	//   37   82:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   38   85:pop             
			List list = (List)mCertificates.get(i);
	//   39   86:aload_0         
	//   40   87:getfield        #37  <Field List mCertificates>
	//   41   90:iload_1         
	//   42   91:invokeinterface #100 <Method Object List.get(int)>
	//   43   96:checkcast       #65  <Class List>
	//   44   99:astore          4
			for(int j = 0; j < list.size(); j++)
	//*  45  101:iconst_0        
	//*  46  102:istore_2        
	//*  47  103:iload_2         
	//*  48  104:aload           4
	//*  49  106:invokeinterface #94  <Method int List.size()>
	//*  50  111:icmpge          155
			{
				stringbuilder.append(" \"");
	//   51  114:aload_3         
	//   52  115:ldc1            #102 <String " \"">
	//   53  117:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   54  120:pop             
				stringbuilder.append(Base64.encodeToString((byte[])list.get(j), 0));
	//   55  121:aload_3         
	//   56  122:aload           4
	//   57  124:iload_2         
	//   58  125:invokeinterface #100 <Method Object List.get(int)>
	//   59  130:checkcast       #104 <Class byte[]>
	//   60  133:iconst_0        
	//   61  134:invokestatic    #110 <Method String Base64.encodeToString(byte[], int)>
	//   62  137:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   63  140:pop             
				stringbuilder.append("\"");
	//   64  141:aload_3         
	//   65  142:ldc1            #112 <String "\"">
	//   66  144:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   67  147:pop             
			}

	//   68  148:iload_2         
	//   69  149:iconst_1        
	//   70  150:iadd            
	//   71  151:istore_2        
	//*  72  152:goto            103
			stringbuilder.append(" ]");
	//   73  155:aload_3         
	//   74  156:ldc1            #114 <String " ]">
	//   75  158:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   76  161:pop             
		}

	//   77  162:iload_1         
	//   78  163:iconst_1        
	//   79  164:iadd            
	//   80  165:istore_1        
	//*  81  166:goto            66
		stringbuilder.append("}");
	//   82  169:aload_3         
	//   83  170:ldc1            #116 <String "}">
	//   84  172:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   85  175:pop             
		stringbuilder.append((new StringBuilder()).append("mCertificatesArray: ").append(mCertificatesArray).toString());
	//   86  176:aload_3         
	//   87  177:new             #45  <Class StringBuilder>
	//   88  180:dup             
	//   89  181:invokespecial   #83  <Method void StringBuilder()>
	//   90  184:ldc1            #118 <String "mCertificatesArray: ">
	//   91  186:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   92  189:aload_0         
	//   93  190:getfield        #43  <Field int mCertificatesArray>
	//   94  193:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   95  196:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   96  199:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   97  202:pop             
		return stringbuilder.toString();
	//   98  203:aload_3         
	//   99  204:invokevirtual   #58  <Method String StringBuilder.toString()>
	//  100  207:areturn         
	}

	private final List mCertificates;
	private final int mCertificatesArray;
	private final String mIdentifier;
	private final String mProviderAuthority;
	private final String mProviderPackage;
	private final String mQuery;
}
