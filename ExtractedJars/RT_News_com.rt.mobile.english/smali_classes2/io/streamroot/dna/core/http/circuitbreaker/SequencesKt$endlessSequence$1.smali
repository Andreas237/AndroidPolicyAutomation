.class final Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$endlessSequence$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Sequences.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt;->endlessSequence(JJDD)Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;",
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
        "\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $factor:D

.field final synthetic $maxDelay:J


# direct methods
.method constructor <init>(DJ)V
    .locals 0

    iput-wide p1, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$endlessSequence$1;->$factor:D

    iput-wide p3, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$endlessSequence$1;->$maxDelay:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(J)J
    .locals 2

    long-to-double p1, p1

    .line 7
    iget-wide v0, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$endlessSequence$1;->$factor:D

    mul-double/2addr p1, v0

    double-to-long p1, p1

    iget-wide v0, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$endlessSequence$1;->$maxDelay:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$endlessSequence$1;->invoke(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
