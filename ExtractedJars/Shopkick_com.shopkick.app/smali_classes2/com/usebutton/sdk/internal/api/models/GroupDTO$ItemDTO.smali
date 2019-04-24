.class public Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;
.super Ljava/lang/Object;
.source "GroupDTO.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/api/models/GroupDTO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ItemDTO"
.end annotation


# instance fields
.field public final mAction:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

.field public final mIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mIconText:Lcom/usebutton/sdk/internal/api/models/TextDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mSubtitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/models/LinkDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/ImageDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mAction:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    .line 59
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 60
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mSubtitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 61
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    .line 62
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mIconText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 66
    new-instance v6, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;

    const-string v0, "actions"

    .line 67
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/LinkDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    move-result-object v1

    const-string/jumbo v0, "title_text"

    .line 68
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v2

    const-string/jumbo v0, "subtitle_text"

    .line 69
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v3

    const-string v0, "icon_image"

    .line 70
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    move-result-object v4

    const-string v0, "icon_text"

    .line 71
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/TextDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/TextDTO;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;-><init>(Lcom/usebutton/sdk/internal/api/models/LinkDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;Lcom/usebutton/sdk/internal/api/models/ImageDTO;Lcom/usebutton/sdk/internal/api/models/TextDTO;)V

    return-object v6
.end method
