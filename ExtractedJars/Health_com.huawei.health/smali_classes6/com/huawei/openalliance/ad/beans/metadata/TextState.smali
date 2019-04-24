.class public Lcom/huawei/openalliance/ad/beans/metadata/TextState;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1d02d4cL


# instance fields
.field private defaultTextFlag:I

.field private language:Ljava/lang/String;

.field private showPosition:I

.field private state:I

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getTextStatus(Lcom/huawei/openalliance/ad/download/app/AppStatus;)I
    .locals 3

    const/4 v2, -0x1

    sget-object v0, Lcom/huawei/openalliance/ad/beans/metadata/TextState$1;->$SwitchMap$com$huawei$openalliance$ad$download$app$AppStatus:[I

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/download/app/AppStatus;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v2, 0x1

    goto :goto_1

    :pswitch_1
    const/4 v2, 0x3

    goto :goto_1

    :pswitch_2
    const/4 v2, 0x2

    goto :goto_1

    :pswitch_3
    const/4 v2, 0x6

    goto :goto_1

    :pswitch_4
    const/4 v2, 0x4

    goto :goto_1

    :pswitch_5
    const/4 v2, 0x5

    goto :goto_1

    :goto_0
    const/4 v2, -0x1

    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public getDefaultTextFlag()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->defaultTextFlag:I

    return v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->language:Ljava/lang/String;

    return-object v0
.end method

.method public getShowPosition()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->showPosition:I

    return v0
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->state:I

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->text:Ljava/lang/String;

    return-object v0
.end method

.method public setDefaultTextFlag(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->defaultTextFlag:I

    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->language:Ljava/lang/String;

    return-void
.end method

.method public setShowPosition(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->showPosition:I

    return-void
.end method

.method public setState(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->state:I

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/TextState;->text:Ljava/lang/String;

    return-void
.end method
