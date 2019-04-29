.class public final Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;
.super Ljava/lang/Object;
.source "SlidingPercentile.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;,
        Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u0008\u0010\u0015\u001a\u00020\u0011H\u0002J\u0008\u0010\u0016\u001a\u00020\u0011H\u0002J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000cR\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;",
        "",
        "()V",
        "maxWeight",
        "",
        "(I)V",
        "currentSortOrder",
        "nextSampleIndex",
        "recycledSampleCount",
        "recycledSamples",
        "",
        "Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;",
        "[Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;",
        "samples",
        "Ljava/util/ArrayList;",
        "totalWeight",
        "addSample",
        "",
        "weight",
        "value",
        "",
        "ensureSortedByIndex",
        "ensureSortedByValue",
        "getPercentile",
        "percentile",
        "Companion",
        "Sample",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion;

.field private static final DEFAULT_MAX_WEIGHT:I = 0x7d0

.field private static final INDEX_COMPARATOR:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;",
            ">;"
        }
    .end annotation
.end field

.field private static final MAX_RECYCLED_SAMPLES:I = 0x5

.field private static final SORT_ORDER_BY_INDEX:I = 0x1

.field private static final SORT_ORDER_BY_VALUE:I = 0x0

.field private static final SORT_ORDER_NONE:I = -0x1

.field private static final VALUE_COMPARATOR:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private currentSortOrder:I

.field private final maxWeight:I

.field private nextSampleIndex:I

.field private recycledSampleCount:I

.field private final recycledSamples:[Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

.field private final samples:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;",
            ">;"
        }
    .end annotation
.end field

.field private totalWeight:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->Companion:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion;

    .line 126
    sget-object v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$INDEX_COMPARATOR$1;->INSTANCE:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$INDEX_COMPARATOR$1;

    check-cast v0, Ljava/util/Comparator;

    sput-object v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->INDEX_COMPARATOR:Ljava/util/Comparator;

    .line 127
    sget-object v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$VALUE_COMPARATOR$1;->INSTANCE:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$VALUE_COMPARATOR$1;

    check-cast v0, Ljava/util/Comparator;

    sput-object v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->VALUE_COMPARATOR:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x7d0

    .line 37
    invoke-direct {p0, v0}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->maxWeight:I

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    const/4 p1, 0x5

    .line 40
    new-array p1, p1, [Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    iput-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSamples:[Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    const/4 p1, -0x1

    .line 41
    iput p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->currentSortOrder:I

    return-void
.end method

.method private final ensureSortedByIndex()V
    .locals 3

    .line 100
    iget v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->currentSortOrder:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 101
    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    check-cast v0, Ljava/util/List;

    sget-object v2, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->INDEX_COMPARATOR:Ljava/util/Comparator;

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 102
    iput v1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->currentSortOrder:I

    :cond_0
    return-void
.end method

.method private final ensureSortedByValue()V
    .locals 2

    .line 110
    iget v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->currentSortOrder:I

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    check-cast v0, Ljava/util/List;

    sget-object v1, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->VALUE_COMPARATOR:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v0, 0x0

    .line 112
    iput v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->currentSortOrder:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final addSample(IF)V
    .locals 3

    .line 51
    invoke-direct {p0}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->ensureSortedByIndex()V

    .line 52
    iget v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSampleCount:I

    if-lez v0, :cond_1

    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSamples:[Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    iget v1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSampleCount:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSampleCount:I

    iget v1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSampleCount:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    invoke-direct {v0}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    invoke-direct {v0}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;-><init>()V

    .line 53
    :goto_0
    iget v1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->nextSampleIndex:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->nextSampleIndex:I

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->setIndex$dna_core_release(I)V

    .line 54
    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->setWeight$dna_core_release(I)V

    .line 55
    invoke-virtual {v0, p2}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->setValue$dna_core_release(F)V

    .line 56
    iget-object p2, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    iget p2, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->totalWeight:I

    add-int/2addr p2, p1

    iput p2, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->totalWeight:I

    .line 59
    :cond_2
    :goto_1
    iget p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->totalWeight:I

    iget p2, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->maxWeight:I

    if-le p1, p2, :cond_4

    .line 60
    iget p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->totalWeight:I

    iget p2, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->maxWeight:I

    sub-int/2addr p1, p2

    .line 61
    iget-object p2, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v1, "samples[0]"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    .line 62
    invoke-virtual {p2}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->getWeight$dna_core_release()I

    move-result v1

    if-gt v1, p1, :cond_3

    .line 63
    iget p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->totalWeight:I

    invoke-virtual {p2}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->getWeight$dna_core_release()I

    move-result v1

    sub-int/2addr p1, v1

    iput p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->totalWeight:I

    .line 64
    iget-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 65
    iget p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSampleCount:I

    const/4 v0, 0x5

    if-ge p1, v0, :cond_2

    .line 66
    iget-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSamples:[Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    iget v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSampleCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->recycledSampleCount:I

    aput-object p2, p1, v0

    goto :goto_1

    .line 69
    :cond_3
    invoke-virtual {p2}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->getWeight$dna_core_release()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-virtual {p2, v0}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->setWeight$dna_core_release(I)V

    .line 70
    iget p2, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->totalWeight:I

    sub-int/2addr p2, p1

    iput p2, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->totalWeight:I

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final getPercentile(F)F
    .locals 5

    .line 82
    invoke-direct {p0}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->ensureSortedByValue()V

    .line 83
    iget v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->totalWeight:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    .line 85
    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    .line 86
    iget-object v3, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "samples[i]"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    .line 87
    invoke-virtual {v3}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->getWeight$dna_core_release()I

    move-result v4

    add-int/2addr v2, v4

    int-to-float v4, v2

    cmpl-float v4, v4, p1

    if-ltz v4, :cond_0

    .line 89
    invoke-virtual {v3}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->getValue$dna_core_release()F

    move-result p1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 93
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const/high16 p1, 0x7fc00000    # Float.NaN

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    iget-object v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;->samples:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    invoke-virtual {p1}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->getValue$dna_core_release()F

    move-result p1

    :goto_1
    return p1
.end method
