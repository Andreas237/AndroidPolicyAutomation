.class Lcom/shopkick/app/awards/AwardsManager$TimeoutRunnable;
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
    name = "TimeoutRunnable"
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

    .line 1334
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 1332
    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$TimeoutRunnable;->managerRef:Ljava/lang/ref/WeakReference;

    .line 1335
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$TimeoutRunnable;->managerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1340
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$TimeoutRunnable;->managerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/awards/AwardsManager;

    if-nez v0, :cond_0

    return-void

    .line 1349
    :cond_0
    new-instance v8, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZII)V

    const/4 v1, 0x0

    invoke-static {v0, v8, v2, v1, v2}, Lcom/shopkick/app/awards/AwardsManager;->access$300(Lcom/shopkick/app/awards/AwardsManager;Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    return-void
.end method
