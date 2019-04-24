.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 498
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$6;->a:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 502
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$6;->a:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->k(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    .line 503
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$6;->a:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 504
    return-void
.end method
