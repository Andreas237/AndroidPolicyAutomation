.class public Lcom/shopkick/sdk/core/SettingsActivity;
.super Landroid/preference/PreferenceActivity;
.source "SettingsActivity.java"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    return-void
.end method

.method private init()V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    .line 28
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/core/SettingsActivity;->getPreferenceScreen()Landroid/preference/PreferenceScreen;

    move-result-object v2

    invoke-virtual {v2}, Landroid/preference/PreferenceScreen;->getPreferenceCount()I

    move-result v2

    if-ge v1, v2, :cond_5

    .line 29
    invoke-virtual {p0}, Lcom/shopkick/sdk/core/SettingsActivity;->getPreferenceScreen()Landroid/preference/PreferenceScreen;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/preference/PreferenceScreen;->getPreference(I)Landroid/preference/Preference;

    move-result-object v2

    .line 31
    invoke-virtual {v2}, Landroid/preference/Preference;->getKey()Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x1

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, -0x4cd26f2f

    if-eq v5, v6, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "pref_env"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v4, v0

    :cond_1
    :goto_1
    if-eqz v4, :cond_2

    goto :goto_3

    .line 33
    :cond_2
    check-cast v2, Landroid/preference/ListPreference;

    .line 34
    invoke-static {}, Lcom/shopkick/sdk/api/Environment;->getInstance()Lcom/shopkick/sdk/api/Environment;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/sdk/api/Environment;->getServiceEnvironment()Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    move-result-object v3

    .line 35
    :goto_2
    invoke-virtual {v2}, Landroid/preference/ListPreference;->getEntryValues()[Ljava/lang/CharSequence;

    move-result-object v4

    array-length v4, v4

    if-ge v1, v4, :cond_4

    .line 36
    invoke-virtual {v3}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Landroid/preference/ListPreference;->getEntryValues()[Ljava/lang/CharSequence;

    move-result-object v5

    aget-object v5, v5, v0

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 37
    invoke-virtual {v2, v0}, Landroid/preference/ListPreference;->setValueIndex(I)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 20
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 22
    invoke-static {p0}, Lcom/shopkick/sdk/api/Environment;->initialize(Landroid/content/Context;)V

    .line 23
    sget p1, Lcom/shopkick/sdk/R$xml;->preferences:I

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/core/SettingsActivity;->addPreferencesFromResource(I)V

    .line 24
    invoke-direct {p0}, Lcom/shopkick/sdk/core/SettingsActivity;->init()V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 77
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onPause()V

    .line 79
    invoke-virtual {p0}, Lcom/shopkick/sdk/core/SettingsActivity;->getPreferenceScreen()Landroid/preference/PreferenceScreen;

    move-result-object v0

    invoke-virtual {v0}, Landroid/preference/PreferenceScreen;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 80
    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 67
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onResume()V

    .line 70
    invoke-virtual {p0}, Lcom/shopkick/sdk/core/SettingsActivity;->getPreferenceScreen()Landroid/preference/PreferenceScreen;

    move-result-object v0

    invoke-virtual {v0}, Landroid/preference/PreferenceScreen;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 71
    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 3

    .line 47
    invoke-virtual {p0, p2}, Lcom/shopkick/sdk/core/SettingsActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object p1

    .line 48
    invoke-virtual {p0}, Lcom/shopkick/sdk/core/SettingsActivity;->getResources()Landroid/content/res/Resources;

    const/4 v0, -0x1

    .line 53
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x4cd26f2f

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "pref_env"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 v0, 0x0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    goto :goto_1

    .line 55
    :cond_2
    check-cast p1, Landroid/preference/ListPreference;

    .line 56
    invoke-static {}, Lcom/shopkick/sdk/api/Environment;->getInstance()Lcom/shopkick/sdk/api/Environment;

    move-result-object p2

    invoke-virtual {p1}, Landroid/preference/ListPreference;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/shopkick/sdk/api/Environment;->setServerEnvironment(Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;)V

    const-string p1, "Restart app"

    const/4 p2, 0x1

    .line 57
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_1
    return-void
.end method
