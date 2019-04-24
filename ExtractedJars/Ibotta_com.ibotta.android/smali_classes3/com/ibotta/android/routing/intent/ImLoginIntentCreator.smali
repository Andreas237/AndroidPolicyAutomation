.class public Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ImLoginIntentCreator.java"


# instance fields
.field private cameFromCreate:Z

.field private final retailerId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 17
    iput p2, p0, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;->retailerId:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IZ)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 22
    iput p2, p0, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;->retailerId:I

    .line 23
    iput-boolean p3, p0, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;->cameFromCreate:Z

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 4

    .line 28
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->builder()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;->accountCreationMessageAlreadyShown(Z)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;->cameFromCreate:Z

    .line 30
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;->fromCreate(Z)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;->retailerId:I

    .line 31
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;->retailerId(I)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    move-result-object v0

    .line 34
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;->context:Landroid/content/Context;

    const-class v3, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "presenter_state"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
