.class public Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "NotificationsIntentCreator.java"


# instance fields
.field private tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 31
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 33
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    if-eqz v1, :cond_0

    const-string v2, "tab_selection"

    .line 34
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method public tabSelection(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;)Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    return-object p0
.end method
