// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			x, a

public final class SignInConfiguration extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public SignInConfiguration(String s, GoogleSignInOptions googlesigninoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		a = am.a(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #29  <Method String am.a(String)>
	//    5    9:putfield        #31  <Field String a>
		b = googlesigninoptions;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #33  <Field GoogleSignInOptions b>
	//    9   17:return          
	}

	public final GoogleSignInOptions a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field GoogleSignInOptions b>
	//    2    4:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof SignInConfiguration))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class SignInConfiguration>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((SignInConfiguration)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class SignInConfiguration>
	//    7   13:astore_1        
		if(a.equals(((Object) (((SignInConfiguration) (obj)).a))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #31  <Field String a>
	//*  10   18:aload_1         
	//*  11   19:getfield        #31  <Field String a>
	//*  12   22:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  13   25:ifeq            60
		{
			GoogleSignInOptions googlesigninoptions = b;
	//   14   28:aload_0         
	//   15   29:getfield        #33  <Field GoogleSignInOptions b>
	//   16   32:astore_2        
			if(googlesigninoptions != null ? googlesigninoptions.equals(((Object) (((SignInConfiguration) (obj)).b))) : ((SignInConfiguration) (obj)).b == null)
	//*  17   33:aload_2         
	//*  18   34:ifnonnull       47
	//*  19   37:aload_1         
	//*  20   38:getfield        #33  <Field GoogleSignInOptions b>
	//*  21   41:ifnonnull       60
	//*  22   44:goto            58
	//*  23   47:aload_2         
	//*  24   48:aload_1         
	//*  25   49:getfield        #33  <Field GoogleSignInOptions b>
	//*  26   52:invokevirtual   #43  <Method boolean GoogleSignInOptions.equals(Object)>
	//*  27   55:ifeq            60
				return true;
	//   28   58:iconst_1        
	//   29   59:ireturn         
		}
		return false;
	//   30   60:iconst_0        
	//   31   61:ireturn         
	}

	public final int hashCode()
	{
		return (new a()).a(((Object) (a))).a(((Object) (b))).a();
	//    0    0:new             #47  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void a()>
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field String a>
	//    5   11:invokevirtual   #51  <Method a a.a(Object)>
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field GoogleSignInOptions b>
	//    8   18:invokevirtual   #51  <Method a a.a(Object)>
	//    9   21:invokevirtual   #53  <Method int a.a()>
	//   10   24:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #60  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #63  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, 5, ((android.os.Parcelable) (b)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_5        
	//   11   17:aload_0         
	//   12   18:getfield        #33  <Field GoogleSignInOptions b>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #66  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		c.a(parcel, j);
	//   16   26:aload_1         
	//   17   27:iload_3         
	//   18   28:invokestatic    #68  <Method void c.a(Parcel, int)>
	//   19   31:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new x();
	private final String a;
	private GoogleSignInOptions b;

	static 
	{
	//    0    0:new             #16  <Class x>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void x()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
