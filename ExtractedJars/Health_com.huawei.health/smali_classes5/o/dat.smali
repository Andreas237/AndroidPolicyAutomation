.class public Lo/dat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[I

.field private static b:Ljava/lang/String;

.field private static final d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    const-string v0, "ProductType"

    sput-object v0, Lo/dat;->b:Ljava/lang/String;

    .line 57
    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/dat;->d:[I

    .line 78
    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/dat;->a:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x8
        0xf
        0xd
        0xb
        0x10
        0x14
        0x15
        0x12
        0x13
    .end array-data

    :array_1
    .array-data 4
        0x8
        0xf
        0xd
        0x10
        0x14
        0x15
        0x12
        0x13
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(I)Z
    .locals 8

    .line 68
    sget-object v4, Lo/dat;->d:[I

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget v7, v4, v6

    .line 69
    if-ne v7, p0, :cond_0

    .line 70
    sget-object v0, Lo/dat;->b:Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportHeartRate()=true "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "productType = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const/4 v0, 0x1

    return v0

    .line 68
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 74
    :cond_1
    sget-object v0, Lo/dat;->b:Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportHeartRate()=false "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "productType = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const/4 v0, 0x0

    return v0
.end method

.method public static e(I)Z
    .locals 8

    .line 86
    sget-object v4, Lo/dat;->a:[I

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget v7, v4, v6

    .line 87
    if-ne v7, p0, :cond_0

    .line 88
    sget-object v0, Lo/dat;->b:Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportIndepentSport()=true "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "productType = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    const/4 v0, 0x1

    return v0

    .line 86
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 92
    :cond_1
    sget-object v0, Lo/dat;->b:Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportIndepentSport()=false "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "productType = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const/4 v0, 0x0

    return v0
.end method
