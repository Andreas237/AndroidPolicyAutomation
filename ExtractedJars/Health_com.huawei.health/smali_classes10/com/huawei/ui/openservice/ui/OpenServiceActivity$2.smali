.class Lcom/huawei/ui/openservice/ui/OpenServiceActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->initAdapter()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$2;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 138
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    .line 139
    if-eqz v3, :cond_0

    instance-of v0, v3, Ljava/lang/Integer;

    if-nez v0, :cond_1

    .line 140
    :cond_0
    return-void

    .line 142
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$2;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$2;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-static {v1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$100(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Ljava/util/List;

    move-result-object v1

    move-object v2, v3

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$200(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V

    .line 143
    return-void
.end method
