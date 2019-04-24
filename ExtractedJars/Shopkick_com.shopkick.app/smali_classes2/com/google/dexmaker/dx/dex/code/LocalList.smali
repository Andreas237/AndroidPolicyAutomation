.class public final Lcom/google/dexmaker/dx/dex/code/LocalList;
.super Lcom/google/dexmaker/dx/util/FixedSizeList;
.source "LocalList.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;,
        Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;,
        Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field public static final EMPTY:Lcom/google/dexmaker/dx/dex/code/LocalList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/LocalList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/code/LocalList;-><init>(I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList;->EMPTY:Lcom/google/dexmaker/dx/dex/code/LocalList;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/FixedSizeList;-><init>(I)V

    return-void
.end method

.method private static debugVerify(Lcom/google/dexmaker/dx/dex/code/LocalList;)V
    .locals 5

    .line 379
    :try_start_0
    invoke-static {p0}, Lcom/google/dexmaker/dx/dex/code/LocalList;->debugVerify0(Lcom/google/dexmaker/dx/dex/code/LocalList;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 381
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/LocalList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 383
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p0, v2}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 385
    :cond_0
    throw v0
.end method

.method private static debugVerify0(Lcom/google/dexmaker/dx/dex/code/LocalList;)V
    .locals 11

    .line 394
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/LocalList;->size()I

    move-result v0

    const/high16 v1, 0x10000

    .line 395
    new-array v1, v1, [Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_b

    .line 398
    invoke-virtual {p0, v3}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object v4

    .line 399
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v5

    .line 401
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->isStart()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 402
    aget-object v6, v1, v5

    if-eqz v6, :cond_1

    .line 404
    invoke-virtual {v4, v6}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->matches(Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    .line 405
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "redundant start at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": got "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "; had "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 410
    :cond_1
    :goto_1
    aput-object v4, v1, v5

    goto/16 :goto_6

    .line 412
    :cond_2
    aget-object v6, v1, v5

    if-eqz v6, :cond_a

    .line 417
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v6

    add-int/lit8 v7, v3, 0x1

    move v8, v2

    :goto_2
    if-ge v7, v0, :cond_7

    .line 421
    invoke-virtual {p0, v7}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object v9

    .line 422
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v10

    if-eq v10, v6, :cond_3

    goto :goto_4

    .line 425
    :cond_3
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegisterSpec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v10

    if-ne v10, v5, :cond_6

    .line 426
    invoke-virtual {v9}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->isStart()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 427
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getDisposition()Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    move-result-object v8

    sget-object v9, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    if-ne v8, v9, :cond_4

    const/4 v8, 0x1

    goto :goto_3

    .line 429
    :cond_4
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "improperly marked end at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 435
    :cond_5
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "redundant end at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    :goto_4
    if-nez v8, :cond_9

    .line 442
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getDisposition()Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    move-result-object v4

    sget-object v7, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    if-eq v4, v7, :cond_8

    goto :goto_5

    .line 444
    :cond_8
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "improper end replacement claim at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    :goto_5
    const/4 v4, 0x0

    .line 449
    aput-object v4, v1, v5

    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 413
    :cond_a
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "redundant end at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    return-void
.end method

.method public static make(Lcom/google/dexmaker/dx/dex/code/DalvInsnList;)Lcom/google/dexmaker/dx/dex/code/LocalList;
    .locals 5

    .line 327
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->size()I

    move-result v0

    .line 345
    new-instance v1, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;

    invoke-direct {v1, v0}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 348
    invoke-virtual {p0, v2}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->get(I)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v3

    .line 350
    instance-of v4, v3, Lcom/google/dexmaker/dx/dex/code/LocalSnapshot;

    if-eqz v4, :cond_0

    .line 351
    move-object v4, v3

    check-cast v4, Lcom/google/dexmaker/dx/dex/code/LocalSnapshot;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalSnapshot;->getLocals()Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object v4

    .line 353
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getAddress()I

    move-result v3

    invoke-virtual {v1, v3, v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->snapshot(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)V

    goto :goto_1

    .line 354
    :cond_0
    instance-of v4, v3, Lcom/google/dexmaker/dx/dex/code/LocalStart;

    if-eqz v4, :cond_1

    .line 355
    move-object v4, v3

    check-cast v4, Lcom/google/dexmaker/dx/dex/code/LocalStart;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalStart;->getLocal()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    .line 356
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getAddress()I

    move-result v3

    invoke-virtual {v1, v3, v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->startLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    goto :goto_1

    .line 357
    :cond_1
    instance-of v4, v3, Lcom/google/dexmaker/dx/dex/code/LocalEnd;

    if-eqz v4, :cond_2

    .line 358
    move-object v4, v3

    check-cast v4, Lcom/google/dexmaker/dx/dex/code/LocalEnd;

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalEnd;->getLocal()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    .line 359
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getAddress()I

    move-result v3

    invoke-virtual {v1, v3, v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 363
    :cond_3
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->finish()Lcom/google/dexmaker/dx/dex/code/LocalList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public debugPrint(Ljava/io/PrintStream;Ljava/lang/String;)V
    .locals 3

    .line 80
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/LocalList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 83
    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 84
    invoke-virtual {p0, v1}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;
    .locals 0

    .line 60
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get0(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    return-object p1
.end method

.method public set(ILcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V
    .locals 0

    .line 70
    invoke-virtual {p0, p1, p2}, Lcom/google/dexmaker/dx/dex/code/LocalList;->set0(ILjava/lang/Object;)V

    return-void
.end method
