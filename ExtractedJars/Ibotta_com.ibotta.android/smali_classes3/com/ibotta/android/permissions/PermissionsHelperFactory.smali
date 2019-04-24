.class public Lcom/ibotta/android/permissions/PermissionsHelperFactory;
.super Ljava/lang/Object;
.source "PermissionsHelperFactory.java"


# instance fields
.field private final permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->tracker:Lcom/ibotta/android/tracking/Tracker;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    return-void
.end method


# virtual methods
.method public createGenericPermissionsHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;Lcom/ibotta/android/permissions/PermissionsListener;)Lcom/ibotta/android/permissions/PermissionsHelper;
    .locals 9

    .line 32
    new-instance v8, Lcom/ibotta/android/permissions/PermissionsHelperImpl;

    iget-object v2, p0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->tracker:Lcom/ibotta/android/tracking/Tracker;

    iget-object v3, p0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    move-object v0, v8

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;-><init>(Landroid/support/v4/app/FragmentActivity;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;Lcom/ibotta/android/permissions/PermissionsListener;)V

    return-object v8
.end method

.method public createGenericPermissionsHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Lcom/ibotta/android/permissions/PermissionsListener;)Lcom/ibotta/android/permissions/PermissionsHelper;
    .locals 8

    .line 40
    new-instance v6, Lcom/ibotta/android/permissions/Copy;

    invoke-direct {v6}, Lcom/ibotta/android/permissions/Copy;-><init>()V

    const v0, 0x7f110246

    .line 41
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/ibotta/android/permissions/Copy;->setTitle(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v6, p3}, Lcom/ibotta/android/permissions/Copy;->setBody(Ljava/lang/String;)V

    .line 44
    new-instance p3, Lcom/ibotta/android/permissions/PermissionsHelperImpl;

    iget-object v2, p0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->tracker:Lcom/ibotta/android/tracking/Tracker;

    iget-object v3, p0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    const/4 v5, 0x0

    move-object v0, p3

    move-object v1, p1

    move-object v4, p2

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;-><init>(Landroid/support/v4/app/FragmentActivity;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;Lcom/ibotta/android/permissions/PermissionsListener;)V

    return-object p3
.end method

.method public createLocationPermissionsHelper(Landroid/support/v4/app/FragmentActivity;Lcom/ibotta/android/permissions/PermissionsListener;)Lcom/ibotta/android/permissions/PermissionsHelper;
    .locals 9

    .line 49
    new-instance v6, Lcom/ibotta/android/permissions/Copy;

    invoke-direct {v6}, Lcom/ibotta/android/permissions/Copy;-><init>()V

    const v0, 0x7f110246

    .line 50
    invoke-virtual {p1, v0}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/ibotta/android/permissions/Copy;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f110245

    .line 51
    invoke-virtual {p1, v0}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/ibotta/android/permissions/Copy;->setBody(Ljava/lang/String;)V

    .line 53
    new-instance v8, Lcom/ibotta/android/permissions/PermissionsHelperImpl;

    iget-object v2, p0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->tracker:Lcom/ibotta/android/tracking/Tracker;

    iget-object v3, p0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    sget-object v4, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/permissions/PermissionsHelperImpl;-><init>(Landroid/support/v4/app/FragmentActivity;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/state/app/permissions/PermissionsState;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Lcom/ibotta/android/state/app/permissions/Area;Lcom/ibotta/android/permissions/Copy;Lcom/ibotta/android/permissions/PermissionsListener;)V

    return-object v8
.end method
