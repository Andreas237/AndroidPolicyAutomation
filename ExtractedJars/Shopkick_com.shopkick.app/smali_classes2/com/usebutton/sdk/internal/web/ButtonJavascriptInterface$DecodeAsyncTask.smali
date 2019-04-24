.class Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;
.super Landroid/os/AsyncTask;
.source "ButtonJavascriptInterface.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DecodeAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ButtonJavascriptInterface$DecodeAsyncTask"


# instance fields
.field private listener:Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;

.field private rawHtml:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;)V
    .locals 0

    .line 224
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 225
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;->rawHtml:Ljava/lang/String;

    .line 226
    iput-object p2, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;->listener:Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 201
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
    .locals 2

    .line 232
    :try_start_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;->rawHtml:Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-static {p1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 234
    :catch_0
    sget-object p1, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "could not decode html: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;->rawHtml:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 201
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;->listener:Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;->onResult(Ljava/lang/String;)V

    return-void
.end method
