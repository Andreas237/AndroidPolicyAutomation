.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ely;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/View;

.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/view/View;)V
    .locals 0

    .line 2277
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lo/elz;IIII)V
    .locals 2

    .line 2280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2281
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Z)Z

    .line 2282
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->b:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->z(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/view/View;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2283
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/view/View;)V

    goto :goto_0

    .line 2284
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->b:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->A(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/view/View;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 2285
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->B(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/view/View;)V

    .line 2288
    :cond_1
    :goto_0
    return-void
.end method
