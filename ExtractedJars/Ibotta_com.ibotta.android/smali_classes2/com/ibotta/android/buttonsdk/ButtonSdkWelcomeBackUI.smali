.class public Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;
.super Ljava/lang/Object;
.source "ButtonSdkWelcomeBackUI.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog$WelcomeBackDialogListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private welcomeBackDialog:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;)V

    return-void
.end method

.method private trackButtonTxStatus(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
    .locals 5

    const-string v0, "unavailable"

    if-eqz p1, :cond_3

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatusEnum()Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object v1

    sget-object v2, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->COMPLETE:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 75
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatusEnum()Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object p1

    sget-object v2, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->PENDING:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    if-ne p1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v1, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    const-string v0, "available"

    .line 82
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object p1

    const-string v1, "welcome_back_button_data"

    invoke-interface {p1, v1, v0}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected createDialog(Landroid/app/Activity;)Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    const v1, 0x7f120188

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public getListener()Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->listener:Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;

    return-object v0
.end method

.method public getTracker()Lcom/ibotta/android/tracking/Tracker;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->tracker:Lcom/ibotta/android/tracking/Tracker;

    return-object v0
.end method

.method protected notifyTxDataDisplayAttempted()V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->listener:Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;

    if-eqz v0, :cond_0

    .line 87
    invoke-interface {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;->onWelcomeBackDialogDisplayed()V

    :cond_0
    return-void
.end method

.method public onWelcomeBackDialogDisplayed()V
    .locals 0

    .line 102
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->notifyTxDataDisplayAttempted()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->listener:Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;

    return-void
.end method

.method public showWelcomeBackLoadingDialog(Landroid/app/Activity;Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;)V
    .locals 0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->createDialog(Landroid/app/Activity;)Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->welcomeBackDialog:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    .line 66
    iget-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->welcomeBackDialog:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog$WelcomeBackDialogListener;)V

    .line 67
    iget-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->welcomeBackDialog:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->show()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public showWelcomeBackTxDialog(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->trackButtonTxStatus(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->welcomeBackDialog:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    if-nez v0, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->notifyTxDataDisplayAttempted()V

    return-void

    .line 57
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->showTransactionDetails(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V

    return-void
.end method
