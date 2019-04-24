.class public Lcom/shopkick/app/activities/KicksActivity;
.super Lcom/shopkick/app/activities/DetailsActivity;
.source "KicksActivity.java"


# instance fields
.field private receiptImageItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/shopkick/app/activities/DetailsActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public getReceiptImageItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/activities/KicksActivity;->receiptImageItems:Ljava/util/List;

    return-object v0
.end method

.method public setReceiptImageURLs(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ReceiptImageItem;",
            ">;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/shopkick/app/activities/KicksActivity;->receiptImageItems:Ljava/util/List;

    return-void
.end method
