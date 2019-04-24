.class Lcom/huawei/health/sns/ui/user/MessageSettingActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/MessageSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/user/MessageSettingActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V
    .locals 1

    .line 223
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 224
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$e;->b:Ljava/lang/ref/WeakReference;

    .line 225
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 230
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 231
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;

    .line 232
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 234
    :cond_0
    return-void

    .line 236
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 240
    :pswitch_0
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->b(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V

    .line 241
    goto :goto_0

    .line 245
    :pswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->a(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V

    .line 246
    goto :goto_0

    .line 250
    :pswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->d(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V

    .line 251
    .line 256
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
