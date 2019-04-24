.class public final enum Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;
.super Ljava/lang/Enum;
.source "RoundedImageDrawable.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/drawables/RoundedImageDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RoundedImageDrawableType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

.field public static final enum ROUND_ALL_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

.field public static final enum ROUND_TOP_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 17
    new-instance v0, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    const-string v1, "ROUND_ALL_CORNERS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->ROUND_ALL_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    .line 18
    new-instance v0, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    const-string v1, "ROUND_TOP_CORNERS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->ROUND_TOP_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    const/4 v0, 0x2

    .line 16
    new-array v0, v0, [Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    sget-object v1, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->ROUND_ALL_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->ROUND_TOP_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->$VALUES:[Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;
    .locals 1

    .line 16
    const-class v0, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;
    .locals 1

    .line 16
    sget-object v0, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->$VALUES:[Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    invoke-virtual {v0}, [Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    return-object v0
.end method
