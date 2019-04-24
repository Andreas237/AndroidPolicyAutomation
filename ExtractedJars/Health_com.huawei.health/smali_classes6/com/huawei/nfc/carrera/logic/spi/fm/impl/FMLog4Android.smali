.class public Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcn/com/fmsh/util/log/FMLog;


# instance fields
.field private final TAG:Ljava/lang/String;

.field private level:Lcn/com/fmsh/util/log/Level;

.field private showLogFlag:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    sget-object v0, Lcn/com/fmsh/util/log/Level;->DEBUG:Lcn/com/fmsh/util/log/Level;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->level:Lcn/com/fmsh/util/log/Level;

    .line 15
    const-string v0, "FMServiceImpl"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->TAG:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public debug(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 20
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->level:Lcn/com/fmsh/util/log/Level;

    invoke-virtual {v0}, Lcn/com/fmsh/util/log/Level;->getId()I

    move-result v0

    sget-object v1, Lcn/com/fmsh/util/log/Level;->DEBUG:Lcn/com/fmsh/util/log/Level;

    invoke-virtual {v1}, Lcn/com/fmsh/util/log/Level;->getId()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 21
    const-string v0, "FMServiceImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->level:Lcn/com/fmsh/util/log/Level;

    invoke-virtual {v0}, Lcn/com/fmsh/util/log/Level;->getId()I

    move-result v0

    sget-object v1, Lcn/com/fmsh/util/log/Level;->ERROR:Lcn/com/fmsh/util/log/Level;

    invoke-virtual {v1}, Lcn/com/fmsh/util/log/Level;->getId()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 29
    const-string v0, "FMServiceImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    :cond_0
    return-void
.end method

.method public getShowLogFlag()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->showLogFlag:Z

    return v0
.end method

.method public getShowLogLevel()Lcn/com/fmsh/util/log/Level;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->level:Lcn/com/fmsh/util/log/Level;

    return-object v0
.end method

.method public info(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 42
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->level:Lcn/com/fmsh/util/log/Level;

    invoke-virtual {v0}, Lcn/com/fmsh/util/log/Level;->getId()I

    move-result v0

    sget-object v1, Lcn/com/fmsh/util/log/Level;->INFO:Lcn/com/fmsh/util/log/Level;

    invoke-virtual {v1}, Lcn/com/fmsh/util/log/Level;->getId()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 43
    const-string v0, "FMServiceImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    :cond_0
    return-void
.end method

.method public setShowLogFlag(Z)V
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->showLogFlag:Z

    .line 51
    return-void
.end method

.method public setShowLogLevel(Lcn/com/fmsh/util/log/Level;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->level:Lcn/com/fmsh/util/log/Level;

    .line 71
    return-void
.end method

.method public warn(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 56
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMLog4Android;->level:Lcn/com/fmsh/util/log/Level;

    invoke-virtual {v0}, Lcn/com/fmsh/util/log/Level;->getId()I

    move-result v0

    sget-object v1, Lcn/com/fmsh/util/log/Level;->WARNING:Lcn/com/fmsh/util/log/Level;

    invoke-virtual {v1}, Lcn/com/fmsh/util/log/Level;->getId()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 57
    const-string v0, "FMServiceImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :cond_0
    return-void
.end method
