.class public Lo/ayo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    .line 50
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v2

    .line 51
    const-string v3, ""

    .line 55
    :try_start_0
    invoke-static {}, Lo/ayq;->c()[B

    move-result-object v0

    invoke-static {v0}, Lo/ayk;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 57
    invoke-static {}, Lo/ayq;->d()Lo/ayq;

    move-result-object v0

    invoke-virtual {v0, v2, p0, v4}, Lo/ayq;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 62
    const-string v0, "UTF-8"

    invoke-virtual {v6, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/ayk;->e([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 69
    goto :goto_0

    .line 64
    :catch_0
    move-exception v4

    .line 66
    const-string v0, "SNSDBKeyStore"

    const-string v1, "encrypt SNS DB Key meet exception."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, "encrypt SNS DB Key meet exception."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 68
    new-instance v0, Lo/ayr;

    const-string v1, "encrypt SNS DB Key meet exception."

    invoke-direct {v0, v1}, Lo/ayr;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :goto_0
    return-object v3
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    .line 81
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    const-string v0, ""

    return-object v0

    .line 86
    :cond_0
    const-string v2, ""

    .line 90
    :try_start_0
    new-instance v3, Ljava/lang/String;

    invoke-static {p0}, Lo/ayk;->b(Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v3, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 93
    const-string v0, "\\|"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 96
    const/4 v0, 0x0

    aget-object v0, v4, v0

    move-object v2, v0

    .line 97
    const/4 v0, 0x1

    aget-object v5, v4, v0

    .line 100
    invoke-static {}, Lo/ayq;->d()Lo/ayq;

    move-result-object v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v5}, Lo/ayq;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 106
    goto :goto_0

    .line 102
    :catch_0
    move-exception v3

    .line 104
    const-string v0, "decrypt meet exception."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 105
    const-string v0, "SNSDBKeyStore"

    const-string v1, "decrypt meet exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :goto_0
    return-object v2
.end method
