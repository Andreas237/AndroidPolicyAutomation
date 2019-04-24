.class public Lo/crk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crk$a;
    }
.end annotation


# instance fields
.field private c:Lo/cpv;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {p1}, Lo/cpv;->c(Landroid/content/Context;)Lo/cpv;

    move-result-object v0

    iput-object v0, p0, Lo/crk;->c:Lo/cpv;

    .line 29
    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lo/crk;->c:Lo/cpv;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/cpv;->c(JJLjava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 34
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 35
    :cond_0
    iget-object v0, p0, Lo/crk;->c:Lo/cpv;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/cpv;->d(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v7

    .line 36
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 41
    :cond_2
    const/4 v7, 0x1

    .line 42
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 44
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    if-eq v0, p2, :cond_3

    .line 45
    goto :goto_1

    .line 47
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 48
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 49
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 50
    const/4 v7, 0x0

    .line 51
    .line 54
    :cond_4
    if-eqz v7, :cond_5

    .line 55
    invoke-virtual {p1, p2}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 56
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 57
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    :cond_5
    new-instance v0, Lo/crk$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crk$a;-><init>(Lo/crk$4;)V

    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 62
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 63
    iget-object v0, p0, Lo/crk;->c:Lo/cpv;

    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v1, v2}, Lo/cpv;->a(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v9

    .line 65
    const/4 v11, 0x1

    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_7

    .line 66
    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 67
    const-string v0, "merged"

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_6

    .line 68
    iget-object v0, p0, Lo/crk;->c:Lo/cpv;

    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v12, v1, v2}, Lo/cpv;->a(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v10

    .line 69
    if-nez v10, :cond_6

    .line 70
    const/4 v9, 0x0

    .line 65
    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 74
    :cond_7
    return v9
.end method
