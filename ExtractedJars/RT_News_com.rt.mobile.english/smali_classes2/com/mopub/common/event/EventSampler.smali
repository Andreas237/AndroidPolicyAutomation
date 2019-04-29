.class public Lcom/mopub/common/event/EventSampler;
.super Ljava/lang/Object;
.source "EventSampler.java"


# static fields
.field private static final CAPACITY:I = 0x87

.field private static final LOAD_FACTOR:F = 0.75f

.field static final MAX_SIZE:I = 0x64
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field


# instance fields
.field private mRandom:Ljava/util/Random;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mSampleDecisionsCache:Ljava/util/LinkedHashMap;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-direct {p0, v0}, Lcom/mopub/common/event/EventSampler;-><init>(Ljava/util/Random;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Random;)V
    .locals 3
    .param p1    # Ljava/util/Random;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/mopub/common/event/EventSampler;->mRandom:Ljava/util/Random;

    .line 34
    new-instance p1, Lcom/mopub/common/event/EventSampler$1;

    const/16 v0, 0x87

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/mopub/common/event/EventSampler$1;-><init>(Lcom/mopub/common/event/EventSampler;IFZ)V

    iput-object p1, p0, Lcom/mopub/common/event/EventSampler;->mSampleDecisionsCache:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method getCacheSize()I
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/mopub/common/event/EventSampler;->mSampleDecisionsCache:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    return v0
.end method

.method sample(Lcom/mopub/common/event/BaseEvent;)Z
    .locals 7
    .param p1    # Lcom/mopub/common/event/BaseEvent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 53
    invoke-virtual {p1}, Lcom/mopub/common/event/BaseEvent;->getRequestId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 55
    iget-object v0, p0, Lcom/mopub/common/event/EventSampler;->mRandom:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/mopub/common/event/BaseEvent;->getSamplingRate()D

    move-result-wide v5

    cmpg-double p1, v3, v5

    if-gez p1, :cond_0

    move v1, v2

    :cond_0
    return v1

    .line 58
    :cond_1
    iget-object v3, p0, Lcom/mopub/common/event/EventSampler;->mSampleDecisionsCache:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    if-eqz v3, :cond_2

    .line 60
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 62
    :cond_2
    iget-object v3, p0, Lcom/mopub/common/event/EventSampler;->mRandom:Ljava/util/Random;

    invoke-virtual {v3}, Ljava/util/Random;->nextDouble()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/mopub/common/event/BaseEvent;->getSamplingRate()D

    move-result-wide v5

    cmpg-double p1, v3, v5

    if-gez p1, :cond_3

    move v1, v2

    .line 63
    :cond_3
    iget-object p1, p0, Lcom/mopub/common/event/EventSampler;->mSampleDecisionsCache:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1
.end method
