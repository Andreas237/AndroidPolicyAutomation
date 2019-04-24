.class Lcom/huawei/health/sns/ui/group/GroupActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/GroupActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/GroupActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/GroupActivity;)V
    .locals 1

    .line 184
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 185
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity$b;->c:Ljava/lang/ref/WeakReference;

    .line 186
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 191
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/group/GroupActivity;

    .line 193
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    :cond_0
    return-void

    .line 197
    :cond_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->d(Lcom/huawei/health/sns/ui/group/GroupActivity;)V

    .line 199
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 203
    :sswitch_0
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->b(Lcom/huawei/health/sns/ui/group/GroupActivity;)V

    .line 204
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->e(Lcom/huawei/health/sns/ui/group/GroupActivity;)V

    .line 205
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->a(Lcom/huawei/health/sns/ui/group/GroupActivity;)V

    .line 206
    goto :goto_0

    .line 211
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->e(Lcom/huawei/health/sns/ui/group/GroupActivity;II)V

    .line 212
    goto :goto_0

    .line 216
    :sswitch_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupActivity;->c(Lcom/huawei/health/sns/ui/group/GroupActivity;)V

    .line 217
    .line 222
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x98 -> :sswitch_2
        0xb1 -> :sswitch_0
        0xb2 -> :sswitch_1
        0xaaa -> :sswitch_1
    .end sparse-switch
.end method
