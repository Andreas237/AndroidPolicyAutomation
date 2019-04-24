.class public Lo/drk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private g:Ljava/lang/String;

.field private h:Lo/drl;

.field private k:Lo/drj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    const-class v0, Lo/drk;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drk;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, "ServiceProvisionRequest"

    iput-object v0, p0, Lo/drk;->d:Ljava/lang/String;

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drk;->h:Lo/drl;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drk;->k:Lo/drj;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lo/drk;->g:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public b()Lorg/json/JSONObject;
    .locals 4

    .line 77
    :try_start_0
    sget-object v0, Lo/drk;->c:Ljava/lang/String;

    const-string v1, "Build RequestServiceProvisionInfo JsonObj start"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 79
    const-string v0, "ReqSN"

    iget v1, p0, Lo/drk;->e:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 80
    const-string v0, "ReqName"

    iget-object v1, p0, Lo/drk;->d:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v0, "PrimaryIDType"

    iget-object v1, p0, Lo/drk;->a:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    const-string v0, "PrimaryID"

    iget-object v1, p0, Lo/drk;->b:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    const-string v0, "Services"

    iget-object v1, p0, Lo/drk;->g:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    iget-object v0, p0, Lo/drk;->h:Lo/drl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 85
    const-string v0, "MultiSIMServiceRequest"

    iget-object v1, p0, Lo/drk;->h:Lo/drl;

    invoke-virtual {v1}, Lo/drl;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    :cond_0
    iget-object v0, p0, Lo/drk;->k:Lo/drj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 88
    const-string v0, "eSIMProfileRequest"

    iget-object v1, p0, Lo/drk;->k:Lo/drj;

    invoke-virtual {v1}, Lo/drj;->c()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    :cond_1
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 91
    sget-object v0, Lo/drk;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Build RequestServiceProvisionInfo JsonObj result:"

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

    .line 93
    :cond_2
    return-object v3

    .line 94
    :catch_0
    move-exception v3

    .line 95
    sget-object v0, Lo/drk;->c:Ljava/lang/String;

    const-string v1, "Build RequestServiceProvisionInfo JsonObj occured JSONException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Lo/drl;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/drk;->h:Lo/drl;

    .line 73
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lo/drk;->a:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 24
    iput p1, p0, Lo/drk;->e:I

    .line 25
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lo/drk;->b:Ljava/lang/String;

    .line 49
    return-void
.end method
