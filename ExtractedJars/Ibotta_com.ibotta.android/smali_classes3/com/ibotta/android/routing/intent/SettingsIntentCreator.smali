.class public Lcom/ibotta/android/routing/intent/SettingsIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "SettingsIntentCreator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;
    }
.end annotation


# instance fields
.field private final destination:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->destination:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 34
    sget-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$1;->$SwitchMap$com$ibotta$android$routing$intent$SettingsIntentCreator$SettingsDestination:[I

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->destination:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    invoke-virtual {v1}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SettingsDestination not recognized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0

    .line 40
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0

    .line 38
    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0

    .line 36
    :pswitch_3
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
