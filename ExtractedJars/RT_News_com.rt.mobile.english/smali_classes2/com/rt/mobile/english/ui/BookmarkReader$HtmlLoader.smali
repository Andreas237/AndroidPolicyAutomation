.class public Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;
.super Landroid/os/AsyncTask;
.source "BookmarkReader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/BookmarkReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "HtmlLoader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field TAG:Ljava/lang/String;

.field _url:Ljava/lang/String;

.field final synthetic this$0:Lcom/rt/mobile/english/ui/BookmarkReader;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/BookmarkReader;)V
    .locals 0

    .line 324
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->this$0:Lcom/rt/mobile/english/ui/BookmarkReader;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const-string p1, "AsyncTask"

    .line 326
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->TAG:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 324
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->doInBackground([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Void;
    .locals 9

    .line 331
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->TAG:Ljava/lang/String;

    const-string v0, "HtmlLoader doInBackground"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 332
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->TAG:Ljava/lang/String;

    const-string v0, "HtmlLoader loadFromDB"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v4, "article_id = ?"

    const/4 p1, 0x1

    .line 335
    new-array v5, p1, [Ljava/lang/String;

    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->this$0:Lcom/rt/mobile/english/ui/BookmarkReader;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/BookmarkReader;->access$300(Lcom/rt/mobile/english/ui/BookmarkReader;)Lcom/rt/mobile/english/data/articles/Article;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, v5, v0

    .line 337
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/DatabaseManager;->openDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "bookmarks"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 338
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-nez p1, :cond_0

    .line 341
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->TAG:Ljava/lang/String;

    const-string v0, "c = null"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 343
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->this$0:Lcom/rt/mobile/english/ui/BookmarkReader;

    const-string v1, "html"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/rt/mobile/english/ui/BookmarkReader;->access$402(Lcom/rt/mobile/english/ui/BookmarkReader;Ljava/lang/String;)Ljava/lang/String;

    .line 345
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DB Article ID = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "article_id"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 347
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 349
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/DatabaseManager;->closeDatabase()V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 324
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 6

    .line 357
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->TAG:Ljava/lang/String;

    const-string v0, "HtmlLoader PostExecute"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 358
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->this$0:Lcom/rt/mobile/english/ui/BookmarkReader;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/BookmarkReader;->access$400(Lcom/rt/mobile/english/ui/BookmarkReader;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->this$0:Lcom/rt/mobile/english/ui/BookmarkReader;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/BookmarkReader;->access$400(Lcom/rt/mobile/english/ui/BookmarkReader;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 359
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->this$0:Lcom/rt/mobile/english/ui/BookmarkReader;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/BookmarkReader;->access$500(Lcom/rt/mobile/english/ui/BookmarkReader;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getAppUrl()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->this$0:Lcom/rt/mobile/english/ui/BookmarkReader;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/BookmarkReader;->access$400(Lcom/rt/mobile/english/ui/BookmarkReader;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "text/html"

    const-string v4, "utf-8"

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 361
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->this$0:Lcom/rt/mobile/english/ui/BookmarkReader;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/BookmarkReader;->access$500(Lcom/rt/mobile/english/ui/BookmarkReader;)Landroid/webkit/WebView;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->_url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 362
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->TAG:Ljava/lang/String;

    const-string v0, "Loading article using url"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 364
    :goto_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->this$0:Lcom/rt/mobile/english/ui/BookmarkReader;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/BookmarkReader;->access$600(Lcom/rt/mobile/english/ui/BookmarkReader;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    return-void
.end method
