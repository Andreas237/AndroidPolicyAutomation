.class Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;
.super Lcom/ibotta/android/commons/view/list/ViewHolder;
.source "CountryCodeSpinnerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ItemViewHolder"
.end annotation


# instance fields
.field private tvSpinnerItem:Landroid/widget/TextView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/list/ViewHolder;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$1;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 69
    iget-object p0, p0, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;->tvSpinnerItem:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$102(Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/fragment/deviceauth/CountryCodeSpinnerAdapter$ItemViewHolder;->tvSpinnerItem:Landroid/widget/TextView;

    return-object p1
.end method
