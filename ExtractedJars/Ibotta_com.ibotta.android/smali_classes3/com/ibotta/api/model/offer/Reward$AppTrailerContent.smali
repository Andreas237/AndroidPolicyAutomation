.class public Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;
.super Ljava/lang/Object;
.source "Reward.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/offer/Reward;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AppTrailerContent"
.end annotation


# instance fields
.field private appId:Ljava/lang/String;

.field private appName:Ljava/lang/String;

.field private appRating:F

.field private iconUrl:Ljava/lang/String;

.field private imageUrl:Ljava/lang/String;

.field private installLabel:Ljava/lang/String;

.field private installUrl:Ljava/lang/String;

.field private reviewCount:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 338
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 349
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 357
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getAppRating()F
    .locals 1

    .line 365
    iget v0, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->appRating:F

    return v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 389
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 381
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getInstallLabel()Ljava/lang/String;
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->installLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getInstallUrl()Ljava/lang/String;
    .locals 1

    .line 405
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->installUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getReviewCount()I
    .locals 1

    .line 373
    iget v0, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->reviewCount:I

    return v0
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 353
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->appId:Ljava/lang/String;

    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    .line 361
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->appName:Ljava/lang/String;

    return-void
.end method

.method public setAppRating(F)V
    .locals 0

    .line 369
    iput p1, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->appRating:F

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 393
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 385
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setInstallLabel(Ljava/lang/String;)V
    .locals 0

    .line 401
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->installLabel:Ljava/lang/String;

    return-void
.end method

.method public setInstallUrl(Ljava/lang/String;)V
    .locals 0

    .line 409
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->installUrl:Ljava/lang/String;

    return-void
.end method

.method public setReviewCount(I)V
    .locals 0

    .line 377
    iput p1, p0, Lcom/ibotta/api/model/offer/Reward$AppTrailerContent;->reviewCount:I

    return-void
.end method
