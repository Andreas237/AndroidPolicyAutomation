.class public Lcom/huawei/common/applog/AppLogApi$Param;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/common/applog/AppLogApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private fileMaxNum:I

.field private isHttpProtocol:Z

.field private isShutdown_Immediate:Z

.field private logLevel:I

.field private logWritePath:Ljava/lang/String;

.field private perFileSize:I

.field private reportCycle:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 895
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 896
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->logLevel:I

    .line 900
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->perFileSize:I

    .line 903
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->fileMaxNum:I

    .line 906
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->logWritePath:Ljava/lang/String;

    .line 909
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->isShutdown_Immediate:Z

    .line 912
    const/16 v0, 0x28

    iput v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->reportCycle:I

    .line 915
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->isHttpProtocol:Z

    return-void
.end method


# virtual methods
.method public getHttpProtocol()Z
    .locals 1

    .line 937
    iget-boolean v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->isHttpProtocol:Z

    return v0
.end method

.method public getLogFileMaxnum()I
    .locals 1

    .line 999
    iget v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->fileMaxNum:I

    return v0
.end method

.method public getLogLevel()I
    .locals 1

    .line 987
    iget v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->logLevel:I

    return v0
.end method

.method public getLogWritePath()Ljava/lang/String;
    .locals 1

    .line 995
    iget-object v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->logWritePath:Ljava/lang/String;

    return-object v0
.end method

.method public getPerFileSize()I
    .locals 1

    .line 991
    iget v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->perFileSize:I

    return v0
.end method

.method public getReportCycle()I
    .locals 1

    .line 1003
    iget v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->reportCycle:I

    return v0
.end method

.method public getShutdown_Immediate()Z
    .locals 1

    .line 1007
    iget-boolean v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->isShutdown_Immediate:Z

    return v0
.end method

.method public isHttpProtocol()Z
    .locals 1

    .line 918
    iget-boolean v0, p0, Lcom/huawei/common/applog/AppLogApi$Param;->isHttpProtocol:Z

    return v0
.end method

.method public setHttpProtocol(Z)V
    .locals 0

    .line 941
    iput-boolean p1, p0, Lcom/huawei/common/applog/AppLogApi$Param;->isHttpProtocol:Z

    .line 942
    return-void
.end method

.method public setLogFileMaxnum(I)Lcom/huawei/common/applog/AppLogApi$Param;
    .locals 0

    .line 972
    iput p1, p0, Lcom/huawei/common/applog/AppLogApi$Param;->fileMaxNum:I

    .line 973
    return-object p0
.end method

.method public setLogLevel(I)Lcom/huawei/common/applog/AppLogApi$Param;
    .locals 0

    .line 932
    iput p1, p0, Lcom/huawei/common/applog/AppLogApi$Param;->logLevel:I

    .line 933
    return-object p0
.end method

.method public setLogWritePath(Ljava/lang/String;)Lcom/huawei/common/applog/AppLogApi$Param;
    .locals 0

    .line 962
    iput-object p1, p0, Lcom/huawei/common/applog/AppLogApi$Param;->logWritePath:Ljava/lang/String;

    .line 963
    return-object p0
.end method

.method public setPerFileSize(I)Lcom/huawei/common/applog/AppLogApi$Param;
    .locals 0

    .line 952
    iput p1, p0, Lcom/huawei/common/applog/AppLogApi$Param;->perFileSize:I

    .line 953
    return-object p0
.end method

.method public setReportCycle(I)V
    .locals 0

    .line 1011
    iput p1, p0, Lcom/huawei/common/applog/AppLogApi$Param;->reportCycle:I

    .line 1012
    return-void
.end method

.method public setShutdown_Immediate(Z)Lcom/huawei/common/applog/AppLogApi$Param;
    .locals 0

    .line 982
    iput-boolean p1, p0, Lcom/huawei/common/applog/AppLogApi$Param;->isShutdown_Immediate:Z

    .line 983
    return-object p0
.end method
