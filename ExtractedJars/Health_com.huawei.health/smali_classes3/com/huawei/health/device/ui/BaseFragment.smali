.class public abstract Lcom/huawei/health/device/ui/BaseFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field protected child:Landroid/view/View;

.field protected mCustomTitleBar:Lo/emr;

.field protected mPresetDeviceInChinaMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/util/List;>;"
        }
    .end annotation
.end field

.field protected mPresetDeviceInOverseaMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/util/List;>;"
        }
    .end annotation
.end field

.field public mainActivity:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 36
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mPresetDeviceInChinaMap:Ljava/util/HashMap;

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mPresetDeviceInOverseaMap:Ljava/util/HashMap;

    return-void
.end method

.method private buildPresetDeviceInChinaMap()V
    .locals 6

    .line 67
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 68
    const-string v0, "34fa0346-d46c-439d-9cb0-2f696618846b"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    const-string v0, "7a1063dd-0e0f-4a72-9939-461476ff0259"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    const-string v0, "578d0675-cece-4426-bf28-43ce31eb7b5d"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    const-string v0, "6ab08ad8-753b-4dd9-bf3a-798a0a1d81bf"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    const-string v0, "9684a253-0fb5-4560-8fa3-b925163f8b67"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 75
    const-string v0, "408553b8-0535-4561-8dbf-55c2bbd61b77"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    const-string v0, "c647e381-165c-44d2-8e7b-6339c7904fde"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    const-string v0, "4ff7df35-c532-4247-ab42-12b260917bc0"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    const-string v0, "825c82bd-84fe-44a0-9884-6a764bd73183"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    const-string v0, "54af062d-b049-4880-beda-f0cbe64e9205"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 82
    const-string v0, "f83a5e21-3686-42f8-9a13-7296172a7ced"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    const-string v0, "79da9d7e-561c-4e14-8a6b-b1d5dc07198a"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    const-string v0, "fe33600f-dbb2-4382-9417-21ab8eeb6e42"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 87
    const-string v0, "e570b133-357b-4b49-b894-600a27a0e826"

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    const-string v0, "9bf158ba-49b0-46aa-9fdf-ed75da1569cf"

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mPresetDeviceInChinaMap:Ljava/util/HashMap;

    sget-object v1, Lo/acl$a;->a:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mPresetDeviceInChinaMap:Ljava/util/HashMap;

    sget-object v1, Lo/acl$a;->d:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mPresetDeviceInChinaMap:Ljava/util/HashMap;

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mPresetDeviceInChinaMap:Ljava/util/HashMap;

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    return-void
.end method

.method private buildPresetDeviceInOverseaMap()V
    .locals 4

    .line 53
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 54
    const-string v0, "33123f39-7fc1-420b-9882-a4b0d6c61100"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    const-string v0, "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 58
    const-string v0, "f83a5e21-3686-42f8-9a13-7296172a7ced"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    const-string v0, "79da9d7e-561c-4e14-8a6b-b1d5dc07198a"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    const-string v0, "fe33600f-dbb2-4382-9417-21ab8eeb6e42"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mPresetDeviceInOverseaMap:Ljava/util/HashMap;

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mPresetDeviceInOverseaMap:Ljava/util/HashMap;

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    return-void
.end method


