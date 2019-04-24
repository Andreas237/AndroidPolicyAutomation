.class public Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"


# instance fields
.field private b:Landroid/support/v7/widget/RecyclerView;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 18
    const-string v0, "HealthGroupHelpActivity"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->e:Ljava/lang/String;

    return-void
.end method

.method private b()V
    .locals 2

    .line 29
    sget v0, Lcom/huawei/android/sns/R$id;->recycler_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->b:Landroid/support/v7/widget/RecyclerView;

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 31
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lo/bhn;

    invoke-direct {v1, p0}, Lo/bhn;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 32
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 23
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_group_help:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->setContentView(I)V

    .line 25
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->b()V

    .line 26
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 54
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 55
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 48
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onPause()V

    .line 49
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    return-void
.end method

.method protected onRestart()V
    .locals 4

    .line 36
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onRestart()V

    .line 37
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRestart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 42
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onResume()V

    .line 43
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-void
.end method
