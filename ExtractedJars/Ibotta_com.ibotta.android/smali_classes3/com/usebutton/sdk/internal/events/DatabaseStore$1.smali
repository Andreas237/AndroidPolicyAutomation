.class Lcom/usebutton/sdk/internal/events/DatabaseStore$1;
.super Ljava/lang/Object;
.source "DatabaseStore.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/events/DatabaseStore;->prepareDatabase(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/events/DatabaseStore;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/events/DatabaseStore;Landroid/content/Context;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore$1;->this$0:Lcom/usebutton/sdk/internal/events/DatabaseStore;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 68
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore$1;->this$0:Lcom/usebutton/sdk/internal/events/DatabaseStore;

    monitor-enter v0

    .line 69
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore$1;->this$0:Lcom/usebutton/sdk/internal/events/DatabaseStore;

    new-instance v2, Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore$1;->val$context:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/events/DatabaseStore;->access$002(Lcom/usebutton/sdk/internal/events/DatabaseStore;Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;)Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;

    .line 70
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore$1;->this$0:Lcom/usebutton/sdk/internal/events/DatabaseStore;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/events/DatabaseStore;->access$102(Lcom/usebutton/sdk/internal/events/DatabaseStore;Z)Z

    .line 71
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore$1;->this$0:Lcom/usebutton/sdk/internal/events/DatabaseStore;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 72
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
