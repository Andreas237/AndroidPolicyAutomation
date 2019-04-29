.class public Lcom/rt/mobile/english/ui/InVisionItem;
.super Ljava/lang/Object;
.source "InVisionItem.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "NewsItem"


# instance fields
.field private final copyright:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/rt/mobile/english/ui/InVisionItem;->id:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/rt/mobile/english/ui/InVisionItem;->title:Ljava/lang/String;

    .line 18
    iput-object p3, p0, Lcom/rt/mobile/english/ui/InVisionItem;->copyright:Ljava/lang/String;

    .line 19
    iput-object p4, p0, Lcom/rt/mobile/english/ui/InVisionItem;->image:Ljava/lang/String;

    return-void
.end method

.method public static fromJSON(Lorg/json/JSONObject;)Lcom/rt/mobile/english/ui/InVisionItem;
    .locals 5

    .line 61
    :try_start_0
    new-instance v0, Lcom/rt/mobile/english/ui/InVisionItem;

    const-string v1, "id"

    .line 62
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "title"

    .line 63
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "author"

    .line 64
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "author"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    const-string v4, "image"

    .line 65
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/rt/mobile/english/ui/InVisionItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 69
    invoke-static {p0}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    const-string v0, "NewsItem"

    const-string v1, "Could not instantiate object from JSON"

    .line 70
    invoke-static {v0, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 71
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public getCopyright()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionItem;->copyright:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionItem;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public toJSON()Lorg/json/JSONObject;
    .locals 3

    .line 45
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "id"

    .line 47
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionItem;->id:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "title"

    .line 48
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionItem;->title:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "author"

    .line 49
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionItem;->copyright:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "image"

    .line 50
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InVisionItem;->image:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 53
    invoke-static {v0}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    const-string v1, "NewsItem"

    const-string v2, "Could not serialize the object to JSON"

    .line 54
    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 40
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/InVisionItem;->toJSON()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
