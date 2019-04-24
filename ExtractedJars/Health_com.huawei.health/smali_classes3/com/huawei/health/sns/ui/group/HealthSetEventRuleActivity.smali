.class public Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:I

.field private B:F

.field private C:Lo/emr;

.field private D:I

.field private E:Landroid/os/Handler;

.field private H:I

.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/app/Activity;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/LinearLayout;

.field private s:Landroid/widget/LinearLayout;

.field private t:Landroid/widget/LinearLayout;

.field private u:Landroid/widget/LinearLayout;

.field private v:Landroid/widget/RelativeLayout;

.field private w:I

.field private x:D

.field private y:Landroid/widget/RelativeLayout;

.field private z:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 71
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->D:I

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    .line 104
    const/16 v0, 0x3e9

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    .line 107
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->H:I

    .line 482
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->E:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    return v0
.end method

.method private a()V
    .locals 5

    .line 123
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 124
    if-eqz v3, :cond_0

    .line 125
    const-string v0, "activitytype"

    const/16 v1, 0xca

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 126
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a(I)V

    .line 127
    const-string v0, "goalValue"

    const-wide/16 v1, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    .line 128
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(F)V

    .line 130
    :cond_0
    return-void
.end method

.method private a(I)V
    .locals 1

    .line 433
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 435
    :sswitch_0
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    .line 436
    const/16 v0, 0x3e8

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 437
    goto :goto_0

    .line 439
    :sswitch_1
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    .line 440
    const/16 v0, 0x3e8

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 441
    goto :goto_0

    .line 443
    :sswitch_2
    const/16 v0, 0x67

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    .line 444
    const/16 v0, 0x3e8

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 445
    goto :goto_0

    .line 447
    :sswitch_3
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    .line 448
    const/16 v0, 0x3e9

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 449
    goto :goto_0

    .line 451
    :sswitch_4
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    .line 452
    const/16 v0, 0x3e9

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 453
    goto :goto_0

    .line 455
    :sswitch_5
    const/16 v0, 0x67

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    .line 456
    const/16 v0, 0x3e9

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 457
    goto :goto_0

    .line 459
    :sswitch_6
    const/16 v0, 0x68

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    .line 460
    const/16 v0, 0x3e9

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 461
    goto :goto_0

    .line 463
    :sswitch_7
    const/16 v0, 0x69

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    .line 464
    const/16 v0, 0x3e9

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 465
    .line 469
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0xc9 -> :sswitch_3
        0xca -> :sswitch_4
        0xcb -> :sswitch_5
        0xcc -> :sswitch_6
        0xcd -> :sswitch_7
    .end sparse-switch
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;F)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(F)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)F
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;F)F
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    return p1
.end method

.method private b()V
    .locals 3

    .line 134
    const/16 v0, 0x66

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    .line 137
    sget v0, Lcom/huawei/android/sns/R$id;->type_linearLayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->m:Landroid/widget/LinearLayout;

    .line 140
    sget v0, Lcom/huawei/android/sns/R$id;->iv_run:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e:Landroid/widget/ImageView;

    .line 141
    sget v0, Lcom/huawei/android/sns/R$id;->sport_type_run:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->s:Landroid/widget/LinearLayout;

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    sget v0, Lcom/huawei/android/sns/R$id;->iv_walk:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a:Landroid/widget/ImageView;

    .line 145
    sget v0, Lcom/huawei/android/sns/R$id;->sport_type_walk:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->t:Landroid/widget/LinearLayout;

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    sget v0, Lcom/huawei/android/sns/R$id;->iv_cycling:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c:Landroid/widget/ImageView;

    .line 149
    sget v0, Lcom/huawei/android/sns/R$id;->sport_type_ride:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->r:Landroid/widget/LinearLayout;

    .line 150
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    sget v0, Lcom/huawei/android/sns/R$id;->iv_fitness:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->d:Landroid/widget/ImageView;

    .line 153
    sget v0, Lcom/huawei/android/sns/R$id;->sport_type_fitness:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->q:Landroid/widget/LinearLayout;

    .line 154
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    sget v0, Lcom/huawei/android/sns/R$id;->iv_swim:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b:Landroid/widget/ImageView;

    .line 157
    sget v0, Lcom/huawei/android/sns/R$id;->sport_type_swim:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->u:Landroid/widget/LinearLayout;

    .line 158
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    sget v0, Lcom/huawei/android/sns/R$id;->single_challenge_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->n:Landroid/widget/TextView;

    .line 162
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 164
    sget v0, Lcom/huawei/android/sns/R$id;->accumulate_challenge_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->o:Landroid/widget/TextView;

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 167
    sget v0, Lcom/huawei/android/sns/R$id;->tv_choose_rank_type_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->l:Landroid/widget/TextView;

    .line 170
    sget v0, Lcom/huawei/android/sns/R$id;->tv_challenge_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->f:Landroid/widget/TextView;

    .line 171
    sget v0, Lcom/huawei/android/sns/R$id;->set_challenge_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->z:Landroid/widget/RelativeLayout;

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    sget v0, Lcom/huawei/android/sns/R$id;->tv_goal_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->k:Landroid/widget/TextView;

    .line 175
    sget v0, Lcom/huawei/android/sns/R$id;->tv_goal_distance_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->g:Landroid/widget/TextView;

    .line 176
    sget v0, Lcom/huawei/android/sns/R$id;->set_goal_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->y:Landroid/widget/RelativeLayout;

    .line 177
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    sget v0, Lcom/huawei/android/sns/R$id;->tv_goal_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->h:Landroid/widget/TextView;

    .line 180
    sget v0, Lcom/huawei/android/sns/R$id;->tv_goal_time_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->i:Landroid/widget/TextView;

    .line 181
    sget v0, Lcom/huawei/android/sns/R$id;->set_goal_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->v:Landroid/widget/RelativeLayout;

    .line 182
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->v:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    sget v0, Lcom/huawei/android/sns/R$id;->single_textView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->p:Landroid/widget/TextView;

    .line 187
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    .line 188
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->health_navbar_cancel_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    return-void
.end method

