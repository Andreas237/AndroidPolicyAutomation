.class public final enum Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;
.super Ljava/lang/Enum;
.source "StorageSilo.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/commons/disk/StorageSilo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SiloType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;",
        "",
        "(Ljava/lang/String;I)V",
        "INTERNAL_CACHE",
        "INTERNAL_STORAGE",
        "EXTERNAL_CACHE",
        "EXTERNAL_STORAGE",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

.field public static final enum EXTERNAL_CACHE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

.field public static final enum EXTERNAL_STORAGE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

.field public static final enum INTERNAL_CACHE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

.field public static final enum INTERNAL_STORAGE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    new-instance v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    const-string v2, "INTERNAL_CACHE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->INTERNAL_CACHE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    const-string v2, "INTERNAL_STORAGE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->INTERNAL_STORAGE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    const-string v2, "EXTERNAL_CACHE"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->EXTERNAL_CACHE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    const-string v2, "EXTERNAL_STORAGE"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->EXTERNAL_STORAGE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->$VALUES:[Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;
    .locals 1

    const-class v0, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;
    .locals 1

    sget-object v0, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->$VALUES:[Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    invoke-virtual {v0}, [Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    return-object v0
.end method
