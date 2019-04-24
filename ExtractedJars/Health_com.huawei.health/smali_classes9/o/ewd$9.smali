.class Lo/ewd$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewd;->m(I)[F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:[F

.field final synthetic d:I

.field final synthetic e:Lo/ewd;


# direct methods
.method constructor <init>(Lo/ewd;[FI)V
    .locals 0

    .line 973
    iput-object p1, p0, Lo/ewd$9;->e:Lo/ewd;

    iput-object p2, p0, Lo/ewd$9;->c:[F

    iput p3, p0, Lo/ewd$9;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 976
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_0

    .line 977
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "objData == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 978
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 979
    iget-object v0, p0, Lo/ewd$9;->e:Lo/ewd;

    const-class v1, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-static {v4, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-static {v0, v1}, Lo/ewd;->a(Lo/ewd;Lcom/huawei/hihealth/data/model/HiStressMetaData;)Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 980
    iget-object v0, p0, Lo/ewd$9;->e:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->e(Lo/ewd;)Lcom/huawei/hihealth/data/model/HiStressMetaData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_feature()Ljava/util/List;

    move-result-object v5

    .line 981
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x0

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 982
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x1

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 983
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x2

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 984
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x3

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 985
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x4

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    .line 986
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x5

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x5

    aput v1, v0, v2

    .line 987
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x6

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x6

    aput v1, v0, v2

    .line 988
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x7

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x7

    aput v1, v0, v2

    .line 989
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/16 v1, 0x8

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/16 v2, 0x8

    aput v1, v0, v2

    .line 990
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/16 v1, 0x9

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/16 v2, 0x9

    aput v1, v0, v2

    .line 991
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x0

    const/16 v2, 0xa

    aput v1, v0, v2

    .line 992
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x0

    const/16 v2, 0xb

    aput v1, v0, v2

    .line 993
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x0

    const/16 v2, 0xc

    aput v1, v0, v2

    .line 994
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/4 v1, 0x0

    const/16 v2, 0xd

    aput v1, v0, v2

    .line 996
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/high16 v1, 0x425c0000    # 55.0f

    const/16 v2, 0xe

    aput v1, v0, v2

    .line 997
    iget-object v0, p0, Lo/ewd$9;->c:[F

    const/high16 v1, 0x425c0000    # 55.0f

    const/16 v2, 0xf

    aput v1, v0, v2

    .line 999
    iget-object v0, p0, Lo/ewd$9;->c:[F

    iget-object v1, p0, Lo/ewd$9;->e:Lo/ewd;

    invoke-static {v1}, Lo/ewd;->e(Lo/ewd;)Lcom/huawei/hihealth/data/model/HiStressMetaData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v1

    int-to-float v1, v1

    const/16 v2, 0x10

    aput v1, v0, v2

    .line 1000
    iget-object v0, p0, Lo/ewd$9;->c:[F

    iget v1, p0, Lo/ewd$9;->d:I

    int-to-float v1, v1

    const/16 v2, 0x11

    aput v1, v0, v2

    .line 1001
    goto :goto_0

    .line 1002
    :cond_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No data from Datas !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1004
    :goto_0
    iget-object v0, p0, Lo/ewd$9;->e:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->g(Lo/ewd;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 1005
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "semaphore.release()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    return-void
.end method
