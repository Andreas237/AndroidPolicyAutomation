.class public Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;
.super Lcom/usebutton/sdk/internal/api/models/BodyDTO;
.source "BodyDTO.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/api/models/BodyDTO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ProductDTO"
.end annotation


# instance fields
.field public final background:Ljava/lang/String;

.field public final description:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final images:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ImageDTO;",
            ">;"
        }
    .end annotation
.end field

.field public final padding:Z

.field public final subtitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

.field public final title:Lcom/usebutton/sdk/internal/api/models/TextDTO;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/util/List;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ImageDTO;",
            ">;",
            "Lcom/usebutton/sdk/internal/api/models/TextDTO;",
            "Lcom/usebutton/sdk/internal/api/models/TextDTO;",
            "Lcom/usebutton/sdk/internal/api/models/TextDTO;",
            ")V"
        }
    .end annotation

    .line 64
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/models/BodyDTO;-><init>()V

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->images:Ljava/util/List;

    .line 65
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->background:Ljava/lang/String;

    .line 66
    iput-boolean p2, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->padding:Z

    .line 67
    iget-object p1, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->images:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 68
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->title:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 69
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->subtitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 70
    iput-object p6, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->description:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BodyDTO;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "background"

    .line 77
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "color"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "padding"

    .line 78
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    .line 79
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "images"

    .line 80
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 81
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-nez v2, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    .line 84
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 85
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const-string/jumbo v0, "title_text"

    .line 87
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v7

    const-string/jumbo v0, "subtitle_text"

    .line 88
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v8

    const-string v0, "description_text"

    .line 89
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v9

    .line 90
    new-instance p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;

    move-object v3, p0

    invoke-direct/range {v3 .. v9}, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;-><init>(Ljava/lang/String;ZLjava/util/List;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V

    return-object p0
.end method
