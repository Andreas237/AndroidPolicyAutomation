.class Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->dealItemClick(Lcom/huawei/ui/openservice/db/model/OpenService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

.field final synthetic val$service:Lcom/huawei/ui/openservice/db/model/OpenService;


# direct methods
.method constructor <init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    iput-object p2, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;->val$service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$700(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-static {v1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$600(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;->val$service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v3

    .line 219
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    if-nez v0, :cond_1

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;->val$service:Lcom/huawei/ui/openservice/db/model/OpenService;

    const/4 v2, 0x4

    invoke-static {v0, v2, v1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$800(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;ILjava/lang/Object;)V

    .line 221
    return-void

    .line 223
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;->val$service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$900(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V

    .line 224
    return-void
.end method
