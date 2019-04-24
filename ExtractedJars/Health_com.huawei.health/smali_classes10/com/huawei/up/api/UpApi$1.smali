.class Lcom/huawei/up/api/UpApi$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/up/api/UpApi;->getUserInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/up/api/UpApi;

.field final synthetic val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

.field final synthetic val$sessionID:Ljava/lang/String;

.field final synthetic val$token:Ljava/lang/String;

.field final synthetic val$userID:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/up/api/UpApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/up/api/UpApi$1;->this$0:Lcom/huawei/up/api/UpApi;

    iput-object p2, p0, Lcom/huawei/up/api/UpApi$1;->val$userID:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/up/api/UpApi$1;->val$token:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/up/api/UpApi$1;->val$sessionID:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/up/api/UpApi$1;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 93
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$1;->this$0:Lcom/huawei/up/api/UpApi;

    invoke-static {v0}, Lcom/huawei/up/api/UpApi;->access$100(Lcom/huawei/up/api/UpApi;)Lcom/huawei/up/manager/UserInfoManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/up/api/UpApi$1;->this$0:Lcom/huawei/up/api/UpApi;

    invoke-static {v1}, Lcom/huawei/up/api/UpApi;->access$000(Lcom/huawei/up/api/UpApi;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/up/api/UpApi$1;->val$userID:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/up/api/UpApi$1;->val$token:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/up/api/UpApi$1;->val$sessionID:Ljava/lang/String;

    const-string v5, "1"

    iget-object v6, p0, Lcom/huawei/up/api/UpApi$1;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/up/manager/UserInfoManager;->getUserInfo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V

    .line 94
    return-void
.end method
