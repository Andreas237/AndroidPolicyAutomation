.class public Lcom/scandit/base/util/Observable;
.super Ljava/lang/Object;
.source "Observable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final mObservers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/scandit/base/util/Observer<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private mValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/scandit/base/util/Observable;->mObservers:Ljava/util/ArrayList;

    .line 25
    iput-object p1, p0, Lcom/scandit/base/util/Observable;->mValue:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public addObserver(Lcom/scandit/base/util/Observer;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/scandit/base/util/Observer<",
            "TT;>;)Z"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/scandit/base/util/Observable;->mObservers:Ljava/util/ArrayList;

    monitor-enter v0

    .line 37
    :try_start_0
    iget-object v1, p0, Lcom/scandit/base/util/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/scandit/base/util/Observer;

    if-ne v2, p1, :cond_0

    const/4 p1, 0x0

    .line 39
    monitor-exit v0

    return p1

    .line 42
    :cond_1
    iget-object v1, p0, Lcom/scandit/base/util/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    iget-object v1, p0, Lcom/scandit/base/util/Observable;->mValue:Ljava/lang/Object;

    iget-object v2, p0, Lcom/scandit/base/util/Observable;->mValue:Ljava/lang/Object;

    invoke-interface {p1, v1, v2}, Lcom/scandit/base/util/Observer;->onChange(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 44
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 45
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/scandit/base/util/Observable;->mValue:Ljava/lang/Object;

    return-object v0
.end method

.method public removeObserver(Lcom/scandit/base/util/Observer;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/scandit/base/util/Observer<",
            "TT;>;)Z"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/scandit/base/util/Observable;->mObservers:Ljava/util/ArrayList;

    monitor-enter v0

    .line 51
    :try_start_0
    iget-object v1, p0, Lcom/scandit/base/util/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public set(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 57
    iget-object v0, p0, Lcom/scandit/base/util/Observable;->mValue:Ljava/lang/Object;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 61
    iget-object v0, p0, Lcom/scandit/base/util/Observable;->mValue:Ljava/lang/Object;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 64
    :cond_1
    iget-object v0, p0, Lcom/scandit/base/util/Observable;->mValue:Ljava/lang/Object;

    .line 65
    iput-object p1, p0, Lcom/scandit/base/util/Observable;->mValue:Ljava/lang/Object;

    .line 66
    iget-object v1, p0, Lcom/scandit/base/util/Observable;->mObservers:Ljava/util/ArrayList;

    monitor-enter v1

    .line 67
    :try_start_0
    iget-object v2, p0, Lcom/scandit/base/util/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/scandit/base/util/Observer;

    .line 68
    invoke-interface {v3, v0, p1}, Lcom/scandit/base/util/Observer;->onChange(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 70
    :cond_2
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
