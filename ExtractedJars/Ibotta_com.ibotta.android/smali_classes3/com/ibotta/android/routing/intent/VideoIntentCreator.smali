.class public Lcom/ibotta/android/routing/intent/VideoIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "VideoIntentCreator.java"


# instance fields
.field private allowCancel:Z

.field private allowSkip:Z

.field private trackingImpressionUrl:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final url:Ljava/lang/String;

.field private urlIsAd:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public allowCancel(Z)Lcom/ibotta/android/routing/intent/VideoIntentCreator;
    .locals 0

    .line 42
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->allowCancel:Z

    return-object p0
.end method

.method public allowSkip(Z)Lcom/ibotta/android/routing/intent/VideoIntentCreator;
    .locals 0

    .line 47
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->allowSkip:Z

    return-object p0
.end method

.method public create()Landroid/content/Intent;
    .locals 3

    .line 58
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "url"

    .line 60
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->url:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "url_is_add"

    .line 61
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->urlIsAd:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "allow_cancel"

    .line 62
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->allowCancel:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "allow_skip"

    .line 63
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->allowSkip:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "tracking_impression_url"

    .line 64
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->trackingImpressionUrl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public trackingImpressionUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/VideoIntentCreator;
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->trackingImpressionUrl:Ljava/lang/String;

    return-object p0
.end method

.method public urlIsAd(Z)Lcom/ibotta/android/routing/intent/VideoIntentCreator;
    .locals 0

    .line 37
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->urlIsAd:Z

    return-object p0
.end method
