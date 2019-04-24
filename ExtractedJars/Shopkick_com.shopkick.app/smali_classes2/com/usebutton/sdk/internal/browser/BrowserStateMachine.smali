.class public interface abstract Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;
.super Ljava/lang/Object;
.source "BrowserStateMachine.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;
    }
.end annotation


# virtual methods
.method public abstract commit(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setJavascriptInterface(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V
    .param p1    # Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract start(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
