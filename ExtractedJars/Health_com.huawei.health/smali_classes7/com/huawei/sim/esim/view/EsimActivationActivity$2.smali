.class Lcom/huawei/sim/esim/view/EsimActivationActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/EsimActivationActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/sim/esim/view/EsimActivationActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$2;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 228
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$2;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b(Lcom/huawei/sim/esim/view/EsimActivationActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 229
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 230
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "err_code DEVICE_CONNECTING"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 232
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 233
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$2;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b(Lcom/huawei/sim/esim/view/EsimActivationActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 234
    goto :goto_0

    .line 235
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 236
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "err_code DEVICE_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 238
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 239
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$2;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b(Lcom/huawei/sim/esim/view/EsimActivationActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 240
    goto :goto_0

    .line 242
    :cond_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 243
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 244
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$2;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b(Lcom/huawei/sim/esim/view/EsimActivationActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 246
    :goto_0
    return-void
.end method
