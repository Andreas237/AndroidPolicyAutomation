.class public Lcom/huawei/ui/main/stories/history/SportHistoryActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field private a:[Ljava/lang/String;

.field private b:Landroid/widget/RelativeLayout;

.field c:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field

.field private d:Landroid/widget/ImageView;

.field private e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/LinearLayout;

.field private h:I

.field private i:I

.field private k:Landroid/widget/ImageButton;

.field private l:Z

.field private m:Landroid/view/View;

.field private n:Landroid/view/View;

.field private o:Lo/ems;

.field private p:Landroid/widget/PopupWindow;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->i:I

    .line 78
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->l:Z

    .line 293
    new-instance v0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$2;-><init>(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->c:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)Landroid/widget/ImageButton;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->k:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private a()V
    .locals 9

    .line 101
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 102
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v5

    .line 103
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    .line 105
    sget v0, Lcom/huawei/ui/main/R$id;->frag_sport_history_list:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-virtual {v5, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 106
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 107
    sget v0, Lcom/huawei/ui/main/R$id;->title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->b:Landroid/widget/RelativeLayout;

    .line 108
    sget v0, Lcom/huawei/ui/main/R$id;->sport_history_toolbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->o:Lo/ems;

    .line 109
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_history_bottom_view:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_sport_history_data_input:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->n:Landroid/view/View;

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->o:Lo/ems;

    invoke-virtual {v0, v6}, Lo/ems;->e(Landroid/view/View;)V

    .line 118
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_sport_history_data_input:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_sport_history_data_stat:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->o:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 122
    sget v0, Lcom/huawei/ui/main/R$id;->statusbar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->m:Landroid/view/View;

    .line 123
    invoke-static {p0}, Lo/ene;->b(Landroid/content/Context;)I

    move-result v7

    .line 124
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v8, v0, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->m:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->m:Landroid/view/View;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->emui_color_gray_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 128
    sget v0, Lcom/huawei/ui/main/R$id;->btn_back:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->d:Landroid/widget/ImageView;

    .line 130
    sget v0, Lcom/huawei/ui/main/R$id;->text_stat:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 132
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_back_rtl:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_back:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 138
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->a:[Ljava/lang/String;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->d()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p0, v0, v1, v2, p0}, Lo/ffg;->d(Landroid/content/Context;[Ljava/lang/String;IZLandroid/widget/RadioGroup$OnCheckedChangeListener;)Landroid/widget/PopupWindow;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->p:Landroid/widget/PopupWindow;

    .line 143
    sget v0, Lcom/huawei/ui/main/R$id;->layout_choose_sport_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->g:Landroid/widget/LinearLayout;

    .line 144
    sget v0, Lcom/huawei/ui/main/R$id;->text_show_sport_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->f:Landroid/widget/TextView;

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->a:[Ljava/lang/String;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->d()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    sget v0, Lcom/huawei/ui/main/R$id;->btn_spinner_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->k:Landroid/widget/ImageButton;

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->p:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->p:Landroid/widget/PopupWindow;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$4;-><init>(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 159
    :cond_1
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 205
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 207
    :pswitch_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    .line 208
    goto :goto_0

    .line 210
    :pswitch_1
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    .line 211
    goto :goto_0

    .line 213
    :pswitch_2
    const/16 v0, 0x101

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    .line 214
    goto :goto_0

    .line 216
    :pswitch_3
    const/16 v0, 0x103

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    .line 217
    goto :goto_0

    .line 219
    :pswitch_4
    const/16 v0, 0x2711

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    .line 220
    .line 224
    :goto_0
    :pswitch_5
    const-string v0, "Track_TrackSportHistoryActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a(I)V

    .line 235
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 236
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->hV:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 239
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method private b()V
    .locals 8

    .line 350
    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    .line 351
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    .line 352
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    .line 353
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v6

    .line 354
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 355
    invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 356
    const-string v0, "##"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 357
    invoke-virtual {v7, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 359
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "in_sport_history_activity_time"

    .line 360
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 359
    invoke-static {v0, v4, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 361
    return-void
.end method

.method private c()V
    .locals 6

    .line 163
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 164
    if-eqz v4, :cond_0

    .line 165
    const-string v0, "sportType"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    .line 166
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_0

    .line 167
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    .line 171
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_1

    .line 172
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    const/16 v1, 0x2711

    if-ne v1, v0, :cond_1

    .line 173
    const-string v0, "Track_TrackSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() mSportType change from fitness to default."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    .line 179
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 180
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 181
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_all_exercise:I

    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_run:I

    .line 182
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_walk:I

    .line 183
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_cycle:I

    .line 184
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_workout:I

    .line 185
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->a:[Ljava/lang/String;

    goto :goto_0

    .line 187
    :cond_2
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_all_exercise:I

    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_run:I

    .line 188
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_walk:I

    .line 189
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_cycle:I

    .line 190
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->a:[Ljava/lang/String;

    .line 193
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;Z)Z
    .locals 0

    .line 53
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->l:Z

    return p1
.end method

.method private d()I
    .locals 1

    .line 330
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 332
    :sswitch_0
    const/4 v0, 0x0

    return v0

    .line 335
    :sswitch_1
    const/4 v0, 0x2

    return v0

    .line 337
    :sswitch_2
    const/4 v0, 0x4

    return v0

    .line 339
    :sswitch_3
    const/4 v0, 0x6

    return v0

    .line 341
    :sswitch_4
    const/16 v0, 0x8

    return v0

    .line 343
    :goto_0
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x101 -> :sswitch_2
        0x102 -> :sswitch_1
        0x103 -> :sswitch_3
        0x108 -> :sswitch_1
        0x2711 -> :sswitch_4
    .end sparse-switch
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)Landroid/widget/PopupWindow;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->p:Landroid/widget/PopupWindow;

    return-object v0
.end method


# virtual methods
.method public e(I)V
    .locals 2

    .line 196
    const/16 v0, 0x2711

    if-ne p1, v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 201
    :goto_0
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 6

    .line 308
    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RadioButton;

    .line 309
    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 310
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 312
    invoke-virtual {p1, v4}, Landroid/widget/RadioGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->i:I

    .line 313
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->i:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->a(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 315
    return-void

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->c:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$5;-><init>(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 323
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 244
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->l:Z

    if-eqz v0, :cond_0

    .line 245
    const-string v0, "Track_TrackSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "don\'t click to fast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    return-void

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->c:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$3;-><init>(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 254
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->l:Z

    .line 255
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->btn_back:I

    if-ne v0, v1, :cond_1

    .line 257
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->finish()V

    goto/16 :goto_1

    .line 258
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_sport_history_data_stat:I

    if-ne v0, v1, :cond_2

    .line 260
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 261
    const-string v0, "type_int"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 262
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->startActivity(Landroid/content/Intent;)V

    .line 264
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 265
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->hS:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 269
    goto/16 :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->layout_choose_sport_type:I

    if-ne v0, v1, :cond_5

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->p:Landroid/widget/PopupWindow;

    if-nez v0, :cond_3

    .line 271
    const-string v0, "Track_TrackSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPopSportType == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    return-void

    .line 279
    :cond_3
    const/4 v0, 0x2

    new-array v5, v0, [I

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->getLocationOnScreen([I)V

    .line 281
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->p:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->b:Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    aget v2, v5, v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->p:Landroid/widget/PopupWindow;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    const/high16 v3, 0x41800000    # 16.0f

    invoke-static {p0, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x1

    aget v3, v5, v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v4}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    goto :goto_0

    .line 284
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->p:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->b:Landroid/widget/RelativeLayout;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {p0, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, 0x1

    aget v3, v5, v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v4}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 286
    :goto_0
    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_sport_history_data_input:I

    if-ne v0, v1, :cond_6

    .line 287
    const-string v0, "Track_TrackSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() add sport data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 289
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->startActivity(Landroid/content/Intent;)V

    .line 291
    :cond_6
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 85
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 86
    const-string v0, "Track_TrackSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_track_sport_history:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->setContentView(I)V

    .line 89
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->c()V

    .line 90
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->a()V

    .line 92
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->b()V

    .line 95
    return-void
.end method
