.class public Lcom/shopkick/app/application/dialog/SKDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "SKDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;,
        Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;,
        Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;
    }
.end annotation


# instance fields
.field private btnNegative:Lcom/shopkick/app/widget/SKTextView;

.field private btnNeutral:Lcom/shopkick/app/widget/SKTextView;

.field private btnPositive:Lcom/shopkick/app/widget/SKTextView;

.field private defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

.field private descText:Ljava/lang/String;

.field private descView:Lcom/shopkick/app/widget/SKTextView;

.field private dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

.field private didDevSetupWrong:Z

.field private dismissOnBgClicked:Z

.field private layout:Landroid/view/ViewGroup;

.field private onDismissListener:Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;

.field private res:Landroid/content/res/Resources;

.field private surfaceLayout:Landroid/view/ViewGroup;

.field private textBtnNegative:Ljava/lang/String;

.field private textBtnNeutral:Ljava/lang/String;

.field private textBtnPositive:Ljava/lang/String;

.field private titleText:Ljava/lang/String;

.field private titleView:Lcom/shopkick/app/widget/SKTextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 69
    sget-object v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ERROR_DEVSETUP:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    .line 89
    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    .line 90
    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    const/4 v0, 0x0

    .line 106
    iput-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/application/dialog/SKDialogFragment;)Landroid/view/ViewGroup;
    .locals 0

    .line 67
    iget-object p0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->surfaceLayout:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/application/dialog/SKDialogFragment;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 67
    iget-object p0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/application/dialog/SKDialogFragment;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 67
    iget-object p0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/application/dialog/SKDialogFragment;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 67
    iget-object p0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/application/dialog/SKDialogFragment;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupButtonsVertically()V

    return-void
.end method

