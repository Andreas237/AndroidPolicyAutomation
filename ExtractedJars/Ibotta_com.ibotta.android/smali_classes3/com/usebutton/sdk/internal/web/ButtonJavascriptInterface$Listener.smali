.class public interface abstract Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;
.super Ljava/lang/Object;
.source "ButtonJavascriptInterface.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onAutofillFieldsDetected(Lorg/json/JSONObject;)V
.end method

.method public abstract onAutofillFieldsNotDetected()V
.end method

.method public abstract onAutofillFormSubmitted(Lorg/json/JSONObject;)V
.end method

.method public abstract onDisplayAutofillFillCard()V
.end method

.method public abstract onNavigateJs(Ljava/lang/String;)V
.end method

.method public abstract onPageFinishedJs(Ljava/lang/String;)V
.end method
