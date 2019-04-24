.class Lo/evg$5;
.super Lo/evd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evg;->a(Lo/evp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/evg;

.field final synthetic c:Lo/evp;


# direct methods
.method constructor <init>(Lo/evg;Lo/evp;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/evg$5;->a:Lo/evg;

    iput-object p2, p0, Lo/evg$5;->c:Lo/evp;

    invoke-direct {p0}, Lo/evd;-><init>()V

    return-void
.end method


# virtual methods
.method public c(JJZ)V
    .locals 3

    .line 175
    iget-object v0, p0, Lo/evg$5;->c:Lo/evp;

    iget-object v1, p0, Lo/evg$5;->c:Lo/evp;

    invoke-virtual {v1}, Lo/evp;->b()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/evp;->a(J)V

    .line 176
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v0}, Lo/evg;->d(Lo/evg;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 177
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 138
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDownload() errorCode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v0}, Lo/evg;->a(Lo/evg;)Lo/evj;

    move-result-object v0

    invoke-virtual {v0}, Lo/evj;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 140
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v0}, Lo/evg;->e(Lo/evg;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    .line 141
    const/4 v0, 0x3

    if-gt v4, v0, :cond_0

    const/4 v0, -0x2

    if-eq p1, v0, :cond_0

    .line 142
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDownload() download error url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/evg$5;->c:Lo/evp;

    invoke-virtual {v3}, Lo/evp;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDownload() download error retry times:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lo/evg$5;->c:Lo/evp;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lo/evp;->a(J)V

    .line 145
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v0}, Lo/evg;->d(Lo/evg;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v1}, Lo/evg;->d(Lo/evg;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/evg$5;->c:Lo/evp;

    const/4 v3, 0x5

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 147
    :cond_0
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v0}, Lo/evg;->d(Lo/evg;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 150
    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lorg/json/JSONObject;)V
    .locals 4

    .line 154
    iget-object v0, p0, Lo/evg$5;->c:Lo/evp;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/evp;->c(Z)V

    .line 156
    iget-object v0, p0, Lo/evg$5;->c:Lo/evp;

    iget-object v1, p0, Lo/evg$5;->c:Lo/evp;

    invoke-virtual {v1}, Lo/evp;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/evp;->a(J)V

    .line 157
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDownload() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/evg$5;->c:Lo/evp;

    invoke-virtual {v3}, Lo/evp;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u4e0b\u8f7d\u5b8c\u6210"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v0}, Lo/evg;->a(Lo/evg;)Lo/evj;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 160
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v0}, Lo/evg;->d(Lo/evg;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 161
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    iget-object v1, p0, Lo/evg$5;->c:Lo/evp;

    invoke-static {v0, v1}, Lo/evg;->e(Lo/evg;Lo/evp;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 162
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDownload() \u672a\u5b8c\u6210\uff0c\u7ee7\u7eed\u4e0b\u8f7d"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v0}, Lo/evg;->b(Lo/evg;)Z

    goto :goto_0

    .line 165
    :cond_0
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDownload() \u5168\u90e8\u4e0b\u8f7d\u5b8c\u6210"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget-object v0, p0, Lo/evg$5;->a:Lo/evg;

    invoke-static {v0}, Lo/evg;->d(Lo/evg;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 170
    :cond_1
    :goto_0
    return-void
.end method
