.class public Lcom/ibotta/android/view/offer/gallery/DuplicateOfferCategoryException;
.super Ljava/lang/RuntimeException;
.source "DuplicateOfferCategoryException.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3

    const-string v0, "Duplicate Offer category detected: categoryName=%1$s, occurrenceCount=%2$d"

    const/4 v1, 0x2

    .line 5
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    .line 5
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method
