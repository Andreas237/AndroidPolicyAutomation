.class Lcom/usebutton/sdk/internal/core/CommandExecutor$1;
.super Ljava/lang/Object;
.source "CommandExecutor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/core/CommandExecutor;->blockingLoop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/core/CommandExecutor;

.field final synthetic val$command:Lcom/usebutton/sdk/internal/core/Command;

.field final synthetic val$result:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/core/CommandExecutor;Lcom/usebutton/sdk/internal/core/Command;Ljava/lang/Object;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor$1;->this$0:Lcom/usebutton/sdk/internal/core/CommandExecutor;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor$1;->val$command:Lcom/usebutton/sdk/internal/core/Command;

    iput-object p3, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor$1;->val$result:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor$1;->val$command:Lcom/usebutton/sdk/internal/core/Command;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Command;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor$1;->val$command:Lcom/usebutton/sdk/internal/core/Command;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor$1;->val$result:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/core/Command;->deliverSuccess(Ljava/lang/Object;)V

    return-void
.end method
