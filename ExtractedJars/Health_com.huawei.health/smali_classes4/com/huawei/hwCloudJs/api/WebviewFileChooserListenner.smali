.class public interface abstract Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/support/enables/INoProguard;


# virtual methods
.method public abstract onActivityResult(IILandroid/content/Intent;)V
.end method

.method public abstract onShowFileChooser(Landroid/app/Activity;Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Landroid/webkit/WebView;Landroid/webkit/ValueCallback<[Landroid/net/Uri;>;Landroid/webkit/WebChromeClient$FileChooserParams;)Z"
        }
    .end annotation
.end method

.method public abstract openFileChooser(Landroid/app/Activity;Landroid/webkit/ValueCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Landroid/webkit/ValueCallback<Landroid/net/Uri;>;)V"
        }
    .end annotation
.end method

.method public abstract openFileChooser(Landroid/app/Activity;Landroid/webkit/ValueCallback;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Landroid/webkit/ValueCallback<Landroid/net/Uri;>;Ljava/lang/String;)V"
        }
    .end annotation
.end method

.method public abstract openFileChooser(Landroid/app/Activity;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Landroid/webkit/ValueCallback<Landroid/net/Uri;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation
.end method
