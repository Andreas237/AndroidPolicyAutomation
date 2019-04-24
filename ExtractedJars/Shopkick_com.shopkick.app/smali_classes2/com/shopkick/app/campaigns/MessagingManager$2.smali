.class Lcom/shopkick/app/campaigns/MessagingManager$2;
.super Ljava/lang/Object;
.source "MessagingManager.java"

# interfaces
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/campaigns/MessagingManager;->doOverlay(Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/campaigns/MessagingManager;

.field final synthetic val$campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

.field final synthetic val$chainId:Ljava/lang/String;

.field final synthetic val$departmentId:Ljava/lang/String;

.field final synthetic val$locationId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/MessagingManager;Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    iput-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iput-object p3, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$chainId:Ljava/lang/String;

    iput-object p4, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$locationId:Ljava/lang/String;

    iput-object p5, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$departmentId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 5

    .line 229
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    .line 230
    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 231
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string v2, "MessagingManager: [BLE_MESSAGING] onOverlayDismissed() for spec id: %s, chain id: %s, location id: %s, department id: %s, campaign: %s"

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$chainId:Ljava/lang/String;

    const/4 v4, 0x1

    aput-object p1, v3, v4

    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$locationId:Ljava/lang/String;

    const/4 v4, 0x2

    aput-object p1, v3, v4

    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$departmentId:Ljava/lang/String;

    const/4 v4, 0x3

    aput-object p1, v3, v4

    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    const/4 v4, 0x4

    aput-object p1, v3, v4

    invoke-virtual {p2, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 10

    const/4 p2, 0x0

    .line 199
    :try_start_0
    new-instance v9, Lcom/shopkick/app/campaigns/MessageHistoryRecord;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Overlay:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    const/4 v4, 0x2

    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->message:Lcom/shopkick/app/fetchers/api/skapi/Message;

    iget-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/Message;->departmentMessagingConfigId:Ljava/lang/String;

    iget-object v6, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$chainId:Ljava/lang/String;

    iget-object v7, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$locationId:Ljava/lang/String;

    iget-object v8, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$departmentId:Ljava/lang/String;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;-><init>(JLcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    invoke-static {}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getInstance()Lcom/shopkick/app/campaigns/MessagingPersistence;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/shopkick/app/campaigns/MessagingPersistence;->observe(Lcom/shopkick/app/campaigns/MessageHistoryRecord;)Z

    .line 208
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 210
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "MessagingManager: [BLE_MESSAGING] onOverlayShown() observing overlay shown for spec id: %s, chain id: %s, location id: %s, department id: %s, campaign: %s"

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, p2

    const/4 p1, 0x1

    iget-object v5, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$chainId:Ljava/lang/String;

    aput-object v5, v4, p1

    const/4 p1, 0x2

    iget-object v5, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$locationId:Ljava/lang/String;

    aput-object v5, v4, p1

    const/4 p1, 0x3

    iget-object v5, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$departmentId:Ljava/lang/String;

    aput-object v5, v4, p1

    const/4 p1, 0x4

    iget-object v5, p0, Lcom/shopkick/app/campaigns/MessagingManager$2;->val$campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    aput-object v5, v4, p1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, p1

    .line 219
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 220
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object p1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 221
    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object p1, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v1, v4

    const-string v4, "MessagingManager: [BLE_MESSAGING] doOverlay() failed"

    new-array v5, p2, [Ljava/lang/Object;

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
