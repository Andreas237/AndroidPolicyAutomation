.class public Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;
.super Lcom/usebutton/sdk/internal/api/models/BodyDTO;
.source "BodyDTO.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/api/models/BodyDTO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ListDTO"
.end annotation


# instance fields
.field public final groups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/GroupDTO;",
            ">;"
        }
    .end annotation
.end field

.field public final showHeadings:Z


# direct methods
.method public constructor <init>(ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/GroupDTO;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/models/BodyDTO;-><init>()V

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;->groups:Ljava/util/List;

    .line 36
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;->showHeadings:Z

    .line 37
    iget-object p1, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;->groups:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BodyDTO;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "groups"

    .line 44
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 45
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 48
    :cond_1
    new-instance v0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    const-string/jumbo v2, "show_group_titles"

    const/4 v3, 0x0

    .line 49
    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p0

    .line 50
    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/GroupDTO;->fromJson(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;-><init>(ZLjava/util/List;)V

    return-object v0

    :cond_2
    :goto_0
    return-object v0
.end method
