.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "LoyaltyCardAddActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;
.implements Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;",
        "Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;"
    }
.end annotation


# static fields
.field private static final ACTION_SHEET_OPTION_HELP_CENTER:I = 0x1

.field private static final ACTION_SHEET_OPTION_INSTRUCTIONS:I = 0x2

.field private static final MAX_PHONE_LENGTH:I = 0xe

.field public static final RESP_CODE_SUCCESS:I = 0x1


# instance fields
.field protected bAddCard:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09007b
    .end annotation
.end field

.field protected bScanCard:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a4
    .end annotation
.end field

.field protected etCardNumber:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901c0
    .end annotation
.end field

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
    .end annotation
.end field

.field protected livInstructions:Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902f7
    .end annotation
.end field

.field private phoneNumWatcher:Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field protected tilCardNumber:Landroid/support/design/widget/TextInputLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09046d
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 67
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initInputField(Ljava/lang/String;Z)V
    .locals 3

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->tilCardNumber:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    .line 278
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setInputType(I)V

    .line 279
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->phoneNumWatcher:Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 280
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v1, v0, p1

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    goto :goto_0

    .line 282
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    const/high16 v0, 0x80000

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setInputType(I)V

    .line 283
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->phoneNumWatcher:Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 284
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    new-array p1, p1, [Landroid/text/InputFilter;

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 287
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$1;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 300
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$2;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method private initInstructions(Ljava/lang/String;)V
    .locals 1

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->livInstructions:Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;->setInstructions(Ljava/lang/String;)V

    return-void
.end method

.method private initLogo()V
    .locals 4

    .line 271
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getLargeCardLogoUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->ivLogo:Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->LOYALTY_CARD_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, p0, v1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initPhoneNumWatcher()V
    .locals 3

    .line 263
    new-instance v0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;-><init>(Landroid/widget/EditText;Lcom/ibotta/android/util/Formatting;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->phoneNumWatcher:Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;

    return-void
.end method

.method private initScanCardButton(Z)V
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->bScanCard:Landroid/widget/Button;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 137
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    goto :goto_0

    .line 138
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 142
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;
    .locals 2

    .line 99
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "retailer"

    .line 100
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public static startForResult(Landroid/app/Activity;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 95
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x18

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 67
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddComponent;
    .locals 1

    .line 112
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;

    move-result-object v0

    .line 113
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;)V

    .line 114
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->loyaltyCardAddModule(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddModule;)Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;

    move-result-object p1

    .line 115
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/DaggerLoyaltyCardAddComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithSuccess(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V
    .locals 3

    .line 219
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "id"

    .line 220
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->getId()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "retailer_id"

    .line 221
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->getRetailerId()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "value"

    .line 222
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "display_value"

    .line 223
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->getDisplayValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 225
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->setResult(ILandroid/content/Intent;)V

    .line 226
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->finish()V

    return-void
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 67
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddComponent;)V
    .locals 0

    .line 120
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)V

    return-void
.end method

.method public onActionSheetOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 2

    .line 332
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 333
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;->onHelpCenterClicked()V

    goto :goto_0

    .line 334
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 335
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;->onHelpInstructionsClicked()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 178
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "barcodes"

    .line 182
    invoke-virtual {p3, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "barcodes"

    .line 184
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableArrayExtra(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    .line 185
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    invoke-static {p1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;->onBarcodeScanned([Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V

    :cond_0
    return-void
.end method

.method protected onAddCardClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007b
        }
    .end annotation

    .line 327
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;->onAddCardClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 125
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 127
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0049

    .line 129
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->setContentView(I)V

    .line 130
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 132
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->initPhoneNumWatcher()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 159
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d000b

    .line 160
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 162
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 167
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f09001c

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 169
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;->onHelpClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 147
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 148
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onScanCardClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a4
        }
    .end annotation

    .line 322
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;->onScanClicked()V

    return-void
.end method

.method public setAddCardAllowed(Z)V
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->bAddCard:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 153
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->initTitle()V

    .line 154
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->initLogo()V

    return-void
.end method

.method public setScannedBarcode(Ljava/lang/String;)V
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleForLoadFailure()V
    .locals 1

    const v0, 0x7f110137

    .line 341
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->setTitle(I)V

    return-void
.end method

.method public setup(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    .line 191
    invoke-direct {p0, p1, p4}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->initInputField(Ljava/lang/String;Z)V

    .line 192
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->initScanCardButton(Z)V

    .line 193
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->initInstructions(Ljava/lang/String;)V

    return-void
.end method

.method public showAddCardFailed()V
    .locals 3

    const v0, 0x7f1103e8

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 203
    invoke-virtual {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method public showHelp()V
    .locals 4

    .line 231
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v1, 0x1

    .line 232
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v1, 0x7f080264

    .line 233
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setIconResId(I)V

    const v1, 0x7f110186

    .line 234
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 236
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v2, 0x2

    .line 237
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v3, 0x7f08026b

    .line 238
    invoke-virtual {v1, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setIconResId(I)V

    const v3, 0x7f110198

    .line 239
    invoke-virtual {v1, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 241
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 246
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;)V

    .line 247
    invoke-virtual {v0, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setOptions(Ljava/util/List;)V

    .line 249
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->show()V

    return-void
.end method

.method public showHelpCenter()V
    .locals 1

    .line 254
    new-instance v0, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showHelpInstructions(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 259
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public showLoyaltyBarcodeScanner(Lcom/ibotta/android/barcode/ScanType;)V
    .locals 1

    .line 209
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/barcode/ScanType;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x7

    .line 208
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
