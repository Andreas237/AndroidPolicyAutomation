.class public Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ImErrorIntentCreator.java"


# instance fields
.field private final retailerId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 16
    iput p2, p0, Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;->retailerId:I

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 4

    .line 21
    iget v0, p0, Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;->retailerId:I

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;->create(I)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    move-result-object v0

    .line 23
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;->context:Landroid/content/Context;

    const-class v3, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "presenter_state"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
