.class Lo/akv$8;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akv;->c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/akv;


# direct methods
.method constructor <init>(Lo/akv;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lo/akv$8;->c:Lo/akv;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 227
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator receive broadcastReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    if-eqz p2, :cond_1

    .line 231
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 233
    if-nez v4, :cond_0

    .line 234
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator action is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    return-void

    .line 238
    :cond_0
    iget-object v0, p0, Lo/akv$8;->c:Lo/akv;

    invoke-static {v0, v4}, Lo/akv;->a(Lo/akv;Ljava/lang/String;)V

    .line 239
    iget-object v0, p0, Lo/akv$8;->c:Lo/akv;

    invoke-static {v0, p2}, Lo/akv;->a(Lo/akv;Landroid/content/Intent;)V

    .line 240
    iget-object v0, p0, Lo/akv$8;->c:Lo/akv;

    invoke-static {v0, v4}, Lo/akv;->e(Lo/akv;Ljava/lang/String;)V

    .line 242
    :cond_1
    return-void
.end method
