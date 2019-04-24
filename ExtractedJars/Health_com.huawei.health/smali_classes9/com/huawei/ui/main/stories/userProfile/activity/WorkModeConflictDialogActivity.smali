.class public Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Ljava/lang/String;

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private b()V
    .locals 5

    .line 49
    const-string v0, "WorkModeConflictDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUpdateMode()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 51
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 52
    const-string v0, "content"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->b:Ljava/lang/String;

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    :cond_0
    return-void
.end method

.method private d()V
    .locals 4

    .line 58
    const-string v0, "WorkModeConflictDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->dialog_title_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->d:Landroid/widget/TextView;

    .line 60
    sget v0, Lcom/huawei/ui/main/R$id;->dialog_content_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->a:Landroid/widget/TextView;

    .line 61
    sget v0, Lcom/huawei/ui/main/R$id;->dialog_show_true_but:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->e:Landroid/widget/Button;

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->e:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_user_permission_know:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->e:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity$1;-><init>(Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 32
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 33
    iput-object p0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->c:Landroid/content/Context;

    .line 34
    const-string v0, "WorkModeConflictDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_personal_center_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->setContentView(I)V

    .line 37
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 38
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 39
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 40
    const/4 v0, -0x1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 41
    const/4 v0, -0x2

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 42
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->d()V

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->b()V

    .line 46
    return-void
.end method
