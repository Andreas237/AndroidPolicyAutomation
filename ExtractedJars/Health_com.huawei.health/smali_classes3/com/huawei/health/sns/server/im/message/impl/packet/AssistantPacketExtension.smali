.class public Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/ExtensionElement;


# instance fields
.field private content:Ljava/lang/String;

.field private elementName:Ljava/lang/String;

.field private namespace:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;->elementName:Ljava/lang/String;

    .line 57
    iput-object p2, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;->namespace:Ljava/lang/String;

    .line 58
    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;->content:Ljava/lang/String;

    .line 35
    return-object v0
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;->elementName:Ljava/lang/String;

    .line 68
    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;->namespace:Ljava/lang/String;

    .line 79
    return-object v0
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;->content:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;->toXML()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 1

    .line 84
    const/4 v0, 0x0

    return-object v0
.end method
