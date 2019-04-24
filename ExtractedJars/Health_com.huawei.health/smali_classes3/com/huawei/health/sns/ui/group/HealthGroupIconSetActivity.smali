.class public Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lcom/huawei/health/sns/model/group/Group;

.field private c:Lo/egd;

.field private d:Landroid/widget/ImageView;

.field private e:Z

.field private f:Lo/egn;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->f:Lo/egn;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)Landroid/app/Activity;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->a:Landroid/app/Activity;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 50
    sget v0, Lcom/huawei/android/sns/R$id;->set_group_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d:Landroid/widget/ImageView;

    .line 52
    sget v0, Lcom/huawei/android/sns/R$id;->btn_finish:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->c:Lo/egd;

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->c:Lo/egd;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->c:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 55
    return-void
.end method

.method private a(J)Z
    .locals 2

    .line 123
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ata;->a(J)Lo/ayc;

    move-result-object v1

    .line 124
    if-eqz v1, :cond_0

    .line 126
    invoke-virtual {v1}, Lo/ayc;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    const/4 v0, 0x1

    return v0

    .line 130
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->b:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->c:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->e:Z

    if-nez v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->c:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->c:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 145
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->e:Z

    .line 146
    return-void
.end method

.method private e()V
    .locals 3

    .line 59
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 62
    if-eqz v2, :cond_0

    const-string v0, "group"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const-string v0, "group"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->b:Lcom/huawei/health/sns/model/group/Group;

    .line 66
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->e:Z

    .line 67
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 41
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_group_icon_set:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->setContentView(I)V

    .line 43
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->a:Landroid/app/Activity;

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->e()V

    .line 45
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->a()V

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d()V

    .line 47
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 104
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onResume()V

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->b:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 107
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->b:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->a(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->b:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->c:Lo/egd;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 111
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->c:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->e:Z

    .line 115
    :cond_1
    :goto_0
    return-void
.end method
