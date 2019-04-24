.class Lcom/shopkick/logging/RemoteAppender$1;
.super Ljava/lang/Object;
.source "RemoteAppender.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/logging/RemoteAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/logging/RemoteAppender;


# direct methods
.method constructor <init>(Lcom/shopkick/logging/RemoteAppender;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/shopkick/logging/RemoteAppender$1;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 154
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$1;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$000(Lcom/shopkick/logging/RemoteAppender;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$100()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/shopkick/logging/RemoteAppender$1;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v0}, Lcom/shopkick/logging/RemoteAppender;->access$200(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    :try_start_1
    iget-object v1, p0, Lcom/shopkick/logging/RemoteAppender$1;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v1}, Lcom/shopkick/logging/RemoteAppender;->access$200(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 157
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 160
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "checking time elapsed since last log and notifying sending thread failed [thread:%1$d]"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 163
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    .line 161
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 160
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method
