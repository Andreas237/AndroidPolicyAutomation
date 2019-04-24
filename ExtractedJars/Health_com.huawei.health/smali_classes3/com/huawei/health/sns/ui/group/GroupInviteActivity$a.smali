.class Lcom/huawei/health/sns/ui/group/GroupInviteActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/GroupInviteActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/GroupInviteActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 102
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$a;->a:Ljava/lang/ref/WeakReference;

    .line 103
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 108
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;

    .line 110
    if-nez v2, :cond_0

    .line 112
    return-void

    .line 114
    :cond_0
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->c(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V

    .line 116
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 120
    :sswitch_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->a(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;II)V

    .line 121
    goto :goto_0

    .line 125
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->b(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;I)V

    .line 126
    goto :goto_0

    .line 130
    :sswitch_2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 131
    const/4 v4, 0x0

    .line 132
    if-eqz v3, :cond_1

    .line 134
    const-string v0, "keyGroup"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/Group;

    .line 136
    :cond_1
    if-eqz v4, :cond_2

    .line 138
    invoke-static {v2, v4}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->d(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 144
    :sswitch_3
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->d(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V

    .line 145
    .line 150
    :cond_2
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xf1 -> :sswitch_2
        0xf2 -> :sswitch_1
        0xf5 -> :sswitch_3
        0xaaa -> :sswitch_0
    .end sparse-switch
.end method
