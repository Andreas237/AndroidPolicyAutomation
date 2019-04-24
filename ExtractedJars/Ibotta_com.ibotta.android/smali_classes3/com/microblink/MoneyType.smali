.class public final Lcom/microblink/MoneyType;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Comparable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/MoneyType;",
            ">;"
        }
    .end annotation
.end field

.field private static final ZERO_MONEY:Lcom/microblink/MoneyType;

.field private static final ZERO_STRING:Ljava/lang/String; = "0"


# instance fields
.field private confidence:F

.field private delegate:Ljava/math/BigDecimal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/microblink/MoneyType$1;

    invoke-direct {v0}, Lcom/microblink/MoneyType$1;-><init>()V

    sput-object v0, Lcom/microblink/MoneyType;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/microblink/MoneyType;

    const-string v1, "0"

    invoke-direct {v0, v1}, Lcom/microblink/MoneyType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/microblink/MoneyType;->ZERO_MONEY:Lcom/microblink/MoneyType;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/microblink/MoneyType;->confidence:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/microblink/MoneyType;->confidence:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/math/BigDecimal;

    iput-object p1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/microblink/MoneyType;->confidence:F

    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    iget-object p1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {p1}, Ljava/math/BigDecimal;->scale()I

    move-result p1

    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    iget-object p1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->setScale(I)Ljava/math/BigDecimal;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Money can\'t have scale > 2"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/microblink/MoneyType;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static add(Ljava/util/List;)Lcom/microblink/MoneyType;
    .locals 1
    .param p0    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/MoneyType;",
            ">;)",
            "Lcom/microblink/MoneyType;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/microblink/MoneyType;

    invoke-interface {p0, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lcom/microblink/MoneyType;

    invoke-static {p0}, Lcom/microblink/MoneyType;->add([Lcom/microblink/MoneyType;)Lcom/microblink/MoneyType;

    move-result-object p0

    return-object p0
.end method

.method public static add([Lcom/microblink/MoneyType;)Lcom/microblink/MoneyType;
    .locals 4
    .param p0    # [Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ljava/math/BigDecimal;

    const-string v1, "0"

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/microblink/MoneyType;->bigDecimal()Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/microblink/MoneyType;

    invoke-direct {p0, v0}, Lcom/microblink/MoneyType;-><init>(Ljava/math/BigDecimal;)V

    return-object p0
.end method

.method public static hasZeroValue()Lcom/microblink/MoneyType;
    .locals 1

    sget-object v0, Lcom/microblink/MoneyType;->ZERO_MONEY:Lcom/microblink/MoneyType;

    return-object v0
.end method

.method public static infinite()Lcom/microblink/MoneyType;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lcom/microblink/MoneyType;

    invoke-virtual {v0}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/microblink/MoneyType;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public static returnNullAsZero(Lcom/microblink/MoneyType;)Lcom/microblink/MoneyType;
    .locals 0
    .param p0    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    invoke-static {}, Lcom/microblink/MoneyType;->hasZeroValue()Lcom/microblink/MoneyType;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final abs()Lcom/microblink/MoneyType;
    .locals 2

    new-instance v0, Lcom/microblink/MoneyType;

    iget-object v1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/microblink/MoneyType;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final add(Lcom/microblink/MoneyType;)Lcom/microblink/MoneyType;
    .locals 2
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/MoneyType;

    iget-object v1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v1, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/microblink/MoneyType;-><init>(Ljava/math/BigDecimal;)V

    return-object v0
.end method

.method public final bigDecimal()Ljava/math/BigDecimal;
    .locals 2

    new-instance v0, Ljava/math/BigDecimal;

    iget-object v1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final compareTo(Lcom/microblink/MoneyType;)I
    .locals 1
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    return p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/MoneyType;

    invoke-virtual {p0, p1}, Lcom/microblink/MoneyType;->compareTo(Lcom/microblink/MoneyType;)I

    move-result p1

    return p1
.end method

.method public final compareToZeroMoney()I
    .locals 1

    sget-object v0, Lcom/microblink/MoneyType;->ZERO_MONEY:Lcom/microblink/MoneyType;

    invoke-virtual {p0, v0}, Lcom/microblink/MoneyType;->compareTo(Lcom/microblink/MoneyType;)I

    move-result v0

    return v0
.end method

.method public final confidence()F
    .locals 1

    iget v0, p0, Lcom/microblink/MoneyType;->confidence:F

    return v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final divide(Ljava/math/BigDecimal;I)Lcom/microblink/MoneyType;
    .locals 3
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/MoneyType;

    iget-object v1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    const/4 v2, 0x2

    invoke-virtual {v1, p1, v2, p2}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;II)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/microblink/MoneyType;-><init>(Ljava/math/BigDecimal;)V

    return-object v0
.end method

.method public final divide(Lcom/microblink/MoneyType;II)Ljava/math/BigDecimal;
    .locals 0
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p1, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {p0, p1, p2, p3}, Lcom/microblink/MoneyType;->divide(Ljava/math/BigDecimal;II)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public final divide(Ljava/math/BigDecimal;II)Ljava/math/BigDecimal;
    .locals 1
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v0, p1, p2, p3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;II)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/microblink/MoneyType;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/microblink/MoneyType;

    iget-object v0, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final equalsZeroMoney()Z
    .locals 1

    sget-object v0, Lcom/microblink/MoneyType;->ZERO_MONEY:Lcom/microblink/MoneyType;

    invoke-virtual {p0, v0}, Lcom/microblink/MoneyType;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final gt(Lcom/microblink/MoneyType;)Z
    .locals 0
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/microblink/MoneyType;->compareTo(Lcom/microblink/MoneyType;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final gtEq(Lcom/microblink/MoneyType;)Z
    .locals 0
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/microblink/MoneyType;->compareTo(Lcom/microblink/MoneyType;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final gtEqZero()Z
    .locals 1

    sget-object v0, Lcom/microblink/MoneyType;->ZERO_MONEY:Lcom/microblink/MoneyType;

    invoke-virtual {p0, v0}, Lcom/microblink/MoneyType;->gtEq(Lcom/microblink/MoneyType;)Z

    move-result v0

    return v0
.end method

.method public final gtZero()Z
    .locals 1

    sget-object v0, Lcom/microblink/MoneyType;->ZERO_MONEY:Lcom/microblink/MoneyType;

    invoke-virtual {p0, v0}, Lcom/microblink/MoneyType;->gt(Lcom/microblink/MoneyType;)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v0}, Ljava/math/BigDecimal;->hashCode()I

    move-result v0

    return v0
.end method

.method public final lt(Lcom/microblink/MoneyType;)Z
    .locals 0
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/microblink/MoneyType;->compareTo(Lcom/microblink/MoneyType;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ltEq(Lcom/microblink/MoneyType;)Z
    .locals 0
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/microblink/MoneyType;->compareTo(Lcom/microblink/MoneyType;)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ltEqZero()Z
    .locals 1

    sget-object v0, Lcom/microblink/MoneyType;->ZERO_MONEY:Lcom/microblink/MoneyType;

    invoke-virtual {p0, v0}, Lcom/microblink/MoneyType;->ltEq(Lcom/microblink/MoneyType;)Z

    move-result v0

    return v0
.end method

.method public final ltZero()Z
    .locals 1

    sget-object v0, Lcom/microblink/MoneyType;->ZERO_MONEY:Lcom/microblink/MoneyType;

    invoke-virtual {p0, v0}, Lcom/microblink/MoneyType;->lt(Lcom/microblink/MoneyType;)Z

    move-result v0

    return v0
.end method

.method public final max(Lcom/microblink/MoneyType;)Lcom/microblink/MoneyType;
    .locals 2
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/MoneyType;

    iget-object v1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v1, p1}, Ljava/math/BigDecimal;->max(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/microblink/MoneyType;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final min(Lcom/microblink/MoneyType;)Lcom/microblink/MoneyType;
    .locals 2
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/MoneyType;

    iget-object v1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v1, p1}, Ljava/math/BigDecimal;->min(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/microblink/MoneyType;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final multiply(Ljava/math/BigDecimal;Z)Lcom/microblink/MoneyType;
    .locals 2
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    goto :goto_0

    :cond_0
    const/4 p2, 0x3

    :goto_0
    new-instance v1, Lcom/microblink/MoneyType;

    invoke-virtual {p1, v0, p2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/microblink/MoneyType;-><init>(Ljava/math/BigDecimal;)V

    return-object v1
.end method

.method public final multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    .locals 1
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public final negate()Lcom/microblink/MoneyType;
    .locals 1

    sget-object v0, Lcom/microblink/MoneyType;->ZERO_MONEY:Lcom/microblink/MoneyType;

    invoke-virtual {v0, p0}, Lcom/microblink/MoneyType;->subtract(Lcom/microblink/MoneyType;)Lcom/microblink/MoneyType;

    move-result-object v0

    return-object v0
.end method

.method public final subtract(Lcom/microblink/MoneyType;)Lcom/microblink/MoneyType;
    .locals 2
    .param p1    # Lcom/microblink/MoneyType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/MoneyType;

    iget-object v1, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v1, p1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/microblink/MoneyType;-><init>(Ljava/math/BigDecimal;)V

    return-object v0
.end method

.method public final value()F
    .locals 1

    iget-object v0, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/microblink/MoneyType;->confidence:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object p2, p0, Lcom/microblink/MoneyType;->delegate:Ljava/math/BigDecimal;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
