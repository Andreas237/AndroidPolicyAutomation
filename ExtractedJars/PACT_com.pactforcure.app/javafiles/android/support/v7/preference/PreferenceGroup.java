// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.*;

// Referenced classes of package android.support.v7.preference:
//			Preference, PreferenceManager

public abstract class PreferenceGroup extends Preference
{
	public static interface PreferencePositionCallback
	{

		public abstract int getPreferenceAdapterPosition(Preference preference);

		public abstract int getPreferenceAdapterPosition(String s);
	}


	public PreferenceGroup(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #29  <Method void PreferenceGroup(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public PreferenceGroup(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #33  <Method void PreferenceGroup(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public PreferenceGroup(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #34  <Method void Preference(Context, AttributeSet, int, int)>
		mOrderingAsAdded = true;
	//    6    9:aload_0         
	//    7   10:iconst_1        
	//    8   11:putfield        #36  <Field boolean mOrderingAsAdded>
		mCurrentPreferenceOrder = 0;
	//    9   14:aload_0         
	//   10   15:iconst_0        
	//   11   16:putfield        #38  <Field int mCurrentPreferenceOrder>
		mAttachedToHierarchy = false;
	//   12   19:aload_0         
	//   13   20:iconst_0        
	//   14   21:putfield        #40  <Field boolean mAttachedToHierarchy>
		mIdRecycleCache = new SimpleArrayMap();
	//   15   24:aload_0         
	//   16   25:new             #42  <Class SimpleArrayMap>
	//   17   28:dup             
	//   18   29:invokespecial   #45  <Method void SimpleArrayMap()>
	//   19   32:putfield        #47  <Field SimpleArrayMap mIdRecycleCache>
		mHandler = new Handler();
	//   20   35:aload_0         
	//   21   36:new             #49  <Class Handler>
	//   22   39:dup             
	//   23   40:invokespecial   #50  <Method void Handler()>
	//   24   43:putfield        #52  <Field Handler mHandler>
		mClearRecycleCacheRunnable = new Runnable() {

			public void run()
			{
				this;
			//    0    0:aload_0         
				JVM INSTR monitorenter ;
			//    1    1:monitorenter    
				mIdRecycleCache.clear();
			//    2    2:aload_0         
			//    3    3:getfield        #14  <Field PreferenceGroup this$0>
			//    4    6:invokestatic    #23  <Method SimpleArrayMap PreferenceGroup.access$000(PreferenceGroup)>
			//    5    9:invokevirtual   #28  <Method void SimpleArrayMap.clear()>
				this;
			//    6   12:aload_0         
				JVM INSTR monitorexit ;
			//    7   13:monitorexit     
				return;
			//    8   14:return          
				Exception exception;
				exception;
			//    9   15:astore_1        
				this;
			//   10   16:aload_0         
				JVM INSTR monitorexit ;
			//   11   17:monitorexit     
				throw exception;
			//   12   18:aload_1         
			//   13   19:athrow          
			}

			final PreferenceGroup this$0;

			
			{
				this$0 = PreferenceGroup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PreferenceGroup this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   25   46:aload_0         
	//   26   47:new             #6   <Class PreferenceGroup$1>
	//   27   50:dup             
	//   28   51:aload_0         
	//   29   52:invokespecial   #55  <Method void PreferenceGroup$1(PreferenceGroup)>
	//   30   55:putfield        #57  <Field Runnable mClearRecycleCacheRunnable>
		mPreferenceList = ((List) (new ArrayList()));
	//   31   58:aload_0         
	//   32   59:new             #59  <Class ArrayList>
	//   33   62:dup             
	//   34   63:invokespecial   #60  <Method void ArrayList()>
	//   35   66:putfield        #62  <Field List mPreferenceList>
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.PreferenceGroup, i, j)));
	//   36   69:aload_1         
	//   37   70:aload_2         
	//   38   71:getstatic       #68  <Field int[] R$styleable.PreferenceGroup>
	//   39   74:iload_3         
	//   40   75:iload           4
	//   41   77:invokevirtual   #74  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   42   80:astore_1        
		mOrderingAsAdded = TypedArrayUtils.getBoolean(((TypedArray) (context)), R.styleable.PreferenceGroup_orderingFromXml, R.styleable.PreferenceGroup_orderingFromXml, true);
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:getstatic       #77  <Field int R$styleable.PreferenceGroup_orderingFromXml>
	//   46   86:getstatic       #77  <Field int R$styleable.PreferenceGroup_orderingFromXml>
	//   47   89:iconst_1        
	//   48   90:invokestatic    #83  <Method boolean TypedArrayUtils.getBoolean(TypedArray, int, int, boolean)>
	//   49   93:putfield        #36  <Field boolean mOrderingAsAdded>
		((TypedArray) (context)).recycle();
	//   50   96:aload_1         
	//   51   97:invokevirtual   #88  <Method void TypedArray.recycle()>
	//   52  100:return          
	}

	private boolean removePreferenceInt(Preference preference)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		preference.onPrepareForRemoval();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #95  <Method void Preference.onPrepareForRemoval()>
		flag = mPreferenceList.remove(((Object) (preference)));
	//    4    6:aload_0         
	//    5    7:getfield        #62  <Field List mPreferenceList>
	//    6   10:aload_1         
	//    7   11:invokeinterface #101 <Method boolean List.remove(Object)>
	//    8   16:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_80;
	//    9   17:iload_2         
	//   10   18:ifeq            80
		String s = preference.getKey();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #105 <Method String Preference.getKey()>
	//   13   25:astore_3        
		if(s == null)
			break MISSING_BLOCK_LABEL_69;
	//   14   26:aload_3         
	//   15   27:ifnull          69
		mIdRecycleCache.put(((Object) (s)), ((Object) (Long.valueOf(preference.getId()))));
	//   16   30:aload_0         
	//   17   31:getfield        #47  <Field SimpleArrayMap mIdRecycleCache>
	//   18   34:aload_3         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #109 <Method long Preference.getId()>
	//   21   39:invokestatic    #115 <Method Long Long.valueOf(long)>
	//   22   42:invokevirtual   #119 <Method Object SimpleArrayMap.put(Object, Object)>
	//   23   45:pop             
		mHandler.removeCallbacks(mClearRecycleCacheRunnable);
	//   24   46:aload_0         
	//   25   47:getfield        #52  <Field Handler mHandler>
	//   26   50:aload_0         
	//   27   51:getfield        #57  <Field Runnable mClearRecycleCacheRunnable>
	//   28   54:invokevirtual   #123 <Method void Handler.removeCallbacks(Runnable)>
		mHandler.post(mClearRecycleCacheRunnable);
	//   29   57:aload_0         
	//   30   58:getfield        #52  <Field Handler mHandler>
	//   31   61:aload_0         
	//   32   62:getfield        #57  <Field Runnable mClearRecycleCacheRunnable>
	//   33   65:invokevirtual   #127 <Method boolean Handler.post(Runnable)>
	//   34   68:pop             
		if(mAttachedToHierarchy)
	//*  35   69:aload_0         
	//*  36   70:getfield        #40  <Field boolean mAttachedToHierarchy>
	//*  37   73:ifeq            80
			preference.onDetached();
	//   38   76:aload_1         
	//   39   77:invokevirtual   #130 <Method void Preference.onDetached()>
		this;
	//   40   80:aload_0         
		JVM INSTR monitorexit ;
	//   41   81:monitorexit     
		return flag;
	//   42   82:iload_2         
	//   43   83:ireturn         
		preference;
	//   44   84:astore_1        
		this;
	//   45   85:aload_0         
		JVM INSTR monitorexit ;
	//   46   86:monitorexit     
		throw preference;
	//   47   87:aload_1         
	//   48   88:athrow          
	}

	public void addItemFromInflater(Preference preference)
	{
		addPreference(preference);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #135 <Method boolean addPreference(Preference)>
	//    3    5:pop             
	//    4    6:return          
	}

	public boolean addPreference(Preference preference)
	{
		int j;
		if(mPreferenceList.contains(((Object) (preference))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field List mPreferenceList>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #138 <Method boolean List.contains(Object)>
	//*   4   10:ifeq            15
			return true;
	//    5   13:iconst_1        
	//    6   14:ireturn         
		if(preference.getOrder() == 0x7fffffff)
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #142 <Method int Preference.getOrder()>
	//*   9   19:ldc1            #143 <Int 0x7fffffff>
	//*  10   21:icmpne          66
		{
			if(mOrderingAsAdded)
	//*  11   24:aload_0         
	//*  12   25:getfield        #36  <Field boolean mOrderingAsAdded>
	//*  13   28:ifeq            48
			{
				int i = mCurrentPreferenceOrder;
	//   14   31:aload_0         
	//   15   32:getfield        #38  <Field int mCurrentPreferenceOrder>
	//   16   35:istore_2        
				mCurrentPreferenceOrder = i + 1;
	//   17   36:aload_0         
	//   18   37:iload_2         
	//   19   38:iconst_1        
	//   20   39:iadd            
	//   21   40:putfield        #38  <Field int mCurrentPreferenceOrder>
				preference.setOrder(i);
	//   22   43:aload_1         
	//   23   44:iload_2         
	//   24   45:invokevirtual   #147 <Method void Preference.setOrder(int)>
			}
			if(preference instanceof PreferenceGroup)
	//*  25   48:aload_1         
	//*  26   49:instanceof      #2   <Class PreferenceGroup>
	//*  27   52:ifeq            66
				((PreferenceGroup)preference).setOrderingAsAdded(mOrderingAsAdded);
	//   28   55:aload_1         
	//   29   56:checkcast       #2   <Class PreferenceGroup>
	//   30   59:aload_0         
	//   31   60:getfield        #36  <Field boolean mOrderingAsAdded>
	//   32   63:invokevirtual   #151 <Method void setOrderingAsAdded(boolean)>
		}
		int k = Collections.binarySearch(mPreferenceList, ((Object) (preference)));
	//   33   66:aload_0         
	//   34   67:getfield        #62  <Field List mPreferenceList>
	//   35   70:aload_1         
	//   36   71:invokestatic    #157 <Method int Collections.binarySearch(List, Object)>
	//   37   74:istore_3        
		j = k;
	//   38   75:iload_3         
	//   39   76:istore_2        
		if(k < 0)
	//*  40   77:iload_3         
	//*  41   78:ifge            87
			j = k * -1 - 1;
	//   42   81:iload_3         
	//   43   82:iconst_m1       
	//   44   83:imul            
	//   45   84:iconst_1        
	//   46   85:isub            
	//   47   86:istore_2        
		if(!onPrepareAddPreference(preference))
	//*  48   87:aload_0         
	//*  49   88:aload_1         
	//*  50   89:invokevirtual   #160 <Method boolean onPrepareAddPreference(Preference)>
	//*  51   92:ifne            97
			return false;
	//   52   95:iconst_0        
	//   53   96:ireturn         
		this;
	//   54   97:aload_0         
		JVM INSTR monitorenter ;
	//   55   98:monitorenter    
		mPreferenceList.add(j, ((Object) (preference)));
	//   56   99:aload_0         
	//   57  100:getfield        #62  <Field List mPreferenceList>
	//   58  103:iload_2         
	//   59  104:aload_1         
	//   60  105:invokeinterface #164 <Method void List.add(int, Object)>
		this;
	//   61  110:aload_0         
		JVM INSTR monitorexit ;
	//   62  111:monitorexit     
		PreferenceManager preferencemanager = getPreferenceManager();
	//   63  112:aload_0         
	//   64  113:invokevirtual   #168 <Method PreferenceManager getPreferenceManager()>
	//   65  116:astore          6
		String s = preference.getKey();
	//   66  118:aload_1         
	//   67  119:invokevirtual   #105 <Method String Preference.getKey()>
	//   68  122:astore          7
		long l;
		if(s != null && mIdRecycleCache.containsKey(((Object) (s))))
	//*  69  124:aload           7
	//*  70  126:ifnull          198
	//*  71  129:aload_0         
	//*  72  130:getfield        #47  <Field SimpleArrayMap mIdRecycleCache>
	//*  73  133:aload           7
	//*  74  135:invokevirtual   #171 <Method boolean SimpleArrayMap.containsKey(Object)>
	//*  75  138:ifeq            198
		{
			l = ((Long)mIdRecycleCache.get(((Object) (s)))).longValue();
	//   76  141:aload_0         
	//   77  142:getfield        #47  <Field SimpleArrayMap mIdRecycleCache>
	//   78  145:aload           7
	//   79  147:invokevirtual   #175 <Method Object SimpleArrayMap.get(Object)>
	//   80  150:checkcast       #111 <Class Long>
	//   81  153:invokevirtual   #178 <Method long Long.longValue()>
	//   82  156:lstore          4
			mIdRecycleCache.remove(((Object) (s)));
	//   83  158:aload_0         
	//   84  159:getfield        #47  <Field SimpleArrayMap mIdRecycleCache>
	//   85  162:aload           7
	//   86  164:invokevirtual   #180 <Method Object SimpleArrayMap.remove(Object)>
	//   87  167:pop             
		} else
	//*  88  168:aload_1         
	//*  89  169:aload           6
	//*  90  171:lload           4
	//*  91  173:invokevirtual   #184 <Method void Preference.onAttachedToHierarchy(PreferenceManager, long)>
	//*  92  176:aload_0         
	//*  93  177:getfield        #40  <Field boolean mAttachedToHierarchy>
	//*  94  180:ifeq            187
	//*  95  183:aload_1         
	//*  96  184:invokevirtual   #187 <Method void Preference.onAttached()>
	//*  97  187:aload_0         
	//*  98  188:invokevirtual   #190 <Method void notifyHierarchyChanged()>
	//*  99  191:iconst_1        
	//* 100  192:ireturn         
	//* 101  193:astore_1        
	//* 102  194:aload_0         
	//* 103  195:monitorexit     
	//* 104  196:aload_1         
	//* 105  197:athrow          
		{
			l = preferencemanager.getNextId();
	//  106  198:aload           6
	//  107  200:invokevirtual   #195 <Method long PreferenceManager.getNextId()>
	//  108  203:lstore          4
		}
		preference.onAttachedToHierarchy(preferencemanager, l);
		if(mAttachedToHierarchy)
			preference.onAttached();
		notifyHierarchyChanged();
		return true;
		preference;
		this;
		JVM INSTR monitorexit ;
		throw preference;
	//* 109  205:goto            168
	}

	protected void dispatchRestoreInstanceState(Bundle bundle)
	{
		super.dispatchRestoreInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #199 <Method void Preference.dispatchRestoreInstanceState(Bundle)>
		int j = getPreferenceCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #202 <Method int getPreferenceCount()>
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          33
			getPreference(i).dispatchRestoreInstanceState(bundle);
	//   11   17:aload_0         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #206 <Method Preference getPreference(int)>
	//   14   22:aload_1         
	//   15   23:invokevirtual   #199 <Method void Preference.dispatchRestoreInstanceState(Bundle)>

	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
	//*  20   30:goto            12
	//   21   33:return          
	}

	protected void dispatchSaveInstanceState(Bundle bundle)
	{
		super.dispatchSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #209 <Method void Preference.dispatchSaveInstanceState(Bundle)>
		int j = getPreferenceCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #202 <Method int getPreferenceCount()>
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          33
			getPreference(i).dispatchSaveInstanceState(bundle);
	//   11   17:aload_0         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #206 <Method Preference getPreference(int)>
	//   14   22:aload_1         
	//   15   23:invokevirtual   #209 <Method void Preference.dispatchSaveInstanceState(Bundle)>

	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
	//*  20   30:goto            12
	//   21   33:return          
	}

	public Preference findPreference(CharSequence charsequence)
	{
		if(TextUtils.equals(((CharSequence) (getKey())), charsequence))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #212 <Method String getKey()>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #218 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*   4    8:ifeq            13
			return ((Preference) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
		int j = getPreferenceCount();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #202 <Method int getPreferenceCount()>
	//    9   17:istore_3        
		for(int i = 0; i < j; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_2        
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:icmpge          90
		{
			Preference preference = getPreference(i);
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokevirtual   #206 <Method Preference getPreference(int)>
	//   18   30:astore          4
			String s = preference.getKey();
	//   19   32:aload           4
	//   20   34:invokevirtual   #105 <Method String Preference.getKey()>
	//   21   37:astore          5
			if(s != null && s.equals(((Object) (charsequence))))
	//*  22   39:aload           5
	//*  23   41:ifnull          56
	//*  24   44:aload           5
	//*  25   46:aload_1         
	//*  26   47:invokevirtual   #222 <Method boolean String.equals(Object)>
	//*  27   50:ifeq            56
				return preference;
	//   28   53:aload           4
	//   29   55:areturn         
			if(!(preference instanceof PreferenceGroup))
				continue;
	//   30   56:aload           4
	//   31   58:instanceof      #2   <Class PreferenceGroup>
	//   32   61:ifeq            83
			preference = ((PreferenceGroup)preference).findPreference(charsequence);
	//   33   64:aload           4
	//   34   66:checkcast       #2   <Class PreferenceGroup>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #224 <Method Preference findPreference(CharSequence)>
	//   37   73:astore          4
			if(preference != null)
	//*  38   75:aload           4
	//*  39   77:ifnull          83
				return preference;
	//   40   80:aload           4
	//   41   82:areturn         
		}

	//   42   83:iload_2         
	//   43   84:iconst_1        
	//   44   85:iadd            
	//   45   86:istore_2        
	//*  46   87:goto            20
		return null;
	//   47   90:aconst_null     
	//   48   91:areturn         
	}

	public Preference getPreference(int i)
	{
		return (Preference)mPreferenceList.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List mPreferenceList>
	//    2    4:iload_1         
	//    3    5:invokeinterface #227 <Method Object List.get(int)>
	//    4   10:checkcast       #4   <Class Preference>
	//    5   13:areturn         
	}

	public int getPreferenceCount()
	{
		return mPreferenceList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List mPreferenceList>
	//    2    4:invokeinterface #230 <Method int List.size()>
	//    3    9:ireturn         
	}

	public boolean isAttached()
	{
		return mAttachedToHierarchy;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean mAttachedToHierarchy>
	//    2    4:ireturn         
	}

	protected boolean isOnSameScreenAsChildren()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isOrderingAsAdded()
	{
		return mOrderingAsAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean mOrderingAsAdded>
	//    2    4:ireturn         
	}

	public void notifyDependencyChange(boolean flag)
	{
		super.notifyDependencyChange(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #242 <Method void Preference.notifyDependencyChange(boolean)>
		int j = getPreferenceCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #202 <Method int getPreferenceCount()>
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          34
			getPreference(i).onParentChanged(((Preference) (this)), flag);
	//   11   17:aload_0         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #206 <Method Preference getPreference(int)>
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:invokevirtual   #246 <Method void Preference.onParentChanged(Preference, boolean)>

	//   17   27:iload_2         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_2        
	//*  21   31:goto            12
	//   22   34:return          
	}

	public void onAttached()
	{
		super.onAttached();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method void Preference.onAttached()>
		mAttachedToHierarchy = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #40  <Field boolean mAttachedToHierarchy>
		int j = getPreferenceCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #202 <Method int getPreferenceCount()>
	//    7   13:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          36
			getPreference(i).onAttached();
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #206 <Method Preference getPreference(int)>
	//   16   26:invokevirtual   #187 <Method void Preference.onAttached()>

	//   17   29:iload_1         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_1        
	//*  21   33:goto            16
	//   22   36:return          
	}

	public void onDetached()
	{
		super.onDetached();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void Preference.onDetached()>
		mAttachedToHierarchy = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field boolean mAttachedToHierarchy>
		int j = getPreferenceCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #202 <Method int getPreferenceCount()>
	//    7   13:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          36
			getPreference(i).onDetached();
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #206 <Method Preference getPreference(int)>
	//   16   26:invokevirtual   #130 <Method void Preference.onDetached()>

	//   17   29:iload_1         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_1        
	//*  21   33:goto            16
	//   22   36:return          
	}

	protected boolean onPrepareAddPreference(Preference preference)
	{
		preference.onParentChanged(((Preference) (this)), shouldDisableDependents());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #249 <Method boolean shouldDisableDependents()>
	//    4    6:invokevirtual   #246 <Method void Preference.onParentChanged(Preference, boolean)>
		return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public void removeAll()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		List list;
		list = mPreferenceList;
	//    2    2:aload_0         
	//    3    3:getfield        #62  <Field List mPreferenceList>
	//    4    6:astore_2        
		i = list.size() - 1;
	//    5    7:aload_2         
	//    6    8:invokeinterface #230 <Method int List.size()>
	//    7   13:iconst_1        
	//    8   14:isub            
	//    9   15:istore_1        
_L2:
		if(i < 0)
			break; /* Loop/switch isn't completed */
	//   10   16:iload_1         
	//   11   17:iflt            42
		removePreferenceInt((Preference)list.get(0));
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:iconst_0        
	//   15   23:invokeinterface #227 <Method Object List.get(int)>
	//   16   28:checkcast       #4   <Class Preference>
	//   17   31:invokespecial   #252 <Method boolean removePreferenceInt(Preference)>
	//   18   34:pop             
		i--;
	//   19   35:iload_1         
	//   20   36:iconst_1        
	//   21   37:isub            
	//   22   38:istore_1        
		if(true) goto _L2; else goto _L1
	//   23   39:goto            16
_L1:
		this;
	//   24   42:aload_0         
		JVM INSTR monitorexit ;
	//   25   43:monitorexit     
		notifyHierarchyChanged();
	//   26   44:aload_0         
	//   27   45:invokevirtual   #190 <Method void notifyHierarchyChanged()>
		return;
	//   28   48:return          
		Exception exception;
		exception;
	//   29   49:astore_2        
		this;
	//   30   50:aload_0         
		JVM INSTR monitorexit ;
	//   31   51:monitorexit     
		throw exception;
	//   32   52:aload_2         
	//   33   53:athrow          
	}

	public boolean removePreference(Preference preference)
	{
		boolean flag = removePreferenceInt(preference);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #252 <Method boolean removePreferenceInt(Preference)>
	//    3    5:istore_2        
		notifyHierarchyChanged();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #190 <Method void notifyHierarchyChanged()>
		return flag;
	//    6   10:iload_2         
	//    7   11:ireturn         
	}

	public void setOrderingAsAdded(boolean flag)
	{
		mOrderingAsAdded = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean mOrderingAsAdded>
	//    3    5:return          
	}

	void sortPreferences()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Collections.sort(mPreferenceList);
	//    2    2:aload_0         
	//    3    3:getfield        #62  <Field List mPreferenceList>
	//    4    6:invokestatic    #258 <Method void Collections.sort(List)>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Exception exception;
		exception;
	//    8   12:astore_1        
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		throw exception;
	//   11   15:aload_1         
	//   12   16:athrow          
	}

	private boolean mAttachedToHierarchy;
	private final Runnable mClearRecycleCacheRunnable;
	private int mCurrentPreferenceOrder;
	private final Handler mHandler;
	private final SimpleArrayMap mIdRecycleCache;
	private boolean mOrderingAsAdded;
	private List mPreferenceList;


/*
	static SimpleArrayMap access$000(PreferenceGroup preferencegroup)
	{
		return preferencegroup.mIdRecycleCache;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field SimpleArrayMap mIdRecycleCache>
	//    2    4:areturn         
	}

*/
}
