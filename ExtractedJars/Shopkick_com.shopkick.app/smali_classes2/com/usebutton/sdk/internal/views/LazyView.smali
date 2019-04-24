.class public Lcom/usebutton/sdk/internal/views/LazyView;
.super Landroid/widget/FrameLayout;
.source "LazyView.java"


# instance fields
.field private final mInflater:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/views/LazyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/views/LazyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    new-instance p2, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

    invoke-direct {p2, p1}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/LazyView;->mInflater:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 53
    new-instance p2, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

    invoke-direct {p2, p1}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/LazyView;->mInflater:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

    return-void
.end method


# virtual methods
.method public load(ILcom/usebutton/sdk/internal/util/Receiver;)V
    .locals 2
    .param p1    # I
        .annotation build Landroid/support/annotation/LayoutRes;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/util/Receiver;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 39
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/LazyView;->mInflater:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

    new-instance v1, Lcom/usebutton/sdk/internal/views/LazyView$1;

    invoke-direct {v1, p0, p2}, Lcom/usebutton/sdk/internal/views/LazyView$1;-><init>(Lcom/usebutton/sdk/internal/views/LazyView;Lcom/usebutton/sdk/internal/util/Receiver;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->inflate(ILandroid/view/ViewGroup;Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$OnInflateFinishedListener;)V

    return-void
.end method
