.class public Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;
.super Ljava/lang/Object;
.source "RetailerCategoryParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private categoryType:Lcom/ibotta/api/model/retailer/CategoryType;

.field private id:I

.field private name:Ljava/lang/String;

.field private targetCategories:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel$1;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->targetCategories:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->targetCategories:Ljava/util/Set;

    .line 23
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method

.method public static convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 146
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    .line 147
    aget-object v3, p0, v1

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 152
    :cond_2
    new-array v1, v2, [Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    const/4 v2, 0x0

    .line 154
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_4

    .line 155
    aget-object v3, p0, v0

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    if-eqz v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    .line 156
    aget-object v4, p0, v0

    check-cast v4, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    aput-object v4, v1, v2

    move v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method public static fromCategory(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 117
    :cond_0
    new-instance v0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;-><init>()V

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setId(I)V

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Category;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setName(Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Category;->getCategoryTypeEnum()Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setCategoryType(Lcom/ibotta/api/model/retailer/CategoryType;)V

    .line 122
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Category;->getTargetCategories()Ljava/util/Set;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setTargetCategories(Ljava/util/Set;)V

    return-object v0
.end method

.method public static fromCategoryModel(Lcom/ibotta/api/model/OfferCategoryModel;)Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 131
    :cond_0
    new-instance v0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;-><init>()V

    .line 133
    invoke-interface {p0}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setId(I)V

    .line 134
    invoke-interface {p0}, Lcom/ibotta/api/model/OfferCategoryModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setName(Ljava/lang/String;)V

    .line 135
    invoke-interface {p0}, Lcom/ibotta/api/model/OfferCategoryModel;->getCategoryType()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/retailer/CategoryType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setCategoryType(Lcom/ibotta/api/model/retailer/CategoryType;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCategoryType()Lcom/ibotta/api/model/retailer/CategoryType;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->categoryType:Lcom/ibotta/api/model/retailer/CategoryType;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getTargetCategories()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->targetCategories:Ljava/util/Set;

    return-object v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 4

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->id:I

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->name:Ljava/lang/String;

    .line 99
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/retailer/CategoryType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->categoryType:Lcom/ibotta/api/model/retailer/CategoryType;

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->targetCategories:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 102
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->targetCategories:Ljava/util/Set;

    .line 104
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object p1

    if-eqz p1, :cond_1

    .line 106
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget v2, p1, v1

    .line 107
    iget-object v3, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->targetCategories:Ljava/util/Set;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setCategoryType(Lcom/ibotta/api/model/retailer/CategoryType;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->categoryType:Lcom/ibotta/api/model/retailer/CategoryType;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->id:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->name:Ljava/lang/String;

    return-void
.end method

.method public setTargetCategories(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->targetCategories:Ljava/util/Set;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 76
    iget p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 77
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->categoryType:Lcom/ibotta/api/model/retailer/CategoryType;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/CategoryType;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 79
    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->targetCategories:Ljava/util/Set;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 83
    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    new-array p2, p2, [I

    .line 85
    iget-object v1, p0, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->targetCategories:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 86
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 90
    :cond_1
    new-array p2, v0, [I

    .line 93
    :cond_2
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    return-void
.end method
