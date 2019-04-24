.class Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Ljava/lang/String;Landroid/os/Handler;)V
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
.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Landroid/os/Handler;

.field final synthetic e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 0

    .line 408
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;->d:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 408
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 412
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->f(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lo/apm;->a(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v4

    .line 413
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;->d:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 414
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
