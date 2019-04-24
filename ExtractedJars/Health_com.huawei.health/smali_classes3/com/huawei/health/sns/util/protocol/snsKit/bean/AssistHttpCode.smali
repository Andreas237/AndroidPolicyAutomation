.class public Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;
.source "SourceFile"


# static fields
.field public static final ASSISTANT_XML_CONTENT_INVALID:I = 0x927c01

.field private static final ASSIST_ERROR_RESOURCE:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 24
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->ASSIST_ERROR_RESOURCE:Landroid/util/SparseIntArray;

    .line 37
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->ASSIST_ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    const/16 v2, 0x3e9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 38
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->ASSIST_ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    const/16 v2, 0x3ea

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 39
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->ASSIST_ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_assist_not_exist:I

    const/16 v2, 0x3ec

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 41
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->ASSIST_ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    const/16 v2, 0x3ed

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 42
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->ASSIST_ERROR_RESOURCE:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_complain_limited:I

    const/16 v2, 0x3ee

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 43
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;-><init>()V

    return-void
.end method

.method public static getAssistErrResId(II)I
    .locals 1

    .line 53
    const/4 v0, -0x1

    invoke-static {p0, p1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->getAssistErrResId(III)I

    move-result v0

    return v0
.end method

.method public static getAssistErrResId(III)I
    .locals 3

    .line 67
    if-nez p0, :cond_0

    const/16 v0, 0x3ea

    if-ne p1, v0, :cond_0

    .line 69
    const/4 v0, -0x1

    return v0

    .line 71
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->ASSIST_ERROR_RESOURCE:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v2

    .line 72
    const/4 v0, -0x1

    if-ne v2, v0, :cond_1

    .line 74
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->ASSIST_ERROR_RESOURCE:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v2

    .line 76
    :cond_1
    const/4 v0, -0x1

    if-ne v2, v0, :cond_2

    .line 78
    invoke-static {p0, p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->getErrResId(III)I

    move-result v2

    .line 80
    :cond_2
    return v2
.end method
