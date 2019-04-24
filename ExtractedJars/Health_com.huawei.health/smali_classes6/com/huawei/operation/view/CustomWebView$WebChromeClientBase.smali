.class Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/view/CustomWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WebChromeClientBase"
.end annotation


# instance fields
.field private mCustomView:Landroid/view/View;

.field private mCustomViewCallback:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field final synthetic this$0:Lcom/huawei/operation/view/CustomWebView;


# direct methods
.method private constructor <init>(Lcom/huawei/operation/view/CustomWebView;)V
    .locals 0

    .line 1186
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/operation/view/CustomWebView;Lcom/huawei/operation/view/CustomWebView$1;)V
    .locals 0

    .line 1186
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    return-void
.end method


# virtual methods
.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 4

    .line 1229
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateWindow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1230
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    move-result v0

    return v0
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 4

    .line 1216
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGeolocationPermissionsShowPrompt()  enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1217
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p1, p2}, Lcom/huawei/operation/view/CustomWebView;->access$900(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    .line 1218
    return-void
.end method

.method public onHideCustomView()V
    .locals 2

    .line 1282
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1283
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->mCustomView:Landroid/view/View;

    if-nez v0, :cond_0

    .line 1284
    return-void

    .line 1286
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->mCustomView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1287
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1300(Lcom/huawei/operation/view/CustomWebView;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1288
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1300(Lcom/huawei/operation/view/CustomWebView;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->mCustomView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 1290
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->mCustomViewCallback:Landroid/webkit/WebChromeClient$CustomViewCallback;

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 1291
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->mCustomView:Landroid/view/View;

    .line 1292
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$200(Lcom/huawei/operation/view/CustomWebView;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 1293
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 1294
    return-void
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    .line 1192
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p2}, Lcom/huawei/operation/view/CustomWebView;->access$600(Lcom/huawei/operation/view/CustomWebView;I)V

    .line 1193
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 1194
    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5

    .line 1198
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 1199
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedTitle title:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1200
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p2}, Lcom/huawei/operation/view/CustomWebView;->access$700(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)V

    .line 1201
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$800(Lcom/huawei/operation/view/CustomWebView;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1204
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedTitle mWebViewTitles:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v2}, Lcom/huawei/operation/view/CustomWebView;->access$800(Lcom/huawei/operation/view/CustomWebView;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1209
    goto :goto_0

    .line 1205
    :catch_0
    move-exception v4

    .line 1206
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedTitle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/util/ConcurrentModificationException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1209
    goto :goto_0

    .line 1207
    :catch_1
    move-exception v4

    .line 1208
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedTitle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1212
    :cond_0
    :goto_0
    return-void
.end method

.method public onReceivedTouchIconUrl(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 4

    .line 1222
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedTouchIconUrl "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1223
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onReceivedTouchIconUrl(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 1224
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2

    .line 1266
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 1267
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->mCustomView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1268
    invoke-interface {p2}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 1269
    return-void

    .line 1271
    :cond_0
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->mCustomView:Landroid/view/View;

    .line 1272
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1300(Lcom/huawei/operation/view/CustomWebView;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1273
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1300(Lcom/huawei/operation/view/CustomWebView;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->mCustomView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 1275
    :cond_1
    iput-object p2, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->mCustomViewCallback:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1276
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1277
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$200(Lcom/huawei/operation/view/CustomWebView;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 1278
    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback<[Landroid/net/Uri;>;Landroid/webkit/WebChromeClient$FileChooserParams;)Z"
        }
    .end annotation

    .line 1255
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onShowFileChooser Android > 5.0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1256
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p2}, Lcom/huawei/operation/view/CustomWebView;->access$1202(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    .line 1257
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1100(Lcom/huawei/operation/view/CustomWebView;)V

    .line 1258
    const/4 v0, 0x1

    return v0
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;)V"
        }
    .end annotation

    .line 1242
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openFileChooser 3.0--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1243
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p1}, Lcom/huawei/operation/view/CustomWebView;->access$1002(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    .line 1244
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1100(Lcom/huawei/operation/view/CustomWebView;)V

    .line 1245
    return-void
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 1235
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openFileChooser 3.0++"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1236
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p1}, Lcom/huawei/operation/view/CustomWebView;->access$1002(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    .line 1237
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1100(Lcom/huawei/operation/view/CustomWebView;)V

    .line 1238
    return-void
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 1248
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openFileChooser uploadMsg & acceptType & capture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1249
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p1}, Lcom/huawei/operation/view/CustomWebView;->access$1002(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    .line 1250
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1100(Lcom/huawei/operation/view/CustomWebView;)V

    .line 1251
    return-void
.end method
