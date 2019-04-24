.class public Lo/bix;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Ljava/lang/Class<*>;Landroid/os/Bundle;)V"
        }
    .end annotation

    .line 79
    if-nez p2, :cond_0

    .line 81
    return-void

    .line 84
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 85
    invoke-virtual {v2, p1, p2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 87
    if-eqz p3, :cond_1

    .line 89
    invoke-virtual {v2, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 93
    :cond_1
    :try_start_0
    invoke-virtual {p1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 95
    :catch_0
    move-exception v3

    .line 97
    const-string v0, "ConversationDisplayClick"

    const-string v1, "jumpToPage IllegalstateException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    :goto_0
    return-void
.end method


# virtual methods
.method public e(Landroid/app/Activity;Landroid/view/View;)V
    .locals 8

    .line 38
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/axv;

    .line 39
    invoke-virtual {v2}, Lo/axv;->f()I

    move-result v3

    .line 40
    invoke-virtual {v2}, Lo/axv;->b()J

    move-result-wide v4

    .line 41
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 42
    const-string v0, "unreadMsgNumber"

    invoke-virtual {v2}, Lo/axv;->m()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 44
    const/4 v0, 0x1

    if-ne v0, v3, :cond_1

    .line 46
    invoke-virtual {v2}, Lo/axv;->n()I

    move-result v7

    .line 47
    const/4 v0, 0x1

    if-ne v7, v0, :cond_0

    .line 49
    const-string v0, "userId"

    invoke-virtual {v6, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 50
    const-class v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-direct {p0, p1, v0, v6}, Lo/bix;->a(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;)V

    goto :goto_0

    .line 54
    :cond_0
    const-string v0, "userId"

    invoke-virtual {v6, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 55
    const-class v0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-direct {p0, p1, v0, v6}, Lo/bix;->a(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 58
    :goto_0
    goto :goto_1

    .line 60
    :cond_1
    const/4 v0, 0x2

    if-ne v0, v3, :cond_2

    .line 62
    const-string v0, "groupId"

    invoke-virtual {v6, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 63
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-direct {p0, p1, v0, v6}, Lo/bix;->a(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;)V

    goto :goto_1

    .line 67
    :cond_2
    const-string v0, "ConversationDisplayClick"

    const-string v1, "jumpToPage:chatType is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    :goto_1
    return-void
.end method
