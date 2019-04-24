.class Lo/aum;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aum$a;
    }
.end annotation


# static fields
.field private static b:I


# instance fields
.field private a:Z

.field private c:Lcom/huawei/health/sns/model/chat/MessageItem;

.field private d:I

.field private e:Lo/aur;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 69
    const/4 v0, 0x1

    sput v0, Lo/aum;->b:I

    return-void
.end method

.method constructor <init>(Lo/aur;)V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aum;->e:Lo/aur;

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/aum;->d:I

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aum;->a:Z

    .line 81
    iput-object p1, p0, Lo/aum;->e:Lo/aur;

    .line 82
    return-void
.end method

.method static synthetic a(Lo/aum;)Lo/aur;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/aum;->e:Lo/aur;

    return-object v0
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 0

    .line 132
    iput-object p1, p0, Lo/aum;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 133
    iput-boolean p2, p0, Lo/aum;->a:Z

    .line 134
    return-void
.end method

.method private a()Z
    .locals 3

    .line 404
    invoke-static {}, Lo/ayx;->d()Lo/ayx;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayx;->g()V

    .line 405
    iget-object v0, p0, Lo/aum;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    if-nez v0, :cond_0

    .line 407
    const/4 v0, 0x0

    return v0

    .line 409
    :cond_0
    iget v0, p0, Lo/aum;->d:I

    sget v1, Lo/aum;->b:I

    if-ge v0, v1, :cond_2

    .line 411
    iget v0, p0, Lo/aum;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/aum;->d:I

    .line 412
    const-string v0, "MediaDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "current retry num is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/aum;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    invoke-static {}, Lo/aqs;->d()Lo/aqs;

    move-result-object v0

    iget-object v1, p0, Lo/aum;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aqs;->c(Ljava/lang/String;)V

    .line 415
    iget-boolean v0, p0, Lo/aum;->a:Z

    if-eqz v0, :cond_1

    .line 417
    iget-object v0, p0, Lo/aum;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {p0, v0}, Lo/aum;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 421
    :cond_1
    iget-object v0, p0, Lo/aum;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {p0, v0}, Lo/aum;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 423
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 425
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private b()Ljava/lang/String;
    .locals 2

    .line 144
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->a()I

    move-result v1

    .line 145
    const/16 v0, 0x438

    if-lt v1, v0, :cond_0

    .line 147
    const-string v0, "m"

    return-object v0

    .line 149
    :cond_0
    const-string v0, "s"

    return-object v0
.end method

.method private b(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 328
    if-nez p1, :cond_0

    .line 330
    return-void

    .line 332
    :cond_0
    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbFlag(Ljava/lang/String;)V

    .line 333
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Lo/aum;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 334
    return-void
.end method

.method static synthetic b(Lo/aum;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/aum;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;
    .locals 1

    .line 254
    new-instance v0, Lo/aum$1;

    invoke-direct {v0, p0, p1}, Lo/aum$1;-><init>(Lo/aum;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private c(ILjava/lang/String;)[I
    .locals 7

    .line 346
    const/4 v0, 0x2

    new-array v4, v0, [I

    .line 348
    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    .line 351
    new-instance v5, Lo/aui;

    invoke-direct {v5}, Lo/aui;-><init>()V

    .line 352
    invoke-virtual {v5, p2}, Lo/aui;->d(Ljava/lang/String;)V

    .line 353
    invoke-virtual {v5}, Lo/aui;->d()I

    move-result v6

    .line 355
    const/4 v0, 0x1

    aput v6, v4, v0

    .line 356
    if-lez v6, :cond_1

    .line 359
    const/16 v0, 0xca

    if-ne v6, v0, :cond_0

    .line 361
    const/4 v3, 0x6

    goto :goto_0

    .line 365
    :cond_0
    const/4 v3, 0x2

    goto :goto_0

    .line 370
    :cond_1
    const-string v0, "MediaDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ":getDownloadStatus . errcode is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lo/aui;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    const/4 v3, 0x3

    .line 372
    invoke-virtual {v5}, Lo/aui;->c()I

    move-result v0

    const/16 v1, 0x3ea

    if-ne v0, v1, :cond_2

    .line 374
    invoke-direct {p0}, Lo/aum;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 378
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 384
    :cond_2
    :goto_0
    invoke-static {v6, p2}, Lo/bpj;->b(ILjava/lang/String;)V

    .line 385
    goto :goto_1

    .line 386
    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    .line 388
    const/4 v3, 0x0

    goto :goto_1

    .line 392
    :cond_4
    const/4 v0, -0x1

    if-ne p1, v0, :cond_5

    const/4 v3, 0x2

    goto :goto_1

    :cond_5
    const/4 v3, 0x3

    .line 394
    :goto_1
    const/4 v0, 0x0

    aput v3, v4, v0

    .line 395
    return-object v4
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V
    .locals 4

    .line 161
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 163
    :goto_0
    const/4 v3, 0x0

    .line 166
    const-wide/32 v0, -0x186ac

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    .line 168
    invoke-direct {p0, p1}, Lo/aum;->i(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    move-result-object v3

    goto :goto_1

    .line 173
    :cond_1
    invoke-direct {p0, p1}, Lo/aum;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    move-result-object v3

    .line 176
    :goto_1
    new-instance v0, Lo/aum$a;

    invoke-direct {v0, p1, v2, v3}, Lo/aum$a;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    invoke-static {v0}, Lo/aty;->b(Lo/aud;)V

    .line 177
    return-void
.end method

.method static synthetic e(Lo/aum;ILjava/lang/String;)[I
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2}, Lo/aum;->c(ILjava/lang/String;)[I

    move-result-object v0

    return-object v0
.end method

.method private f(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;
    .locals 1

    .line 516
    new-instance v0, Lo/aum$4;

    invoke-direct {v0, p0, p1}, Lo/aum$4;-><init>(Lo/aum;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private i(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;
    .locals 1

    .line 436
    new-instance v0, Lo/aum$5;

    invoke-direct {v0, p0, p1}, Lo/aum$5;-><init>(Lo/aum;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 182
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 183
    :goto_0
    new-instance v0, Lo/aum$a;

    invoke-direct {p0, p1}, Lo/aum;->f(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    move-result-object v1

    invoke-direct {v0, p1, v2, v1}, Lo/aum$a;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    invoke-static {v0}, Lo/aty;->b(Lo/aud;)V

    .line 185
    return-void
.end method

.method d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 113
    if-nez p1, :cond_0

    .line 115
    return-void

    .line 119
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/aum;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 120
    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbFlag(Ljava/lang/String;)V

    .line 121
    const-wide/32 v0, -0x186ac

    invoke-direct {p0, p1, v0, v1}, Lo/aum;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 122
    return-void
.end method

.method e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 91
    if-nez p1, :cond_0

    .line 93
    return-void

    .line 97
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/aum;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 98
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbFlag()Ljava/lang/String;

    move-result-object v2

    .line 99
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    invoke-direct {p0}, Lo/aum;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbFlag(Ljava/lang/String;)V

    .line 103
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Lo/aum;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 104
    return-void
.end method
