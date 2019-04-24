.class Lcom/shopkick/app/awards/AwardsManager$DelayBatchRetryRunnable;
.super Ljava/lang/Object;
.source "AwardsManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/awards/AwardsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DelayBatchRetryRunnable"
.end annotation


# instance fields
.field private managerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/awards/AwardsManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/awards/AwardsManager;)V
    .locals 1

    .line 1317
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 1315
    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$DelayBatchRetryRunnable;->managerRef:Ljava/lang/ref/WeakReference;

    .line 1318
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$DelayBatchRetryRunnable;->managerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1323
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$DelayBatchRetryRunnable;->managerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/awards/AwardsManager;

    if-nez v0, :cond_0

    return-void

    .line 1327
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/awards/AwardsManager;->makeBatchRequest()V

    return-void
.end method
