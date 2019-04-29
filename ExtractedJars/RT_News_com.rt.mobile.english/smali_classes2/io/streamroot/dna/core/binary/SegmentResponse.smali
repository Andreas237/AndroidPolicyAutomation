.class public final Lio/streamroot/dna/core/binary/SegmentResponse;
.super Ljava/lang/Object;
.source "SegmentHandler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/SegmentResponse;",
        "",
        "binaryData",
        "Lio/streamroot/dna/core/binary/store/BinaryData;",
        "timeout",
        "",
        "(Lio/streamroot/dna/core/binary/store/BinaryData;Z)V",
        "getBinaryData",
        "()Lio/streamroot/dna/core/binary/store/BinaryData;",
        "getTimeout",
        "()Z",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final timeout:Z


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/binary/store/BinaryData;Z)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/binary/store/BinaryData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    iput-boolean p2, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->timeout:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/streamroot/dna/core/binary/store/BinaryData;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/binary/SegmentResponse;-><init>(Lio/streamroot/dna/core/binary/store/BinaryData;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/streamroot/dna/core/binary/SegmentResponse;Lio/streamroot/dna/core/binary/store/BinaryData;ZILjava/lang/Object;)Lio/streamroot/dna/core/binary/SegmentResponse;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->timeout:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/binary/SegmentResponse;->copy(Lio/streamroot/dna/core/binary/store/BinaryData;Z)Lio/streamroot/dna/core/binary/SegmentResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/streamroot/dna/core/binary/store/BinaryData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->timeout:Z

    return v0
.end method

.method public final copy(Lio/streamroot/dna/core/binary/store/BinaryData;Z)Lio/streamroot/dna/core/binary/SegmentResponse;
    .locals 1
    .param p1    # Lio/streamroot/dna/core/binary/store/BinaryData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lio/streamroot/dna/core/binary/SegmentResponse;

    invoke-direct {v0, p1, p2}, Lio/streamroot/dna/core/binary/SegmentResponse;-><init>(Lio/streamroot/dna/core/binary/store/BinaryData;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_2

    instance-of v1, p1, Lio/streamroot/dna/core/binary/SegmentResponse;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lio/streamroot/dna/core/binary/SegmentResponse;

    iget-object v1, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    iget-object v3, p1, Lio/streamroot/dna/core/binary/SegmentResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->timeout:Z

    iget-boolean p1, p1, Lio/streamroot/dna/core/binary/SegmentResponse;->timeout:Z

    if-ne v1, p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method public final getBinaryData()Lio/streamroot/dna/core/binary/store/BinaryData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 13
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    return-object v0
.end method

.method public final getTimeout()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->timeout:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->timeout:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SegmentResponse(binaryData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/streamroot/dna/core/binary/SegmentResponse;->timeout:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
