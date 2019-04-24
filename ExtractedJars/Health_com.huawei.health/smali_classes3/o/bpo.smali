.class public final Lo/bpo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[[B

.field private static c:Lo/bpo;


# instance fields
.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 15
    const/4 v0, 0x1

    new-array v0, v0, [[B

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/bpo;->a:[[B

    return-void

    nop

    :array_0
    .array-data 1
        0x41t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-boolean p1, p0, Lo/bpo;->b:Z

    .line 26
    return-void
.end method

.method private b(Ljava/util/ArrayList;Ljava/lang/StringBuilder;IC)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/bpr;>;Ljava/lang/StringBuilder;IC)I"
        }
    .end annotation

    .line 129
    invoke-virtual {p0, p4}, Lo/bpo;->a(C)Lo/bpr;

    move-result-object v2

    .line 130
    invoke-virtual {v2}, Lo/bpr;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 131
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 132
    invoke-direct {p0, p2, p1, p3}, Lo/bpo;->e(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    .line 134
    :cond_0
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    const/4 p3, 0x2

    goto :goto_0

    .line 137
    :cond_1
    invoke-virtual {v2}, Lo/bpr;->e()I

    move-result v0

    if-eq p3, v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 138
    invoke-direct {p0, p2, p1, p3}, Lo/bpo;->e(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    .line 140
    :cond_2
    invoke-virtual {v2}, Lo/bpr;->e()I

    move-result p3

    .line 141
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 143
    :goto_0
    return p3
.end method

.method public static d()Lo/bpo;
    .locals 4

    .line 29
    const-class v2, Lo/bpo;

    monitor-enter v2

    .line 30
    :try_start_0
    sget-object v0, Lo/bpo;->c:Lo/bpo;

    if-eqz v0, :cond_0

    .line 31
    sget-object v0, Lo/bpo;->c:Lo/bpo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 34
    :cond_0
    :try_start_1
    new-instance v0, Lo/bpo;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/bpo;-><init>(Z)V

    sput-object v0, Lo/bpo;->c:Lo/bpo;

    .line 35
    sget-object v0, Lo/bpo;->c:Lo/bpo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    return-object v0

    .line 36
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private e(I)Ljava/lang/StringBuilder;
    .locals 4

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    if-gez p1, :cond_0

    .line 60
    const/4 p1, 0x0

    .line 62
    :cond_0
    sget-object v0, Lo/bpo;->a:[[B

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 63
    sget-object v0, Lo/bpo;->a:[[B

    array-length v0, v0

    add-int/lit8 p1, v0, -0x1

    .line 65
    :cond_1
    const/4 v3, 0x0

    :goto_0
    sget-object v0, Lo/bpo;->a:[[B

    aget-object v0, v0, p1

    array-length v0, v0

    if-ge v3, v0, :cond_2

    sget-object v0, Lo/bpo;->a:[[B

    aget-object v0, v0, p1

    aget-byte v0, v0, v3

    if-eqz v0, :cond_2

    .line 66
    sget-object v0, Lo/bpo;->a:[[B

    aget-object v0, v0, p1

    aget-byte v0, v0, v3

    int-to-char v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 68
    :cond_2
    return-object v2
.end method

.method private e(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/StringBuilder;Ljava/util/ArrayList<Lo/bpr;>;I)V"
        }
    .end annotation

    .line 148
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 149
    new-instance v0, Lo/bpr;

    invoke-direct {v0, p3, v1, v1}, Lo/bpr;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 151
    return-void
.end method


# virtual methods
.method public a(C)Lo/bpr;
    .locals 4

    .line 41
    invoke-static {p1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    .line 42
    new-instance v2, Lo/bpr;

    invoke-direct {v2}, Lo/bpr;-><init>()V

    .line 43
    invoke-virtual {v2, v1}, Lo/bpr;->e(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/bpo;->e(I)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/bpr;->b(Ljava/lang/String;)V

    .line 47
    return-object v2
.end method

.method public e(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lo/bpr;>;"
        }
    .end annotation

    .line 75
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    iget-boolean v0, p0, Lo/bpo;->b:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    :cond_0
    return-object v1

    .line 80
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 82
    const/4 v4, 0x1

    .line 84
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_8

    .line 85
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 86
    const/16 v0, 0x20

    if-ne v6, v0, :cond_2

    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_7

    .line 89
    invoke-direct {p0, v2, v1, v4}, Lo/bpo;->e(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    goto :goto_1

    .line 91
    :cond_2
    const/16 v0, 0x100

    if-ge v6, v0, :cond_4

    .line 92
    const/4 v0, 0x1

    if-eq v4, v0, :cond_3

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 94
    invoke-direct {p0, v2, v1, v4}, Lo/bpo;->e(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    .line 96
    :cond_3
    const/4 v4, 0x1

    .line 97
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 98
    :cond_4
    const/16 v0, 0x3400

    if-ge v6, v0, :cond_6

    .line 99
    const/4 v0, 0x3

    if-eq v4, v0, :cond_5

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 101
    invoke-direct {p0, v2, v1, v4}, Lo/bpo;->e(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    .line 103
    :cond_5
    const/4 v4, 0x3

    .line 104
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 106
    :cond_6
    invoke-direct {p0, v1, v2, v4, v6}, Lo/bpo;->b(Ljava/util/ArrayList;Ljava/lang/StringBuilder;IC)I

    move-result v4

    .line 84
    :cond_7
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 109
    :cond_8
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_9

    .line 111
    invoke-direct {p0, v2, v1, v4}, Lo/bpo;->e(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    .line 113
    :cond_9
    return-object v1
.end method
