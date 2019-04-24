.class Lcom/microblink/camera/util/ProcessingQueue$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/util/ProcessingQueue;

.field final synthetic val$t:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lcom/microblink/camera/util/ProcessingQueue;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/util/ProcessingQueue$1;->this$0:Lcom/microblink/camera/util/ProcessingQueue;

    iput-object p2, p0, Lcom/microblink/camera/util/ProcessingQueue$1;->val$t:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Processing queue "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/microblink/camera/util/ProcessingQueue$1;->this$0:Lcom/microblink/camera/util/ProcessingQueue;

    invoke-static {v2}, Lcom/microblink/camera/util/ProcessingQueue;->access$000(Lcom/microblink/camera/util/ProcessingQueue;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " halted due to an error."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/microblink/camera/util/ProcessingQueue$1;->val$t:Ljava/lang/Throwable;

    invoke-direct {v0, v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
