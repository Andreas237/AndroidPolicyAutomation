.class final enum Lcom/ibotta/android/views/images/Sizes$Style;
.super Ljava/lang/Enum;
.source "Sizes.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/images/Sizes;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "Style"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/views/images/Sizes$Style;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0082\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/views/images/Sizes$Style;",
        "",
        "(Ljava/lang/String;I)V",
        "DEFAULT",
        "CIRCLE",
        "PINK_CIRCLE",
        "ALPHA_50",
        "DISABLED",
        "BLUR",
        "CROPPED_HERO",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/views/images/Sizes$Style;

.field public static final enum ALPHA_50:Lcom/ibotta/android/views/images/Sizes$Style;

.field public static final enum BLUR:Lcom/ibotta/android/views/images/Sizes$Style;

.field public static final enum CIRCLE:Lcom/ibotta/android/views/images/Sizes$Style;

.field public static final enum CROPPED_HERO:Lcom/ibotta/android/views/images/Sizes$Style;

.field public static final enum DEFAULT:Lcom/ibotta/android/views/images/Sizes$Style;

.field public static final enum DISABLED:Lcom/ibotta/android/views/images/Sizes$Style;

.field public static final enum PINK_CIRCLE:Lcom/ibotta/android/views/images/Sizes$Style;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/ibotta/android/views/images/Sizes$Style;

    new-instance v1, Lcom/ibotta/android/views/images/Sizes$Style;

    const-string v2, "DEFAULT"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/images/Sizes$Style;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/images/Sizes$Style;->DEFAULT:Lcom/ibotta/android/views/images/Sizes$Style;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/images/Sizes$Style;

    const-string v2, "CIRCLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/images/Sizes$Style;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/images/Sizes$Style;->CIRCLE:Lcom/ibotta/android/views/images/Sizes$Style;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/images/Sizes$Style;

    const-string v2, "PINK_CIRCLE"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/images/Sizes$Style;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/images/Sizes$Style;->PINK_CIRCLE:Lcom/ibotta/android/views/images/Sizes$Style;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/images/Sizes$Style;

    const-string v2, "ALPHA_50"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/images/Sizes$Style;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/images/Sizes$Style;->ALPHA_50:Lcom/ibotta/android/views/images/Sizes$Style;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/images/Sizes$Style;

    const-string v2, "DISABLED"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/images/Sizes$Style;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/images/Sizes$Style;->DISABLED:Lcom/ibotta/android/views/images/Sizes$Style;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/images/Sizes$Style;

    const-string v2, "BLUR"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/images/Sizes$Style;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/images/Sizes$Style;->BLUR:Lcom/ibotta/android/views/images/Sizes$Style;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/images/Sizes$Style;

    const-string v2, "CROPPED_HERO"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/images/Sizes$Style;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/images/Sizes$Style;->CROPPED_HERO:Lcom/ibotta/android/views/images/Sizes$Style;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/views/images/Sizes$Style;->$VALUES:[Lcom/ibotta/android/views/images/Sizes$Style;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 87
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/views/images/Sizes$Style;
    .locals 1

    const-class v0, Lcom/ibotta/android/views/images/Sizes$Style;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/views/images/Sizes$Style;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/views/images/Sizes$Style;
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/images/Sizes$Style;->$VALUES:[Lcom/ibotta/android/views/images/Sizes$Style;

    invoke-virtual {v0}, [Lcom/ibotta/android/views/images/Sizes$Style;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/views/images/Sizes$Style;

    return-object v0
.end method
