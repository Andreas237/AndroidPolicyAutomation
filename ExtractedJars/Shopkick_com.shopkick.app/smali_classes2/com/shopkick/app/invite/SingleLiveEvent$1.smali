.class Lcom/shopkick/app/invite/SingleLiveEvent$1;
.super Ljava/lang/Object;
.source "SingleLiveEvent.java"

# interfaces
.implements Landroid/arch/lifecycle/Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/invite/SingleLiveEvent;->observe(Landroid/arch/lifecycle/LifecycleOwner;Landroid/arch/lifecycle/Observer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/arch/lifecycle/Observer<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/invite/SingleLiveEvent;

.field final synthetic val$observer:Landroid/arch/lifecycle/Observer;


# direct methods
.method constructor <init>(Lcom/shopkick/app/invite/SingleLiveEvent;Landroid/arch/lifecycle/Observer;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/shopkick/app/invite/SingleLiveEvent$1;->this$0:Lcom/shopkick/app/invite/SingleLiveEvent;

    iput-object p2, p0, Lcom/shopkick/app/invite/SingleLiveEvent$1;->val$observer:Landroid/arch/lifecycle/Observer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/invite/SingleLiveEvent$1;->this$0:Lcom/shopkick/app/invite/SingleLiveEvent;

    invoke-static {v0}, Lcom/shopkick/app/invite/SingleLiveEvent;->access$000(Lcom/shopkick/app/invite/SingleLiveEvent;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/invite/SingleLiveEvent$1;->val$observer:Landroid/arch/lifecycle/Observer;

    invoke-interface {v0, p1}, Landroid/arch/lifecycle/Observer;->onChanged(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
