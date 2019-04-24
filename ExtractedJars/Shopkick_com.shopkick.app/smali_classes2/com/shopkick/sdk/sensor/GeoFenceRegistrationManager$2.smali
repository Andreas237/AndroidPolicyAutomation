.class Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$2;
.super Ljava/lang/Object;
.source "GeoFenceRegistrationManager.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)V
    .locals 0

    .line 664
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$2;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 668
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$2;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$900(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 669
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$2;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v1, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$1000(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Landroid/location/Location;)V

    .line 670
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    return-void
.end method
