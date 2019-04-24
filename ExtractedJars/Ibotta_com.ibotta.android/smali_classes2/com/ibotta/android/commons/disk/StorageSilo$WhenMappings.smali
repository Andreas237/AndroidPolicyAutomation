.class public final synthetic Lcom/ibotta/android/commons/disk/StorageSilo$WhenMappings;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->values()[Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/commons/disk/StorageSilo$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lcom/ibotta/android/commons/disk/StorageSilo$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->INTERNAL_CACHE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    invoke-virtual {v1}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/commons/disk/StorageSilo$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->INTERNAL_STORAGE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    invoke-virtual {v1}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/commons/disk/StorageSilo$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->EXTERNAL_CACHE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    invoke-virtual {v1}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/commons/disk/StorageSilo$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->EXTERNAL_STORAGE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    invoke-virtual {v1}, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    return-void
.end method
