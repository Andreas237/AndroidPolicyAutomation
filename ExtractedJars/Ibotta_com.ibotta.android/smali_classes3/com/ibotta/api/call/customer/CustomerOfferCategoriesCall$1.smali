.class Lcom/ibotta/api/call/customer/CustomerOfferCategoriesCall$1;
.super Lcom/fasterxml/jackson/core/type/TypeReference;
.source "CustomerOfferCategoriesCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/api/call/customer/CustomerOfferCategoriesCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerOfferCategoriesResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/core/type/TypeReference<",
        "Ljava/util/Map<",
        "Ljava/lang/Integer;",
        "Ljava/util/Map<",
        "Ljava/lang/Integer;",
        "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/api/call/customer/CustomerOfferCategoriesCall;


# direct methods
.method constructor <init>(Lcom/ibotta/api/call/customer/CustomerOfferCategoriesCall;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesCall$1;->this$0:Lcom/ibotta/api/call/customer/CustomerOfferCategoriesCall;

    invoke-direct {p0}, Lcom/fasterxml/jackson/core/type/TypeReference;-><init>()V

    return-void
.end method
