.class public final enum Lcom/shopkick/app/util/ProductUtils$PriceDirection;
.super Ljava/lang/Enum;
.source "ProductUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/ProductUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PriceDirection"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/util/ProductUtils$PriceDirection;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/util/ProductUtils$PriceDirection;

.field public static final enum HORIZONTAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

.field public static final enum VERTICAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 16
    new-instance v0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    const-string v1, "HORIZONTAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/util/ProductUtils$PriceDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->HORIZONTAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    .line 17
    new-instance v0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    const-string v1, "VERTICAL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/util/ProductUtils$PriceDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->VERTICAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    const/4 v0, 0x2

    .line 15
    new-array v0, v0, [Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    sget-object v1, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->HORIZONTAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->VERTICAL:Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->$VALUES:[Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/util/ProductUtils$PriceDirection;
    .locals 1

    .line 15
    const-class v0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/util/ProductUtils$PriceDirection;
    .locals 1

    .line 15
    sget-object v0, Lcom/shopkick/app/util/ProductUtils$PriceDirection;->$VALUES:[Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    invoke-virtual {v0}, [Lcom/shopkick/app/util/ProductUtils$PriceDirection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/util/ProductUtils$PriceDirection;

    return-object v0
.end method
