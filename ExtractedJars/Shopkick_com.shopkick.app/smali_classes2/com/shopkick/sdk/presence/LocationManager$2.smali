.class Lcom/shopkick/sdk/presence/LocationManager$2;
.super Ljava/lang/Object;
.source "LocationManager.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/ReadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/presence/LocationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/sensor/ReadingListener<",
        "Lcom/shopkick/sdk/sensor/LocationServicesReading;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/presence/LocationManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/presence/LocationManager;)V
    .locals 0

    .line 356
    iput-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager$2;->this$0:Lcom/shopkick/sdk/presence/LocationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V
    .locals 0

    .line 359
    iget-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager$2;->this$0:Lcom/shopkick/sdk/presence/LocationManager;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->access$100(Lcom/shopkick/sdk/presence/LocationManager;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V

    .line 360
    iget-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager$2;->this$0:Lcom/shopkick/sdk/presence/LocationManager;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->access$200(Lcom/shopkick/sdk/presence/LocationManager;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V

    .line 362
    iget-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager$2;->this$0:Lcom/shopkick/sdk/presence/LocationManager;

    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationReadingToHistory(Landroid/location/Location;)V

    .line 363
    iget-object p1, p0, Lcom/shopkick/sdk/presence/LocationManager$2;->this$0:Lcom/shopkick/sdk/presence/LocationManager;

    invoke-static {p1}, Lcom/shopkick/sdk/presence/LocationManager;->access$300(Lcom/shopkick/sdk/presence/LocationManager;)V

    return-void
.end method

.method public bridge synthetic onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 356
    check-cast p2, Lcom/shopkick/sdk/sensor/LocationServicesReading;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/presence/LocationManager$2;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V

    return-void
.end method
