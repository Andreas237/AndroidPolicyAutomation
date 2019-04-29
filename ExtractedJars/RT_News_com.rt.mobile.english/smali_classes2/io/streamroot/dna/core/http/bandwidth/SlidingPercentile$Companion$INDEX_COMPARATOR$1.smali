.class final Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$INDEX_COMPARATOR$1;
.super Ljava/lang/Object;
.source "SlidingPercentile.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "a",
        "Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;",
        "kotlin.jvm.PlatformType",
        "b",
        "compare"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$INDEX_COMPARATOR$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$INDEX_COMPARATOR$1;

    invoke-direct {v0}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$INDEX_COMPARATOR$1;-><init>()V

    sput-object v0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$INDEX_COMPARATOR$1;->INSTANCE:Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$INDEX_COMPARATOR$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;)I
    .locals 0

    .line 126
    invoke-virtual {p1}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->getIndex$dna_core_release()I

    move-result p1

    invoke-virtual {p2}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->getIndex$dna_core_release()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 122
    check-cast p1, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    check-cast p2, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Companion$INDEX_COMPARATOR$1;->compare(Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;)I

    move-result p1

    return p1
.end method
