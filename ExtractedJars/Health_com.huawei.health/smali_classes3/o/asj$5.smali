.class Lo/asj$5;
.super Lo/asj$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asj;->k()Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/asj;


# direct methods
.method constructor <init>(Lo/asj;)V
    .locals 1

    .line 240
    iput-object p1, p0, Lo/asj$5;->b:Lo/asj;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/asj$e;-><init>(Lo/asj;Lo/asj$2;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 6

    .line 244
    iget-object v0, p0, Lo/asj$5;->b:Lo/asj;

    invoke-static {v0}, Lo/asj;->a(Lo/asj;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 246
    const-string v0, "ContactsSync"

    const-string v1, "Is Photo Syncing......"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    return-void

    .line 249
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 250
    invoke-static {}, Lo/asg;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 254
    :try_start_0
    iget-object v0, p0, Lo/asj$5;->b:Lo/asj;

    invoke-static {v0}, Lo/asj;->c(Lo/asj;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/asj$5;->b:Lo/asj;

    invoke-static {v1}, Lo/asj;->d(Lo/asj;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/asg;->c(Landroid/content/Context;Ljava/util/List;Z)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 259
    goto :goto_0

    .line 256
    :catch_0
    move-exception v5

    .line 258
    const-string v0, "ContactsSync"

    const-string v1, "runSync IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    :goto_0
    invoke-static {}, Lo/asg;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 263
    iget-object v0, p0, Lo/asj$5;->b:Lo/asj;

    invoke-static {v0}, Lo/asj;->c(Lo/asj;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/asi;->a(Landroid/content/Context;)Lo/asi;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lo/asi;->e(J)V

    .line 264
    const-string v0, "ContactsSync"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncPhoto end, sync time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 269
    :cond_1
    const-string v0, "ContactsSync"

    const-string v1, "newFullSyncPhotoRunnable(), ContactPhotoManager.isCancel() is true"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    :cond_2
    :goto_1
    iget-object v0, p0, Lo/asj$5;->b:Lo/asj;

    invoke-static {v0}, Lo/asj;->a(Lo/asj;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 272
    return-void
.end method
