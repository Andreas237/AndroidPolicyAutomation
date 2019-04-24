.class Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)V
    .locals 1

    .line 231
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 232
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$b;->c:Ljava/lang/ref/WeakReference;

    .line 233
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 238
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;

    .line 240
    if-nez v4, :cond_0

    .line 242
    return-void

    .line 244
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 250
    :sswitch_0
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->a(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)V

    .line 251
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->c(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)V

    .line 252
    iget v0, p1, Landroid/os/Message;->what:I

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-static {v4, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->b(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;III)V

    .line 253
    goto :goto_0

    .line 257
    :sswitch_1
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->c(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)V

    .line 258
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    .line 259
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->a(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;Ljava/lang/Object;)V

    .line 260
    if-eqz v5, :cond_1

    .line 262
    const-string v0, "group_image_url"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 263
    const-string v0, "group_download_image_url"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 264
    invoke-static {v4, v6, v7}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->b(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    goto :goto_0

    .line 270
    :sswitch_2
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_operate_failed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 271
    goto :goto_0

    .line 275
    :sswitch_3
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

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

    .line 276
    const/4 v0, 0x0

    invoke-static {v4, v5, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 277
    .line 282
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_2
        0x1a1 -> :sswitch_0
        0x1a2 -> :sswitch_0
        0x1a5 -> :sswitch_1
        0xaaa -> :sswitch_0
    .end sparse-switch
.end method
