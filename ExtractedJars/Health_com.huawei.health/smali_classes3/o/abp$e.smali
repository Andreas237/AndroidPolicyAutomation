.class Lo/abp$e;
.super Lo/akk$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private b:Lo/abp$b;

.field final synthetic d:Lo/abp;


# direct methods
.method public constructor <init>(Lo/abp;Lo/abp$b;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lo/abp$e;->d:Lo/abp;

    invoke-direct {p0}, Lo/akk$e;-><init>()V

    .line 293
    iput-object p2, p0, Lo/abp$e;->b:Lo/abp$b;

    .line 294
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 298
    new-instance v7, Landroid/util/SparseArray;

    invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V

    .line 299
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_3

    .line 300
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " MyGetDetailDataCallback onResult bundle != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    const-string v0, "start_time"

    move-object/from16 v1, p1

    :try_start_0
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    long-to-int v8, v0

    .line 303
    const-string v0, "steps"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v9

    .line 304
    const-string v0, "floors"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v10

    .line 305
    const-string v0, "motions"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v11

    .line 306
    iget-object v0, p0, Lo/abp$e;->d:Lo/abp;

    invoke-static {v0}, Lo/abp;->c(Lo/abp;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/amy;->t(Landroid/content/Context;)I

    move-result v12

    .line 307
    const/4 v13, 0x0

    :goto_0
    array-length v0, v9

    if-ge v13, v0, :cond_1

    .line 308
    add-int v0, v8, v13

    if-ge v0, v12, :cond_0

    .line 309
    goto :goto_1

    .line 311
    :cond_0
    new-instance v0, Lo/amd;

    add-int v1, v8, v13

    int-to-long v2, v1

    aget v4, v9, v13

    aget v1, v10, v13

    mul-int/lit8 v5, v1, 0x1e

    aget v1, v11, v13

    .line 312
    invoke-static {v1}, Lo/ams;->d(I)I

    move-result v6

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v6}, Lo/amd;-><init>(IJIII)V

    move-object v14, v0

    .line 313
    add-int v0, v8, v13

    invoke-virtual {v7, v0, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    :goto_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 317
    :cond_1
    goto :goto_2

    .line 315
    :catch_0
    move-exception v8

    .line 316
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    :goto_2
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 319
    iget-object v0, p0, Lo/abp$e;->b:Lo/abp$b;

    invoke-interface {v0, v7}, Lo/abp$b;->b(Landroid/util/SparseArray;)V

    goto :goto_3

    .line 321
    :cond_2
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "midware time smaller than health first init time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lo/abp$e;->b:Lo/abp$b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/abp$b;->d(Landroid/util/SparseArray;)V

    goto :goto_3

    .line 325
    :cond_3
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyGetDetailDataCallback onResult bundle == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    iget-object v0, p0, Lo/abp$e;->b:Lo/abp$b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/abp$b;->d(Landroid/util/SparseArray;)V

    .line 328
    :goto_3
    return-void
.end method
