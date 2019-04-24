.class public Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/TextView;

.field private c:Ljava/lang/String;

.field private d:Lo/emr;

.field private e:Lo/eha;

.field private f:Landroid/os/Handler;

.field private g:Lo/egn;

.field private h:Landroid/app/Activity;

.field private i:Ljava/lang/String;

.field private k:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 54
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    .line 80
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->i:Ljava/lang/String;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    .line 92
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;

    invoke-direct {v0, p0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$e;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->f:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/widget/TextView;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 263
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    .line 264
    sget v0, Lcom/huawei/android/sns/R$id;->et_group_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eha;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    .line 265
    sget v0, Lcom/huawei/android/sns/R$id;->tv_desc_character_number:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->b:Landroid/widget/TextView;

    .line 266
    sget v0, Lcom/huawei/android/sns/R$id;->rl_group_profile:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a:Landroid/widget/RelativeLayout;

    .line 269
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 270
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 271
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    const/high16 v1, 0x427e0000    # 63.5f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 275
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->b()V

    .line 277
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/app/Activity;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->health_navbar_cancel_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 295
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 297
    return-void
.end method

.method private c()V
    .locals 6

    .line 246
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 247
    if-eqz v5, :cond_0

    .line 248
    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    .line 252
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 253
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 254
    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupType"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 253
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->i:Ljava/lang/String;

    .line 256
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 257
    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupDesc"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 256
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    .line 260
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Lo/eha;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eha;->setText(Ljava/lang/CharSequence;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eha;->setCursorVisible(Z)V

    .line 145
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->b:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x32

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x32

    if-ne v0, v1, :cond_0

    .line 147
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    sget v1, Lcom/huawei/android/sns/R$drawable;->round_rectangle_bg_warning:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    goto :goto_0

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    sget v1, Lcom/huawei/android/sns/R$drawable;->round_rectangle_bg:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    goto :goto_0

    .line 152
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_has_no_description:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eha;->setHint(Ljava/lang/CharSequence;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eha;->setCursorVisible(Z)V

    .line 154
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->b:Landroid/widget/TextView;

    const-string v1, "0/50"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V

    invoke-virtual {v0, v1}, Lo/eha;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V

    invoke-virtual {v0, v1}, Lo/eha;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 228
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 5

    .line 443
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 444
    invoke-virtual {v4, p1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_user_permission_know:I

    .line 445
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$7;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 451
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 452
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 453
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 454
    return-void
.end method

.method private e()V
    .locals 2

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    invoke-virtual {v1}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    invoke-virtual {v0}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 304
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->i()V

    goto :goto_0

    .line 306
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->finish()V

    .line 308
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d(Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .line 236
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 237
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    goto :goto_0

    .line 240
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 243
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->i:Ljava/lang/String;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e:Lo/eha;

    invoke-virtual {v0}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 350
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 351
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->k()V

    .line 352
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->i:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$9;

    invoke-direct {v2, p0, v4}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$9;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;Ljava/lang/String;)V

    invoke-static {v0, v4, v1, v2}, Lo/anz;->b(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lo/aog;)V

    .line 387
    :cond_0
    return-void
.end method

.method private h()V
    .locals 2

    .line 422
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 424
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    .line 426
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 324
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_alarm_settings_save_changes:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_save:I

    .line 326
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$10;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_btn_discard:I

    .line 332
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 338
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 339
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 340
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 341
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/os/Handler;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private k()V
    .locals 3

    .line 407
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    .line 409
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 410
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 411
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 413
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 414
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->g:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 416
    :cond_1
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 395
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 396
    const/4 v3, 0x0

    .line 397
    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    .line 398
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 400
    :cond_0
    if-lez v3, :cond_1

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, p1

    :goto_1
    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 132
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 133
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_group_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->setContentView(I)V

    .line 134
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h:Landroid/app/Activity;

    .line 135
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c()V

    .line 136
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a()V

    .line 137
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d()V

    .line 138
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 430
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->f:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->f:Landroid/os/Handler;

    const/16 v1, 0x356

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->f:Landroid/os/Handler;

    const/16 v1, 0x356

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 433
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->h()V

    .line 434
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 435
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 312
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 313
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->e()V

    .line 314
    const/4 v0, 0x1

    return v0

    .line 316
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
