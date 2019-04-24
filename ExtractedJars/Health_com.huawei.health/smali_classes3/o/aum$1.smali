.class Lo/aum$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aum;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aum;

.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/aum;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 255
    iput-object p1, p0, Lo/aum$1;->a:Lo/aum;

    iput-object p2, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCanceled()V
    .locals 4

    .line 315
    iget-object v0, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 316
    iget-object v0, p0, Lo/aum$1;->a:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 317
    return-void
.end method

.method public onCompleted(Ljava/lang/String;)V
    .locals 4

    .line 305
    iget-object v0, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 306
    iget-object v0, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbnail(Ljava/lang/String;)V

    .line 307
    iget-object v0, p0, Lo/aum$1;->a:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 308
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/apm;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/apm;->d(Ljava/lang/String;IZ)V

    .line 310
    return-void
.end method

.method public onFailed(Ljava/lang/String;I)V
    .locals 7

    .line 274
    iget-object v0, p0, Lo/aum$1;->a:Lo/aum;

    invoke-static {v0, p2, p1}, Lo/aum;->e(Lo/aum;ILjava/lang/String;)[I

    move-result-object v4

    .line 276
    array-length v0, v4

    if-nez v0, :cond_0

    .line 278
    return-void

    .line 280
    :cond_0
    const/4 v0, 0x0

    aget v5, v4, v0

    .line 281
    const/4 v0, 0x1

    aget v6, v4, v0

    .line 284
    const/16 v0, 0xcd

    if-ne v6, v0, :cond_1

    iget-object v0, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbFlag()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 286
    const-string v0, "MediaDownload"

    const-string v1, "retry load original image."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    invoke-static {}, Lo/aqs;->d()Lo/aqs;

    move-result-object v0

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aqs;->d(Ljava/lang/String;)V

    .line 289
    iget-object v0, p0, Lo/aum$1;->a:Lo/aum;

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1}, Lo/aum;->b(Lo/aum;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 290
    return-void

    .line 293
    :cond_1
    iget-object v0, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 295
    iget-object v0, p0, Lo/aum$1;->a:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 296
    const/4 v0, 0x2

    if-eq v5, v0, :cond_2

    const/4 v0, 0x6

    if-ne v5, v0, :cond_3

    .line 298
    :cond_2
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v2}, Lo/apm;->d(Ljava/lang/String;IZ)V

    .line 300
    :cond_3
    return-void
.end method

.method public onProgressChanged(I)V
    .locals 4

    .line 266
    iget-object v0, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 267
    iget-object v0, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setProgress(I)V

    .line 268
    iget-object v0, p0, Lo/aum$1;->a:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 269
    return-void
.end method

.method public onStarted()V
    .locals 4

    .line 259
    iget-object v0, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 260
    iget-object v0, p0, Lo/aum$1;->a:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 261
    return-void
.end method
