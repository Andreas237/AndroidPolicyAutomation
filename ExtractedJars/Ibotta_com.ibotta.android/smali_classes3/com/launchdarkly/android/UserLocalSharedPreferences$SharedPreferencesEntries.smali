.class Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;
.super Ljava/lang/Object;
.source "UserLocalSharePreferences.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ApplySharedPref"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/UserLocalSharedPreferences;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SharedPreferencesEntries"
.end annotation


# instance fields
.field private final sharedPreferencesEntryList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;",
            ">;)V"
        }
    .end annotation

    .line 290
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 291
    iput-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;->sharedPreferencesEntryList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method clearAndSave(Landroid/content/SharedPreferences;)V
    .locals 2

    .line 295
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 296
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 297
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;->sharedPreferencesEntryList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;

    .line 298
    invoke-virtual {v1, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;->saveWithoutApply(Landroid/content/SharedPreferences$Editor;)V

    goto :goto_0

    .line 300
    :cond_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method update(Landroid/content/SharedPreferences;)V
    .locals 2

    .line 305
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 307
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;->sharedPreferencesEntryList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;

    .line 308
    invoke-virtual {v1, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;->saveWithoutApply(Landroid/content/SharedPreferences$Editor;)V

    goto :goto_0

    .line 310
    :cond_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
