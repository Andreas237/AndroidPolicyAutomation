.class Lcom/shopkick/app/lookbooks/BrandedLookbookScreen$SpaceItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "BrandedLookbookScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SpaceItemDecoration"
.end annotation


# instance fields
.field private density:F

.field private space:I


# direct methods
.method public constructor <init>(IF)V
    .locals 0

    .line 398
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 399
    iput p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen$SpaceItemDecoration;->space:I

    .line 400
    iput p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen$SpaceItemDecoration;->density:F

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 1

    .line 405
    iget p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen$SpaceItemDecoration;->space:I

    int-to-float p3, p2

    iget p4, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen$SpaceItemDecoration;->density:F

    mul-float/2addr p3, p4

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p3, v0

    float-to-int p3, p3

    iput p3, p1, Landroid/graphics/Rect;->left:I

    int-to-float p2, p2

    mul-float/2addr p2, p4

    div-float/2addr p2, v0

    float-to-int p2, p2

    .line 406
    iput p2, p1, Landroid/graphics/Rect;->right:I

    return-void
.end method
