.class public interface abstract Lcom/ibotta/android/views/list/ContentViewState;
.super Ljava/lang/Object;
.source "ContentViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;
.implements Lcom/ibotta/android/views/list/FastBubbleScrollerRow;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/list/ContentViewState$ContentType;,
        Lcom/ibotta/android/views/list/ContentViewState$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011R\u001a\u0010\u0003\u001a\u00020\u00048VX\u0097\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\u0008\u0091(0\u0001\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "Lcom/ibotta/android/views/list/FastBubbleScrollerRow;",
        "fastBubbleKey",
        "",
        "fastBubbleKey$annotations",
        "()V",
        "getFastBubbleKey",
        "()Ljava/lang/String;",
        "itemType",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "getItemType",
        "()Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "trackingPayload",
        "Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "getTrackingPayload",
        "()Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "ContentType",
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
.method public abstract getFastBubbleKey()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getItemType()Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
