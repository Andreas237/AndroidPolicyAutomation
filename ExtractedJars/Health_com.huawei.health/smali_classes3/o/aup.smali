.class Lo/aup;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static c:I

.field private static e:I

.field private static i:I


# instance fields
.field private b:Lo/aur;

.field private d:Lcom/huawei/health/sns/model/chat/MessageItem;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const/4 v0, 0x0

    sput v0, Lo/aup;->e:I

    .line 48
    const/4 v0, 0x1

    sput v0, Lo/aup;->c:I

    .line 51
    const/4 v0, 0x2

    sput v0, Lo/aup;->a:I

    .line 59
    const/4 v0, 0x1

    sput v0, Lo/aup;->i:I

    return-void
.end method

.method constructor <init>(Lo/aur;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aup;->b:Lo/aur;

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lo/aup;->k:I

    .line 63
    iput-object p1, p0, Lo/aup;->b:Lo/aur;

    .line 64
    return-void
.end method

.method private a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 4

    .line 269
    instance-of v0, p1, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;

    if-eqz v0, :cond_1

    .line 271
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;

    .line 272
    const-string v0, "MediaTransfer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processResponse responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\uff0c errcode is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->getErrcode_()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->getErrcode_()I

    move-result v0

    const/16 v1, 0x3ea

    if-ne v0, v1, :cond_0

    .line 276
    sget v0, Lo/aup;->c:I

    return v0

    .line 278
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->ok()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 281
    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;->getUrl_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaMtsUrl(Ljava/lang/String;)V

    .line 282
    sget v0, Lo/aup;->e:I

    return v0

    .line 287
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaMtsUrl(Ljava/lang/String;)V

    .line 289
    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 290
    sget v0, Lo/aup;->a:I

    return v0
.end method

.method static synthetic a(Lo/aup;Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lo/aup;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lo/aup;)Lo/aur;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/aup;->b:Lo/aur;

    return-object v0
.end method

.method static synthetic b()I
    .locals 1

    .line 34
    sget v0, Lo/aup;->e:I

    return v0
.end method

.method private b(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/aud;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 84
    new-instance v0, Lo/aup$4;

    invoke-direct {v0, p0, p1}, Lo/aup$4;-><init>(Lo/aup;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private c()Z
    .locals 3

    .line 182
    invoke-static {}, Lo/ayx;->d()Lo/ayx;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayx;->g()V

    .line 183
    iget-object v0, p0, Lo/aup;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    if-nez v0, :cond_0

    .line 185
    const/4 v0, 0x0

    return v0

    .line 187
    :cond_0
    iget v0, p0, Lo/aup;->k:I

    sget v1, Lo/aup;->i:I

    if-ge v0, v1, :cond_1

    .line 189
    iget v0, p0, Lo/aup;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/aup;->k:I

    .line 190
    const-string v0, "MediaTransfer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "current retry num is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/aup;->k:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lo/aup;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {p0, v0}, Lo/aup;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 193
    const/4 v0, 0x1

    return v0

    .line 195
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lo/aup;)Z
    .locals 1

    .line 34
    invoke-direct {p0}, Lo/aup;->c()Z

    move-result v0

    return v0
.end method

.method static synthetic d()I
    .locals 1

    .line 34
    sget v0, Lo/aup;->c:I

    return v0
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 10

    .line 207
    invoke-static {}, Lo/bcd;->a()Ljava/lang/String;

    move-result-object v3

    .line 208
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    const-string v0, "MediaTransfer"

    const-string v1, ":synRequestTransfer mcode is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 212
    sget v0, Lo/aup;->a:I

    return v0

    .line 216
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getForwardUrl()Ljava/lang/String;

    move-result-object v4

    .line 217
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaMtsUrl()Ljava/lang/String;

    move-result-object v4

    .line 222
    :cond_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 224
    const-string v0, "MediaTransfer"

    const-string v1, ":synRequestTransfer mtsUrl is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 226
    sget v0, Lo/aup;->a:I

    return v0

    .line 230
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 231
    iget-object v0, p0, Lo/aup;->b:Lo/aur;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 233
    new-instance v5, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;

    invoke-direct {v5, v3, v4}, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    const/4 v6, 0x0

    .line 236
    const/4 v7, 0x0

    .line 237
    const/4 v8, 0x0

    .line 240
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isFromGroup()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 242
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getFromUID()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    .line 245
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 247
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 251
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 253
    :goto_0
    invoke-virtual {v5, v6, v7, v8}, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->setData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    invoke-static {v5}, Lo/bqr;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v9

    .line 257
    invoke-direct {p0, v9, p1}, Lo/aup;->a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    return v0
.end method


# virtual methods
.method c(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 73
    if-nez p1, :cond_0

    .line 75
    return-void

    .line 77
    :cond_0
    iput-object p1, p0, Lo/aup;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 78
    invoke-direct {p0, p1}, Lo/aup;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->b(Lo/aud;)V

    .line 79
    return-void
.end method
