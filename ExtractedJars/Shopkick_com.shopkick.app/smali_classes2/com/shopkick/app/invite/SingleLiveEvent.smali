.class public Lcom/shopkick/app/invite/SingleLiveEvent;
.super Landroid/arch/lifecycle/MutableLiveData;
.source "SingleLiveEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/arch/lifecycle/MutableLiveData<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SingleLiveEvent"


# instance fields
.field private final mPending:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Landroid/arch/lifecycle/MutableLiveData;-><init>()V

    .line 44
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/shopkick/app/invite/SingleLiveEvent;->mPending:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/invite/SingleLiveEvent;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/invite/SingleLiveEvent;->mPending:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method


# virtual methods
.method public call()V
    .locals 1
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    const/4 v0, 0x0

    .line 75
    invoke-virtual {p0, v0}, Lcom/shopkick/app/invite/SingleLiveEvent;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public observe(Landroid/arch/lifecycle/LifecycleOwner;Landroid/arch/lifecycle/Observer;)V
    .locals 2
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/arch/lifecycle/LifecycleOwner;",
            "Landroid/arch/lifecycle/Observer<",
            "TT;>;)V"
        }
    .end annotation

    .line 49
    invoke-virtual {p0}, Lcom/shopkick/app/invite/SingleLiveEvent;->hasActiveObservers()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "SingleLiveEvent"

    const-string v1, "Multiple observers registered but only one will be notified of changes."

    .line 50
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    :cond_0
    new-instance v0, Lcom/shopkick/app/invite/SingleLiveEvent$1;

    invoke-direct {v0, p0, p2}, Lcom/shopkick/app/invite/SingleLiveEvent$1;-><init>(Lcom/shopkick/app/invite/SingleLiveEvent;Landroid/arch/lifecycle/Observer;)V

    invoke-super {p0, p1, v0}, Landroid/arch/lifecycle/MutableLiveData;->observe(Landroid/arch/lifecycle/LifecycleOwner;Landroid/arch/lifecycle/Observer;)V

    return-void
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/invite/SingleLiveEvent;->mPending:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 67
    invoke-super {p0, p1}, Landroid/arch/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
