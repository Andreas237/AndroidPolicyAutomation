.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/RadioButton;

.field private b:Landroid/widget/RadioButton;

.field private c:Landroid/widget/RadioGroup;

.field private e:Landroid/widget/TextView;

.field private g:Lo/dcy;

.field private k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->c:Landroid/widget/RadioGroup;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->b:Landroid/widget/RadioButton;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->a:Landroid/widget/RadioButton;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->e:Landroid/widget/TextView;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->g:Lo/dcy;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->k:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 5

    .line 44
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_timefornopointtosave:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->e:Landroid/widget/TextView;

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_data_tarck_map_type_setting:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    sget v0, Lcom/huawei/ui/main/R$id;->radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->c:Landroid/widget/RadioGroup;

    .line 48
    sget v0, Lcom/huawei/ui/main/R$id;->gaode_map:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->b:Landroid/widget/RadioButton;

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->b:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_data_tarck_map_type_setting_gaode:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 51
    sget v0, Lcom/huawei/ui/main/R$id;->google_map:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->a:Landroid/widget/RadioButton;

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->a:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_data_tarck_map_type_setting_google:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->c:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 66
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->d()I

    move-result v4

    .line 68
    const-string v0, "DeveloperTimeSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSport:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 72
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->b:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 73
    goto :goto_1

    .line 75
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->a:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 76
    goto :goto_1

    .line 78
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->b:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 82
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method private a(I)V
    .locals 5

    .line 92
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveMapType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->k:Ljava/lang/String;

    const-string v2, "map_type_setting_key"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->g:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 95
    return-void
.end method

.method private d()I
    .locals 5

    .line 99
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->k:Ljava/lang/String;

    const-string v2, "map_type_setting_key"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 100
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    goto :goto_0

    .line 103
    :cond_0
    const/4 v3, 0x1

    .line 104
    invoke-direct {p0, v3}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->a(I)V

    .line 107
    :goto_0
    return v3
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;I)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->a(I)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 33
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 34
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_map_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->setContentView(I)V

    .line 37
    new-instance v0, Lo/dcy;

    invoke-direct {v0}, Lo/dcy;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->g:Lo/dcy;

    .line 38
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->k:Ljava/lang/String;

    .line 40
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperMapSettingActivity;->a()V

    .line 41
    return-void
.end method
