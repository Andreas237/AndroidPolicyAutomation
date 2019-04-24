.class Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V
    .locals 0

    .line 313
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 313
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 317
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;Lcom/huawei/health/sns/model/user/User;)Lcom/huawei/health/sns/model/user/User;

    .line 321
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->d(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->d(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 322
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
