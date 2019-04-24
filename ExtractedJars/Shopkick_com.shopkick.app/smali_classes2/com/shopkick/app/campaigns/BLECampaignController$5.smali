.class Lcom/shopkick/app/campaigns/BLECampaignController$5;
.super Ljava/lang/Object;
.source "BLECampaignController.java"

# interfaces
.implements Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/campaigns/BLECampaignController;
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

    .line 878
    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$5;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zonesEntered(Ljava/util/Set;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/shopkick/sdk/zone/ZoneReading;",
            ">;)V"
        }
    .end annotation

    .line 882
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$5;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1600(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 884
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$5;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1600(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1700()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    .line 886
    :catch_0
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 887
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 888
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 889
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "CHECKIN: BLECampaignController: nearby campaigns response received or timed out"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 893
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$5;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-virtual {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->getRecentlyEnteredCampaigns()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 894
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 895
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 896
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 897
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v2, v5

    const-string v5, "CHECKIN: BLECampaignController: no nearby campaigns"

    new-array v6, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 900
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 901
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 902
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 903
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v2, v5

    const-string v5, "CHECKIN: BLECampaignController: no entered zones"

    new-array v6, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x0

    const v2, 0x7fffffff

    .line 909
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    .line 910
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/sdk/zone/ZoneReading;

    .line 911
    invoke-interface {v6}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v7

    .line 912
    iget-object v8, v3, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->zoneQuery:Ljava/lang/String;

    invoke-static {v8}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->parse(Ljava/lang/String;)Lcom/shopkick/sdk/zone/query/ZoneQuery;

    move-result-object v8

    .line 913
    invoke-virtual {v8, v7}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->isValid(Lcom/shopkick/sdk/zone/Zone;)Z

    move-result v8

    if-eqz v8, :cond_3

    const-string v8, "retail.chain_id"

    .line 915
    invoke-interface {v7, v8}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const-string v9, "retail.store_id"

    .line 916
    invoke-interface {v7, v9}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const-string v10, "retail.department_id"

    .line 918
    invoke-interface {v7, v10}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 921
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 924
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 929
    iget-object v7, p0, Lcom/shopkick/app/campaigns/BLECampaignController$5;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v7, v3}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$400(Lcom/shopkick/app/campaigns/BLECampaignController;Lcom/shopkick/app/fetchers/api/skapi/Campaign;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 930
    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->type:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_3

    .line 932
    invoke-interface {v6}, Lcom/shopkick/sdk/zone/ZoneReading;->getProximity()I

    move-result v7

    .line 933
    invoke-interface {v6}, Lcom/shopkick/sdk/zone/ZoneReading;->getProximity()I

    move-result v8

    int-to-double v8, v8

    iget-object v10, v3, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->detectionThreshold:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    int-to-double v10, v10

    iget-object v12, p0, Lcom/shopkick/app/campaigns/BLECampaignController$5;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    .line 934
    invoke-static {v12}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v12

    iget-object v12, v12, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v12, v12, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->walkinButtonDistanceMultiplier:Ljava/lang/Double;

    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    mul-double/2addr v10, v12

    cmpg-double v8, v8, v10

    if-gtz v8, :cond_3

    if-gt v7, v2, :cond_3

    move-object v1, v6

    move v2, v7

    goto :goto_1

    .line 925
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "\'locationId\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 922
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "\'chainId\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez v1, :cond_7

    .line 945
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 946
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 947
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string v2, "CHECKIN: BLECampaignController: No match to do walkins"

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 949
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$5;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    const-string v0, "BLE: BLECampaignController: No match"

    const/4 v1, 0x3

    invoke-static {p1, v4, v0, v1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1800(Lcom/shopkick/app/campaigns/BLECampaignController;ZLjava/lang/String;I)V

    goto :goto_2

    .line 951
    :cond_7
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$5;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$700(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/campaigns/MessagingManager;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/campaigns/MessagingManager;->doWalkin(Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)Z

    :goto_2
    return-void

    .line 886
    :goto_3
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