.method private b(F)V
    .locals 5

    .line 494
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    const/16 v1, 0x3e8

    if-ne v0, v1, :cond_1

    .line 495
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 496
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 497
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->f:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 499
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 501
    :cond_1
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_7

    .line 502
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    const/16 v1, 0x68

    if-ne v0, v1, :cond_3

    .line 503
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 504
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_2

    .line 505
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 506
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->h:Landroid/widget/TextView;

    float-to-int v1, p1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 508
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->h:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_info_no_set:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 511
    :cond_3
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    const/16 v1, 0x69

    if-ne v0, v1, :cond_5

    .line 512
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 513
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_4

    .line 514
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 515
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->k:Landroid/widget/TextView;

    float-to-int v1, p1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 517
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->k:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 518
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_info_no_set:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 521
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 522
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_6

    .line 523
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 524
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->k:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 526
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->k:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 527
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_info_no_set:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 531
    :cond_7
    :goto_0
    return-void
.end method

.method private b(I)V
    .locals 5

    .line 285
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    const/16 v1, 0x69

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    const/16 v1, 0x68

    if-ne v0, v1, :cond_1

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->n:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 288
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 291
    :goto_0
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 292
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v3, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 293
    const-string v0, "#0D1A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 294
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 295
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 296
    const-string v0, "#33FF6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 297
    sparse-switch p1, :sswitch_data_0

    goto :goto_1

    .line 299
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 300
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    .line 301
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 304
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->v:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_create_group_event_info_single_desc:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 308
    goto/16 :goto_2

    .line 310
    :goto_1
    const/16 v0, 0x3e9

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    .line 311
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 312
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    const/16 v1, 0x68

    if-ne v0, v1, :cond_2

    .line 313
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 315
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->z:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 316
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 317
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->v:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 318
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_create_group_event_info_cumulative_desc_time:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 321
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->z:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 324
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->y:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->v:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 326
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_create_group_event_info_cumulative_desc_distance:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 331
    :goto_2
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    const/16 v1, 0x3e8

    if-ne v0, v1, :cond_3

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_3

    .line 335
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 339
    :goto_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->f:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->k:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->h:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    .line 343
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(F)V

    .line 344
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;I)I
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->D:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->d()V

    return-void
.end method

.method private d()V
    .locals 6

    .line 214
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 215
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->x:D

    .line 216
    const/4 v5, 0x0

    .line 217
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 219
    :pswitch_0
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    const/16 v1, 0x3e8

    if-ne v0, v1, :cond_0

    .line 220
    const/16 v5, 0x65

    goto :goto_1

    .line 222
    :cond_0
    const/16 v5, 0xc9

    .line 224
    goto :goto_1

    .line 226
    :pswitch_1
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    const/16 v1, 0x3e8

    if-ne v0, v1, :cond_1

    .line 227
    const/16 v5, 0x66

    goto :goto_1

    .line 229
    :cond_1
    const/16 v5, 0xca

    .line 231
    goto :goto_1

    .line 233
    :pswitch_2
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    const/16 v1, 0x3e8

    if-ne v0, v1, :cond_2

    .line 234
    const/16 v5, 0x67

    goto :goto_1

    .line 236
    :cond_2
    const/16 v5, 0xcb

    .line 238
    goto :goto_1

    .line 240
    :pswitch_3
    const/16 v5, 0xcc

    .line 241
    goto :goto_1

    .line 243
    :pswitch_4
    const/16 v5, 0xcd

    .line 244
    goto :goto_1

    .line 246
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->finish()V

    .line 249
    :goto_1
    const-string v0, "activitytype"

    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 250
    const-string v0, "sportdistance"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->x:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 251
    const-string v0, "goalValue"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->x:D

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 252
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->setResult(ILandroid/content/Intent;)V

    .line 253
    const-string v0, "HealthSetEventRuleActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleFinishClick() sportDistance="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->x:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "   activityType="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->finish()V

    .line 255
    return-void

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->D:I

    return v0
.end method

