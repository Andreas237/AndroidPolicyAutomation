.class Lcom/huawei/operation/view/CustomWebView$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/view/CustomWebView;->onGeolocationPermissionsShowPromptDialog(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/view/CustomWebView;

.field final synthetic val$callback:Landroid/webkit/GeolocationPermissions$Callback;

.field final synthetic val$origin:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V
    .locals 0

    .line 1165
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$8;->this$0:Lcom/huawei/operation/view/CustomWebView;

    iput-object p2, p0, Lcom/huawei/operation/view/CustomWebView$8;->val$callback:Landroid/webkit/GeolocationPermissions$Callback;

    iput-object p3, p0, Lcom/huawei/operation/view/CustomWebView$8;->val$origin:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1167
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGeolocationPermissionsShowPromptDialog  setNegativeButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1168
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$8;->val$callback:Landroid/webkit/GeolocationPermissions$Callback;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$8;->val$origin:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 1169
    return-void
.end method
