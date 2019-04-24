.class public Lcom/ibotta/android/routing/intent/OSIntentCreator;
.super Ljava/lang/Object;
.source "OSIntentCreator.java"

# interfaces
.implements Lcom/ibotta/android/routing/intent/IntentCreator;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private intent:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    return-object v0
.end method

.method public forExternalBrowser(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/OSIntentCreator;
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    return-object p0
.end method

.method public forFeedback()Lcom/ibotta/android/routing/intent/OSIntentCreator;
    .locals 4

    const-string v0, "Feedback on 2.0"

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    const-string v2, "text/html"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    const-string v2, "android.intent.extra.EMAIL"

    const-string v3, "feedback@ibotta.com"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    const-string v2, "android.intent.extra.SUBJECT"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method

.method public forUpgrade(Landroid/content/Context;)Lcom/ibotta/android/routing/intent/OSIntentCreator;
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x7f1101ad

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/OSIntentCreator;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    return-object p0
.end method
