.class Lo/aum$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aum;->i(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/aum;

.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/aum;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 437
    iput-object p1, p0, Lo/aum$5;->b:Lo/aum;

    iput-object p2, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCanceled()V
    .locals 2

    .line 502
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setOriginalDownStatus(I)V

    .line 503
    return-void
.end method

.method public onCompleted(Ljava/lang/String;)V
    .locals 5

    .line 480
    const-class v0, Lo/aum;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IDownloadListener onCompleted filePath:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setOriginalDownStatus(I)V

    .line 482
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 484
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v4

    .line 485
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v4}, Lo/bot;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 487
    :cond_0
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 488
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbnail(Ljava/lang/String;)V

    .line 489
    iget-object v0, p0, Lo/aum$5;->b:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 490
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/apm;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/apm;->d(Ljava/lang/String;IZ)V

    .line 494
    :cond_1
    iget-object v0, p0, Lo/aum$5;->b:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const-wide/32 v2, -0x186ac

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 495
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/apm;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/apm;->d(Ljava/lang/String;IZ)V

    .line 497
    return-void
.end method

.method public onFailed(Ljava/lang/String;I)V
    .locals 6

    .line 456
    const-class v0, Lo/aum;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IDownloadListener onFailed msg:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "errCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 457
    iget-object v0, p0, Lo/aum$5;->b:Lo/aum;

    invoke-static {v0, p2, p1}, Lo/aum;->e(Lo/aum;ILjava/lang/String;)[I

    move-result-object v4

    .line 459
    array-length v0, v4

    if-nez v0, :cond_0

    .line 461
    return-void

    .line 464
    :cond_0
    invoke-static {p2, p1}, Lo/bpj;->b(ILjava/lang/String;)V

    .line 465
    const/4 v0, 0x0

    aget v5, v4, v0

    .line 467
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setOriginalDownStatus(I)V

    .line 469
    iget-object v0, p0, Lo/aum$5;->b:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const-wide/32 v2, -0x186ac

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 471
    const/4 v0, 0x2

    if-eq v5, v0, :cond_1

    const/4 v0, 0x6

    if-ne v5, v0, :cond_2

    .line 473
    :cond_1
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v5, v2}, Lo/apm;->d(Ljava/lang/String;IZ)V

    .line 475
    :cond_2
    return-void
.end method

.method public onProgressChanged(I)V
    .locals 3

    .line 448
    const-class v0, Lo/aum;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IDownloadListener onProgressChanged :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setOriginalDownStatus(I)V

    .line 450
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setProgress(I)V

    .line 451
    return-void
.end method

.method public onStarted()V
    .locals 2

    .line 441
    const-class v0, Lo/aum;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IDownloadListener onStarted"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    iget-object v0, p0, Lo/aum$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setOriginalDownStatus(I)V

    .line 443
    return-void
.end method
