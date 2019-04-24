.class Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;
.super Lrx/Subscriber;
.source "SingleOnSubscribeDelaySubscriptionOther.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther;->call(Lrx/SingleSubscriber;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lrx/Subscriber",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field done:Z

.field final synthetic this$0:Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther;

.field final synthetic val$child:Lrx/SingleSubscriber;

.field final synthetic val$serial:Lrx/subscriptions/SerialSubscription;


# direct methods
.method constructor <init>(Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther;Lrx/SingleSubscriber;Lrx/subscriptions/SerialSubscription;)V
    .locals 0

    .prologue
    .line 58
    .local p0, "this":Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;, "Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther.2;"
    iput-object p1, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->this$0:Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther;

    iput-object p2, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->val$child:Lrx/SingleSubscriber;

    iput-object p3, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->val$serial:Lrx/subscriptions/SerialSubscription;

    invoke-direct {p0}, Lrx/Subscriber;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted()V
    .locals 2

    .prologue
    .line 77
    .local p0, "this":Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;, "Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther.2;"
    iget-boolean v0, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->done:Z

    if-eqz v0, :cond_0

    .line 84
    :goto_0
    return-void

    .line 80
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->done:Z

    .line 81
    iget-object v0, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->val$serial:Lrx/subscriptions/SerialSubscription;

    iget-object v1, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->val$child:Lrx/SingleSubscriber;

    invoke-virtual {v0, v1}, Lrx/subscriptions/SerialSubscription;->set(Lrx/Subscription;)V

    .line 83
    iget-object v0, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->this$0:Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther;

    iget-object v0, v0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther;->main:Lrx/Single;

    iget-object v1, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->val$child:Lrx/SingleSubscriber;

    invoke-virtual {v0, v1}, Lrx/Single;->subscribe(Lrx/SingleSubscriber;)Lrx/Subscription;

    goto :goto_0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1
    .param p1, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 67
    .local p0, "this":Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;, "Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther.2;"
    iget-boolean v0, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->done:Z

    if-eqz v0, :cond_0

    .line 68
    invoke-static {}, Lrx/plugins/RxJavaPlugins;->getInstance()Lrx/plugins/RxJavaPlugins;

    move-result-object v0

    invoke-virtual {v0}, Lrx/plugins/RxJavaPlugins;->getErrorHandler()Lrx/plugins/RxJavaErrorHandler;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrx/plugins/RxJavaErrorHandler;->handleError(Ljava/lang/Throwable;)V

    .line 73
    :goto_0
    return-void

    .line 71
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->done:Z

    .line 72
    iget-object v0, p0, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->val$child:Lrx/SingleSubscriber;

    invoke-virtual {v0, p1}, Lrx/SingleSubscriber;->onError(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0
    .param p1, "t"    # Ljava/lang/Object;

    .prologue
    .line 62
    .local p0, "this":Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;, "Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther.2;"
    invoke-virtual {p0}, Lrx/internal/operators/SingleOnSubscribeDelaySubscriptionOther$2;->onCompleted()V

    .line 63
    return-void
.end method
