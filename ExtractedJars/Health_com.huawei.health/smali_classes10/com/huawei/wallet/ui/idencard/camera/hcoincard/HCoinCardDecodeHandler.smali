.class public Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;
.super Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;
.source "SourceFile"


# instance fields
.field private f:I

.field private g:Lexocr/base/ExBaseCardInfo;

.field private h:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

.field private i:Lexocr/base/ExBaseCardInfo;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V
    .locals 1

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->g:Lexocr/base/ExBaseCardInfo;

    .line 48
    new-instance v0, Lexocr/exocrengine/EXOCardInfo;

    invoke-direct {v0}, Lexocr/exocrengine/EXOCardInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->f:I

    .line 50
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->h:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    .line 51
    return-void
.end method

.method private e(Landroid/graphics/Rect;I)Landroid/graphics/Rect;
    .locals 5

    .line 55
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 58
    :pswitch_0
    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iget v2, p1, Landroid/graphics/Rect;->left:I

    iget v3, p1, Landroid/graphics/Rect;->bottom:I

    iget v4, p1, Landroid/graphics/Rect;->right:I

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object p1, v0

    .line 59
    goto :goto_0

    .line 61
    :pswitch_1
    goto :goto_0

    .line 63
    :pswitch_2
    nop

    .line 65
    .line 69
    :goto_0
    :pswitch_3
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public d([B)Z
    .locals 18

    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->b:J

    .line 77
    const/4 v12, 0x0

    .line 78
    if-nez p1, :cond_0

    .line 80
    const-string v0, "onPreviewFrame frame is null! skipping"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 81
    const/4 v0, 0x0

    return v0

    .line 84
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->d:Z

    if-nez v0, :cond_1

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPreviewFrame flagFocused is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "! skipping , auto focus"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 87
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->b()V

    .line 88
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->a:I

    .line 89
    const/4 v0, 0x0

    return v0

    .line 92
    :cond_1
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c()Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->c()Landroid/graphics/Point;

    move-result-object v0

    iget v13, v0, Landroid/graphics/Point;->x:I

    .line 93
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c()Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->c()Landroid/graphics/Point;

    move-result-object v0

    iget v14, v0, Landroid/graphics/Point;->y:I

    .line 94
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c()Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a()I

    move-result v15

    .line 95
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->e(Z)Landroid/graphics/Rect;

    move-result-object v12

    .line 96
    const/4 v0, 0x0

    if-ne v0, v12, :cond_2

    .line 98
    const-string v0, "guideRect is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 99
    const/4 v0, 0x0

    return v0

    .line 101
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->h:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    invoke-static {v0}, Lexocr/exocrengine/EXOCREngine;->b(Landroid/app/Activity;)I

    move-result v16

    .line 102
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v12, v1}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->e(Landroid/graphics/Rect;I)Landroid/graphics/Rect;

    move-result-object v12

    .line 103
    move-object/from16 v0, p1

    invoke-static {v0, v13, v14, v12}, Lexocr/exocrengine/EXOCREngine;->c([BIILandroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 105
    const-string v0, "onPreviewFrame IsValidFrame is false! , auto focus"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 106
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->b()V

    .line 107
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->d:Z

    .line 108
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->a:I

    .line 109
    const/4 v0, 0x0

    return v0

    .line 113
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lexocr/base/ExBaseCardInfo;->setTimestart(J)V

    .line 115
    move-object/from16 v0, p1

    move v1, v13

    move v2, v14

    move v3, v15

    iget v4, v12, Landroid/graphics/Rect;->left:I

    iget v5, v12, Landroid/graphics/Rect;->top:I

    iget v6, v12, Landroid/graphics/Rect;->right:I

    iget v7, v12, Landroid/graphics/Rect;->bottom:I

    move/from16 v9, v16

    move-object/from16 v8, p0

    iget-object v10, v8, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->e:[B

    move-object/from16 v8, p0

    iget-object v8, v8, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->e:[B

    array-length v11, v8

    const/4 v8, 0x1

    invoke-static/range {v0 .. v11}, Lexocr/exocrengine/EXOCREngine;->e([BIIIIIIIII[BI)I

    move-result v17

    .line 118
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lexocr/base/ExBaseCardInfo;->setTimeend(J)V

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 120
    if-lez v17, :cond_5

    .line 122
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->e:[B

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    move/from16 v2, v17

    invoke-static {v0, v2, v1}, Lexocr/exocrengine/EXOCREngine;->c([BILexocr/base/ExBaseCardInfo;)Lexocr/base/ExBaseCardInfo;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->e(Lexocr/base/ExBaseCardInfo;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 125
    const/4 v0, 0x0

    return v0

    .line 127
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    if-eqz v0, :cond_7

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    move-object/from16 v1, p1

    move v2, v13

    move v3, v14

    move v4, v15

    move/from16 v5, v16

    move-object v6, v12

    invoke-static/range {v1 .. v6}, Lexocr/exocrengine/EXOCREngine;->d([BIIIILandroid/graphics/Rect;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexocr/base/ExBaseCardInfo;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 132
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->c:Lexocr/base/ExBaseCardInfo;

    .line 133
    const/4 v0, 0x1

    return v0

    .line 136
    :cond_5
    move/from16 v0, v17

    const v1, -0x18a92

    if-ne v0, v1, :cond_6

    .line 138
    const/4 v0, 0x0

    return v0

    .line 142
    :cond_6
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->a:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->a:I

    .line 144
    :cond_7
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->a:I

    const/4 v1, 0x6

    if-le v0, v1, :cond_8

    .line 146
    const-string v0, "onPreviewFrame frameSucceedReco >6 auto focus!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 147
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->b()V

    .line 148
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->a:I

    .line 150
    :cond_8
    const/4 v0, 0x0

    return v0
.end method

.method e(Lexocr/base/ExBaseCardInfo;)Z
    .locals 4

    .line 163
    if-nez p1, :cond_0

    .line 165
    new-instance v0, Lexocr/exocrengine/EXOCardInfo;

    invoke-direct {v0}, Lexocr/exocrengine/EXOCardInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->i:Lexocr/base/ExBaseCardInfo;

    .line 166
    const/4 v0, 0x0

    return v0

    .line 168
    :cond_0
    invoke-virtual {p1}, Lexocr/base/ExBaseCardInfo;->getStrNumbers()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 169
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1

    .line 171
    const/4 v0, 0x0

    return v0

    .line 173
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->g:Lexocr/base/ExBaseCardInfo;

    if-nez v0, :cond_2

    .line 175
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->g:Lexocr/base/ExBaseCardInfo;

    .line 176
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->f:I

    .line 177
    const/4 v0, 0x0

    return v0

    .line 181
    :cond_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->g:Lexocr/base/ExBaseCardInfo;

    invoke-virtual {v0}, Lexocr/base/ExBaseCardInfo;->getStrNumbers()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lexocr/base/ExBaseCardInfo;->getStrNumbers()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 183
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->f:I

    .line 184
    const/4 v0, 0x1

    return v0

    .line 188
    :cond_3
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->g:Lexocr/base/ExBaseCardInfo;

    .line 189
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->f:I

    .line 190
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->f:I

    const/4 v1, 0x5

    if-le v0, v1, :cond_4

    .line 192
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeHandler;->f:I

    .line 193
    const/4 v0, 0x1

    return v0

    .line 195
    :cond_4
    const/4 v0, 0x0

    return v0
.end method
