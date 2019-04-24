.class final enum Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;
.super Ljava/lang/Enum;
.source "FeaturedView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/featured/FeaturedView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "DefaultHeight"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

.field public static final enum SHORT:Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;


# instance fields
.field private final anticipatedHeight:I

.field private final anticipatedWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 212
    new-instance v0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    const-string v1, "SHORT"

    const/4 v2, 0x0

    const/16 v3, 0x280

    const/16 v4, 0x118

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->SHORT:Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    const/4 v0, 0x1

    .line 211
    new-array v0, v0, [Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    sget-object v1, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->SHORT:Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->$VALUES:[Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 216
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 217
    iput p3, p0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->anticipatedWidth:I

    .line 218
    iput p4, p0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->anticipatedHeight:I

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;Lcom/ibotta/android/hardware/Hardware;)I
    .locals 0

    .line 211
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->getAnticipatedHeight(Lcom/ibotta/android/hardware/Hardware;)I

    move-result p0

    return p0
.end method

.method private getAnticipatedHeight(Lcom/ibotta/android/hardware/Hardware;)I
    .locals 1

    .line 222
    invoke-interface {p1}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Point;->x:I

    int-to-float p1, p1

    iget v0, p0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->anticipatedWidth:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 223
    iget v0, p0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->anticipatedHeight:I

    int-to-float v0, v0

    mul-float p1, p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;
    .locals 1

    .line 211
    const-class v0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;
    .locals 1

    .line 211
    sget-object v0, Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->$VALUES:[Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    invoke-virtual {v0}, [Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/view/featured/FeaturedView$DefaultHeight;

    return-object v0
.end method
