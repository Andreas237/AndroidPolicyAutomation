.class public Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;
.super Ljava/lang/Object;
.source "WearImageLoaderDaemon.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/wearable/MessageApi$MessageListener;
.implements Lcom/google/android/gms/wearable/DataApi$DataListener;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;
    }
.end annotation


# static fields
.field private static final DEFAULT_PATH:Ljava/lang/String; = "/WearImageLoader/"

.field private static INSTANCE:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon; = null

.field private static final MESSAGE_WEARIMAGELOADER:Ljava/lang/String; = "/WearImageLoader/"

.field private static final TAG:Ljava/lang/String;

.field private static final WEARIMAGELOADER_PATH:Ljava/lang/String; = "/WearImageLoader/"


# instance fields
.field private imageAssetName:Ljava/lang/String;

.field private mApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private mCallBack:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

.field private mContext:Landroid/content/Context;

.field private mUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "image"

    .line 38
    iput-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->imageAssetName:Ljava/lang/String;

    .line 46
    iput-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mContext:Landroid/content/Context;

    .line 48
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object p1, Lcom/google/android/gms/wearable/Wearable;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    iput-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 54
    iget-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 28
    sget-object v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->sentBitmap(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->generatePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 0

    .line 28
    iget-object p0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object p0
.end method

.method static synthetic access$400(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;
    .locals 0

    .line 28
    iget-object p0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mCallBack:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

    return-object p0
.end method

.method static synthetic access$500(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->sendImage(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static createAssetFromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/wearable/Asset;
    .locals 3

    .line 93
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 94
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 95
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/wearable/Asset;->createFromBytes([B)Lcom/google/android/gms/wearable/Asset;

    move-result-object p0

    return-object p0
.end method

.method private generatePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p2, :cond_0

    .line 123
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "/WearImageLoader/"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method private sendImage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 99
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lde/mdxdave/WearImageLoader/daemon/ResizeTransformation;

    const/16 v2, 0x12c

    invoke-direct {v1, v2}, Lde/mdxdave/WearImageLoader/daemon/ResizeTransformation;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;

    invoke-direct {v1, p0, p1, p2}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;-><init>(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Lcom/squareup/picasso/Target;)V

    return-void
.end method

.method private sentBitmap(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 130
    invoke-static {p1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->createAssetFromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/wearable/Asset;

    move-result-object p1

    .line 132
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

    invoke-direct {v1, p0, p2, p3, p1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;-><init>(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 175
    :cond_0
    iget-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mCallBack:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

    if-eqz p1, :cond_1

    .line 176
    iget-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mCallBack:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

    invoke-interface {p1, p2, p3}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;->onBitmapError(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static with(Landroid/content/Context;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;
    .locals 1

    .line 59
    sget-object v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->INSTANCE:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    if-nez v0, :cond_0

    .line 60
    new-instance v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-direct {v0, p0}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;-><init>(Landroid/content/Context;)V

    sput-object v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->INSTANCE:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    :cond_0
    if-eqz p0, :cond_1

    .line 62
    sget-object v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->INSTANCE:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    iput-object p0, v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mContext:Landroid/content/Context;

    .line 63
    :cond_1
    sget-object p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->INSTANCE:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    return-object p0
.end method


# virtual methods
.method public callBack(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;
    .locals 0

    .line 181
    iput-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mCallBack:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

    return-object p0
.end method

.method public getBitmapFromURL(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    .line 77
    :try_start_0
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/picasso/RequestCreator;->get()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 82
    sget-object v1, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "image getted "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 87
    sget-object v1, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getImage error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public getImageAssetName()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->imageAssetName:Ljava/lang/String;

    return-object v0
.end method

.method public handleMessage(Lcom/google/android/gms/wearable/MessageEvent;)V
    .locals 3

    .line 242
    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/WearImageLoader/"

    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 245
    new-instance v0, Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageEvent;->getData()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    const-string p1, "http"

    .line 246
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "www"

    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 247
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 249
    invoke-virtual {p0, v0}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->load(Ljava/lang/String;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/WearImageLoader/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->into(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public into(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 196
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 197
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mUrl:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 198
    sget-object p1, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->TAG:Ljava/lang/String;

    const-string v0, "must execute .load(url) before"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 200
    :cond_0
    sget-object v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "load "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mUrl:Ljava/lang/String;

    .line 205
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$3;

    invoke-direct {v2, p0, v0, p1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$3;-><init>(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public load(Ljava/lang/String;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;
    .locals 0

    .line 187
    iput-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mUrl:Ljava/lang/String;

    return-object p0
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 1

    .line 217
    sget-object p1, Lcom/google/android/gms/wearable/Wearable;->MessageApi:Lcom/google/android/gms/wearable/MessageApi;

    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/wearable/MessageApi;->addListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/MessageApi$MessageListener;)Lcom/google/android/gms/common/api/PendingResult;

    .line 218
    sget-object p1, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->mApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/wearable/DataApi;->addListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;)Lcom/google/android/gms/common/api/PendingResult;

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method

.method public onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    .locals 1

    .line 233
    sget-object v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onMessageReceived(Lcom/google/android/gms/wearable/MessageEvent;)V
    .locals 1

    .line 228
    sget-object v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public send()V
    .locals 1

    const/4 v0, 0x0

    .line 192
    invoke-virtual {p0, v0}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->into(Ljava/lang/String;)V

    return-void
.end method

.method public setImageAssetName(Ljava/lang/String;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;
    .locals 0

    .line 71
    iput-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->imageAssetName:Ljava/lang/String;

    return-object p0
.end method
