.class public abstract Lcom/ibotta/android/state/app/config/AbstractConfigParser;
.super Ljava/lang/Object;
.source "AbstractConfigParser.java"

# interfaces
.implements Lcom/ibotta/android/state/app/config/ConfigParser;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/state/app/config/ConfigParser<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final appConfigKey:Ljava/lang/String;

.field private final appConfigValue:Ljava/lang/String;

.field private final defaultValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final prefs:Landroid/content/SharedPreferences;

.field private final prefsKey:Ljava/lang/String;

.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "TT;",
            "Landroid/content/SharedPreferences;",
            ")V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->appConfigKey:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->appConfigValue:Ljava/lang/String;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->prefsKey:Ljava/lang/String;

    .line 30
    iput-object p4, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->defaultValue:Ljava/lang/Object;

    .line 31
    iput-object p5, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->prefs:Landroid/content/SharedPreferences;

    .line 33
    iget-object p1, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->appConfigKey:Ljava/lang/String;

    if-eqz p1, :cond_2

    if-eqz p3, :cond_1

    .line 39
    iget-object p1, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->prefs:Landroid/content/SharedPreferences;

    if-eqz p1, :cond_0

    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "prefs cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "prefsKey cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 34
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "appConfigKey cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected getAppConfigKey()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->appConfigKey:Ljava/lang/String;

    return-object v0
.end method

.method protected getAppConfigValue()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->appConfigValue:Ljava/lang/String;

    return-object v0
.end method

.method protected getDefaultValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->defaultValue:Ljava/lang/Object;

    return-object v0
.end method

.method protected getPrefs()Landroid/content/SharedPreferences;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method protected getPrefsKey()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->prefsKey:Ljava/lang/String;

    return-object v0
.end method

.method protected abstract getPrefsValue()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->value:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    .line 70
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->parseAppConfigValueAndSave()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->value:Ljava/lang/Object;

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->value:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->prefs:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->prefsKey:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->getPrefsValue()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->value:Ljava/lang/Object;

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->value:Ljava/lang/Object;

    if-nez v0, :cond_2

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->value:Ljava/lang/Object;

    .line 79
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->value:Ljava/lang/Object;

    return-object v0
.end method

.method onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    .line 105
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected parseAppConfigValueAndSave()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->parseAppConfigValueIntoType()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 95
    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V

    .line 96
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method protected abstract parseAppConfigValueIntoType()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method protected abstract putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences$Editor;",
            "TT;)V"
        }
    .end annotation
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lcom/ibotta/android/state/app/config/AbstractConfigParser;->value:Ljava/lang/Object;

    return-void
.end method
