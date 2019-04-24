.class public Lcom/shopkick/app/logging/SimpleAppenderConfig;
.super Ljava/lang/Object;
.source "SimpleAppenderConfig.java"

# interfaces
.implements Lcom/shopkick/logging/AppenderConfig;


# instance fields
.field protected activeArea:J

.field protected activeLevel:Lcom/shopkick/logging/Level;

.field protected enabled:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcom/shopkick/app/logging/SimpleAppenderConfig;->enabled:Z

    const-wide/16 v0, 0x0

    .line 21
    iput-wide v0, p0, Lcom/shopkick/app/logging/SimpleAppenderConfig;->activeArea:J

    .line 22
    sget-object v0, Lcom/shopkick/logging/Level;->ERROR:Lcom/shopkick/logging/Level;

    iput-object v0, p0, Lcom/shopkick/app/logging/SimpleAppenderConfig;->activeLevel:Lcom/shopkick/logging/Level;

    return-void
.end method

.method public constructor <init>(ZJLcom/shopkick/logging/Level;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-boolean p1, p0, Lcom/shopkick/app/logging/SimpleAppenderConfig;->enabled:Z

    .line 33
    iput-wide p2, p0, Lcom/shopkick/app/logging/SimpleAppenderConfig;->activeArea:J

    .line 34
    iput-object p4, p0, Lcom/shopkick/app/logging/SimpleAppenderConfig;->activeLevel:Lcom/shopkick/logging/Level;

    return-void
.end method


# virtual methods
.method public isAreaActive(J)Z
    .locals 2

    .line 44
    iget-wide v0, p0, Lcom/shopkick/app/logging/SimpleAppenderConfig;->activeArea:J

    invoke-static {v0, v1, p1, p2}, Lcom/shopkick/logging/Area;->areasOverlap(JJ)Z

    move-result p1

    return p1
.end method

.method public isEnabled()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/shopkick/app/logging/SimpleAppenderConfig;->enabled:Z

    return v0
.end method

.method public isLevelActive(Lcom/shopkick/logging/Level;)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 50
    invoke-virtual {p1}, Lcom/shopkick/logging/Level;->getValue()I

    move-result p1

    iget-object v1, p0, Lcom/shopkick/app/logging/SimpleAppenderConfig;->activeLevel:Lcom/shopkick/logging/Level;

    invoke-virtual {v1}, Lcom/shopkick/logging/Level;->getValue()I

    move-result v1

    if-gt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    return v0
.end method

.method public shouldLog(Lcom/shopkick/logging/Message;)Z
    .locals 3

    const-string v0, "LEVEL"

    .line 60
    const-class v1, Lcom/shopkick/logging/Level;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/logging/Level;

    .line 62
    invoke-virtual {p0}, Lcom/shopkick/app/logging/SimpleAppenderConfig;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getAreas()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lcom/shopkick/app/logging/SimpleAppenderConfig;->isAreaActive(J)Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/logging/SimpleAppenderConfig;->isLevelActive(Lcom/shopkick/logging/Level;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
