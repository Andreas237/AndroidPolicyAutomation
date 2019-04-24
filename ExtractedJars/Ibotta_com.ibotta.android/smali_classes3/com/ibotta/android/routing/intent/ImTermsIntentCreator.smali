.class public Lcom/ibotta/android/routing/intent/ImTermsIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ImTermsIntentCreator.java"


# instance fields
.field private final imLoginParcel:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

.field private final retailerId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;ILcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 18
    iput p2, p0, Lcom/ibotta/android/routing/intent/ImTermsIntentCreator;->retailerId:I

    .line 19
    iput-object p3, p0, Lcom/ibotta/android/routing/intent/ImTermsIntentCreator;->imLoginParcel:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 4

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/ImTermsIntentCreator;->imLoginParcel:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    iget v1, p0, Lcom/ibotta/android/routing/intent/ImTermsIntentCreator;->retailerId:I

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;->create(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;I)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    move-result-object v0

    .line 26
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ImTermsIntentCreator;->context:Landroid/content/Context;

    const-class v3, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "presenter_state"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
