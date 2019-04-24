.class Lcom/usebutton/sdk/internal/events/SyncManager$1;
.super Ljava/lang/Object;
.source "SyncManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/events/SyncManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/events/SyncManager;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/events/SyncManager;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/SyncManager$1;->this$0:Lcom/usebutton/sdk/internal/events/SyncManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 25
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/SyncManager$1;->this$0:Lcom/usebutton/sdk/internal/events/SyncManager;

    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/SyncManager$1;->this$0:Lcom/usebutton/sdk/internal/events/SyncManager;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/events/SyncManager;->access$002(Lcom/usebutton/sdk/internal/events/SyncManager;Z)Z

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/SyncManager$1;->this$0:Lcom/usebutton/sdk/internal/events/SyncManager;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/events/SyncManager;->access$100(Lcom/usebutton/sdk/internal/events/SyncManager;)V

    return-void

    :catchall_0
    move-exception v1

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
