.class public abstract Lcom/usebutton/sdk/internal/util/ResourceLink;
.super Ljava/lang/Object;
.source "ResourceLink.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/CachingLink;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/util/CachingLink<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field public static final LAST_LINK:Lcom/usebutton/sdk/internal/util/CachingLink;

.field private static final TAG:Ljava/lang/String; = "ResourceLink"


# instance fields
.field private mHits:I

.field private mInserts:I

.field private mMisses:I

.field private final mNext:Lcom/usebutton/sdk/internal/util/CachingLink;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/util/CachingLink<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lcom/usebutton/sdk/internal/util/ResourceLink$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/ResourceLink$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/util/ResourceLink;->LAST_LINK:Lcom/usebutton/sdk/internal/util/CachingLink;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 41
    sget-object v0, Lcom/usebutton/sdk/internal/util/ResourceLink;->LAST_LINK:Lcom/usebutton/sdk/internal/util/CachingLink;

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/util/ResourceLink;-><init>(Lcom/usebutton/sdk/internal/util/CachingLink;)V

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/util/CachingLink;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/util/CachingLink;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/util/CachingLink<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mMisses:I

    .line 37
    iput v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mHits:I

    .line 38
    iput v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mInserts:I

    .line 48
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mNext:Lcom/usebutton/sdk/internal/util/CachingLink;

    return-void
.end method

.method private logSelf()V
    .locals 3

    .line 83
    iget v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mHits:I

    iget v1, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mMisses:I

    rem-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    if-nez v0, :cond_0

    const-string v0, "ResourceLink"

    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/util/ResourceLink;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verbose(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract doGet(Ljava/lang/Object;)Ljava/lang/Object;
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation
.end method

.method public abstract doPut(Ljava/lang/Object;Ljava/lang/Object;)V
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation
.end method

.method public declared-synchronized get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    monitor-enter p0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 55
    monitor-exit p0

    return-object p1

    .line 57
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/util/ResourceLink;->doGet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 58
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ResourceLink;->logSelf()V

    if-eqz v0, :cond_1

    .line 60
    iget p1, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mHits:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mHits:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    monitor-exit p0

    return-object v0

    .line 63
    :cond_1
    :try_start_1
    iget v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mMisses:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mMisses:I

    .line 64
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mNext:Lcom/usebutton/sdk/internal/util/CachingLink;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/util/CachingLink;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 65
    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/util/ResourceLink;->put(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized put(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    :try_start_0
    iget v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mInserts:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mInserts:I

    .line 77
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ResourceLink;->logSelf()V

    .line 78
    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/util/ResourceLink;->doPut(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mNext:Lcom/usebutton/sdk/internal/util/CachingLink;

    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/internal/util/CachingLink;->put(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    .line 74
    :cond_1
    :goto_0
    monitor-exit p0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 90
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s{next=%s, hits/misses/total %d/%d/%d, inserts=%d}"

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mNext:Lcom/usebutton/sdk/internal/util/CachingLink;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget v3, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mHits:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    iget v3, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mMisses:I

    .line 92
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    iget v3, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mHits:I

    iget v4, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mMisses:I

    add-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v3, v2, v4

    iget v3, p0, Lcom/usebutton/sdk/internal/util/ResourceLink;->mInserts:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x5

    aput-object v3, v2, v4

    .line 90
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
