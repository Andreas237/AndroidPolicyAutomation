.class Lo/buj$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/buj$2;->b(Lcom/huawei/health/suggestion/model/OperationPage;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/model/OperationPage;

.field final synthetic b:Lo/buj$2;


# direct methods
.method constructor <init>(Lo/buj$2;Lcom/huawei/health/suggestion/model/OperationPage;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/buj$2$1;->b:Lo/buj$2;

    iput-object p2, p0, Lo/buj$2$1;->a:Lcom/huawei/health/suggestion/model/OperationPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 106
    const-string v0, "FitnessCourseBannerViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onclick operationPage.acquireUrl():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/buj$2$1;->a:Lcom/huawei/health/suggestion/model/OperationPage;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lo/buj$2$1;->a:Lcom/huawei/health/suggestion/model/OperationPage;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    return-void

    .line 110
    :cond_0
    invoke-static {}, Lo/bwv;->b()Lo/bwv;

    move-result-object v0

    iget-object v1, p0, Lo/buj$2$1;->a:Lcom/huawei/health/suggestion/model/OperationPage;

    invoke-virtual {v0, v1}, Lo/bwv;->e(Lcom/huawei/health/suggestion/model/OperationPage;)V

    .line 111
    return-void
.end method
