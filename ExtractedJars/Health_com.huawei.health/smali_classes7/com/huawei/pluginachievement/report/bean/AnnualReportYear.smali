.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportYear;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private report2018:Lcom/huawei/pluginachievement/report/bean/AnnualReport;

.field private resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getReport2018()Lcom/huawei/pluginachievement/report/bean/AnnualReport;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportYear;->report2018:Lcom/huawei/pluginachievement/report/bean/AnnualReport;

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportYear;->resultCode:I

    return v0
.end method

.method public setReport2018(Lcom/huawei/pluginachievement/report/bean/AnnualReport;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportYear;->report2018:Lcom/huawei/pluginachievement/report/bean/AnnualReport;

    .line 24
    return-void
.end method

.method public setResultCode(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportYear;->resultCode:I

    .line 32
    return-void
.end method
