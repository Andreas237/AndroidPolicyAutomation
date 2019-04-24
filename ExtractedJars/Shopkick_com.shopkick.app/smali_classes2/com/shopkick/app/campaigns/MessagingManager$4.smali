.class Lcom/shopkick/app/campaigns/MessagingManager$4;
.super Ljava/lang/Object;
.source "MessagingManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/campaigns/MessagingManager;->makeWalkinRequest(Landroid/location/Location;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/campaigns/MessagingManager;

.field final synthetic val$chainId:Ljava/lang/String;

.field final synthetic val$checkinStarter:Ljava/lang/Integer;

.field final synthetic val$locationId:Ljava/lang/String;

.field final synthetic val$request:Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/MessagingManager;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    iput-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->val$request:Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    iput-object p3, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->val$chainId:Ljava/lang/String;

    iput-object p4, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->val$locationId:Ljava/lang/String;

    iput-object p5, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->val$checkinStarter:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    const/4 v0, 0x3

    .line 466
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    invoke-static {v1}, Lcom/shopkick/app/campaigns/MessagingManager;->access$400(Lcom/shopkick/app/campaigns/MessagingManager;)Lcom/shopkick/app/presence/WalkinController;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->val$request:Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    iget-object v3, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->val$chainId:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->val$locationId:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/shopkick/app/presence/WalkinController;->issueWalkinRequest(Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v5, v1

    .line 468
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 469
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 470
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v1, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v3, v6

    const-string v6, "MessagingManager.makeWalkinRequest() WalkinController.issueWalkinRequest() failed"

    const/4 v1, 0x0

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual/range {v2 .. v7}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    iget-object v2, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->val$checkinStarter:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 474
    iget-object v2, p0, Lcom/shopkick/app/campaigns/MessagingManager$4;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    const-string v3, "BLE: WalkinController.issueWalkinRequest() exception"

    invoke-static {v2, v1, v3, v0}, Lcom/shopkick/app/campaigns/MessagingManager;->access$300(Lcom/shopkick/app/campaigns/MessagingManager;ZLjava/lang/String;I)V

    :cond_0
    :goto_0
    return-void
.end method
