.class public Lo/cnm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILjava/util/List;Lo/clj;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 150
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p2, v0, p0, v1}, Lo/clj;->e(Ljava/util/List;II)V

    .line 152
    :cond_0
    return-void

    .line 155
    :cond_1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 156
    invoke-virtual {v4, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 158
    invoke-virtual {v4}, Landroid/os/Parcel;->dataSize()I

    move-result v0

    const v1, 0xfa000

    if-gt v1, v0, :cond_2

    .line 159
    const/4 v5, 0x1

    goto :goto_0

    .line 161
    :cond_2
    const/16 v5, 0x190

    .line 163
    :goto_0
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parcel dataSize = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/Parcel;->dataSize()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", package_size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 165
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    .line 166
    const/4 v7, 0x0

    .line 167
    :cond_3
    :goto_1
    if-ge v7, v6, :cond_6

    .line 168
    add-int v0, v7, v5

    if-lt v0, v6, :cond_5

    .line 170
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    invoke-interface {p1, v7, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p2, v0, p0, v1}, Lo/clj;->e(Ljava/util/List;II)V

    .line 171
    :cond_4
    add-int/2addr v7, v5

    goto :goto_1

    .line 174
    :cond_5
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    move v0, v7

    add-int v1, v7, v5

    move v7, v1

    invoke-interface {p1, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v0, p0, v1}, Lo/clj;->e(Ljava/util/List;II)V

    goto :goto_1

    .line 177
    :cond_6
    return-void
.end method

.method private static a(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiDataInsertOption;>;Lcom/huawei/hihealth/HiHealthData;I)V"
        }
    .end annotation

    .line 420
    new-instance v1, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 421
    invoke-virtual {v1, p2}, Lcom/huawei/hihealth/HiDataInsertOption;->setWriteStatType(I)V

    .line 422
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->copyData()Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 423
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 424
    return-void
.end method

