.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardBaseCallback;


# static fields
.field public static final RETURN_FAILED_ADD_TA_CARD_FAILED:I = 0x452

.field public static final RETURN_FAILED_CARD_CNT_REACH_LIMIT:I = 0x44d

.field public static final RETURN_FAILED_CITYCODE_ILLEGAL:I = 0x44f

.field public static final RETURN_FAILED_ISSUE_CARD_INNER_ERROR:I = 0x4af

.field public static final RETURN_FAILED_READ_CARDNUM_FAILED:I = 0x451

.field public static final RETURN_FAILED_REPEAT_ISSUERCARD:I = 0x44e

.field public static final RETURN_FAILED_SSD_INSTALL_FAILED:I = 0x450


# virtual methods
.method public abstract issueTrafficCardCallback(I)V
.end method
