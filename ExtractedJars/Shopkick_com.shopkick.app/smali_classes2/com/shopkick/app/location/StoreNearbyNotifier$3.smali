.class Lcom/shopkick/app/location/StoreNearbyNotifier$3;
.super Ljava/lang/Object;
.source "StoreNearbyNotifier.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/StoreNearbyNotifier;->forceGPSWalkin()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/StoreNearbyNotifier;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$3;->this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 250
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 251
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 252
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "CHECKIN: StoreNearbyNotifier: sending nearby checkin locations request"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$3;->this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    invoke-static {v0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->access$100(Lcom/shopkick/app/location/StoreNearbyNotifier;)V

    return-void
.end method
