.class Lrx/Completable$27;
.super Ljava/lang/Object;
.source "Completable.java"

# interfaces
.implements Lrx/Completable$CompletableSubscriber;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrx/Completable;->subscribe(Lrx/functions/Action1;Lrx/functions/Action0;)Lrx/Subscription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lrx/Completable;

.field final synthetic val$mad:Lrx/subscriptions/MultipleAssignmentSubscription;

.field final synthetic val$onComplete:Lrx/functions/Action0;

.field final synthetic val$onError:Lrx/functions/Action1;


# direct methods
.method constructor <init>(Lrx/Completable;Lrx/functions/Action0;Lrx/subscriptions/MultipleAssignmentSubscription;Lrx/functions/Action1;)V
    .locals 0

    .prologue
    .line 1921
    iput-object p1, p0, Lrx/Completable$27;->this$0:Lrx/Completable;

    iput-object p2, p0, Lrx/Completable$27;->val$onComplete:Lrx/functions/Action0;

    iput-object p3, p0, Lrx/Completable$27;->val$mad:Lrx/subscriptions/MultipleAssignmentSubscription;

    iput-object p4, p0, Lrx/Completable$27;->val$onError:Lrx/functions/Action1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted()V
    .locals 2

    .prologue
    .line 1925
    :try_start_0
    iget-object v1, p0, Lrx/Completable$27;->val$onComplete:Lrx/functions/Action0;

    invoke-interface {v1}, Lrx/functions/Action0;->call()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 1930
    iget-object v1, p0, Lrx/Completable$27;->val$mad:Lrx/subscriptions/MultipleAssignmentSubscription;

    invoke-virtual {v1}, Lrx/subscriptions/MultipleAssignmentSubscription;->unsubscribe()V

    .line 1931
    :goto_0
    return-void

    .line 1926
    :catch_0
    move-exception v0

    .line 1927
    .local v0, "e":Ljava/lang/Throwable;
    invoke-virtual {p0, v0}, Lrx/Completable$27;->onError(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4
    .param p1, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 1936
    :try_start_0
    iget-object v2, p0, Lrx/Completable$27;->val$onError:Lrx/functions/Action1;

    invoke-interface {v2, p1}, Lrx/functions/Action1;->call(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1942
    iget-object v2, p0, Lrx/Completable$27;->val$mad:Lrx/subscriptions/MultipleAssignmentSubscription;

    invoke-virtual {v2}, Lrx/subscriptions/MultipleAssignmentSubscription;->unsubscribe()V

    .line 1944
    :goto_0
    return-void

    .line 1937
    :catch_0
    move-exception v1

    .line 1938
    .local v1, "ex":Ljava/lang/Throwable;
    :try_start_1
    new-instance v0, Lrx/exceptions/CompositeException;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Throwable;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/Collection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1939
    .end local p1    # "e":Ljava/lang/Throwable;
    .local v0, "e":Ljava/lang/Throwable;
    :try_start_2
    sget-object v2, Lrx/Completable;->ERROR_HANDLER:Lrx/plugins/RxJavaErrorHandler;

    invoke-virtual {v2, v0}, Lrx/plugins/RxJavaErrorHandler;->handleError(Ljava/lang/Throwable;)V

    .line 1940
    invoke-static {v0}, Lrx/Completable;->access$000(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1942
    iget-object v2, p0, Lrx/Completable$27;->val$mad:Lrx/subscriptions/MultipleAssignmentSubscription;

    invoke-virtual {v2}, Lrx/subscriptions/MultipleAssignmentSubscription;->unsubscribe()V

    move-object p1, v0

    .line 1943
    .end local v0    # "e":Ljava/lang/Throwable;
    .restart local p1    # "e":Ljava/lang/Throwable;
    goto :goto_0

    .line 1942
    .end local v1    # "ex":Ljava/lang/Throwable;
    :catchall_0
    move-exception v2

    :goto_1
    iget-object v3, p0, Lrx/Completable$27;->val$mad:Lrx/subscriptions/MultipleAssignmentSubscription;

    invoke-virtual {v3}, Lrx/subscriptions/MultipleAssignmentSubscription;->unsubscribe()V

    throw v2

    .end local p1    # "e":Ljava/lang/Throwable;
    .restart local v0    # "e":Ljava/lang/Throwable;
    .restart local v1    # "ex":Ljava/lang/Throwable;
    :catchall_1
    move-exception v2

    move-object p1, v0

    .end local v0    # "e":Ljava/lang/Throwable;
    .restart local p1    # "e":Ljava/lang/Throwable;
    goto :goto_1
.end method

.method public onSubscribe(Lrx/Subscription;)V
    .locals 1
    .param p1, "d"    # Lrx/Subscription;

    .prologue
    .line 1948
    iget-object v0, p0, Lrx/Completable$27;->val$mad:Lrx/subscriptions/MultipleAssignmentSubscription;

    invoke-virtual {v0, p1}, Lrx/subscriptions/MultipleAssignmentSubscription;->set(Lrx/Subscription;)V

    .line 1949
    return-void
.end method
