.class Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;
.super Landroid/webkit/WebChromeClient;
.source "SKWebView.java"

# interfaces
.implements Lcom/shopkick/app/activities/IActivityResultListener;
.implements Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/webview/SKWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SKWebChromeClient"
.end annotation


# instance fields
.field dialog:Landroid/app/AlertDialog;

.field dialogClickListener:Landroid/content/DialogInterface$OnClickListener;

.field private imageUri:Landroid/net/Uri;

.field result:Landroid/webkit/JsResult;

.field final synthetic this$0:Lcom/shopkick/app/webview/SKWebView;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/webview/SKWebView;)V
    .locals 0

    .line 622
    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 627
    new-instance p1, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient$1;-><init>(Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;)V

    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->dialogClickListener:Landroid/content/DialogInterface$OnClickListener;

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/webview/SKWebView;Lcom/shopkick/app/webview/SKWebView$1;)V
    .locals 0

    .line 622
    invoke-direct {p0, p1}, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;-><init>(Lcom/shopkick/app/webview/SKWebView;)V

    return-void
.end method


# virtual methods
.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x18

    if-eq p2, v0, :cond_0

    return-void

    .line 722
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p2}, Lcom/shopkick/app/webview/SKWebView;->access$1200(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 725
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$1100(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    const/4 p3, 0x1

    if-eqz p4, :cond_3

    .line 727
    invoke-virtual {p4}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 732
    :cond_1
    invoke-virtual {p4}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_2

    .line 734
    new-array p3, p3, [Landroid/net/Uri;

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p4

    aput-object p4, p3, p1

    goto :goto_1

    :cond_2
    move-object p3, p2

    goto :goto_1

    .line 729
    :cond_3
    :goto_0
    new-array p3, p3, [Landroid/net/Uri;

    iget-object p4, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->imageUri:Landroid/net/Uri;

    aput-object p4, p3, p1

    :goto_1
    if-eqz p3, :cond_4

    .line 738
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$1100(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;

    move-result-object p1

    invoke-interface {p1, p3}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 740
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->access$1102(Lcom/shopkick/app/webview/SKWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    goto :goto_3

    .line 742
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$1000(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;

    move-result-object p1

    if-eqz p1, :cond_8

    const/4 p1, -0x1

    if-eq p3, p1, :cond_6

    move-object p1, p2

    goto :goto_2

    :cond_6
    if-nez p4, :cond_7

    .line 748
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->imageUri:Landroid/net/Uri;

    goto :goto_2

    :cond_7
    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    .line 751
    :goto_2
    iget-object p3, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p3}, Lcom/shopkick/app/webview/SKWebView;->access$1000(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;

    move-result-object p3

    if-eqz p3, :cond_8

    .line 752
    iget-object p3, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p3}, Lcom/shopkick/app/webview/SKWebView;->access$1000(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;

    move-result-object p3

    invoke-interface {p3, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 753
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->access$1002(Lcom/shopkick/app/webview/SKWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    :cond_8
    :goto_3
    return-void
.end method

.method public onCloseWindow(Landroid/webkit/WebView;)V
    .locals 0

    .line 636
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$800(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewStatusCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 637
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$800(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewStatusCallback;

    move-result-object p1

    invoke-interface {p1}, Lcom/shopkick/app/webview/IWebViewStatusCallback;->onPageClosed()V

    :cond_0
    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 3

    .line 658
    const-class v0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CONSOLE MESSAGE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 659
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    move-result p1

    return p1
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 0

    .line 643
    iput-object p4, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->result:Landroid/webkit/JsResult;

    .line 644
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 645
    new-instance p2, Landroid/app/AlertDialog$Builder;

    invoke-direct {p2, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const p4, 0x7f110036

    .line 647
    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p4

    .line 648
    invoke-virtual {p4, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p3

    const/4 p4, 0x0

    .line 649
    invoke-virtual {p3, p4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p3

    const p4, 0x7f11014f

    .line 650
    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object p4, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->dialogClickListener:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p3, p1, p4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 651
    invoke-virtual {p2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->dialog:Landroid/app/AlertDialog;

    .line 652
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->dialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    const/4 p1, 0x1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    const/16 v0, 0x1d

    if-eq p1, v0, :cond_0

    return-void

    .line 767
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->removePermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V

    .line 769
    sget-object p1, Lcom/shopkick/app/permissions/PermissionUtils;->WEBVIEW_PERMISSIONS:[Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/shopkick/app/permissions/PermissionUtils;->arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string p1, ""

    .line 770
    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->openFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    move v1, p1

    .line 774
    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_3

    .line 775
    aget v2, p3, v1

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v2}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object v2

    aget-object v3, p2, v1

    invoke-static {v2, v3}, Landroid/support/v4/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 783
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/shopkick/app/permissions/PermissionUtils;->showOpenSettingsAppDialog(Landroid/content/Context;[Ljava/lang/String;)V

    .line 786
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$1100(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 787
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$1100(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;

    move-result-object p1

    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 788
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1, v0}, Lcom/shopkick/app/webview/SKWebView;->access$1102(Lcom/shopkick/app/webview/SKWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    :cond_5
    :goto_2
    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/webkit/WebChromeClient$FileChooserParams;",
            ")Z"
        }
    .end annotation

    .line 693
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$1100(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;

    move-result-object p1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    .line 694
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$1100(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;

    move-result-object p1

    invoke-interface {p1, p3}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 695
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1, p3}, Lcom/shopkick/app/webview/SKWebView;->access$1102(Lcom/shopkick/app/webview/SKWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    .line 699
    :cond_0
    sget-object p1, Lcom/shopkick/app/permissions/PermissionUtils;->WEBVIEW_PERMISSIONS:[Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/shopkick/app/permissions/PermissionUtils;->arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 701
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->access$1102(Lcom/shopkick/app/webview/SKWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    .line 702
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addPermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V

    .line 703
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object p1

    sget-object p2, Lcom/shopkick/app/permissions/PermissionUtils;->WEBVIEW_PERMISSIONS:[Ljava/lang/String;

    const/16 p3, 0x1d

    invoke-virtual {p1, p2, p3}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return v0

    .line 708
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->access$1102(Lcom/shopkick/app/webview/SKWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    const-string p1, ""

    .line 709
    invoke-virtual {p0, p3, p1}, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->openFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;)V

    return v0
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;)V
    .locals 3

    .line 664
    iget-object p2, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p2, p1}, Lcom/shopkick/app/webview/SKWebView;->access$1002(Lcom/shopkick/app/webview/SKWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    .line 666
    new-instance p1, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 667
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-nez p2, :cond_0

    .line 668
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 670
    :cond_0
    new-instance p2, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "IMG_"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".jpg"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 672
    invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->imageUri:Landroid/net/Uri;

    .line 674
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p2, "output"

    .line 675
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->imageUri:Landroid/net/Uri;

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 677
    new-instance p2, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "android.intent.category.OPENABLE"

    .line 678
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "image/*"

    .line 679
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 681
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    .line 682
    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f1100fc

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 681
    invoke-static {p2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "android.intent.extra.INITIAL_INTENTS"

    const/4 v1, 0x1

    .line 683
    new-array v1, v1, [Landroid/os/Parcelable;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 685
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 686
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object p1

    const/16 v0, 0x18

    invoke-virtual {p1, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
