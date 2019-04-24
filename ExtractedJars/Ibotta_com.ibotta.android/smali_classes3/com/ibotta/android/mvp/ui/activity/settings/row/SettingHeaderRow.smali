.class public Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingHeaderRow;
.super Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;
.source "SettingHeaderRow.java"


# instance fields
.field private final settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 17
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->HEADER:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;)V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingHeaderRow;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingHeaderRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getSettingMenu()Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingHeaderRow;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingHeaderRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
