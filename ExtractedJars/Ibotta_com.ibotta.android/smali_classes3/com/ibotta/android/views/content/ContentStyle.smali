.class public final enum Lcom/ibotta/android/views/content/ContentStyle;
.super Ljava/lang/Enum;
.source "ContentStyle.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/views/content/ContentStyle;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "",
        "(Ljava/lang/String;I)V",
        "SMALL",
        "MEDIUM",
        "HERO",
        "SPOTLIGHT",
        "SIDE_SCROLLER",
        "ROW",
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
.field private static final synthetic $VALUES:[Lcom/ibotta/android/views/content/ContentStyle;

.field public static final enum HERO:Lcom/ibotta/android/views/content/ContentStyle;

.field public static final enum MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

.field public static final enum ROW:Lcom/ibotta/android/views/content/ContentStyle;

.field public static final enum SIDE_SCROLLER:Lcom/ibotta/android/views/content/ContentStyle;

.field public static final enum SMALL:Lcom/ibotta/android/views/content/ContentStyle;

.field public static final enum SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/ibotta/android/views/content/ContentStyle;

    new-instance v1, Lcom/ibotta/android/views/content/ContentStyle;

    const-string v2, "SMALL"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/content/ContentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/content/ContentStyle;->SMALL:Lcom/ibotta/android/views/content/ContentStyle;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/content/ContentStyle;

    const-string v2, "MEDIUM"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/content/ContentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/content/ContentStyle;

    const-string v2, "HERO"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/content/ContentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/content/ContentStyle;

    const-string v2, "SPOTLIGHT"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/content/ContentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/content/ContentStyle;

    const-string v2, "SIDE_SCROLLER"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/content/ContentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/content/ContentStyle;->SIDE_SCROLLER:Lcom/ibotta/android/views/content/ContentStyle;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/content/ContentStyle;

    const-string v2, "ROW"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/content/ContentStyle;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/content/ContentStyle;->ROW:Lcom/ibotta/android/views/content/ContentStyle;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/views/content/ContentStyle;->$VALUES:[Lcom/ibotta/android/views/content/ContentStyle;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/views/content/ContentStyle;
    .locals 1

    const-class v0, Lcom/ibotta/android/views/content/ContentStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/views/content/ContentStyle;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/views/content/ContentStyle;
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->$VALUES:[Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v0}, [Lcom/ibotta/android/views/content/ContentStyle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/views/content/ContentStyle;

    return-object v0
.end method
