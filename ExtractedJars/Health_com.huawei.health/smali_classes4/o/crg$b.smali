.class Lo/crg$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/hihealth/HiHealthData;>;Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/crg$1;)V
    .locals 0

    .line 193
    invoke-direct {p0}, Lo/crg$b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)I
    .locals 4

    .line 197
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 193
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    move-object v1, p2

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p0, v0, v1}, Lo/crg$b;->b(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)I

    move-result v0

    return v0
.end method
