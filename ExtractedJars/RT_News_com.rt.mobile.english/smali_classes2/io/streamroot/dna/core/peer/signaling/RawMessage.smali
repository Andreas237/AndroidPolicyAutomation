.class public final Lio/streamroot/dna/core/peer/signaling/RawMessage;
.super Ljava/lang/Object;
.source "MessageSerializer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J=\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\t2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/signaling/RawMessage;",
        "",
        "type",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;",
        "senderId",
        "",
        "connectionId",
        "sdp",
        "accepted",
        "",
        "(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "getAccepted",
        "()Z",
        "getConnectionId",
        "()Ljava/lang/String;",
        "getSdp",
        "getSenderId",
        "getType",
        "()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final accepted:Z

.field private final connectionId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sdp:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final senderId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final type:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "senderId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->type:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    iput-object p2, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->senderId:Ljava/lang/String;

    iput-object p3, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->connectionId:Ljava/lang/String;

    iput-object p4, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->sdp:Ljava/lang/String;

    iput-boolean p5, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->accepted:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/streamroot/dna/core/peer/signaling/RawMessage;Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lio/streamroot/dna/core/peer/signaling/RawMessage;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->type:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->senderId:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->connectionId:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->sdp:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->accepted:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lio/streamroot/dna/core/peer/signaling/RawMessage;->copy(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/streamroot/dna/core/peer/signaling/RawMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->type:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->senderId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->connectionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->sdp:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->accepted:Z

    return v0
.end method

.method public final copy(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/streamroot/dna/core/peer/signaling/RawMessage;
    .locals 7
    .param p1    # Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "senderId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/streamroot/dna/core/peer/signaling/RawMessage;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lio/streamroot/dna/core/peer/signaling/RawMessage;-><init>(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

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

    instance-of v1, p1, Lio/streamroot/dna/core/peer/signaling/RawMessage;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lio/streamroot/dna/core/peer/signaling/RawMessage;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->type:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    iget-object v3, p1, Lio/streamroot/dna/core/peer/signaling/RawMessage;->type:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->senderId:Ljava/lang/String;

    iget-object v3, p1, Lio/streamroot/dna/core/peer/signaling/RawMessage;->senderId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->connectionId:Ljava/lang/String;

    iget-object v3, p1, Lio/streamroot/dna/core/peer/signaling/RawMessage;->connectionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->sdp:Ljava/lang/String;

    iget-object v3, p1, Lio/streamroot/dna/core/peer/signaling/RawMessage;->sdp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->accepted:Z

    iget-boolean p1, p1, Lio/streamroot/dna/core/peer/signaling/RawMessage;->accepted:Z

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

.method public final getAccepted()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->accepted:Z

    return v0
.end method

.method public final getConnectionId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->connectionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdp()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 15
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->sdp:Ljava/lang/String;

    return-object v0
.end method

.method public final getSenderId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->senderId:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->type:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->type:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->senderId:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->connectionId:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->sdp:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->accepted:Z

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    :cond_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RawMessage(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->type:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", senderId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->senderId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", connectionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->connectionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sdp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->sdp:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", accepted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/streamroot/dna/core/peer/signaling/RawMessage;->accepted:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
