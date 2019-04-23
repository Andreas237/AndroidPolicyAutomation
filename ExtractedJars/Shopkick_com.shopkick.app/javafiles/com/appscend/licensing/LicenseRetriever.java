// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.licensing;

import android.os.AsyncTask;
import java.io.*;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.appscend.licensing:
//			LicenseValidator

public class LicenseRetriever extends AsyncTask
{

	public LicenseRetriever()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AsyncTask()>
		licenseRetrieved = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field boolean licenseRetrieved>
		licenseValid = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #16  <Field boolean licenseValid>
	//    8   14:return          
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((String[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class String[]>
	//    3    5:invokevirtual   #24  <Method Void doInBackground(String[])>
	//    4    8:areturn         
	}

	protected transient Void doInBackground(String as[])
	{
		StringBuilder stringbuilder;
		Object obj;
		stringbuilder = new StringBuilder();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void StringBuilder()>
	//    3    7:astore_3        
		obj = ((Object) (new BasicHttpParams()));
	//    4    8:new             #33  <Class BasicHttpParams>
	//    5   11:dup             
	//    6   12:invokespecial   #34  <Method void BasicHttpParams()>
	//    7   15:astore          4
		HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 2000);
	//    8   17:aload           4
	//    9   19:sipush          2000
	//   10   22:invokestatic    #40  <Method void HttpConnectionParams.setConnectionTimeout(org.apache.http.params.HttpParams, int)>
		HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 2000);
	//   11   25:aload           4
	//   12   27:sipush          2000
	//   13   30:invokestatic    #43  <Method void HttpConnectionParams.setSoTimeout(org.apache.http.params.HttpParams, int)>
		obj = ((Object) (new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj)))));
	//   14   33:new             #45  <Class DefaultHttpClient>
	//   15   36:dup             
	//   16   37:aload           4
	//   17   39:invokespecial   #48  <Method void DefaultHttpClient(org.apache.http.params.HttpParams)>
	//   18   42:astore          4
		as = ((String []) (new HttpGet(as[0])));
	//   19   44:new             #50  <Class HttpGet>
	//   20   47:dup             
	//   21   48:aload_1         
	//   22   49:iconst_0        
	//   23   50:aaload          
	//   24   51:invokespecial   #53  <Method void HttpGet(String)>
	//   25   54:astore_1        
		int i;
		as = ((String []) (((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (as)))));
	//   26   55:aload           4
	//   27   57:aload_1         
	//   28   58:invokeinterface #59  <Method HttpResponse HttpClient.execute(org.apache.http.client.methods.HttpUriRequest)>
	//   29   63:astore_1        
		i = ((HttpResponse) (as)).getStatusLine().getStatusCode();
	//   30   64:aload_1         
	//   31   65:invokeinterface #65  <Method StatusLine HttpResponse.getStatusLine()>
	//   32   70:invokeinterface #71  <Method int StatusLine.getStatusCode()>
	//   33   75:istore_2        
		if(i != 200)
			break MISSING_BLOCK_LABEL_155;
	//   34   76:iload_2         
	//   35   77:sipush          200
	//   36   80:icmpne          155
		as = ((String []) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((HttpResponse) (as)).getEntity().getContent()))))));
	//   37   83:new             #73  <Class BufferedReader>
	//   38   86:dup             
	//   39   87:new             #75  <Class InputStreamReader>
	//   40   90:dup             
	//   41   91:aload_1         
	//   42   92:invokeinterface #79  <Method HttpEntity HttpResponse.getEntity()>
	//   43   97:invokeinterface #85  <Method java.io.InputStream HttpEntity.getContent()>
	//   44  102:invokespecial   #88  <Method void InputStreamReader(java.io.InputStream)>
	//   45  105:invokespecial   #91  <Method void BufferedReader(java.io.Reader)>
	//   46  108:astore_1        
_L1:
		obj = ((Object) (((BufferedReader) (as)).readLine()));
	//   47  109:aload_1         
	//   48  110:invokevirtual   #95  <Method String BufferedReader.readLine()>
	//   49  113:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_130;
	//   50  115:aload           4
	//   51  117:ifnull          130
		stringbuilder.append(((String) (obj)));
	//   52  120:aload_3         
	//   53  121:aload           4
	//   54  123:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   55  126:pop             
		  goto _L1
	//*  56  127:goto            109
		try
		{
			if(stringbuilder.toString().equals("OK"))
	//*  57  130:aload_3         
	//*  58  131:invokevirtual   #102 <Method String StringBuilder.toString()>
	//*  59  134:ldc1            #104 <String "OK">
	//*  60  136:invokevirtual   #110 <Method boolean String.equals(Object)>
	//*  61  139:ifeq            180
			{
				licenseRetrieved = true;
	//   62  142:aload_0         
	//   63  143:iconst_1        
	//   64  144:putfield        #14  <Field boolean licenseRetrieved>
				licenseValid = true;
	//   65  147:aload_0         
	//   66  148:iconst_1        
	//   67  149:putfield        #16  <Field boolean licenseValid>
			}
		}
	//*  68  152:goto            180
	//*  69  155:iload_2         
	//*  70  156:sipush          404
	//*  71  159:icmpne          180
	//*  72  162:aload_0         
	//*  73  163:iconst_1        
	//*  74  164:putfield        #14  <Field boolean licenseRetrieved>
	//*  75  167:aload_0         
	//*  76  168:iconst_0        
	//*  77  169:putfield        #16  <Field boolean licenseValid>
	//*  78  172:goto            180
		// Misplaced declaration of an exception variable
		catch(String as[])
	//*  79  175:astore_1        
		{
			((ClientProtocolException) (as)).printStackTrace();
	//   80  176:aload_1         
	//   81  177:invokevirtual   #113 <Method void ClientProtocolException.printStackTrace()>
		}
	//*  82  180:aconst_null     
	//*  83  181:areturn         
		// Misplaced declaration of an exception variable
		catch(String as[]) { }
	//   84  182:astore_1        
		break MISSING_BLOCK_LABEL_180;
	//   85  183:goto            180
		if(i != 404)
			break MISSING_BLOCK_LABEL_180;
		licenseRetrieved = true;
		licenseValid = false;
		return null;
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((Void)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #117 <Class Void>
	//    3    5:invokevirtual   #120 <Method void onPostExecute(Void)>
	//    4    8:return          
	}

	protected void onPostExecute(Void void1)
	{
		super.onPostExecute(((Object) (void1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void AsyncTask.onPostExecute(Object)>
		LicenseValidator.getInstance().updateLicenseValidity(licenseRetrieved, licenseValid);
	//    3    5:invokestatic    #128 <Method LicenseValidator LicenseValidator.getInstance()>
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field boolean licenseRetrieved>
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field boolean licenseValid>
	//    8   16:invokevirtual   #132 <Method void LicenseValidator.updateLicenseValidity(boolean, boolean)>
	//    9   19:return          
	}

	private boolean licenseRetrieved;
	private boolean licenseValid;
}
