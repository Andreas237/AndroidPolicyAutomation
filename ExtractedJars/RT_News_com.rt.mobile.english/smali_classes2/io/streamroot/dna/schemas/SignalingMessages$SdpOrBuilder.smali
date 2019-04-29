.class public interface abstract Lio/streamroot/dna/schemas/SignalingMessages$SdpOrBuilder;
.super Ljava/lang/Object;
.source "SignalingMessages.java"

# interfaces
.implements Lcom/google/protobuf/MessageLiteOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "SdpOrBuilder"
.end annotation


# virtual methods
.method public abstract getDtlsFingerprint()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getIceCandidates(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
.end method

.method public abstract getIceCandidatesCount()I
.end method

.method public abstract getIceCandidatesList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getIcePwd()Ljava/lang/String;
.end method

.method public abstract getIcePwdBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getIceUfrag()Ljava/lang/String;
.end method

.method public abstract getIceUfragBytes()Lcom/google/protobuf/ByteString;
.end method
