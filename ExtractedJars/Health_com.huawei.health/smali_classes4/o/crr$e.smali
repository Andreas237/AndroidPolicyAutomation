.class Lo/crr$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/hihealth/HiHealthData;>;Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    iput p1, p0, Lo/crr$e;->b:I

    .line 144
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)I
    .locals 7

    .line 148
    const/4 v1, 0x0

    .line 149
    const/4 v2, 0x0

    .line 150
    iget v0, p0, Lo/crr$e;->b:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 152
    :sswitch_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v3

    .line 153
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v3, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 154
    if-nez v4, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v1

    .line 156
    :goto_0
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v5

    .line 157
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v5, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 158
    if-nez v6, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v2

    .line 159
    .line 163
    :goto_1
    sub-int v0, v2, v1

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7531 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 138
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    move-object v1, p2

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p0, v0, v1}, Lo/crr$e;->c(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)I

    move-result v0

    return v0
.end method
