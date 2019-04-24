.class public Lorg/researchstack/backbone/ui/views/ObservableScrollView;
.super Landroid/widget/ScrollView;
.source "ObservableScrollView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/ui/views/ObservableScrollView$OnScrollListener;
    }
.end annotation


# instance fields
.field private onScrollListener:Lorg/researchstack/backbone/ui/views/ObservableScrollView$OnScrollListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 13
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 23
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I
    .param p4, "defStyleRes"    # I
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 30
    return-void
.end method


# virtual methods
.method protected onScrollChanged(IIII)V
    .locals 1
    .param p1, "l"    # I
    .param p2, "t"    # I
    .param p3, "oldl"    # I
    .param p4, "oldt"    # I

    .prologue
    .line 35
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    .line 37
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/ObservableScrollView;->onScrollListener:Lorg/researchstack/backbone/ui/views/ObservableScrollView$OnScrollListener;

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/ObservableScrollView;->onScrollListener:Lorg/researchstack/backbone/ui/views/ObservableScrollView$OnScrollListener;

    invoke-interface {v0, p2}, Lorg/researchstack/backbone/ui/views/ObservableScrollView$OnScrollListener;->onScrollChanged(I)V

    .line 41
    :cond_0
    return-void
.end method

.method public setScrollListener(Lorg/researchstack/backbone/ui/views/ObservableScrollView$OnScrollListener;)V
    .locals 0
    .param p1, "listener"    # Lorg/researchstack/backbone/ui/views/ObservableScrollView$OnScrollListener;

    .prologue
    .line 45
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/ObservableScrollView;->onScrollListener:Lorg/researchstack/backbone/ui/views/ObservableScrollView$OnScrollListener;

    .line 46
    return-void
.end method
