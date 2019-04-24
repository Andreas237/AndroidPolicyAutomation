.class public Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;
.super Landroid/widget/LinearLayout;
.source "ReceiptScanFooterView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView$ReceiptScanFooterListener;
    }
.end annotation


# instance fields
.field protected bTakePhotoInstead:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900ac
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivBarcodeIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090296
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView$ReceiptScanFooterListener;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field protected tbvInstructionsTitle:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090448
    .end annotation
.end field

.field protected tvInstructionsDetails:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090535
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 64
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->initLayout()V

    return-void
.end method

.method private initBarcodeIcon(Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;)V
    .locals 4

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getExampleUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 97
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getExampleUrl()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->ivBarcodeIcon:Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->RECEIPT_BARCODE_EXAMPLE_ICON:Lcom/ibotta/android/views/images/Sizes;

    .line 96
    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->ivBarcodeIcon:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 103
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->ivBarcodeIcon:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initInstructionsDetails(Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->tvInstructionsDetails:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getCaptureMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initInstructionsTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->tbvInstructionsTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 78
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;)V

    const/4 v0, 0x1

    .line 80
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->setOrientation(I)V

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01ac

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 82
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initTakePhotoInsteadButton(Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;)V
    .locals 4

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->bTakePhotoInstead:Landroid/widget/Button;

    .line 117
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->getBarcodeName()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const p1, 0x7f110560

    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 116
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 119
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT_BARCODE:Lcom/ibotta/api/model/common/VerificationType;

    if-ne p1, v0, :cond_0

    .line 120
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->bTakePhotoInstead:Landroid/widget/Button;

    invoke-virtual {p1, v3}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 122
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->bTakePhotoInstead:Landroid/widget/Button;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private onRetailerParcelSet(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRetailerBarcodeConfigurationParcel()Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    move-result-object v0

    .line 88
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->initBarcodeIcon(Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;)V

    .line 89
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->initInstructionsTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 90
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->initInstructionsDetails(Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;)V

    .line 91
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->initTakePhotoInsteadButton(Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;)V

    return-void
.end method


# virtual methods
.method protected onTakePhotoInsteadClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900ac
        }
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->listener:Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView$ReceiptScanFooterListener;

    if-eqz v0, :cond_0

    .line 129
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView$ReceiptScanFooterListener;->onTakePhotoInsteadClicked()V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView$ReceiptScanFooterListener;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->listener:Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView$ReceiptScanFooterListener;

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 74
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->onRetailerParcelSet(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
