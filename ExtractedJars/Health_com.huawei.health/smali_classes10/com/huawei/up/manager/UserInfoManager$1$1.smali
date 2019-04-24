.class Lcom/huawei/up/manager/UserInfoManager$1$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/up/manager/UserInfoManager$1;->onSuccess(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/up/manager/UserInfoManager$1;

.field final synthetic val$sessionID1:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/up/manager/UserInfoManager$1;Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/up/manager/UserInfoManager$1$1;->this$1:Lcom/huawei/up/manager/UserInfoManager$1;

    iput-object p2, p0, Lcom/huawei/up/manager/UserInfoManager$1$1;->val$sessionID1:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/huawei/up/manager/UserInfoManager$1$1;->this$1:Lcom/huawei/up/manager/UserInfoManager$1;

    iget-object v0, v0, Lcom/huawei/up/manager/UserInfoManager$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/up/manager/UserInfoManager$1$1;->val$sessionID1:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSessionID(Ljava/lang/String;)V

    .line 84
    return-void
.end method
