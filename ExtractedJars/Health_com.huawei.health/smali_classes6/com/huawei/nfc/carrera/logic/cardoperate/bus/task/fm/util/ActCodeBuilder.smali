.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;
.source "SourceFile"


# static fields
.field private static final DISCOUNT_ACT_NO:Ljava/lang/String; = "0300000400100023"


# instance fields
.field private actNo:Ljava/lang/String;

.field private discountIssueMoney:I

.field private mAid:Ljava/lang/String;

.field private stdIssueMoney:I

.field private totalMoney:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;-><init>(Landroid/content/Context;)V

    .line 54
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->actNo:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ServiceCodeBuilder;-><init>(Landroid/content/Context;)V

    .line 60
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->actNo:Ljava/lang/String;

    .line 61
    iput p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->totalMoney:I

    .line 62
    iput p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->stdIssueMoney:I

    .line 63
    iput p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->discountIssueMoney:I

    .line 64
    iput-object p6, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->mAid:Ljava/lang/String;

    .line 65
    return-void
.end method


# virtual methods
.method protected getServiceData(Ljava/lang/String;)[B
    .locals 9

    .line 81
    const/4 v2, 0x2

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    .line 82
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->totalMoney:I

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcn/com/fmsh/util/FM_CN;->intToBcdBytes(II)[B

    move-result-object v0

    invoke-static {v2, v0}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v2

    .line 84
    const/4 v3, 0x2

    new-array v3, v3, [B

    fill-array-data v3, :array_1

    .line 85
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->stdIssueMoney:I

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->discountIssueMoney:I

    sub-int/2addr v0, v1

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcn/com/fmsh/util/FM_CN;->intToBcdBytes(II)[B

    move-result-object v0

    invoke-static {v3, v0}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v3

    .line 87
    const/4 v4, 0x2

    new-array v4, v4, [B

    fill-array-data v4, :array_2

    .line 89
    const/4 v5, 0x2

    new-array v5, v5, [B

    fill-array-data v5, :array_3

    .line 90
    const/16 v0, 0x59

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcn/com/fmsh/util/FM_CN;->intToBcdBytes(II)[B

    move-result-object v0

    invoke-static {v5, v0}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v5

    .line 93
    const/4 v6, 0x2

    new-array v6, v6, [B

    fill-array-data v6, :array_4

    .line 94
    const/16 v0, 0x46

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcn/com/fmsh/util/FM_CN;->intToBcdBytes(II)[B

    move-result-object v0

    invoke-static {v6, v0}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v6

    .line 96
    const/4 v7, 0x2

    new-array v7, v7, [B

    fill-array-data v7, :array_5

    .line 97
    const-string v0, "5943542E55534552"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcn/com/fmsh/util/FM_CN;->intToBcdBytes(II)[B

    move-result-object v0

    invoke-static {v7, v0}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v7

    goto :goto_0

    .line 100
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcn/com/fmsh/util/FM_CN;->intToBcdBytes(II)[B

    move-result-object v0

    invoke-static {v7, v0}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v7

    .line 104
    :goto_0
    invoke-static {v2, v3}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v8

    .line 105
    invoke-static {v8, v5}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v8

    .line 106
    invoke-static {v8, v6}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v8

    .line 107
    invoke-static {v8, v7}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v8

    .line 108
    invoke-static {v8, v4}, Lcn/com/fmsh/util/FM_Bytes;->join([B[B)[B

    move-result-object v8

    .line 110
    return-object v8

    nop

    :array_0
    .array-data 1
        0x2t
        0x3t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x8t
        0x3t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x9t
        0xet
    .end array-data

    nop

    :array_3
    .array-data 1
        0x12t
        0x1t
    .end array-data

    nop

    :array_4
    .array-data 1
        0x18t
        0x1t
    .end array-data

    nop

    :array_5
    .array-data 1
        0x21t
        0x1t
    .end array-data
.end method

.method protected getServiceNo(I)Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/ActCodeBuilder;->actNo:Ljava/lang/String;

    return-object v0
.end method
