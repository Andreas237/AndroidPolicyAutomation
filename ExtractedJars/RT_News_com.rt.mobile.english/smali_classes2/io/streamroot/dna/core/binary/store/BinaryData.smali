.class public final Lio/streamroot/dna/core/binary/store/BinaryData;
.super Ljava/lang/Object;
.source "BinaryData.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/binary/store/BinaryData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u000c\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00070\u0005j\u0002`\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J \u0010\u0014\u001a\u0014\u0012\u000c\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00070\u0005j\u0002`\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\nH\u00c6\u0003J>\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u001a\u0008\u0002\u0010\u0004\u001a\u0014\u0012\u000c\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00070\u0005j\u0002`\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u001b\u001a\u00020\nH\u0016J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R%\u0010\u0004\u001a\u0014\u0012\u000c\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00070\u0005j\u0002`\u0008\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/store/BinaryData;",
        "",
        "id",
        "",
        "chunks",
        "",
        "Ljava/nio/ByteBuffer;",
        "Lio/streamroot/dna/core/utils/Chunk;",
        "Lio/streamroot/dna/core/utils/ChunkArray;",
        "size",
        "",
        "(Ljava/lang/String;[Ljava/nio/ByteBuffer;I)V",
        "getChunks",
        "()[Ljava/nio/ByteBuffer;",
        "[Ljava/nio/ByteBuffer;",
        "getId",
        "()Ljava/lang/String;",
        "getSize",
        "()I",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/String;[Ljava/nio/ByteBuffer;I)Lio/streamroot/dna/core/binary/store/BinaryData;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/streamroot/dna/core/binary/store/BinaryData$Companion;

.field private static final idCounter:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field private final chunks:[Ljava/nio/ByteBuffer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final size:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/streamroot/dna/core/binary/store/BinaryData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/binary/store/BinaryData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/binary/store/BinaryData;->Companion:Lio/streamroot/dna/core/binary/store/BinaryData$Companion;

    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lio/streamroot/dna/core/binary/store/BinaryData;->idCounter:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/nio/ByteBuffer;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chunks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->id:Ljava/lang/String;

    iput-object p2, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->chunks:[Ljava/nio/ByteBuffer;

    iput p3, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->size:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;[Ljava/nio/ByteBuffer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 7
    sget-object p1, Lio/streamroot/dna/core/binary/store/BinaryData;->idCounter:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide p4

    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/streamroot/dna/core/binary/store/BinaryData;-><init>(Ljava/lang/String;[Ljava/nio/ByteBuffer;I)V

    return-void
.end method

.method public static synthetic copy$default(Lio/streamroot/dna/core/binary/store/BinaryData;Ljava/lang/String;[Ljava/nio/ByteBuffer;IILjava/lang/Object;)Lio/streamroot/dna/core/binary/store/BinaryData;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->chunks:[Ljava/nio/ByteBuffer;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->size:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/streamroot/dna/core/binary/store/BinaryData;->copy(Ljava/lang/String;[Ljava/nio/ByteBuffer;I)Lio/streamroot/dna/core/binary/store/BinaryData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()[Ljava/nio/ByteBuffer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->chunks:[Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->size:I

    return v0
.end method

.method public final copy(Ljava/lang/String;[Ljava/nio/ByteBuffer;I)Lio/streamroot/dna/core/binary/store/BinaryData;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chunks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/streamroot/dna/core/binary/store/BinaryData;

    invoke-direct {v0, p1, p2, p3}, Lio/streamroot/dna/core/binary/store/BinaryData;-><init>(Ljava/lang/String;[Ljava/nio/ByteBuffer;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 13
    move-object v0, p0

    check-cast v0, Lio/streamroot/dna/core/binary/store/BinaryData;

    const/4 v1, 0x1

    if-ne v0, p1, :cond_0

    return v1

    .line 14
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
    if-nez p1, :cond_3

    .line 16
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type io.streamroot.dna.core.binary.store.BinaryData"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;

    .line 18
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/streamroot/dna/core/binary/store/BinaryData;->id:Ljava/lang/String;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_4

    return v2

    .line 19
    :cond_4
    iget v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->size:I

    iget p1, p1, Lio/streamroot/dna/core/binary/store/BinaryData;->size:I

    if-eq v0, p1, :cond_5

    return v2

    :cond_5
    return v1
.end method

.method public final getChunks()[Ljava/nio/ByteBuffer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->chunks:[Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 7
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    .line 9
    iget v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->size:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 25
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v1, v0

    .line 26
    iget v0, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->size:I

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BinaryData(id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", chunks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->chunks:[Ljava/nio/ByteBuffer;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/streamroot/dna/core/binary/store/BinaryData;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
