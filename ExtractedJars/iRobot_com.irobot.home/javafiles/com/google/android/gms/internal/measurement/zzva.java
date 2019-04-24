// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuy, zzvv, zzvc, zzuz

final class zzva
	implements java.util.Map.Entry
{

	private zzva(java.util.Map.Entry entry)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzbzu = entry;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field java.util.Map$Entry zzbzu>
	//    5    9:return          
	}

	zzva(java.util.Map.Entry entry, zzuz zzuz)
	{
		this(entry);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void zzva(java.util.Map$Entry)>
	//    3    5:return          
	}

	public final Object getKey()
	{
		return zzbzu.getKey();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field java.util.Map$Entry zzbzu>
	//    2    4:invokeinterface #27  <Method Object java.util.Map$Entry.getKey()>
	//    3    9:areturn         
	}

	public final Object getValue()
	{
		if((zzuy)zzbzu.getValue() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field java.util.Map$Entry zzbzu>
	//*   2    4:invokeinterface #31  <Method Object java.util.Map$Entry.getValue()>
	//*   3    9:checkcast       #33  <Class zzuy>
	//*   4   12:ifnonnull       17
			return ((Object) (null));
	//    5   15:aconst_null     
	//    6   16:areturn         
		else
			return ((Object) (zzuy.zzwz()));
	//    7   17:invokestatic    #37  <Method zzvv zzuy.zzwz()>
	//    8   20:areturn         
	}

	public final Object setValue(Object obj)
	{
		if(!(obj instanceof zzvv))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #41  <Class zzvv>
	//*   2    4:ifne            17
			throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
	//    3    7:new             #43  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #45  <String "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite">
	//    6   13:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return ((Object) (((zzvc) ((zzuy)zzbzu.getValue())).zzi((zzvv)obj)));
	//    8   17:aload_0         
	//    9   18:getfield        #17  <Field java.util.Map$Entry zzbzu>
	//   10   21:invokeinterface #31  <Method Object java.util.Map$Entry.getValue()>
	//   11   26:checkcast       #33  <Class zzuy>
	//   12   29:aload_1         
	//   13   30:checkcast       #41  <Class zzvv>
	//   14   33:invokevirtual   #54  <Method zzvv zzvc.zzi(zzvv)>
	//   15   36:areturn         
	}

	public final zzuy zzxa()
	{
		return (zzuy)zzbzu.getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field java.util.Map$Entry zzbzu>
	//    2    4:invokeinterface #31  <Method Object java.util.Map$Entry.getValue()>
	//    3    9:checkcast       #33  <Class zzuy>
	//    4   12:areturn         
	}

	private java.util.Map.Entry zzbzu;
}
