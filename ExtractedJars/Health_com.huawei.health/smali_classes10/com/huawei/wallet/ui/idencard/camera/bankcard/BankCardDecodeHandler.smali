.class public Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;
.super Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;
.source "SourceFile"


# instance fields
.field private f:Lexocr/bankcard/EXBankCardInfo;

.field private k:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;


# direct methods
.method protected constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V

    .line 30
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->k:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    .line 31
    invoke-virtual {p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lexocr/bankcard/EXBankCardReco;->c(Landroid/content/Context;)I

    .line 32
    new-instance v0, Lexocr/bankcard/EXBankCardInfo;

    invoke-direct {v0}, Lexocr/bankcard/EXBankCardInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->c:Lexocr/base/ExBaseCardInfo;

    .line 33
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->c:Lexocr/base/ExBaseCardInfo;

    instance-of v0, v0, Lexocr/bankcard/EXBankCardInfo;

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->c:Lexocr/base/ExBaseCardInfo;

    check-cast v0, Lexocr/bankcard/EXBankCardInfo;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->f:Lexocr/bankcard/EXBankCardInfo;

    .line 37
    :cond_0
    return-void
.end method

.method private a(Landroid/graphics/Rect;I)Landroid/graphics/Rect;
    .locals 5

    .line 50
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 53
    :pswitch_0
    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iget v2, p1, Landroid/graphics/Rect;->left:I

    iget v3, p1, Landroid/graphics/Rect;->bottom:I

    iget v4, p1, Landroid/graphics/Rect;->right:I

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object p1, v0

    .line 54
    .line 61
    :goto_0
    :pswitch_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public d([B)Z
    .locals 23

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->b:J

    .line 69
    const/4 v12, 0x0

    .line 70
    if-nez p1, :cond_0

    .line 72
    const-string v0, "onPreviewFrame frame is null! skipping"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 73
    const/4 v0, 0x0

    return v0

    .line 77
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->d:Z

    if-nez v0, :cond_1

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPreviewFrame flagFocused is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "! skipping , auto focus"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 80
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->b()V

    .line 81
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->a:I

    .line 82
    const/4 v0, 0x0

    return v0

    .line 85
    :cond_1
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c()Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->c()Landroid/graphics/Point;

    move-result-object v0

    iget v13, v0, Landroid/graphics/Point;->x:I

    .line 86
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c()Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->c()Landroid/graphics/Point;

    move-result-object v0

    iget v14, v0, Landroid/graphics/Point;->y:I

    .line 87
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c()Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a()I

    move-result v15

    .line 88
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->e(Z)Landroid/graphics/Rect;

    move-result-object v12

    .line 89
    const/4 v0, 0x0

    if-ne v0, v12, :cond_2

    .line 91
    const-string v0, "guideRect is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 92
    const/4 v0, 0x0

    return v0

    .line 94
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->k:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    invoke-static {v0}, Lexocr/exocrengine/EXOCREngine;->b(Landroid/app/Activity;)I

    move-result v16

    .line 95
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v12, v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->a(Landroid/graphics/Rect;I)Landroid/graphics/Rect;

    move-result-object v12

    .line 97
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->f:Lexocr/bankcard/EXBankCardInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lexocr/bankcard/EXBankCardInfo;->setCharCount(I)V

    .line 99
    move-object/from16 v0, p1

    move v1, v13

    move v2, v14

    move v3, v15

    iget v4, v12, Landroid/graphics/Rect;->left:I

    iget v5, v12, Landroid/graphics/Rect;->top:I

    iget v6, v12, Landroid/graphics/Rect;->right:I

    iget v7, v12, Landroid/graphics/Rect;->bottom:I

    invoke-static/range {v0 .. v7}, Lexocr/bankcard/EXBankCardReco;->d([BIIIIIII)F

    move-result v17

    .line 101
    const/high16 v0, 0x40600000    # 3.5f

    cmpl-float v0, v17, v0

    if-ltz v0, :cond_3

    const/16 v18, 0x1

    goto :goto_0

    :cond_3
    const/16 v18, 0x0

    .line 103
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPreviewFrame nativeFocusScore time=="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->b:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 105
    if-nez v18, :cond_4

    .line 107
    const-string v0, "onPreviewFrame sufficientFocus is false! , auto focus"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 108
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->b()V

    .line 109
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->d:Z

    .line 110
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->a:I

    .line 111
    const/4 v0, 0x0

    return v0

    .line 115
    :cond_4
    const/16 v19, 0x0

    .line 116
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->a:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->a:I

    .line 118
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->f:Lexocr/bankcard/EXBankCardInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lexocr/bankcard/EXBankCardInfo;->setTimestart(J)V

    .line 119
    const/16 v0, 0x8

    new-array v0, v0, [I

    move-object/from16 v20, v0

    .line 121
    move-object/from16 v0, p1

    move v1, v13

    move v2, v14

    move v3, v15

    iget v4, v12, Landroid/graphics/Rect;->left:I

    iget v5, v12, Landroid/graphics/Rect;->top:I

    iget v6, v12, Landroid/graphics/Rect;->right:I

    iget v7, v12, Landroid/graphics/Rect;->bottom:I

    move/from16 v8, v16

    move-object/from16 v9, p0

    iget-object v9, v9, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->e:[B

    move-object/from16 v10, p0

    iget-object v10, v10, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->e:[B

    array-length v10, v10

    move-object/from16 v11, v20

    invoke-static/range {v0 .. v11}, Lexocr/bankcard/EXBankCardReco;->a([BIIIIIIII[BI[I)Landroid/graphics/Bitmap;

    move-result-object v21

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->f:Lexocr/bankcard/EXBankCardInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lexocr/bankcard/EXBankCardInfo;->setTimeend(J)V

    .line 126
    const/4 v0, 0x0

    aget v22, v20, v0

    .line 127
    if-lez v22, :cond_6

    if-eqz v21, :cond_6

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->e:[B

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->f:Lexocr/bankcard/EXBankCardInfo;

    move/from16 v2, v22

    invoke-static {v0, v2, v1}, Lexocr/bankcard/EXBankCardReco;->c([BILexocr/bankcard/EXBankCardInfo;)Z

    move-result v19

    .line 131
    if-eqz v19, :cond_5

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->f:Lexocr/bankcard/EXBankCardInfo;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lexocr/bankcard/EXBankCardInfo;->replaceBitmap(Landroid/graphics/Bitmap;)V

    .line 134
    const-string v0, "dataclass"

    const-string v1, "data class replaceBitmap()"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 139
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPreviewFrame DecodeResult=="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->f:Lexocr/bankcard/EXBankCardInfo;

    invoke-virtual {v3}, Lexocr/bankcard/EXBankCardInfo;->getTimeend()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 141
    :cond_6
    if-nez v19, :cond_7

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->a:I

    const/4 v1, 0x6

    if-le v0, v1, :cond_7

    .line 143
    const-string v0, "onPreviewFrame frameSucceedReco >6 auto focus!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 144
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->b()V

    .line 145
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;->a:I

    .line 147
    :cond_7
    return v19
.end method
