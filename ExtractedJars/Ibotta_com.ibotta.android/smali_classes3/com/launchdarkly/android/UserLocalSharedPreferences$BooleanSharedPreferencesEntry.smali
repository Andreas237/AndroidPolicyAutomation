.class Lcom/launchdarkly/android/UserLocalSharedPreferences$BooleanSharedPreferencesEntry;
.super Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;
.source "UserLocalSharePreferences.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/UserLocalSharedPreferences;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "BooleanSharedPreferencesEntry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 338
    invoke-direct {p0, p1, p2}, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method saveWithoutApply(Landroid/content/SharedPreferences$Editor;)V
    .locals 2

    .line 343
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$BooleanSharedPreferencesEntry;->key:Ljava/lang/String;

    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$BooleanSharedPreferencesEntry;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    return-void
.end method
