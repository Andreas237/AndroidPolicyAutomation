.class public Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;
.source "PreferenceViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final pvPreference:Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/AbstractPreferenceViewHolder;-><init>(Landroid/view/View;)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolder;->pvPreference:Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;)V
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolder;->pvPreference:Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->setListener(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;)V

    .line 22
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/holder/PreferenceViewHolder;->pvPreference:Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/PreferenceRow;->getPreference()Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->setPreference(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)V

    return-void
.end method
