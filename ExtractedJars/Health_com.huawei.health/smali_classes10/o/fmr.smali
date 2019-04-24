.class public Lo/fmr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmx;


# static fields
.field private static final c:Lo/fty;


# instance fields
.field private final b:Ljava/security/SecureRandom;

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const-class v0, Lo/fmr;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fmr;->c:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;)V
    .locals 3

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    if-nez p1, :cond_0

    .line 49
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "NetworkConfig must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lo/fmr;->b:Ljava/security/SecureRandom;

    .line 53
    iget-object v0, p0, Lo/fmr;->b:Ljava/security/SecureRandom;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    .line 54
    const-string v0, "TOKEN_SIZE_LIMIT"

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fmw;->c(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/fmr;->e:I

    .line 55
    sget-object v0, Lo/fmr;->c:Lo/fty;

    const-string v1, "using tokens of {} bytes in length"

    iget v2, p0, Lo/fmr;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    return-void
.end method


# virtual methods
.method public c(Z)Lo/flz;
    .locals 3

    .line 60
    iget v0, p0, Lo/fmr;->e:I

    new-array v2, v0, [B

    .line 61
    iget-object v0, p0, Lo/fmr;->b:Ljava/security/SecureRandom;

    invoke-virtual {v0, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 62
    if-eqz p1, :cond_0

    .line 64
    const/4 v0, 0x0

    aget-byte v0, v2, v0

    or-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v2, v1

    goto :goto_0

    .line 67
    :cond_0
    const/4 v0, 0x0

    aget-byte v0, v2, v0

    and-int/lit16 v0, v0, 0xfe

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v2, v1

    .line 69
    :goto_0
    invoke-static {v2}, Lo/flz;->c([B)Lo/flz;

    move-result-object v0

    return-object v0
.end method
