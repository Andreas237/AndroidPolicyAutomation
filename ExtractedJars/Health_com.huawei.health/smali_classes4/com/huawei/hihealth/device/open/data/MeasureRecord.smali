.class public interface abstract Lcom/huawei/hihealth/device/open/data/MeasureRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getDataTypes()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end method

.method public abstract getFieldNum()I
.end method

.method public abstract getMeasureTime()Ljava/util/Date;
.end method

.method public abstract getUnit(I)Ljava/lang/String;
.end method

.method public abstract getUnit(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getValue(I)Ljava/lang/Number;
.end method

.method public abstract getValue(Ljava/lang/String;)Ljava/lang/Number;
.end method

.method public abstract getValueList(I)Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Ljava/lang/Number;>;"
        }
    .end annotation
.end method

.method public abstract getValueList(Ljava/lang/String;)Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/Number;>;"
        }
    .end annotation
.end method

.method public abstract setMeasureTime(Ljava/util/Date;)V
.end method

.method public abstract setValue(ILjava/lang/Number;)Z
.end method

.method public abstract setValue(Ljava/lang/String;Ljava/lang/Number;)Z
.end method

.method public abstract setValueList(ILjava/util/ArrayList;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Ljava/lang/Number;>;)Z"
        }
    .end annotation
.end method

.method public abstract setValueList(Ljava/lang/String;Ljava/util/ArrayList;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Number;>;)Z"
        }
    .end annotation
.end method
