.class Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BaseUiListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$1;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;-><init>(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 4

    .line 123
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCancel()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 6

    .line 92
    move-object v4, p1

    :try_start_0
    check-cast v4, Lorg/json/JSONObject;

    .line 93
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "login() jsonObject="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const-string v0, "openid"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "access_token"

    .line 95
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    const-string v1, "openid"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$102(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    const-string v1, "access_token"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$202(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    const-string v1, "expires_in"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$302(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$100(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-static {v2}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$200(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-static {v3}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$300(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->initOpenidAndToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    const-string v5, "QQ"

    .line 104
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QQlogin() mOpenid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-static {v3}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$100(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mAccess_token="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    .line 105
    invoke-static {v3}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$200(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mExpires_in="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-static {v3}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$300(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 104
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$400(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Lo/fjk;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$400(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Lo/fjk;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$200(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-static {v2}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->access$100(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "QQ"

    invoke-interface {v0, v1, v2, v3}, Lo/fjk;->loginCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    :cond_0
    goto :goto_0

    .line 111
    :catch_0
    move-exception v4

    .line 112
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onComplete() Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    :goto_0
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 4

    .line 118
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onError()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-void
.end method
