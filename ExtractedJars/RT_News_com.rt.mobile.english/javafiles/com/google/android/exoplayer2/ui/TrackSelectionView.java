// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			DefaultTrackNameProvider, TrackNameProvider

public class TrackSelectionView extends LinearLayout
{
	private class ComponentListener
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			TrackSelectionView.this.onClick(view);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field TrackSelectionView this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #28  <Method void TrackSelectionView.access$200(TrackSelectionView, View)>
		//    4    8:return          
		}

		final TrackSelectionView this$0;

		private ComponentListener()
		{
			this$0 = TrackSelectionView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field TrackSelectionView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public TrackSelectionView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #38  <Method void TrackSelectionView(Context, AttributeSet)>
	//    4    6:return          
	}

	public TrackSelectionView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #42  <Method void TrackSelectionView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TrackSelectionView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #45  <Method void LinearLayout(Context, AttributeSet, int)>
		attributeset = ((AttributeSet) (context.getTheme().obtainStyledAttributes(new int[] {
			0x101030e
		})));
	//    5    7:aload_1         
	//    6    8:invokevirtual   #51  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    7   11:iconst_1        
	//    8   12:newarray        int[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #52  <Int 0x101030e>
	//   12   18:iastore         
	//   13   19:invokevirtual   #58  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(int[])>
	//   14   22:astore_2        
		selectableItemBackgroundResourceId = ((TypedArray) (attributeset)).getResourceId(0, 0);
	//   15   23:aload_0         
	//   16   24:aload_2         
	//   17   25:iconst_0        
	//   18   26:iconst_0        
	//   19   27:invokevirtual   #64  <Method int TypedArray.getResourceId(int, int)>
	//   20   30:putfield        #66  <Field int selectableItemBackgroundResourceId>
		((TypedArray) (attributeset)).recycle();
	//   21   33:aload_2         
	//   22   34:invokevirtual   #70  <Method void TypedArray.recycle()>
		inflater = LayoutInflater.from(context);
	//   23   37:aload_0         
	//   24   38:aload_1         
	//   25   39:invokestatic    #76  <Method LayoutInflater LayoutInflater.from(Context)>
	//   26   42:putfield        #78  <Field LayoutInflater inflater>
		componentListener = new ComponentListener();
	//   27   45:aload_0         
	//   28   46:new             #8   <Class TrackSelectionView$ComponentListener>
	//   29   49:dup             
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:invokespecial   #81  <Method void TrackSelectionView$ComponentListener(TrackSelectionView, TrackSelectionView$1)>
	//   33   55:putfield        #83  <Field TrackSelectionView$ComponentListener componentListener>
		trackNameProvider = ((TrackNameProvider) (new DefaultTrackNameProvider(getResources())));
	//   34   58:aload_0         
	//   35   59:new             #85  <Class DefaultTrackNameProvider>
	//   36   62:dup             
	//   37   63:aload_0         
	//   38   64:invokevirtual   #89  <Method android.content.res.Resources getResources()>
	//   39   67:invokespecial   #92  <Method void DefaultTrackNameProvider(android.content.res.Resources)>
	//   40   70:putfield        #94  <Field TrackNameProvider trackNameProvider>
		disableView = (CheckedTextView)inflater.inflate(0x109000f, ((android.view.ViewGroup) (this)), false);
	//   41   73:aload_0         
	//   42   74:aload_0         
	//   43   75:getfield        #78  <Field LayoutInflater inflater>
	//   44   78:ldc1            #95  <Int 0x109000f>
	//   45   80:aload_0         
	//   46   81:iconst_0        
	//   47   82:invokevirtual   #99  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   48   85:checkcast       #101 <Class CheckedTextView>
	//   49   88:putfield        #103 <Field CheckedTextView disableView>
		disableView.setBackgroundResource(selectableItemBackgroundResourceId);
	//   50   91:aload_0         
	//   51   92:getfield        #103 <Field CheckedTextView disableView>
	//   52   95:aload_0         
	//   53   96:getfield        #66  <Field int selectableItemBackgroundResourceId>
	//   54   99:invokevirtual   #107 <Method void CheckedTextView.setBackgroundResource(int)>
		disableView.setText(R.string.exo_track_selection_none);
	//   55  102:aload_0         
	//   56  103:getfield        #103 <Field CheckedTextView disableView>
	//   57  106:getstatic       #112 <Field int R$string.exo_track_selection_none>
	//   58  109:invokevirtual   #115 <Method void CheckedTextView.setText(int)>
		disableView.setEnabled(false);
	//   59  112:aload_0         
	//   60  113:getfield        #103 <Field CheckedTextView disableView>
	//   61  116:iconst_0        
	//   62  117:invokevirtual   #119 <Method void CheckedTextView.setEnabled(boolean)>
		disableView.setFocusable(true);
	//   63  120:aload_0         
	//   64  121:getfield        #103 <Field CheckedTextView disableView>
	//   65  124:iconst_1        
	//   66  125:invokevirtual   #122 <Method void CheckedTextView.setFocusable(boolean)>
		disableView.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//   67  128:aload_0         
	//   68  129:getfield        #103 <Field CheckedTextView disableView>
	//   69  132:aload_0         
	//   70  133:getfield        #83  <Field TrackSelectionView$ComponentListener componentListener>
	//   71  136:invokevirtual   #126 <Method void CheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
		disableView.setVisibility(8);
	//   72  139:aload_0         
	//   73  140:getfield        #103 <Field CheckedTextView disableView>
	//   74  143:bipush          8
	//   75  145:invokevirtual   #129 <Method void CheckedTextView.setVisibility(int)>
		addView(((View) (disableView)));
	//   76  148:aload_0         
	//   77  149:aload_0         
	//   78  150:getfield        #103 <Field CheckedTextView disableView>
	//   79  153:invokevirtual   #133 <Method void addView(View)>
		addView(inflater.inflate(R.layout.exo_list_divider, ((android.view.ViewGroup) (this)), false));
	//   80  156:aload_0         
	//   81  157:aload_0         
	//   82  158:getfield        #78  <Field LayoutInflater inflater>
	//   83  161:getstatic       #138 <Field int R$layout.exo_list_divider>
	//   84  164:aload_0         
	//   85  165:iconst_0        
	//   86  166:invokevirtual   #99  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   87  169:invokevirtual   #133 <Method void addView(View)>
		defaultView = (CheckedTextView)inflater.inflate(0x109000f, ((android.view.ViewGroup) (this)), false);
	//   88  172:aload_0         
	//   89  173:aload_0         
	//   90  174:getfield        #78  <Field LayoutInflater inflater>
	//   91  177:ldc1            #95  <Int 0x109000f>
	//   92  179:aload_0         
	//   93  180:iconst_0        
	//   94  181:invokevirtual   #99  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   95  184:checkcast       #101 <Class CheckedTextView>
	//   96  187:putfield        #140 <Field CheckedTextView defaultView>
		defaultView.setBackgroundResource(selectableItemBackgroundResourceId);
	//   97  190:aload_0         
	//   98  191:getfield        #140 <Field CheckedTextView defaultView>
	//   99  194:aload_0         
	//  100  195:getfield        #66  <Field int selectableItemBackgroundResourceId>
	//  101  198:invokevirtual   #107 <Method void CheckedTextView.setBackgroundResource(int)>
		defaultView.setText(R.string.exo_track_selection_auto);
	//  102  201:aload_0         
	//  103  202:getfield        #140 <Field CheckedTextView defaultView>
	//  104  205:getstatic       #143 <Field int R$string.exo_track_selection_auto>
	//  105  208:invokevirtual   #115 <Method void CheckedTextView.setText(int)>
		defaultView.setEnabled(false);
	//  106  211:aload_0         
	//  107  212:getfield        #140 <Field CheckedTextView defaultView>
	//  108  215:iconst_0        
	//  109  216:invokevirtual   #119 <Method void CheckedTextView.setEnabled(boolean)>
		defaultView.setFocusable(true);
	//  110  219:aload_0         
	//  111  220:getfield        #140 <Field CheckedTextView defaultView>
	//  112  223:iconst_1        
	//  113  224:invokevirtual   #122 <Method void CheckedTextView.setFocusable(boolean)>
		defaultView.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  114  227:aload_0         
	//  115  228:getfield        #140 <Field CheckedTextView defaultView>
	//  116  231:aload_0         
	//  117  232:getfield        #83  <Field TrackSelectionView$ComponentListener componentListener>
	//  118  235:invokevirtual   #126 <Method void CheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
		addView(((View) (defaultView)));
	//  119  238:aload_0         
	//  120  239:aload_0         
	//  121  240:getfield        #140 <Field CheckedTextView defaultView>
	//  122  243:invokevirtual   #133 <Method void addView(View)>
	//  123  246:return          
	}

	private void applySelection()
	{
		com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder parametersbuilder = trackSelector.buildUponParameters();
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field DefaultTrackSelector trackSelector>
	//    2    4:invokevirtual   #161 <Method com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder DefaultTrackSelector.buildUponParameters()>
	//    3    7:astore_1        
		parametersbuilder.setRendererDisabled(rendererIndex, isDisabled);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #163 <Field int rendererIndex>
	//    7   13:aload_0         
	//    8   14:getfield        #165 <Field boolean isDisabled>
	//    9   17:invokevirtual   #171 <Method com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder.setRendererDisabled(int, boolean)>
	//   10   20:pop             
		if(override != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//*  13   25:ifnull          48
			parametersbuilder.setSelectionOverride(rendererIndex, trackGroups, override);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #163 <Field int rendererIndex>
	//   17   33:aload_0         
	//   18   34:getfield        #175 <Field TrackGroupArray trackGroups>
	//   19   37:aload_0         
	//   20   38:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//   21   41:invokevirtual   #179 <Method com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder.setSelectionOverride(int, TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride)>
	//   22   44:pop             
		else
	//*  23   45:goto            57
			parametersbuilder.clearSelectionOverrides(rendererIndex);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #163 <Field int rendererIndex>
	//   27   53:invokevirtual   #183 <Method com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder.clearSelectionOverrides(int)>
	//   28   56:pop             
		trackSelector.setParameters(parametersbuilder);
	//   29   57:aload_0         
	//   30   58:getfield        #155 <Field DefaultTrackSelector trackSelector>
	//   31   61:aload_1         
	//   32   62:invokevirtual   #187 <Method void DefaultTrackSelector.setParameters(com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder)>
	//   33   65:return          
	}

	public static Pair getDialog(Activity activity, CharSequence charsequence, DefaultTrackSelector defaulttrackselector, int i)
	{
		activity = ((Activity) (new android.app.AlertDialog.Builder(((Context) (activity)))));
	//    0    0:new             #191 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #193 <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:astore_0        
		View view = LayoutInflater.from(((android.app.AlertDialog.Builder) (activity)).getContext()).inflate(R.layout.exo_track_selection_dialog, ((android.view.ViewGroup) (null)));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #197 <Method Context android.app.AlertDialog$Builder.getContext()>
	//    7   13:invokestatic    #76  <Method LayoutInflater LayoutInflater.from(Context)>
	//    8   16:getstatic       #200 <Field int R$layout.exo_track_selection_dialog>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #203 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   11   23:astore          4
		TrackSelectionView trackselectionview = (TrackSelectionView)view.findViewById(R.id.exo_track_selection_view);
	//   12   25:aload           4
	//   13   27:getstatic       #208 <Field int R$id.exo_track_selection_view>
	//   14   30:invokevirtual   #214 <Method View View.findViewById(int)>
	//   15   33:checkcast       #2   <Class TrackSelectionView>
	//   16   36:astore          5
		trackselectionview.init(defaulttrackselector, i);
	//   17   38:aload           5
	//   18   40:aload_2         
	//   19   41:iload_3         
	//   20   42:invokevirtual   #218 <Method void init(DefaultTrackSelector, int)>
		defaulttrackselector = ((DefaultTrackSelector) (new android.content.DialogInterface.OnClickListener(trackselectionview) {

			public void onClick(DialogInterface dialoginterface, int j)
			{
				selectionView.applySelection();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field TrackSelectionView val$selectionView>
			//    2    4:invokestatic    #26  <Method void TrackSelectionView.access$000(TrackSelectionView)>
			//    3    7:return          
			}

			final TrackSelectionView val$selectionView;

			
			{
				selectionView = trackselectionview;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TrackSelectionView val$selectionView>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//   21   45:new             #6   <Class TrackSelectionView$1>
	//   22   48:dup             
	//   23   49:aload           5
	//   24   51:invokespecial   #220 <Method void TrackSelectionView$1(TrackSelectionView)>
	//   25   54:astore_2        
		return Pair.create(((Object) (((android.app.AlertDialog.Builder) (activity)).setTitle(charsequence).setView(view).setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (defaulttrackselector))).setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (null))).create())), ((Object) (trackselectionview)));
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:invokevirtual   #224 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   29   60:aload           4
	//   30   62:invokevirtual   #228 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
	//   31   65:ldc1            #229 <Int 0x104000a>
	//   32   67:aload_2         
	//   33   68:invokevirtual   #233 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   34   71:ldc1            #234 <Int 0x1040000>
	//   35   73:aconst_null     
	//   36   74:invokevirtual   #237 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   37   77:invokevirtual   #241 <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   38   80:aload           5
	//   39   82:invokestatic    #246 <Method Pair Pair.create(Object, Object)>
	//   40   85:areturn         
	}

	private static int[] getTracksAdding(int ai[], int i)
	{
		ai = Arrays.copyOf(ai, ai.length + 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:arraylength     
	//    3    3:iconst_1        
	//    4    4:iadd            
	//    5    5:invokestatic    #255 <Method int[] Arrays.copyOf(int[], int)>
	//    6    8:astore_0        
		ai[ai.length - 1] = i;
	//    7    9:aload_0         
	//    8   10:aload_0         
	//    9   11:arraylength     
	//   10   12:iconst_1        
	//   11   13:isub            
	//   12   14:iload_1         
	//   13   15:iastore         
		return ai;
	//   14   16:aload_0         
	//   15   17:areturn         
	}

	private static int[] getTracksRemoving(int ai[], int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int ai1[] = new int[ai.length - 1];
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:iconst_1        
	//    5    5:isub            
	//    6    6:newarray        int[]
	//    7    8:astore          7
		int i1 = ai.length;
	//    8   10:aload_0         
	//    9   11:arraylength     
	//   10   12:istore          5
		int l;
		for(int k = 0; j < i1; k = l)
	//*  11   14:iconst_0        
	//*  12   15:istore_3        
	//*  13   16:iload_2         
	//*  14   17:iload           5
	//*  15   19:icmpge          57
		{
			int j1 = ai[j];
	//   16   22:aload_0         
	//   17   23:iload_2         
	//   18   24:iaload          
	//   19   25:istore          6
			l = k;
	//   20   27:iload_3         
	//   21   28:istore          4
			if(j1 != i)
	//*  22   30:iload           6
	//*  23   32:iload_1         
	//*  24   33:icmpeq          47
			{
				ai1[k] = j1;
	//   25   36:aload           7
	//   26   38:iload_3         
	//   27   39:iload           6
	//   28   41:iastore         
				l = k + 1;
	//   29   42:iload_3         
	//   30   43:iconst_1        
	//   31   44:iadd            
	//   32   45:istore          4
			}
			j++;
	//   33   47:iload_2         
	//   34   48:iconst_1        
	//   35   49:iadd            
	//   36   50:istore_2        
		}

	//   37   51:iload           4
	//   38   53:istore_3        
	//*  39   54:goto            16
		return ai1;
	//   40   57:aload           7
	//   41   59:areturn         
	}

	private void onClick(View view)
	{
		if(view == disableView)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #103 <Field CheckedTextView disableView>
	//*   3    5:if_acmpne       15
			onDisableViewClicked();
	//    4    8:aload_0         
	//    5    9:invokespecial   #259 <Method void onDisableViewClicked()>
		else
	//*   6   12:goto            35
		if(view == defaultView)
	//*   7   15:aload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #140 <Field CheckedTextView defaultView>
	//*  10   20:if_acmpne       30
			onDefaultViewClicked();
	//   11   23:aload_0         
	//   12   24:invokespecial   #262 <Method void onDefaultViewClicked()>
		else
	//*  13   27:goto            35
			onTrackViewClicked(view);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #265 <Method void onTrackViewClicked(View)>
		updateViewStates();
	//   17   35:aload_0         
	//   18   36:invokespecial   #268 <Method void updateViewStates()>
	//   19   39:return          
	}

	private void onDefaultViewClicked()
	{
		isDisabled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #165 <Field boolean isDisabled>
		override = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//    6   10:return          
	}

	private void onDisableViewClicked()
	{
		isDisabled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #165 <Field boolean isDisabled>
		override = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//    6   10:return          
	}

	private void onTrackViewClicked(View view)
	{
		isDisabled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #165 <Field boolean isDisabled>
		Pair pair = (Pair)view.getTag();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #272 <Method Object View.getTag()>
	//    5    9:checkcast       #243 <Class Pair>
	//    6   12:astore          5
		int i = ((Integer)pair.first).intValue();
	//    7   14:aload           5
	//    8   16:getfield        #276 <Field Object Pair.first>
	//    9   19:checkcast       #278 <Class Integer>
	//   10   22:invokevirtual   #282 <Method int Integer.intValue()>
	//   11   25:istore_2        
		int j = ((Integer)pair.second).intValue();
	//   12   26:aload           5
	//   13   28:getfield        #285 <Field Object Pair.second>
	//   14   31:checkcast       #278 <Class Integer>
	//   15   34:invokevirtual   #282 <Method int Integer.intValue()>
	//   16   37:istore_3        
		if(override != null && override.groupIndex == i && allowAdaptiveSelections)
	//*  17   38:aload_0         
	//*  18   39:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//*  19   42:ifnull          149
	//*  20   45:aload_0         
	//*  21   46:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//*  22   49:getfield        #290 <Field int com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride.groupIndex>
	//*  23   52:iload_2         
	//*  24   53:icmpne          149
	//*  25   56:aload_0         
	//*  26   57:getfield        #292 <Field boolean allowAdaptiveSelections>
	//*  27   60:ifne            66
	//*  28   63:goto            149
		{
			int k = override.length;
	//   29   66:aload_0         
	//   30   67:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//   31   70:getfield        #295 <Field int com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride.length>
	//   32   73:istore          4
			int ai[] = override.tracks;
	//   33   75:aload_0         
	//   34   76:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//   35   79:getfield        #299 <Field int[] com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride.tracks>
	//   36   82:astore          5
			if(((CheckedTextView)view).isChecked())
	//*  37   84:aload_1         
	//*  38   85:checkcast       #101 <Class CheckedTextView>
	//*  39   88:invokevirtual   #303 <Method boolean CheckedTextView.isChecked()>
	//*  40   91:ifeq            130
			{
				if(k == 1)
	//*  41   94:iload           4
	//*  42   96:iconst_1        
	//*  43   97:icmpne          111
				{
					override = null;
	//   44  100:aload_0         
	//   45  101:aconst_null     
	//   46  102:putfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
					isDisabled = true;
	//   47  105:aload_0         
	//   48  106:iconst_1        
	//   49  107:putfield        #165 <Field boolean isDisabled>
					return;
	//   50  110:return          
				} else
				{
					override = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride(i, getTracksRemoving(ai, j));
	//   51  111:aload_0         
	//   52  112:new             #287 <Class com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>
	//   53  115:dup             
	//   54  116:iload_2         
	//   55  117:aload           5
	//   56  119:iload_3         
	//   57  120:invokestatic    #305 <Method int[] getTracksRemoving(int[], int)>
	//   58  123:invokespecial   #308 <Method void com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride(int, int[])>
	//   59  126:putfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
					return;
	//   60  129:return          
				}
			} else
			{
				override = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride(i, getTracksAdding(ai, j));
	//   61  130:aload_0         
	//   62  131:new             #287 <Class com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>
	//   63  134:dup             
	//   64  135:iload_2         
	//   65  136:aload           5
	//   66  138:iload_3         
	//   67  139:invokestatic    #310 <Method int[] getTracksAdding(int[], int)>
	//   68  142:invokespecial   #308 <Method void com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride(int, int[])>
	//   69  145:putfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
				return;
	//   70  148:return          
			}
		} else
		{
			override = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride(i, new int[] {
				j
			});
	//   71  149:aload_0         
	//   72  150:new             #287 <Class com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>
	//   73  153:dup             
	//   74  154:iload_2         
	//   75  155:iconst_1        
	//   76  156:newarray        int[]
	//   77  158:dup             
	//   78  159:iconst_0        
	//   79  160:iload_3         
	//   80  161:iastore         
	//   81  162:invokespecial   #308 <Method void com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride(int, int[])>
	//   82  165:putfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
			return;
	//   83  168:return          
		}
	}

	private void updateViewStates()
	{
		disableView.setChecked(isDisabled);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field CheckedTextView disableView>
	//    2    4:aload_0         
	//    3    5:getfield        #165 <Field boolean isDisabled>
	//    4    8:invokevirtual   #313 <Method void CheckedTextView.setChecked(boolean)>
		CheckedTextView checkedtextview = defaultView;
	//    5   11:aload_0         
	//    6   12:getfield        #140 <Field CheckedTextView defaultView>
	//    7   15:astore          4
		boolean flag;
		if(!isDisabled && override == null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #165 <Field boolean isDisabled>
	//*  10   21:ifne            36
	//*  11   24:aload_0         
	//*  12   25:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//*  13   28:ifnonnull       36
			flag = true;
	//   14   31:iconst_1        
	//   15   32:istore_3        
		else
	//*  16   33:goto            38
			flag = false;
	//   17   36:iconst_0        
	//   18   37:istore_3        
		checkedtextview.setChecked(flag);
	//   19   38:aload           4
	//   20   40:iload_3         
	//   21   41:invokevirtual   #313 <Method void CheckedTextView.setChecked(boolean)>
		for(int i = 0; i < trackViews.length; i++)
	//*  22   44:iconst_0        
	//*  23   45:istore_1        
	//*  24   46:iload_1         
	//*  25   47:aload_0         
	//*  26   48:getfield        #315 <Field CheckedTextView[][] trackViews>
	//*  27   51:arraylength     
	//*  28   52:icmpge          134
		{
			for(int j = 0; j < trackViews[i].length; j++)
	//*  29   55:iconst_0        
	//*  30   56:istore_2        
	//*  31   57:iload_2         
	//*  32   58:aload_0         
	//*  33   59:getfield        #315 <Field CheckedTextView[][] trackViews>
	//*  34   62:iload_1         
	//*  35   63:aaload          
	//*  36   64:arraylength     
	//*  37   65:icmpge          127
			{
				CheckedTextView checkedtextview1 = trackViews[i][j];
	//   38   68:aload_0         
	//   39   69:getfield        #315 <Field CheckedTextView[][] trackViews>
	//   40   72:iload_1         
	//   41   73:aaload          
	//   42   74:iload_2         
	//   43   75:aaload          
	//   44   76:astore          4
				boolean flag1;
				if(override != null && override.groupIndex == i && override.containsTrack(j))
	//*  45   78:aload_0         
	//*  46   79:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//*  47   82:ifnull          112
	//*  48   85:aload_0         
	//*  49   86:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//*  50   89:getfield        #290 <Field int com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride.groupIndex>
	//*  51   92:iload_1         
	//*  52   93:icmpne          112
	//*  53   96:aload_0         
	//*  54   97:getfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
	//*  55  100:iload_2         
	//*  56  101:invokevirtual   #319 <Method boolean com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride.containsTrack(int)>
	//*  57  104:ifeq            112
					flag1 = true;
	//   58  107:iconst_1        
	//   59  108:istore_3        
				else
	//*  60  109:goto            114
					flag1 = false;
	//   61  112:iconst_0        
	//   62  113:istore_3        
				checkedtextview1.setChecked(flag1);
	//   63  114:aload           4
	//   64  116:iload_3         
	//   65  117:invokevirtual   #313 <Method void CheckedTextView.setChecked(boolean)>
			}

	//   66  120:iload_2         
	//   67  121:iconst_1        
	//   68  122:iadd            
	//   69  123:istore_2        
		}

	//   70  124:goto            57
	//   71  127:iload_1         
	//   72  128:iconst_1        
	//   73  129:iadd            
	//   74  130:istore_1        
	//*  75  131:goto            46
	//   76  134:return          
	}

	private void updateViews()
	{
		for(int i = getChildCount() - 1; i >= 3; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #323 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iconst_3        
	//*   7    9:icmplt          24
			removeViewAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #326 <Method void removeViewAt(int)>

	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:isub            
	//   14   20:istore_1        
	//*  15   21:goto            7
		com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedtrackinfo;
		if(trackSelector == null)
	//*  16   24:aload_0         
	//*  17   25:getfield        #155 <Field DefaultTrackSelector trackSelector>
	//*  18   28:ifnonnull       37
			mappedtrackinfo = null;
	//   19   31:aconst_null     
	//   20   32:astore          5
		else
	//*  21   34:goto            46
			mappedtrackinfo = trackSelector.getCurrentMappedTrackInfo();
	//   22   37:aload_0         
	//   23   38:getfield        #155 <Field DefaultTrackSelector trackSelector>
	//   24   41:invokevirtual   #330 <Method com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo DefaultTrackSelector.getCurrentMappedTrackInfo()>
	//   25   44:astore          5
		if(trackSelector != null && mappedtrackinfo != null)
	//*  26   46:aload_0         
	//*  27   47:getfield        #155 <Field DefaultTrackSelector trackSelector>
	//*  28   50:ifnull          411
	//*  29   53:aload           5
	//*  30   55:ifnonnull       61
	//*  31   58:goto            411
		{
			disableView.setEnabled(true);
	//   32   61:aload_0         
	//   33   62:getfield        #103 <Field CheckedTextView disableView>
	//   34   65:iconst_1        
	//   35   66:invokevirtual   #119 <Method void CheckedTextView.setEnabled(boolean)>
			defaultView.setEnabled(true);
	//   36   69:aload_0         
	//   37   70:getfield        #140 <Field CheckedTextView defaultView>
	//   38   73:iconst_1        
	//   39   74:invokevirtual   #119 <Method void CheckedTextView.setEnabled(boolean)>
			trackGroups = mappedtrackinfo.getTrackGroups(rendererIndex);
	//   40   77:aload_0         
	//   41   78:aload           5
	//   42   80:aload_0         
	//   43   81:getfield        #163 <Field int rendererIndex>
	//   44   84:invokevirtual   #336 <Method TrackGroupArray com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo.getTrackGroups(int)>
	//   45   87:putfield        #175 <Field TrackGroupArray trackGroups>
			com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters = trackSelector.getParameters();
	//   46   90:aload_0         
	//   47   91:getfield        #155 <Field DefaultTrackSelector trackSelector>
	//   48   94:invokevirtual   #340 <Method com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters DefaultTrackSelector.getParameters()>
	//   49   97:astore          6
			isDisabled = parameters.getRendererDisabled(rendererIndex);
	//   50   99:aload_0         
	//   51  100:aload           6
	//   52  102:aload_0         
	//   53  103:getfield        #163 <Field int rendererIndex>
	//   54  106:invokevirtual   #345 <Method boolean com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters.getRendererDisabled(int)>
	//   55  109:putfield        #165 <Field boolean isDisabled>
			override = parameters.getSelectionOverride(rendererIndex, trackGroups);
	//   56  112:aload_0         
	//   57  113:aload           6
	//   58  115:aload_0         
	//   59  116:getfield        #163 <Field int rendererIndex>
	//   60  119:aload_0         
	//   61  120:getfield        #175 <Field TrackGroupArray trackGroups>
	//   62  123:invokevirtual   #349 <Method com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters.getSelectionOverride(int, TrackGroupArray)>
	//   63  126:putfield        #173 <Field com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride override>
			trackViews = new CheckedTextView[trackGroups.length][];
	//   64  129:aload_0         
	//   65  130:aload_0         
	//   66  131:getfield        #175 <Field TrackGroupArray trackGroups>
	//   67  134:getfield        #352 <Field int TrackGroupArray.length>
	//   68  137:anewarray       CheckedTextView[][]
	//   69  140:putfield        #315 <Field CheckedTextView[][] trackViews>
			for(int j = 0; j < trackGroups.length; j++)
	//*  70  143:iconst_0        
	//*  71  144:istore_1        
	//*  72  145:iload_1         
	//*  73  146:aload_0         
	//*  74  147:getfield        #175 <Field TrackGroupArray trackGroups>
	//*  75  150:getfield        #352 <Field int TrackGroupArray.length>
	//*  76  153:icmpge          406
			{
				TrackGroup trackgroup = trackGroups.get(j);
	//   77  156:aload_0         
	//   78  157:getfield        #175 <Field TrackGroupArray trackGroups>
	//   79  160:iload_1         
	//   80  161:invokevirtual   #358 <Method TrackGroup TrackGroupArray.get(int)>
	//   81  164:astore          6
				boolean flag;
				if(allowAdaptiveSelections && trackGroups.get(j).length > 1 && mappedtrackinfo.getAdaptiveSupport(rendererIndex, j, false) != 0)
	//*  82  166:aload_0         
	//*  83  167:getfield        #292 <Field boolean allowAdaptiveSelections>
	//*  84  170:ifeq            207
	//*  85  173:aload_0         
	//*  86  174:getfield        #175 <Field TrackGroupArray trackGroups>
	//*  87  177:iload_1         
	//*  88  178:invokevirtual   #358 <Method TrackGroup TrackGroupArray.get(int)>
	//*  89  181:getfield        #361 <Field int TrackGroup.length>
	//*  90  184:iconst_1        
	//*  91  185:icmple          207
	//*  92  188:aload           5
	//*  93  190:aload_0         
	//*  94  191:getfield        #163 <Field int rendererIndex>
	//*  95  194:iload_1         
	//*  96  195:iconst_0        
	//*  97  196:invokevirtual   #365 <Method int com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo.getAdaptiveSupport(int, int, boolean)>
	//*  98  199:ifeq            207
					flag = true;
	//   99  202:iconst_1        
	//  100  203:istore_2        
				else
	//* 101  204:goto            209
					flag = false;
	//  102  207:iconst_0        
	//  103  208:istore_2        
				trackViews[j] = new CheckedTextView[trackgroup.length];
	//  104  209:aload_0         
	//  105  210:getfield        #315 <Field CheckedTextView[][] trackViews>
	//  106  213:iload_1         
	//  107  214:aload           6
	//  108  216:getfield        #361 <Field int TrackGroup.length>
	//  109  219:anewarray       CheckedTextView[]
	//  110  222:aastore         
				for(int k = 0; k < trackgroup.length; k++)
	//* 111  223:iconst_0        
	//* 112  224:istore_3        
	//* 113  225:iload_3         
	//* 114  226:aload           6
	//* 115  228:getfield        #361 <Field int TrackGroup.length>
	//* 116  231:icmpge          399
				{
					if(k == 0)
	//* 117  234:iload_3         
	//* 118  235:ifne            254
						addView(inflater.inflate(R.layout.exo_list_divider, ((android.view.ViewGroup) (this)), false));
	//  119  238:aload_0         
	//  120  239:aload_0         
	//  121  240:getfield        #78  <Field LayoutInflater inflater>
	//  122  243:getstatic       #138 <Field int R$layout.exo_list_divider>
	//  123  246:aload_0         
	//  124  247:iconst_0        
	//  125  248:invokevirtual   #99  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//  126  251:invokevirtual   #133 <Method void addView(View)>
					int l;
					if(flag)
	//* 127  254:iload_2         
	//* 128  255:ifeq            266
						l = 0x1090010;
	//  129  258:ldc2            #366 <Int 0x1090010>
	//  130  261:istore          4
					else
	//* 131  263:goto            270
						l = 0x109000f;
	//  132  266:ldc1            #95  <Int 0x109000f>
	//  133  268:istore          4
					CheckedTextView checkedtextview = (CheckedTextView)inflater.inflate(l, ((android.view.ViewGroup) (this)), false);
	//  134  270:aload_0         
	//  135  271:getfield        #78  <Field LayoutInflater inflater>
	//  136  274:iload           4
	//  137  276:aload_0         
	//  138  277:iconst_0        
	//  139  278:invokevirtual   #99  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//  140  281:checkcast       #101 <Class CheckedTextView>
	//  141  284:astore          7
					checkedtextview.setBackgroundResource(selectableItemBackgroundResourceId);
	//  142  286:aload           7
	//  143  288:aload_0         
	//  144  289:getfield        #66  <Field int selectableItemBackgroundResourceId>
	//  145  292:invokevirtual   #107 <Method void CheckedTextView.setBackgroundResource(int)>
					checkedtextview.setText(((CharSequence) (trackNameProvider.getTrackName(trackgroup.getFormat(k)))));
	//  146  295:aload           7
	//  147  297:aload_0         
	//  148  298:getfield        #94  <Field TrackNameProvider trackNameProvider>
	//  149  301:aload           6
	//  150  303:iload_3         
	//  151  304:invokevirtual   #370 <Method com.google.android.exoplayer2.Format TrackGroup.getFormat(int)>
	//  152  307:invokeinterface #376 <Method String TrackNameProvider.getTrackName(com.google.android.exoplayer2.Format)>
	//  153  312:invokevirtual   #379 <Method void CheckedTextView.setText(CharSequence)>
					if(mappedtrackinfo.getTrackSupport(rendererIndex, j, k) == 4)
	//* 154  315:aload           5
	//* 155  317:aload_0         
	//* 156  318:getfield        #163 <Field int rendererIndex>
	//* 157  321:iload_1         
	//* 158  322:iload_3         
	//* 159  323:invokevirtual   #383 <Method int com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo.getTrackSupport(int, int, int)>
	//* 160  326:iconst_4        
	//* 161  327:icmpne          364
					{
						checkedtextview.setFocusable(true);
	//  162  330:aload           7
	//  163  332:iconst_1        
	//  164  333:invokevirtual   #122 <Method void CheckedTextView.setFocusable(boolean)>
						checkedtextview.setTag(((Object) (Pair.create(((Object) (Integer.valueOf(j))), ((Object) (Integer.valueOf(k)))))));
	//  165  336:aload           7
	//  166  338:iload_1         
	//  167  339:invokestatic    #387 <Method Integer Integer.valueOf(int)>
	//  168  342:iload_3         
	//  169  343:invokestatic    #387 <Method Integer Integer.valueOf(int)>
	//  170  346:invokestatic    #246 <Method Pair Pair.create(Object, Object)>
	//  171  349:invokevirtual   #391 <Method void CheckedTextView.setTag(Object)>
						checkedtextview.setOnClickListener(((android.view.View.OnClickListener) (componentListener)));
	//  172  352:aload           7
	//  173  354:aload_0         
	//  174  355:getfield        #83  <Field TrackSelectionView$ComponentListener componentListener>
	//  175  358:invokevirtual   #126 <Method void CheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
					} else
	//* 176  361:goto            376
					{
						checkedtextview.setFocusable(false);
	//  177  364:aload           7
	//  178  366:iconst_0        
	//  179  367:invokevirtual   #122 <Method void CheckedTextView.setFocusable(boolean)>
						checkedtextview.setEnabled(false);
	//  180  370:aload           7
	//  181  372:iconst_0        
	//  182  373:invokevirtual   #119 <Method void CheckedTextView.setEnabled(boolean)>
					}
					trackViews[j][k] = checkedtextview;
	//  183  376:aload_0         
	//  184  377:getfield        #315 <Field CheckedTextView[][] trackViews>
	//  185  380:iload_1         
	//  186  381:aaload          
	//  187  382:iload_3         
	//  188  383:aload           7
	//  189  385:aastore         
					addView(((View) (checkedtextview)));
	//  190  386:aload_0         
	//  191  387:aload           7
	//  192  389:invokevirtual   #133 <Method void addView(View)>
				}

	//  193  392:iload_3         
	//  194  393:iconst_1        
	//  195  394:iadd            
	//  196  395:istore_3        
			}

	//  197  396:goto            225
	//  198  399:iload_1         
	//  199  400:iconst_1        
	//  200  401:iadd            
	//  201  402:istore_1        
	//* 202  403:goto            145
			updateViewStates();
	//  203  406:aload_0         
	//  204  407:invokespecial   #268 <Method void updateViewStates()>
			return;
	//  205  410:return          
		} else
		{
			disableView.setEnabled(false);
	//  206  411:aload_0         
	//  207  412:getfield        #103 <Field CheckedTextView disableView>
	//  208  415:iconst_0        
	//  209  416:invokevirtual   #119 <Method void CheckedTextView.setEnabled(boolean)>
			defaultView.setEnabled(false);
	//  210  419:aload_0         
	//  211  420:getfield        #140 <Field CheckedTextView defaultView>
	//  212  423:iconst_0        
	//  213  424:invokevirtual   #119 <Method void CheckedTextView.setEnabled(boolean)>
			return;
	//  214  427:return          
		}
	}

	public void init(DefaultTrackSelector defaulttrackselector, int i)
	{
		trackSelector = defaulttrackselector;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field DefaultTrackSelector trackSelector>
		rendererIndex = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #163 <Field int rendererIndex>
		updateViews();
	//    6   10:aload_0         
	//    7   11:invokespecial   #393 <Method void updateViews()>
	//    8   14:return          
	}

	public void setAllowAdaptiveSelections(boolean flag)
	{
		if(allowAdaptiveSelections != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #292 <Field boolean allowAdaptiveSelections>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			allowAdaptiveSelections = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #292 <Field boolean allowAdaptiveSelections>
			updateViews();
	//    7   13:aload_0         
	//    8   14:invokespecial   #393 <Method void updateViews()>
		}
	//    9   17:return          
	}

	public void setShowDisableOption(boolean flag)
	{
		CheckedTextView checkedtextview = disableView;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field CheckedTextView disableView>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			byte0 = 8;
	//    8   14:bipush          8
	//    9   16:istore_2        
		checkedtextview.setVisibility(((int) (byte0)));
	//   10   17:aload_3         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #129 <Method void CheckedTextView.setVisibility(int)>
	//   13   22:return          
	}

	public void setTrackNameProvider(TrackNameProvider tracknameprovider)
	{
		trackNameProvider = (TrackNameProvider)Assertions.checkNotNull(((Object) (tracknameprovider)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #403 <Method Object Assertions.checkNotNull(Object)>
	//    3    5:checkcast       #372 <Class TrackNameProvider>
	//    4    8:putfield        #94  <Field TrackNameProvider trackNameProvider>
		updateViews();
	//    5   11:aload_0         
	//    6   12:invokespecial   #393 <Method void updateViews()>
	//    7   15:return          
	}

	private boolean allowAdaptiveSelections;
	private final ComponentListener componentListener;
	private final CheckedTextView defaultView;
	private final CheckedTextView disableView;
	private final LayoutInflater inflater;
	private boolean isDisabled;
	private com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride override;
	private int rendererIndex;
	private final int selectableItemBackgroundResourceId;
	private TrackGroupArray trackGroups;
	private TrackNameProvider trackNameProvider;
	private DefaultTrackSelector trackSelector;
	private CheckedTextView trackViews[][];


/*
	static void access$000(TrackSelectionView trackselectionview)
	{
		trackselectionview.applySelection();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method void applySelection()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$200(TrackSelectionView trackselectionview, View view)
	{
		trackselectionview.onClick(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #153 <Method void onClick(View)>
		return;
	//    3    5:return          
	}

*/
}
