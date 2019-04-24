.class public Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;
.super Lcom/huawei/health/suggestion/ui/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lo/efy;

.field private b:Lo/egw;

.field private c:Lo/byz;

.field private d:Lo/efy;

.field private e:Lo/byi;

.field private f:Z

.field private g:I

.field private h:Lo/emr;

.field private i:I

.field private k:Landroid/widget/ImageView;

.field private n:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;-><init>()V

    .line 40
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->n:I

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->o()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;Z)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d(Z)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->m()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->l()V

    return-void
.end method

.method private d()V
    .locals 4

    .line 71
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_sc_enabled:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byi;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->e:Lo/byi;

    .line 72
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_txt_remind_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d:Lo/efy;

    .line 73
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_txt_title_exercise_remind:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->a:Lo/efy;

    .line 74
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_titleBar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->h:Lo/emr;

    .line 75
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_iv_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->k:Landroid/widget/ImageView;

    .line 76
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->k:Landroid/widget/ImageView;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setRotation(F)V

    .line 80
    :cond_0
    const/4 v2, 0x0

    .line 81
    const/4 v3, 0x0

    .line 82
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->n:I

    if-nez v0, :cond_1

    .line 83
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->d()Z

    move-result v2

    goto :goto_0

    .line 84
    :cond_1
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->n:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 85
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->g()Z

    move-result v3

    .line 88
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    if-eqz v3, :cond_4

    .line 89
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->e:Lo/byi;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 90
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d(Z)V

    goto :goto_1

    .line 92
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->e:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 93
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d(Z)V

    .line 95
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d:Lo/efy;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 96
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->g()V

    .line 97
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->f()V

    return-void
.end method

.method private d(Z)V
    .locals 2

    .line 245
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setEnabled(Z)V

    .line 246
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 248
    if-eqz p1, :cond_0

    .line 249
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->a:Lo/efy;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/efy;->setAlpha(F)V

    .line 250
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d:Lo/efy;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/efy;->setAlpha(F)V

    .line 251
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->k:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_0

    .line 253
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->a:Lo/efy;

    const v1, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, v1}, Lo/efy;->setAlpha(F)V

    .line 254
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d:Lo/efy;

    const v1, 0x3ecccccd    # 0.4f

    invoke-virtual {v0, v1}, Lo/efy;->setAlpha(F)V

    .line 255
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->k:Landroid/widget/ImageView;

    const v1, 0x3ecccccd    # 0.4f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 257
    :goto_0
    return-void
.end method

.method private f()V
    .locals 3

    .line 188
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->e:Lo/byi;

    invoke-virtual {v0}, Lo/byi;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->n:I

    if-nez v0, :cond_0

    .line 190
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->i()I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lo/bsp;->d(ZI)V

    goto :goto_0

    .line 192
    :cond_0
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/btj;->c(I)V

    goto :goto_0

    .line 195
    :cond_1
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->n:I

    if-nez v0, :cond_2

    .line 196
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(ZI)V

    goto :goto_0

    .line 198
    :cond_2
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/btj;->c(I)V

    .line 201
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->finish()V

    .line 202
    return-void
.end method

.method private g()V
    .locals 4

    .line 113
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->b:Lo/egw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->b:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->b:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 117
    :cond_0
    new-instance v0, Lo/byz;

    invoke-direct {v0, p0}, Lo/byz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->c:Lo/byz;

    .line 118
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->c:Lo/byz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byz;->e(Z)V

    .line 119
    new-instance v3, Lo/egw$c;

    invoke-direct {v3, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 120
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_exercise_remind:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->c:Lo/byz;

    .line 121
    invoke-virtual {v0, v1}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;)V

    .line 122
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;)V

    .line 128
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->b:Lo/egw;

    .line 135
    return-void
.end method

.method private h()Ljava/lang/String;
    .locals 8

    .line 165
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v7

    .line 166
    new-instance v0, Ljava/util/Date;

    iget v4, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->g:I

    iget v5, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->i:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Ljava/util/Date;-><init>(IIIIII)V

    invoke-virtual {v7, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private i()I
    .locals 2

    .line 173
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->g:I

    mul-int/lit8 v0, v0, 0x3c

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->i:I

    add-int/2addr v0, v1

    return v0
.end method

.method private k()V
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->e:Lo/byi;

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;)V

    invoke-virtual {v0, v1}, Lo/byi;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->h:Lo/emr;

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->h:Lo/emr;

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    return-void
.end method

.method private l()V
    .locals 2

    .line 215
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->c:Lo/byz;

    invoke-virtual {v0}, Lo/byz;->getHour()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->g:I

    .line 216
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->c:Lo/byz;

    invoke-virtual {v0}, Lo/byz;->getMinute()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->i:I

    .line 217
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d:Lo/efy;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->b:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 219
    return-void
.end method

.method private m()V
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->b:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 226
    return-void
.end method

.method private o()V
    .locals 0

    .line 208
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->finish()V

    .line 209
    return-void
.end method

.method private p()V
    .locals 2

    .line 232
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->c:Lo/byz;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->g:I

    invoke-virtual {v0, v1}, Lo/byz;->setHour(I)V

    .line 233
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->c:Lo/byz;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->i:I

    invoke-virtual {v0, v1}, Lo/byz;->setMinute(I)V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->b:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 235
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 43
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_run_activity_exercise_remind:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->setContentView(I)V

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d()V

    .line 45
    return-void
.end method

.method public b()V
    .locals 4

    .line 54
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 55
    if-eqz v2, :cond_0

    .line 56
    const-string v0, "planType"

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->n:I

    .line 58
    :cond_0
    const/4 v3, 0x0

    .line 59
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->n:I

    if-nez v0, :cond_1

    .line 60
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->b()I

    move-result v3

    goto :goto_0

    .line 62
    :cond_1
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->h()I

    move-result v3

    .line 64
    :goto_0
    const/4 v0, -0x1

    if-le v3, v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    const/16 v0, 0x438

    :goto_1
    invoke-static {v0}, Lo/bzr;->b(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->g:I

    .line 65
    const/4 v0, -0x1

    if-le v3, v0, :cond_3

    move v0, v3

    goto :goto_2

    :cond_3
    const/16 v0, 0x438

    :goto_2
    invoke-static {v0}, Lo/bzr;->a(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->i:I

    .line 66
    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->f:Z

    .line 67
    return-void
.end method

.method public e()V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->k()V

    .line 50
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d:Lo/efy;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->k:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_1

    .line 180
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->p()V

    .line 182
    :cond_1
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 261
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->onResume()V

    .line 262
    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v2

    .line 263
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->f:Z

    if-eq v0, v2, :cond_0

    .line 264
    iput-boolean v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->f:Z

    .line 265
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->d:Lo/efy;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 266
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;->g()V

    .line 268
    :cond_0
    return-void
.end method
