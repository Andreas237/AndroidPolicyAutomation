.class public Lcom/usebutton/sdk/internal/api/models/TextDTO;
.super Ljava/lang/Object;
.source "TextDTO.java"


# instance fields
.field public final mColor:Ljava/lang/String;

.field public final mText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/TextDTO;->mColor:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/TextDTO;->mText:Ljava/lang/String;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p0, :cond_1

    const-string v0, "text"

    .line 16
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/api/models/TextDTO;

    const-string v1, "color"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "text"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
