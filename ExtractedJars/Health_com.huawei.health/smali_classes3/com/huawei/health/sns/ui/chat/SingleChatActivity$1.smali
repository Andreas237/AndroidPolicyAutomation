.class Lcom/huawei/health/sns/ui/chat/SingleChatActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V
    .locals 0

    .line 461
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$1;->b:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 464
    if-eqz p2, :cond_1

    .line 465
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 466
    const-string v0, "com.huawei.android.sns.friend.cancel.account"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 467
    const-string v0, "SingleChatActivity"

    const-string v1, "Single chat receiver cancel account broadcast"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 470
    if-eqz v4, :cond_0

    const-string v0, "cancelAccountBundleKey"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 471
    const-string v0, "cancelAccountBundleKey"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 472
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 473
    const-string v0, "|"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$1;->b:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    iget-wide v1, v1, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 474
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    .line 475
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 476
    const-string v0, "SingleChatActivity"

    const-string v1, "Single chat receiver cancel account broadcast, goBackToHomeActivity!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$1;->b:Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->y()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 482
    :cond_0
    goto :goto_0

    .line 480
    :catch_0
    move-exception v4

    .line 481
    const-string v0, "SingleChatActivity"

    const-string v1, "single chat receiver broadcast error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    :cond_1
    :goto_0
    return-void
.end method
