.class public final Lcom/ibotta/android/views/browser/IbottaWebViewState;
.super Ljava/lang/Object;
.source "IbottaWebViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001eB;\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J=\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/ibotta/android/views/browser/IbottaWebViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "loadWithOverviewMode",
        "",
        "javaScriptEnabled",
        "useWideViewPort",
        "domStorageEnabled",
        "webViewClient",
        "Landroid/webkit/WebViewClient;",
        "(ZZZZLandroid/webkit/WebViewClient;)V",
        "getDomStorageEnabled",
        "()Z",
        "getJavaScriptEnabled",
        "getLoadWithOverviewMode",
        "getUseWideViewPort",
        "getWebViewClient",
        "()Landroid/webkit/WebViewClient;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "Builder",
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
.field private final domStorageEnabled:Z

.field private final javaScriptEnabled:Z

.field private final loadWithOverviewMode:Z

.field private final useWideViewPort:Z

.field private final webViewClient:Landroid/webkit/WebViewClient;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/browser/IbottaWebViewState;-><init>(ZZZZLandroid/webkit/WebViewClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/browser/IbottaWebViewState;-><init>(ZZZZLandroid/webkit/WebViewClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/browser/IbottaWebViewState;-><init>(ZZZZLandroid/webkit/WebViewClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x18

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/browser/IbottaWebViewState;-><init>(ZZZZLandroid/webkit/WebViewClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZZ)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/browser/IbottaWebViewState;-><init>(ZZZZLandroid/webkit/WebViewClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZZLandroid/webkit/WebViewClient;)V
    .locals 0
    .param p5    # Landroid/webkit/WebViewClient;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->loadWithOverviewMode:Z

    iput-boolean p2, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->javaScriptEnabled:Z

    iput-boolean p3, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->useWideViewPort:Z

    iput-boolean p4, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->domStorageEnabled:Z

    iput-object p5, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->webViewClient:Landroid/webkit/WebViewClient;

    return-void
.end method

.method public synthetic constructor <init>(ZZZZLandroid/webkit/WebViewClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x1

    if-eqz p7, :cond_0

    const/4 p7, 0x1

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    move v2, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    move v0, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    .line 11
    move-object p5, p1

    check-cast p5, Landroid/webkit/WebViewClient;

    move-object p6, p5

    goto :goto_4

    :cond_4
    move-object p6, p5

    :goto_4
    move-object p1, p0

    move p2, p7

    move p3, v1

    move p4, v2

    move p5, v0

    invoke-direct/range {p1 .. p6}, Lcom/ibotta/android/views/browser/IbottaWebViewState;-><init>(ZZZZLandroid/webkit/WebViewClient;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/browser/IbottaWebViewState;ZZZZLandroid/webkit/WebViewClient;ILjava/lang/Object;)Lcom/ibotta/android/views/browser/IbottaWebViewState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->loadWithOverviewMode:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->javaScriptEnabled:Z

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->useWideViewPort:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->domStorageEnabled:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->webViewClient:Landroid/webkit/WebViewClient;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/ibotta/android/views/browser/IbottaWebViewState;->copy(ZZZZLandroid/webkit/WebViewClient;)Lcom/ibotta/android/views/browser/IbottaWebViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->loadWithOverviewMode:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->javaScriptEnabled:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->useWideViewPort:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->domStorageEnabled:Z

    return v0
.end method

.method public final component5()Landroid/webkit/WebViewClient;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->webViewClient:Landroid/webkit/WebViewClient;

    return-object v0
.end method

.method public final copy(ZZZZLandroid/webkit/WebViewClient;)Lcom/ibotta/android/views/browser/IbottaWebViewState;
    .locals 7
    .param p5    # Landroid/webkit/WebViewClient;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v6, Lcom/ibotta/android/views/browser/IbottaWebViewState;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/browser/IbottaWebViewState;-><init>(ZZZZLandroid/webkit/WebViewClient;)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_5

    instance-of v1, p1, Lcom/ibotta/android/views/browser/IbottaWebViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Lcom/ibotta/android/views/browser/IbottaWebViewState;

    iget-boolean v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->loadWithOverviewMode:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/browser/IbottaWebViewState;->loadWithOverviewMode:Z

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    iget-boolean v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->javaScriptEnabled:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/browser/IbottaWebViewState;->javaScriptEnabled:Z

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_4

    iget-boolean v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->useWideViewPort:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/browser/IbottaWebViewState;->useWideViewPort:Z

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_4

    iget-boolean v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->domStorageEnabled:Z

    iget-boolean v3, p1, Lcom/ibotta/android/views/browser/IbottaWebViewState;->domStorageEnabled:Z

    if-ne v1, v3, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->webViewClient:Landroid/webkit/WebViewClient;

    iget-object p1, p1, Lcom/ibotta/android/views/browser/IbottaWebViewState;->webViewClient:Landroid/webkit/WebViewClient;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    return v2

    :cond_5
    :goto_4
    return v0
.end method

.method public final getDomStorageEnabled()Z
    .locals 1

    .line 10
    iget-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->domStorageEnabled:Z

    return v0
.end method

.method public final getJavaScriptEnabled()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->javaScriptEnabled:Z

    return v0
.end method

.method public final getLoadWithOverviewMode()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->loadWithOverviewMode:Z

    return v0
.end method

.method public final getUseWideViewPort()Z
    .locals 1

    .line 9
    iget-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->useWideViewPort:Z

    return v0
.end method

.method public final getWebViewClient()Landroid/webkit/WebViewClient;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->webViewClient:Landroid/webkit/WebViewClient;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->loadWithOverviewMode:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->javaScriptEnabled:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->useWideViewPort:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->domStorageEnabled:Z

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->webViewClient:Landroid/webkit/WebViewClient;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IbottaWebViewState(loadWithOverviewMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->loadWithOverviewMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", javaScriptEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->javaScriptEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useWideViewPort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->useWideViewPort:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", domStorageEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->domStorageEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", webViewClient="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/browser/IbottaWebViewState;->webViewClient:Landroid/webkit/WebViewClient;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
