.class public Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;
.super Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;
.source "PreferenceRow.java"


# instance fields
.field private preference:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;->PREFERENCE:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRowType;)V

    return-void
.end method


# virtual methods
.method public getPreference()Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;->preference:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    return-object v0
.end method

.method public setPreference(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;->preference:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    return-void
.end method
