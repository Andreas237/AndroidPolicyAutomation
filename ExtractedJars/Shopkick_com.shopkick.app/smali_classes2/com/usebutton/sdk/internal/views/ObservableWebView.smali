.class public Lcom/usebutton/sdk/internal/views/ObservableWebView;
.super Landroid/webkit/WebView;
.source "ObservableWebView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/views/ObservableWebView$OnScrollChangeListener;
    }
.end annotation


# instance fields
.field private onScrollChangeListener:Lcom/usebutton/sdk/internal/views/ObservableWebView$OnScrollChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected onScrollChanged(IIII)V
    .locals 6

    .line 33
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebView;->onScrollChanged(IIII)V

    .line 34
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/ObservableWebView;->onScrollChangeListener:Lcom/usebutton/sdk/internal/views/ObservableWebView$OnScrollChangeListener;

    if-eqz v0, :cond_0

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    .line 35
    invoke-interface/range {v0 .. v5}, Lcom/usebutton/sdk/internal/views/ObservableWebView$OnScrollChangeListener;->onScrollChange(Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method

.method public setCustomOnScrollChangeListener(Lcom/usebutton/sdk/internal/views/ObservableWebView$OnScrollChangeListener;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/ObservableWebView;->onScrollChangeListener:Lcom/usebutton/sdk/internal/views/ObservableWebView$OnScrollChangeListener;

    return-void
.end method
