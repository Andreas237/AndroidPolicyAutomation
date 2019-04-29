.class public final Lio/streamroot/dna/core/utils/ChunkKt;
.super Ljava/lang/Object;
.source "Chunk.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChunk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chunk.kt\nio/streamroot/dna/core/utils/ChunkKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,32:1\n1096#2,2:33\n10667#2,2:35\n10732#2,3:37\n*E\n*S KotlinDebug\n*F\n+ 1 Chunk.kt\nio/streamroot/dna/core/utils/ChunkKt\n*L\n9#1,2:33\n13#1,2:35\n24#1,3:37\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0000\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u000c\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002j\u0002`\u0005H\u0000\u00a2\u0006\u0002\u0010\u0006\u001a\\\u0010\u0007\u001a\u00020\u0008*\u0014\u0012\u000c\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002j\u0002`\u000526\u0010\t\u001a2\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u000e\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u00080\nH\u0080\u0008\u00a2\u0006\u0002\u0010\u0010\u001a^\u0010\u0011\u001a\u00020\u0008*\u0014\u0012\u000c\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002j\u0002`\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u000c\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002j\u0002`\u00052\u0006\u0010\u0013\u001a\u00020\u00012\u0016\u0010\t\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00080\u0014H\u0080\u0008\u00a2\u0006\u0002\u0010\u0015*\n\u0010\u0016\"\u00020\u00032\u00020\u0003* \u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u0001`\u00040\u00022\u0010\u0012\u000c\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002\u00a8\u0006\u0018"
    }
    d2 = {
        "chunkCapacity",
        "",
        "",
        "Ljava/nio/ByteBuffer;",
        "Lio/streamroot/dna/core/utils/Chunk;",
        "Lio/streamroot/dna/core/utils/ChunkArray;",
        "([Ljava/nio/ByteBuffer;)I",
        "copy",
        "",
        "block",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "buffer",
        "size",
        "([Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function2;)V",
        "moveInto",
        "chunkArray",
        "offset",
        "Lkotlin/Function1;",
        "([Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;ILkotlin/jvm/functions/Function1;)V",
        "Chunk",
        "ChunkArray",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final chunkCapacity([Ljava/nio/ByteBuffer;)I
    .locals 5
    .param p0    # [Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 33
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    if-eqz v3, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    move v4, v0

    :goto_1
    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_3

    .line 9
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    :cond_3
    return v0
.end method

.method public static final copy([Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function2;)V
    .locals 6
    .param p0    # [Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/nio/ByteBuffer;",
            "Lkotlin/jvm/functions/Function2<",
            "-[B-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {p0}, Lio/streamroot/dna/core/utils/ChunkKt;->chunkCapacity([Ljava/nio/ByteBuffer;)I

    move-result v0

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 35
    array-length v2, p0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, p0, v3

    if-eqz v4, :cond_0

    .line 14
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 15
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 16
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->limit()I

    move-result v5

    invoke-virtual {v4, v0, v1, v5}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 17
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->limit()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v0, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final moveInto([Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;ILkotlin/jvm/functions/Function1;)V
    .locals 6
    .param p0    # [Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # [Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/nio/ByteBuffer;",
            "[",
            "Ljava/nio/ByteBuffer;",
            "I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/nio/ByteBuffer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chunkArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-static {p0}, Lio/streamroot/dna/core/utils/ChunkKt;->chunkCapacity([Ljava/nio/ByteBuffer;)I

    move-result v0

    div-int/2addr p2, v0

    const/4 v0, 0x0

    .line 38
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v0, v1, :cond_2

    aget-object v3, p0, v0

    add-int/lit8 v4, v2, 0x1

    add-int/2addr v2, p2

    if-eqz v3, :cond_1

    .line 27
    aget-object v5, p1, v2

    if-eqz v5, :cond_0

    invoke-interface {p3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    :cond_0
    aput-object v3, p1, v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    move v2, v4

    goto :goto_0

    :cond_2
    return-void
.end method
