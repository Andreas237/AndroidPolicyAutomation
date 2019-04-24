.class Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V
    .locals 1

    .line 197
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 198
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$a;->b:Ljava/lang/ref/WeakReference;

    .line 199
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 203
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    .line 206
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    :cond_0
    return-void

    .line 209
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 211
    :sswitch_0
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CODE_CHECK_QRCODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 213
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CODE_CHECK_QRCODE msg.obj != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [J

    move-object v5, v0

    check-cast v5, [J

    .line 215
    invoke-static {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V

    .line 216
    invoke-static {v4, v5}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;[J)V

    .line 217
    goto/16 :goto_1

    .line 221
    :sswitch_1
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CODE_ALERAD_MEMBER"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V

    .line 223
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->finish()V

    .line 224
    goto/16 :goto_1

    .line 227
    :sswitch_2
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CODE_SHOW_PROGRESS_DIALOG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    invoke-static {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->d(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V

    .line 229
    goto/16 :goto_1

    .line 232
    :sswitch_3
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 233
    invoke-static {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V

    .line 234
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CHECK_QR_ERROR errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    const/16 v0, 0x3f0

    if-ne v5, v0, :cond_2

    .line 236
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_not_exist:I

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;I)V

    goto :goto_1

    .line 238
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0, v5}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;I)V

    .line 240
    goto :goto_1

    .line 243
    :sswitch_4
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CODE_GOTO_GROUP_CHAT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    goto :goto_1

    .line 251
    :sswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 252
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Long;

    .line 253
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v4, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;J)V

    .line 254
    goto :goto_1

    .line 258
    :sswitch_6
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CODE_GOTO_APPLY_JOIN_GROUP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 260
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CODE_GOTO_APPLY_JOIN_GROUP msg.obj != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Long;

    .line 262
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v4, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;J)V

    .line 263
    goto :goto_1

    .line 267
    :goto_0
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    :cond_3
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x74 -> :sswitch_3
        0x78 -> :sswitch_0
        0x79 -> :sswitch_1
        0x80 -> :sswitch_2
        0x81 -> :sswitch_4
        0x82 -> :sswitch_6
        0x90 -> :sswitch_5
    .end sparse-switch
.end method
