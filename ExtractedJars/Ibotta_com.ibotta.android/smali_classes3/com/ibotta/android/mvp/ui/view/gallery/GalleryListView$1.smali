.class Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView$1;
.super Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;
.source "GalleryListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

.field final synthetic val$layoutManager:Landroid/support/v7/widget/GridLayoutManager;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView$1;->val$layoutManager:Landroid/support/v7/widget/GridLayoutManager;

    invoke-direct {p0}, Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 3

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->access$000(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;)Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView$1;->val$layoutManager:Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result v2

    invoke-static {v0, p1, v1, v2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->access$100(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;ILcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;I)I

    move-result p1

    return p1
.end method
