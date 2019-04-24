.class Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 840
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$13;->b:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 844
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$13;->b:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$13;->b:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lo/emu;

    move-result-object v1

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$13;->b:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->a(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lo/emu;

    move-result-object v2

    invoke-virtual {v2}, Lo/emu;->isChecked()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;ZZ)V

    .line 845
    return-void
.end method
