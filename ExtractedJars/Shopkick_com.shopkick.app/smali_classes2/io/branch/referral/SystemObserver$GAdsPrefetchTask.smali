.class Lio/branch/referral/SystemObserver$GAdsPrefetchTask;
.super Lio/branch/referral/BranchAsyncTask;
.source "SystemObserver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/SystemObserver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GAdsPrefetchTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/branch/referral/BranchAsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final callback_:Lio/branch/referral/SystemObserver$GAdsParamsFetchEvents;

.field final synthetic this$0:Lio/branch/referral/SystemObserver;


# direct methods
.method public constructor <init>(Lio/branch/referral/SystemObserver;Lio/branch/referral/SystemObserver$GAdsParamsFetchEvents;)V
    .locals 0

    .line 354
    iput-object p1, p0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask;->this$0:Lio/branch/referral/SystemObserver;

    invoke-direct {p0}, Lio/branch/referral/BranchAsyncTask;-><init>()V

    .line 355
    iput-object p2, p0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask;->callback_:Lio/branch/referral/SystemObserver$GAdsParamsFetchEvents;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 351
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lio/branch/referral/SystemObserver$GAdsPrefetchTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    .line 361
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 362
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lio/branch/referral/SystemObserver$GAdsPrefetchTask$1;

    invoke-direct {v1, p0, p1}, Lio/branch/referral/SystemObserver$GAdsPrefetchTask$1;-><init>(Lio/branch/referral/SystemObserver$GAdsPrefetchTask;Ljava/util/concurrent/CountDownLatch;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 371
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const-wide/16 v0, 0x5dc

    .line 375
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 377
    invoke-virtual {p1}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 351
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lio/branch/referral/SystemObserver$GAdsPrefetchTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 0

    .line 385
    invoke-super {p0, p1}, Lio/branch/referral/BranchAsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 386
    iget-object p1, p0, Lio/branch/referral/SystemObserver$GAdsPrefetchTask;->callback_:Lio/branch/referral/SystemObserver$GAdsParamsFetchEvents;

    if-eqz p1, :cond_0

    .line 387
    invoke-interface {p1}, Lio/branch/referral/SystemObserver$GAdsParamsFetchEvents;->onGAdsFetchFinished()V

    :cond_0
    return-void
.end method
