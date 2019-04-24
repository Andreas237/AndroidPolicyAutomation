.class public Lcom/usebutton/sdk/internal/api/models/AppActionDTO;
.super Lcom/usebutton/sdk/internal/api/models/BaseDTO;
.source "AppActionDTO.java"


# static fields
.field private static final KEY_AUTH:Ljava/lang/String; = "auth_challenge"

.field private static final KEY_BODY:Ljava/lang/String; = "body"

.field private static final KEY_BROWSER:Ljava/lang/String; = "browser"

.field private static final KEY_CARD:Ljava/lang/String; = "card"

.field private static final KEY_FOOTER:Ljava/lang/String; = "footer"

.field private static final KEY_HEADER:Ljava/lang/String; = "header"

.field private static final KEY_LINKS:Ljava/lang/String; = "links"

.field private static final KEY_META:Ljava/lang/String; = "meta"

.field private static final KEY_PREVIEW:Ljava/lang/String; = "preview"

.field private static final KEY_TYPE:Ljava/lang/String; = "type"


# instance fields
.field public final mAuthChallenge:Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public mBrowser:Lcom/usebutton/sdk/internal/api/models/BrowserDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mFooter:Lcom/usebutton/sdk/internal/api/models/FooterDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mHeader:Lcom/usebutton/sdk/internal/api/models/HeaderDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mLinks:Lcom/usebutton/sdk/internal/api/models/LinkDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mList:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final mPreview:Lcom/usebutton/sdk/internal/api/models/PreviewDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mProduct:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final mType:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/models/MetaDTO;Lcom/usebutton/sdk/internal/api/models/PreviewDTO;Lcom/usebutton/sdk/internal/api/models/HeaderDTO;Lcom/usebutton/sdk/internal/api/models/BodyDTO;Lcom/usebutton/sdk/internal/api/models/FooterDTO;Lcom/usebutton/sdk/internal/api/models/BrowserDTO;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;Lcom/usebutton/sdk/internal/api/models/LinkDTO;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/api/models/MetaDTO;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/api/models/PreviewDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/internal/api/models/HeaderDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/usebutton/sdk/internal/api/models/BodyDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/usebutton/sdk/internal/api/models/FooterDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/usebutton/sdk/internal/api/models/BrowserDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Lcom/usebutton/sdk/internal/api/models/LinkDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/models/BaseDTO;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    .line 42
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mPreview:Lcom/usebutton/sdk/internal/api/models/PreviewDTO;

    .line 43
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mHeader:Lcom/usebutton/sdk/internal/api/models/HeaderDTO;

    .line 44
    iput-object p7, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mType:Ljava/lang/String;

    .line 45
    instance-of p1, p4, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 46
    check-cast p4, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mList:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    .line 47
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mProduct:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;

    goto :goto_0

    .line 48
    :cond_0
    instance-of p1, p4, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;

    if-eqz p1, :cond_1

    .line 49
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mList:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    .line 50
    check-cast p4, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;

    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mProduct:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;

    goto :goto_0

    .line 52
    :cond_1
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mList:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    .line 53
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mProduct:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;

    .line 55
    :goto_0
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mFooter:Lcom/usebutton/sdk/internal/api/models/FooterDTO;

    .line 56
    iput-object p6, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mBrowser:Lcom/usebutton/sdk/internal/api/models/BrowserDTO;

    .line 57
    iput-object p8, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mAuthChallenge:Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;

    .line 58
    iput-object p9, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mLinks:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/AppActionDTO;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const-string v1, "meta"

    .line 62
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v1, "meta"

    .line 66
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    move-result-object v3

    const-string v1, "preview"

    .line 67
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/PreviewDTO;

    move-result-object v4

    const-string v1, "browser"

    .line 68
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BrowserDTO;

    move-result-object v8

    const-string v1, "card"

    .line 69
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "auth_challenge"

    .line 70
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;

    move-result-object v10

    const-string v2, "links"

    .line 71
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/LinkDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    move-result-object v11

    if-eqz v1, :cond_1

    const-string/jumbo p0, "type"

    .line 78
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string p0, "header"

    .line 79
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/internal/api/models/HeaderDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/HeaderDTO;

    move-result-object p0

    const-string/jumbo v2, "type"

    .line 80
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "body"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/usebutton/sdk/internal/api/models/BodyDTO;->fromJson(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/BodyDTO;

    move-result-object v2

    const-string v5, "footer"

    .line 81
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/FooterDTO;

    move-result-object v1

    move-object v5, p0

    move-object v9, v0

    move-object v7, v1

    move-object v6, v2

    goto :goto_0

    :cond_1
    move-object v5, v0

    move-object v6, v5

    move-object v7, v6

    move-object v9, v7

    .line 84
    :goto_0
    new-instance p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;

    move-object v2, p0

    invoke-direct/range {v2 .. v11}, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;-><init>(Lcom/usebutton/sdk/internal/api/models/MetaDTO;Lcom/usebutton/sdk/internal/api/models/PreviewDTO;Lcom/usebutton/sdk/internal/api/models/HeaderDTO;Lcom/usebutton/sdk/internal/api/models/BodyDTO;Lcom/usebutton/sdk/internal/api/models/FooterDTO;Lcom/usebutton/sdk/internal/api/models/BrowserDTO;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;Lcom/usebutton/sdk/internal/api/models/LinkDTO;)V

    return-object p0

    :cond_2
    :goto_1
    return-object v0
.end method
