.class Lcom/microblink/RecognizerDispatcher$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/ProductDetector$Listener;


# instance fields
.field final synthetic this$0:Lcom/microblink/RecognizerDispatcher;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerDispatcher;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerDispatcher$1;->this$0:Lcom/microblink/RecognizerDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStateChange(I)V
    .locals 2

    invoke-static {}, Lcom/microblink/RecognizerDispatcher;->access$000()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher$1;->this$0:Lcom/microblink/RecognizerDispatcher;

    invoke-static {v1}, Lcom/microblink/RecognizerDispatcher;->access$100(Lcom/microblink/RecognizerDispatcher;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object p1, p0, Lcom/microblink/RecognizerDispatcher$1;->this$0:Lcom/microblink/RecognizerDispatcher;

    invoke-static {p1}, Lcom/microblink/RecognizerDispatcher;->access$200(Lcom/microblink/RecognizerDispatcher;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/RecognizerDispatcher$1;->this$0:Lcom/microblink/RecognizerDispatcher;

    invoke-static {p1}, Lcom/microblink/RecognizerDispatcher;->access$300(Lcom/microblink/RecognizerDispatcher;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
