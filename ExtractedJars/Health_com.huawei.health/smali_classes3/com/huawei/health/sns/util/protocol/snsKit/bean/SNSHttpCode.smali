.class public Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CLIENT_CANCEL:I = 0x14ffd

.field public static final CLIENT_ERROR:I = 0x14ffc

.field public static final CLIENT_PROTOCOL_ERROR:I = 0x14ff7

.field public static final DEFAULT_RESOURCE_ID:I = -0x1

.field public static final ERROR:I = 0x14ff1

.field private static final ERROR_RESOURCE:Landroid/util/SparseIntArray;

.field public static final HTTP_CODE:I = 0x14ffe

.field public static final IO_ERROR:I = 0x14ff8

.field public static final JSON_ERROR:I = 0x14ff5

.field public static final NETWORK_ERROR:I = 0x14ff4

.field public static final NOT_IN_SERVICE:I = 0x14ffb

.field public static final OK:I = 0x0

.field public static final REQ_PARAM_ERROR:I = 0x14ff9


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 24
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    .line 87
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_cannot_conn_service:I

    const v2, 0x14ff1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 88
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_network:I

    const v2, 0x14ff4

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 89
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    const v2, 0x14ff5

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 90
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    const v2, 0x14ff7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 92
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    const v2, 0x14ff8

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 93
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    const v2, 0x14ff9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 95
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    const/16 v2, 0x3ea

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 96
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_session_invalid:I

    const/16 v2, 0x3ec

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 97
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_not_exist:I

    const/16 v2, 0x3f0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 98
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_alread_group_member:I

    const/16 v2, 0x3f1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 99
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_not_group_member:I

    const/16 v2, 0x3f2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 100
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_two_dimcode_overdue:I

    const/16 v2, 0x3f4

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 101
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    const/16 v2, 0x3f9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 102
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_not_in_service:I

    const v2, 0x14ffb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 103
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    const v2, 0x14ffc

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 105
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    const/16 v2, 0x3eb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 106
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_user_not_exist:I

    const/16 v2, 0x3ed

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 107
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_overdue:I

    const/16 v2, 0x3f6

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 108
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_invite_overdue:I

    const/16 v2, 0x3f5

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 110
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_more_req:I

    const/16 v2, 0x401

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 111
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    const/16 v2, 0x3e9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 112
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_cannot_contains_sensitive_word:I

    const/16 v2, 0x402

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 115
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_assist_not_exist:I

    const/16 v2, 0x3ff

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 117
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getErrResId(II)I
    .locals 1

    .line 129
    const/4 v0, -0x1

    invoke-static {p0, p1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(III)I

    move-result v0

    return v0
.end method

.method public static getErrResId(III)I
    .locals 3

    .line 144
    if-nez p0, :cond_0

    const/16 v0, 0x3ea

    if-ne p1, v0, :cond_0

    .line 146
    const/4 v0, -0x1

    return v0

    .line 148
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v2

    .line 149
    const/4 v0, -0x1

    if-ne v2, v0, :cond_1

    .line 151
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->ERROR_RESOURCE:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v2

    .line 153
    :cond_1
    const/4 v0, -0x1

    if-ne v2, v0, :cond_3

    .line 155
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    .line 157
    move v2, p2

    goto :goto_0

    .line 161
    :cond_2
    sget v2, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    .line 164
    :cond_3
    :goto_0
    return v2
.end method
