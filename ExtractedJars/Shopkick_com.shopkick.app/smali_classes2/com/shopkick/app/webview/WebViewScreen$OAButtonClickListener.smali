.class Lcom/shopkick/app/webview/WebViewScreen$OAButtonClickListener;
.super Ljava/lang/Object;
.source "WebViewScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/webview/WebViewScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OAButtonClickListener"
.end annotation


# instance fields
.field private chainId:Ljava/lang/String;

.field private wvref:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/webview/WebViewScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/webview/WebViewScreen;Ljava/lang/String;)V
    .locals 1

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 205
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/webview/WebViewScreen$OAButtonClickListener;->wvref:Ljava/lang/ref/WeakReference;

    .line 206
    iput-object p2, p0, Lcom/shopkick/app/webview/WebViewScreen$OAButtonClickListener;->chainId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 210
    iget-object p1, p0, Lcom/shopkick/app/webview/WebViewScreen$OAButtonClickListener;->wvref:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/webview/WebViewScreen;

    if-eqz p1, :cond_0

    .line 213
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "chain_id"

    .line 214
    iget-object v2, p0, Lcom/shopkick/app/webview/WebViewScreen$OAButtonClickListener;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_screen"

    .line 215
    iget-object v2, p1, Lcom/shopkick/app/webview/WebViewScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v2, v2, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    .line 216
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 215
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const-class v1, Lcom/shopkick/app/location/LocationMapScreen;

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/webview/WebViewScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    return-void
.end method
