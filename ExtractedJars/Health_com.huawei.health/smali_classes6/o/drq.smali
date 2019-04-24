.class public Lo/drq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;

.field private e:Lo/dqy;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Lo/drv;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    const-class v0, Lo/drq;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drq;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drq;->e:Lo/dqy;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drq;->i:Lo/drv;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drq;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/drq;->f:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/drq;->h:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lo/dqy;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/drq;->e:Lo/dqy;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 48
    iget v0, p0, Lo/drq;->b:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lo/drq;->g:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 8

    .line 88
    const/4 v3, 0x0

    .line 90
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    .line 93
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 95
    :goto_0
    const-string v0, "RespSN"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/drq;->a:I

    .line 96
    const-string v0, "ReqName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drq;->c:Ljava/lang/String;

    .line 97
    const-string v0, "ResultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/drq;->b:I

    .line 98
    const-string v0, "ManageUrl"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drq;->f:Ljava/lang/String;

    .line 99
    const-string v0, "PostData"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drq;->h:Ljava/lang/String;

    .line 100
    new-instance v4, Lo/dqy;

    invoke-direct {v4}, Lo/dqy;-><init>()V

    .line 101
    const-string v0, "MultiSIMServiceInfo"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 102
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 103
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dqy;->b(Ljava/lang/String;)V

    .line 105
    :cond_1
    iput-object v4, p0, Lo/drq;->e:Lo/dqy;

    .line 106
    new-instance v6, Lo/drv;

    invoke-direct {v6}, Lo/drv;-><init>()V

    .line 107
    const-string v0, "eSIMInfo"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 108
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 109
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/drv;->e(Ljava/lang/String;)V

    .line 111
    :cond_2
    iput-object v4, p0, Lo/drq;->e:Lo/dqy;

    .line 112
    const-string v0, "OldTimeStamp"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drq;->g:Ljava/lang/String;

    .line 113
    const-string v0, "Timer1"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/drq;->k:I

    .line 114
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    sget-object v0, Lo/drq;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse ResponseInfo to jsonObj result:"

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

    .line 119
    :cond_3
    goto :goto_1

    .line 117
    :catch_0
    move-exception v4

    .line 118
    sget-object v0, Lo/drq;->d:Ljava/lang/String;

    const-string v1, "ResponseGetDevServInfo-parseResponseInfo JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    :goto_1
    return-void
.end method
