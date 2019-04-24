.class public final Lo/axu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private a:J

.field private b:Ljava/lang/String;

.field private c:J

.field private d:I

.field private k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-class v0, Lo/axu;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/axu;->e:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    invoke-direct {p0, p1}, Lo/axu;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 105
    return-void
.end method

.method public static a(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/axu;
    .locals 1

    .line 99
    new-instance v0, Lo/axu;

    invoke-direct {v0, p0}, Lo/axu;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private b(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 114
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v0

    iput-wide v0, p0, Lo/axu;->a:J

    .line 115
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axu;->b:Ljava/lang/String;

    .line 116
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v0

    iput-wide v0, p0, Lo/axu;->c:J

    .line 117
    invoke-direct {p0, p1}, Lo/axu;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 118
    invoke-direct {p0, p1}, Lo/axu;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 119
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 128
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v1

    .line 129
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    .line 131
    const/4 v0, 0x0

    iput v0, p0, Lo/axu;->d:I

    goto :goto_0

    .line 133
    :cond_0
    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    .line 135
    const/4 v0, 0x1

    iput v0, p0, Lo/axu;->d:I

    goto :goto_0

    .line 137
    :cond_1
    const/16 v0, 0x8

    if-ne v1, v0, :cond_2

    .line 139
    const/4 v0, 0x2

    iput v0, p0, Lo/axu;->d:I

    goto :goto_0

    .line 141
    :cond_2
    const/4 v0, 0x3

    if-ne v1, v0, :cond_3

    .line 143
    const/4 v0, 0x3

    iput v0, p0, Lo/axu;->d:I

    goto :goto_0

    .line 147
    :cond_3
    const/4 v0, -0x1

    iput v0, p0, Lo/axu;->d:I

    .line 149
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 2

    .line 183
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    if-eqz v0, :cond_0

    .line 185
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axu;->k:Ljava/lang/String;

    goto :goto_0

    .line 189
    :cond_0
    const-string v0, ""

    iput-object v0, p0, Lo/axu;->k:Ljava/lang/String;

    .line 191
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 158
    iget v0, p0, Lo/axu;->d:I

    if-eqz v0, :cond_0

    iget v0, p0, Lo/axu;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 160
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axu;->k:Ljava/lang/String;

    goto :goto_0

    .line 162
    :cond_1
    iget v0, p0, Lo/axu;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 164
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/axu;->c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    goto :goto_0

    .line 166
    :cond_2
    iget v0, p0, Lo/axu;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 168
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axu;->k:Ljava/lang/String;

    goto :goto_0

    .line 172
    :cond_3
    const-string v0, ""

    iput-object v0, p0, Lo/axu;->k:Ljava/lang/String;

    .line 174
    :goto_0
    return-void
.end method


# virtual methods
.method public d()Lorg/json/JSONObject;
    .locals 5

    .line 200
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 203
    const-string v0, "send_uid"

    :try_start_0
    iget-wide v1, p0, Lo/axu;->a:J

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 204
    const-string v0, "name"

    iget-object v1, p0, Lo/axu;->b:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 205
    const-string v0, "time"

    iget-wide v1, p0, Lo/axu;->c:J

    invoke-static {v1, v2}, Lo/bog;->c(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 206
    const-string v0, "type"

    iget v1, p0, Lo/axu;->d:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 207
    const-string v0, "content"

    iget-object v1, p0, Lo/axu;->k:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    goto :goto_0

    .line 209
    :catch_0
    move-exception v4

    .line 211
    sget-object v0, Lo/axu;->e:Ljava/lang/String;

    const-string v1, "ComplainData getJSON got error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    :goto_0
    return-object v3
.end method
