.class Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V
    .locals 1

    .line 185
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 186
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$e;->b:Ljava/lang/ref/WeakReference;

    .line 187
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 192
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    .line 195
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 197
    :cond_0
    return-void

    .line 199
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 203
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 205
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [J

    move-object v3, v0

    check-cast v3, [J

    .line 206
    invoke-static {v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V

    .line 207
    invoke-static {v2, v3}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;[J)V

    .line 208
    goto :goto_0

    .line 213
    :pswitch_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V

    .line 214
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->finish()V

    .line 215
    goto :goto_0

    .line 219
    :pswitch_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V

    .line 220
    goto :goto_0

    .line 224
    :pswitch_3
    iget v3, p1, Landroid/os/Message;->arg1:I

    .line 225
    invoke-static {v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V

    .line 226
    const/16 v0, 0x3f0

    if-ne v3, v0, :cond_2

    .line 228
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_not_exist:I

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;I)V

    goto :goto_0

    .line 232
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0, v3}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;I)V

    .line 234
    goto :goto_0

    .line 238
    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 240
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/Long;

    .line 241
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;J)V

    .line 242
    goto :goto_0

    .line 247
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 249
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/Long;

    .line 250
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;J)V

    .line 251
    .line 257
    :cond_3
    :goto_0
    :pswitch_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x74
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_0
        :pswitch_1
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_2
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
