.class public interface abstract Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HANDLE_ALL_FAILED_ORDERS:I = 0x1

.field public static final HANDLE_ISSUE_FAILED_ORDERS:I = 0x0

.field public static final HANDLE_RECHARGE_FAILED_ORDERS:I = 0x1

.field public static final ORDER_TYPE_ISSUECARD:I = 0x1

.field public static final ORDER_TYPE_ISSUECARD_RECHARGE:I = 0x3

.field public static final ORDER_TYPE_RECHARGE:I = 0x2

.field public static final ORDER_TYPE_SHIFT_CARD_IN:I = 0x5

.field public static final ORDER_TYPE_SHIFT_CARD_OUT:I = 0x4

.field public static final ORDER_TYPE_SHIFT_CARD_RECHARGE:I = 0x6

.field public static final PAY_TYPE_HUAWEIPAY_UNION:I = 0x3

.field public static final PAY_TYPE_HW:I = 0x1

.field public static final PAY_TYPE_IAP:I = 0x4

.field public static final PAY_TYPE_WX:I = 0x2

.field public static final PRIOR_QUERY_DONE_RECORDS:I = 0x0

.field public static final PRIOR_QUERY_UNDONE_RECORDS:I = 0x1

.field public static final PRIOR_QUERY_UNDONE_RECORDS_ONLY:I = 0x3

.field public static final READ_CARDINFO_BALANCE_BIT:I = 0x2

.field public static final READ_CARDINFO_NUM_BIT:I = 0x1

.field public static final READ_CARDINFO_VALIDITY_DATE_BIT:I = 0x4


# virtual methods
.method public abstract applyPayOrder(Ljava/lang/String;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V
.end method

.method public abstract applyPayOrder(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V
.end method

.method public abstract checkCloudTransferOutCondition(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/CheckTransferOutConditionCallback;)V
.end method

.method public abstract initEseInfo()V
.end method

.method public abstract initEseInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;)V
.end method

.method public abstract issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V
.end method

.method public abstract preIssueTrafficCard(Ljava/lang/String;)V
.end method

.method public abstract queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V
.end method

.method public abstract queryOfflineTrafficCardInfo(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;)V
.end method

.method public abstract queryRecords(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;)V
.end method

.method public abstract recharge(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;)V
.end method

.method public abstract refund(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;)V
.end method

.method public abstract uninstallTrafficCard(Ljava/lang/String;ZLjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/UninstallTrafficCardCallback;)V
.end method
