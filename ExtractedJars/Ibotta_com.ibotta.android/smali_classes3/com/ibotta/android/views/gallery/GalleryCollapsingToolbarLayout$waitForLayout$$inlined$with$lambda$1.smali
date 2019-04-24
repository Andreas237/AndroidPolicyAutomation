.class public final Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$$inlined$with$lambda$1;
.super Ljava/lang/Object;
.source "GalleryCollapsingToolbarLayout.kt"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->waitForLayout(Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGalleryCollapsingToolbarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryCollapsingToolbarLayout.kt\ncom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$1$1\n*L\n1#1,228:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0000"
    }
    d2 = {
        "com/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$1$1",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "onGlobalLayout",
        "",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $function$inlined:Lkotlin/jvm/functions/Function0;

.field final synthetic this$0:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$$inlined$with$lambda$1;->this$0:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    iput-object p2, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$$inlined$with$lambda$1;->$function$inlined:Lkotlin/jvm/functions/Function0;

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$$inlined$with$lambda$1;->this$0:Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;

    invoke-virtual {v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$$inlined$with$lambda$1;->$function$inlined:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method
