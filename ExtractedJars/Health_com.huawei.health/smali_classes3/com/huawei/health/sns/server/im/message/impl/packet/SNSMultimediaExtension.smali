.class public abstract Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/ExtensionElement;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;
    }
.end annotation


# instance fields
.field private bob_xmlns:Ljava/lang/String;

.field private elementName:Ljava/lang/String;

.field private infoType:Ljava/lang/String;

.field private namespace:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const-string v0, "urn:xmpp:bob"

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->bob_xmlns:Ljava/lang/String;

    .line 105
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->elementName:Ljava/lang/String;

    .line 106
    iput-object p2, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->namespace:Ljava/lang/String;

    .line 107
    return-void
.end method


# virtual methods
.method public getBob_xmlns()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->bob_xmlns:Ljava/lang/String;

    .line 65
    return-object v0
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->elementName:Ljava/lang/String;

    .line 87
    return-object v0
.end method

.method public getInfoType()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->infoType:Ljava/lang/String;

    .line 54
    return-object v0
.end method

.method protected abstract getMultiExtBody()Ljava/lang/String;
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->namespace:Ljava/lang/String;

    .line 94
    return-object v0
.end method

.method public setBob_xmlns(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->bob_xmlns:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setElementName(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->elementName:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setInfoType(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->infoType:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setNamespace(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->namespace:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->toXML()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 3

    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    const-string v0, "<"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->elementName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->namespace:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 123
    const-string v0, " xmlns=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->namespace:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    :cond_0
    const-string v0, ">"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->getMultiExtBody()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    const-string v0, "</"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->elementName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
