.class Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$6;
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
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 752
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$6;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 757
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$6;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    const-class v1, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 758
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 759
    const-string v0, "bundleKeyUser"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$6;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 760
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 761
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$6;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 762
    return-void
.end method
