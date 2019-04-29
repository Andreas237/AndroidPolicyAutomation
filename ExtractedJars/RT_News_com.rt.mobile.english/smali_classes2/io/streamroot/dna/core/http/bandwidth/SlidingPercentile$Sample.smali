.class final Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;
.super Ljava/lang/Object;
.source "SlidingPercentile.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Sample"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0006\"\u0004\u0008\u0011\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;",
        "",
        "()V",
        "index",
        "",
        "getIndex$dna_core_release",
        "()I",
        "setIndex$dna_core_release",
        "(I)V",
        "value",
        "",
        "getValue$dna_core_release",
        "()F",
        "setValue$dna_core_release",
        "(F)V",
        "weight",
        "getWeight$dna_core_release",
        "setWeight$dna_core_release",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private index:I

.field private value:F

.field private weight:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getIndex$dna_core_release()I
    .locals 1

    .line 117
    iget v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->index:I

    return v0
.end method

.method public final getValue$dna_core_release()F
    .locals 1

    .line 119
    iget v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->value:F

    return v0
.end method

.method public final getWeight$dna_core_release()I
    .locals 1

    .line 118
    iget v0, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->weight:I

    return v0
.end method

.method public final setIndex$dna_core_release(I)V
    .locals 0

    .line 117
    iput p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->index:I

    return-void
.end method

.method public final setValue$dna_core_release(F)V
    .locals 0

    .line 119
    iput p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->value:F

    return-void
.end method

.method public final setWeight$dna_core_release(I)V
    .locals 0

    .line 118
    iput p1, p0, Lio/streamroot/dna/core/http/bandwidth/SlidingPercentile$Sample;->weight:I

    return-void
.end method
