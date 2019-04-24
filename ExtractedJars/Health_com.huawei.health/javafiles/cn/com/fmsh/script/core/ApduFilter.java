// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.core;

import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.util.*;

// Referenced classes of package cn.com.fmsh.script.core:
//			FilterPolicy

public class ApduFilter
{

	public ApduFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		policies = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field List policies>
	//    7   15:return          
	}

	public void addFilterPolicy(FilterPolicy filterpolicy)
	{
		policies.add(((Object) (filterpolicy)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List policies>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public byte[] filter(byte abyte0[])
	{
		FMLog fmlog = LogFactory.getInstance().getLog();
	//    0    0:invokestatic    #33  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #37  <Method FMLog LogFactory.getLog()>
	//    2    6:astore          4
		if(abyte0 == null || abyte0.length < 5)
	//*   3    8:aload_1         
	//*   4    9:ifnull          18
	//*   5   12:aload_1         
	//*   6   13:arraylength     
	//*   7   14:iconst_5        
	//*   8   15:icmpge          39
		{
			if(fmlog != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          37
				fmlog.warn(((Class) (cn/com/fmsh/script/core/ApduFilter)).getName(), "\u8BF7\u6C42\u8FC7\u6EE4\u65F6\uFF0C\u8BF7\u6C42\u6570\u636E\u4E0D\u5408\u6CD5");
	//   11   23:aload           4
	//   12   25:ldc1            #2   <Class ApduFilter>
	//   13   27:invokevirtual   #43  <Method String Class.getName()>
	//   14   30:ldc1            #45  <String "\u8BF7\u6C42\u8FC7\u6EE4\u65F6\uFF0C\u8BF7\u6C42\u6570\u636E\u4E0D\u5408\u6CD5">
	//   15   32:invokeinterface #51  <Method void FMLog.warn(String, String)>
			return null;
	//   16   37:aconst_null     
	//   17   38:areturn         
		}
		if(policies.size() < 1)
	//*  18   39:aload_0         
	//*  19   40:getfield        #16  <Field List policies>
	//*  20   43:invokeinterface #55  <Method int List.size()>
	//*  21   48:iconst_1        
	//*  22   49:icmpge          54
			return null;
	//   23   52:aconst_null     
	//   24   53:areturn         
		for(Iterator iterator = policies.iterator(); iterator.hasNext();)
	//*  25   54:aload_0         
	//*  26   55:getfield        #16  <Field List policies>
	//*  27   58:invokeinterface #59  <Method Iterator List.iterator()>
	//*  28   63:astore          5
	//*  29   65:goto            197
		{
			FilterPolicy filterpolicy = (FilterPolicy)iterator.next();
	//   30   68:aload           5
	//   31   70:invokeinterface #65  <Method Object Iterator.next()>
	//   32   75:checkcast       #67  <Class FilterPolicy>
	//   33   78:astore          7
			if(filterpolicy != null && filterpolicy.getCla() == abyte0[0] && filterpolicy.getIns() == abyte0[1])
	//*  34   80:aload           7
	//*  35   82:ifnull          197
	//*  36   85:aload           7
	//*  37   87:invokevirtual   #71  <Method byte FilterPolicy.getCla()>
	//*  38   90:aload_1         
	//*  39   91:iconst_0        
	//*  40   92:baload          
	//*  41   93:icmpne          197
	//*  42   96:aload           7
	//*  43   98:invokevirtual   #74  <Method byte FilterPolicy.getIns()>
	//*  44  101:aload_1         
	//*  45  102:iconst_1        
	//*  46  103:baload          
	//*  47  104:icmpne          197
			{
				byte abyte1[] = Arrays.copyOfRange(abyte0, 5, abyte0.length);
	//   48  107:aload_1         
	//   49  108:iconst_5        
	//   50  109:aload_1         
	//   51  110:arraylength     
	//   52  111:invokestatic    #80  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   53  114:astore          6
				byte abyte2[][] = filterpolicy.getFilterDatas();
	//   54  116:aload           7
	//   55  118:invokevirtual   #84  <Method byte[][] FilterPolicy.getFilterDatas()>
	//   56  121:astore          7
				int j = abyte2.length;
	//   57  123:aload           7
	//   58  125:arraylength     
	//   59  126:istore_3        
				for(int i = 0; i < j; i++)
	//*  60  127:iconst_0        
	//*  61  128:istore_2        
	//*  62  129:goto            192
				{
					byte abyte3[] = abyte2[i];
	//   63  132:aload           7
	//   64  134:iload_2         
	//   65  135:aaload          
	//   66  136:astore          8
					if(Arrays.equals(abyte3, abyte1))
	//*  67  138:aload           8
	//*  68  140:aload           6
	//*  69  142:invokestatic    #88  <Method boolean Arrays.equals(byte[], byte[])>
	//*  70  145:ifeq            188
					{
						if(fmlog != null)
	//*  71  148:aload           4
	//*  72  150:ifnull          185
							fmlog.debug(((Class) (cn/com/fmsh/script/core/ApduFilter)).getName(), (new StringBuilder("open\u83B7\u53D6\u7684AID\uFF1A")).append(FM_Bytes.bytesToHexString(abyte3)).toString());
	//   73  153:aload           4
	//   74  155:ldc1            #2   <Class ApduFilter>
	//   75  157:invokevirtual   #43  <Method String Class.getName()>
	//   76  160:new             #90  <Class StringBuilder>
	//   77  163:dup             
	//   78  164:ldc1            #92  <String "open\u83B7\u53D6\u7684AID\uFF1A">
	//   79  166:invokespecial   #95  <Method void StringBuilder(String)>
	//   80  169:aload           8
	//   81  171:invokestatic    #101 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   82  174:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   83  177:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   84  180:invokeinterface #111 <Method void FMLog.debug(String, String)>
						return abyte3;
	//   85  185:aload           8
	//   86  187:areturn         
					}
				}

	//   87  188:iload_2         
	//   88  189:iconst_1        
	//   89  190:iadd            
	//   90  191:istore_2        
	//   91  192:iload_2         
	//   92  193:iload_3         
	//   93  194:icmplt          132
			}
		}

	//   94  197:aload           5
	//   95  199:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//   96  204:ifne            68
		return null;
	//   97  207:aconst_null     
	//   98  208:areturn         
	}

	private List policies;
}
