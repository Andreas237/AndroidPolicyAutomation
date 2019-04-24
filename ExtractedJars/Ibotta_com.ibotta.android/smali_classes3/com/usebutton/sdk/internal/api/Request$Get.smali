.class public Lcom/usebutton/sdk/internal/api/Request$Get;
.super Lcom/usebutton/sdk/internal/api/Request;
.source "Request.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/api/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Get"
.end annotation


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 0

    .line 134
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/api/Request;-><init>(Landroid/net/Uri;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/api/Request;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private stripTrailingZeros(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 175
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 176
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    move v4, v1

    move v1, v0

    move v0, v4

    if-lez v0, :cond_1

    add-int/lit8 v2, v0, -0x1

    .line 177
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2e

    if-ne v2, v3, :cond_0

    goto :goto_1

    .line 179
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-ne v2, v3, :cond_1

    add-int/lit8 v1, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v0, 0x0

    .line 185
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public body()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public method()Ljava/lang/String;
    .locals 1

    const-string v0, "GET"

    return-object v0
.end method

.method public withParameter(Ljava/lang/String;D)Lcom/usebutton/sdk/internal/api/Request$Get;
    .locals 3

    .line 189
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%f"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    const/4 p3, 0x0

    aput-object p2, v2, p3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/api/Request$Get;->stripTrailingZeros(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    move-result-object p1

    return-object p1
.end method

.method public withParameter(Ljava/lang/String;F)Lcom/usebutton/sdk/internal/api/Request$Get;
    .locals 4

    .line 162
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%f"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/api/Request$Get;->stripTrailingZeros(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    move-result-object p1

    return-object p1
.end method

.method public withParameter(Ljava/lang/String;I)Lcom/usebutton/sdk/internal/api/Request$Get;
    .locals 4

    .line 158
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    move-result-object p1

    return-object p1
.end method

.method public withParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;
    .locals 0

    .line 148
    invoke-static {p0, p1, p2}, Lcom/usebutton/sdk/internal/api/Request;->access$000(Lcom/usebutton/sdk/internal/api/Request;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public withParameter(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Get;
    .locals 1

    .line 193
    instance-of v0, p2, Lorg/json/JSONObject;

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    check-cast p2, Lorg/json/JSONObject;

    invoke-static {p2}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->toString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    move-result-object p1

    return-object p1
.end method

.method public withParameter(Ljava/lang/String;Z)Lcom/usebutton/sdk/internal/api/Request$Get;
    .locals 0

    .line 166
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    move-result-object p1

    return-object p1
.end method

.method public withParameterIfNotNull(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;
    .locals 0

    if-nez p2, :cond_0

    return-object p0

    .line 154
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    move-result-object p1

    return-object p1
.end method
