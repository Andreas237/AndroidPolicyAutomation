.class public Lo/drf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    const-class v0, Lo/drf;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drf;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drf;->k:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drf;->g:Ljava/lang/String;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drf;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 4

    .line 86
    :try_start_0
    sget-object v0, Lo/drf;->b:Ljava/lang/String;

    const-string v1, "Build RequestGetDevServInfo JsonObj start"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 88
    const-string v0, "ReqSN"

    iget v1, p0, Lo/drf;->e:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 89
    const-string v0, "ReqName"

    iget-object v1, p0, Lo/drf;->d:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    const-string v0, "PrimaryIDType"

    iget-object v1, p0, Lo/drf;->a:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    const-string v0, "PrimaryID"

    iget-object v1, p0, Lo/drf;->f:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 92
    const-string v0, "Services"

    iget-object v1, p0, Lo/drf;->c:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    iget-object v0, p0, Lo/drf;->k:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 94
    const-string v0, "SecondaryIDType"

    iget-object v1, p0, Lo/drf;->k:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    :cond_0
    iget-object v0, p0, Lo/drf;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 97
    const-string v0, "SecondaryID"

    iget-object v1, p0, Lo/drf;->g:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    :cond_1
    iget-object v0, p0, Lo/drf;->h:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 100
    const-string v0, "OldTimeStamp"

    iget-object v1, p0, Lo/drf;->h:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    :cond_2
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 103
    sget-object v0, Lo/drf;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Build RequestGetDevServInfo JsonObj result:"

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

    .line 105
    :cond_3
    return-object v3

    .line 106
    :catch_0
    move-exception v3

    .line 107
    sget-object v0, Lo/drf;->b:Ljava/lang/String;

    const-string v1, "Build RequestGetDevServInfo JsonObj occured JSONException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 25
    iput p1, p0, Lo/drf;->e:I

    .line 26
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lo/drf;->d:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lo/drf;->f:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/drf;->a:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lo/drf;->k:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lo/drf;->c:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/drf;->h:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lo/drf;->g:Ljava/lang/String;

    .line 74
    return-void
.end method
