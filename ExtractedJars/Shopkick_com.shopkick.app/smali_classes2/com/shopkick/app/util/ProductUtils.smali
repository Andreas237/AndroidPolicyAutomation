.class public Lcom/shopkick/app/util/ProductUtils;
.super Ljava/lang/Object;
.source "ProductUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/ProductUtils$PriceDirection;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getSpannablePriceString(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/application/ClientFlagsManager;)Landroid/text/Spannable;
    .locals 1

    .line 21
    iget-object p1, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->currentPrice:Ljava/lang/String;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->originalPrice:Ljava/lang/String;

    sget-object v0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->VERTICAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    invoke-static {p1, p0, v0}, Lcom/shopkick/app/util/ProductUtils;->getSpannablePriceString(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/util/ProductUtils$PriceDirection;)Landroid/text/Spannable;

    move-result-object p0

    return-object p0
.end method

.method public static getSpannablePriceString(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/util/ProductUtils$PriceDirection;)Landroid/text/Spannable;
    .locals 6

    const-string v0, ""

    const/4 v1, -0x1

    if-eqz p0, :cond_2

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz p1, :cond_1

    .line 33
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 34
    sget-object v3, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->VERTICAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    if-ne p2, v3, :cond_0

    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 37
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 40
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move v2, v1

    .line 44
    :goto_0
    new-instance p2, Landroid/text/SpannableString;

    invoke-direct {p2, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    if-lez v2, :cond_3

    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p0

    if-lez v1, :cond_3

    .line 48
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    const/high16 v4, -0x10000

    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    add-int v4, p0, v2

    const/16 v5, 0x11

    invoke-virtual {p2, v3, p0, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 52
    invoke-virtual {v0, p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result p0

    .line 53
    new-instance p1, Landroid/text/style/StrikethroughSpan;

    invoke-direct {p1}, Landroid/text/style/StrikethroughSpan;-><init>()V

    add-int/2addr v1, p0

    invoke-virtual {p2, p1, p0, v1, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 57
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    const v0, -0x777778

    invoke-direct {p1, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p2, p1, p0, v1, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_3
    return-object p2
.end method

.method public static getSpannablePriceStringWithTeaser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Landroid/text/Spannable;
    .locals 2

    .line 71
    invoke-static {p0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    sget-object p0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->HORIZONTAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    invoke-static {p2, p1, p0}, Lcom/shopkick/app/util/ProductUtils;->getSpannablePriceString(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/util/ProductUtils$PriceDirection;)Landroid/text/Spannable;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, ""

    .line 75
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_1

    const p3, 0x3f4ccccd    # 0.8f

    goto :goto_0

    :cond_1
    const p3, 0x3f59999a    # 0.85f

    .line 76
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz p1, :cond_2

    .line 81
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    .line 83
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 86
    :goto_1
    new-instance p1, Landroid/text/SpannableString;

    invoke-direct {p1, p0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 87
    new-instance p0, Landroid/text/style/RelativeSizeSpan;

    invoke-direct {p0, p3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    const/16 p2, 0x11

    const/4 p3, 0x0

    invoke-interface {p1, p0, p3, v0, p2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 88
    new-instance p0, Lcom/shopkick/app/util/EllipsizeColorSpan;

    const/high16 v1, -0x10000

    invoke-direct {p0, v1}, Lcom/shopkick/app/util/EllipsizeColorSpan;-><init>(I)V

    invoke-interface {p1, p0, p3, v0, p2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-object p1
.end method
