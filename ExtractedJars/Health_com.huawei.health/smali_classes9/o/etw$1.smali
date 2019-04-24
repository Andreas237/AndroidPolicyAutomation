.class Lo/etw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etw;->d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/etw;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/etw;Ljava/lang/String;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lo/etw$1;->a:Lo/etw;

    iput-object p2, p0, Lo/etw$1;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 169
    const-string v0, "FAQ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushMessageToDevice onResponse err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  msgID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/etw$1;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 172
    iget-object v0, p0, Lo/etw$1;->a:Lo/etw;

    invoke-static {v0}, Lo/etw;->c(Lo/etw;)Lo/eaa;

    move-result-object v0

    iget-object v1, p0, Lo/etw$1;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eaa;->c(Ljava/lang/String;)Z

    .line 176
    :cond_0
    iget-object v0, p0, Lo/etw$1;->a:Lo/etw;

    invoke-static {v0}, Lo/etw;->e(Lo/etw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 177
    iget-object v0, p0, Lo/etw$1;->a:Lo/etw;

    invoke-static {v0}, Lo/etw;->e(Lo/etw;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/etw$1;->a:Lo/etw;

    invoke-static {v1}, Lo/etw;->d(Lo/etw;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 178
    iget-object v0, p0, Lo/etw$1;->a:Lo/etw;

    invoke-static {v0}, Lo/etw;->e(Lo/etw;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/etw$1;->a:Lo/etw;

    invoke-static {v1}, Lo/etw;->d(Lo/etw;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 180
    :cond_1
    return-void
.end method
