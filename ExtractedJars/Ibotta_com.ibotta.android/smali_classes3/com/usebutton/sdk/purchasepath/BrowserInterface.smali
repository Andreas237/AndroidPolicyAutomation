.class public interface abstract Lcom/usebutton/sdk/purchasepath/BrowserInterface;
.super Ljava/lang/Object;
.source "BrowserInterface.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;,
        Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;
    }
.end annotation


# static fields
.field public static final INVALID_COLOR:I = -0x1


# virtual methods
.method public abstract getCardList()Lcom/usebutton/sdk/purchasepath/CardList;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract getFooter()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;
.end method

.method public abstract getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;
.end method

.method public abstract getViewContainer()Landroid/widget/RelativeLayout;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract hideTopCard()V
.end method

.method public abstract reloadCards()V
.end method

.method public abstract setBrowserChromeClient(Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;)V
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract showTopCard()V
.end method
