.class Lcom/huawei/operation/view/CustomWebView$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


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

    .line 1352
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$14;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1355
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$14;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->clearUploadMessage()V

    .line 1356
    return-void
.end method
