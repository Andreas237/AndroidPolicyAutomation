.class public Lo/avt;
.super Lo/avm;
.source "SourceFile"


# instance fields
.field private g:J


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
    const-string v0, "UserInfoChangeMsgAdapter"

    const-string v1, "parse user info change push message."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const/4 v2, 0x0

    .line 55
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lo/avt;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    .line 56
    const-string v0, "UserInfoChangeNotify"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 64
    goto :goto_0

    .line 58
    :catch_0
    move-exception v3

    .line 60
    const-string v0, "UserInfoChangeMsgAdapter"

    const-string v1, "parse exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parse UserInfoChangeNotify exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-static {v0}, Lo/bpj;->d(Ljava/lang/String;)V

    .line 65
    :goto_0
    if-eqz v2, :cond_0

    .line 67
    const-string v0, "pushUID"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avt;->d:J

    .line 68
    const-string v0, "UID"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/avt;->g:J

    .line 70
    :cond_0
    return-void
.end method

.method protected e(Landroid/content/Context;)V
    .locals 8

    .line 75
    invoke-super {p0, p1}, Lo/avm;->e(Landroid/content/Context;)V

    .line 76
    const-string v0, "UserInfoChangeMsgAdapter"

    const-string v1, "sync user info."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    new-instance v6, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;-><init>()V

    .line 79
    move-object v0, v6

    iget-wide v1, p0, Lo/avt;->g:J

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->setData(JIJ)V

    .line 81
    new-instance v7, Lo/axf;

    const/4 v0, 0x0

    invoke-direct {v7, v0}, Lo/axf;-><init>(Landroid/os/Handler;)V

    .line 82
    const/16 v0, 0x25

    const/4 v1, 0x0

    invoke-virtual {v7, v0, p1, v6, v1}, Lo/axf;->c(ILandroid/content/Context;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Ljava/lang/String;)V

    .line 83
    return-void
.end method
