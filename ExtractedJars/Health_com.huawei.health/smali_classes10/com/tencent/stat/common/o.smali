.class Lcom/tencent/stat/common/o;
.super Ljava/lang/Object;


# static fields
.field private static a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, -0x1

    sput v0, Lcom/tencent/stat/common/o;->a:I

    return-void
.end method

.method public static a()Z
    .locals 5

    sget v0, Lcom/tencent/stat/common/o;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    sget v0, Lcom/tencent/stat/common/o;->a:I

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v2, 0x0

    const/4 v0, 0x6

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "/bin"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "/system/bin/"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v0, "/system/xbin/"

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const-string v0, "/system/sbin/"

    const/4 v1, 0x3

    aput-object v0, v3, v1

    const-string v0, "/sbin/"

    const/4 v1, 0x4

    aput-object v0, v3, v1

    const-string v0, "/vendor/bin/"

    const/4 v1, 0x5

    aput-object v0, v3, v1

    const/4 v4, 0x0

    :goto_0
    :try_start_0
    array-length v0, v3

    const/4 v0, 0x6

    if-ge v4, v0, :cond_3

    new-instance v2, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v1, v3, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "su"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    sput v0, Lcom/tencent/stat/common/o;->a:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    goto :goto_1

    :catch_0
    move-exception v4

    :goto_1
    const/4 v0, 0x0

    sput v0, Lcom/tencent/stat/common/o;->a:I

    const/4 v0, 0x0

    return v0
.end method
