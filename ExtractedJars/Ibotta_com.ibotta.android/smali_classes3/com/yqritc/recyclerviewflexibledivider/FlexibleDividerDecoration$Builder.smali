.class public Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
.super Ljava/lang/Object;
.source "FlexibleDividerDecoration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private mColorProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;

.field private mContext:Landroid/content/Context;

.field private mDrawableProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

.field private mPaintProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

.field private mPositionInsideItem:Z

.field protected mResources:Landroid/content/res/Resources;

.field private mShowLastDivider:Z

.field private mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

.field private mVisibilityProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 338
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 329
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$1;

    invoke-direct {v0, p0}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$1;-><init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)V

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mVisibilityProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;

    const/4 v0, 0x0

    .line 335
    iput-boolean v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mShowLastDivider:Z

    .line 336
    iput-boolean v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mPositionInsideItem:Z

    .line 339
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mContext:Landroid/content/Context;

    .line 340
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mResources:Landroid/content/res/Resources;

    return-void
.end method

.method static synthetic access$000(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;
    .locals 0

    .line 321
    iget-object p0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mPaintProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

    return-object p0
.end method

.method static synthetic access$100(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;
    .locals 0

    .line 321
    iget-object p0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mColorProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;

    return-object p0
.end method

.method static synthetic access$200(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;
    .locals 0

    .line 321
    iget-object p0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mDrawableProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

    return-object p0
.end method

.method static synthetic access$300(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Landroid/content/Context;
    .locals 0

    .line 321
    iget-object p0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$400(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;
    .locals 0

    .line 321
    iget-object p0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    return-object p0
.end method

.method static synthetic access$500(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;
    .locals 0

    .line 321
    iget-object p0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mVisibilityProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;

    return-object p0
.end method

.method static synthetic access$600(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Z
    .locals 0

    .line 321
    iget-boolean p0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mShowLastDivider:Z

    return p0
.end method

.method static synthetic access$700(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Z
    .locals 0

    .line 321
    iget-boolean p0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mPositionInsideItem:Z

    return p0
.end method


# virtual methods
.method protected checkBuilderParams()V
    .locals 2

    .line 427
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mPaintProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

    if-eqz v0, :cond_2

    .line 428
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mColorProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;

    if-nez v0, :cond_1

    .line 432
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    if-nez v0, :cond_0

    goto :goto_0

    .line 433
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Use setStrokeWidth method of Paint class to specify line size. Do not provider SizeProvider if you set PaintProvider."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 429
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Use setColor method of Paint class to specify line color. Do not provider ColorProvider if you set PaintProvider."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void
.end method

.method public color(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 358
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$3;

    invoke-direct {v0, p0, p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$3;-><init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;I)V

    invoke-virtual {p0, v0}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->colorProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p1

    return-object p1
.end method

.method public colorProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;",
            ")TT;"
        }
    .end annotation

    .line 371
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mColorProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;

    return-object p0
.end method

.method public colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorRes;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 367
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->color(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p1

    return-object p1
.end method

.method public showLastDivider()Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 417
    iput-boolean v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mShowLastDivider:Z

    return-object p0
.end method

.method public size(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 394
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$5;

    invoke-direct {v0, p0, p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder$5;-><init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;I)V

    invoke-virtual {p0, v0}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->sizeProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p1

    return-object p1
.end method

.method public sizeProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;",
            ")TT;"
        }
    .end annotation

    .line 407
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    return-object p0
.end method

.method public sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/DimenRes;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 403
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->size(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p1

    return-object p1
.end method

.method public visibilityProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;",
            ")TT;"
        }
    .end annotation

    .line 412
    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->mVisibilityProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;

    return-object p0
.end method
