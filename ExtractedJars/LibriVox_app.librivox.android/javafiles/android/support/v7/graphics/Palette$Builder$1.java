// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;

// Referenced classes of package android.support.v7.graphics:
//			Palette

class Palette$Builder$1 extends AsyncTask
{

	protected transient Palette doInBackground(Bitmap abitmap[])
	{
		try
		{
			abitmap = ((Bitmap []) (generate()));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Palette$Builder this$0>
	//    2    4:invokevirtual   #28  <Method Palette Palette$Builder.generate()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		// Misplaced declaration of an exception variable
		catch(Bitmap abitmap[])
	//*   6   10:astore_1        
		{
			Log.e("Palette", "Exception thrown during async generate", ((Throwable) (abitmap)));
	//    7   11:ldc1            #30  <String "Palette">
	//    8   13:ldc1            #32  <String "Exception thrown during async generate">
	//    9   15:aload_1         
	//   10   16:invokestatic    #38  <Method int Log.e(String, String, Throwable)>
	//   11   19:pop             
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
		}
		return ((Palette) (abitmap));
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Bitmap[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #41  <Class Bitmap[]>
	//    3    5:invokevirtual   #43  <Method Palette doInBackground(Bitmap[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(Palette palette)
	{
		val$listener.onGenerated(palette);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Palette$PaletteAsyncListener val$listener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #50  <Method void Palette$PaletteAsyncListener.onGenerated(Palette)>
	//    4   10:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((Palette)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #53  <Class Palette>
	//    3    5:invokevirtual   #55  <Method void onPostExecute(Palette)>
	//    4    8:return          
	}

	final Palette.Builder this$0;
	final ncListener val$listener;

	Palette$Builder$1()
	{
		this$0 = final_builder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Palette$Builder this$0>
		val$listener = ncListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field Palette$PaletteAsyncListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #17  <Method void AsyncTask()>
	//    8   14:return          
	}
}
