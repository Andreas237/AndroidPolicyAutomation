.class Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V
    .locals 1

    .line 341
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 342
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$e;->b:Ljava/lang/ref/WeakReference;

    .line 343
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 347
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    .line 349
    if-nez v4, :cond_0

    .line 350
    return-void

    .line 352
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 356
    :sswitch_0
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    .line 357
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    .line 358
    iget v0, p1, Landroid/os/Message;->what:I

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-static {v4, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;III)V

    .line 360
    goto/16 :goto_0

    .line 362
    :sswitch_1
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    .line 363
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    .line 364
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/Object;)V

    .line 365
    if-eqz v5, :cond_1

    .line 366
    const-string v0, "group_image_url"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 367
    const-string v0, "group_download_image_url"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 368
    invoke-static {v4, v6, v7}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    :cond_1
    goto/16 :goto_0

    .line 374
    :sswitch_2
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_operate_failed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 376
    goto/16 :goto_0

    .line 379
    :sswitch_3
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_photo_save_to:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 380
    const/4 v0, 0x0

    invoke-static {v4, v5, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 382
    goto :goto_0

    .line 384
    :sswitch_4
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    .line 385
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 386
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    .line 387
    const-string v0, "posterFilePath"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 388
    invoke-static {v4, v7}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/Object;)V

    .line 389
    const-string v0, "fileTag"

    const-string v1, "posterFileTag"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 399
    const-string v0, "imagePath"

    const-string v1, "posterFilePath"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 400
    const/4 v0, -0x1

    invoke-virtual {v4, v0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->setResult(ILandroid/content/Intent;)V

    .line 401
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->finish()V

    .line 403
    goto :goto_0

    .line 405
    :sswitch_5
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    .line 407
    goto :goto_0

    .line 409
    :sswitch_6
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;I)V

    .line 411
    .line 415
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_2
        0x1a1 -> :sswitch_0
        0x1a2 -> :sswitch_0
        0x1a5 -> :sswitch_1
        0x1a6 -> :sswitch_4
        0x1a7 -> :sswitch_5
        0x1a8 -> :sswitch_6
        0xaaa -> :sswitch_0
    .end sparse-switch
.end method
