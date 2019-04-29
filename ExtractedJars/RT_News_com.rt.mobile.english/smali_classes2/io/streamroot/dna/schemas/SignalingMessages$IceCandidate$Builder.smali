.class public final Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SignalingMessages.java"

# interfaces
.implements Lio/streamroot/dna/schemas/SignalingMessages$IceCandidateOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
        "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;",
        ">;",
        "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidateOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 316
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->access$000()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method synthetic constructor <init>(Lio/streamroot/dna/schemas/SignalingMessages$1;)V
    .locals 0

    .line 309
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public clearCode()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1

    .line 352
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->copyOnWrite()V

    .line 353
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->access$300(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V

    return-object p0
.end method

.method public clearGlobalAddress()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1

    .line 375
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->copyOnWrite()V

    .line 376
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->access$500(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V

    return-object p0
.end method

.method public clearLocalAddress()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1

    .line 398
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->copyOnWrite()V

    .line 399
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->access$700(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V

    return-object p0
.end method

.method public getCode()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;
    .locals 1

    .line 338
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getCode()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    move-result-object v0

    return-object v0
.end method

.method public getCodeValue()I
    .locals 1

    .line 324
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getCodeValue()I

    move-result v0

    return v0
.end method

.method public getGlobalAddress()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 361
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getGlobalAddress()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getLocalAddress()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 384
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getLocalAddress()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public setCode(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1

    .line 344
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->copyOnWrite()V

    .line 345
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->access$200(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;)V

    return-object p0
.end method

.method public setCodeValue(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1

    .line 330
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->copyOnWrite()V

    .line 331
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->access$100(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;I)V

    return-object p0
.end method

.method public setGlobalAddress(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1

    .line 367
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->copyOnWrite()V

    .line 368
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->access$400(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public setLocalAddress(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1

    .line 390
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->copyOnWrite()V

    .line 391
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->access$600(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method
