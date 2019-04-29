.class Lcom/rt/mobile/english/ui/ArticleFragment$5;
.super Ljava/lang/Object;
.source "ArticleFragment.java"

# interfaces
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ArticleFragment;->loadNew()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit/Callback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ArticleFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$5;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 3

    .line 351
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Article load error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 352
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$5;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 337
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ArticleFragment$5;->success(Ljava/lang/String;Lretrofit/client/Response;)V

    return-void
.end method

.method public success(Ljava/lang/String;Lretrofit/client/Response;)V
    .locals 6

    if-eqz p1, :cond_0

    const-string p2, ""

    .line 340
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 341
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$5;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object v0, p2, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getAppUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/news/latest/"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$5;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$100(Lcom/rt/mobile/english/ui/ArticleFragment;)Lcom/rt/mobile/english/data/articles/Article;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/html/"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "text/html"

    const-string v4, "utf-8"

    const/4 v5, 0x0

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 343
    :cond_0
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$5;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object p2, p2, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    .line 345
    :goto_0
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$5;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    iget-object p2, p2, Lcom/rt/mobile/english/ui/ArticleFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 346
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$5;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {p2, p1}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$002(Lcom/rt/mobile/english/ui/ArticleFragment;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method
