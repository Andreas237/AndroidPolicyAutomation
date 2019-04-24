.class public final Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;
.super Ljava/lang/Object;
.source "IbottaWebViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/browser/IbottaWebViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIbottaWebViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IbottaWebViewState.kt\ncom/ibotta/android/views/browser/IbottaWebViewState$Builder\n*L\n1#1,34:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;",
        "",
        "()V",
        "domStorageEnabled",
        "",
        "javaScriptEnabled",
        "loadWithOverviewMode",
        "useWideViewPort",
        "webViewClient",
        "Landroid/webkit/WebViewClient;",
        "build",
        "Lcom/ibotta/android/views/browser/IbottaWebViewState;",
        "value",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private domStorageEnabled:Z

.field private javaScriptEnabled:Z

.field private loadWithOverviewMode:Z

.field private useWideViewPort:Z

.field private webViewClient:Landroid/webkit/WebViewClient;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->loadWithOverviewMode:Z

    .line 16
    iput-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->javaScriptEnabled:Z

    .line 17
    iput-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->useWideViewPort:Z

    .line 18
    iput-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->domStorageEnabled:Z

    return-void
.end method


# virtual methods
.method public final build()Lcom/ibotta/android/views/browser/IbottaWebViewState;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    new-instance v6, Lcom/ibotta/android/views/browser/IbottaWebViewState;

    .line 28
    iget-boolean v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->loadWithOverviewMode:Z

    .line 29
    iget-boolean v2, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->javaScriptEnabled:Z

    .line 30
    iget-boolean v3, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->useWideViewPort:Z

    .line 31
    iget-boolean v4, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->domStorageEnabled:Z

    .line 32
    iget-object v5, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->webViewClient:Landroid/webkit/WebViewClient;

    move-object v0, v6

    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/browser/IbottaWebViewState;-><init>(ZZZZLandroid/webkit/WebViewClient;)V

    return-object v6
.end method

.method public final domStorageEnabled(Z)Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->domStorageEnabled:Z

    return-object v0
.end method

.method public final javaScriptEnabled(Z)Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->javaScriptEnabled:Z

    return-object v0
.end method

.method public final loadWithOverviewMode(Z)Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->loadWithOverviewMode:Z

    return-object v0
.end method

.method public final useWideViewPort(Z)Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->useWideViewPort:Z

    return-object v0
.end method

.method public final webViewClient(Landroid/webkit/WebViewClient;)Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;
    .locals 1
    .param p1    # Landroid/webkit/WebViewClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->webViewClient:Landroid/webkit/WebViewClient;

    return-object v0
.end method
