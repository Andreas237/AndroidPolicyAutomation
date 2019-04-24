.class public final Lio/fotoapparat/parameter/FpsRange;
.super Ljava/lang/Object;
.source "FpsRange.kt"

# interfaces
.implements Lio/fotoapparat/parameter/Parameter;
.implements Lkotlin/ranges/ClosedRange;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/fotoapparat/parameter/Parameter;",
        "Lkotlin/ranges/ClosedRange<",
        "Ljava/lang/Integer;",
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
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0003H\u0096\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u000b2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u000bH\u0096\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0012\u0010\u0007\u001a\u00020\u0003X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0012\u0010\u0010\u001a\u00020\u0003X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\t\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/fotoapparat/parameter/FpsRange;",
        "Lio/fotoapparat/parameter/Parameter;",
        "Lkotlin/ranges/ClosedRange;",
        "",
        "min",
        "max",
        "(II)V",
        "endInclusive",
        "getEndInclusive",
        "()Ljava/lang/Integer;",
        "isFixed",
        "",
        "()Z",
        "getMax",
        "()I",
        "getMin",
        "start",
        "getStart",
        "component1",
        "component2",
        "contains",
        "value",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "isEmpty",
        "toString",
        "",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final synthetic $$delegate_0:Lkotlin/ranges/IntRange;

.field private final max:I

.field private final min:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Lkotlin/ranges/IntRange;

    invoke-direct {v0, p1, p2}, Lkotlin/ranges/IntRange;-><init>(II)V

    iput-object v0, p0, Lio/fotoapparat/parameter/FpsRange;->$$delegate_0:Lkotlin/ranges/IntRange;

    iput p1, p0, Lio/fotoapparat/parameter/FpsRange;->min:I

    iput p2, p0, Lio/fotoapparat/parameter/FpsRange;->max:I

    return-void
.end method

.method public static synthetic copy$default(Lio/fotoapparat/parameter/FpsRange;IIILjava/lang/Object;)Lio/fotoapparat/parameter/FpsRange;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lio/fotoapparat/parameter/FpsRange;->min:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lio/fotoapparat/parameter/FpsRange;->max:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/fotoapparat/parameter/FpsRange;->copy(II)Lio/fotoapparat/parameter/FpsRange;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/fotoapparat/parameter/FpsRange;->min:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/fotoapparat/parameter/FpsRange;->max:I

    return v0
.end method

.method public contains(I)Z
    .locals 1

    iget-object v0, p0, Lio/fotoapparat/parameter/FpsRange;->$$delegate_0:Lkotlin/ranges/IntRange;

    invoke-virtual {v0, p1}, Lkotlin/ranges/IntRange;->contains(I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic contains(Ljava/lang/Comparable;)Z
    .locals 0

    .line 9
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lio/fotoapparat/parameter/FpsRange;->contains(I)Z

    move-result p1

    return p1
.end method

.method public final copy(II)Lio/fotoapparat/parameter/FpsRange;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lio/fotoapparat/parameter/FpsRange;

    invoke-direct {v0, p1, p2}, Lio/fotoapparat/parameter/FpsRange;-><init>(II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_3

    instance-of v1, p1, Lio/fotoapparat/parameter/FpsRange;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lio/fotoapparat/parameter/FpsRange;

    iget v1, p0, Lio/fotoapparat/parameter/FpsRange;->min:I

    iget v3, p1, Lio/fotoapparat/parameter/FpsRange;->min:I

    if-ne v1, v3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_2

    iget v1, p0, Lio/fotoapparat/parameter/FpsRange;->max:I

    iget p1, p1, Lio/fotoapparat/parameter/FpsRange;->max:I

    if-ne v1, p1, :cond_1

    move p1, v0

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v0
.end method

.method public bridge synthetic getEndInclusive()Ljava/lang/Comparable;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lio/fotoapparat/parameter/FpsRange;->getEndInclusive()Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    return-object v0
.end method

.method public getEndInclusive()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/parameter/FpsRange;->$$delegate_0:Lkotlin/ranges/IntRange;

    invoke-virtual {v0}, Lkotlin/ranges/IntRange;->getEndInclusive()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getMax()I
    .locals 1

    .line 20
    iget v0, p0, Lio/fotoapparat/parameter/FpsRange;->max:I

    return v0
.end method

.method public final getMin()I
    .locals 1

    .line 14
    iget v0, p0, Lio/fotoapparat/parameter/FpsRange;->min:I

    return v0
.end method

.method public bridge synthetic getStart()Ljava/lang/Comparable;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lio/fotoapparat/parameter/FpsRange;->getStart()Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    return-object v0
.end method

.method public getStart()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/parameter/FpsRange;->$$delegate_0:Lkotlin/ranges/IntRange;

    invoke-virtual {v0}, Lkotlin/ranges/IntRange;->getStart()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lio/fotoapparat/parameter/FpsRange;->min:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lio/fotoapparat/parameter/FpsRange;->max:I

    add-int/2addr v0, v1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lio/fotoapparat/parameter/FpsRange;->$$delegate_0:Lkotlin/ranges/IntRange;

    invoke-virtual {v0}, Lkotlin/ranges/IntRange;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final isFixed()Z
    .locals 2

    .line 29
    iget v0, p0, Lio/fotoapparat/parameter/FpsRange;->max:I

    iget v1, p0, Lio/fotoapparat/parameter/FpsRange;->min:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FpsRange(min="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/fotoapparat/parameter/FpsRange;->min:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", max="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/fotoapparat/parameter/FpsRange;->max:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
