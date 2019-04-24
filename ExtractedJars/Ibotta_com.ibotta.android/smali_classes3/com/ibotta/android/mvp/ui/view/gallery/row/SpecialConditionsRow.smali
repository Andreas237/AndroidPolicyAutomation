.class public Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;
.super Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;
.source "SpecialConditionsRow.java"


# instance fields
.field private message:Ljava/lang/String;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->SPECIAL_CONDITIONS:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;)V

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;->message:Ljava/lang/String;

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method
