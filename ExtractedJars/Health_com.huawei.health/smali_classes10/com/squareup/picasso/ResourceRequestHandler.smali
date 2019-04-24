.class Lcom/squareup/picasso/ResourceRequestHandler;
.super Lcom/squareup/picasso/RequestHandler;
.source "SourceFile"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/squareup/picasso/RequestHandler;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/squareup/picasso/ResourceRequestHandler;->context:Landroid/content/Context;

    .line 32
    return-void
.end method

.method private static decodeResource(Landroid/content/res/Resources;ILcom/squareup/picasso/Request;)Landroid/graphics/Bitmap;
    .locals 3

    .line 49
    invoke-static {p2}, Lcom/squareup/picasso/ResourceRequestHandler;->createBitmapOptions(Lcom/squareup/picasso/Request;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v2

    .line 50
    invoke-static {v2}, Lcom/squareup/picasso/ResourceRequestHandler;->requiresInSampleSize(Landroid/graphics/BitmapFactory$Options;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    invoke-static {p0, p1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 52
    iget v0, p2, Lcom/squareup/picasso/Request;->targetWidth:I

    iget v1, p2, Lcom/squareup/picasso/Request;->targetHeight:I

    invoke-static {v0, v1, v2, p2}, Lcom/squareup/picasso/ResourceRequestHandler;->calculateInSampleSize(IILandroid/graphics/BitmapFactory$Options;Lcom/squareup/picasso/Request;)V

    .line 54
    :cond_0
    invoke-static {p0, p1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public canHandleRequest(Lcom/squareup/picasso/Request;)Z
    .locals 2

    .line 35
    iget v0, p1, Lcom/squareup/picasso/Request;->resourceId:I

    if-eqz v0, :cond_0

    .line 36
    const/4 v0, 0x1

    return v0

    .line 39
    :cond_0
    const-string v0, "android.resource"

    iget-object v1, p1, Lcom/squareup/picasso/Request;->uri:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public load(Lcom/squareup/picasso/Request;I)Lcom/squareup/picasso/RequestHandler$Result;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/squareup/picasso/ResourceRequestHandler;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/squareup/picasso/Utils;->getResources(Landroid/content/Context;Lcom/squareup/picasso/Request;)Landroid/content/res/Resources;

    move-result-object v3

    .line 44
    invoke-static {v3, p1}, Lcom/squareup/picasso/Utils;->getResourceId(Landroid/content/res/Resources;Lcom/squareup/picasso/Request;)I

    move-result v4

    .line 45
    new-instance v0, Lcom/squareup/picasso/RequestHandler$Result;

    invoke-static {v3, v4, p1}, Lcom/squareup/picasso/ResourceRequestHandler;->decodeResource(Landroid/content/res/Resources;ILcom/squareup/picasso/Request;)Landroid/graphics/Bitmap;

    move-result-object v1

    sget-object v2, Lcom/squareup/picasso/Picasso$LoadedFrom;->DISK:Lcom/squareup/picasso/Picasso$LoadedFrom;

    invoke-direct {v0, v1, v2}, Lcom/squareup/picasso/RequestHandler$Result;-><init>(Landroid/graphics/Bitmap;Lcom/squareup/picasso/Picasso$LoadedFrom;)V

    return-object v0
.end method
