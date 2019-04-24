.class public Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private c:Lo/emu;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;)Landroid/content/Context;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 46
    sget v0, Lcom/huawei/ui/main/R$id;->switch_free_indoor_running:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->c:Lo/emu;

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->a:Landroid/content/Context;

    .line 48
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ihealthlabs"

    .line 47
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 49
    const-string v0, "FreeIndoorRunningActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOpenIndoorRunning is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    if-eqz v4, :cond_0

    const-string v0, "true"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->c:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->c:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 56
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->c:Lo/emu;

    new-instance v1, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity$3;-><init>(Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 74
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 36
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 37
    const-string v0, "FreeIndoorRunningActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_ihealth_free_indoor_running:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->setContentView(I)V

    .line 39
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->a:Landroid/content/Context;

    .line 40
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/ihealthLabs/freeIndoorRunning/FreeIndoorRunningActivity;->c()V

    .line 43
    return-void
.end method
