.class public Lcom/ibotta/api/CachePolicyImpl;
.super Ljava/lang/Object;
.source "CachePolicyImpl.java"

# interfaces
.implements Lcom/ibotta/api/CachePolicy;


# instance fields
.field private final ageLimit:J

.field private final heavyCache:Z

.field private final keepAtMost:Ljava/lang/Integer;

.field private final memcache:Z


# direct methods
.method public constructor <init>(J)V
    .locals 1

    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 1

    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZ)V

    return-void
.end method

.method public constructor <init>(JZZ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    .line 18
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/api/CachePolicyImpl;-><init>(JZZLjava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(JZZLjava/lang/Integer;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-wide p1, p0, Lcom/ibotta/api/CachePolicyImpl;->ageLimit:J

    .line 23
    iput-boolean p3, p0, Lcom/ibotta/api/CachePolicyImpl;->memcache:Z

    .line 24
    iput-boolean p4, p0, Lcom/ibotta/api/CachePolicyImpl;->heavyCache:Z

    .line 25
    iput-object p5, p0, Lcom/ibotta/api/CachePolicyImpl;->keepAtMost:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getAgeLimit()J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/ibotta/api/CachePolicyImpl;->ageLimit:J

    return-wide v0
.end method

.method public getKeepAtMost()Ljava/lang/Integer;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/CachePolicyImpl;->keepAtMost:Ljava/lang/Integer;

    return-object v0
.end method

.method public isHeavyCache()Z
    .locals 1

    .line 45
    iget-boolean v0, p0, Lcom/ibotta/api/CachePolicyImpl;->heavyCache:Z

    return v0
.end method

.method public isMemcache()Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/ibotta/api/CachePolicyImpl;->memcache:Z

    return v0
.end method
