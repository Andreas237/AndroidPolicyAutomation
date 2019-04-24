.class Lcom/launchdarkly/android/UserLocalSharedPreferences$1;
.super Ljava/lang/Object;
.source "UserLocalSharePreferences.java"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/UserLocalSharedPreferences;->registerListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/UserLocalSharedPreferences;

.field final synthetic val$key:Ljava/lang/String;

.field final synthetic val$listener:Lcom/launchdarkly/android/FeatureFlagChangeListener;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/UserLocalSharedPreferences;Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$1;->this$0:Lcom/launchdarkly/android/UserLocalSharedPreferences;

    iput-object p2, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$1;->val$key:Ljava/lang/String;

    iput-object p3, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$1;->val$listener:Lcom/launchdarkly/android/FeatureFlagChangeListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 3

    .line 152
    iget-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$1;->val$key:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Found changed flag: [%s]"

    const/4 v0, 0x1

    .line 153
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$1;->val$key:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$1;->val$listener:Lcom/launchdarkly/android/FeatureFlagChangeListener;

    invoke-interface {p1, p2}, Lcom/launchdarkly/android/FeatureFlagChangeListener;->onFeatureFlagChange(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
