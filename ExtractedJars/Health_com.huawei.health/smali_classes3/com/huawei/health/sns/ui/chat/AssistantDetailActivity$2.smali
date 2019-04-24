.class Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->C()Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 1270
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$2;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1270
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$2;->b(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Void;
    .locals 5

    .line 1274
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$2;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->i(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/apg;->c(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v3

    .line 1275
    if-eqz v3, :cond_0

    .line 1277
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$2;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 1278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$2;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->m(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 1280
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
