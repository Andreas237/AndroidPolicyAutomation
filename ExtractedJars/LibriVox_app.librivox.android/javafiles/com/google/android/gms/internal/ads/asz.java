// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asx, atv, atb, asy

final class asz
	implements java.util.Map.Entry
{

	private asz(java.util.Map.Entry entry)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = entry;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field java.util.Map$Entry a>
	//    5    9:return          
	}

	asz(java.util.Map.Entry entry, asy asy)
	{
		this(entry);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void asz(java.util.Map$Entry)>
	//    3    5:return          
	}

	public final asx a()
	{
		return (asx)a.getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field java.util.Map$Entry a>
	//    2    4:invokeinterface #24  <Method Object java.util.Map$Entry.getValue()>
	//    3    9:checkcast       #26  <Class asx>
	//    4   12:areturn         
	}

	public final Object getKey()
	{
		return a.getKey();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field java.util.Map$Entry a>
	//    2    4:invokeinterface #29  <Method Object java.util.Map$Entry.getKey()>
	//    3    9:areturn         
	}

	public final Object getValue()
	{
		if((asx)a.getValue() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field java.util.Map$Entry a>
	//*   2    4:invokeinterface #24  <Method Object java.util.Map$Entry.getValue()>
	//*   3    9:checkcast       #26  <Class asx>
	//*   4   12:ifnonnull       17
			return ((Object) (null));
	//    5   15:aconst_null     
	//    6   16:areturn         
		else
			return ((Object) (asx.a()));
	//    7   17:invokestatic    #32  <Method atv asx.a()>
	//    8   20:areturn         
	}

	public final Object setValue(Object obj)
	{
		if(obj instanceof atv)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #36  <Class atv>
	//*   2    4:ifeq            27
			return ((Object) (((atb) ((asx)a.getValue())).a((atv)obj)));
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field java.util.Map$Entry a>
	//    5   11:invokeinterface #24  <Method Object java.util.Map$Entry.getValue()>
	//    6   16:checkcast       #26  <Class asx>
	//    7   19:aload_1         
	//    8   20:checkcast       #36  <Class atv>
	//    9   23:invokevirtual   #41  <Method atv atb.a(atv)>
	//   10   26:areturn         
		else
			throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
	//   11   27:new             #43  <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:ldc1            #45  <String "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite">
	//   14   33:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//   15   36:athrow          
	}

	private java.util.Map.Entry a;
}
