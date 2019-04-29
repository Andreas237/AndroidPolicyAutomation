.class public final Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SignalingMessages.java"

# interfaces
.implements Lio/streamroot/dna/schemas/SignalingMessages$SdpOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lio/streamroot/dna/schemas/SignalingMessages$Sdp;",
        "Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;",
        ">;",
        "Lio/streamroot/dna/schemas/SignalingMessages$SdpOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 930
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$900()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method synthetic constructor <init>(Lio/streamroot/dna/schemas/SignalingMessages$1;)V
    .locals 0

    .line 923
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public addAllIceCandidates(Ljava/lang/Iterable;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
            ">;)",
            "Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;"
        }
    .end annotation

    .line 1113
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1114
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$2400(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public addIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1104
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1105
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$2300(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V

    return-object p0
.end method

.method public addIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1086
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1087
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$2100(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V

    return-object p0
.end method

.method public addIceCandidates(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1095
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1096
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$2200(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V

    return-object p0
.end method

.method public addIceCandidates(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1077
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1078
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$2000(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V

    return-object p0
.end method

.method public clearDtlsFingerprint()Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1032
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1033
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1700(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V

    return-object p0
.end method

.method public clearIceCandidates()Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1121
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1122
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$2500(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V

    return-object p0
.end method

.method public clearIcePwd()Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1000
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1001
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1400(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V

    return-object p0
.end method

.method public clearIceUfrag()Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 960
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 961
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1100(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V

    return-object p0
.end method

.method public getDtlsFingerprint()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1018
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getDtlsFingerprint()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getIceCandidates(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1

    .line 1053
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceCandidates(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    move-result-object p1

    return-object p1
.end method

.method public getIceCandidatesCount()I
    .locals 1

    .line 1048
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceCandidatesCount()I

    move-result v0

    return v0
.end method

.method public getIceCandidatesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
            ">;"
        }
    .end annotation

    .line 1041
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    .line 1042
    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceCandidatesList()Ljava/util/List;

    move-result-object v0

    .line 1041
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getIcePwd()Ljava/lang/String;
    .locals 1

    .line 978
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIcePwd()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIcePwdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 985
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIcePwdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getIceUfrag()Ljava/lang/String;
    .locals 1

    .line 938
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceUfrag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIceUfragBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 945
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceUfragBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public removeIceCandidates(I)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1129
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1130
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$2600(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;I)V

    return-object p0
.end method

.method public setDtlsFingerprint(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1024
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1025
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1600(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public setIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1069
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1070
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1900(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V

    return-object p0
.end method

.method public setIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1060
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1061
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1, p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1800(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V

    return-object p0
.end method

.method public setIcePwd(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 992
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 993
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1300(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Ljava/lang/String;)V

    return-object p0
.end method

.method public setIcePwdBytes(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 1009
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 1010
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1500(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public setIceUfrag(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 952
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 953
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1000(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Ljava/lang/String;)V

    return-object p0
.end method

.method public setIceUfragBytes(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 969
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->copyOnWrite()V

    .line 970
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->access$1200(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method
