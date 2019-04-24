.class public final enum Lo/fqh;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fqh;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fqh;

.field private static final synthetic b:[Lo/fqh;

.field private static final d:Lo/fty;

.field public static final enum e:Lo/fqh;


# instance fields
.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 42
    new-instance v0, Lo/fqh;

    const-string v1, "NULL"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fqh;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqh;->e:Lo/fqh;

    .line 43
    new-instance v0, Lo/fqh;

    const-string v1, "DEFLATE"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fqh;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqh;->a:Lo/fqh;

    .line 41
    const/4 v0, 0x2

    new-array v0, v0, [Lo/fqh;

    sget-object v1, Lo/fqh;->e:Lo/fqh;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fqh;->a:Lo/fqh;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/fqh;->b:[Lo/fqh;

    .line 51
    const-class v0, Lo/fqh;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqh;->d:Lo/fty;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 60
    iput p3, p0, Lo/fqh;->c:I

    .line 61
    return-void
.end method

.method public static c(I)Lo/fqh;
    .locals 3

    .line 70
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 72
    :sswitch_0
    sget-object v0, Lo/fqh;->e:Lo/fqh;

    return-object v0

    .line 74
    :sswitch_1
    sget-object v0, Lo/fqh;->a:Lo/fqh;

    return-object v0

    .line 77
    :goto_0
    sget-object v0, Lo/fqh;->d:Lo/fty;

    const-string v1, "Unknown compression method code: {}"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public static e([BI)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI)Ljava/util/List<Lo/fqh;>;"
        }
    .end annotation

    .line 114
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 115
    new-instance v2, Lo/fpq;

    invoke-direct {v2, p0}, Lo/fpq;-><init>([B)V

    .line 117
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_1

    .line 118
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v4

    .line 119
    invoke-static {v4}, Lo/fqh;->c(I)Lo/fqh;

    move-result-object v5

    .line 120
    if-eqz v5, :cond_0

    .line 121
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 124
    :cond_1
    return-object v1
.end method

.method public static e(Ljava/util/List;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fqh;>;)[B"
        }
    .end annotation

    .line 94
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 95
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fqh;

    .line 96
    invoke-virtual {v4}, Lo/fqh;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 97
    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fqh;
    .locals 1

    .line 41
    const-class v0, Lo/fqh;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fqh;

    return-object v0
.end method

.method public static values()[Lo/fqh;
    .locals 1

    .line 41
    sget-object v0, Lo/fqh;->b:[Lo/fqh;

    invoke-virtual {v0}, [Lo/fqh;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fqh;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 66
    iget v0, p0, Lo/fqh;->c:I

    return v0
.end method
