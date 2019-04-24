.class public Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "VerifyWizardActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;"
    }
.end annotation


# static fields
.field public static final RESULT_CODE_FAIL:I = 0x0

.field public static final RESULT_CODE_SUCCESS:I = 0x1

.field private static final TAG_LOAD_OFFER_ERROR:Ljava/lang/String; = "load_offer_error"


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private currentPageIndex:I

.field protected llMainContent:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090316
    .end annotation
.end field

.field private offerId:I

.field private pages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;",
            ">;"
        }
    .end annotation
.end field

.field private retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field protected tvInitializing:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090532
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field

.field protected tvQuestion:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090562
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    const/4 v0, 0x0

    .line 67
    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->currentPageIndex:I

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->pages:Ljava/util/List;

    return-void
.end method

.method private finishWithResult(I)V
    .locals 0

    .line 302
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->setResult(I)V

    .line 303
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->finish()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)Z
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v2, "retailer"

    .line 111
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const-string v2, "offer_id"

    .line 112
    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->offerId:I

    const-string v2, "current_page_index"

    .line 113
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->currentPageIndex:I

    const-string v2, "pages"

    .line 116
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-result-object p1

    .line 117
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->pages:Ljava/util/List;

    goto :goto_0

    .line 118
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p1, "loadSavedState on intent"

    .line 119
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "retailer"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "offer_id"

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->offerId:I

    .line 124
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->offerId:I

    if-ne p1, v0, :cond_2

    goto :goto_1

    .line 130
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->offerId:I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->currentPageIndex:I

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->pages:Ljava/util/List;

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;->setData(ILcom/ibotta/android/fragment/retailer/RetailerParcel;ILjava/util/List;)V

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    const-string p1, "Failed to recover saved state."

    .line 125
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->finishWithError()V

    return v1
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardComponent;
    .locals 1

    .line 73
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/DaggerVerifyWizardComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/DaggerVerifyWizardComponent$Builder;

    move-result-object v0

    .line 74
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/DaggerVerifyWizardComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/DaggerVerifyWizardComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;)V

    .line 75
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/DaggerVerifyWizardComponent$Builder;->verifyWizardModule(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/DaggerVerifyWizardComponent$Builder;

    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/DaggerVerifyWizardComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithCancel()V
    .locals 3

    const-string v0, "finishWithError"

    const/4 v1, 0x0

    .line 283
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->finishWithResult(I)V

    return-void
.end method

.method public finishWithError()V
    .locals 3

    const-string v0, "finishWithError"

    const/4 v1, 0x0

    .line 292
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->finishWithResult(I)V

    return-void
.end method

.method public finishWithSuccess()V
    .locals 2

    const-string v0, "finishWithSuccess"

    const/4 v1, 0x0

    .line 274
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 275
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->finishWithResult(I)V

    return-void
.end method

.method public initYesNoPage(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;)V
    .locals 5

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvQuestion:Landroid/widget/TextView;

    const v1, 0x7f11066e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 181
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->getMultiplesCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v2, "%1$d x %2$s"

    const/4 v3, 0x2

    .line 183
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v1

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->getName()Ljava/lang/String;

    move-result-object p1

    .line 185
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvName:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 41
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardComponent;)V
    .locals 0

    .line 81
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 222
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 224
    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p3, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;->setIsExpectingActivityResult(Z)V

    const/16 p3, 0xc

    if-ne p1, p3, :cond_1

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    .line 228
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;->onScanSuccess()V

    goto :goto_0

    .line 231
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;->onScanFailed()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;->onBackPressed()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 86
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "onCreate"

    const/4 v1, 0x0

    .line 87
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    const v0, 0x7f0c007b

    .line 89
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->setContentView(I)V

    .line 92
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->loadState(Landroid/os/Bundle;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 93
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->finishWithError()V

    return-void

    .line 97
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x106000d

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/Toolbar;->setBackgroundColor(I)V

    .line 99
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    const-string p1, ""

    .line 100
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected onNoClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090095
        }
    .end annotation

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;->onNoClicked()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 141
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->pages:Ljava/util/List;

    if-nez v0, :cond_0

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->pages:Ljava/util/List;

    :cond_0
    const-string v0, "retailer"

    .line 146
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "offer_id"

    .line 147
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->offerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "current_page_index"

    .line 148
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->currentPageIndex:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "pages"

    .line 149
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->pages:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/os/Parcelable;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onYesClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900b4
        }
    .end annotation

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;->onYesClicked()V

    return-void
.end method

.method public setInitializing(Z)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x4

    if-eqz p1, :cond_0

    .line 165
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvInitializing:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 166
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->llMainContent:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 168
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvInitializing:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 169
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->llMainContent:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setPages(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;",
            ">;)V"
        }
    .end annotation

    .line 209
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->pages:Ljava/util/List;

    return-void
.end method

.method public setTitleForCurrentPage(II)V
    .locals 2

    const/4 v0, 0x2

    .line 204
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    const p1, 0x7f11066f

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showErrorMessage()V
    .locals 2

    const-string v0, "load_offer_error"

    const v1, 0x7f11066d

    .line 193
    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->showErrorMessage(ILjava/lang/String;)V

    return-void
.end method

.method public startScanActivity(Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V
    .locals 3

    .line 262
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 263
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setTitle(Ljava/lang/String;)V

    .line 264
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;->setIsExpectingActivityResult(Z)V

    .line 265
    new-instance v1, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, p0, v0, p1}, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/Integer;Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V

    invoke-virtual {v1}, Lcom/ibotta/android/routing/intent/VerifyScanIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0xc

    .line 266
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
