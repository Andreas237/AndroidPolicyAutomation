// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.databinding;

import android.databinding.*;
import android.databinding.adapters.CompoundButtonBindingAdapter;
import android.databinding.adapters.TextViewBindingAdapter;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.util.SparseIntArray;
import android.view.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pactforcure.app.participant.Participant;

public class ActivitySettingsBinding extends ViewDataBinding
{

	public ActivitySettingsBinding(DataBindingComponent databindingcomponent, View view)
	{
		super(databindingcomponent, view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #80  <Method void ViewDataBinding(DataBindingComponent, View, int)>
		mDirtyFlags = -1L;
	//    5    7:aload_0         
	//    6    8:ldc2w           #81  <Long -1L>
	//    7   11:putfield        #84  <Field long mDirtyFlags>
		databindingcomponent = ((DataBindingComponent) (mapBindings(databindingcomponent, view, 25, sIncludes, sViewsWithIds)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:bipush          25
	//   11   18:getstatic       #45  <Field android.databinding.ViewDataBinding$IncludedLayouts sIncludes>
	//   12   21:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   13   24:invokestatic    #88  <Method Object[] mapBindings(DataBindingComponent, View, int, android.databinding.ViewDataBinding$IncludedLayouts, SparseIntArray)>
	//   14   27:astore_1        
		addressChangeMail = (TextView)databindingcomponent[13];
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:bipush          13
	//   18   32:aaload          
	//   19   33:checkcast       #90  <Class TextView>
	//   20   36:putfield        #92  <Field TextView addressChangeMail>
		addressTitle = (TextView)databindingcomponent[11];
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:bipush          11
	//   24   43:aaload          
	//   25   44:checkcast       #90  <Class TextView>
	//   26   47:putfield        #94  <Field TextView addressTitle>
		addressView = (TextView)databindingcomponent[12];
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:bipush          12
	//   30   54:aaload          
	//   31   55:checkcast       #90  <Class TextView>
	//   32   58:putfield        #96  <Field TextView addressView>
		allowContactSwitch = (SwitchCompat)databindingcomponent[5];
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:iconst_5        
	//   36   64:aaload          
	//   37   65:checkcast       #98  <Class SwitchCompat>
	//   38   68:putfield        #100 <Field SwitchCompat allowContactSwitch>
		allowContactSwitch.setTag(((Object) (null)));
	//   39   71:aload_0         
	//   40   72:getfield        #100 <Field SwitchCompat allowContactSwitch>
	//   41   75:aconst_null     
	//   42   76:invokevirtual   #104 <Method void SwitchCompat.setTag(Object)>
		allowPactContactMeLabel = (TextView)databindingcomponent[16];
	//   43   79:aload_0         
	//   44   80:aload_1         
	//   45   81:bipush          16
	//   46   83:aaload          
	//   47   84:checkcast       #90  <Class TextView>
	//   48   87:putfield        #106 <Field TextView allowPactContactMeLabel>
		contactInformationLabel = (TextView)databindingcomponent[17];
	//   49   90:aload_0         
	//   50   91:aload_1         
	//   51   92:bipush          17
	//   52   94:aaload          
	//   53   95:checkcast       #90  <Class TextView>
	//   54   98:putfield        #108 <Field TextView contactInformationLabel>
		contactLabel = (TextView)databindingcomponent[15];
	//   55  101:aload_0         
	//   56  102:aload_1         
	//   57  103:bipush          15
	//   58  105:aaload          
	//   59  106:checkcast       #90  <Class TextView>
	//   60  109:putfield        #110 <Field TextView contactLabel>
		container = (LinearLayout)databindingcomponent[1];
	//   61  112:aload_0         
	//   62  113:aload_1         
	//   63  114:iconst_1        
	//   64  115:aaload          
	//   65  116:checkcast       #112 <Class LinearLayout>
	//   66  119:putfield        #114 <Field LinearLayout container>
		container.setTag(((Object) (null)));
	//   67  122:aload_0         
	//   68  123:getfield        #114 <Field LinearLayout container>
	//   69  126:aconst_null     
	//   70  127:invokevirtual   #115 <Method void LinearLayout.setTag(Object)>
		email = (TextView)databindingcomponent[4];
	//   71  130:aload_0         
	//   72  131:aload_1         
	//   73  132:iconst_4        
	//   74  133:aaload          
	//   75  134:checkcast       #90  <Class TextView>
	//   76  137:putfield        #117 <Field TextView email>
		email.setTag(((Object) (null)));
	//   77  140:aload_0         
	//   78  141:getfield        #117 <Field TextView email>
	//   79  144:aconst_null     
	//   80  145:invokevirtual   #118 <Method void TextView.setTag(Object)>
		emailLabel = (TextView)databindingcomponent[10];
	//   81  148:aload_0         
	//   82  149:aload_1         
	//   83  150:bipush          10
	//   84  152:aaload          
	//   85  153:checkcast       #90  <Class TextView>
	//   86  156:putfield        #120 <Field TextView emailLabel>
		fullName = (TextView)databindingcomponent[2];
	//   87  159:aload_0         
	//   88  160:aload_1         
	//   89  161:iconst_2        
	//   90  162:aaload          
	//   91  163:checkcast       #90  <Class TextView>
	//   92  166:putfield        #122 <Field TextView fullName>
		fullName.setTag(((Object) (null)));
	//   93  169:aload_0         
	//   94  170:getfield        #122 <Field TextView fullName>
	//   95  173:aconst_null     
	//   96  174:invokevirtual   #118 <Method void TextView.setTag(Object)>
		leaveBtn = (TextView)databindingcomponent[24];
	//   97  177:aload_0         
	//   98  178:aload_1         
	//   99  179:bipush          24
	//  100  181:aaload          
	//  101  182:checkcast       #90  <Class TextView>
	//  102  185:putfield        #124 <Field TextView leaveBtn>
		leaveDnaBtn = (TextView)databindingcomponent[21];
	//  103  188:aload_0         
	//  104  189:aload_1         
	//  105  190:bipush          21
	//  106  192:aaload          
	//  107  193:checkcast       #90  <Class TextView>
	//  108  196:putfield        #126 <Field TextView leaveDnaBtn>
		leaveDnaExplanation = (TextView)databindingcomponent[20];
	//  109  199:aload_0         
	//  110  200:aload_1         
	//  111  201:bipush          20
	//  112  203:aaload          
	//  113  204:checkcast       #90  <Class TextView>
	//  114  207:putfield        #128 <Field TextView leaveDnaExplanation>
		leaveDnaTitle = (TextView)databindingcomponent[19];
	//  115  210:aload_0         
	//  116  211:aload_1         
	//  117  212:bipush          19
	//  118  214:aaload          
	//  119  215:checkcast       #90  <Class TextView>
	//  120  218:putfield        #130 <Field TextView leaveDnaTitle>
		leavePactBtn = (TextView)databindingcomponent[22];
	//  121  221:aload_0         
	//  122  222:aload_1         
	//  123  223:bipush          22
	//  124  225:aaload          
	//  125  226:checkcast       #90  <Class TextView>
	//  126  229:putfield        #132 <Field TextView leavePactBtn>
		leaveStudyExplanation = (TextView)databindingcomponent[23];
	//  127  232:aload_0         
	//  128  233:aload_1         
	//  129  234:bipush          23
	//  130  236:aaload          
	//  131  237:checkcast       #90  <Class TextView>
	//  132  240:putfield        #134 <Field TextView leaveStudyExplanation>
		logoutBtn = (TextView)databindingcomponent[14];
	//  133  243:aload_0         
	//  134  244:aload_1         
	//  135  245:bipush          14
	//  136  247:aaload          
	//  137  248:checkcast       #90  <Class TextView>
	//  138  251:putfield        #136 <Field TextView logoutBtn>
		mboundView0 = (LinearLayout)databindingcomponent[0];
	//  139  254:aload_0         
	//  140  255:aload_1         
	//  141  256:iconst_0        
	//  142  257:aaload          
	//  143  258:checkcast       #112 <Class LinearLayout>
	//  144  261:putfield        #138 <Field LinearLayout mboundView0>
		mboundView0.setTag(((Object) (null)));
	//  145  264:aload_0         
	//  146  265:getfield        #138 <Field LinearLayout mboundView0>
	//  147  268:aconst_null     
	//  148  269:invokevirtual   #115 <Method void LinearLayout.setTag(Object)>
		nameLabel = (TextView)databindingcomponent[8];
	//  149  272:aload_0         
	//  150  273:aload_1         
	//  151  274:bipush          8
	//  152  276:aaload          
	//  153  277:checkcast       #90  <Class TextView>
	//  154  280:putfield        #140 <Field TextView nameLabel>
		participationLabel = (TextView)databindingcomponent[18];
	//  155  283:aload_0         
	//  156  284:aload_1         
	//  157  285:bipush          18
	//  158  287:aaload          
	//  159  288:checkcast       #90  <Class TextView>
	//  160  291:putfield        #142 <Field TextView participationLabel>
		profileLabel = (TextView)databindingcomponent[7];
	//  161  294:aload_0         
	//  162  295:aload_1         
	//  163  296:bipush          7
	//  164  298:aaload          
	//  165  299:checkcast       #90  <Class TextView>
	//  166  302:putfield        #144 <Field TextView profileLabel>
		telephone = (TextView)databindingcomponent[3];
	//  167  305:aload_0         
	//  168  306:aload_1         
	//  169  307:iconst_3        
	//  170  308:aaload          
	//  171  309:checkcast       #90  <Class TextView>
	//  172  312:putfield        #146 <Field TextView telephone>
		telephone.setTag(((Object) (null)));
	//  173  315:aload_0         
	//  174  316:getfield        #146 <Field TextView telephone>
	//  175  319:aconst_null     
	//  176  320:invokevirtual   #118 <Method void TextView.setTag(Object)>
		telephoneLabel = (TextView)databindingcomponent[9];
	//  177  323:aload_0         
	//  178  324:aload_1         
	//  179  325:bipush          9
	//  180  327:aaload          
	//  181  328:checkcast       #90  <Class TextView>
	//  182  331:putfield        #148 <Field TextView telephoneLabel>
		toolbar = (Toolbar)databindingcomponent[6];
	//  183  334:aload_0         
	//  184  335:aload_1         
	//  185  336:bipush          6
	//  186  338:aaload          
	//  187  339:checkcast       #150 <Class Toolbar>
	//  188  342:putfield        #152 <Field Toolbar toolbar>
		setRootTag(view);
	//  189  345:aload_0         
	//  190  346:aload_2         
	//  191  347:invokevirtual   #156 <Method void setRootTag(View)>
		invalidateAll();
	//  192  350:aload_0         
	//  193  351:invokevirtual   #159 <Method void invalidateAll()>
	//  194  354:return          
	}

	public static ActivitySettingsBinding bind(View view)
	{
		return bind(view, DataBindingUtil.getDefaultComponent());
	//    0    0:aload_0         
	//    1    1:invokestatic    #167 <Method DataBindingComponent DataBindingUtil.getDefaultComponent()>
	//    2    4:invokestatic    #170 <Method ActivitySettingsBinding bind(View, DataBindingComponent)>
	//    3    7:areturn         
	}

	public static ActivitySettingsBinding bind(View view, DataBindingComponent databindingcomponent)
	{
		if(!"layout/activity_settings_0".equals(view.getTag()))
	//*   0    0:ldc1            #172 <String "layout/activity_settings_0">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #178 <Method Object View.getTag()>
	//*   3    6:invokevirtual   #184 <Method boolean String.equals(Object)>
	//*   4    9:ifne            42
			throw new RuntimeException((new StringBuilder()).append("view tag isn't correct on view:").append(view.getTag()).toString());
	//    5   12:new             #186 <Class RuntimeException>
	//    6   15:dup             
	//    7   16:new             #188 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #189 <Method void StringBuilder()>
	//   10   23:ldc1            #191 <String "view tag isn't correct on view:">
	//   11   25:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #178 <Method Object View.getTag()>
	//   14   32:invokevirtual   #198 <Method StringBuilder StringBuilder.append(Object)>
	//   15   35:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #205 <Method void RuntimeException(String)>
	//   17   41:athrow          
		else
			return new ActivitySettingsBinding(databindingcomponent, view);
	//   18   42:new             #2   <Class ActivitySettingsBinding>
	//   19   45:dup             
	//   20   46:aload_1         
	//   21   47:aload_0         
	//   22   48:invokespecial   #207 <Method void ActivitySettingsBinding(DataBindingComponent, View)>
	//   23   51:areturn         
	}

	public static ActivitySettingsBinding inflate(LayoutInflater layoutinflater)
	{
		return inflate(layoutinflater, DataBindingUtil.getDefaultComponent());
	//    0    0:aload_0         
	//    1    1:invokestatic    #167 <Method DataBindingComponent DataBindingUtil.getDefaultComponent()>
	//    2    4:invokestatic    #212 <Method ActivitySettingsBinding inflate(LayoutInflater, DataBindingComponent)>
	//    3    7:areturn         
	}

	public static ActivitySettingsBinding inflate(LayoutInflater layoutinflater, DataBindingComponent databindingcomponent)
	{
		return bind(layoutinflater.inflate(0x7f04002d, ((ViewGroup) (null)), false), databindingcomponent);
	//    0    0:aload_0         
	//    1    1:ldc1            #213 <Int 0x7f04002d>
	//    2    3:aconst_null     
	//    3    4:iconst_0        
	//    4    5:invokevirtual   #218 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    5    8:aload_1         
	//    6    9:invokestatic    #170 <Method ActivitySettingsBinding bind(View, DataBindingComponent)>
	//    7   12:areturn         
	}

	public static ActivitySettingsBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
	{
		return inflate(layoutinflater, viewgroup, flag, DataBindingUtil.getDefaultComponent());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #167 <Method DataBindingComponent DataBindingUtil.getDefaultComponent()>
	//    4    6:invokestatic    #222 <Method ActivitySettingsBinding inflate(LayoutInflater, ViewGroup, boolean, DataBindingComponent)>
	//    5    9:areturn         
	}

	public static ActivitySettingsBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag, DataBindingComponent databindingcomponent)
	{
		return (ActivitySettingsBinding)DataBindingUtil.inflate(layoutinflater, 0x7f04002d, viewgroup, flag, databindingcomponent);
	//    0    0:aload_0         
	//    1    1:ldc1            #213 <Int 0x7f04002d>
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:aload_3         
	//    5    6:invokestatic    #225 <Method ViewDataBinding DataBindingUtil.inflate(LayoutInflater, int, ViewGroup, boolean, DataBindingComponent)>
	//    6    9:checkcast       #2   <Class ActivitySettingsBinding>
	//    7   12:areturn         
	}

	protected void executeBindings()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l;
		l = mDirtyFlags;
	//    2    2:aload_0         
	//    3    3:getfield        #84  <Field long mDirtyFlags>
	//    4    6:lstore_1        
		mDirtyFlags = 0L;
	//    5    7:aload_0         
	//    6    8:lconst_0        
	//    7    9:putfield        #84  <Field long mDirtyFlags>
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		String s1 = null;
	//   10   14:aconst_null     
	//   11   15:astore          6
		Object obj1 = null;
	//   12   17:aconst_null     
	//   13   18:astore          9
		boolean flag1 = false;
	//   14   20:iconst_0        
	//   15   21:istore          4
		String s2 = null;
	//   16   23:aconst_null     
	//   17   24:astore          7
		Object obj = null;
	//   18   26:aconst_null     
	//   19   27:astore          8
		Participant participant = mParticipant;
	//   20   29:aload_0         
	//   21   30:getfield        #228 <Field Participant mParticipant>
	//   22   33:astore          11
		String s = null;
	//   23   35:aconst_null     
	//   24   36:astore          5
		Object obj2 = null;
	//   25   38:aconst_null     
	//   26   39:astore          10
		boolean flag = false;
	//   27   41:iconst_0        
	//   28   42:istore_3        
		if((l & 3L) != 0L)
	//*  29   43:lload_1         
	//*  30   44:ldc2w           #229 <Long 3L>
	//*  31   47:land            
	//*  32   48:lconst_0        
	//*  33   49:lcmp            
	//*  34   50:ifeq            106
		{
			s = ((String) (obj2));
	//   35   53:aload           10
	//   36   55:astore          5
			s1 = ((String) (obj1));
	//   37   57:aload           9
	//   38   59:astore          6
			flag = flag1;
	//   39   61:iload           4
	//   40   63:istore_3        
			s2 = ((String) (obj));
	//   41   64:aload           8
	//   42   66:astore          7
			if(participant != null)
	//*  43   68:aload           11
	//*  44   70:ifnull          100
			{
				s1 = participant.getEmail();
	//   45   73:aload           11
	//   46   75:invokevirtual   #235 <Method String Participant.getEmail()>
	//   47   78:astore          6
				flag = participant.isOptOut();
	//   48   80:aload           11
	//   49   82:invokevirtual   #239 <Method boolean Participant.isOptOut()>
	//   50   85:istore_3        
				s2 = participant.getTelephone();
	//   51   86:aload           11
	//   52   88:invokevirtual   #242 <Method String Participant.getTelephone()>
	//   53   91:astore          7
				s = participant.buildName();
	//   54   93:aload           11
	//   55   95:invokevirtual   #245 <Method String Participant.buildName()>
	//   56   98:astore          5
			}
			Exception exception;
			if(!flag)
	//*  57  100:iload_3         
	//*  58  101:ifne            159
				flag = true;
	//   59  104:iconst_1        
	//   60  105:istore_3        
			else
	//*  61  106:lload_1         
	//*  62  107:ldc2w           #229 <Long 3L>
	//*  63  110:land            
	//*  64  111:lconst_0        
	//*  65  112:lcmp            
	//*  66  113:ifeq            151
	//*  67  116:aload_0         
	//*  68  117:getfield        #100 <Field SwitchCompat allowContactSwitch>
	//*  69  120:iload_3         
	//*  70  121:invokestatic    #251 <Method void CompoundButtonBindingAdapter.setChecked(android.widget.CompoundButton, boolean)>
	//*  71  124:aload_0         
	//*  72  125:getfield        #117 <Field TextView email>
	//*  73  128:aload           6
	//*  74  130:invokestatic    #257 <Method void TextViewBindingAdapter.setText(TextView, CharSequence)>
	//*  75  133:aload_0         
	//*  76  134:getfield        #122 <Field TextView fullName>
	//*  77  137:aload           5
	//*  78  139:invokestatic    #257 <Method void TextViewBindingAdapter.setText(TextView, CharSequence)>
	//*  79  142:aload_0         
	//*  80  143:getfield        #146 <Field TextView telephone>
	//*  81  146:aload           7
	//*  82  148:invokestatic    #257 <Method void TextViewBindingAdapter.setText(TextView, CharSequence)>
	//*  83  151:return          
	//*  84  152:astore          5
	//*  85  154:aload_0         
	//*  86  155:monitorexit     
	//*  87  156:aload           5
	//*  88  158:athrow          
				flag = false;
	//   89  159:iconst_0        
	//   90  160:istore_3        
		}
		if((l & 3L) != 0L)
		{
			CompoundButtonBindingAdapter.setChecked(((android.widget.CompoundButton) (allowContactSwitch)), flag);
			TextViewBindingAdapter.setText(email, ((CharSequence) (s1)));
			TextViewBindingAdapter.setText(fullName, ((CharSequence) (s)));
			TextViewBindingAdapter.setText(telephone, ((CharSequence) (s2)));
		}
		return;
		exception;
		this;
		JVM INSTR monitorexit ;
		throw exception;
	//*  91  161:goto            106
	}

	public Participant getParticipant()
	{
		return mParticipant;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field Participant mParticipant>
	//    2    4:areturn         
	}

	public boolean hasPendingBindings()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mDirtyFlags != 0L)
	//*   2    2:aload_0         
	//*   3    3:getfield        #84  <Field long mDirtyFlags>
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifeq            15
	//*   7   11:aload_0         
	//*   8   12:monitorexit     
			return true;
	//    9   13:iconst_1        
	//   10   14:ireturn         
		this;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		return false;
	//   13   17:iconst_0        
	//   14   18:ireturn         
		Exception exception;
		exception;
	//   15   19:astore_1        
		this;
	//   16   20:aload_0         
		JVM INSTR monitorexit ;
	//   17   21:monitorexit     
		throw exception;
	//   18   22:aload_1         
	//   19   23:athrow          
	}

	public void invalidateAll()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mDirtyFlags = 2L;
	//    2    2:aload_0         
	//    3    3:ldc2w           #261 <Long 2L>
	//    4    6:putfield        #84  <Field long mDirtyFlags>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		requestRebind();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #265 <Method void requestRebind()>
		return;
	//    9   15:return          
		Exception exception;
		exception;
	//   10   16:astore_1        
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		throw exception;
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	protected boolean onFieldChange(int i, Object obj, int j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setParticipant(Participant participant)
	{
		mParticipant = participant;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #228 <Field Participant mParticipant>
		this;
	//    3    5:aload_0         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mDirtyFlags = mDirtyFlags | 1L;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #84  <Field long mDirtyFlags>
	//    8   12:lconst_1        
	//    9   13:lor             
	//   10   14:putfield        #84  <Field long mDirtyFlags>
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		notifyPropertyChanged(1);
	//   13   19:aload_0         
	//   14   20:iconst_1        
	//   15   21:invokevirtual   #273 <Method void notifyPropertyChanged(int)>
		super.requestRebind();
	//   16   24:aload_0         
	//   17   25:invokespecial   #274 <Method void ViewDataBinding.requestRebind()>
		return;
	//   18   28:return          
		participant;
	//   19   29:astore_1        
		this;
	//   20   30:aload_0         
		JVM INSTR monitorexit ;
	//   21   31:monitorexit     
		throw participant;
	//   22   32:aload_1         
	//   23   33:athrow          
	}

	public boolean setVariable(int i, Object obj)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 1: default 20
	//	               1 22
		default:
			return false;
	//    2   20:iconst_0        
	//    3   21:ireturn         

		case 1: // '\001'
			setParticipant((Participant)obj);
	//    4   22:aload_0         
	//    5   23:aload_2         
	//    6   24:checkcast       #232 <Class Participant>
	//    7   27:invokevirtual   #278 <Method void setParticipant(Participant)>
			break;
		}
		return true;
	//    8   30:iconst_1        
	//    9   31:ireturn         
	}

	private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
	private static final SparseIntArray sViewsWithIds;
	public final TextView addressChangeMail;
	public final TextView addressTitle;
	public final TextView addressView;
	public final SwitchCompat allowContactSwitch;
	public final TextView allowPactContactMeLabel;
	public final TextView contactInformationLabel;
	public final TextView contactLabel;
	public final LinearLayout container;
	public final TextView email;
	public final TextView emailLabel;
	public final TextView fullName;
	public final TextView leaveBtn;
	public final TextView leaveDnaBtn;
	public final TextView leaveDnaExplanation;
	public final TextView leaveDnaTitle;
	public final TextView leavePactBtn;
	public final TextView leaveStudyExplanation;
	public final TextView logoutBtn;
	private long mDirtyFlags;
	private Participant mParticipant;
	private final LinearLayout mboundView0;
	public final TextView nameLabel;
	public final TextView participationLabel;
	public final TextView profileLabel;
	public final TextView telephone;
	public final TextView telephoneLabel;
	public final Toolbar toolbar;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #45  <Field android.databinding.ViewDataBinding$IncludedLayouts sIncludes>
		sViewsWithIds = new SparseIntArray();
	//    2    4:new             #47  <Class SparseIntArray>
	//    3    7:dup             
	//    4    8:invokespecial   #50  <Method void SparseIntArray()>
	//    5   11:putstatic       #52  <Field SparseIntArray sViewsWithIds>
		sViewsWithIds.put(0x7f0e00af, 6);
	//    6   14:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//    7   17:ldc1            #53  <Int 0x7f0e00af>
	//    8   19:bipush          6
	//    9   21:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00f8, 7);
	//   10   24:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   11   27:ldc1            #58  <Int 0x7f0e00f8>
	//   12   29:bipush          7
	//   13   31:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00f9, 8);
	//   14   34:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   15   37:ldc1            #59  <Int 0x7f0e00f9>
	//   16   39:bipush          8
	//   17   41:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00fb, 9);
	//   18   44:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   19   47:ldc1            #60  <Int 0x7f0e00fb>
	//   20   49:bipush          9
	//   21   51:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00fd, 10);
	//   22   54:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   23   57:ldc1            #61  <Int 0x7f0e00fd>
	//   24   59:bipush          10
	//   25   61:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00ff, 11);
	//   26   64:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   27   67:ldc1            #62  <Int 0x7f0e00ff>
	//   28   69:bipush          11
	//   29   71:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00e2, 12);
	//   30   74:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   31   77:ldc1            #63  <Int 0x7f0e00e2>
	//   32   79:bipush          12
	//   33   81:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e0100, 13);
	//   34   84:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   35   87:ldc1            #64  <Int 0x7f0e0100>
	//   36   89:bipush          13
	//   37   91:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e0101, 14);
	//   38   94:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   39   97:ldc1            #65  <Int 0x7f0e0101>
	//   40   99:bipush          14
	//   41  101:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e0102, 15);
	//   42  104:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   43  107:ldc1            #66  <Int 0x7f0e0102>
	//   44  109:bipush          15
	//   45  111:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e0103, 16);
	//   46  114:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   47  117:ldc1            #67  <Int 0x7f0e0103>
	//   48  119:bipush          16
	//   49  121:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e0105, 17);
	//   50  124:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   51  127:ldc1            #68  <Int 0x7f0e0105>
	//   52  129:bipush          17
	//   53  131:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e0106, 18);
	//   54  134:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   55  137:ldc1            #69  <Int 0x7f0e0106>
	//   56  139:bipush          18
	//   57  141:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e0107, 19);
	//   58  144:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   59  147:ldc1            #70  <Int 0x7f0e0107>
	//   60  149:bipush          19
	//   61  151:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e0108, 20);
	//   62  154:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   63  157:ldc1            #71  <Int 0x7f0e0108>
	//   64  159:bipush          20
	//   65  161:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e0109, 21);
	//   66  164:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   67  167:ldc1            #72  <Int 0x7f0e0109>
	//   68  169:bipush          21
	//   69  171:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e010a, 22);
	//   70  174:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   71  177:ldc1            #73  <Int 0x7f0e010a>
	//   72  179:bipush          22
	//   73  181:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e010b, 23);
	//   74  184:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   75  187:ldc1            #74  <Int 0x7f0e010b>
	//   76  189:bipush          23
	//   77  191:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e010c, 24);
	//   78  194:getstatic       #52  <Field SparseIntArray sViewsWithIds>
	//   79  197:ldc1            #75  <Int 0x7f0e010c>
	//   80  199:bipush          24
	//   81  201:invokevirtual   #57  <Method void SparseIntArray.put(int, int)>
	//*  82  204:return          
	}
}
