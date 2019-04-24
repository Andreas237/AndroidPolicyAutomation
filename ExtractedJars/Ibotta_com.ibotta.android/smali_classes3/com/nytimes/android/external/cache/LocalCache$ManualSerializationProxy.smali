.class Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;
.super Lcom/nytimes/android/external/cache/ForwardingCache;
.source "LocalCache.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ManualSerializationProxy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/ForwardingCache<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field final concurrencyLevel:I

.field transient delegate:Lcom/nytimes/android/external/cache/Cache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/Cache<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field final expireAfterAccessNanos:J

.field final expireAfterWriteNanos:J

.field final keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/Equivalence<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final keyStrength:Lcom/nytimes/android/external/cache/LocalCache$Strength;

.field final loader:Lcom/nytimes/android/external/cache/CacheLoader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/CacheLoader<",
            "-TK;TV;>;"
        }
    .end annotation
.end field

.field final maxWeight:J

.field final removalListener:Lcom/nytimes/android/external/cache/RemovalListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/RemovalListener<",
            "-TK;-TV;>;"
        }
    .end annotation
.end field

.field final ticker:Lcom/nytimes/android/external/cache/Ticker;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final valueEquivalence:Lcom/nytimes/android/external/cache/Equivalence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/Equivalence<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final valueStrength:Lcom/nytimes/android/external/cache/LocalCache$Strength;

.field final weigher:Lcom/nytimes/android/external/cache/Weigher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/Weigher<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/nytimes/android/external/cache/LocalCache$Strength;Lcom/nytimes/android/external/cache/LocalCache$Strength;Lcom/nytimes/android/external/cache/Equivalence;Lcom/nytimes/android/external/cache/Equivalence;JJJLcom/nytimes/android/external/cache/Weigher;ILcom/nytimes/android/external/cache/RemovalListener;Lcom/nytimes/android/external/cache/Ticker;Lcom/nytimes/android/external/cache/CacheLoader;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$Strength;",
            "Lcom/nytimes/android/external/cache/LocalCache$Strength;",
            "Lcom/nytimes/android/external/cache/Equivalence<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/nytimes/android/external/cache/Equivalence<",
            "Ljava/lang/Object;",
            ">;JJJ",
            "Lcom/nytimes/android/external/cache/Weigher<",
            "TK;TV;>;I",
            "Lcom/nytimes/android/external/cache/RemovalListener<",
            "-TK;-TV;>;",
            "Lcom/nytimes/android/external/cache/Ticker;",
            "Lcom/nytimes/android/external/cache/CacheLoader<",
            "-TK;TV;>;)V"
        }
    .end annotation

    .line 4698
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/ForwardingCache;-><init>()V

    .line 4699
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->keyStrength:Lcom/nytimes/android/external/cache/LocalCache$Strength;

    .line 4700
    iput-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->valueStrength:Lcom/nytimes/android/external/cache/LocalCache$Strength;

    .line 4701
    iput-object p3, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 4702
    iput-object p4, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->valueEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 4703
    iput-wide p5, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->expireAfterWriteNanos:J

    .line 4704
    iput-wide p7, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->expireAfterAccessNanos:J

    .line 4705
    iput-wide p9, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->maxWeight:J

    .line 4706
    iput-object p11, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->weigher:Lcom/nytimes/android/external/cache/Weigher;

    .line 4707
    iput p12, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->concurrencyLevel:I

    .line 4708
    iput-object p13, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->removalListener:Lcom/nytimes/android/external/cache/RemovalListener;

    .line 4709
    invoke-static {}, Lcom/nytimes/android/external/cache/Ticker;->systemTicker()Lcom/nytimes/android/external/cache/Ticker;

    move-result-object p1

    if-eq p14, p1, :cond_0

    sget-object p1, Lcom/nytimes/android/external/cache/CacheBuilder;->NULL_TICKER:Lcom/nytimes/android/external/cache/Ticker;

    if-ne p14, p1, :cond_1

    :cond_0
    const/4 p14, 0x0

    .line 4710
    :cond_1
    iput-object p14, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    .line 4711
    iput-object p15, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->loader:Lcom/nytimes/android/external/cache/CacheLoader;

    return-void
