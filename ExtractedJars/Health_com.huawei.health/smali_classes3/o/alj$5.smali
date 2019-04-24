.class Lo/alj$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alj;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/alj;


# direct methods
.method constructor <init>(Lo/alj;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lo/alj$5;->c:Lo/alj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 228
    invoke-static {}, Lo/alj;->f()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 229
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHomeDialogMessage execute"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget-object v0, p0, Lo/alj$5;->c:Lo/alj;

    invoke-static {v0}, Lo/alj;->c(Lo/alj;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alj$5;->c:Lo/alj;

    invoke-static {v0}, Lo/alj;->c(Lo/alj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 232
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialogMessageList size > 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    monitor-exit v4

    return-void

    .line 236
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/alj$5;->c:Lo/alj;

    invoke-static {v0}, Lo/alj;->b(Lo/alj;)Lo/eaa;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 237
    monitor-exit v4

    return-void

    .line 240
    :cond_1
    :try_start_2
    iget-object v0, p0, Lo/alj$5;->c:Lo/alj;

    iget-object v1, p0, Lo/alj$5;->c:Lo/alj;

    invoke-static {v1}, Lo/alj;->b(Lo/alj;)Lo/eaa;

    move-result-object v1

    invoke-virtual {v1}, Lo/eaa;->g()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lo/alj;->c(Lo/alj;Ljava/util/List;)Ljava/util/List;

    .line 241
    iget-object v0, p0, Lo/alj$5;->c:Lo/alj;

    invoke-static {v0}, Lo/alj;->c(Lo/alj;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/alj$5;->c:Lo/alj;

    invoke-static {v0}, Lo/alj;->c(Lo/alj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 242
    :goto_0
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialogMessageList hasData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    iget-object v0, p0, Lo/alj$5;->c:Lo/alj;

    invoke-virtual {v0}, Lo/alj;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 244
    iget-object v0, p0, Lo/alj$5;->c:Lo/alj;

    invoke-virtual {v0}, Lo/alj;->c()V

    goto :goto_1

    .line 245
    :cond_3
    if-eqz v5, :cond_4

    .line 246
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialogMessageList dialogMessageList = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/alj$5;->c:Lo/alj;

    invoke-static {v2}, Lo/alj;->c(Lo/alj;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    iget-object v0, p0, Lo/alj$5;->c:Lo/alj;

    iget-object v1, p0, Lo/alj$5;->c:Lo/alj;

    invoke-static {v1}, Lo/alj;->c(Lo/alj;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-static {v0, v1}, Lo/alj;->b(Lo/alj;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 250
    :cond_4
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 251
    :goto_2
    return-void
.end method
