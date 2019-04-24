.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/emu;

.field private d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private a()Z
    .locals 6

    .line 106
    const/4 v4, 0x0

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->a:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_wifi_only_weightandBMI"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 110
    const-string v0, "SettingWeightAndBMIActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOnlyTwo string is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const-string v0, "all"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    const/4 v4, 0x1

    .line 114
    :cond_0
    const-string v0, "SettingWeightAndBMIActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowAll status is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    return v4
.end method

.method private b()V
    .locals 2

    .line 65
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->b:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setClickable(Z)V

    goto :goto_0

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->b:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setClickable(Z)V

    .line 70
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->b:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_1

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->b:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 75
    :goto_1
    return-void
.end method

.method private c()Z
    .locals 8

    .line 124
    const/4 v4, 0x0

    .line 125
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v5

    .line 126
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 127
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acu;

    .line 128
    invoke-virtual {v7}, Lo/acu;->b()I

    move-result v0

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    invoke-virtual {v7}, Lo/acu;->b()I

    move-result v0

    const/16 v1, 0x41

    if-le v0, v1, :cond_1

    .line 129
    :cond_0
    const/4 v4, 0x1

    .line 126
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 132
    :cond_2
    const-string v0, "SettingWeightAndBMIActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAble status is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    return v4
.end method

.method private e()V
    .locals 6

    .line 56
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_weight_and_bmi_tips_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->d:Landroid/widget/TextView;

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_weight_and_bmi_tips:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x12

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x41

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->weight_and_bmi_setting_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->b:Lo/emu;

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->b:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 61
    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 5

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->b:Lo/emu;

    if-ne p1, v0, :cond_1

    .line 86
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 87
    if-eqz p2, :cond_0

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->a:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_wifi_only_weightandBMI"

    const-string v3, "all"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->a:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_wifi_only_weightandBMI"

    const-string v3, "two"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 96
    :goto_0
    sget-object v0, Lo/acs;->c:Lo/acs;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/acs;->d(Z)V

    .line 99
    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 40
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 41
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_weight_and_bmi_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->setContentView(I)V

    .line 42
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->a:Landroid/content/Context;

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->e()V

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->b()V

    .line 45
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 80
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 81
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 50
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;->b()V

    .line 52
    return-void
.end method
