.class public Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/ExtensionElement;


# instance fields
.field private elementName:Ljava/lang/String;

.field private namespace:Ljava/lang/String;

.field private vcardOwnerJid:Ljava/lang/String;

.field private vcardOwnerName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->elementName:Ljava/lang/String;

    .line 78
    iput-object p2, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->namespace:Ljava/lang/String;

    .line 79
    return-void
.end method


# virtual methods
.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->elementName:Ljava/lang/String;

    .line 54
    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->namespace:Ljava/lang/String;

    .line 60
    return-object v0
.end method

.method public getVcardOwnerJid()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->vcardOwnerJid:Ljava/lang/String;

    .line 48
    return-object v0
.end method

.method public getVcardOwnerName()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->vcardOwnerName:Ljava/lang/String;

    .line 67
    return-object v0
.end method

.method public setVcardOwnerJid(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->vcardOwnerJid:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setVcardOwnerName(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->vcardOwnerName:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->toXML()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 3

    .line 83
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 84
    const-string v0, "<"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->elementName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " xmlns=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->namespace:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 86
    const-string v0, "jabberid"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->vcardOwnerJid:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v0, "nickname"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->vcardOwnerName:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "</"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->elementName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
