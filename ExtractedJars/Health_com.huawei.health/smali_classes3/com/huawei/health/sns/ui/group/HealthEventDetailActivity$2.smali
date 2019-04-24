.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->d(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 461
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$2;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 464
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$2;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    .line 465
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$2;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 466
    return-void
.end method
