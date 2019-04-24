.class public Lo/drn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:I

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const-class v0, Lo/drn;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drn;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/drn;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    .line 64
    invoke-static {p1}, Lo/dsh;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/drn;->e:I

    .line 66
    iget v0, p0, Lo/drn;->e:I

    const/16 v1, 0x198

    if-ne v1, v0, :cond_0

    .line 67
    const/16 v0, 0x3f0

    iput v0, p0, Lo/drn;->e:I

    .line 69
    :cond_0
    return-void

    .line 73
    :cond_1
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 74
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    goto :goto_0

    .line 76
    :cond_2
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 79
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 80
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 81
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/drn;->d(Ljava/lang/String;)V

    .line 83
    :cond_3
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 84
    sget-object v0, Lo/drn;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse ResponseAuthInfoArray to jsonObj result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    :cond_4
    goto :goto_1

    .line 86
    :catch_0
    move-exception v3

    .line 87
    sget-object v0, Lo/drn;->d:Ljava/lang/String;

    const-string v1, "ResponseAuthSecondInfo-parseResponseAuthInfoArray JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    :goto_1
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/drn;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 24
    iget v0, p0, Lo/drn;->a:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/drn;->g:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 5

    .line 92
    invoke-static {p1}, Lo/dsh;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/drn;->e:I

    .line 94
    iget v0, p0, Lo/drn;->e:I

    const/16 v1, 0x198

    if-ne v1, v0, :cond_0

    .line 95
    const/16 v0, 0x3f0

    iput v0, p0, Lo/drn;->e:I

    .line 97
    :cond_0
    return-void

    .line 99
    :cond_1
    const/4 v3, 0x0

    .line 101
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 102
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    .line 104
    :cond_2
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 106
    :goto_0
    const-string v0, "RespSN"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/drn;->a:I

    .line 107
    const-string v0, "ReqName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drn;->c:Ljava/lang/String;

    .line 108
    const-string v0, "AuthToken"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drn;->b:Ljava/lang/String;

    .line 109
    const-string v0, "ResultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/drn;->e:I

    .line 110
    const-string v0, "MSISDN"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drn;->g:Ljava/lang/String;

    .line 111
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 112
    sget-object v0, Lo/drn;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse ResponseAuthInfo to jsonObj result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :cond_3
    goto :goto_1

    .line 114
    :catch_0
    move-exception v4

    .line 115
    sget-object v0, Lo/drn;->d:Ljava/lang/String;

    const-string v1, "ResponseAuthSecondInfo-parseResponseAuthInfo  JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    :goto_1
    return-void
.end method

.method public e()I
    .locals 1

    .line 32
    iget v0, p0, Lo/drn;->e:I

    return v0
.end method
