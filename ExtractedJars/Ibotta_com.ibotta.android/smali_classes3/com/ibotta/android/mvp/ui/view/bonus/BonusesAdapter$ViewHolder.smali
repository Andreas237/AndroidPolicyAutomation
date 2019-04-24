.class public Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "BonusesAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewHolder"
.end annotation


# instance fields
.field public bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 84
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$ViewHolder;->bvBonus:Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;

    return-void
.end method
