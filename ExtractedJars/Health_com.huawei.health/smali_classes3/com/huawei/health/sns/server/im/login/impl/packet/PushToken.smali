.class public final Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# static fields
.field private static final NAME:Ljava/lang/String; = "push"


# instance fields
.field private pushToken:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 36
    const-string v0, "push"

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;)V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->pushToken:Ljava/lang/String;

    .line 37
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->set:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 38
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->pushToken:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public static newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;
    .locals 2

    .line 50
    new-instance v1, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;

    invoke-direct {v1, p1}, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;-><init>(Ljava/lang/String;)V

    .line 51
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->setStanzaId(Ljava/lang/String;)V

    .line 55
    :cond_0
    invoke-virtual {v1, p0}, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->setFrom(Ljava/lang/String;)V

    .line 56
    return-object v1
.end method


# virtual methods
.method public getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 2

    .line 62
    const-string v0, "xmlns"

    const-string v1, "socialim:iq:push"

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 63
    const-string v0, "token"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->pushToken:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 64
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->setEmptyElement()V

    .line 65
    return-object p1
.end method

.method public getPushToken()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->pushToken:Ljava/lang/String;

    return-object v0
.end method
