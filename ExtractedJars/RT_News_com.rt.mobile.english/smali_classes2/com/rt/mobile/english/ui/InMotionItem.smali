.class public Lcom/rt/mobile/english/ui/InMotionItem;
.super Ljava/lang/Object;
.source "InMotionItem.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ShowsItem"


# instance fields
.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final summary:Ljava/lang/String;

.field private final time:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final url:Ljava/lang/String;

.field private final video_size:Ljava/lang/String;

.field private final video_url:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/rt/mobile/english/ui/InMotionItem;->id:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/rt/mobile/english/ui/InMotionItem;->title:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lcom/rt/mobile/english/ui/InMotionItem;->time:Ljava/lang/String;

    .line 23
    iput-object p4, p0, Lcom/rt/mobile/english/ui/InMotionItem;->imageUrl:Ljava/lang/String;

    .line 24
    iput-object p5, p0, Lcom/rt/mobile/english/ui/InMotionItem;->url:Ljava/lang/String;

    .line 25
    iput-object p6, p0, Lcom/rt/mobile/english/ui/InMotionItem;->summary:Ljava/lang/String;

    .line 26
    iput-object p7, p0, Lcom/rt/mobile/english/ui/InMotionItem;->video_url:Ljava/lang/String;

    .line 27
    iput-object p8, p0, Lcom/rt/mobile/english/ui/InMotionItem;->video_size:Ljava/lang/String;

    return-void
.end method

.method public static fromJSON(Lorg/json/JSONObject;)Lcom/rt/mobile/english/ui/InMotionItem;
    .locals 11

    :try_start_0
    const-string v0, "video"

    .line 90
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "video"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 91
    :goto_0
    new-instance v10, Lcom/rt/mobile/english/ui/InMotionItem;

    const-string v1, "id"

    .line 92
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v1, "title"

    .line 93
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "time"

    .line 94
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "image"

    .line 95
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "image"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const-string v1, ""

    :goto_1
    move-object v5, v1

    const-string v1, "url"

    .line 96
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "url"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    const-string v1, ""

    :goto_2
    move-object v6, v1

    const-string v1, "summary"

    .line 97
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "summary"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_3
    const-string p0, ""

    :goto_3
    move-object v7, p0

    const-string p0, "url"

    .line 98
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "url"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_4

    :cond_4
    const-string p0, ""

    :goto_4
    move-object v8, p0

    const-string p0, "size"

    .line 99
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "size"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_5

    :cond_5
    const-string p0, ""

    :goto_5
    move-object v9, p0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lcom/rt/mobile/english/ui/InMotionItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v10

    :catch_0
    move-exception p0

    .line 103
    invoke-static {p0}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    const-string v0, "ShowsItem"

    const-string v1, "Could not instantiate object from JSON"

    .line 104
    invoke-static {v0, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 105
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InMotionItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InMotionItem;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSummary()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InMotionItem;->summary:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InMotionItem;->time:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InMotionItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InMotionItem;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoSize()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InMotionItem;->video_size:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoUrl()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InMotionItem;->video_url:Ljava/lang/String;

    return-object v0
.end method

.method public toJSON()Lorg/json/JSONObject;
    .locals 3

    .line 69
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "id"

    .line 71
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InMotionItem;->id:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "title"

    .line 72
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InMotionItem;->title:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "image"

    .line 73
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InMotionItem;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "time"

    .line 74
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InMotionItem;->time:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "url"

    .line 75
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InMotionItem;->url:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "summary"

    .line 76
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InMotionItem;->summary:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "url"

    .line 77
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InMotionItem;->video_url:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "size"

    .line 78
    iget-object v2, p0, Lcom/rt/mobile/english/ui/InMotionItem;->video_size:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 81
    invoke-static {v0}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    const-string v1, "ShowsItem"

    const-string v2, "Could not serialize the object to JSON"

    .line 82
    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 83
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 64
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/InMotionItem;->toJSON()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
