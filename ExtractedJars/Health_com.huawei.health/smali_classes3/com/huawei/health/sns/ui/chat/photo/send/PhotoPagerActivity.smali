.class public Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;
.super Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$c;,
        Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$e;
    }
.end annotation


# instance fields
.field private f:Landroid/app/ActionBar;

.field private h:Landroid/content/Context;

.field private k:Landroid/widget/CheckBox;

.field private q:Landroid/widget/TextView;

.field private r:J

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private w:Landroid/view/View;

.field private x:Z

.field private z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;-><init>()V

    .line 92
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->r:J

    .line 107
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->x:Z

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->l()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->m()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)Landroid/widget/CheckBox;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->k:Landroid/widget/CheckBox;

    return-object v0
.end method

.method private c(Z)V
    .locals 3

    .line 416
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 418
    const-string v0, "selectedList"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 419
    const-string v0, "isSend"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 420
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->x:Z

    if-eqz v0, :cond_0

    .line 422
    const/16 v0, 0x39

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0

    .line 426
    :cond_0
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->setResult(ILandroid/content/Intent;)V

    .line 428
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->finish()V

    .line 429
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->s()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;Z)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->c(Z)V

    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)I
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->r()I

    move-result v0

    return v0
.end method

.method private g()V
    .locals 4

    .line 136
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 137
    if-eqz v2, :cond_1

    .line 140
    const-string v0, "totalList"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->p:Ljava/util/ArrayList;

    .line 142
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selectedList"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 143
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 148
    :cond_0
    const-string v0, "position"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->s:I

    .line 149
    const-string v0, "isDisplaySelect"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->x:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    :cond_1
    goto :goto_0

    .line 152
    :catch_0
    move-exception v2

    .line 154
    const-string v0, "PhotoPagerActivity"

    const-string v1, "getIntentData Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)Landroid/content/Context;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->h:Landroid/content/Context;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 245
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->l:Lo/bns;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, -0x1

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Lo/bns;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 246
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->p:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->o:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

    .line 247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->l:Lo/bns;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->o:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

    invoke-virtual {v0, v1}, Lo/bns;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 249
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->l:Lo/bns;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V

    invoke-virtual {v0, v1}, Lo/bns;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->l:Lo/bns;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->s:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bns;->setCurrentItem(IZ)V

    .line 275
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->s()V

    .line 276
    return-void
.end method

.method private k()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceAsColor"
        }
    .end annotation

    .line 161
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->f:Landroid/app/ActionBar;

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayShowCustomEnabled(Z)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 167
    return-void

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_photo_pager_no_emui_actionbar:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 171
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {v0, v3}, Landroid/app/ActionBar;->setCustomView(Landroid/view/View;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->toolbar_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 173
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 175
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 176
    const/high16 v0, -0x80000000

    invoke-virtual {v4, v0}, Landroid/view/Window;->addFlags(I)V

    .line 177
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_toolbar_bg_end_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 179
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->btn_cancel:I

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 180
    sget v0, Lcom/huawei/android/sns/R$id;->btn_ok:I

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 181
    sget v0, Lcom/huawei/android/sns/R$id;->sns_photo_chosed_num:I

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->u:Landroid/widget/TextView;

    .line 182
    sget v0, Lcom/huawei/android/sns/R$id;->sns_photo_chosed_text:I

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->t:Landroid/widget/TextView;

    .line 183
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->t:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_photo_chosed:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    sget v0, Lcom/huawei/android/sns/R$id;->sns_photo_chosed_bg:I

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->w:Landroid/view/View;

    .line 185
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->w:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 186
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->w:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 189
    :cond_2
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;)V

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 190
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;)V

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 237
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->t()V

    .line 238
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->t()V

    return-void
.end method

.method private l()V
    .locals 4

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 378
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->l:Lo/bns;

    invoke-virtual {v2}, Lo/bns;->getCurrentItem()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 380
    :cond_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 541
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->r()I

    move-result v2

    .line 542
    const/4 v0, -0x1

    if-le v2, v0, :cond_0

    .line 544
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    :cond_0
    return-void
.end method

.method private n()V
    .locals 3

    .line 405
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 406
    const-string v0, "selectedList"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 407
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->setResult(ILandroid/content/Intent;)V

    .line 408
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->finish()V

    .line 409
    return-void
.end method

.method private o()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StringFormatMatches"
        }
    .end annotation

    .line 466
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->k:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 500
    return-void
.end method

