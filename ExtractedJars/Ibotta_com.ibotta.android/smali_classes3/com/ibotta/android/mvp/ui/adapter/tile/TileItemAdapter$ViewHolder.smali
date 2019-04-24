.class public Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "TileItemAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewHolder"
.end annotation


# instance fields
.field public ivImage:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 94
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 95
    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;->ivImage:Landroid/widget/ImageView;

    return-void
.end method
