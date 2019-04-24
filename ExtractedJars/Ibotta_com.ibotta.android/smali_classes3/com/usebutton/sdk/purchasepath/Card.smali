.class public abstract Lcom/usebutton/sdk/purchasepath/Card;
.super Ljava/lang/Object;
.source "Card.java"


# static fields
.field public static final DEFAULT_TEXT_SIZE_BODY:F = 13.0f

.field public static final DEFAULT_TEXT_SIZE_TITLE:F = 16.0f


# instance fields
.field private browserWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/usebutton/sdk/purchasepath/BrowserInterface;",
            ">;"
        }
    .end annotation
.end field

.field private callToAction:Lcom/usebutton/sdk/purchasepath/CallToAction;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private key:Ljava/lang/Object;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private viewWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/purchasepath/CallToAction;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->viewWeakReference:Ljava/lang/ref/WeakReference;

    .line 19
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->browserWeakReference:Ljava/lang/ref/WeakReference;

    .line 27
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/Card;->callToAction:Lcom/usebutton/sdk/purchasepath/CallToAction;

    return-void
.end method


# virtual methods
.method public final bindView(Landroid/view/View;)V
    .locals 1

    .line 60
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->viewWeakReference:Ljava/lang/ref/WeakReference;

    .line 61
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/purchasepath/Card;->onBindView(Landroid/view/View;)V

    return-void
.end method

.method public final createView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 49
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/purchasepath/Card;->onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->key:Ljava/lang/Object;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    instance-of v1, p1, Lcom/usebutton/sdk/purchasepath/Card;

    if-nez v1, :cond_0

    goto :goto_0

    .line 118
    :cond_0
    check-cast p1, Lcom/usebutton/sdk/purchasepath/Card;

    .line 119
    iget-object p1, p1, Lcom/usebutton/sdk/purchasepath/Card;->key:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getBrowser()Lcom/usebutton/sdk/purchasepath/BrowserInterface;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->browserWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    return-object v0
.end method

.method public getCallToAction()Lcom/usebutton/sdk/purchasepath/CallToAction;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->callToAction:Lcom/usebutton/sdk/purchasepath/CallToAction;

    return-object v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->key:Ljava/lang/Object;

    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->viewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->key:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 125
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method protected abstract onBindView(Landroid/view/View;)V
.end method

.method protected abstract onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public final setBrowser(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 129
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/usebutton/sdk/purchasepath/Card;->browserWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public setKey(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 100
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/Card;->key:Ljava/lang/Object;

    return-void
.end method
