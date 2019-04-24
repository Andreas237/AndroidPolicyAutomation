.class public final enum Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;
.super Ljava/lang/Enum;
.source "GsonUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/GsonUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ConflictStrategy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

.field public static final enum PREFER_FIRST_OBJ:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

.field public static final enum PREFER_NON_NULL:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

.field public static final enum PREFER_SECOND_OBJ:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

.field public static final enum THROW_EXCEPTION:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 106
    new-instance v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    const-string v1, "THROW_EXCEPTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->THROW_EXCEPTION:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    new-instance v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    const-string v1, "PREFER_FIRST_OBJ"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->PREFER_FIRST_OBJ:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    new-instance v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    const-string v1, "PREFER_SECOND_OBJ"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->PREFER_SECOND_OBJ:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    new-instance v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    const-string v1, "PREFER_NON_NULL"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->PREFER_NON_NULL:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    const/4 v0, 0x4

    .line 105
    new-array v0, v0, [Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    sget-object v1, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->THROW_EXCEPTION:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->PREFER_FIRST_OBJ:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->PREFER_SECOND_OBJ:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->PREFER_NON_NULL:Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->$VALUES:[Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 105
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;
    .locals 1

    .line 105
    const-class v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;
    .locals 1

    .line 105
    sget-object v0, Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->$VALUES:[Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    invoke-virtual {v0}, [Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/util/GsonUtils$ConflictStrategy;

    return-object v0
.end method
