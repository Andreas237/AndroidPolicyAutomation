.class Lio/fabric/sdk/android/Fabric$2;
.super Ljava/lang/Object;
.source "Fabric.java"

# interfaces
.implements Lio/fabric/sdk/android/InitializationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/Fabric;->createKitInitializationCallback(I)Lio/fabric/sdk/android/InitializationCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final kitInitializedLatch:Ljava/util/concurrent/CountDownLatch;

.field final synthetic this$0:Lio/fabric/sdk/android/Fabric;

.field final synthetic val$size:I


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/Fabric;I)V
    .locals 0

    .line 617
    iput-object p1, p0, Lio/fabric/sdk/android/Fabric$2;->this$0:Lio/fabric/sdk/android/Fabric;

    iput p2, p0, Lio/fabric/sdk/android/Fabric$2;->val$size:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 618
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    iget p2, p0, Lio/fabric/sdk/android/Fabric$2;->val$size:I

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lio/fabric/sdk/android/Fabric$2;->kitInitializedLatch:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public failure(Ljava/lang/Exception;)V
    .locals 1

    .line 634
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$2;->this$0:Lio/fabric/sdk/android/Fabric;

    invoke-static {v0}, Lio/fabric/sdk/android/Fabric;->access$300(Lio/fabric/sdk/android/Fabric;)Lio/fabric/sdk/android/InitializationCallback;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/fabric/sdk/android/InitializationCallback;->failure(Ljava/lang/Exception;)V

    return-void
.end method

.method public success(Ljava/lang/Object;)V
    .locals 4

    .line 625
    iget-object p1, p0, Lio/fabric/sdk/android/Fabric$2;->kitInitializedLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 626
    iget-object p1, p0, Lio/fabric/sdk/android/Fabric$2;->kitInitializedLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    .line 627
    iget-object p1, p0, Lio/fabric/sdk/android/Fabric$2;->this$0:Lio/fabric/sdk/android/Fabric;

    invoke-static {p1}, Lio/fabric/sdk/android/Fabric;->access$200(Lio/fabric/sdk/android/Fabric;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 628
    iget-object p1, p0, Lio/fabric/sdk/android/Fabric$2;->this$0:Lio/fabric/sdk/android/Fabric;

    invoke-static {p1}, Lio/fabric/sdk/android/Fabric;->access$300(Lio/fabric/sdk/android/Fabric;)Lio/fabric/sdk/android/InitializationCallback;

    move-result-object p1

    iget-object v0, p0, Lio/fabric/sdk/android/Fabric$2;->this$0:Lio/fabric/sdk/android/Fabric;

    invoke-interface {p1, v0}, Lio/fabric/sdk/android/InitializationCallback;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
