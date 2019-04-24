.class public Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private b()V
    .locals 1

    .line 56
    sget v0, Lcom/huawei/ui/main/R$id;->free_indoor_running:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->c:Landroid/widget/RelativeLayout;

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->image_back:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->d:Landroid/widget/ImageView;

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    return-void
.end method

.method private c()V
    .locals 5

    .line 65
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ihealthredpoint"

    const-string v3, "clicked"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 67
    return-void
.end method

.method private e(Landroid/content/Context;)I
    .locals 6

    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "status_bar_height"

    const-string v2, "dimen"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 72
    if-lez v5, :cond_0

    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 75
    :cond_0
    return v4
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->free_indoor_running:I

    if-ne v0, v1, :cond_0

    .line 82
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 83
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->startActivity(Landroid/content/Intent;)V

    .line 84
    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->image_back:I

    if-ne v0, v1, :cond_1

    .line 85
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->finish()V

    .line 87
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 38
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    const-string v0, "IHealthLabsAcitivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_ihealth_labs:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->setContentView(I)V

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->c()V

    .line 42
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->b()V

    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 44
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 45
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x500

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 47
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 48
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 49
    sget v0, Lcom/huawei/ui/main/R$id;->toolbar_height:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 50
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/ihealthLabs/IHealthLabsAcitivity;->e(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v1, v0, v2, v3}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 52
    :cond_0
    return-void
.end method