.method private e(I)V
    .locals 3

    .line 346
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->C:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 347
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 349
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_run_select:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 350
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_walk_unselect:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 351
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_ride_bike:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 352
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_bodybuilding:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_swimming:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 355
    const/16 v0, 0x66

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    .line 357
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->H:I

    .line 358
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 359
    goto/16 :goto_1

    .line 361
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_run_unselect:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_walk_select:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 363
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_ride_bike:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 364
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_bodybuilding:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 365
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_swimming:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 367
    const/16 v0, 0x65

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    .line 369
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->H:I

    .line 370
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 371
    goto/16 :goto_1

    .line 373
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_run_unselect:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 374
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_walk_unselect:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 375
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_ride_bike_select:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_bodybuilding:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 377
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_swimming:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 379
    const/16 v0, 0x67

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    .line 381
    const/16 v0, 0x103

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->H:I

    .line 382
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 383
    goto/16 :goto_1

    .line 385
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_run_unselect:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 386
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_walk_unselect:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 387
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_ride_bike:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 388
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_bodybuilding_select:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 389
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_swimming:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 391
    const/16 v0, 0x68

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    .line 393
    const/16 v0, 0x2711

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->H:I

    .line 394
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 396
    goto/16 :goto_1

    .line 399
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_run_unselect:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 400
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_walk_unselect:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 401
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_ride_bike:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 402
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_bodybuilding:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 403
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_swimming_select:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 405
    const/16 v0, 0x69

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    .line 407
    const/16 v0, 0x106

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->H:I

    .line 408
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 409
    goto :goto_1

    .line 413
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_run_select:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 414
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_walk_unselect:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 415
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_ride_bike:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 416
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_bodybuilding:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_swimming:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 419
    const/16 v0, 0x66

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->w:I

    .line 421
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->H:I

    .line 422
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->A:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    .line 426
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->f:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 427
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->k:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->h:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    .line 430
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(F)V

    .line 431
    return-void

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public c(Landroid/content/Context;IZ)Lo/bgq;
    .locals 10

    .line 534
    new-instance v2, Lo/bgq$a;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->E:Landroid/os/Handler;

    invoke-direct {v2, p1, v0}, Lo/bgq$a;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 535
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 536
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->B:F

    float-to-double v0, v0

    invoke-virtual {v2, v0, v1}, Lo/bgq$a;->d(D)V

    .line 538
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->H:I

    invoke-virtual {v2, p2, v0, p3}, Lo/bgq$a;->c(IIZ)Lo/bgq;

    move-result-object v3

    .line 539
    invoke-virtual {v3}, Lo/bgq;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 540
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 541
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 542
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 543
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    .line 544
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p1, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v8

    .line 546
    invoke-static {p1}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 547
    const/high16 v0, 0x433f0000    # 191.0f

    invoke-static {p1, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v9

    goto :goto_0

    .line 549
    :cond_1
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {p1, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v9

    .line 551
    :goto_0
    invoke-virtual {v7}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v9, 0x2

    sub-int/2addr v0, v1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 552
    iput v8, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 553
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 554
    sget v0, Lcom/huawei/android/sns/R$style;->track_dialog_anim:I

    invoke-virtual {v4, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 555
    invoke-virtual {v3}, Lo/bgq;->show()V

    .line 556
    return-object v3
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 259
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->s:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_0

    .line 260
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    goto/16 :goto_0

    .line 261
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->t:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 262
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    goto/16 :goto_0

    .line 263
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->r:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_2

    .line 264
    const/16 v0, 0x67

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    goto/16 :goto_0

    .line 265
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->q:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_3

    .line 266
    const/16 v0, 0x68

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    goto/16 :goto_0

    .line 267
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->u:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_4

    .line 268
    const/16 v0, 0x69

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(I)V

    goto :goto_0

    .line 269
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->n:Landroid/widget/TextView;

    if-ne p1, v0, :cond_5

    .line 270
    const/16 v0, 0x3e8

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    goto :goto_0

    .line 271
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->o:Landroid/widget/TextView;

    if-ne p1, v0, :cond_6

    .line 272
    const/16 v0, 0x3e9

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(I)V

    goto :goto_0

    .line 273
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->z:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_7

    .line 274
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->D:I

    .line 275
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->j:Landroid/app/Activity;

    iget v1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->D:I

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c(Landroid/content/Context;IZ)Lo/bgq;

    goto :goto_0

    .line 276
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->y:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_8

    .line 277
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->D:I

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->j:Landroid/app/Activity;

    iget v1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->D:I

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c(Landroid/content/Context;IZ)Lo/bgq;

    goto :goto_0

    .line 279
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->v:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_9

    .line 280
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->D:I

    .line 281
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->j:Landroid/app/Activity;

    iget v1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->D:I

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c(Landroid/content/Context;IZ)Lo/bgq;

    .line 283
    :cond_9
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 112
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 113
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_set_event_rule:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->setContentView(I)V

    .line 114
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->j:Landroid/app/Activity;

    .line 115
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b()V

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a()V

    .line 117
    return-void
.end method
