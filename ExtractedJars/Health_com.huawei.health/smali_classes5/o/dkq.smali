.class public Lo/dkq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/util/TimerTask;

.field private static c:Z

.field private static d:I

.field private static e:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const/4 v0, 0x0

    sput-object v0, Lo/dkq;->e:Ljava/util/Timer;

    .line 19
    const/4 v0, 0x0

    sput-object v0, Lo/dkq;->b:Ljava/util/TimerTask;

    .line 20
    const/4 v0, 0x0

    sput v0, Lo/dkq;->d:I

    .line 21
    const/4 v0, 0x1

    sput-boolean v0, Lo/dkq;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)V
    .locals 0

    .line 23
    sput p0, Lo/dkq;->d:I

    return-void
.end method

.method public static a()Z
    .locals 1

    .line 39
    sget-boolean v0, Lo/dkq;->c:Z

    return v0
.end method

.method public static b()V
    .locals 2

    .line 27
    sget v0, Lo/dkq;->d:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lo/dkq;->d:I

    return-void
.end method

.method public static c()Ljava/util/TimerTask;
    .locals 1

    .line 33
    sget-object v0, Lo/dkq;->b:Ljava/util/TimerTask;

    return-object v0
.end method

.method public static c(Ljava/util/Timer;)V
    .locals 0

    .line 31
    sput-object p0, Lo/dkq;->e:Ljava/util/Timer;

    return-void
.end method

.method public static c(Ljava/util/TimerTask;)V
    .locals 0

    .line 35
    sput-object p0, Lo/dkq;->b:Ljava/util/TimerTask;

    return-void
.end method

.method public static c(Z)V
    .locals 0

    .line 37
    sput-boolean p0, Lo/dkq;->c:Z

    return-void
.end method

.method public static d()I
    .locals 1

    .line 25
    sget v0, Lo/dkq;->d:I

    return v0
.end method

.method public static e()Ljava/util/Timer;
    .locals 1

    .line 29
    sget-object v0, Lo/dkq;->e:Ljava/util/Timer;

    return-object v0
.end method

.method public static i()V
    .locals 2

    .line 43
    sget-object v0, Lo/dkq;->e:Ljava/util/Timer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 44
    sget-object v0, Lo/dkq;->e:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 45
    const/4 v0, 0x0

    sput-object v0, Lo/dkq;->e:Ljava/util/Timer;

    .line 47
    :cond_0
    sget-object v0, Lo/dkq;->b:Ljava/util/TimerTask;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 48
    sget-object v0, Lo/dkq;->b:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 49
    const/4 v0, 0x0

    sput-object v0, Lo/dkq;->b:Ljava/util/TimerTask;

    .line 51
    :cond_1
    return-void
.end method
