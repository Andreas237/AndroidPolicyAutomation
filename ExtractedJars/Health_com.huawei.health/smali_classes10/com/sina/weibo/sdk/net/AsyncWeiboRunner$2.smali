.class Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sina/weibo/sdk/net/AsyncWeiboRunner;->request4RdirectURL(Ljava/lang/String;Lcom/sina/weibo/sdk/net/WeiboParameters;Ljava/lang/String;Lcom/sina/weibo/sdk/net/RequestListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sina/weibo/sdk/net/AsyncWeiboRunner;

.field final synthetic val$httpMethod:Ljava/lang/String;

.field final synthetic val$listener:Lcom/sina/weibo/sdk/net/RequestListener;

.field final synthetic val$params:Lcom/sina/weibo/sdk/net/WeiboParameters;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/sina/weibo/sdk/net/AsyncWeiboRunner;Ljava/lang/String;Ljava/lang/String;Lcom/sina/weibo/sdk/net/WeiboParameters;Lcom/sina/weibo/sdk/net/RequestListener;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->this$0:Lcom/sina/weibo/sdk/net/AsyncWeiboRunner;

    iput-object p2, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$httpMethod:Ljava/lang/String;

    iput-object p4, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$params:Lcom/sina/weibo/sdk/net/WeiboParameters;

    iput-object p5, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$listener:Lcom/sina/weibo/sdk/net/RequestListener;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 87
    :try_start_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->this$0:Lcom/sina/weibo/sdk/net/AsyncWeiboRunner;

    invoke-static {v0}, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner;->access$000(Lcom/sina/weibo/sdk/net/AsyncWeiboRunner;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$url:Ljava/lang/String;

    iget-object v2, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$httpMethod:Ljava/lang/String;

    iget-object v3, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$params:Lcom/sina/weibo/sdk/net/WeiboParameters;

    invoke-static {v0, v1, v2, v3}, Lcom/sina/weibo/sdk/net/HttpManager;->openRedirectUrl4LocationUri(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/sina/weibo/sdk/net/WeiboParameters;)Ljava/lang/String;

    move-result-object v4

    .line 88
    iget-object v0, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$listener:Lcom/sina/weibo/sdk/net/RequestListener;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$listener:Lcom/sina/weibo/sdk/net/RequestListener;

    invoke-interface {v0, v4}, Lcom/sina/weibo/sdk/net/RequestListener;->onComplete(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/sina/weibo/sdk/exception/WeiboException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    :cond_0
    goto :goto_0

    .line 91
    :catch_0
    move-exception v4

    .line 92
    :try_start_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$listener:Lcom/sina/weibo/sdk/net/RequestListener;

    if-eqz v0, :cond_1

    .line 93
    iget-object v0, p0, Lcom/sina/weibo/sdk/net/AsyncWeiboRunner$2;->val$listener:Lcom/sina/weibo/sdk/net/RequestListener;

    invoke-interface {v0, v4}, Lcom/sina/weibo/sdk/net/RequestListener;->onWeiboException(Lcom/sina/weibo/sdk/exception/WeiboException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    :cond_1
    goto :goto_0

    .line 95
    :catchall_0
    move-exception v5

    throw v5

    .line 97
    :goto_0
    return-void
.end method
