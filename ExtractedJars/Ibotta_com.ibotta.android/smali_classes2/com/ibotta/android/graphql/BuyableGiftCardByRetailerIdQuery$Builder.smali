.class public final Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;
.super Ljava/lang/Object;
.source "BuyableGiftCardByRetailerIdQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private retailerId:J


# direct methods
.method constructor <init>()V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;
    .locals 3

    .line 120
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;

    iget-wide v1, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;->retailerId:J

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;-><init>(J)V

    return-object v0
.end method

.method public retailerId(J)Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;
    .locals 0

    .line 115
    iput-wide p1, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;->retailerId:J

    return-object p0
.end method
