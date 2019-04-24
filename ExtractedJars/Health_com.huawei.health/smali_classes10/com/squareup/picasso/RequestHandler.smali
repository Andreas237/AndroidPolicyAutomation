.class public abstract Lcom/squareup/picasso/RequestHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/picasso/RequestHandler$Result;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    return-void
.end method

.method static calculateInSampleSize(IIIILandroid/graphics/BitmapFactory$Options;Lcom/squareup/picasso/Request;)V
    .locals 5

    .line 157
    const/4 v2, 0x1

    .line 158
    if-gt p3, p1, :cond_0

    if-le p2, p0, :cond_4

    .line 161
    :cond_0
    if-nez p1, :cond_1

    .line 162
    int-to-float v0, p2

    int-to-float v1, p0

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v2, v0

    goto :goto_0

    .line 163
    :cond_1
    if-nez p0, :cond_2

    .line 164
    int-to-float v0, p3

    int-to-float v1, p1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v2, v0

    goto :goto_0

    .line 166
    :cond_2
    int-to-float v0, p3

    int-to-float v1, p1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v3, v0

    .line 167
    int-to-float v0, p2

    int-to-float v1, p0

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v4, v0

    .line 168
    iget-boolean v0, p5, Lcom/squareup/picasso/Request;->centerInside:Z

    if-eqz v0, :cond_3

    .line 169
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_0

    .line 170
    :cond_3
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 173
    :cond_4
    :goto_0
    iput v2, p4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 175
    return-void
.end method

.method static calculateInSampleSize(IILandroid/graphics/BitmapFactory$Options;Lcom/squareup/picasso/Request;)V
    .locals 6

    .line 151
    move v0, p0

    move v1, p1

    iget v2, p2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v3, p2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lcom/squareup/picasso/RequestHandler;->calculateInSampleSize(IIIILandroid/graphics/BitmapFactory$Options;Lcom/squareup/picasso/Request;)V

    .line 153
    return-void
.end method

.method static createBitmapOptions(Lcom/squareup/picasso/Request;)Landroid/graphics/BitmapFactory$Options;
    .locals 4

    .line 132
    invoke-virtual {p0}, Lcom/squareup/picasso/Request;->hasSize()Z

    move-result v1

    .line 133
    iget-object v0, p0, Lcom/squareup/picasso/Request;->config:Landroid/graphics/Bitmap$Config;

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 134
    :goto_0
    const/4 v3, 0x0

    .line 135
    if-nez v1, :cond_1

    if-eqz v2, :cond_2

    .line 136
    :cond_1
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 137
    iput-boolean v1, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 138
    if-eqz v2, :cond_2

    .line 139
    iget-object v0, p0, Lcom/squareup/picasso/Request;->config:Landroid/graphics/Bitmap$Config;

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 142
    :cond_2
    return-object v3
.end method

.method static requiresInSampleSize(Landroid/graphics/BitmapFactory$Options;)Z
    .locals 1

    .line 146
    if-eqz p0, :cond_0

    iget-boolean v0, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public abstract canHandleRequest(Lcom/squareup/picasso/Request;)Z
.end method

.method getRetryCount()I
    .locals 1

    .line 116
    const/4 v0, 0x0

    return v0
.end method

.method public abstract load(Lcom/squareup/picasso/Request;I)Lcom/squareup/picasso/RequestHandler$Result;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method shouldRetry(ZLandroid/net/NetworkInfo;)Z
    .locals 1

    .line 120
    const/4 v0, 0x0

    return v0
.end method

.method supportsReplay()Z
    .locals 1

    .line 124
    const/4 v0, 0x0

    return v0
.end method
