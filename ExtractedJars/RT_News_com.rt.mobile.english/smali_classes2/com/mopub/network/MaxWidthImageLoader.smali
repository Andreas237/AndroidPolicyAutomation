.class public Lcom/mopub/network/MaxWidthImageLoader;
.super Lcom/mopub/volley/toolbox/ImageLoader;
.source "MaxWidthImageLoader.java"


# instance fields
.field private final mMaxImageWidth:I


# direct methods
.method public constructor <init>(Lcom/mopub/volley/RequestQueue;Landroid/content/Context;Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xd
    .end annotation

    .line 18
    invoke-direct {p0, p1, p3}, Lcom/mopub/volley/toolbox/ImageLoader;-><init>(Lcom/mopub/volley/RequestQueue;Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;)V

    const-string p1, "window"

    .line 21
    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    .line 22
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    .line 23
    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    .line 24
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0xd

    if-ge p3, v0, :cond_0

    .line 25
    invoke-virtual {p1}, Landroid/view/Display;->getWidth()I

    move-result p3

    invoke-virtual {p1}, Landroid/view/Display;->getHeight()I

    move-result p1

    invoke-virtual {p2, p3, p1}, Landroid/graphics/Point;->set(II)V

    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 31
    :goto_0
    iget p1, p2, Landroid/graphics/Point;->x:I

    iget p2, p2, Landroid/graphics/Point;->y:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/mopub/network/MaxWidthImageLoader;->mMaxImageWidth:I

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;)Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;
    .locals 2

    .line 36
    iget v0, p0, Lcom/mopub/network/MaxWidthImageLoader;->mMaxImageWidth:I

    const/4 v1, 0x0

    invoke-super {p0, p1, p2, v0, v1}, Lcom/mopub/volley/toolbox/ImageLoader;->get(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;II)Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    move-result-object p1

    return-object p1
.end method
