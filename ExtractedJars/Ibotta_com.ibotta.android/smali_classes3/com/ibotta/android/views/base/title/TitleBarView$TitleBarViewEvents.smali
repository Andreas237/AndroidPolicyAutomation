.class public interface abstract Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;
.super Ljava/lang/Object;
.source "TitleBarView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewEvents;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/base/title/TitleBarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TitleBarViewEvents"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;",
        "Lcom/ibotta/android/views/components/ViewEvents;",
        "onTitleMenuClicked",
        "",
        "onTitleMenuItemClicked",
        "actionable",
        "Lcom/ibotta/api/model/base/Actionable;",
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
.method public abstract onTitleMenuClicked()V
.end method

.method public abstract onTitleMenuItemClicked(Lcom/ibotta/api/model/base/Actionable;)V
    .param p1    # Lcom/ibotta/api/model/base/Actionable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
