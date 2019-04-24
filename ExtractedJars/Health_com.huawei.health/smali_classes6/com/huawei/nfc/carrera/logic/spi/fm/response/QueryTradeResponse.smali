.class public Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.source "SourceFile"


# static fields
.field public static final TRADE_TYPE_ONLINE_RECHARGE:I = 0xc

.field public static final TRADE_TYPE_RECHARGE:I = 0x6


# instance fields
.field public tradeRecords:[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    return-void
.end method
