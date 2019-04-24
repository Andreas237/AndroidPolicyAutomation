.class public Lcom/huawei/openalliance/ad/views/PPSWebView;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/interfaces/h;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/PPSWebView$a;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/openalliance/ad/views/a$a;

.field private b:Landroid/webkit/WebView;

.field private c:Lcom/huawei/openalliance/ad/views/a;

.field private d:Lcom/huawei/openalliance/ad/views/b;

.field private e:Lcom/huawei/openalliance/ad/j/a/i;

.field private f:Landroid/app/ActionBar;

.field private g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

.field private h:Lcom/huawei/openalliance/ad/views/g;

.field private i:Landroid/view/View;

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Landroid/view/View$OnKeyListener;

.field private o:Landroid/view/View$OnTouchListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->j:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->k:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->l:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->m:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$1;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->n:Landroid/view/View$OnKeyListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$2;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->o:Landroid/view/View$OnTouchListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/ActionBar;Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;Lcom/huawei/openalliance/ad/views/a$a;Z)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->j:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->k:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->l:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->m:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$1;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->n:Landroid/view/View$OnKeyListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$2;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->o:Landroid/view/View$OnTouchListener;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->m:Z

    iput-object p3, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    iput-object p4, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->a:Lcom/huawei/openalliance/ad/views/a$a;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->f:Landroid/app/ActionBar;

    new-instance v0, Lcom/huawei/openalliance/ad/j/m;

    invoke-direct {v0, p1, p3, p0}, Lcom/huawei/openalliance/ad/j/m;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;Lcom/huawei/openalliance/ad/views/interfaces/h;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->e:Lcom/huawei/openalliance/ad/j/a/i;

    invoke-direct {p0, p1, p5}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Landroid/content/Context;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->j:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->k:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->l:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->m:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$1;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->n:Landroid/view/View$OnKeyListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$2;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->o:Landroid/view/View$OnTouchListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->j:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->k:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->l:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->m:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$1;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->n:Landroid/view/View$OnKeyListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$2;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->o:Landroid/view/View$OnTouchListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Landroid/content/Context;)V

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

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->j:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->k:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->l:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->m:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$1;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->n:Landroid/view/View$OnKeyListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$2;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->o:Landroid/view/View$OnTouchListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/PPSWebView;)Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->m:Z

    new-instance v0, Lcom/huawei/openalliance/ad/j/m;

    invoke-direct {v0, p1, p0}, Lcom/huawei/openalliance/ad/j/m;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/h;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->e:Lcom/huawei/openalliance/ad/j/a/i;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Landroid/content/Context;Z)V

    return-void
.end method

