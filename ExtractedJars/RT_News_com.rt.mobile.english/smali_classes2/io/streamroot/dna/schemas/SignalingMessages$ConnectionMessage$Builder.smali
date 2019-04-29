.class public final Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SignalingMessages.java"

# interfaces
.implements Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;",
        ">;",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessageOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1718
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$2800()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method synthetic constructor <init>(Lio/streamroot/dna/schemas/SignalingMessages$1;)V
    .locals 0

    .line 1711
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public clearAccepted()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1902
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1903
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$4300(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V

    return-object p0
.end method

.method public clearConnectionId()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1825
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1826
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3600(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V

    return-object p0
.end method

.method public clearSdp()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1879
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1880
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$4100(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V

    return-object p0
.end method

.method public clearSenderId()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1785
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1786
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3300(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V

    return-object p0
.end method

.method public clearType()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1754
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1755
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3100(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V

    return-object p0
.end method

.method public getAccepted()Z
    .locals 1

    .line 1888
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getAccepted()Z

    move-result v0

    return v0
.end method

.method public getConnectionId()Ljava/lang/String;
    .locals 1

    .line 1803
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getConnectionId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getConnectionIdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1810
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getConnectionIdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getSdp()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1

    .line 1849
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSdp()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v0

    return-object v0
.end method

.method public getSenderId()Ljava/lang/String;
    .locals 1

    .line 1763
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSenderId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSenderIdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1770
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSenderIdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getType()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .locals 1

    .line 1740
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getType()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    move-result-object v0

    return-object v0
.end method

.method public getTypeValue()I
    .locals 1

    .line 1726
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getTypeValue()I

    move-result v0

    return v0
.end method

.method public hasSdp()Z
    .locals 1

    .line 1843
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->hasSdp()Z

    move-result v0

    return v0
.end method

.method public mergeSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1872
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1873
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$4000(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V

    return-object p0
.end method

.method public setAccepted(Z)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1894
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1895
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$4200(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Z)V

    return-object p0
.end method

.method public setConnectionId(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1817
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1818
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3500(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Ljava/lang/String;)V

    return-object p0
.end method

.method public setConnectionIdBytes(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1834
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1835
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3700(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public setSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1864
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1865
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3900(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;)V

    return-object p0
.end method

.method public setSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1855
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1856
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3800(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V

    return-object p0
.end method

.method public setSenderId(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1777
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1778
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3200(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Ljava/lang/String;)V

    return-object p0
.end method

.method public setSenderIdBytes(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1794
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1795
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3400(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public setType(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1746
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1747
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$3000(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;)V

    return-object p0
.end method

.method public setTypeValue(I)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1732
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->copyOnWrite()V

    .line 1733
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->access$2900(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;I)V

    return-object p0
.end method
