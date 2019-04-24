.class public Lo/avi;
.super Lo/avm;
.source "SourceFile"


# instance fields
.field private g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lo/avm;-><init>(Ljava/lang/String;)V

    .line 39
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 47
    invoke-super {p0}, Lo/avm;->a()V

    .line 49
    const-string v0, "GrpInfoChgMsgAdpter"

    const-string v1, "parse group info change push message."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const/4 v2, 0x0

    .line 53
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lo/avi;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    .line 54
    const-string v0, "GroupInfoChangeNotify"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 62
    goto :goto_0

    .line 56
    :catch_0
    move-exception v3

    .line 58
    const-string v0, "GrpInfoChgMsgAdpter"

    const-string v1, "parse exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parse GroupInfoChangeNotify exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-static {v0}, Lo/bpj;->d(Ljava/lang/String;)V

    .line 63
    :goto_0
    if-eqz v2, :cond_0

    .line 65
    const-string v0, "pushUID"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avi;->d:J

    .line 66
    const-string v0, "grpID"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avi;->g:J

    .line 68
    :cond_0
    return-void
.end method

.method protected e(Landroid/content/Context;)V
    .locals 5

    .line 73
    invoke-super {p0, p1}, Lo/avm;->e(Landroid/content/Context;)V

    .line 75
    const-string v0, "GrpInfoChgMsgAdpter"

    const-string v1, "sync group info."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    new-instance v4, Lo/atb;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/atb;-><init>(Landroid/os/Handler;)V

    .line 78
    iget-wide v0, p0, Lo/avi;->g:J

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v4, v2, v0, v1, v3}, Lo/atb;->a(IJZ)V

    .line 79
    return-void
.end method
