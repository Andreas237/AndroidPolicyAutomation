.class public Lcom/ibotta/api/helper/earnings/EarningsHelperImpl;
.super Ljava/lang/Object;
.source "EarningsHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/earnings/EarningsHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isEarningTypeSupported(Lcom/ibotta/api/model/earnings/Earning$Type;)Z
    .locals 5

    .line 15
    sget-object v0, Lcom/ibotta/api/model/earnings/Earning$Type;->RECEIPT:Lcom/ibotta/api/model/earnings/Earning$Type;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    sget-object v3, Lcom/ibotta/api/model/earnings/Earning$Type;->BONUS:Lcom/ibotta/api/model/earnings/Earning$Type;

    if-ne p1, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 17
    :goto_1
    sget-object v4, Lcom/ibotta/api/model/earnings/Earning$Type;->GIFT_CARD:Lcom/ibotta/api/model/earnings/Earning$Type;

    if-ne p1, v4, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-nez v0, :cond_4

    if-nez v3, :cond_4

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_3
    return v1
.end method
