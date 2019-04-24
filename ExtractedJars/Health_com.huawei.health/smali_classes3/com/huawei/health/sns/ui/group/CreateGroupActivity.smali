.class public Lcom/huawei/health/sns/ui/group/CreateGroupActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/CreateGroupActivity$b;
    }
.end annotation


# instance fields
.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/os/Handler;

.field private h:Lo/bio;

.field private k:Lo/egd;

.field private l:Ljava/lang/String;

.field private o:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->k:Lo/egd;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->h:Lo/bio;

    .line 69
    new-instance v0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$b;-><init>(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->g:Landroid/os/Handler;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->l:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 3

    .line 176
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 177
    if-eqz v1, :cond_1

    .line 179
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 180
    if-nez v2, :cond_0

    .line 182
    return-void

    .line 196
    :cond_0
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lo/bpc;->a(Landroid/content/Intent;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->o:Z

    .line 198
    :cond_1
    return-void
.end method

.method private a(III)V
    .locals 1

    .line 296
    const/16 v0, 0xa2

    if-ne p1, v0, :cond_3

    .line 298
    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    .line 300
    sget v0, Lcom/huawei/android/sns/R$string;->sns_create_group_max_info:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 302
    :cond_0
    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    .line 304
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_to_many_people:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 306
    :cond_1
    const/16 v0, 0x406

    if-ne p3, v0, :cond_2

    .line 308
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->k()V

    goto :goto_0

    .line 312
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_create_group_failed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 315
    :cond_3
    const/16 v0, 0xaaa

    if-ne p1, v0, :cond_4

    .line 317
    invoke-static {p2, p3}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 319
    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->p()V

    return-void
.end method

.method private b()V
    .locals 2

    .line 272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->k:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->g()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;III)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->a(III)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->l:Ljava/lang/String;

    return-object v0
.end method

.method private c()V
    .locals 8

    .line 235
    sget v0, Lcom/huawei/android/sns/R$id;->btn_create:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->k:Lo/egd;

    .line 236
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->e()V

    .line 237
    sget v0, Lcom/huawei/android/sns/R$id;->layout_image_create:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->f:Landroid/widget/LinearLayout;

    .line 238
    sget v0, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 239
    if-eqz v2, :cond_0

    .line 241
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Landroid/view/View;->setOverScrollMode(I)V

    .line 243
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 244
    iget v0, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v1, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    if-le v0, v1, :cond_1

    .line 246
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v4

    .line 247
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v5

    .line 248
    mul-int/lit8 v0, v5, 0x3

    div-int/lit8 v6, v0, 0x4

    .line 249
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    .line 250
    iput v5, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 251
    iput v6, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 254
    :cond_1
    return-void
.end method

.method private c(J)V
    .locals 3

    .line 385
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 386
    const-class v0, Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 387
    const-string v0, "groupId"

    invoke-virtual {v2, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 395
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->o:Z

    if-eqz v0, :cond_0

    .line 397
    const-string v0, "isFromHmsCreate"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 399
    :cond_0
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 400
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->finish()V

    .line 401
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;J)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->d(J)V

    return-void
.end method

.method private d(J)V
    .locals 2

    .line 360
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->p()V

    .line 362
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 363
    const-string v0, "groupId"

    invoke-virtual {v1, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 364
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->setResult(ILandroid/content/Intent;)V

    .line 367
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->c(J)V

    .line 368
    return-void
.end method

.method private e()V
    .locals 1

    .line 261
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 263
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->k:Lo/egd;

    invoke-static {p0, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 265
    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .line 348
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->h()V

    .line 349
    new-instance v1, Lo/asu;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->g:Landroid/os/Handler;

    invoke-direct {v1, v0}, Lo/asu;-><init>(Landroid/os/Handler;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->l:Ljava/lang/String;

    invoke-virtual {v1, p0, v0}, Lo/asu;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 351
    return-void
.end method

.method private h()V
    .locals 4

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->h:Lo/bio;

    if-nez v0, :cond_0

    .line 410
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->h:Lo/bio;

    .line 412
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->h:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 413
    return-void
.end method

.method private k()V
    .locals 6

    .line 326
    move-object v0, p0

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_create_family_group_bind_phone_tip:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_set_up_later:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_set_up_now:I

    new-instance v5, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$2;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 341
    return-void
.end method

.method private p()V
    .locals 1

    .line 420
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->h:Lo/bio;

    if-eqz v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->h:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 424
    :cond_0
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 440
    const/16 v0, 0x7d4

    if-ne p1, v0, :cond_0

    .line 442
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 444
    const-string v0, "CreateGroupActivity"

    const-string v1, "onSuccess, bind phone result."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->a()V

    .line 449
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 450
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 227
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onBackPressed()V

    .line 228
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 429
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 431
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_create_group_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->setContentView(I)V

    .line 433
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->c()V

    .line 435
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->b()V

    .line 436
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 146
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 148
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 149
    if-eqz v2, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 154
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_create_group_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->setContentView(I)V

    .line 158
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    goto :goto_0

    .line 160
    :catch_0
    move-exception v3

    .line 162
    const-string v0, "CreateGroupActivity"

    const-string v1, "CreateGroupActivity get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->finish()V

    .line 166
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->c()V

    .line 168
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->b()V

    .line 169
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 374
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->p()V

    .line 375
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 376
    return-void
.end method