.method public static hideIfNotNull(Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/application/dialog/SKDialogFragment;",
            ">;)V"
        }
    .end annotation

    .line 613
    invoke-static {p0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 614
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hide()V

    :cond_0
    return-void
.end method

.method private instantiateViews()V
    .locals 2

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f0901ff

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->surfaceLayout:Landroid/view/ViewGroup;

    .line 310
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f090206

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f0901fc

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    .line 314
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f0901f7

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    .line 316
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f0901f5

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    .line 318
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f0901f6

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    return-void
.end method

.method public static synthetic lambda$onCreate$0(Lcom/shopkick/app/application/dialog/SKDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 115
    invoke-virtual {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hide()V

    return-void
.end method

.method public static synthetic lambda$setupDialogIfDevSetupWrong$1(Lcom/shopkick/app/application/dialog/SKDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 158
    invoke-virtual {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hide()V

    return-void
.end method

.method private setupBackground()V
    .locals 3

    .line 336
    iget-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dismissOnBgClicked:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    aget-object v1, v2, v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 338
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClickable(Z)V

    goto :goto_0

    .line 340
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClickable(Z)V

    :goto_0
    return-void
.end method

.method private setupBtnNegative()V
    .locals 3

    .line 472
    iget-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    if-eqz v0, :cond_0

    return-void

    .line 475
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 476
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 477
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->textBtnNegative:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 478
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setClickable(Z)V

    .line 479
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method private setupBtnNeutral()V
    .locals 3

    .line 486
    iget-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    if-eqz v0, :cond_0

    return-void

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 490
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 491
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->textBtnNeutral:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 492
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setClickable(Z)V

    .line 493
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method private setupBtnPositive()V
    .locals 3

    .line 458
    iget-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    if-eqz v0, :cond_0

    return-void

    .line 461
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 462
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 463
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->textBtnPositive:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 464
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setClickable(Z)V

    .line 465
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    iget-object v2, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    aget-object v1, v2, v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method private setupButtons()V
    .locals 7

    .line 371
    iget-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    if-eqz v0, :cond_0

    return-void

    .line 373
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->BUTTONLESS:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    const/16 v2, 0x8

    if-ne v0, v1, :cond_4

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_1

    .line 376
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 378
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_2

    .line 379
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 381
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_3

    .line 382
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 384
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupSpacingForType()V

    return-void

    .line 388
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->textBtnPositive:Ljava/lang/String;

    .line 389
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    aget-object v0, v0, v3

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_1

    :cond_6
    :goto_0
    move v0, v3

    .line 391
    :goto_1
    iget-object v4, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v4, :cond_8

    iget-object v4, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->textBtnNegative:Ljava/lang/String;

    .line 392
    invoke-static {v4}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_8

    iget-object v4, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    const/4 v5, 0x2

    aget-object v4, v4, v5

    if-nez v4, :cond_7

    goto :goto_2

    :cond_7
    move v4, v1

    goto :goto_3

    :cond_8
    :goto_2
    move v4, v3

    .line 394
    :goto_3
    iget-object v5, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v5, :cond_9

    iget-object v5, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->textBtnNeutral:Ljava/lang/String;

    .line 395
    invoke-static {v5}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_9

    iget-object v5, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    const/4 v6, 0x3

    aget-object v5, v5, v6

    if-nez v5, :cond_a

    :cond_9
    move v1, v3

    .line 399
    :cond_a
    sget-object v5, Lcom/shopkick/app/application/dialog/SKDialogFragment$2;->$SwitchMap$com$shopkick$app$application$dialog$SKDialogFragment$SKDialogType:[I

    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    invoke-virtual {v6}, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    .line 448
    iput-boolean v3, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    goto :goto_7

    :pswitch_0
    if-eqz v1, :cond_b

    .line 428
    iput-boolean v3, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    goto :goto_7

    :cond_b
    if-nez v0, :cond_c

    .line 432
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupBtnPositive()V

    goto :goto_4

    .line 433
    :cond_c
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_d

    .line 434
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :cond_d
    :goto_4
    if-nez v4, :cond_e

    .line 438
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupBtnNegative()V

    goto :goto_5

    .line 439
    :cond_e
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_f

    .line 440
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 443
    :cond_f
    :goto_5
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupBtnNeutral()V

    goto :goto_7

    :pswitch_1
    if-nez v0, :cond_11

    if-eqz v4, :cond_10

    goto :goto_6

    .line 418
    :cond_10
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupBtnPositive()V

    .line 419
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupBtnNegative()V

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_14

    .line 422
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_7

    .line 416
    :cond_11
    :goto_6
    iput-boolean v3, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    goto :goto_7

    :pswitch_2
    if-eqz v0, :cond_12

    .line 402
    iput-boolean v3, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    goto :goto_7

    .line 404
    :cond_12
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupBtnPositive()V

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_13

    .line 407
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 409
    :cond_13
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_14

    .line 410
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 452
    :cond_14
    :goto_7
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupSpacingForType()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setupButtonsVertically()V
    .locals 9

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->res:Landroid/content/res/Resources;

    const v1, 0x7f0700d3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 211
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->res:Landroid/content/res/Resources;

    const v2, 0x7f0700d4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 212
    iget-object v2, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->res:Landroid/content/res/Resources;

    const v3, 0x7f0700c5

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 217
    iget-object v3, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v3}, Lcom/shopkick/app/widget/SKTextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 218
    iget-object v4, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v4}, Lcom/shopkick/app/widget/SKTextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 219
    iget-object v5, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v5}, Lcom/shopkick/app/widget/SKTextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 222
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    const/4 v7, 0x0

    if-lez v6, :cond_1

    .line 223
    iput v1, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    .line 224
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    if-lez v6, :cond_0

    .line 225
    iput v0, v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    goto :goto_0

    .line 227
    :cond_0
    iput v7, v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    goto :goto_0

    .line 229
    :cond_1
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    if-lez v6, :cond_2

    .line 230
    iput v1, v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    .line 234
    :cond_2
    :goto_0
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    const/4 v8, -0x1

    if-lez v6, :cond_4

    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    if-lez v6, :cond_4

    .line 236
    iput v8, v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;->endToStart:I

    .line 237
    iput v8, v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 238
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getId()I

    move-result v6

    iput v6, v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomToTop:I

    .line 239
    iput v7, v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 241
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    if-lez v6, :cond_3

    .line 242
    iput v8, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->startToStart:I

    .line 243
    iput v8, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 244
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getId()I

    move-result v6

    iput v6, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomToTop:I

    .line 245
    iput v7, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->endToEnd:I

    mul-int/lit8 v2, v2, 0x3

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    goto :goto_1

    :cond_3
    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    goto :goto_1

    .line 252
    :cond_4
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    if-lez v6, :cond_6

    .line 254
    iput v8, v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;->endToStart:I

    .line 255
    iput v7, v4, Landroid/support/constraint/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 257
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    if-lez v6, :cond_5

    .line 258
    iput v8, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->startToStart:I

    .line 259
    iput v8, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 260
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getId()I

    move-result v6

    iput v6, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomToTop:I

    .line 261
    iput v7, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->endToEnd:I

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    goto :goto_1

    :cond_5
    add-int/2addr v2, v0

    add-int/2addr v2, v1

    goto :goto_1

    .line 268
    :cond_6
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    if-lez v6, :cond_8

    .line 271
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v6

    if-lez v6, :cond_7

    .line 272
    iput v8, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->startToStart:I

    .line 273
    iput v8, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 274
    iget-object v6, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v6}, Lcom/shopkick/app/widget/SKTextView;->getId()I

    move-result v6

    iput v6, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomToTop:I

    .line 275
    iput v7, v5, Landroid/support/constraint/ConstraintLayout$LayoutParams;->endToEnd:I

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    goto :goto_1

    :cond_7
    add-int/2addr v2, v0

    add-int/2addr v2, v1

    goto :goto_1

    .line 284
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->res:Landroid/content/res/Resources;

    const v1, 0x7f0700cb

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v2, v0

    .line 288
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 289
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 290
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v5}, Lcom/shopkick/app/widget/SKTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v0

    if-lez v0, :cond_9

    .line 295
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 296
    iput v2, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    .line 297
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    .line 299
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 300
    iput v2, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    .line 301
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_2
    return-void
.end method

.method private setupDesc()V
    .locals 2

    .line 358
    iget-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    if-eqz v0, :cond_0

    return-void

    .line 360
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_2

    .line 361
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descText:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 362
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 363
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_0

    .line 365
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private setupDialogIfDevSetupWrong()V
    .locals 3

    .line 143
    iget-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    if-nez v0, :cond_0

    return-void

    .line 145
    :cond_0
    sget-object v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ERROR_DEVSETUP:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    const/4 v0, 0x0

    .line 147
    iput-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dismissOnBgClicked:Z

    .line 148
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupBackground()V

    .line 150
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f110155

    invoke-virtual {p0, v2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 151
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 153
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f110142

    invoke-virtual {p0, v2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 154
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 156
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f11014f

    invoke-virtual {p0, v2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 157
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnPositive:Lcom/shopkick/app/widget/SKTextView;

    new-instance v1, Lcom/shopkick/app/application/dialog/-$$Lambda$SKDialogFragment$GZQPLXC0xWyeS-nDONooOi60s-8;

    invoke-direct {v1, p0}, Lcom/shopkick/app/application/dialog/-$$Lambda$SKDialogFragment$GZQPLXC0xWyeS-nDONooOi60s-8;-><init>(Lcom/shopkick/app/application/dialog/SKDialogFragment;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNeutral:Lcom/shopkick/app/widget/SKTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->btnNegative:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    return-void
.end method

.method private setupSpacingForType()V
    .locals 3

    .line 506
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 507
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descText:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleText:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    sget-object v2, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->BUTTONLESS:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    if-eq v1, v2, :cond_0

    .line 509
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->res:Landroid/content/res/Resources;

    const v2, 0x7f0700cb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 511
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 513
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private setupTitle()V
    .locals 2

    .line 345
    iget-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    if-eqz v0, :cond_0

    return-void

    .line 347
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    if-eqz v0, :cond_2

    .line 348
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleText:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 349
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_0

    .line 352
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleView:Lcom/shopkick/app/widget/SKTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private setupViews()V
    .locals 0

    .line 323
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupBackground()V

    .line 326
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupTitle()V

    .line 329
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupDesc()V

    .line 332
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupButtons()V

    return-void
.end method

.method private show()V
    .locals 0

    return-void
.end method

.method private showButtonsVerticallyIfNoRoom()V
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ERROR_DEVSETUP:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->BUTTONLESS:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ACKNOWLEDGE:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 170
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->res:Landroid/content/res/Resources;

    const v1, 0x7f0700ce

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 172
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->surfaceLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    .line 173
    new-instance v2, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;-><init>(Lcom/shopkick/app/application/dialog/SKDialogFragment;I)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public hide()V
    .locals 0

    .line 583
    invoke-virtual {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dismissAllowingStateLoss()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 111
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 114
    iget-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    if-nez p1, :cond_0

    const/4 p1, 0x4

    new-array p1, p1, [Landroid/view/View$OnClickListener;

    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    .line 115
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    const/4 v0, 0x0

    new-instance v1, Lcom/shopkick/app/application/dialog/-$$Lambda$SKDialogFragment$NOV5v6b10rsNT6AflI_WyAUiFAc;

    invoke-direct {v1, p0}, Lcom/shopkick/app/application/dialog/-$$Lambda$SKDialogFragment$NOV5v6b10rsNT6AflI_WyAUiFAc;-><init>(Lcom/shopkick/app/application/dialog/SKDialogFragment;)V

    aput-object v1, p1, v0

    const/4 p1, 0x1

    const v0, 0x7f120192

    .line 117
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setStyle(II)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const p3, 0x7f0c00a4

    const/4 v0, 0x0

    .line 123
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->res:Landroid/content/res/Resources;

    .line 127
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->instantiateViews()V

    .line 128
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupViews()V

    .line 131
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setupDialogIfDevSetupWrong()V

    .line 137
    invoke-direct {p0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->showButtonsVerticallyIfNoRoom()V

    .line 139
    iget-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->layout:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 604
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 605
    iget-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->onDismissListener:Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;

    if-eqz p1, :cond_0

    .line 606
    invoke-interface {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;->onDismiss()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 574
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onStart()V

    return-void
.end method

.method public setBtnNegativeText(Ljava/lang/String;)V
    .locals 0

    .line 563
    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->textBtnNegative:Ljava/lang/String;

    return-void
.end method

.method public setBtnNeutralText(Ljava/lang/String;)V
    .locals 0

    .line 567
    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->textBtnNeutral:Ljava/lang/String;

    return-void
.end method

.method public setBtnPositiveText(Ljava/lang/String;)V
    .locals 0

    .line 559
    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->textBtnPositive:Ljava/lang/String;

    return-void
.end method

.method public setDialogType(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dialogType:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    return-void
.end method

.method public setDismissOnBgClick(Z)V
    .locals 0

    .line 524
    iput-boolean p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dismissOnBgClicked:Z

    return-void
.end method

.method public setOnClickListenerNegative(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 535
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    if-nez v0, :cond_0

    const/4 v0, 0x4

    .line 536
    new-array v0, v0, [Landroid/view/View$OnClickListener;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    .line 538
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    const/4 v1, 0x2

    aput-object p1, v0, v1

    return-void
.end method

.method public setOnClickListenerNeutral(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 542
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    if-nez v0, :cond_0

    const/4 v0, 0x4

    .line 543
    new-array v0, v0, [Landroid/view/View$OnClickListener;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    .line 545
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    const/4 v1, 0x3

    aput-object p1, v0, v1

    return-void
.end method

.method public setOnClickListenerPositive(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 528
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    if-nez v0, :cond_0

    const/4 v0, 0x4

    .line 529
    new-array v0, v0, [Landroid/view/View$OnClickListener;

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    .line 531
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->defaultBtnOnClicks:[Landroid/view/View$OnClickListener;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public setOnDismissListener(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V
    .locals 0

    .line 599
    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->onDismissListener:Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;

    return-void
.end method

.method public setTitleAndDescText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 551
    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 552
    iput-boolean v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->didDevSetupWrong:Z

    .line 554
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->titleText:Ljava/lang/String;

    .line 555
    iput-object p2, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment;->descText:Ljava/lang/String;

    return-void
.end method
