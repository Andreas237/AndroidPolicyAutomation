.class public Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;
.source "BarcodeHelpFlyUpCreator.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;,
        Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;
    }
.end annotation


# static fields
.field public static final EVENT_SUBMIT_BARCODE:I = 0x1

.field private static final MIN_LENGTH:I = 0x4

.field public static final PAGE_BARCODE_HELP:I


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final lastManualBarcode:Ljava/lang/String;

.field private final pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;

.field private vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V
    .locals 1

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;)V
    .locals 1

    .line 45
    invoke-direct {p0, p3}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V

    .line 47
    new-instance p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-direct {p3}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;-><init>()V

    iput-object p3, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    .line 48
    iget-object p3, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    const/4 v0, 0x0

    iput v0, p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    .line 49
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    iput-object v0, p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->leftControl:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    .line 50
    iget-object p3, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    iput-object v0, p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->tracker:Lcom/ibotta/android/tracking/Tracker;

    .line 54
    iput-object p4, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->lastManualBarcode:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$300(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->updateSubmitButton()V

    return-void
.end method

.method public static synthetic lambda$makeBarcodeHelpViewHolder$0(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;Landroid/view/View;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->onSubmitBarcode()V

    return-void
.end method

.method private makeBarcodeHelpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;
    .locals 1

    .line 101
    new-instance p2, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;-><init>(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$1;)V

    iput-object p2, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    .line 102
    iget-object p2, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    const v0, 0x7f0901be

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-static {p2, v0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->access$102(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;Landroid/widget/EditText;)Landroid/widget/EditText;

    .line 103
    iget-object p2, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    const v0, 0x7f0900ab

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-static {p2, p1}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->access$202(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;Landroid/widget/Button;)Landroid/widget/Button;

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->access$100(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;)Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$1;

    invoke-direct {p2, p0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$1;-><init>(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 121
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->access$100(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;)Landroid/widget/EditText;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->lastManualBarcode:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 123
    invoke-direct {p0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->updateSubmitButton()V

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->access$200(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;)Landroid/widget/Button;

    move-result-object p1

    new-instance p2, Lcom/ibotta/android/activity/barcode/-$$Lambda$BarcodeHelpFlyUpCreator$tYiCKBH4ktI0XC5U8G-5Fq9MUFU;

    invoke-direct {p2, p0}, Lcom/ibotta/android/activity/barcode/-$$Lambda$BarcodeHelpFlyUpCreator$tYiCKBH4ktI0XC5U8G-5Fq9MUFU;-><init>(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;)V

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 127
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object p2, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    invoke-static {p2}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->access$100(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;)Landroid/widget/EditText;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/util/AppHelper;->showSoftKeyboardAsyncFocus(Landroid/view/View;)V

    .line 129
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    return-object p1
.end method

.method private onSubmitBarcode()V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "barcode_manual"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    invoke-static {v0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->access$100(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 141
    new-instance v1, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;

    invoke-direct {v1, v0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 142
    invoke-virtual {v1, v0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;->setEventId(I)V

    .line 143
    invoke-virtual {p0, v1}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->notifyPageEvent(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V

    return-void
.end method

.method private updateSubmitButton()V
    .locals 3

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    invoke-static {v0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->access$100(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 134
    iget-object v1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    invoke-static {v1}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->access$200(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;)Landroid/widget/Button;

    move-result-object v1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x4

    if-lt v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method


# virtual methods
.method public getFlyUpData()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;",
            ">;"
        }
    .end annotation

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public makeFlyUpPage(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)V
    .locals 1

    .line 67
    iget p3, p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    if-eqz p3, :cond_0

    const/4 p3, -0x1

    goto :goto_0

    :cond_0
    const p3, 0x7f0c00e1

    :goto_0
    const/4 v0, 0x1

    .line 72
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method

.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 1

    .line 78
    iget v0, p2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 80
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->makeBarcodeHelpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)Z
    .locals 1

    .line 89
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SEND:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;->onSubmitBarcode()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 95
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;->onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)Z

    move-result v0

    :cond_1
    return v0
.end method
