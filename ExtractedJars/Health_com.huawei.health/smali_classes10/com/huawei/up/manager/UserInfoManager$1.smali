.class Lcom/huawei/up/manager/UserInfoManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/up/callback/CommonCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/up/manager/UserInfoManager;->getUserInfo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/up/manager/UserInfoManager;

.field final synthetic val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$queryRangeFlag:Ljava/lang/String;

.field final synthetic val$sessionID:Ljava/lang/String;

.field final synthetic val$token:Ljava/lang/String;

.field final synthetic val$userID:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/up/manager/UserInfoManager;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/up/manager/UserInfoManager$1;->this$0:Lcom/huawei/up/manager/UserInfoManager;

    iput-object p2, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$token:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$userID:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$context:Landroid/content/Context;

    iput-object p5, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$sessionID:Ljava/lang/String;

    iput-object p6, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$queryRangeFlag:Ljava/lang/String;

    iput-object p7, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(I)V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lcom/huawei/up/callback/CommonCallback;->onFail(I)V

    .line 119
    :cond_0
    return-void
.end method

.method public onSuccess(Landroid/os/Bundle;)V
    .locals 8

    .line 74
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->this$0:Lcom/huawei/up/manager/UserInfoManager;

    const-string v1, "getUserInfo"

    iget-object v2, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$token:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$userID:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/up/manager/UserInfoManager;->access$000(Lcom/huawei/up/manager/UserInfoManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 75
    new-instance v5, Lcom/huawei/up/request/GetUserInfoRequest;

    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$context:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/up/request/GetUserInfoRequest;-><init>(Landroid/content/Context;)V

    .line 76
    const-string v0, "Set-Cookie"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 77
    const-string v0, "UserInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sessionID1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    invoke-virtual {v5, v6}, Lcom/huawei/up/request/GetUserInfoRequest;->setCookie(Ljava/lang/String;)V

    .line 80
    new-instance v0, Lcom/huawei/up/manager/UserInfoManager$1$1;

    invoke-direct {v0, p0, v6}, Lcom/huawei/up/manager/UserInfoManager$1$1;-><init>(Lcom/huawei/up/manager/UserInfoManager$1;Ljava/lang/String;)V

    .line 85
    invoke-virtual {v0}, Lcom/huawei/up/manager/UserInfoManager$1$1;->start()V

    goto :goto_0

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$sessionID:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$sessionID:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/up/request/GetUserInfoRequest;->setCookie(Ljava/lang/String;)V

    .line 91
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$userID:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 92
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$userID:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/up/request/GetUserInfoRequest;->setmUserID(Ljava/lang/String;)V

    .line 94
    :cond_2
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$queryRangeFlag:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 95
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$queryRangeFlag:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/up/request/GetUserInfoRequest;->setmQueryRangeFlag(Ljava/lang/String;)V

    .line 97
    :cond_3
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$queryRangeFlag:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 98
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$queryRangeFlag:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/up/request/GetUserInfoRequest;->setmQueryRangeFlag(Ljava/lang/String;)V

    .line 100
    :cond_4
    invoke-virtual {v5, v4}, Lcom/huawei/up/request/GetUserInfoRequest;->setAuthorization(Ljava/lang/String;)V

    .line 102
    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/up/request/GetUserInfoRequest;->packageXML()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/request/GetUserInfoRequest;->execute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/request/GetUserInfoRequest;->unPackageXML(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    .line 103
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 104
    const-string v0, "method"

    const-string v1, "getUserInfo"

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    invoke-interface {v0, v7}, Lcom/huawei/up/callback/CommonCallback;->onSuccess(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1

    .line 111
    :cond_5
    goto :goto_1

    .line 107
    :catch_0
    move-exception v7

    .line 108
    const-string v0, "UserInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    goto :goto_1

    .line 109
    :catch_1
    move-exception v7

    .line 110
    const-string v0, "UserInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/xmlpull/v1/XmlPullParserException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    :goto_1
    return-void
.end method
