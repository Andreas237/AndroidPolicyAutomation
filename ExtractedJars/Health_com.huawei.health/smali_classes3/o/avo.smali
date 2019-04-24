.class public Lo/avo;
.super Lo/avm;
.source "SourceFile"


# instance fields
.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lo/avm;-><init>(Ljava/lang/String;)V

    .line 41
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 49
    invoke-super {p0}, Lo/avm;->a()V

    .line 51
    const-string v0, "GrpListChgMsgAdpt"

    const-string v1, "parse group list change push message."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const/4 v2, 0x0

    .line 56
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lo/avo;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    .line 57
    const-string v0, "GroupListChangeNotify"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 65
    goto :goto_0

    .line 59
    :catch_0
    move-exception v3

    .line 61
    const-string v0, "GrpListChgMsgAdpt"

    const-string v1, "parse exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parse GroupListChangeNotify exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-static {v0}, Lo/bpj;->d(Ljava/lang/String;)V

    .line 66
    :goto_0
    if-eqz v2, :cond_0

    .line 68
    const-string v0, "pushUID"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avo;->d:J

    .line 69
    const-string v0, "version"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/avo;->g:Ljava/lang/String;

    .line 71
    :cond_0
    return-void
.end method

.method protected e(Landroid/content/Context;)V
    .locals 3

    .line 76
    invoke-super {p0, p1}, Lo/avm;->e(Landroid/content/Context;)V

    .line 79
    new-instance v0, Lo/atk;

    invoke-direct {v0}, Lo/atk;-><init>()V

    invoke-virtual {v0}, Lo/atk;->a()Ljava/lang/String;

    move-result-object v1

    .line 82
    iget-object v0, p0, Lo/avo;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 84
    new-instance v2, Lo/asz;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/asz;-><init>(Landroid/os/Handler;)V

    .line 86
    invoke-virtual {v2, p1}, Lo/asz;->a(Landroid/content/Context;)V

    .line 89
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    invoke-virtual {v0}, Lo/avk;->d()V

    .line 91
    :cond_0
    return-void
.end method
