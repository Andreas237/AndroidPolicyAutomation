// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.database.*;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

// Referenced classes of package android.support.v4.widget:
//			CursorFilter

public abstract class CursorAdapter extends BaseAdapter
	implements Filterable, CursorFilter.CursorFilterClient
{
	private class ChangeObserver extends ContentObserver
	{

		public boolean deliverSelfNotifications()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void onChange(boolean flag)
		{
			onContentChanged();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CursorAdapter this$0>
		//    2    4:invokevirtual   #29  <Method void CursorAdapter.onContentChanged()>
		//    3    7:return          
		}

		final CursorAdapter this$0;

		ChangeObserver()
		{
			this$0 = CursorAdapter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field CursorAdapter this$0>
			super(new Handler());
		//    3    5:aload_0         
		//    4    6:new             #15  <Class Handler>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void Handler()>
		//    7   13:invokespecial   #21  <Method void ContentObserver(Handler)>
		//    8   16:return          
		}
	}

	private class MyDataSetObserver extends DataSetObserver
	{

		public void onChanged()
		{
			mDataValid = true;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CursorAdapter this$0>
		//    2    4:iconst_1        
		//    3    5:putfield        #22  <Field boolean CursorAdapter.mDataValid>
			notifyDataSetChanged();
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field CursorAdapter this$0>
		//    6   12:invokevirtual   #25  <Method void CursorAdapter.notifyDataSetChanged()>
		//    7   15:return          
		}

		public void onInvalidated()
		{
			mDataValid = false;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CursorAdapter this$0>
		//    2    4:iconst_0        
		//    3    5:putfield        #22  <Field boolean CursorAdapter.mDataValid>
			notifyDataSetInvalidated();
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field CursorAdapter this$0>
		//    6   12:invokevirtual   #29  <Method void CursorAdapter.notifyDataSetInvalidated()>
		//    7   15:return          
		}

		final CursorAdapter this$0;

		MyDataSetObserver()
		{
			this$0 = CursorAdapter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field CursorAdapter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}


	public CursorAdapter(Context context, Cursor cursor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void BaseAdapter()>
		init(context, cursor, 1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//    7   11:return          
	}

	public CursorAdapter(Context context, Cursor cursor, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void BaseAdapter()>
		init(context, cursor, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//    7   11:return          
	}

	public CursorAdapter(Context context, Cursor cursor, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void BaseAdapter()>
		int i;
		if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            20
			i = 1;
	//    4    8:iconst_1        
	//    5    9:istore          4
		else
	//*   6   11:aload_0         
	//*   7   12:aload_1         
	//*   8   13:aload_2         
	//*   9   14:iload           4
	//*  10   16:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//*  11   19:return          
			i = 2;
	//   12   20:iconst_2        
	//   13   21:istore          4
		init(context, cursor, i);
	//*  14   23:goto            11
	}

	public abstract void bindView(View view, Context context, Cursor cursor);

	public void changeCursor(Cursor cursor)
	{
		cursor = swapCursor(cursor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method Cursor swapCursor(Cursor)>
	//    3    5:astore_1        
		if(cursor != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          16
			cursor.close();
	//    6   10:aload_1         
	//    7   11:invokeinterface #65  <Method void Cursor.close()>
	//    8   16:return          
	}

	public CharSequence convertToString(Cursor cursor)
	{
		if(cursor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #69  <String "">
	//    3    6:areturn         
		else
			return ((CharSequence) (((Object) (cursor)).toString()));
	//    4    7:aload_1         
	//    5    8:invokevirtual   #75  <Method String Object.toString()>
	//    6   11:areturn         
	}

	public int getCount()
	{
		if(mDataValid && mCursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            24
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field Cursor mCursor>
	//*   5   11:ifnull          24
			return mCursor.getCount();
	//    6   14:aload_0         
	//    7   15:getfield        #81  <Field Cursor mCursor>
	//    8   18:invokeinterface #83  <Method int Cursor.getCount()>
	//    9   23:ireturn         
		else
			return 0;
	//   10   24:iconst_0        
	//   11   25:ireturn         
	}

	public Cursor getCursor()
	{
		return mCursor;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Cursor mCursor>
	//    2    4:areturn         
	}

	public View getDropDownView(int i, View view, ViewGroup viewgroup)
	{
		if(mDataValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            54
		{
			mCursor.moveToPosition(i);
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field Cursor mCursor>
	//    5   11:iload_1         
	//    6   12:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//    7   17:pop             
			if(view == null)
	//*   8   18:aload_2         
	//*   9   19:ifnonnull       51
				view = newDropDownView(mContext, mCursor, viewgroup);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #93  <Field Context mContext>
	//   13   27:aload_0         
	//   14   28:getfield        #81  <Field Cursor mCursor>
	//   15   31:aload_3         
	//   16   32:invokevirtual   #97  <Method View newDropDownView(Context, Cursor, ViewGroup)>
	//   17   35:astore_2        
			bindView(view, mContext, mCursor);
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:getfield        #93  <Field Context mContext>
	//   22   42:aload_0         
	//   23   43:getfield        #81  <Field Cursor mCursor>
	//   24   46:invokevirtual   #99  <Method void bindView(View, Context, Cursor)>
			return view;
	//   25   49:aload_2         
	//   26   50:areturn         
		} else
	//*  27   51:goto            36
		{
			return null;
	//   28   54:aconst_null     
	//   29   55:areturn         
		}
	}

	public Filter getFilter()
	{
		if(mCursorFilter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field CursorFilter mCursorFilter>
	//*   2    4:ifnonnull       19
			mCursorFilter = new CursorFilter(((CursorFilter.CursorFilterClient) (this)));
	//    3    7:aload_0         
	//    4    8:new             #105 <Class CursorFilter>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #108 <Method void CursorFilter(CursorFilter$CursorFilterClient)>
	//    8   16:putfield        #103 <Field CursorFilter mCursorFilter>
		return ((Filter) (mCursorFilter));
	//    9   19:aload_0         
	//   10   20:getfield        #103 <Field CursorFilter mCursorFilter>
	//   11   23:areturn         
	}

	public FilterQueryProvider getFilterQueryProvider()
	{
		return mFilterQueryProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field FilterQueryProvider mFilterQueryProvider>
	//    2    4:areturn         
	}

	public Object getItem(int i)
	{
		if(mDataValid && mCursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            30
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field Cursor mCursor>
	//*   5   11:ifnull          30
		{
			mCursor.moveToPosition(i);
	//    6   14:aload_0         
	//    7   15:getfield        #81  <Field Cursor mCursor>
	//    8   18:iload_1         
	//    9   19:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//   10   24:pop             
			return ((Object) (mCursor));
	//   11   25:aload_0         
	//   12   26:getfield        #81  <Field Cursor mCursor>
	//   13   29:areturn         
		} else
		{
			return ((Object) (null));
	//   14   30:aconst_null     
	//   15   31:areturn         
		}
	}

	public long getItemId(int i)
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore          4
		long l = l1;
	//    2    3:lload           4
	//    3    5:lstore_2        
		if(mDataValid)
	//*   4    6:aload_0         
	//*   5    7:getfield        #79  <Field boolean mDataValid>
	//*   6   10:ifeq            53
		{
			l = l1;
	//    7   13:lload           4
	//    8   15:lstore_2        
			if(mCursor != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #81  <Field Cursor mCursor>
	//*  11   20:ifnull          53
			{
				l = l1;
	//   12   23:lload           4
	//   13   25:lstore_2        
				if(mCursor.moveToPosition(i))
	//*  14   26:aload_0         
	//*  15   27:getfield        #81  <Field Cursor mCursor>
	//*  16   30:iload_1         
	//*  17   31:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//*  18   36:ifeq            53
					l = mCursor.getLong(mRowIDColumn);
	//   19   39:aload_0         
	//   20   40:getfield        #81  <Field Cursor mCursor>
	//   21   43:aload_0         
	//   22   44:getfield        #118 <Field int mRowIDColumn>
	//   23   47:invokeinterface #121 <Method long Cursor.getLong(int)>
	//   24   52:lstore_2        
			}
		}
		return l;
	//   25   53:lload_2         
	//   26   54:lreturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		if(!mDataValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifne            17
			throw new IllegalStateException("this should only be called when the cursor is valid");
	//    3    7:new             #124 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #126 <String "this should only be called when the cursor is valid">
	//    6   13:invokespecial   #129 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(!mCursor.moveToPosition(i))
	//*   8   17:aload_0         
	//*   9   18:getfield        #81  <Field Cursor mCursor>
	//*  10   21:iload_1         
	//*  11   22:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//*  12   27:ifne            57
			throw new IllegalStateException((new StringBuilder()).append("couldn't move cursor to position ").append(i).toString());
	//   13   30:new             #124 <Class IllegalStateException>
	//   14   33:dup             
	//   15   34:new             #131 <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #132 <Method void StringBuilder()>
	//   18   41:ldc1            #134 <String "couldn't move cursor to position ">
	//   19   43:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:iload_1         
	//   21   47:invokevirtual   #141 <Method StringBuilder StringBuilder.append(int)>
	//   22   50:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #129 <Method void IllegalStateException(String)>
	//   24   56:athrow          
		if(view == null)
	//*  25   57:aload_2         
	//*  26   58:ifnonnull       90
			view = newView(mContext, mCursor, viewgroup);
	//   27   61:aload_0         
	//   28   62:aload_0         
	//   29   63:getfield        #93  <Field Context mContext>
	//   30   66:aload_0         
	//   31   67:getfield        #81  <Field Cursor mCursor>
	//   32   70:aload_3         
	//   33   71:invokevirtual   #145 <Method View newView(Context, Cursor, ViewGroup)>
	//   34   74:astore_2        
		bindView(view, mContext, mCursor);
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:aload_0         
	//   38   78:getfield        #93  <Field Context mContext>
	//   39   81:aload_0         
	//   40   82:getfield        #81  <Field Cursor mCursor>
	//   41   85:invokevirtual   #99  <Method void bindView(View, Context, Cursor)>
		return view;
	//   42   88:aload_2         
	//   43   89:areturn         
	//*  44   90:goto            75
	}

	public boolean hasStableIds()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void init(Context context, Cursor cursor, int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		int j;
		if((i & 1) == 1)
	//*   2    3:iload_3         
	//*   3    4:iconst_1        
	//*   4    5:iand            
	//*   5    6:iconst_1        
	//*   6    7:icmpne          131
		{
			i |= 2;
	//    7   10:iload_3         
	//    8   11:iconst_2        
	//    9   12:ior             
	//   10   13:istore_3        
			mAutoRequery = true;
	//   11   14:aload_0         
	//   12   15:iconst_1        
	//   13   16:putfield        #149 <Field boolean mAutoRequery>
		} else
	//*  14   19:aload_2         
	//*  15   20:ifnull          139
	//*  16   23:aload_0         
	//*  17   24:aload_2         
	//*  18   25:putfield        #81  <Field Cursor mCursor>
	//*  19   28:aload_0         
	//*  20   29:iload           5
	//*  21   31:putfield        #79  <Field boolean mDataValid>
	//*  22   34:aload_0         
	//*  23   35:aload_1         
	//*  24   36:putfield        #93  <Field Context mContext>
	//*  25   39:iload           5
	//*  26   41:ifeq            145
	//*  27   44:aload_2         
	//*  28   45:ldc1            #151 <String "_id">
	//*  29   47:invokeinterface #155 <Method int Cursor.getColumnIndexOrThrow(String)>
	//*  30   52:istore          4
	//*  31   54:aload_0         
	//*  32   55:iload           4
	//*  33   57:putfield        #118 <Field int mRowIDColumn>
	//*  34   60:iload_3         
	//*  35   61:iconst_2        
	//*  36   62:iand            
	//*  37   63:iconst_2        
	//*  38   64:icmpne          151
	//*  39   67:aload_0         
	//*  40   68:new             #10  <Class CursorAdapter$ChangeObserver>
	//*  41   71:dup             
	//*  42   72:aload_0         
	//*  43   73:invokespecial   #158 <Method void CursorAdapter$ChangeObserver(CursorAdapter)>
	//*  44   76:putfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//*  45   79:aload_0         
	//*  46   80:new             #13  <Class CursorAdapter$MyDataSetObserver>
	//*  47   83:dup             
	//*  48   84:aload_0         
	//*  49   85:invokespecial   #161 <Method void CursorAdapter$MyDataSetObserver(CursorAdapter)>
	//*  50   88:putfield        #163 <Field DataSetObserver mDataSetObserver>
	//*  51   91:iload           5
	//*  52   93:ifeq            130
	//*  53   96:aload_0         
	//*  54   97:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//*  55  100:ifnull          113
	//*  56  103:aload_2         
	//*  57  104:aload_0         
	//*  58  105:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//*  59  108:invokeinterface #167 <Method void Cursor.registerContentObserver(ContentObserver)>
	//*  60  113:aload_0         
	//*  61  114:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//*  62  117:ifnull          130
	//*  63  120:aload_2         
	//*  64  121:aload_0         
	//*  65  122:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//*  66  125:invokeinterface #171 <Method void Cursor.registerDataSetObserver(DataSetObserver)>
	//*  67  130:return          
		{
			mAutoRequery = false;
	//   68  131:aload_0         
	//   69  132:iconst_0        
	//   70  133:putfield        #149 <Field boolean mAutoRequery>
		}
		if(cursor == null)
	//*  71  136:goto            19
			flag = false;
	//   72  139:iconst_0        
	//   73  140:istore          5
		mCursor = cursor;
		mDataValid = flag;
		mContext = context;
		if(flag)
			j = cursor.getColumnIndexOrThrow("_id");
		else
	//*  74  142:goto            23
			j = -1;
	//   75  145:iconst_m1       
	//   76  146:istore          4
		mRowIDColumn = j;
		if((i & 2) == 2)
		{
			mChangeObserver = new ChangeObserver();
			mDataSetObserver = ((DataSetObserver) (new MyDataSetObserver()));
		} else
	//*  77  148:goto            54
		{
			mChangeObserver = null;
	//   78  151:aload_0         
	//   79  152:aconst_null     
	//   80  153:putfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
			mDataSetObserver = null;
	//   81  156:aload_0         
	//   82  157:aconst_null     
	//   83  158:putfield        #163 <Field DataSetObserver mDataSetObserver>
		}
		if(flag)
		{
			if(mChangeObserver != null)
				cursor.registerContentObserver(((ContentObserver) (mChangeObserver)));
			if(mDataSetObserver != null)
				cursor.registerDataSetObserver(mDataSetObserver);
		}
	//*  84  161:goto            91
	}

	protected void init(Context context, Cursor cursor, boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            16
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:aload_0         
	//*   5    8:aload_1         
	//*   6    9:aload_2         
	//*   7   10:iload           4
	//*   8   12:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//*   9   15:return          
			i = 2;
	//   10   16:iconst_2        
	//   11   17:istore          4
		init(context, cursor, i);
	//*  12   19:goto            7
	}

	public View newDropDownView(Context context, Cursor cursor, ViewGroup viewgroup)
	{
		return newView(context, cursor, viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #145 <Method View newView(Context, Cursor, ViewGroup)>
	//    5    7:areturn         
	}

	public abstract View newView(Context context, Cursor cursor, ViewGroup viewgroup);

	protected void onContentChanged()
	{
		if(mAutoRequery && mCursor != null && !mCursor.isClosed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field boolean mAutoRequery>
	//*   2    4:ifeq            39
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field Cursor mCursor>
	//*   5   11:ifnull          39
	//*   6   14:aload_0         
	//*   7   15:getfield        #81  <Field Cursor mCursor>
	//*   8   18:invokeinterface #175 <Method boolean Cursor.isClosed()>
	//*   9   23:ifne            39
			mDataValid = mCursor.requery();
	//   10   26:aload_0         
	//   11   27:aload_0         
	//   12   28:getfield        #81  <Field Cursor mCursor>
	//   13   31:invokeinterface #178 <Method boolean Cursor.requery()>
	//   14   36:putfield        #79  <Field boolean mDataValid>
	//   15   39:return          
	}

	public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
	{
		if(mFilterQueryProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field FilterQueryProvider mFilterQueryProvider>
	//*   2    4:ifnull          18
			return mFilterQueryProvider.runQuery(charsequence);
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field FilterQueryProvider mFilterQueryProvider>
	//    5   11:aload_1         
	//    6   12:invokeinterface #185 <Method Cursor FilterQueryProvider.runQuery(CharSequence)>
	//    7   17:areturn         
		else
			return mCursor;
	//    8   18:aload_0         
	//    9   19:getfield        #81  <Field Cursor mCursor>
	//   10   22:areturn         
	}

	public void setFilterQueryProvider(FilterQueryProvider filterqueryprovider)
	{
		mFilterQueryProvider = filterqueryprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field FilterQueryProvider mFilterQueryProvider>
	//    3    5:return          
	}

	public Cursor swapCursor(Cursor cursor)
	{
		if(cursor == mCursor)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #81  <Field Cursor mCursor>
	//*   3    5:if_acmpne       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		Cursor cursor1 = mCursor;
	//    6   10:aload_0         
	//    7   11:getfield        #81  <Field Cursor mCursor>
	//    8   14:astore_2        
		if(cursor1 != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          53
		{
			if(mChangeObserver != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//*  13   23:ifnull          36
				cursor1.unregisterContentObserver(((ContentObserver) (mChangeObserver)));
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//   17   31:invokeinterface #190 <Method void Cursor.unregisterContentObserver(ContentObserver)>
			if(mDataSetObserver != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//*  20   40:ifnull          53
				cursor1.unregisterDataSetObserver(mDataSetObserver);
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//   24   48:invokeinterface #193 <Method void Cursor.unregisterDataSetObserver(DataSetObserver)>
		}
		mCursor = cursor;
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:putfield        #81  <Field Cursor mCursor>
		if(cursor != null)
	//*  28   58:aload_1         
	//*  29   59:ifnull          119
		{
			if(mChangeObserver != null)
	//*  30   62:aload_0         
	//*  31   63:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//*  32   66:ifnull          79
				cursor.registerContentObserver(((ContentObserver) (mChangeObserver)));
	//   33   69:aload_1         
	//   34   70:aload_0         
	//   35   71:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//   36   74:invokeinterface #167 <Method void Cursor.registerContentObserver(ContentObserver)>
			if(mDataSetObserver != null)
	//*  37   79:aload_0         
	//*  38   80:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//*  39   83:ifnull          96
				cursor.registerDataSetObserver(mDataSetObserver);
	//   40   86:aload_1         
	//   41   87:aload_0         
	//   42   88:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//   43   91:invokeinterface #171 <Method void Cursor.registerDataSetObserver(DataSetObserver)>
			mRowIDColumn = cursor.getColumnIndexOrThrow("_id");
	//   44   96:aload_0         
	//   45   97:aload_1         
	//   46   98:ldc1            #151 <String "_id">
	//   47  100:invokeinterface #155 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   48  105:putfield        #118 <Field int mRowIDColumn>
			mDataValid = true;
	//   49  108:aload_0         
	//   50  109:iconst_1        
	//   51  110:putfield        #79  <Field boolean mDataValid>
			notifyDataSetChanged();
	//   52  113:aload_0         
	//   53  114:invokevirtual   #196 <Method void notifyDataSetChanged()>
			return cursor1;
	//   54  117:aload_2         
	//   55  118:areturn         
		} else
		{
			mRowIDColumn = -1;
	//   56  119:aload_0         
	//   57  120:iconst_m1       
	//   58  121:putfield        #118 <Field int mRowIDColumn>
			mDataValid = false;
	//   59  124:aload_0         
	//   60  125:iconst_0        
	//   61  126:putfield        #79  <Field boolean mDataValid>
			notifyDataSetInvalidated();
	//   62  129:aload_0         
	//   63  130:invokevirtual   #199 <Method void notifyDataSetInvalidated()>
			return cursor1;
	//   64  133:aload_2         
	//   65  134:areturn         
		}
	}

	public static final int FLAG_AUTO_REQUERY = 1;
	public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
	protected boolean mAutoRequery;
	protected ChangeObserver mChangeObserver;
	protected Context mContext;
	protected Cursor mCursor;
	protected CursorFilter mCursorFilter;
	protected DataSetObserver mDataSetObserver;
	protected boolean mDataValid;
	protected FilterQueryProvider mFilterQueryProvider;
	protected int mRowIDColumn;
}
