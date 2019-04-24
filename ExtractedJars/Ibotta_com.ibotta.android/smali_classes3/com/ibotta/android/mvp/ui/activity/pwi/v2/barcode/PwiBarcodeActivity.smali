.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "PwiBarcodeActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;"
    }
.end annotation


# static fields
.field protected static final ACITON_SHEET_ENTER_AMOUNT_SPENT:I = 0x1

.field protected static final ACITON_SHEET_ENTER_REMAINING_BALANCE:I = 0x2

.field protected static final ACTION_SHEET_MARK_SPENT:I = 0x3

.field private static final KEYBOARD_SHOW_DELAY:J

.field private static final MAX_BRIGHTNESS:F = 0.75f


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected llContentContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090304
    .end annotation
.end field

.field protected pbvBarcodeView:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090399
    .end annotation
.end field

.field private resultCode:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 51
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->KEYBOARD_SHOW_DELAY:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    const/4 v0, 0x3

    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->resultCode:Ljava/lang/Integer;

    return-void
.end method

.method private initAutoBrightness()V
    .locals 2

    .line 113
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "screen_brightness"

    invoke-static {v0, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v0

    div-int/lit16 v0, v0, 0xff
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-float v0, v0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    const/high16 v1, 0x3f400000    # 0.75f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 120
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    :cond_0
    return-void
.end method

.method public static synthetic lambda$onUpdateBalanceClick$0(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;->onUpdateBalanceActionsDialogClicked(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V

    return-void
.end method

.method public static synthetic lambda$showEditUpdateBalanceDialog$1(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;ILcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 200
    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p4, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    invoke-virtual {p3}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->getText()Landroid/text/Editable;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p4, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;->onUpdateBalanceReceived(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$showEditUpdateBalanceDialog$2(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->showSoftKeyboard(Landroid/view/View;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, ""

    if-eqz p1, :cond_0

    const-string v0, "bgc_txn_id"

    .line 99
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "bgc_txn_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 104
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;->setTransactionId(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;)V
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->pbvBarcodeView:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->bindViewEvents(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 47
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeComponent;
    .locals 1

    .line 67
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/DaggerPwiBarcodeComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/DaggerPwiBarcodeComponent$Builder;

    move-result-object v0

    .line 68
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/DaggerPwiBarcodeComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/DaggerPwiBarcodeComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;)V

    .line 69
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/DaggerPwiBarcodeComponent$Builder;->pwiBarcodeModule(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/DaggerPwiBarcodeComponent$Builder;

    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/DaggerPwiBarcodeComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeComponent;

    move-result-object p1

    return-object p1
.end method

.method public finish()V
    .locals 2

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->resultCode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->setResult(I)V

    .line 211
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f010039

    .line 212
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->overridePendingTransition(II)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 47
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeComponent;)V
    .locals 0

    .line 75
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;)V

    return-void
.end method

.method protected isBackSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onCopyBarcodeClick()V
    .locals 2

    const v0, 0x7f11014b

    const/4 v1, 0x0

    .line 233
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 80
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f010038

    const/4 v1, 0x0

    .line 82
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->overridePendingTransition(II)V

    .line 84
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c005b

    .line 86
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->setContentView(I)V

    .line 88
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v0, 0x7f0800a1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/Toolbar;->setBackgroundResource(I)V

    .line 91
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->llContentContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->initBottomSheetBehavior(Landroid/widget/LinearLayout;)V

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->initAutoBrightness()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 132
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0011

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 134
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 139
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090020

    if-eq v0, v1, :cond_0

    .line 145
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 141
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;->onModalCloseClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 126
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "bgc_txn_id"

    .line 127
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;->getTransactionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onSpentToggled()V
    .locals 1

    const/4 v0, 0x4

    .line 243
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->resultCode:Ljava/lang/Integer;

    return-void
.end method

.method public onTermsOfUseClick(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 1

    .line 238
    sget-object v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;->Companion:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;

    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;->getNO_OP()Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/ibotta/android/views/messages/alert/SemiModal;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/SemiModal;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModal;->show()V

    return-void
.end method

.method protected onTopSpacingClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0905bd
        }
    .end annotation

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;->onModalTopSpacingClicked()V

    return-void
.end method

.method public onUpdateBalanceClick(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 5

    .line 156
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v1, 0x1

    .line 157
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v1, 0x7f1104f9

    .line 158
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 160
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v2, 0x2

    .line 161
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v2, 0x7f1104fb

    .line 162
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 164
    new-instance v2, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v3, 0x3

    .line 165
    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    .line 166
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->isSpent()Z

    move-result v4

    if-eqz v4, :cond_0

    const v4, 0x7f110514

    goto :goto_0

    :cond_0
    const v4, 0x7f110513

    :goto_0
    invoke-virtual {v2, v4}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 168
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 174
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$3JmuhVeZpSqfsL5gHR5YpTDgWL8;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$3JmuhVeZpSqfsL5gHR5YpTDgWL8;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;)V

    .line 175
    invoke-virtual {v0, v4}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setOptions(Ljava/util/List;)V

    .line 177
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->show()V

    return-void
.end method

.method public showEditUpdateBalanceDialog(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;I)V
    .locals 7
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 183
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x2

    if-ne p2, v1, :cond_0

    const v2, 0x7f1104fb

    goto :goto_0

    :cond_0
    const v2, 0x7f1104f9

    .line 184
    :goto_0
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    if-ne p2, v1, :cond_1

    const v1, 0x7f1104fc

    goto :goto_1

    :cond_1
    const v1, 0x7f1104fa

    .line 186
    :goto_1
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 189
    new-instance v1, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;-><init>(Landroid/content/Context;)V

    .line 190
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07017b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 191
    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 192
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v4, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/4 v5, 0x0

    .line 194
    invoke-virtual {v4, v2, v2, v2, v5}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 195
    invoke-virtual {v1, v4}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 196
    invoke-virtual {v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 198
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f110548

    .line 199
    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;

    invoke-direct {v3, p0, p1, p2, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;ILcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const p2, 0x7f110547

    const/4 v2, 0x0

    .line 201
    invoke-virtual {v0, p2, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 203
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/AlertDialog;->show()V

    .line 204
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getGiftCardAmount()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setHint(Ljava/lang/CharSequence;)V

    .line 205
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->handler:Landroid/os/Handler;

    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$NbmURgJ6K4oYf1aideYigDsAAZQ;

    invoke-direct {p2, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$NbmURgJ6K4oYf1aideYigDsAAZQ;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V

    sget-wide v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->KEYBOARD_SHOW_DELAY:J

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 2

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->pbvBarcodeView:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->pbvBarcodeView:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->updateViewState(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    return-void
.end method
