.class Lcom/shopkick/app/application/SKApp$3;
.super Ljava/lang/Object;
.source "SKApp.java"

# interfaces
.implements Lcom/shopkick/comm/GeoLocation$LocationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/SKApp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/SKApp;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/SKApp;)V
    .locals 0

    .line 1946
    iput-object p1, p0, Lcom/shopkick/app/application/SKApp$3;->this$0:Lcom/shopkick/app/application/SKApp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrentLocation()Landroid/location/Location;
    .locals 1

    .line 1952
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$3;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$3;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isSendLocationHeaderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1954
    :try_start_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1957
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