.method private p()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceAsColor",
            "InflateParams"
        }
    .end annotation

    .line 285
    sget v0, Lcom/huawei/android/sns/R$id;->photo_contentView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->a:Landroid/widget/RelativeLayout;

    .line 286
    sget v0, Lcom/huawei/android/sns/R$id;->view_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bns;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->l:Lo/bns;

    .line 287
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->g:Landroid/widget/RelativeLayout;

    .line 288
    sget v0, Lcom/huawei/android/sns/R$id;->navi_dark:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->m:Landroid/view/View;

    .line 289
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->n:Landroid/view/View;

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;-><init>(Lcom/huawei/health/sns/ui/base/SNSBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 295
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->f()V

    .line 297
    sget v0, Lcom/huawei/android/sns/R$id;->sns_original_photo:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->q:Landroid/widget/TextView;

    .line 299
    sget v0, Lcom/huawei/android/sns/R$id;->sns_photo_selected_cb:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->k:Landroid/widget/CheckBox;

    .line 300
    const-string v0, "btn_check_emui_dark"

    const-string v1, "drawable"

    invoke-static {p0, v0, v1}, Lo/bmo;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 301
    if-lez v2, :cond_0

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->k:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 305
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->x:Z

    if-eqz v0, :cond_1

    .line 307
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->b()V

    goto :goto_0

    .line 312
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->c()V

    .line 315
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->l()V

    .line 316
    return-void
.end method

.method private r()I
    .locals 2

    .line 587
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->l:Lo/bns;

    invoke-virtual {v0}, Lo/bns;->getCurrentItem()I

    move-result v1

    .line 588
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 590
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 592
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method private s()V
    .locals 4

    .line 600
    const/4 v2, 0x0

    .line 601
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->r()I

    move-result v3

    .line 602
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 604
    const/4 v2, 0x1

    .line 606
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->k:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 607
    return-void
.end method

.method private t()V
    .locals 4

    .line 554
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->u:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 556
    :cond_0
    const-string v0, "PhotoPagerActivity"

    const-string v1, "setTitleShowView got invalid value"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 557
    return-void

    .line 559
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 560
    if-lez v3, :cond_3

    .line 561
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->f:Landroid/app/ActionBar;

    if-eqz v0, :cond_4

    .line 562
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->x:Z

    if-eqz v0, :cond_2

    .line 563
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->u:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 566
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->u:Landroid/widget/TextView;

    const-string v1, "1/1"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 570
    :cond_3
    const-string v0, "PhotoPagerActivity"

    const-string v1, "selectedArrayList.size() = 0"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->t:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_photo_unchosed:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 572
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->u:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 574
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->w:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 576
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->w:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 578
    :cond_5
    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 6

    .line 507
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 508
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->r:J

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 511
    const/4 v0, 0x1

    return v0

    .line 513
    :cond_0
    iput-wide v4, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->r:J

    .line 514
    const/4 v0, 0x0

    return v0
.end method

.method public e(I)V
    .locals 3

    .line 524
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 525
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 527
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 528
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 530
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 531
    goto :goto_1

    .line 533
    :cond_0
    goto :goto_0

    .line 534
    :cond_1
    :goto_1
    return-void
.end method

.method public f()V
    .locals 6

    .line 321
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 323
    const-string v0, "PhotoPagerActivity"

    const-string v1, "updateBottomLayout : bottomLayout null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    return-void

    .line 327
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 328
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->n:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 329
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->m:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 330
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 333
    invoke-static {p0}, Lo/boi;->e(Landroid/app/Activity;)I

    move-result v0

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 334
    invoke-static {p0}, Lo/boi;->e(Landroid/app/Activity;)I

    move-result v0

    iput v0, v4, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 335
    invoke-static {p0}, Lo/boi;->e(Landroid/app/Activity;)I

    move-result v0

    iput v0, v5, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->m:Landroid/view/View;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_60_percent_fordark:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 337
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->m:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 353
    :cond_1
    const/4 v0, 0x0

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 354
    const/4 v0, 0x0

    iput v0, v4, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 355
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 359
    :goto_0
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 361
    const/4 v0, 0x0

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 362
    const/4 v0, 0x0

    iput v0, v4, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 363
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 366
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->n:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 368
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->m:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 369
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 396
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->n()V

    .line 397
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onBackPressed()V

    .line 398
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 117
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onCreate(Landroid/os/Bundle;)V

    .line 118
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->e()V

    .line 120
    iput-object p0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->h:Landroid/content/Context;

    .line 121
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_photo_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->setContentView(I)V

    .line 122
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->g()V

    .line 123
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->k()V

    .line 124
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->p()V

    .line 125
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->h()V

    .line 126
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->o()V

    .line 127
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 385
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 387
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->n()V

    .line 388
    const/4 v0, 0x1

    return v0

    .line 390
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
