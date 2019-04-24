// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.*;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzz, zzl, zza, zzaa

public class zzaa
	implements zzz
{
	public static interface zza extends Binder
		extends zzaa
	{
		static class zza
			implements zzaa
		{

			public IBinder asBinder()
			{
				return zzrk;
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field IBinder zzrk>
			//    2    4:areturn         
			}

			public void zza(IPolylineDelegate ipolylinedelegate)
				throws RemoteException
			{
				Parcel parcel;
				Parcel parcel1;
				parcel = Parcel.obtain();
			//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
			//    1    3:astore_2        
				parcel1 = Parcel.obtain();
			//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
			//    3    7:astore_3        
				parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPolylineClickListener");
			//    4    8:aload_2         
			//    5    9:ldc1            #32  <String "com.google.android.gms.maps.internal.IOnPolylineClickListener">
			//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				if(ipolylinedelegate == null) goto _L2; else goto _L1
			//    7   14:aload_1         
			//    8   15:ifnull          71
_L1:
				ipolylinedelegate = ((IPolylineDelegate) (ipolylinedelegate.asBinder()));
			//    9   18:aload_1         
			//   10   19:invokeinterface #40  <Method IBinder IPolylineDelegate.asBinder()>
			//   11   24:astore_1        
			//*  12   25:goto            28
_L4:
				parcel.writeStrongBinder(((IBinder) (ipolylinedelegate)));
			//   13   28:aload_2         
			//   14   29:aload_1         
			//   15   30:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
				zzrk.transact(1, parcel, parcel1, 0);
			//   16   33:aload_0         
			//   17   34:getfield        #18  <Field IBinder zzrk>
			//   18   37:iconst_1        
			//   19   38:aload_2         
			//   20   39:aload_3         
			//   21   40:iconst_0        
			//   22   41:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
			//   23   46:pop             
				parcel1.readException();
			//   24   47:aload_3         
			//   25   48:invokevirtual   #52  <Method void Parcel.readException()>
				parcel1.recycle();
			//   26   51:aload_3         
			//   27   52:invokevirtual   #55  <Method void Parcel.recycle()>
				parcel.recycle();
			//   28   55:aload_2         
			//   29   56:invokevirtual   #55  <Method void Parcel.recycle()>
				return;
			//   30   59:return          
				ipolylinedelegate;
			//   31   60:astore_1        
				parcel1.recycle();
			//   32   61:aload_3         
			//   33   62:invokevirtual   #55  <Method void Parcel.recycle()>
				parcel.recycle();
			//   34   65:aload_2         
			//   35   66:invokevirtual   #55  <Method void Parcel.recycle()>
				throw ipolylinedelegate;
			//   36   69:aload_1         
			//   37   70:athrow          
_L2:
				ipolylinedelegate = null;
			//   38   71:aconst_null     
			//   39   72:astore_1        
				if(true) goto _L4; else goto _L3
			//   40   73:goto            28
_L3:
			}

			private IBinder zzrk;

			zza(IBinder ibinder)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #16  <Method void Object()>
				zzrk = ibinder;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #18  <Field IBinder zzrk>
			//    5    9:return          
			}
		}


		public static zzaa zzdV(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
		//    4    6:aload_0         
		//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnPolylineClickListener">
		//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzaa))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzaa>
		//*  12   23:ifeq            31
				return (zzaa)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzaa>
		//   15   30:areturn         
			else
				return ((zzaa) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzaa$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #31  <Method void zzaa$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public IBinder asBinder()
		{
			return ((IBinder) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    2: default 28
		//		               1: 39
		//		               1598968902: 31
		//*   2   28:goto            62
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.maps.internal.IOnPolylineClickListener");
		//    3   31:aload_3         
		//    4   32:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnPolylineClickListener">
		//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
				return true;
		//    6   37:iconst_1        
		//    7   38:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
		//    8   39:aload_2         
		//    9   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnPolylineClickListener">
		//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				zza(com.google.android.gms.maps.model.internal.IPolylineDelegate.zza.zzep(parcel.readStrongBinder()));
		//   11   45:aload_0         
		//   12   46:aload_2         
		//   13   47:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   14   50:invokestatic    #55  <Method IPolylineDelegate com.google.android.gms.maps.model.internal.IPolylineDelegate$zza.zzep(IBinder)>
		//   15   53:invokevirtual   #58  <Method void zza(IPolylineDelegate)>
				parcel1.writeNoException();
		//   16   56:aload_3         
		//   17   57:invokevirtual   #61  <Method void Parcel.writeNoException()>
				return true;
		//   18   60:iconst_1        
		//   19   61:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   20   62:aload_0         
		//   21   63:iload_1         
		//   22   64:aload_2         
		//   23   65:aload_3         
		//   24   66:iload           4
		//   25   68:invokespecial   #63  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   26   71:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Binder()>
			attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnPolylineClickListener");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnPolylineClickListener">
		//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
		//    6   11:return          
		}
	}


	public zzaa()
	{
		this(((zza) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #18  <Method void zzaa(zzaa$zza)>
	//    3    5:return          
	}

	public zzaa(zza zza1)
	{
		this(zza1, ((SSLSocketFactory) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void zzaa(zzaa$zza, SSLSocketFactory)>
	//    4    6:return          
	}

	public zzaa(zza zza1, SSLSocketFactory sslsocketfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzaE = zza1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field zzaa$zza zzaE>
		zzaF = sslsocketfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field SSLSocketFactory zzaF>
	//    8   14:return          
	}

	private HttpURLConnection zza(URL url, zzl zzl1)
		throws IOException
	{
		HttpURLConnection httpurlconnection = zza(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method HttpURLConnection zza(URL)>
	//    3    5:astore          4
		int i = zzl1.zzp();
	//    4    7:aload_2         
	//    5    8:invokevirtual   #40  <Method int zzl.zzp()>
	//    6   11:istore_3        
		httpurlconnection.setConnectTimeout(i);
	//    7   12:aload           4
	//    8   14:iload_3         
	//    9   15:invokevirtual   #46  <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(i);
	//   10   18:aload           4
	//   11   20:iload_3         
	//   12   21:invokevirtual   #49  <Method void HttpURLConnection.setReadTimeout(int)>
		httpurlconnection.setUseCaches(false);
	//   13   24:aload           4
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #53  <Method void HttpURLConnection.setUseCaches(boolean)>
		httpurlconnection.setDoInput(true);
	//   16   30:aload           4
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #56  <Method void HttpURLConnection.setDoInput(boolean)>
		if("https".equals(((Object) (url.getProtocol()))) && zzaF != null)
	//*  19   36:ldc1            #58  <String "https">
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #64  <Method String URL.getProtocol()>
	//*  22   42:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  23   45:ifeq            67
	//*  24   48:aload_0         
	//*  25   49:getfield        #28  <Field SSLSocketFactory zzaF>
	//*  26   52:ifnull          67
			((HttpsURLConnection)httpurlconnection).setSSLSocketFactory(zzaF);
	//   27   55:aload           4
	//   28   57:checkcast       #72  <Class HttpsURLConnection>
	//   29   60:aload_0         
	//   30   61:getfield        #28  <Field SSLSocketFactory zzaF>
	//   31   64:invokevirtual   #76  <Method void HttpsURLConnection.setSSLSocketFactory(SSLSocketFactory)>
		return httpurlconnection;
	//   32   67:aload           4
	//   33   69:areturn         
	}

	private static HttpEntity zza(HttpURLConnection httpurlconnection)
	{
		IOException ioexception;
		BasicHttpEntity basichttpentity = new BasicHttpEntity();
	//    0    0:new             #82  <Class BasicHttpEntity>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void BasicHttpEntity()>
	//    3    7:astore_2        
		java.io.InputStream inputstream;
		try
		{
			inputstream = httpurlconnection.getInputStream();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #87  <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//    6   12:astore_1        
		}
	//*   7   13:goto            21
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #90  <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//*  10   20:astore_1        
	//*  11   21:aload_2         
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #94  <Method void BasicHttpEntity.setContent(java.io.InputStream)>
	//*  14   26:aload_2         
	//*  15   27:aload_0         
	//*  16   28:invokevirtual   #97  <Method int HttpURLConnection.getContentLength()>
	//*  17   31:i2l             
	//*  18   32:invokevirtual   #101 <Method void BasicHttpEntity.setContentLength(long)>
	//*  19   35:aload_2         
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #104 <Method String HttpURLConnection.getContentEncoding()>
	//*  22   40:invokevirtual   #108 <Method void BasicHttpEntity.setContentEncoding(String)>
	//*  23   43:aload_2         
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #111 <Method String HttpURLConnection.getContentType()>
	//*  26   48:invokevirtual   #114 <Method void BasicHttpEntity.setContentType(String)>
	//*  27   51:aload_2         
	//*  28   52:areturn         
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			inputstream = httpurlconnection.getErrorStream();
		}
		basichttpentity.setContent(inputstream);
		basichttpentity.setContentLength(httpurlconnection.getContentLength());
		basichttpentity.setContentEncoding(httpurlconnection.getContentEncoding());
		basichttpentity.setContentType(httpurlconnection.getContentType());
		return ((HttpEntity) (basichttpentity));
	//*  29   53:astore_1        
	//*  30   54:goto            16
	}

	static void zza(HttpURLConnection httpurlconnection, zzl zzl1)
		throws IOException, com.google.android.gms.internal.zza
	{
		switch(zzl1.getMethod())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #120 <Method int zzl.getMethod()>
		{
	//*   2    4:tableswitch     -1 7: default 56
	//	               -1 59
	//	               0 111
	//	               1 125
	//	               2 137
	//	               3 118
	//	               4 149
	//	               5 156
	//	               6 163
	//	               7 170
	//*   3   56:goto            182
		case -1: 
			byte abyte0[] = zzl1.zzj();
	//    4   59:aload_1         
	//    5   60:invokevirtual   #124 <Method byte[] zzl.zzj()>
	//    6   63:astore_2        
			if(abyte0 != null)
	//*   7   64:aload_2         
	//*   8   65:ifnull          192
			{
				httpurlconnection.setDoOutput(true);
	//    9   68:aload_0         
	//   10   69:iconst_1        
	//   11   70:invokevirtual   #127 <Method void HttpURLConnection.setDoOutput(boolean)>
				httpurlconnection.setRequestMethod("POST");
	//   12   73:aload_0         
	//   13   74:ldc1            #129 <String "POST">
	//   14   76:invokevirtual   #132 <Method void HttpURLConnection.setRequestMethod(String)>
				httpurlconnection.addRequestProperty("Content-Type", zzl1.zzi());
	//   15   79:aload_0         
	//   16   80:ldc1            #134 <String "Content-Type">
	//   17   82:aload_1         
	//   18   83:invokevirtual   #137 <Method String zzl.zzi()>
	//   19   86:invokevirtual   #141 <Method void HttpURLConnection.addRequestProperty(String, String)>
				httpurlconnection = ((HttpURLConnection) (new DataOutputStream(httpurlconnection.getOutputStream())));
	//   20   89:new             #143 <Class DataOutputStream>
	//   21   92:dup             
	//   22   93:aload_0         
	//   23   94:invokevirtual   #147 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   24   97:invokespecial   #150 <Method void DataOutputStream(java.io.OutputStream)>
	//   25  100:astore_0        
				((DataOutputStream) (httpurlconnection)).write(abyte0);
	//   26  101:aload_0         
	//   27  102:aload_2         
	//   28  103:invokevirtual   #154 <Method void DataOutputStream.write(byte[])>
				((DataOutputStream) (httpurlconnection)).close();
	//   29  106:aload_0         
	//   30  107:invokevirtual   #157 <Method void DataOutputStream.close()>
				return;
	//   31  110:return          
			} else
	//*  32  111:aload_0         
	//*  33  112:ldc1            #159 <String "GET">
	//*  34  114:invokevirtual   #132 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  35  117:return          
	//*  36  118:aload_0         
	//*  37  119:ldc1            #161 <String "DELETE">
	//*  38  121:invokevirtual   #132 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  39  124:return          
	//*  40  125:aload_0         
	//*  41  126:ldc1            #129 <String "POST">
	//*  42  128:invokevirtual   #132 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  43  131:aload_0         
	//*  44  132:aload_1         
	//*  45  133:invokestatic    #164 <Method void zzb(HttpURLConnection, zzl)>
	//*  46  136:return          
	//*  47  137:aload_0         
	//*  48  138:ldc1            #166 <String "PUT">
	//*  49  140:invokevirtual   #132 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  50  143:aload_0         
	//*  51  144:aload_1         
	//*  52  145:invokestatic    #164 <Method void zzb(HttpURLConnection, zzl)>
	//*  53  148:return          
	//*  54  149:aload_0         
	//*  55  150:ldc1            #168 <String "HEAD">
	//*  56  152:invokevirtual   #132 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  57  155:return          
	//*  58  156:aload_0         
	//*  59  157:ldc1            #170 <String "OPTIONS">
	//*  60  159:invokevirtual   #132 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  61  162:return          
	//*  62  163:aload_0         
	//*  63  164:ldc1            #172 <String "TRACE">
	//*  64  166:invokevirtual   #132 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  65  169:return          
	//*  66  170:aload_0         
	//*  67  171:ldc1            #174 <String "PATCH">
	//*  68  173:invokevirtual   #132 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  69  176:aload_0         
	//*  70  177:aload_1         
	//*  71  178:invokestatic    #164 <Method void zzb(HttpURLConnection, zzl)>
	//*  72  181:return          
	//*  73  182:new             #176 <Class IllegalStateException>
	//*  74  185:dup             
	//*  75  186:ldc1            #178 <String "Unknown method type.">
	//*  76  188:invokespecial   #180 <Method void IllegalStateException(String)>
	//*  77  191:athrow          
			{
				return;
	//   78  192:return          
			}

		case 0: // '\0'
			httpurlconnection.setRequestMethod("GET");
			return;

		case 3: // '\003'
			httpurlconnection.setRequestMethod("DELETE");
			return;

		case 1: // '\001'
			httpurlconnection.setRequestMethod("POST");
			zzb(httpurlconnection, zzl1);
			return;

		case 2: // '\002'
			httpurlconnection.setRequestMethod("PUT");
			zzb(httpurlconnection, zzl1);
			return;

		case 4: // '\004'
			httpurlconnection.setRequestMethod("HEAD");
			return;

		case 5: // '\005'
			httpurlconnection.setRequestMethod("OPTIONS");
			return;

		case 6: // '\006'
			httpurlconnection.setRequestMethod("TRACE");
			return;

		case 7: // '\007'
			httpurlconnection.setRequestMethod("PATCH");
			zzb(httpurlconnection, zzl1);
			return;
		}
		throw new IllegalStateException("Unknown method type.");
	}

	private static boolean zza(int i, int j)
	{
		return i != 4 && (100 > j || j >= 200) && j != 204 && j != 304;
	//    0    0:iload_0         
	//    1    1:iconst_4        
	//    2    2:icmpeq          34
	//    3    5:bipush          100
	//    4    7:iload_1         
	//    5    8:icmpgt          18
	//    6   11:iload_1         
	//    7   12:sipush          200
	//    8   15:icmplt          34
	//    9   18:iload_1         
	//   10   19:sipush          204
	//   11   22:icmpeq          34
	//   12   25:iload_1         
	//   13   26:sipush          304
	//   14   29:icmpeq          34
	//   15   32:iconst_1        
	//   16   33:ireturn         
	//   17   34:iconst_0        
	//   18   35:ireturn         
	}

	private static void zzb(HttpURLConnection httpurlconnection, zzl zzl1)
		throws IOException, com.google.android.gms.internal.zza
	{
		byte abyte0[] = zzl1.zzm();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #185 <Method byte[] zzl.zzm()>
	//    2    4:astore_2        
		if(abyte0 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          45
		{
			httpurlconnection.setDoOutput(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #127 <Method void HttpURLConnection.setDoOutput(boolean)>
			httpurlconnection.addRequestProperty("Content-Type", zzl1.zzl());
	//    8   14:aload_0         
	//    9   15:ldc1            #134 <String "Content-Type">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #188 <Method String zzl.zzl()>
	//   12   21:invokevirtual   #141 <Method void HttpURLConnection.addRequestProperty(String, String)>
			httpurlconnection = ((HttpURLConnection) (new DataOutputStream(httpurlconnection.getOutputStream())));
	//   13   24:new             #143 <Class DataOutputStream>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:invokevirtual   #147 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   17   32:invokespecial   #150 <Method void DataOutputStream(java.io.OutputStream)>
	//   18   35:astore_0        
			((DataOutputStream) (httpurlconnection)).write(abyte0);
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:invokevirtual   #154 <Method void DataOutputStream.write(byte[])>
			((DataOutputStream) (httpurlconnection)).close();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #157 <Method void DataOutputStream.close()>
		}
	//   24   45:return          
	}

	protected HttpURLConnection zza(URL url)
		throws IOException
	{
		url = ((URL) ((HttpURLConnection)url.openConnection()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #192 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #42  <Class HttpURLConnection>
	//    3    7:astore_1        
		((HttpURLConnection) (url)).setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
	//    4    8:aload_1         
	//    5    9:invokestatic    #196 <Method boolean HttpURLConnection.getFollowRedirects()>
	//    6   12:invokevirtual   #199 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		return ((HttpURLConnection) (url));
	//    7   15:aload_1         
	//    8   16:areturn         
	}

	public HttpResponse zza(zzl zzl1, Map map)
		throws IOException, com.google.android.gms.internal.zza
	{
		Object obj = ((Object) (zzl1.getUrl()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #203 <Method String zzl.getUrl()>
	//    2    4:astore_3        
		Object obj1 = ((Object) (new HashMap()));
	//    3    5:new             #205 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #206 <Method void HashMap()>
	//    6   12:astore          4
		((HashMap) (obj1)).putAll(zzl1.getHeaders());
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #210 <Method Map zzl.getHeaders()>
	//   10   20:invokevirtual   #214 <Method void HashMap.putAll(Map)>
		((HashMap) (obj1)).putAll(map);
	//   11   23:aload           4
	//   12   25:aload_2         
	//   13   26:invokevirtual   #214 <Method void HashMap.putAll(Map)>
		map = ((Map) (obj));
	//   14   29:aload_3         
	//   15   30:astore_2        
		if(zzaE != null)
	//*  16   31:aload_0         
	//*  17   32:getfield        #26  <Field zzaa$zza zzaE>
	//*  18   35:ifnull          80
		{
			map = ((Map) (zzaE.zzh(((String) (obj)))));
	//   19   38:aload_0         
	//   20   39:getfield        #26  <Field zzaa$zza zzaE>
	//   21   42:aload_3         
	//   22   43:invokeinterface #218 <Method String zzaa$zza.zzh(String)>
	//   23   48:astore_2        
			if(map == null)
	//*  24   49:aload_2         
	//*  25   50:ifnonnull       80
				throw new IOException((new StringBuilder()).append("URL blocked by rewriter: ").append(((String) (obj))).toString());
	//   26   53:new             #31  <Class IOException>
	//   27   56:dup             
	//   28   57:new             #220 <Class StringBuilder>
	//   29   60:dup             
	//   30   61:invokespecial   #221 <Method void StringBuilder()>
	//   31   64:ldc1            #223 <String "URL blocked by rewriter: ">
	//   32   66:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:aload_3         
	//   34   70:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   36   76:invokespecial   #231 <Method void IOException(String)>
	//   37   79:athrow          
		}
		map = ((Map) (zza(new URL(((String) (map))), zzl1)));
	//   38   80:aload_0         
	//   39   81:new             #60  <Class URL>
	//   40   84:dup             
	//   41   85:aload_2         
	//   42   86:invokespecial   #232 <Method void URL(String)>
	//   43   89:aload_1         
	//   44   90:invokespecial   #234 <Method HttpURLConnection zza(URL, zzl)>
	//   45   93:astore_2        
		String s;
		for(obj = ((Object) (((HashMap) (obj1)).keySet().iterator())); ((Iterator) (obj)).hasNext(); ((HttpURLConnection) (map)).addRequestProperty(s, (String)((HashMap) (obj1)).get(((Object) (s)))))
	//*  46   94:aload           4
	//*  47   96:invokevirtual   #238 <Method Set HashMap.keySet()>
	//*  48   99:invokeinterface #244 <Method Iterator Set.iterator()>
	//*  49  104:astore_3        
	//*  50  105:aload_3         
	//*  51  106:invokeinterface #249 <Method boolean Iterator.hasNext()>
	//*  52  111:ifeq            144
			s = (String)((Iterator) (obj)).next();
	//   53  114:aload_3         
	//   54  115:invokeinterface #253 <Method Object Iterator.next()>
	//   55  120:checkcast       #66  <Class String>
	//   56  123:astore          5

	//   57  125:aload_2         
	//   58  126:aload           5
	//   59  128:aload           4
	//   60  130:aload           5
	//   61  132:invokevirtual   #257 <Method Object HashMap.get(Object)>
	//   62  135:checkcast       #66  <Class String>
	//   63  138:invokevirtual   #141 <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  64  141:goto            105
		zza(((HttpURLConnection) (map)), zzl1);
	//   65  144:aload_2         
	//   66  145:aload_1         
	//   67  146:invokestatic    #259 <Method void zza(HttpURLConnection, zzl)>
		obj = ((Object) (new ProtocolVersion("HTTP", 1, 1)));
	//   68  149:new             #261 <Class ProtocolVersion>
	//   69  152:dup             
	//   70  153:ldc2            #263 <String "HTTP">
	//   71  156:iconst_1        
	//   72  157:iconst_1        
	//   73  158:invokespecial   #266 <Method void ProtocolVersion(String, int, int)>
	//   74  161:astore_3        
		if(((HttpURLConnection) (map)).getResponseCode() == -1)
	//*  75  162:aload_2         
	//*  76  163:invokevirtual   #269 <Method int HttpURLConnection.getResponseCode()>
	//*  77  166:iconst_m1       
	//*  78  167:icmpne          181
			throw new IOException("Could not retrieve response code from HttpUrlConnection.");
	//   79  170:new             #31  <Class IOException>
	//   80  173:dup             
	//   81  174:ldc2            #271 <String "Could not retrieve response code from HttpUrlConnection.">
	//   82  177:invokespecial   #231 <Method void IOException(String)>
	//   83  180:athrow          
		obj1 = ((Object) (new BasicStatusLine(((ProtocolVersion) (obj)), ((HttpURLConnection) (map)).getResponseCode(), ((HttpURLConnection) (map)).getResponseMessage())));
	//   84  181:new             #273 <Class BasicStatusLine>
	//   85  184:dup             
	//   86  185:aload_3         
	//   87  186:aload_2         
	//   88  187:invokevirtual   #269 <Method int HttpURLConnection.getResponseCode()>
	//   89  190:aload_2         
	//   90  191:invokevirtual   #276 <Method String HttpURLConnection.getResponseMessage()>
	//   91  194:invokespecial   #279 <Method void BasicStatusLine(ProtocolVersion, int, String)>
	//   92  197:astore          4
		obj = ((Object) (new BasicHttpResponse(((StatusLine) (obj1)))));
	//   93  199:new             #281 <Class BasicHttpResponse>
	//   94  202:dup             
	//   95  203:aload           4
	//   96  205:invokespecial   #284 <Method void BasicHttpResponse(StatusLine)>
	//   97  208:astore_3        
		if(zza(zzl1.getMethod(), ((StatusLine) (obj1)).getStatusCode()))
	//*  98  209:aload_1         
	//*  99  210:invokevirtual   #120 <Method int zzl.getMethod()>
	//* 100  213:aload           4
	//* 101  215:invokeinterface #289 <Method int StatusLine.getStatusCode()>
	//* 102  220:invokestatic    #291 <Method boolean zza(int, int)>
	//* 103  223:ifeq            234
			((BasicHttpResponse) (obj)).setEntity(zza(((HttpURLConnection) (map))));
	//  104  226:aload_3         
	//  105  227:aload_2         
	//  106  228:invokestatic    #293 <Method HttpEntity zza(HttpURLConnection)>
	//  107  231:invokevirtual   #297 <Method void BasicHttpResponse.setEntity(HttpEntity)>
		zzl1 = ((zzl) (((HttpURLConnection) (map)).getHeaderFields().entrySet().iterator()));
	//  108  234:aload_2         
	//  109  235:invokevirtual   #300 <Method Map HttpURLConnection.getHeaderFields()>
	//  110  238:invokeinterface #305 <Method Set Map.entrySet()>
	//  111  243:invokeinterface #244 <Method Iterator Set.iterator()>
	//  112  248:astore_1        
		do
		{
			if(!((Iterator) (zzl1)).hasNext())
				break;
	//  113  249:aload_1         
	//  114  250:invokeinterface #249 <Method boolean Iterator.hasNext()>
	//  115  255:ifeq            318
			map = ((Map) ((java.util.Map.Entry)((Iterator) (zzl1)).next()));
	//  116  258:aload_1         
	//  117  259:invokeinterface #253 <Method Object Iterator.next()>
	//  118  264:checkcast       #307 <Class java.util.Map$Entry>
	//  119  267:astore_2        
			if(((java.util.Map.Entry) (map)).getKey() != null)
	//* 120  268:aload_2         
	//* 121  269:invokeinterface #310 <Method Object java.util.Map$Entry.getKey()>
	//* 122  274:ifnull          315
				((BasicHttpResponse) (obj)).addHeader(((org.apache.http.Header) (new BasicHeader((String)((java.util.Map.Entry) (map)).getKey(), (String)((List)((java.util.Map.Entry) (map)).getValue()).get(0)))));
	//  123  277:aload_3         
	//  124  278:new             #312 <Class BasicHeader>
	//  125  281:dup             
	//  126  282:aload_2         
	//  127  283:invokeinterface #310 <Method Object java.util.Map$Entry.getKey()>
	//  128  288:checkcast       #66  <Class String>
	//  129  291:aload_2         
	//  130  292:invokeinterface #315 <Method Object java.util.Map$Entry.getValue()>
	//  131  297:checkcast       #317 <Class List>
	//  132  300:iconst_0        
	//  133  301:invokeinterface #320 <Method Object List.get(int)>
	//  134  306:checkcast       #66  <Class String>
	//  135  309:invokespecial   #322 <Method void BasicHeader(String, String)>
	//  136  312:invokevirtual   #326 <Method void BasicHttpResponse.addHeader(org.apache.http.Header)>
		} while(true);
	//  137  315:goto            249
		return ((HttpResponse) (obj));
	//  138  318:aload_3         
	//  139  319:areturn         
	}

	private final zza zzaE;
	private final SSLSocketFactory zzaF;
}
