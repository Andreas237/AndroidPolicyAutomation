.class Lo/dnw$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dnw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnw;


# direct methods
.method constructor <init>(Lo/dnw;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lo/dnw$1;->a:Lo/dnw;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 162
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 163
    if-nez v4, :cond_0

    .line 164
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive hiHealthCloudSyncReceiver action is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    return-void

    .line 167
    :cond_0
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onReceive hiHealthCloudSyncReceiver:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const-string v0, "com.huawei.hihealth.action_sync_data"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 171
    return-void

    .line 174
    :cond_1
    new-instance v5, Lo/dnw$1$5;

    iget-object v0, p0, Lo/dnw$1;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->d(Lo/dnw;)Lo/dnw$d;

    move-result-object v0

    invoke-direct {v5, p0, v0}, Lo/dnw$1$5;-><init>(Lo/dnw$1;Landroid/os/Handler;)V

    .line 188
    new-instance v0, Lo/dnw$1$2;

    invoke-direct {v0, p0, v5}, Lo/dnw$1$2;-><init>(Lo/dnw$1;Lo/doi;)V

    invoke-virtual {v5, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 216
    new-instance v0, Lo/dnw$1$4;

    invoke-direct {v0, p0, v5}, Lo/dnw$1$4;-><init>(Lo/dnw$1;Lo/doi;)V

    invoke-virtual {v5, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 239
    invoke-virtual {v5}, Lo/doi;->b()V

    .line 240
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 152
    iget-object v0, p0, Lo/dnw$1;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->d(Lo/dnw;)Lo/dnw$d;

    move-result-object v0

    new-instance v1, Lo/dnw$1$3;

    invoke-direct {v1, p0, p1, p2}, Lo/dnw$1$3;-><init>(Lo/dnw$1;Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lo/dnw$d;->post(Ljava/lang/Runnable;)Z

    .line 159
    return-void
.end method
