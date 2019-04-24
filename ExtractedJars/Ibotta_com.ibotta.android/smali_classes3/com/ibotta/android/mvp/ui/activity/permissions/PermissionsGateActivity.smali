.class public Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "PermissionsGateActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;
.implements Lcom/ibotta/android/permissions/PermissionsListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;",
        "Lcom/ibotta/android/permissions/PermissionsListener;"
    }
.end annotation


# instance fields
.field private afterIntent:Landroid/content/Intent;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field protected permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private reason:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private requestCode:I

.field private skipDialogAllowed:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)Z
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v2, "request_code"

    .line 78
    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->requestCode:I

    const-string v0, "permission_profile"

    .line 79
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->fromString(Ljava/lang/String;)Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    const-string v0, "reason"

    .line 80
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->reason:Ljava/lang/String;

    const-string v0, "after_intent"

    .line 81
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->afterIntent:Landroid/content/Intent;

    const-string v0, "allow_skip"

    .line 82
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->skipDialogAllowed:Z

    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 84
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "request_code"

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->requestCode:I

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "permission_profile"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->fromString(Ljava/lang/String;)Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    .line 86
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "reason"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->reason:Ljava/lang/String;

    .line 87
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "after_intent"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->afterIntent:Landroid/content/Intent;

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "allow_skip"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->skipDialogAllowed:Z

    .line 91
    :cond_1
    :goto_0
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->skipDialogAllowed:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->reason:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    if-nez p1, :cond_3

    :cond_2
    const-string p1, "Permission gate used, but permission profile or the reason could not be determined."

    .line 92
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private requestPermission(Lcom/ibotta/android/permissions/PermissionsHelper;)V
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->skipDialogAllowed:Z

    if-eqz v0, :cond_0

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;->skipGatedDialogAndShowLocationPrompt()V

    goto :goto_0

    .line 103
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/android/permissions/PermissionsHelper;->requestPermissions()V

    :goto_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 30
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateComponent;
    .locals 1

    .line 49
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/permissions/DaggerPermissionsGateComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/permissions/DaggerPermissionsGateComponent$Builder;

    move-result-object v0

    .line 50
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/DaggerPermissionsGateComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/permissions/DaggerPermissionsGateComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;)V

    .line 51
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/permissions/DaggerPermissionsGateComponent$Builder;->permissionsGateModule(Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateModule;)Lcom/ibotta/android/mvp/ui/activity/permissions/DaggerPermissionsGateComponent$Builder;

    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/DaggerPermissionsGateComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateComponent;

    move-result-object p1

    return-object p1
.end method

.method protected getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 30
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateComponent;)V
    .locals 0

    .line 57
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 125
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/MvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 127
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->requestCode:I

    if-ne v0, p1, :cond_0

    .line 128
    invoke-virtual {p0, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->setResult(ILandroid/content/Intent;)V

    .line 130
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 62
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "onCreate"

    const/4 v1, 0x0

    .line 63
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->loadState(Landroid/os/Bundle;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 66
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;->onLoadStateFailed()V

    return-void

    .line 70
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->reason:Ljava/lang/String;

    invoke-virtual {p1, p0, v0, v1, p0}, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->createGenericPermissionsHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Lcom/ibotta/android/permissions/PermissionsListener;)Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object p1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;->setPermissionsHelper(Lcom/ibotta/android/permissions/PermissionsHelper;)V

    .line 73
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->requestPermission(Lcom/ibotta/android/permissions/PermissionsHelper;)V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "onNewIntent"

    const/4 v1, 0x0

    .line 135
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 137
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->setIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onPermissionsAccepted()V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->requestCode:I

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;->onPermissionsAccepted(I)V

    return-void
.end method

.method public onPermissionsDenied()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;->onPermissionsDenied()V

    return-void
.end method

.method public onPermissionsPermanentlyDenied()V
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;->onPermissionsDenied()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;

    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 109
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    if-eqz v0, :cond_0

    const-string v1, "permission_profile"

    .line 111
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v0, "reason"

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->reason:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "after_intent"

    .line 114
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->afterIntent:Landroid/content/Intent;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "request_code"

    .line 115
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->requestCode:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public startAfterIntent()V
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->afterIntent:Landroid/content/Intent;

    if-nez v0, :cond_0

    const-string v0, "After intent could not be determined."

    const/4 v1, 0x0

    .line 158
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 162
    :cond_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public startAfterIntentForResult()V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->afterIntent:Landroid/content/Intent;

    if-nez v0, :cond_0

    const-string v0, "After intent could not be determined."

    const/4 v1, 0x0

    .line 168
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 172
    :cond_0
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->requestCode:I

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
