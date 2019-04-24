.class Lcom/shopkick/app/campaigns/MessagingManager$3;
.super Ljava/lang/Object;
.source "MessagingManager.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/campaigns/MessagingManager;->startWalkinRequest(Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/campaigns/MessagingManager;

.field final synthetic val$checkinStarter:Ljava/lang/Integer;

.field final synthetic val$reading:Lcom/shopkick/sdk/zone/ZoneReading;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/MessagingManager;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V
    .locals 0

    .line 384
    iput-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    iput-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->val$reading:Lcom/shopkick/sdk/zone/ZoneReading;

    iput-object p3, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->val$checkinStarter:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 388
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    iget-object v1, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->val$reading:Lcom/shopkick/sdk/zone/ZoneReading;

    iget-object v2, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->val$checkinStarter:Ljava/lang/Integer;

    invoke-static {v0, p1, v1, v2}, Lcom/shopkick/app/campaigns/MessagingManager;->access$000(Lcom/shopkick/app/campaigns/MessagingManager;Landroid/location/Location;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V

    goto :goto_0

    .line 391
    :cond_0
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x3b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/4 v0, 0x3

    .line 392
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    const/4 v1, 0x5

    .line 393
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    .line 394
    iget-object v1, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->val$reading:Lcom/shopkick/sdk/zone/ZoneReading;

    invoke-interface {v1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V

    .line 395
    invoke-static {p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 396
    iget-object v1, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    invoke-static {v1}, Lcom/shopkick/app/campaigns/MessagingManager;->access$100(Lcom/shopkick/app/campaigns/MessagingManager;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 397
    iget-object v1, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    invoke-static {v1}, Lcom/shopkick/app/campaigns/MessagingManager;->access$200(Lcom/shopkick/app/campaigns/MessagingManager;)Lcom/shopkick/app/application/SKLogger;

    move-result-object v1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 399
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->val$checkinStarter:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    .line 400
    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$3;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    const/4 v1, 0x0

    const-string v2, "BLE: MessagingManager: No location"

    invoke-static {p1, v1, v2, v0}, Lcom/shopkick/app/campaigns/MessagingManager;->access$300(Lcom/shopkick/app/campaigns/MessagingManager;ZLjava/lang/String;I)V

    :cond_2
    :goto_0
    return-void
.end method
