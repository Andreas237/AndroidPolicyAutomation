.class public final Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# static fields
.field private static final NAME:Ljava/lang/String; = "query"


# instance fields
.field private mcode:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    const-string v0, "query"

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;)V

    .line 42
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-super {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 43
    return-void
.end method

.method public static newInstance(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;
    .locals 2

    .line 53
    new-instance v1, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;-><init>()V

    .line 54
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;->setStanzaId(Ljava/lang/String;)V

    .line 58
    :cond_0
    invoke-virtual {v1, p0}, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;->setFrom(Ljava/lang/String;)V

    .line 59
    return-object v1
.end method


# virtual methods
.method public getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 2

    .line 65
    const-string v0, "xmlns"

    const-string v1, "socialim:iq:mcode"

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 66
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->setEmptyElement()V

    .line 67
    return-object p1
.end method

.method public getMcode()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;->mcode:Ljava/lang/String;

    return-object v0
.end method

.method public setMcode(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;->mcode:Ljava/lang/String;

    .line 36
    return-void
.end method
