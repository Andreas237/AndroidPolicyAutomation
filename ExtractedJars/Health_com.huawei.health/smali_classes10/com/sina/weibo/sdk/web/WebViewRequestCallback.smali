.class public interface abstract Lcom/sina/weibo/sdk/web/WebViewRequestCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract closePage()V
.end method

.method public abstract onPageFinishedCallBack(Landroid/webkit/WebView;Ljava/lang/String;)V
.end method

.method public abstract onPageStartedCallBack(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
.end method

.method public abstract onReceivedErrorCallBack(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onReceivedSslErrorCallBack(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
.end method

.method public abstract shouldOverrideUrlLoadingCallBack(Landroid/webkit/WebView;Ljava/lang/String;)Z
.end method
