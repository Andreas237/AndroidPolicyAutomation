.class public final Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# static fields
.field public static final ASC:I = 0x1

.field public static final DESC:I = 0x0

.field private static final NAME:Ljava/lang/String; = "query"


# instance fields
.field private channel:Ljava/lang/String;

.field private seq:J

.field private seqEnd:J

.field private sort:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 54
    const-string v0, "query"

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;)V

    .line 40
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->sort:I

    .line 55
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-super {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 56
    return-void
.end method

.method public static newInstance(IJJLjava/lang/String;)Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;
    .locals 2

    .line 68
    new-instance v1, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;-><init>()V

    .line 69
    invoke-direct/range {v1 .. v7}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->setData(IJJLjava/lang/String;)V

    .line 70
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->setStanzaId(Ljava/lang/String;)V

    .line 74
    :cond_0
    return-object v1
.end method

.method private setData(IJJLjava/lang/String;)V
    .locals 0

    .line 96
    iput p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->sort:I

    .line 97
    iput-wide p2, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->seq:J

    .line 98
    iput-wide p4, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->seqEnd:J

    .line 99
    iput-object p6, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->channel:Ljava/lang/String;

    .line 100
    return-void
.end method


# virtual methods
.method public getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 4

    .line 105
    const-string v0, "xmlns"

    const-string v1, "socialim:iq:syncmsg"

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 106
    const-string v0, "seq"

    iget-wide v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->seq:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 107
    const-string v0, "seqend"

    iget-wide v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->seqEnd:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 108
    iget v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->sort:I

    if-nez v0, :cond_0

    const-string v3, "0"

    goto :goto_0

    :cond_0
    const-string v3, "1"

    .line 109
    :goto_0
    const-string v0, "sort"

    invoke-virtual {p1, v0, v3}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->channel:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 112
    const-string v0, "channel"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->channel:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 114
    :cond_1
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->setEmptyElement()V

    .line 115
    return-object p1
.end method

.method public getSeq()J
    .locals 2

    .line 79
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->seq:J

    return-wide v0
.end method

.method public getSeqEnd()J
    .locals 2

    .line 84
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->seqEnd:J

    return-wide v0
.end method
