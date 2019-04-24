.class public Lcom/ibotta/android/routing/intent/ContentDetailIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ContentDetailIntentCreator.java"


# instance fields
.field private final contentId:Lcom/ibotta/android/apiandroid/content/ContentId;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 14
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/ContentDetailIntentCreator;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 19
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/ContentDetailIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "content_id"

    .line 20
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ContentDetailIntentCreator;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method
