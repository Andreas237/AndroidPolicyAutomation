.class public Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/egd;

.field private b:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    return-void
.end method

.method private d()V
    .locals 1

    .line 30
    sget v0, Lcom/huawei/android/sns/R$id;->set_network_info_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->b:Landroid/widget/ImageView;

    .line 31
    sget v0, Lcom/huawei/android/sns/R$id;->tv_network_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->d:Landroid/widget/TextView;

    .line 32
    sget v0, Lcom/huawei/android/sns/R$id;->btn_set_network:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->a:Lo/egd;

    .line 33
    return-void
.end method

.method private e()V
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->a:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 22
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 23
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_create_group_network_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->setContentView(I)V

    .line 25
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->d()V

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->e()V

    .line 27
    return-void
.end method
