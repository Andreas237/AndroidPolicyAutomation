.class public Lo/ain;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[B

.field public b:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/16 v0, 0x10

    new-array v0, v0, [B

    iput-object v0, p0, Lo/ain;->b:[B

    .line 41
    const/16 v0, 0x10

    new-array v0, v0, [B

    iput-object v0, p0, Lo/ain;->a:[B

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 45
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    .line 46
    :cond_0
    const-string v0, "CoapEncryptExpression"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sn1 or sn2 is not right!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 47
    return-void

    .line 51
    :cond_1
    invoke-static {p1}, Lo/ajw;->a(Ljava/lang/String;)[B

    move-result-object v4

    .line 52
    invoke-static {p2}, Lo/ajw;->a(Ljava/lang/String;)[B

    move-result-object v5

    .line 56
    array-length v0, v4

    array-length v1, v5

    add-int/2addr v0, v1

    new-array v6, v0, [B

    .line 57
    array-length v0, v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v4, v1, v6, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    array-length v0, v4

    array-length v1, v5

    const/4 v2, 0x0

    invoke-static {v5, v2, v6, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    invoke-static {}, Lo/ajx;->c()V

    .line 62
    const/4 v0, 0x0

    new-array v7, v0, [B

    .line 64
    const/4 v0, 0x1

    const/16 v1, 0x20

    :try_start_0
    invoke-static {v6, v0, v1}, Lo/ajw;->e([BII)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v7, v0

    .line 69
    goto :goto_0

    .line 65
    :catch_0
    move-exception v8

    .line 66
    const-string v0, "CoapEncryptExpression"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 69
    goto :goto_0

    .line 67
    :catch_1
    move-exception v8

    .line 68
    const-string v0, "CoapEncryptExpression"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 72
    :goto_0
    if-eqz v7, :cond_2

    array-length v0, v7

    const/16 v1, 0x20

    if-eq v0, v1, :cond_3

    .line 73
    :cond_2
    const-string v0, "CoapEncryptExpression"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get digest error! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 74
    return-void

    .line 78
    :cond_3
    iget-object v0, p0, Lo/ain;->b:[B

    iget-object v1, p0, Lo/ain;->b:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v7, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    const-string v0, "CoapEncryptExpression"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "psk = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ain;->b:[B

    invoke-static {v3}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/ain;->b:[B

    array-length v0, v0

    iget-object v1, p0, Lo/ain;->a:[B

    iget-object v2, p0, Lo/ain;->a:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v7, v0, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 83
    const-string v0, "CoapEncryptExpression"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "iv = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ain;->a:[B

    invoke-static {v3}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-void
.end method
