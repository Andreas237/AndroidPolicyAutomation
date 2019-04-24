.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardBaseCallback;


# static fields
.field public static final RESULT_FAILED_TRAFFIC_CARD_RECORDS_READ_FAILED:I = 0x5dd


# virtual methods
.method public abstract queryRecordsListCallback(IILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;)V"
        }
    .end annotation
.end method
