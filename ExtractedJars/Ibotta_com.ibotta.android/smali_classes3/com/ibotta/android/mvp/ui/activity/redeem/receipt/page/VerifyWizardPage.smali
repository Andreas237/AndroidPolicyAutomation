.class public Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;
.super Ljava/lang/Object;
.source "VerifyWizardPage.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Ljava/lang/Comparable<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private final multiplesCount:I

.field private final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final offerId:I

.field private final productGroupId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final verifyWizardPageType:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage$1;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Integer;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;I)V
    .locals 0
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->offerId:I

    .line 63
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->productGroupId:Ljava/lang/Integer;

    .line 64
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->name:Ljava/lang/String;

    .line 65
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->verifyWizardPageType:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    .line 66
    iput p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->multiplesCount:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->offerId:I

    .line 72
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->productGroupId:Ljava/lang/Integer;

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->name:Ljava/lang/String;

    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->verifyWizardPageType:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->multiplesCount:I

    return-void
.end method

.method public static convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;
    .locals 5
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    .line 39
    aget-object v3, p0, v1

    instance-of v3, v3, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 44
    :cond_2
    new-array v1, v2, [Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    const/4 v2, 0x0

    .line 46
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_4

    .line 47
    aget-object v3, p0, v0

    instance-of v3, v3, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    if-eqz v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    .line 48
    aget-object v4, p0, v0

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    aput-object v4, v1, v2

    move v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    return-object v1
.end method


# virtual methods
.method public compareTo(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;)I
    .locals 1

    if-eqz p1, :cond_3

    .line 113
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->getVerifyWizardPageType()Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 119
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->verifyWizardPageType:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    if-nez v0, :cond_2

    const/4 p1, 0x1

    return p1

    .line 124
    :cond_2
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->ordinal()I

    move-result v0

    .line 123
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 124
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->getVerifyWizardPageType()Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result p1

    return p1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->compareTo(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;)I

    move-result p1

    return p1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getMultiplesCount()I
    .locals 1

    .line 94
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->multiplesCount:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getProductGroupId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->productGroupId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getVerifyWizardPageType()Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->verifyWizardPageType:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 104
    iget p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->offerId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->productGroupId:Ljava/lang/Integer;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 106
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 107
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->verifyWizardPageType:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 108
    iget p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->multiplesCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
