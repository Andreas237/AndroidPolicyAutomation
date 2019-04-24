.class Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$1;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 188
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$1;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 189
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "err_code "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 191
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 192
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 193
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$1;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 195
    goto :goto_0

    .line 196
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 197
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 198
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 199
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$1;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 200
    goto :goto_0

    .line 202
    :cond_1
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "err_code other"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 204
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 205
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$1;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 207
    :goto_0
    return-void
.end method
