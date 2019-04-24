.class public Lcom/ibotta/android/routing/intent/ShareableIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ShareableIntentCreator.java"


# instance fields
.field private final body:Ljava/lang/String;

.field private forFeatured:Z

.field private final subject:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->forFeatured:Z

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->subject:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->body:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 4

    .line 34
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 36
    iget-boolean v1, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->forFeatured:Z

    if-eqz v1, :cond_0

    .line 37
    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->context:Landroid/content/Context;

    const-class v3, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v1, "shareable_subject"

    .line 38
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->subject:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "shareable_body"

    .line 39
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->body:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 40
    invoke-virtual {p0, v0}, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->addClearFlags(Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const-string v1, "android.intent.action.SEND"

    .line 42
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.SUBJECT"

    .line 43
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->subject:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    .line 44
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->body:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "text/plain"

    .line 45
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    return-object v0
.end method

.method public forFeatured(Z)Lcom/ibotta/android/routing/intent/ShareableIntentCreator;
    .locals 0

    .line 28
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->forFeatured:Z

    return-object p0
.end method
