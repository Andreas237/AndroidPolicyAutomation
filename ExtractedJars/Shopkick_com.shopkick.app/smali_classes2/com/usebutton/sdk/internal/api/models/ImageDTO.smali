.class public Lcom/usebutton/sdk/internal/api/models/ImageDTO;
.super Ljava/lang/Object;
.source "ImageDTO.java"


# instance fields
.field public final mFillMode:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mScale:D

.field public final mUrl:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ljava/lang/String;DLandroid/net/Uri;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->mFillMode:Ljava/lang/String;

    .line 17
    iput-wide p2, p0, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->mScale:D

    .line 18
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->mUrl:Landroid/net/Uri;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/ImageDTO;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 25
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    const-string v1, "fill_mode"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "scale"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-string/jumbo v4, "url"

    invoke-static {p0, v4}, Lcom/usebutton/sdk/internal/api/models/BaseDTO;->uriOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/usebutton/sdk/internal/api/models/ImageDTO;-><init>(Ljava/lang/String;DLandroid/net/Uri;)V

    return-object v0
.end method
