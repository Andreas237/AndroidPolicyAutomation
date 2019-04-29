.class abstract Lcom/mopub/nativeads/TaskManager;
.super Ljava/lang/Object;
.source "TaskManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/nativeads/TaskManager$TaskManagerListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final mCompletedCount:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field protected final mFailed:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field protected final mImageTaskManagerListener:Lcom/mopub/nativeads/TaskManager$TaskManagerListener;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mopub/nativeads/TaskManager$TaskManagerListener<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected final mResults:Ljava/util/Map;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "TT;>;"
        }
    .end annotation
.end field

.field protected final mSize:I


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/mopub/nativeads/TaskManager$TaskManagerListener;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/nativeads/TaskManager$TaskManagerListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/mopub/nativeads/TaskManager$TaskManagerListener<",
            "TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Urls list cannot be null"

    .line 32
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ImageTaskManagerListener cannot be null"

    .line 33
    invoke-static {p2, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Urls list cannot contain null"

    invoke-static {v0, v1}, Lcom/mopub/common/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 36
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lcom/mopub/nativeads/TaskManager;->mSize:I

    .line 38
    iput-object p2, p0, Lcom/mopub/nativeads/TaskManager;->mImageTaskManagerListener:Lcom/mopub/nativeads/TaskManager$TaskManagerListener;

    .line 39
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lcom/mopub/nativeads/TaskManager;->mCompletedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/mopub/nativeads/TaskManager;->mFailed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    new-instance p1, Ljava/util/HashMap;

    iget p2, p0, Lcom/mopub/nativeads/TaskManager;->mSize:I

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/nativeads/TaskManager;->mResults:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method abstract execute()V
.end method
