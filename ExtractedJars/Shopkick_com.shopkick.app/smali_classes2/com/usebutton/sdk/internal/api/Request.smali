.class public abstract Lcom/usebutton/sdk/internal/api/Request;
.super Ljava/lang/Object;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/api/Request$Put;,
        Lcom/usebutton/sdk/internal/api/Request$Post;,
        Lcom/usebutton/sdk/internal/api/Request$Get;
    }
.end annotation


# static fields
.field private static final KEY_BODY:Ljava/lang/String; = "body"

.field private static final KEY_HEADERS:Ljava/lang/String; = "headers"

.field private static final KEY_HEADERS_KEY:Ljava/lang/String; = "header-key"

.field private static final KEY_HEADERS_VALUE:Ljava/lang/String; = "header-value"

.field private static final KEY_ID:Ljava/lang/String; = "id"

.field private static final KEY_METHOD:Ljava/lang/String; = "method"

.field private static final KEY_URL:Ljava/lang/String; = "url"


# instance fields
.field private mHeaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private mRequestId:Ljava/lang/String;

.field private mUrl:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/Request;->mHeaders:Ljava/util/List;

    .line 37
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/Request;->mUrl:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/Request;->mHeaders:Ljava/util/List;

    .line 33
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/Request;->mUrl:Landroid/net/Uri;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/api/Request;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/api/Request;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Request;->mUrl:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/Request;->mUrl:Landroid/net/Uri;

    return-void
.end method

.method public static read(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request;
    .locals 6
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 100
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "method"

    .line 101
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "POST"

    .line 102
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 103
    new-instance p0, Lcom/usebutton/sdk/internal/api/Request$Post;

    const-string/jumbo v0, "url"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v2, "GET"

    .line 104
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 105
    new-instance p0, Lcom/usebutton/sdk/internal/api/Request$Get;

    const-string/jumbo v0, "url"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/Request$Get;-><init>(Ljava/lang/String;)V

    :goto_0
    const-string v0, "headers"

    .line 110
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v2, 0x0

    :goto_1
    if-eqz v0, :cond_2

    .line 111
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 112
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "header-key"

    .line 113
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "header-value"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v4, v3}, Lcom/usebutton/sdk/internal/api/Request;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 115
    :cond_2
    instance-of v0, p0, Lcom/usebutton/sdk/internal/api/Request$Post;

    if-eqz v0, :cond_3

    const-string v0, "body"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "body"

    .line 116
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    move-object v2, p0

    check-cast v2, Lcom/usebutton/sdk/internal/api/Request$Post;

    invoke-virtual {v2, v0}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Post;

    :cond_3
    const-string v0, "id"

    .line 119
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/api/Request;->setRequestId(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_4
    return-object v0

    :catch_0
    move-exception p0

    .line 121
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method addHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Request;->mHeaders:Ljava/util/List;

    new-instance v1, Lcom/usebutton/sdk/internal/functional/Pair;

    invoke-direct {v1, p1, p2}, Lcom/usebutton/sdk/internal/functional/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract body()Ljava/lang/String;
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Request;->mRequestId:Ljava/lang/String;

    return-object v0
.end method

.method public headers()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Request;->mHeaders:Ljava/util/List;

    return-object v0
.end method

.method public abstract method()Ljava/lang/String;
.end method

.method public setRequestId(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/Request;->mRequestId:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{mUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/Request;->mUrl:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mHeaders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/Request;->mHeaders:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/Request;->method()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", body="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/Request;->body()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public url()Landroid/net/Uri;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Request;->mUrl:Landroid/net/Uri;

    return-object v0
.end method

.method public write(Ljava/io/StringWriter;)V
    .locals 7
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 68
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "method"

    .line 70
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/Request;->method()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v1, "url"

    .line 71
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/Request;->url()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "id"

    .line 72
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/Request;->getRequestId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 v1, 0x0

    .line 75
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/Request;->mHeaders:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/usebutton/sdk/internal/functional/Pair;

    if-nez v1, :cond_0

    .line 77
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    const-string v4, "headers"

    .line 78
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    const/4 v4, 0x4

    .line 80
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "header-key"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    .line 81
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/functional/Pair;->first()Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    const-string v6, "header-value"

    aput-object v6, v4, v5

    const/4 v5, 0x3

    .line 82
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/functional/Pair;->second()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v4, v5

    .line 80
    invoke-static {v4}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_1
    const-string v1, "body"

    .line 84
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/Request;->body()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/io/StringWriter;

    return-void

    :catch_0
    move-exception p1

    .line 86
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
