.class Lcom/huawei/up/api/UpApi$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/login/ui/login/util/ILoginCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/up/api/UpApi;->updateUserInfo(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/up/api/UpApi;

.field final synthetic val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

.field final synthetic val$userInfomation:Lcom/huawei/up/model/UserInfomation;


# direct methods
.method constructor <init>(Lcom/huawei/up/api/UpApi;Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lcom/huawei/up/api/UpApi$4;->this$0:Lcom/huawei/up/api/UpApi;

    iput-object p2, p0, Lcom/huawei/up/api/UpApi$4;->val$userInfomation:Lcom/huawei/up/model/UserInfomation;

    iput-object p3, p0, Lcom/huawei/up/api/UpApi$4;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoginFailed(Ljava/lang/Object;)V
    .locals 4

    .line 301
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$4;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 302
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLoginFailed is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$4;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    const/16 v1, -0x64

    invoke-interface {v0, v1}, Lcom/huawei/up/callback/CommonCallback;->onFail(I)V

    .line 305
    :cond_0
    return-void
.end method

.method public onLoginSuccess(Ljava/lang/Object;)V
    .locals 3

    .line 295
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$4;->this$0:Lcom/huawei/up/api/UpApi;

    iget-object v1, p0, Lcom/huawei/up/api/UpApi$4;->val$userInfomation:Lcom/huawei/up/model/UserInfomation;

    iget-object v2, p0, Lcom/huawei/up/api/UpApi$4;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    invoke-static {v0, v1, v2}, Lcom/huawei/up/api/UpApi;->access$300(Lcom/huawei/up/api/UpApi;Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V

    .line 296
    return-void
.end method
