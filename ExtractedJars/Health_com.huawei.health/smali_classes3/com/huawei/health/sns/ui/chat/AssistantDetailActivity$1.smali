.class Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 868
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$1;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 872
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 874
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$1;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$1;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->h(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lo/emu;

    move-result-object v1

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;Z)V

    .line 876
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
