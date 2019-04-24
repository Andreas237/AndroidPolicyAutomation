.class Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;)V
    .locals 1

    .line 91
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 92
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$a;->a:Ljava/lang/ref/WeakReference;

    .line 93
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 98
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;

    .line 101
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    :cond_0
    return-void

    .line 106
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 108
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget v1, p1, Landroid/os/Message;->arg2:I

    if-lez v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->c(Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;ZZ)V

    .line 110
    :cond_4
    return-void
.end method
