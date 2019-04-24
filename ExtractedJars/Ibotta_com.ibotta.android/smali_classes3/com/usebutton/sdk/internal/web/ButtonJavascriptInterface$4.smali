.class Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$4;
.super Ljava/lang/Object;
.source "ButtonJavascriptInterface.java"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->observeFields(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$4;->this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    .line 168
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$4;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method

.method public onReceiveValue(Ljava/lang/String;)V
    .locals 0

    .line 171
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 174
    iget-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$4;->this$0:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->access$100(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

    move-result-object p1

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;->onDisplayAutofillFillCard()V

    :cond_0
    return-void
.end method
