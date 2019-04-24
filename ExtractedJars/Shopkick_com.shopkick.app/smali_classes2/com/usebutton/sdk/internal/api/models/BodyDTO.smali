.class public abstract Lcom/usebutton/sdk/internal/api/models/BodyDTO;
.super Ljava/lang/Object;
.source "BodyDTO.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;,
        Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BodyDTO;
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "product"

    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 22
    invoke-static {p1}, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BodyDTO;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v1, "list"

    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 24
    invoke-static {p1}, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BodyDTO;

    move-result-object p0

    return-object p0

    :cond_2
    const-string p1, "Didn\'t know how to parse body of type: %s"

    const/4 v1, 0x1

    .line 26
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {p1, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method
