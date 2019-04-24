.class public Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;
.super Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
.source "VerticalDividerItemDecoration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder<",
        "Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field private mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$MarginProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 134
    invoke-direct {p0, p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;-><init>(Landroid/content/Context;)V

    .line 121
    new-instance p1, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$1;

    invoke-direct {p1, p0}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$1;-><init>(Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;)V

    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$MarginProvider;

    return-void
.end method

.method static synthetic access$000(Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$MarginProvider;
    .locals 0

    .line 119
    iget-object p0, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$MarginProvider;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;
    .locals 1

    .line 170
    invoke-virtual {p0}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->checkBuilderParams()V

    .line 171
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;

    invoke-direct {v0, p0}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;-><init>(Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;)V

    return-object v0
.end method

.method public margin(II)Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;
    .locals 1

    .line 138
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder$2;-><init>(Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;II)V

    invoke-virtual {p0, v0}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->marginProvider(Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$MarginProvider;)Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    move-result-object p1

    return-object p1
.end method

.method public marginProvider(Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$MarginProvider;)Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$MarginProvider;

    return-object p0
.end method

.method public marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/DimenRes;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/DimenRes;
        .end annotation
    .end param

    .line 156
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->mResources:Landroid/content/res/Resources;

    .line 157
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 156
    invoke-virtual {p0, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->margin(II)Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    move-result-object p1

    return-object p1
.end method
