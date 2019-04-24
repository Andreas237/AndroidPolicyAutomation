.class public Lo/bwx;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bwx$e;
    }
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/ImageView;

.field private c:Lo/efy;

.field private d:Lo/efy;

.field private e:Lo/efy;

.field private f:I

.field private g:Lo/bxi;

.field private h:I

.field private i:Lcom/huawei/health/suggestion/model/Plan;

.field private k:Lo/bys;

.field private l:F

.field private m:Landroid/app/Activity;

.field private n:Landroid/widget/PopupWindow;

.field private o:F

.field private p:I

.field private q:Lo/bwx$e;

.field private r:Lo/emr;

.field private s:I

.field private u:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/PlanRecord;)F
    .locals 2

    .line 346
    if-nez p1, :cond_0

    .line 347
    const/4 v0, 0x0

    return v0

    .line 348
    :cond_0
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_1

    .line 349
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireDistance()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/bzr;->a(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    return v0

    .line 350
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireActualCalorie()F

    move-result v0

    return v0
.end method

.method private a()V
    .locals 3

    .line 225
    iget-object v0, p0, Lo/bwx;->a:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->titlebar_panel:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lo/bwx;->r:Lo/emr;

    .line 226
    iget-object v0, p0, Lo/bwx;->r:Lo/emr;

    iget-object v1, p0, Lo/bwx;->m:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->sug_plan_edit_icon:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 227
    iget-object v0, p0, Lo/bwx;->r:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 228
    iget-object v0, p0, Lo/bwx;->r:Lo/emr;

    new-instance v1, Lo/bwx$1;

    invoke-direct {v1, p0}, Lo/bwx$1;-><init>(Lo/bwx;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 237
    return-void
.end method

.method private a(Landroid/app/Activity;)V
    .locals 2

    .line 205
    iput-object p1, p0, Lo/bwx;->m:Landroid/app/Activity;

    .line 206
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_run_inflate_show_plan_progress:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bwx;->a:Landroid/view/View;

    .line 207
    iget-object v0, p0, Lo/bwx;->a:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rpv_progress:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bys;

    iput-object v0, p0, Lo/bwx;->k:Lo/bys;

    .line 208
    iget-object v0, p0, Lo/bwx;->a:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_plan_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwx;->d:Lo/efy;

    .line 209
    iget-object v0, p0, Lo/bwx;->a:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_day_progress:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwx;->e:Lo/efy;

    .line 210
    iget-object v0, p0, Lo/bwx;->a:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_run_progress:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwx;->c:Lo/efy;

    .line 214
    iget-object v0, p0, Lo/bwx;->a:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_iv_plan:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwx;->b:Landroid/widget/ImageView;

    .line 219
    invoke-direct {p0}, Lo/bwx;->a()V

    .line 220
    invoke-direct {p0}, Lo/bwx;->g()V

    .line 221
    invoke-direct {p0}, Lo/bwx;->k()V

    .line 222
    return-void
.end method

.method private b(II)Ljava/lang/CharSequence;
    .locals 5

    .line 394
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 395
    iget-object v0, p0, Lo/bwx;->m:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Lo/buk;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 397
    :cond_0
    iget-object v0, p0, Lo/bwx;->m:Landroid/app/Activity;

    const/4 v1, 0x2

    invoke-static {v0, p1, p2, v1}, Lo/buk;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v4

    .line 399
    :goto_0
    iget-object v0, p0, Lo/bwx;->m:Landroid/app/Activity;

    const-string v1, "\\d|[/]"

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_myplan_blobstyle:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_myplan_normal:I

    invoke-static {v0, v1, v4, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 182
    const/4 v2, 0x0

    .line 183
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 184
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v2

    goto :goto_0

    .line 186
    :cond_0
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/btj;->b(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v2

    .line 189
    :goto_0
    invoke-direct {p0, v2}, Lo/bwx;->d(Lcom/huawei/health/suggestion/model/PlanRecord;)I

    move-result v0

    iput v0, p0, Lo/bwx;->p:I

    .line 191
    invoke-direct {p0, v2}, Lo/bwx;->a(Lcom/huawei/health/suggestion/model/PlanRecord;)F

    move-result v0

    iput v0, p0, Lo/bwx;->l:F

    .line 193
    invoke-direct {p0, v2}, Lo/bwx;->e(Lcom/huawei/health/suggestion/model/PlanRecord;)F

    move-result v0

    iput v0, p0, Lo/bwx;->o:F

    .line 194
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 325
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 326
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 327
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0, p1}, Lcom/huawei/health/suggestion/model/Plan;->putName(Ljava/lang/String;)V

    .line 328
    iget-object v0, p0, Lo/bwx;->d:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 329
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 330
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btj;->h(Ljava/lang/String;)V

    goto :goto_0

    .line 332
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lo/bsp;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/bwx;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/bwx;->l()V

    return-void
.end method

.method private d(I)I
    .locals 1

    .line 380
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 381
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getDays()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 382
    return p1
.end method

.method private d(Lcom/huawei/health/suggestion/model/PlanRecord;)I
    .locals 1

    .line 338
    if-eqz p1, :cond_0

    .line 339
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutTimes()I

    move-result v0

    return v0

    .line 341
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lo/bwx;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/bwx;->b()V

    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/PlanRecord;)F
    .locals 1

    .line 354
    if-eqz p1, :cond_0

    .line 355
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v0

    return v0

    .line 357
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private e(II)Ljava/lang/CharSequence;
    .locals 5

    .line 387
    iget-object v0, p0, Lo/bwx;->m:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lo/buk;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v4

    .line 388
    iget-object v0, p0, Lo/bwx;->m:Landroid/app/Activity;

    const-string v1, "\\d|[/]"

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_myplan_blobstyle:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_myplan_normal:I

    invoke-static {v0, v1, v4, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 101
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 103
    :pswitch_0
    iget-object v0, p0, Lo/bwx;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_five:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 104
    goto :goto_1

    .line 106
    :pswitch_1
    iget-object v0, p0, Lo/bwx;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_ten:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 107
    goto :goto_1

    .line 109
    :pswitch_2
    iget-object v0, p0, Lo/bwx;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_half:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 110
    goto :goto_1

    .line 112
    :pswitch_3
    iget-object v0, p0, Lo/bwx;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_marathon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 113
    goto :goto_1

    .line 115
    :goto_0
    iget-object v0, p0, Lo/bwx;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_marathon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 118
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic e(Lo/bwx;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/bwx;->p()V

    return-void
.end method

.method static synthetic e(Lo/bwx;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/bwx;->b(Ljava/lang/String;)V

    return-void
.end method

.method private f()V
    .locals 4

    .line 280
    iget-object v0, p0, Lo/bwx;->g:Lo/bxi;

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bxi;->b(Ljava/lang/String;)V

    .line 281
    invoke-virtual {p0}, Lo/bwx;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v2

    .line 282
    if-eqz v2, :cond_0

    .line 283
    invoke-virtual {v2}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v3

    .line 284
    if-eqz v3, :cond_0

    .line 285
    iget-object v0, p0, Lo/bwx;->g:Lo/bxi;

    const-string v1, "edit_plan_name"

    invoke-virtual {v3, v0, v1}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 286
    invoke-virtual {v3}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 289
    :cond_0
    iget-object v0, p0, Lo/bwx;->n:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 290
    return-void
.end method

.method private g()V
    .locals 3

    .line 245
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 246
    const-string v0, "title"

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_edit_plan_name:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 247
    new-instance v0, Lo/bxi;

    invoke-direct {v0}, Lo/bxi;-><init>()V

    iput-object v0, p0, Lo/bwx;->g:Lo/bxi;

    .line 248
    iget-object v0, p0, Lo/bwx;->g:Lo/bxi;

    invoke-virtual {v0, v2}, Lo/bxi;->setArguments(Landroid/os/Bundle;)V

    .line 249
    iget-object v0, p0, Lo/bwx;->g:Lo/bxi;

    new-instance v1, Lo/bwx$5;

    invoke-direct {v1, p0}, Lo/bwx$5;-><init>(Lo/bwx;)V

    invoke-virtual {v0, v1}, Lo/bxi;->e(Lo/bxi$e;)V

    .line 255
    return-void
.end method

.method private h()V
    .locals 1

    .line 302
    iget-object v0, p0, Lo/bwx;->q:Lo/bwx$e;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lo/bwx;->q:Lo/bwx$e;

    invoke-interface {v0}, Lo/bwx$e;->c()V

    .line 305
    :cond_0
    iget-object v0, p0, Lo/bwx;->n:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 306
    return-void
.end method

.method private i()V
    .locals 3

    .line 294
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/bwx;->m:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/suggestion/ui/run/activity/ExerciseRemindActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 295
    const-string v0, "planType"

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 296
    iget-object v0, p0, Lo/bwx;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 297
    iget-object v0, p0, Lo/bwx;->n:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 298
    return-void
.end method

.method private k()V
    .locals 5

    .line 258
    iget-object v0, p0, Lo/bwx;->m:Landroid/app/Activity;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_infault_menu:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 259
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_action_exercise_remind:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_action_edit_plan_name:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 261
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_action_show_plan:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 262
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_action_finish_plan:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 263
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/View;->measure(II)V

    .line 264
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/bwx;->s:I

    .line 265
    new-instance v0, Landroid/widget/PopupWindow;

    iget v1, p0, Lo/bwx;->s:I

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    const/4 v3, 0x1

    invoke-direct {v0, v4, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v0, p0, Lo/bwx;->n:Landroid/widget/PopupWindow;

    .line 266
    iget-object v0, p0, Lo/bwx;->n:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 267
    iget-object v0, p0, Lo/bwx;->n:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 268
    iget-object v0, p0, Lo/bwx;->n:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 276
    return-void
.end method

.method private l()V
    .locals 3

    .line 404
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 405
    const-string v0, "planName."

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    const-string v0, "dayProgress"

    iget v1, p0, Lo/bwx;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    const-string v0, "workoutTimes"

    iget v1, p0, Lo/bwx;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    const-string v0, "finishRate"

    iget v1, p0, Lo/bwx;->o:F

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    :cond_0
    const-string v0, "1120011"

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 412
    return-void
.end method

.method private m()I
    .locals 4

    .line 374
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bxz;->d(J)I

    move-result v2

    .line 375
    iget v0, p0, Lo/bwx;->u:I

    sub-int v0, v2, v0

    add-int/lit8 v3, v0, 0x1

    .line 376
    return v3
.end method

.method private o()F
    .locals 1

    .line 366
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 367
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getDistance()F

    move-result v0

    return v0

    .line 369
    :cond_0
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getCalorie()F

    move-result v0

    return v0
.end method

.method private p()V
    .locals 6

    .line 309
    const/4 v0, 0x2

    new-array v5, v0, [I

    .line 310
    iget-object v0, p0, Lo/bwx;->r:Lo/emr;

    invoke-virtual {v0, v5}, Lo/emr;->getLocationOnScreen([I)V

    .line 311
    iget-object v0, p0, Lo/bwx;->m:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    iget-object v0, p0, Lo/bwx;->n:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lo/bwx;->r:Lo/emr;

    const/4 v2, 0x0

    aget v2, v5, v2

    iget-object v3, p0, Lo/bwx;->m:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const/high16 v4, 0x41500000    # 13.0f

    invoke-static {v3, v4}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    const/4 v3, 0x1

    aget v3, v5, v3

    iget-object v4, p0, Lo/bwx;->r:Lo/emr;

    .line 313
    invoke-virtual {v4}, Lo/emr;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    .line 312
    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    goto :goto_0

    .line 315
    :cond_0
    iget-object v0, p0, Lo/bwx;->n:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lo/bwx;->r:Lo/emr;

    const/4 v2, 0x0

    aget v2, v5, v2

    iget-object v3, p0, Lo/bwx;->r:Lo/emr;

    invoke-virtual {v3}, Lo/emr;->getWidth()I

    move-result v3

    add-int/2addr v2, v3

    iget v3, p0, Lo/bwx;->s:I

    sub-int/2addr v2, v3

    iget-object v3, p0, Lo/bwx;->m:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const/high16 v4, 0x41500000    # 13.0f

    invoke-static {v3, v4}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x1

    aget v3, v5, v3

    iget-object v4, p0, Lo/bwx;->r:Lo/emr;

    .line 316
    invoke-virtual {v4}, Lo/emr;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    .line 315
    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 318
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Lo/bwx$e;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lo/bwx;->q:Lo/bwx$e;

    .line 198
    return-void
.end method

.method public c()Z
    .locals 2

    .line 178
    iget v0, p0, Lo/bwx;->p:I

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->getWorkoutCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lo/bwx;->h:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    iget v0, p0, Lo/bwx;->h:I

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->getDays()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 3

    .line 153
    invoke-direct {p0}, Lo/bwx;->m()I

    move-result v0

    iput v0, p0, Lo/bwx;->h:I

    .line 154
    iget v0, p0, Lo/bwx;->h:I

    invoke-direct {p0, v0}, Lo/bwx;->d(I)I

    move-result v0

    iput v0, p0, Lo/bwx;->f:I

    .line 156
    iget-object v0, p0, Lo/bwx;->c:Lo/efy;

    iget v1, p0, Lo/bwx;->p:I

    iget-object v2, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->getWorkoutCount()I

    move-result v2

    invoke-direct {p0, v1, v2}, Lo/bwx;->b(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 157
    iget-object v0, p0, Lo/bwx;->e:Lo/efy;

    iget v1, p0, Lo/bwx;->f:I

    iget-object v2, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->getDays()I

    move-result v2

    invoke-direct {p0, v1, v2}, Lo/bwx;->e(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 159
    iget-object v0, p0, Lo/bwx;->k:Lo/bys;

    iget v1, p0, Lo/bwx;->l:F

    invoke-virtual {v0, v1}, Lo/bys;->setProgress(F)V

    .line 160
    return-void
.end method

.method public d(Lcom/huawei/health/suggestion/model/Plan;I)V
    .locals 2

    .line 121
    if-eqz p1, :cond_0

    iget v0, p0, Lo/bwx;->u:I

    if-gez v0, :cond_1

    .line 122
    :cond_0
    return-void

    .line 124
    :cond_1
    iput-object p1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    .line 125
    iput p2, p0, Lo/bwx;->u:I

    .line 126
    iget-object v0, p0, Lo/bwx;->d:Lo/efy;

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object v0, p0, Lo/bwx;->k:Lo/bys;

    iget-object v1, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bys;->setType(I)V

    .line 128
    iget-object v0, p0, Lo/bwx;->k:Lo/bys;

    invoke-direct {p0}, Lo/bwx;->o()F

    move-result v1

    invoke-virtual {v0, v1}, Lo/bys;->setMax(F)V

    .line 129
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/bwx$4;

    invoke-direct {v1, p0}, Lo/bwx$4;-><init>(Lo/bwx;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 146
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 164
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    if-nez v0, :cond_0

    .line 165
    return-void

    .line 168
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 169
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_action_finish_plan:I

    if-ne v1, v0, :cond_1

    .line 170
    invoke-direct {p0}, Lo/bwx;->h()V

    goto :goto_0

    .line 171
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_action_exercise_remind:I

    if-ne v1, v0, :cond_2

    .line 172
    invoke-direct {p0}, Lo/bwx;->i()V

    goto :goto_0

    .line 173
    :cond_2
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_action_edit_plan_name:I

    if-ne v1, v0, :cond_3

    .line 174
    invoke-direct {p0}, Lo/bwx;->f()V

    .line 175
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 79
    invoke-virtual {p0}, Lo/bwx;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bwx;->a(Landroid/app/Activity;)V

    .line 81
    iget-object v0, p0, Lo/bwx;->a:Landroid/view/View;

    return-object v0
.end method

.method public onResume()V
    .locals 2

    .line 86
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 87
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    if-eqz v0, :cond_1

    .line 88
    invoke-direct {p0}, Lo/bwx;->b()V

    .line 89
    invoke-direct {p0}, Lo/bwx;->l()V

    .line 90
    invoke-virtual {p0}, Lo/bwx;->d()V

    .line 91
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 93
    iget-object v0, p0, Lo/bwx;->i:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getPicture()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bwx;->b:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/cam;->e(Ljava/lang/String;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 95
    :cond_0
    invoke-direct {p0}, Lo/bwx;->e()V

    .line 98
    :cond_1
    :goto_0
    return-void
.end method
