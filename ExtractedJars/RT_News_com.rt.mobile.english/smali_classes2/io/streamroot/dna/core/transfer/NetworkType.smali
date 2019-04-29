.class public final enum Lio/streamroot/dna/core/transfer/NetworkType;
.super Ljava/lang/Enum;
.source "NetworkTypeAnalyticsReporter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/streamroot/dna/core/transfer/NetworkType;",
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lio/streamroot/dna/core/transfer/NetworkType;",
        "",
        "panamaValue",
        "",
        "(Ljava/lang/String;II)V",
        "getPanamaValue$dna_core_release",
        "()I",
        "WIFI_OR_ETHERNET",
        "CELLULAR",
        "NONE",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/streamroot/dna/core/transfer/NetworkType;

.field public static final enum CELLULAR:Lio/streamroot/dna/core/transfer/NetworkType;

.field public static final enum NONE:Lio/streamroot/dna/core/transfer/NetworkType;

.field public static final enum WIFI_OR_ETHERNET:Lio/streamroot/dna/core/transfer/NetworkType;


# instance fields
.field private final panamaValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    new-array v0, v0, [Lio/streamroot/dna/core/transfer/NetworkType;

    new-instance v1, Lio/streamroot/dna/core/transfer/NetworkType;

    const-string v2, "WIFI_OR_ETHERNET"

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 14
    invoke-direct {v1, v2, v4, v3}, Lio/streamroot/dna/core/transfer/NetworkType;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lio/streamroot/dna/core/transfer/NetworkType;->WIFI_OR_ETHERNET:Lio/streamroot/dna/core/transfer/NetworkType;

    aput-object v1, v0, v4

    new-instance v1, Lio/streamroot/dna/core/transfer/NetworkType;

    const-string v2, "CELLULAR"

    const/4 v5, 0x2

    .line 15
    invoke-direct {v1, v2, v3, v5}, Lio/streamroot/dna/core/transfer/NetworkType;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lio/streamroot/dna/core/transfer/NetworkType;->CELLULAR:Lio/streamroot/dna/core/transfer/NetworkType;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/transfer/NetworkType;

    const-string v2, "NONE"

    .line 16
    invoke-direct {v1, v2, v5, v4}, Lio/streamroot/dna/core/transfer/NetworkType;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lio/streamroot/dna/core/transfer/NetworkType;->NONE:Lio/streamroot/dna/core/transfer/NetworkType;

    aput-object v1, v0, v5

    sput-object v0, Lio/streamroot/dna/core/transfer/NetworkType;->$VALUES:[Lio/streamroot/dna/core/transfer/NetworkType;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/streamroot/dna/core/transfer/NetworkType;->panamaValue:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/streamroot/dna/core/transfer/NetworkType;
    .locals 1

    const-class v0, Lio/streamroot/dna/core/transfer/NetworkType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/core/transfer/NetworkType;

    return-object p0
.end method

.method public static values()[Lio/streamroot/dna/core/transfer/NetworkType;
    .locals 1

    sget-object v0, Lio/streamroot/dna/core/transfer/NetworkType;->$VALUES:[Lio/streamroot/dna/core/transfer/NetworkType;

    invoke-virtual {v0}, [Lio/streamroot/dna/core/transfer/NetworkType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/streamroot/dna/core/transfer/NetworkType;

    return-object v0
.end method


# virtual methods
.method public final getPanamaValue$dna_core_release()I
    .locals 1

    .line 13
    iget v0, p0, Lio/streamroot/dna/core/transfer/NetworkType;->panamaValue:I

    return v0
.end method
