.class Lcom/huawei/ui/openservice/ui/OpenServiceActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->showServiceAuthDialog(Lcom/huawei/ui/openservice/db/model/OpenService;)V
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

    .line 262
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$6;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    iput-object p2, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$6;->val$service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$6;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$6;->val$service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$900(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$6;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$6;->val$service:Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$1000(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Ljava/lang/String;)V

    .line 267
    return-void
.end method
