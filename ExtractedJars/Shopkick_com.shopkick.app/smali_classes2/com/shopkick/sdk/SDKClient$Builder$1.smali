.class Lcom/shopkick/sdk/SDKClient$Builder$1;
.super Ljava/lang/Object;
.source "SDKClient.java"

# interfaces
.implements Lcom/shopkick/sdk/core/ConfigurationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/SDKClient$Builder;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/fetchers/api/APIManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/SDKClient$Builder;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/SDKClient$Builder;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/shopkick/sdk/SDKClient$Builder$1;->this$0:Lcom/shopkick/sdk/SDKClient$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getForcedLocation()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
    .locals 1

    .line 81
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;-><init>()V

    return-object v0
.end method

.method public isExperimentalBatteryImprovementEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWiFiEnabledInBackground()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWiFiEnabledInForeground()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWiFiScanningEnabledWithoutGeofencing()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