.end method

.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache;)V
    .locals 16
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache<",
            "TK;TV;>;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    .line 4677
    iget-object v1, v0, Lcom/nytimes/android/external/cache/LocalCache;->keyStrength:Lcom/nytimes/android/external/cache/LocalCache$Strength;

    iget-object v2, v0, Lcom/nytimes/android/external/cache/LocalCache;->valueStrength:Lcom/nytimes/android/external/cache/LocalCache$Strength;

    iget-object v3, v0, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    iget-object v4, v0, Lcom/nytimes/android/external/cache/LocalCache;->valueEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    iget-wide v5, v0, Lcom/nytimes/android/external/cache/LocalCache;->expireAfterWriteNanos:J

    iget-wide v7, v0, Lcom/nytimes/android/external/cache/LocalCache;->expireAfterAccessNanos:J

    iget-wide v9, v0, Lcom/nytimes/android/external/cache/LocalCache;->maxWeight:J

    iget-object v11, v0, Lcom/nytimes/android/external/cache/LocalCache;->weigher:Lcom/nytimes/android/external/cache/Weigher;

    iget v12, v0, Lcom/nytimes/android/external/cache/LocalCache;->concurrencyLevel:I

    iget-object v13, v0, Lcom/nytimes/android/external/cache/LocalCache;->removalListener:Lcom/nytimes/android/external/cache/RemovalListener;

    iget-object v14, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    iget-object v15, v0, Lcom/nytimes/android/external/cache/LocalCache;->defaultLoader:Lcom/nytimes/android/external/cache/CacheLoader;

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;-><init>(Lcom/nytimes/android/external/cache/LocalCache$Strength;Lcom/nytimes/android/external/cache/LocalCache$Strength;Lcom/nytimes/android/external/cache/Equivalence;Lcom/nytimes/android/external/cache/Equivalence;JJJLcom/nytimes/android/external/cache/Weigher;ILcom/nytimes/android/external/cache/RemovalListener;Lcom/nytimes/android/external/cache/Ticker;Lcom/nytimes/android/external/cache/CacheLoader;)V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0
    .param p1    # Ljava/io/ObjectInputStream;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 4747
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 4748
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->recreateCacheBuilder()Lcom/nytimes/android/external/cache/CacheBuilder;

    move-result-object p1

    .line 4749
    invoke-virtual {p1}, Lcom/nytimes/android/external/cache/CacheBuilder;->build()Lcom/nytimes/android/external/cache/Cache;

    move-result-object p1

    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->delegate:Lcom/nytimes/android/external/cache/Cache;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 4753
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->delegate:Lcom/nytimes/android/external/cache/Cache;

    return-object v0
.end method


# virtual methods
.method protected delegate()Lcom/nytimes/android/external/cache/Cache;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/Cache<",
            "TK;TV;>;"
        }
    .end annotation

    .line 4758
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->delegate:Lcom/nytimes/android/external/cache/Cache;

    return-object v0
.end method

.method protected bridge synthetic delegate()Ljava/lang/Object;
    .locals 1

    .line 4656
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->delegate()Lcom/nytimes/android/external/cache/Cache;

    move-result-object v0

    return-object v0
.end method

