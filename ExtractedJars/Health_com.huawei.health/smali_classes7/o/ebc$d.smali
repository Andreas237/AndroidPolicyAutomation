.class final Lo/ebc$d;
.super Ljava/security/Provider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ebc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 130
    const-string v0, "Crypto"

    const-string v1, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)"

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0, v0, v2, v3, v1}, Ljava/security/Provider;-><init>(Ljava/lang/String;DLjava/lang/String;)V

    .line 131
    const-string v0, "SecureRandom.SHA1PRNG"

    const-string v1, "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"

    invoke-virtual {p0, v0, v1}, Lo/ebc$d;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    const-string v0, "SecureRandom.SHA1PRNG ImplementedIn"

    const-string v1, "Software"

    invoke-virtual {p0, v0, v1}, Lo/ebc$d;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    return-void
.end method
