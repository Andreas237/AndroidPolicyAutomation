.class public interface abstract Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;
.super Ljava/lang/Object;
.source "BrowserInterface.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/purchasepath/BrowserInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Header"
.end annotation


# virtual methods
.method public abstract getBackgroundColor()I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end method

.method public abstract getSubtitle()Lcom/usebutton/sdk/internal/BrowserText;
.end method

.method public abstract getTintColor()I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end method

.method public abstract getTitle()Lcom/usebutton/sdk/internal/BrowserText;
.end method

.method public abstract setBackgroundColor(I)V
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param
.end method

.method public abstract setCustomActionView(Landroid/view/View;)V
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setTintColor(I)V
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param
.end method
