.class public Lcom/usebutton/sdk/internal/api/models/LinkDTO;
.super Ljava/lang/Object;
.source "LinkDTO.java"


# instance fields
.field public appLink:Landroid/net/Uri;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public browserLink:Landroid/net/Uri;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/LinkDTO;->appLink:Landroid/net/Uri;

    .line 18
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/LinkDTO;->browserLink:Landroid/net/Uri;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/LinkDTO;
    .locals 3
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 26
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    const-string v1, "app_link"

    invoke-static {p0, v1}, Lcom/usebutton/sdk/internal/api/models/BaseDTO;->uriOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "browser_link"

    invoke-static {p0, v2}, Lcom/usebutton/sdk/internal/api/models/BaseDTO;->uriOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/usebutton/sdk/internal/api/models/LinkDTO;-><init>(Landroid/net/Uri;Landroid/net/Uri;)V

    return-object v0
.end method
