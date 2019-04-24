.class Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$ShopkickSensorManager;
.super Ljava/lang/Object;
.source "ShopkickPresenceSDKClient.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/SensorManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ShopkickSensorManager"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;


# direct methods
.method private constructor <init>(Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$ShopkickSensorManager;->this$0:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1;)V
    .locals 0

    .line 329
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$ShopkickSensorManager;-><init>(Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;)V

    return-void
.end method


# virtual methods
.method public getSensor(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/SensorImplementation;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 334
    const-class v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    if-ne p1, v0, :cond_0

    .line 335
    iget-object p1, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$ShopkickSensorManager;->this$0:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;

    invoke-static {p1}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->access$100(Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;)Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    move-result-object p1

    return-object p1

    .line 336
    :cond_0
    const-class v0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    if-ne p1, v0, :cond_1

    .line 337
    iget-object p1, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$ShopkickSensorManager;->this$0:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;

    invoke-static {p1}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->access$200(Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;)Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
