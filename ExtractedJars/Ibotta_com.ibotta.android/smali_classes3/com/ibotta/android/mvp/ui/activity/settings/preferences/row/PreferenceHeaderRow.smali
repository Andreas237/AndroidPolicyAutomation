.class public Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceHeaderRow;
.super Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;
.source "PreferenceHeaderRow.java"


# instance fields
.field private titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;->HEADER:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;)V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceHeaderRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceHeaderRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
