.class public Lo/bfh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cardType:I

.field private chatType:I

.field private eventType:Lo/bfp$c;

.field private isNeedHideDivider:Z

.field private keyColorText:Ljava/lang/String;

.field private msg_id:I

.field private subCardNum:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, -0x1

    iput v0, p0, Lo/bfh;->cardType:I

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bfh;->isNeedHideDivider:Z

    return-void
.end method


# virtual methods
.method public getCardType()I
    .locals 1

    .line 39
    iget v0, p0, Lo/bfh;->cardType:I

    .line 40
    return v0
.end method

.method public getChatType()I
    .locals 1

    .line 83
    iget v0, p0, Lo/bfh;->chatType:I

    .line 84
    return v0
.end method

.method public getEventType()Lo/bfp$c;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bfh;->eventType:Lo/bfp$c;

    .line 51
    return-object v0
.end method

.method public getKeyColorText()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lo/bfh;->keyColorText:Ljava/lang/String;

    .line 73
    return-object v0
.end method

.method public getMsg_id()I
    .locals 1

    .line 94
    iget v0, p0, Lo/bfh;->msg_id:I

    .line 95
    return v0
.end method

.method public getSubCardNum()I
    .locals 1

    .line 61
    iget v0, p0, Lo/bfh;->subCardNum:I

    .line 62
    return v0
.end method

.method public isNeedHideDivider()Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lo/bfh;->isNeedHideDivider:Z

    return v0
.end method

.method public setCardType(I)V
    .locals 0

    .line 45
    iput p1, p0, Lo/bfh;->cardType:I

    .line 46
    return-void
.end method

.method public setChatType(I)V
    .locals 0

    .line 89
    iput p1, p0, Lo/bfh;->chatType:I

    .line 90
    return-void
.end method

.method public setEventType(Lo/bfp$c;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lo/bfh;->eventType:Lo/bfp$c;

    .line 57
    return-void
.end method

.method public setKeyColorText(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/bfh;->keyColorText:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setMsg_id(I)V
    .locals 0

    .line 100
    iput p1, p0, Lo/bfh;->msg_id:I

    .line 101
    return-void
.end method

.method public setNeedHideDivider(Z)V
    .locals 0

    .line 110
    iput-boolean p1, p0, Lo/bfh;->isNeedHideDivider:Z

    .line 111
    return-void
.end method

.method public setSubCardNum(I)V
    .locals 0

    .line 67
    iput p1, p0, Lo/bfh;->subCardNum:I

    .line 68
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FunctionBaseCardBean{cardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bfh;->cardType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", eventType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bfh;->eventType:Lo/bfp$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subCardNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bfh;->subCardNum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", keyColorText=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bfh;->keyColorText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", chatType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bfh;->chatType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isNeedHideDivider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/bfh;->isNeedHideDivider:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msg_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bfh;->msg_id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
