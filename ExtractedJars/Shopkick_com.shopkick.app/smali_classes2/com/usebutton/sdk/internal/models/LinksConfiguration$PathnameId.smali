.class Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;
.super Ljava/lang/Object;
.source "LinksConfiguration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/models/LinksConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "PathnameId"
.end annotation


# instance fields
.field private final guaranteedAction:Z

.field private final matches:[[Ljava/lang/String;

.field private final regex:Ljava/util/regex/Pattern;


# direct methods
.method constructor <init>(Ljava/util/regex/Pattern;[[Ljava/lang/String;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 326
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 327
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->regex:Ljava/util/regex/Pattern;

    .line 328
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->matches:[[Ljava/lang/String;

    const/4 p1, 0x1

    .line 329
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->guaranteedAction:Z

    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "regex"

    .line 320
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->regex:Ljava/util/regex/Pattern;

    .line 321
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->parseMatches(Lorg/json/JSONObject;)[[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->matches:[[Ljava/lang/String;

    const-string v0, "guaranteed_action"

    const/4 v1, 0x1

    .line 322
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->guaranteedAction:Z

    return-void
.end method

.method private parseMatches(Lorg/json/JSONObject;)[[Ljava/lang/String;
    .locals 7
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "matches"

    .line 355
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 356
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_3

    .line 360
    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    new-array v1, v1, [[Ljava/lang/String;

    move v2, v0

    .line 361
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 362
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string/jumbo v4, "values"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-nez v3, :cond_1

    .line 364
    new-array v3, v0, [Ljava/lang/String;

    aput-object v3, v1, v2

    goto :goto_2

    .line 368
    :cond_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    new-array v4, v4, [Ljava/lang/String;

    aput-object v4, v1, v2

    move v4, v0

    .line 369
    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v4, v5, :cond_2

    .line 370
    aget-object v5, v1, v2

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1

    .line 357
    :cond_4
    :goto_3
    filled-new-array {v0, v0}, [I

    move-result-object p1

    const-class v0, Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method getMatches()[[Ljava/lang/String;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->matches:[[Ljava/lang/String;

    return-object v0
.end method

.method getRegex()Ljava/util/regex/Pattern;
    .locals 1

    .line 338
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->regex:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method isGuaranteedAction()Z
    .locals 1

    .line 351
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->guaranteedAction:Z

    return v0
.end method
