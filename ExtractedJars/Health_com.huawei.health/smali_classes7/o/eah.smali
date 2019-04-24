.class public Lo/eah;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/eah;

.field private static b:Ljava/lang/String;


# instance fields
.field private c:Lo/dzz;

.field private d:Lcom/huawei/pluginmessagecenter/service/MessageObserverController;

.field private e:Landroid/content/Context;

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    const-string v0, "UIDV_MessageDBProvider"

    sput-object v0, Lo/eah;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 74
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/eah;->i:I

    .line 75
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter MessageDBProvider"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iput-object p1, p0, Lo/eah;->e:Landroid/content/Context;

    .line 77
    new-instance v0, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;

    invoke-direct {v0}, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;-><init>()V

    iput-object v0, p0, Lo/eah;->d:Lcom/huawei/pluginmessagecenter/service/MessageObserverController;

    .line 78
    invoke-static {p1}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/dzz;

    iput-object v0, p0, Lo/eah;->c:Lo/dzz;

    .line 80
    const/16 v4, 0x6d

    .line 81
    invoke-direct {p0}, Lo/eah;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MessageDB data is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :cond_0
    iget-object v0, p0, Lo/eah;->e:Landroid/content/Context;

    invoke-virtual {p0}, Lo/eah;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dcl;->e(Landroid/content/Context;Ljava/lang/String;)Lo/dcl;

    invoke-virtual {p0}, Lo/eah;->getModuleId()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dcl;->c(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/eah;->i:I

    .line 86
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newDBVersion ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", oldDBVersion="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eah;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    const/16 v0, 0x6c

    if-gt v0, v4, :cond_1

    iget v0, p0, Lo/eah;->i:I

    const/16 v1, 0x6b

    if-lt v1, v0, :cond_1

    iget v0, p0, Lo/eah;->i:I

    const/16 v1, 0x64

    if-lt v0, v1, :cond_1

    .line 91
    invoke-direct {p0}, Lo/eah;->h()V

    goto :goto_0

    .line 93
    :cond_1
    invoke-direct {p0}, Lo/eah;->i()V

    .line 96
    :goto_0
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave MessageDBProvider"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 713
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 715
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter queryAll"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 718
    const-string v0, "select * from "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 719
    const-string v0, "message"

    invoke-virtual {p0, v0}, Lo/eah;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 720
    const-string v0, " where ( "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 721
    const-string v0, "huid =? or huid = \'\')"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 722
    const-string v0, " and (imei =? or "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 723
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 724
    const-string v0, "imei =? or "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 726
    :cond_0
    const-string v0, "imei is null or imei = \'\') "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 727
    const-string v0, "order by weight"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 728
    const-string v0, " desc, receiveTime desc"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 735
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    .line 736
    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 737
    invoke-static {p2}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 739
    const/4 v0, 0x3

    new-array v8, v0, [Ljava/lang/String;

    .line 740
    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 741
    invoke-static {p2}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 742
    invoke-static {v0}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 744
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stringBuilder>>>>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 746
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move-object v1, v7

    goto :goto_0

    :cond_1
    move-object v1, v8

    :goto_0
    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0, v1}, Lo/eah;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 748
    if-eqz v9, :cond_8

    .line 749
    :goto_1
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 750
    invoke-static {v9}, Lo/eag;->b(Landroid/database/Cursor;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v5

    .line 752
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v10, 0x1

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    .line 754
    :goto_2
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v11

    .line 755
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {v11, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v11

    .line 756
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    if-eq v0, v11, :cond_4

    const-string v0, "S"

    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "G"

    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 757
    :cond_3
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryAll | messageObject 1 continue S G"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 758
    goto :goto_1

    .line 761
    :cond_4
    invoke-static {v5}, Lo/eag;->d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 762
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getType()Ljava/lang/String;

    move-result-object v12

    .line 763
    if-nez v10, :cond_5

    const-string v0, "specialCloudServiceMessage"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 764
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryAll | messageObject 1 type = specialCloudServiceMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 765
    goto/16 :goto_1

    .line 767
    :cond_5
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 769
    :cond_6
    goto/16 :goto_1

    .line 770
    :cond_7
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 772
    :cond_8
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave queryAll list.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 773
    return-object v4
.end method

.method static synthetic b(Lo/eah;ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lo/eah;->c(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    return-void
.end method

.method private c(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
    .locals 1

    .line 256
    iget-object v0, p0, Lo/eah;->d:Lcom/huawei/pluginmessagecenter/service/MessageObserverController;

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lo/eah;->d:Lcom/huawei/pluginmessagecenter/service/MessageObserverController;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->notifyAllObservers(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    .line 259
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 12

    .line 269
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter insert | Message: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    invoke-static {p1}, Lo/eag;->b(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    const/4 v0, 0x0

    return v0

    .line 274
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v8

    .line 276
    invoke-static {p1}, Lo/eag;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Landroid/content/ContentValues;

    move-result-object v9

    .line 278
    invoke-virtual {p0, v8}, Lo/eah;->g(Ljava/lang/String;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v0

    if-nez v0, :cond_2

    .line 279
    const-string v0, "msgId"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const-string v0, "module"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const-string v0, "type"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const-string v0, "message"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, v9}, Lo/eah;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v6

    .line 283
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_1

    const-wide/32 v0, 0x31128

    cmp-long v0, v6, v0

    if-eqz v0, :cond_1

    .line 284
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert | insert a new message success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    const/4 v0, 0x1

    return v0

    .line 287
    :cond_1
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert | insert a new message failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    const/4 v0, 0x0

    return v0

    .line 292
    :cond_2
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 293
    const-string v0, "msgId"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "module"

    .line 294
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type"

    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 296
    const/4 v0, 0x3

    new-array v11, v0, [Ljava/lang/String;

    .line 297
    invoke-static {v8}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    .line 298
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getModule()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v11, v1

    .line 299
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v11, v1

    .line 301
    move-object v0, p0

    const-string v1, "message"

    move-object v3, v9

    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v11

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/eah;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v6, v0

    .line 302
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_3

    const-wide/32 v0, 0x31128

    cmp-long v0, v6, v0

    if-eqz v0, :cond_3

    .line 303
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert | update content of message success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    const/4 v0, 0x1

    return v0

    .line 306
    :cond_3
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert | update content of message failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/Context;)Lo/eah;
    .locals 3

    .line 649
    sget-object v0, Lo/eah;->a:Lo/eah;

    if-nez v0, :cond_1

    .line 650
    const-class v1, Lo/eaa;

    monitor-enter v1

    .line 651
    :try_start_0
    sget-object v0, Lo/eah;->a:Lo/eah;

    if-nez v0, :cond_0

    .line 652
    new-instance v0, Lo/eah;

    invoke-direct {v0, p0}, Lo/eah;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/eah;->a:Lo/eah;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 654
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 656
    :cond_1
    :goto_0
    sget-object v0, Lo/eah;->a:Lo/eah;

    return-object v0
.end method

.method private f()Z
    .locals 6

    .line 100
    const/4 v4, 0x1

    .line 101
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter checkMessageDBisNull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const-string v0, "message"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/eah;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 103
    if-eqz v5, :cond_0

    .line 104
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 105
    const/4 v4, 0x0

    .line 107
    :cond_0
    return v4
.end method

.method static synthetic g()Ljava/lang/String;
    .locals 1

    .line 38
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    return-object v0
.end method

.method private h()V
    .locals 7

    .line 213
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 214
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 215
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter upgradeMessageCenterDB_107"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const-string v0, "message"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/eah;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 219
    if-eqz v5, :cond_2

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 221
    :cond_0
    invoke-static {v5}, Lo/eag;->a(Landroid/database/Cursor;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v6

    .line 224
    invoke-static {v6}, Lo/eag;->c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 225
    goto :goto_0

    .line 228
    :cond_1
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 232
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 233
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 236
    :cond_3
    invoke-virtual {p0}, Lo/eah;->b()Z

    .line 238
    iget-object v0, p0, Lo/eah;->e:Landroid/content/Context;

    invoke-virtual {p0}, Lo/eah;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "message"

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/dck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I

    .line 240
    invoke-direct {p0}, Lo/eah;->i()V

    .line 242
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 243
    invoke-virtual {p0, v4}, Lo/eah;->c(Ljava/util/List;)Z

    .line 246
    :cond_4
    invoke-direct {p0}, Lo/eah;->k()V

    .line 248
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave upgradeMessageCenterDB_104"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    return-void
.end method

.method private i()V
    .locals 5

    .line 171
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createTable | create new table: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "message"

    invoke-virtual {p0, v3}, Lo/eah;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const-string v4, "id integer primary key autoincrement,msgId text not null,module text,type text,metadata text,msgType integer not null check(msgType > 0),flag integer not null check(flag > -1),weight integer not null check(weight > -1),readFlag integer not null,msgTitle text not null,msgContext text,createTime integer not null,receiveTime integer not null,expireTime integer not null,imgURI text,imgBigUri text,detailUri text not null,detailUriExt text,msgFrom text,position integer not null check(position > 0),msgPosition integer not null,huid text,imei text,notified integer not null,infoClassify text,heatMapCity text,infoRecommend integer,msgUserLable text,layout integer,messageExtList text,pageType integer"

    .line 203
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createTable | create new table sql = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const-string v0, "message"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, v4}, Lo/eah;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 206
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createTable | create table end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    return-void
.end method

.method private k()V
    .locals 5

    .line 364
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter insertBannerAndInfoMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    invoke-static {}, Lcom/huawei/pluginmessagecenter/service/MessagePuller;->getInstance()Lcom/huawei/pluginmessagecenter/service/MessagePuller;

    move-result-object v0

    iget-object v1, p0, Lo/eah;->e:Landroid/content/Context;

    new-instance v2, Lo/eah$1;

    invoke-direct {v2, p0}, Lo/eah$1;-><init>(Lo/eah;)V

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v3, v4, v2}, Lcom/huawei/pluginmessagecenter/service/MessagePuller;->pullMessage(Landroid/content/Context;JLo/eak;)V

    .line 382
    return-void
.end method

.method private n()J
    .locals 10

    .line 671
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getMaxTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    const-wide/16 v4, 0x0

    .line 673
    iget-object v0, p0, Lo/eah;->c:Lo/dzz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 674
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 675
    iget-object v0, p0, Lo/eah;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/dzz;

    iput-object v0, p0, Lo/eah;->c:Lo/dzz;

    .line 677
    :cond_0
    iget-object v0, p0, Lo/eah;->c:Lo/dzz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 678
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaxTime adapter is null return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    const-wide/16 v0, -0x1

    return-wide v0

    .line 682
    :cond_1
    iget-object v0, p0, Lo/eah;->c:Lo/dzz;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "getLoginInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v0, v1}, Lo/dzz;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "huid"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 683
    if-eqz v6, :cond_2

    const-string v0, ""

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 684
    :cond_2
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaxTime | huid is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 685
    const-wide/16 v0, -0x1

    return-wide v0

    .line 687
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT MAX(createTime) FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "message"

    invoke-virtual {p0, v1}, Lo/eah;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " WHERE ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? or "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = \'\' )  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "msgId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " like \'S%\' or "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "msgId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " like \'G%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 690
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaxTime | sql = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    invoke-static {v6}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 692
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v7, v8}, Lo/eah;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 693
    if-eqz v9, :cond_5

    .line 694
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 695
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 697
    :cond_4
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 700
    :cond_5
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave getMaxTime | getMaxTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 701
    return-wide v4
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 10

    .line 390
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter deleteMessageById"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    iget-object v0, p0, Lo/eah;->c:Lo/dzz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 392
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    iget-object v0, p0, Lo/eah;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/dzz;

    iput-object v0, p0, Lo/eah;->c:Lo/dzz;

    .line 395
    :cond_0
    iget-object v0, p0, Lo/eah;->c:Lo/dzz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 396
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteMessageById | delete message failed adapter is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    const/4 v0, -0x1

    return v0

    .line 400
    :cond_1
    iget-object v0, p0, Lo/eah;->c:Lo/dzz;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "getLoginInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v0, v1}, Lo/dzz;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "huid"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 401
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 402
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteMessageById | delete message failed  huid is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    const/4 v0, -0x1

    return v0

    .line 405
    :cond_2
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 406
    const-string v0, "msgId"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "huid"

    .line 407
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 408
    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/String;

    .line 409
    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 410
    invoke-static {v4}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 412
    const-string v0, "message"

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1, v6}, Lo/eah;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 413
    if-nez v7, :cond_3

    .line 414
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 415
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    new-instance v9, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;

    const/4 v0, 0x0

    invoke-direct {v9, v0, v8}, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 417
    const/4 v0, 0x0

    invoke-direct {p0, v0, v9}, Lo/eah;->c(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    .line 420
    :cond_3
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteMessageById result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    return v7
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 1013
    const-string v0, "currentHuid_key"

    invoke-virtual {p0, v0}, Lo/eah;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 18

    .line 118
    const-class v6, Lo/eaa;

    monitor-enter v6

    .line 119
    :try_start_0
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter requestMessageId module = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lo/eah;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 121
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v6

    return-object v0

    .line 124
    :cond_0
    const-string v8, ""

    .line 125
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lo/eah;->c:Lo/dzz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 126
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eah;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/dzz;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/eah;->c:Lo/dzz;

    .line 129
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eah;->c:Lo/dzz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 130
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eah;->c:Lo/dzz;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "getLoginInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v0, v1}, Lo/dzz;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "huid"

    .line 132
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 135
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eah;->e:Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lo/eah;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dcl;->e(Landroid/content/Context;Ljava/lang/String;)Lo/dcl;

    move-result-object v0

    invoke-virtual {v0}, Lo/dcl;->b()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v9

    .line 136
    const-string v10, ""

    .line 137
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 138
    invoke-virtual {v9}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransaction()V

    .line 140
    const-string v0, "message"

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-static {v8, v1, v2}, Lo/eag;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v1

    move-object/from16 v2, p0

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3, v1}, Lo/eah;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v11

    .line 141
    const-wide/16 v0, -0x1

    cmp-long v0, v11, v0

    if-nez v0, :cond_3

    .line 142
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert wrong"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    monitor-exit v6

    const/4 v0, 0x0

    return-object v0

    .line 146
    :cond_3
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "l"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 147
    new-instance v13, Landroid/content/ContentValues;

    invoke-direct {v13}, Landroid/content/ContentValues;-><init>()V

    .line 148
    const-string v0, "msgId"

    invoke-virtual {v13, v0, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    new-instance v14, Ljava/lang/StringBuffer;

    invoke-direct {v14}, Ljava/lang/StringBuffer;-><init>()V

    .line 152
    const-string v0, "id"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 153
    const/4 v0, 0x1

    new-array v15, v0, [Ljava/lang/String;

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v15, v1

    .line 154
    move-object/from16 v0, p0

    const-string v1, "message"

    move-object v3, v13

    invoke-virtual {v14}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v15

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/eah;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v16

    .line 155
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestMessageId result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-virtual {v9}, Lnet/sqlcipher/database/SQLiteDatabase;->setTransactionSuccessful()V

    .line 158
    invoke-virtual {v9}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 161
    :cond_4
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave requestMessageId module = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 162
    monitor-exit v6

    return-object v10

    .line 163
    :catchall_0
    move-exception v17

    monitor-exit v6

    throw v17
.end method

.method public a(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V
    .locals 4

    .line 526
    if-nez p1, :cond_0

    .line 527
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Observer object maybe not create."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    return-void

    .line 530
    :cond_0
    iget-object v0, p0, Lo/eah;->d:Lcom/huawei/pluginmessagecenter/service/MessageObserverController;

    invoke-virtual {v0, p1}, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->deleteObservers(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 531
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 869
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getMessageList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 870
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 871
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMessageList | huid is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 874
    :cond_0
    if-nez p2, :cond_1

    .line 875
    const-string p2, ""

    .line 877
    :cond_1
    if-nez p4, :cond_2

    if-nez p5, :cond_2

    .line 878
    invoke-direct {p0, p1, p2, p3}, Lo/eah;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 881
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 883
    add-int/lit8 v0, p4, -0x1

    mul-int v6, v0, p5

    .line 885
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 886
    const-string v0, "select * from "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 887
    const-string v0, "message"

    invoke-virtual {p0, v0}, Lo/eah;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 888
    const-string v0, " where ( "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 889
    const-string v0, "huid =? or huid = \'\')"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 890
    const-string v0, " and (imei =? or "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 891
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 892
    const-string v0, "imei =? or "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 894
    :cond_3
    const-string v0, "imei is null or imei = \'\') "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 895
    const-string v0, "order by weight"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 896
    const-string v0, " desc, receiveTime desc limit ?,? "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 905
    const/4 v0, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 906
    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 907
    invoke-static {p2}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 908
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 909
    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 911
    const/4 v0, 0x5

    new-array v9, v0, [Ljava/lang/String;

    .line 912
    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 913
    invoke-static {p2}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 914
    invoke-static {v0}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 915
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v9, v1

    .line 916
    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v9, v1

    .line 919
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    move-object v1, v8

    goto :goto_0

    :cond_4
    move-object v1, v9

    :goto_0
    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0, v1}, Lo/eah;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 921
    if-eqz v10, :cond_6

    .line 922
    :goto_1
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 923
    invoke-static {v10}, Lo/eag;->b(Landroid/database/Cursor;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v5

    .line 924
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 926
    :cond_5
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 928
    :cond_6
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getMessageList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 929
    return-object v4
.end method

.method public b(Ljava/lang/String;)V
    .locals 11

    .line 488
    const-class v4, Lo/eaa;

    monitor-enter v4

    .line 489
    :try_start_0
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 490
    const-string v0, "msgId"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 491
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    .line 492
    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 494
    const-string v0, "message"

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1, v6}, Lo/eah;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 495
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "revokeMessage id="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " result="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    if-nez v7, :cond_0

    .line 497
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 498
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 499
    new-instance v9, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;

    const/4 v0, 0x0

    invoke-direct {v9, v0, v8}, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 500
    const/4 v0, 0x0

    invoke-direct {p0, v0, v9}, Lo/eah;->c(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 502
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 503
    :goto_0
    return-void
.end method

.method public b()Z
    .locals 5

    .line 430
    const-string v0, "message"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/eah;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v4

    .line 431
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteAllMessages | delete messages; resultCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    if-nez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 840
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 842
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "message"

    invoke-virtual {p0, v1}, Lo/eah;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "module"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 844
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    .line 845
    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 846
    invoke-static {p2}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 849
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v4, v5}, Lo/eah;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 851
    if-eqz v6, :cond_1

    .line 852
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 853
    invoke-static {v6}, Lo/eag;->b(Landroid/database/Cursor;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v2

    .line 854
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 856
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 858
    :cond_1
    return-object v3
.end method

.method public c()V
    .locals 4

    .line 664
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "release()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    iget-object v0, p0, Lo/eah;->d:Lcom/huawei/pluginmessagecenter/service/MessageObserverController;

    if-eqz v0, :cond_0

    .line 666
    iget-object v0, p0, Lo/eah;->d:Lcom/huawei/pluginmessagecenter/service/MessageObserverController;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->clear()V

    .line 668
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)Z
    .locals 14

    .line 601
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onRead msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    if-nez p1, :cond_0

    .line 603
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRead(String msgId):msgId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    const/4 v0, 0x0

    return v0

    .line 606
    :cond_0
    invoke-virtual {p0, p1}, Lo/eah;->g(Ljava/lang/String;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v6

    .line 607
    if-nez v6, :cond_1

    .line 608
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRead(String msgId):messageObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    const/4 v0, 0x0

    return v0

    .line 615
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgType()I

    move-result v7

    .line 616
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 617
    const-string v0, "readFlag"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 619
    const/4 v0, 0x3

    if-ne v7, v0, :cond_2

    .line 621
    const-string v0, "23:59:59"

    invoke-static {v0}, Lo/eae;->c(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/eae;->c(J)J

    move-result-wide v9

    .line 622
    const-string v0, "expireTime"

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 623
    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne v7, v0, :cond_3

    .line 624
    const-string v0, "expireTime"

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 626
    :cond_3
    :goto_0
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 627
    const-string v0, "msgId"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 628
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 629
    move-object v0, p0

    const-string v1, "message"

    move-object v3, v8

    .line 630
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v10

    .line 629
    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/eah;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v11

    .line 631
    if-lez v11, :cond_4

    const v0, 0x31128

    if-eq v11, v0, :cond_4

    .line 632
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 633
    invoke-virtual {v12, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    new-instance v13, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;

    const/4 v0, 0x0

    invoke-direct {v13, v12, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 635
    const/4 v0, 0x0

    invoke-direct {p0, v0, v13}, Lo/eah;->c(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    .line 636
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave onRead msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    const/4 v0, 0x1

    return v0

    .line 639
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/util/List;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)Z"
        }
    .end annotation

    .line 320
    const-class v4, Lo/eaa;

    monitor-enter v4

    .line 321
    :try_start_0
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter insertBatch "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    if-nez p1, :cond_0

    .line 323
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertBatch | MessageObject List is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 324
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 327
    :cond_0
    const/4 v5, 0x0

    .line 328
    :try_start_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 329
    iget-object v0, p0, Lo/eah;->e:Landroid/content/Context;

    invoke-virtual {p0}, Lo/eah;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dcl;->e(Landroid/content/Context;Ljava/lang/String;)Lo/dcl;

    move-result-object v0

    invoke-virtual {v0}, Lo/dcl;->b()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v7

    .line 330
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 331
    invoke-virtual {v7}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransaction()V

    .line 332
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 333
    invoke-static {v9}, Lo/eag;->b(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 334
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "column check failed."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    goto :goto_0

    .line 337
    :cond_1
    invoke-direct {p0, v9}, Lo/eah;->d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 339
    add-int/lit8 v5, v5, 0x1

    .line 340
    invoke-virtual {v9}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    :cond_2
    goto :goto_0

    .line 343
    :cond_3
    invoke-virtual {v7}, Lnet/sqlcipher/database/SQLiteDatabase;->setTransactionSuccessful()V

    .line 344
    invoke-virtual {v7}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 346
    :cond_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v5, v0, :cond_5

    const/4 v8, 0x1

    goto :goto_1

    :cond_5
    const/4 v8, 0x0

    .line 347
    :goto_1
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertBatch count = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", result = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    if-eqz v8, :cond_6

    .line 349
    new-instance v9, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;

    const/4 v0, 0x0

    invoke-direct {v9, v6, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 350
    const/4 v0, 0x0

    invoke-direct {p0, v0, v9}, Lo/eah;->c(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    .line 351
    goto :goto_2

    .line 352
    :cond_6
    new-instance v9, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;

    const/4 v0, 0x0

    invoke-direct {v9, v6, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 353
    const/4 v0, -0x1

    invoke-direct {p0, v0, v9}, Lo/eah;->c(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    .line 355
    :goto_2
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave insertBatch "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 356
    monitor-exit v4

    return v8

    .line 357
    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1004
    const-string v0, "lastLanguage_key"

    invoke-virtual {p0, v0}, Lo/eah;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V
    .locals 4

    .line 512
    if-nez p1, :cond_0

    .line 513
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Observer object maybe not create."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    return-void

    .line 516
    :cond_0
    iget-object v0, p0, Lo/eah;->d:Lcom/huawei/pluginmessagecenter/service/MessageObserverController;

    invoke-virtual {v0, p1}, Lcom/huawei/pluginmessagecenter/service/MessageObserverController;->addObservers(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 517
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 471
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "revokeList="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 473
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 474
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "G"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 475
    invoke-virtual {p0, v5}, Lo/eah;->g(Ljava/lang/String;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v6

    .line 476
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 477
    invoke-virtual {p0, v5}, Lo/eah;->b(Ljava/lang/String;)V

    .line 473
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 481
    :cond_1
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 11

    .line 575
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onShowSmartCard msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    if-nez p1, :cond_0

    .line 577
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onShowSmartCard(String msgId):msgId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    const/4 v0, 0x0

    return v0

    .line 580
    :cond_0
    invoke-virtual {p0, p1}, Lo/eah;->g(Ljava/lang/String;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v6

    .line 581
    if-nez v6, :cond_1

    .line 582
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onShowSmartCard(String msgId):messageObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    const/4 v0, 0x0

    return v0

    .line 585
    :cond_1
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 586
    const-string v0, "readFlag"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 587
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 588
    const-string v0, "msgId"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 589
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 590
    move-object v0, p0

    const-string v1, "message"

    move-object v3, v7

    .line 591
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v9

    .line 590
    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/eah;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v10

    .line 592
    if-lez v10, :cond_2

    const v0, 0x31128

    if-eq v10, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 6

    .line 440
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter doRefresh !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    invoke-direct {p0}, Lo/eah;->n()J

    move-result-wide v4

    .line 442
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-gez v0, :cond_0

    .line 443
    new-instance v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    const/4 v1, -0x1

    invoke-direct {p0, v1, v0}, Lo/eah;->c(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    .line 444
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doRefresh because maxTime < 0 return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    return-void

    .line 448
    :cond_0
    invoke-static {}, Lcom/huawei/pluginmessagecenter/service/MessagePuller;->getInstance()Lcom/huawei/pluginmessagecenter/service/MessagePuller;

    move-result-object v0

    iget-object v1, p0, Lo/eah;->e:Landroid/content/Context;

    new-instance v2, Lo/eah$2;

    invoke-direct {v2, p0, v4, v5}, Lo/eah$2;-><init>(Lo/eah;J)V

    invoke-virtual {v0, v1, v4, v5, v2}, Lcom/huawei/pluginmessagecenter/service/MessagePuller;->pullMessage(Landroid/content/Context;JLo/eak;)V

    .line 464
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave doRefresh !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    return-void
.end method

.method public e(Ljava/lang/String;)Z
    .locals 13

    .line 540
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onExpired msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    if-nez p1, :cond_0

    .line 542
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onExpired(String msgId):msgId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    const/4 v0, 0x0

    return v0

    .line 545
    :cond_0
    invoke-virtual {p0, p1}, Lo/eah;->g(Ljava/lang/String;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v6

    .line 546
    if-nez v6, :cond_1

    .line 547
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onExpired(String msgId):messageObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    const/4 v0, 0x0

    return v0

    .line 550
    :cond_1
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 551
    const-string v0, "expireTime"

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 552
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 553
    const-string v0, "msgId"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 554
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 555
    move-object v0, p0

    const-string v1, "message"

    move-object v3, v7

    .line 556
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v9

    .line 555
    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/eah;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v10

    .line 558
    if-lez v10, :cond_2

    const v0, 0x31128

    if-eq v10, v0, :cond_2

    .line 559
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 560
    invoke-virtual {v11, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    new-instance v12, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;

    const/4 v0, 0x0

    invoke-direct {v12, v11, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 562
    const/4 v0, 0x0

    invoke-direct {p0, v0, v12}, Lo/eah;->c(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    .line 563
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave onExpired msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    const/4 v0, 0x1

    return v0

    .line 566
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 5

    .line 957
    const-string v0, "push_token_key"

    new-instance v1, Lo/dcy;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lo/dcy;-><init>(I)V

    invoke-virtual {p0, v0, p1, v1}, Lo/eah;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v4

    .line 958
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save push token result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 959
    return-void
.end method

.method public g(Ljava/lang/String;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;
    .locals 6

    .line 813
    const/4 v2, 0x0

    .line 815
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "message"

    invoke-virtual {p0, v1}, Lo/eah;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "msgId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 817
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    .line 818
    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 821
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v3, v4}, Lo/eah;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 823
    if-eqz v5, :cond_1

    .line 824
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 825
    invoke-static {v5}, Lo/eag;->b(Landroid/database/Cursor;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v2

    .line 827
    :cond_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 829
    :cond_1
    return-object v2
.end method

.method protected final getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 784
    const/16 v0, 0x4e25

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 5

    .line 941
    const-string v0, "currentHuid_key"

    new-instance v1, Lo/dcy;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lo/dcy;-><init>(I)V

    invoke-virtual {p0, v0, p1, v1}, Lo/eah;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v4

    .line 942
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save uid result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 943
    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 5

    .line 949
    const-string v0, "lastLanguage_key"

    new-instance v1, Lo/dcy;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lo/dcy;-><init>(I)V

    invoke-virtual {p0, v0, p1, v1}, Lo/eah;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v4

    .line 950
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save lan result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 951
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 11

    .line 788
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 789
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setNotify | msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 790
    return-void

    .line 792
    :cond_0
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 793
    const-string v0, "notified"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 795
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "msgId = \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 796
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setNotify | whereSql = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 798
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 799
    const-string v0, "msgId"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 800
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/eag;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 802
    move-object v0, p0

    const-string v1, "message"

    move-object v3, v6

    .line 803
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v9

    .line 802
    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/eah;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v10

    .line 804
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setNotify | updateStorageData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 5

    .line 994
    const-string v0, "currentDeviceId_key"

    new-instance v1, Lo/dcy;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lo/dcy;-><init>(I)V

    invoke-virtual {p0, v0, p1, v1}, Lo/eah;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v4

    .line 995
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save device result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 996
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 1018
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 1019
    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 5

    .line 980
    const-string v0, "lastHuid_key"

    new-instance v1, Lo/dcy;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lo/dcy;-><init>(I)V

    invoke-virtual {p0, v0, p1, v1}, Lo/eah;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v4

    .line 981
    sget-object v0, Lo/eah;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save push uid result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 982
    return-void
.end method
