.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Context;

.field private c:Landroid/widget/Button;

.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 16
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->b:Landroid/content/Context;

    return-void
.end method

.method private a()V
    .locals 1

    .line 46
    sget v0, Lcom/huawei/ui/main/R$id;->sport:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->c:Landroid/widget/Button;

    .line 47
    sget v0, Lcom/huawei/ui/main/R$id;->device:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->d:Landroid/widget/Button;

    .line 48
    sget v0, Lcom/huawei/ui/main/R$id;->sleep:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->e:Landroid/widget/Button;

    .line 49
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;)Landroid/content/Context;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 20
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 21
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_label_upload:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->setContentView(I)V

    .line 22
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->a()V

    .line 23
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->c:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->d:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;->e:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    return-void
.end method
