.class public Lcom/usebutton/sdk/internal/api/models/GroupDTO;
.super Ljava/lang/Object;
.source "GroupDTO.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;
    }
.end annotation


# instance fields
.field public final mItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;",
            ">;"
        }
    .end annotation
.end field

.field public final mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/models/TextDTO;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/api/models/TextDTO;",
            "Ljava/util/ArrayList<",
            "Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO;->mItems:Ljava/util/List;

    .line 18
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO;->mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 19
    iget-object p1, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO;->mItems:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/GroupDTO;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "title_text"

    .line 35
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "title_text"

    .line 36
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 38
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "items"

    .line 39
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    const/4 v2, 0x0

    .line 40
    :goto_1
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 41
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 43
    :cond_1
    new-instance p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO;

    invoke-direct {p0, v0, v1}, Lcom/usebutton/sdk/internal/api/models/GroupDTO;-><init>(Lcom/usebutton/sdk/internal/api/models/TextDTO;Ljava/util/ArrayList;)V

    return-object p0
.end method

.method public static fromJson(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/GroupDTO;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 28
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/GroupDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/GroupDTO;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
