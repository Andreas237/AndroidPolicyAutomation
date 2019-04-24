.class public Lo/csf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/csf$b;
    }
.end annotation


# static fields
.field private static c:Landroid/content/Context;


# instance fields
.field private b:Lo/cqe;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqe;->b(Landroid/content/Context;)Lo/cqe;

    move-result-object v0

    iput-object v0, p0, Lo/csf;->b:Lo/cqe;

    .line 33
    return-void
.end method

.method synthetic constructor <init>(Lo/csf$5;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/csf;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/csf;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 44
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/csf;->c:Landroid/content/Context;

    .line 45
    sget-object v0, Lo/csf$b;->c:Lo/csf;

    return-object v0
.end method

.method private d(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 94
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cuy;->e(Landroid/content/Context;I)I

    move-result v1

    .line 95
    const/4 v2, 0x4

    .line 96
    :goto_0
    if-ge v1, v2, :cond_0

    .line 97
    packed-switch v1, :pswitch_data_0

    goto :goto_1

    .line 99
    :pswitch_0
    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, v0}, Lo/csf;->d(ILjava/util/List;I)V

    .line 100
    goto :goto_1

    .line 102
    :pswitch_1
    const/4 v0, 0x3

    invoke-direct {p0, p1, p2, v0}, Lo/csf;->e(ILjava/util/List;I)V

    .line 103
    goto :goto_1

    .line 105
    :pswitch_2
    const/4 v0, 0x4

    invoke-direct {p0, p1, v0}, Lo/csf;->e(II)V

    .line 106
    .line 110
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 112
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(ILjava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 115
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData upgradeOne start..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    new-instance v7, Lo/crx;

    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-direct {v7, v0}, Lo/crx;-><init>(Landroid/content/Context;)V

    .line 117
    move-object v0, v7

    move v1, p1

    move-object v2, p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v3, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/crx;->c(ILjava/util/List;JJ)V

    .line 118
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0, p1, p3}, Lo/cuy;->d(Landroid/content/Context;II)V

    .line 119
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData upgradeOne end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-void
.end method

.method private e(II)V
    .locals 4

    .line 140
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData upgradeThree start..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    invoke-static {}, Lo/cuj;->a()Lo/cuj;

    move-result-object v0

    sget-object v1, Lo/csf;->c:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lo/cuj;->a(Landroid/content/Context;I)V

    .line 142
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lo/cuy;->d(Landroid/content/Context;II)V

    .line 143
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData upgradeThree end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return-void
.end method

.method private e(ILjava/util/List;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 123
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData upgradeTwo start..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-static {}, Lo/cuj;->a()Lo/cuj;

    move-result-object v0

    sget-object v1, Lo/csf;->c:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lo/cuj;->a(Landroid/content/Context;I)V

    .line 127
    iget-object v0, p0, Lo/csf;->b:Lo/cqe;

    move-object v1, p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v2, 0x0

    const/16 v6, 0x7531

    invoke-virtual/range {v0 .. v6}, Lo/cqe;->a(Ljava/util/List;JJI)Ljava/util/List;

    move-result-object v7

    .line 128
    invoke-static {v7}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 129
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 130
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 129
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 132
    :cond_0
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/crf;->c(Ljava/util/List;)V

    .line 133
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 135
    :cond_1
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0, p1, p3}, Lo/cuy;->d(Landroid/content/Context;II)V

    .line 136
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData upgradeTwo end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    return-void
.end method


# virtual methods
.method public e()V
    .locals 15

    .line 49
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cnw;->a(Landroid/content/Context;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->d()I

    move-result v7

    .line 50
    if-gtz v7, :cond_0

    .line 51
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData() userID <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    return-void

    .line 54
    :cond_0
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v8

    .line 55
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    :cond_1
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData() clients is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    return-void

    .line 60
    :cond_2
    invoke-direct {p0, v7, v8}, Lo/csf;->d(ILjava/util/List;)V

    .line 62
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cuy;->c(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 64
    :try_start_0
    iget-object v0, p0, Lo/csf;->b:Lo/cqe;

    move-object v1, v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v2, 0x0

    const/16 v6, 0x7531

    invoke-virtual/range {v0 .. v6}, Lo/cqe;->a(Ljava/util/List;JJI)Ljava/util/List;

    move-result-object v9

    .line 65
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 66
    :cond_3
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData sequenceMetaDatas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cuy;->d(Landroid/content/Context;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    return-void

    .line 70
    :cond_4
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData sequenceMetaDatas size is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const/4 v10, 0x0

    .line 72
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 73
    invoke-virtual {v12, v7}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 74
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v13

    .line 75
    if-ne v10, v13, :cond_5

    .line 76
    goto :goto_0

    .line 78
    :cond_5
    new-instance v14, Lo/csh;

    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-direct {v14, v0}, Lo/csh;-><init>(Landroid/content/Context;)V

    .line 79
    invoke-virtual {v14, v12}, Lo/csh;->d(Lcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 80
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cuy;->d(Landroid/content/Context;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    return-void

    .line 83
    :cond_6
    move v10, v13

    .line 84
    goto :goto_0

    .line 85
    :cond_7
    :try_start_2
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cuy;->d(Landroid/content/Context;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 89
    goto :goto_1

    .line 86
    :catch_0
    move-exception v9

    .line 87
    const-string v0, "HiH_StatDBOldData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldData exception e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    sget-object v0, Lo/csf;->c:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cuy;->d(Landroid/content/Context;I)V

    .line 91
    :cond_8
    :goto_1
    return-void
.end method
