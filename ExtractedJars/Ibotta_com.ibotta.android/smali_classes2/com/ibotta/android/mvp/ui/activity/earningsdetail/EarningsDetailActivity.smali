.class public Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "EarningsDetailActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;
.implements Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;
.implements Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog$DoubleCheckDialogListener;
.implements Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog$TextCaptureListener;
.implements Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;",
        "Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;",
        "Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog$DoubleCheckDialogListener;",
        "Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog$TextCaptureListener;",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;"
    }
.end annotation


# static fields
.field private static final ACTION_SHEET_OPTION_HELP_CENTER:I = 0x3

.field private static final ACTION_SHEET_OPTION_REPORT_AN_ISSUE:I = 0x2

.field private static final ACTION_SHEET_OPTION_VIEW_RECEIPT:I = 0x1

.field private static final TAG_REPORT_ISSUE_FAILURE:Ljava/lang/String; = "report_issue_failure"

.field private static final TAG_REPORT_ISSUE_SUCCESS:Ljava/lang/String; = "report_issue_success"

.field private static final TAG_REPORT_ISSUE_VALIDATION_FAILURE:Ljava/lang/String; = "report_issue_validation_failure"


# instance fields
.field private abstractToolbarView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailToolbarView;

.field private bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

.field protected ctlCollapsingToolbar:Landroid/support/design/widget/CollapsingToolbarLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090174
    .end annotation
.end field

.field private doubleCheckDialog:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

.field protected edlvEarningsDetailList:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901aa
    .end annotation
