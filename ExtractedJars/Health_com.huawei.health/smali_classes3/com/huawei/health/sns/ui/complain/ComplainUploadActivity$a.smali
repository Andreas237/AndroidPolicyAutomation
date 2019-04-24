.class Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V
    .locals 1

    .line 212
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 213
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$a;->d:Ljava/lang/ref/WeakReference;

    .line 214
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 219
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    .line 221
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    :cond_0
    return-void

    .line 225
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 229
    :pswitch_0
    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->e(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V

    .line 230
    goto :goto_0

    .line 234
    :pswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->b(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V

    .line 235
    goto :goto_0

    .line 239
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;I)V

    .line 240
    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V

    .line 241
    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V

    .line 242
    .line 249
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
