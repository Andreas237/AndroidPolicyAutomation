.class Lcom/huawei/hwid/update/d/i$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/update/d/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/update/d/i;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/update/d/i;Landroid/os/Looper;)V
    .locals 0

    .line 387
    iput-object p1, p0, Lcom/huawei/hwid/update/d/i$1;->a:Lcom/huawei/hwid/update/d/i;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 389
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 390
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/os/Bundle;

    .line 391
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 393
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i$1;->a:Lcom/huawei/hwid/update/d/i;

    invoke-static {v0, v1}, Lcom/huawei/hwid/update/d/i;->a(Lcom/huawei/hwid/update/d/i;Landroid/os/Bundle;)V

    .line 394
    goto :goto_0

    .line 397
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i$1;->a:Lcom/huawei/hwid/update/d/i;

    invoke-static {v0, v1}, Lcom/huawei/hwid/update/d/i;->b(Lcom/huawei/hwid/update/d/i;Landroid/os/Bundle;)V

    .line 398
    goto :goto_0

    .line 401
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i$1;->a:Lcom/huawei/hwid/update/d/i;

    invoke-static {v0, v1}, Lcom/huawei/hwid/update/d/i;->c(Lcom/huawei/hwid/update/d/i;Landroid/os/Bundle;)V

    .line 402
    .line 407
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
