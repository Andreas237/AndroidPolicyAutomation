.class public Lo/aly;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aly$c;,
        Lo/aly$b;
    }
.end annotation


# instance fields
.field private a:Lo/aly$b;

.field private b:Lo/dqk;

.field private c:Lo/abm;

.field private d:Landroid/content/Context;

.field private e:Lo/aly$c;

.field private f:Lo/abv;

.field private h:Ljava/lang/Object;

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Lo/aly$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/aly$b;-><init>(Lo/aly;Lo/aly$3;)V

    iput-object v0, p0, Lo/aly;->a:Lo/aly$b;

    .line 69
    new-instance v0, Lo/aly$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/aly$c;-><init>(Lo/aly;Lo/aly$3;)V

    iput-object v0, p0, Lo/aly;->e:Lo/aly$c;

    .line 72
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/aly;->h:Ljava/lang/Object;

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/aly;->i:I

    .line 76
    iput-object p1, p0, Lo/aly;->d:Landroid/content/Context;

    .line 77
    return-void
.end method

.method static synthetic a(Lo/aly;)Landroid/content/Context;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/aly;->d:Landroid/content/Context;

    return-object v0
.end method

.method private a(I)V
    .locals 5

    .line 139
    const/4 v4, 0x0

    .line 140
    iput p1, p0, Lo/aly;->i:I

    .line 141
    const-string v0, "Step_Mock"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCapacity: capacity = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 145
    and-int/lit8 v0, p1, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 146
    const/4 v4, 0x1

    .line 149
    :cond_0
    if-eqz v4, :cond_1

    .line 150
    iget-object v0, p0, Lo/aly;->d:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/akz;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 152
    :cond_1
    iget-object v0, p0, Lo/aly;->d:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/akz;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 155
    :cond_2
    iget-object v0, p0, Lo/aly;->d:Landroid/content/Context;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/akz;->a(Landroid/content/Context;I)V

    .line 157
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1

    .line 230
    const-string v0, "com.huawei.mockhealth"

    invoke-static {p0, v0}, Lo/aly;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/aly;)Lo/dqk;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/aly;->b:Lo/dqk;

    return-object v0
.end method

.method static synthetic c(Lo/aly;)Lo/abv;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/aly;->f:Lo/abv;

    return-object v0
.end method

.method static synthetic c(Lo/aly;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/aly;->a(I)V

    return-void
.end method

.method static synthetic d(Lo/aly;)Ljava/lang/Object;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/aly;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lo/aly;)Lo/abm;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/aly;->c:Lo/abm;

    return-object v0
.end method

