.class public Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;
.super Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
.source "HorizontalDividerItemDecoration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder<",
        "Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field private mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 134
    invoke-direct {p0, p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;-><init>(Landroid/content/Context;)V

    .line 121
    new-instance p1, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$1;

    invoke-direct {p1, p0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$1;-><init>(Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;)V

    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;

    return-void
.end method

.method static synthetic access$000(Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;
    .locals 0

    .line 119
    iget-object p0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;
    .locals 1

    .line 170
    invoke-virtual {p0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->checkBuilderParams()V

    .line 171
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    invoke-direct {v0, p0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;-><init>(Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;)V

    return-object v0
.end method

.method public margin(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;
    .locals 1

    .line 138
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder$2;-><init>(Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;II)V

    invoke-virtual {p0, v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginProvider(Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object p1

    return-object p1
.end method

.method public marginProvider(Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;

    return-object p0
.end method

.method public marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;
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
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->mResources:Landroid/content/res/Resources;

    .line 157
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 156
    invoke-virtual {p0, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->margin(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object p1

    return-object p1
.end method
