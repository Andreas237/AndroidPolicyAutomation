.class Lcom/shopkick/app/awards/AwardsManager$PresenceRequestAPICommonCallback;
.super Ljava/lang/Object;
.source "AwardsManager.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/awards/AwardsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PresenceRequestAPICommonCallback"
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

    .line 1360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 1358
    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$PresenceRequestAPICommonCallback;->managerRef:Ljava/lang/ref/WeakReference;

    .line 1361
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager$PresenceRequestAPICommonCallback;->managerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public finishedProcessing(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 0

    .line 1366
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager$PresenceRequestAPICommonCallback;->managerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/awards/AwardsManager;

    if-nez p1, :cond_0

    return-void

    .line 1371
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/awards/AwardsManager;->onOverlayHandlingDone()V

    return-void
.end method
