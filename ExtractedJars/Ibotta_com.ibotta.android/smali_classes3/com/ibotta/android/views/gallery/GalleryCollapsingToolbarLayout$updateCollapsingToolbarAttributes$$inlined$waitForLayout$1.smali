.class public final Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;
.super Ljava/lang/Object;
.source "GalleryCollapsingToolbarLayout.kt"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateCollapsingToolbarAttributes(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGalleryCollapsingToolbarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryCollapsingToolbarLayout.kt\ncom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$1$1\n+ 2 GalleryCollapsingToolbarLayout.kt\ncom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout\n*L\n1#1,228:1\n62#2,4:229\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0005"
    }
    d2 = {
        "com/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$1$1",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "onGlobalLayout",
        "",
        "ibotta-views_release",
        "com/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$$inlined$with$lambda$1"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $retailerName$inlined:Ljava/lang/String;

.field final synthetic this$0:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

.field final synthetic this$0$inline_fun:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;->this$0$inline_fun:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    iput-object p2, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;->this$0:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    iput-object p3, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;->$retailerName$inlined:Ljava/lang/String;

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;->this$0$inline_fun:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-virtual {v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;->this$0:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-static {v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->access$updateExpandedTitleMargins(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;->this$0:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    iget-object v1, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;->$retailerName$inlined:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->access$updateRetailerName(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;Ljava/lang/String;)V

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;->this$0:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-virtual {v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->setScrimVisibleHeightTrigger(I)V

    return-void
.end method
