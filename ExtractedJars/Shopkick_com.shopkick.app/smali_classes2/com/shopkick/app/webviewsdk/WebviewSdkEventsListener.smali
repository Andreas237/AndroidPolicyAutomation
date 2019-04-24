.class public Lcom/shopkick/app/webviewsdk/WebviewSdkEventsListener;
.super Ljava/lang/Object;
.source "WebviewSdkEventsListener.java"

# interfaces
.implements Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;


# instance fields
.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/shopkick/app/webviewsdk/WebviewSdkEventsListener;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public onWebviewClosed()V
    .locals 0

    return-void
.end method

.method public onWebviewPageFinished(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onWebviewPageStarted(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onWebviewReceiveJsAlert()V
    .locals 0

    return-void
.end method

.method public onWebviewReceivedError(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    return-void
.end method

.method public shouldWebviewLoadUrl(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
