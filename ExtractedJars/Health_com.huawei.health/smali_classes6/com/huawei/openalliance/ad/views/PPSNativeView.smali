.class public Lcom/huawei/openalliance/ad/views/PPSNativeView;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Lcom/huawei/openalliance/ad/monitor/a$a;
.implements Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;,
        Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdClickListener;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lcom/huawei/openalliance/ad/j/a/b;

.field private c:Lcom/huawei/openalliance/ad/monitor/a;

.field private d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

.field private e:Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdClickListener;

.field private f:Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;

.field private g:Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

.field private h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->j:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;-><init>(Lcom/huawei/openalliance/ad/views/PPSNativeView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->k:Landroid/view/View$OnClickListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->j:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;-><init>(Lcom/huawei/openalliance/ad/views/PPSNativeView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->k:Landroid/view/View$OnClickListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->j:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;-><init>(Lcom/huawei/openalliance/ad/views/PPSNativeView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->k:Landroid/view/View$OnClickListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->j:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;-><init>(Lcom/huawei/openalliance/ad/views/PPSNativeView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->k:Landroid/view/View$OnClickListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->f:Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/j/e;

    invoke-direct {v0, p1, p0}, Lcom/huawei/openalliance/ad/j/e;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    new-instance v0, Lcom/huawei/openalliance/ad/monitor/a;

    invoke-direct {v0, p0, p0}, Lcom/huawei/openalliance/ad/monitor/a;-><init>(Landroid/view/View;Lcom/huawei/openalliance/ad/monitor/a$a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c:Lcom/huawei/openalliance/ad/monitor/a;

    return-void
.end method

.method private a(Ljava/lang/Long;Ljava/lang/Integer;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->isHasReportShowEventDuringShowTime()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setHasReportShowEventDuringShowTime(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/j/a/b;->a(Ljava/lang/Long;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/view/View;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    instance-of v0, v3, Lcom/huawei/openalliance/ad/views/NativeVideoView;

    if-eqz v0, :cond_2

    move-object v0, v3

    check-cast v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->k:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->setCoverClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->k:Landroid/view/View$OnClickListener;

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    goto :goto_0

    :cond_3
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/PPSNativeView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a:Z

    return v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Lcom/huawei/openalliance/ad/j/a/b;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdClickListener;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->e:Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdClickListener;

    return-object v0
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

    return-object v0
.end method

.method private e()V
    .locals 2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->i:Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Ljava/util/List;)V

    return-void
.end method

.method private f()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSNativeView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView$3;-><init>(Lcom/huawei/openalliance/ad/views/PPSNativeView;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(JI)V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->j:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->j:Z

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Ljava/lang/Long;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->j:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setHasReportShowEventDuringShowTime(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setShown(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->f:Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSNativeView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView$1;-><init>(Lcom/huawei/openalliance/ad/views/PPSNativeView;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    invoke-interface {v0, v2}, Lcom/huawei/openalliance/ad/j/a/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->g:Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->g:Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

    invoke-interface {v0, v2}, Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;->updateContent(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

    invoke-interface {v0, v2}, Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;->updateContent(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public b(JI)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/openalliance/ad/j/a/b;->a(JI)V

    return-void
.end method

.method public c()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c:Lcom/huawei/openalliance/ad/monitor/a;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/monitor/a;->d()J

    move-result-wide v2

    sub-long v4, v0, v2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c:Lcom/huawei/openalliance/ad/monitor/a;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/monitor/a;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Ljava/lang/Long;Ljava/lang/Integer;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/RelativeLayout;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c:Lcom/huawei/openalliance/ad/monitor/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/a;->e()V

    return-void
.end method

.method public onClose()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->f()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/b;->c()V

    return-void
.end method

.method public onClose(Ljava/util/List;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->f()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/j/a/b;->a(Ljava/util/List;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    const-string v0, "PPSNativeView"

    const-string v1, "onDetechedFromWindow"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c:Lcom/huawei/openalliance/ad/monitor/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/a;->f()V

    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onVisibilityChanged(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c:Lcom/huawei/openalliance/ad/monitor/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/a;->g()V

    return-void
.end method

.method public register(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V
    .locals 4
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    instance-of v0, p1, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c:Lcom/huawei/openalliance/ad/monitor/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getMinEffectiveShowTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getMinEffectiveShowRatio()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/monitor/a;->b(JI)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/b;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->e()V

    return-void
.end method

.method public register(Lcom/huawei/openalliance/ad/inter/data/INativeAd;Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->register(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V

    iput-object p2, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->g:Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;->setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->e()V

    return-void
.end method

.method public register(Lcom/huawei/openalliance/ad/inter/data/INativeAd;Ljava/util/List;)V
    .locals 4
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/inter/data/INativeAd;Ljava/util/List<Landroid/view/View;>;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c:Lcom/huawei/openalliance/ad/monitor/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getMinEffectiveShowTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getMinEffectiveShowRatio()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/monitor/a;->b(JI)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/b;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V

    :cond_0
    iput-object p2, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->i:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Ljava/util/List;)V

    return-void
.end method

.method public register(Lcom/huawei/openalliance/ad/inter/data/INativeAd;Ljava/util/List;Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/inter/data/INativeAd;Ljava/util/List<Landroid/view/View;>;Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->register(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V

    iput-object p3, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->g:Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

    if-eqz p3, :cond_0

    invoke-interface {p3, p1}, Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;->setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V

    :cond_0
    iput-object p2, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->i:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Ljava/util/List;)V

    return-void
.end method

.method public register(Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;)Z
    .locals 4
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Register INativeAd first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v3, 0x0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;->setPpsNativeView(Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-interface {p1, v0}, Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;->setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)Z

    move-result v3

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "PPSNativeView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "register downloadbutton, succ:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return v3
.end method

.method public setOnNativeAdClickListener(Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdClickListener;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->e:Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdClickListener;

    return-void
.end method

.method public setOnNativeAdStatusChangedListener(Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->f:Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;

    return-void
.end method

.method public unregister()V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c:Lcom/huawei/openalliance/ad/monitor/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/a;->b()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b:Lcom/huawei/openalliance/ad/j/a/b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/b;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->g:Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->g:Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;->setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->g:Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d()V

    return-void
.end method

.method public unregister(Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;->setPpsNativeView(Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;->setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView;->h:Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;

    :cond_0
    return-void
.end method
