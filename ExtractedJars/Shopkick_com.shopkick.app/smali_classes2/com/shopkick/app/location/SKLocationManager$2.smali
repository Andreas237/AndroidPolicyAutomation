.class Lcom/shopkick/app/location/SKLocationManager$2;
.super Ljava/lang/Object;
.source "SKLocationManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/SKLocationManager;->addRequestToLocationClient(JFILcom/google/android/gms/location/LocationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/SKLocationManager;

.field final synthetic val$listener:Lcom/google/android/gms/location/LocationListener;

.field final synthetic val$minDistance:F

.field final synthetic val$minTime:J

.field final synthetic val$priority:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/SKLocationManager;JFILcom/google/android/gms/location/LocationListener;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager$2;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    iput-wide p2, p0, Lcom/shopkick/app/location/SKLocationManager$2;->val$minTime:J

    iput p4, p0, Lcom/shopkick/app/location/SKLocationManager$2;->val$minDistance:F

    iput p5, p0, Lcom/shopkick/app/location/SKLocationManager$2;->val$priority:I

    iput-object p6, p0, Lcom/shopkick/app/location/SKLocationManager$2;->val$listener:Lcom/google/android/gms/location/LocationListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 213
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->create()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    .line 214
    iget-wide v1, p0, Lcom/shopkick/app/location/SKLocationManager$2;->val$minTime:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    const-wide/16 v1, 0x3e8

    .line 215
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setFastestInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 216
    iget v1, p0, Lcom/shopkick/app/location/SKLocationManager$2;->val$minDistance:F

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setSmallestDisplacement(F)Lcom/google/android/gms/location/LocationRequest;

    .line 217
    iget v1, p0, Lcom/shopkick/app/location/SKLocationManager$2;->val$priority:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 219
    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager$2;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v1}, Lcom/shopkick/app/location/SKLocationManager;->access$200(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/location/FusedLocationProviderApi;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/location/SKLocationManager$2;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v2}, Lcom/shopkick/app/location/SKLocationManager;->access$100(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/location/SKLocationManager$2;->val$listener:Lcom/google/android/gms/location/LocationListener;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/google/android/gms/location/FusedLocationProviderApi;->requestLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)Lcom/google/android/gms/common/api/PendingResult;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 223
    :catch_0
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$2;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$500(Lcom/shopkick/app/location/SKLocationManager;)V

    goto :goto_0

    .line 221
    :catch_1
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$2;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$300(Lcom/shopkick/app/location/SKLocationManager;)V

    :goto_0
    return-void
.end method