.method public static b(Lcom/huawei/hihealth/HiDataInsertOption;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataInsertOption;)Ljava/util/List<Lcom/huawei/hihealth/HiDataInsertOption;>;"
        }
    .end annotation

    .line 344
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiDataInsertOption;->getDatas()Ljava/util/List;

    move-result-object v1

    .line 345
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 346
    invoke-static {v1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 347
    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 348
    return-object v2

    .line 351
    :cond_0
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiHealthData;

    .line 352
    invoke-virtual {v3}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 354
    :sswitch_0
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiDataInsertOption;->getWriteStatType()I

    move-result v0

    invoke-static {v1, v2, v0}, Lo/cnm;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 355
    goto :goto_1

    .line 357
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiDataInsertOption;->getWriteStatType()I

    move-result v0

    invoke-static {v1, v2, v0}, Lo/cnm;->e(Ljava/util/List;Ljava/util/List;I)V

    .line 360
    :goto_1
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x7531 -> :sswitch_0
    .end sparse-switch
.end method

.method private static c(Ljava/util/List;Ljava/util/List;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Lcom/huawei/hihealth/HiDataInsertOption;>;I)V"
        }
    .end annotation

    .line 364
    const-string v4, ""

    .line 365
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 367
    :try_start_0
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cnp;->d(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 370
    goto :goto_1

    .line 368
    :catch_0
    move-exception v7

    .line 369
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideInsertSequence e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    :goto_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    .line 372
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideInsertSequence compressed = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", original size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    const-string v0, "is_sequence_zip"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putBoolean(Ljava/lang/String;Z)V

    .line 374
    if-gtz v7, :cond_0

    .line 375
    invoke-static {p1, v6, p2}, Lo/cnm;->a(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;I)V

    .line 376
    goto :goto_0

    .line 379
    :cond_0
    const/4 v8, 0x0

    .line 380
    :goto_2
    if-ge v8, v7, :cond_2

    .line 381
    const/high16 v0, 0x40000

    add-int/2addr v0, v8

    if-lt v0, v7, :cond_1

    .line 382
    invoke-virtual {v4, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 383
    const-string v0, "is_dividing"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putBoolean(Ljava/lang/String;Z)V

    .line 384
    invoke-static {p1, v6, p2}, Lo/cnm;->a(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;I)V

    .line 385
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideInsertSequence finally index is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",track size is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 387
    :cond_1
    const/high16 v0, 0x40000

    add-int/2addr v0, v8

    invoke-virtual {v4, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 388
    const-string v0, "is_dividing"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putBoolean(Ljava/lang/String;Z)V

    .line 389
    invoke-static {p1, v6, p2}, Lo/cnm;->a(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;I)V

    .line 390
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideInsertSequence process index is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",track size is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    :goto_3
    const/high16 v0, 0x40000

    add-int/2addr v8, v0

    goto/16 :goto_2

    .line 394
    :cond_2
    goto/16 :goto_0

    .line 395
    :cond_3
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideInsertSequence datas size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", options size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    return-void
.end method

.method public static c(Ljava/util/List;IILjava/util/List;Landroid/util/SparseArray;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;)Z"
        }
    .end annotation

    .line 243
    invoke-static {p0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 244
    invoke-interface {p3, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 248
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 249
    invoke-static {p3}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 250
    const/4 v0, 0x0

    return v0

    .line 253
    :cond_1
    invoke-static {p4, p3, p1}, Lo/cnm;->d(Landroid/util/SparseArray;Ljava/util/List;I)V

    .line 254
    const/4 v0, 0x0

    return v0

    .line 257
    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(Ljava/util/List;ILjava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .line 224
    invoke-static {p0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 225
    invoke-interface {p2, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 228
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d(ILjava/util/List;Lo/cld;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 123
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 124
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p2, v0, p0, v1}, Lo/cld;->b(Ljava/util/List;II)V

    .line 125
    :cond_0
    return-void

    .line 127
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 128
    const/4 v3, 0x0

    .line 129
    :cond_2
    :goto_0
    if-ge v3, v2, :cond_5

    .line 131
    add-int/lit16 v0, v3, 0x190

    if-lt v0, v2, :cond_4

    .line 133
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    invoke-interface {p1, v3, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p2, v0, p0, v1}, Lo/cld;->b(Ljava/util/List;II)V

    .line 134
    :cond_3
    add-int/lit16 v3, v3, 0x190

    goto :goto_0

    .line 137
    :cond_4
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    move v0, v3

    add-int/lit16 v3, v3, 0x190

    invoke-interface {p1, v0, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v0, p0, v1}, Lo/cld;->b(Ljava/util/List;II)V

    goto :goto_0

    .line 140
    :cond_5
    return-void
.end method

.method public static d(ILjava/util/List;Lo/clj;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/clj;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 183
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p2, v0, p0, v1}, Lo/clj;->e(Ljava/util/List;II)V

    .line 185
    :cond_0
    return-void

    .line 187
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 188
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v5

    .line 189
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    .line 190
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideSequenceData length = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    if-gtz v6, :cond_3

    .line 192
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p2, v0, p0, v1}, Lo/clj;->e(Ljava/util/List;II)V

    .line 193
    :cond_2
    return-void

    .line 195
    :cond_3
    const/4 v7, 0x0

    .line 196
    :goto_0
    if-ge v7, v6, :cond_7

    .line 197
    const/high16 v0, 0x40000

    add-int/2addr v0, v7

    if-lt v0, v6, :cond_5

    .line 199
    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 200
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 201
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    const/4 v0, 0x1

    invoke-interface {p2, v8, p0, v0}, Lo/clj;->e(Ljava/util/List;II)V

    .line 203
    :cond_4
    const/high16 v0, 0x40000

    add-int/2addr v7, v0

    .line 204
    goto :goto_0

    .line 206
    :cond_5
    move v0, v7

    const/high16 v1, 0x40000

    add-int/2addr v1, v7

    move v7, v1

    invoke-virtual {v5, v0, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 207
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 208
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    const/4 v0, 0x0

    if-eq v0, p2, :cond_6

    const/4 v0, 0x0

    invoke-interface {p2, v8, p0, v0}, Lo/clj;->e(Ljava/util/List;II)V

    .line 210
    :cond_6
    goto :goto_0

    .line 212
    :cond_7
    return-void
.end method

.method private static d(Landroid/content/Context;Ljava/util/List;IILjava/util/List;Landroid/util/SparseArray;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;)V"
        }
    .end annotation

    .line 282
    const/4 v4, 0x0

    .line 283
    const/4 v5, 0x0

    .line 284
    invoke-static {p4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 286
    const/4 v0, 0x0

    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 287
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v4

    .line 290
    :cond_0
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 291
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 293
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 294
    invoke-interface {p4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 297
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 298
    invoke-virtual {v5, v4}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 302
    :cond_2
    :goto_0
    if-nez v5, :cond_3

    .line 303
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "packageSequenceDivideData data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    return-void

    .line 308
    :cond_3
    const/4 v0, 0x1

    if-ne p3, v0, :cond_7

    .line 310
    invoke-static {p4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 311
    return-void

    .line 316
    :cond_4
    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cnp;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 320
    goto :goto_1

    .line 317
    :catch_0
    move-exception v6

    .line 318
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "packageSequenceDivideData uncompress e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    return-void

    .line 323
    :goto_1
    const/16 v0, 0x7533

    if-ne p2, v0, :cond_6

    .line 324
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HiTrack_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7531

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 325
    invoke-static {p0, v4, v6}, Lo/cnl;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 326
    if-nez v7, :cond_5

    .line 327
    const/4 v6, 0x0

    .line 329
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 330
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setSequenceFileUrl(Ljava/lang/String;)V

    .line 331
    goto :goto_2

    .line 332
    :cond_6
    invoke-virtual {v5, v4}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 335
    :goto_2
    invoke-static {p5, p4, p2}, Lo/cnm;->d(Landroid/util/SparseArray;Ljava/util/List;I)V

    .line 336
    return-void

    .line 338
    :cond_7
    return-void
.end method

.method private static d(Landroid/util/SparseArray;Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 413
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 414
    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 415
    invoke-virtual {p0, p2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 416
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 417
    return-void
.end method

.method private static d(Ljava/util/List;Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiDataInsertOption;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 427
    new-instance v1, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 428
    invoke-virtual {v1, p2}, Lcom/huawei/hihealth/HiDataInsertOption;->setWriteStatType(I)V

    .line 429
    invoke-virtual {v1, p1}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 430
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 431
    return-void
.end method

.method private static e(Ljava/util/List;Ljava/util/List;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Lcom/huawei/hihealth/HiDataInsertOption;>;I)V"
        }
    .end annotation

    .line 399
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    .line 400
    const/4 v5, 0x0

    .line 401
    :goto_0
    if-ge v5, v4, :cond_1

    .line 402
    add-int/lit16 v0, v5, 0x1f4

    if-lt v0, v4, :cond_0

    .line 403
    invoke-interface {p0, v5, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lo/cnm;->d(Ljava/util/List;Ljava/util/List;I)V

    .line 404
    add-int/lit16 v5, v5, 0x1f4

    goto :goto_0

    .line 406
    :cond_0
    move v0, v5

    add-int/lit16 v5, v5, 0x1f4

    invoke-interface {p0, v0, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lo/cnm;->d(Ljava/util/List;Ljava/util/List;I)V

    goto :goto_0

    .line 409
    :cond_1
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideInsertOther datas size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", options size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    return-void
.end method

.method public static e(Ljava/util/List;Lo/clb;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 83
    invoke-static {p0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2}, Lo/clb;->a(Ljava/util/List;II)V

    .line 85
    :cond_0
    return-void

    .line 87
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    .line 88
    const/4 v5, 0x0

    .line 89
    const/16 v6, 0x190

    .line 90
    if-lez v4, :cond_2

    .line 91
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 92
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getContentLenth()I

    move-result v8

    .line 94
    const/16 v0, 0xa

    if-le v8, v0, :cond_2

    .line 95
    add-int/lit8 v0, v8, -0xa

    div-int/lit8 v9, v0, 0x3

    .line 96
    mul-int/lit8 v0, v9, 0x64

    rsub-int v6, v0, 0x190

    .line 97
    if-gtz v6, :cond_2

    .line 98
    const/16 v6, 0x64

    .line 102
    :cond_2
    const-string v0, "HiH_HiDivideUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideList part size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :cond_3
    :goto_0
    if-ge v5, v4, :cond_6

    .line 104
    add-int v0, v5, v6

    if-lt v0, v4, :cond_5

    .line 106
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    invoke-interface {p0, v5, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v4, v1}, Lo/clb;->a(Ljava/util/List;II)V

    .line 107
    :cond_4
    add-int/2addr v5, v6

    goto :goto_0

    .line 110
    :cond_5
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    move v0, v5

    add-int v1, v5, v6

    move v5, v1

    invoke-interface {p0, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v5, v1}, Lo/clb;->a(Ljava/util/List;II)V

    goto :goto_0

    .line 113
    :cond_6
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/util/List;IILjava/util/List;Landroid/util/SparseArray;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;)Z"
        }
    .end annotation

    .line 265
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 268
    :sswitch_0
    invoke-static/range {p0 .. p5}, Lo/cnm;->d(Landroid/content/Context;Ljava/util/List;IILjava/util/List;Landroid/util/SparseArray;)V

    .line 269
    const/4 v0, 0x0

    return v0

    .line 274
    :goto_0
    invoke-static {p1, p2, p3, p4, p5}, Lo/cnm;->c(Ljava/util/List;IILjava/util/List;Landroid/util/SparseArray;)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x7531 -> :sswitch_0
        0x7533 -> :sswitch_0
    .end sparse-switch
.end method
