.class final Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;
.source "$AutoValue_VerifiedOfferQuantityState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private expectedQuantity:Ljava/lang/Integer;

.field private offerId:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;
    .locals 4

    const-string v0, ""

    .line 79
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;->offerId:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " offerId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 82
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;->expectedQuantity:Ljava/lang/Integer;

    if-nez v1, :cond_1

    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expectedQuantity"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 85
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;->offerId:Ljava/lang/Integer;

    .line 89
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;->expectedQuantity:Ljava/lang/Integer;

    .line 90
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;-><init>(II)V

    return-object v0

    .line 86
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public expectedQuantity(I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;
    .locals 0

    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;->expectedQuantity:Ljava/lang/Integer;

    return-object p0
.end method

.method public offerId(I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState$Builder;
    .locals 0

    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;->offerId:Ljava/lang/Integer;

    return-object p0
.end method
