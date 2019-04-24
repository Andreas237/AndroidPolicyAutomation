.class public Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "FeaturedIntentCreator.java"


# instance fields
.field private offerTag:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private search:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->search:Ljava/lang/String;

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->offerTag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 37
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 39
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->search:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "search_param"

    .line 40
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->offerTag:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "offer_tag"

    .line 44
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    :cond_1
    invoke-virtual {p0, v0}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->addClearFlags(Landroid/content/Intent;)V

    return-object v0
.end method

.method public offerTag(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->offerTag:Ljava/lang/String;

    return-object p0
.end method

.method public search(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->search:Ljava/lang/String;

    return-object p0
.end method
