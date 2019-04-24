.class public Lo/drh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Lo/drc;

.field private k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    const-class v0, Lo/drh;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drh;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drh;->b:Ljava/lang/String;

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drh;->h:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drh;->f:Ljava/lang/String;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drh;->i:Lo/drc;

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drh;->k:Ljava/lang/String;

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drh;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 4

    .line 105
    :try_start_0
    sget-object v0, Lo/drh;->d:Ljava/lang/String;

    const-string v1, "Build RequestAuthInfo JsonObj start"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 107
    const-string v0, "ReqSN"

    iget v1, p0, Lo/drh;->e:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 108
    const-string v0, "ReqName"

    iget-object v1, p0, Lo/drh;->c:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    const-string v0, "AuthType"

    iget-object v1, p0, Lo/drh;->a:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 110
    iget-object v0, p0, Lo/drh;->h:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 111
    const-string v0, "Identity"

    iget-object v1, p0, Lo/drh;->h:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    :cond_0
    iget-object v0, p0, Lo/drh;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 114
    const-string v0, "MSISDN"

    iget-object v1, p0, Lo/drh;->b:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    :cond_1
    iget-object v0, p0, Lo/drh;->f:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 117
    const-string v0, "AuthToken"

    iget-object v1, p0, Lo/drh;->f:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    :cond_2
    iget-object v0, p0, Lo/drh;->i:Lo/drc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 120
    const-string v0, "DeviceID"

    iget-object v1, p0, Lo/drh;->i:Lo/drc;

    invoke-virtual {v1}, Lo/drc;->b()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    :cond_3
    iget-object v0, p0, Lo/drh;->k:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 123
    const-string v0, "TerminalType"

    iget-object v1, p0, Lo/drh;->k:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 125
    :cond_4
    iget-object v0, p0, Lo/drh;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 126
    const-string v0, "TerminalVersion"

    iget-object v1, p0, Lo/drh;->g:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 128
    :cond_5
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 129
    sget-object v0, Lo/drh;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Build RequestAuthInfo JsonObj result:"

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

    .line 131
    :cond_6
    return-object v3

    .line 132
    :catch_0
    move-exception v3

    .line 133
    sget-object v0, Lo/drh;->d:Ljava/lang/String;

    const-string v1, "Build RequestAuthInfo JsonObj occured JSONException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lo/drh;->f:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 27
    iput p1, p0, Lo/drh;->e:I

    .line 28
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/drh;->c:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/drh;->a:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public e()Lorg/json/JSONArray;
    .locals 4

    .line 95
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 96
    invoke-virtual {p0}, Lo/drh;->a()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 97
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    sget-object v0, Lo/drh;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Build RequestAuthInfo JsonObjArray result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    :cond_0
    return-object v3
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/drh;->h:Ljava/lang/String;

    .line 60
    return-void
.end method