.end field

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field private textCaptureDialog:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private buildSheetOptions([Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;",
            ">;"
        }
    .end annotation

    .line 206
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    .line 208
    array-length p1, p1

    if-lez p1, :cond_0

    .line 209
    new-instance p1, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;-><init>()V

    const/4 v1, 0x1

    .line 210
    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setId(I)V

    const v1, 0x7f11020c

    .line 211
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setButtonText(Ljava/lang/String;)V

    .line 212
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    :cond_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;-><init>()V

    const/4 v1, 0x2

    .line 216
    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setId(I)V

    const v1, 0x7f110469

    .line 217
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setButtonText(Ljava/lang/String;)V

    .line 218
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    new-instance p1, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;-><init>()V

    const/4 v1, 0x3

    .line 221
    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setId(I)V

    const v1, 0x7f110186

    .line 222
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->setButtonText(Ljava/lang/String;)V

    .line 223
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private initCollapsingToolbar()V
    .locals 2

    .line 164
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->abstractToolbarView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailToolbarView;

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->ctlCollapsingToolbar:Landroid/support/design/widget/CollapsingToolbarLayout;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->abstractToolbarView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailToolbarView;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/CollapsingToolbarLayout;->addView(Landroid/view/View;)V

    const v0, 0x7f09043a

    .line 167
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 168
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->initToolBar()V

    return-void
.end method

.method private initEarningsDetailList()V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->edlvEarningsDetailList:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->setListener(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1

    .line 146
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    if-eqz p1, :cond_0

    const-string v0, "earning_detail_parcel"

    .line 149
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    goto :goto_0

    .line 150
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 151
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "earning_detail_parcel"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    .line 154
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->setEarningDetailParcel(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V

    return-void
.end method

.method public static newIntent(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)Landroid/content/Intent;
    .locals 2

    .line 84
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "earning_detail_parcel"

    .line 85
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method private onReportIssueFail()V
    .locals 1

    .line 328
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onReportAnIssueFailed()V

    return-void
.end method

.method private onReportIssueSuccess()V
    .locals 2

    .line 323
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->textCaptureDialog:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->dismiss()V

    const-string v0, "report_issue_success"

    const v1, 0x7f1101d6

    .line 324
    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->showErrorMessage(ILjava/lang/String;)V

    return-void
.end method

.method public static start(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 80
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public cancelDialog()V
    .locals 1

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    if-eqz v0, :cond_0

    .line 279
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 51
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;
    .locals 1

    .line 91
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;

    move-result-object v0

    .line 92
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;)V

    .line 93
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->earningsDetailModule(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;

    move-result-object p1

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/DaggerEarningsDetailComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;

    move-result-object p1

    return-object p1
.end method

.method public getAmountPendingSubtitle()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1100a3

    .line 338
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultTitle()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110156

    .line 353
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public getSubtitleProcessing()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1101d7

    .line 348
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTotalEarningsSubtitle()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110636

    .line 343
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected initToolBar()V
    .locals 2

    .line 121
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->initToolBar()V

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v1, 0x7f060171

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setBackgroundResource(I)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 51
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;)V
    .locals 0

    .line 99
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;)V

    return-void
.end method

.method public notifyReportFailure()V
    .locals 0

    .line 319
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->onReportIssueFail()V

    return-void
.end method

.method public notifyReportSuccess()V
    .locals 0

    .line 314
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->onReportIssueSuccess()V

    return-void
.end method

.method public onBonusRowClicked(Lcom/ibotta/api/model/BonusModel;)V
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onBonusRowClicked(Lcom/ibotta/api/model/BonusModel;)V

    return-void
.end method

.method public onBottomButtonsDialogOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)V
    .locals 0

    .line 243
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    .line 254
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onBottomButtonsDialogCancelClicked()V

    goto :goto_0

    .line 248
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onHelpCenterClicked()V

    goto :goto_0

    .line 251
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onReportAnIssueClicked()V

    goto :goto_0

    .line 245
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onViewReceipt()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 104
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 106
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0032

    .line 107
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->setContentView(I)V

    .line 108
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    const/4 p1, 0x0

    .line 109
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->initCollapsingToolbar()V

    .line 111
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->initEarningsDetailList()V

    .line 113
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    const v0, 0x7f1101db

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->initItemType(Ljava/lang/String;)V

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    const v0, 0x7f110646

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->initOffersTitle(Ljava/lang/String;)V

    .line 116
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    const v0, 0x7f110641

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->initBonusesTitle(Ljava/lang/String;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 129
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0005

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 131
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onDoubleCheckContinue()V
    .locals 1

    .line 299
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onDoubleCheckContinue()V

    return-void
.end method

.method public onHelpButtonClicked()V
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onHelpIconClicked()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 136
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f09001c

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 138
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onHelpIconClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 159
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "earning_detail_parcel"

    .line 160
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->getEarningDetailParcel()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSend(Ljava/lang/String;)V
    .locals 2

    .line 304
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f11005a

    const-string v0, "report_issue_validation_failure"

    .line 305
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->showErrorMessage(ILjava/lang/String;)V

    return-void

    .line 309
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;

    invoke-static {}, Lcom/ibotta/android/App;->getProblemReportPhoneData()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;->onReportReadyToSend(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;",
            ">;)V"
        }
    .end annotation

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->edlvEarningsDetailList:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public setupToolbar(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;)V
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->abstractToolbarView:Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailToolbarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailToolbarView;->setup(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;)V

    return-void
.end method

.method public showBonusDetails(Lcom/ibotta/api/model/BonusModel;)V
    .locals 3

    .line 230
    new-instance v0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;-><init>(Landroid/content/Context;)V

    .line 231
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    .line 232
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result p1

    const/4 v2, 0x0

    aput p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 233
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 230
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showDoubleCheckDialog()V
    .locals 1

    .line 271
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->doubleCheckDialog:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->doubleCheckDialog:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->setDoubleCheckDialogListener(Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog$DoubleCheckDialogListener;)V

    .line 273
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->doubleCheckDialog:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->show()V

    return-void
.end method

.method public showHelpCenter()V
    .locals 1

    .line 266
    new-instance v0, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/HelpCenterIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showHelpDialog([Ljava/lang/String;)V
    .locals 1

    .line 197
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->buildSheetOptions([Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 199
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->setOptions(Ljava/util/List;)V

    .line 202
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->bottomButtonsDialog:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->show()V

    return-void
.end method

.method public showReceipt(I)V
    .locals 1

    .line 261
    new-instance v0, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ReceiptViewerIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showReportAnIssueDialog(Ljava/lang/String;)V
    .locals 2

    .line 285
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->doubleCheckDialog:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

    if-eqz v0, :cond_0

    .line 286
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->dismiss()V

    .line 288
    :cond_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->textCaptureDialog:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    .line 289
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->textCaptureDialog:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->setTextCaptureListener(Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog$TextCaptureListener;)V

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->textCaptureDialog:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    const v1, 0x7f11005b

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->setInstructionsTitle(Ljava/lang/String;)V

    .line 291
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->textCaptureDialog:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->setShoppingTripId(Ljava/lang/String;)V

    .line 292
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->textCaptureDialog:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    const v0, 0x7f110142

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->setCancelText(Ljava/lang/String;)V

    .line 293
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->textCaptureDialog:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    const v0, 0x7f1101e8

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->setSendText(Ljava/lang/String;)V

    .line 294
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->textCaptureDialog:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->show()V

    return-void
.end method

.method public showReportAnIssueFailed()V
    .locals 2

    const-string v0, "report_issue_failure"

    const v1, 0x7f11015a

    .line 333
    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->showErrorMessage(ILjava/lang/String;)V

    return-void
.end method
