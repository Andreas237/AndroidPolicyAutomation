.class Lcom/usebutton/sdk/internal/views/BaseButton$1;
.super Ljava/lang/Object;
.source "BaseButton.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/views/BaseButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/BaseButton;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/BaseButton;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/BaseButton$1;->this$0:Lcom/usebutton/sdk/internal/views/BaseButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 152
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/BaseButton$1;->this$0:Lcom/usebutton/sdk/internal/views/BaseButton;

    monitor-enter v0

    .line 153
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/BaseButton$1;->this$0:Lcom/usebutton/sdk/internal/views/BaseButton;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/views/BaseButton;->access$000(Lcom/usebutton/sdk/internal/views/BaseButton;)Landroid/view/ViewGroup;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 154
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/BaseButton$1;->this$0:Lcom/usebutton/sdk/internal/views/BaseButton;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/BaseButton$1;->this$0:Lcom/usebutton/sdk/internal/views/BaseButton;

    invoke-static {v2}, Lcom/usebutton/sdk/internal/views/BaseButton;->access$000(Lcom/usebutton/sdk/internal/views/BaseButton;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/views/BaseButton;->applyStylingAttributes(Landroid/view/ViewGroup;)V

    .line 155
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/BaseButton$1;->this$0:Lcom/usebutton/sdk/internal/views/BaseButton;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/views/BaseButton;->invalidate()V

    .line 157
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
