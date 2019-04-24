.class public final Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# static fields
.field private static final NAME:Ljava/lang/String; = "reject"


# instance fields
.field private userId:J


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 28
    const-string v0, "reject"

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;)V

    .line 29
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->set:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-super {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 30
    return-void
.end method

.method public static newInstance(Ljava/lang/String;J)Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;
    .locals 2

    .line 41
    new-instance v1, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;-><init>()V

    .line 42
    invoke-virtual {v1, p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;->setFrom(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v1, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;->setUserId(J)V

    .line 44
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;->setStanzaId(Ljava/lang/String;)V

    .line 48
    :cond_0
    return-object v1
.end method


# virtual methods
.method public getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 3

    .line 69
    const-string v0, "xmlns"

    const-string v1, "socialim:iq:reject"

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 70
    const-string v0, "uid"

    iget-wide v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;->userId:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 71
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->setEmptyElement()V

    .line 72
    return-object p1
.end method

.method public setUserId(J)V
    .locals 0

    .line 63
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;->userId:J

    .line 64
    return-void
.end method
