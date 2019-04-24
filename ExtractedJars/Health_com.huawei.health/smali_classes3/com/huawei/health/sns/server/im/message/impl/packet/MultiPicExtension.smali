.class public Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;
.super Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;
.source "SourceFile"


# instance fields
.field private fileType:Ljava/lang/String;

.field private fileUrl:Ljava/lang/String;

.field private jid:Ljava/lang/String;

.field private lengthWidth:Ljava/lang/String;

.field private maxAge:Ljava/lang/String;

.field private size:Ljava/lang/String;

.field private thumbFlag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 127
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string v0, "image"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setInfoType(Ljava/lang/String;)V

    .line 129
    return-void
.end method


# virtual methods
.method public getFileType()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->fileType:Ljava/lang/String;

    .line 95
    return-object v0
.end method

.method public getFileUrl()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->fileUrl:Ljava/lang/String;

    .line 84
    return-object v0
.end method

.method public getJid()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->jid:Ljava/lang/String;

    .line 73
    return-object v0
.end method

.method public getLengthWidth()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->lengthWidth:Ljava/lang/String;

    .line 62
    return-object v0
.end method

.method public getMaxAge()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->maxAge:Ljava/lang/String;

    .line 106
    return-object v0
.end method

.method public getMultiExtBody()Ljava/lang/String;
    .locals 4

    .line 133
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 134
    const-string v0, "<info type=\"image\">"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 136
    const-string v0, "size"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->size:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "length-width"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->lengthWidth:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v0, "</info>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 140
    const-string v0, "<item>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 142
    const-string v0, "<"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "bob"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 143
    const-string v0, " xmlns=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->getBob_xmlns()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 144
    const-string v0, " jid=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->jid:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->fileUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 147
    const-string v0, " url=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-static {v3}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXML(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 149
    const-string v0, " max-age=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->maxAge:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 150
    const-string v0, " type=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->fileType:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 151
    const-string v0, " thumbFlag=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->thumbFlag:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 152
    const-string v0, "/>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 154
    const-string v0, "</item>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 155
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSize()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->size:Ljava/lang/String;

    .line 51
    return-object v0
.end method

.method public getThumbFlag()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->thumbFlag:Ljava/lang/String;

    .line 117
    return-object v0
.end method

.method public setFileType(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->fileType:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setFileUrl(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->fileUrl:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setJid(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->jid:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setLengthWidth(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->lengthWidth:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setMaxAge(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->maxAge:Ljava/lang/String;

    .line 112
    return-void
.end method

.method public setSize(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->size:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public setThumbFlag(Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->thumbFlag:Ljava/lang/String;

    .line 123
    return-void
.end method
