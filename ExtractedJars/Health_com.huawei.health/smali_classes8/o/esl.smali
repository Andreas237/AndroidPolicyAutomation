.class public Lo/esl;
.super Lo/eqv;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/esl$c;
    }
.end annotation


# static fields
.field private static d:I

.field private static e:I


# instance fields
.field private a:Lo/eso;

.field private b:Landroid/content/Context;

.field private f:Ljava/util/concurrent/ExecutorService;

.field private g:Lo/elp;

.field private h:Landroid/os/Handler;

.field private k:I

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:I

.field private p:I

.field private q:I

.field private t:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 82
    const/4 v0, 0x0

    sput v0, Lo/esl;->d:I

    .line 83
    const/16 v0, 0x3e8

    sput v0, Lo/esl;->e:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 99
    invoke-direct {p0}, Lo/eqv;-><init>()V

    .line 90
    const/4 v0, 0x0

    iput v0, p0, Lo/esl;->k:I

    .line 91
    const/4 v0, 0x0

    iput v0, p0, Lo/esl;->p:I

    .line 92
    const/4 v0, 0x0

    iput v0, p0, Lo/esl;->o:I

    .line 93
    const-string v0, ""

    iput-object v0, p0, Lo/esl;->l:Ljava/lang/String;

    .line 94
    const-string v0, ""

    iput-object v0, p0, Lo/esl;->n:Ljava/lang/String;

    .line 95
    const-string v0, ""

    iput-object v0, p0, Lo/esl;->m:Ljava/lang/String;

    .line 96
    const/4 v0, 0x3

    iput v0, p0, Lo/esl;->q:I

    .line 97
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/esl;->t:J

    .line 100
    const-string v0, "SmartCardData-SmartCardData constructor enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 101
    iput-object p1, p0, Lo/esl;->b:Landroid/content/Context;

    .line 102
    new-instance v0, Lo/esl$c;

    invoke-direct {v0, p0}, Lo/esl$c;-><init>(Lo/esl;)V

    iput-object v0, p0, Lo/esl;->h:Landroid/os/Handler;

    .line 103
    const-string v0, "ai-common-001"

    const-string v1, "message_show_to_smartcard_time"

    const/16 v2, 0x7535

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 105
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg_show_time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/esl;->q:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    goto :goto_0

    .line 109
    :catch_0
    move-exception v5

    .line 110
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    :cond_0
    :goto_0
    const-string v0, "SmartCardData-SmartCardData constructor end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 114
    return-void
.end method

.method static synthetic a(Lo/esl;)Lo/eso;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    return-object v0
.end method

.method public static a(I)V
    .locals 0

    .line 268
    sput p0, Lo/esl;->d:I

    .line 269
    return-void
.end method

