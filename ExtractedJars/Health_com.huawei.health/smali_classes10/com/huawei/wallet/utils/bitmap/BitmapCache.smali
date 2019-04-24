.class public Lcom/huawei/wallet/utils/bitmap/BitmapCache;
.super Landroid/util/LruCache;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/LruCache<Ljava/lang/String;Landroid/graphics/Bitmap;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Landroid/util/LruCache;-><init>(I)V

    .line 17
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 31
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/utils/bitmap/BitmapCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method protected b(Ljava/lang/String;Landroid/graphics/Bitmap;)I
    .locals 1

    .line 38
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v0

    return v0
.end method

.method protected c(ZLjava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 25
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 28
    :cond_0
    return-void
.end method

.method protected synthetic entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 9
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    move-object v1, p3

    check-cast v1, Landroid/graphics/Bitmap;

    move-object v2, p4

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/huawei/wallet/utils/bitmap/BitmapCache;->c(ZLjava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method protected synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 9
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    move-object v1, p2

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/wallet/utils/bitmap/BitmapCache;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method
