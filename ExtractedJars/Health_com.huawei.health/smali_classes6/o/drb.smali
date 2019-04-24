.class public Lo/drb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Lo/drc;

.field private l:I

.field private n:Ljava/lang/String;

.field private p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    const-class v0, Lo/drb;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drb;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drb;->k:Lo/drc;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drb;->i:Ljava/lang/String;

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drb;->n:Ljava/lang/String;

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drb;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lo/drb;->i:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/drb;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/drb;->g:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/drb;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 6

    .line 85
    const/4 v3, 0x0

    .line 87
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 88
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    .line 90
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 92
    :goto_0
    const-string v0, "DevType"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->b:Ljava/lang/String;

    .line 93
    const-string v0, "ICCID"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->c:Ljava/lang/String;

    .line 94
    const-string v0, "IMSI"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->e:Ljava/lang/String;

    .line 95
    const-string v0, "MSISDN"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->d:Ljava/lang/String;

    .line 96
    const-string v0, "RSPServerAddress"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->f:Ljava/lang/String;

    .line 97
    const-string v0, "Status"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->h:Ljava/lang/String;

    .line 98
    const-string v0, "DeviceName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->g:Ljava/lang/String;

    .line 99
    const-string v0, "ActivationCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->n:Ljava/lang/String;

    .line 100
    const-string v0, "ConfirmationCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->p:Ljava/lang/String;

    .line 101
    const-string v0, "MAXReTryTimes"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/drb;->l:I

    .line 102
    const-string v0, "EID"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drb;->i:Ljava/lang/String;

    .line 103
    new-instance v4, Lo/drc;

    invoke-direct {v4}, Lo/drc;-><init>()V

    .line 104
    const-string v0, "DeviceID"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 105
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 106
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/drc;->e(Ljava/lang/String;)V

    .line 108
    :cond_1
    iput-object v4, p0, Lo/drb;->k:Lo/drc;

    .line 109
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 110
    sget-object v0, Lo/drb;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PairedDeviceList to json string = "

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

    .line 114
    :cond_2
    goto :goto_1

    .line 112
    :catch_0
    move-exception v4

    .line 113
    sget-object v0, Lo/drb;->a:Ljava/lang/String;

    const-string v1, "Parse response information occured JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    :goto_1
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/drb;->f:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lo/drb;->g:Ljava/lang/String;

    .line 74
    return-void
.end method
