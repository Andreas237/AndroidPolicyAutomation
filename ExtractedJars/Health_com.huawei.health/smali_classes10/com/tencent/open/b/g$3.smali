.class Lcom/tencent/open/b/g$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJILjava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:I

.field final synthetic e:J

.field final synthetic f:J

.field final synthetic g:Z

.field final synthetic h:Lcom/tencent/open/b/g;


# direct methods
.method constructor <init>(Lcom/tencent/open/b/g;JLjava/lang/String;Ljava/lang/String;IJJZ)V
    .locals 0

    .line 274
    iput-object p1, p0, Lcom/tencent/open/b/g$3;->h:Lcom/tencent/open/b/g;

    iput-wide p2, p0, Lcom/tencent/open/b/g$3;->a:J

    iput-object p4, p0, Lcom/tencent/open/b/g$3;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/tencent/open/b/g$3;->c:Ljava/lang/String;

    iput p6, p0, Lcom/tencent/open/b/g$3;->d:I

    iput-wide p7, p0, Lcom/tencent/open/b/g$3;->e:J

    iput-wide p9, p0, Lcom/tencent/open/b/g$3;->f:J

    iput-boolean p11, p0, Lcom/tencent/open/b/g$3;->g:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 15

    .line 278
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/tencent/open/b/g$3;->a:J

    sub-long v4, v0, v2

    .line 280
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 282
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/b/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 283
    const-string v0, "apn"

    invoke-virtual {v6, v0, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v0, "appid"

    const-string v1, "1000067"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v0, "commandid"

    iget-object v1, p0, Lcom/tencent/open/b/g$3;->b:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    const-string v0, "detail"

    iget-object v1, p0, Lcom/tencent/open/b/g$3;->c:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 289
    const-string v0, "network="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 290
    const-string v0, "sdcard="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mounted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 291
    const-string v0, "wifi="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/open/b/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 293
    const-string v0, "deviceInfo"

    invoke-virtual {v6, v0, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    iget-object v0, p0, Lcom/tencent/open/b/g$3;->h:Lcom/tencent/open/b/g;

    iget v1, p0, Lcom/tencent/open/b/g$3;->d:I

    invoke-virtual {v0, v1}, Lcom/tencent/open/b/g;->a(I)I

    move-result v10

    .line 297
    const/16 v0, 0x64

    div-int v10, v0, v10

    .line 298
    if-gtz v10, :cond_1

    .line 299
    const/4 v10, 0x1

    goto :goto_1

    .line 300
    :cond_1
    const/16 v0, 0x64

    if-le v10, v0, :cond_2

    .line 301
    const/16 v10, 0x64

    .line 304
    :cond_2
    :goto_1
    const-string v0, "frequency"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v0, "reqSize"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, Lcom/tencent/open/b/g$3;->e:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    const-string v0, "resultCode"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/tencent/open/b/g$3;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    const-string v0, "rspSize"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, Lcom/tencent/open/b/g$3;->f:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    const-string v0, "timeCost"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    const-string v0, "uin"

    const-string v1, "1000"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    new-instance v11, Lcom/tencent/open/b/b;

    invoke-direct {v11, v6}, Lcom/tencent/open/b/b;-><init>(Landroid/os/Bundle;)V

    .line 314
    iget-object v0, p0, Lcom/tencent/open/b/g$3;->h:Lcom/tencent/open/b/g;

    iget-object v0, v0, Lcom/tencent/open/b/g;->c:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    iget-object v0, p0, Lcom/tencent/open/b/g$3;->h:Lcom/tencent/open/b/g;

    iget-object v0, v0, Lcom/tencent/open/b/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v12

    .line 318
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/open/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/open/utils/OpenConfig;

    move-result-object v0

    const-string v1, "Agent_ReportTimeInterval"

    invoke-virtual {v0, v1}, Lcom/tencent/open/utils/OpenConfig;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 320
    if-nez v13, :cond_3

    const/16 v0, 0x2710

    goto :goto_2

    :cond_3
    move v0, v13

    :goto_2
    move v13, v0

    .line 324
    iget-object v0, p0, Lcom/tencent/open/b/g$3;->h:Lcom/tencent/open/b/g;

    const-string v1, "report_cgi"

    invoke-virtual {v0, v1, v12}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/tencent/open/b/g$3;->g:Z

    if-eqz v0, :cond_5

    .line 325
    :cond_4
    iget-object v0, p0, Lcom/tencent/open/b/g$3;->h:Lcom/tencent/open/b/g;

    invoke-virtual {v0}, Lcom/tencent/open/b/g;->b()V

    .line 326
    iget-object v0, p0, Lcom/tencent/open/b/g$3;->h:Lcom/tencent/open/b/g;

    iget-object v0, v0, Lcom/tencent/open/b/g;->f:Landroid/os/Handler;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_3

    .line 328
    :cond_5
    iget-object v0, p0, Lcom/tencent/open/b/g$3;->h:Lcom/tencent/open/b/g;

    iget-object v0, v0, Lcom/tencent/open/b/g;->f:Landroid/os/Handler;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_6

    .line 329
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v14

    .line 330
    const/16 v0, 0x3e8

    iput v0, v14, Landroid/os/Message;->what:I

    .line 331
    iget-object v0, p0, Lcom/tencent/open/b/g$3;->h:Lcom/tencent/open/b/g;

    iget-object v0, v0, Lcom/tencent/open/b/g;->f:Landroid/os/Handler;

    int-to-long v1, v13

    invoke-virtual {v0, v14, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    :cond_6
    :goto_3
    goto :goto_4

    .line 334
    :catch_0
    move-exception v4

    .line 335
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "--> reportCGI, exception in sub thread."

    invoke-static {v0, v1, v4}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 337
    :goto_4
    return-void
.end method
