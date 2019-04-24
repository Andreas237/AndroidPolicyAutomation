.class Lcom/huawei/operation/js/JsInteraction$1;
.super Lo/dbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/js/JsInteraction;->capture(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/js/JsInteraction;

.field final synthetic val$functionRes:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V
    .locals 0

    .line 1794
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction$1;->this$0:Lcom/huawei/operation/js/JsInteraction;

    iput-object p2, p0, Lcom/huawei/operation/js/JsInteraction$1;->val$functionRes:Ljava/lang/String;

    invoke-direct {p0}, Lo/dbs;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 4

    .line 1803
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDenied()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1804
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction$1;->this$0:Lcom/huawei/operation/js/JsInteraction;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction$1;->val$functionRes:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/operation/js/JsInteraction;->access$000(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V

    .line 1805
    return-void
.end method

.method public onGranted()V
    .locals 4

    .line 1797
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGranted()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1799
    return-void
.end method
