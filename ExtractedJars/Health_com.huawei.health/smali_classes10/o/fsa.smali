.class public final Lo/fsa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Lo/fsa;


# instance fields
.field private final a:[B

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Lo/fsa;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lo/fsa;-><init>([B)V

    sput-object v0, Lo/fsa;->e:Lo/fsa;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Lo/fro;

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {v0, v1}, Lo/fro;-><init>(Ljava/security/SecureRandom;)V

    invoke-virtual {v0}, Lo/fro;->b()[B

    move-result-object v0

    iput-object v0, p0, Lo/fsa;->a:[B

    .line 43
    iget-object v0, p0, Lo/fsa;->a:[B

    invoke-static {v0}, Lo/fsp;->d([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fsa;->b:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    if-nez p1, :cond_0

    .line 54
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Session ID must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :cond_0
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fsa;->a:[B

    .line 57
    iget-object v0, p0, Lo/fsa;->a:[B

    invoke-static {v0}, Lo/fsp;->d([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fsa;->b:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public static a()Lo/fsa;
    .locals 1

    .line 76
    sget-object v0, Lo/fsa;->e:Lo/fsa;

    return-object v0
.end method


# virtual methods
.method public b()[B
    .locals 1

    .line 67
    iget-object v0, p0, Lo/fsa;->a:[B

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 63
    iget-object v0, p0, Lo/fsa;->a:[B

    array-length v0, v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 104
    if-ne p0, p1, :cond_0

    .line 105
    const/4 v0, 0x1

    return v0

    .line 106
    :cond_0
    if-nez p1, :cond_1

    .line 107
    const/4 v0, 0x0

    return v0

    .line 108
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 109
    const/4 v0, 0x0

    return v0

    .line 110
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/fsa;

    .line 111
    iget-object v0, p0, Lo/fsa;->a:[B

    iget-object v1, v2, Lo/fsa;->a:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_3

    .line 112
    const/4 v0, 0x0

    return v0

    .line 113
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 86
    const/16 v2, 0x1f

    .line 87
    const/4 v3, 0x1

    .line 88
    iget-object v0, p0, Lo/fsa;->a:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    add-int/lit8 v3, v0, 0x1f

    .line 89
    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lo/fsa;->b:Ljava/lang/String;

    return-object v0
.end method
