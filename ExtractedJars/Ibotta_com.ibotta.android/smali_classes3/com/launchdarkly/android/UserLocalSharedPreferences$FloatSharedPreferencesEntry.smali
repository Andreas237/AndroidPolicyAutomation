.class Lcom/launchdarkly/android/UserLocalSharedPreferences$FloatSharedPreferencesEntry;
.super Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;
.source "UserLocalSharePreferences.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/UserLocalSharedPreferences;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FloatSharedPreferencesEntry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/Float;)V
    .locals 0

    .line 362
    invoke-direct {p0, p1, p2}, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method saveWithoutApply(Landroid/content/SharedPreferences$Editor;)V
    .locals 2

    .line 367
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$FloatSharedPreferencesEntry;->key:Ljava/lang/String;

    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$FloatSharedPreferencesEntry;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    return-void
.end method
