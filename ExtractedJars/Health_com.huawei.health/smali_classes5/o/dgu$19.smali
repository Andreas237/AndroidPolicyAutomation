.class Lo/dgu$19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dgu;


# direct methods
.method constructor <init>(Lo/dgu;)V
    .locals 0

    .line 1815
    iput-object p1, p0, Lo/dgu$19;->c:Lo/dgu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 1818
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MigrateHeartZoneConf enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1819
    iget-object v0, p0, Lo/dgu$19;->c:Lo/dgu;

    invoke-virtual {v0}, Lo/dgu;->w()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 1820
    new-instance v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v0

    invoke-direct {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>(I)V

    .line 1823
    const/4 v6, 0x0

    .line 1824
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Classify_Method"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 1825
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 1827
    :try_start_0
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 1828
    iget-object v0, p0, Lo/dgu$19;->c:Lo/dgu;

    invoke-virtual {v0, v6}, Lo/dgu;->a(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1831
    goto :goto_0

    .line 1829
    :catch_0
    move-exception v8

    .line 1830
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse UserPreference value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1834
    :cond_0
    :goto_0
    const/16 v8, 0x3c

    .line 1835
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_Rest_HeartRate"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v9

    .line 1836
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 1838
    :try_start_1
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 1839
    iget-object v0, p0, Lo/dgu$19;->c:Lo/dgu;

    invoke-virtual {v0, v8}, Lo/dgu;->d(I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1842
    goto :goto_1

    .line 1840
    :catch_1
    move-exception v10

    .line 1841
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse RestHeartRate value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1845
    :cond_1
    :goto_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v10

    .line 1846
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 1847
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 1848
    array-length v0, v11

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 1849
    iget-object v0, p0, Lo/dgu$19;->c:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v11, v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setThreshold(Ljava/lang/String;)V

    .line 1850
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartZoneConf "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1851
    iget-object v0, p0, Lo/dgu$19;->c:Lo/dgu;

    iget-object v1, p0, Lo/dgu$19;->c:Lo/dgu;

    invoke-static {v1}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dgu;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 1855
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HRRHeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v11

    .line 1856
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    .line 1857
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 1858
    array-length v0, v12

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 1859
    iget-object v0, p0, Lo/dgu$19;->c:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v12, v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRThreshold(Ljava/lang/String;)V

    .line 1860
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartZoneConf "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1861
    iget-object v0, p0, Lo/dgu$19;->c:Lo/dgu;

    iget-object v1, p0, Lo/dgu$19;->c:Lo/dgu;

    invoke-static {v1}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dgu;->d(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 1865
    :cond_3
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MigrateHeartZoneConf exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1866
    return-void
.end method
