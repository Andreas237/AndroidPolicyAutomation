.class public Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "PwiHomeIntentCreator.java"


# instance fields
.field private contentId:Lcom/ibotta/android/apiandroid/content/ContentId;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 22
    iput p2, p0, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;->retailerId:I

    return-void
.end method


# virtual methods
.method public contentId(Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    return-object p0
.end method

.method public create()Landroid/content/Intent;
    .locals 3

    .line 32
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "retailer_id"

    .line 34
    iget v2, p0, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;->retailerId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "content_id"

    .line 35
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method
