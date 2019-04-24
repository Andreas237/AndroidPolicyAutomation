.class public final Lio/fotoapparat/parameter/Resolution;
.super Ljava/lang/Object;
.source "Resolution.kt"

# interfaces
.implements Lio/fotoapparat/parameter/Parameter;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\u0006\u0010\u0014\u001a\u00020\u0000J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/fotoapparat/parameter/Resolution;",
        "Lio/fotoapparat/parameter/Parameter;",
        "width",
        "",
        "height",
        "(II)V",
        "area",
        "getArea",
        "()I",
        "aspectRatio",
        "",
        "getAspectRatio",
        "()F",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "flipDimensions",
        "hashCode",
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
.field public final height:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final width:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(II)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    iput p2, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    return-void
.end method

.method public static synthetic copy$default(Lio/fotoapparat/parameter/Resolution;IIILjava/lang/Object;)Lio/fotoapparat/parameter/Resolution;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/fotoapparat/parameter/Resolution;->copy(II)Lio/fotoapparat/parameter/Resolution;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    return v0
.end method

.method public final copy(II)Lio/fotoapparat/parameter/Resolution;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lio/fotoapparat/parameter/Resolution;

    invoke-direct {v0, p1, p2}, Lio/fotoapparat/parameter/Resolution;-><init>(II)V

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

    instance-of v1, p1, Lio/fotoapparat/parameter/Resolution;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lio/fotoapparat/parameter/Resolution;

    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    iget v3, p1, Lio/fotoapparat/parameter/Resolution;->width:I

    if-ne v1, v3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_2

    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    iget p1, p1, Lio/fotoapparat/parameter/Resolution;->height:I

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

.method public final flipDimensions()Lio/fotoapparat/parameter/Resolution;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 31
    new-instance v0, Lio/fotoapparat/parameter/Resolution;

    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    iget v2, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    invoke-direct {v0, v1, v2}, Lio/fotoapparat/parameter/Resolution;-><init>(II)V

    return-object v0
.end method

.method public final getArea()I
    .locals 2

    .line 16
    iget v0, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    mul-int/2addr v0, v1

    return v0
.end method

.method public final getAspectRatio()F
    .locals 2

    .line 23
    iget v0, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    if-nez v0, :cond_0

    sget-object v0, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-virtual {v0}, Lkotlin/jvm/internal/FloatCompanionObject;->getNaN()F

    move-result v0

    goto :goto_0

    .line 24
    :cond_0
    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    if-nez v1, :cond_1

    sget-object v0, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-virtual {v0}, Lkotlin/jvm/internal/FloatCompanionObject;->getNaN()F

    move-result v0

    goto :goto_0

    :cond_1
    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Resolution(width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
