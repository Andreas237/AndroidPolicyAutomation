.class public abstract Lcom/huawei/openalliance/ad/views/c;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/interfaces/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P::Lcom/huawei/openalliance/ad/j/a/f;>Landroid/widget/RelativeLayout;Lcom/huawei/openalliance/ad/views/interfaces/e;"
    }
.end annotation


# instance fields
.field protected a:Lcom/huawei/openalliance/ad/j/a/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field protected b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

.field protected c:I

.field protected d:Lcom/huawei/openalliance/ad/h/a/a;

.field private e:Z

.field private f:Ljava/lang/Long;

.field private g:Lcom/huawei/openalliance/ad/monitor/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/c;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->f:Ljava/lang/Long;

    new-instance v0, Lcom/huawei/openalliance/ad/views/c$1;

    invoke-direct {v0, p0, p0}, Lcom/huawei/openalliance/ad/views/c$1;-><init>(Lcom/huawei/openalliance/ad/views/c;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->g:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/c;->e()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/c;)Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->f:Ljava/lang/Long;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/c;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/c;->f:Ljava/lang/Long;

    return-object p1
.end method

.method private e()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/views/c$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/c$2;-><init>(Lcom/huawei/openalliance/ad/views/c;)V

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/c;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->d:Lcom/huawei/openalliance/ad/h/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/h/a/a;->k()V

    return-void
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->d:Lcom/huawei/openalliance/ad/h/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/h/a/a;->a(I)V

    return-void
.end method

.method public a(II)V
    .locals 2

    const-string v0, "PPSBaseView"

    const-string v1, "user click skip button"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->a:Lcom/huawei/openalliance/ad/j/a/f;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/j/a/f;->a(II)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "PPSBaseView"

    const-string v1, "show ad"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->a:Lcom/huawei/openalliance/ad/j/a/f;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/c;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/f;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->d:Lcom/huawei/openalliance/ad/h/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/h/a/a;->c()V

    return-void
.end method

.method public d()V
    .locals 2

    const-string v0, "PPSBaseView"

    const-string v1, "notifyAdLoaded"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/c;->e:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->f:Ljava/lang/Long;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->d:Lcom/huawei/openalliance/ad/h/a/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/c;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/h/a/a;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/RelativeLayout;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->g:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/b;->e()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    const-string v0, "PPSBaseView"

    const-string v1, "detached from window"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->g:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/b;->f()V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/c;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->a:Lcom/huawei/openalliance/ad/j/a/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/j/a/f;->a(II)V

    :cond_0
    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onVisibilityChanged(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c;->g:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/b;->g()V

    return-void
.end method

.method public setAdContent(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/c;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    return-void
.end method

.method public setAdMediator(Lcom/huawei/openalliance/ad/h/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/c;->d:Lcom/huawei/openalliance/ad/h/a/a;

    return-void
.end method

.method public setDisplayDuration(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/views/c;->c:I

    return-void
.end method
