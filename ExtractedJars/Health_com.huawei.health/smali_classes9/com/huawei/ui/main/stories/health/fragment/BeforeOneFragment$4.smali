.class Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;)V
    .locals 0

    .line 881
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 884
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 885
    const/4 v0, 0x1

    if-ne v0, v2, :cond_0

    .line 886
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/fcu;->c(I)V

    goto :goto_0

    .line 887
    :cond_0
    const/4 v0, 0x2

    if-ne v0, v2, :cond_1

    .line 889
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 890
    const-string v0, "base_health_data_type_key"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;)I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 891
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-virtual {v0, v3}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->startActivity(Landroid/content/Intent;)V

    .line 892
    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    if-ne v0, v2, :cond_2

    .line 893
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/fcu;->c(I)V

    goto :goto_0

    .line 894
    :cond_2
    const/4 v0, 0x3

    if-ne v0, v2, :cond_3

    .line 895
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 896
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-virtual {v0, v3}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->startActivity(Landroid/content/Intent;)V

    .line 898
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;)V

    .line 899
    return-void
.end method
