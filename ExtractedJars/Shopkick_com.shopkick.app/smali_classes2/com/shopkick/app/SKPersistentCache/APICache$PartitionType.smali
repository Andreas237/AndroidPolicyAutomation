.class public final enum Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;
.super Ljava/lang/Enum;
.source "APICache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/SKPersistentCache/APICache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PartitionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

.field public static final enum CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

.field public static final enum MEMBER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

.field public static final enum SOCIAL:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

.field public static final enum USER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 45
    new-instance v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const-string v1, "CONFIG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    .line 46
    new-instance v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const-string v1, "USER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->USER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    .line 47
    new-instance v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const-string v1, "SOCIAL"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->SOCIAL:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    .line 48
    new-instance v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const-string v1, "MEMBER"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->MEMBER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const/4 v0, 0x4

    .line 44
    new-array v0, v0, [Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->USER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->SOCIAL:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->MEMBER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->$VALUES:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;
    .locals 1

    .line 44
    const-class v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;
    .locals 1

    .line 44
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->$VALUES:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-virtual {v0}, [Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    return-object v0
.end method
