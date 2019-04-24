.class public Lcom/shopkick/app/presence/MainPipelineResult;
.super Ljava/lang/Object;
.source "MainPipelineResult.java"


# instance fields
.field public code:Ljava/lang/String;

.field public correctedBits:I

.field public crc:I

.field public crcMatched:Z

.field public newCodeFound:Z

.field public newSignalDetected:Z

.field public prefixMatch:Z

.field public presenceData:[B

.field public presenceFactors:[D

.field public sendServerData:Z

.field public signalLost:Z

.field public stepSuccessful:Z

.field public stepsSincePresenceFound:I


# direct methods
.method public constructor <init>(ZZZZZZZILjava/lang/String;II[D[B)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-boolean p1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->stepSuccessful:Z

    .line 39
    iput-boolean p2, p0, Lcom/shopkick/app/presence/MainPipelineResult;->newSignalDetected:Z

    .line 40
    iput-boolean p3, p0, Lcom/shopkick/app/presence/MainPipelineResult;->signalLost:Z

    .line 41
    iput-boolean p4, p0, Lcom/shopkick/app/presence/MainPipelineResult;->newCodeFound:Z

    .line 42
    iput-boolean p5, p0, Lcom/shopkick/app/presence/MainPipelineResult;->sendServerData:Z

    .line 43
    iput-boolean p6, p0, Lcom/shopkick/app/presence/MainPipelineResult;->prefixMatch:Z

    .line 44
    iput-boolean p7, p0, Lcom/shopkick/app/presence/MainPipelineResult;->crcMatched:Z

    .line 45
    iput p8, p0, Lcom/shopkick/app/presence/MainPipelineResult;->stepsSincePresenceFound:I

    .line 46
    iput-object p9, p0, Lcom/shopkick/app/presence/MainPipelineResult;->code:Ljava/lang/String;

    .line 47
    iput p10, p0, Lcom/shopkick/app/presence/MainPipelineResult;->crc:I

    .line 48
    iput p11, p0, Lcom/shopkick/app/presence/MainPipelineResult;->correctedBits:I

    .line 49
    iput-object p12, p0, Lcom/shopkick/app/presence/MainPipelineResult;->presenceFactors:[D

    .line 50
    iput-object p13, p0, Lcom/shopkick/app/presence/MainPipelineResult;->presenceData:[B

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MainPipelineResult [stepSuccessful="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->stepSuccessful:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", newSignalDetected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->newSignalDetected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", signalLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->signalLost:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", newCodeFound="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->newCodeFound:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sendServerData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->sendServerData:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", prefixMatch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->prefixMatch:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", crcMatched="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->crcMatched:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", stepsSincePresenceFound="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->stepsSincePresenceFound:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->code:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", crc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->crc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", correctedBits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->correctedBits:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", presenceFactors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->presenceFactors:[D

    .line 60
    invoke-static {v1}, Ljava/util/Arrays;->toString([D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", presenceData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/presence/MainPipelineResult;->presenceData:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
