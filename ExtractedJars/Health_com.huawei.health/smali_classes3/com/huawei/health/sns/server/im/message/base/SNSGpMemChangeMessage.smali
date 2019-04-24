.class public Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;
.super Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# static fields
.field public static final GROUP_COMMON:Ljava/lang/String; = "0"

.field public static final GROUP_FAMILY:Ljava/lang/String; = "1"

.field public static final OP_AGREE_JOIN_COMMON_GROUP:I = 0x8

.field public static final OP_AGREE_JOIN_FAMILY:I = 0x4

.field public static final OP_COMMON_GROUP_INVITE:I = 0x7

.field public static final OP_CREATE_GROUP:I = 0x0

.field public static final OP_DEL_GROUP_MEMBER:I = 0x2

.field public static final OP_DISSOLVE_GROUP:I = 0x1

.field public static final OP_INVITE_JOIN_COMMON_GROUP:I = 0x3

.field public static final OP_JOIN_COMMON_GROUP:I = 0x5

.field public static final OP_QUIT_GROUP:I = 0x6

.field public static final TAG:Ljava/lang/String;


# instance fields
.field private groupId:J

.field private memInfoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;"
        }
    .end annotation
.end field

.field private opType:I

.field private operatorId:J

.field private operatorName:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const-class v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 200
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>()V

    .line 201
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->i:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V

    .line 202
    return-void
.end method

.method public static buildWithExtension(Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;)Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;
    .locals 4

    .line 206
    new-instance v2, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;-><init>()V

    .line 207
    if-eqz p0, :cond_0

    .line 211
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->getGroupId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->setGroupId(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    goto :goto_0

    .line 213
    :catch_0
    move-exception v3

    .line 215
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->TAG:Ljava/lang/String;

    const-string v1, "GroupMemChangeNotification groudID error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->setType(Ljava/lang/String;)V

    .line 218
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->getOp()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->setOp(Ljava/lang/String;)V

    .line 219
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->setVersion(Ljava/lang/String;)V

    .line 223
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->getOperatorId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->setOperatorId(J)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 228
    goto :goto_1

    .line 225
    :catch_1
    move-exception v3

    .line 227
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->TAG:Ljava/lang/String;

    const-string v1, "GroupMemChangeNotification operatorId error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->getOperatorName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->setOperatorName(Ljava/lang/String;)V

    .line 231
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->getMemInfoList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->setMemInfoList(Ljava/util/List;)V

    .line 233
    :cond_0
    return-object v2
.end method

.method private valueOfStr(Ljava/lang/String;)I
    .locals 3

    .line 152
    const/4 v1, -0x1

    .line 155
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 160
    goto :goto_0

    .line 157
    :catch_0
    move-exception v2

    .line 159
    return v1

    .line 161
    :goto_0
    return v1
.end method


# virtual methods
.method public getGroupId()J
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->groupId:J

    .line 127
    return-wide v0
.end method

.method public getMemInfoList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;"
        }
    .end annotation

    .line 188
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->memInfoList:Ljava/util/List;

    return-object v0
.end method

.method public getOp()I
    .locals 1

    .line 142
    iget v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->opType:I

    return v0
.end method

.method public getOperatorId()J
    .locals 2

    .line 177
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->operatorId:J

    .line 178
    return-wide v0
.end method

.method public getOperatorName()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->operatorName:Ljava/lang/String;

    .line 167
    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->type:Ljava/lang/String;

    .line 116
    return-object v0
.end method

.method public setGroupId(J)V
    .locals 0

    .line 132
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->groupId:J

    .line 133
    return-void
.end method

.method public setMemInfoList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;)V"
        }
    .end annotation

    .line 193
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->memInfoList:Ljava/util/List;

    .line 194
    return-void
.end method

.method public setOp(Ljava/lang/String;)V
    .locals 1

    .line 147
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->valueOfStr(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->opType:I

    .line 148
    return-void
.end method

.method public setOperatorId(J)V
    .locals 0

    .line 183
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->operatorId:J

    .line 184
    return-void
.end method

.method public setOperatorName(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->operatorName:Ljava/lang/String;

    .line 173
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->type:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->version:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "version:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
