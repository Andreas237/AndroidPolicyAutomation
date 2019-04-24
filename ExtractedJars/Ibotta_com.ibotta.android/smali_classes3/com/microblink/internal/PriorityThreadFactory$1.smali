.class Lcom/microblink/internal/PriorityThreadFactory$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/PriorityThreadFactory;

.field final synthetic val$runnable:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/microblink/internal/PriorityThreadFactory;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/PriorityThreadFactory$1;->this$0:Lcom/microblink/internal/PriorityThreadFactory;

    iput-object p2, p0, Lcom/microblink/internal/PriorityThreadFactory$1;->val$runnable:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/PriorityThreadFactory$1;->this$0:Lcom/microblink/internal/PriorityThreadFactory;

    invoke-static {v0}, Lcom/microblink/internal/PriorityThreadFactory;->access$000(Lcom/microblink/internal/PriorityThreadFactory;)I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Thread_Factory"

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lcom/microblink/internal/PriorityThreadFactory$1;->val$runnable:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
