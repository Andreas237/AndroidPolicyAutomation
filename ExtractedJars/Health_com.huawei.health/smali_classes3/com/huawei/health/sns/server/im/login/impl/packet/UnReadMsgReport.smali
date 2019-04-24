.class public final Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# static fields
.field private static final NAME:Ljava/lang/String; = "message"


# instance fields
.field private ids:Ljava/lang/String;

.field private seq:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 31
    const-string v0, "message"

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;)V

    .line 32
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->set:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-super {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 33
    return-void
.end method

.method public static newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;
    .locals 2

    .line 83
    new-instance v1, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;-><init>()V

    .line 84
    invoke-direct {v1, p2}, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->setSeq(Ljava/lang/String;)V

    .line 85
    invoke-direct {v1, p1}, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->setIds(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v1, p0}, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->setFrom(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->setStanzaId(Ljava/lang/String;)V

    .line 91
    :cond_0
    return-object v1
.end method

.method private setIds(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->ids:Ljava/lang/String;

    .line 43
    return-void
.end method

.method private setSeq(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->seq:Ljava/lang/String;

    .line 53
    return-void
.end method


# virtual methods
.method public getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 2

    .line 97
    const-string v0, "xmlns"

    const-string v1, "socialim:iq:syncmsg"

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 98
    const-string v0, "seq"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->seq:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 99
    const-string v0, "ids"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->ids:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 100
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->setEmptyElement()V

    .line 101
    return-object p1
.end method

.method public getPrintfIds()Ljava/lang/String;
    .locals 3

    .line 62
    iget-object v2, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->ids:Ljava/lang/String;

    .line 63
    if-eqz v2, :cond_0

    .line 65
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x80

    if-le v0, v1, :cond_0

    .line 67
    const/4 v0, 0x0

    const/16 v1, 0x7f

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 70
    :cond_0
    return-object v2
.end method
