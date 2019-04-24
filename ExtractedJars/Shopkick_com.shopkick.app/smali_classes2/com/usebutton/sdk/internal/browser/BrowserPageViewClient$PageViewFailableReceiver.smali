.class Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;
.super Ljava/lang/Object;
.source "BrowserPageViewClient.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PageViewFailableReceiver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;

.field private final url:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;->url:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;Ljava/lang/String;Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$1;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;-><init>(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 0

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 67
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;->onResult(Lorg/json/JSONObject;)V

    return-void
.end method

.method public onResult(Lorg/json/JSONObject;)V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->access$100(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;)Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 86
    :cond_0
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/PageView;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/purchasepath/PageView;

    move-result-object p1

    .line 87
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;->this$0:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->access$100(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;)Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;->url:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;->onReceiveResult(Ljava/lang/String;Lcom/usebutton/sdk/internal/purchasepath/PageView;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
