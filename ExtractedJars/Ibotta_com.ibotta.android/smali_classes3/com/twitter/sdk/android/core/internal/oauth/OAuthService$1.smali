.class Lcom/twitter/sdk/android/core/internal/oauth/OAuthService$1;
.super Ljava/lang/Object;
.source "OAuthService.java"

# interfaces
.implements Lretrofit/RequestInterceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;-><init>(Lcom/twitter/sdk/android/core/TwitterCore;Ljavax/net/ssl/SSLSocketFactory;Lcom/twitter/sdk/android/core/internal/TwitterApi;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;


# direct methods
.method constructor <init>(Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService$1;->this$0:Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public intercept(Lretrofit/RequestInterceptor$RequestFacade;)V
    .locals 2

    const-string v0, "User-Agent"

    .line 56
    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService$1;->this$0:Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;

    invoke-virtual {v1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->getUserAgent()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lretrofit/RequestInterceptor$RequestFacade;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
