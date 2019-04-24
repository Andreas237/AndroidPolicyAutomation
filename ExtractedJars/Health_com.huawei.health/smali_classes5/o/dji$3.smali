.class Lo/dji$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dji;


# direct methods
.method constructor <init>(Lo/dji;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lo/dji$3;->a:Lo/dji;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 245
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 246
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    array-length v0, v4

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 247
    :cond_0
    const-string v0, "HWOTAV2Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse(), error data, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    return-void

    .line 250
    :cond_1
    const-string v0, "HWOTAV2Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter mOTAV2ResponseCallback onResponse(),data = "

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

    .line 252
    const/4 v0, 0x1

    aget-byte v6, v4, v0

    .line 253
    const-string v0, "HWOTAV2Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f53\u524d\u7684command id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_0

    .line 257
    :sswitch_0
    :try_start_0
    iget-object v0, p0, Lo/dji$3;->a:Lo/dji;

    invoke-static {v0}, Lo/dji;->e(Lo/dji;)Lo/ddj;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ddj;->e([B)[I

    move-result-object v5

    .line 259
    iget-object v0, p0, Lo/dji$3;->a:Lo/dji;

    invoke-static {v0, v5}, Lo/dji;->c(Lo/dji;Ljava/lang/Object;)V

    .line 260
    goto :goto_0

    .line 262
    :sswitch_1
    iget-object v0, p0, Lo/dji$3;->a:Lo/dji;

    invoke-static {v0}, Lo/dji;->e(Lo/dji;)Lo/ddj;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ddj;->d([B)Lo/ddo;

    move-result-object v5

    .line 263
    iget-object v0, p0, Lo/dji$3;->a:Lo/dji;

    invoke-static {v0, v5}, Lo/dji;->a(Lo/dji;Ljava/lang/Object;)V

    .line 264
    goto :goto_0

    .line 266
    :sswitch_2
    iget-object v0, p0, Lo/dji$3;->a:Lo/dji;

    invoke-static {v0}, Lo/dji;->e(Lo/dji;)Lo/ddj;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ddj;->b([B)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;

    move-result-object v5

    .line 267
    iget-object v0, p0, Lo/dji$3;->a:Lo/dji;

    invoke-static {v0, v5}, Lo/dji;->e(Lo/dji;Ljava/lang/Object;)V

    .line 268
    goto :goto_0

    .line 270
    :sswitch_3
    const-string v0, "HWOTAV2Mgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse errorcode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", and objData ="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget-object v0, p0, Lo/dji$3;->a:Lo/dji;

    invoke-static {v0}, Lo/dji;->d(Lo/dji;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 272
    .line 278
    :goto_0
    goto :goto_1

    .line 276
    :catch_0
    move-exception v7

    .line 277
    const-string v0, "HWOTAV2Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0xb -> :sswitch_3
        0x7f -> :sswitch_0
    .end sparse-switch
.end method
