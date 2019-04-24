.class public Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue$b;
    }
.end annotation


# instance fields
.field private addition:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue$b;

.field private advice_num_1:I

.field private advice_num_2:I

.field private err_code:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddition()Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue$b;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->addition:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue$b;

    return-object v0
.end method

.method public getAdvice_num_1()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->advice_num_1:I

    return v0
.end method

.method public getAdvice_num_2()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->advice_num_2:I

    return v0
.end method

.method public getError_code()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->err_code:I

    return v0
.end method

.method public setAddition(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue$b;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->addition:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue$b;

    .line 43
    return-void
.end method

.method public setAdvice_num_1(I)V
    .locals 0

    .line 34
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->advice_num_1:I

    .line 35
    return-void
.end method

.method public setAdvice_num_2(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->advice_num_2:I

    .line 39
    return-void
.end method

.method public setError_code(I)V
    .locals 0

    .line 30
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->err_code:I

    .line 31
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "error_code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->err_code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",advice_num_1 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->advice_num_1:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",advice_num_2 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->advice_num_2:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
