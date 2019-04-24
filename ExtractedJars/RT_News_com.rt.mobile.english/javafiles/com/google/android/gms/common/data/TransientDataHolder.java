// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.data:
//			DataHolder

public final class TransientDataHolder
{

	public TransientDataHolder(String as[])
	{
		this(as, ((String) (null)), ((String) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #14  <Method void TransientDataHolder(String[], String, String, String)>
	//    6    8:return          
	}

	public TransientDataHolder(String as[], String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzos = s1;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #20  <Field String zzos>
		zzot = s2;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #22  <Field String zzot>
		if(s != null)
	//*   8   15:aload_2         
	//*   9   16:ifnull          31
			as = ((String []) (DataHolder.builder(as, s)));
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokestatic    #28  <Method DataHolder$Builder DataHolder.builder(String[], String)>
	//   13   24:astore_1        
		else
	//*  14   25:aload_0         
	//*  15   26:aload_1         
	//*  16   27:putfield        #30  <Field DataHolder$Builder zzou>
	//*  17   30:return          
			as = ((String []) (DataHolder.builder(as)));
	//   18   31:aload_1         
	//   19   32:invokestatic    #33  <Method DataHolder$Builder DataHolder.builder(String[])>
	//   20   35:astore_1        
		zzou = ((DataHolder.Builder) (as));
	//*  21   36:goto            25
	}

	public final void addRow(ContentValues contentvalues)
	{
		zzou.withRow(contentvalues);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field DataHolder$Builder zzou>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method DataHolder$Builder DataHolder$Builder.withRow(ContentValues)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final DataHolder build(int i)
	{
		return build(i, new Bundle(), -1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:new             #46  <Class Bundle>
	//    3    5:dup             
	//    4    6:invokespecial   #47  <Method void Bundle()>
	//    5    9:iconst_m1       
	//    6   10:invokevirtual   #50  <Method DataHolder build(int, Bundle, int)>
	//    7   13:areturn         
	}

	public final DataHolder build(int i, Bundle bundle, int j)
	{
		bundle.putString("next_page_token", zzot);
	//    0    0:aload_2         
	//    1    1:ldc1            #53  <String "next_page_token">
	//    2    3:aload_0         
	//    3    4:getfield        #22  <Field String zzot>
	//    4    7:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		bundle.putString("prev_page_token", zzos);
	//    5   10:aload_2         
	//    6   11:ldc1            #59  <String "prev_page_token">
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field String zzos>
	//    9   17:invokevirtual   #57  <Method void Bundle.putString(String, String)>
		return zzou.build(i, bundle, j);
	//   10   20:aload_0         
	//   11   21:getfield        #30  <Field DataHolder$Builder zzou>
	//   12   24:iload_1         
	//   13   25:aload_2         
	//   14   26:iload_3         
	//   15   27:invokevirtual   #60  <Method DataHolder DataHolder$Builder.build(int, Bundle, int)>
	//   16   30:areturn         
	}

	public final boolean containsRowWithValue(String s, Object obj)
	{
		return zzou.containsRowWithValue(s, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field DataHolder$Builder zzou>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #64  <Method boolean DataHolder$Builder.containsRowWithValue(String, Object)>
	//    5    9:ireturn         
	}

	public final int getCount()
	{
		return zzou.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field DataHolder$Builder zzou>
	//    2    4:invokevirtual   #68  <Method int DataHolder$Builder.getCount()>
	//    3    7:ireturn         
	}

	public final String getNextToken()
	{
		return zzot;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String zzot>
	//    2    4:areturn         
	}

	public final String getPrevToken()
	{
		return zzos;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String zzos>
	//    2    4:areturn         
	}

	public final void modifyUniqueRowValue(Object obj, String s, Object obj1)
	{
		zzou.modifyUniqueRowValue(obj, s, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field DataHolder$Builder zzou>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #75  <Method void DataHolder$Builder.modifyUniqueRowValue(Object, String, Object)>
	//    6   10:return          
	}

	public final void removeRows(String s, Object obj)
	{
		zzou.removeRowsWithValue(s, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field DataHolder$Builder zzou>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #81  <Method DataHolder$Builder DataHolder$Builder.removeRowsWithValue(String, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public final void setNextToken(String s)
	{
		zzot = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String zzot>
	//    3    5:return          
	}

	public final void setPrevToken(String s)
	{
		zzos = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String zzos>
	//    3    5:return          
	}

	public final void sortData(String s)
	{
		zzou.sort(s);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field DataHolder$Builder zzou>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #89  <Method DataHolder$Builder DataHolder$Builder.sort(String)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void sortDataDescending(String s)
	{
		zzou.descendingSort(s);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field DataHolder$Builder zzou>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #93  <Method DataHolder$Builder DataHolder$Builder.descendingSort(String)>
	//    4    8:pop             
	//    5    9:return          
	}

	private String zzos;
	private String zzot;
	private DataHolder.Builder zzou;
}
