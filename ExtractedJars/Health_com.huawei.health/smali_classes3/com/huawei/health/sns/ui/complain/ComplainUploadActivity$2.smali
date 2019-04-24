.class Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bft;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V
    .locals 0

    .line 736
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;->b:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 3

    .line 741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;->b:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->setResult(ILandroid/content/Intent;)V

    .line 742
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;->b:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->finish()V

    .line 743
    return-void
.end method
