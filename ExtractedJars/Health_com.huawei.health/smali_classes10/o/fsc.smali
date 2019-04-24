.class public final Lo/fsc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[B

.field private b:Lo/fsf;

.field private c:Lo/fqh;

.field private d:Ljava/security/Principal;

.field private e:Lo/frn;

.field private k:J


# direct methods
.method constructor <init>(Lo/frn;Lo/fsf;Lo/fqh;[BLjava/security/Principal;J)V
    .locals 2

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    if-nez p1, :cond_0

    .line 57
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Protcol version must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_0
    if-nez p2, :cond_1

    .line 59
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cipher suite must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_1
    if-nez p3, :cond_2

    .line 61
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Compression method must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 62
    :cond_2
    if-nez p4, :cond_3

    .line 63
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Master secret must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_3
    iput-object p1, p0, Lo/fsc;->e:Lo/frn;

    .line 66
    iput-object p4, p0, Lo/fsc;->a:[B

    .line 67
    iput-object p2, p0, Lo/fsc;->b:Lo/fsf;

    .line 68
    iput-object p3, p0, Lo/fsc;->c:Lo/fqh;

    .line 69
    iput-object p5, p0, Lo/fsc;->d:Ljava/security/Principal;

    .line 70
    iput-wide p6, p0, Lo/fsc;->k:J

    .line 72
    return-void
.end method


# virtual methods
.method public final a()Lo/fqh;
    .locals 1

    .line 199
    iget-object v0, p0, Lo/fsc;->c:Lo/fqh;

    return-object v0
.end method

.method public final c()Ljava/security/Principal;
    .locals 1

    .line 207
    iget-object v0, p0, Lo/fsc;->d:Ljava/security/Principal;

    return-object v0
.end method

.method public final d()[B
    .locals 1

    .line 183
    iget-object v0, p0, Lo/fsc;->a:[B

    return-object v0
.end method

.method public final e()Lo/fsf;
    .locals 1

    .line 191
    iget-object v0, p0, Lo/fsc;->b:Lo/fsf;

    return-object v0
.end method
