.class public Lo/drl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private k:Lo/drc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    const-class v0, Lo/drl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drl;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drl;->e:Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drl;->h:Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drl;->g:Ljava/lang/String;

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drl;->k:Lo/drc;

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 4

    .line 77
    :try_start_0
    sget-object v0, Lo/drl;->d:Ljava/lang/String;

    const-string v1, "Build RequestMultiSIMServiceInfo JsonObj start"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 79
    const-string v0, "Request"

    iget-object v1, p0, Lo/drl;->a:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v0, "PrimaryIDType"

    iget-object v1, p0, Lo/drl;->c:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v0, "PrimaryID"

    iget-object v1, p0, Lo/drl;->b:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    iget-object v0, p0, Lo/drl;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 83
    const-string v0, "SecondaryIDType"

    iget-object v1, p0, Lo/drl;->e:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    :cond_0
    iget-object v0, p0, Lo/drl;->h:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 86
    const-string v0, "SecondaryID"

    iget-object v1, p0, Lo/drl;->h:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    :cond_1
    iget-object v0, p0, Lo/drl;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 89
    const-string v0, "SecondaryDeviceName"

    iget-object v1, p0, Lo/drl;->g:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    :cond_2
    iget-object v0, p0, Lo/drl;->k:Lo/drc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 92
    const-string v0, "DeviceID"

    iget-object v1, p0, Lo/drl;->k:Lo/drc;

    invoke-virtual {v1}, Lo/drc;->b()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    :cond_3
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 95
    sget-object v0, Lo/drl;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Build RequestMultiSIMServiceInfo JsonObj result:"

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

    .line 97
    :cond_4
    return-object v3

    .line 98
    :catch_0
    move-exception v3

    .line 99
    sget-object v0, Lo/drl;->d:Ljava/lang/String;

    const-string v1, "Build RequestMultiSIMServiceInfo JsonObj occured JSONException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lo/drl;->h:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/drl;->b:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/drl;->e:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public c(Lo/drc;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/drl;->k:Lo/drc;

    .line 72
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/drl;->c:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lo/drl;->a:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/drl;->g:Ljava/lang/String;

    .line 64
    return-void
.end method
