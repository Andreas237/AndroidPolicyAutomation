.class Lcom/huawei/operation/view/CustomWebView$15;
.super Lo/dbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/view/CustomWebView;->checkHavePermission(Landroid/content/Context;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/view/CustomWebView;


# direct methods
.method constructor <init>(Lcom/huawei/operation/view/CustomWebView;)V
    .locals 0

    .line 1433
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$15;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Lo/dbs;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 4

    .line 1441
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDenied()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1442
    return-void
.end method

.method public onGranted()V
    .locals 4

    .line 1436
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGranted()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1437
    return-void
.end method
