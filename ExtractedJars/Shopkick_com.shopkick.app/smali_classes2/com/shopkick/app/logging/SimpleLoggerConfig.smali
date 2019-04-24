.class public Lcom/shopkick/app/logging/SimpleLoggerConfig;
.super Ljava/lang/Object;
.source "SimpleLoggerConfig.java"

# interfaces
.implements Lcom/shopkick/logging/LoggerConfig;


# instance fields
.field private final activeArea:J

.field private final activeLevel:Lcom/shopkick/logging/Level;

.field private final isEnabled:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/shopkick/app/logging/SimpleLoggerConfig;->isEnabled:Z

    const-wide/16 v0, 0x0

    .line 20
    iput-wide v0, p0, Lcom/shopkick/app/logging/SimpleLoggerConfig;->activeArea:J

    .line 21
    sget-object v0, Lcom/shopkick/logging/Level;->ERROR:Lcom/shopkick/logging/Level;

    iput-object v0, p0, Lcom/shopkick/app/logging/SimpleLoggerConfig;->activeLevel:Lcom/shopkick/logging/Level;

    return-void
.end method

.method public constructor <init>(ZJLcom/shopkick/logging/Level;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-boolean p1, p0, Lcom/shopkick/app/logging/SimpleLoggerConfig;->isEnabled:Z

    .line 32
    iput-wide p2, p0, Lcom/shopkick/app/logging/SimpleLoggerConfig;->activeArea:J

    .line 33
    iput-object p4, p0, Lcom/shopkick/app/logging/SimpleLoggerConfig;->activeLevel:Lcom/shopkick/logging/Level;

    return-void
.end method


# virtual methods
.method public isAreaActive(J)Z
    .locals 2

    .line 43
    iget-wide v0, p0, Lcom/shopkick/app/logging/SimpleLoggerConfig;->activeArea:J

    invoke-static {p1, p2, v0, v1}, Lcom/shopkick/logging/Area;->areasOverlap(JJ)Z

    move-result p1

    return p1
.end method

.method public isLevelActive(Lcom/shopkick/logging/Level;)Z
    .locals 1

    .line 48
    invoke-virtual {p1}, Lcom/shopkick/logging/Level;->getValue()I

    move-result p1

    iget-object v0, p0, Lcom/shopkick/app/logging/SimpleLoggerConfig;->activeLevel:Lcom/shopkick/logging/Level;

    invoke-virtual {v0}, Lcom/shopkick/logging/Level;->getValue()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isLoggingEnabled()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/shopkick/app/logging/SimpleLoggerConfig;->isEnabled:Z

    return v0
.end method
