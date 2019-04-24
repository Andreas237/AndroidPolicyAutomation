.class Lcom/shopkick/app/campaigns/BLECampaignController$1;
.super Ljava/lang/Object;
.source "BLECampaignController.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/campaigns/BLECampaignController;->fetchLocationBasedCampaigns(Landroid/location/Location;Lcom/shopkick/fetchers/api/APIManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/campaigns/BLECampaignController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/BLECampaignController;)V
    .locals 0

    .line 268
    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$1;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 274
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 275
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 276
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string v2, "BLECampaignController: NearbyCampaignsRequest response received"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 278
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq p1, v0, :cond_0

    .line 281
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$1;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1, p2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$000(Lcom/shopkick/app/campaigns/BLECampaignController;Lcom/shopkick/fetchers/DataResponse;)V

    goto :goto_0

    .line 285
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$1;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$100(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/campaigns/BLECampaignController$1$1;

    invoke-direct {v0, p0, p2}, Lcom/shopkick/app/campaigns/BLECampaignController$1$1;-><init>(Lcom/shopkick/app/campaigns/BLECampaignController$1;Lcom/shopkick/fetchers/DataResponse;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
