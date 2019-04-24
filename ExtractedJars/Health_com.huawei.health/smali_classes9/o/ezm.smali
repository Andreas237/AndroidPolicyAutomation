.class public Lo/ezm;
.super Lo/ezg;
.source "SourceFile"

# interfaces
.implements Lo/ezt;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ezm$d;,
        Lo/ezm$a;,
        Lo/ezm$e;,
        Lo/ezm$c;,
        Lo/ezm$b;
    }
.end annotation


# instance fields
.field private a:Lo/ezm$c;

.field private b:Lo/ezx;

.field private c:Lo/eyv;

.field private d:Lo/eyv;

.field private e:Lo/ezm$e;

.field private g:Landroid/os/Handler;

.field private h:Lo/ezm$a;

.field private k:Lo/ezm$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 90
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ezg;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm;->c:Lo/eyv;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm;->d:Lo/eyv;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm;->b:Lo/ezx;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm;->a:Lo/ezm$c;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm;->e:Lo/ezm$e;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm;->k:Lo/ezm$d;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm;->h:Lo/ezm$a;

    .line 76
    new-instance v0, Lo/ezm$3;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/ezm$3;-><init>(Lo/ezm;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/ezm;->g:Landroid/os/Handler;

    .line 91
    new-instance v0, Lo/ezm$e;

    invoke-virtual {p0}, Lo/ezm;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ezm$e;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ezm;->e:Lo/ezm$e;

    .line 92
    new-instance v0, Lo/ezm$d;

    invoke-virtual {p0}, Lo/ezm;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ezm$d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ezm;->k:Lo/ezm$d;

    .line 93
    new-instance v0, Lo/ezm$a;

    invoke-virtual {p0}, Lo/ezm;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ezm$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ezm;->h:Lo/ezm$a;

    .line 94
    return-void
.end method

.method static synthetic a(Lo/ezm;)Lo/ezm$e;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/ezm;->e:Lo/ezm$e;

    return-object v0
.end method

.method private a(Lo/eih;)V
    .locals 7

    .line 126
    iget-object v0, p0, Lo/ezm;->c:Lo/eyv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ezm;->d:Lo/eyv;

    if-nez v0, :cond_1

    .line 127
    :cond_0
    const-string v0, "--"

    invoke-virtual {p0, v0}, Lo/ezm;->setContentText(Ljava/lang/String;)V

    .line 128
    return-void

    .line 131
    :cond_1
    iget-object v0, p0, Lo/ezm;->c:Lo/eyv;

    iget-object v1, p0, Lo/ezm;->f:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/eyv;->a(Lo/eih;Lo/eic;)F

    move-result v5

    .line 132
    iget-object v0, p0, Lo/ezm;->d:Lo/eyv;

    iget-object v1, p0, Lo/ezm;->f:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/eyv;->a(Lo/eih;Lo/eic;)F

    move-result v6

    .line 134
    cmpl-float v0, v5, v6

    if-ltz v0, :cond_2

    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_2

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v1, v6

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    float-to-double v1, v5

    .line 137
    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 135
    invoke-virtual {p0, v0}, Lo/ezm;->setContentText(Ljava/lang/String;)V

    goto :goto_0

    .line 139
    :cond_2
    const-string v0, "--"

    invoke-virtual {p0, v0}, Lo/ezm;->setContentText(Ljava/lang/String;)V

    .line 141
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/ezm;Lo/eih;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lo/ezm;->d(Lo/eih;)V

    return-void
.end method

.method static synthetic b(Lo/ezm;)Lo/ezm$a;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/ezm;->h:Lo/ezm$a;

    return-object v0
.end method

.method private b(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;)V"
        }
    .end annotation

    .line 223
    iget-object v0, p0, Lo/ezm;->a:Lo/ezm$c;

    if-eqz v0, :cond_5

    .line 224
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 226
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 227
    move-object v7, v6

    check-cast v7, Lo/ejt;

    .line 228
    invoke-interface {v7}, Lo/ejt;->acquireModel()Lo/ejp;

    move-result-object v8

    .line 230
    instance-of v0, v8, Lo/eju;

    if-nez v0, :cond_1

    .line 231
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "storageModel not instance of StorageGenericModel,logic error"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 233
    :cond_1
    move-object v9, v8

    check-cast v9, Lo/eju;

    .line 235
    const-string v0, "HR_WARNING_DETAIL"

    .line 236
    invoke-virtual {v9, v0}, Lo/eju;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    .line 238
    if-eqz v10, :cond_0

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 239
    goto :goto_0

    .line 242
    :cond_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 243
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "details on one pint size not zero,warning!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/ewf$e;

    .line 248
    new-instance v12, Lo/eib;

    invoke-direct {v12}, Lo/eib;-><init>()V

    .line 249
    iget-wide v0, v11, Lo/ewf$e;->a:J

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    int-to-float v0, v0

    iput v0, v12, Lo/eib;->a:F

    .line 250
    iget-wide v0, v11, Lo/ewf$e;->d:J

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    int-to-float v0, v0

    iput v0, v12, Lo/eib;->b:F

    .line 251
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    goto/16 :goto_0

    .line 254
    :cond_4
    iget-object v0, p0, Lo/ezm;->a:Lo/ezm$c;

    invoke-interface {v0, v4}, Lo/ezm$c;->d(Ljava/util/List;)V

    .line 256
    :cond_5
    return-void