# virtual methods
.method protected getBundleFromDeviceMainActivity()Landroid/os/Bundle;
    .locals 2

    .line 186
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 187
    invoke-virtual {v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->e()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method protected getDeviceMainActivity()Lcom/huawei/health/device/ui/DeviceMainActivity;
    .locals 2

    .line 191
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 192
    return-object v1
.end method

.method protected getMyFragmentManager()Landroid/support/v4/app/FragmentManager;
    .locals 2

    .line 180
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 181
    invoke-virtual {v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    return-object v0
.end method

.method public getSelectFragment(Ljava/lang/Class;)Landroid/support/v4/app/Fragment;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)Landroid/support/v4/app/Fragment;"
        }
    .end annotation

    .line 238
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 239
    if-eqz v4, :cond_0

    .line 241
    invoke-virtual {v4, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->b(Ljava/lang/Class;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    return-object v0

    .line 245
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is NULL..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()Z
    .locals 4

    .line 251
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BaseFragment onBackPressed invoke"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 45
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 46
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mainActivity:Landroid/app/Activity;

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;->buildPresetDeviceInChinaMap()V

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;->buildPresetDeviceInOverseaMap()V

    .line 50
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 100
    sget v0, Lcom/huawei/plugindevice/R$layout;->base_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 101
    sget v0, Lcom/huawei/plugindevice/R$id;->device_main_title:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mCustomTitleBar:Lo/emr;

    .line 102
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/health/device/ui/BaseFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/BaseFragment$4;-><init>(Lcom/huawei/health/device/ui/BaseFragment;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    return-object v2
.end method

.method public onDestroy()V
    .locals 1

    .line 158
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 159
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mainActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 160
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mainActivity:Landroid/app/Activity;

    .line 162
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 129
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 130
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BaseFragment currentFragment name is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getTag()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mainActivity:Landroid/app/Activity;

    check-cast v0, Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-virtual {v0, p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 134
    const-string v0, "WiFiInfoConfirmFragment"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    goto :goto_0

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 139
    :goto_0
    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .locals 0

    .line 119
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onViewStateRestored(Landroid/os/Bundle;)V

    .line 120
    return-void
.end method

.method public popupFragment(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)V"
        }
    .end annotation

    .line 195
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 196
    invoke-virtual {v1, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c(Ljava/lang/Class;)V

    .line 197
    return-void
.end method

.method public release()V
    .locals 4

    .line 258
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Release fragment and activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    return-void
.end method

.method public saveResultData()V
    .locals 4

    .line 255
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Save weight or bloodpressure Result Data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    return-void
.end method

.method protected setBackNavigationVisibility(I)V
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mCustomTitleBar:Lo/emr;

    invoke-virtual {v0, p1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 177
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 170
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 171
    iget-object v0, p0, Lcom/huawei/health/device/ui/BaseFragment;->mCustomTitleBar:Lo/emr;

    invoke-virtual {v0, p1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 173
    :cond_0
    return-void
.end method

.method public showCustomAlertDialog(I)Z
    .locals 4

    .line 264
    new-instance v3, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 265
    invoke-virtual {v3, p1}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 266
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/BaseFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/BaseFragment$2;-><init>(Lcom/huawei/health/device/ui/BaseFragment;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 274
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/BaseFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/BaseFragment$5;-><init>(Lcom/huawei/health/device/ui/BaseFragment;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 281
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v2

    .line 282
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/egy;->setCancelable(Z)V

    .line 283
    invoke-virtual {v2}, Lo/egy;->show()V

    .line 285
    const/4 v0, 0x0

    return v0
.end method

.method public switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 5

    .line 216
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 217
    if-eqz v4, :cond_0

    .line 219
    invoke-virtual {v4, p0, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    goto :goto_0

    .line 223
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is NULL..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    :goto_0
    return-void
.end method

.method public switchFragment(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 5

    .line 229
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 230
    if-eqz v4, :cond_0

    .line 231
    invoke-virtual {v4, p1, p2}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    goto :goto_0

    .line 233
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is NULL..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    :goto_0
    return-void
.end method

.method public switchFragment(Lcom/huawei/health/device/ui/BaseFragment;Ljava/lang/String;)V
    .locals 6

    .line 200
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 201
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 202
    const-string v0, "root_in_me"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    invoke-virtual {p1, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 204
    if-eqz v4, :cond_0

    .line 206
    invoke-virtual {v4, p0, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    goto :goto_0

    .line 210
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is NULL..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :goto_0
    return-void
.end method
