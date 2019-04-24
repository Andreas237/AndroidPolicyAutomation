// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.core;

import cn.com.fmsh.script.ApduFilterDataInit;
import cn.com.fmsh.script.core.FilterPolicy;
import java.util.ArrayList;
import java.util.List;

public class ApduFilterDataInitImpl
	implements ApduFilterDataInit
{

	public ApduFilterDataInitImpl(byte abyte0[][])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		aids = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field byte[][] aids>
		aids = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #15  <Field byte[][] aids>
	//    8   14:return          
	}

	public List getFilterPolicies()
	{
		if(aids == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field byte[][] aids>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		ArrayList arraylist = new ArrayList();
	//    5    9:new             #20  <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #21  <Method void ArrayList()>
	//    8   16:astore_3        
		FilterPolicy filterpolicy = new FilterPolicy();
	//    9   17:new             #23  <Class FilterPolicy>
	//   10   20:dup             
	//   11   21:invokespecial   #24  <Method void FilterPolicy()>
	//   12   24:astore          4
		filterpolicy.setCla((byte)0);
	//   13   26:aload           4
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #28  <Method void FilterPolicy.setCla(byte)>
		filterpolicy.setIns((byte)-92);
	//   16   32:aload           4
	//   17   34:bipush          -92
	//   18   36:invokevirtual   #31  <Method void FilterPolicy.setIns(byte)>
		byte abyte0[][] = aids;
	//   19   39:aload_0         
	//   20   40:getfield        #15  <Field byte[][] aids>
	//   21   43:astore          5
		int j = abyte0.length;
	//   22   45:aload           5
	//   23   47:arraylength     
	//   24   48:istore_2        
		for(int i = 0; i < j; i++)
	//*  25   49:iconst_0        
	//*  26   50:istore_1        
	//*  27   51:goto            76
		{
			byte abyte1[] = abyte0[i];
	//   28   54:aload           5
	//   29   56:iload_1         
	//   30   57:aaload          
	//   31   58:astore          6
			if(abyte1 != null)
	//*  32   60:aload           6
	//*  33   62:ifnull          72
				filterpolicy.addFilterData(abyte1);
	//   34   65:aload           4
	//   35   67:aload           6
	//   36   69:invokevirtual   #35  <Method void FilterPolicy.addFilterData(byte[])>
		}

	//   37   72:iload_1         
	//   38   73:iconst_1        
	//   39   74:iadd            
	//   40   75:istore_1        
	//   41   76:iload_1         
	//   42   77:iload_2         
	//   43   78:icmplt          54
		((List) (arraylist)).add(((Object) (filterpolicy)));
	//   44   81:aload_3         
	//   45   82:aload           4
	//   46   84:invokeinterface #41  <Method boolean List.add(Object)>
	//   47   89:pop             
		return ((List) (arraylist));
	//   48   90:aload_3         
	//   49   91:areturn         
	}

	byte aids[][];
}
