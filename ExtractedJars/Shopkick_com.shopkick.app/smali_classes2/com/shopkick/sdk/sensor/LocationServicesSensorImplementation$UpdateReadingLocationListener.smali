.class Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;
.super Ljava/lang/Object;
.source "LocationServicesSensorImplementation.java"

# interfaces
.implements Lcom/google/android/gms/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "UpdateReadingLocationListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;


# direct methods
.method private constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)V
    .locals 0

    .line 363
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;)V
    .locals 0

    .line 363
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 4

    .line 368
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    new-instance v1, Lcom/shopkick/sdk/sensor/LocationServicesReading;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$600(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/sensor/LocationServicesReading;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v3}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$700(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/core/ConfigurationProvider;

    move-result-object v3

    invoke-direct {v1, v2, p1, v3}, Lcom/shopkick/sdk/sensor/LocationServicesReading;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesReading;Landroid/location/Location;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    invoke-static {v0, v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$602(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Lcom/shopkick/sdk/sensor/LocationServicesReading;)Lcom/shopkick/sdk/sensor/LocationServicesReading;

    .line 371
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$800(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/sensor/ReadingListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 374
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$900(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener$1;

    invoke-direct {v0, p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener$1;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
