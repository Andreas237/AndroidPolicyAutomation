.class Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$2;
.super Ljava/lang/Object;
.source "LocationServicesSensorImplementation.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->initiateLocationUpdate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$2;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4

    .line 260
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$2;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$000(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    .line 261
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "GoogleApiClient failed to connect."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
