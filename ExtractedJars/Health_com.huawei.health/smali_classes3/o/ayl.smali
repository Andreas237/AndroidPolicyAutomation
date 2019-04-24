.class final Lo/ayl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/ayl;

.field private static final d:[B


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lo/ayp;

.field private e:Ljava/lang/String;

.field private g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/ayl;->d:[B

    .line 32
    const/4 v0, 0x0

    sput-object v0, Lo/ayl;->c:Lo/ayl;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ayl;->e:Ljava/lang/String;

    .line 47
    if-eqz p1, :cond_0

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ayl;->g:Landroid/content/Context;

    .line 49
    new-instance v0, Lo/ayp;

    const-string v1, "sns_secret"

    invoke-direct {v0, v1}, Lo/ayp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ayl;->b:Lo/ayp;

    .line 51
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 108
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 110
    return-object p0

    .line 112
    :cond_0
    const-string v0, "%16s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 113
    const-string v0, "\\s"

    const-string v1, "0"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 114
    return-object p0
.end method

.method public static declared-synchronized e(Landroid/content/Context;)Lo/ayl;
    .locals 2

    const-class v1, Lo/ayl;

    monitor-enter v1

    .line 55
    :try_start_0
    sget-object v0, Lo/ayl;->c:Lo/ayl;

    if-nez v0, :cond_0

    .line 56
    new-instance v0, Lo/ayl;

    invoke-direct {v0, p0}, Lo/ayl;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ayl;->c:Lo/ayl;

    .line 58
    :cond_0
    sget-object v0, Lo/ayl;->c:Lo/ayl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 9

    .line 67
    sget-object v3, Lo/ayl;->d:[B

    monitor-enter v3

    .line 69
    :try_start_0
    iget-object v0, p0, Lo/ayl;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 71
    iget-object v0, p0, Lo/ayl;->g:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ayl;->b:Lo/ayp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 72
    :cond_0
    monitor-exit v3

    const/4 v0, 0x0

    return-object v0

    .line 74
    :cond_1
    :try_start_1
    iget-object v0, p0, Lo/ayl;->b:Lo/ayp;

    const-string v1, "sns.db.work.secret.key.param"

    invoke-virtual {v0, v1}, Lo/ayp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 75
    iget-object v0, p0, Lo/ayl;->b:Lo/ayp;

    const-string v1, "sns.db.work.iv.key.param"

    invoke-virtual {v0, v1}, Lo/ayp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 77
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 78
    iget-object v0, p0, Lo/ayl;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/ayq;->e(Landroid/content/Context;)[B

    move-result-object v0

    invoke-static {v5}, Lo/ayk;->b(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v4, v0, v1}, Lo/ayn;->e(Ljava/lang/String;[B[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ayl;->e:Ljava/lang/String;

    .line 80
    :cond_2
    iget-object v0, p0, Lo/ayl;->e:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/ayl;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_4

    .line 82
    :cond_3
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ayl;->e:Ljava/lang/String;

    .line 83
    iget-object v0, p0, Lo/ayl;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/ayl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ayl;->e:Ljava/lang/String;

    .line 84
    invoke-static {}, Lo/ayq;->c()[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v6

    .line 86
    :try_start_2
    iget-object v0, p0, Lo/ayl;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/ayl;->g:Landroid/content/Context;

    invoke-static {v1}, Lo/ayq;->e(Landroid/content/Context;)[B

    move-result-object v1

    invoke-static {v0, v1, v6}, Lo/ayn;->a(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 91
    goto :goto_0

    .line 87
    :catch_0
    move-exception v7

    .line 88
    const-string v0, "DeviceSession"

    const-string v1, "getWorkSecretKey AESBaseEncrypt GeneralSecurityException error."

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    goto :goto_0

    .line 89
    :catch_1
    move-exception v7

    .line 90
    const-string v0, "DeviceSession"

    const-string v1, "getWorkSecretKey AESBaseEncrypt UnsupportedEncodingException error."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :goto_0
    iget-object v0, p0, Lo/ayl;->b:Lo/ayp;

    const-string v1, "sns.db.work.secret.key.param"

    invoke-virtual {v0, v1, v4}, Lo/ayp;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 93
    iget-object v0, p0, Lo/ayl;->b:Lo/ayp;

    const-string v1, "sns.db.work.iv.key.param"

    invoke-static {v6}, Lo/ayk;->e([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ayp;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 96
    :cond_4
    iget-object v0, p0, Lo/ayl;->e:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v3

    return-object v0

    .line 97
    :catchall_0
    move-exception v8

    monitor-exit v3

    throw v8
.end method

.method public e()Ljava/lang/String;
    .locals 5

    .line 119
    sget-object v3, Lo/ayl;->d:[B

    monitor-enter v3

    .line 121
    :try_start_0
    iget-object v0, p0, Lo/ayl;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 123
    iget-object v0, p0, Lo/ayl;->b:Lo/ayp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 124
    monitor-exit v3

    const/4 v0, 0x0

    return-object v0

    .line 127
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/ayl;->b:Lo/ayp;

    const-string v1, "sns.db.seed.salt.param"

    invoke-virtual {v0, v1}, Lo/ayp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ayl;->a:Ljava/lang/String;

    .line 128
    iget-object v0, p0, Lo/ayl;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 130
    invoke-static {}, Lo/ayq;->b()[B

    move-result-object v0

    invoke-static {v0}, Lo/ayk;->e([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ayl;->a:Ljava/lang/String;

    .line 131
    iget-object v0, p0, Lo/ayl;->b:Lo/ayp;

    const-string v1, "sns.db.seed.salt.param"

    iget-object v2, p0, Lo/ayl;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/ayp;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 134
    :cond_1
    iget-object v0, p0, Lo/ayl;->a:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    return-object v0

    .line 135
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method
