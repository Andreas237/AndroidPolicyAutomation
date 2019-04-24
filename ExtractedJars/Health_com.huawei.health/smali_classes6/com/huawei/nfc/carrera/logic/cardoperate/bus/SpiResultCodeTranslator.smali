.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "SpiResultCodeTranslator"

.field private static sReadESECardResultCodeTable:Landroid/util/SparseIntArray; = null

.field private static sSNBResultCodeTable:Landroid/util/SparseIntArray; = null


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 18
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    .line 23
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    .line 28
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 31
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x61a81

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 34
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x61a82

    const/16 v2, 0xc

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 37
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x61ae5

    const/16 v2, 0x63

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 40
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x61ae6

    const/16 v2, 0x63

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 43
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x61dae

    const/16 v2, 0x63

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 46
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x186a1

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 49
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x186a2

    const/16 v2, 0x63

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 52
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x46a

    const/16 v2, 0x515

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 55
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x46b

    const/16 v2, 0x516

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 58
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x46c

    const/16 v2, 0x517

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 61
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x46d

    const/16 v2, 0x518

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 64
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x14b5

    const/16 v2, 0x519

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 67
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x470

    const/16 v2, 0x518

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 70
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x471

    const/16 v2, 0x518

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 73
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x472

    const/16 v2, 0x518

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 76
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x473

    const/16 v2, 0x518

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 79
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x474

    const/16 v2, 0x518

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 82
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x475

    const/16 v2, 0x518

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 85
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x47e

    const/16 v2, 0x518

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 88
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x46e

    const/16 v2, 0x44e

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 91
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x46f

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 94
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x186a3

    const/16 v2, 0x63

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 97
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0xa56

    const/16 v2, 0x3f2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 100
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0xa55

    const/16 v2, 0x3f1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 104
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 107
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, -0x2

    const/16 v2, 0x15

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 110
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, -0x3

    const/16 v2, 0x16

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 113
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, -0x4

    const/16 v2, 0x17

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 116
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, -0x5

    const/16 v2, 0x3ee

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 119
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, -0x6

    const/16 v2, 0x3ec

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 122
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, -0x7

    const/16 v2, 0x3ed

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 125
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, -0x8

    const/16 v2, 0x18

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 130
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x68fb1

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 133
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x68fb2

    const/16 v2, 0x1d

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 136
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x68fb3

    const/16 v2, 0x17

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 139
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x68fb4

    const/16 v2, 0x15

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 142
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x68fb5

    const/16 v2, 0x16

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 145
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x68fb6

    const/16 v2, 0x1b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 148
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x68fb7

    const/16 v2, 0x18

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 151
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const v1, 0x68fb8

    const/16 v2, 0x1d

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 154
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getFmErrorCode(I)I
    .locals 1

    .line 198
    const/4 v0, 0x0

    return v0
.end method

.method public static getSnbResultCode(I)I
    .locals 5

    .line 165
    const-string v0, "SpiResultCodeTranslator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSnbResultCode  returnCd : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x63

    invoke-virtual {v0, p0, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v4

    .line 167
    const-string v0, "SpiResultCodeTranslator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSnbResultCode  errorCd : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return v4
.end method

.method public static getSnbResultCode(II)I
    .locals 2

    .line 179
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sSNBResultCodeTable:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p0, p1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v1

    .line 180
    return v1
.end method

.method public static geteSEErrorCode(I)I
    .locals 3

    .line 192
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->sReadESECardResultCodeTable:Landroid/util/SparseIntArray;

    const/16 v1, 0x63

    invoke-virtual {v0, p0, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v2

    .line 193
    return v2
.end method
