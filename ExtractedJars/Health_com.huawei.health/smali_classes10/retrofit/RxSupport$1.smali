.class Lretrofit/RxSupport$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrx/Observable$OnSubscribe;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit/RxSupport;->createRequestObservable(Lretrofit/RxSupport$Invoker;)Lrx/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lrx/Observable$OnSubscribe<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lretrofit/RxSupport;

.field final synthetic val$invoker:Lretrofit/RxSupport$Invoker;


# direct methods
.method constructor <init>(Lretrofit/RxSupport;Lretrofit/RxSupport$Invoker;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lretrofit/RxSupport$1;->this$0:Lretrofit/RxSupport;

    iput-object p2, p0, Lretrofit/RxSupport$1;->val$invoker:Lretrofit/RxSupport$Invoker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call(Ljava/lang/Object;)V
    .locals 1

    .line 32
    move-object v0, p1

    check-cast v0, Lrx/Subscriber;

    invoke-virtual {p0, v0}, Lretrofit/RxSupport$1;->call(Lrx/Subscriber;)V

    return-void
.end method

.method public call(Lrx/Subscriber;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lrx/Subscriber<-Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 34
    new-instance v2, Lretrofit/RequestInterceptorTape;

    invoke-direct {v2}, Lretrofit/RequestInterceptorTape;-><init>()V

    .line 35
    iget-object v0, p0, Lretrofit/RxSupport$1;->this$0:Lretrofit/RxSupport;

    invoke-static {v0}, Lretrofit/RxSupport;->access$000(Lretrofit/RxSupport;)Lretrofit/RequestInterceptor;

    move-result-object v0

    invoke-interface {v0, v2}, Lretrofit/RequestInterceptor;->intercept(Lretrofit/RequestInterceptor$RequestFacade;)V

    .line 37
    iget-object v0, p0, Lretrofit/RxSupport$1;->this$0:Lretrofit/RxSupport;

    iget-object v1, p0, Lretrofit/RxSupport$1;->val$invoker:Lretrofit/RxSupport$Invoker;

    invoke-static {v0, p1, v1, v2}, Lretrofit/RxSupport;->access$100(Lretrofit/RxSupport;Lrx/Subscriber;Lretrofit/RxSupport$Invoker;Lretrofit/RequestInterceptorTape;)Ljava/lang/Runnable;

    move-result-object v3

    .line 38
    new-instance v4, Ljava/util/concurrent/FutureTask;

    const/4 v0, 0x0

    invoke-direct {v4, v3, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 41
    invoke-static {v4}, Lrx/subscriptions/Subscriptions;->from(Ljava/util/concurrent/Future;)Lrx/Subscription;

    move-result-object v0

    invoke-virtual {p1, v0}, Lrx/Subscriber;->add(Lrx/Subscription;)V

    .line 42
    iget-object v0, p0, Lretrofit/RxSupport$1;->this$0:Lretrofit/RxSupport;

    invoke-static {v0}, Lretrofit/RxSupport;->access$200(Lretrofit/RxSupport;)Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 43
    return-void
.end method
