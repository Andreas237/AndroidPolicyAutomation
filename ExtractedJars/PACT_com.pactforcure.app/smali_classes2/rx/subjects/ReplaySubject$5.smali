.class final Lrx/subjects/ReplaySubject$5;
.super Ljava/lang/Object;
.source "ReplaySubject.java"

# interfaces
.implements Lrx/functions/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrx/subjects/ReplaySubject;->createWithState(Lrx/subjects/ReplaySubject$BoundedState;Lrx/functions/Action1;)Lrx/subjects/ReplaySubject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrx/functions/Action1",
        "<",
        "Lrx/subjects/SubjectSubscriptionManager$SubjectObserver",
        "<TT;>;>;"
    }
.end annotation


# instance fields
.field final synthetic val$state:Lrx/subjects/ReplaySubject$BoundedState;


# direct methods
.method constructor <init>(Lrx/subjects/ReplaySubject$BoundedState;)V
    .locals 0

    .prologue
    .line 342
    iput-object p1, p0, Lrx/subjects/ReplaySubject$5;->val$state:Lrx/subjects/ReplaySubject$BoundedState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 342
    check-cast p1, Lrx/subjects/SubjectSubscriptionManager$SubjectObserver;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lrx/subjects/ReplaySubject$5;->call(Lrx/subjects/SubjectSubscriptionManager$SubjectObserver;)V

    return-void
.end method

.method public call(Lrx/subjects/SubjectSubscriptionManager$SubjectObserver;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/subjects/SubjectSubscriptionManager$SubjectObserver",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 346
    .local p1, "t1":Lrx/subjects/SubjectSubscriptionManager$SubjectObserver;, "Lrx/subjects/SubjectSubscriptionManager$SubjectObserver<TT;>;"
    invoke-virtual {p1}, Lrx/subjects/SubjectSubscriptionManager$SubjectObserver;->index()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrx/subjects/ReplaySubject$NodeList$Node;

    .line 347
    .local v0, "l":Lrx/subjects/ReplaySubject$NodeList$Node;, "Lrx/subjects/ReplaySubject$NodeList$Node<Ljava/lang/Object;>;"
    if-nez v0, :cond_0

    .line 348
    iget-object v1, p0, Lrx/subjects/ReplaySubject$5;->val$state:Lrx/subjects/ReplaySubject$BoundedState;

    invoke-virtual {v1}, Lrx/subjects/ReplaySubject$BoundedState;->head()Lrx/subjects/ReplaySubject$NodeList$Node;

    move-result-object v0

    .line 350
    :cond_0
    iget-object v1, p0, Lrx/subjects/ReplaySubject$5;->val$state:Lrx/subjects/ReplaySubject$BoundedState;

    invoke-virtual {v1, v0, p1}, Lrx/subjects/ReplaySubject$BoundedState;->replayObserverFromIndex(Lrx/subjects/ReplaySubject$NodeList$Node;Lrx/subjects/SubjectSubscriptionManager$SubjectObserver;)Lrx/subjects/ReplaySubject$NodeList$Node;

    .line 351
    return-void
.end method
