.class Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam$ExtraTaskCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;->initLoad()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;


# direct methods
.method constructor <init>(Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity$1;->this$0:Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Ljava/lang/String;)V
    .locals 2

    .line 135
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity$1;->this$0:Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;->access$100(Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;)Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity$1;->this$0:Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;

    invoke-static {v1}, Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;->access$000(Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;)Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam;->getRequestUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 136
    return-void
.end method

.method public onException(Ljava/lang/String;)V
    .locals 3

    .line 140
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity$1;->this$0:Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;->access$200(Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;)Lcom/sina/weibo/sdk/web/client/BaseWebViewClient;

    move-result-object v0

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity$1;->this$0:Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;

    const-string v2, "pic upload error"

    invoke-virtual {v0, v1, v2}, Lcom/sina/weibo/sdk/web/client/BaseWebViewClient;->errorBack(Landroid/app/Activity;Ljava/lang/String;)V

    .line 141
    return-void
.end method
