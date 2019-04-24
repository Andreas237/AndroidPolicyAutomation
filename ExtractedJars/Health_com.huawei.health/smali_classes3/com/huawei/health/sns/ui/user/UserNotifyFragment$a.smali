.class Lcom/huawei/health/sns/ui/user/UserNotifyFragment$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/UserNotifyFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/user/UserNotifyFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V
    .locals 1

    .line 169
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 170
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$a;->d:Ljava/lang/ref/WeakReference;

    .line 171
    return-void
.end method

.method private e(Landroid/os/Message;Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)Z
    .locals 4

    .line 233
    const/4 v3, 0x0

    .line 234
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 240
    :sswitch_0
    invoke-static {p2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->e(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    .line 241
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 242
    const/4 v3, 0x1

    .line 243
    goto :goto_0

    .line 247
    :sswitch_1
    invoke-static {p2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->e(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    .line 248
    const/4 v3, 0x1

    .line 249
    const-string v0, "UserNotifyFragment"

    const-string v1, "UserManager.MSG_FRIEND_LIST_UPDATE"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    goto :goto_0

    .line 254
    :sswitch_2
    invoke-static {p2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    .line 255
    const/4 v3, 0x1

    .line 256
    const-string v0, "UserNotifyFragment"

    const-string v1, "MSG_DELETE_USER_NOTIFY"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    goto :goto_0

    .line 261
    :sswitch_3
    invoke-static {p2, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->d(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Message;)V

    .line 262
    const/4 v3, 0x1

    .line 263
    goto :goto_0

    .line 267
    :sswitch_4
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {p2, v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->c(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;I)V

    .line 268
    const/4 v3, 0x1

    .line 269
    goto :goto_0

    .line 273
    :sswitch_5
    invoke-static {p2, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Message;)V

    .line 274
    const/4 v3, 0x1

    .line 275
    goto :goto_0

    .line 279
    :sswitch_6
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_more_req:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 280
    invoke-static {p2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->e(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    .line 281
    const/4 v3, 0x1

    .line 282
    .line 287
    :goto_0
    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x251 -> :sswitch_3
        0x253 -> :sswitch_2
        0x302 -> :sswitch_4
        0x303 -> :sswitch_0
        0x304 -> :sswitch_0
        0x305 -> :sswitch_5
        0x306 -> :sswitch_6
        0x6012 -> :sswitch_0
        0x6013 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 176
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    .line 178
    if-nez v1, :cond_0

    .line 180
    return-void

    .line 184
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 185
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 187
    :cond_1
    return-void

    .line 190
    :cond_2
    invoke-direct {p0, p1, v1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$a;->e(Landroid/os/Message;Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 193
    return-void

    .line 196
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 200
    :sswitch_0
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->c(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Message;)V

    .line 201
    goto :goto_0

    .line 207
    :sswitch_1
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;I)V

    .line 208
    goto :goto_0

    .line 212
    :sswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->e(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    .line 213
    goto :goto_0

    .line 217
    :sswitch_3
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->c(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V

    .line 218
    .line 223
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x252 -> :sswitch_1
        0x254 -> :sswitch_2
        0x255 -> :sswitch_3
        0x301 -> :sswitch_0
        0x1011 -> :sswitch_1
        0x1021 -> :sswitch_1
    .end sparse-switch
.end method
