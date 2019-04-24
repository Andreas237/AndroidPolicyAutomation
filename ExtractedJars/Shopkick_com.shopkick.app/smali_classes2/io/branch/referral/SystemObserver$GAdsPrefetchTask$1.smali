.class Lio/branch/referral/SystemObserver$GAdsPrefetchTask$1;
.super Ljava/lang/Object;
.source "SystemObserver.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/SystemObserver$GAdsPrefetchTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lio/branch/referral/SystemObserver$GAdsPrefetchTask;

.field final synthetic val$latch:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lio/branch/referral/SystemObserver$GAdsPrefetchTask;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 362
    iput-object p1, p0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask$1;->this$1:Lio/branch/referral/SystemObserver$GAdsPrefetchTask;

    iput-object p2, p0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask$1;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const/16 v0, -0x13

    .line 365
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 366
    iget-object v0, p0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask$1;->this$1:Lio/branch/referral/SystemObserver$GAdsPrefetchTask;

    iget-object v0, v0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask;->this$0:Lio/branch/referral/SystemObserver;

    invoke-static {v0}, Lio/branch/referral/SystemObserver;->access$000(Lio/branch/referral/SystemObserver;)Ljava/lang/Object;

    move-result-object v0

    .line 367
    iget-object v1, p0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask$1;->this$1:Lio/branch/referral/SystemObserver$GAdsPrefetchTask;

    iget-object v1, v1, Lio/branch/referral/SystemObserver$GAdsPrefetchTask;->this$0:Lio/branch/referral/SystemObserver;

    invoke-static {v1, v0}, Lio/branch/referral/SystemObserver;->access$100(Lio/branch/referral/SystemObserver;Ljava/lang/Object;)Ljava/lang/String;

    .line 368
    iget-object v1, p0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask$1;->this$1:Lio/branch/referral/SystemObserver$GAdsPrefetchTask;

    iget-object v1, v1, Lio/branch/referral/SystemObserver$GAdsPrefetchTask;->this$0:Lio/branch/referral/SystemObserver;

    invoke-static {v1, v0}, Lio/branch/referral/SystemObserver;->access$200(Lio/branch/referral/SystemObserver;Ljava/lang/Object;)I

    .line 369
    iget-object v0, p0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask$1;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
