// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.model;

import android.content.Context;
import android.telephony.NeighboringCellInfo;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.Utils.d;
import com.startapp.android.publish.adsCommon.Utils.e;
import com.startapp.android.publish.adsCommon.Utils.g;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.a.a;
import com.startapp.common.a.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.startapp.android.publish.common.model:
//			AdPreferences

public class GetAdRequest extends BaseRequest
{
	static class CellScanResult
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #24  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void StringBuilder()>
		//    3    7:astore_1        
			if(cellInfo != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #19  <Field NeighboringCellInfo cellInfo>
		//*   6   12:ifnull          95
			{
				stringbuilder.append(cellInfo.getCid()).append(',');
		//    7   15:aload_1         
		//    8   16:aload_0         
		//    9   17:getfield        #19  <Field NeighboringCellInfo cellInfo>
		//   10   20:invokevirtual   #31  <Method int NeighboringCellInfo.getCid()>
		//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
		//   12   26:bipush          44
		//   13   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(char)>
		//   14   31:pop             
				stringbuilder.append(cellInfo.getRssi()).append(',');
		//   15   32:aload_1         
		//   16   33:aload_0         
		//   17   34:getfield        #19  <Field NeighboringCellInfo cellInfo>
		//   18   37:invokevirtual   #41  <Method int NeighboringCellInfo.getRssi()>
		//   19   40:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
		//   20   43:bipush          44
		//   21   45:invokevirtual   #38  <Method StringBuilder StringBuilder.append(char)>
		//   22   48:pop             
				stringbuilder.append(cellInfo.getPsc()).append(',');
		//   23   49:aload_1         
		//   24   50:aload_0         
		//   25   51:getfield        #19  <Field NeighboringCellInfo cellInfo>
		//   26   54:invokevirtual   #44  <Method int NeighboringCellInfo.getPsc()>
		//   27   57:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
		//   28   60:bipush          44
		//   29   62:invokevirtual   #38  <Method StringBuilder StringBuilder.append(char)>
		//   30   65:pop             
				stringbuilder.append(cellInfo.getNetworkType()).append(',');
		//   31   66:aload_1         
		//   32   67:aload_0         
		//   33   68:getfield        #19  <Field NeighboringCellInfo cellInfo>
		//   34   71:invokevirtual   #47  <Method int NeighboringCellInfo.getNetworkType()>
		//   35   74:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
		//   36   77:bipush          44
		//   37   79:invokevirtual   #38  <Method StringBuilder StringBuilder.append(char)>
		//   38   82:pop             
				stringbuilder.append(cellInfo.getLac());
		//   39   83:aload_1         
		//   40   84:aload_0         
		//   41   85:getfield        #19  <Field NeighboringCellInfo cellInfo>
		//   42   88:invokevirtual   #50  <Method int NeighboringCellInfo.getLac()>
		//   43   91:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
		//   44   94:pop             
			}
			return stringbuilder.toString();
		//   45   95:aload_1         
		//   46   96:invokevirtual   #52  <Method String StringBuilder.toString()>
		//   47   99:areturn         
		}

		private static final char DELIMITER = 44;
		private NeighboringCellInfo cellInfo;

