.class Lo/dnt$8;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt;Landroid/os/Handler;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lo/dnt$8;->b:Lo/dnt;

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 4

    .line 256
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSync onFail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lo/dnt$8;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Lo/dnt$d;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 258
    iget-object v0, p0, Lo/dnt$8;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/dnt$d;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 259
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 4

    .line 263
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSync onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget-object v0, p0, Lo/dnt$8;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Lo/dnt$d;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 265
    iget-object v0, p0, Lo/dnt$8;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/dnt$d;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 266
    iget-object v0, p0, Lo/dnt$8;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->d(Lo/dnt;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    invoke-static {v0, v1}, Lo/dol;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 267
    return-void
.end method
