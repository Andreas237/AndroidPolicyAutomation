// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

class CursorFilter extends Filter
{
	static interface CursorFilterClient
	{

		public abstract void changeCursor(Cursor cursor);

		public abstract CharSequence convertToString(Cursor cursor);

		public abstract Cursor getCursor();

		public abstract Cursor runQueryOnBackgroundThread(CharSequence charsequence);
	}


	CursorFilter(CursorFilterClient cursorfilterclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Filter()>
		mClient = cursorfilterclient;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field CursorFilter$CursorFilterClient mClient>
	//    5    9:return          
	}

	public CharSequence convertResultToString(Object obj)
	{
		return mClient.convertToString((Cursor)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CursorFilter$CursorFilterClient mClient>
	//    2    4:aload_1         
	//    3    5:checkcast       #21  <Class Cursor>
	//    4    8:invokeinterface #25  <Method CharSequence CursorFilter$CursorFilterClient.convertToString(Cursor)>
	//    5   13:areturn         
	}

	protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
	{
		charsequence = ((CharSequence) (mClient.runQueryOnBackgroundThread(charsequence)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CursorFilter$CursorFilterClient mClient>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method Cursor CursorFilter$CursorFilterClient.runQueryOnBackgroundThread(CharSequence)>
	//    4   10:astore_1        
		android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
	//    5   11:new             #33  <Class android.widget.Filter$FilterResults>
	//    6   14:dup             
	//    7   15:invokespecial   #34  <Method void android.widget.Filter$FilterResults()>
	//    8   18:astore_2        
		if(charsequence != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          40
		{
			filterresults.count = ((Cursor) (charsequence)).getCount();
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokeinterface #38  <Method int Cursor.getCount()>
	//   14   30:putfield        #42  <Field int android.widget.Filter$FilterResults.count>
			filterresults.values = ((Object) (charsequence));
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:putfield        #46  <Field Object android.widget.Filter$FilterResults.values>
			return filterresults;
	//   18   38:aload_2         
	//   19   39:areturn         
		} else
		{
			filterresults.count = 0;
	//   20   40:aload_2         
	//   21   41:iconst_0        
	//   22   42:putfield        #42  <Field int android.widget.Filter$FilterResults.count>
			filterresults.values = null;
	//   23   45:aload_2         
	//   24   46:aconst_null     
	//   25   47:putfield        #46  <Field Object android.widget.Filter$FilterResults.values>
			return filterresults;
	//   26   50:aload_2         
	//   27   51:areturn         
		}
	}

	protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
	{
		charsequence = ((CharSequence) (mClient.getCursor()));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CursorFilter$CursorFilterClient mClient>
	//    2    4:invokeinterface #52  <Method Cursor CursorFilter$CursorFilterClient.getCursor()>
	//    3    9:astore_1        
		if(filterresults.values != null && filterresults.values != charsequence)
	//*   4   10:aload_2         
	//*   5   11:getfield        #46  <Field Object android.widget.Filter$FilterResults.values>
	//*   6   14:ifnull          41
	//*   7   17:aload_2         
	//*   8   18:getfield        #46  <Field Object android.widget.Filter$FilterResults.values>
	//*   9   21:aload_1         
	//*  10   22:if_acmpeq       41
			mClient.changeCursor((Cursor)filterresults.values);
	//   11   25:aload_0         
	//   12   26:getfield        #16  <Field CursorFilter$CursorFilterClient mClient>
	//   13   29:aload_2         
	//   14   30:getfield        #46  <Field Object android.widget.Filter$FilterResults.values>
	//   15   33:checkcast       #21  <Class Cursor>
	//   16   36:invokeinterface #56  <Method void CursorFilter$CursorFilterClient.changeCursor(Cursor)>
	//   17   41:return          
	}

	CursorFilterClient mClient;
}
