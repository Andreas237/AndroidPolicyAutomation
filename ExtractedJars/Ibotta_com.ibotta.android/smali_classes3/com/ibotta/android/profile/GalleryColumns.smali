.class public final enum Lcom/ibotta/android/profile/GalleryColumns;
.super Ljava/lang/Enum;
.source "GalleryColumns.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/profile/GalleryColumns$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/profile/GalleryColumns;",
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/ibotta/android/profile/GalleryColumns;",
        "",
        "num",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getNum",
        "()Ljava/lang/String;",
        "DEFAULT",
        "TWO",
        "THREE",
        "Companion",
        "ibotta-profile_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/profile/GalleryColumns;

.field public static final Companion:Lcom/ibotta/android/profile/GalleryColumns$Companion;

.field public static final enum DEFAULT:Lcom/ibotta/android/profile/GalleryColumns;

.field public static final enum THREE:Lcom/ibotta/android/profile/GalleryColumns;

.field public static final enum TWO:Lcom/ibotta/android/profile/GalleryColumns;


# instance fields
.field private final num:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/ibotta/android/profile/GalleryColumns;

    new-instance v1, Lcom/ibotta/android/profile/GalleryColumns;

    const-string v2, "DEFAULT"

    const-string v3, "default"

    const/4 v4, 0x0

    .line 7
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/profile/GalleryColumns;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/profile/GalleryColumns;->DEFAULT:Lcom/ibotta/android/profile/GalleryColumns;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/profile/GalleryColumns;

    const-string v2, "TWO"

    const-string v3, "2"

    const/4 v4, 0x1

    .line 8
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/profile/GalleryColumns;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/profile/GalleryColumns;->TWO:Lcom/ibotta/android/profile/GalleryColumns;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/profile/GalleryColumns;

    const-string v2, "THREE"

    const-string v3, "3"

    const/4 v4, 0x2

    .line 9
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/profile/GalleryColumns;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/profile/GalleryColumns;->THREE:Lcom/ibotta/android/profile/GalleryColumns;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/profile/GalleryColumns;->$VALUES:[Lcom/ibotta/android/profile/GalleryColumns;

    new-instance v0, Lcom/ibotta/android/profile/GalleryColumns$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/profile/GalleryColumns$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/profile/GalleryColumns;->Companion:Lcom/ibotta/android/profile/GalleryColumns$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ibotta/android/profile/GalleryColumns;->num:Ljava/lang/String;

    return-void
.end method

.method public static final fromOrdinal(I)Lcom/ibotta/android/profile/GalleryColumns;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/ibotta/android/profile/GalleryColumns;->Companion:Lcom/ibotta/android/profile/GalleryColumns$Companion;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/profile/GalleryColumns$Companion;->fromOrdinal(I)Lcom/ibotta/android/profile/GalleryColumns;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/profile/GalleryColumns;
    .locals 1

    const-class v0, Lcom/ibotta/android/profile/GalleryColumns;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/profile/GalleryColumns;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/profile/GalleryColumns;
    .locals 1

    sget-object v0, Lcom/ibotta/android/profile/GalleryColumns;->$VALUES:[Lcom/ibotta/android/profile/GalleryColumns;

    invoke-virtual {v0}, [Lcom/ibotta/android/profile/GalleryColumns;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/profile/GalleryColumns;

    return-object v0
.end method


# virtual methods
.method public final getNum()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/ibotta/android/profile/GalleryColumns;->num:Ljava/lang/String;

    return-object v0
.end method
