.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryPayableCardCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACCOUNT_LOGIN_STATUS_ACCOUNT_UNMATCH:I = 0x2

.field public static final ACCOUNT_LOGIN_STATUS_NOT_LOGIN:I = 0x1

.field public static final REFRESH_CARD_LIST_FAILED_ACCOUNT_ERROR:I = -0x2


# virtual methods
.method public abstract queryPayableCardCallback(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;>;)V"
        }
    .end annotation
.end method

.method public abstract queryPayableError(I)V
.end method
