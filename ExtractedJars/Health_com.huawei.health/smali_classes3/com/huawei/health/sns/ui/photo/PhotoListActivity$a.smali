.class Lcom/huawei/health/sns/ui/photo/PhotoListActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/photo/PhotoListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/photo/PhotoListActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)V
    .locals 1

    .line 106
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 107
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$a;->c:Ljava/lang/ref/WeakReference;

    .line 108
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 113
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 114
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    .line 115
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 117
    :cond_0
    return-void

    .line 119
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 123
    :sswitch_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_operate_failed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 124
    goto :goto_0

    .line 128
    :sswitch_1
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->getResources()Landroid/content/res/Resources;

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

    .line 129
    const/4 v0, 0x0

    invoke-static {v4, v5, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 130
    .line 135
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
