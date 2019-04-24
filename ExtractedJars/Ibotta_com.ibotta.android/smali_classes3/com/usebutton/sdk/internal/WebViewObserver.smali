.class public Lcom/usebutton/sdk/internal/WebViewObserver;
.super Ljava/lang/Object;
.source "WebViewObserver.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;
    }
.end annotation


# static fields
.field private static final OUR_INSTANCE:Lcom/usebutton/sdk/internal/WebViewObserver;


# instance fields
.field private listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/usebutton/sdk/internal/WebViewObserver;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/WebViewObserver;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/WebViewObserver;->OUR_INSTANCE:Lcom/usebutton/sdk/internal/WebViewObserver;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/WebViewObserver;->listeners:Ljava/util/List;

    return-void
.end method

.method public static getInstance()Lcom/usebutton/sdk/internal/WebViewObserver;
    .locals 1

    .line 14
    sget-object v0, Lcom/usebutton/sdk/internal/WebViewObserver;->OUR_INSTANCE:Lcom/usebutton/sdk/internal/WebViewObserver;

    return-object v0
.end method


# virtual methods
.method public addListener(Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 22
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewObserver;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeListener(Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewObserver;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public updateProgress(I)V
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewObserver;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;

    if-eqz v1, :cond_0

    .line 32
    invoke-interface {v1, p1}, Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;->onProgressChanged(I)V

    goto :goto_0

    :cond_1
    return-void
.end method
