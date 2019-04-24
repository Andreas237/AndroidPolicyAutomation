.class Lo/auq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:I


# instance fields
.field private a:Lcom/huawei/health/sns/model/chat/MessageItem;

.field private c:Lo/aur;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const/4 v0, 0x1

    sput v0, Lo/auq;->e:I

    return-void
.end method

.method constructor <init>(Lo/aur;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/auq;->c:Lo/aur;

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lo/auq;->d:I

    .line 53
    iput-object p1, p0, Lo/auq;->c:Lo/aur;

    .line 54
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 8

    .line 183
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v6

    .line 186
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    .line 188
    invoke-static {}, Lo/ara;->c()Lo/ara;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    move-object v2, v6

    move-object v3, v7

    move v4, p2

    new-instance v5, Lo/auq$1;

    invoke-direct {v5, p0, p1}, Lo/auq$1;-><init>(Lo/auq;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    invoke-virtual/range {v0 .. v5}, Lo/ara;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;)V

    .line 266
    return-void
.end method

.method private a()Z
    .locals 4

    .line 166
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isAccountInvalid"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 167
    if-eqz v3, :cond_0

    .line 169
    const-string v0, "MediaUpload"

    const-string v1, "send pic message isAccountInvalid false"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    :cond_0
    return v3
.end method

.method private b()Z
    .locals 3

    .line 337
    invoke-static {}, Lo/ayx;->d()Lo/ayx;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayx;->g()V

    .line 338
    iget-object v0, p0, Lo/auq;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    if-nez v0, :cond_0

    .line 340
    const/4 v0, 0x0

    return v0

    .line 342
    :cond_0
    iget v0, p0, Lo/auq;->d:I

    sget v1, Lo/auq;->e:I

    if-ge v0, v1, :cond_1

    .line 344
    iget v0, p0, Lo/auq;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/auq;->d:I

    .line 345
    const-string v0, "MediaUpload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "current retry num is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/auq;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    invoke-static {}, Lo/ara;->c()Lo/ara;

    move-result-object v0

    iget-object v1, p0, Lo/auq;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ara;->e(Ljava/lang/String;)V

    .line 348
    iget-object v0, p0, Lo/auq;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {p0, v0}, Lo/auq;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 349
    const/4 v0, 0x1

    return v0

    .line 351
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;Z)Lo/aud;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 122
    new-instance v0, Lo/auq$5;

    invoke-direct {v0, p0, p1, p2}, Lo/auq$5;-><init>(Lo/auq;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    return-object v0
.end method

.method private c([BLcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 5

    .line 277
    if-nez p1, :cond_0

    .line 279
    const-string v0, "MediaUpload"

    const-string v1, ":data is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 282
    iget-object v0, p0, Lo/auq;->c:Lo/aur;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-interface {v0, p2, v1, v2}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 283
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 284
    return-void

    .line 287
    :cond_0
    new-instance v3, Lo/aun;

    invoke-direct {v3}, Lo/aun;-><init>()V

    .line 288
    invoke-virtual {v3, p1}, Lo/aun;->c([B)V

    .line 290
    invoke-virtual {v3}, Lo/aun;->d()I

    move-result v4

    .line 291
    if-nez v4, :cond_2

    .line 294
    invoke-virtual {v3}, Lo/aun;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaMtsUrl(Ljava/lang/String;)V

    .line 295
    invoke-virtual {v3}, Lo/aun;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setForwardUrl(Ljava/lang/String;)V

    .line 296
    invoke-virtual {v3}, Lo/aun;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbFlag(Ljava/lang/String;)V

    .line 299
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 301
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 303
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apz;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto/16 :goto_0

    .line 305
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 307
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apz;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 312
    :cond_2
    const-string v0, "MediaUpload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ":uploadMediaFile failed. onDataReceived resCode is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\uff0c errcode is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lo/aun;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    invoke-virtual {v3}, Lo/aun;->c()I

    move-result v0

    const/16 v1, 0x3ea

    if-ne v0, v1, :cond_3

    .line 316
    invoke-direct {p0}, Lo/auq;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 318
    return-void

    .line 322
    :cond_3
    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 323
    iget-object v0, p0, Lo/auq;->c:Lo/aur;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-interface {v0, p2, v1, v2}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 325
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "upload file failed, info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/bpj;->b(ILjava/lang/String;)V

    .line 329
    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/auq;[BLcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lo/auq;->c([BLcom/huawei/health/sns/model/chat/MessageItem;)V

    return-void
.end method

.method static synthetic e(Lo/auq;)Lo/aur;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/auq;->c:Lo/aur;

    return-object v0
.end method

.method static synthetic e(Lo/auq;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lo/auq;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    return-void
.end method


# virtual methods
.method e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 5

    .line 68
    if-nez p1, :cond_0

    .line 70
    return-void

    .line 74
    :cond_0
    iput-object p1, p0, Lo/auq;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 77
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 80
    :goto_0
    invoke-direct {p0}, Lo/auq;->a()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    .line 83
    :goto_1
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat()Z

    move-result v0

    if-nez v0, :cond_3

    .line 85
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 86
    iget-object v0, p0, Lo/auq;->c:Lo/aur;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 87
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 88
    const/4 v4, 0x0

    .line 91
    :cond_3
    if-eqz v3, :cond_4

    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->g(J)Z

    move-result v0

    if-nez v0, :cond_4

    .line 93
    const-string v0, "MediaUpload"

    const-string v1, ":single, is not two way friend"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    .line 95
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 96
    iget-object v0, p0, Lo/auq;->c:Lo/aur;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 97
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 98
    const/4 v4, 0x0

    .line 102
    :cond_4
    if-nez v4, :cond_7

    .line 105
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 107
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apz;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_2

    .line 109
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 111
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apz;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 113
    :cond_6
    :goto_2
    return-void

    .line 116
    :cond_7
    invoke-direct {p0, p1, v3}, Lo/auq;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Z)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->b(Lo/aud;)V

    .line 117
    return-void
.end method
