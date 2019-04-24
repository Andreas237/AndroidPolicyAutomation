.class public interface abstract Lcom/usebutton/sdk/purchasepath/BrowserPage;
.super Ljava/lang/Object;
.source "BrowserPage.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;
    }
.end annotation


# virtual methods
.method public abstract getBrowserDom(Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;)V
.end method

.method public abstract getUrl()Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method
