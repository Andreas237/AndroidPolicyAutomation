.class Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;)V
    .locals 0

    .line 814
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8$5;->b:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 818
    new-instance v0, Lo/arj;

    invoke-direct {v0}, Lo/arj;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8$5;->b:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;->d:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->i(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/arj;->e(JZ)V

    .line 819
    return-void
.end method

.method public d()V
    .locals 0

    .line 824
    return-void
.end method
