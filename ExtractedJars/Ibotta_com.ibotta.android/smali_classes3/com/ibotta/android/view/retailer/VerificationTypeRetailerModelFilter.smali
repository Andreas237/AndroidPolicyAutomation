.class public Lcom/ibotta/android/view/retailer/VerificationTypeRetailerModelFilter;
.super Ljava/lang/Object;
.source "VerificationTypeRetailerModelFilter.java"

# interfaces
.implements Lcom/ibotta/android/view/retailer/RetailerModelFilter;


# instance fields
.field private final verificationType:Lcom/ibotta/api/model/common/VerificationType;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/common/VerificationType;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/view/retailer/VerificationTypeRetailerModelFilter;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    return-void
.end method


# virtual methods
.method public filter(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 25
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    .line 28
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/view/retailer/VerificationTypeRetailerModelFilter;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v0, v1, :cond_0

    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method
