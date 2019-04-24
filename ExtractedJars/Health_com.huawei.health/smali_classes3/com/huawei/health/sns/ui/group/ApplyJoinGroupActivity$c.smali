.class Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;)V
    .locals 1

    .line 116
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 117
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 118
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 123
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;

    .line 125
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    :cond_0
    return-void

    .line 130
    :cond_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->c(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;)V

    .line 132
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 136
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 137
    if-eqz v3, :cond_2

    .line 139
    const/4 v4, 0x0

    .line 140
    const-string v0, "bundleKeyGroupName"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 141
    const-string v0, "bundleKeyGrpMbNumber"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 142
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 143
    invoke-static {v2, v5, v6, v4}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->a(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 144
    goto :goto_0

    .line 149
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->d(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;II)V

    .line 150
    goto :goto_0

    .line 154
    :sswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->b(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;II)V

    .line 155
    goto :goto_0

    .line 159
    :sswitch_3
    sget v0, Lcom/huawei/android/sns/R$string;->sns_join_group_chat_success:I

    invoke-static {v2, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 160
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->a(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;)V

    .line 161
    goto :goto_0

    .line 165
    :sswitch_4
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;->a(Lcom/huawei/health/sns/ui/group/ApplyJoinGroupActivity;II)V

    .line 166
    .line 172
    :cond_2
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xc0 -> :sswitch_1
        0xc5 -> :sswitch_4
        0x103 -> :sswitch_0
        0x104 -> :sswitch_3
        0xaaa -> :sswitch_2
    .end sparse-switch
.end method
