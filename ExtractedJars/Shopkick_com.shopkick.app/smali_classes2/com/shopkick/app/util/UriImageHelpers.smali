.class public Lcom/shopkick/app/util/UriImageHelpers;
.super Ljava/lang/Object;
.source "UriImageHelpers.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;,
        Lcom/shopkick/app/util/UriImageHelpers$AsyncDrawable;
    }
.end annotation


# instance fields
.field private contentResolver:Landroid/content/ContentResolver;

.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/ContentResolver;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p2, p0, Lcom/shopkick/app/util/UriImageHelpers;->contentResolver:Landroid/content/ContentResolver;

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/util/UriImageHelpers;->context:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/util/UriImageHelpers;)Landroid/content/ContentResolver;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/shopkick/app/util/UriImageHelpers;->contentResolver:Landroid/content/ContentResolver;

    return-object p0
.end method

.method public static cancelPotentialWork(Landroid/net/Uri;Landroid/widget/ImageView;)Z
    .locals 2

    .line 37
    invoke-static {p1}, Lcom/shopkick/app/util/UriImageHelpers;->getBitmapWorkerTask(Landroid/widget/ImageView;)Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 40
    invoke-static {p1}, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->access$000(Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;)Landroid/net/Uri;

    move-result-object v1

    if-eq p0, v1, :cond_0

    .line 43
    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->cancel(Z)Z

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method private static getBitmapWorkerTask(Landroid/widget/ImageView;)Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;
    .locals 1

    if-eqz p0, :cond_0

    .line 55
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 56
    instance-of v0, p0, Lcom/shopkick/app/util/UriImageHelpers$AsyncDrawable;

    if-eqz v0, :cond_0

    .line 57
    check-cast p0, Lcom/shopkick/app/util/UriImageHelpers$AsyncDrawable;

    .line 58
    invoke-virtual {p0}, Lcom/shopkick/app/util/UriImageHelpers$AsyncDrawable;->getBitmapWorkerTask()Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public loadBitmap(Landroid/net/Uri;Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 28
    invoke-static {p1, p2}, Lcom/shopkick/app/util/UriImageHelpers;->cancelPotentialWork(Landroid/net/Uri;Landroid/widget/ImageView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    new-instance v0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;

    invoke-direct {v0, p0, p2}, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;-><init>(Lcom/shopkick/app/util/UriImageHelpers;Landroid/widget/ImageView;)V

    .line 30
    new-instance v1, Lcom/shopkick/app/util/UriImageHelpers$AsyncDrawable;

    iget-object v2, p0, Lcom/shopkick/app/util/UriImageHelpers;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, p3, v0}, Lcom/shopkick/app/util/UriImageHelpers$AsyncDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;)V

    .line 31
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p2, 0x1

    .line 32
    new-array p2, p2, [Landroid/net/Uri;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    invoke-virtual {v0, p2}, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method
