.class public final enum Lcom/ibotta/android/views/components/Visibility;
.super Ljava/lang/Enum;
.source "ViewComponent.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/views/components/Visibility;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/ibotta/android/views/components/Visibility;",
        "",
        "(Ljava/lang/String;I)V",
        "VISIBLE",
        "INVISIBLE",
        "GONE",
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
.field private static final synthetic $VALUES:[Lcom/ibotta/android/views/components/Visibility;

.field public static final enum GONE:Lcom/ibotta/android/views/components/Visibility;

.field public static final enum INVISIBLE:Lcom/ibotta/android/views/components/Visibility;

.field public static final enum VISIBLE:Lcom/ibotta/android/views/components/Visibility;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/ibotta/android/views/components/Visibility;

    new-instance v1, Lcom/ibotta/android/views/components/Visibility;

    const-string v2, "VISIBLE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/components/Visibility;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/components/Visibility;

    const-string v2, "INVISIBLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/components/Visibility;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/components/Visibility;->INVISIBLE:Lcom/ibotta/android/views/components/Visibility;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/components/Visibility;

    const-string v2, "GONE"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/components/Visibility;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/views/components/Visibility;->$VALUES:[Lcom/ibotta/android/views/components/Visibility;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 46
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/views/components/Visibility;
    .locals 1

    const-class v0, Lcom/ibotta/android/views/components/Visibility;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/views/components/Visibility;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/views/components/Visibility;
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/components/Visibility;->$VALUES:[Lcom/ibotta/android/views/components/Visibility;

    invoke-virtual {v0}, [Lcom/ibotta/android/views/components/Visibility;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/views/components/Visibility;

    return-object v0
.end method
