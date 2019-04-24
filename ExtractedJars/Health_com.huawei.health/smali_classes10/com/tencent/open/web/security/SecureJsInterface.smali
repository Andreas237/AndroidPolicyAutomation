.class public Lcom/tencent/open/web/security/SecureJsInterface;
.super Lcom/tencent/open/a$b;
.source "SourceFile"


# static fields
.field public static isPWDEdit:Z


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/open/web/security/SecureJsInterface;->isPWDEdit:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/tencent/open/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public clearAllEdit()V
    .locals 4

    .line 92
    const-string v0, "openSDK_LOG.SI"

    const-string v1, "-->clear all edit."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    :try_start_0
    invoke-static {}, Lcom/tencent/open/web/security/JniInterface;->clearAllPWD()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 95
    :catch_0
    move-exception v3

    .line 96
    const-string v0, "openSDK_LOG.SI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->clear all edit exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 100
    :goto_0
    return-void
.end method

.method public curPosFromJS(Ljava/lang/String;)V
    .locals 6

    .line 25
    const-string v0, "openSDK_LOG.SI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->curPosFromJS: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    const/4 v4, -0x1

    .line 29
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 33
    goto :goto_0

    .line 30
    :catch_0
    move-exception v5

    .line 31
    const-string v0, "openSDK_LOG.SI"

    const-string v1, "-->curPosFromJS number format exception."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    :goto_0
    if-gez v4, :cond_0

    .line 35
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "position is illegal."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_0
    sget-boolean v0, Lcom/tencent/open/web/security/a;->c:Z

    .line 45
    sget-boolean v0, Lcom/tencent/open/web/security/a;->b:Z

    if-eqz v0, :cond_1

    .line 46
    sget-boolean v0, Lcom/tencent/open/web/security/a;->b:Z

    invoke-static {v0, v4}, Lcom/tencent/open/web/security/JniInterface;->BackSpaceChar(ZI)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 49
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/open/web/security/a;->b:Z

    goto :goto_1

    .line 52
    :cond_1
    sget-object v0, Lcom/tencent/open/web/security/a;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/open/web/security/SecureJsInterface;->a:Ljava/lang/String;

    .line 54
    iget-object v0, p0, Lcom/tencent/open/web/security/SecureJsInterface;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/open/web/security/SecureJsInterface;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v4, v0, v1}, Lcom/tencent/open/web/security/JniInterface;->insetTextToArray(ILjava/lang/String;I)Z

    .line 55
    const-string v0, "openSDK_LOG.SI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mKey: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/web/security/SecureJsInterface;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    :cond_2
    :goto_1
    return-void
.end method

.method public customCallback()Z
    .locals 1

    .line 15
    const/4 v0, 0x1

    return v0
.end method

.method public getMD5FromNative()Ljava/lang/String;
    .locals 5

    .line 108
    const-string v0, "openSDK_LOG.SI"

    const-string v1, "-->get md5 form native"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v3, ""

    .line 111
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Lcom/tencent/open/web/security/JniInterface;->getPWDKeyToMD5(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 115
    goto :goto_0

    .line 112
    :catch_0
    move-exception v4

    .line 113
    const-string v0, "openSDK_LOG.SI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->get md5 form native exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 116
    :goto_0
    const-string v0, "openSDK_LOG.SI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->getMD5FromNative, MD5= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    return-object v3
.end method

.method public isPasswordEdit(Ljava/lang/String;)V
    .locals 5

    .line 69
    const-string v0, "openSDK_LOG.SI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->is pswd edit, flag: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const/4 v3, -0x1

    .line 72
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 75
    goto :goto_0

    .line 73
    :catch_0
    move-exception v4

    .line 74
    const-string v0, "openSDK_LOG.SI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->is pswd edit exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    :goto_0
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    if-eq v3, v0, :cond_0

    .line 77
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "is pswd edit flag is illegal."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_0
    if-nez v3, :cond_1

    .line 80
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/open/web/security/SecureJsInterface;->isPWDEdit:Z

    goto :goto_1

    .line 81
    :cond_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_2

    .line 82
    const/4 v0, 0x1

    sput-boolean v0, Lcom/tencent/open/web/security/SecureJsInterface;->isPWDEdit:Z

    .line 84
    :cond_2
    :goto_1
    return-void
.end method
