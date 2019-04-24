.class public Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;
.super Ljava/lang/Object;
.source "PwiRetailersHolder.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private lock:Ljava/util/concurrent/locks/Lock;

.field private pwiRetailers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->lock:Ljava/util/concurrent/locks/Lock;

    .line 18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->pwiRetailers:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getPwiRetailers()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->pwiRetailers:Ljava/util/Set;

    return-object v0
.end method

.method public isFetched()Z
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->pwiRetailers:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public setPwiRetailers(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 28
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->pwiRetailers:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    if-eqz p1, :cond_0

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->pwiRetailers:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "List of PWI Retailers: %s"

    const/4 v1, 0x1

    .line 38
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
