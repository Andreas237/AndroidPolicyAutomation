.class final Lo/fkb$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fkb;->e(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 377
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hihealth/data/model/HiStressMetaData;Lcom/huawei/hihealth/data/model/HiStressMetaData;)I
    .locals 5

    .line 380
    invoke-virtual {p1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_end_time()J

    move-result-wide v1

    .line 381
    invoke-virtual {p2}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_end_time()J

    move-result-wide v3

    .line 382
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 377
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    move-object v1, p2

    check-cast v1, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {p0, v0, v1}, Lo/fkb$5;->a(Lcom/huawei/hihealth/data/model/HiStressMetaData;Lcom/huawei/hihealth/data/model/HiStressMetaData;)I

    move-result v0

    return v0
.end method
