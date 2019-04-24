.class public Lcom/huawei/hms/support/log/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:J

.field private e:J

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:I

.field private final j:Ljava/lang/StringBuilder;


# direct methods
.method constructor <init>(ILjava/lang/String;ILjava/lang/String;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/log/d;->a:Ljava/lang/String;

    .line 15
    const-string v0, "HMS"

    iput-object v0, p0, Lcom/huawei/hms/support/log/d;->b:Ljava/lang/String;

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/support/log/d;->c:I

    .line 17
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hms/support/log/d;->d:J

    .line 18
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hms/support/log/d;->e:J

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/support/log/d;->i:I

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/support/log/d;->j:Ljava/lang/StringBuilder;

    .line 34
    iput p1, p0, Lcom/huawei/hms/support/log/d;->i:I

    .line 35
    iput-object p2, p0, Lcom/huawei/hms/support/log/d;->a:Ljava/lang/String;

    .line 36
    iput p3, p0, Lcom/huawei/hms/support/log/d;->c:I

    .line 37
    if-eqz p4, :cond_0

    .line 38
    iput-object p4, p0, Lcom/huawei/hms/support/log/d;->b:Ljava/lang/String;

    .line 41
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hms/support/log/d;->c()Lcom/huawei/hms/support/log/d;

    .line 42
    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    .line 122
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 124
    :pswitch_0
    const-string v0, "D"

    return-object v0

    .line 126
    :pswitch_1
    const-string v0, "I"

    return-object v0

    .line 128
    :pswitch_2
    const-string v0, "W"

    return-object v0

    .line 130
    :pswitch_3
    const-string v0, "E"

    return-object v0

    .line 132
    :goto_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private a(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 5

    .line 103
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss.SSS"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 105
    const/16 v0, 0x5b

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    iget-wide v0, p0, Lcom/huawei/hms/support/log/d;->d:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    iget v0, p0, Lcom/huawei/hms/support/log/d;->c:I

    invoke-static {v0}, Lcom/huawei/hms/support/log/d;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 108
    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/log/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/log/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hms/support/log/d;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hms/support/log/d;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 110
    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/log/d;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hms/support/log/d;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    const/16 v0, 0x5d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    return-object p1
.end method

.method private b(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    .line 152
    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/log/d;->j:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    return-object p1
.end method

.method private c()Lcom/huawei/hms/support/log/d;
    .locals 5

    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hms/support/log/d;->d:J

    .line 51
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hms/support/log/d;->e:J

    .line 53
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    iput v0, p0, Lcom/huawei/hms/support/log/d;->g:I

    .line 55
    invoke-virtual {v2}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    .line 56
    array-length v0, v3

    iget v1, p0, Lcom/huawei/hms/support/log/d;->i:I

    if-le v0, v1, :cond_0

    .line 57
    iget v0, p0, Lcom/huawei/hms/support/log/d;->i:I

    aget-object v4, v3, v0

    .line 58
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/support/log/d;->f:Ljava/lang/String;

    .line 59
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    iput v0, p0, Lcom/huawei/hms/support/log/d;->h:I

    .line 62
    :cond_0
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/huawei/hms/support/log/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(TT;)Lcom/huawei/hms/support/log/d;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/huawei/hms/support/log/d;->j:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    return-object p0
.end method

.method public a(Ljava/lang/Throwable;)Lcom/huawei/hms/support/log/d;
    .locals 2

    .line 83
    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/log/d;->a(Ljava/lang/Object;)Lcom/huawei/hms/support/log/d;

    move-result-object v0

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/log/d;->a(Ljava/lang/Object;)Lcom/huawei/hms/support/log/d;

    .line 84
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 2

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    invoke-direct {p0, v1}, Lcom/huawei/hms/support/log/d;->a(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    invoke-direct {p0, v1}, Lcom/huawei/hms/support/log/d;->b(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    invoke-direct {p0, v1}, Lcom/huawei/hms/support/log/d;->a(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 163
    invoke-direct {p0, v1}, Lcom/huawei/hms/support/log/d;->b(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 164
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
