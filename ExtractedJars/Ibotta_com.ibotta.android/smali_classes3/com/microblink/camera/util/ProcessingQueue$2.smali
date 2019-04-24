.class Lcom/microblink/camera/util/ProcessingQueue$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/util/ProcessingQueue;


# direct methods
.method constructor <init>(Lcom/microblink/camera/util/ProcessingQueue;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/util/ProcessingQueue$2;->this$0:Lcom/microblink/camera/util/ProcessingQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue$2;->this$0:Lcom/microblink/camera/util/ProcessingQueue;

    invoke-static {v0}, Lcom/microblink/camera/util/ProcessingQueue;->access$100(Lcom/microblink/camera/util/ProcessingQueue;)Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quitSafely()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/util/ProcessingQueue$2;->this$0:Lcom/microblink/camera/util/ProcessingQueue;

    invoke-static {v0}, Lcom/microblink/camera/util/ProcessingQueue;->access$100(Lcom/microblink/camera/util/ProcessingQueue;)Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    return-void
.end method
