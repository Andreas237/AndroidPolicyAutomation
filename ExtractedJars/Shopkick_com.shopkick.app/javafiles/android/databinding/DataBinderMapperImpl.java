// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			MergedDataBinderMapper

public class DataBinderMapperImpl extends MergedDataBinderMapper
{

	DataBinderMapperImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void MergedDataBinderMapper()>
		addMapper(((DataBinderMapper) (new com.shopkick.app.DataBinderMapperImpl())));
	//    2    4:aload_0         
	//    3    5:new             #10  <Class com.shopkick.app.DataBinderMapperImpl>
	//    4    8:dup             
	//    5    9:invokespecial   #11  <Method void com.shopkick.app.DataBinderMapperImpl()>
	//    6   12:invokevirtual   #15  <Method void addMapper(DataBinderMapper)>
	//    7   15:return          
	}
}