.method recreateCacheBuilder()Lcom/nytimes/android/external/cache/CacheBuilder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/CacheBuilder<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 4716
    invoke-static {}, Lcom/nytimes/android/external/cache/CacheBuilder;->newBuilder()Lcom/nytimes/android/external/cache/CacheBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->keyStrength:Lcom/nytimes/android/external/cache/LocalCache$Strength;

    .line 4717
    invoke-virtual {v0, v1}, Lcom/nytimes/android/external/cache/CacheBuilder;->setKeyStrength(Lcom/nytimes/android/external/cache/LocalCache$Strength;)Lcom/nytimes/android/external/cache/CacheBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->valueStrength:Lcom/nytimes/android/external/cache/LocalCache$Strength;

    .line 4718
    invoke-virtual {v0, v1}, Lcom/nytimes/android/external/cache/CacheBuilder;->setValueStrength(Lcom/nytimes/android/external/cache/LocalCache$Strength;)Lcom/nytimes/android/external/cache/CacheBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 4719
    invoke-virtual {v0, v1}, Lcom/nytimes/android/external/cache/CacheBuilder;->keyEquivalence(Lcom/nytimes/android/external/cache/Equivalence;)Lcom/nytimes/android/external/cache/CacheBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->valueEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 4720
    invoke-virtual {v0, v1}, Lcom/nytimes/android/external/cache/CacheBuilder;->valueEquivalence(Lcom/nytimes/android/external/cache/Equivalence;)Lcom/nytimes/android/external/cache/CacheBuilder;

    move-result-object v0

    iget v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->concurrencyLevel:I

    .line 4721
    invoke-virtual {v0, v1}, Lcom/nytimes/android/external/cache/CacheBuilder;->concurrencyLevel(I)Lcom/nytimes/android/external/cache/CacheBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->removalListener:Lcom/nytimes/android/external/cache/RemovalListener;

    .line 4722
    invoke-virtual {v0, v1}, Lcom/nytimes/android/external/cache/CacheBuilder;->removalListener(Lcom/nytimes/android/external/cache/RemovalListener;)Lcom/nytimes/android/external/cache/CacheBuilder;

    move-result-object v0

    const/4 v1, 0x0

    .line 4723
    iput-boolean v1, v0, Lcom/nytimes/android/external/cache/CacheBuilder;->strictParsing:Z

    .line 4724
    iget-wide v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->expireAfterWriteNanos:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 4725
    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v5}, Lcom/nytimes/android/external/cache/CacheBuilder;->expireAfterWrite(JLjava/util/concurrent/TimeUnit;)Lcom/nytimes/android/external/cache/CacheBuilder;

    .line 4727
    :cond_0
    iget-wide v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->expireAfterAccessNanos:J

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    .line 4728
    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/nytimes/android/external/cache/CacheBuilder;->expireAfterAccess(JLjava/util/concurrent/TimeUnit;)Lcom/nytimes/android/external/cache/CacheBuilder;

    .line 4730
    :cond_1
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->weigher:Lcom/nytimes/android/external/cache/Weigher;

    sget-object v2, Lcom/nytimes/android/external/cache/CacheBuilder$OneWeigher;->INSTANCE:Lcom/nytimes/android/external/cache/CacheBuilder$OneWeigher;

    const-wide/16 v3, -0x1

    if-eq v1, v2, :cond_2

    .line 4731
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->weigher:Lcom/nytimes/android/external/cache/Weigher;

    invoke-virtual {v0, v1}, Lcom/nytimes/android/external/cache/CacheBuilder;->weigher(Lcom/nytimes/android/external/cache/Weigher;)Lcom/nytimes/android/external/cache/CacheBuilder;

    .line 4732
    iget-wide v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->maxWeight:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    .line 4733
    invoke-virtual {v0, v1, v2}, Lcom/nytimes/android/external/cache/CacheBuilder;->maximumWeight(J)Lcom/nytimes/android/external/cache/CacheBuilder;

    goto :goto_0

    .line 4736
    :cond_2
    iget-wide v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->maxWeight:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    .line 4737
    invoke-virtual {v0, v1, v2}, Lcom/nytimes/android/external/cache/CacheBuilder;->maximumSize(J)Lcom/nytimes/android/external/cache/CacheBuilder;

    .line 4740
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$ManualSerializationProxy;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    if-eqz v1, :cond_4

    .line 4741
    invoke-virtual {v0, v1}, Lcom/nytimes/android/external/cache/CacheBuilder;->ticker(Lcom/nytimes/android/external/cache/Ticker;)Lcom/nytimes/android/external/cache/CacheBuilder;

    :cond_4
    return-object v0
.end method
