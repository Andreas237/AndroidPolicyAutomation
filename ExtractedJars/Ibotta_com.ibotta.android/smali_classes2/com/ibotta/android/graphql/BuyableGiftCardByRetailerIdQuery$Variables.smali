.class public final Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "BuyableGiftCardByRetailerIdQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final retailerId:J

.field private final transient valueMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(J)V
    .locals 2

    .line 129
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 127
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;->valueMap:Ljava/util/Map;

    .line 130
    iput-wide p1, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;->retailerId:J

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "retailerId"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;)J
    .locals 2

    .line 124
    iget-wide v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;->retailerId:J

    return-wide v0
.end method


# virtual methods
.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 145
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;)V

    return-object v0
.end method

.method public retailerId()J
    .locals 2

    .line 135
    iget-wide v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;->retailerId:J

    return-wide v0
.end method

.method public valueMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
