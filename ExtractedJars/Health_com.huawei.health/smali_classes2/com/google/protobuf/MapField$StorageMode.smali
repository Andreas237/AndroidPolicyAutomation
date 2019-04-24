.class final enum Lcom/google/protobuf/MapField$StorageMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/MapField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "StorageMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/google/protobuf/MapField$StorageMode;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/MapField$StorageMode;

.field public static final enum BOTH:Lcom/google/protobuf/MapField$StorageMode;

.field public static final enum LIST:Lcom/google/protobuf/MapField$StorageMode;

.field public static final enum MAP:Lcom/google/protobuf/MapField$StorageMode;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 78
    new-instance v0, Lcom/google/protobuf/MapField$StorageMode;

    const-string v1, "MAP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/MapField$StorageMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    new-instance v0, Lcom/google/protobuf/MapField$StorageMode;

    const-string v1, "LIST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/MapField$StorageMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    new-instance v0, Lcom/google/protobuf/MapField$StorageMode;

    const-string v1, "BOTH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/MapField$StorageMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/MapField$StorageMode;->BOTH:Lcom/google/protobuf/MapField$StorageMode;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/protobuf/MapField$StorageMode;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->BOTH:Lcom/google/protobuf/MapField$StorageMode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/protobuf/MapField$StorageMode;->$VALUES:[Lcom/google/protobuf/MapField$StorageMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 78
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/MapField$StorageMode;
    .locals 1

    .line 78
    const-class v0, Lcom/google/protobuf/MapField$StorageMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MapField$StorageMode;

    return-object v0
.end method

.method public static values()[Lcom/google/protobuf/MapField$StorageMode;
    .locals 1

    .line 78
    sget-object v0, Lcom/google/protobuf/MapField$StorageMode;->$VALUES:[Lcom/google/protobuf/MapField$StorageMode;

    invoke-virtual {v0}, [Lcom/google/protobuf/MapField$StorageMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/MapField$StorageMode;

    return-object v0
.end method
