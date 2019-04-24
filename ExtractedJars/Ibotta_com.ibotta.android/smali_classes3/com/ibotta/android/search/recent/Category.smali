.class public final enum Lcom/ibotta/android/search/recent/Category;
.super Ljava/lang/Enum;
.source "Category.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/search/recent/Category;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/search/recent/Category;

.field public static final enum GLOBAL:Lcom/ibotta/android/search/recent/Category;

.field public static final enum RETAILER:Lcom/ibotta/android/search/recent/Category;


# instance fields
.field private final typeCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 9
    new-instance v0, Lcom/ibotta/android/search/recent/Category;

    const-string v1, "GLOBAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/ibotta/android/search/recent/Category;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/search/recent/Category;->GLOBAL:Lcom/ibotta/android/search/recent/Category;

    .line 10
    new-instance v0, Lcom/ibotta/android/search/recent/Category;

    const-string v1, "RETAILER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/ibotta/android/search/recent/Category;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/search/recent/Category;->RETAILER:Lcom/ibotta/android/search/recent/Category;

    const/4 v0, 0x2

    .line 8
    new-array v0, v0, [Lcom/ibotta/android/search/recent/Category;

    sget-object v1, Lcom/ibotta/android/search/recent/Category;->GLOBAL:Lcom/ibotta/android/search/recent/Category;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/search/recent/Category;->RETAILER:Lcom/ibotta/android/search/recent/Category;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/search/recent/Category;->$VALUES:[Lcom/ibotta/android/search/recent/Category;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    iput p3, p0, Lcom/ibotta/android/search/recent/Category;->typeCode:I

    return-void
.end method

.method public static toCategory(I)Lcom/ibotta/android/search/recent/Category;
    .locals 1
    .annotation build Landroid/arch/persistence/room/TypeConverter;
    .end annotation

    .line 29
    sget-object v0, Lcom/ibotta/android/search/recent/Category;->RETAILER:Lcom/ibotta/android/search/recent/Category;

    invoke-virtual {v0}, Lcom/ibotta/android/search/recent/Category;->getTypeCode()I

    move-result v0

    if-ne p0, v0, :cond_0

    .line 30
    sget-object p0, Lcom/ibotta/android/search/recent/Category;->RETAILER:Lcom/ibotta/android/search/recent/Category;

    return-object p0

    .line 32
    :cond_0
    sget-object p0, Lcom/ibotta/android/search/recent/Category;->GLOBAL:Lcom/ibotta/android/search/recent/Category;

    return-object p0
.end method

.method public static toTypeCode(Lcom/ibotta/android/search/recent/Category;)I
    .locals 0
    .annotation build Landroid/arch/persistence/room/TypeConverter;
    .end annotation

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/search/recent/Category;->getTypeCode()I

    move-result p0

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/search/recent/Category;
    .locals 1

    .line 8
    const-class v0, Lcom/ibotta/android/search/recent/Category;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/recent/Category;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/search/recent/Category;
    .locals 1

    .line 8
    sget-object v0, Lcom/ibotta/android/search/recent/Category;->$VALUES:[Lcom/ibotta/android/search/recent/Category;

    invoke-virtual {v0}, [Lcom/ibotta/android/search/recent/Category;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/search/recent/Category;

    return-object v0
.end method


# virtual methods
.method public getTypeCode()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/ibotta/android/search/recent/Category;->typeCode:I

    return v0
.end method
