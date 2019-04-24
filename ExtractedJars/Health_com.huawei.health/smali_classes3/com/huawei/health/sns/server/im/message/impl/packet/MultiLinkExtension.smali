.class public Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;
.super Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;
.source "SourceFile"


# instance fields
.field private blobItemList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;>;"
        }
    .end annotation
.end field

.field private linkAppID:Ljava/lang/String;

.field private linkAppName:Ljava/lang/String;

.field private linkAppPackage:Ljava/lang/String;

.field private linkBrief:Ljava/lang/String;

.field private linkReqVerCode:Ljava/lang/String;

.field private linkTitle:Ljava/lang/String;

.field private linkUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, "link"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setInfoType(Ljava/lang/String;)V

    .line 63
    return-void
.end method


# virtual methods
.method public getBlobItemList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;>;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->blobItemList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getLinkAppID()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppID:Ljava/lang/String;

    .line 112
    return-object v0
.end method

.method public getLinkAppName()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppName:Ljava/lang/String;

    .line 101
    return-object v0
.end method

.method public getLinkAppPackage()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppPackage:Ljava/lang/String;

    .line 123
    return-object v0
.end method

.method public getLinkBrief()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkBrief:Ljava/lang/String;

    .line 79
    return-object v0
.end method

.method public getLinkReqVerCode()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkReqVerCode:Ljava/lang/String;

    .line 134
    return-object v0
.end method

.method public getLinkTitle()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkTitle:Ljava/lang/String;

    .line 68
    return-object v0
.end method

.method public getLinkUrl()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkUrl:Ljava/lang/String;

    .line 90
    return-object v0
.end method

.method protected getMultiExtBody()Ljava/lang/String;
    .locals 5

    .line 155
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 156
    const-string v0, "<info type=\"link\">"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 158
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkTitle:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v0, "brief"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkBrief:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkUrl:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const-string v0, "appname"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppName:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppID:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppPackage:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkReqVerCode:Ljava/lang/String;

    .line 164
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 166
    const-string v0, "<check appid=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " package=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppPackage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " require_version=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkReqVerCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\"/>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 170
    :cond_0
    const-string v0, "</info>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->blobItemList:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 174
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->blobItemList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 176
    const-string v0, "<item>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 177
    if-eqz v4, :cond_2

    .line 179
    const-string v0, "<blob type=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 180
    const-string v0, " width=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobWitdh()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 181
    const-string v0, " length=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobLength()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 182
    const-string v0, " position=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 184
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 186
    const-string v0, "<![CDATA["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 187
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 188
    const-string v0, "]]>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 191
    :cond_1
    const-string v0, "</blob>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 193
    :cond_2
    const-string v0, "</item>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 194
    goto/16 :goto_0

    .line 196
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setBlobItemList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;>;)V"
        }
    .end annotation

    .line 149
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->blobItemList:Ljava/util/ArrayList;

    .line 150
    return-void
.end method

.method public setLinkAppID(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppID:Ljava/lang/String;

    .line 118
    return-void
.end method

.method public setLinkAppName(Ljava/lang/String;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppName:Ljava/lang/String;

    .line 107
    return-void
.end method

.method public setLinkAppPackage(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkAppPackage:Ljava/lang/String;

    .line 129
    return-void
.end method

.method public setLinkBrief(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkBrief:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public setLinkReqVerCode(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkReqVerCode:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public setLinkTitle(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkTitle:Ljava/lang/String;

    .line 74
    return-void
.end method

.method public setLinkUrl(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->linkUrl:Ljava/lang/String;

    .line 96
    return-void
.end method
