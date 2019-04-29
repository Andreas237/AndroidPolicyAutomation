.class public interface abstract Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessageOrBuilder;
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
    name = "ConnectionMessageOrBuilder"
.end annotation


# virtual methods
.method public abstract getAccepted()Z
.end method

.method public abstract getConnectionId()Ljava/lang/String;
.end method

.method public abstract getConnectionIdBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getSdp()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
.end method

.method public abstract getSenderId()Ljava/lang/String;
.end method

.method public abstract getSenderIdBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getType()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
.end method

.method public abstract getTypeValue()I
.end method

.method public abstract hasSdp()Z
.end method
