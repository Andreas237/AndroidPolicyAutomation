.class Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V
    .locals 1

    .line 125
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 126
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$a;->c:Ljava/lang/ref/WeakReference;

    .line 127
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 132
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 134
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;

    .line 135
    if-nez v1, :cond_0

    .line 137
    return-void

    .line 139
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 143
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 144
    const/4 v3, 0x0

    .line 145
    if-eqz v2, :cond_1

    .line 147
    const-string v0, "bundleKeyFriendList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 148
    invoke-static {v1, v3}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 154
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;Ljava/lang/Object;)V

    .line 155
    goto :goto_0

    .line 159
    :sswitch_2
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->a(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;Landroid/os/Message;)V

    .line 160
    goto :goto_0

    .line 164
    :sswitch_3
    invoke-static {v1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->a(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V

    .line 165
    invoke-static {v1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->b(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V

    .line 166
    goto :goto_0

    .line 170
    :sswitch_4
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;Landroid/os/Message;)V

    .line 171
    .line 176
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x3 -> :sswitch_4
        0x13 -> :sswitch_3
        0x110 -> :sswitch_0
        0x111 -> :sswitch_1
    .end sparse-switch
.end method
