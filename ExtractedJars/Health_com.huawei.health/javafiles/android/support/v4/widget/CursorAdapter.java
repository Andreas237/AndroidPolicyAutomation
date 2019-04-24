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
	class ChangeObserver extends ContentObserver
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

	class MyDataSetObserver extends DataSetObserver
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
		byte byte0;
		if(flag)
	//*   2    4:iload_3         
	//*   3    5:ifeq            14
			byte0 = 1;
	//    4    8:iconst_1        
	//    5    9:istore          4
		else
	//*   6   11:goto            17
			byte0 = 2;
	//    7   14:iconst_2        
	//    8   15:istore          4
		init(context, cursor, ((int) (byte0)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:iload           4
	//   13   22:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//   14   25:return          
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
	//*   9   19:ifnonnull       39
				view = newDropDownView(mContext, mCursor, viewgroup);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #93  <Field Context mContext>
	//   13   27:aload_0         
	//   14   28:getfield        #81  <Field Cursor mCursor>
	//   15   31:aload_3         
	//   16   32:invokevirtual   #97  <Method View newDropDownView(Context, Cursor, ViewGroup)>
	//   17   35:astore_2        
	//*  18   36:goto            39
			bindView(view, mContext, mCursor);
	//   19   39:aload_0         
	//   20   40:aload_2         
	//   21   41:aload_0         
	//   22   42:getfield        #93  <Field Context mContext>
	//   23   45:aload_0         
	//   24   46:getfield        #81  <Field Cursor mCursor>
	//   25   49:invokevirtual   #99  <Method void bindView(View, Context, Cursor)>
			return view;
	//   26   52:aload_2         
	//   27   53:areturn         
		} else
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
		if(mDataValid && mCursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mDataValid>
	//*   2    4:ifeq            43
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field Cursor mCursor>
	//*   5   11:ifnull          43
		{
			if(mCursor.moveToPosition(i))
	//*   6   14:aload_0         
	//*   7   15:getfield        #81  <Field Cursor mCursor>
	//*   8   18:iload_1         
	//*   9   19:invokeinterface #91  <Method boolean Cursor.moveToPosition(int)>
	//*  10   24:ifeq            41
				return mCursor.getLong(mRowIDColumn);
	//   11   27:aload_0         
	//   12   28:getfield        #81  <Field Cursor mCursor>
	//   13   31:aload_0         
	//   14   32:getfield        #118 <Field int mRowIDColumn>
	//   15   35:invokeinterface #121 <Method long Cursor.getLong(int)>
	//   16   40:lreturn         
			else
				return 0L;
	//   17   41:lconst_0        
	//   18   42:lreturn         
		} else
		{
			return 0L;
	//   19   43:lconst_0        
	//   20   44:lreturn         
		}
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
	//*  26   58:ifnonnull       78
			view = newView(mContext, mCursor, viewgroup);
	//   27   61:aload_0         
	//   28   62:aload_0         
	//   29   63:getfield        #93  <Field Context mContext>
	//   30   66:aload_0         
	//   31   67:getfield        #81  <Field Cursor mCursor>
	//   32   70:aload_3         
	//   33   71:invokevirtual   #145 <Method View newView(Context, Cursor, ViewGroup)>
	//   34   74:astore_2        
	//*  35   75:goto            78
		bindView(view, mContext, mCursor);
	//   36   78:aload_0         
	//   37   79:aload_2         
	//   38   80:aload_0         
	//   39   81:getfield        #93  <Field Context mContext>
	//   40   84:aload_0         
	//   41   85:getfield        #81  <Field Cursor mCursor>
	//   42   88:invokevirtual   #99  <Method void bindView(View, Context, Cursor)>
		return view;
	//   43   91:aload_2         
	//   44   92:areturn         
	}

	public boolean hasStableIds()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void init(Context context, Cursor cursor, int i)
	{
		if((i & 1) == 1)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:iconst_1        
	//*   4    4:icmpne          19
		{
			i |= 2;
	//    5    7:iload_3         
	//    6    8:iconst_2        
	//    7    9:ior             
	//    8   10:istore_3        
			mAutoRequery = true;
	//    9   11:aload_0         
	//   10   12:iconst_1        
	//   11   13:putfield        #149 <Field boolean mAutoRequery>
		} else
	//*  12   16:goto            24
		{
			mAutoRequery = false;
	//   13   19:aload_0         
	//   14   20:iconst_0        
	//   15   21:putfield        #149 <Field boolean mAutoRequery>
		}
		boolean flag;
		if(cursor != null)
	//*  16   24:aload_2         
	//*  17   25:ifnull          34
			flag = true;
	//   18   28:iconst_1        
	//   19   29:istore          5
		else
	//*  20   31:goto            37
			flag = false;
	//   21   34:iconst_0        
	//   22   35:istore          5
		mCursor = cursor;
	//   23   37:aload_0         
	//   24   38:aload_2         
	//   25   39:putfield        #81  <Field Cursor mCursor>
		mDataValid = flag;
	//   26   42:aload_0         
	//   27   43:iload           5
	//   28   45:putfield        #79  <Field boolean mDataValid>
		mContext = context;
	//   29   48:aload_0         
	//   30   49:aload_1         
	//   31   50:putfield        #93  <Field Context mContext>
		int j;
		if(flag)
	//*  32   53:iload           5
	//*  33   55:ifeq            71
			j = cursor.getColumnIndexOrThrow("_id");
	//   34   58:aload_2         
	//   35   59:ldc1            #151 <String "_id">
	//   36   61:invokeinterface #155 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   37   66:istore          4
		else
	//*  38   68:goto            74
			j = -1;
	//   39   71:iconst_m1       
	//   40   72:istore          4
		mRowIDColumn = j;
	//   41   74:aload_0         
	//   42   75:iload           4
	//   43   77:putfield        #118 <Field int mRowIDColumn>
		if((i & 2) == 2)
	//*  44   80:iload_3         
	//*  45   81:iconst_2        
	//*  46   82:iand            
	//*  47   83:iconst_2        
	//*  48   84:icmpne          114
		{
			mChangeObserver = new ChangeObserver();
	//   49   87:aload_0         
	//   50   88:new             #10  <Class CursorAdapter$ChangeObserver>
	//   51   91:dup             
	//   52   92:aload_0         
	//   53   93:invokespecial   #158 <Method void CursorAdapter$ChangeObserver(CursorAdapter)>
	//   54   96:putfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
			mDataSetObserver = ((DataSetObserver) (new MyDataSetObserver()));
	//   55   99:aload_0         
	//   56  100:new             #13  <Class CursorAdapter$MyDataSetObserver>
	//   57  103:dup             
	//   58  104:aload_0         
	//   59  105:invokespecial   #161 <Method void CursorAdapter$MyDataSetObserver(CursorAdapter)>
	//   60  108:putfield        #163 <Field DataSetObserver mDataSetObserver>
		} else
	//*  61  111:goto            124
		{
			mChangeObserver = null;
	//   62  114:aload_0         
	//   63  115:aconst_null     
	//   64  116:putfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
			mDataSetObserver = null;
	//   65  119:aload_0         
	//   66  120:aconst_null     
	//   67  121:putfield        #163 <Field DataSetObserver mDataSetObserver>
		}
		if(flag)
	//*  68  124:iload           5
	//*  69  126:ifeq            163
		{
			if(mChangeObserver != null)
	//*  70  129:aload_0         
	//*  71  130:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//*  72  133:ifnull          146
				cursor.registerContentObserver(((ContentObserver) (mChangeObserver)));
	//   73  136:aload_2         
	//   74  137:aload_0         
	//   75  138:getfield        #160 <Field CursorAdapter$ChangeObserver mChangeObserver>
	//   76  141:invokeinterface #167 <Method void Cursor.registerContentObserver(ContentObserver)>
			if(mDataSetObserver != null)
	//*  77  146:aload_0         
	//*  78  147:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//*  79  150:ifnull          163
				cursor.registerDataSetObserver(mDataSetObserver);
	//   80  153:aload_2         
	//   81  154:aload_0         
	//   82  155:getfield        #163 <Field DataSetObserver mDataSetObserver>
	//   83  158:invokeinterface #171 <Method void Cursor.registerDataSetObserver(DataSetObserver)>
		}
	//   84  163:return          
	}

	protected void init(Context context, Cursor cursor, boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            10
			byte0 = 1;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			byte0 = 2;
	//    5   10:iconst_2        
	//    6   11:istore          4
		init(context, cursor, ((int) (byte0)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:iload           4
	//   11   18:invokevirtual   #49  <Method void init(Context, Cursor, int)>
	//   12   21:return          
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
