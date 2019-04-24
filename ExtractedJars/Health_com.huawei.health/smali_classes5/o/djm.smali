.class public Lo/djm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lo/djm;->a:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lo/djm;->c:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lo/djm;->d:I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 40
    iput p1, p0, Lo/djm;->d:I

    .line 41
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 4

    .line 49
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 51
    const-string v0, "supportBusiness"

    :try_start_0
    iget-object v1, p0, Lo/djm;->a:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    const-string v0, "supportIssuers"

    iget-object v1, p0, Lo/djm;->c:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    const-string v0, "supportDefautcard"

    iget v1, p0, Lo/djm;->d:I

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    goto :goto_0

    .line 55
    :catch_0
    move-exception v3

    .line 56
    const/4 v2, 0x0

    .line 58
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lo/djm;->c:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lo/djm;->a:Ljava/lang/String;

    .line 25
    return-void
.end method
