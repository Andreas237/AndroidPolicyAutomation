.class public Lo/drg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private a:Lo/drc;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    const-class v0, Lo/drg;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drg;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drg;->a:Lo/drc;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 6

    .line 53
    const/4 v3, 0x0

    .line 55
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 56
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    .line 58
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 60
    :goto_0
    const-string v0, "MSISDN"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drg;->c:Ljava/lang/String;

    .line 61
    const-string v0, "IMSI"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drg;->d:Ljava/lang/String;

    .line 62
    new-instance v4, Lo/drc;

    invoke-direct {v4}, Lo/drc;-><init>()V

    .line 63
    const-string v0, "DeviceID"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 64
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 65
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/drc;->e(Ljava/lang/String;)V

    .line 67
    :cond_1
    iput-object v4, p0, Lo/drg;->a:Lo/drc;

    .line 68
    const-string v0, "ServStatus"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drg;->b:Ljava/lang/String;

    .line 69
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    sget-object v0, Lo/drg;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PrimaryDevice to json string = "

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

    .line 74
    :cond_2
    goto :goto_1

    .line 72
    :catch_0
    move-exception v4

    .line 73
    sget-object v0, Lo/drg;->e:Ljava/lang/String;

    const-string v1, "Parse response information occured JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    :goto_1
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/drg;->c:Ljava/lang/String;

    return-object v0
.end method
