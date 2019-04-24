.class public Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse$FMBaseResponseSAI5;,
        Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse$FMBaseResponseSAI4;,
        Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse$FMBaseResponseSAI3;,
        Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse$FMBaseResponseSAI2;,
        Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse$FMBaseResponseSAI1;
    }
.end annotation


# static fields
.field public static final FAILED:I = -0x1

.field public static final NETWORK_ERROR:I = -0x2

.field public static final SUCCESS:I = 0x0


# instance fields
.field public FMCode:I

.field public resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    .line 30
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    return-void
.end method
