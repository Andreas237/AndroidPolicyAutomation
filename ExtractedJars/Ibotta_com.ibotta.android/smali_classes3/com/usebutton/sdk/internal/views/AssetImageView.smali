.class public Lcom/usebutton/sdk/internal/views/AssetImageView;
.super Landroid/widget/ImageView;
.source "AssetImageView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;
    }
.end annotation


# static fields
.field private static final DEFAULT_DECODER:Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;

.field private static final TAG:Ljava/lang/String; = "AssetImageView"


# instance fields
.field private mAsset:Lcom/usebutton/sdk/internal/models/Asset;

.field private mDecoder:Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;

.field private mLastHash:Ljava/lang/String;

.field private mLoadTask:Landroid/os/AsyncTask;

.field private mLoader:Lcom/usebutton/sdk/internal/ImageLoader;

.field private mUrl:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lcom/usebutton/sdk/internal/views/AssetImageView$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/views/AssetImageView$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/views/AssetImageView;->DEFAULT_DECODER:Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    sget-object p1, Lcom/usebutton/sdk/internal/views/AssetImageView;->DEFAULT_DECODER:Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mDecoder:Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 53
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 37
    sget-object p1, Lcom/usebutton/sdk/internal/views/AssetImageView;->DEFAULT_DECODER:Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mDecoder:Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/views/AssetImageView;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->doInvalidateDrawable()V

    return-void
.end method

.method private currentHash()Ljava/lang/String;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    const-string v0, "asset=%s,w=%d,h=%d"

    const/4 v1, 0x3

    .line 114
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getDrawableWidth()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getDrawableHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private doInvalidateDrawable()V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 93
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 96
    :cond_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getDrawableHeight()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getDrawableWidth()I

    move-result v0

    if-ge v0, v1, :cond_1

    return-void

    .line 100
    :cond_1
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->currentHash()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLastHash:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 103
    :cond_2
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->currentHash()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLastHash:Ljava/lang/String;

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Asset;->getData()[B

    move-result-object v0

    if-eqz v0, :cond_3

    .line 106
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Asset;->getData()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->doInvalidateWithBytes([B)V

    goto :goto_0

    .line 107
    :cond_3
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Asset;->getUrl()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 108
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Asset;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->loadImage(Landroid/net/Uri;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private doInvalidateWithBytes([B)V
    .locals 3

    .line 126
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mDecoder:Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getDrawableWidth()I

    move-result v1

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getDrawableHeight()I

    move-result v2

    invoke-interface {v0, p1, v1, v2}, Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;->decodeImageWithin([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 128
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 130
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method private getDrawableHeight()I
    .locals 2

    .line 118
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method private getDrawableWidth()I
    .locals 2

    .line 122
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method private invalidateDrawable()V
    .locals 2

    .line 79
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->getHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/views/AssetImageView$2;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/views/AssetImageView$2;-><init>(Lcom/usebutton/sdk/internal/views/AssetImageView;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 88
    :cond_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->doInvalidateDrawable()V

    return-void
.end method

.method private loadImage(Landroid/net/Uri;)V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mUrl:Landroid/net/Uri;

    if-ne v0, p1, :cond_0

    return-void

    .line 144
    :cond_0
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mUrl:Landroid/net/Uri;

    .line 145
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLoadTask:Landroid/os/AsyncTask;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 146
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLoadTask:Landroid/os/AsyncTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 148
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    invoke-virtual {v0, p1, p0}, Lcom/usebutton/sdk/internal/ImageLoader;->load(Landroid/net/Uri;Landroid/widget/ImageView;)Landroid/os/AsyncTask;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLoadTask:Landroid/os/AsyncTask;

    return-void
.end method


# virtual methods
.method public loadAsset(Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    .line 136
    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    .line 137
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->doInvalidateDrawable()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 153
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 154
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    if-eqz v0, :cond_0

    .line 155
    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/ImageLoader;->stop(Landroid/widget/ImageView;)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 72
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    if-nez p1, :cond_0

    .line 73
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLastHash:Ljava/lang/String;

    if-nez p1, :cond_1

    .line 74
    :cond_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->invalidateDrawable()V

    :cond_1
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 63
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    if-ne p1, p3, :cond_0

    if-ne p2, p4, :cond_0

    .line 64
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mLastHash:Ljava/lang/String;

    if-eqz p1, :cond_0

    return-void

    .line 67
    :cond_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->invalidateDrawable()V

    return-void
.end method

.method public setAsset(Lcom/usebutton/sdk/internal/models/Asset;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    .line 58
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->invalidateDrawable()V

    return-void
.end method

.method public test_setDecoder(Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView;->mDecoder:Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;

    return-void
.end method
