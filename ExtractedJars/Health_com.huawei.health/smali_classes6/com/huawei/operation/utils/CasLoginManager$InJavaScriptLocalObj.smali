.class public final Lcom/huawei/operation/utils/CasLoginManager$InJavaScriptLocalObj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/utils/CasLoginManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "InJavaScriptLocalObj"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/utils/CasLoginManager;


# direct methods
.method public constructor <init>(Lcom/huawei/operation/utils/CasLoginManager;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/operation/utils/CasLoginManager$InJavaScriptLocalObj;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public showSource(Ljava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 96
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;

    .line 97
    const-string v0, "CasLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-virtual {v4}, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->isSuccess()Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    const-string v0, "CasLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login cas error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    return-void

    .line 103
    :cond_0
    const-string v0, "CasLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login cas isSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$InJavaScriptLocalObj;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-static {v0}, Lcom/huawei/operation/utils/CasLoginManager;->access$100(Lcom/huawei/operation/utils/CasLoginManager;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 105
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$InJavaScriptLocalObj;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-static {v0}, Lcom/huawei/operation/utils/CasLoginManager;->access$100(Lcom/huawei/operation/utils/CasLoginManager;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 107
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$InJavaScriptLocalObj;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-static {v0}, Lcom/huawei/operation/utils/CasLoginManager;->access$200(Lcom/huawei/operation/utils/CasLoginManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 108
    const-string v0, "CasLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldOverrideUrlLoading  MSG_CASLOGIN_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    :cond_2
    return-void
.end method
