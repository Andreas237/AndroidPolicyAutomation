.class public Lo/cub;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[I

.field private static e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/4 v0, 0x0

    sput v0, Lo/cub;->e:I

    .line 31
    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/cub;->d:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7df
        0x7d8
        0x7d9
        0x7da
        0x7db
        0x7dc
        0x7dd
        0x7de
        0x7d7
        0x7d6
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Landroid/content/Context;II)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 105
    invoke-static {p0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->d(I)Ljava/util/List;

    move-result-object v4

    .line 106
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    :cond_0
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no clientIDs get , who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const/4 v0, 0x0

    return-object v0

    .line 110
    :cond_1
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientid list size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const/16 v0, 0x7d0

    if-ge v0, p2, :cond_2

    const/16 v0, 0x7e3

    if-le v0, p2, :cond_2

    .line 112
    invoke-static {p0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, p2, v1, v4}, Lo/cqg;->c(IILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 113
    :cond_2
    const/16 v0, 0x7e3

    if-gt v0, p2, :cond_3

    const/16 v0, 0x7e5

    if-lt v0, p2, :cond_3

    .line 114
    invoke-static {p0}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, p2, v1, v4}, Lo/cqh;->d(IILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 116
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method private static b(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 121
    invoke-static {p0, p1}, Lo/cui;->e(Landroid/content/Context;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 122
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v3

    .line 123
    const/16 v0, 0x7d0

    if-ge v0, v3, :cond_1

    const/16 v0, 0x7e3

    if-le v0, v3, :cond_1

    .line 124
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 125
    invoke-static {p0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/cqg;->a(J)I

    .line 126
    goto :goto_0

    :cond_0
    goto :goto_2

    .line 127
    :cond_1
    const/16 v0, 0x7e3

    if-gt v0, v3, :cond_2

    const/16 v0, 0x7e5

    if-lt v0, v3, :cond_2

    .line 128
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 129
    invoke-static {p0}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/cqh;->d(J)I

    .line 130
    goto :goto_1

    .line 132
    :cond_2
    :goto_2
    const/4 v0, 0x1

    return v0

    .line 134
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private static b(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Lo/cqg;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/cqg;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 138
    invoke-static {p0, p1}, Lo/cui;->e(Landroid/content/Context;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 139
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 140
    const/16 v0, 0x7d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    const/16 v0, 0x7ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    const/16 v0, 0x7f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    const/16 v0, 0x7e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    const/16 v0, 0x7e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    const/16 v0, 0x7e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    const/16 v0, 0x7e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    const/16 v0, 0x7f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    const/16 v0, 0x7ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    const/16 v0, 0x7ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    const/16 v0, 0x7eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    const/16 v0, 0x7ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    const/16 v0, 0x7ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    const/16 v0, 0x803

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    const/16 v0, 0x804

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    const/16 v0, 0x805

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    const/16 v0, 0x806

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    const/16 v0, 0x807

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    const/16 v0, 0x808

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    const/16 v0, 0x809

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    const/16 v0, 0x80a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    const/16 v0, 0x80b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 164
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    invoke-virtual {p3, v0, v3, v5}, Lo/cqg;->d(ILjava/util/List;Lcom/huawei/hihealth/HiHealthData;)Ljava/util/List;

    move-result-object v6

    .line 165
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 166
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 167
    invoke-static {p0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/cqg;->a(J)I

    .line 168
    goto :goto_1

    .line 170
    :cond_0
    invoke-static {p0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/cqg;->a(J)I

    .line 171
    goto :goto_0

    .line 172
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 174
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/Context;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 47
    const-string v0, "HiH_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delHealthData who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    sget-object v4, Lo/cub;->d:[I

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget v7, v4, v6

    .line 50
    invoke-static {p0, p1, v7}, Lo/cub;->b(Landroid/content/Context;II)Ljava/util/List;

    move-result-object v8

    .line 51
    if-eqz v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    :cond_0
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nothing need to del,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {p0, v8}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 57
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 58
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no recordMap get ! type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    goto :goto_1

    .line 62
    :cond_2
    invoke-static {p0, v9, v8}, Lo/cub;->b(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 63
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delHealthData OK ! type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 65
    :cond_3
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delHealthData failed ! type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 68
    :cond_4
    const-string v0, "HiH_HiDelCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delHealthData end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-void
.end method

.method public static e(Landroid/content/Context;ILo/cqg;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 73
    const-string v0, "HiH_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delWeightData who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v0, 0x0

    sput v0, Lo/cub;->e:I

    .line 76
    const/16 v4, 0x7d4

    .line 77
    :goto_0
    sget v0, Lo/cub;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 78
    invoke-static {p0, p1, v4}, Lo/cub;->b(Landroid/content/Context;II)Ljava/util/List;

    move-result-object v5

    .line 79
    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    :cond_0
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nothing need to del,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    const/4 v0, 0x0

    sput v0, Lo/cub;->e:I

    .line 82
    return-void

    .line 84
    :cond_1
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delWeightData getDelHealthData delData size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-static {p0, v5}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 86
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 87
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no recordMap get ! type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const/4 v0, 0x0

    sput v0, Lo/cub;->e:I

    .line 89
    return-void

    .line 91
    :cond_2
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delWeightData getDataDelConditon dataDelConditons size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    invoke-static {p0, v6, v5, p2}, Lo/cub;->b(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Lo/cqg;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 93
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delWeightData OK ! type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 95
    :cond_3
    sget v0, Lo/cub;->e:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lo/cub;->e:I

    .line 96
    const-string v0, "Debug_HiDelCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delWeightData failed ! type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    :goto_1
    goto/16 :goto_0

    .line 99
    :cond_4
    const/4 v0, 0x0

    sput v0, Lo/cub;->e:I

    .line 100
    const-string v0, "HiH_HiDelCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delWeightData end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    return-void
.end method
