.class final enum Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;
.super Ljava/lang/Enum;
.source "MixedItemSection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/dex/file/MixedItemSection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "SortType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

.field public static final enum INSTANCE:Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

.field public static final enum NONE:Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

.field public static final enum TYPE:Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 44
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;->NONE:Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    .line 47
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    const-string v1, "TYPE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;->TYPE:Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    .line 50
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    const-string v1, "INSTANCE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;->INSTANCE:Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    const/4 v0, 0x3

    .line 42
    new-array v0, v0, [Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;->NONE:Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;->TYPE:Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;->INSTANCE:Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;->$VALUES:[Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;
    .locals 1

    .line 42
    const-class v0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    return-object p0
.end method

.method public static values()[Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;
    .locals 1

    .line 42
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;->$VALUES:[Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    invoke-virtual {v0}, [Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/dexmaker/dx/dex/file/MixedItemSection$SortType;

    return-object v0
.end method
