.class public final Lo/ftu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ftw;


# static fields
.field private static b:Lo/ftu;

.field private static final d:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    const/16 v0, 0x9

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lo/ftu;->d:[C

    return-void

    :array_0
    .array-data 2
        0x22s
        0x26s
        0x27s
        0x2fs
        0x2cs
        0x3cs
        0x3es
        0x40s
        0x20s
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    return-void
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 97
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 98
    return-object v1
.end method

.method public static b()Lo/ftu;
    .locals 1

    .line 42
    sget-object v0, Lo/ftu;->b:Lo/ftu;

    if-nez v0, :cond_0

    .line 43
    new-instance v0, Lo/ftu;

    invoke-direct {v0}, Lo/ftu;-><init>()V

    sput-object v0, Lo/ftu;->b:Lo/ftu;

    .line 45
    :cond_0
    sget-object v0, Lo/ftu;->b:Lo/ftu;

    return-object v0
.end method

.method public static c()V
    .locals 1

    .line 33
    invoke-static {}, Lo/ftu;->b()Lo/ftu;

    move-result-object v0

    invoke-static {v0}, Lo/ftv;->e(Lo/ftw;)V

    .line 34
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 83
    invoke-static {p1}, Lo/ftu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 93
    return-object p1
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 70
    invoke-static {p1}, Lo/ftu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-char v6, v3, v5

    .line 72
    sget-object v7, Lo/ftu;->d:[C

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_1

    aget-char v10, v7, v9

    .line 73
    if-ne v6, v10, :cond_0

    .line 74
    new-instance v0, Lo/ftx;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Localpart must not contain \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 71
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 78
    :cond_2
    return-object p1
.end method
