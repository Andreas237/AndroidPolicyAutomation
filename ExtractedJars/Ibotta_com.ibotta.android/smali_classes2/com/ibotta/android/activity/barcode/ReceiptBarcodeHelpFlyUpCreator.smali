.class public Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;
.source "ReceiptBarcodeHelpFlyUpCreator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;
    }
.end annotation


# static fields
.field public static final PAGE_RECEIPT_BARCODE_HELP:I


# instance fields
.field private final config:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private final pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

.field private vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V

    .line 45
    iput-object p2, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->config:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    .line 46
    iput-object p3, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 48
    new-instance p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    .line 49
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    const/4 p2, 0x0

    iput p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    .line 50
    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->leftControl:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    .line 51
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CLOSE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    return-void
.end method

.method private makeBarcodeHelpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;
    .locals 3

    .line 84
    new-instance p2, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    invoke-direct {p2}, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    .line 85
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 86
    iget-object p2, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    invoke-static {p2, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 88
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    iget-object p1, p1, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->tvTitle:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->config:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getHelpTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    iget-object p1, p1, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->tvMessage:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->config:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getHelpMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object p2, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    iget-object p2, p2, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->tvTitle:Landroid/widget/TextView;

    .line 91
    invoke-virtual {p2}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->config:Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    .line 92
    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getHelpUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    iget-object v1, v1, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->ivExample:Landroid/widget/ImageView;

    sget-object v2, Lcom/ibotta/android/views/images/Sizes;->RECEIPT_BARCODE_HELP:Lcom/ibotta/android/views/images/Sizes;

    .line 90
    invoke-interface {p1, p2, v0, v1, v2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 96
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->vhBarcodeHelp:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    return-object p1
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

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    iget-object v1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public makeFlyUpPage(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)V
    .locals 1

    .line 64
    iget p3, p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    if-eqz p3, :cond_0

    const/4 p3, -0x1

    goto :goto_0

    :cond_0
    const p3, 0x7f0c00e9

    :goto_0
    const/4 v0, 0x1

    .line 69
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method

.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 1

    .line 75
    iget v0, p2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 77
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->makeBarcodeHelpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method protected onContinue()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090084
        }
    .end annotation

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->getController()Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;->onCloseClicked()V

    return-void
.end method