.end method

.method static synthetic b(Lo/ezm;Ljava/util/List;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lo/ezm;->b(Ljava/util/List;)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;)V"
        }
    .end annotation

    .line 176
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 178
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 179
    move-object v9, v8

    check-cast v9, Lo/ejt;

    .line 180
    invoke-interface {v9}, Lo/ejt;->acquireModel()Lo/ejp;

    move-result-object v10

    .line 182
    instance-of v0, v10, Lo/eju;

    if-nez v0, :cond_0

    .line 183
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "storageModel not instance of StorageGenericModel,logic error"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 185
    :cond_0
    move-object v11, v10

    check-cast v11, Lo/eju;

    .line 187
    const-string v0, "HR_WARNING_DETAIL"

    invoke-virtual {v11, v0}, Lo/eju;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    .line 189
    if-nez v12, :cond_1

    .line 190
    goto :goto_0

    .line 193
    :cond_1
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 194
    if-nez v14, :cond_2

    .line 195
    goto :goto_1

    .line 197
    :cond_2
    move-object v15, v14

    check-cast v15, Lo/ewf$e;

    .line 198
    new-instance v0, Lo/fbb$e;

    .line 199
    invoke-virtual/range {p0 .. p0}, Lo/ezm;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-wide v2, v15, Lo/ewf$e;->a:J

    iget-wide v4, v15, Lo/ewf$e;->d:J

    invoke-direct/range {v0 .. v5}, Lo/fbb$e;-><init>(Landroid/content/Context;JJ)V

    move-object/from16 v16, v0

    .line 203
    iget v0, v15, Lo/ewf$e;->e:I

    int-to-float v0, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/fbb$e;->c(F)V

    .line 204
    iget v0, v15, Lo/ewf$e;->c:I

    int-to-float v0, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/fbb$e;->b(F)V

    .line 207
    move-object/from16 v0, v16

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    goto :goto_1

    .line 209
    :cond_3
    goto/16 :goto_0

    .line 210
    :cond_4
    new-instance v0, Lo/ezm$4;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/ezm$4;-><init>(Lo/ezm;)V

    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ezm;->k:Lo/ezm$d;

    invoke-virtual {v0, v6}, Lo/ezm$d;->c(Ljava/util/List;)V

    .line 220
    return-void
.end method

.method private d(Lo/eih;)V
    .locals 3

    .line 144
    iget-object v0, p0, Lo/ezm;->b:Lo/ezx;

    if-nez v0, :cond_0

    .line 145
    return-void

    .line 148
    :cond_0
    iget-object v0, p0, Lo/ezm;->b:Lo/ezx;

    iget-object v1, p0, Lo/ezm;->f:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    new-instance v2, Lo/ezm$5;

    invoke-direct {v2, p0}, Lo/ezm$5;-><init>(Lo/ezm;)V

    invoke-interface {v0, p1, v1, v2}, Lo/ezx;->d(Lo/eih;Lo/eic;Lo/ejv;)V

    .line 172
    return-void
.end method

.method static synthetic e(Lo/ezm;)Lo/ezm$d;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/ezm;->k:Lo/ezm$d;

    return-object v0
.end method

.method static synthetic e(Lo/ezm;Ljava/util/List;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lo/ezm;->c(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a(Lo/eih;II)V
    .locals 4

    .line 98
    invoke-direct {p0, p1}, Lo/ezm;->a(Lo/eih;)V

    .line 101
    iget-object v0, p0, Lo/ezm;->g:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lo/ezm;->g:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 105
    :cond_0
    iget-object v0, p0, Lo/ezm;->g:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 106
    new-instance v0, Lo/ezm$b;

    invoke-direct {v0, p1, p2, p3}, Lo/ezm$b;-><init>(Lo/eih;II)V

    iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 107
    iget-object v0, p0, Lo/ezm;->g:Landroid/os/Handler;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 108
    return-void
.end method

.method public a(Lo/ezx;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lo/ezm;->b:Lo/ezx;

    .line 272
    return-void
.end method

.method public c(Lo/eyv;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lo/ezm;->c:Lo/eyv;

    .line 260
    return-void
.end method

.method public e()Landroid/view/View;
    .locals 1

    .line 280
    iget-object v0, p0, Lo/ezm;->e:Lo/ezm$e;

    return-object v0
.end method

.method public e(Lo/eyv;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lo/ezm;->d:Lo/eyv;

    .line 264
    return-void
.end method

.method public setOnFocusAreaChangeListener(Lo/ezm$c;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lo/ezm;->a:Lo/ezm$c;

    .line 276
    return-void
.end method
