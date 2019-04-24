.class public Lo/fsl;
.super Ljava/security/GeneralSecurityException;
.source "SourceFile"


# instance fields
.field private final d:[B

.field private final e:[B


# direct methods
.method public constructor <init>([B[B)V
    .locals 1

    .line 39
    const-string v0, "MAC validation failed"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 40
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fsl;->e:[B

    .line 41
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fsl;->d:[B

    .line 42
    return-void
.end method
