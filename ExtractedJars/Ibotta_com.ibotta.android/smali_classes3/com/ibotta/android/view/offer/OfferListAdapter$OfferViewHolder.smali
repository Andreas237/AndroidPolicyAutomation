.class Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;
.super Lcom/ibotta/android/commons/view/list/ViewHolder;
.source "OfferListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/offer/OfferListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OfferViewHolder"
.end annotation


# instance fields
.field private ivIcon:Landroid/widget/ImageView;

.field private ivRightArrow:Landroid/widget/ImageView;

.field private tvEarn:Landroid/widget/TextView;

.field private tvProductName:Landroid/widget/TextView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/list/ViewHolder;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/view/offer/OfferListAdapter$1;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/ImageView;
    .locals 0

    .line 149
    iget-object p0, p0, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->ivIcon:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$102(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->ivIcon:Landroid/widget/ImageView;

    return-object p1
.end method

.method static synthetic access$200(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 149
    iget-object p0, p0, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->tvProductName:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$202(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->tvProductName:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic access$300(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 149
    iget-object p0, p0, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->tvEarn:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$302(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->tvEarn:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic access$400(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/ImageView;
    .locals 0

    .line 149
    iget-object p0, p0, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->ivRightArrow:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$402(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->ivRightArrow:Landroid/widget/ImageView;

    return-object p1
.end method
