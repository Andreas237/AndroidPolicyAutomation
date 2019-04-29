.class public Lcom/rt/mobile/english/ui/InVisionPictureItem;
.super Ljava/lang/Object;
.source "InVisionPictureItem.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "NewsItem"


# instance fields
.field private final author:Ljava/lang/String;

.field private final gallery:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final url:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->author:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->image:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->title:Ljava/lang/String;

    .line 21
    iput-object p4, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->id:Ljava/lang/String;

    .line 22
    iput-object p5, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->gallery:Ljava/lang/String;

    .line 23
    iput-object p6, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->url:Ljava/lang/String;

    return-void
.end method

.method public static fromJSON(Lorg/json/JSONObject;)Lcom/rt/mobile/english/ui/InVisionPictureItem;
    .locals 8

    .line 75
    :try_start_0
    new-instance v7, Lcom/rt/mobile/english/ui/InVisionPictureItem;

    const-string v0, "author"

    .line 76
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "image"

    .line 77
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "title"

    .line 78
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "id"

    .line 79
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "gallery"

    .line 80
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "url"

    .line 81
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/rt/mobile/english/ui/InVisionPictureItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v7

    :catch_0
    move-exception p0

    .line 85
    invoke-static {p0}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    const-string v0, "NewsItem"

    const-string v1, "Could not instantiate object from JSON"

    .line 86
    invoke-static {v0, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 87
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public getAuthor()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->author:Ljava/lang/String;

    return-object v0
.end method

.method public getGallery()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->gallery:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->url:Ljava/lang/String;

    return-object v0
.end method

.method public toJSON()Lorg/json/JSONObject;
    .locals 3

    .line 57
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "author"

    .line 59
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->author:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "image"

    .line 60
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->image:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "title"

    .line 61
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->title:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "id"

    .line 62
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->id:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "gallery"

    .line 63
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->gallery:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "url"

    .line 64
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionPictureItem;->url:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 67
    invoke-static {v0}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    const-string v1, "NewsItem"

    const-string v2, "Could not serialize the object to JSON"

    .line 68
    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/InVisionPictureItem;->toJSON()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
