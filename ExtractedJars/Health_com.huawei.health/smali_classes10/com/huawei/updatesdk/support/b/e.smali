.class public Lcom/huawei/updatesdk/support/b/e;
.super Ljava/lang/Object;


# static fields
.field private static a:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<Ljava/lang/String;Ljava/lang/ref/SoftReference<Ljava/lang/String;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/huawei/updatesdk/support/b/e;->a:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static a(J)Ljava/lang/String;
    .locals 7

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/DecimalFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/text/DecimalFormat;

    const-string v0, "#.#"

    invoke-virtual {v5, v0}, Ljava/text/DecimalFormat;->applyPattern(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    long-to-double v1, p0

    const-wide/high16 v3, 0x4090000000000000L    # 1024.0

    div-double/2addr v1, v3

    const-wide/high16 v3, 0x4090000000000000L    # 1024.0

    div-double/2addr v1, v3

    invoke-virtual {v5, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "MB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    return-object v6
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 9

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    array-length v0, v2

    div-int/lit8 v3, v0, 0x2

    new-array v4, v3, [B

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    mul-int/lit8 v0, v5, 0x2

    aget-char v0, v2, v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Character;->digit(CI)I

    move-result v6

    mul-int/lit8 v0, v5, 0x2

    add-int/lit8 v0, v0, 0x1

    aget-char v0, v2, v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Character;->digit(CI)I

    move-result v7

    shl-int/lit8 v0, v6, 0x4

    or-int v8, v0, v7

    const/16 v0, 0x7f

    if-le v8, v0, :cond_0

    add-int/lit16 v8, v8, -0x100

    :cond_0
    int-to-byte v0, v8

    aput-byte v0, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return-object v4
.end method
