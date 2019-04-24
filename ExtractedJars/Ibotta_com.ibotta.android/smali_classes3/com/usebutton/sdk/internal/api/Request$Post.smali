.class public Lcom/usebutton/sdk/internal/api/Request$Post;
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
    name = "Post"
.end annotation


# instance fields
.field private mBody:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 206
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/api/Request;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public body()Ljava/lang/String;
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Request$Post;->mBody:Ljava/lang/String;

    return-object v0
.end method

.method public method()Ljava/lang/String;
    .locals 1

    const-string v0, "POST"

    return-object v0
.end method

.method public withBody(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Post;
    .locals 0

    .line 226
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/Request$Post;->mBody:Ljava/lang/String;

    return-object p0
.end method

.method public withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;
    .locals 2

    const-string v0, "Content-Type"

    const-string v1, "application/json"

    .line 220
    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/api/Request$Post;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    instance-of v0, p1, Lorg/json/JSONObject;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->toString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/Request$Post;->mBody:Ljava/lang/String;

    return-object p0
.end method
