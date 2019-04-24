.class public Lcom/shopkick/app/controllers/NetworkStatsCounter;
.super Ljava/lang/Object;
.source "NetworkStatsCounter.java"


# static fields
.field public static final NO_NETWORK_ERROR_COUNT:Ljava/lang/String; = "no_network_error_count"

.field public static final REQUEST_COUNT:Ljava/lang/String; = "request_count"

.field public static final RESPONSE_COUNT:Ljava/lang/String; = "response_count"

.field public static final SUCCESS_COUNT:Ljava/lang/String; = "success_count"

.field public static keys:[Ljava/lang/String;


# instance fields
.field private networkStatsTable:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "no_network_error_count"

    const-string v1, "request_count"

    const-string v2, "response_count"

    const-string/jumbo v3, "success_count"

    .line 12
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/controllers/NetworkStatsCounter;->keys:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-direct {p0}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->initializeTable()V

    return-void
.end method

.method private initializeTable()V
    .locals 1

    .line 21
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/controllers/NetworkStatsCounter;->networkStatsTable:Ljava/util/Hashtable;

    .line 22
    invoke-virtual {p0}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->resetNetworkStats()V

    return-void
.end method


# virtual methods
.method public declared-synchronized getCount(Ljava/lang/String;)I
    .locals 1

    monitor-enter p0

    .line 41
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/NetworkStatsCounter;->networkStatsTable:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized increment(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    .line 32
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->increment(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized increment(Ljava/lang/String;I)V
    .locals 2

    monitor-enter p0

    .line 36
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/NetworkStatsCounter;->networkStatsTable:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/controllers/NetworkStatsCounter;->networkStatsTable:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 37
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/controllers/NetworkStatsCounter;->networkStatsTable:Ljava/util/Hashtable;

    add-int/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized resetNetworkStats()V
    .locals 7

    monitor-enter p0

    .line 26
    :try_start_0
    sget-object v0, Lcom/shopkick/app/controllers/NetworkStatsCounter;->keys:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 27
    iget-object v5, p0, Lcom/shopkick/app/controllers/NetworkStatsCounter;->networkStatsTable:Ljava/util/Hashtable;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 29
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
