.class public Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;
.super Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;
.source "SourceFile"


# static fields
.field private static final USER_INFO:I = 0x1


# instance fields
.field private mHander:Landroid/os/Handler;

.field private mProductInfo:Lo/afj;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;-><init>()V

    return-void
.end method

.method private getMeasure()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Object;>;"
        }
    .end annotation

    .line 72
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment getMeasure()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 74
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 75
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 77
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    return-object v4
.end method


# virtual methods
.method protected getMode()Lo/aha;
    .locals 5

    .line 55
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment getmode()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    .line 57
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 58
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_1
    new-instance v4, Lo/aha;

    invoke-direct {v4}, Lo/aha;-><init>()V

    .line 62
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->getMeasure()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aha;->e(Ljava/util/ArrayList;)V

    .line 63
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    iget-object v1, v1, Lo/afj;->n:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    iget-object v1, v1, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aha;->e(Ljava/lang/String;)V

    .line 64
    const v0, 0x800003

    invoke-virtual {v4, v0}, Lo/aha;->b(I)V

    .line 65
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/aha;->d(Z)V

    .line 66
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/aha;->c(Z)V

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->setTitle(Ljava/lang/String;)V

    .line 68
    return-object v4
.end method

.method protected handleDataChangedInUiThread(Lo/acl;Lo/afz;Z)V
    .locals 6

    .line 134
    if-eqz p2, :cond_2

    .line 135
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mKind:Ljava/lang/String;

    invoke-static {v0}, Lo/agd;->a(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v4

    .line 136
    if-nez v4, :cond_0

    .line 137
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment handleDataChangedInUiThread fragment = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void

    .line 140
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 141
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 142
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "goback"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "honour_device"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 143
    const-string v0, "goback"

    const-string v1, "honour_device"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    :cond_1
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string v0, "content"

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_importing_data:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 147
    const-string v0, "HealthData"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 148
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mType:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 150
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 151
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 155
    :cond_2
    return-void
.end method

.method protected handleDataChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;Z)V
    .locals 7

    .line 159
    if-eqz p2, :cond_1

    .line 160
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mKind:Ljava/lang/String;

    invoke-static {v0}, Lo/agd;->a(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v4

    .line 161
    if-nez v4, :cond_0

    .line 162
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment handleDataChangedInUiThread fragment = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    return-void

    .line 165
    :cond_0
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 166
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "content"

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_importing_data:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 168
    invoke-static {}, Lo/ahe;->b()Lo/ahe;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/ahe;->a(Lcom/huawei/hihealth/device/open/data/MeasureResult;)Lo/afz;

    move-result-object v6

    .line 169
    const-string v0, "HealthData"

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 170
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mType:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 172
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 173
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 176
    :cond_1
    return-void
.end method

.method protected handleFailedEventInUiThread(Lo/acl;I)V
    .locals 0

    .line 209
    return-void
.end method

.method protected handleStatusChangedInUiThread(Lo/acl;I)V
    .locals 4

    .line 179
    const/16 v0, 0x9

    if-eq p2, v0, :cond_0

    const/16 v0, 0x8

    if-ne p2, v0, :cond_1

    .line 182
    :cond_0
    new-instance v3, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 183
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_fail:I

    invoke-virtual {v3, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 184
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_permisson:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 195
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v2

    .line 196
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/egy;->setCancelable(Z)V

    .line 197
    invoke-virtual {v2}, Lo/egy;->show()V

    .line 200
    :cond_1
    return-void
.end method

.method protected handleStatusChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 205
    return-void
.end method

.method public onBackPressed()Z
    .locals 3

    .line 213
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "goback"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "honour_device"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->popupFragment(Ljava/lang/Class;)V

    .line 216
    const/4 v0, 0x0

    return v0

    .line 218
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->onBackPressed()Z

    move-result v0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 83
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->onCreate(Landroid/os/Bundle;)V

    .line 85
    return-void
.end method

.method public onStart()V
    .locals 8

    .line 89
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment onStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->onStart()V

    .line 93
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeightMeasureGuideFragment productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_guide_next:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 96
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 98
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mHander:Landroid/os/Handler;

    .line 114
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 115
    const-string v0, "device_name"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    sget-object v0, Lo/dae;->fH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 117
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 119
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v7

    .line 121
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->clear()V

    .line 122
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    const-string v1, "height"

    invoke-virtual {v7}, Lo/acu;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 123
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    const-string v1, "sex"

    invoke-virtual {v7}, Lo/acu;->c()B

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 124
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    const-string v1, "age"

    invoke-virtual {v7}, Lo/acu;->b()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 125
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    const-string v1, "productId"

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    const-string v1, "type"

    const/4 v2, -0x4

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 128
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment onSuccess send msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->mHander:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 131
    return-void
.end method
