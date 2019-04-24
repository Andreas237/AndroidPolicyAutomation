.class public Lo/ecs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RESPONSE_CODE_CONNECTION_FAILED:I = -0x2

.field public static final RESPONSE_CODE_INTERNAL_ERROR:I = 0x3

.field public static final RESPONSE_CODE_NO_ACCESS_AUTHORITY:I = 0x4

.field public static final RESPONSE_CODE_NO_NETWORK_FAILED:I = -0x1

.field public static final RESPONSE_CODE_OPERATION_FAILED:I = 0x5

.field public static final RESPONSE_CODE_OTHER_ERRORS:I = -0x63

.field public static final RESPONSE_CODE_PARAMS_ERROR:I = 0x1

.field public static final RESPONSE_CODE_SIGNATURE_ERROR:I = 0x2

.field public static final RESPONSE_CODE_SUCCESS:I = 0x0


# instance fields
.field public returnCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    const/16 v0, -0x63

    iput v0, p0, Lo/ecs;->returnCode:I

    return-void
.end method


# virtual methods
.method public getReturnCode()I
    .locals 1

    .line 74
    iget v0, p0, Lo/ecs;->returnCode:I

    return v0
.end method

.method public setReturnCode(I)V
    .locals 0

    .line 79
    iput p1, p0, Lo/ecs;->returnCode:I

    .line 80
    return-void
.end method
