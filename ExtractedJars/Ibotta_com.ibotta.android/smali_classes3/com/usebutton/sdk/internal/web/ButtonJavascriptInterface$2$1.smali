.class Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2$1;
.super Ljava/lang/Object;
.source "ButtonJavascriptInterface.java"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;->run()V
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
.field final synthetic this$1:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2$1;->this$1:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    .line 141
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2$1;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method

.method public onReceiveValue(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
