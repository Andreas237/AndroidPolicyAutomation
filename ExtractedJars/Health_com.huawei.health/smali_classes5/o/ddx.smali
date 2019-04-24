.class public Lo/ddx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ddx$c;
    }
.end annotation


# static fields
.field private static b:Lo/ddx;


# instance fields
.field private A:Z

.field private B:I

.field private C:[B

.field private D:I

.field private E:Z

.field private F:I

.field private G:D

.field private H:I

.field private I:I

.field private J:Lo/ddf;

.field private K:Z

.field private M:Lo/ddf;

.field private N:Lo/ddj;

.field private a:I

.field private c:Lo/cys;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:I

.field private h:[B

.field private i:I

.field private j:I

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:I

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private o:I

.field private p:Ljava/io/File;

.field private q:Lo/dds;

.field private r:I

.field private s:Lo/yc;

.field private t:I

.field private u:Z

.field private v:Z

.field private w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/ddl;>;"
        }
    .end annotation
.end field

.field private x:Landroid/os/HandlerThread;

.field private y:Lo/ddx$c;

.field private z:Lo/ddi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    const/4 v0, 0x0

    sput-object v0, Lo/ddx;->b:Lo/ddx;

    return-void
.end method

.method constructor <init>(Lo/cys;Ljava/lang/String;I)V
    .locals 4

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddx;->c:Lo/cys;

    .line 55
    const-string v0, ""

    iput-object v0, p0, Lo/ddx;->d:Ljava/lang/String;

    .line 56
    const/4 v0, -0x1

    iput v0, p0, Lo/ddx;->a:I

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lo/ddx;->e:I

    .line 65
    const/16 v0, 0x80

    iput v0, p0, Lo/ddx;->i:I

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->g:I

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    .line 83
    const/16 v0, 0xbb8

    iput v0, p0, Lo/ddx;->r:I

    .line 85
    const/16 v0, 0x80

    iput v0, p0, Lo/ddx;->t:I

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->u:Z

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ddx;->w:Ljava/util/ArrayList;

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    .line 118
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->v:Z

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddx;->C:[B

    .line 135
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->D:I

    .line 136
    const/16 v0, 0x7530

    iput v0, p0, Lo/ddx;->B:I

    .line 137
    const v0, 0x2bf20

    iput v0, p0, Lo/ddx;->j:I

    .line 141
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->A:Z

    .line 143
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ddx;->G:D

    .line 145
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->E:Z

    .line 147
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->H:I

    .line 149
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->I:I

    .line 151
    const/16 v0, 0xa

    iput v0, p0, Lo/ddx;->F:I

    .line 153
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->K:Z

    .line 867
    new-instance v0, Lo/ddx$1;

    invoke-direct {v0, p0}, Lo/ddx$1;-><init>(Lo/ddx;)V

    iput-object v0, p0, Lo/ddx;->J:Lo/ddf;

    .line 1018
    new-instance v0, Lo/ddx$5;

    invoke-direct {v0, p0}, Lo/ddx$5;-><init>(Lo/ddx;)V

    iput-object v0, p0, Lo/ddx;->M:Lo/ddf;

    .line 173
    iput-object p1, p0, Lo/ddx;->c:Lo/cys;

    .line 174
    iput-object p2, p0, Lo/ddx;->d:Ljava/lang/String;

    .line 175
    iput p3, p0, Lo/ddx;->a:I

    .line 176
    const-string v0, ""

    iput-object v0, p0, Lo/ddx;->k:Ljava/lang/String;

    .line 178
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ddj;->b(Landroid/content/Context;)Lo/ddj;

    move-result-object v0

    iput-object v0, p0, Lo/ddx;->N:Lo/ddj;

    .line 179
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OTATransferFile init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    return-void
.end method

.method static synthetic a(Lo/ddx;)Landroid/os/HandlerThread;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .line 337
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initOtaV2File, filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 342
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 344
    invoke-direct {p0, v5, p1}, Lo/ddx;->d(Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 345
    invoke-virtual {v5}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-nez v0, :cond_0

    .line 346
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTransferOTAFile, The file already exists...continue..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v4

    .line 350
    iget-object v0, p0, Lo/ddx;->C:[B

    if-nez v0, :cond_1

    .line 351
    invoke-direct {p0, v4}, Lo/ddx;->b(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lo/ddx;->C:[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 356
    :cond_1
    goto :goto_0

    .line 354
    :catch_0
    move-exception v5

    .line 355
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    :goto_0
    return-void
.end method

.method private a(Lo/daj;)V
    .locals 10

    .line 1126
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1127
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "otaStatus is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    return-void

    .line 1131
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendOTAFileData,ReceivedIndex()--------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/daj;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendOTAFileData,getPackageVersion------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/daj;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1133
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendOTAFileData,getPackageOffset()-----"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/daj;->b()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    invoke-virtual {p1}, Lo/daj;->e()Ljava/util/List;

    move-result-object v6

    .line 1137
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1138
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 1139
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lo/ddx;->f:I

    if-gt v0, v1, :cond_1

    .line 1141
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1143
    :cond_1
    goto :goto_0

    .line 1146
    :cond_2
    const/4 v7, 0x0

    .line 1148
    const/4 v8, 0x0

    .line 1149
    iget v0, p0, Lo/ddx;->e:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    .line 1151
    :pswitch_0
    iget-object v0, p0, Lo/ddx;->k:Ljava/lang/String;

    invoke-virtual {p1}, Lo/daj;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1152
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "otaStatus.getPackageVersion. need breakpoint"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1153
    const/4 v8, 0x1

    .line 1154
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPackageReceivedIndex(),receivedIndex()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/daj;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1155
    invoke-virtual {p1}, Lo/daj;->b()J

    move-result-wide v0

    iget v2, p0, Lo/ddx;->i:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Lo/ddx;->o:I

    .line 1157
    iget v0, p0, Lo/ddx;->o:I

    invoke-virtual {p1}, Lo/daj;->c()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 1158
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1159
    const/4 v8, 0x0

    .line 1160
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->o:I

    goto :goto_1

    .line 1163
    :cond_3
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCurrentOtaVersion != otaStatus.getPackageVersion. don\'t need breakpoint,currentVersion="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",otaStatus="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1165
    invoke-virtual {p1}, Lo/daj;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1163
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1167
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 1168
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1170
    :cond_4
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->o:I

    .line 1173
    :cond_5
    :goto_1
    move-object v0, p0

    :try_start_0
    iget-object v1, p0, Lo/ddx;->k:Ljava/lang/String;

    iget v2, p0, Lo/ddx;->m:I

    iget-object v3, p0, Lo/ddx;->p:Ljava/io/File;

    .line 1175
    invoke-static {v3}, Lo/fka;->c(Ljava/io/File;)J

    move-result-wide v3

    move v5, v8

    .line 1173
    invoke-virtual/range {v0 .. v5}, Lo/ddx;->c(Ljava/lang/String;IJI)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 1185
    goto :goto_2

    .line 1176
    :catch_0
    move-exception v9

    .line 1177
    iget-boolean v0, p0, Lo/ddx;->l:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1178
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    iget-object v1, p0, Lo/ddx;->d:Ljava/lang/String;

    const-string v2, "\u5347\u7ea7\u6587\u4ef6\u4e0d\u5b58\u5728 "

    const v3, 0x19643

    invoke-interface {v0, v1, v3, v2}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 1181
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->g:I

    .line 1182
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->l:Z

    .line 1184
    :cond_6
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1186
    :goto_2
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OTA_MODE_AUTO:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1187
    const/4 v0, 0x0

    if-ne v0, v7, :cond_7

    .line 1188
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---data is null---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1189
    return-void

    .line 1192
    :cond_7
    invoke-direct {p0, v7}, Lo/ddx;->d([B)V

    .line 1193
    goto/16 :goto_5

    .line 1195
    :pswitch_1
    iget-object v0, p0, Lo/ddx;->k:Ljava/lang/String;

    invoke-virtual {p1}, Lo/daj;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1197
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCurrentOtaVersion == otaStatus.getPackageVersion. need breakpoint"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1198
    const/4 v8, 0x1

    .line 1199
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPackageReceivedIndex(),receivedIndex()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/daj;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1200
    invoke-virtual {p1}, Lo/daj;->b()J

    move-result-wide v0

    iget v2, p0, Lo/ddx;->i:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Lo/ddx;->o:I

    .line 1201
    iget v0, p0, Lo/ddx;->o:I

    invoke-virtual {p1}, Lo/daj;->c()I

    move-result v1

    if-eq v0, v1, :cond_a

    .line 1202
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1203
    const/4 v8, 0x0

    .line 1204
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->o:I

    goto :goto_3

    .line 1208
    :cond_8
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCurrentOtaVersion != otaStatus.getPackageVersion. not need breakpoint,currentVersion="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",getPackageVersion="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1210
    invoke-virtual {p1}, Lo/daj;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1208
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1211
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 1212
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1214
    :cond_9
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->o:I

    .line 1217
    :cond_a
    :goto_3
    move-object v0, p0

    :try_start_1
    iget-object v1, p0, Lo/ddx;->k:Ljava/lang/String;

    iget v2, p0, Lo/ddx;->m:I

    iget-object v3, p0, Lo/ddx;->p:Ljava/io/File;

    .line 1219
    invoke-static {v3}, Lo/fka;->c(Ljava/io/File;)J

    move-result-wide v3

    move v5, v8

    .line 1217
    invoke-virtual/range {v0 .. v5}, Lo/ddx;->c(Ljava/lang/String;IJI)[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v7, v0

    .line 1230
    goto :goto_4

    .line 1220
    :catch_1
    move-exception v9

    .line 1221
    iget-boolean v0, p0, Lo/ddx;->l:Z

    if-eqz v0, :cond_b

    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 1222
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    iget-object v1, p0, Lo/ddx;->d:Ljava/lang/String;

    const-string v2, "\u5347\u7ea7\u6587\u4ef6\u4e0d\u5b58\u5728 "

    const v3, 0x19643

    invoke-interface {v0, v1, v3, v2}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 1226
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->g:I

    .line 1227
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->l:Z

    .line 1229
    :cond_b
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1231
    :goto_4
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OTA_MODE_TRANSFER:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1232
    const/4 v0, 0x0

    if-ne v0, v7, :cond_c

    .line 1233
    return-void

    .line 1236
    :cond_c
    invoke-direct {p0, v7}, Lo/ddx;->d([B)V

    .line 1237
    goto/16 :goto_5

    .line 1239
    :pswitch_2
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_f

    .line 1241
    iget v0, p0, Lo/ddx;->o:I

    iget-object v1, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/ddx;->o:I

    .line 1242
    iget v0, p0, Lo/ddx;->o:I

    if-gez v0, :cond_d

    .line 1243
    goto/16 :goto_5

    .line 1245
    :cond_d
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_e

    .line 1246
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 1248
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1249
    const/4 v0, 0x1

    invoke-direct {p0, v9, v0}, Lo/ddx;->e(IZ)V

    .line 1250
    goto :goto_5

    .line 1251
    :cond_e
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OTA_MODE_ERROR_PACKAGE,mErrorPackages.size != 0 , mErrorPackages.size= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx;->n:Ljava/util/List;

    .line 1252
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1251
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1253
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 1254
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1255
    const/4 v0, 0x0

    invoke-direct {p0, v9, v0}, Lo/ddx;->e(IZ)V

    .line 1256
    goto :goto_5

    .line 1258
    :cond_f
    iget v0, p0, Lo/ddx;->o:I

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ddx;->e(IZ)V

    .line 1260
    .line 1264
    :goto_5
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private a([B)V
    .locals 5

    .line 657
    array-length v0, p1

    add-int/lit8 v0, v0, -0x2

    new-array v3, v0, [B

    .line 658
    array-length v0, v3

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 660
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 661
    const/16 v0, 0x9

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 662
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 663
    invoke-virtual {v4, v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 664
    array-length v0, v3

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 666
    invoke-virtual {p0, v4}, Lo/ddx;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 667
    return-void
.end method

.method static synthetic b(Lo/ddx;I)I
    .locals 0

    .line 49
    iput p1, p0, Lo/ddx;->e:I

    return p1
.end method

.method public static b(B)Ljava/lang/String;
    .locals 3

    .line 1843
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, p0, 0x7

    and-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, p0, 0x6

    and-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, p0, 0x5

    and-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, p0, 0x4

    and-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, p0, 0x3

    and-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, p0, 0x2

    and-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, p0, 0x1

    and-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, p0, 0x0

    and-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(ILjava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 1805
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1806
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1807
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseAck , received_index == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1808
    return-object v4

    .line 1810
    :cond_0
    invoke-static {p2}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v5

    .line 1811
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1812
    move-object v7, v5

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_1

    aget-byte v10, v7, v9

    .line 1813
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-static {v10}, Lo/ddx;->b(B)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->reverse()Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1812
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 1815
    :cond_1
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1816
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseAck, bufferStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1818
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v8, v0, :cond_4

    .line 1819
    const-string v0, "0"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1820
    iget v0, p0, Lo/ddx;->t:I

    rem-int v0, p1, v0

    if-nez v0, :cond_2

    .line 1821
    add-int/lit8 v0, v8, 0x1

    add-int/2addr v0, p1

    iget v1, p0, Lo/ddx;->t:I

    sub-int v9, v0, v1

    .line 1822
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1823
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mErrorPackages, package_index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1824
    goto :goto_2

    .line 1825
    :cond_2
    iget v0, p0, Lo/ddx;->t:I

    div-int v9, p1, v0

    .line 1826
    add-int/lit8 v0, v8, 0x1

    iget v1, p0, Lo/ddx;->t:I

    mul-int/2addr v1, v9

    add-int v10, v0, v1

    .line 1827
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1828
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mErrorPackages, package_index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1818
    :cond_3
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 1832
    :cond_4
    return-object v4
.end method

.method static synthetic b(Lo/ddx;)Lo/ddi;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    return-object v0
.end method

.method private b(Ljava/lang/String;I)Lo/ddt;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1951
    add-int/lit8 v0, p2, 0x2

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 1952
    const/16 v0, 0x10

    invoke-static {v2, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 1953
    const/4 v4, 0x0

    .line 1954
    const/4 v5, 0x0

    .line 1955
    const/4 v6, 0x0

    .line 1956
    const/4 v7, 0x0

    .line 1958
    :goto_0
    ushr-int/lit8 v0, v3, 0x7

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1959
    const/4 v0, 0x4

    if-ge v7, v0, :cond_0

    .line 1961
    add-int/lit8 p2, p2, 0x2

    .line 1963
    and-int/lit8 v3, v3, 0x7f

    .line 1964
    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    .line 1966
    :sswitch_0
    move v5, v3

    .line 1967
    goto :goto_1

    .line 1969
    :sswitch_1
    move v6, v3

    .line 1970
    .line 1975
    :goto_1
    add-int/lit8 v0, p2, 0x2

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 1977
    const/16 v0, 0x10

    invoke-static {v2, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 1978
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1981
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    throw v0

    .line 1985
    :cond_1
    const/4 v0, 0x2

    if-ne v0, v7, :cond_2

    .line 1986
    mul-int/lit16 v0, v5, 0x4000

    mul-int/lit16 v1, v6, 0x80

    add-int/2addr v0, v1

    add-int v4, v0, v3

    goto :goto_2

    .line 1989
    :cond_2
    const/4 v0, 0x1

    if-ne v0, v7, :cond_3

    .line 1990
    mul-int/lit16 v0, v5, 0x80

    add-int v4, v0, v3

    goto :goto_2

    .line 1994
    :cond_3
    add-int/lit8 v4, v3, 0x0

    .line 1997
    :goto_2
    add-int/lit8 p2, p2, 0x2

    .line 1998
    new-instance v0, Lo/ddt;

    invoke-direct {v0, v4, p2}, Lo/ddt;-><init>(II)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic b(Lo/ddx;Lo/ddx$c;)Lo/ddx$c;
    .locals 0

    .line 49
    iput-object p1, p0, Lo/ddx;->y:Lo/ddx$c;

    return-object p1
.end method

.method private b(Lo/ddh;)V
    .locals 9

    .line 428
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 430
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/ddx$c;->removeMessages(I)V

    .line 431
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is have message "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v4, 0x6

    invoke-virtual {v3, v4}, Lo/ddx$c;->hasMessages(I)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    :cond_0
    invoke-virtual {p1}, Lo/ddh;->d()J

    move-result-wide v0

    long-to-int v5, v0

    .line 436
    invoke-virtual {p1}, Lo/ddh;->a()J

    move-result-wide v0

    long-to-int v6, v0

    .line 438
    invoke-virtual {p1}, Lo/ddh;->b()Ljava/util/List;

    move-result-object v7

    .line 439
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "APP\u6536\u5230\u5355\u677f\u7533\u8bf7\u6570\u636e\u4e3b\u52a8\u4e0a\u62a5,file_offset = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", file_length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    invoke-direct {p0, v5, v6, v7}, Lo/ddx;->d(IILjava/util/List;)V

    .line 442
    iget-boolean v0, p0, Lo/ddx;->E:Z

    if-eqz v0, :cond_2

    .line 443
    iget v0, p0, Lo/ddx;->H:I

    iget v1, p0, Lo/ddx;->I:I

    add-int/2addr v0, v1

    int-to-double v0, v0

    iget-wide v2, p0, Lo/ddx;->G:D

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v8, v0

    .line 444
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 445
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    iget-object v1, p0, Lo/ddx;->d:Ljava/lang/String;

    invoke-interface {v0, v1, v8}, Lo/yc;->a(Ljava/lang/String;I)V

    .line 447
    :cond_1
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f53\u524d\u5347\u7ea7\u8fdb\u5ea6\u4e3a progress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mAlreadySend = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->H:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", file_length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx;->C:[B

    array-length v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ". mOtaFileSizeV2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/ddx;->G:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    :cond_2
    return-void
.end method

.method static synthetic b(Lo/ddx;Lo/daj;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lo/ddx;->a(Lo/daj;)V

    return-void
.end method

.method private b([B)V
    .locals 8

    .line 674
    iget-boolean v0, p0, Lo/ddx;->K:Z

    if-eqz v0, :cond_0

    .line 675
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OTA V2 Upgrade failed, do nothing."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    return-void

    .line 679
    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_9

    .line 681
    array-length v4, p1

    .line 682
    new-array v5, v4, [I

    .line 683
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_2

    .line 684
    aget-byte v0, p1, v6

    aput v0, v5, v6

    .line 685
    aget v0, v5, v6

    if-gez v0, :cond_1

    .line 686
    aget v0, v5, v6

    add-int/lit16 v0, v0, 0x100

    aput v0, v5, v6

    .line 683
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 690
    :cond_2
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_5

    .line 691
    const/4 v0, 0x2

    aget v0, v5, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_3

    .line 692
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error,do nothing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    return-void

    .line 696
    :cond_3
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.9.3\u8bbe\u5907\u6570\u636e\u7533\u8bf7\u4e3b\u52a8\u4e0a\u62a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    iget-boolean v0, p0, Lo/ddx;->A:Z

    if-eqz v0, :cond_4

    .line 699
    invoke-direct {p0, p1}, Lo/ddx;->a([B)V

    .line 701
    :cond_4
    new-instance v6, Lo/ddh;

    invoke-direct {v6}, Lo/ddh;-><init>()V

    .line 703
    :try_start_0
    iget-object v0, p0, Lo/ddx;->N:Lo/ddj;

    invoke-virtual {v0, p1}, Lo/ddj;->a([B)Lo/ddh;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 706
    goto :goto_1

    .line 704
    :catch_0
    move-exception v7

    .line 705
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OTAV2NotificationMsg Error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 707
    :goto_1
    invoke-direct {p0, v6}, Lo/ddx;->b(Lo/ddh;)V

    .line 708
    goto/16 :goto_5

    :cond_5
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_6

    .line 709
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.9.5\u5347\u7ea7\u5305\u5927\u5c0f\u4e3b\u52a8\u4e0a\u62a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    new-instance v6, Lo/ddp;

    invoke-direct {v6}, Lo/ddp;-><init>()V

    .line 712
    :try_start_1
    iget-object v0, p0, Lo/ddx;->N:Lo/ddj;

    invoke-virtual {v0, p1}, Lo/ddj;->c([B)Lo/ddp;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 715
    goto :goto_2

    .line 713
    :catch_1
    move-exception v7

    .line 714
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    :goto_2
    invoke-direct {p0, v6}, Lo/ddx;->e(Lo/ddp;)V

    .line 717
    goto/16 :goto_5

    :cond_6
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x6

    if-ne v1, v0, :cond_7

    .line 718
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.9.6\u5347\u7ea7\u5305\u6821\u9a8c\u7ed3\u679c\u4e3b\u52a8\u4e0a\u62a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    const/4 v6, 0x0

    .line 721
    :try_start_2
    iget-object v0, p0, Lo/ddx;->N:Lo/ddj;

    invoke-virtual {v0, p1}, Lo/ddj;->k([B)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result v0

    move v6, v0

    .line 724
    goto :goto_3

    .line 722
    :catch_2
    move-exception v7

    .line 723
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    :goto_3
    invoke-direct {p0, v6}, Lo/ddx;->c(I)V

    .line 726
    goto :goto_5

    :cond_7
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x7

    if-ne v1, v0, :cond_8

    .line 727
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.9.7\u8bbe\u5907\u5347\u7ea7\u72b6\u6001\u4e0a\u62a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 728
    const/4 v6, 0x0

    .line 730
    :try_start_3
    iget-object v0, p0, Lo/ddx;->N:Lo/ddj;

    invoke-virtual {v0, p1}, Lo/ddj;->f([B)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-result v0

    move v6, v0

    .line 733
    goto :goto_4

    .line 731
    :catch_3
    move-exception v7

    .line 732
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 734
    :goto_4
    invoke-direct {p0, v6}, Lo/ddx;->d(I)V

    .line 736
    :cond_8
    :goto_5
    goto :goto_7

    :cond_9
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_a

    .line 738
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/16 v1, 0x11

    if-ne v1, v0, :cond_a

    .line 741
    :try_start_4
    iget-object v0, p0, Lo/ddx;->N:Lo/ddj;

    invoke-virtual {v0, p1}, Lo/ddj;->h([B)I

    move-result v0

    iput v0, p0, Lo/ddx;->F:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 744
    goto :goto_6

    .line 742
    :catch_4
    move-exception v4

    .line 743
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 745
    :goto_6
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.1.17 mSendInterval = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->F:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 748
    :cond_a
    :goto_7
    return-void
.end method

.method static synthetic b(Lo/ddx;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lo/ddx;->u:Z

    return p1
.end method

.method private b(I)[B
    .locals 6

    .line 1512
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPacketData, packageIndex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1513
    if-ltz p1, :cond_0

    iget v0, p0, Lo/ddx;->f:I

    if-le p1, v0, :cond_1

    .line 1514
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPacketData, packageIndex < 0  or packageIndex > mChunksTotal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1515
    const/4 v0, 0x0

    return-object v0

    .line 1517
    :cond_1
    const/4 v4, 0x0

    .line 1518
    iget v5, p0, Lo/ddx;->i:I

    .line 1519
    iget v0, p0, Lo/ddx;->f:I

    if-ne p1, v0, :cond_3

    .line 1520
    iget v0, p0, Lo/ddx;->m:I

    iget v1, p0, Lo/ddx;->i:I

    rem-int/2addr v0, v1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1521
    iget v0, p0, Lo/ddx;->m:I

    iget v1, p0, Lo/ddx;->i:I

    rem-int v5, v0, v1

    .line 1523
    :cond_2
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "last package, size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1525
    :cond_3
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPacketData,size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1526
    new-array v4, v5, [B

    .line 1527
    iget-object v0, p0, Lo/ddx;->h:[B

    add-int/lit8 v1, p1, -0x1

    iget v2, p0, Lo/ddx;->i:I

    mul-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v1, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1528
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPacketData , data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1529
    return-object v4
.end method

.method private b(Ljava/lang/String;)[B
    .locals 11

    .line 365
    const/4 v0, 0x0

    new-array v4, v0, [B

    .line 366
    invoke-virtual {p0, p1}, Lo/ddx;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 367
    return-object v4

    .line 369
    :cond_0
    const/4 v5, 0x0

    .line 371
    :try_start_0
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 372
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 373
    invoke-virtual {v6}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-nez v0, :cond_1

    .line 374
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOTAFileByPath, The file already exists...continue..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    :cond_1
    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v7, v0

    .line 378
    const/4 v4, 0x0

    .line 379
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v5, v0

    .line 380
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    new-array v0, v7, [B

    move-object v4, v0

    .line 382
    invoke-virtual {v5, v4}, Ljava/io/FileInputStream;->read([B)I

    move-result v8

    .line 383
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getOTAFileByPath ret = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 389
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 391
    :try_start_1
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 394
    goto/16 :goto_1

    .line 392
    :catch_0
    move-exception v6

    .line 393
    const-string v0, "OTATransferFile"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException getOTAFileByPath() finally e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    goto :goto_1

    .line 386
    :catch_1
    move-exception v6

    .line 387
    const-string v0, "OTATransferFile"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException getOTAFileByPath() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 389
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 391
    :try_start_3
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 394
    goto :goto_1

    .line 392
    :catch_2
    move-exception v6

    .line 393
    const-string v0, "OTATransferFile"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException getOTAFileByPath() finally e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    goto :goto_1

    .line 389
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 391
    :try_start_4
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 394
    goto :goto_0

    .line 392
    :catch_3
    move-exception v10

    .line 393
    const-string v0, "OTATransferFile"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException getOTAFileByPath() finally e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    :cond_2
    :goto_0
    throw v9

    .line 397
    :cond_3
    :goto_1
    return-object v4
.end method

.method static synthetic c(Lo/ddx;)Lo/yc;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    return-object v0
.end method

.method private c(I)V
    .locals 4

    .line 476
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->E:Z

    .line 478
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/ddx$c;->removeMessages(I)V

    .line 479
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 480
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0a\u62a5UI\uff0c\u5347\u7ea7\u5931\u8d25 !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 482
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    iget-object v1, p0, Lo/ddx;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/yc;->b(Ljava/lang/String;I)V

    .line 484
    :cond_0
    invoke-virtual {p0}, Lo/ddx;->a()V

    goto :goto_0

    .line 485
    :cond_1
    const/4 v0, 0x1

    if-ne v0, p1, :cond_3

    .line 486
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0a\u62a5UI,\u5347\u7ea7\u6210\u529f \u5f00\u542f\u5355\u677f\u91cd\u542f\u5347\u7ea7\u8d85\u65f6 : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 488
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    iget-object v1, p0, Lo/ddx;->d:Ljava/lang/String;

    iget v2, p0, Lo/ddx;->j:I

    invoke-interface {v0, v1, v2}, Lo/yc;->b(Ljava/lang/String;I)V

    .line 490
    :cond_2
    invoke-virtual {p0}, Lo/ddx;->a()V

    .line 492
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/ddx;IZ)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2}, Lo/ddx;->e(IZ)V

    return-void
.end method

.method private c()Z
    .locals 1

    .line 891
    iget-boolean v0, p0, Lo/ddx;->u:Z

    return v0
.end method

.method static synthetic c(Lo/ddx;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lo/ddx;->l:Z

    return p1
.end method

.method static synthetic d(Lo/ddx;)Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/ddx;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lo/ddx;Lo/dds;)Lo/dds;
    .locals 0

    .line 49
    iput-object p1, p0, Lo/ddx;->q:Lo/dds;

    return-object p1
.end method

.method private d(I)V
    .locals 4

    .line 514
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bbe\u5907\u5347\u7ea7\u72b6\u6001\u4e0a\u62a5,errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    const v0, 0x186a0

    if-eq v0, p1, :cond_1

    .line 516
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 517
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    iget-object v1, p0, Lo/ddx;->d:Ljava/lang/String;

    const-string v2, "\u8bbe\u5907\u5f02\u5e38"

    invoke-interface {v0, v1, p1, v2}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 520
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ddx;->K:Z

    .line 522
    :cond_1
    return-void
.end method

.method private d(IILjava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 530
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f00\u59cb\u4f20\u8f93\u5347\u7ea7\u6587\u4ef6 otaFileDelivery Enter ... mMaxPacket = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->D:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", file_Offset = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", fileLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    iget v0, p0, Lo/ddx;->D:I

    add-int/lit8 v4, v0, -0x9

    .line 536
    const/4 v5, 0x0

    .line 537
    rem-int v0, p2, v4

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 538
    div-int v5, p2, v4

    goto :goto_0

    .line 540
    :cond_0
    div-int v0, p2, v4

    add-int/lit8 v5, v0, 0x1

    .line 542
    :goto_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "otaFileDelivery, file_array = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    const/4 v6, 0x0

    .line 546
    move v7, p1

    .line 548
    const/4 v8, 0x0

    .line 550
    const/4 v9, 0x0

    .line 551
    const/4 v10, 0x0

    :goto_1
    if-ge v10, v5, :cond_9

    .line 552
    sub-int v0, p2, v9

    div-int/2addr v0, v4

    if-eqz v0, :cond_1

    .line 553
    move v8, v4

    goto :goto_2

    .line 556
    :cond_1
    rem-int v8, p2, v4

    .line 557
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5355\u6b21\u53d1\u9001\u6570\u636e\u4e3a\uff1a \u5269\u4e0b\u7684\u6570\u636e size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    :goto_2
    add-int v0, v7, p2

    sub-int/2addr v0, v9

    iget-object v1, p0, Lo/ddx;->C:[B

    array-length v1, v1

    if-le v0, v1, :cond_2

    .line 561
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "out of Index!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    iget-object v0, p0, Lo/ddx;->C:[B

    array-length v0, v0

    sub-int v8, v0, v7

    .line 565
    :cond_2
    const/4 v0, 0x0

    if-le v0, v8, :cond_4

    .line 566
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u504f\u79fb\u91cf\u5927\u4e8e\u6587\u4ef6\u957f\u5ea6"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 568
    iget-object v0, p0, Lo/ddx;->s:Lo/yc;

    iget-object v1, p0, Lo/ddx;->d:Ljava/lang/String;

    const-string v2, "\u4f20\u8f93\u5f02\u5e38"

    const v3, 0x19644

    invoke-interface {v0, v1, v3, v2}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 570
    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ddx;->K:Z

    .line 571
    return-void

    .line 574
    :cond_4
    new-array v11, v8, [B

    .line 576
    :try_start_0
    iget-object v0, p0, Lo/ddx;->C:[B

    const/4 v1, 0x0

    invoke-static {v0, v7, v11, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 579
    goto :goto_3

    .line 577
    :catch_0
    move-exception v12

    .line 578
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ArrayIndexOutOfBoundsException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    :goto_3
    const/16 v0, 0xff

    if-le v6, v0, :cond_5

    .line 582
    const/4 v6, 0x0

    .line 586
    :cond_5
    const/4 v12, 0x1

    .line 588
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-eq v0, v1, :cond_7

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_7

    .line 589
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check bitmap bitmapInfo.get("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    move-object/from16 v0, p3

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_6

    .line 592
    const/4 v12, 0x0

    goto :goto_4

    .line 595
    :cond_6
    iget v0, p0, Lo/ddx;->H:I

    sub-int/2addr v0, v8

    iput v0, p0, Lo/ddx;->H:I

    .line 600
    :cond_7
    :goto_4
    if-eqz v12, :cond_8

    .line 602
    invoke-direct {p0, v6, v11}, Lo/ddx;->d(I[B)V

    .line 604
    iget v0, p0, Lo/ddx;->H:I

    add-int/2addr v0, v8

    iput v0, p0, Lo/ddx;->H:I

    .line 606
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0b\u53d1\u5347\u7ea7\u6587\u4ef6\uff0c\u5e8f\u53f7 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u5185\u5bb9\u957f\u5ea6 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v11

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "ota_offset = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "sended_length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    :cond_8
    add-int/2addr v9, v8

    .line 612
    add-int/2addr v7, v4

    .line 614
    add-int/lit8 v6, v6, 0x1

    .line 551
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 617
    :cond_9
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u542f\u52a8\u95f2\u65f6\u7b49\u5f85\u8d85\u65f6"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_a

    .line 620
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "OTATransferFile"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    .line 621
    iget-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 622
    new-instance v0, Lo/ddx$c;

    iget-object v1, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/ddx$c;-><init>(Lo/ddx;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    .line 623
    iget v0, p0, Lo/ddx;->B:I

    if-eqz v0, :cond_b

    .line 624
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    iget v1, p0, Lo/ddx;->B:I

    int-to-long v1, v1

    const/4 v3, 0x6

    invoke-virtual {v0, v3, v1, v2}, Lo/ddx$c;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_5

    .line 627
    :cond_a
    iget v0, p0, Lo/ddx;->B:I

    if-eqz v0, :cond_b

    .line 628
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    iget v1, p0, Lo/ddx;->B:I

    int-to-long v1, v1

    const/4 v3, 0x6

    invoke-virtual {v0, v3, v1, v2}, Lo/ddx$c;->sendEmptyMessageDelayed(IJ)Z

    .line 631
    :cond_b
    :goto_5
    return-void
.end method

.method private d(I[B)V
    .locals 5

    .line 640
    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    .line 641
    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 642
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 644
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 645
    const/16 v0, 0x9

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 646
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 647
    invoke-static {v3}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 648
    invoke-static {v3}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 650
    invoke-virtual {p0, v4}, Lo/ddx;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 651
    return-void
.end method

.method private d([B)V
    .locals 2

    .line 1009
    new-instance v1, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1010
    invoke-virtual {v1, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1011
    array-length v0, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1012
    invoke-direct {p0, v1}, Lo/ddx;->e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1013
    return-void
.end method

.method private d(Ljava/io/File;Ljava/lang/String;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 410
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v4

    .line 412
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 413
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v6

    .line 415
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    const/4 v0, 0x1

    return v0

    .line 418
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "File is outside extraction target directory."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lo/ddx;I)I
    .locals 0

    .line 49
    iput p1, p0, Lo/ddx;->g:I

    return p1
.end method

.method static synthetic e(Lo/ddx;Landroid/os/HandlerThread;)Landroid/os/HandlerThread;
    .locals 0

    .line 49
    iput-object p1, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    return-object p1
.end method

.method static synthetic e(Lo/ddx;)Ljava/util/ArrayList;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/ddx;->w:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic e(Lo/ddx;Lo/ddi;)Lo/ddi;
    .locals 0

    .line 49
    iput-object p1, p0, Lo/ddx;->z:Lo/ddi;

    return-object p1
.end method

.method private e(IZ)V
    .locals 6

    .line 1374
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDfu, packageIndex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",isNeedAcK = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1375
    iget-boolean v0, p0, Lo/ddx;->l:Z

    if-nez v0, :cond_0

    .line 1376
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIsOTAState is false ,not OTA now"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1377
    return-void

    .line 1379
    :cond_0
    invoke-direct {p0, p1}, Lo/ddx;->b(I)[B

    move-result-object v4

    .line 1380
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 1381
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDfu, null == chunk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1383
    return-void

    .line 1385
    :cond_1
    new-instance v5, Lo/dds;

    invoke-direct {v5}, Lo/dds;-><init>()V

    .line 1386
    invoke-virtual {v5, p1}, Lo/dds;->e(I)V

    .line 1387
    iget v0, p0, Lo/ddx;->i:I

    invoke-virtual {v5, v0}, Lo/dds;->c(I)V

    .line 1388
    array-length v0, v4

    invoke-virtual {v5, v0}, Lo/dds;->a(I)V

    .line 1389
    iget v0, p0, Lo/ddx;->f:I

    invoke-virtual {v5, v0}, Lo/dds;->b(I)V

    .line 1390
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDfu, mChunksTotal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1391
    invoke-virtual {v5, p2}, Lo/dds;->e(Z)V

    .line 1392
    array-length v0, v4

    new-instance v1, Lo/ddx$3;

    invoke-direct {v1, p0}, Lo/ddx$3;-><init>(Lo/ddx;)V

    invoke-virtual {p0, v0, v4, v5, v1}, Lo/ddx;->c(I[BLo/dds;Lo/ddi;)V

    .line 1504
    return-void
.end method

.method private e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 5

    .line 1054
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1055
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---otaBusinessCommand error, deviceCommand is null---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1056
    return-void

    .line 1059
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter otaBusinessCommand(), with data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v3

    invoke-static {v3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1062
    new-instance v4, Lo/cye;

    invoke-direct {v4}, Lo/cye;-><init>()V

    .line 1065
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/cye;->a([B)V

    .line 1067
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lo/cye;->a(I)V

    .line 1069
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getNeedAck()Z

    move-result v0

    invoke-virtual {v4, v0}, Lo/cye;->b(Z)V

    .line 1071
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getPriority()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/cye;->b(I)V

    .line 1073
    iget-object v0, p0, Lo/ddx;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 1075
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getNeedEncrypt()Z

    move-result v0

    invoke-virtual {v4, v0}, Lo/cye;->d(Z)V

    .line 1077
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lo/cye;->e(I)V

    .line 1079
    iget-object v0, p0, Lo/ddx;->c:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1080
    iget-object v0, p0, Lo/ddx;->c:Lo/cys;

    invoke-virtual {v0, v4}, Lo/cys;->a(Lo/cye;)V

    .line 1083
    :cond_1
    iget-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1084
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "OTATransferFile"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    .line 1085
    iget-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 1086
    new-instance v0, Lo/ddx$c;

    iget-object v1, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/ddx$c;-><init>(Lo/ddx;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    .line 1088
    :cond_2
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    iget v1, p0, Lo/ddx;->B:I

    int-to-long v1, v1

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v1, v2}, Lo/ddx$c;->sendEmptyMessageDelayed(IJ)Z

    .line 1089
    return-void
.end method

.method private e(Lo/ddp;)V
    .locals 9

    .line 456
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OTA\u5347\u7ea7\u5305\u5927\u5c0f\u4e3b\u52a8\u4e0a\u62a5\uff0cdataOtaPackageSizeReport = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ddx;->E:Z

    .line 459
    invoke-virtual {p1}, Lo/ddp;->c()J

    move-result-wide v4

    .line 460
    long-to-double v0, v4

    iput-wide v0, p0, Lo/ddx;->G:D

    .line 462
    invoke-virtual {p1}, Lo/ddp;->d()J

    move-result-wide v6

    .line 463
    long-to-int v0, v6

    iput v0, p0, Lo/ddx;->I:I

    .line 465
    div-long v0, v6, v4

    long-to-int v8, v0

    .line 467
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OTA\u5347\u7ea7\u5305\u5927\u5c0f\u4e3b\u52a8\u4e0a\u62a5\uff0c\u5347\u7ea7\u8fdb\u5ea6 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", package_valid_size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", receiver_file_size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    return-void
.end method

.method static synthetic e(Lo/ddx;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lo/ddx;->K:Z

    return p1
.end method

.method public static e(Lo/dba;)[I
    .locals 7

    .line 1873
    iget-object v2, p0, Lo/dba;->e:Ljava/util/List;

    .line 1874
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 1875
    new-array v4, v3, [I

    .line 1876
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 1877
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v6

    .line 1878
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 1880
    :sswitch_0
    array-length v0, v4

    if-lez v0, :cond_0

    .line 1881
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v4, v1

    goto :goto_1

    .line 1885
    :sswitch_1
    array-length v0, v4

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 1886
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 1876
    :cond_0
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1893
    :cond_1
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_1
        0x7f -> :sswitch_0
    .end sparse-switch
.end method

.method private f([B)Lo/daj;
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1714
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter unGetOtaStatus   "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1715
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 1716
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 1718
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lo/ddx;->c(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 1720
    new-instance v7, Lo/daj;

    invoke-direct {v7}, Lo/daj;-><init>()V

    .line 1722
    iget-object v8, v6, Lo/dba;->e:Ljava/util/List;

    .line 1723
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1724
    new-instance v7, Lo/daj;

    invoke-direct {v7}, Lo/daj;-><init>()V

    .line 1725
    const/4 v9, 0x0

    .line 1728
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 1729
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    .line 1730
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v11

    .line 1731
    sparse-switch v10, :sswitch_data_0

    goto :goto_1

    .line 1733
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v11, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/daj;->a(J)V

    .line 1734
    goto :goto_1

    .line 1736
    :sswitch_1
    invoke-static {v11}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/daj;->e(Ljava/lang/String;)V

    .line 1737
    goto :goto_1

    .line 1739
    :sswitch_2
    const/16 v0, 0x10

    invoke-static {v11, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1740
    invoke-virtual {v7, v9}, Lo/daj;->b(I)V

    .line 1741
    goto :goto_1

    .line 1743
    :sswitch_3
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v11}, Lo/ddx;->b(ILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/daj;->b(Ljava/util/List;)V

    .line 1744
    .line 1748
    :goto_1
    goto/16 :goto_0

    .line 1753
    :cond_0
    iget-object v9, v6, Lo/dba;->b:Ljava/util/List;

    .line 1754
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1755
    new-instance v11, Lo/daq;

    invoke-direct {v11}, Lo/daq;-><init>()V

    .line 1757
    const/4 v12, 0x0

    :goto_2
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_2

    .line 1758
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/dba;

    .line 1760
    new-instance v14, Lo/daq;

    invoke-direct {v14}, Lo/daq;-><init>()V

    .line 1761
    iget-object v15, v13, Lo/dba;->e:Ljava/util/List;

    .line 1762
    const/16 v16, 0x0

    :goto_3
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_1

    .line 1763
    move/from16 v0, v16

    invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/daw;

    .line 1765
    invoke-virtual/range {v17 .. v17}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v18

    .line 1766
    packed-switch v18, :pswitch_data_0

    goto/16 :goto_4

    .line 1768
    :pswitch_0
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v19

    .line 1769
    move/from16 v0, v19

    invoke-virtual {v11, v0}, Lo/daq;->c(I)V

    .line 1770
    goto :goto_4

    .line 1772
    :pswitch_1
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v20

    .line 1773
    move/from16 v0, v20

    invoke-virtual {v11, v0}, Lo/daq;->b(I)V

    .line 1774
    goto :goto_4

    .line 1776
    :pswitch_2
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v21

    .line 1777
    move/from16 v0, v21

    invoke-virtual {v14, v0}, Lo/daq;->c(I)V

    .line 1779
    goto :goto_4

    .line 1781
    :pswitch_3
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v22

    .line 1782
    move/from16 v0, v22

    invoke-virtual {v14, v0}, Lo/daq;->b(I)V

    .line 1783
    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1762
    .line 1784
    :goto_4
    :pswitch_4
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_3

    .line 1757
    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_2

    .line 1792
    :cond_2
    invoke-virtual {v7, v10}, Lo/daj;->c(Ljava/util/List;)V

    .line 1793
    invoke-virtual {v7, v11}, Lo/daj;->d(Lo/daq;)V

    .line 1796
    return-object v7

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0x16 -> :sswitch_1
        0x17 -> :sswitch_2
        0x18 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1f
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic f(Lo/ddx;)Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lo/ddx;->l:Z

    return v0
.end method

.method static synthetic g(Lo/ddx;)I
    .locals 2

    .line 49
    iget v0, p0, Lo/ddx;->o:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/ddx;->o:I

    return v0
.end method

.method static synthetic h(Lo/ddx;)Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/ddx;->n:Ljava/util/List;

    return-object v0
.end method

.method private h([B)V
    .locals 7

    .line 1652
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 1653
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseOTAFileData(), responseHex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mProductType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1657
    const-string v0, "AA0100496C"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1658
    const-string v0, "AA0100496C"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 1659
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1660
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v5

    goto :goto_0

    .line 1662
    :cond_0
    move-object v5, p1

    .line 1664
    :goto_0
    goto :goto_1

    .line 1665
    :cond_1
    move-object v5, p1

    .line 1668
    :goto_1
    invoke-static {v5}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 1670
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1671
    const-string v0, "cc"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "CC"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1672
    :cond_2
    iget-boolean v0, p0, Lo/ddx;->u:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1673
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->u:Z

    .line 1674
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/ddx$c;->removeMessages(I)V

    .line 1675
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "need ACK_DFU : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1676
    iget-object v0, p0, Lo/ddx;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1677
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    invoke-interface {v0, v5}, Lo/ddi;->e([B)V

    goto :goto_2

    .line 1680
    :cond_3
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "waiting ack is time out, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1684
    :cond_4
    :goto_2
    return-void
.end method

.method static synthetic i(Lo/ddx;)I
    .locals 1

    .line 49
    iget v0, p0, Lo/ddx;->o:I

    return v0
.end method

.method private i([B)V
    .locals 5

    .line 1096
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter writeBTFileData(),data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1099
    new-instance v4, Lo/cye;

    invoke-direct {v4}, Lo/cye;-><init>()V

    .line 1101
    invoke-virtual {v4, p1}, Lo/cye;->a([B)V

    .line 1103
    array-length v0, p1

    invoke-virtual {v4, v0}, Lo/cye;->a(I)V

    .line 1105
    invoke-direct {p0}, Lo/ddx;->c()Z

    move-result v0

    invoke-virtual {v4, v0}, Lo/cye;->b(Z)V

    .line 1107
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/cye;->b(I)V

    .line 1109
    iget-object v0, p0, Lo/ddx;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 1111
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/cye;->d(Z)V

    .line 1113
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lo/cye;->e(I)V

    .line 1115
    iget-object v0, p0, Lo/ddx;->c:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1116
    iget-object v0, p0, Lo/ddx;->c:Lo/cys;

    invoke-virtual {v0, v4}, Lo/cys;->a(Lo/cye;)V

    .line 1119
    :cond_0
    return-void
.end method

.method static synthetic k(Lo/ddx;)Lo/ddx$c;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    return-object v0
.end method

.method private k([B)V
    .locals 5

    .line 1690
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "packageValidity enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1691
    const/4 v4, 0x0

    .line 1693
    const/4 v0, 0x2

    aget-byte v0, p1, v0

    if-ne v4, v0, :cond_0

    .line 1695
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onDataReceived,notification,data="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1696
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1698
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    const/4 v1, 0x5

    aget-byte v1, p1, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ddi;->e(Ljava/lang/Object;)V

    .line 1700
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddx;->z:Lo/ddi;

    .line 1701
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddx;->q:Lo/dds;

    .line 1702
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "packageValidity success..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1705
    :cond_0
    return-void
.end method

.method static synthetic l(Lo/ddx;)I
    .locals 1

    .line 49
    iget v0, p0, Lo/ddx;->g:I

    return v0
.end method

.method static synthetic p(Lo/ddx;)I
    .locals 1

    .line 49
    iget v0, p0, Lo/ddx;->f:I

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 499
    new-instance v1, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 501
    const/16 v0, 0x9

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 502
    const/4 v0, 0x6

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 503
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 504
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 506
    invoke-virtual {p0, v1}, Lo/ddx;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 507
    return-void
.end method

.method public a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 7

    .line 755
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter sendDeviceData() with ServiceID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " CommandID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getCommandID()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 760
    new-instance v4, Lo/cye;

    invoke-direct {v4}, Lo/cye;-><init>()V

    .line 763
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataLen()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 765
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 767
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getCommandID()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 768
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 770
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v6

    .line 771
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 773
    goto :goto_0

    .line 774
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "command data is null, if not OTA, data incorrect."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 776
    :goto_0
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 779
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/cye;->a([B)V

    .line 781
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lo/cye;->a(I)V

    .line 783
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getNeedAck()Z

    move-result v0

    invoke-virtual {v4, v0}, Lo/cye;->b(Z)V

    .line 785
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getPriority()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/cye;->b(I)V

    .line 787
    iget-object v0, p0, Lo/ddx;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 789
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getNeedEncrypt()Z

    move-result v0

    invoke-virtual {v4, v0}, Lo/cye;->d(Z)V

    .line 790
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/cye;->c(I)V

    .line 791
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getCommandID()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/cye;->f(I)V

    .line 793
    iget-object v0, p0, Lo/ddx;->c:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 794
    iget-object v0, p0, Lo/ddx;->c:Lo/cys;

    invoke-virtual {v0, v4}, Lo/cys;->a(Lo/cye;)V

    .line 796
    :cond_1
    return-void
.end method

.method public b()V
    .locals 7

    .line 851
    new-instance v2, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v2}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 852
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v3

    .line 853
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 854
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x7

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 855
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 856
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 858
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 859
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 861
    invoke-direct {p0, v2}, Lo/ddx;->e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 862
    return-void
.end method

.method public c(Ljava/lang/String;)Lo/dba;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1904
    const/4 v4, 0x0

    .line 1905
    new-instance v5, Lo/dba;

    invoke-direct {v5}, Lo/dba;-><init>()V

    .line 1906
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v4, v0, :cond_3

    .line 1907
    add-int/lit8 v0, v4, 0x2

    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 1908
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v4, v0

    .line 1909
    invoke-direct {p0, p1, v4}, Lo/ddx;->b(Ljava/lang/String;I)Lo/ddt;

    move-result-object v7

    .line 1911
    invoke-virtual {v7}, Lo/ddt;->d()I

    move-result v8

    .line 1913
    invoke-virtual {v7}, Lo/ddt;->a()I

    move-result v4

    .line 1915
    const-string v9, ""

    .line 1917
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 1918
    mul-int/lit8 v0, v8, 0x2

    add-int/2addr v0, v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 1919
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    throw v0

    .line 1922
    :cond_0
    mul-int/lit8 v0, v8, 0x2

    add-int/2addr v0, v4

    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 1925
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v4, v0

    .line 1927
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    ushr-int/lit8 v0, v0, 0x7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1928
    invoke-virtual {v5}, Lo/dba;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v9}, Lo/ddx;->c(Ljava/lang/String;)Lo/dba;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1931
    :cond_1
    invoke-virtual {v5}, Lo/dba;->a()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lo/daw;

    invoke-direct {v1, v6, v8, v9}, Lo/daw;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1935
    :cond_2
    const-string v0, "OTATransferFile"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TLVUtils"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "_vl = 0"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1936
    invoke-virtual {v5}, Lo/dba;->a()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lo/daw;

    invoke-direct {v1, v6, v8, v9}, Lo/daw;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1938
    :goto_1
    goto/16 :goto_0

    .line 1939
    :cond_3
    return-object v5
.end method

.method public declared-synchronized c(I[BLo/dds;Lo/ddi;)V
    .locals 9

    monitor-enter p0

    .line 1294
    :try_start_0
    new-instance v5, Lo/ddu;

    invoke-direct {v5}, Lo/ddu;-><init>()V

    .line 1295
    iput-object p4, p0, Lo/ddx;->z:Lo/ddi;

    .line 1296
    iput-object p3, p0, Lo/ddx;->q:Lo/dds;

    .line 1298
    .line 1299
    invoke-virtual {p3}, Lo/dds;->e()I

    move-result v0

    .line 1298
    invoke-virtual {v5, p1, p2, p3, v0}, Lo/ddu;->d(I[BLo/dds;I)Ljava/util/ArrayList;

    move-result-object v6

    .line 1301
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter sendDfuFile(), mRawDfuFile = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx;->q:Lo/dds;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1310
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 1311
    new-instance v7, Lo/ddl;

    invoke-direct {v7, v6}, Lo/ddl;-><init>(Ljava/util/ArrayList;)V

    .line 1312
    iget-object v0, p0, Lo/ddx;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1313
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mDFUCmdBuffer size == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx;->w:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1314
    const/4 v8, 0x0

    .line 1315
    iget-object v0, p0, Lo/ddx;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1316
    iget-object v0, p0, Lo/ddx;->w:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/ddl;

    .line 1318
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 1319
    invoke-virtual {v8}, Lo/ddl;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v8}, Lo/ddl;->b()I

    move-result v1

    if-gt v0, v1, :cond_2

    .line 1320
    iget-object v0, p0, Lo/ddx;->w:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1321
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1322
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    const-string v1, "\u4f20\u8f93\u6587\u4ef6\u5f02\u5e38"

    const v2, 0x19644

    invoke-interface {v0, v2, v1}, Lo/ddi;->a(ILjava/lang/String;)V

    .line 1326
    :cond_1
    monitor-exit p0

    return-void

    .line 1328
    :cond_2
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " The Command to Send Is\uff1aHEX = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/ddl;->e()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v8}, Lo/ddl;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1329
    invoke-virtual {p3}, Lo/dds;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1330
    invoke-virtual {p3}, Lo/dds;->d()I

    move-result v0

    iget v1, p0, Lo/ddx;->t:I

    rem-int/2addr v0, v1

    if-eqz v0, :cond_3

    .line 1331
    invoke-virtual {p3}, Lo/dds;->d()I

    move-result v0

    .line 1332
    invoke-virtual {p3}, Lo/dds;->a()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 1333
    :cond_3
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendDfuFile mIsNeedACK, getPackage_index== "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p3}, Lo/dds;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1334
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ddx;->u:Z

    .line 1335
    invoke-virtual {v8}, Lo/ddl;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v8}, Lo/ddl;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {p0, v0}, Lo/ddx;->i([B)V

    .line 1337
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1338
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    iget v1, p0, Lo/ddx;->r:I

    int-to-long v1, v1

    const/4 v3, 0x3

    invoke-virtual {v0, v3, v1, v2}, Lo/ddx$c;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    .line 1343
    :cond_4
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "not  NeedACK, getPackage_index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1344
    invoke-virtual {p3}, Lo/dds;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1343
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1346
    invoke-virtual {v8}, Lo/ddl;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v8}, Lo/ddl;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {p0, v0}, Lo/ddx;->i([B)V

    .line 1348
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WRITE OVER"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1350
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1351
    iget-object v0, p0, Lo/ddx;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1352
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    invoke-interface {v0}, Lo/ddi;->e()V

    goto :goto_0

    .line 1357
    :cond_5
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " no dfu  cmdbuf to send."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1358
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1359
    iget-object v0, p0, Lo/ddx;->z:Lo/ddi;

    const-string v1, "\u4f20\u8f93\u6587\u4ef6\u5f02\u5e38"

    const v2, 0x19644

    invoke-interface {v0, v2, v1}, Lo/ddi;->a(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1366
    :cond_6
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;ILo/yc;)V
    .locals 7

    .line 282
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const/4 v0, 0x0

    if-ne v0, p5, :cond_2

    .line 284
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---startTransferOTAFile error, parameter is null---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    if-eqz p5, :cond_1

    .line 286
    iget-object v0, p0, Lo/ddx;->d:Ljava/lang/String;

    const-string v1, "\u53c2\u6570\u975e\u6cd5"

    const v2, 0x1a9c9

    invoke-interface {p5, v0, v2, v1}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 288
    :cond_1
    return-void

    .line 290
    :cond_2
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOTAFile, version---------------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOTAFile, updateMode------------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    iget-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 295
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "OTATransferFile"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    .line 296
    iget-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 297
    new-instance v0, Lo/ddx$c;

    iget-object v1, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/ddx$c;-><init>(Lo/ddx;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    .line 300
    :cond_3
    iput-object p5, p0, Lo/ddx;->s:Lo/yc;

    .line 302
    invoke-direct {p0, p1}, Lo/ddx;->a(Ljava/lang/String;)V

    .line 304
    invoke-virtual {p3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->getOtaUnitSize()I

    move-result v4

    .line 306
    invoke-virtual {p3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->getAppWaitTimeout()I

    move-result v5

    .line 308
    invoke-virtual {p3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->getDeviceRestartTimeout()I

    move-result v6

    .line 310
    invoke-virtual {p3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->getAckEnable()Z

    move-result v0

    iput-boolean v0, p0, Lo/ddx;->A:Z

    .line 314
    iput v4, p0, Lo/ddx;->D:I

    .line 315
    mul-int/lit16 v0, v5, 0x3e8

    iput v0, p0, Lo/ddx;->B:I

    .line 316
    mul-int/lit16 v0, v6, 0x3e8

    iput v0, p0, Lo/ddx;->j:I

    .line 318
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->H:I

    .line 319
    const/4 v0, 0x0

    iput v0, p0, Lo/ddx;->I:I

    .line 320
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->K:Z

    .line 321
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOTAFile, mMaxPacket------------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->D:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOTAFile, mWaitTimeout----------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOTAFile, mRestartTimeout-------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOTAFile, mAckEnable-------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/ddx;->A:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    iget v0, p0, Lo/ddx;->B:I

    if-eqz v0, :cond_4

    .line 328
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    iget v1, p0, Lo/ddx;->B:I

    int-to-long v1, v1

    const/4 v3, 0x6

    invoke-virtual {v0, v3, v1, v2}, Lo/ddx$c;->sendEmptyMessageDelayed(IJ)Z

    .line 330
    :cond_4
    return-void
.end method

.method public c([B)V
    .locals 9

    .line 1556
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1557
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---parseOTAReceivedData error ,data is null---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1558
    return-void

    .line 1560
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter parseOTAReceivedData data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1561
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseOTAReceivedData mProductType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ddx;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1563
    iget v0, p0, Lo/ddx;->a:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_a

    .line 1567
    iget-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1568
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lo/ddx$c;->removeMessages(I)V

    .line 1571
    :cond_1
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_9

    .line 1572
    const/4 v4, 0x0

    .line 1573
    const/4 v5, 0x0

    .line 1575
    const/4 v0, 0x3

    aget-byte v0, p1, v0

    and-int/lit16 v7, v0, 0x80

    .line 1576
    const/4 v0, 0x3

    aget-byte v6, p1, v0

    .line 1577
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "(data[3] & 0x80) = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1578
    if-lez v7, :cond_2

    .line 1579
    const/4 v0, 0x3

    aget-byte v0, p1, v0

    add-int/lit8 v6, v0, -0x80

    .line 1580
    if-gez v6, :cond_2

    .line 1581
    add-int/lit16 v6, v6, 0x100

    .line 1584
    :cond_2
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Current command is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1587
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    .line 1589
    :sswitch_0
    :try_start_0
    iget-object v0, p0, Lo/ddx;->M:Lo/ddf;

    move-object v4, v0

    .line 1590
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ddx;->v:Z

    .line 1591
    invoke-virtual {p0, p1}, Lo/ddx;->e([B)[I

    move-result-object v0

    move-object v5, v0

    .line 1592
    goto :goto_0

    .line 1594
    :sswitch_1
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter switchOnlineType  ONLINE_PACKAGE_OFFSET"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1595
    iget-object v0, p0, Lo/ddx;->J:Lo/ddf;

    move-object v4, v0

    .line 1596
    invoke-direct {p0, p1}, Lo/ddx;->f([B)Lo/daj;

    move-result-object v0

    move-object v5, v0

    .line 1597
    goto :goto_0

    .line 1599
    :sswitch_2
    invoke-direct {p0, p1}, Lo/ddx;->k([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1600
    nop

    .line 1603
    .line 1609
    :goto_0
    :sswitch_3
    goto :goto_1

    .line 1607
    :catch_0
    move-exception v8

    .line 1608
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1611
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    .line 1612
    iget-boolean v0, p0, Lo/ddx;->v:Z

    if-eqz v0, :cond_5

    .line 1613
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ddx;->v:Z

    .line 1614
    const/4 v0, 0x0

    if-eq v0, v5, :cond_8

    .line 1615
    move-object v0, v5

    check-cast v0, [I

    move-object v8, v0

    check-cast v8, [I

    .line 1616
    const/4 v0, 0x0

    aget v0, v8, v0

    const v1, 0x186a0

    if-ne v1, v0, :cond_4

    .line 1617
    array-length v0, v8

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1618
    const v0, 0x186a0

    invoke-static {v0}, Lo/dai;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lo/ddf;->b(Ljava/lang/Object;)V

    goto :goto_2

    .line 1620
    :cond_3
    invoke-interface {v4, v8}, Lo/ddf;->b(Ljava/lang/Object;)V

    goto :goto_2

    .line 1623
    :cond_4
    move-object v0, v5

    check-cast v0, [I

    check-cast v0, [I

    const/4 v1, 0x0

    aget v0, v0, v1

    const/4 v1, 0x0

    aget v1, v8, v1

    invoke-static {v1}, Lo/dai;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Lo/ddf;->b(ILjava/lang/String;)V

    .line 1625
    :goto_2
    goto :goto_3

    .line 1627
    :cond_5
    const/4 v0, 0x0

    if-ne v0, v5, :cond_6

    .line 1628
    const-string v0, "UNKNOW ERROR"

    const v1, 0x186a1

    invoke-interface {v4, v1, v0}, Lo/ddf;->b(ILjava/lang/String;)V

    goto :goto_3

    .line 1630
    :cond_6
    invoke-interface {v4, v5}, Lo/ddf;->b(Ljava/lang/Object;)V

    goto :goto_3

    .line 1634
    :cond_7
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---parseOTAReceivedData error, callback is null, command---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1636
    :cond_8
    :goto_3
    goto :goto_4

    .line 1638
    :cond_9
    invoke-direct {p0, p1}, Lo/ddx;->h([B)V

    goto :goto_4

    .line 1642
    :cond_a
    invoke-direct {p0, p1}, Lo/ddx;->b([B)V

    .line 1644
    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0xc -> :sswitch_1
        0xd -> :sswitch_3
        0x7f -> :sswitch_0
    .end sparse-switch
.end method

.method public c(Ljava/lang/String;IJI)[B
    .locals 13

    .line 967
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v3

    .line 968
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 970
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 971
    const/4 v1, 0x7

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 972
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 974
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 975
    const/16 v1, 0x9

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 976
    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-long v1, p2

    .line 977
    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 979
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v7

    .line 981
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_0

    .line 983
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x4

    const/16 v2, 0x8

    invoke-virtual {v7, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v7, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 986
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 987
    const/16 v1, 0xa

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 988
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 990
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 991
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x16

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 992
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 994
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 995
    const/16 v1, 0x15

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 996
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 997
    invoke-static/range {p5 .. p5}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 999
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 1001
    invoke-static {v12}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 2

    .line 186
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 187
    iget-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ddx$c;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 188
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddx;->y:Lo/ddx$c;

    .line 190
    :cond_0
    iget-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 191
    iget-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 192
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddx;->x:Landroid/os/HandlerThread;

    .line 194
    :cond_1
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 3

    .line 1539
    const/4 v1, 0x1

    .line 1540
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1541
    return v1

    .line 1543
    :cond_0
    const-string v0, "../"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    .line 1544
    if-ltz v2, :cond_1

    .line 1545
    const/4 v1, 0x0

    .line 1547
    :cond_1
    return v1
.end method

.method public e([B)[I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1857
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getErrorCode()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1858
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 1859
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 1860
    invoke-virtual {p0, v5}, Lo/ddx;->c(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 1861
    invoke-static {v6}, Lo/ddx;->e(Lo/dba;)[I

    move-result-object v7

    .line 1862
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error Code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v7, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1863
    return-object v7
.end method
