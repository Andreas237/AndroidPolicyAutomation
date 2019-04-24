.class Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->signInToGetAt(Landroid/content/Context;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

.field final synthetic val$client:Lcom/huawei/hms/api/HuaweiApiClient;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;->this$0:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iput-object p2, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;->val$client:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 142
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;->val$client:Lcom/huawei/hms/api/HuaweiApiClient;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->access$000(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;I)Ljava/lang/String;

    move-result-object v4

    .line 143
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "signInToGetAt get aToken = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;->this$0:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$2;->val$context:Landroid/content/Context;

    invoke-static {v0, v1, v4}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->access$100(Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;Ljava/lang/String;)V

    .line 145
    return-void
.end method
