.class Lcom/shopkick/app/util/TimeCache$GrowingLruCache;
.super Landroid/support/v4/util/LruCache;
.source "TimeCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/TimeCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "GrowingLruCache"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v4/util/LruCache<",
        "TK;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field private extraPair:Landroid/support/v4/util/Pair;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/Pair<",
            "TK;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final maxAge:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    .line 53
    iput-wide p2, p0, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->maxAge:J

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/util/TimeCache$GrowingLruCache;)Landroid/support/v4/util/Pair;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->extraPair:Landroid/support/v4/util/Pair;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/util/TimeCache$GrowingLruCache;Landroid/support/v4/util/Pair;)Landroid/support/v4/util/Pair;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->extraPair:Landroid/support/v4/util/Pair;

    return-object p1
.end method


# virtual methods
.method protected entryRemoved(ZLjava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZTK;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p4, :cond_1

    return-void

    .line 66
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->maxAge:J

    cmp-long p1, v0, v2

    if-gez p1, :cond_2

    .line 68
    invoke-virtual {p0}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->maxSize()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->resize(I)V

    .line 69
    new-instance p1, Landroid/support/v4/util/Pair;

    invoke-direct {p1, p2, p3}, Landroid/support/v4/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->extraPair:Landroid/support/v4/util/Pair;

    :cond_2
    return-void
.end method

.method protected bridge synthetic entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 47
    check-cast p3, Ljava/lang/Long;

    check-cast p4, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/shopkick/app/util/TimeCache$GrowingLruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;)V

    return-void
.end method
