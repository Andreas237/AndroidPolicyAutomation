.class public Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;
.super Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;
.source "SettingMenuRow.java"


# instance fields
.field private customer:Lcom/ibotta/api/model/customer/Customer;

.field private settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field private showToggle:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->MENU:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;)V

    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->showToggle:Z

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    return-void
.end method


# virtual methods
.method public getCustomer()Lcom/ibotta/api/model/customer/Customer;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->customer:Lcom/ibotta/api/model/customer/Customer;

    return-object v0
.end method

.method public getSettingMenu()Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    return-object v0
.end method

.method public isShowToggle()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->showToggle:Z

    return v0
.end method

.method public setCustomer(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->customer:Lcom/ibotta/api/model/customer/Customer;

    return-void
.end method

.method public setSettingMenu(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    return-void
.end method

.method public setShowToggle(Z)V
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingMenuRow;->showToggle:Z

    return-void
.end method
