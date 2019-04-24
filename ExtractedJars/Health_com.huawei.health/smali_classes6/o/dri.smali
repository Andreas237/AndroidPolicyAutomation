.class public Lo/dri;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const-class v0, Lo/dri;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dri;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dri;->e:Ljava/lang/String;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dri;->g:Ljava/lang/String;

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dri;->f:Ljava/lang/String;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dri;->h:Ljava/lang/String;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dri;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 28
    iget v0, p0, Lo/dri;->d:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/dri;->g:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 5

    .line 101
    invoke-static {p1}, Lo/dsh;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 102
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/dri;->c:I

    .line 103
    iget v0, p0, Lo/dri;->c:I

    const/16 v1, 0x198

    if-eq v1, v0, :cond_0

    iget v0, p0, Lo/dri;->c:I

    const/16 v1, 0x63

    if-eq v1, v0, :cond_0

    iget v0, p0, Lo/dri;->c:I

    const/16 v1, 0x62

    if-ne v1, v0, :cond_1

    .line 104
    :cond_0
    const/16 v0, 0x3f0

    iput v0, p0, Lo/dri;->c:I

    .line 106
    :cond_1
    return-void

    .line 110
    :cond_2
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 111
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    goto :goto_0

    .line 113
    :cond_3
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 116
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 117
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 118
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dri;->c(Ljava/lang/String;)V

    .line 120
    :cond_4
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 121
    sget-object v0, Lo/dri;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse response authinfo Array json string = "

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

    .line 125
    :cond_5
    goto :goto_1

    .line 123
    :catch_0
    move-exception v3

    .line 124
    sget-object v0, Lo/dri;->b:Ljava/lang/String;

    const-string v1, "ResponseAuthFirstInfo-parseResponseAuthInfoArray  JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    :goto_1
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lo/dri;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 5

    .line 129
    invoke-static {p1}, Lo/dsh;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 130
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/dri;->c:I

    .line 131
    iget v0, p0, Lo/dri;->c:I

    const/16 v1, 0x198

    if-ne v1, v0, :cond_0

    .line 132
    const/16 v0, 0x3f0

    iput v0, p0, Lo/dri;->c:I

    .line 134
    :cond_0
    return-void

    .line 136
    :cond_1
    const/4 v3, 0x0

    .line 138
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 139
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    .line 141
    :cond_2
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 143
    :goto_0
    const-string v0, "RespSN"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dri;->d:I

    .line 144
    const-string v0, "ReqName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dri;->a:Ljava/lang/String;

    .line 145
    const-string v0, "ResultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dri;->c:I

    .line 146
    const-string v0, "Payload"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dri;->e:Ljava/lang/String;

    .line 147
    const-string v0, "AuthToken"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dri;->g:Ljava/lang/String;

    .line 148
    const-string v0, "RSPServerAddress"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dri;->f:Ljava/lang/String;

    .line 149
    const-string v0, "MSISDN"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dri;->h:Ljava/lang/String;

    .line 150
    const-string v0, "Sessionid"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dri;->i:Ljava/lang/String;

    .line 151
    const-string v0, "SMSAuthExpireTime"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dri;->k:I

    .line 152
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 153
    sget-object v0, Lo/dri;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse ResponseAuthFirstInfo result:"

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

    .line 157
    :cond_3
    goto :goto_1

    .line 155
    :catch_0
    move-exception v4

    .line 156
    sget-object v0, Lo/dri;->b:Ljava/lang/String;

    const-string v1, "ResponseAuthFirstInfo-parseResponseAuthFirstInfo JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    :goto_1
    return-void
.end method

.method public d()I
    .locals 1

    .line 36
    iget v0, p0, Lo/dri;->c:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 40
    iput p1, p0, Lo/dri;->c:I

    .line 41
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dri;->e:Ljava/lang/String;

    return-object v0
.end method
