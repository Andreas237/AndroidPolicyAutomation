.class public abstract Lcom/huawei/health/device/ui/measure/fragment/ListFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# instance fields
.field protected myDevicesListview:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 50
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 53
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 57
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 58
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_list_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->child:Landroid/view/View;

    .line 59
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_list_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->myDevicesListview:Landroid/widget/ListView;

    .line 60
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->myDevicesListview:Landroid/widget/ListView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOverScrollMode(I)V

    .line 61
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 62
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 64
    :cond_0
    return-object v2
.end method

.method protected showButton(ZLandroid/view/View$OnClickListener;)V
    .locals 3

    .line 26
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bind_new_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/egd;

    .line 27
    if-eqz p1, :cond_0

    .line 28
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/egd;->setVisibility(I)V

    .line 29
    invoke-virtual {v2, p2}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 32
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lo/egd;->setVisibility(I)V

    .line 34
    :goto_0
    return-void
.end method

.method protected showMoreButton(ZLandroid/view/View$OnClickListener;)V
    .locals 4

    .line 36
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_list_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 37
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->hw_device_bottom_btn_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 38
    if-eqz p1, :cond_0

    .line 39
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 40
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 41
    invoke-virtual {v2, p2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 43
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 44
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 46
    :goto_0
    return-void
.end method
