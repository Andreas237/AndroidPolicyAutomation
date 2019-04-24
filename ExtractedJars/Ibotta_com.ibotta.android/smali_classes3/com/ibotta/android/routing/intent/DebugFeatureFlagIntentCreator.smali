.class public Lcom/ibotta/android/routing/intent/DebugFeatureFlagIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "DebugFeatureFlagIntentCreator.java"


# instance fields
.field private final testName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 14
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/DebugFeatureFlagIntentCreator;->testName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 19
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/DebugFeatureFlagIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "presenter_state"

    iget-object v2, p0, Lcom/ibotta/android/routing/intent/DebugFeatureFlagIntentCreator;->testName:Ljava/lang/String;

    .line 20
    invoke-static {v2}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;->create(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
