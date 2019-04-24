.class Lo/auq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/auq;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic b:Lo/auq;


# direct methods
.method constructor <init>(Lo/auq;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lo/auq$1;->b:Lo/auq;

    iput-object p2, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCanceled()V
    .locals 4

    .line 259
    const-string v0, "MediaUpload"

    const-string v1, "uploadMediaFile onCanceled"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    iget-object v0, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 261
    iget-object v0, p0, Lo/auq$1;->b:Lo/auq;

    invoke-static {v0}, Lo/auq;->e(Lo/auq;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 263
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 264
    return-void
.end method

.method public onCompleted()V
    .locals 4

    .line 251
    const-string v0, "MediaUpload"

    const-string v1, "uploadMediaFile onCompleted"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    iget-object v0, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 253
    iget-object v0, p0, Lo/auq$1;->b:Lo/auq;

    invoke-static {v0}, Lo/auq;->e(Lo/auq;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 254
    return-void
.end method

.method public onConnError()V
    .locals 4

    .line 241
    const-string v0, "MediaUpload"

    const-string v1, "uploadMediaFile onConnError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    iget-object v0, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 243
    iget-object v0, p0, Lo/auq$1;->b:Lo/auq;

    invoke-static {v0}, Lo/auq;->e(Lo/auq;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 245
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 246
    return-void
.end method

.method public onDataReceived([B)V
    .locals 2

    .line 234
    const-string v0, "MediaUpload"

    const-string v1, "uploadMediaFile onDataReceived"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lo/auq$1;->b:Lo/auq;

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, p1, v1}, Lo/auq;->d(Lo/auq;[BLcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 236
    return-void
.end method

.method public onFailed(Ljava/lang/String;)V
    .locals 4

    .line 221
    const-string v0, "MediaUpload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadMediaFile onFailed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    iget-object v0, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 223
    iget-object v0, p0, Lo/auq$1;->b:Lo/auq;

    invoke-static {v0}, Lo/auq;->e(Lo/auq;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 225
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 228
    const/4 v0, -0x1

    invoke-static {v0, p1}, Lo/bpj;->b(ILjava/lang/String;)V

    .line 229
    return-void
.end method

.method public onProgressChanged(I)V
    .locals 4

    .line 212
    const-string v0, "MediaUpload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadMediaFile onProgressChanged progress = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    iget-object v0, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 214
    iget-object v0, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setProgress(I)V

    .line 215
    iget-object v0, p0, Lo/auq$1;->b:Lo/auq;

    invoke-static {v0}, Lo/auq;->e(Lo/auq;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 216
    return-void
.end method

.method public onStarted()V
    .locals 4

    .line 204
    const-string v0, "MediaUpload"

    const-string v1, "uploadMediaFile onStarted"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 206
    iget-object v0, p0, Lo/auq$1;->b:Lo/auq;

    invoke-static {v0}, Lo/auq;->e(Lo/auq;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 207
    return-void
.end method

.method public onTimeOut()V
    .locals 4

    .line 194
    const-string v0, "MediaUpload"

    const-string v1, "uploadMediaFile onTimeOut"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 196
    iget-object v0, p0, Lo/auq$1;->b:Lo/auq;

    invoke-static {v0}, Lo/auq;->e(Lo/auq;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 198
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/auq$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 199
    return-void
.end method
