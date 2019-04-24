.class public Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# static fields
.field private static final NAME:Ljava/lang/String; = "query"


# instance fields
.field public endSeq:J

.field public startSeq:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 75
    const-string v0, "query"

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;)V

    .line 25
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    .line 30
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->endSeq:J

    .line 76
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-super {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 77
    return-void
.end method


# virtual methods
.method public getEndSeq()J
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->endSeq:J

    return-wide v0
.end method

.method public getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 1

    .line 82
    const/4 v0, 0x0

    return-object v0
.end method

.method public getStartSeq()J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    return-wide v0
.end method

.method public setEndSeq(J)V
    .locals 0

    .line 70
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->endSeq:J

    .line 71
    return-void
.end method

.method public setStartSeq(J)V
    .locals 0

    .line 50
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    .line 51
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->endSeq:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
