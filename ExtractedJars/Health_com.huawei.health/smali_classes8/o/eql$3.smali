.class Lo/eql$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eql;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eql;


# direct methods
.method constructor <init>(Lo/eql;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/eql$3;->c:Lo/eql;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 18

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eql;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "----"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "it\'s done+errorCode"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    if-nez p2, :cond_7

    .line 112
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    .line 113
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->a(Lo/eql;)Lo/epx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 114
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->a(Lo/eql;)Lo/epx;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    invoke-virtual {v0, v1}, Lo/epx;->b(Lo/epx$c;)V

    .line 115
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->a(Lo/eql;)Lo/epx;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eql$3;->c:Lo/eql;

    iget-object v1, v1, Lo/eql;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_card_stress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx;->d(Ljava/lang/String;)V

    .line 117
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->d(Lo/eql;)Lo/eql$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/eql$a;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 118
    const/4 v0, 0x1

    iput v0, v7, Landroid/os/Message;->what:I

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->a(Lo/eql;)Lo/epx;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 120
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->d(Lo/eql;)Lo/eql$a;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eql$a;->sendMessage(Landroid/os/Message;)Z

    .line 122
    :cond_0
    return-void

    .line 124
    :cond_1
    move-object/from16 v7, p1

    check-cast v7, Landroid/util/SparseArray;

    .line 125
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 126
    invoke-static {}, Lo/eql;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "map.size() <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->a(Lo/eql;)Lo/epx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 128
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->a(Lo/eql;)Lo/epx;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    invoke-virtual {v0, v1}, Lo/epx;->b(Lo/epx$c;)V

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->a(Lo/eql;)Lo/epx;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eql$3;->c:Lo/eql;

    iget-object v1, v1, Lo/eql;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_card_stress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx;->d(Ljava/lang/String;)V

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->d(Lo/eql;)Lo/eql$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/eql$a;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 132
    const/4 v0, 0x1

    iput v0, v8, Landroid/os/Message;->what:I

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->a(Lo/eql;)Lo/epx;

    move-result-object v0

    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 134
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0}, Lo/eql;->d(Lo/eql;)Lo/eql$a;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/eql$a;->sendMessage(Landroid/os/Message;)Z

    .line 136
    :cond_2
    return-void

    .line 140
    :cond_3
    const/16 v0, 0x7f2

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 141
    move-object v8, v9

    check-cast v8, Ljava/util/List;

    .line 144
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 145
    const/4 v0, 0x0

    if-ne v0, v10, :cond_4

    .line 146
    invoke-static {}, Lo/eql;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    return-void

    .line 150
    :cond_4
    const/4 v11, 0x0

    .line 151
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 152
    invoke-virtual {v12}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_start_time()J

    move-result-wide v13

    .line 153
    invoke-virtual {v12}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_measure_type()I

    move-result v15

    .line 154
    invoke-static {}, Lo/eql;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "measureType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    if-eqz v15, :cond_5

    const/4 v0, 0x2

    if-ne v15, v0, :cond_6

    .line 160
    :cond_5
    invoke-virtual {v12}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v11

    .line 161
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eql$3;->c:Lo/eql;

    invoke-static {v0, v13, v14, v11}, Lo/eql;->a(Lo/eql;JI)V

    goto :goto_0

    .line 163
    :cond_6
    const-wide/32 v0, 0x927c0

    sub-long v16, v13, v0

    .line 164
    invoke-static {}, Lo/eql;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    move-wide/from16 v4, v16

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " modifiedTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v13, v14}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    div-long v1, v16, v1

    const-wide/16 v3, 0x3e8

    div-long v3, v13, v3

    new-instance v5, Lo/eql$3$1;

    move-object/from16 v6, p0

    invoke-direct {v5, v6}, Lo/eql$3$1;-><init>(Lo/eql$3;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgx;->e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 194
    :cond_7
    :goto_0
    return-void
.end method
