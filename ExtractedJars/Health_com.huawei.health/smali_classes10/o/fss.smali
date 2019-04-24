.class public Lo/fss;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fss$c;
    }
.end annotation


# static fields
.field private static final a:Lo/fty;

.field private static final b:[B

.field private static final c:[B

.field static final synthetic d:Z

.field private static final e:[B

.field private static final g:[B

.field private static final h:[B

.field private static final k:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 173
    const-class v0, Lo/fss;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lo/fss;->d:Z

    .line 224
    const-class v0, Lo/fss;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fss;->a:Lo/fty;

    .line 250
    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lo/fss;->c:[B

    .line 268
    const/16 v0, 0x100

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lo/fss;->e:[B

    .line 310
    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lo/fss;->b:[B

    .line 326
    const/16 v0, 0x100

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    sput-object v0, Lo/fss;->h:[B

    .line 373
    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    sput-object v0, Lo/fss;->k:[B

    .line 391
    const/16 v0, 0x101

    new-array v0, v0, [B

    fill-array-data v0, :array_5

    sput-object v0, Lo/fss;->g:[B

    return-void

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data

    :array_1
    .array-data 1
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x5t
        -0x5t
        -0x9t
        -0x9t
        -0x5t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x5t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        0x3et
        -0x9t
        -0x9t
        -0x9t
        0x3ft
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x3at
        0x3bt
        0x3ct
        0x3dt
        -0x9t
        -0x9t
        -0x9t
        -0x1t
        -0x9t
        -0x9t
        -0x9t
        0x0t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        0x20t
        0x21t
        0x22t
        0x23t
        0x24t
        0x25t
        0x26t
        0x27t
        0x28t
        0x29t
        0x2at
        0x2bt
        0x2ct
        0x2dt
        0x2et
        0x2ft
        0x30t
        0x31t
        0x32t
        0x33t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
    .end array-data

    :array_2
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2dt
        0x5ft
    .end array-data

    :array_3
    .array-data 1
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x5t
        -0x5t
        -0x9t
        -0x9t
        -0x5t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x5t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        0x3et
        -0x9t
        -0x9t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x3at
        0x3bt
        0x3ct
        0x3dt
        -0x9t
        -0x9t
        -0x9t
        -0x1t
        -0x9t
        -0x9t
        -0x9t
        0x0t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        0x3ft
        -0x9t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        0x20t
        0x21t
        0x22t
        0x23t
        0x24t
        0x25t
        0x26t
        0x27t
        0x28t
        0x29t
        0x2at
        0x2bt
        0x2ct
        0x2dt
        0x2et
        0x2ft
        0x30t
        0x31t
        0x32t
        0x33t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
    .end array-data

    :array_4
    .array-data 1
        0x2dt
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x5ft
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
    .end array-data

    :array_5
    .array-data 1
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x5t
        -0x5t
        -0x9t
        -0x9t
        -0x5t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x5t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        0x0t
        -0x9t
        -0x9t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        -0x9t
        -0x9t
        -0x9t
        -0x1t
        -0x9t
        -0x9t
        -0x9t
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        0x20t
        0x21t
        0x22t
        0x23t
        0x24t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        0x25t
        -0x9t
        0x26t
        0x27t
        0x28t
        0x29t
        0x2at
        0x2bt
        0x2ct
        0x2dt
        0x2et
        0x2ft
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x3at
        0x3bt
        0x3ct
        0x3dt
        0x3et
        0x3ft
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
        -0x9t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 471
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a([BI[BII)I
    .locals 1

    .line 173
    invoke-static {p0, p1, p2, p3, p4}, Lo/fss;->e([BI[BII)I

    move-result v0

    return v0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 5

    .line 750
    const/4 v3, 0x0

    .line 752
    :try_start_0
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2}, Lo/fss;->a([BIII)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 755
    goto :goto_0

    .line 753
    :catch_0
    move-exception v4

    .line 754
    sget-boolean v0, Lo/fss;->d:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 756
    :cond_0
    :goto_0
    sget-boolean v0, Lo/fss;->d:Z

    if-nez v0, :cond_1

    if-nez v3, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 757
    :cond_1
    return-object v3
.end method

.method public static a([BIII)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 863
    invoke-static {p0, p1, p2, p3}, Lo/fss;->e([BIII)[B

    move-result-object v2

    .line 867
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "US-ASCII"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 869
    :catch_0
    move-exception v3

    .line 870
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V

    return-object v0
.end method

.method private static a([B[BII)[B
    .locals 6

    .line 495
    move-object v0, p1

    move v2, p2

    move-object v3, p0

    move v5, p3

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v5}, Lo/fss;->e([BII[BII)[B

    .line 496
    return-object p0
.end method

.method static synthetic b(I)[B
    .locals 1

    .line 173
    invoke-static {p0}, Lo/fss;->e(I)[B

    move-result-object v0

    return-object v0
.end method

.method public static c([BI)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 792
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1}, Lo/fss;->a([BIII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c(I)[B
    .locals 2

    .line 441
    and-int/lit8 v0, p0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 442
    sget-object v0, Lo/fss;->b:[B

    return-object v0

    .line 443
    :cond_0
    and-int/lit8 v0, p0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    .line 444
    sget-object v0, Lo/fss;->k:[B

    return-object v0

    .line 446
    :cond_1
    sget-object v0, Lo/fss;->c:[B

    return-object v0
.end method

.method static synthetic c([B[BII)[B
    .locals 1

    .line 173
    invoke-static {p0, p1, p2, p3}, Lo/fss;->a([B[BII)[B

    move-result-object v0

    return-object v0
.end method

.method private static e([BI[BII)I
    .locals 7

    .line 1075
    if-nez p0, :cond_0

    .line 1076
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Source array was null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1078
    :cond_0
    if-nez p2, :cond_1

    .line 1079
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Destination array was null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1081
    :cond_1
    if-ltz p1, :cond_2

    add-int/lit8 v0, p1, 0x3

    array-length v1, p0

    if-lt v0, v1, :cond_3

    .line 1082
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Source array with length %d cannot have offset of %d and still process four bytes."

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    array-length v3, p0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1085
    :cond_3
    if-ltz p3, :cond_4

    add-int/lit8 v0, p3, 0x2

    array-length v1, p2

    if-lt v0, v1, :cond_5

    .line 1086
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Destination array with length %d cannot have offset of %d and still store three bytes."

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    array-length v3, p2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1091
    :cond_5
    invoke-static {p4}, Lo/fss;->e(I)[B

    move-result-object v5

    .line 1094
    add-int/lit8 v0, p1, 0x2

    aget-byte v0, p0, v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_6

    .line 1098
    aget-byte v0, p0, p1

    aget-byte v0, v5, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x12

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    aget-byte v1, v5, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0xc

    or-int v6, v0, v1

    .line 1101
    ushr-int/lit8 v0, v6, 0x10

    int-to-byte v0, v0

    aput-byte v0, p2, p3

    .line 1102
    const/4 v0, 0x1

    return v0

    .line 1106
    :cond_6
    add-int/lit8 v0, p1, 0x3

    aget-byte v0, p0, v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_7

    .line 1111
    aget-byte v0, p0, p1

    aget-byte v0, v5, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x12

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    aget-byte v1, v5, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0xc

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    aget-byte v1, v5, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x6

    or-int v6, v0, v1

    .line 1115
    ushr-int/lit8 v0, v6, 0x10

    int-to-byte v0, v0

    aput-byte v0, p2, p3

    .line 1116
    add-int/lit8 v0, p3, 0x1

    ushr-int/lit8 v1, v6, 0x8

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 1117
    const/4 v0, 0x2

    return v0

    .line 1127
    :cond_7
    aget-byte v0, p0, p1

    aget-byte v0, v5, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x12

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    aget-byte v1, v5, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0xc

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    aget-byte v1, v5, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x3

    aget-byte v1, p0, v1

    aget-byte v1, v5, v1

    and-int/lit16 v1, v1, 0xff

    or-int v6, v0, v1

    .line 1133
    shr-int/lit8 v0, v6, 0x10

    int-to-byte v0, v0

    aput-byte v0, p2, p3

    .line 1134
    add-int/lit8 v0, p3, 0x1

    shr-int/lit8 v1, v6, 0x8

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 1135
    add-int/lit8 v0, p3, 0x2

    int-to-byte v1, v6

    aput-byte v1, p2, v0

    .line 1137
    const/4 v0, 0x3

    return v0
.end method

.method private static final e(I)[B
    .locals 2

    .line 459
    and-int/lit8 v0, p0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 460
    sget-object v0, Lo/fss;->h:[B

    return-object v0

    .line 461
    :cond_0
    and-int/lit8 v0, p0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    .line 462
    sget-object v0, Lo/fss;->g:[B

    return-object v0

    .line 464
    :cond_1
    sget-object v0, Lo/fss;->e:[B

    return-object v0
.end method

.method public static e([BIII)[B
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 920
    if-nez p0, :cond_0

    .line 921
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot serialize a null array."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 924
    :cond_0
    if-gez p1, :cond_1

    .line 925
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot have negative offset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 928
    :cond_1
    if-gez p2, :cond_2

    .line 929
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot have length offset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 932
    :cond_2
    add-int v0, p1, p2

    move-object/from16 v1, p0

    array-length v1, v1

    if-le v0, v1, :cond_3

    .line 933
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot have offset of %d and length of %d with array of length %d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    move-object/from16 v3, p0

    array-length v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 940
    :cond_3
    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_4

    .line 941
    const/4 v6, 0x0

    .line 942
    const/4 v7, 0x0

    .line 943
    const/4 v8, 0x0

    .line 947
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v6, v0

    .line 948
    new-instance v0, Lo/fss$c;

    or-int/lit8 v1, p3, 0x1

    invoke-direct {v0, v6, v1}, Lo/fss$c;-><init>(Ljava/io/OutputStream;I)V

    move-object v8, v0

    .line 949
    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v0, v8}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v7, v0

    .line 951
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-virtual {v7, v0, v1, v2}, Ljava/util/zip/GZIPOutputStream;->write([BII)V

    .line 952
    invoke-virtual {v7}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 960
    :try_start_1
    invoke-virtual {v7}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v9

    .line 961
    :goto_0
    :try_start_2
    invoke-virtual {v8}, Lo/fss$c;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v9

    .line 962
    :goto_1
    :try_start_3
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_5

    :catch_2
    move-exception v9

    .line 963
    goto :goto_5

    .line 954
    :catch_3
    move-exception v9

    .line 957
    :try_start_4
    throw v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 960
    :catchall_0
    move-exception v10

    :try_start_5
    invoke-virtual {v7}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_2

    :catch_4
    move-exception v11

    .line 961
    :goto_2
    :try_start_6
    invoke-virtual {v8}, Lo/fss$c;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_3

    :catch_5
    move-exception v11

    .line 962
    :goto_3
    :try_start_7
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    goto :goto_4

    :catch_6
    move-exception v11

    :goto_4
    throw v10

    .line 965
    :goto_5
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    .line 970
    :cond_4
    and-int/lit8 v0, p3, 0x8

    if-eqz v0, :cond_5

    const/4 v6, 0x1

    goto :goto_6

    :cond_5
    const/4 v6, 0x0

    .line 971
    :goto_6
    and-int/lit8 v0, p3, 0x40

    if-nez v0, :cond_6

    const/4 v7, 0x1

    goto :goto_7

    :cond_6
    const/4 v7, 0x0

    .line 979
    :goto_7
    div-int/lit8 v0, p2, 0x3

    mul-int/lit8 v8, v0, 0x4

    .line 980
    rem-int/lit8 v9, p2, 0x3

    .line 981
    if-eqz v7, :cond_8

    .line 983
    if-lez v9, :cond_7

    const/4 v0, 0x4

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    add-int/2addr v8, v0

    goto :goto_a

    .line 986
    :cond_8
    if-lez v9, :cond_9

    add-int/lit8 v0, v9, 0x1

    goto :goto_9

    :cond_9
    const/4 v0, 0x0

    :goto_9
    add-int/2addr v8, v0

    .line 988
    :goto_a
    if-eqz v6, :cond_a

    .line 989
    div-int/lit8 v0, v8, 0x4c

    add-int/2addr v8, v0

    .line 991
    :cond_a
    new-array v10, v8, [B

    .line 994
    const/4 v11, 0x0

    .line 995
    const/4 v12, 0x0

    .line 996
    add-int/lit8 v13, p2, -0x2

    .line 997
    const/4 v14, 0x0

    .line 998
    :goto_b
    if-ge v11, v13, :cond_c

    .line 999
    move-object/from16 v0, p0

    add-int v1, v11, p1

    move-object v3, v10

    move v4, v12

    move/from16 v5, p3

    const/4 v2, 0x3

    invoke-static/range {v0 .. v5}, Lo/fss;->e([BII[BII)[B

    .line 1001
    add-int/lit8 v14, v14, 0x4

    .line 1002
    if-eqz v6, :cond_b

    const/16 v0, 0x4c

    if-lt v14, v0, :cond_b

    .line 1004
    add-int/lit8 v0, v12, 0x4

    const/16 v1, 0xa

    aput-byte v1, v10, v0

    .line 1005
    add-int/lit8 v12, v12, 0x1

    .line 1006
    const/4 v14, 0x0

    .line 998
    :cond_b
    add-int/lit8 v11, v11, 0x3

    add-int/lit8 v12, v12, 0x4

    goto :goto_b

    .line 1010
    :cond_c
    move/from16 v0, p2

    if-ge v11, v0, :cond_d

    .line 1011
    move-object/from16 v0, p0

    add-int v1, v11, p1

    sub-int v2, p2, v11

    move-object v3, v10

    move v4, v12

    move/from16 v5, p3

    invoke-static/range {v0 .. v5}, Lo/fss;->e([BII[BII)[B

    .line 1012
    add-int/lit8 v12, v12, 0x4

    .line 1017
    :cond_d
    array-length v0, v10

    add-int/lit8 v0, v0, -0x1

    if-gt v12, v0, :cond_e

    .line 1022
    new-array v15, v12, [B

    .line 1023
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v10, v0, v15, v1, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1025
    return-object v15

    .line 1028
    :cond_e
    return-object v10
.end method

.method private static e([BII[BII)[B
    .locals 5

    .line 527
    invoke-static {p5}, Lo/fss;->c(I)[B

    move-result-object v3

    .line 540
    if-lez p2, :cond_0

    aget-byte v0, p0, p1

    shl-int/lit8 v0, v0, 0x18

    ushr-int/lit8 v0, v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-le p2, v1, :cond_1

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x18

    ushr-int/lit8 v1, v1, 0x10

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    or-int/2addr v0, v1

    const/4 v1, 0x2

    if-le p2, v1, :cond_2

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x18

    ushr-int/lit8 v1, v1, 0x18

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    or-int v4, v0, v1

    .line 544
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_3

    .line 547
    :pswitch_0
    ushr-int/lit8 v0, v4, 0x12

    aget-byte v0, v3, v0

    aput-byte v0, p3, p4

    .line 548
    add-int/lit8 v0, p4, 0x1

    ushr-int/lit8 v1, v4, 0xc

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, p3, v0

    .line 549
    add-int/lit8 v0, p4, 0x2

    ushr-int/lit8 v1, v4, 0x6

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, p3, v0

    .line 550
    add-int/lit8 v0, p4, 0x3

    and-int/lit8 v1, v4, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, p3, v0

    .line 551
    return-object p3

    .line 554
    :pswitch_1
    ushr-int/lit8 v0, v4, 0x12

    aget-byte v0, v3, v0

    aput-byte v0, p3, p4

    .line 555
    add-int/lit8 v0, p4, 0x1

    ushr-int/lit8 v1, v4, 0xc

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, p3, v0

    .line 556
    add-int/lit8 v0, p4, 0x2

    ushr-int/lit8 v1, v4, 0x6

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, p3, v0

    .line 557
    and-int/lit8 v0, p5, 0x40

    if-nez v0, :cond_3

    .line 558
    add-int/lit8 v0, p4, 0x3

    const/16 v1, 0x3d

    aput-byte v1, p3, v0

    .line 560
    :cond_3
    return-object p3

    .line 563
    :pswitch_2
    ushr-int/lit8 v0, v4, 0x12

    aget-byte v0, v3, v0

    aput-byte v0, p3, p4

    .line 564
    add-int/lit8 v0, p4, 0x1

    ushr-int/lit8 v1, v4, 0xc

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, p3, v0

    .line 565
    and-int/lit8 v0, p5, 0x40

    if-nez v0, :cond_4

    .line 566
    add-int/lit8 v0, p4, 0x2

    const/16 v1, 0x3d

    aput-byte v1, p3, v0

    .line 567
    add-int/lit8 v0, p4, 0x3

    const/16 v1, 0x3d

    aput-byte v1, p3, v0

    .line 569
    :cond_4
    return-object p3

    .line 572
    :goto_3
    return-object p3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
