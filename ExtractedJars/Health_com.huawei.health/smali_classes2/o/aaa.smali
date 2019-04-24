.class public Lo/aaa;
.super Lo/aag;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 11

    .line 153
    invoke-direct {p0}, Lo/aag;-><init>()V

    .line 54
    const/4 v0, 0x2

    iput v0, p0, Lo/aaa;->d:I

    .line 59
    const/16 v0, 0x2329

    iput v0, p0, Lo/aaa;->c:I

    .line 64
    const-string v0, ""

    iput-object v0, p0, Lo/aaa;->a:Ljava/lang/String;

    .line 69
    const-string v0, ""

    iput-object v0, p0, Lo/aaa;->b:Ljava/lang/String;

    .line 71
    const-string v0, ""

    iput-object v0, p0, Lo/aaa;->h:Ljava/lang/String;

    .line 74
    const-string v0, ""

    iput-object v0, p0, Lo/aaa;->g:Ljava/lang/String;

    .line 157
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 159
    const-string v0, "isSuccess"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "isSuccess value-->"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 163
    invoke-direct {p0, v5}, Lo/aaa;->d(I)V

    .line 165
    if-nez v5, :cond_0

    const-string v0, "services"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 167
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v5, :cond_1

    if-eqz v6, :cond_2

    .line 169
    :cond_1
    const-string v0, "services"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 170
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    .line 171
    invoke-direct {p0, v8}, Lo/aaa;->c(Ljava/lang/String;)V

    .line 176
    const-string v0, "lastReqTime"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "expireTime"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    add-long v9, v0, v2

    .line 177
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/aaa;->a(Ljava/lang/String;)V

    .line 182
    if-eqz v6, :cond_3

    .line 184
    const-string v0, "errorList"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/aaa;->d(Ljava/lang/String;)V

    .line 186
    goto :goto_1

    .line 190
    :cond_2
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/aaa;->d(I)V

    .line 192
    const-string v0, "errorCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lo/aaa;->b(I)V

    .line 193
    const-string v0, "errorDesc"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/aaa;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    goto :goto_1

    .line 196
    :catch_0
    move-exception v4

    .line 198
    const-string v0, "GrsResponse GrsResponse(String result) JSONException:"

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 199
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/aaa;->d(I)V

    .line 201
    :cond_3
    :goto_1
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 148
    invoke-direct {p0}, Lo/aag;-><init>()V

    .line 54
    const/4 v0, 0x2

    iput v0, p0, Lo/aaa;->d:I

    .line 59
    const/16 v0, 0x2329

    iput v0, p0, Lo/aaa;->c:I

    .line 64
    const-string v0, ""

    iput-object v0, p0, Lo/aaa;->a:Ljava/lang/String;

    .line 69
    const-string v0, ""

    iput-object v0, p0, Lo/aaa;->b:Ljava/lang/String;

    .line 71
    const-string v0, ""

    iput-object v0, p0, Lo/aaa;->h:Ljava/lang/String;

    .line 74
    const-string v0, ""

    iput-object v0, p0, Lo/aaa;->g:Ljava/lang/String;

    .line 149
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/aaa;->d(I)V

    .line 150
    invoke-direct {p0, p1}, Lo/aaa;->b(Ljava/lang/String;)V

    .line 151
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/aaa;->g:Ljava/lang/String;

    .line 104
    return-void
.end method

.method private b(I)V
    .locals 0

    .line 123
    iput p1, p0, Lo/aaa;->c:I

    .line 124
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/aaa;->b:Ljava/lang/String;

    .line 144
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/aaa;->e:Ljava/lang/String;

    .line 94
    return-void
.end method

.method private d(I)V
    .locals 0

    .line 108
    iput p1, p0, Lo/aaa;->d:I

    .line 109
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/aaa;->h:Ljava/lang/String;

    .line 84
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lo/aaa;->a:Ljava/lang/String;

    .line 134
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 113
    iget v0, p0, Lo/aaa;->d:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/aaa;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lo/aaa;->g:Ljava/lang/String;

    return-object v0
.end method