.method private a(Landroid/content/Context;Z)V
    .locals 7

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v3

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/CookieManager;->removeSessionCookies(Landroid/webkit/ValueCallback;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Landroid/webkit/CookieManager;->removeSessionCookie()V

    :goto_0
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v4, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, -0x1

    invoke-direct {v5, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSWebView;->b(Landroid/content/Context;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->m:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->f:Landroid/app/ActionBar;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v6, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xa

    const/4 v1, -0x1

    invoke-virtual {v6, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    new-instance v0, Lcom/huawei/openalliance/ad/views/a;

    invoke-direct {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/a;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->c:Lcom/huawei/openalliance/ad/views/a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->c:Lcom/huawei/openalliance/ad/views/a;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/a;->setId(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->c:Lcom/huawei/openalliance/ad/views/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a;->getId()I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {v4, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->c:Lcom/huawei/openalliance/ad/views/a;

    invoke-virtual {p0, v0, v6}, Lcom/huawei/openalliance/ad/views/PPSWebView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->c:Lcom/huawei/openalliance/ad/views/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->a:Lcom/huawei/openalliance/ad/views/a$a;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/a;->setCallBack(Lcom/huawei/openalliance/ad/views/a$a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/openalliance/ad/views/PPSWebView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lcom/huawei/openalliance/ad/views/b;

    invoke-direct {v0, p1}, Lcom/huawei/openalliance/ad/views/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->d:Lcom/huawei/openalliance/ad/views/b;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->c:Lcom/huawei/openalliance/ad/views/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a;->getId()I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {v5, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->d:Lcom/huawei/openalliance/ad/views/b;

    invoke-virtual {p0, v0, v5}, Lcom/huawei/openalliance/ad/views/PPSWebView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_1
    const/16 v0, 0xa

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/openalliance/ad/views/PPSWebView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->m:Z

    if-nez v0, :cond_2

    new-instance v0, Lcom/huawei/openalliance/ad/views/b;

    invoke-direct {v0, p1}, Lcom/huawei/openalliance/ad/views/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->d:Lcom/huawei/openalliance/ad/views/b;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->d:Lcom/huawei/openalliance/ad/views/b;

    invoke-virtual {p0, v0, v5}, Lcom/huawei/openalliance/ad/views/PPSWebView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    :goto_1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_layout_page_load_fail:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->h:Lcom/huawei/openalliance/ad/views/g;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->d:Lcom/huawei/openalliance/ad/views/b;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/g;->a(Lcom/huawei/openalliance/ad/views/b;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->h:Lcom/huawei/openalliance/ad/views/g;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->e:Lcom/huawei/openalliance/ad/j/a/i;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/g;->a(Lcom/huawei/openalliance/ad/j/a/i;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->loadPage()V

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->removeView(Landroid/view/View;)V

    :cond_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    if-eqz v0, :cond_2

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->c:Lcom/huawei/openalliance/ad/views/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->c:Lcom/huawei/openalliance/ad/views/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a;->getId()I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {v2, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    invoke-virtual {p0, v0, v2}, Lcom/huawei/openalliance/ad/views/PPSWebView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->b()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/PPSWebView;)I
    .locals 2

    iget v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->j:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->j:I

    return v0
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    new-instance v1, Lcom/huawei/openalliance/ad/views/PPSWebView$3;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/PPSWebView$3;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    const-string v1, "accessibilityTraversal"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    const-string v1, "searchBoxJavaBridge_"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/openalliance/ad/views/PPSWebView$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/openalliance/ad/views/PPSWebView$a;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;Lcom/huawei/openalliance/ad/views/PPSWebView$1;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/openalliance/ad/views/g;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/g;-><init>(Lcom/huawei/openalliance/ad/views/interfaces/h;)V

    iput-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->h:Lcom/huawei/openalliance/ad/views/g;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->n:Landroid/view/View$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->o:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/views/PPSWebView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->c()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/b;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->d:Lcom/huawei/openalliance/ad/views/b;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->c:Lcom/huawei/openalliance/ad/views/a;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/openalliance/ad/views/PPSWebView;)Landroid/app/ActionBar;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->f:Landroid/app/ActionBar;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->d:Lcom/huawei/openalliance/ad/views/b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->d:Lcom/huawei/openalliance/ad/views/b;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/b;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method public addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "JavascriptInterface"
        }
    .end annotation

    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public getSettings()Landroid/webkit/WebSettings;
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    return-object v0
.end method

.method public loadPage()V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->e:Lcom/huawei/openalliance/ad/j/a/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/i;->a(Landroid/webkit/WebView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->e:Lcom/huawei/openalliance/ad/j/a/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getLandingUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/j/a/i;->a(Ljava/lang/String;Landroid/webkit/WebView;)V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->l:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->e:Lcom/huawei/openalliance/ad/j/a/i;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->j:I

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/i;->a(I)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->k:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->k:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->e:Lcom/huawei/openalliance/ad/j/a/i;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/i;->b()V

    :cond_0
    return-void
.end method

.method public setAdLandingPageData(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->e:Lcom/huawei/openalliance/ad/j/a/i;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/j/a/i;->a(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)V

    return-void
.end method

.method public setErrorPageView(Landroid/view/View;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Landroid/view/View;)V

    return-void
.end method

.method public setPPSWebEventCallback(Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->e:Lcom/huawei/openalliance/ad/j/a/i;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/j/a/i;->a(Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;)V

    return-void
.end method

.method public setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->b:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView;->h:Lcom/huawei/openalliance/ad/views/g;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/g;->a(Landroid/webkit/WebViewClient;)V

    return-void
.end method
