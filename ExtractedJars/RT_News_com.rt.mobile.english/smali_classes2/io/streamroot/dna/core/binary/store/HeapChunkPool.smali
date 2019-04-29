.class public final Lio/streamroot/dna/core/binary/store/HeapChunkPool;
.super Lio/streamroot/dna/core/binary/store/ChunkPool;
.source "ChunkPool.kt"


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u000c\u0010\u0006\u001a\u00060\u0007j\u0002`\u0008H\u0014\u00a8\u0006\t"
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/store/HeapChunkPool;",
        "Lio/streamroot/dna/core/binary/store/ChunkPool;",
        "capacity",
        "",
        "chunkSize",
        "(II)V",
        "produceInstance",
        "Ljava/nio/ByteBuffer;",
        "Lio/streamroot/dna/core/utils/Chunk;",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 107
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/binary/store/ChunkPool;-><init>(II)V

    return-void
.end method


# virtual methods
.method protected produceInstance()Ljava/nio/ByteBuffer;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 108
    invoke-virtual {p0}, Lio/streamroot/dna/core/binary/store/HeapChunkPool;->getChunkSize()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "Chunk.allocate(chunkSize)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
