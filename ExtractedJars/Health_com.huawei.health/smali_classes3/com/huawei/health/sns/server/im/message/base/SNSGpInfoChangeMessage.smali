.class public Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;
.super Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;
    }
.end annotation


# static fields
.field public static final GROUP_COMMON:Ljava/lang/String; = "0"

.field public static final GROUP_FAMILY:Ljava/lang/String; = "1"


# instance fields
.field private downloadUrl:Ljava/lang/String;

.field private groupId:J

.field private groupImageUrl:Ljava/lang/String;

.field private groupName:Ljava/lang/String;

.field private managerId:J

.field private managerName:Ljava/lang/String;

.field private op:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

.field private operatorId:J

.field private operatorName:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 202
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>()V

    .line 203
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->k:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V

    .line 204
    return-void
.end method


# virtual methods
.method public getDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->downloadUrl:Ljava/lang/String;

    .line 116
    return-object v0
.end method

.method public getGroupId()J
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->groupId:J

    .line 127
    return-wide v0
.end method

.method public getGroupImageUrl()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->groupImageUrl:Ljava/lang/String;

    .line 105
    return-object v0
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->groupName:Ljava/lang/String;

    .line 94
    return-object v0
.end method

.method public getManagerId()J
    .locals 2

    .line 180
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->managerId:J

    return-wide v0
.end method

.method public getManagerName()Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->managerName:Ljava/lang/String;

    return-object v0
.end method

.method public getOp()Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->op:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    return-object v0
.end method

.method public getOperatorId()J
    .locals 2

    .line 158
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->operatorId:J

    .line 159
    return-wide v0
.end method

.method public getOperatorName()Ljava/lang/String;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->operatorName:Ljava/lang/String;

    .line 170
    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->type:Ljava/lang/String;

    .line 138
    return-object v0
.end method

.method public setDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->downloadUrl:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setGroupId(J)V
    .locals 0

    .line 132
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->groupId:J

    .line 133
    return-void
.end method

.method public setGroupImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->groupImageUrl:Ljava/lang/String;

    .line 111
    return-void
.end method

.method public setGroupName(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->groupName:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setManagerId(J)V
    .locals 0

    .line 185
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->managerId:J

    .line 186
    return-void
.end method

.method public setManagerName(Ljava/lang/String;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->managerName:Ljava/lang/String;

    .line 196
    return-void
.end method

.method public setOp(Ljava/lang/String;)V
    .locals 1

    .line 153
    invoke-static {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->c(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->op:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    .line 154
    return-void
.end method

.method public setOperatorId(J)V
    .locals 0

    .line 164
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->operatorId:J

    .line 165
    return-void
.end method

.method public setOperatorName(Ljava/lang/String;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->operatorName:Ljava/lang/String;

    .line 176
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->type:Ljava/lang/String;

    .line 144
    return-void
.end method
