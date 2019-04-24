.class Lcom/huawei/ui/openservice/ui/OpenServiceActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->saveAuthStatus(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

.field final synthetic val$serviceID:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Ljava/lang/String;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$5;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    iput-object p2, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$5;->val$serviceID:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 233
    new-instance v1, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    invoke-direct {v1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;-><init>()V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$5;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$600(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configHuid(Ljava/lang/String;)V

    .line 235
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configAuthType(I)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$5;->val$serviceID:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configServiceID(Ljava/lang/String;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$5;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$700(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->insertOrUpdateUserAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    .line 238
    return-void
.end method
