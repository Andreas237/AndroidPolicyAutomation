.class Lcom/huawei/health/sns/ui/group/GroupFragment$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/GroupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/GroupFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/GroupFragment;)V
    .locals 1

    .line 295
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 296
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$c;->b:Ljava/lang/ref/WeakReference;

    .line 297
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 302
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/group/GroupFragment;

    .line 304
    if-nez v1, :cond_0

    .line 306
    return-void

    .line 310
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 311
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 313
    :cond_1
    return-void

    .line 316
    :cond_2
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->c(Lcom/huawei/health/sns/ui/group/GroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 319
    return-void

    .line 322
    :cond_3
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(Lcom/huawei/health/sns/ui/group/GroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 325
    return-void

    .line 328
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 332
    :sswitch_0
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->c(Lcom/huawei/health/sns/ui/group/GroupFragment;I)V

    .line 333
    goto :goto_0

    .line 339
    :sswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->b(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 340
    goto :goto_0

    .line 344
    :sswitch_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_dissolution_notify:I

    invoke-virtual {v2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 345
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->e(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 346
    goto :goto_0

    .line 350
    :sswitch_3
    sget v0, Lcom/huawei/android/sns/R$string;->sns_removed_by_manager:I

    invoke-virtual {v2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 351
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->e(Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 352
    goto :goto_0

    .line 356
    :sswitch_4
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->a(Lcom/huawei/health/sns/ui/group/GroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/GroupFragment;)V

    .line 357
    goto :goto_0

    .line 361
    :sswitch_5
    const/16 v0, 0x353

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->e(Lcom/huawei/health/sns/ui/group/GroupFragment;I)V

    .line 362
    .line 367
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_5
        0x91 -> :sswitch_1
        0xc1 -> :sswitch_0
        0x375 -> :sswitch_2
        0x376 -> :sswitch_3
        0x377 -> :sswitch_4
        0x1011 -> :sswitch_1
    .end sparse-switch
.end method
