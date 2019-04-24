.class public abstract Lcom/huawei/openalliance/ad/views/NativeMediaView;
.super Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# instance fields
.field a:Z

.field b:Z

.field protected c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

.field protected d:Lcom/huawei/openalliance/ad/monitor/b;

.field private e:Lcom/huawei/openalliance/ad/monitor/listener/ViewShowAreaListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeMediaView$1;

    invoke-direct {v0, p0, p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativeMediaView;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->d:Lcom/huawei/openalliance/ad/monitor/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeMediaView$1;

    invoke-direct {v0, p0, p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativeMediaView;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->d:Lcom/huawei/openalliance/ad/monitor/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeMediaView$1;

    invoke-direct {v0, p0, p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativeMediaView;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->d:Lcom/huawei/openalliance/ad/monitor/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeMediaView$1;

    invoke-direct {v0, p0, p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativeMediaView;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->d:Lcom/huawei/openalliance/ad/monitor/b;

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    return-void
.end method

.method a(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->e:Lcom/huawei/openalliance/ad/monitor/listener/ViewShowAreaListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->e:Lcom/huawei/openalliance/ad/monitor/listener/ViewShowAreaListener;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/monitor/listener/ViewShowAreaListener;->onUpdateShowArea(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->getAutoPlayAreaPercentageThresshold()I

    move-result v0

    if-lt p1, v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b:Z

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->a:Z

    if-nez v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->a:Z

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->c()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->a:Z

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->getHiddenAreaPercentageThreshhold()I

    move-result v0

    rsub-int/lit8 v0, v0, 0x64

    if-gt p1, v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b:Z

    if-nez v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b:Z

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->d()V

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->e()V

    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b:Z

    :cond_4
    :goto_0
    return-void
.end method

.method protected b()V
    .locals 0

    return-void
.end method

.method protected c()V
    .locals 0

    return-void
.end method

.method protected d()V
    .locals 0

    return-void
.end method

.method protected e()V
    .locals 0

    return-void
.end method

.method protected getAutoPlayAreaPercentageThresshold()I
    .locals 1

    const/16 v0, 0x64

    return v0
.end method

.method protected getHiddenAreaPercentageThreshhold()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->d:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/b;->e()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->d:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/b;->f()V

    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->onVisibilityChanged(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->d:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/b;->g()V

    return-void
.end method

.method setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V
    .locals 1

    instance-of v0, p1, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    :goto_0
    return-void
.end method

.method public setViewShowAreaListener(Lcom/huawei/openalliance/ad/monitor/listener/ViewShowAreaListener;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/NativeMediaView;->e:Lcom/huawei/openalliance/ad/monitor/listener/ViewShowAreaListener;

    return-void
.end method
