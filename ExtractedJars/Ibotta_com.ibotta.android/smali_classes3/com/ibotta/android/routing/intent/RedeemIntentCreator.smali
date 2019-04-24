.class public Lcom/ibotta/android/routing/intent/RedeemIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "RedeemIntentCreator.java"


# instance fields
.field private eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
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
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/RedeemIntentCreator;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 31
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/RedeemIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 33
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/RedeemIntentCreator;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    if-eqz v1, :cond_0

    const-string v2, "event_context"

    .line 34
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method public eventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/routing/intent/RedeemIntentCreator;
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/RedeemIntentCreator;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object p0
.end method
