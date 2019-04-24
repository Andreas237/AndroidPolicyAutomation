.class public Lo/drd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private h:I

.field private i:Lo/drc;

.field private k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    const-class v0, Lo/drd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drd;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drd;->i:Lo/drc;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drd;->f:Ljava/lang/String;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drd;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONArray;
    .locals 2

    .line 87
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 88
    invoke-virtual {p0}, Lo/drd;->e()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 89
    return-object v1
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lo/drd;->d:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/drd;->b:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 26
    iput p1, p0, Lo/drd;->c:I

    .line 27
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/drd;->e:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public e()Lorg/json/JSONObject;
    .locals 4

    .line 94
    :try_start_0
    sget-object v0, Lo/drd;->a:Ljava/lang/String;

    const-string v1, "Build RequestAuthSecondInfo JsonObj start"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 96
    const-string v0, "ReqSN"

    iget v1, p0, Lo/drd;->c:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 97
    const-string v0, "AuthType"

    iget-object v1, p0, Lo/drd;->e:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    const-string v0, "ReqName"

    iget-object v1, p0, Lo/drd;->b:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    const-string v0, "Payload"

    iget-object v1, p0, Lo/drd;->d:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    iget-object v0, p0, Lo/drd;->i:Lo/drc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 101
    const-string v0, "DeviceID"

    iget-object v1, p0, Lo/drd;->i:Lo/drc;

    invoke-virtual {v1}, Lo/drc;->b()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    :cond_0
    iget-object v0, p0, Lo/drd;->f:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 104
    const-string v0, "Sessionid"

    iget-object v1, p0, Lo/drd;->f:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    :cond_1
    iget-object v0, p0, Lo/drd;->k:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 107
    const-string v0, "MSISDN"

    iget-object v1, p0, Lo/drd;->k:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    :cond_2
    const-string v0, "Timer"

    iget v1, p0, Lo/drd;->h:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 110
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 111
    sget-object v0, Lo/drd;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Build RequestAuthSecondInfo JsonObj result:"

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

    .line 113
    :cond_3
    return-object v3

    .line 114
    :catch_0
    move-exception v3

    .line 115
    sget-object v0, Lo/drd;->a:Ljava/lang/String;

    const-string v1, "Build RequestAuthSecondInfo JsonObj occured JSONException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    const/4 v0, 0x0

    return-object v0
.end method
