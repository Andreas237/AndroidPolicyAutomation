.class Lcom/huawei/operation/view/CustomWebView$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/view/CustomWebView;->selectImageDialog()V
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

    .line 1325
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$11;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1328
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "commonwebview : selectImageDialog ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1329
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$11;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1400(Lcom/huawei/operation/view/CustomWebView;)V

    .line 1330
    return-void
.end method
