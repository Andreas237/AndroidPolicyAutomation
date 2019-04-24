.class public Lcom/shopkick/app/util/TimeCache;
.super Ljava/lang/Object;
.source "TimeCache.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/TimeCache$GrowingLruCache;
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
.field final lruCache:Lcom/shopkick/app/util/TimeCache$GrowingLruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/shopkick/app/util/TimeCache$GrowingLruCache<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final maxAge:J


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-wide p1, p0, Lcom/shopkick/app/util/TimeCache;->maxAge:J

    .line 25
    new-instance v0, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    const/16 v1, 0x32

    invoke-direct {v0, v1, p1, p2}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;-><init>(IJ)V

    iput-object v0, p0, Lcom/shopkick/app/util/TimeCache;->lruCache:Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    return-void
.end method

.method constructor <init>(JI)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-wide p1, p0, Lcom/shopkick/app/util/TimeCache;->maxAge:J

    .line 31
    new-instance v0, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    invoke-direct {v0, p3, p1, p2}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;-><init>(IJ)V

    iput-object v0, p0, Lcom/shopkick/app/util/TimeCache;->lruCache:Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/shopkick/app/util/TimeCache;->lruCache:Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public put(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/util/TimeCache;->lruCache:Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    iget-object p1, p0, Lcom/shopkick/app/util/TimeCache;->lruCache:Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    invoke-static {p1}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->access$000(Lcom/shopkick/app/util/TimeCache$GrowingLruCache;)Landroid/support/v4/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 41
    iget-object p1, p0, Lcom/shopkick/app/util/TimeCache;->lruCache:Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    invoke-static {p1}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->access$000(Lcom/shopkick/app/util/TimeCache$GrowingLruCache;)Landroid/support/v4/util/Pair;

    move-result-object p1

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/util/TimeCache;->lruCache:Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->access$002(Lcom/shopkick/app/util/TimeCache$GrowingLruCache;Landroid/support/v4/util/Pair;)Landroid/support/v4/util/Pair;

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/util/TimeCache;->lruCache:Lcom/shopkick/app/util/TimeCache$GrowingLruCache;

    iget-object v1, p1, Landroid/support/v4/util/Pair;->first:Ljava/lang/Object;

    iget-object p1, p1, Landroid/support/v4/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
