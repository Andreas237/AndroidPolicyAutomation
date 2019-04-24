.class Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V
    .locals 1

    .line 128
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 129
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$e;->a:Ljava/lang/ref/WeakReference;

    .line 130
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 134
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;

    .line 136
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    :cond_0
    return-void

    .line 142
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 144
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 145
    if-eqz v3, :cond_3

    .line 146
    const/4 v4, 0x0

    .line 147
    const-string v0, "bundleKeyGroupName"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 148
    const-string v0, "bundleKeyGrpMbNumber"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 149
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 150
    const/4 v7, 0x0

    .line 151
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 152
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/Group;

    .line 154
    :cond_2
    invoke-static {v2, v5, v6, v4, v7}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->a(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;Ljava/lang/String;ILjava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;)V

    .line 156
    :cond_3
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    .line 157
    goto :goto_1

    .line 160
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->c(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;II)V

    .line 161
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    .line 162
    goto :goto_1

    .line 165
    :sswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->a(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;II)V

    .line 166
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    .line 167
    goto :goto_1

    .line 171
    :sswitch_3
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->e(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    .line 173
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->b(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;J)V

    .line 174
    goto :goto_1

    .line 177
    :sswitch_4
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;II)V

    .line 178
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    .line 179
    goto :goto_1

    .line 182
    :sswitch_5
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->c(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    .line 183
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    .line 184
    goto :goto_1

    .line 187
    :goto_0
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V

    .line 191
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0xc0 -> :sswitch_1
        0xc5 -> :sswitch_4
        0x103 -> :sswitch_0
        0x104 -> :sswitch_3
        0x608 -> :sswitch_5
        0xaaa -> :sswitch_2
    .end sparse-switch
.end method
