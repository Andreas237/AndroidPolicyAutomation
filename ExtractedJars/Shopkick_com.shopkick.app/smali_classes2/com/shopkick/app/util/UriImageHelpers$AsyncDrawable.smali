.class public Lcom/shopkick/app/util/UriImageHelpers$AsyncDrawable;
.super Landroid/graphics/drawable/BitmapDrawable;
.source "UriImageHelpers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/UriImageHelpers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AsyncDrawable"
.end annotation


# instance fields
.field private final bitmapWorkerTaskReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 69
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/util/UriImageHelpers$AsyncDrawable;->bitmapWorkerTaskReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public getBitmapWorkerTask()Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/util/UriImageHelpers$AsyncDrawable;->bitmapWorkerTaskReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;

    return-object v0
.end method
