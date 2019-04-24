.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Lcom/huawei/health/sns/logic/chat/task/ChatMessage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 1482
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$4;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1486
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$4;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdu;->setVisibility(I)V

    .line 1489
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$4;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->F:Landroid/app/Instrumentation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1491
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$4;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    new-instance v1, Landroid/app/Instrumentation;

    invoke-direct {v1}, Landroid/app/Instrumentation;-><init>()V

    iput-object v1, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->F:Landroid/app/Instrumentation;

    .line 1493
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$4;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->F:Landroid/app/Instrumentation;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Instrumentation;->setInTouchMode(Z)V

    .line 1494
    return-void
.end method
