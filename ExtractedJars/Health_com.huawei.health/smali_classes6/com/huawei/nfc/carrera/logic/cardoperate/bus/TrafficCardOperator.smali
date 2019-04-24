.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract applyPayOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V
.end method

.method public abstract applyPayOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V
.end method

.method public abstract getIssueCardCoupon(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;
.end method

.method public abstract getRechargeCoupon(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;
.end method

.method public abstract issueTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V
.end method

.method public abstract preIssueTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
.end method

.method public abstract queryAndHandleUnfinfishedOrders(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)V
.end method

.method public abstract queryOfflineCardInfo(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;)V
.end method

.method public abstract queryRecords(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;)V
.end method

.method public abstract recharge(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V
.end method

.method public abstract refund(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;)V
.end method

.method public abstract uninstallTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ZLjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;)V
.end method
