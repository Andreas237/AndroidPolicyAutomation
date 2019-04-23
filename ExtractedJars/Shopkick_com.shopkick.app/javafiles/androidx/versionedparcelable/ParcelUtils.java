// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import android.os.Parcelable;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package androidx.versionedparcelable:
//			VersionedParcelStream, ParcelImpl, VersionedParcelable

public class ParcelUtils
{

	private ParcelUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static VersionedParcelable fromInputStream(InputStream inputstream)
	{
		return (new VersionedParcelStream(inputstream, ((OutputStream) (null)))).readVersionedParcelable();
	//    0    0:new             #17  <Class VersionedParcelStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #20  <Method void VersionedParcelStream(InputStream, OutputStream)>
	//    5    9:invokevirtual   #24  <Method VersionedParcelable VersionedParcelStream.readVersionedParcelable()>
	//    6   12:areturn         
	}

	public static VersionedParcelable fromParcelable(Parcelable parcelable)
	{
		if(parcelable instanceof ParcelImpl)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #30  <Class ParcelImpl>
	//*   2    4:ifeq            15
			return ((ParcelImpl)parcelable).getVersionedParcel();
	//    3    7:aload_0         
	//    4    8:checkcast       #30  <Class ParcelImpl>
	//    5   11:invokevirtual   #33  <Method VersionedParcelable ParcelImpl.getVersionedParcel()>
	//    6   14:areturn         
		else
			throw new IllegalArgumentException("Invalid parcel");
	//    7   15:new             #35  <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc1            #37  <String "Invalid parcel">
	//   10   21:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
	}

	public static void toOutputStream(VersionedParcelable versionedparcelable, OutputStream outputstream)
	{
		outputstream = ((OutputStream) (new VersionedParcelStream(((InputStream) (null)), outputstream)));
	//    0    0:new             #17  <Class VersionedParcelStream>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokespecial   #20  <Method void VersionedParcelStream(InputStream, OutputStream)>
	//    5    9:astore_1        
		((VersionedParcelStream) (outputstream)).writeVersionedParcelable(versionedparcelable);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #47  <Method void VersionedParcelStream.writeVersionedParcelable(VersionedParcelable)>
		((VersionedParcelStream) (outputstream)).closeField();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #50  <Method void VersionedParcelStream.closeField()>
	//   11   19:return          
	}

	public static Parcelable toParcelable(VersionedParcelable versionedparcelable)
	{
		return ((Parcelable) (new ParcelImpl(versionedparcelable)));
	//    0    0:new             #30  <Class ParcelImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void ParcelImpl(VersionedParcelable)>
	//    4    8:areturn         
	}
}
