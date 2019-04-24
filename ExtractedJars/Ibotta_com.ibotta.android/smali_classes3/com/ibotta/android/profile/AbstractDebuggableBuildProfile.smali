.class public abstract Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;
.super Lcom/ibotta/android/profile/AbstractBuildProfile;
.source "AbstractDebuggableBuildProfile.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0016\u001a\u00020\u000cH\u0016R\u0014\u0010\u0007\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u000cX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000cX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000cX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000cX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000cX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;",
        "Lcom/ibotta/android/profile/AbstractBuildProfile;",
        "context",
        "Landroid/content/Context;",
        "profileDebugStateCallback",
        "Lcom/ibotta/android/profile/ProfileDebugStateCallback;",
        "(Landroid/content/Context;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)V",
        "apiUrl",
        "",
        "getApiUrl",
        "()Ljava/lang/String;",
        "isDebugAppsFlyer",
        "",
        "()Z",
        "isDebugButtonSdkLogging",
        "isDebugInternalTracking",
        "isDebugMenuAvailable",
        "isGeofenceDebuggingEnabled",
        "maxCardsPerRow",
        "",
        "getMaxCardsPerRow",
        "()I",
        "shouldAllowApiUrlOverride",
        "ibotta-profile_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final isDebugAppsFlyer:Z

.field private final isDebugButtonSdkLogging:Z

.field private final isDebugInternalTracking:Z

.field private final isDebugMenuAvailable:Z

.field private final isGeofenceDebuggingEnabled:Z

.field private final profileDebugStateCallback:Lcom/ibotta/android/profile/ProfileDebugStateCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/profile/ProfileDebugStateCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "profileDebugStateCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, p1}, Lcom/ibotta/android/profile/AbstractBuildProfile;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->profileDebugStateCallback:Lcom/ibotta/android/profile/ProfileDebugStateCallback;

    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isDebugMenuAvailable:Z

    .line 24
    iput-boolean p1, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isGeofenceDebuggingEnabled:Z

    .line 25
    iput-boolean p1, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isDebugButtonSdkLogging:Z

    .line 26
    iput-boolean p1, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isDebugInternalTracking:Z

    .line 27
    iput-boolean p1, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isDebugAppsFlyer:Z

    return-void
.end method


# virtual methods
.method public getApiUrl()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->profileDebugStateCallback:Lcom/ibotta/android/profile/ProfileDebugStateCallback;

    invoke-interface {v0}, Lcom/ibotta/android/profile/ProfileDebugStateCallback;->getDebugApiUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/profile/AbstractBuildProfile;->getApiUrl()Ljava/lang/String;

    move-result-object v0

    const-string v1, "super.apiUrl"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public getMaxCardsPerRow()I
    .locals 2

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->profileDebugStateCallback:Lcom/ibotta/android/profile/ProfileDebugStateCallback;

    invoke-interface {v0}, Lcom/ibotta/android/profile/ProfileDebugStateCallback;->getColumns()Lcom/ibotta/android/profile/GalleryColumns;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/android/profile/GalleryColumns;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 20
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    invoke-super {p0}, Lcom/ibotta/android/profile/AbstractBuildProfile;->getMaxCardsPerRow()I

    move-result v0

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x2

    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isDebugAppsFlyer()Z
    .locals 1

    .line 27
    iget-boolean v0, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isDebugAppsFlyer:Z

    return v0
.end method

.method public isDebugButtonSdkLogging()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isDebugButtonSdkLogging:Z

    return v0
.end method

.method public isDebugInternalTracking()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isDebugInternalTracking:Z

    return v0
.end method

.method public isDebugMenuAvailable()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isDebugMenuAvailable:Z

    return v0
.end method

.method public isGeofenceDebuggingEnabled()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/ibotta/android/profile/AbstractDebuggableBuildProfile;->isGeofenceDebuggingEnabled:Z

    return v0
.end method

.method public shouldAllowApiUrlOverride()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
