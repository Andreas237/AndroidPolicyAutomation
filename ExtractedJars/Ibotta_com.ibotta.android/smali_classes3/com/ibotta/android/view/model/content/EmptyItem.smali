.class public final Lcom/ibotta/android/view/model/content/EmptyItem;
.super Lcom/ibotta/android/view/model/content/AbstractContentItem;
.source "EmptyItem.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/view/model/content/AbstractContentItem<",
        "Lcom/ibotta/api/model/content/EmptyContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/api/model/content/EmptyContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/EmptyContent;-><init>()V

    invoke-direct {p0, v0}, Lcom/ibotta/android/view/model/content/AbstractContentItem;-><init>(Lcom/ibotta/api/model/ContentModel;)V

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0

    .line 18
    invoke-super {p0, p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public bridge synthetic copy()Lcom/ibotta/android/view/model/content/AbstractContentItem;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/EmptyItem;->copy()Lcom/ibotta/android/view/model/content/EmptyItem;

    move-result-object v0

    return-object v0
.end method

.method public copy()Lcom/ibotta/android/view/model/content/EmptyItem;
    .locals 1

    .line 23
    new-instance v0, Lcom/ibotta/android/view/model/content/EmptyItem;

    invoke-direct {v0}, Lcom/ibotta/android/view/model/content/EmptyItem;-><init>()V

    .line 24
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/model/content/EmptyItem;->copyContent(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-object v0
.end method
