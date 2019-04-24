.class public final Lio/fotoapparat/characteristic/Characteristics;
.super Ljava/lang/Object;
.source "Characteristics.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\t2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/fotoapparat/characteristic/Characteristics;",
        "",
        "cameraId",
        "",
        "lensPosition",
        "Lio/fotoapparat/characteristic/LensPosition;",
        "cameraOrientation",
        "Lio/fotoapparat/hardware/orientation/Orientation;",
        "isMirrored",
        "",
        "(ILio/fotoapparat/characteristic/LensPosition;Lio/fotoapparat/hardware/orientation/Orientation;Z)V",
        "getCameraId",
        "()I",
        "getCameraOrientation",
        "()Lio/fotoapparat/hardware/orientation/Orientation;",
        "()Z",
        "getLensPosition",
        "()Lio/fotoapparat/characteristic/LensPosition;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
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
.field private final cameraId:I

.field private final cameraOrientation:Lio/fotoapparat/hardware/orientation/Orientation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final isMirrored:Z

.field private final lensPosition:Lio/fotoapparat/characteristic/LensPosition;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILio/fotoapparat/characteristic/LensPosition;Lio/fotoapparat/hardware/orientation/Orientation;Z)V
    .locals 1
    .param p2    # Lio/fotoapparat/characteristic/LensPosition;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "lensPosition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraOrientation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraId:I

    iput-object p2, p0, Lio/fotoapparat/characteristic/Characteristics;->lensPosition:Lio/fotoapparat/characteristic/LensPosition;

    iput-object p3, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    iput-boolean p4, p0, Lio/fotoapparat/characteristic/Characteristics;->isMirrored:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/fotoapparat/characteristic/Characteristics;ILio/fotoapparat/characteristic/LensPosition;Lio/fotoapparat/hardware/orientation/Orientation;ZILjava/lang/Object;)Lio/fotoapparat/characteristic/Characteristics;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraId:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/fotoapparat/characteristic/Characteristics;->lensPosition:Lio/fotoapparat/characteristic/LensPosition;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lio/fotoapparat/characteristic/Characteristics;->isMirrored:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/fotoapparat/characteristic/Characteristics;->copy(ILio/fotoapparat/characteristic/LensPosition;Lio/fotoapparat/hardware/orientation/Orientation;Z)Lio/fotoapparat/characteristic/Characteristics;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraId:I

    return v0
.end method

.method public final component2()Lio/fotoapparat/characteristic/LensPosition;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/characteristic/Characteristics;->lensPosition:Lio/fotoapparat/characteristic/LensPosition;

    return-object v0
.end method

.method public final component3()Lio/fotoapparat/hardware/orientation/Orientation;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/fotoapparat/characteristic/Characteristics;->isMirrored:Z

    return v0
.end method

.method public final copy(ILio/fotoapparat/characteristic/LensPosition;Lio/fotoapparat/hardware/orientation/Orientation;Z)Lio/fotoapparat/characteristic/Characteristics;
    .locals 1
    .param p2    # Lio/fotoapparat/characteristic/LensPosition;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "lensPosition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraOrientation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/fotoapparat/characteristic/Characteristics;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/fotoapparat/characteristic/Characteristics;-><init>(ILio/fotoapparat/characteristic/LensPosition;Lio/fotoapparat/hardware/orientation/Orientation;Z)V

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

    instance-of v1, p1, Lio/fotoapparat/characteristic/Characteristics;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lio/fotoapparat/characteristic/Characteristics;

    iget v1, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraId:I

    iget v3, p1, Lio/fotoapparat/characteristic/Characteristics;->cameraId:I

    if-ne v1, v3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/fotoapparat/characteristic/Characteristics;->lensPosition:Lio/fotoapparat/characteristic/LensPosition;

    iget-object v3, p1, Lio/fotoapparat/characteristic/Characteristics;->lensPosition:Lio/fotoapparat/characteristic/LensPosition;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    iget-object v3, p1, Lio/fotoapparat/characteristic/Characteristics;->cameraOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lio/fotoapparat/characteristic/Characteristics;->isMirrored:Z

    iget-boolean p1, p1, Lio/fotoapparat/characteristic/Characteristics;->isMirrored:Z

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

.method public final getCameraId()I
    .locals 1

    .line 9
    iget v0, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraId:I

    return v0
.end method

.method public final getCameraOrientation()Lio/fotoapparat/hardware/orientation/Orientation;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    iget-object v0, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    return-object v0
.end method

.method public final getLensPosition()Lio/fotoapparat/characteristic/LensPosition;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    iget-object v0, p0, Lio/fotoapparat/characteristic/Characteristics;->lensPosition:Lio/fotoapparat/characteristic/LensPosition;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraId:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/fotoapparat/characteristic/Characteristics;->lensPosition:Lio/fotoapparat/characteristic/LensPosition;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lio/fotoapparat/characteristic/Characteristics;->isMirrored:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final isMirrored()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lio/fotoapparat/characteristic/Characteristics;->isMirrored:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Characteristics(cameraId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lensPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/fotoapparat/characteristic/Characteristics;->lensPosition:Lio/fotoapparat/characteristic/LensPosition;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cameraOrientation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/fotoapparat/characteristic/Characteristics;->cameraOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isMirrored="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/fotoapparat/characteristic/Characteristics;->isMirrored:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
