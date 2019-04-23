// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


class MediaRouteCastDialog$RecyclerAdapter$Item
{

	public Object getData()
	{
		return mData;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object mData>
	//    2    4:areturn         
	}

	public int getType()
	{
		return mType;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int mType>
	//    2    4:ireturn         
	}

	private final Object mData;
	private final int mType;
	final MediaRouteCastDialog.RecyclerAdapter this$1;

	MediaRouteCastDialog$RecyclerAdapter$Item(Object obj, int i)
	{
		this$1 = MediaRouteCastDialog.RecyclerAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
		mData = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Object mData>
		mType = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #21  <Field int mType>
	//   11   19:return          
	}
}
