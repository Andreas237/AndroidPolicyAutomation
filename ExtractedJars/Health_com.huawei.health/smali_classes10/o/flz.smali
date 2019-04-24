.class public Lo/flz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lo/flz;


# instance fields
.field private final b:I

.field private final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Lo/flz;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lo/flz;-><init>([B)V

    sput-object v0, Lo/flz;->d:Lo/flz;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 49
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/flz;-><init>([BZ)V

    .line 50
    return-void
.end method

.method private constructor <init>([BZ)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    if-nez p1, :cond_0

    .line 64
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "token bytes must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_0
    array-length v0, p1

    const/16 v1, 0x8

    if-le v0, v1, :cond_1

    .line 66
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Token length must be between 0 and 8 inclusive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_1
    if-eqz p2, :cond_2

    array-length v0, p1

    if-lez v0, :cond_2

    .line 69
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/flz;->c:[B

    goto :goto_0

    .line 71
    :cond_2
    iput-object p1, p0, Lo/flz;->c:[B

    .line 73
    :goto_0
    iget-object v0, p0, Lo/flz;->c:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    iput v0, p0, Lo/flz;->b:I

    .line 74
    return-void
.end method

.method public static c([B)Lo/flz;
    .locals 2

    .line 143
    new-instance v0, Lo/flz;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/flz;-><init>([BZ)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 131
    iget-object v0, p0, Lo/flz;->c:[B

    array-length v0, v0

    return v0
.end method

.method public c()Z
    .locals 1

    .line 122
    iget-object v0, p0, Lo/flz;->c:[B

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()[B
    .locals 1

    .line 104
    iget-object v0, p0, Lo/flz;->c:[B

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lo/flz;->c:[B

    invoke-static {v0}, Lo/fli;->b([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 88
    if-ne p0, p1, :cond_0

    .line 89
    const/4 v0, 0x1

    return v0

    .line 90
    :cond_0
    if-nez p1, :cond_1

    .line 91
    const/4 v0, 0x0

    return v0

    .line 92
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 93
    const/4 v0, 0x0

    return v0

    .line 94
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/flz;

    .line 95
    iget-object v0, p0, Lo/flz;->c:[B

    iget-object v1, v2, Lo/flz;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 83
    iget v0, p0, Lo/flz;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Token["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo/flz;->c:[B

    invoke-static {v1}, Lo/fli;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
