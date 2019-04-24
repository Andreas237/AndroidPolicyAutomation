.class Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V
    .locals 1

    .line 132
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 133
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$a;->a:Ljava/lang/ref/WeakReference;

    .line 134
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 138
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    .line 140
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 141
    :cond_0
    return-void

    .line 143
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 145
    :sswitch_0
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Landroid/os/Message;)V

    .line 146
    goto :goto_0

    .line 148
    :sswitch_1
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Landroid/os/Message;)V

    .line 149
    goto :goto_0

    .line 151
    :sswitch_2
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Landroid/os/Message;)V

    .line 152
    goto :goto_0

    .line 155
    :sswitch_3
    goto :goto_0

    .line 158
    :sswitch_4
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    .line 159
    goto :goto_0

    .line 161
    :sswitch_5
    const/16 v0, 0x353

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;I)V

    .line 162
    goto :goto_0

    .line 165
    :sswitch_6
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    .line 166
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->finish()V

    .line 167
    goto :goto_0

    .line 171
    :sswitch_7
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    .line 172
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    .line 173
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->finish()V

    .line 174
    goto :goto_0

    .line 177
    :sswitch_8
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V

    .line 178
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;I)V

    .line 179
    .line 185
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_5
        0x91 -> :sswitch_4
        0xd1 -> :sswitch_7
        0xd2 -> :sswitch_8
        0x144 -> :sswitch_6
        0x343 -> :sswitch_2
        0x348 -> :sswitch_0
        0x349 -> :sswitch_1
        0x351 -> :sswitch_3
    .end sparse-switch
.end method
