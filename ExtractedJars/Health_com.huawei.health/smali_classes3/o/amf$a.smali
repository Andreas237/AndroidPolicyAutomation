.class Lo/amf$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lo/amf;

.field private d:Lo/amf$c;

.field private e:Lo/amf$e;


# direct methods
.method public constructor <init>(Lo/amf;Lo/amf$c;Lo/amf$e;)V
    .locals 1

    .line 214
    iput-object p1, p0, Lo/amf$a;->b:Lo/amf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amf$a;->e:Lo/amf$e;

    .line 212
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amf$a;->d:Lo/amf$c;

    .line 215
    iput-object p2, p0, Lo/amf$a;->d:Lo/amf$c;

    .line 216
    iput-object p3, p0, Lo/amf$a;->e:Lo/amf$e;

    .line 217
    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 11

    .line 221
    const-string v0, "Step_FlushableStepDataCache"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InsertCallBack() onSuccess  type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " data="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    if-eqz p2, :cond_5

    .line 223
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 224
    if-nez p1, :cond_3

    .line 226
    iget-object v5, p0, Lo/amf$a;->b:Lo/amf;

    monitor-enter v5

    .line 227
    :try_start_0
    iget-object v0, p0, Lo/amf$a;->d:Lo/amf$c;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/amf$c;->b:Z

    .line 228
    iget-object v0, p0, Lo/amf$a;->b:Lo/amf;

    invoke-static {v0}, Lo/amf;->b(Lo/amf;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 229
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/amf$c;

    .line 231
    iget-boolean v0, v7, Lo/amf$c;->b:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 232
    iget-object v0, p0, Lo/amf$a;->b:Lo/amf;

    iget v1, v7, Lo/amf$c;->d:I

    invoke-static {v0, v1}, Lo/amf;->e(Lo/amf;I)I

    .line 233
    const-string v0, "Step_FlushableStepDataCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InsertEvent success begin:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/amf$a;->d:Lo/amf$c;

    iget v3, v3, Lo/amf$c;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " end:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/amf$a;->d:Lo/amf$c;

    iget v3, v3, Lo/amf$c;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    iget-object v0, p0, Lo/amf$a;->b:Lo/amf;

    invoke-static {v0}, Lo/amf;->d(Lo/amf;)Landroid/content/Context;

    move-result-object v0

    iget v1, v7, Lo/amf$c;->d:I

    invoke-static {v0, v1}, Lo/amy;->a(Landroid/content/Context;I)V

    .line 235
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    .line 239
    goto :goto_0

    .line 241
    :cond_0
    const/4 v7, 0x0

    .line 243
    iget-object v0, p0, Lo/amf$a;->b:Lo/amf;

    invoke-static {v0}, Lo/amf;->b(Lo/amf;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 244
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 245
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/amf$c;

    .line 246
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, v9, Lo/amf$c;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 247
    const/4 v7, 0x1

    .line 251
    :cond_1
    if-eqz v7, :cond_2

    .line 252
    iget-object v0, p0, Lo/amf$a;->b:Lo/amf;

    invoke-static {v0}, Lo/amf;->b(Lo/amf;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    :cond_2
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v10

    monitor-exit v5

    throw v10

    .line 256
    :goto_1
    iget-object v0, p0, Lo/amf$a;->e:Lo/amf$e;

    if-eqz v0, :cond_4

    .line 257
    iget-object v0, p0, Lo/amf$a;->e:Lo/amf$e;

    invoke-interface {v0}, Lo/amf$e;->e()V

    goto :goto_2

    .line 261
    :cond_3
    const-string v0, "Step_FlushableStepDataCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert failed error="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    const-string v0, "result"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 263
    iget-object v0, p0, Lo/amf$a;->e:Lo/amf$e;

    if-eqz v0, :cond_4

    .line 264
    iget-object v0, p0, Lo/amf$a;->e:Lo/amf$e;

    invoke-interface {v0}, Lo/amf$e;->a()V

    .line 267
    :cond_4
    :goto_2
    goto :goto_3

    .line 268
    :cond_5
    const-string v0, "Step_FlushableStepDataCache"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InsertCallBack data="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, "cb="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/amf$a;->e:Lo/amf$e;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mFlushCallback no to callback"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    :goto_3
    return-void
.end method
