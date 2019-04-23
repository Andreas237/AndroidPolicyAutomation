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
		zzbzs = entry;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field java.util.Map$Entry zzbzs>
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
		return zzbzs.getKey();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field java.util.Map$Entry zzbzs>
	//    2    4:invokeinterface #27  <Method Object java.util.Map$Entry.getKey()>
	//    3    9:areturn         
	}

	public final Object getValue()
	{
		if((zzuy)zzbzs.getValue() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field java.util.Map$Entry zzbzs>
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
		if(obj instanceof zzvv)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #41  <Class zzvv>
	//*   2    4:ifeq            27
			return ((Object) (((zzvc) ((zzuy)zzbzs.getValue())).zzi((zzvv)obj)));
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field java.util.Map$Entry zzbzs>
	//    5   11:invokeinterface #31  <Method Object java.util.Map$Entry.getValue()>
	//    6   16:checkcast       #33  <Class zzuy>
	//    7   19:aload_1         
	//    8   20:checkcast       #41  <Class zzvv>
	//    9   23:invokevirtual   #47  <Method zzvv zzvc.zzi(zzvv)>
	//   10   26:areturn         
		else
			throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
	//   11   27:new             #49  <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:ldc1            #51  <String "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite">
	//   14   33:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   15   36:athrow          
	}

	public final zzuy zzxa()
	{
		return (zzuy)zzbzs.getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field java.util.Map$Entry zzbzs>
	//    2    4:invokeinterface #31  <Method Object java.util.Map$Entry.getValue()>
	//    3    9:checkcast       #33  <Class zzuy>
	//    4   12:areturn         
	}

	private java.util.Map.Entry zzbzs;
}
