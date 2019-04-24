.class public Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;
.super Ljava/lang/Object;
.source "PresenceSDKClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/presence/PresenceSDKClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final appId:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private statusListener:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private useNewAuth:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->useNewAuth:Z

    .line 67
    iput-object p1, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->context:Landroid/content/Context;

    .line 68
    iput-object p2, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->appId:Ljava/lang/String;

    return-void
.end method

.method private areAllPermissionsAvailable(Landroid/content/Context;)V
    .locals 1

    .line 95
    invoke-static {p1}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasFineLocation(Landroid/content/Context;)Z

    move-result v0

    .line 96
    invoke-static {p1}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasReadPhoneState(Landroid/content/Context;)Z

    move-result p1

    if-nez v0, :cond_0

    .line 98
    sget-object v0, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;->LOCATION_PERMISSION_DENIED:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    invoke-direct {p0, v0}, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->notifyStatusListener(Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;)V

    :cond_0
    if-nez p1, :cond_1

    .line 101
    sget-object p1, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;->PHONE_STATE_PERMISSION_DENIED:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->notifyStatusListener(Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;)V

    :cond_1
    return-void
.end method

.method private notifyStatusListener(Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;)V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->statusListener:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener;

    if-eqz v0, :cond_0

    .line 108
    :try_start_0
    invoke-interface {v0, p1}, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener;->onBuildError(Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public build()Lcom/shopkick/sdk/presence/PresenceSDKClient;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->context:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 127
    iget-object v0, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->appId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->context:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->areAllPermissionsAvailable(Landroid/content/Context;)V

    .line 132
    iget-object v0, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->appId:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->useNewAuth:Z

    invoke-static {v0, v1, v2}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->getPresenceSDKClient(Landroid/content/Context;Ljava/lang/String;Z)Lcom/shopkick/sdk/presence/PresenceSDKClient;

    move-result-object v0

    return-object v0

    .line 128
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "appId must be a non-empty string"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setBuildStatusListener(Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener;)Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->statusListener:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener;

    return-object p0
.end method

.method public setUseNewAuth(Z)Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;
    .locals 0

    .line 90
    iput-boolean p1, p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$Builder;->useNewAuth:Z

    return-object p0
.end method
