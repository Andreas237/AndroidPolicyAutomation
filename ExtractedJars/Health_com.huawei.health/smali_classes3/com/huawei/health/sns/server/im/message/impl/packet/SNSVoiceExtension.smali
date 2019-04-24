.class public Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;
.super Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;
.source "SourceFile"


# instance fields
.field private fileType:Ljava/lang/String;

.field private fileUrl:Ljava/lang/String;

.field private jid:Ljava/lang/String;

.field private maxAge:Ljava/lang/String;

.field private size:Ljava/lang/String;

.field private time:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 114
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string v0, "audio"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setInfoType(Ljava/lang/String;)V

    .line 116
    return-void
.end method


# virtual methods
.method public getFileType()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->fileType:Ljava/lang/String;

    .line 82
    return-object v0
.end method

.method public getFileUrl()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->fileUrl:Ljava/lang/String;

    .line 71
    return-object v0
.end method

.method public getJid()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->jid:Ljava/lang/String;

    .line 60
    return-object v0
.end method

.method public getMaxAge()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->maxAge:Ljava/lang/String;

    .line 93
    return-object v0
.end method

.method public getMultiExtBody()Ljava/lang/String;
    .locals 4

    .line 124
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 125
    const-string v0, "<info type=\"audio\">"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 127
    const-string v0, "size"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->size:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string v0, "time"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->time:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    const-string v0, "</info>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 131
    const-string v0, "<item>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 133
    const-string v0, "<"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "bob"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 134
    const-string v0, " xmlns=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->getBob_xmlns()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 135
    const-string v0, " jid=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->jid:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->fileUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 138
    const-string v0, " url=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-static {v3}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXML(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 140
    const-string v0, " max-age=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->maxAge:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 141
    const-string v0, " type=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->fileType:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 143
    const-string v0, "/>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 145
    const-string v0, "</item>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 146
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSize()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->size:Ljava/lang/String;

    .line 48
    return-object v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->time:Ljava/lang/String;

    return-object v0
.end method

.method public setFileType(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->fileType:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setFileUrl(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->fileUrl:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public setJid(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->jid:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setMaxAge(Ljava/lang/String;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->maxAge:Ljava/lang/String;

    .line 99
    return-void
.end method

.method public setSize(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->size:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public setTime(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->time:Ljava/lang/String;

    .line 109
    return-void
.end method