.method static synthetic e(Lo/aly;Lo/dqk;)Lo/dqk;
    .locals 0

    .line 30
    iput-object p1, p0, Lo/aly;->b:Lo/dqk;

    return-object p1
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 13

    .line 198
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 199
    const/4 v5, 0x0

    .line 200
    const/4 v6, 0x0

    .line 201
    const/4 v7, 0x0

    .line 202
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    const/16 v0, 0x40

    :try_start_0
    invoke-virtual {v4, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    .line 208
    iget-object v6, v5, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 210
    move-object v9, v6

    array-length v10, v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_0

    aget-object v12, v9, v11

    .line 211
    invoke-virtual {v12}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 214
    :cond_0
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/deg;->a([B)Ljava/lang/String;

    move-result-object v7

    .line 216
    const-string v0, "MzA4MjA0YjUzMDgyMDM5ZGEwMDMwMjAxMDIwMjA5MDBmMjA0NTZhYjk2NGZhMGYwMzAwZDA2MDkyYTg2NDg4NmY3MGQwMTAxMDUwNTAwMzA4MTk4MzEwYjMwMDkwNjAzNTUwNDA2MTMwMjQzNGUzMTEyMzAxMDA2MDM1NTA0MDgxMzA5NDc3NTYxNmU2NzY0NmY2ZTY3MzExMjMwMTAwNjAzNTUwNDA3MTMwOTUzNjg2NTZlNjc3YTY4NjU2ZTMxMGYzMDBkMDYwMzU1MDQwYTEzMDY0ODc1NjE3NzY1NjkzMTE4MzAxNjA2MDM1NTA0MGIxMzBmNTQ2NTcyNmQ2OTZlNjE2YzQzNmY2ZDcwNjE2ZTc5MzExNDMwMTIwNjAzNTUwNDAzMTMwYjQxNmU2NDcyNmY2OTY0NTQ2NTYxNmQzMTIwMzAxZTA2MDkyYTg2NDg4NmY3MGQwMTA5MDExNjExNmQ2ZjYyNjk2YzY1NDA2ODc1NjE3NzY1NjkyZTYzNmY2ZDMwMWUxNzBkMzEzMTMwMzUzMjM1MzAzNjMxMzAzNDM5NWExNzBkMzMzNjMwMzUzMTM4MzAzNjMxMzAzNDM5NWEzMDgxOTgzMTBiMzAwOTA2MDM1NTA0MDYxMzAyNDM0ZTMxMTIzMDEwMDYwMzU1MDQwODEzMDk0Nzc1NjE2ZTY3NjQ2ZjZlNjczMTEyMzAxMDA2MDM1NTA0MDcxMzA5NTM2ODY1NmU2NzdhNjg2NTZlMzEwZjMwMGQwNjAzNTUwNDBhMTMwNjQ4NzU2MTc3NjU2OTMxMTgzMDE2MDYwMzU1MDQwYjEzMGY1NDY1NzI2ZDY5NmU2MTZjNDM2ZjZkNzA2MTZlNzkzMTE0MzAxMjA2MDM1NTA0MDMxMzBiNDE2ZTY0NzI2ZjY5NjQ1NDY1NjE2ZDMxMjAzMDFlMDYwOTJhODY0ODg2ZjcwZDAxMDkwMTE2MTE2ZDZmNjI2OTZjNjU0MDY4NzU2MTc3NjU2OTJlNjM2ZjZkMzA4MjAxMjAzMDBkMDYwOTJhODY0ODg2ZjcwZDAxMDEwMTA1MDAwMzgyMDEwZDAwMzA4MjAxMDgwMjgyMDEwMTAwZTAyYzVhYjk3YTJiM2E4YTU5OTYyMjNjZGUwNmI4MmIyZDRmZjViMTVjYWY2NWI4NjBkNWM3YTNkNjg5OTVhYjA4NjIwYmI3NWEyMmZlNzY3M2E4YTFhYmEwM2UxN2I2NTFkMWZjNGQ1Y2JkYmFlOWU3M2VlZWFmNWExZDRkMmZiNzNlNzAwMDIzMWUwZGIyMTY2ZDBmYzVkZDk3ZTcwNWZkNjY1NDZjOWRhMzhlZDRlZmEyY2NjZGQyMzhhZDMyZTM5ODIxMjQyYjAxOTVkZjAxZDliOTcyNDJkYmYyMDllZGE4ZTQ0NmUwNDMyNDRiODRlNmJmY2E3OWQ3YmIzYzE5MjRjZGQyNDhlZGJkNjAwZWZmOGY3MzAwMWE4OWE0YzY2M2RiODk3MGUzMjg4Yjk0MzE1MjRjMzYxZTg1M2I4ZmEyOWUwNGU2MWViZTZmYmRiZDg3Y2RiZDNlZWI0N2IwMjdiNTg1MWJkZWFhMTNhMjNmNDM5NjdhMDMwZTc0N2VhNDMyNjUyY2JiMzRmZGRlNjEwNDliZjUwNjBjODEzZmIwZTkzZjZiYWQ5ZDM2ZjRkNDU1MTE5NWVhM2JiNDllOTIwMWFhNmRmOTc1YWUxNjllMjE0OTA1ZGUyNTc5ZDdjYzNjM2VhYzQ1OTRiMTRhYzE5ZDdlMzljNWMyNjcwMjAxMDNhMzgyMDEwMDMwODFmZDMwMWQwNjAzNTUxZDBlMDQxNjA0MTQzZWM2OTBkZTgxMWJjMzllNTFhMzAzMDFhZDIzY2YzMDA2ZDY3ZGUwMzA4MWNkMDYwMzU1MWQyMzA0ODFjNTMwODFjMjgwMTQzZWM2OTBkZTgxMWJjMzllNTFhMzAzMDFhZDIzY2YzMDA2ZDY3ZGUwYTE4MTllYTQ4MTliMzA4MTk4MzEwYjMwMDkwNjAzNTUwNDA2MTMwMjQzNGUzMTEyMzAxMDA2MDM1NTA0MDgxMzA5NDc3NTYxNmU2NzY0NmY2ZTY3MzExMjMwMTAwNjAzNTUwNDA3MTMwOTUzNjg2NTZlNjc3YTY4NjU2ZTMxMGYzMDBkMDYwMzU1MDQwYTEzMDY0ODc1NjE3NzY1NjkzMTE4MzAxNjA2MDM1NTA0MGIxMzBmNTQ2NTcyNmQ2OTZlNjE2YzQzNmY2ZDcwNjE2ZTc5MzExNDMwMTIwNjAzNTUwNDAzMTMwYjQxNmU2NDcyNmY2OTY0NTQ2NTYxNmQzMTIwMzAxZTA2MDkyYTg2NDg4NmY3MGQwMTA5MDExNjExNmQ2ZjYyNjk2YzY1NDA2ODc1NjE3NzY1NjkyZTYzNmY2ZDgyMDkwMGYyMDQ1NmFiOTY0ZmEwZjAzMDBjMDYwMzU1MWQxMzA0MDUzMDAzMDEwMWZmMzAwZDA2MDkyYTg2NDg4NmY3MGQwMTAxMDUwNTAwMDM4MjAxMDEwMDZkYWQyZmM1OTBjZjAwNzlhYzRjZTA4NjVhODg0MzExZGMxNmFkODMyNzVhMmIwMzAyNDA1Nzc2ZGQxZDFmNzA0YTI5OTkzYzhhMTM0YThkZmRkNTRjNTkxNTFhMDYxNTU2MTJkYmQzMDA2NDZlYWNmYzlmNjRmYWMyZTM1MjcwOWIwMzU5Zjc1NmFmOTZjMWY1NjQ5NTMwNGU3MjI4N2JlNDc5OGEwNDMzMzU2Y2JjY2RkOGQ1N2NkZTFmN2ZmMWMwMDRjYjk2MmFkNTk1YjFkYTIyZWYyMDRkZTE0NDkwODg2MWJiYTk2OGUwYzc0MzgxZTExOWM3NzJiMmNmMjJjM2QwYzgzMjVhOWYzMWM5Nzg3YjE1NmM5NDc3MWFmNjZmNGZmYjFhZDk5NmMzZmJlNzY0ZjNiYzUwYjdhMjY0M2MyMzM3MjYxMmYyNTA5OTQ2YTAzYmFkZmJmZWE2MWY4ZTNkMjg5MjMzODViYmMwMDg3NWFjZWM5OWI2ZDkyYWM0NjhmMGRjNTBjMDk5N2ZmNDA5ZTNhMjVkYzhkOTY2YzIwZDU4OGE5NzEzZmYyMTdlMmRlNDk0NTdhMzJjZjIzZGYxYWY1OGY0YmNkZDk0YThmMjZiYzFjOTBjNWE1MTgzZGI2NGQ0NjM1M2RkNDYxMDQ3OGM3N2YyYzg5OTg4"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    const/4 v0, 0x1

    return v0

    .line 219
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 221
    :catch_0
    move-exception v9

    .line 222
    const-string v0, "Step_Mock"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    goto :goto_1

    .line 223
    :catch_1
    move-exception v9

    .line 224
    const-string v0, "Step_Mock"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    :goto_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()Z
    .locals 8

    .line 81
    const/4 v4, 0x0

    .line 82
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 83
    const-string v0, "com.huawei.mockhealth"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 84
    const-string v0, "com.huawei.mockhealth"

    const-string v1, "com.huawei.mockhealth.MockStepService"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    :try_start_0
    iget-object v0, p0, Lo/aly;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/aly;->a:Lo/aly$b;

    const/4 v2, 0x1

    invoke-virtual {v0, v5, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    move v4, v0

    .line 87
    iget-object v6, p0, Lo/aly;->h:Ljava/lang/Object;

    monitor-enter v6
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 88
    :try_start_1
    iget-object v0, p0, Lo/aly;->h:Ljava/lang/Object;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    :try_start_2
    throw v7
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 94
    :goto_0
    goto :goto_1

    .line 90
    :catch_0
    move-exception v6

    .line 91
    const-string v0, "Step_Mock"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bindMockStepService SecurityException: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    goto :goto_1

    .line 92
    :catch_1
    move-exception v6

    .line 93
    const-string v0, "Step_Mock"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bindMockStepService InterruptedException: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :goto_1
    const-string v0, "Step_Mock"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MockService isBind: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", mMock: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aly;->b:Lo/dqk;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/aly;->b:Lo/dqk;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method public b(Lo/abv;Lo/abm;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/aly;->f:Lo/abv;

    .line 101
    iput-object p2, p0, Lo/aly;->c:Lo/abm;

    .line 102
    return-void
.end method

.method public c()Z
    .locals 3

    .line 160
    const/4 v2, 0x0

    .line 161
    iget v0, p0, Lo/aly;->i:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 162
    const/4 v2, 0x1

    .line 165
    :cond_0
    return v2
.end method

.method public d()V
    .locals 5

    .line 105
    iget-object v0, p0, Lo/aly;->b:Lo/dqk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/aly;->e:Lo/aly$c;

    if-eqz v0, :cond_0

    .line 107
    :try_start_0
    iget-object v0, p0, Lo/aly;->b:Lo/dqk;

    iget-object v1, p0, Lo/aly;->e:Lo/aly$c;

    invoke-interface {v0, v1}, Lo/dqk;->e(Lo/dqj;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    goto :goto_0

    .line 108
    :catch_0
    move-exception v4

    .line 109
    const-string v0, "Step_Mock"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    :cond_0
    :goto_0
    return-void
.end method
