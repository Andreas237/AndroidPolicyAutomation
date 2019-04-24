// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.a;

import com.gigya.socialize.*;
import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.*;

// Referenced classes of package com.irobot.home.a:
//			a

class a$4
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		obj = ((Object) (new HashSet()));
	//    0    0:new             #28  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void HashSet()>
	//    3    7:astore_3        
		boolean flag;
		if(gsresponse != null && gsresponse.getErrorCode() == 0)
	//*   4    8:aload_2         
	//*   5    9:ifnull          25
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #35  <Method int GSResponse.getErrorCode()>
	//*   8   16:ifne            25
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore          4
		else
	//*  11   22:goto            28
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore          4
		if(flag)
	//*  14   28:iload           4
	//*  15   30:ifeq            158
		{
			o.b(com.irobot.home.a.a.b(), "Account schema fetched successfully.");
	//   16   33:invokestatic    #38  <Method String a.b()>
	//   17   36:ldc1            #40  <String "Account schema fetched successfully.">
	//   18   38:invokestatic    #45  <Method void o.b(String, String)>
			s = ((String) (Arrays.asList(((Object []) (gsresponse.getData().getObject("dataSchema", ((GSObject) (null))).getObject("fields", ((GSObject) (null))).getKeys())))));
	//   19   41:aload_2         
	//   20   42:invokevirtual   #49  <Method GSObject GSResponse.getData()>
	//   21   45:ldc1            #51  <String "dataSchema">
	//   22   47:aconst_null     
	//   23   48:invokevirtual   #57  <Method GSObject GSObject.getObject(String, GSObject)>
	//   24   51:ldc1            #59  <String "fields">
	//   25   53:aconst_null     
	//   26   54:invokevirtual   #57  <Method GSObject GSObject.getObject(String, GSObject)>
	//   27   57:invokevirtual   #63  <Method String[] GSObject.getKeys()>
	//   28   60:invokestatic    #69  <Method List Arrays.asList(Object[])>
	//   29   63:astore_1        
			gsresponse = ((GSResponse) (AccountUtils.getBetaProgramFeatureTypes().iterator()));
	//   30   64:invokestatic    #75  <Method HashSet AccountUtils.getBetaProgramFeatureTypes()>
	//   31   67:invokevirtual   #79  <Method Iterator HashSet.iterator()>
	//   32   70:astore_2        
			do
			{
				if(!((Iterator) (gsresponse)).hasNext())
					break;
	//   33   71:aload_2         
	//   34   72:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   35   77:ifeq            115
				FeatureType featuretype = (FeatureType)((Iterator) (gsresponse)).next();
	//   36   80:aload_2         
	//   37   81:invokeinterface #89  <Method Object Iterator.next()>
	//   38   86:checkcast       #91  <Class FeatureType>
	//   39   89:astore          5
				if(((List) (s)).contains(((Object) (GigyaConst.getKeyForFeatureType(featuretype)))))
	//*  40   91:aload_1         
	//*  41   92:aload           5
	//*  42   94:invokestatic    #97  <Method String GigyaConst.getKeyForFeatureType(FeatureType)>
	//*  43   97:invokeinterface #103 <Method boolean List.contains(Object)>
	//*  44  102:ifeq            71
					((HashSet) (obj)).add(((Object) (featuretype)));
	//   45  105:aload_3         
	//   46  106:aload           5
	//   47  108:invokevirtual   #106 <Method boolean HashSet.add(Object)>
	//   48  111:pop             
			} while(true);
	//   49  112:goto            71
			gsresponse = ((GSResponse) (com.irobot.home.a.a.b()));
	//   50  115:invokestatic    #38  <Method String a.b()>
	//   51  118:astore_2        
			s = ((String) (new StringBuilder()));
	//   52  119:new             #108 <Class StringBuilder>
	//   53  122:dup             
	//   54  123:invokespecial   #109 <Method void StringBuilder()>
	//   55  126:astore_1        
			((StringBuilder) (s)).append("Schema allows ");
	//   56  127:aload_1         
	//   57  128:ldc1            #111 <String "Schema allows ">
	//   58  130:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   59  133:pop             
			((StringBuilder) (s)).append(((HashSet) (obj)).size());
	//   60  134:aload_1         
	//   61  135:aload_3         
	//   62  136:invokevirtual   #118 <Method int HashSet.size()>
	//   63  139:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   64  142:pop             
			((StringBuilder) (s)).append(" BETA features.");
	//   65  143:aload_1         
	//   66  144:ldc1            #123 <String " BETA features.">
	//   67  146:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   68  149:pop             
			s = ((StringBuilder) (s)).toString();
	//   69  150:aload_1         
	//   70  151:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   71  154:astore_1        
		} else
	//*  72  155:goto            165
		{
			gsresponse = ((GSResponse) (com.irobot.home.a.a.b()));
	//   73  158:invokestatic    #38  <Method String a.b()>
	//   74  161:astore_2        
			s = "Failed to fetch account schema. No BETA features allowed.";
	//   75  162:ldc1            #128 <String "Failed to fetch account schema. No BETA features allowed.">
	//   76  164:astore_1        
		}
		o.b(((String) (gsresponse)), s);
	//   77  165:aload_2         
	//   78  166:aload_1         
	//   79  167:invokestatic    #45  <Method void o.b(String, String)>
		a.a(((HashSet) (obj)), flag);
	//   80  170:aload_0         
	//   81  171:getfield        #20  <Field a$a a>
	//   82  174:aload_3         
	//   83  175:iload           4
	//   84  177:invokeinterface #133 <Method void a$a.a(HashSet, boolean)>
	//   85  182:return          
	}

	final a$a a;
	final a b;

	a$4(a a1, a$a a$a1)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field a b>
		a = a$a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field a$a a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
