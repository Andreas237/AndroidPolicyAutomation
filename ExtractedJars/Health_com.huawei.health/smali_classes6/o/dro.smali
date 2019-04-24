.class public Lo/dro;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field a:Lo/drq;

.field b:Lo/dri;

.field e:Lo/drp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    const-class v0, Lo/dro;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dro;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dro;->a:Lo/drq;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dro;->e:Lo/drp;

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 44
    const-string v0, "DevAuth"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    new-instance v0, Lo/dri;

    invoke-direct {v0}, Lo/dri;-><init>()V

    iput-object v0, p0, Lo/dro;->b:Lo/dri;

    .line 46
    iget-object v0, p0, Lo/dro;->b:Lo/dri;

    invoke-virtual {v0, p2}, Lo/dri;->c(Ljava/lang/String;)V

    .line 47
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 48
    sget-object v0, Lo/dro;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse SingleInfo to jsonObj result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 50
    :cond_0
    const-string v0, "GetDevServInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    new-instance v0, Lo/drq;

    invoke-direct {v0}, Lo/drq;-><init>()V

    iput-object v0, p0, Lo/dro;->a:Lo/drq;

    .line 52
    iget-object v0, p0, Lo/dro;->a:Lo/drq;

    invoke-virtual {v0, p2}, Lo/drq;->e(Ljava/lang/String;)V

    .line 53
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    sget-object v0, Lo/dro;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse ResponseGetDevServInfo to jsonObj result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 56
    :cond_1
    const-string v0, "ServiceProvisionRequest"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 57
    new-instance v0, Lo/drp;

    invoke-direct {v0}, Lo/drp;-><init>()V

    iput-object v0, p0, Lo/dro;->e:Lo/drp;

    .line 58
    iget-object v0, p0, Lo/dro;->e:Lo/drp;

    invoke-virtual {v0, p2}, Lo/drp;->c(Ljava/lang/String;)V

    .line 59
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 60
    sget-object v0, Lo/dro;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse ResponseServiceProvisionInfo to jsonObj result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public b()Lo/dri;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/dro;->b:Lo/dri;

    return-object v0
.end method

.method public c()Lo/drp;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/dro;->e:Lo/drp;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 7

    .line 66
    invoke-static {p1}, Lo/dsh;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    new-instance v0, Lo/dri;

    invoke-direct {v0}, Lo/dri;-><init>()V

    iput-object v0, p0, Lo/dro;->b:Lo/dri;

    .line 68
    iget-object v0, p0, Lo/dro;->b:Lo/dri;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dri;->d(I)V

    .line 69
    return-void

    .line 73
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    goto :goto_0

    .line 76
    :cond_1
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 79
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 80
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_3

    .line 81
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 82
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 83
    const-string v0, "ReqName"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/dro;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 86
    :cond_3
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 87
    sget-object v0, Lo/dro;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parse ResponseAuthFirstInfo to jsonObj result:"

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

    .line 91
    :cond_4
    goto :goto_2

    .line 89
    :catch_0
    move-exception v3

    .line 90
    sget-object v0, Lo/dro;->d:Ljava/lang/String;

    const-string v1, "ResponseInfo-ResponseAuthFirstInfo  JSONException"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    :goto_2
    return-void
.end method

.method public e()Lo/drq;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/dro;->a:Lo/drq;

    return-object v0
.end method
