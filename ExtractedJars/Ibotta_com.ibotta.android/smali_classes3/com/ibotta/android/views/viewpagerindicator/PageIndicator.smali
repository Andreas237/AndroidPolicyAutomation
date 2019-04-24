.class public interface abstract Lcom/ibotta/android/views/viewpagerindicator/PageIndicator;
.super Ljava/lang/Object;
.source "PageIndicator.kt"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0001H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0006H&\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/views/viewpagerindicator/PageIndicator;",
        "Landroid/support/v4/view/ViewPager$OnPageChangeListener;",
        "notifyDataSetChanged",
        "",
        "setCurrentItem",
        "item",
        "",
        "setOnPageChangeListener",
        "listener",
        "setViewPager",
        "view",
        "Landroid/support/v4/view/ViewPager;",
        "initialPosition",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract notifyDataSetChanged()V
.end method

.method public abstract setCurrentItem(I)V
.end method

.method public abstract setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
    .param p1    # Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setViewPager(Landroid/support/v4/view/ViewPager;)V
    .param p1    # Landroid/support/v4/view/ViewPager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setViewPager(Landroid/support/v4/view/ViewPager;I)V
    .param p1    # Landroid/support/v4/view/ViewPager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
