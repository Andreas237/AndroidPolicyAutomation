.class Lo/dla$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwfoundationmodel/trackprocess/callback/ITrackProcessCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dla;->e(Ljava/lang/String;Ljava/lang/String;ZLo/yg;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/yg;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lo/dla;


# direct methods
.method constructor <init>(Lo/dla;ZLjava/lang/String;Ljava/lang/String;ZLo/yg;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lo/dla$5;->f:Lo/dla;

    iput-boolean p2, p0, Lo/dla$5;->d:Z

    iput-object p3, p0, Lo/dla$5;->b:Ljava/lang/String;

    iput-object p4, p0, Lo/dla$5;->e:Ljava/lang/String;

    iput-boolean p5, p0, Lo/dla$5;->c:Z

    iput-object p6, p0, Lo/dla$5;->a:Lo/yg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;>;)V"
        }
    .end annotation

    .line 163
    const-string v0, "GPSFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tatatee getOptimizedTrack end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const-string v0, "GPSFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6570\u636e\u8fd4\u56de\u4e86 err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    const-string v0, "GPSFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is beta version:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dbf;->f()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isSupportGpsFileEnabled:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dla$5;->d:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/dla$5;->d:Z

    if-nez v0, :cond_3

    .line 168
    :cond_0
    :try_start_0
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lo/dla$5;->b:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 169
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    .line 171
    const-string v0, "GPSFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete result"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :cond_1
    new-instance v5, Ljava/io/File;

    iget-object v0, p0, Lo/dla$5;->e:Ljava/lang/String;

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 174
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 175
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v6

    .line 176
    const-string v0, "GPSFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete result"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    :cond_2
    goto :goto_0

    .line 178
    :catch_0
    move-exception v4

    .line 179
    const-string v0, "GPSFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete file error :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    :cond_3
    :goto_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_7

    .line 183
    move-object v4, p2

    .line 184
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 185
    const-string v0, "GPSFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkOutDetailFromDevice() size1 is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 187
    const/4 v0, 0x4

    new-array v7, v0, [D

    .line 188
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;

    invoke-virtual {v0}, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->getLatitude()D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v7, v2

    .line 189
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;

    invoke-virtual {v0}, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->getLongitude()D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v7, v2

    .line 190
    iget-boolean v0, p0, Lo/dla$5;->c:Z

    if-eqz v0, :cond_4

    .line 191
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;

    invoke-virtual {v0}, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->getAltitude()D

    move-result-wide v0

    const/4 v2, 0x2

    aput-wide v0, v7, v2

    goto :goto_2

    .line 193
    :cond_4
    const-wide/16 v0, 0x0

    const/4 v2, 0x2

    aput-wide v0, v7, v2

    .line 195
    :goto_2
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;

    invoke-virtual {v0}, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->getUtc_time()J

    move-result-wide v0

    long-to-double v0, v0

    const/4 v2, 0x3

    aput-wide v0, v7, v2

    .line 196
    int-to-long v8, v6

    .line 197
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 199
    :cond_5
    const-string v0, "GPSFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkOutDetailFromDevice() size2 is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    iget-object v0, p0, Lo/dla$5;->a:Lo/yg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 201
    iget-object v0, p0, Lo/dla$5;->a:Lo/yg;

    const/16 v1, 0x2710

    invoke-interface {v0, v1, v5}, Lo/yg;->onResponse(ILjava/lang/Object;)V

    .line 203
    :cond_6
    goto :goto_3

    .line 204
    :cond_7
    const-string v0, "GPSFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkOutDetailFromDevice() callback error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget-object v0, p0, Lo/dla$5;->a:Lo/yg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 206
    iget-object v0, p0, Lo/dla$5;->a:Lo/yg;

    const-string v1, "so calucate error"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lo/yg;->onResponse(ILjava/lang/Object;)V

    .line 209
    :cond_8
    :goto_3
    return-void
.end method
