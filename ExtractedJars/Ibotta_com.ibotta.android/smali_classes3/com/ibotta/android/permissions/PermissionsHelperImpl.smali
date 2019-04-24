.class public Lcom/ibotta/android/permissions/PermissionsHelperImpl;
.super Ljava/lang/Object;
.source "PermissionsHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;
.implements Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$PromptDialogListener;
.implements Lcom/ibotta/android/permissions/PermissionsHelper;


# static fields
.field private static final TAG_PERMISSIONS_NOTICE:Ljava/lang/String; = "permissions_notice"

.field private static final TAG_PERMISSIONS_PERMANENTLY_DENIED:Ljava/lang/String; = "permissions_permanently_denied"


# instance fields
.field private final activity:Landroid/support/v4/app/FragmentActivity;

.field private final area:Lcom/ibotta/android/state/app/permissions/Area;

.field private final copy:Lcom/ibotta/android/permissions/Copy;

.field private final listener:Lcom/ibotta/android/permissions/PermissionsListener;

.field private final permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

.field private final permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentActivity;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;Lcom/ibotta/android/permissions/PermissionsListener;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->activity:Landroid/support/v4/app/FragmentActivity;

    .line 55
    iput-object p2, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    .line 56
    iput-object p3, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    .line 57
    iput-object p4, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    .line 58
    iput-object p5, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->area:Lcom/ibotta/android/state/app/permissions/Area;

    .line 59
    iput-object p6, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->copy:Lcom/ibotta/android/permissions/Copy;

    .line 60
    iput-object p7, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->listener:Lcom/ibotta/android/permissions/PermissionsListener;

    return-void
.end method

