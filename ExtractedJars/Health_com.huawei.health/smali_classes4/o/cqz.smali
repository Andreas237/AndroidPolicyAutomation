.class public Lo/cqz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqz$c;
    }
.end annotation


# static fields
.field private static a:Landroid/content/Context;


# instance fields
.field private b:Lo/cqq;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lo/cqq;

    invoke-direct {v0}, Lo/cqq;-><init>()V

    iput-object v0, p0, Lo/cqz;->b:Lo/cqq;

    .line 26
    return-void
.end method

.method synthetic constructor <init>(Lo/cqz$5;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lo/cqz;-><init>()V

    return-void
.end method

.method private a(ILjava/lang/String;)Z
    .locals 1

    .line 159
    if-lez p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private declared-synchronized b(III)Lo/crd;
    .locals 7

    monitor-enter p0

    .line 84
    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    if-gez p3, :cond_1

    .line 85
    :cond_0
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserClient app < 0 or device < 0 or who < 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 89
    iget-object v0, p0, Lo/cqz;->b:Lo/cqq;

    invoke-virtual {v0, v4}, Lo/cqq;->a(Ljava/lang/String;)Lo/crd;

    move-result-object v5

    .line 90
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 91
    monitor-exit p0

    return-object v5

    .line 93
    :cond_2
    sget-object v0, Lo/cqz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p1}, Lo/cpw;->c(III)I

    move-result v6

    .line 94
    if-gtz v6, :cond_3

    .line 95
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserClient client <= 0 key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 99
    :cond_3
    new-instance v5, Lo/crd;

    invoke-direct {v5, p1, p3, p2, v6}, Lo/crd;-><init>(IIII)V

    .line 100
    iget-object v0, p0, Lo/cqz;->b:Lo/cqq;

    invoke-virtual {v0, v4, v5}, Lo/cqq;->b(Ljava/lang/String;Lo/crd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    monitor-exit p0

    return-object v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized c(III)I
    .locals 7

    monitor-enter p0

    .line 109
    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    if-gez p3, :cond_1

    .line 110
    :cond_0
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllClientID app < 0 or device < 0 or who < 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 113
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 114
    iget-object v0, p0, Lo/cqz;->b:Lo/cqq;

    invoke-virtual {v0, v4}, Lo/cqq;->a(Ljava/lang/String;)Lo/crd;

    move-result-object v5

    .line 115
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 116
    invoke-virtual {v5}, Lo/crd;->a()I

    move-result v0

    monitor-exit p0

    return v0

    .line 118
    :cond_2
    sget-object v0, Lo/cqz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p1}, Lo/cpw;->c(III)I

    move-result v6

    .line 119
    if-gtz v6, :cond_3

    .line 120
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllClientID client <= 0 key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 124
    :cond_3
    new-instance v5, Lo/crd;

    invoke-direct {v5, p1, p3, p2, v6}, Lo/crd;-><init>(IIII)V

    .line 125
    iget-object v0, p0, Lo/cqz;->b:Lo/cqq;

    invoke-virtual {v0, v4, v5}, Lo/cqq;->b(Ljava/lang/String;Lo/crd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    monitor-exit p0

    return v6

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized c(IILjava/lang/String;)Lo/crd;
    .locals 7

    monitor-enter p0

    .line 134
    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 135
    :cond_0
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getReadHiHealthContext app < 0 or device = null or who < 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 138
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p3}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 139
    iget-object v0, p0, Lo/cqz;->b:Lo/cqq;

    invoke-virtual {v0, v4}, Lo/cqq;->a(Ljava/lang/String;)Lo/crd;

    move-result-object v5

    .line 140
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 141
    monitor-exit p0

    return-object v5

    .line 143
    :cond_2
    sget-object v0, Lo/cqz;->a:Landroid/content/Context;

    invoke-static {v0, p3}, Lo/cqf;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    .line 144
    if-gtz v6, :cond_3

    .line 145
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getReadHiHealthContext device <= 0 deviceUUID error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_3
    invoke-virtual {p0, p1, p2, v6}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v5

    .line 149
    const/4 v0, 0x0

    if-ne v0, v5, :cond_4

    .line 150
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getReadHiHealthContext hiHealthContext = null key error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 154
    :cond_4
    iget-object v0, p0, Lo/cqz;->b:Lo/cqq;

    invoke-virtual {v0, v4, v5}, Lo/cqq;->b(Ljava/lang/String;Lo/crd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    monitor-exit p0

    return-object v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static d(Lo/cqz;IIII)I
    .locals 5

    .line 177
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 179
    :pswitch_0
    const/4 v0, 0x0

    invoke-virtual {p0, p2, p3, v0}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v4

    .line 180
    goto :goto_1

    .line 182
    :pswitch_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p3, p4}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v4

    .line 183
    goto :goto_1

    .line 185
    :pswitch_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p3, v1}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v4

    .line 186
    goto :goto_1

    .line 188
    :goto_0
    const/4 v4, 0x0

    .line 191
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 192
    const-string v0, "Debug_StoreClient"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatClient statClient is null,writeStatType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",app is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",who is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 193
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ", device is "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 192
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const/4 v0, 0x0

    return v0

    .line 196
    :cond_0
    invoke-virtual {v4}, Lo/crd;->a()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static d(Landroid/content/Context;)Lo/cqz;
    .locals 3

    .line 36
    const-class v1, Lo/cqz;

    monitor-enter v1

    .line 37
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqz;->a:Landroid/content/Context;

    .line 38
    sget-object v0, Lo/cqz$c;->b:Lo/cqz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 39
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private declared-synchronized d(IILjava/lang/String;)Lo/crd;
    .locals 8

    monitor-enter p0

    .line 47
    :try_start_0
    invoke-direct {p0, p1, p3}, Lo/cqz;->a(ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOwnerClient app <= 0 or device = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_0
    sget-object v0, Lo/cqz;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lo/cqf;->d(Landroid/content/Context;II)I

    move-result v4

    .line 53
    if-gtz v4, :cond_1

    .line 54
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOwnerClient who <= 0 ower = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 58
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p3}, Lo/cqw;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 59
    iget-object v0, p0, Lo/cqz;->b:Lo/cqq;

    invoke-virtual {v0, v5}, Lo/cqq;->a(Ljava/lang/String;)Lo/crd;

    move-result-object v6

    .line 60
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 61
    monitor-exit p0

    return-object v6

    .line 64
    :cond_2
    sget-object v0, Lo/cqz;->a:Landroid/content/Context;

    invoke-static {v0, p3}, Lo/cqf;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    .line 65
    if-gtz v7, :cond_3

    .line 66
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOwnerClient device <= 0 deviceUUID error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_3
    invoke-virtual {p0, p1, v4, v7}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v6

    .line 70
    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 71
    const-string v0, "Debug_StoreClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOwnerClient hiHealthContext = null key error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_4
    iget-object v0, p0, Lo/cqz;->b:Lo/cqq;

    invoke-virtual {v0, v5, v6}, Lo/cqq;->b(Ljava/lang/String;Lo/crd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    monitor-exit p0

    return-object v6

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a(III)I
    .locals 1

    .line 105
    invoke-direct {p0, p1, p2, p3}, Lo/cqz;->c(III)I

    move-result v0

    return v0
.end method

.method public a(IILjava/lang/String;)Lo/crd;
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lo/cqz;->d(IILjava/lang/String;)Lo/crd;

    move-result-object v0

    return-object v0
.end method

.method public e(III)Lo/crd;
    .locals 1

    .line 80
    invoke-direct {p0, p1, p2, p3}, Lo/cqz;->b(III)Lo/crd;

    move-result-object v0

    return-object v0
.end method

.method public e(IILjava/lang/String;)Lo/crd;
    .locals 1

    .line 130
    invoke-direct {p0, p1, p2, p3}, Lo/cqz;->c(IILjava/lang/String;)Lo/crd;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 3

    .line 170
    move-object v1, p0

    monitor-enter v1

    .line 171
    :try_start_0
    iget-object v0, p0, Lo/cqz;->b:Lo/cqq;

    invoke-virtual {v0}, Lo/cqq;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 173
    :goto_0
    return-void
.end method
