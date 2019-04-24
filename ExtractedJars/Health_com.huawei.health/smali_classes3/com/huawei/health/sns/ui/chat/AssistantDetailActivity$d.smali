.class Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 1

    .line 939
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 940
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;->d:Ljava/lang/ref/WeakReference;

    .line 941
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 946
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 947
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    .line 948
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 950
    :cond_0
    return-void

    .line 952
    :cond_1
    invoke-static {v3, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Landroid/os/Message;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v3, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 955
    :cond_2
    return-void

    .line 957
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 961
    :sswitch_0
    invoke-static {v3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    .line 962
    goto :goto_0

    .line 967
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/chat/Assistant;

    .line 968
    invoke-static {v3, v4}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Lcom/huawei/health/sns/model/chat/Assistant;)V

    .line 969
    invoke-static {v3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->k(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    .line 970
    goto :goto_0

    .line 977
    :sswitch_2
    iget v0, p1, Landroid/os/Message;->what:I

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-static {v3, v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->a(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;III)V

    .line 978
    goto :goto_0

    .line 983
    :sswitch_3
    invoke-static {v3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->g(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    .line 984
    goto :goto_0

    .line 988
    :sswitch_4
    invoke-static {v3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->l(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    .line 989
    goto :goto_0

    .line 993
    :sswitch_5
    invoke-static {v3, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->a(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Landroid/os/Message;)V

    .line 994
    .line 999
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x3 -> :sswitch_0
        0xad01 -> :sswitch_2
        0xad02 -> :sswitch_2
        0xad03 -> :sswitch_3
        0xad04 -> :sswitch_2
        0xad05 -> :sswitch_2
        0xad06 -> :sswitch_4
        0xad07 -> :sswitch_5
    .end sparse-switch
.end method
