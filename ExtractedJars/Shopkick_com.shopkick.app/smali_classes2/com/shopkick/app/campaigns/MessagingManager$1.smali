.class Lcom/shopkick/app/campaigns/MessagingManager$1;
.super Ljava/lang/Object;
.source "MessagingManager.java"

# interfaces
.implements Lcom/shopkick/app/campaigns/WalkinListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/campaigns/MessagingManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/campaigns/MessagingManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/MessagingManager;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager$1;->this$0:Lcom/shopkick/app/campaigns/MessagingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponseReceived(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 95
    :try_start_0
    new-instance v9, Lcom/shopkick/app/campaigns/MessageHistoryRecord;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Overlay:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    const/4 v4, 0x1

    const-string v5, "0"

    move-object v0, v9

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;-><init>(JLcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    invoke-static {}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getInstance()Lcom/shopkick/app/campaigns/MessagingPersistence;

    move-result-object p1

    invoke-virtual {p1, v9}, Lcom/shopkick/app/campaigns/MessagingPersistence;->observe(Lcom/shopkick/app/campaigns/MessageHistoryRecord;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, p1

    .line 104
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object p1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 106
    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide p1

    sget-object p3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {p3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    or-long/2addr v1, p1

    const-string v4, "MessagingManager WalkinListener onResponseReceived failed"

    const/4 p1, 0x0

    new-array v5, p1, [Ljava/lang/Object;

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
