.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;
.super Ljava/lang/Object;
.source "EarningsDetailToolbarViewModel.java"


# instance fields
.field private final retailerLogoUrl:Ljava/lang/String;

.field private final retailerName:Ljava/lang/String;

.field private final shoppingTripId:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final subtitleValue:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->title:Ljava/lang/String;

    const-string v0, ""

    .line 20
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->subtitle:Ljava/lang/String;

    const-string v0, ""

    .line 21
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->subtitleValue:Ljava/lang/String;

    const-string v0, ""

    .line 24
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->retailerLogoUrl:Ljava/lang/String;

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->retailerName:Ljava/lang/String;

    const-string p1, ""

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->shoppingTripId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->title:Ljava/lang/String;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->subtitle:Ljava/lang/String;

    .line 34
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->subtitleValue:Ljava/lang/String;

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->retailerLogoUrl:Ljava/lang/String;

    .line 38
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->retailerName:Ljava/lang/String;

    .line 39
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->shoppingTripId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getRetailerLogoUrl()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->retailerLogoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerName()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public getShoppingTripId()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->shoppingTripId:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitleValue()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->subtitleValue:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;->title:Ljava/lang/String;

    return-object v0
.end method
