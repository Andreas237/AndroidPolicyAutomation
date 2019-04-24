.class public Lo/drp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:I

.field private e:Ljava/lang/String;

.field private f:Lo/drr;

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    const-class v0, Lo/drp;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drp;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drp;->b:Ljava/lang/String;

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drp;->g:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drp;->f:Lo/drr;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 28
    iget v0, p0, Lo/drp;->a:I

    return v0
.end method

.method public b()Lo/drr;
    .locals 1

    .line 53
    iget-object v0, p0, Lo/drp;->f:Lo/drr;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 6

    .line 69
    const/4 v3, 0x0

    .line 71
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    .line 74
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 76
    :goto_0
    const-string v0, "RespSN"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/drp;->c:I

    .line 77
    const-string v0, "ReqName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drp;->e:Ljava/lang/String;

    .line 78
    const-string v0, "ResultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/drp;->a:I

    .line 79
    const-string v0, "WSAddress"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drp;->b:Ljava/lang/String;

    .line 80
    const-string v0, "WSUrlDataPart"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/drp;->g:Ljava/lang/String;

    .line 81
    new-instance v4, Lo/drr;

    invoke-direct {v4}, Lo/drr;-><init>()V

    .line 82
    const-string v0, "MultiSIMServiceRequestResponse"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 83
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 84
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/drr;->a(Ljava/lang/String;)V

    .line 86
    :cond_1
    iput-object v4, p0, Lo/drp;->f:Lo/drr;

    .line 87
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    sget-object v0, Lo/drp;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse ResponseMultiSIMService to jsonObj result:"

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

    .line 92
    :cond_2
    goto :goto_1

    .line 90
    :catch_0
    move-exception v4

    .line 91
    sget-object v0, Lo/drp;->d:Ljava/lang/String;

    const-string v1, "Parse ResponseMultiSIMService to jsonObj occured JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    :goto_1
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/drp;->g:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/drp;->b:Ljava/lang/String;

    return-object v0
.end method
