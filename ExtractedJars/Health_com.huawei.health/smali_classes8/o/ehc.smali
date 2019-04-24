.class public abstract Lo/ehc;
.super Lo/ehl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/ehl<Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;Lo/ehv;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lo/ehl;-><init>(Landroid/content/Context;)V

    .line 33
    return-void
.end method


# virtual methods
.method protected a(Lo/ehv;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehv;Lo/eic;Lo/ehe$a;)Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;"
        }
    .end annotation

    .line 37
    invoke-virtual {p0, p1, p3}, Lo/ehc;->d(Lo/ehv;Lo/ehe$a;)Lo/eii;

    move-result-object v0

    return-object v0
.end method

.method public a(Lo/ehv;Lo/eii;)V
    .locals 4

    .line 157
    if-nez p1, :cond_0

    .line 158
    return-void

    .line 160
    :cond_0
    invoke-virtual {p1}, Lo/ehv;->getData()Lo/ma;

    move-result-object v2

    .line 161
    if-nez v2, :cond_1

    .line 162
    return-void

    .line 165
    :cond_1
    instance-of v0, p2, Lo/ehn;

    if-eqz v0, :cond_2

    .line 166
    move-object v0, p2

    check-cast v0, Lo/ehn;

    invoke-virtual {p1, v0}, Lo/ehv;->b(Lo/ehn;)V

    .line 167
    invoke-virtual {p1}, Lo/ehv;->aa()Lo/eih$h;

    move-result-object v3

    .line 168
    invoke-interface {v3, p2}, Lo/eih$h;->e(Lo/eii;)V

    .line 169
    invoke-virtual {p1}, Lo/ehv;->c()V

    .line 170
    return-void

    .line 173
    :cond_2
    instance-of v0, p2, Lo/elb;

    if-eqz v0, :cond_3

    .line 174
    invoke-virtual {p1}, Lo/ehv;->D()V

    .line 175
    invoke-virtual {p1}, Lo/ehv;->aa()Lo/eih$h;

    move-result-object v3

    .line 176
    invoke-interface {v3, p2}, Lo/eih$h;->e(Lo/eii;)V

    .line 177
    invoke-virtual {p1}, Lo/ehv;->c()V

    .line 178
    return-void

    .line 181
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "rmDataLayer unrecognized dataSet,logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected synthetic a(Lo/eih;Lo/eii;)V
    .locals 1

    .line 30
    move-object v0, p1

    check-cast v0, Lo/ehv;

    invoke-virtual {p0, v0, p2}, Lo/ehc;->d(Lo/ehv;Lo/eii;)V

    return-void
.end method

.method protected b(Lo/ehe$a;)Lo/eii;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehe$a;)Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;"
        }
    .end annotation

    .line 42
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lo/ehc;->d(Lo/ehv;Lo/ehe$a;)Lo/eii;

    move-result-object v0

    return-object v0
.end method

.method protected b(Lo/ehv;)V
    .locals 3

    .line 127
    invoke-virtual {p1}, Lo/ehv;->getData()Lo/ma;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eia;

    .line 128
    if-nez v2, :cond_0

    .line 129
    new-instance v2, Lo/eia;

    invoke-direct {v2}, Lo/eia;-><init>()V

    .line 130
    new-instance v0, Lo/ehq;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1}, Lo/ehq;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v0}, Lo/eia;->d(Lo/ehq;)V

    .line 131
    new-instance v0, Lo/ela;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1}, Lo/ela;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v0}, Lo/eia;->d(Lo/ela;)V

    .line 132
    invoke-virtual {p1, v2}, Lo/ehv;->setData(Lo/eia;)V

    .line 134
    :cond_0
    return-void
.end method

.method protected synthetic c(Lo/eih;)V
    .locals 1

    .line 30
    move-object v0, p1

    check-cast v0, Lo/ehv;

    invoke-virtual {p0, v0}, Lo/ehc;->b(Lo/ehv;)V

    return-void
.end method

.method public synthetic c(Lo/eih;Lo/eii;)V
    .locals 1

    .line 30
    move-object v0, p1

    check-cast v0, Lo/ehv;

    invoke-virtual {p0, v0, p2}, Lo/ehc;->a(Lo/ehv;Lo/eii;)V

    return-void
.end method

