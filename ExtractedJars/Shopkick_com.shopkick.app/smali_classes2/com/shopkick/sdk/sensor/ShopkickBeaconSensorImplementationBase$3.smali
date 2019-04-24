.class Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$3;
.super Ljava/lang/Object;
.source "ShopkickBeaconSensorImplementationBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scheduleAScan(ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

.field final synthetic val$scanIndefinitely:Z


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;Z)V
    .locals 0

    .line 368
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$3;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    iput-boolean p2, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$3;->val$scanIndefinitely:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 371
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$3;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    iget-boolean v1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$3;->val$scanIndefinitely:Z

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->scan(Z)V

    return-void
.end method
