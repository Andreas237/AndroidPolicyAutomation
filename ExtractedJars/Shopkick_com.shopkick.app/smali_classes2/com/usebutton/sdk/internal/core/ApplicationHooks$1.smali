.class Lcom/usebutton/sdk/internal/core/ApplicationHooks$1;
.super Ljava/lang/Object;
.source "ApplicationHooks.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/core/ApplicationHooks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$1;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 78
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$1;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    monitor-enter v0

    .line 79
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$1;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->access$000(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 80
    monitor-exit v0

    return-void

    .line 82
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$1;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->access$002(Lcom/usebutton/sdk/internal/core/ApplicationHooks;Z)Z

    .line 83
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$1;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->access$100(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    const-string v1, "btn:app-background"

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEvent(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v1

    .line 83
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
