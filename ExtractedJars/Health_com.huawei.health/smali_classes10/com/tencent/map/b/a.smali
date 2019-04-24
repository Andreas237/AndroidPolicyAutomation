.class public final Lcom/tencent/map/b/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/map/b/a$1;
    }
.end annotation


# static fields
.field private static a:Lcom/tencent/map/b/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/map/b/a;->a:Lcom/tencent/map/b/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/tencent/map/b/a;Ljava/lang/String;)I
    .locals 3

    move-object p0, p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lcom/tencent/map/b/i;->a(C)I

    move-result v0

    add-int/2addr v1, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    shl-int/lit8 v0, p1, 0x7

    add-int/2addr v0, p1

    xor-int/2addr v0, v1

    return v0
.end method

.method public static declared-synchronized a()Lcom/tencent/map/b/a;
    .locals 3

    const-class v1, Lcom/tencent/map/b/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/tencent/map/b/a;->a:Lcom/tencent/map/b/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/tencent/map/b/a;

    invoke-direct {v0}, Lcom/tencent/map/b/a;-><init>()V

    sput-object v0, Lcom/tencent/map/b/a;->a:Lcom/tencent/map/b/a;

    :cond_0
    sget-object v0, Lcom/tencent/map/b/a;->a:Lcom/tencent/map/b/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    invoke-static {p1}, Lcom/tencent/map/b/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {p2}, Lcom/tencent/map/b/i;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Lcom/tencent/map/b/a$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tencent/map/b/a$1;-><init>(Lcom/tencent/map/b/a;B)V

    invoke-virtual {v0, p1, p2}, Lcom/tencent/map/b/a$1;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    move-object p1, p2

    const/4 p2, 0x0

    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0x1b

    if-ge v4, v0, :cond_3

    shr-int/lit8 v0, p2, 0x8

    and-int/lit16 v0, v0, 0xff

    sget-object v1, Lcom/tencent/map/b/i;->b:[I

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lcom/tencent/map/b/i;->a(C)I

    move-result v2

    xor-int/2addr v2, p2

    and-int/lit16 v2, v2, 0xff

    aget v1, v1, v2

    xor-int p2, v0, v1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    and-int/lit8 v4, p2, 0x1f

    const/16 v0, 0x1b

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_4

    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    shr-int/lit8 v0, p2, 0x5

    and-int/lit8 v4, v0, 0x1f

    const/16 v0, 0x1c

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_5

    const/4 v0, 0x0

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    const/4 v0, 0x1

    return v0
.end method
