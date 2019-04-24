.class public Lcom/ibotta/api/model/card/GiftCard$Template;
.super Ljava/lang/Object;
.source "GiftCard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/card/GiftCard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Template"
.end annotation


# instance fields
.field private backUrl:Ljava/lang/String;

.field private backgroundColor:Ljava/lang/String;

.field private foregroundColor:Ljava/lang/String;

.field private frontUrl:Ljava/lang/String;

.field private highlightColor:Ljava/lang/String;

.field private id:I

.field private name:Ljava/lang/String;

.field private printUrl:Ljava/lang/String;

.field private sortOrder:Ljava/lang/Integer;

.field private thumbnailUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static sort(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard$Template;",
            ">;",
            "Ljava/util/Comparator<",
            "Lcom/ibotta/api/model/card/GiftCard$Template;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 345
    :cond_0
    invoke-static {p0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getBackUrl()Ljava/lang/String;
    .locals 1

    .line 317
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->backUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getBackgroundColor()Ljava/lang/String;
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->backgroundColor:Ljava/lang/String;

    return-object v0
.end method

.method public getForegroundColor()Ljava/lang/String;
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->foregroundColor:Ljava/lang/String;

    return-object v0
.end method

.method public getFrontUrl()Ljava/lang/String;
    .locals 1

    .line 309
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->frontUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getHighlightColor()Ljava/lang/String;
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->highlightColor:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 261
    iget v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPrintUrl()Ljava/lang/String;
    .locals 1

    .line 325
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->printUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/Integer;
    .locals 1

    .line 333
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->sortOrder:Ljava/lang/Integer;

    return-object v0
.end method

.method public getThumbnailUrl()Ljava/lang/String;
    .locals 1

    .line 301
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->thumbnailUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setBackUrl(Ljava/lang/String;)V
    .locals 0

    .line 321
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->backUrl:Ljava/lang/String;

    return-void
.end method

.method public setBackgroundColor(Ljava/lang/String;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->backgroundColor:Ljava/lang/String;

    return-void
.end method

.method public setForegroundColor(Ljava/lang/String;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->foregroundColor:Ljava/lang/String;

    return-void
.end method

.method public setFrontUrl(Ljava/lang/String;)V
    .locals 0

    .line 313
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->frontUrl:Ljava/lang/String;

    return-void
.end method

.method public setHighlightColor(Ljava/lang/String;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->highlightColor:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 265
    iput p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->id:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->name:Ljava/lang/String;

    return-void
.end method

.method public setPrintUrl(Ljava/lang/String;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->printUrl:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(Ljava/lang/Integer;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->sortOrder:Ljava/lang/Integer;

    return-void
.end method

.method public setThumbnailUrl(Ljava/lang/String;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard$Template;->thumbnailUrl:Ljava/lang/String;

    return-void
.end method
