.class public Lcom/ibotta/android/apiandroid/home/FeatureParcel;
.super Ljava/lang/Object;
.source "FeatureParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private actionText:Ljava/lang/String;

.field private bgcolor:Ljava/lang/String;

.field private bigImg:Ljava/lang/String;

.field private categoryImg:Ljava/lang/String;

.field private context:Ljava/lang/String;

.field private featureType:Ljava/lang/String;

.field private id:I

.field private retailerCategoryIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private sortOrder:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 103
    new-instance v0, Lcom/ibotta/android/apiandroid/home/FeatureParcel$1;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/home/FeatureParcel$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->retailerCategoryIds:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->retailerCategoryIds:Ljava/util/Set;

    .line 27
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method

.method public static convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/apiandroid/home/FeatureParcel;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 192
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    .line 193
    aget-object v3, p0, v1

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 198
    :cond_2
    new-array v1, v2, [Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    const/4 v2, 0x0

    .line 200
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_4

    .line 201
    aget-object v3, p0, v0

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    if-eqz v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    .line 202
    aget-object v4, p0, v0

    check-cast v4, Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    aput-object v4, v1, v2

    move v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method public static fromFeature(Lcom/ibotta/api/model/feature/Feature;)Lcom/ibotta/android/apiandroid/home/FeatureParcel;
    .locals 3

    .line 171
    new-instance v0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;-><init>()V

    .line 173
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setId(I)V

    .line 174
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getBigImg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setBigImg(Ljava/lang/String;)V

    .line 175
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getCategoryImg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setCategoryImg(Ljava/lang/String;)V

    .line 176
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getBgcolor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setBackgroundColor(Ljava/lang/String;)V

    .line 177
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getContext()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setContext(Ljava/lang/String;)V

    .line 178
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getSortOrder()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setSortOrder(F)V

    .line 179
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getFeatureType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setFeatureType(Ljava/lang/String;)V

    .line 180
    new-instance v1, Ljava/util/HashSet;

    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getRetailerCategoryIds()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setRetailerCategoryIds(Ljava/util/Set;)V

    .line 181
    invoke-virtual {p0}, Lcom/ibotta/api/model/feature/Feature;->getActionText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setActionText(Ljava/lang/String;)V

    return-object v0
.end method

.method public static fromFeatureModel(Lcom/ibotta/api/model/FeatureModel;)Lcom/ibotta/android/apiandroid/home/FeatureParcel;
    .locals 2

    .line 159
    new-instance v0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;-><init>()V

    .line 161
    invoke-interface {p0}, Lcom/ibotta/api/model/FeatureModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setId(I)V

    .line 162
    invoke-interface {p0}, Lcom/ibotta/api/model/FeatureModel;->getBigImg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setBigImg(Ljava/lang/String;)V

    .line 163
    invoke-interface {p0}, Lcom/ibotta/api/model/FeatureModel;->getCategoryImg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setCategoryImg(Ljava/lang/String;)V

    .line 164
    invoke-interface {p0}, Lcom/ibotta/api/model/FeatureModel;->getSortOrder()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setSortOrder(F)V

    .line 165
    invoke-interface {p0}, Lcom/ibotta/api/model/FeatureModel;->getFeatureType()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->setFeatureType(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getActionText()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->actionText:Ljava/lang/String;

    return-object v0
.end method

.method public getBackgroundColor()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->bgcolor:Ljava/lang/String;

    return-object v0
.end method

.method public getBigImg()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->bigImg:Ljava/lang/String;

    return-object v0
.end method

.method public getCategoryImg()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->categoryImg:Ljava/lang/String;

    return-object v0
.end method

.method public getContext()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->context:Ljava/lang/String;

    return-object v0
.end method

.method public getFeatureType()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->featureType:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->id:I

    return v0
.end method

.method public getRetailerCategoryIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->retailerCategoryIds:Ljava/util/Set;

    return-object v0
.end method

.method public getSortOrder()F
    .locals 1

    .line 71
    iget v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->sortOrder:F

    return v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 5

    .line 139
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->id:I

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->bigImg:Ljava/lang/String;

    .line 141
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->categoryImg:Ljava/lang/String;

    .line 142
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->bgcolor:Ljava/lang/String;

    .line 143
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->context:Ljava/lang/String;

    .line 144
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->sortOrder:F

    .line 145
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->featureType:Ljava/lang/String;

    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    if-eqz v0, :cond_0

    .line 149
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->retailerCategoryIds:Ljava/util/Set;

    .line 150
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, v0, v2

    .line 151
    iget-object v4, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->retailerCategoryIds:Ljava/util/Set;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 155
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->actionText:Ljava/lang/String;

    return-void
.end method

.method public setActionText(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->actionText:Ljava/lang/String;

    return-void
.end method

.method public setBackgroundColor(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->bgcolor:Ljava/lang/String;

    return-void
.end method

.method public setBigImg(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->bigImg:Ljava/lang/String;

    return-void
.end method

.method public setCategoryImg(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->categoryImg:Ljava/lang/String;

    return-void
.end method

.method public setContext(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->context:Ljava/lang/String;

    return-void
.end method

.method public setFeatureType(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->featureType:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->id:I

    return-void
.end method

.method public setRetailerCategoryIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 91
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->retailerCategoryIds:Ljava/util/Set;

    return-void
.end method

.method public setSortOrder(F)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->sortOrder:F

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 120
    iget p2, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->bigImg:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 122
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->categoryImg:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 123
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->bgcolor:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 124
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->context:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 125
    iget p2, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->sortOrder:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 126
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->featureType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 128
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->retailerCategoryIds:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    new-array p2, p2, [I

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->retailerCategoryIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    add-int/lit8 v3, v1, 0x1

    .line 131
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, p2, v1

    move v1, v3

    goto :goto_0

    .line 133
    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 135
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;->actionText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
