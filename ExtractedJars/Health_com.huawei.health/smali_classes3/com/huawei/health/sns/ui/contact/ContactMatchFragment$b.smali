.class Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;)V
    .locals 1

    .line 812
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 813
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$b;->d:Ljava/lang/ref/WeakReference;

    .line 814
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 819
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 820
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;

    .line 821
    if-nez v2, :cond_0

    .line 823
    return-void

    .line 827
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 828
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 830
    :cond_1
    return-void

    .line 833
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 837
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 838
    if-eqz v4, :cond_3

    .line 840
    const-string v0, "keyContactMatchList"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 841
    const-string v0, "keyContactQueryEventType"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 842
    invoke-static {v2, v5, v6}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;Ljava/util/ArrayList;I)V

    .line 843
    goto :goto_0

    .line 848
    :sswitch_1
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->d(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;Landroid/os/Message;)V

    .line 849
    goto :goto_0

    .line 854
    :sswitch_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;)V

    .line 855
    iget v4, p1, Landroid/os/Message;->arg2:I

    .line 856
    invoke-static {v2, v4}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;I)V

    .line 857
    const-string v0, "ContactMatchFragment"

    const-string v1, "Contact match login error"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 858
    goto :goto_0

    .line 862
    :sswitch_3
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->e(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;Landroid/os/Message;)V

    .line 863
    goto :goto_0

    .line 867
    :sswitch_4
    const/4 v0, 0x3

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->c(Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;I)V

    .line 868
    .line 873
    :cond_3
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_3
        0x13 -> :sswitch_2
        0x1011 -> :sswitch_4
    .end sparse-switch
.end method
