.class Lo/eql$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eql$3;->d(Ljava/lang/Object;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eql$3;


# direct methods
.method constructor <init>(Lo/eql$3;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lo/eql$3$1;->c:Lo/eql$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 12

    .line 168
    if-nez p1, :cond_4

    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    .line 169
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 170
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 171
    invoke-static {}, Lo/eql;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    if-gtz v5, :cond_0

    .line 173
    return-void

    .line 175
    :cond_0
    iget-object v0, p0, Lo/eql$3$1;->c:Lo/eql$3;

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0, v4}, Lo/eql;->c(Lo/eql;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 176
    iget-object v0, p0, Lo/eql$3$1;->c:Lo/eql$3;

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_start_time()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/eql;->a(Lo/eql;JI)V

    .line 177
    return-void

    .line 180
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 181
    invoke-virtual {v7}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_measure_type()I

    move-result v8

    .line 182
    if-eqz v8, :cond_2

    const/4 v0, 0x2

    if-ne v8, v0, :cond_3

    .line 183
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v9

    .line 184
    invoke-virtual {v7}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_start_time()J

    move-result-wide v10

    .line 185
    iget-object v0, p0, Lo/eql$3$1;->c:Lo/eql$3;

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0, v10, v11, v9}, Lo/eql;->a(Lo/eql;JI)V

    .line 186
    goto :goto_1

    .line 188
    :cond_3
    goto :goto_0

    .line 190
    :cond_4
    :goto_1
    return-void
.end method
