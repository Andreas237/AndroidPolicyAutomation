.class Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->A()V
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
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 1199
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$3;->e:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1199
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$3;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 1203
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$3;->e:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1206
    invoke-static {}, Lo/aqp;->c()Lo/aqp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$3;->e:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v1

    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/aqp;->d(Lcom/huawei/health/sns/model/chat/Assistant;Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    goto :goto_0

    .line 1210
    :cond_0
    const-string v0, "AssistantDetailActivity"

    const-string v1, "insert default welcome message error, assistant is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1212
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$3;->e:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Z)V

    .line 1213
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