.method public static synthetic lambda$hasLocationPermissions$0(Lcom/ibotta/android/permissions/PermissionsHelperImpl;Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    .line 208
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->hasPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method private showPermanentlyDeniedDialog()V
    .locals 4

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermanentDenialMsg()I

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->activity:Landroid/support/v4/app/FragmentActivity;

    iget-object v1, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    .line 148
    invoke-virtual {v1}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermanentDenialMsg()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;

    move-result-object v0

    .line 149
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 150
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->activity:Landroid/support/v4/app/FragmentActivity;

    check-cast v2, Lcom/ibotta/android/mvp/base/MvpActivity;

    const-string v3, "permissions_permanently_denied"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    goto :goto_0

    .line 152
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->notifyPermissionsPermanentlyDenied()V

    :goto_0
    return-void
.end method


# virtual methods
.method public hasLocationPermissions(Landroid/content/Context;)Z
    .locals 2

    .line 207
    sget-object v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/J8Arrays;->stream([Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/permissions/-$$Lambda$PermissionsHelperImpl$KMZjLucr6YHnVcMGWTn44N_vzLE;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/permissions/-$$Lambda$PermissionsHelperImpl$KMZjLucr6YHnVcMGWTn44N_vzLE;-><init>(Lcom/ibotta/android/permissions/PermissionsHelperImpl;Landroid/content/Context;)V

    .line 208
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 209
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    const-string v0, ""

    .line 210
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public hasPermission(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    .line 90
    invoke-static {p1, p2}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isPermanentlyDenied(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z
    .locals 5

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/permissions/PermissionsState;->isPermissionPreviouslyAsked(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 163
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v3, p1, v1

    .line 164
    iget-object v4, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->activity:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v4, v3}, Landroid/support/v4/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method protected notifyPermissionsAccepted()V
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->listener:Lcom/ibotta/android/permissions/PermissionsListener;

    if-eqz v0, :cond_0

    .line 216
    invoke-interface {v0}, Lcom/ibotta/android/permissions/PermissionsListener;->onPermissionsAccepted()V

    :cond_0
    return-void
.end method

.method protected notifyPermissionsDenied()V
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->listener:Lcom/ibotta/android/permissions/PermissionsListener;

    if-eqz v0, :cond_0

    .line 222
    invoke-interface {v0}, Lcom/ibotta/android/permissions/PermissionsListener;->onPermissionsDenied()V

    :cond_0
    return-void
.end method

.method protected notifyPermissionsPermanentlyDenied()V
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->listener:Lcom/ibotta/android/permissions/PermissionsListener;

    if-eqz v0, :cond_0

    .line 228
    invoke-interface {v0}, Lcom/ibotta/android/permissions/PermissionsListener;->onPermissionsPermanentlyDenied()V

    :cond_0
    return-void
.end method

.method public onChoice(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "permissions_notice"

    .line 189
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, 0x7f110171

    if-ne p2, p1, :cond_0

    .line 192
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->requestPermissionsFromSystem()V

    const/4 p1, 0x1

    goto :goto_0

    .line 195
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->notifyPermissionsDenied()V

    const/4 p1, 0x0

    .line 199
    :goto_0
    iget-object p2, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    sget-object v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->area:Lcom/ibotta/android/state/app/permissions/Area;

    if-eqz p2, :cond_1

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    invoke-virtual {p2}, Lcom/ibotta/android/state/app/permissions/Area;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/tracking/Tracker;->locationPreAuth(Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method

.method public onDialogFragmentCancelled(Ljava/lang/String;)V
    .locals 1

    const-string v0, "permissions_notice"

    .line 175
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 176
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->notifyPermissionsDenied()V

    :cond_0
    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "permissions_permanently_denied"

    .line 182
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 183
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->notifyPermissionsPermanentlyDenied()V

    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 5

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    return-void

    .line 107
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/app/permissions/PermissionsState;->setPermissionPreviouslyAsked(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)V

    .line 109
    iget-object p1, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 111
    :goto_0
    array-length v3, p2

    if-ge v1, v3, :cond_2

    .line 112
    aget-object v3, p2, v1

    .line 113
    aget v4, p3, v1

    .line 114
    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 120
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ne v2, p1, :cond_3

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->notifyPermissionsAccepted()V

    const/4 v0, 0x1

    goto :goto_1

    .line 124
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->notifyPermissionsDenied()V

    .line 128
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    sget-object p2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    if-ne p1, p2, :cond_4

    iget-object p1, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->area:Lcom/ibotta/android/state/app/permissions/Area;

    if-eqz p1, :cond_4

    .line 129
    iget-object p2, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/permissions/Area;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, v0}, Lcom/ibotta/android/tracking/Tracker;->locationRealAuth(Ljava/lang/String;Z)V

    :cond_4
    return-void
.end method

.method public requestLocationPermissionDirectly()V
    .locals 0

    .line 135
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->requestPermissionsFromSystem()V

    return-void
.end method

.method public requestPermissions()V
    .locals 6

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->activity:Landroid/support/v4/app/FragmentActivity;

    instance-of v1, v1, Lcom/ibotta/android/mvp/base/MvpActivity;

    if-nez v1, :cond_0

    goto :goto_3

    .line 70
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    .line 71
    iget-object v5, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->activity:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {p0, v5, v4}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->hasPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v2, :cond_4

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->isPermanentlyDenied(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->showPermanentlyDeniedDialog()V

    goto :goto_2

    .line 81
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->showPrePermissionDialog()V

    goto :goto_2

    .line 84
    :cond_4
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->notifyPermissionsAccepted()V

    :goto_2
    return-void

    :cond_5
    :goto_3
    return-void
.end method

.method protected requestPermissionsFromSystem()V
    .locals 3

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->activity:Landroid/support/v4/app/FragmentActivity;

    iget-object v1, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    .line 96
    invoke-virtual {v1}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->getPermissions()[Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xd

    .line 94
    invoke-static {v0, v1, v2}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void
.end method

.method protected showPrePermissionDialog()V
    .locals 4

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->copy:Lcom/ibotta/android/permissions/Copy;

    .line 140
    invoke-virtual {v0}, Lcom/ibotta/android/permissions/Copy;->getTitle()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->copy:Lcom/ibotta/android/permissions/Copy;

    invoke-virtual {v1}, Lcom/ibotta/android/permissions/Copy;->getBody()Ljava/lang/String;

    move-result-object v1

    .line 139
    invoke-static {v0, v1}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;

    move-result-object v0

    .line 141
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 142
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/permissions/PermissionsHelperImpl;->activity:Landroid/support/v4/app/FragmentActivity;

    check-cast v2, Lcom/ibotta/android/mvp/base/MvpActivity;

    const-string v3, "permissions_notice"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method