.method private a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
    .locals 2

    .line 673
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 674
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    .line 676
    :cond_0
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 677
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/esl$9;

    invoke-direct {v1, p0, p1}, Lo/esl$9;-><init>(Lo/esl;Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 685
    :cond_1
    return-void
.end method

.method private a(Z)V
    .locals 4

    .line 562
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "textView checkCardText checkLineCount "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    if-nez p1, :cond_0

    .line 564
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->a:Lo/est;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/est;->setVisibility(I)V

    .line 566
    :cond_0
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->b:Lo/est;

    new-instance v1, Lo/esl$3;

    invoke-direct {v1, p0, p1}, Lo/esl$3;-><init>(Lo/esl;Z)V

    invoke-virtual {v0, v1}, Lo/est;->c(Lo/est$b;)V

    .line 581
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->a:Lo/est;

    new-instance v1, Lo/esl$4;

    invoke-direct {v1, p0, p1}, Lo/esl$4;-><init>(Lo/esl;Z)V

    invoke-virtual {v0, v1}, Lo/est;->c(Lo/est$b;)V

    .line 593
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->e:Lo/est;

    new-instance v1, Lo/esl$2;

    invoke-direct {v1, p0, p1}, Lo/esl$2;-><init>(Lo/esl;Z)V

    invoke-virtual {v0, v1}, Lo/est;->c(Lo/est$b;)V

    .line 608
    return-void
.end method

.method static synthetic b(Lo/esl;)I
    .locals 1

    .line 73
    iget v0, p0, Lo/esl;->k:I

    return v0
.end method

.method private b(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
    .locals 2

    .line 611
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 612
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    .line 614
    :cond_0
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 615
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/esl$5;

    invoke-direct {v1, p0, p1}, Lo/esl$5;-><init>(Lo/esl;Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 638
    :cond_1
    return-void
.end method

.method static synthetic c(Lo/esl;)Landroid/content/Context;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    return-object v0
.end method

.method private c(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
    .locals 5

    .line 229
    invoke-static {p1}, Lo/dlf;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg is not unread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    return-void

    .line 235
    :cond_0
    invoke-static {p1}, Lo/dlf;->e(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 236
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg is Expire"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    invoke-direct {p0, p1}, Lo/esl;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    .line 238
    return-void

    .line 241
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v0

    iput v0, p0, Lo/esl;->k:I

    .line 242
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v0

    iput v0, p0, Lo/esl;->o:I

    .line 243
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/esl;->l:Ljava/lang/String;

    .line 244
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgSrc()I

    move-result v0

    iput v0, p0, Lo/esl;->p:I

    .line 245
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SmartCard_mSmartMsgKeyId2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/esl;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SHOW_SMART_CARD_showSmartMsgOnLayout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/esl;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 248
    iget v0, p0, Lo/esl;->k:I

    const/16 v1, 0x2711

    if-eq v1, v0, :cond_2

    .line 249
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 250
    iget v0, p0, Lo/esl;->k:I

    invoke-direct {p0, v0, p1}, Lo/esl;->d(ILcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    goto :goto_1

    .line 252
    :cond_2
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->getRemainSteps()I

    move-result v4

    .line 253
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter showSmartMsgOnLayout "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " && "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lo/esl;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    sget v0, Lo/esl;->d:I

    if-ge v0, v4, :cond_3

    .line 255
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 256
    iget v0, p0, Lo/esl;->k:I

    invoke-direct {p0, v0, p1}, Lo/esl;->d(ILcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    goto :goto_0

    .line 258
    :cond_3
    invoke-direct {p0, p1}, Lo/esl;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    .line 259
    invoke-virtual {p0}, Lo/esl;->c()V

    .line 261
    :goto_0
    goto :goto_1

    .line 263
    :cond_4
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSmartCardViewHolder is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/esl;Ljava/lang/String;I)V
    .locals 0

    .line 73
    invoke-direct {p0, p1, p2}, Lo/esl;->d(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic d(Lo/esl;)I
    .locals 1

    .line 73
    iget v0, p0, Lo/esl;->q:I

    return v0
.end method

.method private d(ILcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
    .locals 22

    .line 272
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_click_home"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->m:Ljava/lang/String;

    .line 274
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepsCardData_refreshCardData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->m:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    const-string v0, "0"

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 277
    const-string v0, "SmartCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateShowCount_clickHome = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getShowCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " msg_id = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/esl;->b(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    .line 279
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_click_home"

    .line 280
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 279
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 283
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_2

    .line 285
    :sswitch_0
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->getContent()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 286
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_sign_up_now:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 287
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_recommend_standard_activity:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 286
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 288
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const/16 v2, 0x2710

    const/16 v3, 0x2710

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 289
    goto/16 :goto_2

    .line 291
    :sswitch_1
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->getRemainSteps()I

    move-result v10

    .line 292
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_standard_activity:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/esl;->b:Landroid/content/Context;

    .line 293
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$plurals;->IDS_hwh_me_other_target_steps:I

    sget v5, Lo/esl;->d:I

    sub-int v5, v10, v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    sget v7, Lo/esl;->d:I

    sub-int v7, v10, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 292
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 294
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    invoke-virtual {v2, v3, v4}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    invoke-virtual {v2}, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->getActivityName()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 295
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_view_details:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 296
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v5, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_step_standard:I

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 294
    const/4 v2, 0x1

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 297
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const/16 v2, 0x2710

    const/16 v3, 0x2711

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 298
    goto/16 :goto_2

    .line 300
    :sswitch_2
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->getContent()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 301
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_fitness_plancard_start:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 302
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_office_fitness_video:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 301
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 303
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const/16 v2, 0x2710

    const/16 v3, 0x2712

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 304
    goto/16 :goto_2

    .line 306
    :sswitch_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_user_set_weight_target1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 307
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_user_set_weight_target2:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 308
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_set_target:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 309
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v5, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_measure_weight:I

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 307
    const/4 v2, 0x1

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 310
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const/16 v2, 0x4e20

    const/16 v3, 0x4e20

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 311
    goto/16 :goto_2

    .line 313
    :sswitch_4
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    .line 314
    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;->getDays()I

    move-result v11

    .line 315
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_user_measure_weight1:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/esl;->b:Landroid/content/Context;

    .line 316
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$plurals;->IDS_user_profile_achieve_num_day:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    int-to-double v6, v11

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {v3, v4, v11, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 315
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 317
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_user_measure_weight2:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 318
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_device_measureactivity_guide_start_measure:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 319
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v5, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_measure_weight:I

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 317
    const/4 v2, 0x1

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 320
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const/16 v2, 0x4e20

    const/16 v3, 0x4e25

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 321
    goto/16 :goto_2

    .line 323
    :sswitch_5
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->getFitWorkout()Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v12

    .line 324
    const/4 v0, 0x0

    if-ne v0, v12, :cond_1

    .line 325
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    const/16 v1, 0x4e26

    invoke-virtual {v0, v1}, Lo/dlf;->b(I)V

    .line 327
    invoke-virtual/range {p0 .. p0}, Lo/esl;->c()V

    .line 328
    return-void

    .line 330
    :cond_1
    invoke-virtual {v12}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 331
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_fitness_plancard_start:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 332
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_reduce_fat_video:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 331
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 333
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const/16 v2, 0x4e20

    const/16 v3, 0x4e26

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 334
    goto/16 :goto_2

    .line 336
    :sswitch_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    if-eqz v0, :cond_3

    .line 337
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->c:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_btn_state_ignore:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 338
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->a:Lo/est;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/est;->setVisibility(I)V

    .line 339
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/esl;->e(Ljava/lang/String;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 340
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->b:Lo/est;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/esl;->e(Ljava/lang/String;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/est;->setText(Ljava/lang/CharSequence;)V

    .line 341
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->e:Lo/est;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/est;->setVisibility(I)V

    .line 342
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->e:Lo/est;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_view_details:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/est;->setText(Ljava/lang/CharSequence;)V

    .line 343
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->g:Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_measure_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 344
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const/16 v2, 0x4e20

    const/16 v3, 0x4e27

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    goto/16 :goto_2

    .line 349
    :sswitch_7
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    .line 350
    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;->getDays()I

    move-result v13

    .line 351
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_user_measure_bloodpressure:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/esl;->b:Landroid/content/Context;

    .line 352
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$plurals;->IDS_user_profile_achieve_num_day:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    int-to-double v6, v13

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {v3, v4, v13, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 351
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 353
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_user_measure_weight2:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 354
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_device_measureactivity_guide_start_measure:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 355
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v5, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_measure_bloodpressure:I

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 353
    const/4 v2, 0x1

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 356
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const/16 v2, 0x7530

    const/16 v3, 0x7531

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 357
    goto/16 :goto_2

    .line 367
    :sswitch_8
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v14, v0

    .line 368
    const-string v0, "content"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 369
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_view_details:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 370
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_information:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 369
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 371
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const v2, 0x9c40

    move/from16 v3, p1

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 374
    goto/16 :goto_2

    .line 372
    :catch_0
    move-exception v14

    .line 373
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSONException, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    goto/16 :goto_2

    .line 378
    :sswitch_9
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->getContent()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 379
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_notice_details:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 380
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_notification:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 379
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 381
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const v2, 0xc350

    const v3, 0xc350

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 382
    goto/16 :goto_2

    .line 384
    :sswitch_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_fill_personal_info:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 385
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_provide_accurate_service:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 386
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_info_abnormal:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 385
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 387
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const v2, 0xea60

    const v3, 0xea60

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 388
    goto/16 :goto_2

    .line 391
    :sswitch_b
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    .line 392
    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;->getDays()I

    move-result v14

    .line 393
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_user_measure_bloodsugar:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/esl;->b:Landroid/content/Context;

    .line 394
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/homehealth/R$plurals;->IDS_user_profile_achieve_num_day:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    int-to-double v6, v14

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {v3, v4, v14, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 393
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 395
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_user_measure_weight2:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 396
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v4, Lcom/huawei/ui/homehealth/R$string;->IDS_device_measureactivity_guide_start_measure:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 397
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v5, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_measure_bloodsugar:I

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 395
    const/4 v2, 0x1

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 398
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const v2, 0x11170

    const v3, 0x11171

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 399
    goto/16 :goto_2

    .line 405
    :sswitch_c
    :try_start_1
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v15

    .line 406
    new-instance v0, Lorg/json/JSONObject;

    move-object v1, v15

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 407
    const-string v0, "sleepTitle"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 411
    goto :goto_0

    .line 408
    :catch_1
    move-exception v15

    .line 409
    const-string v0, ""

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 410
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v15}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const v2, 0x13880

    move/from16 v3, p1

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 413
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mMsgTitle:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/esl;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_notice_details:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 415
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_sleep_service:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 414
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 416
    goto/16 :goto_2

    .line 418
    :sswitch_d
    const-string v15, ""

    .line 419
    const-string v16, ""

    .line 421
    :try_start_2
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v17

    .line 422
    new-instance v0, Lorg/json/JSONObject;

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v18, v0

    .line 423
    const-string v0, "content"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 424
    const-string v0, "msgContent"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v15, v0

    .line 425
    const-string v0, "subContent"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    move-object/from16 v16, v0

    .line 429
    goto :goto_1

    .line 426
    :catch_2
    move-exception v17

    .line 427
    const-string v0, ""

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 428
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const v2, 0x15f91

    move/from16 v3, p1

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 431
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mMsgTitle:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/esl;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    move-object v3, v15

    move-object/from16 v4, v16

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/esl;->b:Landroid/content/Context;

    .line 433
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v5, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smartcard_recovertime_notification:I

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 432
    const/4 v2, 0x1

    invoke-direct/range {v0 .. v5}, Lo/esl;->d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 434
    goto/16 :goto_2

    .line 436
    :sswitch_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    if-eqz v0, :cond_3

    .line 437
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->c:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_btn_state_ignore:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 438
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->a:Lo/est;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/est;->setVisibility(I)V

    .line 439
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->getContent()Ljava/lang/String;

    move-result-object v17

    .line 440
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_hwh_home_smartcard_unfinish_activity:I

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v17, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/esl;->n:Ljava/lang/String;

    .line 442
    new-instance v0, Landroid/text/SpannableString;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->n:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v18, v0

    .line 443
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_red1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    move-object/from16 v19, v0

    .line 444
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v20

    .line 445
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v0

    add-int v21, v20, v0

    .line 446
    move/from16 v0, v20

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 447
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    move/from16 v2, v20

    move/from16 v3, v21

    const/16 v4, 0x11

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 450
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->b:Lo/est;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/est;->setText(Ljava/lang/CharSequence;)V

    .line 451
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->e:Lo/est;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/est;->setVisibility(I)V

    .line 452
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->e:Lo/est;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smartcard_view_details:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/est;->setText(Ljava/lang/CharSequence;)V

    .line 453
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->g:Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->hw_health_smart_card_recommend_standard_activity:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 454
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    const v2, 0x186a0

    move/from16 v3, p1

    invoke-direct {v1, v2, v3, v0}, Lo/esl;->e(IILjava/lang/String;)V

    .line 455
    .line 460
    :cond_3
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2710 -> :sswitch_0
        0x2711 -> :sswitch_1
        0x2712 -> :sswitch_2
        0x4e20 -> :sswitch_3
        0x4e25 -> :sswitch_4
        0x4e26 -> :sswitch_5
        0x4e27 -> :sswitch_6
        0x7531 -> :sswitch_7
        0x9c40 -> :sswitch_8
        0x9c41 -> :sswitch_8
        0x9c42 -> :sswitch_8
        0x9c43 -> :sswitch_8
        0x9c44 -> :sswitch_8
        0x9c45 -> :sswitch_8
        0x9c46 -> :sswitch_8
        0x9c47 -> :sswitch_8
        0xc350 -> :sswitch_9
        0xc351 -> :sswitch_9
        0xea60 -> :sswitch_a
        0x11171 -> :sswitch_b
        0x13880 -> :sswitch_c
        0x13881 -> :sswitch_c
        0x13882 -> :sswitch_c
        0x13884 -> :sswitch_c
        0x15f91 -> :sswitch_d
        0x186a0 -> :sswitch_e
    .end sparse-switch
.end method

.method private d(Ljava/lang/String;I)V
    .locals 2

    .line 646
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 647
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    .line 649
    :cond_0
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 650
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/esl$6;

    invoke-direct {v1, p0, p2, p1}, Lo/esl$6;-><init>(Lo/esl;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 665
    :cond_1
    return-void
.end method

.method private d(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 545
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    if-eqz v0, :cond_0

    .line 546
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_btn_state_ignore:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 547
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->a:Lo/est;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/est;->setVisibility(I)V

    .line 548
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->e:Lo/est;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/est;->setVisibility(I)V

    .line 549
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, p5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 550
    invoke-direct {p0, p2}, Lo/esl;->a(Z)V

    .line 551
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->b:Lo/est;

    invoke-virtual {v0, p1}, Lo/est;->setText(Ljava/lang/CharSequence;)V

    .line 552
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->a:Lo/est;

    invoke-virtual {v0, p3}, Lo/est;->setText(Ljava/lang/CharSequence;)V

    .line 553
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->e:Lo/est;

    invoke-virtual {v0, p4}, Lo/est;->setText(Ljava/lang/CharSequence;)V

    .line 555
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/esl;)Landroid/os/Handler;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/esl;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private e(Ljava/lang/String;)Landroid/text/SpannableString;
    .locals 20

    .line 468
    const-string v5, ""

    .line 469
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->getUpDown()I

    move-result v6

    .line 470
    const/4 v0, 0x2

    new-array v7, v0, [J

    .line 471
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->getTimeperiod(I)J

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v7, v2

    .line 472
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->getTimeperiod(I)J

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v7, v2

    .line 473
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->getChangeData()D

    move-result-wide v8

    .line 476
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v8, v9}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {v8, v9, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 477
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v11

    .line 478
    const-string v0, "ar"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 479
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v8, v9}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v8, v9, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 482
    :cond_2
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v1, v0, v7}, Lo/fhv;->a(ILandroid/content/Context;[J)Ljava/lang/String;

    move-result-object v12

    .line 483
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_weight_suggest_last_week:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    .line 484
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_lb_string:I

    invoke-static {v8, v9}, Lo/cxh;->e(D)D

    move-result-wide v2

    double-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v10, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    goto :goto_2

    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    .line 485
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_kg_string:I

    double-to-int v2, v8

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v10, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 486
    :goto_2
    const/4 v15, 0x0

    .line 487
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 488
    const/4 v15, 0x1

    .line 490
    :cond_4
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_3

    .line 492
    :pswitch_0
    if-eqz v15, :cond_5

    .line 493
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smart_card_weight_weekly_maintain_last_week:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_3

    .line 495
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smart_card_weight_weekly_maintain:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v12, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 497
    goto/16 :goto_3

    .line 499
    :pswitch_1
    if-eqz v15, :cond_6

    .line 500
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smart_card_weight_weekly_down_last_week:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v14, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_3

    .line 503
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smart_card_weight_weekly_down:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v12, v2, v3

    const/4 v3, 0x1

    aput-object v14, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 506
    goto :goto_3

    .line 508
    :pswitch_2
    if-eqz v15, :cond_7

    .line 509
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smart_card_weight_weekly_up_last_week:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v14, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    .line 512
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smart_card_weight_weekly_up:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v12, v2, v3

    const/4 v3, 0x1

    aput-object v14, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 515
    goto :goto_3

    .line 517
    :pswitch_3
    if-eqz v15, :cond_8

    .line 518
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smart_card_weight_weekly_weight_goal_attain_last_week:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    .line 520
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_smart_card_weight_weekly_weight_goal_attain:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v12, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 521
    .line 526
    :goto_3
    new-instance v0, Landroid/text/SpannableString;

    move-object v1, v5

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v16, v0

    .line 527
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_red1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    move-object/from16 v17, v0

    .line 528
    invoke-virtual {v5, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    .line 529
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    add-int v19, v18, v0

    .line 530
    move/from16 v0, v18

    const/4 v1, -0x1

    if-eq v0, v1, :cond_9

    .line 531
    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move/from16 v2, v18

    move/from16 v3, v19

    const/16 v4, 0x11

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 533
    :cond_9
    return-object v16

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private e()V
    .locals 7

    .line 721
    const/4 v5, 0x0

    .line 722
    iget v0, p0, Lo/esl;->p:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 724
    :try_start_0
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_information_click_count"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 728
    goto :goto_0

    .line 726
    :catch_0
    move-exception v6

    .line 727
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseInt Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    :goto_0
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepsCardData_refreshCardData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 730
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_information_click_count"

    add-int/lit8 v3, v5, 0x1

    .line 731
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 730
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 732
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_information_click_time"

    .line 733
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 732
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 735
    :cond_0
    return-void
.end method

.method private e(IILjava/lang/String;)V
    .locals 6

    .line 763
    const-string v0, "0"

    iget-object v1, p0, Lo/esl;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 764
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 765
    sget-object v0, Lo/dae;->bA:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v3

    .line 766
    const-string v0, "module"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 767
    const-string v0, "type"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    const-string v0, "title"

    invoke-interface {v2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 769
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v4

    .line 770
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v5

    .line 771
    const/4 v0, 0x0

    invoke-virtual {v5, v4, v3, v2, v0}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 773
    :cond_0
    return-void
.end method

.method private e(Ljava/lang/String;I)V
    .locals 4

    .line 694
    const/4 v0, 0x5

    if-eq p2, v0, :cond_0

    .line 695
    return-void

    .line 697
    :cond_0
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MsgCenter set expired"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 699
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 700
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    .line 702
    :cond_1
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_2

    .line 703
    iget-object v0, p0, Lo/esl;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/esl$8;

    invoke-direct {v1, p0, p1}, Lo/esl$8;-><init>(Lo/esl;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 715
    :cond_2
    return-void
.end method

.method static synthetic e(Lo/esl;Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lo/esl;->c(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 175
    const-string v0, "SmartCardData-getCardViewHolder enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 176
    new-instance v0, Lo/eso;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->home_item_layout_smart:I

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lo/esl;->b:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/eso;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    iput-object v0, p0, Lo/esl;->a:Lo/eso;

    .line 178
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 180
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    invoke-virtual {p0}, Lo/esl;->c()V

    .line 182
    const-string v0, "SmartCardData-getCardViewHolder end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    return-object v0
.end method

.method public c()V
    .locals 6

    .line 188
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lo/esl;->h:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 190
    return-void

    .line 192
    :cond_0
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_show_smartcard"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 194
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSmartCard = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    const-string v0, "false"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 196
    return-void

    .line 198
    :cond_1
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_smartcard"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 200
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "querySmartMsg smartcardRecommend = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const-string v0, "0"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 202
    iget-object v0, p0, Lo/esl;->h:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 204
    :cond_2
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    new-instance v1, Lo/esl$1;

    invoke-direct {v1, p0}, Lo/esl$1;-><init>(Lo/esl;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/dlf;->a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 226
    :goto_0
    return-void
.end method

.method public d()V
    .locals 4

    .line 118
    invoke-super {p0}, Lo/eqv;->d()V

    .line 119
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====onResume===="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-virtual {p0}, Lo/esl;->c()V

    .line 121
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_smart_card_more:I

    if-ne v0, v1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/esl;->t:J

    sub-long/2addr v0, v2

    sget v2, Lo/esl;->e:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 126
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/esl;->t:J

    .line 128
    :try_start_0
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lo/esl;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/esl;->a:Lo/eso;

    iget-object v2, v2, Lo/eso;->f:Landroid/view/View;

    invoke-direct {v0, v1, v2}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lo/esl;->g:Lo/elp;

    .line 129
    iget-object v0, p0, Lo/esl;->g:Lo/elp;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/elp;->c(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    goto/16 :goto_0

    .line 130
    :catch_0
    move-exception v5

    .line 131
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "popView exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    goto/16 :goto_0

    .line 133
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_smart_card_pop_text1:I

    if-ne v0, v1, :cond_3

    .line 134
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 135
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    const-string v0, "type"

    iget v1, p0, Lo/esl;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    const-string v0, "title"

    iget-object v1, p0, Lo/esl;->n:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    sget-object v0, Lo/dae;->bI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 139
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/esl;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 140
    iget-object v0, p0, Lo/esl;->g:Lo/elp;

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 141
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 142
    const-string v0, "status"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 143
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iget v1, p0, Lo/esl;->o:I

    invoke-virtual {v0, v1, v7}, Lo/dln;->d(ILandroid/content/ContentValues;)Z

    .line 144
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 145
    iget-object v0, p0, Lo/esl;->a:Lo/eso;

    iget-object v0, v0, Lo/eso;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 146
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_show_smartcard"

    const-string v3, "false"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 149
    :cond_1
    iget v0, p0, Lo/esl;->k:I

    const v1, 0x186a0

    if-ne v1, v0, :cond_2

    .line 150
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x4e29

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_partiactivity_disappear_time"

    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 150
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 153
    :cond_2
    iget-object v0, p0, Lo/esl;->l:Ljava/lang/String;

    iget v1, p0, Lo/esl;->p:I

    invoke-direct {p0, v0, v1}, Lo/esl;->e(Ljava/lang/String;I)V

    .line 154
    goto/16 :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_smart_card_layout:I

    if-ne v0, v1, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/esl;->t:J

    sub-long/2addr v0, v2

    sget v2, Lo/esl;->e:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 155
    const-string v0, "SmartCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SmartCard_mSmartMsgKeyId1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/esl;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/esl;->t:J

    .line 157
    invoke-direct {p0}, Lo/esl;->e()V

    .line 158
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 159
    const-string v0, "id"

    iget v1, p0, Lo/esl;->o:I

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 160
    const-string v0, "msgType"

    iget v1, p0, Lo/esl;->k:I

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 161
    const-string v0, "msgContent"

    iget-object v1, p0, Lo/esl;->l:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 162
    const-string v0, "msgTitle"

    iget-object v1, p0, Lo/esl;->n:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 163
    const-string v0, "from"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 164
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 165
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 166
    iget v0, p0, Lo/esl;->k:I

    const v1, 0x186a0

    if-ne v1, v0, :cond_4

    .line 167
    iget-object v0, p0, Lo/esl;->b:Landroid/content/Context;

    const/16 v1, 0x4e29

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_partiactivity_disappear_time"

    .line 168
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 167
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 171
    :cond_4
    :goto_0
    return-void
.end method
