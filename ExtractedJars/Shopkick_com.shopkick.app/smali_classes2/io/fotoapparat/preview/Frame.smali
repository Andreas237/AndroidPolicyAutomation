.class public final Lio/fotoapparat/preview/Frame;
.super Ljava/lang/Object;
.source "Frame.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u0016\u001a\u00020\u0007H\u0016J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/fotoapparat/preview/Frame;",
        "",
        "size",
        "Lio/fotoapparat/parameter/Resolution;",
        "image",
        "",
        "rotation",
        "",
        "(Lio/fotoapparat/parameter/Resolution;[BI)V",
        "getImage",
        "()[B",
        "getRotation",
        "()I",
        "getSize",
        "()Lio/fotoapparat/parameter/Resolution;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
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
.field private final image:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rotation:I

.field private final size:Lio/fotoapparat/parameter/Resolution;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/fotoapparat/parameter/Resolution;[BI)V
    .locals 1
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/preview/Frame;->size:Lio/fotoapparat/parameter/Resolution;

    iput-object p2, p0, Lio/fotoapparat/preview/Frame;->image:[B

    iput p3, p0, Lio/fotoapparat/preview/Frame;->rotation:I

    return-void
.end method

.method public static synthetic copy$default(Lio/fotoapparat/preview/Frame;Lio/fotoapparat/parameter/Resolution;[BIILjava/lang/Object;)Lio/fotoapparat/preview/Frame;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/fotoapparat/preview/Frame;->size:Lio/fotoapparat/parameter/Resolution;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/fotoapparat/preview/Frame;->image:[B

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lio/fotoapparat/preview/Frame;->rotation:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/fotoapparat/preview/Frame;->copy(Lio/fotoapparat/parameter/Resolution;[BI)Lio/fotoapparat/preview/Frame;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/fotoapparat/parameter/Resolution;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/preview/Frame;->size:Lio/fotoapparat/parameter/Resolution;

    return-object v0
.end method

.method public final component2()[B
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/preview/Frame;->image:[B

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/fotoapparat/preview/Frame;->rotation:I

    return v0
.end method

.method public final copy(Lio/fotoapparat/parameter/Resolution;[BI)Lio/fotoapparat/preview/Frame;
    .locals 1
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/fotoapparat/preview/Frame;

    invoke-direct {v0, p1, p2, p3}, Lio/fotoapparat/preview/Frame;-><init>(Lio/fotoapparat/parameter/Resolution;[BI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 33
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/preview/Frame;

    const/4 v1, 0x1

    if-ne v0, p1, :cond_0

    return v1

    .line 34
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    if-eqz p1, :cond_6

    .line 36
    check-cast p1, Lio/fotoapparat/preview/Frame;

    .line 38
    iget-object v0, p0, Lio/fotoapparat/preview/Frame;->size:Lio/fotoapparat/parameter/Resolution;

    iget-object v3, p1, Lio/fotoapparat/preview/Frame;->size:Lio/fotoapparat/parameter/Resolution;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    return v2

    .line 39
    :cond_3
    iget-object v0, p0, Lio/fotoapparat/preview/Frame;->image:[B

    iget-object v3, p1, Lio/fotoapparat/preview/Frame;->image:[B

    invoke-static {v0, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    return v2

    .line 40
    :cond_4
    iget v0, p0, Lio/fotoapparat/preview/Frame;->rotation:I

    iget p1, p1, Lio/fotoapparat/preview/Frame;->rotation:I

    if-eq v0, p1, :cond_5

    return v2

    :cond_5
    return v1

    .line 36
    :cond_6
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type io.fotoapparat.preview.Frame"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getImage()[B
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object v0, p0, Lio/fotoapparat/preview/Frame;->image:[B

    return-object v0
.end method

.method public final getRotation()I
    .locals 1

    .line 21
    iget v0, p0, Lio/fotoapparat/preview/Frame;->rotation:I

    return v0
.end method

.method public final getSize()Lio/fotoapparat/parameter/Resolution;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object v0, p0, Lio/fotoapparat/preview/Frame;->size:Lio/fotoapparat/parameter/Resolution;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 46
    iget-object v0, p0, Lio/fotoapparat/preview/Frame;->size:Lio/fotoapparat/parameter/Resolution;

    invoke-virtual {v0}, Lio/fotoapparat/parameter/Resolution;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 47
    iget-object v1, p0, Lio/fotoapparat/preview/Frame;->image:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 48
    iget v1, p0, Lio/fotoapparat/preview/Frame;->rotation:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Frame{size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    iget-object v1, p0, Lio/fotoapparat/preview/Frame;->size:Lio/fotoapparat/parameter/Resolution;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", image= array("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    iget-object v1, p0, Lio/fotoapparat/preview/Frame;->image:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    iget v1, p0, Lio/fotoapparat/preview/Frame;->rotation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
