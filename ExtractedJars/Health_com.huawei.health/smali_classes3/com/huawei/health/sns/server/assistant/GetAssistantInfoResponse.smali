.class public Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;
.source "SourceFile"


# instance fields
.field private account_name_:Ljava/lang/String;

.field private appinfo_:Ljava/lang/String;

.field private channel_:Ljava/lang/String;

.field private company_:Ljava/lang/String;

.field private default_msg_:Ljava/lang/String;

.field private introduction_:Ljava/lang/String;

.field private menu_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccount_name_()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->account_name_:Ljava/lang/String;

    .line 121
    return-object v0
.end method

.method public getAppinfo_()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->appinfo_:Ljava/lang/String;

    .line 109
    return-object v0
.end method

.method public getChannel_()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->channel_:Ljava/lang/String;

    .line 97
    return-object v0
.end method

.method public getCompany_()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->company_:Ljava/lang/String;

    .line 115
    return-object v0
.end method

.method public getDefault_msg_()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->default_msg_:Ljava/lang/String;

    .line 103
    return-object v0
.end method

.method public getIntroduction_()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->introduction_:Ljava/lang/String;

    .line 85
    return-object v0
.end method

.method public getMenu_()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->menu_:Ljava/lang/String;

    .line 91
    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 127
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x400

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 128
    const-string v0, "GetAssistantInfoResponse, ec:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    iget v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->errcode_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    const-string v0, ", em:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->errmsg_:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setAccount_name_(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->account_name_:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setAppinfo_(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->appinfo_:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setChannel_(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->channel_:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setCompany_(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->company_:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setDefault_msg_(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->default_msg_:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setIntroduction_(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->introduction_:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setMenu_(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;->menu_:Ljava/lang/String;

    .line 60
    return-void
.end method
