.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 1

    .line 298
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 299
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$d;->b:Ljava/lang/ref/WeakReference;

    .line 300
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 304
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    .line 306
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 307
    return-void

    .line 309
    :cond_0
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter handleMessage():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 312
    :pswitch_0
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    .line 313
    goto/16 :goto_0

    .line 315
    :pswitch_1
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    .line 316
    goto/16 :goto_0

    .line 318
    :pswitch_2
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$d;->removeMessages(I)V

    .line 319
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    .line 320
    goto/16 :goto_0

    .line 322
    :pswitch_3
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$d;->removeMessages(I)V

    .line 323
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 324
    const/4 v0, 0x0

    invoke-static {v4, v0, v5}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;II)V

    .line 325
    goto :goto_0

    .line 327
    :pswitch_4
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    .line 328
    goto :goto_0

    .line 330
    :pswitch_5
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 331
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V

    .line 332
    goto :goto_0

    .line 334
    :pswitch_6
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V

    .line 335
    goto :goto_0

    .line 337
    :pswitch_7
    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$d;->removeMessages(I)V

    .line 338
    const/4 v0, 0x1

    const v1, 0xf462a

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;II)V

    .line 339
    goto :goto_0

    .line 341
    :pswitch_8
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v4, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;I)V

    .line 342
    goto :goto_0

    .line 344
    :pswitch_9
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    move-result-object v0

    const-string v1, "getDeviceList"

    invoke-virtual {v0, v1}, Lo/enw;->c(Ljava/lang/String;)V

    .line 345
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    move-result-object v0

    const-string v1, "unbindDevicesByTypes"

    invoke-virtual {v0, v1}, Lo/enw;->c(Ljava/lang/String;)V

    .line 346
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    move-result-object v0

    const-string v1, "getWearData"

    invoke-virtual {v0, v1}, Lo/enw;->c(Ljava/lang/String;)V

    .line 347
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V

    .line 348
    goto :goto_0

    .line 350
    :pswitch_a
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->h(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    .line 351
    goto :goto_0

    .line 353
    :pswitch_b
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->g(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    .line 354
    goto :goto_0

    .line 356
    :pswitch_c
    const/4 v0, 0x0

    const v1, 0xf4240

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;II)V

    .line 357
    .line 361
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method
