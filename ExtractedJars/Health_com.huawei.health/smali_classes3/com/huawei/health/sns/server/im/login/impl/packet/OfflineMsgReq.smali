.class public final Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# static fields
.field private static final NAME:Ljava/lang/String; = "query"


# instance fields
.field private localSeq:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 29
    const-string v0, "query"

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;)V

    .line 30
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-super {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 31
    return-void
.end method

.method public static newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;
    .locals 2

    .line 47
    new-instance v1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;-><init>()V

    .line 48
    invoke-direct {v1, p1}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;->setLocalSeq(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v1, p0}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;->setFrom(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;->setStanzaId(Ljava/lang/String;)V

    .line 54
    :cond_0
    return-object v1
.end method

.method private setLocalSeq(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;->localSeq:Ljava/lang/String;

    .line 36
    return-void
.end method


# virtual methods
.method public getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 2

    .line 60
    const-string v0, "xmlns"

    const-string v1, "socialim:iq:offline"

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 61
    const-string v0, "localseq"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;->localSeq:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 62
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->setEmptyElement()V

    .line 63
    return-object p1
.end method