		public CellScanResult(NeighboringCellInfo neighboringcellinfo)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			cellInfo = neighboringcellinfo;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field NeighboringCellInfo cellInfo>
		//    5    9:return          
		}
	}

	protected static final class VideoRequestMode extends Enum
	{

		public static VideoRequestMode valueOf(String s)
		{
			return (VideoRequestMode)Enum.valueOf(com/startapp/android/publish/common/model/GetAdRequest$VideoRequestMode, s);
		//    0    0:ldc1            #2   <Class GetAdRequest$VideoRequestMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GetAdRequest$VideoRequestMode>
		//    4    9:areturn         
		}

		public static VideoRequestMode[] values()
		{
			return (VideoRequestMode[])((VideoRequestMode []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field GetAdRequest$VideoRequestMode[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.startapp.android.publish.common.model.GetAdRequest$VideoRequestMode_3B_.clone()>
		//    2    6:checkcast       #38  <Class GetAdRequest$VideoRequestMode[]>
		//    3    9:areturn         
		}

		private static final VideoRequestMode $VALUES[];
		public static final VideoRequestMode INTERSTITIAL;
		public static final VideoRequestMode REWARDED;

		static 
		{
			INTERSTITIAL = new VideoRequestMode("INTERSTITIAL", 0);
		//    0    0:new             #2   <Class GetAdRequest$VideoRequestMode>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "INTERSTITIAL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void GetAdRequest$VideoRequestMode(String, int)>
		//    5   10:putstatic       #22  <Field GetAdRequest$VideoRequestMode INTERSTITIAL>
			REWARDED = new VideoRequestMode("REWARDED", 1);
		//    6   13:new             #2   <Class GetAdRequest$VideoRequestMode>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "REWARDED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void GetAdRequest$VideoRequestMode(String, int)>
		//   11   23:putstatic       #25  <Field GetAdRequest$VideoRequestMode REWARDED>
			$VALUES = (new VideoRequestMode[] {
				INTERSTITIAL, REWARDED
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       VideoRequestMode[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field GetAdRequest$VideoRequestMode INTERSTITIAL>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field GetAdRequest$VideoRequestMode REWARDED>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field GetAdRequest$VideoRequestMode[] $VALUES>
		//*  23   45:return          
		}

		private VideoRequestMode(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	protected static final class VideoRequestType extends Enum
	{

		public static VideoRequestType valueOf(String s)
		{
			return (VideoRequestType)Enum.valueOf(com/startapp/android/publish/common/model/GetAdRequest$VideoRequestType, s);
		//    0    0:ldc1            #2   <Class GetAdRequest$VideoRequestType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GetAdRequest$VideoRequestType>
		//    4    9:areturn         
		}

		public static VideoRequestType[] values()
		{
			return (VideoRequestType[])((VideoRequestType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field GetAdRequest$VideoRequestType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.startapp.android.publish.common.model.GetAdRequest$VideoRequestType_3B_.clone()>
		//    2    6:checkcast       #46  <Class GetAdRequest$VideoRequestType[]>
		//    3    9:areturn         
		}

		private static final VideoRequestType $VALUES[];
		public static final VideoRequestType DISABLED;
		public static final VideoRequestType ENABLED;
		public static final VideoRequestType FORCED;
		public static final VideoRequestType FORCED_NONVAST;

		static 
		{
			ENABLED = new VideoRequestType("ENABLED", 0);
		//    0    0:new             #2   <Class GetAdRequest$VideoRequestType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "ENABLED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void GetAdRequest$VideoRequestType(String, int)>
		//    5   10:putstatic       #24  <Field GetAdRequest$VideoRequestType ENABLED>
			DISABLED = new VideoRequestType("DISABLED", 1);
		//    6   13:new             #2   <Class GetAdRequest$VideoRequestType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "DISABLED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void GetAdRequest$VideoRequestType(String, int)>
		//   11   23:putstatic       #27  <Field GetAdRequest$VideoRequestType DISABLED>
			FORCED = new VideoRequestType("FORCED", 2);
		//   12   26:new             #2   <Class GetAdRequest$VideoRequestType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "FORCED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void GetAdRequest$VideoRequestType(String, int)>
		//   17   36:putstatic       #30  <Field GetAdRequest$VideoRequestType FORCED>
			FORCED_NONVAST = new VideoRequestType("FORCED_NONVAST", 3);
		//   18   39:new             #2   <Class GetAdRequest$VideoRequestType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "FORCED_NONVAST">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void GetAdRequest$VideoRequestType(String, int)>
		//   23   49:putstatic       #33  <Field GetAdRequest$VideoRequestType FORCED_NONVAST>
			$VALUES = (new VideoRequestType[] {
				ENABLED, DISABLED, FORCED, FORCED_NONVAST
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       VideoRequestType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field GetAdRequest$VideoRequestType ENABLED>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field GetAdRequest$VideoRequestType DISABLED>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field GetAdRequest$VideoRequestType FORCED>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field GetAdRequest$VideoRequestType FORCED_NONVAST>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field GetAdRequest$VideoRequestType[] $VALUES>
		//*  43   83:return          
		}

		private VideoRequestType(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public GetAdRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void BaseRequest()>
		adsNumber = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #62  <Field int adsNumber>
		isHardwareAccelerated = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #64  <Field boolean isHardwareAccelerated>
		isDisableTwoClicks = b.a().C();
	//    8   14:aload_0         
	//    9   15:invokestatic    #70  <Method b b.a()>
	//   10   18:invokevirtual   #74  <Method boolean b.C()>
	//   11   21:putfield        #76  <Field boolean isDisableTwoClicks>
		offset = 0;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #78  <Field int offset>
		categories = null;
	//   15   29:aload_0         
	//   16   30:aconst_null     
	//   17   31:putfield        #80  <Field Set categories>
		categoriesExclude = null;
	//   18   34:aload_0         
	//   19   35:aconst_null     
	//   20   36:putfield        #82  <Field Set categoriesExclude>
		packageExclude = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #84  <Field Set packageExclude>
		packageInclude = null;
	//   24   44:aload_0         
	//   25   45:aconst_null     
	//   26   46:putfield        #86  <Field Set packageInclude>
		campaignExclude = null;
	//   27   49:aload_0         
	//   28   50:aconst_null     
	//   29   51:putfield        #88  <Field Set campaignExclude>
		engInclude = true;
	//   30   54:aload_0         
	//   31   55:iconst_1        
	//   32   56:putfield        #90  <Field boolean engInclude>
		country = null;
	//   33   59:aload_0         
	//   34   60:aconst_null     
	//   35   61:putfield        #92  <Field String country>
		advertiserId = null;
	//   36   64:aload_0         
	//   37   65:aconst_null     
	//   38   66:putfield        #94  <Field String advertiserId>
		type = null;
	//   39   69:aload_0         
	//   40   70:aconst_null     
	//   41   71:putfield        #96  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
		timeSinceSessionStart = System.currentTimeMillis() - g.d().b();
	//   42   74:aload_0         
	//   43   75:invokestatic    #102 <Method long System.currentTimeMillis()>
	//   44   78:invokestatic    #108 <Method g g.d()>
	//   45   81:invokevirtual   #111 <Method long g.b()>
	//   46   84:lsub            
	//   47   85:putfield        #113 <Field long timeSinceSessionStart>
		if(!i.a())
	//*  48   88:invokestatic    #117 <Method boolean i.a()>
	//*  49   91:ifne            104
			adsDisplayed = com.startapp.android.publish.adsCommon.a.b.a().d();
	//   50   94:aload_0         
	//   51   95:invokestatic    #122 <Method com.startapp.android.publish.adsCommon.a.b com.startapp.android.publish.adsCommon.a.b.a()>
	//   52   98:invokevirtual   #125 <Method int com.startapp.android.publish.adsCommon.a.b.d()>
	//   53  101:putfield        #127 <Field int adsDisplayed>
		profileId = MetaData.getInstance().getProfileId();
	//   54  104:aload_0         
	//   55  105:invokestatic    #133 <Method MetaData MetaData.getInstance()>
	//   56  108:invokevirtual   #137 <Method String MetaData.getProfileId()>
	//   57  111:putfield        #139 <Field String profileId>
	//   58  114:return          
	}

	private void addParams(e e1)
	{
		e1.a("placement", ((Object) (placement.name())), true);
	//    0    0:aload_1         
	//    1    1:ldc1            #143 <String "placement">
	//    2    3:aload_0         
	//    3    4:getfield        #145 <Field AdPreferences$Placement placement>
	//    4    7:invokevirtual   #150 <Method String AdPreferences$Placement.name()>
	//    5   10:iconst_1        
	//    6   11:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("testMode", ((Object) (Boolean.toString(testMode))), false);
	//    7   14:aload_1         
	//    8   15:ldc1            #156 <String "testMode">
	//    9   17:aload_0         
	//   10   18:getfield        #158 <Field boolean testMode>
	//   11   21:invokestatic    #164 <Method String Boolean.toString(boolean)>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("gender", ((Object) (gender)), false);
	//   14   28:aload_1         
	//   15   29:ldc1            #165 <String "gender">
	//   16   31:aload_0         
	//   17   32:getfield        #167 <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//   18   35:iconst_0        
	//   19   36:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("age", ((Object) (age)), false);
	//   20   39:aload_1         
	//   21   40:ldc1            #168 <String "age">
	//   22   42:aload_0         
	//   23   43:getfield        #170 <Field String age>
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("keywords", ((Object) (keywords)), false);
	//   26   50:aload_1         
	//   27   51:ldc1            #171 <String "keywords">
	//   28   53:aload_0         
	//   29   54:getfield        #173 <Field String keywords>
	//   30   57:iconst_0        
	//   31   58:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("template", ((Object) (template)), false);
	//   32   61:aload_1         
	//   33   62:ldc1            #174 <String "template">
	//   34   64:aload_0         
	//   35   65:getfield        #176 <Field String template>
	//   36   68:iconst_0        
	//   37   69:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("adsNumber", ((Object) (Integer.toString(adsNumber))), false);
	//   38   72:aload_1         
	//   39   73:ldc1            #177 <String "adsNumber">
	//   40   75:aload_0         
	//   41   76:getfield        #62  <Field int adsNumber>
	//   42   79:invokestatic    #182 <Method String Integer.toString(int)>
	//   43   82:iconst_0        
	//   44   83:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("category", categories, false);
	//   45   86:aload_1         
	//   46   87:ldc1            #184 <String "category">
	//   47   89:aload_0         
	//   48   90:getfield        #80  <Field Set categories>
	//   49   93:iconst_0        
	//   50   94:invokevirtual   #187 <Method void e.a(String, Set, boolean)>
		e1.a("categoryExclude", categoriesExclude, false);
	//   51   97:aload_1         
	//   52   98:ldc1            #189 <String "categoryExclude">
	//   53  100:aload_0         
	//   54  101:getfield        #82  <Field Set categoriesExclude>
	//   55  104:iconst_0        
	//   56  105:invokevirtual   #187 <Method void e.a(String, Set, boolean)>
		e1.a("packageExclude", packageExclude, false);
	//   57  108:aload_1         
	//   58  109:ldc1            #190 <String "packageExclude">
	//   59  111:aload_0         
	//   60  112:getfield        #84  <Field Set packageExclude>
	//   61  115:iconst_0        
	//   62  116:invokevirtual   #187 <Method void e.a(String, Set, boolean)>
		e1.a("campaignExclude", campaignExclude, false);
	//   63  119:aload_1         
	//   64  120:ldc1            #191 <String "campaignExclude">
	//   65  122:aload_0         
	//   66  123:getfield        #88  <Field Set campaignExclude>
	//   67  126:iconst_0        
	//   68  127:invokevirtual   #187 <Method void e.a(String, Set, boolean)>
		e1.a("offset", ((Object) (Integer.toString(offset))), false);
	//   69  130:aload_1         
	//   70  131:ldc1            #192 <String "offset">
	//   71  133:aload_0         
	//   72  134:getfield        #78  <Field int offset>
	//   73  137:invokestatic    #182 <Method String Integer.toString(int)>
	//   74  140:iconst_0        
	//   75  141:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("ai", ((Object) (ai)), false);
	//   76  144:aload_1         
	//   77  145:ldc1            #193 <String "ai">
	//   78  147:aload_0         
	//   79  148:getfield        #195 <Field Boolean ai>
	//   80  151:iconst_0        
	//   81  152:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("as", ((Object) (as)), false);
	//   82  155:aload_1         
	//   83  156:ldc1            #196 <String "as">
	//   84  158:aload_0         
	//   85  159:getfield        #198 <Field Boolean as>
	//   86  162:iconst_0        
	//   87  163:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		e1.a("minCPM", ((Object) (i.a(minCpm))), false);
	//   88  166:aload_1         
	//   89  167:ldc1            #200 <String "minCPM">
	//   90  169:aload_0         
	//   91  170:getfield        #202 <Field Double minCpm>
	//   92  173:invokestatic    #205 <Method String i.a(Double)>
	//   93  176:iconst_0        
	//   94  177:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
		boolean flag;
		String s;
		if(!isDisableTwoClicks)
	//*  95  180:aload_0         
	//*  96  181:getfield        #76  <Field boolean isDisableTwoClicks>
	//*  97  184:ifne            504
			flag = true;
	//   98  187:iconst_1        
	//   99  188:istore_2        
		else
	//* 100  189:aload_1         
	//* 101  190:ldc1            #207 <String "twoClicks">
	//* 102  192:iload_2         
	//* 103  193:invokestatic    #211 <Method Boolean Boolean.valueOf(boolean)>
	//* 104  196:iconst_0        
	//* 105  197:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 106  200:aload_1         
	//* 107  201:ldc1            #212 <String "engInclude">
	//* 108  203:aload_0         
	//* 109  204:getfield        #90  <Field boolean engInclude>
	//* 110  207:invokestatic    #164 <Method String Boolean.toString(boolean)>
	//* 111  210:iconst_0        
	//* 112  211:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 113  214:aload_0         
	//* 114  215:invokevirtual   #216 <Method com.startapp.android.publish.adsCommon.Ad$AdType getType()>
	//* 115  218:getstatic       #221 <Field com.startapp.android.publish.adsCommon.Ad$AdType com.startapp.android.publish.adsCommon.Ad$AdType.INTERSTITIAL>
	//* 116  221:if_acmpeq       234
	//* 117  224:aload_0         
	//* 118  225:invokevirtual   #216 <Method com.startapp.android.publish.adsCommon.Ad$AdType getType()>
	//* 119  228:getstatic       #224 <Field com.startapp.android.publish.adsCommon.Ad$AdType com.startapp.android.publish.adsCommon.Ad$AdType.RICH_TEXT>
	//* 120  231:if_acmpne       245
	//* 121  234:aload_1         
	//* 122  235:ldc1            #225 <String "type">
	//* 123  237:aload_0         
	//* 124  238:getfield        #96  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//* 125  241:iconst_0        
	//* 126  242:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 127  245:aload_1         
	//* 128  246:ldc1            #226 <String "timeSinceSessionStart">
	//* 129  248:aload_0         
	//* 130  249:getfield        #113 <Field long timeSinceSessionStart>
	//* 131  252:invokestatic    #231 <Method Long Long.valueOf(long)>
	//* 132  255:iconst_1        
	//* 133  256:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 134  259:aload_1         
	//* 135  260:ldc1            #232 <String "adsDisplayed">
	//* 136  262:aload_0         
	//* 137  263:getfield        #127 <Field int adsDisplayed>
	//* 138  266:invokestatic    #235 <Method Integer Integer.valueOf(int)>
	//* 139  269:iconst_1        
	//* 140  270:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 141  273:aload_1         
	//* 142  274:ldc1            #236 <String "profileId">
	//* 143  276:aload_0         
	//* 144  277:getfield        #139 <Field String profileId>
	//* 145  280:iconst_0        
	//* 146  281:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 147  284:aload_1         
	//* 148  285:ldc1            #238 <String "hardwareAccelerated">
	//* 149  287:aload_0         
	//* 150  288:getfield        #64  <Field boolean isHardwareAccelerated>
	//* 151  291:invokestatic    #211 <Method Boolean Boolean.valueOf(boolean)>
	//* 152  294:iconst_0        
	//* 153  295:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 154  298:aload_1         
	//* 155  299:ldc1            #240 <String "dts">
	//* 156  301:aload_0         
	//* 157  302:getfield        #242 <Field Boolean isAutoDateTimeEnabled>
	//* 158  305:iconst_0        
	//* 159  306:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 160  309:aload_1         
	//* 161  310:ldc1            #244 <String "downloadingMode">
	//* 162  312:ldc1            #246 <String "CACHE">
	//* 163  314:iconst_0        
	//* 164  315:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 165  318:aload_1         
	//* 166  319:ldc1            #247 <String "primaryImg">
	//* 167  321:aload_0         
	//* 168  322:getfield        #249 <Field String primaryImg>
	//* 169  325:iconst_0        
	//* 170  326:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 171  329:aload_1         
	//* 172  330:ldc1            #250 <String "moreImg">
	//* 173  332:aload_0         
	//* 174  333:getfield        #252 <Field String moreImg>
	//* 175  336:iconst_0        
	//* 176  337:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 177  340:aload_1         
	//* 178  341:ldc1            #253 <String "contentAd">
	//* 179  343:aload_0         
	//* 180  344:getfield        #255 <Field boolean contentAd>
	//* 181  347:invokestatic    #164 <Method String Boolean.toString(boolean)>
	//* 182  350:iconst_0        
	//* 183  351:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 184  354:invokestatic    #259 <Method String a.d()>
	//* 185  357:astore_3        
	//* 186  358:aload_1         
	//* 187  359:invokestatic    #261 <Method String a.a()>
	//* 188  362:aload_3         
	//* 189  363:iconst_1        
	//* 190  364:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 191  367:aload_1         
	//* 192  368:invokestatic    #264 <Method String a.c()>
	//* 193  371:new             #266 <Class StringBuilder>
	//* 194  374:dup             
	//* 195  375:invokespecial   #267 <Method void StringBuilder()>
	//* 196  378:aload_0         
	//* 197  379:invokevirtual   #270 <Method String getProductId()>
	//* 198  382:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//* 199  385:aload_0         
	//* 200  386:getfield        #145 <Field AdPreferences$Placement placement>
	//* 201  389:invokevirtual   #150 <Method String AdPreferences$Placement.name()>
	//* 202  392:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//* 203  395:aload_0         
	//* 204  396:invokevirtual   #277 <Method String getSessionId()>
	//* 205  399:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//* 206  402:aload_0         
	//* 207  403:invokevirtual   #280 <Method String getSdkVersion()>
	//* 208  406:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//* 209  409:aload_3         
	//* 210  410:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//* 211  413:invokevirtual   #282 <Method String StringBuilder.toString()>
	//* 212  416:invokestatic    #285 <Method String a.b(String)>
	//* 213  419:iconst_1        
	//* 214  420:iconst_0        
	//* 215  421:invokevirtual   #288 <Method void e.a(String, Object, boolean, boolean)>
	//* 216  424:aload_0         
	//* 217  425:invokevirtual   #291 <Method String getCountry()>
	//* 218  428:ifnull          443
	//* 219  431:aload_1         
	//* 220  432:ldc2            #292 <String "country">
	//* 221  435:aload_0         
	//* 222  436:invokevirtual   #291 <Method String getCountry()>
	//* 223  439:iconst_0        
	//* 224  440:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 225  443:aload_0         
	//* 226  444:invokevirtual   #295 <Method String getAdvertiserId()>
	//* 227  447:ifnull          462
	//* 228  450:aload_1         
	//* 229  451:ldc2            #296 <String "advertiserId">
	//* 230  454:aload_0         
	//* 231  455:invokevirtual   #295 <Method String getAdvertiserId()>
	//* 232  458:iconst_0        
	//* 233  459:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 234  462:aload_0         
	//* 235  463:invokevirtual   #300 <Method Set getPackageInclude()>
	//* 236  466:ifnull          481
	//* 237  469:aload_1         
	//* 238  470:ldc2            #301 <String "packageInclude">
	//* 239  473:aload_0         
	//* 240  474:invokevirtual   #300 <Method Set getPackageInclude()>
	//* 241  477:iconst_0        
	//* 242  478:invokevirtual   #187 <Method void e.a(String, Set, boolean)>
	//* 243  481:aload_1         
	//* 244  482:aload_0         
	//* 245  483:getfield        #303 <Field Pair simpleToken>
	//* 246  486:getfield        #309 <Field Object Pair.first>
	//* 247  489:checkcast       #311 <Class String>
	//* 248  492:aload_0         
	//* 249  493:getfield        #303 <Field Pair simpleToken>
	//* 250  496:getfield        #314 <Field Object Pair.second>
	//* 251  499:iconst_0        
	//* 252  500:invokevirtual   #155 <Method void e.a(String, Object, boolean)>
	//* 253  503:return          
			flag = false;
	//  254  504:iconst_0        
	//  255  505:istore_2        
		e1.a("twoClicks", ((Object) (Boolean.valueOf(flag))), false);
		e1.a("engInclude", ((Object) (Boolean.toString(engInclude))), false);
		if(getType() == com.startapp.android.publish.adsCommon.Ad.AdType.INTERSTITIAL || getType() == com.startapp.android.publish.adsCommon.Ad.AdType.RICH_TEXT)
			e1.a("type", ((Object) (type)), false);
		e1.a("timeSinceSessionStart", ((Object) (Long.valueOf(timeSinceSessionStart))), true);
		e1.a("adsDisplayed", ((Object) (Integer.valueOf(adsDisplayed))), true);
		e1.a("profileId", ((Object) (profileId)), false);
		e1.a("hardwareAccelerated", ((Object) (Boolean.valueOf(isHardwareAccelerated))), false);
		e1.a("dts", ((Object) (isAutoDateTimeEnabled)), false);
		e1.a("downloadingMode", "CACHE", false);
		e1.a("primaryImg", ((Object) (primaryImg)), false);
		e1.a("moreImg", ((Object) (moreImg)), false);
		e1.a("contentAd", ((Object) (Boolean.toString(contentAd))), false);
		s = a.d();
		e1.a(a.a(), ((Object) (s)), true);
		e1.a(a.c(), ((Object) (a.b((new StringBuilder()).append(getProductId()).append(placement.name()).append(getSessionId()).append(getSdkVersion()).append(s).toString()))), true, false);
		if(getCountry() != null)
			e1.a("country", ((Object) (getCountry())), false);
		if(getAdvertiserId() != null)
			e1.a("advertiserId", ((Object) (getAdvertiserId())), false);
		if(getPackageInclude() != null)
			e1.a("packageInclude", getPackageInclude(), false);
		e1.a((String)simpleToken.first, simpleToken.second, false);
	//* 256  506:goto            189
	}

	public void addCategory(String s)
	{
		if(categories == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Set categories>
	//*   2    4:ifnonnull       18
			categories = ((Set) (new HashSet()));
	//    3    7:aload_0         
	//    4    8:new             #318 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #319 <Method void HashSet()>
	//    7   15:putfield        #80  <Field Set categories>
		categories.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #80  <Field Set categories>
	//   10   22:aload_1         
	//   11   23:invokeinterface #325 <Method boolean Set.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void addCategoryExclude(String s)
	{
		if(categoriesExclude == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Set categoriesExclude>
	//*   2    4:ifnonnull       18
			categoriesExclude = ((Set) (new HashSet()));
	//    3    7:aload_0         
	//    4    8:new             #318 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #319 <Method void HashSet()>
	//    7   15:putfield        #82  <Field Set categoriesExclude>
		categoriesExclude.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #82  <Field Set categoriesExclude>
	//   10   22:aload_1         
	//   11   23:invokeinterface #325 <Method boolean Set.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void fillAdPreferences(Context context, AdPreferences adpreferences, AdPreferences.Placement placement1, Pair pair)
	{
		placement = placement1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #145 <Field AdPreferences$Placement placement>
		simpleToken = pair;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #303 <Field Pair simpleToken>
		ai = adpreferences.getAi();
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokevirtual   #334 <Method Boolean AdPreferences.getAi()>
	//    9   16:putfield        #195 <Field Boolean ai>
		as = adpreferences.getAs();
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:invokevirtual   #337 <Method Boolean AdPreferences.getAs()>
	//   13   24:putfield        #198 <Field Boolean as>
		age = adpreferences.getAge(context);
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #341 <Method String AdPreferences.getAge(Context)>
	//   18   33:putfield        #170 <Field String age>
		gender = adpreferences.getGender(context);
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:aload_1         
	//   22   39:invokevirtual   #345 <Method com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender AdPreferences.getGender(Context)>
	//   23   42:putfield        #167 <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
		keywords = adpreferences.getKeywords();
	//   24   45:aload_0         
	//   25   46:aload_2         
	//   26   47:invokevirtual   #348 <Method String AdPreferences.getKeywords()>
	//   27   50:putfield        #173 <Field String keywords>
		testMode = adpreferences.isTestMode();
	//   28   53:aload_0         
	//   29   54:aload_2         
	//   30   55:invokevirtual   #351 <Method boolean AdPreferences.isTestMode()>
	//   31   58:putfield        #158 <Field boolean testMode>
		categories = adpreferences.getCategories();
	//   32   61:aload_0         
	//   33   62:aload_2         
	//   34   63:invokevirtual   #354 <Method Set AdPreferences.getCategories()>
	//   35   66:putfield        #80  <Field Set categories>
		categoriesExclude = adpreferences.getCategoriesExclude();
	//   36   69:aload_0         
	//   37   70:aload_2         
	//   38   71:invokevirtual   #357 <Method Set AdPreferences.getCategoriesExclude()>
	//   39   74:putfield        #82  <Field Set categoriesExclude>
		isHardwareAccelerated = adpreferences.isHardwareAccelerated();
	//   40   77:aload_0         
	//   41   78:aload_2         
	//   42   79:invokevirtual   #359 <Method boolean AdPreferences.isHardwareAccelerated()>
	//   43   82:putfield        #64  <Field boolean isHardwareAccelerated>
		isAutoDateTimeEnabled = Boolean.valueOf(c.c(context));
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:invokestatic    #364 <Method boolean c.c(Context)>
	//   47   90:invokestatic    #211 <Method Boolean Boolean.valueOf(boolean)>
	//   48   93:putfield        #242 <Field Boolean isAutoDateTimeEnabled>
		minCpm = adpreferences.getMinCpm();
	//   49   96:aload_0         
	//   50   97:aload_2         
	//   51   98:invokevirtual   #368 <Method Double AdPreferences.getMinCpm()>
	//   52  101:putfield        #202 <Field Double minCpm>
		fillLocationDetails(adpreferences, context);
	//   53  104:aload_0         
	//   54  105:aload_2         
	//   55  106:aload_1         
	//   56  107:invokevirtual   #372 <Method void fillLocationDetails(AdPreferences, Context)>
		setCountry(adpreferences.country);
	//   57  110:aload_0         
	//   58  111:aload_2         
	//   59  112:getfield        #373 <Field String AdPreferences.country>
	//   60  115:invokevirtual   #376 <Method void setCountry(String)>
		setAdvertiser(adpreferences.advertiserId);
	//   61  118:aload_0         
	//   62  119:aload_2         
	//   63  120:getfield        #377 <Field String AdPreferences.advertiserId>
	//   64  123:invokevirtual   #380 <Method void setAdvertiser(String)>
		setTemplate(adpreferences.template);
	//   65  126:aload_0         
	//   66  127:aload_2         
	//   67  128:getfield        #381 <Field String AdPreferences.template>
	//   68  131:invokevirtual   #384 <Method void setTemplate(String)>
		setType(adpreferences.type);
	//   69  134:aload_0         
	//   70  135:aload_2         
	//   71  136:getfield        #385 <Field com.startapp.android.publish.adsCommon.Ad$AdType AdPreferences.type>
	//   72  139:invokevirtual   #389 <Method void setType(com.startapp.android.publish.adsCommon.Ad$AdType)>
		setPackageInclude(adpreferences.packageInclude);
	//   73  142:aload_0         
	//   74  143:aload_2         
	//   75  144:getfield        #390 <Field Set AdPreferences.packageInclude>
	//   76  147:invokevirtual   #394 <Method void setPackageInclude(Set)>
	//   77  150:return          
	}

	public int getAdsNumber()
	{
		return adsNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int adsNumber>
	//    2    4:ireturn         
	}

	public String getAdvertiserId()
	{
		return advertiserId;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field String advertiserId>
	//    2    4:areturn         
	}

	public String getAge()
	{
		return age;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field String age>
	//    2    4:areturn         
	}

	public Boolean getAi()
	{
		return ai;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field Boolean ai>
	//    2    4:areturn         
	}

	public Boolean getAs()
	{
		return as;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field Boolean as>
	//    2    4:areturn         
	}

	public Set getCampaignExclude()
	{
		return campaignExclude;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Set campaignExclude>
	//    2    4:areturn         
	}

	public Set getCategories()
	{
		return categories;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Set categories>
	//    2    4:areturn         
	}

	public Set getCategoriesExclude()
	{
		return categoriesExclude;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Set categoriesExclude>
	//    2    4:areturn         
	}

	public String getCountry()
	{
		return country;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String country>
	//    2    4:areturn         
	}

	public com.startapp.android.publish.adsCommon.SDKAdPreferences.Gender getGender()
	{
		return gender;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//    2    4:areturn         
	}

	public String getKeywords()
	{
		return keywords;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field String keywords>
	//    2    4:areturn         
	}

	public double getMinCpm()
	{
		return minCpm.doubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field Double minCpm>
	//    2    4:invokevirtual   #406 <Method double Double.doubleValue()>
	//    3    7:dreturn         
	}

	public String getMoreImg()
	{
		return moreImg;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field String moreImg>
	//    2    4:areturn         
	}

	public e getNameValueMap()
	{
		e e1 = super.getNameValueMap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #411 <Method e BaseRequest.getNameValueMap()>
	//    2    4:astore_2        
		Object obj = ((Object) (e1));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(e1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       19
			obj = ((Object) (new d()));
	//    7   11:new             #413 <Class d>
	//    8   14:dup             
	//    9   15:invokespecial   #414 <Method void d()>
	//   10   18:astore_1        
		addParams(((e) (obj)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #416 <Method void addParams(e)>
		return ((e) (obj));
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	public int getOffset()
	{
		return offset;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int offset>
	//    2    4:ireturn         
	}

	public Set getPackageExclude()
	{
		return packageExclude;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Set packageExclude>
	//    2    4:areturn         
	}

	public Set getPackageInclude()
	{
		return packageInclude;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Set packageInclude>
	//    2    4:areturn         
	}

	public AdPreferences.Placement getPlacement()
	{
		return placement;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field AdPreferences$Placement placement>
	//    2    4:areturn         
	}

	public String getPrimaryImg()
	{
		return primaryImg;
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field String primaryImg>
	//    2    4:areturn         
	}

	public Pair getSimpleToken()
	{
		return simpleToken;
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field Pair simpleToken>
	//    2    4:areturn         
	}

	public String getTemplate()
	{
		return template;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field String template>
	//    2    4:areturn         
	}

	public com.startapp.android.publish.adsCommon.Ad.AdType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//    2    4:areturn         
	}

	public boolean hasCampaignExclude()
	{
		return campaignExclude != null && campaignExclude.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Set campaignExclude>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field Set campaignExclude>
	//    5   11:invokeinterface #429 <Method int Set.size()>
	//    6   16:ifle            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isAdTypeVideo()
	{
		return getType() == com.startapp.android.publish.adsCommon.Ad.AdType.VIDEO || getType() == com.startapp.android.publish.adsCommon.Ad.AdType.REWARDED_VIDEO;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #216 <Method com.startapp.android.publish.adsCommon.Ad$AdType getType()>
	//    2    4:getstatic       #433 <Field com.startapp.android.publish.adsCommon.Ad$AdType com.startapp.android.publish.adsCommon.Ad$AdType.VIDEO>
	//    3    7:if_acmpeq       20
	//    4   10:aload_0         
	//    5   11:invokevirtual   #216 <Method com.startapp.android.publish.adsCommon.Ad$AdType getType()>
	//    6   14:getstatic       #436 <Field com.startapp.android.publish.adsCommon.Ad$AdType com.startapp.android.publish.adsCommon.Ad$AdType.REWARDED_VIDEO>
	//    7   17:if_acmpne       22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public boolean isContentAd()
	{
		return contentAd;
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field boolean contentAd>
	//    2    4:ireturn         
	}

	protected boolean isDisableTwoClicks()
	{
		return isDisableTwoClicks;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field boolean isDisableTwoClicks>
	//    2    4:ireturn         
	}

	public boolean isEngInclude()
	{
		return engInclude;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field boolean engInclude>
	//    2    4:ireturn         
	}

	public boolean isTestMode()
	{
		return testMode;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field boolean testMode>
	//    2    4:ireturn         
	}

	public void setAdsNumber(int j)
	{
		adsNumber = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field int adsNumber>
	//    3    5:return          
	}

	public void setAdvertiser(String s)
	{
		advertiserId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field String advertiserId>
	//    3    5:return          
	}

	public void setAge(String s)
	{
		age = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #170 <Field String age>
	//    3    5:return          
	}

	public void setAi(Boolean boolean1)
	{
		ai = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #195 <Field Boolean ai>
	//    3    5:return          
	}

	public void setAs(Boolean boolean1)
	{
		as = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #198 <Field Boolean as>
	//    3    5:return          
	}

	public void setCampaignExclude(Set set)
	{
		campaignExclude = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field Set campaignExclude>
	//    3    5:return          
	}

	public void setCategories(Set set)
	{
		categories = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field Set categories>
	//    3    5:return          
	}

	public void setCategoriesExclude(Set set)
	{
		categoriesExclude = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field Set categoriesExclude>
	//    3    5:return          
	}

	public void setContentAd(boolean flag)
	{
		contentAd = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #255 <Field boolean contentAd>
	//    3    5:return          
	}

	public void setCountry(String s)
	{
		country = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field String country>
	//    3    5:return          
	}

	public void setDisableTwoClicks(boolean flag)
	{
		isDisableTwoClicks = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #76  <Field boolean isDisableTwoClicks>
	//    3    5:return          
	}

	public void setEngInclude(boolean flag)
	{
		engInclude = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field boolean engInclude>
	//    3    5:return          
	}

	public void setGender(com.startapp.android.publish.adsCommon.SDKAdPreferences.Gender gender1)
	{
		gender = gender1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #167 <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//    3    5:return          
	}

	public void setKeywords(String s)
	{
		keywords = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #173 <Field String keywords>
	//    3    5:return          
	}

	public void setMinCpm(double d1)
	{
		minCpm = Double.valueOf(d1);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #460 <Method Double Double.valueOf(double)>
	//    3    5:putfield        #202 <Field Double minCpm>
	//    4    8:return          
	}

	public void setMoreImg(String s)
	{
		moreImg = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #252 <Field String moreImg>
	//    3    5:return          
	}

	public void setOffset(int j)
	{
		offset = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field int offset>
	//    3    5:return          
	}

	public void setPackageExclude(Set set)
	{
		packageExclude = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Set packageExclude>
	//    3    5:return          
	}

	public void setPackageInclude(Set set)
	{
		packageInclude = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field Set packageInclude>
	//    3    5:return          
	}

	public void setPlacement(AdPreferences.Placement placement1)
	{
		placement = placement1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field AdPreferences$Placement placement>
	//    3    5:return          
	}

	public void setPrimaryImg(String s)
	{
		primaryImg = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #249 <Field String primaryImg>
	//    3    5:return          
	}

	public void setRetry(int j)
	{
		retry = Integer.valueOf(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Integer Integer.valueOf(int)>
	//    3    5:putfield        #471 <Field Integer retry>
	//    4    8:return          
	}

	public void setSimpleToken(Pair pair)
	{
		simpleToken = pair;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #303 <Field Pair simpleToken>
	//    3    5:return          
	}

	public void setTemplate(String s)
	{
		template = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #176 <Field String template>
	//    3    5:return          
	}

	public void setTestMode(boolean flag)
	{
		testMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #158 <Field boolean testMode>
	//    3    5:return          
	}

	public void setType(com.startapp.android.publish.adsCommon.Ad.AdType adtype)
	{
		type = adtype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("GetAdRequest [");
	//    0    0:new             #266 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #477 <String "GetAdRequest [">
	//    3    7:invokespecial   #479 <Method void StringBuilder(String)>
	//    4   10:astore_1        
		stringbuilder.append((new StringBuilder()).append("placement=").append(((Object) (placement))).toString());
	//    5   11:aload_1         
	//    6   12:new             #266 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #267 <Method void StringBuilder()>
	//    9   19:ldc2            #481 <String "placement=">
	//   10   22:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:getfield        #145 <Field AdPreferences$Placement placement>
	//   13   29:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//   14   32:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   15   35:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:pop             
		stringbuilder.append((new StringBuilder()).append(", testMode=").append(testMode).toString());
	//   17   39:aload_1         
	//   18   40:new             #266 <Class StringBuilder>
	//   19   43:dup             
	//   20   44:invokespecial   #267 <Method void StringBuilder()>
	//   21   47:ldc2            #486 <String ", testMode=">
	//   22   50:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   23   53:aload_0         
	//   24   54:getfield        #158 <Field boolean testMode>
	//   25   57:invokevirtual   #489 <Method StringBuilder StringBuilder.append(boolean)>
	//   26   60:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   27   63:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   28   66:pop             
		stringbuilder.append((new StringBuilder()).append(", gender=").append(((Object) (gender))).toString());
	//   29   67:aload_1         
	//   30   68:new             #266 <Class StringBuilder>
	//   31   71:dup             
	//   32   72:invokespecial   #267 <Method void StringBuilder()>
	//   33   75:ldc2            #491 <String ", gender=">
	//   34   78:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   35   81:aload_0         
	//   36   82:getfield        #167 <Field com.startapp.android.publish.adsCommon.SDKAdPreferences$Gender gender>
	//   37   85:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//   38   88:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   39   91:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   40   94:pop             
		stringbuilder.append((new StringBuilder()).append(", age=").append(age).toString());
	//   41   95:aload_1         
	//   42   96:new             #266 <Class StringBuilder>
	//   43   99:dup             
	//   44  100:invokespecial   #267 <Method void StringBuilder()>
	//   45  103:ldc2            #493 <String ", age=">
	//   46  106:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   47  109:aload_0         
	//   48  110:getfield        #170 <Field String age>
	//   49  113:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   50  116:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   51  119:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   52  122:pop             
		stringbuilder.append((new StringBuilder()).append(", ai=").append(((Object) (ai))).toString());
	//   53  123:aload_1         
	//   54  124:new             #266 <Class StringBuilder>
	//   55  127:dup             
	//   56  128:invokespecial   #267 <Method void StringBuilder()>
	//   57  131:ldc2            #495 <String ", ai=">
	//   58  134:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   59  137:aload_0         
	//   60  138:getfield        #195 <Field Boolean ai>
	//   61  141:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//   62  144:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   63  147:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   64  150:pop             
		stringbuilder.append((new StringBuilder()).append(", as=").append(((Object) (as))).toString());
	//   65  151:aload_1         
	//   66  152:new             #266 <Class StringBuilder>
	//   67  155:dup             
	//   68  156:invokespecial   #267 <Method void StringBuilder()>
	//   69  159:ldc2            #497 <String ", as=">
	//   70  162:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   71  165:aload_0         
	//   72  166:getfield        #198 <Field Boolean as>
	//   73  169:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//   74  172:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   75  175:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   76  178:pop             
		stringbuilder.append((new StringBuilder()).append(", keywords=").append(keywords).toString());
	//   77  179:aload_1         
	//   78  180:new             #266 <Class StringBuilder>
	//   79  183:dup             
	//   80  184:invokespecial   #267 <Method void StringBuilder()>
	//   81  187:ldc2            #499 <String ", keywords=">
	//   82  190:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   83  193:aload_0         
	//   84  194:getfield        #173 <Field String keywords>
	//   85  197:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   86  200:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   87  203:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   88  206:pop             
		stringbuilder.append((new StringBuilder()).append(", template=").append(template).toString());
	//   89  207:aload_1         
	//   90  208:new             #266 <Class StringBuilder>
	//   91  211:dup             
	//   92  212:invokespecial   #267 <Method void StringBuilder()>
	//   93  215:ldc2            #501 <String ", template=">
	//   94  218:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   95  221:aload_0         
	//   96  222:getfield        #176 <Field String template>
	//   97  225:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   98  228:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   99  231:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  100  234:pop             
		stringbuilder.append((new StringBuilder()).append(", adsNumber=").append(adsNumber).toString());
	//  101  235:aload_1         
	//  102  236:new             #266 <Class StringBuilder>
	//  103  239:dup             
	//  104  240:invokespecial   #267 <Method void StringBuilder()>
	//  105  243:ldc2            #503 <String ", adsNumber=">
	//  106  246:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  107  249:aload_0         
	//  108  250:getfield        #62  <Field int adsNumber>
	//  109  253:invokevirtual   #506 <Method StringBuilder StringBuilder.append(int)>
	//  110  256:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  111  259:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  112  262:pop             
		stringbuilder.append((new StringBuilder()).append(", offset=").append(offset).toString());
	//  113  263:aload_1         
	//  114  264:new             #266 <Class StringBuilder>
	//  115  267:dup             
	//  116  268:invokespecial   #267 <Method void StringBuilder()>
	//  117  271:ldc2            #508 <String ", offset=">
	//  118  274:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  119  277:aload_0         
	//  120  278:getfield        #78  <Field int offset>
	//  121  281:invokevirtual   #506 <Method StringBuilder StringBuilder.append(int)>
	//  122  284:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  123  287:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  124  290:pop             
		stringbuilder.append((new StringBuilder()).append(", categories=").append(((Object) (categories))).toString());
	//  125  291:aload_1         
	//  126  292:new             #266 <Class StringBuilder>
	//  127  295:dup             
	//  128  296:invokespecial   #267 <Method void StringBuilder()>
	//  129  299:ldc2            #510 <String ", categories=">
	//  130  302:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  131  305:aload_0         
	//  132  306:getfield        #80  <Field Set categories>
	//  133  309:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//  134  312:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  135  315:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  136  318:pop             
		stringbuilder.append((new StringBuilder()).append(", categoriesExclude=").append(((Object) (categoriesExclude))).toString());
	//  137  319:aload_1         
	//  138  320:new             #266 <Class StringBuilder>
	//  139  323:dup             
	//  140  324:invokespecial   #267 <Method void StringBuilder()>
	//  141  327:ldc2            #512 <String ", categoriesExclude=">
	//  142  330:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  143  333:aload_0         
	//  144  334:getfield        #82  <Field Set categoriesExclude>
	//  145  337:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//  146  340:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  147  343:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  148  346:pop             
		stringbuilder.append((new StringBuilder()).append(", packageExclude=").append(((Object) (packageExclude))).toString());
	//  149  347:aload_1         
	//  150  348:new             #266 <Class StringBuilder>
	//  151  351:dup             
	//  152  352:invokespecial   #267 <Method void StringBuilder()>
	//  153  355:ldc2            #514 <String ", packageExclude=">
	//  154  358:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  155  361:aload_0         
	//  156  362:getfield        #84  <Field Set packageExclude>
	//  157  365:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//  158  368:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  159  371:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  160  374:pop             
		stringbuilder.append((new StringBuilder()).append(", packageInclude=").append(((Object) (packageInclude))).toString());
	//  161  375:aload_1         
	//  162  376:new             #266 <Class StringBuilder>
	//  163  379:dup             
	//  164  380:invokespecial   #267 <Method void StringBuilder()>
	//  165  383:ldc2            #516 <String ", packageInclude=">
	//  166  386:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  167  389:aload_0         
	//  168  390:getfield        #86  <Field Set packageInclude>
	//  169  393:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//  170  396:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  171  399:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  172  402:pop             
		stringbuilder.append((new StringBuilder()).append(", simpleToken=").append(((Object) (simpleToken))).toString());
	//  173  403:aload_1         
	//  174  404:new             #266 <Class StringBuilder>
	//  175  407:dup             
	//  176  408:invokespecial   #267 <Method void StringBuilder()>
	//  177  411:ldc2            #518 <String ", simpleToken=">
	//  178  414:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  179  417:aload_0         
	//  180  418:getfield        #303 <Field Pair simpleToken>
	//  181  421:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//  182  424:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  183  427:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  184  430:pop             
		stringbuilder.append((new StringBuilder()).append(", engInclude=").append(engInclude).toString());
	//  185  431:aload_1         
	//  186  432:new             #266 <Class StringBuilder>
	//  187  435:dup             
	//  188  436:invokespecial   #267 <Method void StringBuilder()>
	//  189  439:ldc2            #520 <String ", engInclude=">
	//  190  442:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  191  445:aload_0         
	//  192  446:getfield        #90  <Field boolean engInclude>
	//  193  449:invokevirtual   #489 <Method StringBuilder StringBuilder.append(boolean)>
	//  194  452:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  195  455:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  196  458:pop             
		stringbuilder.append((new StringBuilder()).append(", country=").append(country).toString());
	//  197  459:aload_1         
	//  198  460:new             #266 <Class StringBuilder>
	//  199  463:dup             
	//  200  464:invokespecial   #267 <Method void StringBuilder()>
	//  201  467:ldc2            #522 <String ", country=">
	//  202  470:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  203  473:aload_0         
	//  204  474:getfield        #92  <Field String country>
	//  205  477:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  206  480:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  207  483:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  208  486:pop             
		stringbuilder.append((new StringBuilder()).append(", advertiserId=").append(advertiserId).toString());
	//  209  487:aload_1         
	//  210  488:new             #266 <Class StringBuilder>
	//  211  491:dup             
	//  212  492:invokespecial   #267 <Method void StringBuilder()>
	//  213  495:ldc2            #524 <String ", advertiserId=">
	//  214  498:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  215  501:aload_0         
	//  216  502:getfield        #94  <Field String advertiserId>
	//  217  505:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  218  508:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  219  511:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  220  514:pop             
		stringbuilder.append((new StringBuilder()).append(", type=").append(((Object) (type))).toString());
	//  221  515:aload_1         
	//  222  516:new             #266 <Class StringBuilder>
	//  223  519:dup             
	//  224  520:invokespecial   #267 <Method void StringBuilder()>
	//  225  523:ldc2            #526 <String ", type=">
	//  226  526:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  227  529:aload_0         
	//  228  530:getfield        #96  <Field com.startapp.android.publish.adsCommon.Ad$AdType type>
	//  229  533:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//  230  536:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  231  539:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  232  542:pop             
		stringbuilder.append((new StringBuilder()).append(", minCpm=").append(((Object) (minCpm))).toString());
	//  233  543:aload_1         
	//  234  544:new             #266 <Class StringBuilder>
	//  235  547:dup             
	//  236  548:invokespecial   #267 <Method void StringBuilder()>
	//  237  551:ldc2            #528 <String ", minCpm=">
	//  238  554:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  239  557:aload_0         
	//  240  558:getfield        #202 <Field Double minCpm>
	//  241  561:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//  242  564:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  243  567:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  244  570:pop             
		stringbuilder.append((new StringBuilder()).append(", sessionStartTime=").append(timeSinceSessionStart).toString());
	//  245  571:aload_1         
	//  246  572:new             #266 <Class StringBuilder>
	//  247  575:dup             
	//  248  576:invokespecial   #267 <Method void StringBuilder()>
	//  249  579:ldc2            #530 <String ", sessionStartTime=">
	//  250  582:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  251  585:aload_0         
	//  252  586:getfield        #113 <Field long timeSinceSessionStart>
	//  253  589:invokevirtual   #533 <Method StringBuilder StringBuilder.append(long)>
	//  254  592:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  255  595:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  256  598:pop             
		stringbuilder.append((new StringBuilder()).append(", adsDisplayed=").append(adsDisplayed).toString());
	//  257  599:aload_1         
	//  258  600:new             #266 <Class StringBuilder>
	//  259  603:dup             
	//  260  604:invokespecial   #267 <Method void StringBuilder()>
	//  261  607:ldc2            #535 <String ", adsDisplayed=">
	//  262  610:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  263  613:aload_0         
	//  264  614:getfield        #127 <Field int adsDisplayed>
	//  265  617:invokevirtual   #506 <Method StringBuilder StringBuilder.append(int)>
	//  266  620:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  267  623:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  268  626:pop             
		stringbuilder.append((new StringBuilder()).append(", profileId=").append(profileId).toString());
	//  269  627:aload_1         
	//  270  628:new             #266 <Class StringBuilder>
	//  271  631:dup             
	//  272  632:invokespecial   #267 <Method void StringBuilder()>
	//  273  635:ldc2            #537 <String ", profileId=">
	//  274  638:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  275  641:aload_0         
	//  276  642:getfield        #139 <Field String profileId>
	//  277  645:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  278  648:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  279  651:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  280  654:pop             
		stringbuilder.append((new StringBuilder()).append(", hardwareAccelerated=").append(isHardwareAccelerated).toString());
	//  281  655:aload_1         
	//  282  656:new             #266 <Class StringBuilder>
	//  283  659:dup             
	//  284  660:invokespecial   #267 <Method void StringBuilder()>
	//  285  663:ldc2            #539 <String ", hardwareAccelerated=">
	//  286  666:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  287  669:aload_0         
	//  288  670:getfield        #64  <Field boolean isHardwareAccelerated>
	//  289  673:invokevirtual   #489 <Method StringBuilder StringBuilder.append(boolean)>
	//  290  676:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  291  679:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  292  682:pop             
		stringbuilder.append((new StringBuilder()).append(", primaryImg=").append(primaryImg).toString());
	//  293  683:aload_1         
	//  294  684:new             #266 <Class StringBuilder>
	//  295  687:dup             
	//  296  688:invokespecial   #267 <Method void StringBuilder()>
	//  297  691:ldc2            #541 <String ", primaryImg=">
	//  298  694:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  299  697:aload_0         
	//  300  698:getfield        #249 <Field String primaryImg>
	//  301  701:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  302  704:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  303  707:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  304  710:pop             
		stringbuilder.append((new StringBuilder()).append(", moreImg=").append(moreImg).toString());
	//  305  711:aload_1         
	//  306  712:new             #266 <Class StringBuilder>
	//  307  715:dup             
	//  308  716:invokespecial   #267 <Method void StringBuilder()>
	//  309  719:ldc2            #543 <String ", moreImg=">
	//  310  722:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  311  725:aload_0         
	//  312  726:getfield        #252 <Field String moreImg>
	//  313  729:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  314  732:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  315  735:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  316  738:pop             
		stringbuilder.append((new StringBuilder()).append(", contentAd=").append(contentAd).toString());
	//  317  739:aload_1         
	//  318  740:new             #266 <Class StringBuilder>
	//  319  743:dup             
	//  320  744:invokespecial   #267 <Method void StringBuilder()>
	//  321  747:ldc2            #545 <String ", contentAd=">
	//  322  750:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  323  753:aload_0         
	//  324  754:getfield        #255 <Field boolean contentAd>
	//  325  757:invokevirtual   #489 <Method StringBuilder StringBuilder.append(boolean)>
	//  326  760:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  327  763:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  328  766:pop             
		stringbuilder.append("]");
	//  329  767:aload_1         
	//  330  768:ldc2            #547 <String "]">
	//  331  771:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//  332  774:pop             
		return stringbuilder.toString();
	//  333  775:aload_1         
	//  334  776:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  335  779:areturn         
	}

	private int adsDisplayed;
	private int adsNumber;
	private String advertiserId;
	private String age;
	private Boolean ai;
	private Boolean as;
	private Set campaignExclude;
	private Set categories;
	private Set categoriesExclude;
	private boolean contentAd;
	private String country;
	private boolean engInclude;
	private com.startapp.android.publish.adsCommon.SDKAdPreferences.Gender gender;
	private Boolean isAutoDateTimeEnabled;
	private boolean isDisableTwoClicks;
	private boolean isHardwareAccelerated;
	private String keywords;
	private Double minCpm;
	private String moreImg;
	private int offset;
	private Set packageExclude;
	private Set packageInclude;
	private AdPreferences.Placement placement;
	private String primaryImg;
	private String profileId;
	private Pair simpleToken;
	private String template;
	private boolean testMode;
	private long timeSinceSessionStart;
	private com.startapp.android.publish.adsCommon.Ad.AdType type;
}
