// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zaa, Preconditions, IAccountAccessor, AccountAccessor

public class AuthAccountRequest extends AbstractSafeParcelable
{

	AuthAccountRequest(int i, IBinder ibinder, Scope ascope[], Integer integer, Integer integer1, Account account)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void AbstractSafeParcelable()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #49  <Field int zale>
		zanw = ibinder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field IBinder zanw>
		zanx = ascope;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #53  <Field Scope[] zanx>
		zany = integer;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #55  <Field Integer zany>
		zanz = integer1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #57  <Field Integer zanz>
		zax = account;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #59  <Field Account zax>
	//   20   37:return          
	}

	public AuthAccountRequest(Account account, Set set)
	{
		this(3, ((IBinder) (null)), (Scope[])set.toArray(((Object []) (new Scope[set.size()]))), ((Integer) (null)), ((Integer) (null)), (Account)Preconditions.checkNotNull(((Object) (account))));
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:aload_2         
	//    5    5:invokeinterface #68  <Method int Set.size()>
	//    6   10:anewarray       Scope[]
	//    7   13:invokeinterface #74  <Method Object[] Set.toArray(Object[])>
	//    8   18:checkcast       #75  <Class Scope[]>
	//    9   21:aconst_null     
	//   10   22:aconst_null     
	//   11   23:aload_1         
	//   12   24:invokestatic    #81  <Method Object Preconditions.checkNotNull(Object)>
	//   13   27:checkcast       #83  <Class Account>
	//   14   30:invokespecial   #85  <Method void AuthAccountRequest(int, IBinder, Scope[], Integer, Integer, Account)>
	//   15   33:return          
	}

	public AuthAccountRequest(IAccountAccessor iaccountaccessor, Set set)
	{
		this(3, iaccountaccessor.asBinder(), (Scope[])set.toArray(((Object []) (new Scope[set.size()]))), ((Integer) (null)), ((Integer) (null)), ((Account) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_1         
	//    3    3:invokeinterface #94  <Method IBinder IAccountAccessor.asBinder()>
	//    4    8:aload_2         
	//    5    9:aload_2         
	//    6   10:invokeinterface #68  <Method int Set.size()>
	//    7   15:anewarray       Scope[]
	//    8   18:invokeinterface #74  <Method Object[] Set.toArray(Object[])>
	//    9   23:checkcast       #75  <Class Scope[]>
	//   10   26:aconst_null     
	//   11   27:aconst_null     
	//   12   28:aconst_null     
	//   13   29:invokespecial   #85  <Method void AuthAccountRequest(int, IBinder, Scope[], Integer, Integer, Account)>
	//   14   32:return          
	}

	public Account getAccount()
	{
		Object obj = ((Object) (zax));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Account zax>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((Account) (obj));
	//    5    9:aload_1         
	//    6   10:areturn         
		obj = ((Object) (zanw));
	//    7   11:aload_0         
	//    8   12:getfield        #51  <Field IBinder zanw>
	//    9   15:astore_1        
		if(obj != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          28
			return AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(((IBinder) (obj))));
	//   12   20:aload_1         
	//   13   21:invokestatic    #104 <Method IAccountAccessor IAccountAccessor$Stub.asInterface(IBinder)>
	//   14   24:invokestatic    #110 <Method Account AccountAccessor.getAccountBinderSafe(IAccountAccessor)>
	//   15   27:areturn         
		else
			return null;
	//   16   28:aconst_null     
	//   17   29:areturn         
	}

	public Integer getOauthPolicy()
	{
		return zany;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Integer zany>
	//    2    4:areturn         
	}

	public Integer getPolicyAction()
	{
		return zanz;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Integer zanz>
	//    2    4:areturn         
	}

	public Set getScopes()
	{
		return ((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (zanx))))))));
	//    0    0:new             #118 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field Scope[] zanx>
	//    4    8:invokestatic    #124 <Method java.util.List Arrays.asList(Object[])>
	//    5   11:invokespecial   #127 <Method void HashSet(java.util.Collection)>
	//    6   14:areturn         
	}

	public AuthAccountRequest setOauthPolicy(Integer integer)
	{
		zany = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field Integer zany>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AuthAccountRequest setPolicyAction(Integer integer)
	{
		zanz = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field Integer zanz>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #140 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field int zale>
	//    7   11:invokestatic    #144 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeIBinder(parcel, 2, zanw, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #51  <Field IBinder zanw>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #148 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 3, ((android.os.Parcelable []) (zanx)), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #53  <Field Scope[] zanx>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #152 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeIntegerObject(parcel, 4, zany, false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:getfield        #55  <Field Integer zany>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #156 <Method void SafeParcelWriter.writeIntegerObject(Parcel, int, Integer, boolean)>
		SafeParcelWriter.writeIntegerObject(parcel, 5, zanz, false);
	//   27   45:aload_1         
	//   28   46:iconst_5        
	//   29   47:aload_0         
	//   30   48:getfield        #57  <Field Integer zanz>
	//   31   51:iconst_0        
	//   32   52:invokestatic    #156 <Method void SafeParcelWriter.writeIntegerObject(Parcel, int, Integer, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 6, ((android.os.Parcelable) (zax)), i, false);
	//   33   55:aload_1         
	//   34   56:bipush          6
	//   35   58:aload_0         
	//   36   59:getfield        #59  <Field Account zax>
	//   37   62:iload_2         
	//   38   63:iconst_0        
	//   39   64:invokestatic    #160 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   40   67:aload_1         
	//   41   68:iload_3         
	//   42   69:invokestatic    #163 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   43   72:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zaa();
	private final int zale;
	private final IBinder zanw;
	private final Scope zanx[];
	private Integer zany;
	private Integer zanz;
	private Account zax;

	static 
	{
	//    0    0:new             #37  <Class zaa>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void zaa()>
	//    3    7:putstatic       #42  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
