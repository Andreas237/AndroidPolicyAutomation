.class public Lnet/toddm/comm/tests/TestBase64;
.super Ljunit/framework/TestCase;
.source "TestBase64.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljunit/framework/TestCase;-><init>()V

    return-void
.end method


# virtual methods
.method public testEncodeComplex()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 40
    new-instance v0, Ljava/lang/String;

    const-string v1, "\u2524\u2565,65\u2640635L2\u263b~32\u25102\u25d9\u23201j32\u251053K_"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 41
    invoke-static {v0}, Lnet/toddm/comm/Base64;->encode([B)Ljava/lang/String;

    move-result-object v0

    .line 42
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Base64.encode produced: \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 48
    invoke-static {v0}, Lnet/toddm/comm/tests/TestBase64;->assertNotNull(Ljava/lang/Object;)V

    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lnet/toddm/comm/tests/TestBase64;->assertTrue(Z)V

    const-string v1, "4pSk4pWlLDY14pmANjM1TDLimLt+MzLilJAy4peZ4oygMWozMuKUkDUzS18="

    .line 50
    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestBase64;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public testEncodeSimple()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 25
    new-instance v0, Ljava/lang/String;

    const-string v1, "the quick brown fox jumped over the lazy dog"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 26
    invoke-static {v0}, Lnet/toddm/comm/Base64;->encode([B)Ljava/lang/String;

    move-result-object v0

    .line 27
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Base64.encode produced: \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 33
    invoke-static {v0}, Lnet/toddm/comm/tests/TestBase64;->assertNotNull(Ljava/lang/Object;)V

    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lnet/toddm/comm/tests/TestBase64;->assertTrue(Z)V

    const-string v1, "dGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2c="

    .line 35
    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestBase64;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
