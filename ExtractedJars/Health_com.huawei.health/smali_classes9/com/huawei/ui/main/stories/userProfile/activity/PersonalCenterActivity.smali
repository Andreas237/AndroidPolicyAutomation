.class public Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private c:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private c()V
    .locals 6

    .line 46
    const-string v0, "PersonalCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setDefaultFragment()\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    new-instance v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterActivity;->c:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    .line 49
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    sget v0, Lcom/huawei/ui/main/R$id;->id_personal_center_fragment:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterActivity;->c:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-virtual {v5, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 54
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 58
    :cond_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 26
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    const-string v0, "PersonalCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onCreate()\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_personal_center:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterActivity;->setContentView(I)V

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterActivity;->c()V

    .line 32
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 62
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 63
    const-string v0, "PersonalCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onDestroy()\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 36
    const-string v0, "PersonalCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onResume()\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 38
    return-void
.end method
