.class Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bft;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4$5;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 3

    .line 215
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4$5;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->setResult(ILandroid/content/Intent;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4$5;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;->d:Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->finish()V

    .line 217
    return-void
.end method