.method public d(Lo/ehv;Lo/ehe$a;)Lo/eii;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehv;Lo/ehe$a;)Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;"
        }
    .end annotation

    .line 46
    const/4 v6, 0x0

    .line 48
    iget-object v7, p2, Lo/ehe$a;->c:Lo/eic;

    .line 49
    const-string v0, "normal_hr"

    iget-object v1, p2, Lo/ehe$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 50
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 51
    new-instance v0, Lo/eht;

    move-object v1, v8

    invoke-virtual {p0, v7}, Lo/ehc;->d(Lo/eic;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v7}, Lo/ehc;->c(Lo/eic;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v7}, Lo/ehc;->e(Lo/eic;)Ljava/lang/String;

    move-result-object v4

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/eht;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eic;)V

    move-object v9, v0

    .line 54
    const/16 v0, 0xff

    const/16 v1, 0xfd

    const/16 v2, 0x98

    const/16 v3, 0xac

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/ehn;->c(I)V

    .line 57
    const/16 v0, 0xff

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/ehn;->g(I)V

    .line 59
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v9, v0, v1}, Lo/ehn;->d(IZ)V

    .line 61
    if-eqz p1, :cond_1

    .line 62
    invoke-virtual {p1}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v10

    .line 63
    if-nez v10, :cond_0

    .line 64
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "build bar data,find null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_0
    invoke-virtual {v10, v7}, Lo/ehq;->c(Lo/eic;)V

    .line 69
    :cond_1
    move-object v6, v9

    .line 70
    goto/16 :goto_0

    :cond_2
    const-string v0, "rest_hr"

    iget-object v1, p2, Lo/ehe$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 72
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 73
    new-instance v0, Lo/elb;

    iget-object v1, p0, Lo/ehc;->e:Landroid/content/Context;

    move-object v2, v8

    .line 74
    invoke-virtual {p0, v7}, Lo/ehc;->d(Lo/eic;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v7}, Lo/ehc;->c(Lo/eic;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v7}, Lo/ehc;->e(Lo/eic;)Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v9, v0

    .line 76
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v9, v0, v1}, Lo/elb;->a(IZ)V

    .line 77
    const/16 v0, 0xff

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/elb;->c(I)V

    .line 78
    new-instance v0, Lo/ehc$2;

    invoke-direct {v0, p0}, Lo/ehc$2;-><init>(Lo/ehc;)V

    invoke-virtual {v9, v0}, Lo/elb;->d(Lo/elb$c;)V

    .line 95
    move-object v6, v9

    .line 96
    goto/16 :goto_0

    :cond_3
    const-string v0, "warning_hr"

    iget-object v1, p2, Lo/ehe$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 97
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 98
    invoke-virtual {p0, v7}, Lo/ehc;->d(Lo/eic;)Ljava/lang/String;

    move-result-object v9

    .line 100
    const-string v9, "warning_hr"

    .line 101
    new-instance v0, Lo/eht;

    move-object v1, v8

    move-object v2, v9

    invoke-virtual {p0, v7}, Lo/ehc;->c(Lo/eic;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v7}, Lo/ehc;->e(Lo/eic;)Ljava/lang/String;

    move-result-object v4

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/eht;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eic;)V

    move-object v10, v0

    .line 104
    const/16 v0, 0xff

    const/16 v1, 0xfd

    const/16 v2, 0x98

    const/16 v3, 0xac

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v10, v0}, Lo/ehn;->c(I)V

    .line 107
    const/16 v0, 0xff

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v10, v0}, Lo/ehn;->g(I)V

    .line 109
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v10, v0, v1}, Lo/ehn;->d(IZ)V

    .line 111
    if-eqz p1, :cond_5

    .line 112
    invoke-virtual {p1}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v11

    .line 113
    if-nez v11, :cond_4

    .line 114
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "build bar data,find null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :cond_4
    invoke-virtual {v11, v7}, Lo/ehq;->c(Lo/eic;)V

    .line 119
    :cond_5
    move-object v6, v10

    .line 122
    :cond_6
    :goto_0
    return-object v6
.end method

.method protected d(Lo/ehv;Lo/eii;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehv;Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;)V"
        }
    .end annotation

    .line 139
    if-nez p1, :cond_0

    .line 140
    return-void

    .line 142
    :cond_0
    invoke-virtual {p1}, Lo/ehv;->getData()Lo/ma;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eia;

    .line 143
    if-nez v2, :cond_1

    .line 144
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "addDataSet method found data null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 146
    :cond_1
    instance-of v0, p2, Lo/ehn;

    if-eqz v0, :cond_2

    .line 147
    invoke-virtual {v2}, Lo/eia;->l()Lo/ehq;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lo/ejm;

    invoke-virtual {v0, v1}, Lo/ehq;->a(Lo/mz;)V

    goto :goto_0

    .line 148
    :cond_2
    instance-of v0, p2, Lo/elb;

    if-eqz v0, :cond_3

    .line 149
    invoke-virtual {v2}, Lo/eia;->p()Lo/ela;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lo/ekz;

    invoke-virtual {v0, v1}, Lo/ela;->a(Lo/mz;)V

    .line 152
    :cond_3
    :goto_0
    return-void
.end method

.method protected synthetic e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 30
    move-object v0, p1

    check-cast v0, Lo/ehv;

    invoke-virtual {p0, v0, p2, p3}, Lo/ehc;->a(Lo/ehv;Lo/eic;Lo/ehe$a;)Lo/eii;

    move-result-object v0

    return-object v0
.end method
